package com.xiaomi.fitness.sleep.behavior.collection.acc;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.xiaomi.fitness.common.handler.JobHandlerProvider;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SensorCompat;
import com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0001(B\u001b\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007JS\u0010\u001b\u001a\u00020\u00162K\u0010\u001c\u001aG\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u000fJ\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0005H\u0002J\u0006\u0010\"\u001a\u00020\u0016J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000RU\u0010\u000e\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/acc/AccCollector;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "mSamplingPeriodUs", "", "<init>", "(Landroid/content/Context;I)V", "mSensorManager", "Landroid/hardware/SensorManager;", "kotlin.jvm.PlatformType", "Landroid/hardware/SensorManager;", "mStarted", "", "mOutputDataCallback", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "x", "y", "z", "", "mLastSensorEventTime", "", "mLastUpdateInsertTime", "mLastUpdateSharedPreference", "startCollect", "callback", "onHandleSensorEvent", "event", "Landroid/hardware/SensorEvent;", "insertUseLessData", "diff", "stopCollect", "onSensorChanged", "onAccuracyChanged", "sensor", "Landroid/hardware/Sensor;", "accuracy", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccCollector implements SensorEventListener {
    private static final int DEFAULT_SAMPLING_PERIOD;
    private static final long DEFAULT_TOLERANCE;
    private static final long MIN_DATA_INTERVAL;

    @NotNull
    private static final String TAG = "AccCollector";
    private static final long UPDATE_INSERT_TIME_INTERVAL;
    private long mLastSensorEventTime;
    private long mLastUpdateInsertTime;
    private long mLastUpdateSharedPreference;

    @Nullable
    private Function3<? super Float, ? super Float, ? super Float, Unit> mOutputDataCallback;
    private final int mSamplingPeriodUs;
    private final SensorManager mSensorManager;
    private boolean mStarted;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        DEFAULT_SAMPLING_PERIOD = (int) timeUnit.toMicros(200L);
        DEFAULT_TOLERANCE = timeUnit.toNanos(500L);
        MIN_DATA_INTERVAL = TimeUnit.SECONDS.toMillis(1L);
        UPDATE_INSERT_TIME_INTERVAL = TimeUnit.MINUTES.toMillis(1L);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AccCollector(@NotNull Context context) {
        this(context, 0, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void insertUseLessData(int diff) {
        if (this.mOutputDataCallback == null || this.mLastUpdateInsertTime == 0 || diff < MIN_DATA_INTERVAL) {
            return;
        }
        int i = diff / 500;
        for (int i2 = 0; i2 < i; i2++) {
            Function3<? super Float, ? super Float, ? super Float, Unit> function3 = this.mOutputDataCallback;
            Intrinsics.checkNotNull(function3);
            function3.invoke(Float.valueOf(100.0f), Float.valueOf(100.0f), Float.valueOf(100.0f));
        }
    }

    private final void onHandleSensorEvent(SensorEvent event) {
        if (Math.abs(event.timestamp - this.mLastSensorEventTime) < DEFAULT_TOLERANCE) {
            return;
        }
        long j = event.timestamp;
        this.mLastSensorEventTime = j;
        long jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.NANOSECONDS.toMillis(j - SystemClock.elapsedRealtimeNanos());
        insertUseLessData((int) (jCurrentTimeMillis - this.mLastUpdateInsertTime));
        if (jCurrentTimeMillis - this.mLastUpdateSharedPreference > UPDATE_INSERT_TIME_INTERVAL || this.mLastUpdateInsertTime == 0) {
            BehaviorConfiguration.INSTANCE.updateLastWriteDataTimeStamp(jCurrentTimeMillis);
            this.mLastUpdateSharedPreference = jCurrentTimeMillis;
        }
        this.mLastUpdateInsertTime = jCurrentTimeMillis;
        Function3<? super Float, ? super Float, ? super Float, Unit> function3 = this.mOutputDataCallback;
        if (function3 != null) {
            Intrinsics.checkNotNull(function3);
            function3.invoke(Float.valueOf(event.values[0]), Float.valueOf(event.values[1]), Float.valueOf(event.values[2]));
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@NotNull Sensor sensor, int accuracy) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        onHandleSensorEvent(event);
    }

    public final void startCollect(@NotNull Function3<? super Float, ? super Float, ? super Float, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.mStarted) {
            return;
        }
        Logger.i(TAG, "startCollect");
        SensorCompat sensorCompat = SensorCompat.INSTANCE;
        SensorManager mSensorManager = this.mSensorManager;
        Intrinsics.checkNotNullExpressionValue(mSensorManager, "mSensorManager");
        Sensor defaultSensor = sensorCompat.getDefaultSensor(mSensorManager, 1, false);
        if (defaultSensor == null) {
            Logger.e(TAG, "no available com.mi.health.snailsleep.collection.acc sensors");
            return;
        }
        this.mStarted = true;
        this.mSensorManager.registerListener(this, defaultSensor, this.mSamplingPeriodUs, JobHandlerProvider.newJobHandler$default(JobHandlerProvider.INSTANCE, null, 1, null).newJob());
        this.mOutputDataCallback = callback;
        this.mLastUpdateInsertTime = BehaviorConfiguration.INSTANCE.getLastWriteDataTimeStamp();
    }

    public final void stopCollect() {
        this.mStarted = false;
        this.mSensorManager.unregisterListener(this);
        BehaviorConfiguration.INSTANCE.cleanLastWriteDataTimeStamp();
    }

    @JvmOverloads
    public AccCollector(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mSamplingPeriodUs = i;
        this.mSensorManager = (SensorManager) context.getSystemService(SensorManager.class);
    }

    public /* synthetic */ AccCollector(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? DEFAULT_SAMPLING_PERIOD : i);
    }
}
