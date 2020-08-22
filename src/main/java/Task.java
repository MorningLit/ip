public abstract class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public String getStatusIcon() {
        return (isDone ? "✓" : "✘"); //return tick or X symbols
    }

    public abstract String getTaskType();

    public abstract String getDate();

    @Override
    public String toString() {
        return String.format("[%s][%s] %s", getTaskType(),getStatusIcon(), description);
    }
}
