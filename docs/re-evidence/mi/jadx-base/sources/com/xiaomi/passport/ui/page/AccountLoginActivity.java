package com.xiaomi.passport.ui.page;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.account.passportsdk.account_sso.R;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.accountsdk.account.serverpassthrougherror.ServerPassThroughErrorConstants;
import com.xiaomi.accountsdk.account.stat.AccountStatInterface;
import com.xiaomi.accountsdk.account.stat.StatConstants;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.passport.PassportSDK;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import com.xiaomi.passport.ui.BaseActivity;
import com.xiaomi.passport.ui.internal.LayoutWrapperActivity;
import com.xiaomi.passport.ui.license.LoginAgreementAndPrivacy;
import com.xiaomi.passport.ui.utils.LoginAndRegisterController;
import com.xiaomi.passport.ui.utils.LoginFailedReasonHolder;
import com.xiaomi.passport.ui.utils.PassportPageIntent;
import com.xiaomi.passport.ui.view.AccountLoginPageHeaderViewHolder;
import com.xiaomi.passport.ui.view.AnimateScrollLinerLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AccountLoginActivity extends LayoutWrapperActivity implements LoginUIAction {
    public static final String EXTRA_BOOL_SHOW_USER_AGREEMENT = "show_user_agreement";
    public static final String EXTRA_BOOL_USER_AGREEMENT_INIT_SELECTED = "user_agreement_init_selected";
    public static final String EXTRA_INT_ACCOUNT_PHONE_NUMBER_SOURCE_FLAG = "account_phone_number_source_flag";
    public static final String EXTRA_PARCEL_CHOOSE_COUNTRY_INTENT = "choose_country_intent";
    public static final String EXTRA_PARCEL_LIST_PHONE_ACCOUNTS = "phone_accounts";
    public static final String EXTRA_PARCEL_LOGIN_AGREEMENT_AND_PRIVACY = "login_agreement_and_privacy";
    public static final String EXTRA_STRING_CHOOSE_COUNTRY_INIT_TEXT = "choose_country_init_text";
    public static final String EXTRA_STRING_INIT_PAGE = "init_page";
    public static final String EXTRA_STRING_LIST_SNS_ENTRANCE = "sns_entrance";
    private static final int REQ_CODE_CHOOSE_COUNTRY = 8880;
    public static final String TAG = "AccountLoginActivity";
    public static final String VAL_STRING_INIT_PAGE_PHONE_ACCOUNT_LOGIN = "phone_account_login";
    public static final String VAL_STRING_INIT_PAGE_PHONE_ACCOUNT_QUICK_LOGIN = "phone_account_quick_login";
    public static final String VAL_STRING_INIT_PAGE_PHONE_NUMBER_LOGIN = "phone_number_login";
    public static final String VAL_STRING_INIT_PAGE_USER_ID_LOGIN = "user_id_login";
    private Intent mChooseCountryIntent;
    private String mChooseCountryText;
    private AnimateScrollLinerLayout mFragmentRoot;
    private AccountLoginPageHeaderViewHolder mPageHeaderViewHolder;
    private View mSNSBarRoot;
    private final AccountLoginPageHeaderViewHolder.OnActionListener mPageHeaderListener = new AccountLoginPageHeaderViewHolder.OnActionListener() { // from class: com.xiaomi.passport.ui.page.AccountLoginActivity.2
        @Override // com.xiaomi.passport.ui.view.AccountLoginPageHeaderViewHolder.OnActionListener
        public void onCountryNameClicked(View view) {
            if (AccountLoginActivity.this.mChooseCountryIntent == null) {
                return;
            }
            AccountLoginActivity accountLoginActivity = AccountLoginActivity.this;
            accountLoginActivity.startActivityForResult(accountLoginActivity.mChooseCountryIntent, AccountLoginActivity.REQ_CODE_CHOOSE_COUNTRY);
        }

        @Override // com.xiaomi.passport.ui.view.AccountLoginPageHeaderViewHolder.OnActionListener
        public void onHelpClicked(View view) {
            Fragment currentFragment = AccountLoginActivity.this.getCurrentFragment();
            if (currentFragment instanceof BaseLoginFragment) {
                ((BaseLoginFragment) currentFragment).statClick(R.string.passport_stat_tip_any_page_click_need_help);
            } else {
                AccountLoginActivity.this.statClick(R.string.passport_stat_tip_any_page_click_need_help);
            }
            AccountLoginActivity accountLoginActivity = AccountLoginActivity.this;
            accountLoginActivity.startActivity(PassportPageIntent.getHelpCenterPageIntent(accountLoginActivity));
        }
    };
    private final ViewTreeObserver.OnGlobalLayoutListener mRootGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.passport.ui.page.AccountLoginActivity.3
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (AccountLoginActivity.this.isFinishing() || (((BaseFragment) AccountLoginActivity.this.getSupportFragmentManager().k0(R.id.login_activity_content)) instanceof VerifyCodeLoginFragment)) {
                return;
            }
            View decorView = AccountLoginActivity.this.getWindow().getDecorView();
            int height = decorView.getRootView().getHeight();
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            if (decorView.getRootView().getHeight() - rect.height() >= height / 4) {
                AccountLoginActivity.this.mFragmentRoot.smoothScrollTo(0, (int) Math.ceil(AccountLoginActivity.this.getResources().getDimension(R.dimen.passport_input_scroll_vertical)));
            } else {
                AccountLoginActivity.this.mFragmentRoot.smoothScrollTo(0, 0);
            }
        }
    };

    private void finishAndResultIfAccountExists() {
        XiaomiAccountManager xiaomiAccountManager = XiaomiAccountManager.get(this);
        Account xiaomiAccount = xiaomiAccountManager.getXiaomiAccount();
        if (xiaomiAccount != null) {
            LoginAgreementAndPrivacy loginAgreementAndPrivacyBuild = (LoginAgreementAndPrivacy) getIntent().getParcelableExtra(EXTRA_PARCEL_LOGIN_AGREEMENT_AND_PRIVACY);
            if (loginAgreementAndPrivacyBuild == null) {
                loginAgreementAndPrivacyBuild = new LoginAgreementAndPrivacy.Builder(LoginAgreementAndPrivacy.Type.DEF).build();
            }
            LoginAndRegisterController.finishWithLoginResult(this, new AccountInfo.Builder().userId(xiaomiAccount.name).passToken(xiaomiAccountManager.getPassword(xiaomiAccount)).encryptedUserId(xiaomiAccountManager.getUserData(xiaomiAccount, "encrypted_user_id")).build(), loginAgreementAndPrivacyBuild);
        }
    }

    private void finishWhenCanceled() {
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Fragment getCurrentFragment() {
        return getSupportFragmentManager().k0(R.id.login_activity_content);
    }

    private void init() {
        initSettings();
        initVars();
        initViews();
        initFragments();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    private void initFragments() {
        BaseLoginFragment baseLoginFragmentNewInstance;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (getIntent().getBooleanExtra(ServerPassThroughErrorConstants.PARAM_BOOLEAN_IS_FROM_PASS_THROUGH_ERROR_JUMP, false)) {
            String stringExtra = getIntent().getStringExtra(ServerPassThroughErrorConstants.PARAM_STRING_TYPE);
            if (!TextUtils.isEmpty(stringExtra)) {
                stringExtra.hashCode();
                switch (stringExtra) {
                    case "input_ticket_verification_code":
                        baseLoginFragmentNewInstance = BaseLoginFragment.newInstance(null, BaseLoginFragment.LoginFragmentType.VERIFY_CODE_LOGIN);
                        break;
                    case "login_sim":
                        baseLoginFragmentNewInstance = BaseLoginFragment.newInstance(null, BaseLoginFragment.LoginFragmentType.PHONE_ACCOUNT_LOGIN);
                        break;
                    case "input_phone":
                        baseLoginFragmentNewInstance = BaseLoginFragment.newInstance(null, BaseLoginFragment.LoginFragmentType.INPUT_PHONE_NUMBER);
                        break;
                    case "login_password":
                        baseLoginFragmentNewInstance = BaseLoginFragment.newInstance(null, BaseLoginFragment.LoginFragmentType.PASSWORD_LOGIN);
                        break;
                    default:
                        AccountLogger.log("AccountLoginActivity", "initFragments can't find page to jump!!!");
                        baseLoginFragmentNewInstance = null;
                        break;
                }
            } else {
                baseLoginFragmentNewInstance = null;
            }
        } else {
            baseLoginFragmentNewInstance = null;
        }
        if (baseLoginFragmentNewInstance == null) {
            String stringExtra2 = getIntent().getStringExtra(EXTRA_STRING_INIT_PAGE);
            if (TextUtils.isEmpty(stringExtra2)) {
                baseLoginFragmentNewInstance = PassportSDK.isInternational() ? BaseLoginFragment.newInstance(null, BaseLoginFragment.LoginFragmentType.PASSWORD_LOGIN) : BaseLoginFragment.newInstance(null, BaseLoginFragment.LoginFragmentType.PHONE_ACCOUNT_LOGIN);
            } else {
                stringExtra2.hashCode();
                switch (stringExtra2) {
                    case "phone_account_login":
                        baseLoginFragmentNewInstance = BaseLoginFragment.newInstance(null, BaseLoginFragment.LoginFragmentType.PHONE_ACCOUNT_LOGIN);
                        break;
                    case "user_id_login":
                        baseLoginFragmentNewInstance = BaseLoginFragment.newInstance(null, BaseLoginFragment.LoginFragmentType.PASSWORD_LOGIN);
                        break;
                    case "phone_number_login":
                        baseLoginFragmentNewInstance = BaseLoginFragment.newInstance(null, BaseLoginFragment.LoginFragmentType.INPUT_PHONE_NUMBER);
                        break;
                    case "phone_account_quick_login":
                        baseLoginFragmentNewInstance = BaseLoginFragment.newInstance(null, BaseLoginFragment.LoginFragmentType.PHONE_ACCOUNT_QUICK_LOGIN);
                        break;
                    default:
                        throw new IllegalStateException("unknown page type -> " + stringExtra2);
                }
            }
        }
        showFragment(baseLoginFragmentNewInstance, R.id.login_activity_content, true, false, false);
        if (supportFragmentManager.k0(R.id.page_footer) == null) {
            showFragment(BaseLoginFragment.newInstance(getIntent().getExtras(), BaseLoginFragment.LoginFragmentType.SNS_LOGIN), R.id.page_footer, false, false, false);
        }
    }

    private void initSettings() {
        getWindow().addFlags(8192);
    }

    private void initVars() {
        this.mChooseCountryText = getIntent().getStringExtra(EXTRA_STRING_CHOOSE_COUNTRY_INIT_TEXT);
        this.mChooseCountryIntent = (Intent) getIntent().getParcelableExtra(EXTRA_PARCEL_CHOOSE_COUNTRY_INTENT);
    }

    private void initViews() {
        this.mFragmentRoot = (AnimateScrollLinerLayout) findViewById(R.id.login_activity_content);
        AccountLoginPageHeaderViewHolder accountLoginPageHeaderViewHolderCreate = AccountLoginPageHeaderViewHolder.create(this);
        this.mPageHeaderViewHolder = accountLoginPageHeaderViewHolderCreate;
        accountLoginPageHeaderViewHolderCreate.setOnActionListener(this.mPageHeaderListener);
        this.mPageHeaderViewHolder.setCountryName(this.mChooseCountryText);
        this.mPageHeaderViewHolder.setCountryAccessibilityClick(this.mChooseCountryIntent);
        setHeaderEndView(this.mPageHeaderViewHolder.viewRoot);
        getHeaderStartView().setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.passport.ui.page.AccountLoginActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AccountLoginActivity.this.lambda$onCreate$0();
            }
        });
        getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.mRootGlobalLayoutListener);
    }

    private void releaseViews() {
        getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.mRootGlobalLayoutListener);
    }

    private void showFragment(BaseFragment baseFragment, int i, boolean z, boolean z2, boolean z3) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        String name = baseFragment.getName();
        if (!z) {
            supportFragmentManager.o().x(i, baseFragment, name).m();
            return;
        }
        if (z2) {
            try {
                supportFragmentManager.k1();
            } catch (Exception e) {
                AccountLogger.log("AccountLoginActivity", "remove top fragment failed, finish and return", e);
                finishWhenCanceled();
                return;
            }
        }
        int iS0 = supportFragmentManager.s0();
        int i2 = 0;
        while (true) {
            if (i2 >= iS0) {
                i2 = -1;
                break;
            } else if (TextUtils.equals(supportFragmentManager.r0(i2).getName(), name)) {
                break;
            } else {
                i2++;
            }
        }
        if (!z3 && i2 != -1) {
            i2++;
        }
        if (i2 != -1) {
            for (int i3 = i2; i3 < iS0; i3++) {
                try {
                    supportFragmentManager.k1();
                } catch (Exception e2) {
                    AccountLogger.log("AccountLoginActivity", "remove top fragment failed, finish and return", e2);
                    finishWhenCanceled();
                    return;
                }
            }
        }
        if (i2 == -1 || z3) {
            supportFragmentManager.o().x(i, baseFragment, name).j(name).m();
        }
    }

    @Override // com.xiaomi.passport.ui.BaseActivity
    public BaseActivity.StatParams getStatParams() {
        return new BaseActivity.StatParams("登录页", null);
    }

    @Override // com.xiaomi.passport.ui.page.LoginUIAction
    public void gotoFragment(BaseLoginFragment.LoginFragmentType loginFragmentType, Bundle bundle, boolean z, boolean z2) {
        if (isDestroyed()) {
            return;
        }
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment instanceof BaseLoginFragment) {
            BaseLoginFragment baseLoginFragment = (BaseLoginFragment) currentFragment;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("ref", baseLoginFragment.getStatParams().mFragmentRefName);
        }
        showFragment(BaseLoginFragment.newInstance(bundle, loginFragmentType), R.id.login_activity_content, true, z, z2);
    }

    @Override // com.xiaomi.passport.ui.page.LoginUIAction
    public boolean isUserAgreementSelected() {
        if (isDestroyed()) {
            return false;
        }
        BaseFragment baseFragment = (BaseFragment) getSupportFragmentManager().k0(R.id.login_activity_content);
        if (baseFragment instanceof BaseLoginFragment) {
            return ((BaseLoginFragment) baseFragment).isUserAgreementSelected();
        }
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        List<Fragment> listY0 = getSupportFragmentManager().y0();
        if (listY0 != null && !listY0.isEmpty()) {
            Iterator<Fragment> it = listY0.iterator();
            while (it.hasNext()) {
                it.next().onActivityResult(i, i2, intent);
            }
        }
        if (i == REQ_CODE_CHOOSE_COUNTRY && i2 == -1) {
            this.mPageHeaderViewHolder.setCountryName(intent.getStringExtra("countryName"));
        }
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        if (getSupportFragmentManager().s0() > 1) {
            super.lambda$onCreate$0();
        } else {
            LoginAndRegisterController.finishWithLoginResult(this, null, null);
        }
    }

    @Override // com.xiaomi.passport.ui.internal.LayoutWrapperActivity, com.xiaomi.passport.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AccountLogger.log("AccountLoginActivity", "page intent extras: " + getIntent().getExtras());
        init();
    }

    @Override // com.xiaomi.passport.ui.internal.LayoutWrapperActivity
    public void onCreateContentView(ViewGroup viewGroup) {
        LayoutInflater.from(this).inflate(R.layout.passport_activity_account_login, viewGroup);
    }

    @Override // com.xiaomi.passport.ui.internal.LayoutWrapperActivity
    public void onCreateFooterView(ViewGroup viewGroup) {
        this.mSNSBarRoot = LayoutInflater.from(this).inflate(R.layout.passport_layout_account_login_page_footer, viewGroup);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment instanceof BaseLoginFragment) {
            BaseLoginFragment baseLoginFragment = (BaseLoginFragment) currentFragment;
            if (!TextUtils.isEmpty(baseLoginFragment.getLoginTypeStatName())) {
                int i = XiaomiAccountManager.get(this).getXiaomiAccount() != null ? 1 : 0;
                HashMap map = new HashMap();
                map.put("login_result", Integer.valueOf(i));
                map.put("category", baseLoginFragment.getLoginTypeStatName());
                map.put(StatConstants.Param.LONG_TIME_COST, Long.valueOf(SystemClock.elapsedRealtime() - baseLoginFragment.getPageStartTsMs().longValue()));
                if (i == 0) {
                    String str = LoginFailedReasonHolder.get();
                    if (str == null) {
                        str = "UnknownError";
                    }
                    map.put(StatConstants.Param.STRING_LOGIN_FAIL_REASON, str);
                }
                AccountStatInterface.getInstance().statEventWithTip("request", getString(R.string.passport_stat_tip_login_page_login_request_result), map);
            }
        }
        releaseViews();
        super.onDestroy();
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        init();
    }

    @Override // com.xiaomi.passport.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        finishAndResultIfAccountExists();
    }

    @Override // com.xiaomi.passport.ui.page.LoginUIAction
    public void showAgreementConfirmDialog(View.OnClickListener onClickListener) {
        if (isDestroyed()) {
            return;
        }
        BaseFragment baseFragment = (BaseFragment) getSupportFragmentManager().k0(R.id.login_activity_content);
        if (baseFragment instanceof BaseLoginFragment) {
            ((BaseLoginFragment) baseFragment).onCallAgreementConfirm(onClickListener);
        }
    }

    @Override // com.xiaomi.passport.ui.page.LoginUIAction
    public void showSNSLoginFragment(boolean z) {
        if (isDestroyed()) {
            return;
        }
        this.mSNSBarRoot.setVisibility(z ? 0 : 8);
    }
}
