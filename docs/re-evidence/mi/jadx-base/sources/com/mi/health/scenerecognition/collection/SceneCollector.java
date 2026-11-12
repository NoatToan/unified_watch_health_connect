package com.mi.health.scenerecognition.collection;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener2;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.motion.recognition.SceneRecogConfiguration;
import com.xiaomi.fitness.motion.recognition.utils.HarSensorHelper;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005J\u0006\u0010\u0017\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015R\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/mi/health/scenerecognition/collection/SceneCollector;", "Landroid/hardware/SensorEventListener2;", "<init>", "()V", "mCallback", "Lkotlin/Function2;", "", "Landroid/hardware/SensorEvent;", "", "mSensorManager", "Landroid/hardware/SensorManager;", "onSensorChanged", "event", "onAccuracyChanged", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "onFlushCompleted", StatConstants.PARAM_START, "context", "Landroid/content/Context;", "callback", "forceFlushHarSensor", BroadcastsKt.SILENT_PUSHING_STOP, "Companion", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneCollector implements SensorEventListener2 {
    private static final int MILLISECOND_IN_NS = (int) TimeUnit.MILLISECONDS.toNanos(1);

    @NotNull
    private static final String TAG = "SceneCollector";

    @Nullable
    private Function2<? super Long, ? super SensorEvent, Unit> mCallback;

    @Nullable
    private SensorManager mSensorManager;

    public final void forceFlushHarSensor() {
        Logger.i(TAG, "forceFlushHarSensor, mSensorManager=" + this.mSensorManager);
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            Intrinsics.checkNotNull(sensorManager);
            sensorManager.flush(this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@NotNull Sensor sensor, int accuracy) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener2
    public void onFlushCompleted(@NotNull Sensor sensor) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
        Logger.i(TAG, "onFlushCompleted " + sensor.getType());
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        long jCurrentTimeMillis = System.currentTimeMillis() + ((event.timestamp - SystemClock.elapsedRealtimeNanos()) / ((long) MILLISECOND_IN_NS));
        StringBuilder sb = new StringBuilder();
        sb.append("onSensorChanged: ");
        sb.append(event);
        if (this.mCallback == null || event.sensor.getType() != 33171070) {
            return;
        }
        Function2<? super Long, ? super SensorEvent, Unit> function2 = this.mCallback;
        Intrinsics.checkNotNull(function2);
        function2.invoke(Long.valueOf(jCurrentTimeMillis), event);
    }

    public final void start(@NotNull Context context, @NotNull Function2<? super Long, ? super SensorEvent, Unit> callback) {
        Sensor harSensor;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mCallback = callback;
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.mSensorManager = sensorManager;
        if (sensorManager == null || (harSensor = HarSensorHelper.INSTANCE.getHarSensor(context)) == null) {
            return;
        }
        SensorManager sensorManager2 = this.mSensorManager;
        Intrinsics.checkNotNull(sensorManager2);
        SceneRecogConfiguration sceneRecogConfiguration = SceneRecogConfiguration.INSTANCE;
        sensorManager2.registerListener(this, harSensor, sceneRecogConfiguration.getDEFAULT_SAMPLE(), sceneRecogConfiguration.getMAX_REPORT_LATENCY());
    }

    public final void stop(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        ((SensorManager) systemService).unregisterListener(this);
    }
}
