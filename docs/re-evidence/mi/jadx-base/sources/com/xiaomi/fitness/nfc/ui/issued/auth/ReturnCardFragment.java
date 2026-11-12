package com.xiaomi.fitness.nfc.ui.issued.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.alipay.sdk.app.AuthTask;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.entity.RefundAuthorizationInfo;
import com.miui.tsmclient.entity.RefundChannelInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.sesdk.SeCard;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.CardReturnNoticeFragment;
import com.xiaomi.fitness.nfc.ui.issued.CardReturnNoticeViewModel;
import com.xiaomi.fitness.nfc.ui.issued.CardReturnResultFragment;
import com.xiaomi.fitness.nfc.ui.issued.CardReturnUserInfoFragment;
import com.xiaomi.fitness.nfc.ui.issued.auth.ReturnCardFragment;
import defpackage.o0j;
import defpackage.sui;
import defpackage.uq1;
import defpackage.vqg;
import defpackage.xng;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0007¢\u0006\u0004\b!\u0010\"J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\b*\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/auth/ReturnCardFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/CardReturnNoticeViewModel;", "Lxng;", "Landroid/content/Context;", "context", "Landroid/os/Message;", "msg", "", "handleMessage", "(Landroid/content/Context;Landroid/os/Message;)V", "", "isSuccess", "", "goToResultPage", "(ZLjava/lang/String;)V", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Lxng;)V", TSMAuthContants.PARAM_AUTH_CODE, "Ljava/lang/String;", TSMAuthContants.PARAM_RETURN_CARD_PAY_ACCOUNT_TYPE, "Lcom/miui/tsmclient/entity/RefundChannelInfo;", TSMAuthContants.EXTRA_REFUND_CHANNEL_INFO, "Lcom/miui/tsmclient/entity/RefundChannelInfo;", "<init>", "()V", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nReturnCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReturnCardFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/auth/ReturnCardFragment\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,173:1\n29#2:174\n29#2:175\n*S KotlinDebug\n*F\n+ 1 ReturnCardFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/auth/ReturnCardFragment\n*L\n84#1:174\n88#1:175\n*E\n"})
public final class ReturnCardFragment extends BaseCardFragment<CardReturnNoticeViewModel, xng> {
    public static final int REQUEST_ALIPAY_AUTH_CODE = 110011;

    @NotNull
    private String authCode;

    @NotNull
    private String payAccountType;

