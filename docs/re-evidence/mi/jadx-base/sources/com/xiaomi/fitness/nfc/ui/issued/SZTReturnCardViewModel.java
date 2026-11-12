package com.xiaomi.fitness.nfc.ui.issued;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.sesdk.ServiceFeeRefundInfo;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.SZTReturnCardViewModel;
import defpackage.bg4;
import defpackage.fmg;
import defpackage.na4;
import defpackage.o4h;
import defpackage.s3q;
import defpackage.vqg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/SZTReturnCardViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "Lkotlin/Function1;", "", "success", "fail", "returnServiceFeeSZT", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/miui/tsmclient/sesdk/ServiceFeeRefundInfo;", "", "returnCard", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SZTReturnCardViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit returnCard$lambda$4(Function1 success, ServiceFeeRefundInfo serviceFeeRefundInfo) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNull(serviceFeeRefundInfo);
        success.invoke2(serviceFeeRefundInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void returnCard$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit returnCard$lambda$6(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("returnServiceFeeSZT", th);
        Intrinsics.checkNotNull(th);
        fail.invoke2(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void returnCard$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit returnServiceFeeSZT$lambda$0(Function1 success, String str) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNull(str);
        success.invoke2(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void returnServiceFeeSZT$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit returnServiceFeeSZT$lambda$2(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("returnServiceFeeSZT", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void returnServiceFeeSZT$lambda$3(Function1 tmp0, Object obj) {
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void returnCard(@NotNull CardWrapper cardWrapper, @NotNull final Function1<? super ServiceFeeRefundInfo, Unit> success, @NotNull final Function1<? super Throwable, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<ServiceFeeRefundInfo> o4hVarO1 = s3q.f0().o1(cardWrapper);
        final Function1 function1 = new Function1() { // from class: m8l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SZTReturnCardViewModel.returnCard$lambda$4(success, (ServiceFeeRefundInfo) obj);
            }
        };
        bg4<? super ServiceFeeRefundInfo> bg4Var = new bg4() { // from class: n8l
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SZTReturnCardViewModel.returnCard$lambda$5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: o8l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SZTReturnCardViewModel.returnCard$lambda$6(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarO1.O(bg4Var, new bg4() { // from class: p8l
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SZTReturnCardViewModel.returnCard$lambda$7(function2, obj);
            }
        }));
    }

    public final void returnServiceFeeSZT(@NotNull CardWrapper cardWrapper, @NotNull final Function1<? super String, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        na4 na4Var = this.compositeDisposable;
        o4h<String> o4hVarR1 = s3q.f0().r1(cardWrapper);
        final Function1 function1 = new Function1() { // from class: q8l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SZTReturnCardViewModel.returnServiceFeeSZT$lambda$0(success, (String) obj);
            }
        };
        bg4<? super String> bg4Var = new bg4() { // from class: r8l
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SZTReturnCardViewModel.returnServiceFeeSZT$lambda$1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: s8l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SZTReturnCardViewModel.returnServiceFeeSZT$lambda$2(fail, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarR1.O(bg4Var, new bg4() { // from class: t8l
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SZTReturnCardViewModel.returnServiceFeeSZT$lambda$3(function2, obj);
            }
        }));
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }
}
