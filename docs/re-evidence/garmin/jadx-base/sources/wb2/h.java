package wb2;

/* JADX INFO: loaded from: classes11.dex */
public enum h {
    DEFAULT(-1, "server end points are not available"),
    SERVER_ENDPOINTS_NOT_FOUND(100, "server end points are not available"),
    INVALID_SERVER_ENDPOINT(101, "Invalid server endpoint"),
    SERVER_PROCESS_TOO_LONG(102, " Server process is too long"),
    SERVER_PROCESS_TIMEOUT(103, "Server process timed out"),
    NO_RESPONSE_ON_UPLOAD_CONFIG(104, "No response on upload config"),
    OMT_EXCEPTION_MESSAGE(105, "OMT exception"),
    EMPTY_SERVER_ENDPOINTS_DEFINITION(106, "Empty server endpoint definition"),
    TEMP_FILE_READ_FAILED(107, "Temp file read failed"),
    DOWNLOAD_QUEUE_BROWSE_FAILED(108, "Download queue browse failed"),
    DEVICE_MESSAGE_DOWNLOAD_FAILED(109, "Device message download failed"),
    INVALID_MESSAGE_DOWNLOAD_RESPONSE(110, "Invalid message download response"),
    FIT_FILE_CONTENT_NOT_FOUND(111, "Fit file content not found"),
    INVALID_SOFTWARE_UPDATE_FILE_URL(112, "Invalid software updare file url"),
    SOFTWARE_UPDATE_FILE_DOWNLOAD_FAILED(113, "Software update file download failed"),
    CONTENT_DOES_NOT_EXIST(114, "Content does not exist"),
    TEMP_FILE_WRITE_FAILED(115, "Temp file write failed"),
    INVALID_USER_CREDENTIAL(116, "Invalid user credential"),
    SERVER_FAILURE_RESPONSE_RECEIVED(117, "Server failure response received"),
    UNEXPECTED_SERVER_RESPONSE(118, "Unexpected server response"),
    EMPTY_SERVER_RESPONSE(119, "Empty server response"),
    JSON_EXCEPTION(120, "JSON exception"),
    NO_NETWORK_CONNECTIVITY(121, "No network connectivity"),
    REMOTE_DEVICE_EXCEPTION(122, "Remote device exception"),
    INTERNAL_EXCEPTION(123, "Internal exception"),
    SYNC_CANCELLED(124, "Sync cancelled"),
    SYNC_NOT_ENABLED(125, "Sync not enabled"),
    SYNC_STATUS_CHECK_FAILED(126, "Sync Status API check failed"),
    SOFTWARE_UPDATE_FILE_DOWNLOAD_CANCELLED(127, "Software update file download cancelled");

    public static final String T = "APP";
    public static final String X = "DEVICE";
    public static final String Y = "SERVER";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f184019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f184020c = null;

    h(int i14, String str) {
        this.f184019b = i14;
        this.f184018a = str;
    }
}
