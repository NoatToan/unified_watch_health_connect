package com.xiaomi.fitness.common.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/common/utils/SensorCompat;", "", "<init>", "()V", "TAG", "", "getDefaultSensor", "Landroid/hardware/Sensor;", "sensorManager", "Landroid/hardware/SensorManager;", "type", "", "wakeUpFirst", "", "hasNonWakeUpSensor", "context", "Landroid/content/Context;", "hasSensor", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SensorCompat {

    @NotNull
    public static final SensorCompat INSTANCE = new SensorCompat();

    @NotNull
    private static final String TAG = "SensorCompat";

    private SensorCompat() {
    }

    @Nullable
    public final Sensor getDefaultSensor(@NotNull SensorManager sensorManager, int type, boolean wakeUpFirst) {
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Sensor defaultSensor = sensorManager.getDefaultSensor(type, wakeUpFirst);
        if (defaultSensor == null) {
            defaultSensor = sensorManager.getDefaultSensor(type, !wakeUpFirst);
        }
        Logger.i(TAG, "getDefaultSensor");
        return defaultSensor;
    }

    public final boolean hasNonWakeUpSensor(@NotNull Context context, int type) {
        Intrinsics.checkNotNullParameter(context, "context");
        SensorManager sensorManager = (SensorManager) context.getSystemService(SensorManager.class);
        if (sensorManager == null) {
            return false;
        }
        Logger.e(TAG, "hasNonWakeUpSensor", new RuntimeException());
        return sensorManager.getDefaultSensor(type, false) != null;
    }

    public final boolean hasSensor(@NotNull Context context, int type) {
        Intrinsics.checkNotNullParameter(context, "context");
        SensorManager sensorManager = (SensorManager) context.getSystemService(SensorManager.class);
        Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(type) : null;
        Logger.i(TAG, "hasSensor");
        return defaultSensor != null;
    }
}
