package com.xiaomi.fitness.device.contact.export;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.wearable.core.client.IDataHandler;
import defpackage.s7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 62\u00020\u0001:\u00016J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ7\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014JC\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0015JA\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0019JM\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u001aJI\u0010 \u001a\u00020\u00112\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH&¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0011H&¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b,\u0010+J\u001f\u0010/\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-H&¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-H&¢\u0006\u0004\b1\u00100J\u0017\u00103\u001a\u0002022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b3\u00104J\u0017\u00101\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b1\u00105¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "", "", "isIDLE", "()Z", "", "did", "isAuto", "", "syncData", "(Ljava/lang/String;Z)V", "syncDataByWidget", "Ls7r;", "packet", "needResponse", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "callback", "", "timeout", "call", "(Ls7r;ZLcom/xiaomi/fitness/device/contact/export/OnSyncCallback;I)V", "(Ljava/lang/String;Ls7r;ZLcom/xiaomi/fitness/device/contact/export/OnSyncCallback;I)I", "type", "", "data", "(I[BZLcom/xiaomi/fitness/device/contact/export/OnSyncCallback;I)V", "(Ljava/lang/String;I[BZLcom/xiaomi/fitness/device/contact/export/OnSyncCallback;I)I", "detailType", "path", "segmentLength", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "sendFile", "(Ljava/lang/String;IILjava/lang/String;ILcom/xiaomi/fitness/device/contact/export/SyncStateListener;)I", "taskId", "cancelTask", "(I)V", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "resultCallBack", "addSyncResultCallback", "(Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;)V", "removeSyncResultCallback", "addSyncStateListener", "(Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;)V", "removeSyncStateListener", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "dataHandler", "addDataHandler", "(ILcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;)V", "removeDataHandler", "Lcom/xiaomi/wearable/core/client/IDataHandler;", "getDataHandler", "(Ljava/lang/String;)Lcom/xiaomi/wearable/core/client/IDataHandler;", "(Ljava/lang/String;)V", "Companion", "device-contact-export_release"}, k = 1, mv = {2, 0, 0})
public interface DeviceContact {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/device/contact/export/DeviceContact$Companion;", "", "<init>", "()V", "device-contact-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addDataHandler(int type, @NotNull DataHandlerWrapper dataHandler);

    void addSyncResultCallback(@NotNull DeviceSyncCallback resultCallBack);

    void addSyncStateListener(@NotNull SyncStateListener listener);

    int call(@Nullable String did, int type, @Nullable byte[] data, boolean needResponse, @Nullable OnSyncCallback callback, int timeout);

    int call(@Nullable String did, @NotNull s7r packet, boolean needResponse, @Nullable OnSyncCallback callback, int timeout);

    void call(int type, @Nullable byte[] data, boolean needResponse, @Nullable OnSyncCallback callback, int timeout);

    void call(@NotNull s7r packet, boolean needResponse, @Nullable OnSyncCallback callback, int timeout);

    void cancelTask(int taskId);

    @NotNull
    IDataHandler getDataHandler(@NotNull String did);

    boolean isIDLE();

    void removeDataHandler(int type, @NotNull DataHandlerWrapper dataHandler);

    void removeDataHandler(@NotNull String did);

    void removeSyncResultCallback(@NotNull DeviceSyncCallback resultCallBack);

    void removeSyncStateListener(@NotNull SyncStateListener listener);

    int sendFile(@Nullable String did, int type, int detailType, @Nullable String path, int segmentLength, @Nullable SyncStateListener listener);

    void syncData(@NotNull String did, boolean isAuto);

    void syncDataByWidget(@NotNull String did, boolean isAuto);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ int call$default(DeviceContact deviceContact, String str, s7r s7rVar, boolean z, OnSyncCallback onSyncCallback, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: call");
            }
            String str2 = (i2 & 1) != 0 ? null : str;
            if ((i2 & 4) != 0) {
                z = false;
            }
            boolean z2 = z;
            OnSyncCallback onSyncCallback2 = (i2 & 8) != 0 ? null : onSyncCallback;
            if ((i2 & 16) != 0) {
                i = -1;
            }
            return deviceContact.call(str2, s7rVar, z2, onSyncCallback2, i);
        }

        public static /* synthetic */ int sendFile$default(DeviceContact deviceContact, String str, int i, int i2, String str2, int i3, SyncStateListener syncStateListener, int i4, Object obj) {
            if (obj == null) {
                return deviceContact.sendFile((i4 & 1) != 0 ? null : str, i, i2, str2, i3, (i4 & 32) != 0 ? null : syncStateListener);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendFile");
        }

        public static /* synthetic */ void syncData$default(DeviceContact deviceContact, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncData");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            deviceContact.syncData(str, z);
        }

        public static void syncDataByWidget(@NotNull DeviceContact deviceContact, @NotNull String did, boolean z) {
            Intrinsics.checkNotNullParameter(did, "did");
        }

        public static /* synthetic */ void syncDataByWidget$default(DeviceContact deviceContact, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncDataByWidget");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            deviceContact.syncDataByWidget(str, z);
        }

        public static /* synthetic */ void call$default(DeviceContact deviceContact, s7r s7rVar, boolean z, OnSyncCallback onSyncCallback, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: call");
            }
            if ((i2 & 2) != 0) {
                z = false;
            }
            if ((i2 & 4) != 0) {
                onSyncCallback = null;
            }
            if ((i2 & 8) != 0) {
                i = -1;
            }
            deviceContact.call(s7rVar, z, onSyncCallback, i);
        }

        public static /* synthetic */ void call$default(DeviceContact deviceContact, int i, byte[] bArr, boolean z, OnSyncCallback onSyncCallback, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: call");
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i3 & 8) != 0) {
                onSyncCallback = null;
            }
            OnSyncCallback onSyncCallback2 = onSyncCallback;
            if ((i3 & 16) != 0) {
                i2 = -1;
            }
            deviceContact.call(i, bArr, z2, onSyncCallback2, i2);
        }

        public static /* synthetic */ int call$default(DeviceContact deviceContact, String str, int i, byte[] bArr, boolean z, OnSyncCallback onSyncCallback, int i2, int i3, Object obj) {
            if (obj == null) {
                return deviceContact.call((i3 & 1) != 0 ? null : str, i, bArr, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? null : onSyncCallback, (i3 & 32) != 0 ? -1 : i2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: call");
        }
    }
}
