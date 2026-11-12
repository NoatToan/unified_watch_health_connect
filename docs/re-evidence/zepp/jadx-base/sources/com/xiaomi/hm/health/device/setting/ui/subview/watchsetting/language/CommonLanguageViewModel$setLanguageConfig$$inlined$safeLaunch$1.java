package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language;

import com.huami.devicex.R;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.ICommonLanguageRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.vo.CommonLanguageConfig;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageViewModel$setLanguageConfig$$inlined$safeLaunch$1", f = "CommonLanguageViewModel.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
public final class CommonLanguageViewModel$setLanguageConfig$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ CommonLanguageViewModel c;
    public final /* synthetic */ CommonLanguageConfig d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonLanguageViewModel$setLanguageConfig$$inlined$safeLaunch$1(Continuation continuation, CommonLanguageViewModel commonLanguageViewModel, CommonLanguageConfig commonLanguageConfig) {
        super(2, continuation);
        this.c = commonLanguageViewModel;
        this.d = commonLanguageConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CommonLanguageViewModel$setLanguageConfig$$inlined$safeLaunch$1 commonLanguageViewModel$setLanguageConfig$$inlined$safeLaunch$1 = new CommonLanguageViewModel$setLanguageConfig$$inlined$safeLaunch$1(continuation, this.c, this.d);
        commonLanguageViewModel$setLanguageConfig$$inlined$safeLaunch$1.b = obj;
        return commonLanguageViewModel$setLanguageConfig$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CommonLanguageViewModel$setLanguageConfig$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List<Integer> languageKeys;
        boolean zBooleanValue;
        int currIndex;
        List<Integer> languageKeys2;
        HMDeviceSource deviceSource;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        boolean zBooleanValue2 = false;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, this.c.getLoadingLiveData(), null, 2, null);
            CommonLanguageConfig value = this.c.getLanguageConfigLiveData().getValue();
            if (value != null && (languageKeys = value.getLanguageKeys()) != null) {
                this.d.setLanguageKeys(languageKeys);
            }
            ICommonLanguageRepo iCommonLanguageRepo = this.c.com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment.KEY_REPO java.lang.String;
            if (iCommonLanguageRepo != null) {
                CommonLanguageConfig commonLanguageConfig = this.d;
                this.a = 1;
                obj = iCommonLanguageRepo.setLanguageConfig(commonLanguageConfig, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            zBooleanValue = Boxing.boxBoolean(zBooleanValue2).booleanValue();
            this.c.getResultLiveData().postValue(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                currIndex = this.d.getCurrIndex();
                languageKeys2 = this.d.getLanguageKeys();
                deviceSource = this.c.getDeviceSource();
                if (deviceSource != null) {
                    this.c.e(languageKeys2.get(currIndex).intValue(), deviceSource);
                }
                LoadingVo.INSTANCE.postSuccessMsg(this.c.getLoadingLiveData(), R.string.save_success);
            } else {
                LoadingVo.INSTANCE.postFailMsg(this.c.getLoadingLiveData(), R.string.save_failed);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue2 = bool.booleanValue();
        }
        zBooleanValue = Boxing.boxBoolean(zBooleanValue2).booleanValue();
        this.c.getResultLiveData().postValue(Boxing.boxBoolean(zBooleanValue));
        if (zBooleanValue) {
            currIndex = this.d.getCurrIndex();
            languageKeys2 = this.d.getLanguageKeys();
            deviceSource = this.c.getDeviceSource();
            if (deviceSource != null) {
                this.c.e(languageKeys2.get(currIndex).intValue(), deviceSource);
            }
            LoadingVo.INSTANCE.postSuccessMsg(this.c.getLoadingLiveData(), R.string.save_success);
        } else {
            LoadingVo.INSTANCE.postFailMsg(this.c.getLoadingLiveData(), R.string.save_failed);
        }
        return Unit.INSTANCE;
    }
}
