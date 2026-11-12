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
import androidx.p008lifecycle.ViewModelProviders;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.R;
import com.huami.account.ui.bind.PhoneBindPasswordActivity;
import com.huami.account.ui.common.entity.PhoneBaseForm;
import com.huami.account.ui.common.entity.PhoneLoginResponse;
import com.huami.account.ui.common.entity.PhoneLoginResponseKt;
import com.huami.account.ui.common.viewmodel.PhoneRegisterViewModelFactory;
import com.huami.account.ui.forget.HMResetPasswordFragment;
import com.huami.account.ui.forget.entity.ChangePasswordForm;
import com.huami.account.ui.forget.entity.ChangePasswordResult;
import com.huami.account.ui.forget.viewmodel.PhoneForgetPasswordViewModel;
import com.huami.account.utils.ResponseConstant;
import com.huami.account.utils.UtilsKt;
import com.huami.passport.ErrorCode;
import com.huami.passport.entity.SmsCode;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.IconToast;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b4\u00105J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0006\u0010\u001a\u001a\u00020\tR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010/\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b$\u0010.R\u001d\u00100\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b'\u0010.R\u001d\u00103\u001a\u0002018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b-\u00102¨\u00067"}, d2 = {"Lcom/huami/account/ui/forget/HMResetPasswordFragment;", "Lcom/huami/account/ui/forget/HMPhoneFragment;", "", "origin", "confirm", "", GoogleApiAvailabilityLight.b, "Landroidx/fragment/app/FragmentActivity;", "activity", "", "i", "", "getTitleRes", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "initViews", "Lcom/huami/account/ui/forget/viewmodel/PhoneForgetPasswordViewModel;", "c", "Lcom/huami/account/ui/forget/viewmodel/PhoneForgetPasswordViewModel;", "phoneForgetPasswordViewModel", "Lcom/huami/account/ui/common/entity/PhoneBaseForm;", GoogleApiAvailabilityLight.a, "Lcom/huami/account/ui/common/entity/PhoneBaseForm;", "sendCodeForm", "Lcom/huami/passport/entity/SmsCode;", "e", "Lcom/huami/passport/entity/SmsCode;", PhoneBindPasswordActivity.EXTRA_SMS_CODE, "f", "Lkotlin/Lazy;", "h", "()Landroid/view/View;", "registerBtn", "Landroid/widget/EditText;", "g", "()Landroid/widget/EditText;", "evPassword", "evPasswordConfirm", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "phoneLoginTitle", "<init>", "()V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class HMResetPasswordFragment extends HMPhoneFragment {
    public static final int PASSWORD_MIN_LENGTH = 8;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private PhoneForgetPasswordViewModel phoneForgetPasswordViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private PhoneBaseForm sendCodeForm;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private SmsCode smsCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy registerBtn = LazyKt__LazyJVMKt.lazy(new h());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy evPassword = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy evPasswordConfirm = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy phoneLoginTitle = LazyKt__LazyJVMKt.lazy(new g());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<EditText> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) UtilsKt.findViewById(HMResetPasswordFragment.this, R.id.ev_password);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<EditText> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) UtilsKt.findViewById(HMResetPasswordFragment.this, R.id.ev_password_confirm);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ FragmentActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FragmentActivity fragmentActivity) {
            super(0);
            this.a = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((HMPhoneActivity) this.a).showLoginDialog(R.string.account_ui_password_changing);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/account/ui/forget/entity/ChangePasswordResult;", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<ChangePasswordResult, Unit> {
        public final /* synthetic */ FragmentActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FragmentActivity fragmentActivity) {
            super(1);
            this.a = fragmentActivity;
        }

        public final void a(@NotNull ChangePasswordResult changePasswordResult) {
            ((HMPhoneActivity) this.a).hideLoadingDialog();
            ChangePasswordForm changePasswordForm = changePasswordResult.getChangePasswordForm();
            ((HMPhoneActivity) this.a).commitFragment(ResetPwdSuccessFragment.INSTANCE.newInstance(changePasswordForm.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_NUMBER java.lang.String(), changePasswordForm.getPassword()), false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChangePasswordResult changePasswordResult) {
            a(changePasswordResult);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/ErrorCode;", "errorCode", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<ErrorCode, Unit> {
        public final /* synthetic */ FragmentActivity a;
        public final /* synthetic */ HMResetPasswordFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FragmentActivity fragmentActivity, HMResetPasswordFragment hMResetPasswordFragment) {
            super(1);
            this.a = fragmentActivity;
            this.b = hMResetPasswordFragment;
        }

        public final void a(@NotNull ErrorCode errorCode) {
            String errorCode2 = errorCode.getErrorCode();
            if (Intrinsics.areEqual(errorCode2, ResponseConstant.ERROR_400)) {
                ((HMPhoneActivity) this.a).setFailedDialog$accountui_release(this.b.getResources().getString(R.string.account_ui_change_password_same_password));
            } else if (Intrinsics.areEqual(errorCode2, "401")) {
                ((HMPhoneActivity) this.a).setFailedDialog$accountui_release(this.b.getResources().getString(R.string.account_ui_change_password_failed));
            } else {
                ((HMPhoneActivity) this.a).setFailedDialog$accountui_release(this.b.getResources().getString(R.string.account_ui_change_password_failed));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ErrorCode errorCode) {
            a(errorCode);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/text/Editable;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Editable, Unit> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
            invoke2(editable);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Editable editable) {
            View viewH = HMResetPasswordFragment.this.h();
            HMResetPasswordFragment hMResetPasswordFragment = HMResetPasswordFragment.this;
            viewH.setEnabled(hMResetPasswordFragment.n(hMResetPasswordFragment.e().getText().toString(), HMResetPasswordFragment.this.f().getText().toString()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<TextView> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) UtilsKt.findViewById(HMResetPasswordFragment.this, R.id.phone_login_title);
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
            return UtilsKt.findViewById(HMResetPasswordFragment.this, R.id.hm_phone_post_register_btn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText e() {
        return (EditText) this.evPassword.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText f() {
        return (EditText) this.evPasswordConfirm.getValue();
    }

    private final TextView g() {
        return (TextView) this.phoneLoginTitle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View h() {
        return (View) this.registerBtn.getValue();
    }

    private final void i(final FragmentActivity activity) {
        if (activity instanceof HMPhoneActivity) {
            PhoneForgetPasswordViewModel phoneForgetPasswordViewModel = (PhoneForgetPasswordViewModel) ViewModelProviders.of(activity, new PhoneRegisterViewModelFactory(((HMPhoneActivity) activity).getApplication())).get(PhoneForgetPasswordViewModel.class);
            this.phoneForgetPasswordViewModel = phoneForgetPasswordViewModel;
            Objects.requireNonNull(phoneForgetPasswordViewModel);
            phoneForgetPasswordViewModel.getSendVerifyCodeFormLiveData().observe(this, new Observer() { // from class: ee3
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    HMResetPasswordFragment.j(this.a, (PhoneBaseForm) obj);
                }
            });
            PhoneForgetPasswordViewModel phoneForgetPasswordViewModel2 = this.phoneForgetPasswordViewModel;
            Objects.requireNonNull(phoneForgetPasswordViewModel2);
            phoneForgetPasswordViewModel2.getSmsCodeLiveData$accountui_release().observe(this, new Observer() { // from class: fe3
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    HMResetPasswordFragment.k(this.a, (SmsCode) obj);
                }
            });
            PhoneForgetPasswordViewModel phoneForgetPasswordViewModel3 = this.phoneForgetPasswordViewModel;
            Objects.requireNonNull(phoneForgetPasswordViewModel3);
            phoneForgetPasswordViewModel3.getChangePasswordResponse$accountui_release().observe(this, new Observer() { // from class: de3
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    HMResetPasswordFragment.l(activity, this, (PhoneLoginResponse) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(HMResetPasswordFragment hMResetPasswordFragment, PhoneBaseForm phoneBaseForm) {
        hMResetPasswordFragment.sendCodeForm = phoneBaseForm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(HMResetPasswordFragment hMResetPasswordFragment, SmsCode smsCode) {
        hMResetPasswordFragment.smsCode = smsCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(FragmentActivity fragmentActivity, HMResetPasswordFragment hMResetPasswordFragment, PhoneLoginResponse phoneLoginResponse) {
        PhoneLoginResponseKt.deal(phoneLoginResponse, new c(fragmentActivity), new d(fragmentActivity), new e(fragmentActivity, hMResetPasswordFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(HMResetPasswordFragment hMResetPasswordFragment, View view) {
        String string = hMResetPasswordFragment.e().getText().toString();
        if (string.length() < 8) {
            IconToast.showError(hMResetPasswordFragment.getActivity(), R.string.account_ui_account_pwd_length_error);
            return;
        }
        if (!UtilsKt.validPassword(string)) {
            IconToast.showError(hMResetPasswordFragment.getActivity(), R.string.account_ui_login_email_password_format_error);
            return;
        }
        if (!Intrinsics.areEqual(hMResetPasswordFragment.e().getText().toString(), hMResetPasswordFragment.f().getText().toString())) {
            IconToast.showError(hMResetPasswordFragment.getActivity(), R.string.account_ui_mili_setting_off_wist_lock_password_not_match);
            return;
        }
        if (hMResetPasswordFragment.checkNetWork()) {
            PhoneForgetPasswordViewModel phoneForgetPasswordViewModel = hMResetPasswordFragment.phoneForgetPasswordViewModel;
            Objects.requireNonNull(phoneForgetPasswordViewModel);
            PhoneBaseForm phoneBaseForm = hMResetPasswordFragment.sendCodeForm;
            Objects.requireNonNull(phoneBaseForm);
            String phoneNumber = phoneBaseForm.getPhoneNumber();
            PhoneBaseForm phoneBaseForm2 = hMResetPasswordFragment.sendCodeForm;
            Objects.requireNonNull(phoneBaseForm2);
            String areaCode = phoneBaseForm2.getAreaCode();
            SmsCode smsCode = hMResetPasswordFragment.smsCode;
            Objects.requireNonNull(smsCode);
            phoneForgetPasswordViewModel.postChangePasswordForm(phoneNumber, areaCode, smsCode.getCode(), hMResetPasswordFragment.e().getText().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(String origin, String confirm) {
        if (!(origin.length() == 0)) {
            return !(confirm.length() == 0) && origin.length() >= 8;
        }
        return false;
    }

    @Override // com.huami.account.ui.forget.HMPhoneFragment
    public int getTitleRes() {
        return R.string.account_ui_account_set_new_pwd;
    }

    public final void initViews() {
        final f fVar = new f();
        e().addTextChangedListener(new TextWatcher() { // from class: com.huami.account.ui.forget.HMResetPasswordFragment$initViews$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                fVar.invoke(s);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        f().addTextChangedListener(new TextWatcher() { // from class: com.huami.account.ui.forget.HMResetPasswordFragment$initViews$$inlined$doAfterTextChanged$2
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                fVar.invoke(s);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        g().setText(getResources().getString(R.string.account_ui_phone_forget_password_title));
        h().setOnClickListener(new View.OnClickListener() { // from class: ce3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMResetPasswordFragment.m(this.a, view);
            }
        });
        requestPopSoftKeyboard(e());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        i(activity);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.account_ui_hm_phone_set_password_fragment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
    }
}
