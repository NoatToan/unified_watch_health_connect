package com.xiaomi.hm.health.device.headset.viewmodel;

import com.xiaomi.hm.health.bt.device.MozartDevice;
import com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel.g;
import com.xiaomi.hm.health.device.headset.vo.CervicalProtectionVo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel$setCervicalProtection$$inlined$safeLaunch$1", f = "CervicalProtectionViewModel.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
public final class CervicalProtectionViewModel$setCervicalProtection$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ CervicalProtectionViewModel c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CervicalProtectionViewModel$setCervicalProtection$$inlined$safeLaunch$1(Continuation continuation, CervicalProtectionViewModel cervicalProtectionViewModel, boolean z) {
        super(2, continuation);
        this.c = cervicalProtectionViewModel;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CervicalProtectionViewModel$setCervicalProtection$$inlined$safeLaunch$1 cervicalProtectionViewModel$setCervicalProtection$$inlined$safeLaunch$1 = new CervicalProtectionViewModel$setCervicalProtection$$inlined$safeLaunch$1(continuation, this.c, this.d);
        cervicalProtectionViewModel$setCervicalProtection$$inlined$safeLaunch$1.b = obj;
        return cervicalProtectionViewModel$setCervicalProtection$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CervicalProtectionViewModel$setCervicalProtection$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Boolean boolBoxBoolean;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MozartDevice mozartDevice = (MozartDevice) this.c.e();
            boolean zBooleanValue = (mozartDevice == null || (boolBoxBoolean = Boxing.boxBoolean(mozartDevice.setCervicalProtection(this.d))) == null) ? false : boolBoxBoolean.booleanValue();
            if (zBooleanValue) {
                CervicalProtectionVo cervicalProtectionVo = (CervicalProtectionVo) this.c._cervicalProtection.getValue();
                if (cervicalProtectionVo != null) {
                    cervicalProtectionVo.setCervicalProtection(Boxing.boxBoolean(this.d));
                }
            } else {
                CervicalProtectionVo cervicalProtectionVo2 = (CervicalProtectionVo) this.c._cervicalProtection.getValue();
                this.c._cervicalProtection.postValue(cervicalProtectionVo2 == null ? null : CervicalProtectionVo.copy$default(cervicalProtectionVo2, null, false, 3, null));
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            CervicalProtectionViewModel.g gVar = this.c.new g(zBooleanValue, null);
            this.a = 1;
            if (BuildersKt.withContext(main, gVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
