package com.xiaomi.hm.health.device.health.device;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huami.bluetooth.profile.channel.module.blood_pressure.BloodPressureApi;
import com.huami.bluetooth.profile.channel.module.blood_pressure.model.BloodPressureCorrectStatus;
import com.huami.device.feature.health.device.blood_pressure.BloodPressureCorrectProgress;
import com.huami.device.feature.health.device.blood_pressure.BloodPressureCorrectWatchStatus;
import com.huami.device.feature.health.device.blood_pressure.IBloodPressureApi;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\nJ\u0013\u0010\u000f\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\nJ\u001b\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"com/xiaomi/hm/health/device/health/device/HealthDetectInitFactory$getBloodPressureInit$1$bloodPressureApi$1", "Lcom/huami/device/feature/health/device/blood_pressure/IBloodPressureApi;", "", "diastolic", "systolic", "", "correct", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryCorrectDate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectProgress;", "queryCorrectProgress", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectWatchStatus;", "queryCorrectStatus", "sendCorrectHeartBeat", "Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus;", "status", "setCorrectStatus", "(Lcom/huami/device/feature/health/device/blood_pressure/BloodPressureCorrectStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/blood_pressure/BloodPressureApi;", "a", "Lcom/huami/bluetooth/profile/channel/module/blood_pressure/BloodPressureApi;", "getApi", "()Lcom/huami/bluetooth/profile/channel/module/blood_pressure/BloodPressureApi;", "api", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDetectInitFactory$getBloodPressureInit$1$bloodPressureApi$1 implements IBloodPressureApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final BloodPressureApi api;
    public final /* synthetic */ HMMiLiDevice b;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getBloodPressureInit$1$bloodPressureApi$1", f = "HealthDetectInitFactory.kt", i = {}, l = {TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS}, m = "correct", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return HealthDetectInitFactory$getBloodPressureInit$1$bloodPressureApi$1.this.correct(0, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getBloodPressureInit$1$bloodPressureApi$1", f = "HealthDetectInitFactory.kt", i = {}, l = {618}, m = "queryCorrectProgress", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return HealthDetectInitFactory$getBloodPressureInit$1$bloodPressureApi$1.this.queryCorrectProgress(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getBloodPressureInit$1$bloodPressureApi$1", f = "HealthDetectInitFactory.kt", i = {}, l = {624}, m = "queryCorrectStatus", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return HealthDetectInitFactory$getBloodPressureInit$1$bloodPressureApi$1.this.queryCorrectStatus(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getBloodPressureInit$1$bloodPressureApi$1", f = "HealthDetectInitFactory.kt", i = {}, l = {635}, m = "sendCorrectHeartBeat", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return HealthDetectInitFactory$getBloodPressureInit$1$bloodPressureApi$1.this.sendCorrectHeartBeat(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getBloodPressureInit$1$bloodPressureApi$1", f = "HealthDetectInitFactory.kt", i = {}, l = {645}, m = "setCorrectStatus", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return HealthDetectInitFactory$getBloodPressureInit$1$bloodPressureApi$1.this.setCorrectStatus(null, this);
        }
    }

    public HealthDetectInitFactory$getBloodPressureInit$1$bloodPressureApi$1(HMMiLiDevice hMMiLiDevice) {
        this.b = hMMiLiDevice;
        this.api = hMMiLiDevice.getBloodPressureApi();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.device.feature.health.device.blood_pressure.IBloodPressureApi
    @Nullable
    public Object correct(int i, int i2, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i3 = aVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.c = i3 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objCorrect = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = aVar.c;
        boolean z = false;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objCorrect);
            BloodPressureApi api = getApi();
            if (api != null) {
                aVar.c = 1;
                objCorrect = api.correct(i, i2, aVar);
                if (objCorrect == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(z);
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objCorrect);
        if (((Boolean) objCorrect).booleanValue()) {
            z = true;
        }
        return Boxing.boxBoolean(z);
    }

    @Nullable
    public final BloodPressureApi getApi() {
        return this.api;
    }

    @Override // com.huami.device.feature.health.device.blood_pressure.IBloodPressureApi
    @Nullable
    public Object queryCorrectDate(@NotNull Continuation<? super Long> continuation) {
        BloodPressureApi api = getApi();
        if (api == null) {
            return null;
        }
        return api.queryCorrectDate(continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.device.feature.health.device.blood_pressure.IBloodPressureApi
    @Nullable
    public Object queryCorrectProgress(@NotNull Continuation<? super BloodPressureCorrectProgress> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objQueryCorrectProgress = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryCorrectProgress);
            BloodPressureApi api = getApi();
            if (api == null) {
                return null;
            }
            bVar.c = 1;
            objQueryCorrectProgress = api.queryCorrectProgress(bVar);
            if (objQueryCorrectProgress == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objQueryCorrectProgress);
        }
        com.huami.bluetooth.profile.channel.module.blood_pressure.model.BloodPressureCorrectProgress bloodPressureCorrectProgress = (com.huami.bluetooth.profile.channel.module.blood_pressure.model.BloodPressureCorrectProgress) objQueryCorrectProgress;
        if (bloodPressureCorrectProgress == null) {
            return null;
        }
        return new BloodPressureCorrectProgress(bloodPressureCorrectProgress.getStatus(), bloodPressureCorrectProgress.getProgress());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.device.feature.health.device.blood_pressure.IBloodPressureApi
    @Nullable
    public Object queryCorrectStatus(@NotNull Continuation<? super BloodPressureCorrectWatchStatus> continuation) {
        c cVar;
        Object obj;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.c = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objQueryCorrectStatus = cVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryCorrectStatus);
            BloodPressureApi api = getApi();
            if (api == null) {
                return null;
            }
            cVar.c = 1;
            objQueryCorrectStatus = api.queryCorrectStatus(cVar);
            if (objQueryCorrectStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objQueryCorrectStatus);
        }
        BloodPressureCorrectStatus bloodPressureCorrectStatus = (BloodPressureCorrectStatus) objQueryCorrectStatus;
        if (bloodPressureCorrectStatus == null) {
            return null;
        }
        if (Intrinsics.areEqual(bloodPressureCorrectStatus, BloodPressureCorrectStatus.IDEL.INSTANCE)) {
            obj = BloodPressureCorrectWatchStatus.IDEL.INSTANCE;
        } else if (Intrinsics.areEqual(bloodPressureCorrectStatus, BloodPressureCorrectStatus.PREPARE.INSTANCE)) {
            obj = BloodPressureCorrectWatchStatus.PREPARE.INSTANCE;
        } else if (Intrinsics.areEqual(bloodPressureCorrectStatus, BloodPressureCorrectStatus.CORRECTING.INSTANCE)) {
            obj = BloodPressureCorrectWatchStatus.CORRECTING.INSTANCE;
        } else {
            if (!Intrinsics.areEqual(bloodPressureCorrectStatus, BloodPressureCorrectStatus.FINISH.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = BloodPressureCorrectWatchStatus.SUCCESS.INSTANCE;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.device.feature.health.device.blood_pressure.IBloodPressureApi
    @Nullable
    public Object sendCorrectHeartBeat(@NotNull Continuation<? super Boolean> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.c = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objSendCorrectHeartBeat = dVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.c;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendCorrectHeartBeat);
            BloodPressureApi api = getApi();
            if (api != null) {
                dVar.c = 1;
                objSendCorrectHeartBeat = api.sendCorrectHeartBeat(dVar);
                if (objSendCorrectHeartBeat == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objSendCorrectHeartBeat);
        if (((Boolean) objSendCorrectHeartBeat).booleanValue()) {
            z = true;
        }
        return Boxing.boxBoolean(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.device.feature.health.device.blood_pressure.IBloodPressureApi
    @Nullable
    public Object setCorrectStatus(@NotNull com.huami.device.feature.health.device.blood_pressure.BloodPressureCorrectStatus bloodPressureCorrectStatus, @NotNull Continuation<? super Boolean> continuation) {
        e eVar;
        BloodPressureCorrectStatus bloodPressureCorrectStatus2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.c = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object correctStatus = eVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar.c;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(correctStatus);
            if (Intrinsics.areEqual(bloodPressureCorrectStatus, com.huami.device.feature.health.device.blood_pressure.BloodPressureCorrectStatus.IDEL.INSTANCE)) {
                bloodPressureCorrectStatus2 = BloodPressureCorrectStatus.IDEL.INSTANCE;
            } else if (Intrinsics.areEqual(bloodPressureCorrectStatus, com.huami.device.feature.health.device.blood_pressure.BloodPressureCorrectStatus.PREPARE.INSTANCE)) {
                bloodPressureCorrectStatus2 = BloodPressureCorrectStatus.PREPARE.INSTANCE;
            } else if (Intrinsics.areEqual(bloodPressureCorrectStatus, com.huami.device.feature.health.device.blood_pressure.BloodPressureCorrectStatus.CORRECTING.INSTANCE)) {
                bloodPressureCorrectStatus2 = BloodPressureCorrectStatus.CORRECTING.INSTANCE;
            } else {
                if (!Intrinsics.areEqual(bloodPressureCorrectStatus, com.huami.device.feature.health.device.blood_pressure.BloodPressureCorrectStatus.FINISH.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                bloodPressureCorrectStatus2 = BloodPressureCorrectStatus.FINISH.INSTANCE;
            }
            BloodPressureApi api = getApi();
            if (api != null) {
                eVar.c = 1;
                correctStatus = api.setCorrectStatus(bloodPressureCorrectStatus2, eVar);
                if (correctStatus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(correctStatus);
        if (((Boolean) correctStatus).booleanValue()) {
            z = true;
        }
        return Boxing.boxBoolean(z);
    }
}
