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
@DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingViewModel$initWithController$$inlined$safeLaunch$1", f = "PhoneAlertSettingViewModel.kt", i = {1, 2, 2}, l = {23, 24, 25, 30, 45, 49}, m = "invokeSuspend", n = {"btPhoneViewNeedShow", "btPhoneViewNeedShow", "inComingCallNeedShow"}, s = {"Z$0", "Z$0", "Z$1"})
public final class PhoneAlertSettingViewModel$initWithController$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ IController c;
    public final /* synthetic */ IController d;
    public final /* synthetic */ PhoneAlertSettingViewModel e;
    public boolean f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneAlertSettingViewModel$initWithController$$inlined$safeLaunch$1(Continuation continuation, IController iController, IController iController2, PhoneAlertSettingViewModel phoneAlertSettingViewModel) {
        super(2, continuation);
        this.c = iController;
        this.d = iController2;
        this.e = phoneAlertSettingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PhoneAlertSettingViewModel$initWithController$$inlined$safeLaunch$1 phoneAlertSettingViewModel$initWithController$$inlined$safeLaunch$1 = new PhoneAlertSettingViewModel$initWithController$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e);
        phoneAlertSettingViewModel$initWithController$$inlined$safeLaunch$1.b = obj;
        return phoneAlertSettingViewModel$initWithController$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PhoneAlertSettingViewModel$initWithController$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean zBooleanValue;
        Object objNeedShow;
        boolean z;
        boolean zBooleanValue2;
        SettingType settingType;
        PhoneAlertSettingViewModel phoneAlertSettingViewModel;
        SettingType curSettingType;
        PhoneAlertSettingViewModel phoneAlertSettingViewModel2;
        SettingType curSettingType2;
        PhoneAlertSettingViewModel phoneAlertSettingViewModel3;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        switch (this.a) {
            case 0:
                ResultKt.throwOnFailure(obj);
                IController iController = this.c;
                this.a = 1;
                obj = iController.needShow(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
                IController iController2 = this.d;
                this.f = zBooleanValue;
                this.a = 2;
                objNeedShow = iController2.needShow(this);
                if (objNeedShow == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z = zBooleanValue;
                obj = objNeedShow;
                zBooleanValue2 = ((Boolean) obj).booleanValue();
                IController iController3 = this.c;
                this.f = z;
                this.g = zBooleanValue2;
                this.a = 3;
                obj = iController3.needConditionShow(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) obj).booleanValue()) {
                    this.e.setCurSettingType(SettingType.BtPhone);
                    LiveDataExKt.put(this.e.getShowTypeLiveData(), this.e.getCurSettingType());
                    phoneAlertSettingViewModel2 = this.e;
                    curSettingType2 = phoneAlertSettingViewModel2.getCurSettingType();
                    this.a = 4;
                    if (phoneAlertSettingViewModel2.b(curSettingType2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    PhoneAlertSettingViewModel phoneAlertSettingViewModel4 = this.e;
                    if (z) {
                        settingType = SettingType.BtPhone;
                    } else if (zBooleanValue2) {
                        settingType = SettingType.PhoneAlert;
                    } else {
                        settingType = SettingType.None;
                    }
                    phoneAlertSettingViewModel4.setCurSettingType(settingType);
                    LiveDataExKt.put(this.e.getShowTypeLiveData(), this.e.getCurSettingType());
                    phoneAlertSettingViewModel = this.e;
                    curSettingType = phoneAlertSettingViewModel.getCurSettingType();
                    this.a = 5;
                    if (phoneAlertSettingViewModel.f(curSettingType, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                LiveDataExKt.put(this.e.getShowTypeLiveData(), this.e.getCurSettingType());
                phoneAlertSettingViewModel3 = this.e;
                this.a = 6;
                if (phoneAlertSettingViewModel3.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                IController iController4 = this.d;
                this.f = zBooleanValue;
                this.a = 2;
                objNeedShow = iController4.needShow(this);
                if (objNeedShow == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z = zBooleanValue;
                obj = objNeedShow;
                zBooleanValue2 = ((Boolean) obj).booleanValue();
                IController iController5 = this.c;
                this.f = z;
                this.g = zBooleanValue2;
                this.a = 3;
                obj = iController5.needConditionShow(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) obj).booleanValue()) {
                    this.e.setCurSettingType(SettingType.BtPhone);
                    LiveDataExKt.put(this.e.getShowTypeLiveData(), this.e.getCurSettingType());
                    phoneAlertSettingViewModel2 = this.e;
                    curSettingType2 = phoneAlertSettingViewModel2.getCurSettingType();
                    this.a = 4;
                    if (phoneAlertSettingViewModel2.b(curSettingType2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    PhoneAlertSettingViewModel phoneAlertSettingViewModel5 = this.e;
                    if (z) {
                        settingType = SettingType.BtPhone;
                    } else if (zBooleanValue2) {
                        settingType = SettingType.PhoneAlert;
                    } else {
                        settingType = SettingType.None;
                    }
                    phoneAlertSettingViewModel5.setCurSettingType(settingType);
                    LiveDataExKt.put(this.e.getShowTypeLiveData(), this.e.getCurSettingType());
                    phoneAlertSettingViewModel = this.e;
                    curSettingType = phoneAlertSettingViewModel.getCurSettingType();
                    this.a = 5;
                    if (phoneAlertSettingViewModel.f(curSettingType, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                LiveDataExKt.put(this.e.getShowTypeLiveData(), this.e.getCurSettingType());
                phoneAlertSettingViewModel3 = this.e;
                this.a = 6;
                if (phoneAlertSettingViewModel3.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 2:
                boolean z2 = this.f;
                ResultKt.throwOnFailure(obj);
                z = z2;
                zBooleanValue2 = ((Boolean) obj).booleanValue();
                IController iController6 = this.c;
                this.f = z;
                this.g = zBooleanValue2;
                this.a = 3;
                obj = iController6.needConditionShow(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) obj).booleanValue()) {
                    this.e.setCurSettingType(SettingType.BtPhone);
                    LiveDataExKt.put(this.e.getShowTypeLiveData(), this.e.getCurSettingType());
                    phoneAlertSettingViewModel2 = this.e;
                    curSettingType2 = phoneAlertSettingViewModel2.getCurSettingType();
                    this.a = 4;
                    if (phoneAlertSettingViewModel2.b(curSettingType2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    PhoneAlertSettingViewModel phoneAlertSettingViewModel6 = this.e;
                    if (z) {
                        settingType = SettingType.BtPhone;
                    } else if (zBooleanValue2) {
                        settingType = SettingType.PhoneAlert;
                    } else {
                        settingType = SettingType.None;
                    }
                    phoneAlertSettingViewModel6.setCurSettingType(settingType);
                    LiveDataExKt.put(this.e.getShowTypeLiveData(), this.e.getCurSettingType());
                    phoneAlertSettingViewModel = this.e;
                    curSettingType = phoneAlertSettingViewModel.getCurSettingType();
                    this.a = 5;
                    if (phoneAlertSettingViewModel.f(curSettingType, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                LiveDataExKt.put(this.e.getShowTypeLiveData(), this.e.getCurSettingType());
                phoneAlertSettingViewModel3 = this.e;
                this.a = 6;
                if (phoneAlertSettingViewModel3.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 3:
                zBooleanValue2 = this.g;
                z = this.f;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    this.e.setCurSettingType(SettingType.BtPhone);
                    LiveDataExKt.put(this.e.getShowTypeLiveData(), this.e.getCurSettingType());
                    phoneAlertSettingViewModel2 = this.e;
                    curSettingType2 = phoneAlertSettingViewModel2.getCurSettingType();
                    this.a = 4;
                    if (phoneAlertSettingViewModel2.b(curSettingType2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    PhoneAlertSettingViewModel phoneAlertSettingViewModel7 = this.e;
                    if (z) {
                        settingType = SettingType.BtPhone;
                    } else if (zBooleanValue2) {
                        settingType = SettingType.PhoneAlert;
                    } else {
                        settingType = SettingType.None;
                    }
                    phoneAlertSettingViewModel7.setCurSettingType(settingType);
                    LiveDataExKt.put(this.e.getShowTypeLiveData(), this.e.getCurSettingType());
                    phoneAlertSettingViewModel = this.e;
                    curSettingType = phoneAlertSettingViewModel.getCurSettingType();
                    this.a = 5;
                    if (phoneAlertSettingViewModel.f(curSettingType, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                LiveDataExKt.put(this.e.getShowTypeLiveData(), this.e.getCurSettingType());
                phoneAlertSettingViewModel3 = this.e;
                this.a = 6;
                if (phoneAlertSettingViewModel3.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
                ResultKt.throwOnFailure(obj);
                LiveDataExKt.put(this.e.getShowTypeLiveData(), this.e.getCurSettingType());
                phoneAlertSettingViewModel3 = this.e;
                this.a = 6;
                if (phoneAlertSettingViewModel3.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
