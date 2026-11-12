package com.huami.device.feature.health.device.blood_pressure;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0004\u0018\u00010\bH¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\nJ\u0013\u0010\u0013\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/huami/device/feature/health/device/blood_pressure/IBloodPressureApi;", "", "", "diastolic", "systolic", "", "correct", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryCorrectDate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectWatchStatus;", "queryCorrectStatus", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus;", "status", "setCorrectStatus", "(Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectProgress;", "queryCorrectProgress", "sendCorrectHeartBeat", "health-base_release"}, k = 1, mv = {1, 5, 1})
public interface IBloodPressureApi {
    @Nullable
    Object correct(int i, int i2, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object queryCorrectDate(@NotNull Continuation<? super Long> continuation);

    @Nullable
    Object queryCorrectProgress(@NotNull Continuation<? super BloodPressureCorrectProgress> continuation);

    @Nullable
    Object queryCorrectStatus(@NotNull Continuation<? super BloodPressureCorrectWatchStatus> continuation);

    @Nullable
    Object sendCorrectHeartBeat(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object setCorrectStatus(@NotNull BloodPressureCorrectStatus bloodPressureCorrectStatus, @NotNull Continuation<? super Boolean> continuation);
}
