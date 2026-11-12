package com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting;

import com.xiaomi.hm.health.utils.ex.LiveDataExKt;
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

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingViewModel$SubSettingListener$onOpenFailed$$inlined$safeLaunch$1", f = "PhoneAlertSettingViewModel.kt", i = {}, l = {24, 26}, m = "invokeSuspend", n = {}, s = {})
public final class PhoneAlertSettingViewModel$SubSettingListener$onOpenFailed$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ PhoneAlertSettingViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneAlertSettingViewModel$SubSettingListener$onOpenFailed$$inlined$safeLaunch$1(Continuation continuation, PhoneAlertSettingViewModel phoneAlertSettingViewModel) {
        super(2, continuation);
        this.c = phoneAlertSettingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PhoneAlertSettingViewModel$SubSettingListener$onOpenFailed$$inlined$safeLaunch$1 phoneAlertSettingViewModel$SubSettingListener$onOpenFailed$$inlined$safeLaunch$1 = new PhoneAlertSettingViewModel$SubSettingListener$onOpenFailed$$inlined$safeLaunch$1(continuation, this.c);
        phoneAlertSettingViewModel$SubSettingListener$onOpenFailed$$inlined$safeLaunch$1.b = obj;
        return phoneAlertSettingViewModel$SubSettingListener$onOpenFailed$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PhoneAlertSettingViewModel$SubSettingListener$onOpenFailed$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PhoneAlertSettingViewModel phoneAlertSettingViewModel = this.c;
            SettingType settingType = SettingType.None;
            phoneAlertSettingViewModel.setPreSettingType(settingType);
            this.c.setCurSettingType(settingType);
            LiveDataExKt.put(this.c.getShowTypeLiveData(), this.c.getCurSettingType());
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        PhoneAlertSettingViewModel phoneAlertSettingViewModel2 = this.c;
        IController iControllerC = phoneAlertSettingViewModel2.c(phoneAlertSettingViewModel2.getPreSettingType());
        this.a = 1;
        obj = iControllerC.restore(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (((Boolean) obj).booleanValue()) {
            PhoneAlertSettingViewModel phoneAlertSettingViewModel3 = this.c;
            phoneAlertSettingViewModel3.setCurSettingType(phoneAlertSettingViewModel3.getPreSettingType());
            this.c.setPreSettingType(SettingType.None);
            this.c.checkAuth();
        } else {
            IController iControllerC2 = this.c.c(SettingType.None);
            this.a = 2;
            if (iControllerC2.restore(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            PhoneAlertSettingViewModel phoneAlertSettingViewModel4 = this.c;
            SettingType settingType2 = SettingType.None;
            phoneAlertSettingViewModel4.setPreSettingType(settingType2);
            this.c.setCurSettingType(settingType2);
        }
        LiveDataExKt.put(this.c.getShowTypeLiveData(), this.c.getCurSettingType());
        return Unit.INSTANCE;
    }
}
