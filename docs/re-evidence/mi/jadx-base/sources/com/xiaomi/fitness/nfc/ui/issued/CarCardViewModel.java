package com.xiaomi.fitness.nfc.ui.issued;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.nfc.bean.CardSwitcherBean;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.CarCardViewModel;
import defpackage.bg4;
import defpackage.fmg;
import defpackage.jz6;
import defpackage.na4;
import defpackage.o0j;
import defpackage.o4h;
import defpackage.s3q;
import defpackage.vqg;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b+\u0010,J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u0012\u0010\u0011J5\u0010\u0013\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R!\u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CarCardViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "Lkotlin/Function1;", "success", "", "fail", "updateCard", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "setDefailtCard", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "removeCard", "getDefaultAid", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "supportCallback", "loadCardSwitchList", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/nfc/bean/CardSwitcherBean;", "cardSwitchRet$delegate", "Lkotlin/Lazy;", "getCardSwitchRet", "()Landroidx/lifecycle/MutableLiveData;", "cardSwitchRet", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CarCardViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: renamed from: cardSwitchRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardSwitchRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rk3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CarCardViewModel.cardSwitchRet_delegate$lambda$16();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.CarCardViewModel$loadCardSwitchList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.CarCardViewModel$loadCardSwitchList$1", f = "CarCardViewModel.kt", i = {}, l = {109, 115}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ Function1<Boolean, Unit> $supportCallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Boolean, Unit> function1, CardWrapper cardWrapper, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$supportCallback = function1;
            this.$cardWrapper = cardWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CarCardViewModel.this.new AnonymousClass1(this.$supportCallback, this.$cardWrapper, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0057 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:6:0x0010, B:21:0x0053, B:23:0x0057, B:24:0x0060, B:18:0x003f), top: B:30:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CardSwitcherBean cardSwitcherBean;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    cardSwitcherBean = (CardSwitcherBean) obj;
                    if (cardSwitcherBean != null) {
                        CarCardViewModel.this.getCardSwitchRet().postValue(cardSwitcherBean);
                    }
                    this.$supportCallback.invoke2(Boxing.boxBoolean(true));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                CarCardViewModel$loadCardSwitchList$1$isSupport$1 carCardViewModel$loadCardSwitchList$1$isSupport$1 = new CarCardViewModel$loadCardSwitchList$1$isSupport$1(null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, carCardViewModel$loadCardSwitchList$1$isSupport$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) obj).booleanValue()) {
                    CoroutineDispatcher io3 = Dispatchers.getIO();
                    CarCardViewModel$loadCardSwitchList$1$cardSwitcherTime$1 carCardViewModel$loadCardSwitchList$1$cardSwitcherTime$1 = new CarCardViewModel$loadCardSwitchList$1$cardSwitcherTime$1(this.$cardWrapper, null);
                    this.label = 2;
                    obj = BuildersKt.withContext(io3, carCardViewModel$loadCardSwitchList$1$cardSwitcherTime$1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cardSwitcherBean = (CardSwitcherBean) obj;
                    if (cardSwitcherBean != null) {
                        CarCardViewModel.this.getCardSwitchRet().postValue(cardSwitcherBean);
                    }
                    this.$supportCallback.invoke2(Boxing.boxBoolean(true));
                } else {
                    this.$supportCallback.invoke2(Boxing.boxBoolean(false));
                }
            } catch (Exception e) {
                vqg.c("isSupportCardSwitch", e);
                e.printStackTrace();
                this.$supportCallback.invoke2(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData cardSwitchRet_delegate$lambda$16() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDefaultAid$lambda$12(Function1 success, String str) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNull(str);
        success.invoke2(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDefaultAid$lambda$13(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDefaultAid$lambda$14(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("defaultCard", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDefaultAid$lambda$15(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeCard$lambda$10(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("deleteCard", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeCard$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeCard$lambda$8(Function0 success, Function1 fail, BaseResponse baseResponse) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        if (baseResponse.isSuccess()) {
            success.invoke();
        } else {
            String string = !TextUtils.isEmpty(baseResponse.mMsg) ? baseResponse.mMsg : ResourceExtKt.getString(o0j.o4);
            Intrinsics.checkNotNull(string);
            fail.invoke2(string);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeCard$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDefailtCard$lambda$4(Function0 success, Function1 fail, Boolean bool) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        if (bool.booleanValue()) {
            success.invoke();
        } else {
            String string = AppUtil.getApp().getString(o0j.common_hint_unkonwn_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            fail.invoke2(string);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDefailtCard$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDefailtCard$lambda$6(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("setDefaultCard", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDefailtCard$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$0(Function1 success, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNull(cardWrapper);
        success.invoke2(cardWrapper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$2(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("updateCard", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final MutableLiveData<CardSwitcherBean> getCardSwitchRet() {
        return (MutableLiveData) this.cardSwitchRet.getValue();
    }

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void getDefaultAid(@NotNull final Function1<? super String, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<String> o4hVarC0 = s3q.f0().c0();
        final Function1 function1 = new Function1() { // from class: dl3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CarCardViewModel.getDefaultAid$lambda$12(success, (String) obj);
            }
        };
        bg4<? super String> bg4Var = new bg4() { // from class: el3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CarCardViewModel.getDefaultAid$lambda$13(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: fl3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CarCardViewModel.getDefaultAid$lambda$14(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarC0.O(bg4Var, new bg4() { // from class: gl3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CarCardViewModel.getDefaultAid$lambda$15(function2, obj);
            }
        }));
    }

    public final void loadCardSwitchList(@NotNull CardWrapper cardWrapper, @NotNull Function1<? super Boolean, Unit> supportCallback) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(supportCallback, "supportCallback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(supportCallback, cardWrapper, null), 3, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void removeCard(@NotNull CardWrapper cardWrapper, @NotNull final Function0<Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<BaseResponse> o4hVarQ = s3q.f0().Q(cardWrapper);
        final Function1 function1 = new Function1() { // from class: hl3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CarCardViewModel.removeCard$lambda$8(success, fail, (BaseResponse) obj);
            }
        };
        bg4<? super BaseResponse> bg4Var = new bg4() { // from class: sk3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CarCardViewModel.removeCard$lambda$9(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: tk3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CarCardViewModel.removeCard$lambda$10(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarQ.O(bg4Var, new bg4() { // from class: uk3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CarCardViewModel.removeCard$lambda$11(function2, obj);
            }
        }));
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }

    public final void setDefailtCard(@NotNull CardWrapper cardWrapper, @NotNull final Function0<Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<Boolean> o4hVarS1 = s3q.f0().s1(cardWrapper);
        final Function1 function1 = new Function1() { // from class: vk3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CarCardViewModel.setDefailtCard$lambda$4(success, fail, (Boolean) obj);
            }
        };
        bg4<? super Boolean> bg4Var = new bg4() { // from class: wk3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CarCardViewModel.setDefailtCard$lambda$5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: xk3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CarCardViewModel.setDefailtCard$lambda$6(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarS1.O(bg4Var, new bg4() { // from class: yk3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CarCardViewModel.setDefailtCard$lambda$7(function2, obj);
            }
        }));
    }

    public final void updateCard(@NotNull CardWrapper cardWrapper, @NotNull final Function1<? super CardWrapper, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        o4h<CardWrapper> o4hVarZ1 = s3q.f0().z1(cardWrapper);
        final Function1 function1 = new Function1() { // from class: zk3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CarCardViewModel.updateCard$lambda$0(success, (CardWrapper) obj);
            }
        };
        bg4<? super CardWrapper> bg4Var = new bg4() { // from class: al3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CarCardViewModel.updateCard$lambda$1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: bl3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CarCardViewModel.updateCard$lambda$2(fail, (Throwable) obj);
            }
        };
        jz6 jz6VarO = o4hVarZ1.O(bg4Var, new bg4() { // from class: cl3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CarCardViewModel.updateCard$lambda$3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jz6VarO, "subscribe(...)");
        this.compositeDisposable.a(jz6VarO);
    }
}
