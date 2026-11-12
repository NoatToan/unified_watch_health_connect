package com.xiaomi.fitness.watch.face.export;

import android.content.Context;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH&J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/FaceWearOsHelper;", "", "gotoFacePage", "", "context", "Landroid/content/Context;", "loadWearOsWatch", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "syncWearOsWatch", "device", "callback", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "loadFace", "bottomIcon", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;", "topIcon", "dispose", "unbindWearOs", "did", "", "Companion", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FaceWearOsHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/FaceWearOsHelper$Companion;", "", "<init>", "()V", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void dispose();

    void gotoFacePage(@NotNull Context context);

    void loadFace(@NotNull WearableDeviceModel deviceModel, @NotNull FaceInfoView bottomIcon, @NotNull FaceInfoView topIcon);

    void loadWearOsWatch(@Nullable WearableDeviceModel deviceModel);

    void syncWearOsWatch(@NotNull WearableDeviceModel device, @NotNull DeviceSyncCallback callback);

    void unbindWearOs(@NotNull String did);
}
