package com.xiaomi.fitness.watch.face.export;

import android.content.Context;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/FaceWearOsHelperImpl;", "Lcom/xiaomi/fitness/watch/face/export/FaceWearOsHelper;", "<init>", "()V", "gotoFacePage", "", "context", "Landroid/content/Context;", "loadWearOsWatch", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "syncWearOsWatch", "device", "callback", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "loadFace", "bottomIcon", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;", "topIcon", "dispose", "unbindWearOs", "did", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceWearOsHelperImpl implements FaceWearOsHelper {
    @Override // com.xiaomi.fitness.watch.face.export.FaceWearOsHelper
    public void dispose() {
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceWearOsHelper
    public void gotoFacePage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceWearOsHelper
    public void loadFace(@NotNull WearableDeviceModel deviceModel, @NotNull FaceInfoView bottomIcon, @NotNull FaceInfoView topIcon) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(bottomIcon, "bottomIcon");
        Intrinsics.checkNotNullParameter(topIcon, "topIcon");
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceWearOsHelper
    public void loadWearOsWatch(@Nullable WearableDeviceModel deviceModel) {
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceWearOsHelper
    public void syncWearOsWatch(@NotNull WearableDeviceModel device, @NotNull DeviceSyncCallback callback) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceWearOsHelper
    public void unbindWearOs(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
    }
}
