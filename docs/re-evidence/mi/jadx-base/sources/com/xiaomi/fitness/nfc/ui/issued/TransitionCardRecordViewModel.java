package com.xiaomi.fitness.nfc.ui.issued;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.sesdk.OrderData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.TransitionCardRecordViewModel;
import defpackage.bg4;
import defpackage.fmg;
import defpackage.jz6;
import defpackage.na4;
import defpackage.o4h;
import defpackage.s3q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/TransitionCardRecordViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "Lkotlin/Function1;", "callback", "updateCard", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;)V", "", "Lcom/miui/tsmclient/sesdk/OrderData$OrderRecord;", "success", "loadOrderRecorderList", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TransitionCardRecordViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadOrderRecorderList$lambda$4(Function1 success, List list) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNull(list);
        success.invoke2(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadOrderRecorderList$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadOrderRecorderList$lambda$6(Throwable th) {
        ToastUtil.showLongToast(fmg.c(th));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadOrderRecorderList$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$0(Function1 callback, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        List<OrderData.Fee> activeFeeInfoList = cardWrapper.getActiveFeeInfoList();
        if (activeFeeInfoList != null && (!activeFeeInfoList.isEmpty())) {
            cardWrapper.selectedFee = activeFeeInfoList.get(0);
        }
        Intrinsics.checkNotNull(cardWrapper);
        callback.invoke2(cardWrapper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$2(Throwable th) {
        ToastUtil.showLongToast(fmg.c(th));
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
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void loadOrderRecorderList(@NotNull CardWrapper cardWrapper, @NotNull final Function1<? super List<? extends OrderData.OrderRecord>, Unit> success) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        o4h<List<OrderData.OrderRecord>> o4hVarJ0 = s3q.f0().j0(cardWrapper);
        final Function1 function1 = new Function1() { // from class: mzp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransitionCardRecordViewModel.loadOrderRecorderList$lambda$4(success, (List) obj);
            }
        };
        bg4<? super List<OrderData.OrderRecord>> bg4Var = new bg4() { // from class: nzp
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                TransitionCardRecordViewModel.loadOrderRecorderList$lambda$5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ozp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransitionCardRecordViewModel.loadOrderRecorderList$lambda$6((Throwable) obj);
            }
        };
        jz6 jz6VarO = o4hVarJ0.O(bg4Var, new bg4() { // from class: pzp
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                TransitionCardRecordViewModel.loadOrderRecorderList$lambda$7(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jz6VarO, "subscribe(...)");
        this.compositeDisposable.a(jz6VarO);
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

    public final void updateCard(@NotNull CardWrapper cardWrapper, @NotNull final Function1<? super CardWrapper, Unit> callback) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(callback, "callback");
        o4h<CardWrapper> o4hVarZ1 = s3q.f0().z1(cardWrapper);
        final Function1 function1 = new Function1() { // from class: qzp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransitionCardRecordViewModel.updateCard$lambda$0(callback, (CardWrapper) obj);
            }
        };
        bg4<? super CardWrapper> bg4Var = new bg4() { // from class: rzp
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                TransitionCardRecordViewModel.updateCard$lambda$1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: szp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransitionCardRecordViewModel.updateCard$lambda$2((Throwable) obj);
            }
        };
        jz6 jz6VarO = o4hVarZ1.O(bg4Var, new bg4() { // from class: tzp
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                TransitionCardRecordViewModel.updateCard$lambda$3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jz6VarO, "subscribe(...)");
        this.compositeDisposable.a(jz6VarO);
    }
}
