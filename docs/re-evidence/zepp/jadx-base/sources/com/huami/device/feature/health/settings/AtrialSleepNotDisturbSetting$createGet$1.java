package com.huami.device.feature.health.settings;

import com.huami.device.feature.health.device.init.AtrialSleepNotDisturbInit;
import com.huami.device.feature.health.model.HealthSettingData;
import com.huami.device.feature.health.settings.device.ReadFromDevice;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"com/huami/device/feature/health/settings/AtrialSleepNotDisturbSetting$createGet$1", "Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "", "read", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class AtrialSleepNotDisturbSetting$createGet$1 implements ReadFromDevice {
    public final /* synthetic */ AtrialSleepNotDisturbSetting a;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.AtrialSleepNotDisturbSetting$createGet$1", f = "AtrialSleepNotDisturbSetting.kt", i = {0}, l = {49}, m = "read", n = {"this"}, s = {"L$0"})
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
            return AtrialSleepNotDisturbSetting$createGet$1.this.read(this);
        }
    }

    public AtrialSleepNotDisturbSetting$createGet$1(AtrialSleepNotDisturbSetting atrialSleepNotDisturbSetting) {
        this.a = atrialSleepNotDisturbSetting;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.device.feature.health.settings.device.ReadFromDevice
    @Nullable
    public Object read(@NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        AtrialSleepNotDisturbSetting$createGet$1 atrialSleepNotDisturbSetting$createGet$1;
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
        Object obj = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            AtrialSleepNotDisturbInit atrialSleepNotDisturbInit = this.a.initItem;
            aVar.a = this;
            aVar.d = 1;
            obj = atrialSleepNotDisturbInit.get(aVar);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            atrialSleepNotDisturbSetting$createGet$1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atrialSleepNotDisturbSetting$createGet$1 = (AtrialSleepNotDisturbSetting$createGet$1) aVar.a;
            ResultKt.throwOnFailure(obj);
        }
        HealthSettingData healthSettingData = (HealthSettingData) obj;
        if (healthSettingData == null) {
            healthSettingData = null;
        } else {
            atrialSleepNotDisturbSetting$createGet$1.a.setData(((Boolean) healthSettingData.getValue()).booleanValue());
        }
        return Boxing.boxBoolean(healthSettingData != null);
    }
}
