package com.huami.account.ui.register;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.AccountStatEvent;
import com.huami.account.HMProcessLoginDataManager;
import com.huami.account.service.model.Area;
import com.huami.account.service.model.SubArea;
import com.huami.account.ui.R;
import com.huami.account.ui.common.LoadingDialogContainerKt;
import com.huami.account.ui.common.LoadingDialogHelper;
import com.huami.account.ui.register.EmailRegisterFormFragment;
import com.huami.account.ui.view.VerificationCodeView;
import com.huami.account.utils.UtilsKt;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.http.serverfault.handler.AccountFaultHandler;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.LoginInfo;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0007*\u0003BEH\u0018\u0000 M2\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0016\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J&\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010!\u001a\u00020\u0004H\u0016R\u001d\u0010'\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010.\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010-R\u001d\u00101\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b0\u0010-R\u001d\u00105\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b3\u00104R\u001d\u00107\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b6\u00104R\u001d\u00109\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b8\u00104R\u001d\u0010=\u001a\u00020:8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b;\u0010<R\u001d\u0010A\u001a\u00020>8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010$\u001a\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010CR\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010FR\u0016\u0010J\u001a\u00020H8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010I¨\u0006N"}, d2 = {"Lcom/huami/account/ui/register/EmailRegisterFormFragment;", "Lcom/huami/account/ui/register/BaseRegisterFragment;", "", SOAP.XMLNS, "", "x", "", "res", "w", "o", DTransferConstants.SEARCH_KEY, "m", "Lcom/huami/passport/entity/LoginInfo;", "result", "v", "u", "Lcom/huami/account/service/model/Area;", "countryCode", "setArea", "updateBtnState", "", "code", "analyticsEmailRegisterResult", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "isFormEmpty", "Lcom/huami/passport/AccountManager;", "a", "Lkotlin/Lazy;", "l", "()Lcom/huami/passport/AccountManager;", "mAccountManager", "b", "Lcom/huami/account/service/model/Area;", "mCountryCode", "c", "f", "()Landroid/view/View;", "hmEmailError", GoogleApiAvailabilityLight.a, "e", "hmEmailBtn", "Landroid/widget/EditText;", "g", "()Landroid/widget/EditText;", "hmEmailInputEmail", "h", "hmEmailInputPassword", z.j, "hmEmailVerificationCode", "Landroid/widget/ImageView;", "i", "()Landroid/widget/ImageView;", "hmEmailInputPasswordShow", "Lcom/huami/account/ui/view/VerificationCodeView;", hl.k, "()Lcom/huami/account/ui/view/VerificationCodeView;", "hmEmailVerificationCodeImage", "com/huami/account/ui/register/EmailRegisterFormFragment$mTextWatcher$1", "Lcom/huami/account/ui/register/EmailRegisterFormFragment$mTextWatcher$1;", "mTextWatcher", "com/huami/account/ui/register/EmailRegisterFormFragment$mLoginCallback$1", "Lcom/huami/account/ui/register/EmailRegisterFormFragment$mLoginCallback$1;", "mLoginCallback", "com/huami/account/ui/register/EmailRegisterFormFragment$mRegisterCallback$1", "Lcom/huami/account/ui/register/EmailRegisterFormFragment$mRegisterCallback$1;", "mRegisterCallback", "<init>", "()V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class EmailRegisterFormFragment extends BaseRegisterFragment {

    @NotNull
    private static final String m = "EmailRegisterFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Area mCountryCode;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAccountManager = LazyKt__LazyJVMKt.lazy(new h());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmEmailError = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmEmailBtn = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmEmailInputEmail = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmEmailInputPassword = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmEmailVerificationCode = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmEmailInputPasswordShow = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmEmailVerificationCodeImage = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final EmailRegisterFormFragment$mTextWatcher$1 mTextWatcher = new TextWatcher() { // from class: com.huami.account.ui.register.EmailRegisterFormFragment$mTextWatcher$1
        @Override // android.text.TextWatcher
        public void afterTextChanged(@NotNull Editable s) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@NotNull CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@NotNull CharSequence s, int start, int before, int count) {
            this.a.updateBtnState();
        }
    };

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final EmailRegisterFormFragment$mLoginCallback$1 mLoginCallback = new EmailRegisterFormFragment$mLoginCallback$1(this);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final EmailRegisterFormFragment$mRegisterCallback$1 mRegisterCallback = new IAccount.Callback<LoginInfo, ErrorCode>() { // from class: com.huami.account.ui.register.EmailRegisterFormFragment$mRegisterCallback$1
        @Override // com.huami.passport.IAccount.Callback
        public void onError(@NotNull ErrorCode errorCode) {
            HMLog.i("EmailRegisterFragment", "onError:" + errorCode, new Object[0]);
            FragmentActivity activity = this.a.getActivity();
            boolean z = activity instanceof RegisterActivity;
            if (z) {
                if (Intrinsics.areEqual(HMProcessLoginDataManager.REGISTER_ERROR_EMAIL_HAD_REGISTERED, errorCode.getErrorCode())) {
                    RegisterActivity registerActivity = z ? (RegisterActivity) activity : null;
                    if (registerActivity == null) {
                        return;
                    }
                    registerActivity.onAlreadyRegister(this.a.g().getText().toString(), this.a.h().getText().toString());
                    return;
                }
                ((RegisterActivity) activity).getDialog$accountui_release().hideDialog();
                this.a.g().setText("");
                this.a.h().setText("");
                this.a.j().setText("");
                this.a.k().create();
                IconToast.showError(activity, this.a.getString(R.string.account_ui_login_email_regist_failed));
                this.a.analyticsEmailRegisterResult("Fail", String.valueOf(errorCode.getCode()));
            }
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onSuccess(@NotNull final LoginInfo loginInfo) {
            FragmentActivity activity = this.a.getActivity();
            if (activity instanceof RegisterActivity) {
                LoadingDialogHelper dialog$accountui_release = ((RegisterActivity) activity).getDialog$accountui_release();
                String string = this.a.getString(R.string.account_ui_login_email_regist_success);
                final EmailRegisterFormFragment emailRegisterFormFragment = this.a;
                dialog$accountui_release.setSuccess(string, new LoadingDialog.OnAnimEndListener() { // from class: com.huami.account.ui.register.EmailRegisterFormFragment$mRegisterCallback$1$onSuccess$1
                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onAnimEnd(@NotNull LoadingDialog dialog) {
                    }

                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onDismiss(@NotNull LoadingDialog dialog) {
                        emailRegisterFormFragment.v(loginInfo);
                    }
                });
                this.a.analyticsEmailRegisterResult("Success", "200");
            }
        }
    };

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
            return UtilsKt.findViewById(EmailRegisterFormFragment.this, R.id.hm_email_btn);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<View> {
        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final View getA() {
            return UtilsKt.findViewById(EmailRegisterFormFragment.this, R.id.hm_email_error);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<EditText> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) UtilsKt.findViewById(EmailRegisterFormFragment.this, R.id.hm_email_input_email);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<EditText> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) UtilsKt.findViewById(EmailRegisterFormFragment.this, R.id.hm_email_input_password);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<ImageView> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView getA() {
            return (ImageView) UtilsKt.findViewById(EmailRegisterFormFragment.this, R.id.hm_email_input_password_show);
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
            return (EditText) UtilsKt.findViewById(EmailRegisterFormFragment.this, R.id.hm_email_verification_code);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/account/ui/view/VerificationCodeView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<VerificationCodeView> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VerificationCodeView getA() {
            return (VerificationCodeView) UtilsKt.findViewById(EmailRegisterFormFragment.this, R.id.hm_email_verification_code_image);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/passport/AccountManager;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<AccountManager> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountManager getA() {
            return AccountManager.getDefault(EmailRegisterFormFragment.this.getActivity());
        }
    }

    private final View e() {
        return (View) this.hmEmailBtn.getValue();
    }

    private final View f() {
        return (View) this.hmEmailError.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText g() {
        return (EditText) this.hmEmailInputEmail.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText h() {
        return (EditText) this.hmEmailInputPassword.getValue();
    }

    private final ImageView i() {
        return (ImageView) this.hmEmailInputPasswordShow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText j() {
        return (EditText) this.hmEmailVerificationCode.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VerificationCodeView k() {
        return (VerificationCodeView) this.hmEmailVerificationCodeImage.getValue();
    }

    private final AccountManager l() {
        return (AccountManager) this.mAccountManager.getValue();
    }

    private final void m() {
        final FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        e().setOnClickListener(new View.OnClickListener() { // from class: vk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailRegisterFormFragment.n(this.a, activity, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(EmailRegisterFormFragment emailRegisterFormFragment, FragmentActivity fragmentActivity, View view) {
        String strSubstring;
        SubArea subArea;
        Analytics.recordEvent(new CountEventBuilder(AccountStatEvent.EVENT_REGISTER_ACCOUNT_SIGNUP).addExtra("type", "Email"));
        if (emailRegisterFormFragment.x()) {
            if (!NetUtil.isNetworkConnected(fragmentActivity)) {
                IconToast.showError(fragmentActivity, emailRegisterFormFragment.getString(R.string.account_ui_no_network_connection));
                return;
            }
            LoadingDialogContainerKt.showLoadingDialog(((RegisterActivity) fragmentActivity).getDialog$accountui_release(), R.string.account_ui_login_email_registing);
            String string = emailRegisterFormFragment.g().getText().toString();
            int length = string.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String string2 = string.subSequence(i, length + 1).toString();
            String string3 = emailRegisterFormFragment.h().getText().toString();
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string2, '@', 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                strSubstring = string2;
            } else {
                Objects.requireNonNull(string2, "null cannot be cast to non-null type java.lang.String");
                strSubstring = string2.substring(0, iIndexOf$default);
            }
            AccountManager accountManagerL = emailRegisterFormFragment.l();
            Area area = emailRegisterFormFragment.mCountryCode;
            String value = area == null ? null : area.getValue();
            Area area2 = emailRegisterFormFragment.mCountryCode;
            accountManagerL.registrations(strSubstring, string2, string3, null, value, (area2 == null || (subArea = area2.getSubArea()) == null) ? null : subArea.getValue(), emailRegisterFormFragment.mRegisterCallback);
        }
    }

    private final void o() {
        final int inputType = h().getInputType();
        i().setOnClickListener(new View.OnClickListener() { // from class: uk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailRegisterFormFragment.p(this.a, inputType, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(EmailRegisterFormFragment emailRegisterFormFragment, int i, View view) {
        if (emailRegisterFormFragment.h().getInputType() == i) {
            emailRegisterFormFragment.h().setInputType(144);
            emailRegisterFormFragment.i().setImageResource(R.drawable.account_ui_hm_email_eye_open);
        } else {
            emailRegisterFormFragment.h().setInputType(i);
            emailRegisterFormFragment.i().setImageResource(R.drawable.account_ui_hm_email_eye_close);
        }
        emailRegisterFormFragment.h().setTypeface(Typeface.MONOSPACE);
        emailRegisterFormFragment.h().setSelection(emailRegisterFormFragment.h().length());
    }

    private final void q() {
        AccountFaultHandler.INSTANCE.getShouldShowTip().observe(getViewLifecycleOwner(), new Observer() { // from class: wk1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EmailRegisterFormFragment.r(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(EmailRegisterFormFragment emailRegisterFormFragment, Boolean bool) {
        View view = emailRegisterFormFragment.getView();
        View viewFindViewById = view == null ? null : view.findViewById(R.id.server_fault_view);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    private final void s() {
        k().setOnClickListener(new View.OnClickListener() { // from class: tk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmailRegisterFormFragment.t(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(EmailRegisterFormFragment emailRegisterFormFragment, View view) {
        emailRegisterFormFragment.k().create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        FragmentActivity activity = getActivity();
        if (activity instanceof RegisterActivity) {
            String string = g().getText().toString();
            int length = string.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            ((RegisterActivity) activity).registerSuccessButLoginError(string.subSequence(i, length + 1).toString(), h().getText().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(LoginInfo result) {
        SubArea subArea;
        FragmentActivity activity = getActivity();
        if (activity instanceof RegisterActivity) {
            RegisterActivity registerActivity = (RegisterActivity) activity;
            LoadingDialogContainerKt.showLoadingDialog(registerActivity.getDialog$accountui_release(), R.string.account_ui_logining);
            registerActivity.saveUxPreference();
            AccountManager accountManagerL = l();
            Context applicationContext = registerActivity.getApplicationContext();
            String access = result.getAccess();
            Area area = this.mCountryCode;
            String value = area == null ? null : area.getValue();
            Area area2 = this.mCountryCode;
            accountManagerL.loginIdV2(applicationContext, "huami", access, value, (area2 == null || (subArea = area2.getSubArea()) == null) ? null : subArea.getValue(), false, false, this.mLoginCallback);
        }
    }

    private final void w(int res) {
        IconToast.showError(requireContext(), getString(res));
    }

    private final boolean x() {
        if (!UtilsKt.isEmailFormat(g().getText().toString())) {
            w(R.string.account_ui_login_email_email_format_error);
            return false;
        }
        if (h().getText().toString().length() < 8) {
            w(R.string.account_ui_login_email_password_length_error);
            return false;
        }
        if (!UtilsKt.validPassword(h().getText().toString())) {
            w(R.string.account_ui_login_email_password_format_error);
            return false;
        }
        if (k().verify(j().getText().toString())) {
            Analytics.recordEvent(new CountEventBuilder(AccountStatEvent.EVENT_SIGNUP_CAPTCHA_VERIFY).addExtra("Result", "Success"));
            return true;
        }
        w(R.string.account_ui_account_verify_code_wrong);
        Analytics.recordEvent(new CountEventBuilder(AccountStatEvent.EVENT_SIGNUP_CAPTCHA_VERIFY).addExtra("Result", "Fail"));
        return false;
    }

    public final void analyticsEmailRegisterResult(@NotNull String result, @NotNull String code) {
        Analytics.recordEvent(new CountEventBuilder(AccountStatEvent.EVENT_SIGNUP_RESULT).putExtras(r.mapOf(TuplesKt.to("Result", result), TuplesKt.to("Source", "Email"), TuplesKt.to("Code", code))));
    }

    @Override // com.huami.account.ui.register.BaseRegisterFragment
    public boolean isFormEmpty() {
        return g().length() == 0 && h().length() == 0 && j().length() == 0;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.account_ui_fragment_email_register, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        FragmentActivity activity;
        super.onViewCreated(view, savedInstanceState);
        if (Build.VERSION.SDK_INT >= 26 && (activity = getActivity()) != null) {
            activity.getWindow().getDecorView().setImportantForAutofill(8);
        }
        g().addTextChangedListener(this.mTextWatcher);
        g().setTypeface(Typeface.MONOSPACE);
        h().addTextChangedListener(this.mTextWatcher);
        h().setTypeface(Typeface.MONOSPACE);
        j().addTextChangedListener(this.mTextWatcher);
        s();
        m();
        o();
        q();
        BaseRegisterFragmentKt.setupPasswordVisible(h(), i());
    }

    public final void setArea(@NotNull Area countryCode) {
        this.mCountryCode = countryCode;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00bc  */
    @Override // com.huami.account.ui.register.BaseRegisterFragment
    public void updateBtnState() {
        boolean z;
        f().setVisibility(8);
        View viewE = e();
        String string = g().getText().toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            boolean z3 = Intrinsics.compare((int) string.charAt(!z2 ? i : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                } else {
                    length--;
                }
            } else if (z3) {
                i++;
            } else {
                z2 = true;
            }
        }
        if (string.subSequence(i, length + 1).toString().length() > 0) {
            if (h().getText().toString().length() > 0) {
                if (j().getText().toString().length() > 0) {
                    FragmentActivity activity = getActivity();
                    RegisterActivity registerActivity = activity instanceof RegisterActivity ? (RegisterActivity) activity : null;
                    if (registerActivity != null && registerActivity.getHasSelectedArea()) {
                        FragmentActivity activity2 = getActivity();
                        RegisterActivity registerActivity2 = activity2 instanceof RegisterActivity ? (RegisterActivity) activity2 : null;
                        z = registerActivity2 != null && registerActivity2.isAgreementChecked();
                    }
                }
            }
        }
        viewE.setEnabled(z);
    }
}
