package pl.osowicz.task_manager;

public enum Status {
    NOT_ASSIGNED("Nieprzypisane"),
    ASSIGNED("Przypisane"),
    STARTED("Rozpoczęte"),
    COMPLETED("Zakończone");

    private String plName;

    Status(String plName) {
        this.plName = plName;
    }

    public String getPlName() {
        return plName;
    }
}
