package com.huami.device.feature.health.settings;

import com.huami.device.feature.health.device.blood_pressure.IBloodPressureApi;
import com.huami.device.feature.health.settings.device.ReadFromDevice;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"com/huami/device/feature/health/settings/BloodPressureSetting$createGet$1", "Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "", "read", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureSetting$createGet$1 implements ReadFromDevice {
    public final /* synthetic */ BloodPressureSetting a;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.BloodPressureSetting$createGet$1", f = "BloodPressureSetting.kt", i = {0}, l = {39}, m = "read", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BloodPressureSetting$createGet$1.this.read(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Long l) {
            super(0);
            this.a = l;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "query blood pressure correct time: " + this.a;
        }
    }

    public BloodPressureSetting$createGet$1(BloodPressureSetting bloodPressureSetting) {
        this.a = bloodPressureSetting;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.device.feature.health.settings.device.ReadFromDevice
    @Nullable
    public Object read(@NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        BloodPressureSetting$createGet$1 bloodPressureSetting$createGet$1;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objQueryCorrectDate = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryCorrectDate);
            IBloodPressureApi bloodPressureApi = this.a.getBloodPressureInit().getBloodPressureApi();
            aVar.a = this;
            aVar.d = 1;
            objQueryCorrectDate = bloodPressureApi.queryCorrectDate(aVar);
            if (objQueryCorrectDate == coroutine_suspended) {
                return coroutine_suspended;
            }
            bloodPressureSetting$createGet$1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bloodPressureSetting$createGet$1 = (BloodPressureSetting$createGet$1) aVar.a;
            ResultKt.throwOnFailure(objQueryCorrectDate);
        }
        Long l = (Long) objQueryCorrectDate;
        HMLog.info("BloodPressureSetting", new b(l));
        if (l != null) {
            bloodPressureSetting$createGet$1.a.setData(l.longValue());
        }
        return Boxing.boxBoolean(l != null);
    }
}
