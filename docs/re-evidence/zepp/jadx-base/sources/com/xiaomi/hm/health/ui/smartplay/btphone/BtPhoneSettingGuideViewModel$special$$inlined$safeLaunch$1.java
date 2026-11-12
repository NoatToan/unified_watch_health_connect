package com.xiaomi.hm.health.ui.smartplay.btphone;

import androidx.p008lifecycle.ViewModelKt;
import com.huami.bluetooth.profile.channel.module.phone.PairStatus;
import com.huami.bluetooth.profile.channel.module.phone.SettingApi;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneSettingGuideViewModel$special$$inlined$safeLaunch$1", f = "BtPhoneSettingGuideViewModel.kt", i = {}, l = {23, 24}, m = "invokeSuspend", n = {}, s = {})
public final class BtPhoneSettingGuideViewModel$special$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ BtPhoneSettingGuideViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtPhoneSettingGuideViewModel$special$$inlined$safeLaunch$1(Continuation continuation, BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel) {
        super(2, continuation);
        this.c = btPhoneSettingGuideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BtPhoneSettingGuideViewModel$special$$inlined$safeLaunch$1 btPhoneSettingGuideViewModel$special$$inlined$safeLaunch$1 = new BtPhoneSettingGuideViewModel$special$$inlined$safeLaunch$1(continuation, this.c);
        btPhoneSettingGuideViewModel$special$$inlined$safeLaunch$1.b = obj;
        return btPhoneSettingGuideViewModel$special$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BtPhoneSettingGuideViewModel$special$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                btPhoneSettingGuideViewModel = (BtPhoneSettingGuideViewModel) this.b;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CompletableDeferred completableDeferred = this.c.initDeferred;
            Unit unit = Unit.INSTANCE;
            completableDeferred.complete(unit);
            return unit;
        }
        ResultKt.throwOnFailure(obj);
        btPhoneSettingGuideViewModel = this.c;
        BtPhoneDevice btPhoneDevice = BtPhoneDevice.INSTANCE;
        this.b = btPhoneSettingGuideViewModel;
        this.a = 1;
        obj = btPhoneDevice.getBtDeviceApi(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        btPhoneSettingGuideViewModel.btPhoneApi = (SettingApi) obj;
        SettingApi settingApi = this.c.btPhoneApi;
        if (settingApi != null) {
            final BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel2 = this.c;
            Function1<PairStatus, Unit> function1 = new Function1<PairStatus, Unit>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneSettingGuideViewModel$1$1
                {
                    super(1);
                }

                public final void a(@NotNull PairStatus pairStatus) {
                    e.f(ViewModelKt.getViewModelScope(btPhoneSettingGuideViewModel2), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new BtPhoneSettingGuideViewModel$1$1$invoke$$inlined$safeLaunch$1(null, btPhoneSettingGuideViewModel2, pairStatus), 2, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PairStatus pairStatus) {
                    a(pairStatus);
                    return Unit.INSTANCE;
                }
            };
            this.b = null;
            this.a = 2;
            if (settingApi.registerPairStatus(true, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        CompletableDeferred completableDeferred2 = this.c.initDeferred;
        Unit unit2 = Unit.INSTANCE;
        completableDeferred2.complete(unit2);
        return unit2;
    }
}
