package com.xiaomi.hm.health.device.headset.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel.d;
import com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel.e;
import com.xiaomi.hm.health.device.headset.vo.CervicalProtectionVo;
import com.xiaomi.hm.health.device.headset.vo.CervicalRelaxVo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel$getCervicalProtectionInfo$$inlined$safeLaunch$1", f = "CervicalProtectionViewModel.kt", i = {0}, l = {72, 73}, m = "invokeSuspend", n = {"resultCervicalProtection"}, s = {"L$0"})
public final class CervicalProtectionViewModel$getCervicalProtectionInfo$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ CervicalProtectionViewModel c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CervicalProtectionViewModel$getCervicalProtectionInfo$$inlined$safeLaunch$1(Continuation continuation, CervicalProtectionViewModel cervicalProtectionViewModel) {
        super(2, continuation);
        this.c = cervicalProtectionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CervicalProtectionViewModel$getCervicalProtectionInfo$$inlined$safeLaunch$1 cervicalProtectionViewModel$getCervicalProtectionInfo$$inlined$safeLaunch$1 = new CervicalProtectionViewModel$getCervicalProtectionInfo$$inlined$safeLaunch$1(continuation, this.c);
        cervicalProtectionViewModel$getCervicalProtectionInfo$$inlined$safeLaunch$1.b = obj;
        return cervicalProtectionViewModel$getCervicalProtectionInfo$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CervicalProtectionViewModel$getCervicalProtectionInfo$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Deferred deferredB;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                mutableLiveData = (MutableLiveData) this.d;
                deferredB = (Deferred) this.b;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData2 = (MutableLiveData) this.b;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData2.postValue(new CervicalProtectionVo((Boolean) obj, true));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.b;
        Deferred deferredB2 = e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new e(null), 2, null);
        deferredB = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new d(null), 2, null);
        MutableLiveData mutableLiveData3 = this.c._cervicalRelax;
        this.b = deferredB;
        this.d = mutableLiveData3;
        this.a = 1;
        Object objAwait = deferredB2.await(this);
        if (objAwait == coroutine_suspended) {
            return coroutine_suspended;
        }
        mutableLiveData = mutableLiveData3;
        obj = objAwait;
        mutableLiveData.postValue(new CervicalRelaxVo((Boolean) obj, true));
        MutableLiveData mutableLiveData4 = this.c._cervicalProtection;
        this.b = mutableLiveData4;
        this.d = null;
        this.a = 2;
        Object objAwait2 = deferredB.await(this);
        if (objAwait2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        mutableLiveData2 = mutableLiveData4;
        obj = objAwait2;
        mutableLiveData2.postValue(new CervicalProtectionVo((Boolean) obj, true));
        return Unit.INSTANCE;
    }
}
