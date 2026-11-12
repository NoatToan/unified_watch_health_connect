package com.xiaomi.fitness.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SensorCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\rH\u0014J\b\u0010\u0015\u001a\u00020\rH\u0014J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sensor/LightDetector;", "Lcom/xiaomi/fitness/sensor/AbstractDetector;", "mContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mSensorEventListener", "Landroid/hardware/SensorEventListener;", "mWorkHandler", "Landroid/os/Handler;", "mHasSensor", "", "onLightUpdate", "", "lux", "", "detectEvent", "", "getDetectEvent", "()I", LifecycleConstantKt.ON_START, LifecycleConstantKt.ON_STOP, "onRequestRefresh", "indicator", "Lcom/xiaomi/fitness/sensor/IDetectorIndicator;", "Companion", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LightDetector extends AbstractDetector {

    @NotNull
    private static final String TAG = "LightDetector";

    @NotNull
    private final Context mContext;
    private boolean mHasSensor;

    @NotNull
    private final SensorEventListener mSensorEventListener;

    @Nullable
    private Handler mWorkHandler;

    public LightDetector(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.mSensorEventListener = new SensorEventListener() { // from class: com.xiaomi.fitness.sensor.LightDetector$mSensorEventListener$1
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
                Intrinsics.checkNotNullParameter(sensor, "sensor");
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.sensor.getType() != 5) {
                    throw new IllegalStateException();
                }
                this.this$0.onLightUpdate(event.values[0]);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLightUpdate(float lux) {
        IDetectorIndicator detectIndicator = getDetectIndicator();
        if (detectIndicator == null) {
            return;
        }
        Logger.i(TAG, "Lux: " + lux);
        detectIndicator.onRefresh(3, 3, lux);
    }

    @Override // com.xiaomi.fitness.sensor.IEventDetector
    public int getDetectEvent() {
        return 3;
    }

    @Override // com.xiaomi.fitness.sensor.AbstractDetector
    public void onRequestRefresh(@NotNull IDetectorIndicator indicator) {
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        SensorManager sensorManager = (SensorManager) this.mContext.getSystemService(SensorManager.class);
        Logger.i(this + " flush light sensor event", new Object[0]);
        sensorManager.flush(this.mSensorEventListener);
        indicator.onRefresh(3, 0, 0.0f);
    }

    @Override // com.xiaomi.fitness.sensor.AbstractDetector
    public void onStart() {
        SensorManager sensorManager = (SensorManager) this.mContext.getSystemService("sensor");
        if (sensorManager == null) {
            return;
        }
        Logger.i("onStart: register TYPE_LIGHT's listener", new Object[0]);
        Sensor defaultSensor = SensorCompat.INSTANCE.getDefaultSensor(sensorManager, 5, false);
        this.mHasSensor = false;
        if (defaultSensor != null) {
            this.mWorkHandler = new Handler();
            sensorManager.registerListener(this.mSensorEventListener, defaultSensor, getSamplingPeriod(), this.mWorkHandler);
            this.mHasSensor = true;
        }
    }

    @Override // com.xiaomi.fitness.sensor.AbstractDetector
    public void onStop() {
        Logger.i(this + "#onStop: unregister sensor's listener if " + this.mHasSensor + " == true", new Object[0]);
        if (this.mHasSensor) {
            ((SensorManager) this.mContext.getSystemService(SensorManager.class)).unregisterListener(this.mSensorEventListener);
        }
        Handler handler = this.mWorkHandler;
        if (handler != null) {
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacksAndMessages(null);
            this.mWorkHandler = null;
        }
    }
}
