package com.huami.account.ui.forget;

import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huami.account.HMLoginErrorManager;
import com.huami.account.ui.R;
import com.huami.account.ui.common.BaseTitleOauthActivity;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.view.basetitle.BaseTitleActivity;

/* JADX INFO: loaded from: classes4.dex */
public class EmailActivity extends BaseTitleOauthActivity implements FragmentManager.OnBackStackChangedListener {
    public static final String EXTRA_INITIAL_EMAIL = "initial_email";
    public static final int REQUEST_EMAIL_CODE = 111;
    public static final String REQUEST_EMAIL_COUNTRY_CODE = "COUNTRY_CODE";
    public static final String REQUEST_PHONE_FORGET_PASSWORD = "FORGET_PASSWORD";
    private LoadingDialog A;
    private HMLoginErrorManager B = new HMLoginErrorManager();

    private void t(a aVar) {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(R.id.hm_email_fragment_container, aVar);
        fragmentTransactionBeginTransaction.addToBackStack(null);
        fragmentTransactionBeginTransaction.commit();
        setTitleText(aVar.getTitleRes());
    }

    private void u() {
        getLeft().setOnClickListener(new View.OnClickListener() { // from class: qk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.w(view);
            }
        });
    }

    private boolean v() {
        if (getIntent() != null) {
            return getIntent().getBooleanExtra(REQUEST_PHONE_FORGET_PASSWORD, false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(View view) {
        onBackPressed();
    }

    public void forgetPasswordPage() {
        t(EmailForgetPasswordFragment.newInstance(getIntent().getStringExtra(EXTRA_INITIAL_EMAIL)));
    }

    public void hideProgressDialog() {
        LoadingDialog loadingDialog = this.A;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.A.hide();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (v()) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public void onBackStackChanged() {
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.hm_email_fragment_container);
        if (fragmentFindFragmentById instanceof a) {
            setTitleText(((a) fragmentFindFragmentById).getTitleRes());
        }
    }

    @Override // com.huami.account.ui.common.BaseTitleOauthActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.account_ui_hm_email_activity);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.s36), "", !RainbowUtils.isDarkMode(this));
        setBaseTitleColor(ContextCompat.getColor(this, R.color.s1));
        getSupportFragmentManager().addOnBackStackChangedListener(this);
        u();
        if (v()) {
            forgetPasswordPage();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.B.deleteZipFile();
        getSupportFragmentManager().removeOnBackStackChangedListener(this);
        LoadingDialog loadingDialog = this.A;
        if (loadingDialog != null && loadingDialog.isShowing()) {
            this.A.dismiss();
        }
        super.onDestroy();
    }

    public void showLoginDialog(int i) {
        if (isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog = this.A;
        if (loadingDialog == null) {
            this.A = LoadingDialog.showDialog(this, getString(i));
        } else {
            loadingDialog.setMessage(getString(i));
        }
        this.A.setCancelable(false);
        this.A.show();
    }
}
