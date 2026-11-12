package com.xiaomi.passport.ui.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.xiaomi.account.passportsdk.account_sso.R;
import com.xiaomi.accountsdk.account.XMPassportSettings;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import com.xiaomi.passport.ui.BaseActivity;
import com.xiaomi.passport.utils.AccountHelper;

/* JADX INFO: loaded from: classes11.dex */
public class ConfirmCredentialBaseActivity extends BaseActivity implements OnBackNotifier {
    OnBackListener mOnBackListener;

    public boolean finishIfAccountExist() {
        Account xiaomiAccount = XiaomiAccountManager.get(this).getXiaomiAccount();
        if (xiaomiAccount == null) {
            return false;
        }
        finishOnResult(-1, new AccountInfo.Builder().userId(xiaomiAccount.name).build());
        return true;
    }

    public void finishOnResult(int i) {
        finishOnResult(i, null);
    }

    @Override // com.xiaomi.passport.ui.internal.OnBackNotifier
    public OnBackListener getOnBackListener() {
        return this.mOnBackListener;
    }

    @Override // com.xiaomi.passport.ui.BaseActivity
    public BaseActivity.StatParams getStatParams() {
        return new BaseActivity.StatParams("快速验证弹窗", getString(R.string.passport_stat_tip_confirm_credential_page_browse));
    }

    public boolean isTranslucentStatusBar() {
        return needTranslucentStatusBar();
    }

    public boolean needTranslucentStatusBar() {
        return true;
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        OnBackListener onBackListener = this.mOnBackListener;
        if (onBackListener == null || !onBackListener.onBackPressed()) {
            try {
                super.lambda$onCreate$0();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.xiaomi.passport.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        XMPassportSettings.ensureApplicationContext(getApplication());
        isTranslucentStatusBar();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        lambda$onCreate$0();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.xiaomi.passport.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        setContentView(LayoutInflater.from(this).inflate(i, (ViewGroup) null));
    }

    @Override // com.xiaomi.passport.ui.internal.OnBackNotifier
    public void setOnBackListener(OnBackListener onBackListener) {
        this.mOnBackListener = onBackListener;
    }

    public void finishOnResult(int i, AccountInfo accountInfo) {
        XiaomiAccountManager.get(this).handleAccountAuthenticatorResponse(getIntent().getParcelableExtra("accountAuthenticatorResponse"), AccountHelper.getAccountAuthenticatorResponseResult(i, accountInfo, getIntent().getBooleanExtra("need_retry_on_authenticator_response_result", false)));
        setResult(i);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        if (isTranslucentStatusBar()) {
            view.setFitsSystemWindows(true);
        }
        super.setContentView(view);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        if (isTranslucentStatusBar()) {
            view.setFitsSystemWindows(true);
        }
        super.setContentView(view, layoutParams);
    }
}
