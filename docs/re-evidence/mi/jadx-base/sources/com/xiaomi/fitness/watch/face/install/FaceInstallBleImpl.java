package com.xiaomi.fitness.watch.face.install;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.install.FaceInstallBleImpl;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.s5r;
import defpackage.s7r;
import defpackage.t5r;
import defpackage.u5r;
import defpackage.v5r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001#B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005Jy\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152 \u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\t0\u0017H\u0016¢\u0006\u0002\u0010\u0018J3\u0010\u0019\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\b\u0010\"\u001a\u00020\tH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0018\u00010!R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/watch/face/install/FaceInstallBleImpl;", "Lcom/xiaomi/fitness/watch/face/install/FaceInstallBaseImpl;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "mHandler", "Landroid/os/Handler;", "preInstall", "", "id", "", "path", "version", "", MediaStoreUtil.MediaInfo.SIZE, "needCheckStorage", "", "license", "sign", "trialDuration", "", "action", "Lkotlin/Function3;", "(Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function3;)V", "doInstall", "segmentLength", "callback", "Lcom/xiaomi/fitness/watch/face/install/FaceInstallPushCallback;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/xiaomi/fitness/watch/face/install/FaceInstallPushCallback;)V", "getInstallTimeout", "timeout", "installDataHandler", "Lcom/xiaomi/fitness/watch/face/install/FaceInstallBleImpl$InstallDataHandler;", "unRegisterPacket", "InstallDataHandler", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FaceInstallBleImpl extends FaceInstallBaseImpl {

    @Nullable
    private final WearableDeviceModel deviceModel;

    @Nullable
    private InstallDataHandler installDataHandler;

    @NotNull
    private final Handler mHandler;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.install.FaceInstallBleImpl$doInstall$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/watch/face/install/FaceInstallBleImpl$doInstall$1", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", LifecycleConstantKt.ON_START, "", "did", "", "onSyncing", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "onFinish", "code", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements SyncStateListener {
        final /* synthetic */ FaceInstallPushCallback $callback;
        final /* synthetic */ String $id;
        final /* synthetic */ FaceInstallBleImpl this$0;

        public AnonymousClass1(FaceInstallPushCallback faceInstallPushCallback, FaceInstallBleImpl faceInstallBleImpl, String str) {
            this.$callback = faceInstallPushCallback;
            this.this$0 = faceInstallBleImpl;
            this.$id = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFinish$lambda$0(FaceInstallBleImpl this$0, String str, FaceInstallPushCallback callback) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(callback, "$callback");
            this$0.unRegisterPacket();
            Logger.i(this$0.getTAG(), "receivePacket installDataHandler: time out id = " + str);
            callback.onFinish(false, -1);
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onFinish(String did, int code) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (code != 0) {
                this.$callback.onFinish(false, code);
                return;
            }
            Handler handler = this.this$0.mHandler;
            final FaceInstallBleImpl faceInstallBleImpl = this.this$0;
            final String str = this.$id;
            final FaceInstallPushCallback faceInstallPushCallback = this.$callback;
            handler.postDelayed(new Runnable() { // from class: y09
                @Override // java.lang.Runnable
                public final void run() {
                    FaceInstallBleImpl.AnonymousClass1.onFinish$lambda$0(faceInstallBleImpl, str, faceInstallPushCallback);
                }
            }, this.this$0.getInstallTimeout(12000L));
            FaceInstallBleImpl faceInstallBleImpl2 = this.this$0;
            String str2 = this.$id;
            if (str2 == null) {
                str2 = "";
            }
            faceInstallBleImpl2.installDataHandler = new InstallDataHandler(faceInstallBleImpl2, str2, this.$callback);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            InstallDataHandler installDataHandler = this.this$0.installDataHandler;
            Intrinsics.checkNotNull(installDataHandler);
            deviceSyncExtKt.addDataHandler(4, installDataHandler);
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onStart(String did) {
            Intrinsics.checkNotNullParameter(did, "did");
            this.$callback.onStart();
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onSyncing(String did, int progress) {
            Intrinsics.checkNotNullParameter(did, "did");
            this.$callback.onProgress(progress);
        }
    }

    public FaceInstallBleImpl(@Nullable WearableDeviceModel wearableDeviceModel) {
        super(wearableDeviceModel);
        this.deviceModel = wearableDeviceModel;
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getInstallTimeout(long timeout) {
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return 80000L;
        }
        return timeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unRegisterPacket() {
        this.mHandler.removeCallbacksAndMessages(null);
        InstallDataHandler installDataHandler = this.installDataHandler;
        if (installDataHandler != null) {
            DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(4, installDataHandler);
        }
    }

    @Override // com.xiaomi.fitness.watch.face.install.FaceInstallController
    public void doInstall(@Nullable String path, @Nullable String id, @Nullable Integer segmentLength, @NotNull FaceInstallPushCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        unRegisterPacket();
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        String did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
        Intrinsics.checkNotNull(segmentLength);
        deviceSyncExtKt.sendFile(did, 1, 0, path, segmentLength.intValue(), new AnonymousClass1(callback, this, id));
    }

    @Override // com.xiaomi.fitness.watch.face.install.FaceInstallController
    public void preInstall(@Nullable String id, @Nullable String path, long version, long size, boolean needCheckStorage, @Nullable String license, @Nullable String sign, @Nullable Integer trialDuration, @NotNull final Function3<? super Boolean, ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        s7r s7rVar = new s7r();
        s7rVar.e = 4;
        s7rVar.f = 4;
        v5r v5rVar = new v5r();
        t5r t5rVar = new t5r();
        t5rVar.d = (int) size;
        t5rVar.e = version;
        t5rVar.c = id;
        t5r.a aVar = new t5r.a();
        if (license == null) {
            license = "";
        }
        aVar.c = license;
        if (sign == null) {
            sign = "";
        }
        aVar.d = sign;
        aVar.e = trialDuration != null ? trialDuration.intValue() : 0;
        t5rVar.g = aVar;
        v5rVar.D(t5rVar);
        s7rVar.e0(v5rVar);
        Logger.d(getTAG(), "preInstall: " + s7rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.install.FaceInstallBleImpl.preInstall.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(FaceInstallBleImpl.this.getTAG(), "pre install watch fail: " + code);
                action.invoke(Boolean.FALSE, Integer.valueOf(code), null);
            }

            /* JADX WARN: Code duplicated, block: B:12:0x001f  */
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null) {
                    onError(did, type, 255);
                }
                if ((result != null ? result.getPacket() : null) != null) {
                    s7r packet = result.getPacket();
                    Intrinsics.checkNotNull(packet);
                    if (packet.G() == null) {
                        Intrinsics.checkNotNull(result);
                        onError(did, type, result.getCode());
                    }
                } else {
                    Intrinsics.checkNotNull(result);
                    onError(did, type, result.getCode());
                }
                s7r packet2 = result.getPacket();
                Intrinsics.checkNotNull(packet2);
                v5r v5rVarG = packet2.G();
                Logger.i(FaceInstallBleImpl.this.getTAG(), "installBleFace result.face: " + v5rVarG);
                if (v5rVarG.z()) {
                    int iU = v5rVarG.u();
                    if (iU == 0) {
                        action.invoke(Boolean.TRUE, Integer.valueOf(iU), 0);
                        return;
                    } else {
                        action.invoke(Boolean.FALSE, Integer.valueOf(iU), null);
                        return;
                    }
                }
                if (!v5rVarG.y()) {
                    action.invoke(Boolean.FALSE, 255, null);
                    return;
                }
                u5r u5rVarT = v5rVarG.t();
                int i = u5rVarT.d;
                if (i == 0) {
                    action.invoke(Boolean.TRUE, Integer.valueOf(i), Integer.valueOf(u5rVarT.g));
                } else if (u5rVarT.e) {
                    action.invoke(Boolean.FALSE, 17, Integer.valueOf(u5rVarT.g));
                } else {
                    action.invoke(Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(u5rVarT.g));
                }
            }
        }, 0, 8, null);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/watch/face/install/FaceInstallBleImpl$InstallDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", FaceInfoBase.FACE_ID, "Ljava/lang/String;", "Lcom/xiaomi/fitness/watch/face/install/FaceInstallPushCallback;", "callback", "Lcom/xiaomi/fitness/watch/face/install/FaceInstallPushCallback;", "<init>", "(Lcom/xiaomi/fitness/watch/face/install/FaceInstallBleImpl;Ljava/lang/String;Lcom/xiaomi/fitness/watch/face/install/FaceInstallPushCallback;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class InstallDataHandler extends DataHandlerWrapper {

        @NotNull
        private final FaceInstallPushCallback callback;

        @NotNull
        private final String faceId;
        final /* synthetic */ FaceInstallBleImpl this$0;

        public InstallDataHandler(@NotNull FaceInstallBleImpl faceInstallBleImpl, @NotNull String faceId, FaceInstallPushCallback callback) {
            Intrinsics.checkNotNullParameter(faceId, "faceId");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.this$0 = faceInstallBleImpl;
            this.faceId = faceId;
            this.callback = callback;
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (type == 4 && packet != null && packet.f == 5) {
                Logger.i(this.this$0.getTAG(), "receivePacket InstallDataHandler");
                if (packet.G() != null && packet.G().s() != null) {
                    s5r s5rVarS = packet.G().s();
                    Logger.i(this.this$0.getTAG(), "InstallDataHandler receivePacket receiver id = " + s5rVarS.c + "; reqId = " + this.faceId + "; code = " + s5rVarS.d);
                    if (!Intrinsics.areEqual(this.faceId, s5rVarS.c)) {
                        this.this$0.unRegisterPacket();
                        this.callback.onFinish(false, 255);
                        return false;
                    }
                    int i = s5rVarS.d;
                    boolean z = i == 3 || i == 2;
                    this.callback.onFinish(z, z ? i : 255);
                    this.this$0.unRegisterPacket();
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ InstallDataHandler(FaceInstallBleImpl faceInstallBleImpl, String str, FaceInstallPushCallback faceInstallPushCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(faceInstallBleImpl, (i & 1) != 0 ? "" : str, faceInstallPushCallback);
        }
    }
}
