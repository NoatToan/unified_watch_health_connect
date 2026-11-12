package com.xiaomi.fitness.sensor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sensor/OnEventTask;", "Ljava/lang/Runnable;", "mListener", "Lcom/xiaomi/fitness/sensor/ActionEventListener;", "mEvent", "Lcom/xiaomi/fitness/sensor/ActionSensorEvent;", "<init>", "(Lcom/xiaomi/fitness/sensor/ActionEventListener;Lcom/xiaomi/fitness/sensor/ActionSensorEvent;)V", "run", "", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OnEventTask implements Runnable {

    @NotNull
    private final ActionSensorEvent mEvent;

    @NotNull
    private final ActionEventListener mListener;

    public OnEventTask(@NotNull ActionEventListener mListener, @NotNull ActionSensorEvent mEvent) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(mEvent, "mEvent");
        this.mListener = mListener;
        this.mEvent = mEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.mListener.onEvent(this.mEvent);
    }
}
