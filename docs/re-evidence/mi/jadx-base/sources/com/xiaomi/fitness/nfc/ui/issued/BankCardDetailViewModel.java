package com.xiaomi.fitness.nfc.ui.issued;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.BankCardDetailViewModel;
import defpackage.bg4;
import defpackage.fmg;
import defpackage.na4;
import defpackage.o0j;
import defpackage.o4h;
import defpackage.s3q;
import defpackage.vqg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b!\u0010\"J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/BankCardDetailViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lkotlin/Function1;", "", "success", "Lkotlin/Function0;", "fail", "getDefaultAid", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "", "setDefaultCard", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "deleteCard", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "updateCard", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BankCardDetailViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteCard$lambda$10(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("deleteCard", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteCard$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteCard$lambda$8(Function0 success, Function1 fail, BaseResponse baseResponse) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        if (baseResponse.isSuccess()) {
            success.invoke();
        } else {
            String string = TextUtils.isEmpty(baseResponse.mMsg) ? AppUtil.getApp().getString(o0j.t2) : fmg.a(baseResponse.mMsg);
            Intrinsics.checkNotNull(string);
            fail.invoke2(string);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteCard$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDefaultAid$lambda$0(Function1 success, String str) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNull(str);
        success.invoke2(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDefaultAid$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDefaultAid$lambda$2(Function0 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("getDefaultAid", th);
        fail.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDefaultAid$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDefaultCard$lambda$4(Function1 success, Boolean bool) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNull(bool);
        success.invoke2(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDefaultCard$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDefaultCard$lambda$6(Function0 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("setDefaultCard", th);
        fail.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDefaultCard$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$12(Function1 success, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNull(cardWrapper);
        success.invoke2(cardWrapper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$13(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$14(Function0 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("updateCard", th);
        fail.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$15(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void deleteCard(@NotNull CardWrapper cardWrapper, @NotNull final Function0<Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        o4h<BaseResponse> o4hVarQ = s3q.f0().Q(cardWrapper);
        final Function1 function1 = new Function1() { // from class: vy1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardDetailViewModel.deleteCard$lambda$8(success, fail, (BaseResponse) obj);
            }
        };
        bg4<? super BaseResponse> bg4Var = new bg4() { // from class: cz1
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BankCardDetailViewModel.deleteCard$lambda$9(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: dz1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardDetailViewModel.deleteCard$lambda$10(fail, (Throwable) obj);
            }
        };
        this.compositeDisposable.a(o4hVarQ.O(bg4Var, new bg4() { // from class: ez1
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BankCardDetailViewModel.deleteCard$lambda$11(function2, obj);
            }
        }));
    }

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void getDefaultAid(@NotNull final Function1<? super String, Unit> success, @NotNull final Function0<Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<String> o4hVarC0 = s3q.f0().c0();
        final Function1 function1 = new Function1() { // from class: fz1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardDetailViewModel.getDefaultAid$lambda$0(success, (String) obj);
            }
        };
        bg4<? super String> bg4Var = new bg4() { // from class: gz1
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BankCardDetailViewModel.getDefaultAid$lambda$1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: hz1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardDetailViewModel.getDefaultAid$lambda$2(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarC0.O(bg4Var, new bg4() { // from class: iz1
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BankCardDetailViewModel.getDefaultAid$lambda$3(function2, obj);
            }
        }));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }

    public final void setDefaultCard(@NotNull CardWrapper cardWrapper, @NotNull final Function1<? super Boolean, Unit> success, @NotNull final Function0<Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<Boolean> o4hVarS1 = s3q.f0().s1(cardWrapper);
        final Function1 function1 = new Function1() { // from class: jz1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardDetailViewModel.setDefaultCard$lambda$4(success, (Boolean) obj);
            }
        };
        bg4<? super Boolean> bg4Var = new bg4() { // from class: kz1
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BankCardDetailViewModel.setDefaultCard$lambda$5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: wy1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardDetailViewModel.setDefaultCard$lambda$6(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarS1.O(bg4Var, new bg4() { // from class: xy1
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BankCardDetailViewModel.setDefaultCard$lambda$7(function2, obj);
            }
        }));
    }

    public final void updateCard(@NotNull CardWrapper cardWrapper, @NotNull final Function1<? super CardWrapper, Unit> success, @NotNull final Function0<Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<CardWrapper> o4hVarZ1 = s3q.f0().z1(cardWrapper);
        final Function1 function1 = new Function1() { // from class: yy1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardDetailViewModel.updateCard$lambda$12(success, (CardWrapper) obj);
            }
        };
        bg4<? super CardWrapper> bg4Var = new bg4() { // from class: zy1
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BankCardDetailViewModel.updateCard$lambda$13(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: az1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardDetailViewModel.updateCard$lambda$14(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarZ1.O(bg4Var, new bg4() { // from class: bz1
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BankCardDetailViewModel.updateCard$lambda$15(function2, obj);
            }
        }));
    }
}
