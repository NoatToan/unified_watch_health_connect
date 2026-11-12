package com.huami.bluetooth.profile.channel.module.blood_pressure;

import com.huami.bluetooth.profile.channel.module.blood_pressure.model.BloodPressureCorrectProgress;
import com.huami.bluetooth.profile.channel.module.blood_pressure.model.BloodPressureCorrectStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0004J\u0015\u0010\r\u001a\u0004\u0018\u00010\fH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004J\u001b\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0004J\u001b\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/blood_pressure/BloodPressureApi;", "", "", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "diastolic", "systolic", "", "correct", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryCorrectDate", "Lcom/huami/bluetooth/profile/channel/module/blood_pressure/model/BloodPressureCorrectStatus;", "queryCorrectStatus", "status", "setCorrectStatus", "(Lcom/huami/bluetooth/profile/channel/module/blood_pressure/model/BloodPressureCorrectStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/blood_pressure/model/BloodPressureCorrectProgress;", "queryCorrectProgress", "open", "sendClinicalTrialsStatus", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendCorrectHeartBeat", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface BloodPressureApi {
    @Nullable
    Object correct(int i, int i2, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object queryCorrectDate(@NotNull Continuation<? super Long> continuation);

    @Nullable
    Object queryCorrectProgress(@NotNull Continuation<? super BloodPressureCorrectProgress> continuation);

    @Nullable
    Object queryCorrectStatus(@NotNull Continuation<? super BloodPressureCorrectStatus> continuation);

    @Nullable
    Object queryVersion(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object sendClinicalTrialsStatus(boolean z, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object sendCorrectHeartBeat(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object setCorrectStatus(@NotNull BloodPressureCorrectStatus bloodPressureCorrectStatus, @NotNull Continuation<? super Boolean> continuation);
}
