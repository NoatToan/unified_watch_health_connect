package com.huami.account.ui.forget;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.ui.R;
import com.huami.account.ui.bind.PhoneBindPasswordActivity;
import com.huami.account.ui.common.entity.AutoLoginForm;
import com.huami.account.ui.common.entity.PhoneBaseForm;
import com.huami.account.ui.common.entity.PhoneLoginResponse;
import com.huami.account.ui.common.entity.PhoneLoginResponseKt;
import com.huami.account.ui.common.viewmodel.PhoneRegisterViewModelFactory;
import com.huami.account.ui.forget.HMPhonePasswordFragment;
import com.huami.account.ui.register.viewmodel.PhoneRegisterViewModel;
import com.huami.account.utils.UtilsKt;
import com.huami.passport.ErrorCode;
import com.huami.passport.entity.LoginInfo;
import com.huami.passport.entity.LoginToken;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b4\u00105J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0006\u0010\u001d\u001a\u00020\tR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010.\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u00102\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b*\u00101R\u001d\u00103\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/huami/account/ui/forget/HMPhonePasswordFragment;", "Lcom/huami/account/ui/forget/HMPhoneFragment;", "", "origin", "confirm", "", com.google.android.exoplayer2.text.ttml.b.r, "Landroidx/fragment/app/FragmentActivity;", "activity", "", "i", "Lcom/huami/passport/entity/LoginInfo;", "loginInfo", "o", "", "getTitleRes", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "initViews", "Lcom/huami/account/ui/register/viewmodel/PhoneRegisterViewModel;", "c", "Lcom/huami/account/ui/register/viewmodel/PhoneRegisterViewModel;", "phoneRegisterViewModel", "Lcom/huami/account/ui/common/entity/PhoneBaseForm;", GoogleApiAvailabilityLight.a, "Lcom/huami/account/ui/common/entity/PhoneBaseForm;", "sendCodeForm", "Lcom/huami/passport/entity/SmsCode;", "e", "Lcom/huami/passport/entity/SmsCode;", PhoneBindPasswordActivity.EXTRA_SMS_CODE, "f", "Lkotlin/Lazy;", "h", "()Landroid/view/View;", "registerBtn", "Landroid/widget/EditText;", "g", "()Landroid/widget/EditText;", "evPassword", "evPasswordConfirm", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class HMPhonePasswordFragment extends HMPhoneFragment {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private PhoneRegisterViewModel phoneRegisterViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private PhoneBaseForm sendCodeForm;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private SmsCode smsCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy registerBtn = LazyKt__LazyJVMKt.lazy(new j());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy evPassword = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy evPasswordConfirm = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<EditText> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText invoke() {
            return (EditText) UtilsKt.findViewById(HMPhonePasswordFragment.this, R.id.ev_password);
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
        public final EditText invoke() {
            return (EditText) UtilsKt.findViewById(HMPhonePasswordFragment.this, R.id.ev_password_confirm);
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
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((HMPhoneActivity) this.a).showLoginDialog(R.string.account_ui_register_phone_registering);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/entity/LoginInfo;", "loginInfo", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<LoginInfo, Unit> {
        public d() {
            super(1);
        }

        public final void a(@NotNull LoginInfo loginInfo) {
            HMPhonePasswordFragment.this.o(loginInfo);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LoginInfo loginInfo) {
            a(loginInfo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/ErrorCode;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<ErrorCode, Unit> {
        public final /* synthetic */ FragmentActivity a;
        public final /* synthetic */ HMPhonePasswordFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FragmentActivity fragmentActivity, HMPhonePasswordFragment hMPhonePasswordFragment) {
            super(1);
            this.a = fragmentActivity;
            this.b = hMPhonePasswordFragment;
        }

        public final void a(@NotNull ErrorCode errorCode) {
            ((HMPhoneActivity) this.a).setFailedDialog$accountui_release(this.b.getResources().getString(R.string.account_ui_phone_register_failed));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ErrorCode errorCode) {
            a(errorCode);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ FragmentActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(FragmentActivity fragmentActivity) {
            super(0);
            this.a = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((HMPhoneActivity) this.a).showLoginDialog(R.string.account_ui_logining);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/entity/LoginToken;", LoginViewOptions.EXTRA_LOGIN_TOKEN, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<LoginToken, Unit> {
        public final /* synthetic */ FragmentActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(FragmentActivity fragmentActivity) {
            super(1);
            this.a = fragmentActivity;
        }

        public final void a(@NotNull LoginToken loginToken) {
            ((HMPhoneActivity) this.a).processLoginSuccess(loginToken);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LoginToken loginToken) {
            a(loginToken);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/ErrorCode;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<ErrorCode, Unit> {
        public final /* synthetic */ FragmentActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(FragmentActivity fragmentActivity) {
            super(1);
            this.a = fragmentActivity;
        }

        public final void a(@NotNull ErrorCode errorCode) {
            HMPhoneActivity.onLoginFailed$default((HMPhoneActivity) this.a, false, 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ErrorCode errorCode) {
            a(errorCode);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/text/Editable;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<Editable, Unit> {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
            invoke2(editable);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Editable editable) {
            View viewH = HMPhonePasswordFragment.this.h();
            HMPhonePasswordFragment hMPhonePasswordFragment = HMPhonePasswordFragment.this;
            viewH.setEnabled(hMPhonePasswordFragment.p(hMPhonePasswordFragment.f().getText().toString(), HMPhonePasswordFragment.this.g().getText().toString()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<View> {
        public j() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final View invoke() {
            return UtilsKt.findViewById(HMPhonePasswordFragment.this, R.id.hm_phone_post_register_btn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText f() {
        return (EditText) this.evPassword.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText g() {
        return (EditText) this.evPasswordConfirm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View h() {
        return (View) this.registerBtn.getValue();
    }

    private final void i(final FragmentActivity activity) {
        PhoneRegisterViewModel phoneRegisterViewModel = (PhoneRegisterViewModel) new ViewModelProvider(activity, new PhoneRegisterViewModelFactory(activity.getApplication())).get(PhoneRegisterViewModel.class);
        this.phoneRegisterViewModel = phoneRegisterViewModel;
        Objects.requireNonNull(phoneRegisterViewModel);
        phoneRegisterViewModel.getPhoneSendCodeFormLiveData$accountui_release().observe(this, new Observer() { // from class: cc3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMPhonePasswordFragment.j(this.a, (PhoneBaseForm) obj);
            }
        });
        PhoneRegisterViewModel phoneRegisterViewModel2 = this.phoneRegisterViewModel;
        Objects.requireNonNull(phoneRegisterViewModel2);
        phoneRegisterViewModel2.getSmsCodeLiveData$accountui_release().observe(this, new Observer() { // from class: dc3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMPhonePasswordFragment.k(this.a, (SmsCode) obj);
            }
        });
        PhoneRegisterViewModel phoneRegisterViewModel3 = this.phoneRegisterViewModel;
        Objects.requireNonNull(phoneRegisterViewModel3);
        phoneRegisterViewModel3.getPhoneRegisterResponse$accountui_release().observe(this, new Observer() { // from class: bc3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMPhonePasswordFragment.l(activity, this, (PhoneLoginResponse) obj);
            }
        });
        PhoneRegisterViewModel phoneRegisterViewModel4 = this.phoneRegisterViewModel;
        Objects.requireNonNull(phoneRegisterViewModel4);
        phoneRegisterViewModel4.getPhoneLoginResponse$accountui_release().observe(this, new Observer() { // from class: ac3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMPhonePasswordFragment.m(activity, (PhoneLoginResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(HMPhonePasswordFragment hMPhonePasswordFragment, PhoneBaseForm phoneBaseForm) {
        hMPhonePasswordFragment.sendCodeForm = phoneBaseForm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(HMPhonePasswordFragment hMPhonePasswordFragment, SmsCode smsCode) {
        hMPhonePasswordFragment.smsCode = smsCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(FragmentActivity fragmentActivity, HMPhonePasswordFragment hMPhonePasswordFragment, PhoneLoginResponse phoneLoginResponse) {
        PhoneLoginResponseKt.deal(phoneLoginResponse, new c(fragmentActivity), hMPhonePasswordFragment.new d(), new e(fragmentActivity, hMPhonePasswordFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(FragmentActivity fragmentActivity, PhoneLoginResponse phoneLoginResponse) {
        if (phoneLoginResponse == null) {
            return;
        }
        PhoneLoginResponseKt.deal(phoneLoginResponse, new f(fragmentActivity), new g(fragmentActivity), new h(fragmentActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(HMPhonePasswordFragment hMPhonePasswordFragment, View view) {
        if (!UtilsKt.validPassword(hMPhonePasswordFragment.f().getText().toString())) {
            IconToast.showError(hMPhonePasswordFragment.requireContext(), hMPhonePasswordFragment.getString(R.string.account_ui_phone_password_not_valid));
            return;
        }
        if (hMPhonePasswordFragment.checkNetWork()) {
            PhoneRegisterViewModel phoneRegisterViewModel = hMPhonePasswordFragment.phoneRegisterViewModel;
            Objects.requireNonNull(phoneRegisterViewModel);
            PhoneBaseForm phoneBaseForm = hMPhonePasswordFragment.sendCodeForm;
            Objects.requireNonNull(phoneBaseForm);
            String phoneNumber = phoneBaseForm.getPhoneNumber();
            PhoneBaseForm phoneBaseForm2 = hMPhonePasswordFragment.sendCodeForm;
            Objects.requireNonNull(phoneBaseForm2);
            String areaCode = phoneBaseForm2.getAreaCode();
            String string = hMPhonePasswordFragment.f().getText().toString();
            SmsCode smsCode = hMPhonePasswordFragment.smsCode;
            Objects.requireNonNull(smsCode);
            String code = smsCode.getCode();
            PhoneBaseForm phoneBaseForm3 = hMPhonePasswordFragment.sendCodeForm;
            Objects.requireNonNull(phoneBaseForm3);
            phoneRegisterViewModel.postRegisterForm(phoneNumber, areaCode, string, code, phoneBaseForm3.getCountryCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(LoginInfo loginInfo) {
        PhoneBaseForm phoneBaseForm = this.sendCodeForm;
        Objects.requireNonNull(phoneBaseForm);
        if (checkNetWork()) {
            PhoneRegisterViewModel phoneRegisterViewModel = this.phoneRegisterViewModel;
            Objects.requireNonNull(phoneRegisterViewModel);
            phoneRegisterViewModel.getPhoneLoginForm$accountui_release().postValue(new AutoLoginForm(loginInfo, phoneBaseForm.getCountryCode()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(String origin, String confirm) {
        if (!(origin.length() == 0)) {
            return !(confirm.length() == 0) && Intrinsics.areEqual(origin, confirm) && origin.length() >= 8;
        }
        return false;
    }

    @Override // com.huami.account.ui.forget.HMPhoneFragment
    public int getTitleRes() {
        return R.string.account_ui_register_phone_set_password_title;
    }

    public final void initViews() {
        final i iVar = new i();
        f().addTextChangedListener(new TextWatcher() { // from class: com.huami.account.ui.forget.HMPhonePasswordFragment$initViews$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                iVar.invoke(s);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        g().addTextChangedListener(new TextWatcher() { // from class: com.huami.account.ui.forget.HMPhonePasswordFragment$initViews$$inlined$doAfterTextChanged$2
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                iVar.invoke(s);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        h().setOnClickListener(new View.OnClickListener() { // from class: zb3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMPhonePasswordFragment.n(this.a, view);
            }
        });
        requestPopSoftKeyboard(f());
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
