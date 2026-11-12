package com.xiaomi.fitness.watch.face.export;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.FaceSyncerImpl;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.request.FaceApiRequestV2;
import defpackage.s7r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J \u0010\u0012\u001a\u00020\u000e2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/FaceSyncerImpl;", "Lcom/xiaomi/fitness/watch/face/export/FaceSyncer;", "<init>", "()V", "TAG", "", "currentFaceId", "getCurrentFaceId", "()Ljava/lang/String;", "setCurrentFaceId", "(Ljava/lang/String;)V", "faceApiRequestV2", "Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "syncData", "", "did", "callBack", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "onSyncBleFaceFinish", "result", "", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceSyncerImpl implements FaceSyncer {

    @NotNull
    private final String TAG = "FaceSyncerImpl";

    @NotNull
    private String currentFaceId = "";

    @NotNull
    private final FaceApiRequestV2 faceApiRequestV2 = new FaceApiRequestV2();

    private final void onSyncBleFaceFinish(List<WatchFace> result, WearableDeviceModel device) {
        Logger.i(this.TAG, "onSyncFaceFinish sync face success");
        if (result != null) {
            Logger.i(this.TAG, "onSyncFaceFinish sync face not null");
            FaceManager faceManager = FaceManager.INSTANCE;
            String sCurFaceId = faceManager.getSCurFaceId();
            this.currentFaceId = sCurFaceId;
            Logger.i(this.TAG, "onSyncFaceFinish pre face: " + sCurFaceId);
            faceManager.setSyncedData(result);
            for (WatchFace watchFace : result) {
                if (watchFace.isCurrent() && !Intrinsics.areEqual(watchFace.getId(), this.currentFaceId)) {
                    FaceHelper faceHelperExtKt = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE);
                    Intrinsics.checkNotNull(faceHelperExtKt, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.export.FaceHelperImpl");
                    ((FaceHelperImpl) faceHelperExtKt).notifyFaceChanged(null);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncData$lambda$0(DeviceSyncCallback deviceSyncCallback, WearableDeviceModel wearableDeviceModel, FaceSyncerImpl this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        deviceSyncCallback.onSyncSuccess(wearableDeviceModel.getDid(), 2, list);
        this$0.onSyncBleFaceFinish(list, wearableDeviceModel);
        return Unit.INSTANCE;
    }

    @NotNull
    public final String getCurrentFaceId() {
        return this.currentFaceId;
    }

    public final void setCurrentFaceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentFaceId = str;
    }

    @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncer
    public void syncData(@NotNull String did, @Nullable final DeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(this.TAG, "faceSyncer: start sync");
        if (callBack == null) {
            Logger.i(this.TAG, "sync face fail: DeviceSyncCallback is null");
            return;
        }
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            Logger.i(this.TAG, "sync face fail: device model is null");
            if ((wearableDeviceModel2 == null || !DeviceModelExtKt.isLocalDevice(wearableDeviceModel2)) && (wearableDeviceModel2 == null || !com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isEarPhone(wearableDeviceModel2))) {
                callBack.onSyncError(did, 2, null);
                return;
            } else {
                Logger.i(this.TAG, "sync Face nothing: device model is not support");
                return;
            }
        }
        if ((wearableDeviceModel2 != null && DeviceModelExtKt.isLocalDevice(wearableDeviceModel2)) || (wearableDeviceModel2 != null && com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isEarPhone(wearableDeviceModel2))) {
            Logger.i(this.TAG, "sync Face nothing: device model is not support");
            return;
        }
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            Logger.i(this.TAG, "faceSyncer: sync huami face");
            FaceManager.INSTANCE.getHuaMiFaceInstalled(wearableDeviceModel, new Function1() { // from class: t59
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceSyncerImpl.syncData$lambda$0(callBack, wearableDeviceModel, this, (List) obj);
                }
            });
            return;
        }
        if (!DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            if (DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
                Logger.i(this.TAG, "faceSyncer: sync wearOS face");
                FaceWearOsHelperExtKt.getInstance(FaceWearOsHelper.INSTANCE).syncWearOsWatch(wearableDeviceModel, callBack);
                return;
            }
            return;
        }
        Logger.i(this.TAG, "faceSyncer: sync ble face");
        FaceHelper faceHelperExtKt = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE);
        Intrinsics.checkNotNull(faceHelperExtKt, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.export.FaceHelperImpl");
        ((FaceHelperImpl) faceHelperExtKt).setRemoveInvalidFaces(false);
        s7r s7rVar = new s7r();
        s7rVar.e = 4;
        s7rVar.f = 0;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.export.FaceSyncerImpl.syncData.2
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                DeviceSyncCallback deviceSyncCallback = callBack;
                Intrinsics.checkNotNull(did2);
                deviceSyncCallback.onSyncError(did2, 2, "sync face error: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                ArrayList arrayList = new ArrayList();
                DeviceSyncCallback deviceSyncCallback = callBack;
                Intrinsics.checkNotNull(did2);
                deviceSyncCallback.onSyncSuccess(did2, 2, arrayList);
            }
        }, 0, 16, (Object) null);
    }
}
