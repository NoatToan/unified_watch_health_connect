package com.xiaomi.passport.ui.page;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.xiaomi.account.passportsdk.account_sso.R;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.accountsdk.account.serverpassthrougherror.ServerPassThroughErrorHandler;
import com.xiaomi.accountsdk.account.serverpassthrougherror.data.PassThroughErrorInfo;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.passport.snscorelib.PassportSNSController;
import com.xiaomi.passport.ui.internal.FacebookAuthProvider;
import com.xiaomi.passport.ui.internal.GoogleAuthProvider;
import com.xiaomi.passport.ui.internal.QQSSOAuthProvider;
import com.xiaomi.passport.ui.internal.SNSAuthCredential;
import com.xiaomi.passport.ui.internal.SNSAuthProvider;
import com.xiaomi.passport.ui.internal.WeChatAuthProvider;
import com.xiaomi.passport.ui.internal.WeiboSSOAuthProvider;
import com.xiaomi.passport.ui.utils.LoginAndRegisterController;
import com.xiaomi.passport.ui.utils.LoginFailedReasonHolder;
import com.xiaomi.passport.ui.view.PassportDialog;
import com.xiaomi.passport.uicontroller.PhoneLoginController;
import com.xiaomi.passport.uicontroller.SimpleFutureTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class SNSLoginFragment extends BaseLoginFragment implements View.OnClickListener {
    private static final String TAG = "SNSLoginFragment";
    private SimpleFutureTask<Boolean> mCheckSnsLoginTask;
    private ImageView mFacebookIcon;
    private ImageView mGoogleIcon;
    private ImageView mQQIcon;
    private View mRootView;
    private SNSAuthProvider mSNSAuthProvider;
    private Map<String, SNSAuthProvider> mSNSAuthProviderMap;
    private ImageView mWechatIcon;
    private ImageView mWeiboIcon;

    private void initSettings() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x008f A[SYNTHETIC] */
    private void initVars() {
        ArrayList<String> stringArrayList = getFullArguments().getStringArrayList(AccountLoginActivity.EXTRA_STRING_LIST_SNS_ENTRANCE);
        this.mSNSAuthProviderMap = new HashMap();
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            for (String str : stringArrayList) {
                str.hashCode();
                byte b2 = -1;
                switch (str) {
                    case "google":
                        b2 = 0;
                    case "weixin":
                        b2 = 1;
                    case "qq":
                        b2 = 2;
                    case "weibo":
                        b2 = 3;
                    case "facebook":
                        b2 = 4;
                    default:
                        switch (b2) {
                            case 0:
                                this.mSNSAuthProviderMap.put(str, new GoogleAuthProvider());
                                this.mGoogleIcon.setVisibility(0);
                                break;
                            case 1:
                                this.mSNSAuthProviderMap.put(str, new WeChatAuthProvider());
                                this.mWechatIcon.setVisibility(0);
                                break;
                            case 2:
                                this.mSNSAuthProviderMap.put(str, new QQSSOAuthProvider());
                                this.mQQIcon.setVisibility(0);
                                break;
                            case 3:
                                this.mSNSAuthProviderMap.put(str, new WeiboSSOAuthProvider());
                                this.mWeiboIcon.setVisibility(0);
                                break;
                            case 4:
                                this.mSNSAuthProviderMap.put(str, new FacebookAuthProvider());
                                this.mFacebookIcon.setVisibility(0);
                                break;
                            default:
                                LoginFailedReasonHolder.set("UnknownSNSType");
                                throw new IllegalStateException("unknown sns type " + str);
                        }
                }
            }
        }
        if (this.mSNSAuthProviderMap.isEmpty()) {
            this.mRootView.setVisibility(8);
        }
    }

    private void initViews(View view) {
        this.mFacebookIcon = (ImageView) view.findViewById(R.id.sdk_facebook_auth);
        this.mGoogleIcon = (ImageView) view.findViewById(R.id.sdk_google_auth);
        this.mWeiboIcon = (ImageView) view.findViewById(R.id.sdk_weibo_auth);
        this.mQQIcon = (ImageView) view.findViewById(R.id.sdk_qq_auth);
        this.mWechatIcon = (ImageView) view.findViewById(R.id.sdk_wechat_auth);
        this.mFacebookIcon.setOnClickListener(this);
        this.mGoogleIcon.setOnClickListener(this);
        this.mWeiboIcon.setOnClickListener(this);
        this.mQQIcon.setOnClickListener(this);
        this.mWechatIcon.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void login(SNSAuthProvider sNSAuthProvider) {
        if (sNSAuthProvider.isServiceAvailable(getActivity())) {
            sNSAuthProvider.startLogin(getActivity(), this.mSid, getName());
        } else {
            new PassportDialog(getContext()).setTitle(getString(R.string.passport_attention)).setPositiveButton(getString(R.string.passport_i_know), null).setMessage(getString(R.string.passport_third_sns_service_unavailable)).show();
        }
    }

    private void releaseViews() {
        Iterator<SNSAuthProvider> it = this.mSNSAuthProviderMap.values().iterator();
        while (it.hasNext()) {
            it.next().onProviderRecycle();
        }
        SimpleFutureTask<Boolean> simpleFutureTask = this.mCheckSnsLoginTask;
        if (simpleFutureTask != null) {
            simpleFutureTask.cancel(true);
            this.mCheckSnsLoginTask = null;
        }
    }

    public void checkUseSnsLogin(final SNSAuthProvider sNSAuthProvider) {
        this.mCheckSnsLoginTask = PassportSNSController.checkAppIsCanUseSnsLogin(getContext(), sNSAuthProvider, new PhoneLoginController.CheckAppIsCanUseSnsLoginCallback() { // from class: com.xiaomi.passport.ui.page.SNSLoginFragment.4
            @Override // com.xiaomi.passport.uicontroller.PhoneLoginController.CheckAppIsCanUseSnsLoginCallback
            public void onServerError(PhoneLoginController.ErrorCode errorCode, PassThroughErrorInfo passThroughErrorInfo) {
                if (SNSLoginFragment.this.isActivityAlive()) {
                    AccountLogger.log(SNSLoginFragment.TAG, "app can not use sns login");
                    ServerPassThroughErrorHandler.handleServerPassThroughError(SNSLoginFragment.this.getActivity(), passThroughErrorInfo, new PassThroughErrorInfo.Builder().setMsgContent(LoginAndRegisterController.convertErrorCodeToMessage(SNSLoginFragment.this.getContext(), errorCode)).build());
                }
            }

            @Override // com.xiaomi.passport.uicontroller.PhoneLoginController.CheckAppIsCanUseSnsLoginCallback
            public void onSuccess(boolean z) {
                if (SNSLoginFragment.this.isActivityAlive()) {
                    AccountLogger.log(SNSLoginFragment.TAG, "result = " + z + "app can use sns login");
                    SNSLoginFragment.this.login(sNSAuthProvider);
                }
            }
        });
    }

    @Override // com.xiaomi.passport.ui.page.BaseLoginFragment
    public String getLoginTypeStatName() {
        StringBuilder sb = new StringBuilder();
        sb.append("SNS-");
        SNSAuthProvider sNSAuthProvider = this.mSNSAuthProvider;
        sb.append(sNSAuthProvider == null ? AbstractJsonLexerKt.NULL : sNSAuthProvider.name);
        return sb.toString();
    }

    @Override // com.xiaomi.passport.ui.page.BaseFragment
    public BaseFragment.StatParams getStatParams() {
        Fragment fragmentK0 = ((AccountLoginActivity) getActivity()).getSupportFragmentManager().k0(R.id.login_activity_content);
        return fragmentK0 instanceof BaseLoginFragment ? new BaseFragment.StatParams(((BaseLoginFragment) fragmentK0).getStatParams().mFragmentRefName, null) : new BaseFragment.StatParams("其他方式登录页面", null);
    }

    @Override // com.xiaomi.passport.ui.page.BaseLoginFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        initVars();
        initSettings();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (SNSAuthProvider sNSAuthProvider : this.mSNSAuthProviderMap.values()) {
            if (i == sNSAuthProvider.getRequestCode()) {
                sNSAuthProvider.onActivityResult(getActivity(), i, i2, intent);
                SNSAuthCredential sNSAuthCredential = SNSAuthProvider.sAuthCredential;
                if (sNSAuthCredential != null) {
                    SNSAuthProvider.invalidAuthCredential();
                    LoginAndRegisterController.loginSNS(getActivity(), sNSAuthProvider, sNSAuthCredential, new DefaultLoginCallback() { // from class: com.xiaomi.passport.ui.page.SNSLoginFragment.2
                        @Override // com.xiaomi.passport.ui.page.DefaultLoginCallback, com.xiaomi.passport.ui.presenter.BaseLoginPresenter.OnBaseLoginListener
                        public void onLoginSuccess(AccountInfo accountInfo) {
                            LoginAndRegisterController.storePassToken(SNSLoginFragment.this.getActivity(), accountInfo);
                            LoginAndRegisterController.finishWithLoginResult(SNSLoginFragment.this.getActivity(), accountInfo, SNSLoginFragment.this.mLoginAgreementAndPrivacy);
                        }
                    });
                    return;
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        final SNSAuthProvider sNSAuthProvider;
        if (view == this.mFacebookIcon) {
            sNSAuthProvider = this.mSNSAuthProviderMap.get("facebook");
            statClick(R.string.passport_stat_tip_sns_login_page_click_facebook_login);
        } else if (view == this.mGoogleIcon) {
            sNSAuthProvider = this.mSNSAuthProviderMap.get("google");
            statClick(R.string.passport_stat_tip_sns_login_page_click_google_login);
        } else if (view == this.mWeiboIcon) {
            sNSAuthProvider = this.mSNSAuthProviderMap.get(SNSAuthProvider.SNS_TYPE_WEIBO);
            statClick(R.string.passport_stat_tip_sns_login_page_click_weibo_login);
        } else if (view == this.mQQIcon) {
            sNSAuthProvider = this.mSNSAuthProviderMap.get("qq");
            statClick(R.string.passport_stat_tip_sns_login_page_click_qq_login);
        } else if (view == this.mWechatIcon) {
            sNSAuthProvider = this.mSNSAuthProviderMap.get("weixin");
            statClick(R.string.passport_stat_tip_sns_login_page_click_weixin_login);
        } else {
            sNSAuthProvider = null;
        }
        this.mSNSAuthProvider = sNSAuthProvider;
        if (this.mLoginUIAction.isUserAgreementSelected()) {
            checkUseSnsLogin(sNSAuthProvider);
        } else {
            this.mLoginUIAction.showAgreementConfirmDialog(new View.OnClickListener() { // from class: com.xiaomi.passport.ui.page.SNSLoginFragment.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    SNSLoginFragment.this.checkUseSnsLogin(sNSAuthProvider);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.passport_fragment_sns_login, viewGroup, false);
        this.mRootView = viewInflate;
        initViews(viewInflate);
        return this.mRootView;
    }

    @Override // com.xiaomi.passport.ui.page.BaseLoginFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        releaseViews();
        super.onDestroyView();
    }

    @Override // com.xiaomi.passport.ui.page.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SNSAuthCredential sNSAuthCredential = SNSAuthProvider.sAuthCredential;
        if (sNSAuthCredential != null) {
            SNSAuthProvider.invalidAuthCredential();
            LoginAndRegisterController.loginSNS(getContext(), this.mSNSAuthProviderMap.get(sNSAuthCredential.provider), sNSAuthCredential, new DefaultLoginCallback() { // from class: com.xiaomi.passport.ui.page.SNSLoginFragment.1
                @Override // com.xiaomi.passport.ui.page.DefaultLoginCallback, com.xiaomi.passport.ui.presenter.BaseLoginPresenter.OnBaseLoginListener
                public void onLoginSuccess(AccountInfo accountInfo) {
                    LoginAndRegisterController.storePassToken(SNSLoginFragment.this.getActivity(), accountInfo);
                    LoginAndRegisterController.finishWithLoginResult(SNSLoginFragment.this.getActivity(), accountInfo, SNSLoginFragment.this.mLoginAgreementAndPrivacy);
                }
            });
        }
    }
}
