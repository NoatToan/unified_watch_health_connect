package com.xiaomi.fitness.camera.sport_capture_export;

import android.app.Activity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/camera/sport_capture_export/ISportCaptureManager;", "", "launchCapture", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "isProjecting", "", "isSportCaptureDeviceId", "deviceId", "", "useNativeCamera", "Companion", "sport-capture-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISportCaptureManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/camera/sport_capture_export/ISportCaptureManager$Companion;", "", "<init>", "()V", "sport-capture-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean useNativeCamera(@NotNull ISportCaptureManager iSportCaptureManager) {
            return false;
        }
    }

    boolean isProjecting();

    boolean isSportCaptureDeviceId(@NotNull String deviceId);

    void launchCapture(@NotNull Activity activity);

    boolean useNativeCamera();
}