    @NotNull
    private RefundChannelInfo refundChannelInfo;

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.auth.ReturnCardFragment$handleMessage$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.auth.ReturnCardFragment$handleMessage$2", f = "ReturnCardFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReturnCardFragment.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ReturnCardFragment.access$getMBinding(ReturnCardFragment.this).A.setText(ApplicationExtKt.getApplication().getString(o0j.V3));
            ReturnCardFragment.access$getMBinding(ReturnCardFragment.this).H.setText(ApplicationExtKt.getApplication().getString(o0j.P6));
            ReturnCardFragment.access$getMBinding(ReturnCardFragment.this).B.setEnabled(false);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ReturnCardFragment() {
        super(sui.D, 0, true);
        this.authCode = "";
        this.payAccountType = "";
        this.refundChannelInfo = (RefundChannelInfo) new Gson().fromJson("", new TypeToken<RefundChannelInfo>() { // from class: com.xiaomi.fitness.nfc.ui.issued.auth.ReturnCardFragment$special$$inlined$fromJson$1
        }.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ xng access$getMBinding(ReturnCardFragment returnCardFragment) {
        return (xng) returnCardFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CardReturnNoticeViewModel access$getMViewModel(ReturnCardFragment returnCardFragment) {
        return (CardReturnNoticeViewModel) returnCardFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$4(final ReturnCardFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardReturnNoticeViewModel cardReturnNoticeViewModel = (CardReturnNoticeViewModel) this$0.getMViewModel();
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        RefundChannelInfo refundChannelInfo = this$0.refundChannelInfo;
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        SeCard mSeCard = cardWrapper.mSeCard;
        Intrinsics.checkNotNullExpressionValue(mSeCard, "mSeCard");
        cardReturnNoticeViewModel.authInfo(mActivity, refundChannelInfo, mSeCard, new Function1() { // from class: ntk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ReturnCardFragment.bindView$lambda$4$lambda$2(this.f28359a, (RefundAuthorizationInfo) obj);
            }
        }, new Function1() { // from class: otk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ReturnCardFragment.bindView$lambda$4$lambda$3(this.f29671a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$2(final ReturnCardFragment this$0, final RefundAuthorizationInfo refundAuthorizationInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vqg.d("alipay auth authorizationInfo = " + (refundAuthorizationInfo != null ? refundAuthorizationInfo.getAuthorizationInfo() : null));
        if (refundAuthorizationInfo == null) {
            return Unit.INSTANCE;
        }
        new Thread(new Runnable() { // from class: mtk
            @Override // java.lang.Runnable
            public final void run() {
                ReturnCardFragment.bindView$lambda$4$lambda$2$lambda$1(this.f27201a, refundAuthorizationInfo);
            }
        }).start();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$4$lambda$2$lambda$1(ReturnCardFragment this$0, RefundAuthorizationInfo refundAuthorizationInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Map<String, String> mapAuthV2 = new AuthTask(this$0.getMActivity()).authV2(refundAuthorizationInfo.getAuthorizationInfo(), true);
        Message message = new Message();
        message.what = REQUEST_ALIPAY_AUTH_CODE;
        message.obj = mapAuthV2;
        this$0.handleMessage(this$0.getMActivity(), message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$3(ReturnCardFragment this$0, String str) {
        FragmentActivity mActivity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null && str.length() != 0 && (mActivity = this$0.getMActivity()) != null) {
            ToastExtKt.toastShort(mActivity, str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$5(ReturnCardFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new CommonDialog.c("commonDialog").setDialogTitle(o0j.Q).setDialogDescriptionString(new DialogParams.DialogDescriptionString(o0j.n6, new Object[0])).setNegativeText(o0j.O).setPositiveText(o0j.e).setCanceledOnBackPressed(false).create().addDialogCallback(new ReturnCardFragment$bindView$2$1(this$0)).show(this$0.getParentFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToResultPage(boolean isSuccess, String msg) {
        Bundle bundle = new Bundle();
        CardReturnResultFragment.Companion companion = CardReturnResultFragment.INSTANCE;
        bundle.putBoolean(companion.getKEY_IS_SUCCESS(), isSuccess);
        bundle.putString(companion.getKEY_HINT_MSG(), msg);
        gotoPageForResult(CardReturnResultFragment.class, bundle, CardReturnUserInfoFragment.INSTANCE.getSRequestCodeResult());
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleMessage(Context context, Message msg) {
        Integer numValueOf = msg != null ? Integer.valueOf(msg.what) : null;
        if (numValueOf != null && numValueOf.intValue() == 110011) {
            Object obj = msg.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String?, kotlin.String?>");
            uq1 uq1Var = new uq1((Map) obj, true);
            String strC = uq1Var.c();
            Intrinsics.checkNotNullExpressionValue(strC, "getResultStatus(...)");
            vqg.d("alipay auth authorizationInfo resultStatus = " + strC + ",resultCode = " + uq1Var.b());
            if (!Intrinsics.areEqual(strC, "9000") || !Intrinsics.areEqual(uq1Var.b(), "200")) {
                AnyExtKt.main$default(null, new AnonymousClass2(null), 1, null);
                return;
            }
            String strA = uq1Var.a();
            if (strA == null) {
                strA = "";
            }
            this.authCode = strA;
            CardReturnNoticeViewModel cardReturnNoticeViewModel = (CardReturnNoticeViewModel) getMViewModel();
            RefundChannelInfo refundChannelInfo = this.refundChannelInfo;
            CardWrapper cardWrapper = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper);
            SeCard mSeCard = cardWrapper.mSeCard;
            Intrinsics.checkNotNullExpressionValue(mSeCard, "mSeCard");
            String strA2 = uq1Var.a();
            Intrinsics.checkNotNullExpressionValue(strA2, "getAuthCode(...)");
            cardReturnNoticeViewModel.bindAuthorization(refundChannelInfo, mSeCard, strA2, new Function1() { // from class: ptk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ReturnCardFragment.handleMessage$lambda$0(this.f30759a, (Boolean) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleMessage$lambda$0(ReturnCardFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new ReturnCardFragment$handleMessage$1$1(bool, this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull xng xngVar) {
        Intrinsics.checkNotNullParameter(xngVar, "<this>");
        xngVar.H.setOnClickListener(new View.OnClickListener() { // from class: ktk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReturnCardFragment.bindView$lambda$4(this.f24283a, view);
            }
        });
        xngVar.B.setOnClickListener(new View.OnClickListener() { // from class: ltk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReturnCardFragment.bindView$lambda$5(this.f25425a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarNormalTitleMode();
        setTitle(getString(o0j.c6));
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        String string;
        super.setArguments(args);
        Gson gson = new Gson();
        if (args == null || (string = args.getString(CardReturnNoticeFragment.PARAM_AUTH_KEY)) == null) {
            string = "";
        }
        RefundChannelInfo refundChannelInfo = (RefundChannelInfo) gson.fromJson(string, new TypeToken<RefundChannelInfo>() { // from class: com.xiaomi.fitness.nfc.ui.issued.auth.ReturnCardFragment$setArguments$$inlined$fromJson$1
        }.getType());
        this.refundChannelInfo = refundChannelInfo;
        this.payAccountType = refundChannelInfo.getChannelName();
    }
}
