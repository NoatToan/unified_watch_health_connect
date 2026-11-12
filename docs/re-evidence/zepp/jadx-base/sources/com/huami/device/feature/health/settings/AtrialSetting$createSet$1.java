package com.huami.device.feature.health.settings;

import com.huami.device.feature.health.device.init.AtrialSettingInit;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001b\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"com/huami/device/feature/health/settings/AtrialSetting$createSet$1", "Lcom/huami/device/feature/health/settings/device/SetToDevice;", "", "data", WatchFaceArrivingEvent.CMD_SET, "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class AtrialSetting$createSet$1 implements SetToDevice<Boolean> {
    public final /* synthetic */ AtrialSetting a;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.AtrialSetting$createSet$1", f = "AtrialSetting.kt", i = {0, 0}, l = {34}, m = WatchFaceArrivingEvent.CMD_SET, n = {"this", "data"}, s = {"L$0", "Z$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public boolean b;
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
            return AtrialSetting$createSet$1.this.set(false, (Continuation<? super Boolean>) this);
        }
    }

    public AtrialSetting$createSet$1(AtrialSetting atrialSetting) {
        this.a = atrialSetting;
    }

    @Override // com.huami.device.feature.health.settings.device.SetToDevice
    public /* bridge */ /* synthetic */ Object set(Boolean bool, Continuation continuation) {
        return set(bool.booleanValue(), (Continuation<? super Boolean>) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public Object set(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        AtrialSetting$createSet$1 atrialSetting$createSet$1;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            AtrialSettingInit atrialSettingInit = this.a.atrialInit;
            aVar.a = this;
            aVar.b = z;
            aVar.e = 1;
            obj = atrialSettingInit.set(z, aVar);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            atrialSetting$createSet$1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = aVar.b;
            atrialSetting$createSet$1 = (AtrialSetting$createSet$1) aVar.a;
            ResultKt.throwOnFailure(obj);
        }
        AtrialSetting atrialSetting = atrialSetting$createSet$1.a;
        if (((Boolean) obj).booleanValue()) {
            atrialSetting.setData(z);
        }
        return obj;
    }
}
