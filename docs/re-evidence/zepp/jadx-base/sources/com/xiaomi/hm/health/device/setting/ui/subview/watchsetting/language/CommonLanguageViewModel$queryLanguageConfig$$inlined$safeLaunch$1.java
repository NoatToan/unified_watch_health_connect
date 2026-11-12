package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language;

import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.ICommonLanguageRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.vo.CommonLanguageConfig;
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
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageViewModel$queryLanguageConfig$$inlined$safeLaunch$1", f = "CommonLanguageViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
public final class CommonLanguageViewModel$queryLanguageConfig$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ CommonLanguageViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonLanguageViewModel$queryLanguageConfig$$inlined$safeLaunch$1(Continuation continuation, CommonLanguageViewModel commonLanguageViewModel) {
        super(2, continuation);
        this.c = commonLanguageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CommonLanguageViewModel$queryLanguageConfig$$inlined$safeLaunch$1 commonLanguageViewModel$queryLanguageConfig$$inlined$safeLaunch$1 = new CommonLanguageViewModel$queryLanguageConfig$$inlined$safeLaunch$1(continuation, this.c);
        commonLanguageViewModel$queryLanguageConfig$$inlined$safeLaunch$1.b = obj;
        return commonLanguageViewModel$queryLanguageConfig$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CommonLanguageViewModel$queryLanguageConfig$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CommonLanguageConfig commonLanguageConfig;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ICommonLanguageRepo iCommonLanguageRepo = this.c.com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment.KEY_REPO java.lang.String;
            if (iCommonLanguageRepo == null) {
                commonLanguageConfig = null;
            } else {
                this.a = 1;
                obj = iCommonLanguageRepo.queryLanguageConfig(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (commonLanguageConfig != null) {
                this.c.getLanguageConfigLiveData().postValue(commonLanguageConfig);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        commonLanguageConfig = (CommonLanguageConfig) obj;
        if (commonLanguageConfig != null) {
            this.c.getLanguageConfigLiveData().postValue(commonLanguageConfig);
        }
        return Unit.INSTANCE;
    }
}
