package com.xiaomi.fitness.nfc.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.TransferOutViewModel;
import defpackage.bg4;
import defpackage.fmg;
import defpackage.na4;
import defpackage.o0j;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b$\u0010%J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/TransferOutViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "Lkotlin/Function0;", "success", "Lkotlin/Function1;", "", "fail", "transferOut", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Landroid/app/Activity;", LifecycleConstantKt.TYPE_ACTIVITY, "ing1", "ing2", "ing3", "Landroid/widget/TextView;", "textView", "issuerLoading", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TransferOutViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit issuerLoading$lambda$4(Activity activity, TextView textView, String ing1, String ing2, String ing3, Long l) {
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
    public static final void issuerLoading$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit issuerLoading$lambda$6(Throwable th) {
        vqg.c("mStatusIngTv error", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void issuerLoading$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit transferOut$lambda$0(Function0 success, Function1 fail, BaseResponse response) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccess()) {
            success.invoke();
        } else {
            String string = TextUtils.isEmpty(response.mMsg) ? AppUtil.getApp().getString(o0j.t2) : response.mMsg;
            Intrinsics.checkNotNull(string);
            fail.invoke2(string);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void transferOut$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit transferOut$lambda$2(Function0 success, Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        if (th instanceof SecurityException) {
            success.invoke();
        } else {
            String strC = fmg.c(th);
            Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
            fail.invoke2(strC);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void transferOut$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
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
        final Function1 function1 = new Function1() { // from class: qxp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransferOutViewModel.issuerLoading$lambda$4(activity, textView, ing1, ing2, ing3, (Long) obj);
            }
        };
        bg4<? super Long> bg4Var = new bg4() { // from class: rxp
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                TransferOutViewModel.issuerLoading$lambda$5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: sxp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransferOutViewModel.issuerLoading$lambda$6((Throwable) obj);
            }
        };
        na4Var.a(o4hVarH.O(bg4Var, new bg4() { // from class: txp
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                TransferOutViewModel.issuerLoading$lambda$7(function2, obj);
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

    public final void transferOut(@NotNull CardWrapper cardWrapper, @NotNull final Function0<Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        o4h<BaseResponse> o4hVarY1 = s3q.f0().y1(cardWrapper);
        final Function1 function1 = new Function1() { // from class: mxp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransferOutViewModel.transferOut$lambda$0(success, fail, (BaseResponse) obj);
            }
        };
        bg4<? super BaseResponse> bg4Var = new bg4() { // from class: nxp
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                TransferOutViewModel.transferOut$lambda$1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: oxp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransferOutViewModel.transferOut$lambda$2(success, fail, (Throwable) obj);
            }
        };
        this.compositeDisposable.a(o4hVarY1.O(bg4Var, new bg4() { // from class: pxp
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                TransferOutViewModel.transferOut$lambda$3(function2, obj);
            }
        }));
    }
}
