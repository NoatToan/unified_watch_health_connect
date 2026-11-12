package com.huami.watch.companion.device.feasupp;

import androidx.annotation.NonNull;
import com.huami.watch.companion.device.Device;

/* JADX INFO: loaded from: classes16.dex */
public interface IFeatureSupp {
    boolean isRomSupportAutoUpdate(@NonNull Device device);

    boolean isRomSupportFTP(@NonNull Device device);

    boolean isRomSupportHRR(@NonNull Device device);

    boolean isRomSupportHideSportItem(@NonNull Device device);

    boolean isRomSupportIntervalRun(@NonNull Device device);

    boolean isRomSupportLapPace(@NonNull Device device);

    boolean isRomSupportLoadBg(@NonNull Device device);

    boolean isRomSupportMiAI(@NonNull Device device);

    boolean isRomSupportMiotToken(@NonNull Device device);

    boolean isRomSupportNewSportHealthChannel(@NonNull Device device);

    boolean isRomSupportOutRidingCEL(@NonNull Device device);

    boolean isRomSupportShowQR(@NonNull Device device);

    boolean isRomSupportStepGoalSet(@NonNull Device device);

    boolean isRomSupportUnlock(@NonNull Device device);

    boolean isRomSupportWalkingStep(@NonNull Device device);

    boolean isRomSupportWatchFaceStore(@NonNull Device device);

    boolean isRomSupportWorldCup(@NonNull Device device);

    boolean isRomWOS2(@NonNull Device device);

    boolean isRomWidgetSupportHidden(@NonNull Device device);

    boolean isSupportHiking(Device device);

    boolean isSupportNewLap(@NonNull Device device);
}
