package com.xiaomi.fitness.nfc.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.IssuerListViewModel;
import defpackage.bg4;
import defpackage.dld;
import defpackage.fmg;
import defpackage.na4;
import defpackage.o4h;
import defpackage.s3q;
import defpackage.ua1;
import defpackage.vqg;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b1\u00102J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J?\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u0018\u0010\u001aJ+\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010$\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/IssuerListViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "", "name", "Lkotlin/Function0;", "success", "Lkotlin/Function1;", "fail", "changeName", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lcom/miui/tsmclient/model/BaseResponse;", "error", "recharge", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Ldld;", "issuer", "callBack", "updateCard", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Ldld;Lkotlin/jvm/functions/Function1;)V", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function0;)V", "updateCardClondTransit", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;)V", "Landroid/app/Activity;", LifecycleConstantKt.TYPE_ACTIVITY, "ing1", "ing2", "ing3", "Landroid/widget/TextView;", "textView", "issuerLoading", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class IssuerListViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeName$lambda$0(Function0 success, BaseResponse baseResponse) {
        Intrinsics.checkNotNullParameter(success, "$success");
        success.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeName$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeName$lambda$2(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("changeName err ", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeName$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit issuerLoading$lambda$20(Activity activity, TextView textView, String ing1, String ing2, String ing3, Long l) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(textView, "$textView");
        Intrinsics.checkNotNullParameter(ing1, "$ing1");
        Intrinsics.checkNotNullParameter(ing2, "$ing2");
        Intrinsics.checkNotNullParameter(ing3, "$ing3");
        if (activity.isDestroyed() || activity.isFinishing()) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(textView.getText().toString(), ing1)) {
            textView.setText(ing2);
        } else if (Intrinsics.areEqual(textView.getText().toString(), ing2)) {
            textView.setText(ing3);
        } else {
            textView.setText(ing1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void issuerLoading$lambda$21(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit issuerLoading$lambda$22(Throwable th) {
        vqg.c("mStatusIngTv error", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void issuerLoading$lambda$23(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recharge$lambda$4(Function1 success, BaseResponse baseResponse) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNull(baseResponse);
        success.invoke2(baseResponse);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recharge$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recharge$lambda$6(Function0 error, Throwable th) {
        Intrinsics.checkNotNullParameter(error, "$error");
        vqg.c("CardIntroFragment updateCard err ", th);
        ToastUtil.showShortToast(fmg.c(th));
        error.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recharge$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$10(Function1 callBack, Throwable th) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        vqg.c("CardIntroFragment updateCard err ", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        callBack.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$12(Function0 callBack, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        callBack.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$13(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$14(Function0 callBack, Throwable th) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        vqg.c("CardIntroFragment updateCard err ", th);
        callBack.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$15(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$8(dld issuer, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(issuer, "$issuer");
        if (issuer.a(true)) {
            issuer.i();
        } else {
            issuer.o();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCardClondTransit$lambda$16(Function1 callBack, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        callBack.invoke2(cardWrapper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCardClondTransit$lambda$17(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCardClondTransit$lambda$18(Function1 callBack, CardWrapper cardWrapper, Throwable th) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(cardWrapper, "$cardWrapper");
        vqg.c("IssuerFragment updateCardClondTransit err ", th);
        callBack.invoke2(cardWrapper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCardClondTransit$lambda$19(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void changeName(@NotNull CardWrapper cardWrapper, @NotNull String name, @NotNull final Function0<Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<BaseResponse> o4hVarL = s3q.f0().L(cardWrapper, name);
        final Function1 function1 = new Function1() { // from class: wld
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerListViewModel.changeName$lambda$0(success, (BaseResponse) obj);
            }
        };
        bg4<? super BaseResponse> bg4Var = new bg4() { // from class: hmd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerListViewModel.changeName$lambda$1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: mmd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerListViewModel.changeName$lambda$2(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarL.O(bg4Var, new bg4() { // from class: nmd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerListViewModel.changeName$lambda$3(function2, obj);
            }
        }));
    }

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void issuerLoading(@NotNull final Activity activity, @NotNull final String ing1, @NotNull final String ing2, @NotNull final String ing3, @NotNull final TextView textView) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(ing1, "ing1");
        Intrinsics.checkNotNullParameter(ing2, "ing2");
        Intrinsics.checkNotNullParameter(ing3, "ing3");
        Intrinsics.checkNotNullParameter(textView, "textView");
        na4 na4Var = this.compositeDisposable;
        o4h<Long> o4hVarH = o4h.A(1L, TimeUnit.SECONDS).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: smd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerListViewModel.issuerLoading$lambda$20(activity, textView, ing1, ing2, ing3, (Long) obj);
            }
        };
        bg4<? super Long> bg4Var = new bg4() { // from class: tmd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerListViewModel.issuerLoading$lambda$21(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: xld
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerListViewModel.issuerLoading$lambda$22((Throwable) obj);
            }
        };
        na4Var.a(o4hVarH.O(bg4Var, new bg4() { // from class: yld
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerListViewModel.issuerLoading$lambda$23(function2, obj);
            }
        }));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void recharge(@NotNull CardWrapper cardWrapper, @NotNull final Function1<? super BaseResponse, Unit> success, @NotNull final Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        na4 na4Var = this.compositeDisposable;
        o4h<BaseResponse> o4hVarL1 = s3q.f0().l1(cardWrapper, null);
        final Function1 function1 = new Function1() { // from class: dmd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerListViewModel.recharge$lambda$4(success, (BaseResponse) obj);
            }
        };
        bg4<? super BaseResponse> bg4Var = new bg4() { // from class: emd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerListViewModel.recharge$lambda$5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: fmd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerListViewModel.recharge$lambda$6(error, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarL1.O(bg4Var, new bg4() { // from class: gmd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerListViewModel.recharge$lambda$7(function2, obj);
            }
        }));
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }

    public final void updateCard(@NotNull CardWrapper cardWrapper, @NotNull final dld issuer, @NotNull final Function1<? super String, Unit> callBack) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        na4 na4Var = this.compositeDisposable;
        o4h<CardWrapper> o4hVarZ1 = s3q.f0().z1(cardWrapper);
        final Function1 function1 = new Function1() { // from class: imd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerListViewModel.updateCard$lambda$8(issuer, (CardWrapper) obj);
            }
        };
        bg4<? super CardWrapper> bg4Var = new bg4() { // from class: jmd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerListViewModel.updateCard$lambda$9(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: kmd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerListViewModel.updateCard$lambda$10(callBack, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarZ1.O(bg4Var, new bg4() { // from class: lmd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerListViewModel.updateCard$lambda$11(function2, obj);
            }
        }));
    }

    public final void updateCardClondTransit(@NotNull final CardWrapper cardWrapper, @NotNull final Function1<? super CardWrapper, Unit> callBack) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        na4 na4Var = this.compositeDisposable;
        o4h<CardWrapper> o4hVarB1 = s3q.f0().B1(cardWrapper);
        final Function1 function1 = new Function1() { // from class: omd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerListViewModel.updateCardClondTransit$lambda$16(callBack, (CardWrapper) obj);
            }
        };
        bg4<? super CardWrapper> bg4Var = new bg4() { // from class: pmd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerListViewModel.updateCardClondTransit$lambda$17(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: qmd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerListViewModel.updateCardClondTransit$lambda$18(callBack, cardWrapper, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarB1.O(bg4Var, new bg4() { // from class: rmd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerListViewModel.updateCardClondTransit$lambda$19(function2, obj);
            }
        }));
    }

    public final void updateCard(@NotNull CardWrapper cardWrapper, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        na4 na4Var = this.compositeDisposable;
        o4h<CardWrapper> o4hVarZ1 = s3q.f0().z1(cardWrapper);
        final Function1 function1 = new Function1() { // from class: zld
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerListViewModel.updateCard$lambda$12(callBack, (CardWrapper) obj);
            }
        };
        bg4<? super CardWrapper> bg4Var = new bg4() { // from class: amd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerListViewModel.updateCard$lambda$13(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: bmd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerListViewModel.updateCard$lambda$14(callBack, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarZ1.O(bg4Var, new bg4() { // from class: cmd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssuerListViewModel.updateCard$lambda$15(function2, obj);
            }
        }));
    }
}
