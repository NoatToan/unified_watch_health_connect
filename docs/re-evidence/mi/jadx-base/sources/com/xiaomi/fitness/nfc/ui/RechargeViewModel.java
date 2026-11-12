package com.xiaomi.fitness.nfc.ui;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.BulletinResponseInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.sesdk.OrderData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.RechargeViewModel;
import defpackage.bg4;
import defpackage.fmg;
import defpackage.j5h;
import defpackage.jz6;
import defpackage.na4;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.s3q;
import defpackage.ua1;
import defpackage.v4h;
import defpackage.vqg;
import defpackage.zl3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\"\u0010#J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u001a\u0010\u0014\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/RechargeViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "", "tag", "Lkotlin/Function1;", "success", "loadBullet", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "fail", "updateCard", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "Lcom/miui/tsmclient/sesdk/OrderData$Coupon;", "callback", "queryCoupons", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRechargeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RechargeViewModel.kt\ncom/xiaomi/fitness/nfc/ui/RechargeViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1872#2,3:97\n*S KotlinDebug\n*F\n+ 1 RechargeViewModel.kt\ncom/xiaomi/fitness/nfc/ui/RechargeViewModel\n*L\n39#1:97,3\n*E\n"})
public final class RechargeViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBullet$lambda$1(Function1 success, List list) {
        Intrinsics.checkNotNullParameter(success, "$success");
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNull(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            sb.append(((BulletinResponseInfo.BulletinInfo) obj).getContent());
            if (i > 0 && i < list.size() - 1) {
                sb.append(" > ");
            }
            i = i2;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        success.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBullet$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBullet$lambda$3(String tag, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "$tag");
        vqg.c("loadBulletinList err" + tag, th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBullet$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryCoupons$lambda$10(Function1 callback, List list) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke2(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryCoupons$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryCoupons$lambda$12(Throwable th) {
        vqg.c("queryCoupons onFail called!", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryCoupons$lambda$13(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryCoupons$lambda$9(CardWrapper cardWrapper, v4h emitter) {
        Intrinsics.checkNotNullParameter(cardWrapper, "$cardWrapper");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            emitter.onNext(cardWrapper.getCouponList(cardWrapper.selectedFee).getList());
            emitter.onComplete();
        } catch (Exception e) {
            emitter.onError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$5(Function1 success, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(success, "$success");
        List<OrderData.Fee> activeFeeInfoList = cardWrapper.getActiveFeeInfoList();
        if (activeFeeInfoList != null && (!activeFeeInfoList.isEmpty())) {
            cardWrapper.selectedFee = activeFeeInfoList.get(0);
        }
        Intrinsics.checkNotNull(cardWrapper);
        success.invoke2(cardWrapper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$7(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$8(Function1 tmp0, Object obj) {
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

    public final void loadBullet(@Nullable CardWrapper cardWrapper, @NotNull final String tag, @NotNull final Function1<? super String, Unit> success) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(success, "success");
        o4h<List<BulletinResponseInfo.BulletinInfo>> o4hVarI1 = s3q.f0().i1(cardWrapper, tag);
        final Function1 function1 = new Function1() { // from class: kij
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RechargeViewModel.loadBullet$lambda$1(success, (List) obj);
            }
        };
        bg4<? super List<BulletinResponseInfo.BulletinInfo>> bg4Var = new bg4() { // from class: oij
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                RechargeViewModel.loadBullet$lambda$2(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: pij
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RechargeViewModel.loadBullet$lambda$3(tag, (Throwable) obj);
            }
        };
        jz6 jz6VarO = o4hVarI1.O(bg4Var, new bg4() { // from class: qij
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                RechargeViewModel.loadBullet$lambda$4(function2, obj);
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

    public final void queryCoupons(@NotNull final CardWrapper cardWrapper, @NotNull final Function1<? super List<? extends OrderData.Coupon>, Unit> callback) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(callback, "callback");
        zl3.g().f41419b.clear();
        zl3.g().f41418a = null;
        o4h o4hVarH = o4h.f(new j5h() { // from class: vij
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                RechargeViewModel.queryCoupons$lambda$9(cardWrapper, v4hVar);
            }
        }).S(ofl.c()).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: wij
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RechargeViewModel.queryCoupons$lambda$10(callback, (List) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: lij
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                RechargeViewModel.queryCoupons$lambda$11(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: mij
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RechargeViewModel.queryCoupons$lambda$12((Throwable) obj);
            }
        };
        this.compositeDisposable.a(o4hVarH.O(bg4Var, new bg4() { // from class: nij
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                RechargeViewModel.queryCoupons$lambda$13(function2, obj);
            }
        }));
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }

    public final void updateCard(@NotNull CardWrapper cardWrapper, @NotNull final Function1<? super CardWrapper, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        o4h<CardWrapper> o4hVarZ1 = s3q.f0().z1(cardWrapper);
        final Function1 function1 = new Function1() { // from class: rij
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RechargeViewModel.updateCard$lambda$5(success, (CardWrapper) obj);
            }
        };
        bg4<? super CardWrapper> bg4Var = new bg4() { // from class: sij
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                RechargeViewModel.updateCard$lambda$6(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: tij
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RechargeViewModel.updateCard$lambda$7(fail, (Throwable) obj);
            }
        };
        jz6 jz6VarO = o4hVarZ1.O(bg4Var, new bg4() { // from class: uij
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                RechargeViewModel.updateCard$lambda$8(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jz6VarO, "subscribe(...)");
        this.compositeDisposable.a(jz6VarO);
    }
}
