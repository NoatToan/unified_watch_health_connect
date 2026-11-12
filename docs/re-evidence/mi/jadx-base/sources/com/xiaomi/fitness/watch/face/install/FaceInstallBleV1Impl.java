package com.xiaomi.fitness.watch.face.install;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/watch/face/install/FaceInstallBleV1Impl;", "Lcom/xiaomi/fitness/watch/face/install/FaceInstallBleImpl;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceInstallBleV1Impl extends FaceInstallBleImpl {

    @Nullable
    private final WearableDeviceModel deviceModel;

    public FaceInstallBleV1Impl(@Nullable WearableDeviceModel wearableDeviceModel) {
        super(wearableDeviceModel);
        this.deviceModel = wearableDeviceModel;
    }

    @Override // com.xiaomi.fitness.watch.face.install.FaceInstallBaseImpl
    @NotNull
    public String getTAG() {
        return "FaceInstallBleV1Impl";
    }
}
