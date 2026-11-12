package com.huami.device.feature.health.settings;

import com.huami.device.feature.health.device.init.HrModeInit;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.util.HealthExt;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"com/huami/device/feature/health/settings/HrModeSetting$createSet$1", "Lcom/huami/device/feature/health/settings/device/SetToDevice;", "", "data", "", WatchFaceArrivingEvent.CMD_SET, "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class HrModeSetting$createSet$1 implements SetToDevice<Integer> {
    public final /* synthetic */ HrModeSetting a;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.HrModeSetting$createSet$1", f = "HrModeSetting.kt", i = {0, 0}, l = {77}, m = WatchFaceArrivingEvent.CMD_SET, n = {"this", "data"}, s = {"L$0", "I$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return HrModeSetting$createSet$1.this.set(0, this);
        }
    }

    public HrModeSetting$createSet$1(HrModeSetting hrModeSetting) {
        this.a = hrModeSetting;
    }

    @Override // com.huami.device.feature.health.settings.device.SetToDevice
    public /* bridge */ /* synthetic */ Object set(Integer num, Continuation continuation) {
        return set(num.intValue(), (Continuation<? super Boolean>) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public Object set(int i, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        HrModeSetting$createSet$1 hrModeSetting$createSet$1;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.e = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object objRecoverHrSettings = aVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar2.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRecoverHrSettings);
            HrModeSetting.HrSettings hrSettingsG = this.a.g(i);
            HrModeInit hrModeInit = this.a.hrModeInit;
            boolean zF = hrSettingsG.f();
            int freq = this.a.getUserConfig$health_base_release().getFreq();
            boolean zH = hrSettingsG.h();
            boolean zG = hrSettingsG.g();
            boolean zIsSupportAtrial = HealthExt.INSTANCE.isSupportAtrial(this.a.getDevice());
            aVar2.a = this;
            aVar2.b = i;
            aVar2.e = 1;
            objRecoverHrSettings = hrModeInit.recoverHrSettings(zF, freq, zH, zG, zIsSupportAtrial, aVar2);
            if (objRecoverHrSettings == coroutine_suspended) {
                return coroutine_suspended;
            }
            hrModeSetting$createSet$1 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = aVar2.b;
            hrModeSetting$createSet$1 = (HrModeSetting$createSet$1) aVar2.a;
            ResultKt.throwOnFailure(objRecoverHrSettings);
        }
        boolean zBooleanValue = ((Boolean) objRecoverHrSettings).booleanValue();
        if (zBooleanValue) {
            hrModeSetting$createSet$1.a.setData(i);
        }
        return Boxing.boxBoolean(zBooleanValue);
    }
}
