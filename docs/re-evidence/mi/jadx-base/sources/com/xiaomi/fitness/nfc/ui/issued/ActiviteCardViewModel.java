package com.xiaomi.fitness.nfc.ui.issued;

import android.os.Bundle;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.react.modules.appstate.AppStateModule;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.service.mi.wallet.entity.AuthenticationMethod;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.ActiviteCardViewModel;
import defpackage.bg4;
import defpackage.bua;
import defpackage.jz6;
import defpackage.na4;
import defpackage.o0j;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.rji;
import defpackage.s3q;
import defpackage.ua1;
import defpackage.vc0;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006JG\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u0010\u0010\u0011J]\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/ActiviteCardViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "Lcom/service/mi/wallet/entity/AuthenticationMethod;", "authenticationMethod", "Lkotlin/Function1;", "Lcom/service/mi/entity/BaseResponse;", "success", "", "fail", "sendAuthorCode", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lcom/service/mi/wallet/entity/AuthenticationMethod;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "code", "methodType", "Lkotlin/Function0;", "exception", AppStateModule.APP_STATE_ACTIVE, "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/widget/TextView;", "sendView", "timer", "(Landroid/widget/TextView;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ActiviteCardViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit active$lambda$4(Function0 success, Function1 fail, BaseResponse baseResponse) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        if (baseResponse.isSuccess()) {
            success.invoke();
        } else {
            String mMsg = baseResponse.mMsg;
            Intrinsics.checkNotNullExpressionValue(mMsg, "mMsg");
            fail.invoke2(mMsg);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void active$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit active$lambda$6(Function1 exception, Throwable th) {
        Intrinsics.checkNotNullParameter(exception, "$exception");
        vqg.c("activate", th);
        Intrinsics.checkNotNull(th);
        exception.invoke2(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void active$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendAuthorCode$lambda$0(Function1 success, com.service.mi.entity.BaseResponse baseResponse) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNull(baseResponse);
        success.invoke2(baseResponse);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendAuthorCode$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendAuthorCode$lambda$2(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("requestAuthCode", th);
        Intrinsics.checkNotNull(th);
        fail.invoke2(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendAuthorCode$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit timer$lambda$10(TextView sendView, jz6 jz6Var) {
        Intrinsics.checkNotNullParameter(sendView, "$sendView");
        sendView.setTextColor(ExtUtilsKt.getColor(rji.f32613a));
        sendView.setClickable(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timer$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit timer$lambda$12(TextView sendView, Long l) {
        Intrinsics.checkNotNullParameter(sendView, "$sendView");
        sendView.setText(l + "S");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timer$lambda$13(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit timer$lambda$14(TextView sendView, Throwable th) {
        Intrinsics.checkNotNullParameter(sendView, "$sendView");
        sendView.setTextColor(AppUtil.getApp().getColor(rji.o));
        sendView.setClickable(true);
        sendView.setText(o0j.o7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timer$lambda$15(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timer$lambda$16(TextView sendView) {
        Intrinsics.checkNotNullParameter(sendView, "$sendView");
        sendView.setClickable(true);
        sendView.setTextColor(AppUtil.getApp().getColor(rji.o));
        sendView.setText(o0j.o7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long timer$lambda$8(Long aLong) {
        Intrinsics.checkNotNullParameter(aLong, "aLong");
        return Long.valueOf(((long) 60) - aLong.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long timer$lambda$9(Function1 tmp0, Object p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (Long) tmp0.invoke2(p0);
    }

    public final void active(@NotNull CardWrapper cardWrapper, @NotNull String code, @Nullable String methodType, @NotNull final Function0<Unit> success, @NotNull final Function1<? super String, Unit> fail, @NotNull final Function1<? super Throwable, Unit> exception) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        Intrinsics.checkNotNullParameter(exception, "exception");
        o4h<BaseResponse> o4hVarI = s3q.f0().I(cardWrapper, code, methodType);
        final Function1 function1 = new Function1() { // from class: cg0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActiviteCardViewModel.active$lambda$4(success, fail, (BaseResponse) obj);
            }
        };
        bg4<? super BaseResponse> bg4Var = new bg4() { // from class: dg0
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                ActiviteCardViewModel.active$lambda$5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: eg0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActiviteCardViewModel.active$lambda$6(exception, (Throwable) obj);
            }
        };
        o4hVarI.O(bg4Var, new bg4() { // from class: fg0
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                ActiviteCardViewModel.active$lambda$7(function2, obj);
            }
        });
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

    public final void sendAuthorCode(@NotNull CardWrapper cardWrapper, @Nullable AuthenticationMethod authenticationMethod, @NotNull final Function1<? super com.service.mi.entity.BaseResponse, Unit> success, @NotNull final Function1<? super Throwable, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        o4h<com.service.mi.entity.BaseResponse> o4hVarN1 = s3q.f0().n1(cardWrapper, authenticationMethod);
        final Function1 function1 = new Function1() { // from class: rf0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActiviteCardViewModel.sendAuthorCode$lambda$0(success, (com.service.mi.entity.BaseResponse) obj);
            }
        };
        bg4<? super com.service.mi.entity.BaseResponse> bg4Var = new bg4() { // from class: zf0
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                ActiviteCardViewModel.sendAuthorCode$lambda$1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ag0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActiviteCardViewModel.sendAuthorCode$lambda$2(fail, (Throwable) obj);
            }
        };
        o4hVarN1.O(bg4Var, new bg4() { // from class: bg0
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                ActiviteCardViewModel.sendAuthorCode$lambda$3(function2, obj);
            }
        });
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }

    public final void timer(@NotNull final TextView sendView) {
        Intrinsics.checkNotNullParameter(sendView, "sendView");
        o4h<Long> o4hVarU = o4h.y(0L, 1L, TimeUnit.SECONDS).S(ofl.c()).H(ua1.c()).U(61L);
        final Function1 function1 = new Function1() { // from class: gg0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActiviteCardViewModel.timer$lambda$8((Long) obj);
            }
        };
        o4h<R> o4hVarF = o4hVarU.F(new bua() { // from class: hg0
            @Override // defpackage.bua
            public final Object apply(Object obj) {
                return ActiviteCardViewModel.timer$lambda$9(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: sf0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActiviteCardViewModel.timer$lambda$10(sendView, (jz6) obj);
            }
        };
        o4h o4hVarN = o4hVarF.n(new bg4() { // from class: tf0
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                ActiviteCardViewModel.timer$lambda$11(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: uf0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActiviteCardViewModel.timer$lambda$12(sendView, (Long) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: vf0
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                ActiviteCardViewModel.timer$lambda$13(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: wf0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ActiviteCardViewModel.timer$lambda$14(sendView, (Throwable) obj);
            }
        };
        this.compositeDisposable.a(o4hVarN.P(bg4Var, new bg4() { // from class: xf0
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                ActiviteCardViewModel.timer$lambda$15(function4, obj);
            }
        }, new vc0() { // from class: yf0
            @Override // defpackage.vc0
            public final void run() {
                ActiviteCardViewModel.timer$lambda$16(sendView);
            }
        }));
    }
}
