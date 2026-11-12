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
@DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingViewModel$tryToOpen$$inlined$safeLaunch$1", f = "PhoneAlertSettingViewModel.kt", i = {0, 0, 1}, l = {28, 29, 37}, m = "invokeSuspend", n = {"wantToShowController", "curController", "curController"}, s = {"L$0", "L$1", "L$0"})
public final class PhoneAlertSettingViewModel$tryToOpen$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ PhoneAlertSettingViewModel c;
    public final /* synthetic */ SettingType d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneAlertSettingViewModel$tryToOpen$$inlined$safeLaunch$1(Continuation continuation, PhoneAlertSettingViewModel phoneAlertSettingViewModel, SettingType settingType) {
        super(2, continuation);
        this.c = phoneAlertSettingViewModel;
        this.d = settingType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PhoneAlertSettingViewModel$tryToOpen$$inlined$safeLaunch$1 phoneAlertSettingViewModel$tryToOpen$$inlined$safeLaunch$1 = new PhoneAlertSettingViewModel$tryToOpen$$inlined$safeLaunch$1(continuation, this.c, this.d);
        phoneAlertSettingViewModel$tryToOpen$$inlined$safeLaunch$1.b = obj;
        return phoneAlertSettingViewModel$tryToOpen$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PhoneAlertSettingViewModel$tryToOpen$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IController iControllerC;
        IController iController;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                iControllerC = (IController) this.e;
                iController = (IController) this.b;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                iControllerC = (IController) this.b;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    PhoneAlertSettingViewModel phoneAlertSettingViewModel = this.c;
                    phoneAlertSettingViewModel.setPreSettingType(phoneAlertSettingViewModel.getCurSettingType());
                    this.c.setCurSettingType(this.d);
                    this.c.checkAuth();
                } else {
                    this.b = null;
                    this.a = 3;
                    if (iControllerC.restore(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LiveDataExKt.put(this.c.getShowTypeLiveData(), this.c.getCurSettingType());
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        LiveDataExKt.put(this.c.getShowTypeLiveData(), this.d);
        IController iControllerC2 = this.c.c(this.d);
        PhoneAlertSettingViewModel phoneAlertSettingViewModel2 = this.c;
        iControllerC = phoneAlertSettingViewModel2.c(phoneAlertSettingViewModel2.getCurSettingType());
        this.b = iControllerC2;
        this.e = iControllerC;
        this.a = 1;
        Object objClose = iControllerC.close(this);
        if (objClose == coroutine_suspended) {
            return coroutine_suspended;
        }
        iController = iControllerC2;
        obj = objClose;
        if (((Boolean) obj).booleanValue()) {
            this.b = iControllerC;
            this.e = null;
            this.a = 2;
            obj = iController.open(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
                PhoneAlertSettingViewModel phoneAlertSettingViewModel3 = this.c;
                phoneAlertSettingViewModel3.setPreSettingType(phoneAlertSettingViewModel3.getCurSettingType());
                this.c.setCurSettingType(this.d);
                this.c.checkAuth();
            } else {
                this.b = null;
                this.a = 3;
                if (iControllerC.restore(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        LiveDataExKt.put(this.c.getShowTypeLiveData(), this.c.getCurSettingType());
        return Unit.INSTANCE;
    }
}
