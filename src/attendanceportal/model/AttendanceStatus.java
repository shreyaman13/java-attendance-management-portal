package attendanceportal.model;

public enum AttendanceStatus {
    PRESENT("P"),
    ABSENT("A");

    private final String code;

    AttendanceStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static AttendanceStatus fromCode(String code) {
        if (code == null) return ABSENT;
        String normalized = code.trim().toUpperCase();
        if (normalized.equals("P")) return PRESENT;
        return ABSENT;
    }
}

