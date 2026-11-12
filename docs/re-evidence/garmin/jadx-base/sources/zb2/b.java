package zb2;

/* JADX INFO: loaded from: classes11.dex */
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    SYNC_ACTIVE(new String[]{"com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_STARTED", "com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_FINISHED"}),
    /* JADX INFO: Fake field, exist only in values array */
    OVERALL_PROGRESS(new String[]{"com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_TRANSFER_PROGRESS"}),
    /* JADX INFO: Fake field, exist only in values array */
    CIQ_INSTALL_ERRORS(new String[]{"com.garmin.android.lib.connectdevicesync.action.ACTION_APP_INSTALLATION_FAILED"}),
    /* JADX INFO: Fake field, exist only in values array */
    FILE_UPLOAD_COMPLETION(new String[]{"com.garmin.android.lib.connectdevicesync.ACTION_FILE_PROCESSING_FINISHED", "com.garmin.android.lib.connectdevicesync.ACTION_FILE_PROCESSING_STARTED"}),
    /* JADX INFO: Fake field, exist only in values array */
    FILE_DOWNLOAD_COMPLETION(new String[]{"com.garmin.android.lib.connectdevicesync.ACTION_MESSAGE_PROCESSING_FINISHED", "com.garmin.android.lib.connectdevicesync.ACTION_MESSAGE_PROCESSING_STARTED"}),
    /* JADX INFO: Fake field, exist only in values array */
    SYNC_DENIED(new String[]{"com.garmin.android.lib.connectdevicesync.ACTION_SYNC_REQUEST_DENIED"});


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f203897a;

    b(String[] strArr) {
        this.f203897a = strArr;
    }
}
