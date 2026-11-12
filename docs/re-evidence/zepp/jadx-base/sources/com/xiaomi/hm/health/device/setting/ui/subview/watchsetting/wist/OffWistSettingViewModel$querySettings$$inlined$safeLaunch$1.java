package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wist;

import androidx.p008lifecycle.MutableLiveData;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wist.OffWistSettingViewModel$querySettings$$inlined$safeLaunch$1", f = "OffWistSettingViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
public final class OffWistSettingViewModel$querySettings$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ OffWistSettingViewModel c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffWistSettingViewModel$querySettings$$inlined$safeLaunch$1(Continuation continuation, OffWistSettingViewModel offWistSettingViewModel, boolean z) {
        super(2, continuation);
        this.c = offWistSettingViewModel;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OffWistSettingViewModel$querySettings$$inlined$safeLaunch$1 offWistSettingViewModel$querySettings$$inlined$safeLaunch$1 = new OffWistSettingViewModel$querySettings$$inlined$safeLaunch$1(continuation, this.c, this.d);
        offWistSettingViewModel$querySettings$$inlined$safeLaunch$1.b = obj;
        return offWistSettingViewModel$querySettings$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OffWistSettingViewModel$querySettings$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableLiveData mutableLiveData;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableLiveData mutableLiveData2 = this.c._screenLockAndPassword;
            IWatchSettingRepo iWatchSettingRepoB = this.c.b();
            boolean z = this.d;
            this.b = mutableLiveData2;
            this.a = 1;
            Object objQueryScreenUnlockAndPassword = iWatchSettingRepoB.queryScreenUnlockAndPassword(z, this);
            if (objQueryScreenUnlockAndPassword == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableLiveData = mutableLiveData2;
            obj = objQueryScreenUnlockAndPassword;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.b;
            ResultKt.throwOnFailure(obj);
        }
        mutableLiveData.postValue(obj);
        return Unit.INSTANCE;
    }
}
