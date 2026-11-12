package com.xiaomi.fitness.device.manager;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DeviceStatus;", "", "", "status", "I", "getStatus", "()I", "setStatus", "(I)V", "", "isConnected", "()Z", "isSynced", "isNotSynced", "isConnecting", "isSyncing", "isNotBound", "<init>", "Companion", "device-manager_release"}, k = 1, mv = {2, 0, 0})
public final class DeviceStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int STATUS_APP_DISABLE_CONNECT = 8;
    public static final int STATUS_CONNECTED = 3;
    public static final int STATUS_CONNECTING = 2;
    public static final int STATUS_CONNECT_STOP = 4;
    public static final int STATUS_DATA_NOT_SYNC = 5;
    public static final int STATUS_DATA_SYNCED = 7;
    public static final int STATUS_DATA_SYNCING = 6;
    public static final int STATUS_DISABLE_CONNECT = 9;
    public static final int STATUS_NOT_BOUND = 0;
    public static final int STATUS_NOT_CONNECTED = 1;
    public static final int STATUS_NO_DEVICE = -1;
    private int status;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DeviceStatus$Companion;", "", "<init>", "()V", "STATUS_NO_DEVICE", "", "STATUS_NOT_BOUND", "STATUS_NOT_CONNECTED", "STATUS_CONNECTING", "STATUS_CONNECTED", "STATUS_CONNECT_STOP", "STATUS_DATA_NOT_SYNC", "STATUS_DATA_SYNCING", "STATUS_DATA_SYNCED", "STATUS_APP_DISABLE_CONNECT", "STATUS_DISABLE_CONNECT", "statusToString", "", "status", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String statusToString(int status) {
            switch (status) {
                case -1:
                    return "STATUS_NO_DEVICE(-1)";
                case 0:
                    return "STATUS_NOT_BOUND(0)";
                case 1:
                    return "STATUS_NOT_CONNECTED(1)";
                case 2:
                    return "STATUS_CONNECTING(2)";
                case 3:
                    return "STATUS_CONNECTED(3)";
                case 4:
                    return "STATUS_CONNECT_STOP(4)";
                case 5:
                    return "STATUS_DATA_NOT_SYNC(5)";
                case 6:
                    return "STATUS_DATA_SYNCING(6)";
                case 7:
                    return "STATUS_DATA_SYNCED(7)";
                case 8:
                    return "STATUS_APP_DISABLE_CONNECT(8)";
                case 9:
                    return "STATUS_DISABLE_CONNECT(9)";
                default:
                    return "INVALID(" + status + ")";
            }
        }
    }

    public DeviceStatus(int i) {
        this.status = i;
    }

    public final int getStatus() {
        return this.status;
    }

    public final boolean isConnected() {
        int i = this.status;
        return (i == 1 || i == 4 || i == 2 || i == 8 || i == 9) ? false : true;
    }

    public final boolean isConnecting() {
        return this.status == 2;
    }

    public final boolean isNotBound() {
        return this.status == 0;
    }

    public final boolean isNotSynced() {
        return this.status == 5;
    }

    public final boolean isSynced() {
        return this.status == 7;
    }

    public final boolean isSyncing() {
        return this.status == 6;
    }

    public final void setStatus(int i) {
        this.status = i;
    }
}
