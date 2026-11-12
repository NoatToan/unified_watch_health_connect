package com.xiaomi.fitness.eco.device.contact.export;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.u7r;
import defpackage.zrc;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 12\u00020\u0001:\u00011J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0010H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b!\u0010 J\u001f\u0010%\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b'\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b)\u0010*JO\u0010/\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010\u00052\u0006\u0010-\u001a\u00020\u00102\b\b\u0002\u0010.\u001a\u00020\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH&¢\u0006\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceContact;", "", "", "isIDLE", "()Z", "", "did", "isAuto", "", "syncData", "(Ljava/lang/String;Z)V", "Lu7r;", "packet", "needResponse", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "callback", "", "timeout", "call", "(Lu7r;ZLcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;I)V", "(Ljava/lang/String;Lu7r;ZLcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;I)I", "taskId", "cancelTask", "(Ljava/lang/String;I)V", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;", "resultCallBack", "addSyncResultCallback", "(Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncCallback;)V", "removeSyncResultCallback", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSyncStateListener", "(Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncStateListener;)V", "removeSyncStateListener", "type", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDataHandlerWrapper;", "dataHandler", "addDataHandler", "(ILcom/xiaomi/fitness/eco/device/contact/export/EcoDataHandlerWrapper;)V", "removeDataHandler", "Lzrc;", "getDataHandler", "(Ljava/lang/String;)Lzrc;", "detailType", "path", "segmentLength", "priority", "sendFile", "(Ljava/lang/String;IILjava/lang/String;IILcom/xiaomi/fitness/eco/device/contact/export/EcoSyncStateListener;)I", "Companion", "eco-device-contact-export_release"}, k = 1, mv = {2, 0, 0})
public interface EcoDeviceContact {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceContact$Companion;", "", "<init>", "()V", "eco-device-contact-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addDataHandler(int type, @NotNull EcoDataHandlerWrapper dataHandler);

    void addSyncResultCallback(@NotNull EcoDeviceSyncCallback resultCallBack);

    void addSyncStateListener(@NotNull EcoSyncStateListener listener);

    int call(@Nullable String did, @NotNull u7r packet, boolean needResponse, @Nullable OnEcoSyncCallback callback, int timeout);

    void call(@NotNull u7r packet, boolean needResponse, @Nullable OnEcoSyncCallback callback, int timeout);

    void cancelTask(@NotNull String did, int taskId);

    @NotNull
    zrc getDataHandler(@NotNull String did);

    boolean isIDLE();

    void removeDataHandler(int type, @NotNull EcoDataHandlerWrapper dataHandler);

    void removeSyncResultCallback(@NotNull EcoDeviceSyncCallback resultCallBack);

    void removeSyncStateListener(@NotNull EcoSyncStateListener listener);

    int sendFile(@NotNull String did, int type, int detailType, @Nullable String path, int segmentLength, int priority, @Nullable EcoSyncStateListener listener);

    void syncData(@NotNull String did, boolean isAuto);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ int call$default(EcoDeviceContact ecoDeviceContact, String str, u7r u7rVar, boolean z, OnEcoSyncCallback onEcoSyncCallback, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: call");
            }
            String str2 = (i2 & 1) != 0 ? null : str;
            OnEcoSyncCallback onEcoSyncCallback2 = (i2 & 8) != 0 ? null : onEcoSyncCallback;
            if ((i2 & 16) != 0) {
                i = -1;
            }
            return ecoDeviceContact.call(str2, u7rVar, z, onEcoSyncCallback2, i);
        }

        public static /* synthetic */ int sendFile$default(EcoDeviceContact ecoDeviceContact, String str, int i, int i2, String str2, int i3, int i4, EcoSyncStateListener ecoSyncStateListener, int i5, Object obj) {
            if (obj == null) {
                return ecoDeviceContact.sendFile(str, i, i2, str2, i3, (i5 & 32) != 0 ? 0 : i4, (i5 & 64) != 0 ? null : ecoSyncStateListener);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendFile");
        }

        public static /* synthetic */ void syncData$default(EcoDeviceContact ecoDeviceContact, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncData");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            ecoDeviceContact.syncData(str, z);
        }

        public static /* synthetic */ void call$default(EcoDeviceContact ecoDeviceContact, u7r u7rVar, boolean z, OnEcoSyncCallback onEcoSyncCallback, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: call");
            }
            if ((i2 & 2) != 0) {
                z = false;
            }
            if ((i2 & 4) != 0) {
                onEcoSyncCallback = null;
            }
            if ((i2 & 8) != 0) {
                i = -1;
            }
            ecoDeviceContact.call(u7rVar, z, onEcoSyncCallback, i);
        }
    }
}
