package com.xiaomi.fitness.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SensorCompat;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0014J\b\u0010\u001a\u001a\u00020\u000fH\u0014J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sensor/MotionDetector;", "Lcom/xiaomi/fitness/sensor/AbstractDetector;", "mContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mSensorEventListener", "Landroid/hardware/SensorEventListener;", "metaSensors", "", "mWorkHandler", "Landroid/os/Handler;", "mHasSensor", "", "onHandleSensorEvent", "", "event", "Landroid/hardware/SensorEvent;", "dealStepDetector", "dealLinearAcceleration", "onHasMotion", "detectEvent", "", "getDetectEvent", "()I", LifecycleConstantKt.ON_START, LifecycleConstantKt.ON_STOP, "onRequestRefresh", "indicator", "Lcom/xiaomi/fitness/sensor/IDetectorIndicator;", "InnerSensorEventListener", "Companion", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MotionDetector extends AbstractDetector {

    @NotNull
    private static final String TAG = "MotionDetector";

    @NotNull
    private final Context mContext;
    private boolean mHasSensor;

    @NotNull
    private final SensorEventListener mSensorEventListener;

    @Nullable
    private Handler mWorkHandler;

    @NotNull
    private final int[] metaSensors;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float motionFactor = 10.0f;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0014\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sensor/MotionDetector$Companion;", "", "<init>", "()V", "TAG", "", "motionFactor", "", "calcAcc", "", Constants.KEY_RECHARGE_VALUES, "", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final double calcAcc(float[] values) {
            return Math.sqrt(Math.pow(values[0], 2.0d) + Math.pow(values[1], 2.0d) + Math.pow(values[2], 2.0d));
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sensor/MotionDetector$InnerSensorEventListener;", "Landroid/hardware/SensorEventListener;", "<init>", "(Lcom/xiaomi/fitness/sensor/MotionDetector;)V", "onSensorChanged", "", "event", "Landroid/hardware/SensorEvent;", "onAccuracyChanged", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class InnerSensorEventListener implements SensorEventListener {
        public InnerSensorEventListener() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(@NotNull Sensor sensor, int accuracy) {
            Intrinsics.checkNotNullParameter(sensor, "sensor");
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(@NotNull SensorEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            MotionDetector.this.onHandleSensorEvent(event);
        }
    }

    public MotionDetector(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.mSensorEventListener = new InnerSensorEventListener();
        this.metaSensors = new int[]{1, 18};
    }

    private final void dealLinearAcceleration(SensorEvent event) {
        Companion companion = INSTANCE;
        float[] values = event.values;
        Intrinsics.checkNotNullExpressionValue(values, "values");
        double dCalcAcc = companion.calcAcc(values);
        Logger logger = Logger.INSTANCE;
        float[] values2 = event.values;
        Intrinsics.checkNotNullExpressionValue(values2, "values");
        logger.v(TAG, "motion acc : " + dCalcAcc + ", " + ArraysKt___ArraysKt.joinToString$default(values2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        if (dCalcAcc >= motionFactor) {
            onHasMotion();
        }
    }

    private final void dealStepDetector() {
        onHasMotion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onHandleSensorEvent(SensorEvent event) {
        Logger.i("sensor event is " + event, new Object[0]);
        int type = event.sensor.getType();
        if (type == 1) {
            dealLinearAcceleration(event);
        } else {
            if (type != 18) {
                return;
            }
            dealStepDetector();
        }
    }

    private final void onHasMotion() {
        IDetectorIndicator detectIndicator = getDetectIndicator();
        if (detectIndicator == null) {
            return;
        }
        detectIndicator.onRefresh(getDetectEvent(), 3, 2.0f);
    }

    @Override // com.xiaomi.fitness.sensor.IEventDetector
    public int getDetectEvent() {
        return 1;
    }

    @Override // com.xiaomi.fitness.sensor.AbstractDetector
    public void onRequestRefresh(@NotNull IDetectorIndicator indicator) {
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        SensorManager sensorManager = (SensorManager) this.mContext.getSystemService(SensorManager.class);
        Logger.i(this + " flush sensor event", new Object[0]);
        sensorManager.flush(this.mSensorEventListener);
        if (this.mHasSensor) {
            indicator.onRefresh(getDetectEvent(), 2, 1.0f);
        } else {
            indicator.onRefresh(getDetectEvent(), 0, -1.0f);
        }
    }

    @Override // com.xiaomi.fitness.sensor.AbstractDetector
    public void onStart() {
        this.mWorkHandler = new Handler();
        SensorManager sensorManager = (SensorManager) this.mContext.getSystemService(SensorManager.class);
        this.mHasSensor = false;
        for (int i : this.metaSensors) {
            SensorCompat sensorCompat = SensorCompat.INSTANCE;
            Intrinsics.checkNotNull(sensorManager);
            Sensor defaultSensor = sensorCompat.getDefaultSensor(sensorManager, i, true);
            Logger.i("onStart: the sensor of " + i + " is " + defaultSensor, new Object[0]);
            if (defaultSensor != null) {
                sensorManager.registerListener(this.mSensorEventListener, defaultSensor, getSamplingPeriod(), this.mWorkHandler);
                this.mHasSensor = true;
            }
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
