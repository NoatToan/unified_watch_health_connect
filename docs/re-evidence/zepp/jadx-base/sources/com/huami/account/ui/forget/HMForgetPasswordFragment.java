package com.huami.account.ui.forget;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.baseflow.permissionhandler.m;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.R;
import com.huami.account.ui.bind.PhoneBindPasswordActivity;
import com.huami.account.ui.common.entity.PhoneBaseForm;
import com.huami.account.ui.common.entity.PhoneLoginResponse;
import com.huami.account.ui.common.entity.PhoneLoginResponseKt;
import com.huami.account.ui.common.viewmodel.PhoneForgetViewModelFactory;
import com.huami.account.ui.forget.HMForgetPasswordFragment;
import com.huami.account.ui.forget.viewmodel.PhoneForgetPasswordViewModel;
import com.huami.account.utils.AccountConstants;
import com.huami.account.utils.UtilsKt;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.passport.ErrorCode;
import com.huami.passport.entity.SmsCode;
import com.huami.passport.user.IAuthService;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.NetUtil;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 A2\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0006\u0010\u0017\u001a\u00020\u0004R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010(\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010-\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u001d\u0010/\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b.\u0010'R\u001d\u00102\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b0\u00101R\u001d\u00103\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b*\u00101R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u0004048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00105R\"\u0010;\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0004078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010>\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0004078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010:¨\u0006B"}, d2 = {"Lcom/huami/account/ui/forget/HMForgetPasswordFragment;", "Lcom/huami/account/ui/forget/HMPhoneFragment;", "Lcom/huami/account/ui/forget/HMPhoneActivity;", "activity", "", GoogleApiAvailabilityLight.b, "Lkotlinx/coroutines/Job;", "f", "", "getTitleRes", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "initView", "Lcom/huami/account/ui/forget/viewmodel/PhoneForgetPasswordViewModel;", "c", "Lcom/huami/account/ui/forget/viewmodel/PhoneForgetPasswordViewModel;", "phoneForgetPasswordViewModel", "Lcom/huami/account/ui/common/entity/PhoneBaseForm;", GoogleApiAvailabilityLight.a, "Lcom/huami/account/ui/common/entity/PhoneBaseForm;", "phoneSendCodeForm", "", "e", "Z", "isCountingDown", "Landroid/widget/EditText;", "Lkotlin/Lazy;", "h", "()Landroid/widget/EditText;", "inputPhoneNumber", "Landroid/widget/TextView;", "g", hl.k, "()Landroid/widget/TextView;", "sendVerifyBtn", "i", "inputVerificationCode", z.j, "()Landroid/view/View;", "inputVerificationCodeHint", "confirmBtn", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "onLoading", "Lkotlin/Function1;", "", "l", "Lkotlin/jvm/functions/Function1;", "onSuccess", "Lcom/huami/passport/ErrorCode;", "m", "onError", "<init>", "()V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class HMForgetPasswordFragment extends HMPhoneFragment {

    @NotNull
    public static final String ARG_INITIAL_PHONE = "initial_phone";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int RESEND_DELAY_SECONDS = 60;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private PhoneForgetPasswordViewModel phoneForgetPasswordViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private PhoneBaseForm phoneSendCodeForm;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isCountingDown;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputPhoneNumber = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendVerifyBtn = LazyKt__LazyJVMKt.lazy(new k());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputVerificationCode = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputVerificationCodeHint = LazyKt__LazyJVMKt.lazy(new h());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy confirmBtn = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onLoading = new j();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Function1<String, Unit> onSuccess = new Function1<String, Unit>() { // from class: com.huami.account.ui.forget.HMForgetPasswordFragment$onSuccess$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            FragmentActivity activity = this.a.getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.account.ui.forget.HMPhoneActivity");
            String string = this.a.getResources().getString(R.string.account_ui_account_sms_send_success);
            final HMForgetPasswordFragment hMForgetPasswordFragment = this.a;
            ((HMPhoneActivity) activity).setSuccessDialog$accountui_release(string, new LoadingDialog.OnAnimEndListener() { // from class: com.huami.account.ui.forget.HMForgetPasswordFragment$onSuccess$1.1
                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onAnimEnd(@Nullable LoadingDialog dialog) {
                    hMForgetPasswordFragment.i().requestFocus();
                }

                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onDismiss(@Nullable LoadingDialog dialog) {
                }
            });
            this.a.f();
        }
    };

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Function1<ErrorCode, Unit> onError = new i();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/account/ui/forget/HMForgetPasswordFragment$Companion;", "", "", "initialPhone", "Lcom/huami/account/ui/forget/HMForgetPasswordFragment;", "newInstance", "ARG_INITIAL_PHONE", "Ljava/lang/String;", "", "RESEND_DELAY_SECONDS", LogUtil.I, "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HMForgetPasswordFragment newInstance(@Nullable String initialPhone) {
            Bundle bundle = new Bundle();
            bundle.putString("initial_phone", initialPhone);
            HMForgetPasswordFragment hMForgetPasswordFragment = new HMForgetPasswordFragment();
            hMForgetPasswordFragment.setArguments(bundle);
            return hMForgetPasswordFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<View> {
        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final View getA() {
            return UtilsKt.findViewById(HMForgetPasswordFragment.this, R.id.confirm_btn);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.ui.forget.HMForgetPasswordFragment$enableResendAfterDelay$1", f = "HMForgetPasswordFragment.kt", i = {0}, l = {m.c}, m = "invokeSuspend", n = {"timeRemain"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMForgetPasswordFragment.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004a  */
        /* JADX WARN: Code duplicated, block: B:12:0x007d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007b -> B:13:0x007e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.e
                r2 = 60
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 != r4) goto L20
                int r1 = r9.d
                int r2 = r9.c
                java.lang.Object r5 = r9.b
                com.huami.account.ui.forget.HMForgetPasswordFragment r5 = (com.huami.account.ui.forget.HMForgetPasswordFragment) r5
                java.lang.Object r6 = r9.a
                kotlin.jvm.internal.Ref$IntRef r6 = (kotlin.jvm.internal.Ref.IntRef) r6
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r1
                r1 = r9
                goto L7e
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                kotlin.ResultKt.throwOnFailure(r10)
                com.huami.account.ui.forget.HMForgetPasswordFragment r10 = com.huami.account.ui.forget.HMForgetPasswordFragment.this
                com.huami.account.ui.forget.HMForgetPasswordFragment.access$setCountingDown$p(r10, r4)
                com.huami.account.ui.forget.HMForgetPasswordFragment r10 = com.huami.account.ui.forget.HMForgetPasswordFragment.this
                android.widget.TextView r10 = com.huami.account.ui.forget.HMForgetPasswordFragment.access$getSendVerifyBtn(r10)
                r10.setEnabled(r3)
                kotlin.jvm.internal.Ref$IntRef r10 = new kotlin.jvm.internal.Ref$IntRef
                r10.<init>()
                r10.element = r2
                com.huami.account.ui.forget.HMForgetPasswordFragment r1 = com.huami.account.ui.forget.HMForgetPasswordFragment.this
                r6 = r10
                r5 = r1
                r10 = 60
                r2 = 0
                r1 = r9
            L48:
                if (r2 >= r10) goto L86
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
                r7.intValue()
                int r7 = r6.element
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r7)
                java.lang.String r7 = "s"
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                android.widget.TextView r8 = com.huami.account.ui.forget.HMForgetPasswordFragment.access$getSendVerifyBtn(r5)
                r8.setText(r7)
                r7 = 1000(0x3e8, double:4.94E-321)
                r1.a = r6
                r1.b = r5
                r1.c = r2
                r1.d = r10
                r1.e = r4
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r7, r1)
                if (r7 != r0) goto L7e
                return r0
            L7e:
                int r7 = r6.element
                int r7 = r7 + (-1)
                r6.element = r7
                int r2 = r2 + r4
                goto L48
            L86:
                com.huami.account.ui.forget.HMForgetPasswordFragment r10 = com.huami.account.ui.forget.HMForgetPasswordFragment.this
                com.huami.account.ui.forget.HMForgetPasswordFragment.access$setCountingDown$p(r10, r3)
                com.huami.account.ui.forget.HMForgetPasswordFragment r10 = com.huami.account.ui.forget.HMForgetPasswordFragment.this
                android.widget.TextView r10 = com.huami.account.ui.forget.HMForgetPasswordFragment.access$getSendVerifyBtn(r10)
                com.huami.account.ui.forget.HMForgetPasswordFragment r0 = com.huami.account.ui.forget.HMForgetPasswordFragment.this
                android.content.res.Resources r0 = r0.getResources()
                int r2 = com.huami.account.ui.R.string.account_ui_register_phone_resend_code
                java.lang.String r0 = r0.getString(r2)
                r10.setText(r0)
                com.huami.account.ui.forget.HMForgetPasswordFragment r10 = com.huami.account.ui.forget.HMForgetPasswordFragment.this
                android.widget.TextView r10 = com.huami.account.ui.forget.HMForgetPasswordFragment.access$getSendVerifyBtn(r10)
                r10.setEnabled(r4)
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.account.ui.forget.HMForgetPasswordFragment.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HMPhoneActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMPhoneActivity hMPhoneActivity) {
            super(0);
            this.a = hMPhoneActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.showLoginDialog(R.string.account_ui_phone_code_in_verify);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/entity/SmsCode;", PhoneBindPasswordActivity.EXTRA_SMS_CODE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<SmsCode, Unit> {
        public final /* synthetic */ HMPhoneActivity a;
        public final /* synthetic */ HMForgetPasswordFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMPhoneActivity hMPhoneActivity, HMForgetPasswordFragment hMForgetPasswordFragment) {
            super(1);
            this.a = hMPhoneActivity;
            this.b = hMForgetPasswordFragment;
        }

        public final void a(@NotNull SmsCode smsCode) {
            this.a.hideLoadingDialog();
            PhoneForgetPasswordViewModel phoneForgetPasswordViewModel = this.b.phoneForgetPasswordViewModel;
            Objects.requireNonNull(phoneForgetPasswordViewModel);
            phoneForgetPasswordViewModel.getSmsCodeLiveData$accountui_release().postValue(smsCode);
            this.a.commitFragment(new HMResetPasswordFragment(), false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SmsCode smsCode) {
            a(smsCode);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/ErrorCode;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<ErrorCode, Unit> {
        public final /* synthetic */ HMPhoneActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMPhoneActivity hMPhoneActivity) {
            super(1);
            this.b = hMPhoneActivity;
        }

        public final void a(@NotNull ErrorCode errorCode) {
            HMForgetPasswordFragment.this.i().setText("");
            this.b.setFailedDialog$accountui_release(HMForgetPasswordFragment.this.getResources().getString(R.string.account_ui_phone_code_verify_failed));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ErrorCode errorCode) {
            a(errorCode);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<EditText> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) UtilsKt.findViewById(HMForgetPasswordFragment.this, R.id.input_phone_number);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<EditText> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) UtilsKt.findViewById(HMForgetPasswordFragment.this, R.id.input_verification_code);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<View> {
        public h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final View getA() {
            return UtilsKt.findViewById(HMForgetPasswordFragment.this, R.id.input_verification_code_hint);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/ErrorCode;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<ErrorCode, Unit> {
        public i() {
            super(1);
        }

        public final void a(@NotNull ErrorCode errorCode) {
            String errorCode2 = errorCode.getErrorCode();
            if (Intrinsics.areEqual(errorCode2, "404")) {
                FragmentActivity activity = HMForgetPasswordFragment.this.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.account.ui.forget.HMPhoneActivity");
                ((HMPhoneActivity) activity).setFailedDialog$accountui_release(HMForgetPasswordFragment.this.getResources().getString(R.string.account_ui_phone_not_register));
            } else if (Intrinsics.areEqual(errorCode2, "429")) {
                FragmentActivity activity2 = HMForgetPasswordFragment.this.getActivity();
                Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.huami.account.ui.forget.HMPhoneActivity");
                ((HMPhoneActivity) activity2).setFailedDialog$accountui_release(HMForgetPasswordFragment.this.getResources().getString(UtilsKt.toSmsLimitPrompt(errorCode.getMessage())));
            } else {
                FragmentActivity activity3 = HMForgetPasswordFragment.this.getActivity();
                Objects.requireNonNull(activity3, "null cannot be cast to non-null type com.huami.account.ui.forget.HMPhoneActivity");
                ((HMPhoneActivity) activity3).setFailedDialog$accountui_release(R.string.account_ui_phone_request_reset_pwd_code_failed);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ErrorCode errorCode) {
            a(errorCode);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Unit> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FragmentActivity activity = HMForgetPasswordFragment.this.getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.account.ui.forget.HMPhoneActivity");
            ((HMPhoneActivity) activity).showLoginDialog(R.string.account_ui_phone_code_sending);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<TextView> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) UtilsKt.findViewById(HMForgetPasswordFragment.this, R.id.send_verify_btn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job f() {
        return kotlinx.coroutines.e.f(this, null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View g() {
        return (View) this.confirmBtn.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText h() {
        return (EditText) this.inputPhoneNumber.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText i() {
        return (EditText) this.inputVerificationCode.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View j() {
        return (View) this.inputVerificationCodeHint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView k() {
        return (TextView) this.sendVerifyBtn.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(HMForgetPasswordFragment hMForgetPasswordFragment, View view) {
        if (!UtilsKt.isPhoneNumFormat(hMForgetPasswordFragment.h().getText().toString())) {
            IconToast.showError(hMForgetPasswordFragment.requireContext(), hMForgetPasswordFragment.getString(R.string.account_ui_login_phone_format_error));
        } else if (hMForgetPasswordFragment.checkNetWork()) {
            PhoneForgetPasswordViewModel phoneForgetPasswordViewModel = hMForgetPasswordFragment.phoneForgetPasswordViewModel;
            Objects.requireNonNull(phoneForgetPasswordViewModel);
            phoneForgetPasswordViewModel.postSendCodeForm(hMForgetPasswordFragment.h().getText().toString(), AccountConstants.DEFAULT_AREA_CODE, "CN");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(HMForgetPasswordFragment hMForgetPasswordFragment, View view) {
        if (!NetUtil.isNetworkConnected(hMForgetPasswordFragment.getActivity())) {
            hMForgetPasswordFragment.i().setText("");
            IconToast.showError(hMForgetPasswordFragment.requireContext(), hMForgetPasswordFragment.getString(R.string.account_ui_no_network_connection));
            return;
        }
        String string = hMForgetPasswordFragment.i().getText().toString();
        PhoneBaseForm phoneBaseForm = hMForgetPasswordFragment.phoneSendCodeForm;
        if (phoneBaseForm == null) {
            return;
        }
        PhoneForgetPasswordViewModel phoneForgetPasswordViewModel = hMForgetPasswordFragment.phoneForgetPasswordViewModel;
        Objects.requireNonNull(phoneForgetPasswordViewModel);
        phoneForgetPasswordViewModel.postVerifyForm(phoneBaseForm.getPhoneNumber(), phoneBaseForm.getAreaCode(), string, IAuthService.CODETYPE.FIND_PASSWORD_CODE_TYPE);
    }

    private final void n(final HMPhoneActivity activity) {
        PhoneForgetPasswordViewModel phoneForgetPasswordViewModel = (PhoneForgetPasswordViewModel) new ViewModelProvider(activity, new PhoneForgetViewModelFactory(activity.getApplication())).get(PhoneForgetPasswordViewModel.class);
        this.phoneForgetPasswordViewModel = phoneForgetPasswordViewModel;
        Objects.requireNonNull(phoneForgetPasswordViewModel);
        phoneForgetPasswordViewModel.getSendVerifyCodeFormLiveData().observe(this, new Observer() { // from class: vu2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMForgetPasswordFragment.o(this.a, (PhoneBaseForm) obj);
            }
        });
        PhoneForgetPasswordViewModel phoneForgetPasswordViewModel2 = this.phoneForgetPasswordViewModel;
        Objects.requireNonNull(phoneForgetPasswordViewModel2);
        phoneForgetPasswordViewModel2.getGetVerifyCodeResponse().observe(this, new Observer() { // from class: wu2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMForgetPasswordFragment.p(this.a, (PhoneLoginResponse) obj);
            }
        });
        PhoneForgetPasswordViewModel phoneForgetPasswordViewModel3 = this.phoneForgetPasswordViewModel;
        Objects.requireNonNull(phoneForgetPasswordViewModel3);
        phoneForgetPasswordViewModel3.getPhoneVerifyResponse$accountui_release().observe(this, new Observer() { // from class: xu2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMForgetPasswordFragment.q(activity, this, (PhoneLoginResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(HMForgetPasswordFragment hMForgetPasswordFragment, PhoneBaseForm phoneBaseForm) {
        hMForgetPasswordFragment.phoneSendCodeForm = phoneBaseForm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(HMForgetPasswordFragment hMForgetPasswordFragment, PhoneLoginResponse phoneLoginResponse) {
        PhoneLoginResponseKt.deal(phoneLoginResponse, hMForgetPasswordFragment.onLoading, hMForgetPasswordFragment.onSuccess, hMForgetPasswordFragment.onError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HMPhoneActivity hMPhoneActivity, HMForgetPasswordFragment hMForgetPasswordFragment, PhoneLoginResponse phoneLoginResponse) {
        PhoneLoginResponseKt.deal(phoneLoginResponse, new c(hMPhoneActivity), new d(hMPhoneActivity, hMForgetPasswordFragment), hMForgetPasswordFragment.new e(hMPhoneActivity));
    }

    @Override // com.huami.account.ui.forget.HMPhoneFragment
    public int getTitleRes() {
        return R.string.account_ui_phone_forget_password_title;
    }

    public final void initView() {
        h().addTextChangedListener(new TextWatcher() { // from class: com.huami.account.ui.forget.HMForgetPasswordFragment$initView$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                this.a.k().setEnabled((this.a.h().getText().toString().length() > 0) && !this.a.isCountingDown);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        i().addTextChangedListener(new TextWatcher() { // from class: com.huami.account.ui.forget.HMForgetPasswordFragment$initView$$inlined$doAfterTextChanged$2
            /* JADX WARN: Code duplicated, block: B:15:0x0044  */
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                boolean z;
                String string = this.a.h().getText().toString();
                String string2 = this.a.i().getText().toString();
                View viewG = this.a.g();
                boolean z2 = true;
                if (string.length() > 0) {
                    if (!(string2.length() > 0) || this.a.phoneSendCodeForm == null) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                viewG.setEnabled(z);
                View viewJ = this.a.j();
                if (s != null && s.length() != 0) {
                    z2 = false;
                }
                viewJ.setVisibility(z2 ? 0 : 8);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        k().setOnClickListener(new View.OnClickListener() { // from class: tu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMForgetPasswordFragment.l(this.a, view);
            }
        });
        g().setOnClickListener(new View.OnClickListener() { // from class: uu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMForgetPasswordFragment.m(this.a, view);
            }
        });
        Bundle arguments = getArguments();
        String string = arguments == null ? null : arguments.getString("initial_phone");
        if (string == null || !(!kotlin.text.m.isBlank(string))) {
            return;
        }
        h().setText(string);
        i().requestFocus();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        HMPhoneActivity hMPhoneActivity = activity instanceof HMPhoneActivity ? (HMPhoneActivity) activity : null;
        if (hMPhoneActivity == null) {
            return;
        }
        n(hMPhoneActivity);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.account_ui_fragment_reset_password_by_phone, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }
}
