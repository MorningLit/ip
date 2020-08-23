public class ErrorCommand implements Command {
    private final Exception error;

    public ErrorCommand(Exception error) {
        this.error = error;
    }

    @Override
    public void execute(TaskList taskList, UI ui, Storage storage) {
        ui.showError(error.getMessage());
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
