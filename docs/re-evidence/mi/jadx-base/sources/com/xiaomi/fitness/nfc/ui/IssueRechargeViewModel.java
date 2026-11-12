package com.xiaomi.fitness.nfc.ui;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.BulletinResponseInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.sesdk.OrderData;
import com.miui.tsmclient.sesdk.ServiceProtocolData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.exception.NfcException;
import com.xiaomi.fitness.nfc.ui.IssueRechargeViewModel;
import com.xiaomi.fitness.nfc.widget.PhoneNumVerifyView;
import defpackage.bg4;
import defpackage.bua;
import defpackage.fmg;
import defpackage.j5h;
import defpackage.jz6;
import defpackage.na4;
import defpackage.o0j;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.rji;
import defpackage.s3q;
import defpackage.ua1;
import defpackage.v4h;
import defpackage.vc0;
import defpackage.vqg;
import defpackage.zl3;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b-\u0010.J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ?\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u001a\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u001c\u0010\u0019J7\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/IssueRechargeViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/nfc/widget/PhoneNumVerifyView;", "phoneNumVerifyView", "startCountDown", "(Lcom/xiaomi/fitness/nfc/widget/PhoneNumVerifyView;)V", "Lcom/miui/tsmclient/sesdk/ServiceProtocolData;", "protocolData", "", TSMAuthContants.PARAM_PHONE_NUMBER, "Lkotlin/Function0;", "success", "Lkotlin/Function1;", "fail", "requestValidateCode", "(Lcom/miui/tsmclient/sesdk/ServiceProtocolData;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "callback", "updateCard", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;)V", "", "Lcom/miui/tsmclient/sesdk/OrderData$Coupon;", "queryCoupons", "loadServiceProtocolData", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "tag", "loadBullet", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nIssueRechargeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueRechargeViewModel.kt\ncom/xiaomi/fitness/nfc/ui/IssueRechargeViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,173:1\n1872#2,3:174\n*S KotlinDebug\n*F\n+ 1 IssueRechargeViewModel.kt\ncom/xiaomi/fitness/nfc/ui/IssueRechargeViewModel\n*L\n156#1:174,3\n*E\n"})
public final class IssueRechargeViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBullet$lambda$27(Function1 success, List list) {
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
    public static final void loadBullet$lambda$28(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBullet$lambda$29(String tag, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "$tag");
        vqg.c("loadBulletinList err" + tag, th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBullet$lambda$30(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadServiceProtocolData$lambda$21(CardWrapper cardWrapper, v4h emitter) throws IOException {
        Intrinsics.checkNotNullParameter(cardWrapper, "$cardWrapper");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        vqg.b("loadServiceProtocolData start");
        ServiceProtocolData serviceProtocolData = cardWrapper.mSeCard.getServiceProtocolData();
        if (serviceProtocolData == null) {
            vqg.b("loadServiceProtocolData serviceProtocolData == null");
            emitter.onError(new NfcException("serviceProtocolData return null"));
        } else {
            vqg.b("loadServiceProtocolData serviceProtocolData != null");
            emitter.onNext(serviceProtocolData);
            emitter.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadServiceProtocolData$lambda$22(Function1 callback, ServiceProtocolData serviceProtocolData) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNull(serviceProtocolData);
        callback.invoke2(serviceProtocolData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadServiceProtocolData$lambda$23(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadServiceProtocolData$lambda$24(Function0 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("loadServiceProtocolData error", th);
        fail.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadServiceProtocolData$lambda$25(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryCoupons$lambda$16(CardWrapper cardWrapper, v4h emitter) {
        Intrinsics.checkNotNullParameter(cardWrapper, "$cardWrapper");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            List<OrderData.Coupon> list = cardWrapper.getCouponList(cardWrapper.selectedFee).getList();
            if (list != null) {
                vqg.b("queryCoupons list size:" + list.size());
            } else {
                vqg.b("queryCoupons list is empty");
            }
            emitter.onNext(list);
            emitter.onComplete();
        } catch (Exception e) {
            emitter.onError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryCoupons$lambda$17(Function1 callback, List list) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke2(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryCoupons$lambda$18(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryCoupons$lambda$19(Throwable th) {
        vqg.c("queryCoupons onFail called!", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryCoupons$lambda$20(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestValidateCode$lambda$10(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        String string = AppUtil.getApp().getString(o0j.l7);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        fail.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestValidateCode$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseResponse requestValidateCode$lambda$7(ServiceProtocolData protocolData, String phoneNumber) {
        Intrinsics.checkNotNullParameter(protocolData, "$protocolData");
        Intrinsics.checkNotNullParameter(phoneNumber, "$phoneNumber");
        return protocolData.requestCaptcha(phoneNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestValidateCode$lambda$8(Function0 success, BaseResponse baseResponse) {
        Intrinsics.checkNotNullParameter(success, "$success");
        if (baseResponse.isSuccess()) {
            success.invoke();
        } else {
            success.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestValidateCode$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long startCountDown$lambda$0(Long it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf((((long) 60) - it.longValue()) - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long startCountDown$lambda$1(Function1 tmp0, Object p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (Long) tmp0.invoke2(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startCountDown$lambda$2(PhoneNumVerifyView phoneNumVerifyView, Long l) {
        Intrinsics.checkNotNullParameter(phoneNumVerifyView, "$phoneNumVerifyView");
        phoneNumVerifyView.setSendCodeCountDownTxt(l + "s");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCountDown$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startCountDown$lambda$4(PhoneNumVerifyView phoneNumVerifyView, Throwable th) {
        Intrinsics.checkNotNullParameter(phoneNumVerifyView, "$phoneNumVerifyView");
        phoneNumVerifyView.g(true);
        phoneNumVerifyView.setSendCodeCountDownTxtColor(rji.o);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCountDown$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCountDown$lambda$6(PhoneNumVerifyView phoneNumVerifyView) {
        Intrinsics.checkNotNullParameter(phoneNumVerifyView, "$phoneNumVerifyView");
        phoneNumVerifyView.setSendCodeCountDownTxt(ResourceExtKt.getString(o0j.o7));
        phoneNumVerifyView.g(true);
        phoneNumVerifyView.setSendCodeCountDownTxtColor(rji.o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$12(Function1 callback, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNull(cardWrapper);
        callback.invoke2(cardWrapper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$13(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$14(Throwable th) {
        ToastUtil.showLongToast(fmg.c(th));
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

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void loadBullet(@NotNull CardWrapper cardWrapper, @NotNull final String tag, @NotNull final Function1<? super String, Unit> success) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(success, "success");
        o4h<List<BulletinResponseInfo.BulletinInfo>> o4hVarI1 = s3q.f0().i1(cardWrapper, tag);
        final Function1 function1 = new Function1() { // from class: ejd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeViewModel.loadBullet$lambda$27(success, (List) obj);
            }
        };
        bg4<? super List<BulletinResponseInfo.BulletinInfo>> bg4Var = new bg4() { // from class: fjd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssueRechargeViewModel.loadBullet$lambda$28(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: gjd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeViewModel.loadBullet$lambda$29(tag, (Throwable) obj);
            }
        };
        jz6 jz6VarO = o4hVarI1.O(bg4Var, new bg4() { // from class: hjd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssueRechargeViewModel.loadBullet$lambda$30(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jz6VarO, "subscribe(...)");
        this.compositeDisposable.a(jz6VarO);
    }

    public final void loadServiceProtocolData(@NotNull final CardWrapper cardWrapper, @NotNull final Function1<? super ServiceProtocolData, Unit> callback, @NotNull final Function0<Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(fail, "fail");
        o4h o4hVarH = o4h.f(new j5h() { // from class: qjd
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) throws IOException {
                IssueRechargeViewModel.loadServiceProtocolData$lambda$21(cardWrapper, v4hVar);
            }
        }).S(ofl.c()).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: rjd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeViewModel.loadServiceProtocolData$lambda$22(callback, (ServiceProtocolData) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: sjd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssueRechargeViewModel.loadServiceProtocolData$lambda$23(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: tjd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeViewModel.loadServiceProtocolData$lambda$24(fail, (Throwable) obj);
            }
        };
        this.compositeDisposable.a(o4hVarH.O(bg4Var, new bg4() { // from class: ujd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssueRechargeViewModel.loadServiceProtocolData$lambda$25(function2, obj);
            }
        }));
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
        vqg.b("queryCoupons start");
        zl3.g().f41419b.clear();
        zl3.g().f41418a = null;
        o4h o4hVarH = o4h.f(new j5h() { // from class: xjd
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                IssueRechargeViewModel.queryCoupons$lambda$16(cardWrapper, v4hVar);
            }
        }).S(ofl.c()).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: yjd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeViewModel.queryCoupons$lambda$17(callback, (List) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: zjd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssueRechargeViewModel.queryCoupons$lambda$18(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: akd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeViewModel.queryCoupons$lambda$19((Throwable) obj);
            }
        };
        this.compositeDisposable.a(o4hVarH.O(bg4Var, new bg4() { // from class: bkd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssueRechargeViewModel.queryCoupons$lambda$20(function2, obj);
            }
        }));
    }

    public final void requestValidateCode(@NotNull final ServiceProtocolData protocolData, @NotNull final String phoneNumber, @NotNull final Function0<Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(protocolData, "protocolData");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        o4h o4hVarK = s3q.K(new Callable() { // from class: ckd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return IssueRechargeViewModel.requestValidateCode$lambda$7(protocolData, phoneNumber);
            }
        });
        final Function1 function1 = new Function1() { // from class: ajd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeViewModel.requestValidateCode$lambda$8(success, (BaseResponse) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: bjd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssueRechargeViewModel.requestValidateCode$lambda$9(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: cjd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeViewModel.requestValidateCode$lambda$10(fail, (Throwable) obj);
            }
        };
        jz6 jz6VarO = o4hVarK.O(bg4Var, new bg4() { // from class: djd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssueRechargeViewModel.requestValidateCode$lambda$11(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jz6VarO, "subscribe(...)");
        this.compositeDisposable.a(jz6VarO);
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }

    public final void startCountDown(@NotNull final PhoneNumVerifyView phoneNumVerifyView) {
        Intrinsics.checkNotNullParameter(phoneNumVerifyView, "phoneNumVerifyView");
        o4h<Long> o4hVarU = o4h.A(1L, TimeUnit.SECONDS).S(ofl.c()).U(60L);
        final Function1 function1 = new Function1() { // from class: ijd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeViewModel.startCountDown$lambda$0((Long) obj);
            }
        };
        o4h o4hVarH = o4hVarU.F(new bua() { // from class: jjd
            @Override // defpackage.bua
            public final Object apply(Object obj) {
                return IssueRechargeViewModel.startCountDown$lambda$1(function1, obj);
            }
        }).H(ua1.c());
        final Function1 function2 = new Function1() { // from class: ljd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeViewModel.startCountDown$lambda$2(phoneNumVerifyView, (Long) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: mjd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssueRechargeViewModel.startCountDown$lambda$3(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: njd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeViewModel.startCountDown$lambda$4(phoneNumVerifyView, (Throwable) obj);
            }
        };
        this.compositeDisposable.a(o4hVarH.P(bg4Var, new bg4() { // from class: ojd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssueRechargeViewModel.startCountDown$lambda$5(function3, obj);
            }
        }, new vc0() { // from class: pjd
            @Override // defpackage.vc0
            public final void run() {
                IssueRechargeViewModel.startCountDown$lambda$6(phoneNumVerifyView);
            }
        }));
    }

    public final void updateCard(@NotNull CardWrapper cardWrapper, @NotNull final Function1<? super CardWrapper, Unit> callback) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(callback, "callback");
        o4h<CardWrapper> o4hVarZ1 = s3q.f0().z1(cardWrapper);
        final Function1 function1 = new Function1() { // from class: zid
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeViewModel.updateCard$lambda$12(callback, (CardWrapper) obj);
            }
        };
        bg4<? super CardWrapper> bg4Var = new bg4() { // from class: kjd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssueRechargeViewModel.updateCard$lambda$13(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: vjd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueRechargeViewModel.updateCard$lambda$14((Throwable) obj);
            }
        };
        jz6 jz6VarO = o4hVarZ1.O(bg4Var, new bg4() { // from class: wjd
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                IssueRechargeViewModel.updateCard$lambda$15(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jz6VarO, "subscribe(...)");
        this.compositeDisposable.a(jz6VarO);
    }
}
