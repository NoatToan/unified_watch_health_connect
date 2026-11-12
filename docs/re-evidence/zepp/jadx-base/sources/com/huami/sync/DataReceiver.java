package com.huami.sync;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.companion.dataflow.Constant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\u000e\u001a\u0004\u0018\u00010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R?\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR?\u0010!\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001c¨\u0006$"}, d2 = {"Lcom/huami/sync/DataReceiver;", "", "", "time", "", "a", "Lcom/huami/sync/Step;", "step", "", "notifyStepReceived", "Lcom/huami/sync/HeartRate;", Constant.KEY_HR_VALUE, "notifyHeartRateReceived", "Lcom/huami/sync/TransmissionJob;", "generateJob", "Lcom/huami/sync/Step;", "currentStep", "b", "Lcom/huami/sync/HeartRate;", "currentHeartRate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "c", "Lkotlin/jvm/functions/Function1;", "getOnStepUpdate$realtime_transmission_release", "()Lkotlin/jvm/functions/Function1;", "setOnStepUpdate$realtime_transmission_release", "(Lkotlin/jvm/functions/Function1;)V", "onStepUpdate", GoogleApiAvailabilityLight.a, "getOnHeartRateUpdate$realtime_transmission_release", "setOnHeartRateUpdate$realtime_transmission_release", "onHeartRateUpdate", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class DataReceiver {

    @NotNull
    public static final DataReceiver INSTANCE = new DataReceiver();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static Step currentStep;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static HeartRate currentHeartRate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static Function1<? super Step, Unit> onStepUpdate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private static Function1<? super HeartRate, Unit> onHeartRateUpdate;

    private DataReceiver() {
    }

    private final boolean a(long time) {
        return System.currentTimeMillis() - time <= Config.INSTANCE.getPollPeriod();
    }

    @Nullable
    public final TransmissionJob generateJob() {
        long steps;
        long calories;
        long time;
        boolean z;
        long j;
        long j2;
        long j3;
        int i;
        Step step = currentStep;
        boolean z2 = true;
        int heartRate = 0;
        long time2 = 0;
        if (step == null) {
            j2 = 0;
            j3 = 0;
            j = 0;
            z = false;
        } else {
            if (INSTANCE.a(step.getTime())) {
                steps = step.getSteps();
                calories = step.getCalories();
                time = step.getTime();
                z = true;
            } else {
                steps = 0;
                calories = 0;
                time = 0;
                z = false;
            }
            j = calories;
            long j4 = steps;
            j2 = time;
            j3 = j4;
        }
        HeartRate heartRate2 = currentHeartRate;
        if (heartRate2 == null) {
            i = 0;
        } else {
            if (INSTANCE.a(heartRate2.getTime())) {
                heartRate = heartRate2.getHeartRate();
                time2 = heartRate2.getTime();
            } else {
                z2 = z;
            }
            z = z2;
            i = heartRate;
        }
        if (!z) {
            return null;
        }
        TransmissionJob transmissionJob = new TransmissionJob(Math.max(j2, time2), i, j3, j, null, 16, null);
        transmissionJob.tag(TransmissionJob.TAG);
        return transmissionJob;
    }

    @Nullable
    public final Function1<HeartRate, Unit> getOnHeartRateUpdate$realtime_transmission_release() {
        return onHeartRateUpdate;
    }

    @Nullable
    public final Function1<Step, Unit> getOnStepUpdate$realtime_transmission_release() {
        return onStepUpdate;
    }

    public final void notifyHeartRateReceived(@NotNull HeartRate heartRate) {
        currentHeartRate = heartRate;
        Function1<? super HeartRate, Unit> function1 = onHeartRateUpdate;
        if (function1 == null) {
            return;
        }
        function1.invoke(heartRate);
    }

    public final void notifyStepReceived(@NotNull Step step) {
        currentStep = step;
        Function1<? super Step, Unit> function1 = onStepUpdate;
        if (function1 == null) {
            return;
        }
        function1.invoke(step);
    }

    public final void setOnHeartRateUpdate$realtime_transmission_release(@Nullable Function1<? super HeartRate, Unit> function1) {
        onHeartRateUpdate = function1;
    }

    public final void setOnStepUpdate$realtime_transmission_release(@Nullable Function1<? super Step, Unit> function1) {
        onStepUpdate = function1;
    }
}
