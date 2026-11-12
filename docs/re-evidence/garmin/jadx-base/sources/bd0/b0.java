package bd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbd0/b0;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b0 {
    NO_CONNECTION("Network connection not available"),
    EMPTY_DEVICE_MESSAGE("Retrieved empty message list"),
    DEVICE_MESSAGE_FAILED("Failed to retrieve the device messages"),
    REMOTE_DEVICE_DISCONNECTED("Remote device disconnected during FW update process"),
    REMOTE_DEVICE_FILE_TRANSFER_FAILED("Remote device file transfer failed"),
    REMOTE_DEVICE_BATTERY_LOW("Remote device battery too low"),
    FILE_DOWNLOAD_FAILED("Failed to download software update file"),
    /* JADX INFO: Fake field, exist only in values array */
    UPDATE_FAILED_IN_BACKGROUND("Software update failed while the app was put in background"),
    REMOTE_DEVICE_SYNC_FAILED("Device sync failed, software update could not finish"),
    DEFAULT("Server end points are not available");

    static {
        new a(null);
    }

    b0(String str) {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbd0/b0$a;", "", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
