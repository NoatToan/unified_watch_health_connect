package com.xiaomi.fitness.route.track.push;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.ps9;
import defpackage.s7r;
import defpackage.ur9;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J[\u0010\r\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u0016\u0010\u0017JF\u0010\u001b\u001a\u00020\u000b27\u0010\f\u001a3\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0012\u001d\u0012\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0014¢\u0006\f\b\u0019\u0012\b\b\u0007\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/route/track/push/TrackPushBleImpl;", "Lcom/xiaomi/fitness/route/track/push/TrackPushBaseImpl;", "", "id", "", MediaStoreUtil.MediaInfo.SIZE, "path", "name", "distance", "Lkotlin/Function3;", "", "", "action", "preInstall", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function3;)V", "segmentLength", "Lcom/xiaomi/fitness/route/track/push/TrackPushCallback;", "callback", "doInstall", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/xiaomi/fitness/route/track/push/TrackPushCallback;)V", "", "ids", "deleteTrackOnDevice", "([Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "Lps9;", "Lkotlin/ParameterName;", "naviRouteList", "getTrackOnDevice", "(Lkotlin/jvm/functions/Function3;)V", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "<init>", "()V", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class TrackPushBleImpl extends TrackPushBaseImpl {

    @NotNull
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    public final void deleteTrackOnDevice(@NotNull final String[] ids, @NotNull final Function3<? super Boolean, ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(action, "action");
        Logger.i(TrackPushBaseImpl.TAG, "deleteTrack ids is : " + ids);
        ps9.e eVar = new ps9.e();
        eVar.c = ids;
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 60;
        ur9 ur9Var = new ur9();
        ur9Var.u0(eVar);
        s7rVar.S(ur9Var);
        Logger.d(TrackPushBaseImpl.TAG, "deleteTrackOnDevice  packet: " + s7rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.route.track.push.TrackPushBleImpl.deleteTrackOnDevice.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(TrackPushBaseImpl.TAG, "deleteTrackOnDevice fail: " + code + ",ids is " + ids);
                action.invoke(Boolean.FALSE, Integer.valueOf(code), Integer.valueOf(code));
            }

            /* JADX WARN: Code duplicated, block: B:14:0x0046  */
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(TrackPushBaseImpl.TAG, "deleteTrack onSuccess: " + (result != null ? Boolean.valueOf(result.isSuccess()) : null));
                if (result == null) {
                    onError(did, type, 255);
                }
                if ((result != null ? result.getPacket() : null) != null) {
                    s7r packet = result.getPacket();
                    Intrinsics.checkNotNull(packet);
                    ur9 ur9VarU = packet.u();
                    Intrinsics.checkNotNull(ur9VarU);
                    if (ur9VarU.G() == null) {
                        Intrinsics.checkNotNull(result);
                        onError(did, type, result.getCode());
                    }
                } else {
                    Intrinsics.checkNotNull(result);
                    onError(did, type, result.getCode());
                }
                s7r packet2 = result.getPacket();
                Intrinsics.checkNotNull(packet2);
                ur9 ur9VarU2 = packet2.u();
                Intrinsics.checkNotNull(ur9VarU2);
                ps9.f fVarG = ur9VarU2.G();
                Logger.i(TrackPushBaseImpl.TAG, "deleteTrack : " + fVarG);
                int i = fVarG.c;
                if (i == 0) {
                    action.invoke(Boolean.TRUE, Integer.valueOf(i), 0);
                } else {
                    action.invoke(Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i));
                }
            }
        }, 0, 8, null);
    }

    @Override // com.xiaomi.fitness.route.track.push.TrackPushController
    public void doInstall(@NotNull String path, @Nullable String id, @Nullable Integer segmentLength, @NotNull final TrackPushCallback callback) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
        Intrinsics.checkNotNull(segmentLength);
        deviceSyncExtKt.sendFile(did, 6, 0, path, segmentLength.intValue(), new SyncStateListener() { // from class: com.xiaomi.fitness.route.track.push.TrackPushBleImpl.doInstall.1
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did2, int code) {
                Intrinsics.checkNotNullParameter(did2, "did");
                if (code != 0) {
                    callback.onFinish(false, code);
                } else {
                    callback.onFinish(true, code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did2) {
                Intrinsics.checkNotNullParameter(did2, "did");
                callback.onStart();
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did2, int progress) {
                Intrinsics.checkNotNullParameter(did2, "did");
                callback.onProgress(progress);
            }
        });
    }

    public final void getTrackOnDevice(@NotNull final Function3<? super Boolean, ? super Integer, ? super ps9[], Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Logger.i(TrackPushBaseImpl.TAG, "getTrackOnDevice  start");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 57;
        Logger.d(TrackPushBaseImpl.TAG, "getTrackOnDevice  packet: " + s7rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.route.track.push.TrackPushBleImpl.getTrackOnDevice.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(TrackPushBaseImpl.TAG, "getTrackOnDevice fail: " + code);
                action.invoke(Boolean.FALSE, Integer.valueOf(code), null);
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0048  */
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(TrackPushBaseImpl.TAG, "getTrackOnDevice onSuccess: " + (result != null ? Boolean.valueOf(result.isSuccess()) : null));
                if (result == null) {
                    onError(did, type, 255);
                }
                if ((result != null ? result.getPacket() : null) != null) {
                    s7r packet = result.getPacket();
                    Intrinsics.checkNotNull(packet);
                    ur9 ur9VarU = packet.u();
                    Intrinsics.checkNotNull(ur9VarU);
                    if (ur9VarU.F() == null) {
                        Intrinsics.checkNotNull(result);
                        onError(did, type, result.getCode());
                    }
                } else {
                    Intrinsics.checkNotNull(result);
                    onError(did, type, result.getCode());
                }
                s7r packet2 = result.getPacket();
                Intrinsics.checkNotNull(packet2);
                ur9 ur9VarU2 = packet2.u();
                Intrinsics.checkNotNull(ur9VarU2);
                ps9.d dVarF = ur9VarU2.F();
                ps9[] ps9VarArr = dVarF.c;
                Logger.i(TrackPushBaseImpl.TAG, "getTrackOnDevice : " + dVarF);
                Intrinsics.checkNotNull(ps9VarArr);
                if (!(ps9VarArr.length == 0)) {
                    action.invoke(Boolean.TRUE, 0, ps9VarArr);
                } else {
                    action.invoke(Boolean.FALSE, 255, null);
                }
            }
        }, 0, 8, null);
    }

    @Override // com.xiaomi.fitness.route.track.push.TrackPushController
    public void preInstall(@Nullable String id, int size, @NotNull String path, @NotNull String name, int distance, @NotNull final Function3<? super Boolean, ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(action, "action");
        if (!new File(path).exists()) {
            action.invoke(Boolean.FALSE, 255, null);
        }
        ps9 ps9Var = new ps9();
        ps9Var.c = id;
        ps9Var.d = name;
        ps9Var.e = distance;
        ps9.a aVar = new ps9.a();
        aVar.d = size;
        aVar.c = ps9Var;
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 58;
        ur9 ur9Var = new ur9();
        ur9Var.t0(aVar);
        s7rVar.S(ur9Var);
        Logger.d(TrackPushBaseImpl.TAG, "preInstall  packet: " + s7rVar);
        FitnessLogUtils.d("TrackImpl2", ">>>>>> 1.start pre:" + id);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.route.track.push.TrackPushBleImpl.preInstall.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(TrackPushBaseImpl.TAG, "pre install track fail: " + code);
                action.invoke(Boolean.FALSE, Integer.valueOf(code), Integer.valueOf(code));
            }

            /* JADX WARN: Code duplicated, block: B:14:0x0046  */
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(TrackPushBaseImpl.TAG, "addNaviRouter onSuccess: " + (result != null ? Boolean.valueOf(result.isSuccess()) : null));
                if (result == null) {
                    onError(did, type, 255);
                }
                if ((result != null ? result.getPacket() : null) != null) {
                    s7r packet = result.getPacket();
                    Intrinsics.checkNotNull(packet);
                    ur9 ur9VarU = packet.u();
                    Intrinsics.checkNotNull(ur9VarU);
                    if (ur9VarU.D() == null) {
                        Intrinsics.checkNotNull(result);
                        onError(did, type, result.getCode());
                    }
                } else {
                    Intrinsics.checkNotNull(result);
                    onError(did, type, result.getCode());
                }
                s7r packet2 = result.getPacket();
                Intrinsics.checkNotNull(packet2);
                ur9 ur9VarU2 = packet2.u();
                Intrinsics.checkNotNull(ur9VarU2);
                ps9.b bVarD = ur9VarU2.D();
                Logger.i(TrackPushBaseImpl.TAG, "installBleTrack result.track: " + bVarD);
                String str = bVarD.c;
                int i = bVarD.d;
                Logger.i(TrackPushBaseImpl.TAG, "installBleTrack status: " + i);
                FitnessLogUtils.d("TrackImpl2", ">>>>>> 2.  callback pre:" + str + " , status:" + i);
                if (i == 0) {
                    action.invoke(Boolean.TRUE, Integer.valueOf(i), 0);
                } else {
                    action.invoke(Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i));
                }
            }
        }, 0, 8, null);
    }
}
