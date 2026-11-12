package com.xiaomi.fitness.motion.recognition.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.xiaomi.fitness.common.utils.SensorCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/utils/HarSensorHelper;", "", "<init>", "()V", "HAR_TYPE", "", "sSupportHar", "", "Ljava/lang/Boolean;", "sSupportPressure", "getHarSensor", "Landroid/hardware/Sensor;", "context", "Landroid/content/Context;", "supportSceneRecognition", "supportPressureSensor", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HarSensorHelper {
    public static final int HAR_TYPE = 33171070;

    @NotNull
    public static final HarSensorHelper INSTANCE = new HarSensorHelper();

    @Nullable
    private static Boolean sSupportHar;

    @Nullable
    private static Boolean sSupportPressure;

    private HarSensorHelper() {
    }

    @Nullable
    public final Sensor getHarSensor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SensorManager sensorManager = (SensorManager) context.getSystemService(SensorManager.class);
        SensorCompat sensorCompat = SensorCompat.INSTANCE;
        Intrinsics.checkNotNull(sensorManager);
        return sensorCompat.getDefaultSensor(sensorManager, HAR_TYPE, false);
    }

    public final boolean supportPressureSensor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (sSupportPressure == null) {
            sSupportPressure = Boolean.valueOf(SensorCompat.INSTANCE.hasSensor(context, 6));
        }
        Boolean bool = sSupportPressure;
        Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }

    public final boolean supportSceneRecognition(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (sSupportHar == null) {
            sSupportHar = Boolean.valueOf(getHarSensor(context) != null);
        }
        Boolean bool = sSupportHar;
        Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }
}
