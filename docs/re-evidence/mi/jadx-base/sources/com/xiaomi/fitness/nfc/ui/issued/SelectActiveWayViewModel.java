package com.xiaomi.fitness.nfc.ui.issued;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.react.modules.appstate.AppStateModule;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.service.mi.wallet.entity.AuthenticationMethod;
import com.service.mi.wallet.entity.resp.AuthenticationMethodsResp;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.exception.NfcException;
import com.xiaomi.fitness.nfc.issuer.CardActiveWay;
import com.xiaomi.fitness.nfc.ui.issued.SelectActiveWayViewModel;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import defpackage.bg4;
import defpackage.fmg;
import defpackage.j5h;
import defpackage.na4;
import defpackage.o0j;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.s3q;
import defpackage.ua1;
import defpackage.v4h;
import defpackage.vqg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b)\u0010*J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006Jy\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072N\u0010\u0010\u001aJ\u0012@\u0012>\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e0\nj\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e`\u000f\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u0012\u0010\u0013JW\u0010\u0016\u001a>\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e0\nj\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e`\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJI\u0010 \u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/SelectActiveWayViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "Lkotlin/Function1;", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lcom/service/mi/wallet/entity/AuthenticationMethod;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "callback", "fail", "loadWay", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "authenticationMethods", "filterMethod", "(Ljava/util/List;)Ljava/util/HashMap;", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "code", "methodType", "Lkotlin/Function0;", "success", AppStateModule.APP_STATE_ACTIVE, "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSelectActiveWayViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectActiveWayViewModel.kt\ncom/xiaomi/fitness/nfc/ui/issued/SelectActiveWayViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n774#2:120\n865#2,2:121\n1863#2,2:123\n*S KotlinDebug\n*F\n+ 1 SelectActiveWayViewModel.kt\ncom/xiaomi/fitness/nfc/ui/issued/SelectActiveWayViewModel\n*L\n71#1:120\n71#1:121,2\n86#1:123,2\n*E\n"})
public final class SelectActiveWayViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void active$lambda$10(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit active$lambda$7(Function0 success, Function1 fail, BaseResponse baseResponse) {
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
    public static final void active$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit active$lambda$9(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("activate", th);
        fail.invoke2(ResourceExtKt.getString(o0j.o4));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWay$lambda$0(CardWrapper cardWrapper, SelectActiveWayViewModel this$0, v4h it) throws NfcException {
        Intrinsics.checkNotNullParameter(cardWrapper, "$cardWrapper");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        com.service.mi.entity.BaseResponse authenticationMethods = cardWrapper.bankCard.getAuthenticationMethods();
        if (!authenticationMethods.isStatusOK()) {
            if (cardWrapper.bankCard.getCardType() != 2) {
                throw new NfcException(NfcUtils.getMasterErrorMsg(authenticationMethods.getResultCode(), authenticationMethods.getSpErrors()));
            }
            throw new NfcException(NfcUtils.getVisaErrorMsg("getStepUpOptions", authenticationMethods.getResultCode(), authenticationMethods.getSpErrors()));
        }
        Object data = authenticationMethods.getData();
        Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.service.mi.wallet.entity.resp.AuthenticationMethodsResp");
        AuthenticationMethodsResp authenticationMethodsResp = (AuthenticationMethodsResp) data;
        vqg.d("authenticationMethods size:" + authenticationMethodsResp.getAuthenticationMethods().size());
        List<AuthenticationMethod> authenticationMethods2 = authenticationMethodsResp.getAuthenticationMethods();
        Intrinsics.checkNotNullExpressionValue(authenticationMethods2, "getAuthenticationMethods(...)");
        it.onNext(this$0.filterMethod(authenticationMethods2));
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadWay$lambda$1(Function1 callback, HashMap map) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNull(map);
        callback.invoke2(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWay$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadWay$lambda$3(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("loadWay", th);
        String strC = fmg.c(th);
        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
        fail.invoke2(strC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWay$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    public final void active(@NotNull CardWrapper cardWrapper, @NotNull String code, @Nullable String methodType, @NotNull final Function0<Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        o4h<BaseResponse> o4hVarI = s3q.f0().I(cardWrapper, code, methodType);
        final Function1 function1 = new Function1() { // from class: vrl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SelectActiveWayViewModel.active$lambda$7(success, fail, (BaseResponse) obj);
            }
        };
        bg4<? super BaseResponse> bg4Var = new bg4() { // from class: wrl
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SelectActiveWayViewModel.active$lambda$8(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: xrl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SelectActiveWayViewModel.active$lambda$9(fail, (Throwable) obj);
            }
        };
        o4hVarI.O(bg4Var, new bg4() { // from class: yrl
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SelectActiveWayViewModel.active$lambda$10(function2, obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final HashMap<String, ArrayList<AuthenticationMethod>> filterMethod(@NotNull List<AuthenticationMethod> authenticationMethods) {
        Intrinsics.checkNotNullParameter(authenticationMethods, "authenticationMethods");
        HashMap<String, ArrayList<AuthenticationMethod>> map = new HashMap<>();
        ArrayList<AuthenticationMethod> arrayList = new ArrayList();
        for (Object obj : authenticationMethods) {
            String type = ((AuthenticationMethod) obj).getType();
            if (Intrinsics.areEqual(type, CardActiveWay.MASTERCARD_EMAIL.getType()) || Intrinsics.areEqual(type, CardActiveWay.MASTERCARD_SMS.getType()) || Intrinsics.areEqual(type, CardActiveWay.MASTER_APP_TO_APPLICATION.getType()) || Intrinsics.areEqual(type, CardActiveWay.VISA_APP_TO_APPLICATION2.getType()) || Intrinsics.areEqual(type, CardActiveWay.VISA_CALL_CENTER.getType()) || Intrinsics.areEqual(type, CardActiveWay.VISA_CALL_CENTER2.getType()) || Intrinsics.areEqual(type, CardActiveWay.VISA_CALL_CENTER3.getType()) || Intrinsics.areEqual(type, CardActiveWay.VISA_EMAIL.getType()) || Intrinsics.areEqual(type, CardActiveWay.VISA_SMS.getType())) {
                arrayList.add(obj);
            }
        }
        for (AuthenticationMethod authenticationMethod : arrayList) {
            ArrayList<AuthenticationMethod> arrayList2 = map.get(authenticationMethod.getType());
            ArrayList<AuthenticationMethod> arrayList3 = (arrayList2 == null || arrayList2.isEmpty()) ? new ArrayList<>() : map.get(authenticationMethod.getType());
            if (arrayList3 != null) {
                arrayList3.add(authenticationMethod);
            }
            String type2 = authenticationMethod.getType();
            Intrinsics.checkNotNull(arrayList3);
            map.put(type2, arrayList3);
        }
        return map;
    }

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void loadWay(@NotNull final CardWrapper cardWrapper, @NotNull final Function1<? super HashMap<String, ArrayList<AuthenticationMethod>>, Unit> callback, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(fail, "fail");
        o4h o4hVarH = o4h.f(new j5h() { // from class: qrl
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) throws NfcException {
                SelectActiveWayViewModel.loadWay$lambda$0(cardWrapper, this, v4hVar);
            }
        }).S(ofl.c()).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: rrl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SelectActiveWayViewModel.loadWay$lambda$1(callback, (HashMap) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: srl
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SelectActiveWayViewModel.loadWay$lambda$2(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: trl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SelectActiveWayViewModel.loadWay$lambda$3(fail, (Throwable) obj);
            }
        };
        this.compositeDisposable.a(o4hVarH.O(bg4Var, new bg4() { // from class: url
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SelectActiveWayViewModel.loadWay$lambda$4(function2, obj);
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
}
