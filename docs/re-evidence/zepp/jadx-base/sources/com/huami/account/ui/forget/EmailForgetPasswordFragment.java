package com.huami.account.ui.forget;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.huami.account.ui.R;
import com.huami.account.ui.view.VerificationCodeView;
import com.huami.account.utils.UtilsKt;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class EmailForgetPasswordFragment extends com.huami.account.ui.forget.a {
    private static final String k = "initial_email";
    private AccountManager b;
    private EditText c;
    private EditText d;
    private View e;
    private TextView f;
    private TextView g;
    private View h;
    private VerificationCodeView i;
    private final String a = "EmailForgetPasswordFragment";
    private TextWatcher j = new a();

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EmailForgetPasswordFragment.this.h.setVisibility(8);
            if (EmailForgetPasswordFragment.this.c.getText().toString().trim().length() <= 0 || EmailForgetPasswordFragment.this.d.getText().toString().length() <= 0) {
                EmailForgetPasswordFragment.this.g.setEnabled(false);
            } else {
                EmailForgetPasswordFragment.this.g.setEnabled(true);
            }
            EmailForgetPasswordFragment.this.e.setVisibility(TextUtils.isEmpty(charSequence) ? 0 : 8);
        }
    }

    public class b implements IAccount.Callback<String, ErrorCode> {
        public final /* synthetic */ FragmentActivity a;
        public final /* synthetic */ String b;

        public b(FragmentActivity fragmentActivity, String str) {
            this.a = fragmentActivity;
            this.b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(ErrorCode errorCode) {
            return "onError:" + errorCode.toString();
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onError(final ErrorCode errorCode) {
            if (this.a.isDestroyed()) {
                return;
            }
            ((EmailActivity) this.a).hideProgressDialog();
            HMLog.info("EmailForgetPasswordFragment", new Function0() { // from class: com.huami.account.ui.forget.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EmailForgetPasswordFragment.b.b(errorCode);
                }
            });
            if ("404".equals(errorCode.getErrorCode())) {
                IconToast.showError(this.a, EmailForgetPasswordFragment.this.getString(R.string.account_ui_login_email_account_not_exist));
            } else {
                IconToast.showError(this.a, EmailForgetPasswordFragment.this.getString(R.string.account_ui_login_email_sending_new_password_error));
            }
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            if (this.a.isDestroyed()) {
                return;
            }
            ((EmailActivity) this.a).hideProgressDialog();
            EmailForgetPasswordFragment.this.n(this.b);
        }
    }

    public class c implements HMEmailResetPasswordSuccessDialog.a {
        public final /* synthetic */ String a;
        public final /* synthetic */ FragmentActivity b;

        public c(String str, FragmentActivity fragmentActivity) {
            this.a = str;
            this.b = fragmentActivity;
        }

        @Override // com.huami.account.ui.forget.HMEmailResetPasswordSuccessDialog.a
        public String a() {
            return this.a;
        }

        @Override // com.huami.account.ui.forget.HMEmailResetPasswordSuccessDialog.a
        public void b() {
            this.b.onBackPressed();
        }
    }

    private void i(View view) {
        final FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.hm_email_btn);
        this.g = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: sk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.k(activity, view2);
            }
        });
    }

    private void j(View view) {
        VerificationCodeView verificationCodeView = (VerificationCodeView) view.findViewById(R.id.hm_email_verification_code_image);
        this.i = verificationCodeView;
        verificationCodeView.setOnClickListener(new View.OnClickListener() { // from class: rk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.l(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(FragmentActivity fragmentActivity, View view) {
        if (o()) {
            if (!NetUtil.isNetworkConnected(fragmentActivity)) {
                IconToast.showError(fragmentActivity, getString(R.string.account_ui_no_network_connection));
                return;
            }
            String string = this.c.getText().toString();
            ((EmailActivity) fragmentActivity).showLoginDialog(R.string.account_ui_login_email_sending_new_password);
            this.b.resetPassword(string, new b(fragmentActivity, string));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        this.i.create();
    }

    private void m(int i) {
        this.f.setText(i);
        this.h.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        HMEmailResetPasswordSuccessDialog hMEmailResetPasswordSuccessDialog = new HMEmailResetPasswordSuccessDialog();
        hMEmailResetPasswordSuccessDialog.setCancelable(false);
        hMEmailResetPasswordSuccessDialog.setCallback(new c(str, activity));
        hMEmailResetPasswordSuccessDialog.show(activity.getSupportFragmentManager(), (String) null);
    }

    public static EmailForgetPasswordFragment newInstance(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("initial_email", str);
        EmailForgetPasswordFragment emailForgetPasswordFragment = new EmailForgetPasswordFragment();
        emailForgetPasswordFragment.setArguments(bundle);
        return emailForgetPasswordFragment;
    }

    private boolean o() {
        if (!UtilsKt.isEmailFormat(this.c.getText().toString())) {
            m(R.string.account_ui_login_email_email_format_error);
            return false;
        }
        if (this.i.verify(this.d.getText().toString())) {
            return true;
        }
        m(R.string.account_ui_login_email_verification_code_error);
        return false;
    }

    @Override // com.huami.account.ui.forget.a
    public int getTitleRes() {
        return R.string.account_ui_login_email_forget_password;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.b = AccountManager.getDefault(getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        FragmentActivity activity;
        if (Build.VERSION.SDK_INT >= 26 && (activity = getActivity()) != null) {
            activity.getWindow().getDecorView().setImportantForAutofill(8);
        }
        View viewInflate = layoutInflater.inflate(R.layout.account_ui_hm_email_forget_password_fragment, viewGroup, false);
        this.h = viewInflate.findViewById(R.id.hm_email_error);
        this.f = (TextView) viewInflate.findViewById(R.id.hm_email_error_tips);
        EditText editText = (EditText) viewInflate.findViewById(R.id.hm_email_input_email);
        this.c = editText;
        editText.addTextChangedListener(this.j);
        this.d = (EditText) viewInflate.findViewById(R.id.hm_email_verification_code);
        this.e = viewInflate.findViewById(R.id.input_email_verification_code_hint);
        this.d.addTextChangedListener(this.j);
        i(viewInflate);
        j(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        String string = getArguments() != null ? getArguments().getString("initial_email") : null;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.c.setText(string);
        this.d.requestFocus();
    }
}
