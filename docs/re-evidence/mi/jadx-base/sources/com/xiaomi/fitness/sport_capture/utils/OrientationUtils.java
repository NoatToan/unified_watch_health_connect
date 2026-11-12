package com.xiaomi.fitness.sport_capture.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/utils/OrientationUtils;", "", "<init>", "()V", "TAG", "", "sensorManager", "Landroid/hardware/SensorManager;", "rotationVectorSensor", "Landroid/hardware/Sensor;", "listeners", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/sport_capture/utils/OrientationListener;", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "sensorEventListener", "Landroid/hardware/SensorEventListener;", "R", "", "orientation", "init", "", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "destroy", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OrientationUtils {

    @NotNull
    private static final String TAG = "OrientationUtils";

    @Nullable
    private static ArrayList<OrientationListener> listeners;

    @Nullable
    private static Sensor rotationVectorSensor;

    @Nullable
    private static SensorEventListener sensorEventListener;

    @Nullable
    private static SensorManager sensorManager;

    @NotNull
    public static final OrientationUtils INSTANCE = new OrientationUtils();

    @NotNull
    private static final float[] R = new float[9];

    @NotNull
    private static final float[] orientation = new float[3];

    private OrientationUtils() {
    }

    public final void destroy() {
        SensorManager sensorManager2 = sensorManager;
        if (sensorManager2 != null) {
            sensorManager2.unregisterListener(sensorEventListener);
        }
        ArrayList<OrientationListener> arrayList = listeners;
        if (arrayList != null) {
            arrayList.clear();
        }
        sensorManager = null;
        sensorEventListener = null;
    }

    public final void init(@NotNull Context context, @NotNull OrientationListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager2 = (SensorManager) systemService;
        sensorManager = sensorManager2;
        rotationVectorSensor = sensorManager2 != null ? sensorManager2.getDefaultSensor(11) : null;
        listeners = new ArrayList<>();
        SensorEventListener sensorEventListener2 = new SensorEventListener() { // from class: com.xiaomi.fitness.sport_capture.utils.OrientationUtils.init.1
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent event) {
                Sensor sensor;
                if (event == null || (sensor = event.sensor) == null || sensor.getType() != 11) {
                    return;
                }
                SensorManager.getRotationMatrixFromVector(OrientationUtils.R, event.values);
                SensorManager.getOrientation(OrientationUtils.R, OrientationUtils.orientation);
                double degrees = Math.toDegrees(OrientationUtils.orientation[0]);
                ArrayList arrayList = OrientationUtils.listeners;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((OrientationListener) it.next()).onOrientationChange((float) degrees);
                    }
                }
            }
        };
        sensorEventListener = sensorEventListener2;
        SensorManager sensorManager3 = sensorManager;
        if (sensorManager3 != null) {
            sensorManager3.registerListener(sensorEventListener2, rotationVectorSensor, 3);
        }
        ArrayList<OrientationListener> arrayList = listeners;
        if (arrayList != null) {
            arrayList.add(listener);
        }
    }
}
