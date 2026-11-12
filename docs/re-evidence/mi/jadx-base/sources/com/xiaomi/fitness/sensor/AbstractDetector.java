package com.xiaomi.fitness.sensor;

import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\fH$J\b\u0010\u0014\u001a\u00020\fH$J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sensor/AbstractDetector;", "Lcom/xiaomi/fitness/sensor/IEventDetector;", "<init>", "()V", "value", "Lcom/xiaomi/fitness/sensor/IDetectorIndicator;", "detectIndicator", "getDetectIndicator", "()Lcom/xiaomi/fitness/sensor/IDetectorIndicator;", "mStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onAttach", "", "indicator", "requestRefresh", "onDetach", "isStarted", "", "()Z", LifecycleConstantKt.ON_START, LifecycleConstantKt.ON_STOP, "onRequestRefresh", "samplingPeriod", "", "getSamplingPeriod", "()I", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbstractDetector implements IEventDetector {

    @Nullable
    private IDetectorIndicator detectIndicator;

    @NotNull
    private final AtomicBoolean mStarted = new AtomicBoolean();

    @Nullable
    public final IDetectorIndicator getDetectIndicator() {
        return this.detectIndicator;
    }

    @Override // com.xiaomi.fitness.sensor.IEventDetector
    public int getSamplingPeriod() {
        return (int) TimeUnit.MILLISECONDS.toMicros(500L);
    }

    public final boolean isStarted() {
        return this.mStarted.get();
    }

    @Override // com.xiaomi.fitness.sensor.IEventDetector
    public void onAttach(@NotNull IDetectorIndicator indicator) {
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        if (this.detectIndicator != null) {
            Logger.i("Detector already attached", new Object[0]);
            return;
        }
        if (this.mStarted.compareAndSet(false, true)) {
            this.detectIndicator = indicator;
            Logger.i(this + " start detect", new Object[0]);
            onStart();
        }
    }

    @Override // com.xiaomi.fitness.sensor.IEventDetector
    public void onDetach() {
        if (this.mStarted.compareAndSet(true, false)) {
            this.detectIndicator = null;
            onStop();
        }
    }

    public abstract void onRequestRefresh(@NotNull IDetectorIndicator indicator);

    public abstract void onStart();

    public abstract void onStop();

    @Override // com.xiaomi.fitness.sensor.IEventDetector
    public void requestRefresh() {
        IDetectorIndicator iDetectorIndicator = this.detectIndicator;
        if (iDetectorIndicator == null || !this.mStarted.get()) {
            return;
        }
        onRequestRefresh(iDetectorIndicator);
    }
}
