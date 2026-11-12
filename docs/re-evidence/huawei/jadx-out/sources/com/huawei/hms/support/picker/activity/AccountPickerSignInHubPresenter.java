package com.huawei.hms.support.picker.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.a.a.a.a;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.common.CommonPickerConstant;
import com.huawei.hms.support.api.entity.common.PickerCommonNaming;
import com.huawei.hms.support.api.entity.hwid.AccountPickerSignInRequest;
import com.huawei.hms.support.picker.common.AccountPickerUtil;
import com.huawei.hms.support.picker.common.HMSAPKVersionCheckUtil;
import com.huawei.hms.support.picker.request.AccountPickerParams;
import com.huawei.hms.support.picker.result.AccountPickerResult;
import com.huawei.hms.support.picker.result.AuthAccountPicker;
import com.huawei.hms.support.picker.service.AccountLiteSdkServiceImpl;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hwidauth.api.ResultCallBack;
import com.huawei.hwidauth.c.j;
import com.huawei.hwidauth.datatype.DeviceInfo;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.tencent.connect.common.Constants;
import defpackage.nml;
import defpackage.nmq;
import defpackage.nmr;
import defpackage.nng;
import defpackage.nni;
import defpackage.nnj;
import defpackage.nnk;
import defpackage.nnl;
import defpackage.nom;
import defpackage.nop;
import defpackage.nox;
import defpackage.npd;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AccountPickerSignInHubPresenter extends AccountPickerSignInHubContract.Presenter {
    private static final int API_LEVEL_11 = 11;
    private static final int API_LEVEL_9 = 9;
    private static final int STRING_LENGTH_512 = 512;
    private static final String TAG = "AccountPickerSignInHubPresenter";
    private static final String TAINSID_KEY = "HiAnalyticsTransId";
    private String mAction;
    private a mClientInfo;
    private String mCodeVerifier;
    private Activity mContext;
    private DeviceInfo mDeviceInfo;
    private String mDeviceInfoStr;
    private boolean mHasAtPerMission;
    private boolean mHasIDTokenPerMission;
    private int mIdTokenSignAlg;
    private boolean mIsGuideLogin;
    private String mJsonCpClientInfo;
    private String mJsonSignInRequest;
    private String mParentAccessToken;
    private int mPickerType;
    private String mRedirectUrl;
    private String[] mScopes;
    private AccountPickerSignInHubContract.View mView;
    private AccountPickerSignInRequest mSignInRequest = null;
    private boolean mIsSignInByMCP = false;
    private boolean mIsNewService = false;
    private String mTransId = null;
    public boolean mIsActivityFullScreen = false;
    private String mLoginUrl = "";
    private String mGrsAppName = "";

    @Override // com.huawei.hwidauth.ui.b
    public void init(SafeIntent safeIntent) {
    }

    public AccountPickerSignInHubPresenter(Activity activity, AccountPickerSignInHubContract.View view) {
        this.mContext = activity;
        this.mView = view;
    }

    @Override // com.huawei.hms.support.picker.activity.AccountPickerSignInHubContract.Presenter
    public boolean initIntent(Intent intent) {
        if (intent == null || checkIntentBomb(intent)) {
            onSignInFailed("invalid intent");
            return false;
        }
        SafeIntent safeIntent = new SafeIntent(intent);
        this.mTransId = safeIntent.getStringExtra("transId");
        this.mJsonCpClientInfo = safeIntent.getStringExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDCPCLIENTINFO);
        this.mJsonSignInRequest = safeIntent.getStringExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDSIGNINREQUEST);
        this.mIsNewService = safeIntent.getBooleanExtra(AuthInternalPickerConstant.SignInReqKey.IS_NEW_SERVICE, false);
        this.mIsSignInByMCP = safeIntent.getBooleanExtra(AuthInternalPickerConstant.SignInReqKey.MCP_SIGN_IN, false);
        nox.b(TAG, "onCreate: isSignInByMCP = " + this.mIsSignInByMCP, true);
        byte[] bArr = new byte[32];
        npd.b().nextBytes(bArr);
        this.mCodeVerifier = nop.a(bArr);
        nox.b(TAG, "onCreate: mCodeVerifier = " + this.mCodeVerifier, false);
        this.mIsActivityFullScreen = safeIntent.getBooleanExtra("intent.extra.isfullscreen", false);
        nox.b(TAG, "mIsActivityFullScreen = " + this.mIsActivityFullScreen, true);
        try {
            this.mSignInRequest = AccountPickerSignInRequest.fromJson(this.mJsonSignInRequest);
        } catch (JSONException unused) {
            this.mSignInRequest = null;
            nox.a(TAG, "onCreate: JsonException", true);
        }
        return checkParams(safeIntent);
    }

    private boolean checkIntentBomb(Intent intent) {
        if (intent == null) {
            return true;
        }
        try {
            intent.getStringExtra("ANYTHING");
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.huawei.hms.support.picker.activity.AccountPickerSignInHubContract.Presenter
    public void doSilentTokenRequest() {
        nnk.a().b(this.mContext, this.mGrsAppName, new nni(this.mContext, new nnl.e().b(this.mClientInfo.getSubAppId()).d(Constants.PARAM_ACCESS_TOKEN).c(this.mParentAccessToken).j(this.mContext.getPackageName()).i(this.mDeviceInfo.a()).h(this.mDeviceInfo.c()).a(nom.d(this.mScopes)).e(this.mDeviceInfo.e()).e(true).c((Integer) 1).g(this.mIdTokenSignAlg == 1 ? "PS256" : CommonPickerConstant.IdTokenSupportAlg.RS_256).b()), new j() { // from class: com.huawei.hms.support.picker.activity.AccountPickerSignInHubPresenter.1
            @Override // com.huawei.hwidauth.c.j
            public void onSuccess(String str) {
                nox.b(AccountPickerSignInHubPresenter.TAG, "doSilentTokeRequest success: response is empty?" + TextUtils.isEmpty(str), true);
                nox.b(AccountPickerSignInHubPresenter.TAG, "response : " + str, false);
                if (TextUtils.isEmpty(str)) {
                    AccountPickerSignInHubPresenter.this.onSignInFailed(2015);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has(VastAttribute.ERROR)) {
                        AccountPickerSignInHubPresenter.this.dealSilentTokenErrorResponse(jSONObject.optInt(VastAttribute.ERROR));
                    } else {
                        AccountPickerSignInHubPresenter.this.onSignInSuccess(str);
                    }
                } catch (Exception e) {
                    nox.a(AccountPickerSignInHubPresenter.TAG, "exception: " + e.getClass().getSimpleName(), true);
                    AccountPickerSignInHubPresenter.this.onSignInFailed(2015);
                }
            }

            @Override // com.huawei.hwidauth.c.j
            public void onFailure(int i, String str) {
                nox.b(AccountPickerSignInHubPresenter.TAG, "doSilentTokeRequest onFailure: error code = " + i + ",error msg =" + str, false);
                StringBuilder sb = new StringBuilder("doSilentTokeRequest onFailure: error code = ");
                sb.append(i);
                nox.b(AccountPickerSignInHubPresenter.TAG, sb.toString(), true);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has(VastAttribute.ERROR)) {
                        AccountPickerSignInHubPresenter.this.dealSilentTokenErrorResponse(jSONObject.optInt(VastAttribute.ERROR));
                    } else {
                        AccountPickerSignInHubPresenter.this.onSignInFailed(i);
                    }
                } catch (JSONException e) {
                    nox.a(AccountPickerSignInHubPresenter.TAG, "exception: " + e.getClass().getSimpleName(), true);
                    AccountPickerSignInHubPresenter.this.onSignInFailed(2015);
                }
            }
        });
    }

    @Override // com.huawei.hms.support.picker.activity.AccountPickerSignInHubContract.Presenter
    public void checkMinVersion() {
        nox.b(TAG, "checkMinVersion start.", true);
        if (this.mIsSignInByMCP) {
            nox.b(TAG, "sign by MCP", true);
            doSilentTokenRequest();
        } else {
            HMSAPKVersionCheckUtil.checkAvailabilityAndConnect(this.mContext, this.mPickerType, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.support.picker.activity.AccountPickerSignInHubPresenter.2
                @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                public void onComplete(int i) {
                    if (i == 0) {
                        nox.b(AccountPickerSignInHubPresenter.TAG, "version check ok", true);
                        AccountPickerSignInHubPresenter.this.mView.startSignInActivity(AccountPickerSignInHubPresenter.this.getApkSignInIntent(), AccountPickerSignInHubActivity.IDENTIFIER);
                    } else if (1 == i) {
                        nox.b(AccountPickerSignInHubPresenter.TAG, "hms core is not install", true);
                        AccountPickerSignInHubPresenter.this.getSignInIntentByH5();
                    } else {
                        nox.b(AccountPickerSignInHubPresenter.TAG, "version check failed", true);
                        AccountPickerSignInHubPresenter.this.onSignInFailed(i);
                    }
                }
            });
        }
    }

    @Override // com.huawei.hms.support.picker.activity.AccountPickerSignInHubContract.Presenter
    public void doTokenRequest(String str) {
        nox.b(TAG, "doTokenRequest: enter", true);
        nnk.a().b(this.mContext, this.mGrsAppName, new nng(this.mContext, new nnj.e().j(str).b(this.mClientInfo.getSubAppId()).f(this.mRedirectUrl).h(this.mContext.getPackageName()).b((Integer) 1).a(this.mDeviceInfo.a()).e(this.mDeviceInfo.c()).d(this.mDeviceInfo.e()).b(true).a(true).c(this.mCodeVerifier).g(this.mIdTokenSignAlg == 1 ? "PS256" : CommonPickerConstant.IdTokenSupportAlg.RS_256).e()), new j() { // from class: com.huawei.hms.support.picker.activity.AccountPickerSignInHubPresenter.3
            @Override // com.huawei.hwidauth.c.j
            public void onSuccess(String str2) {
                nox.b(AccountPickerSignInHubPresenter.TAG, "doTokenRequest success: response is empty?" + TextUtils.isEmpty(str2), true);
                nox.b(AccountPickerSignInHubPresenter.TAG, "response : " + str2, false);
                if (TextUtils.isEmpty(str2)) {
                    AccountPickerSignInHubPresenter.this.onSignInFailed(2015);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.has(VastAttribute.ERROR)) {
                        int i = jSONObject.getInt(VastAttribute.ERROR);
                        nox.b(AccountPickerSignInHubPresenter.TAG, "error = " + i, true);
                        AccountPickerSignInHubPresenter.this.onSignInFailed(i);
                        return;
                    }
                    AccountPickerSignInHubPresenter.this.onSignInSuccess(str2);
                } catch (JSONException unused) {
                    nox.a(AccountPickerSignInHubPresenter.TAG, "doTokenRequest JSONException", true);
                    AccountPickerSignInHubPresenter.this.onSignInFailed(2015);
                }
            }

            @Override // com.huawei.hwidauth.c.j
            public void onFailure(int i, String str2) {
                nox.b(AccountPickerSignInHubPresenter.TAG, "doTokenRequest onFailure: error code = " + i, true);
                nox.b(AccountPickerSignInHubPresenter.TAG, "doTokenRequest onFailure: error code = " + i + ",error msg =" + str2, false);
                AccountPickerSignInHubPresenter.this.onSignInFailed(i);
            }
        });
    }

    @Override // com.huawei.hms.support.picker.activity.AccountPickerSignInHubContract.Presenter
    public void restoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            this.mTransId = bundle.getString(TAINSID_KEY);
        }
    }

    @Override // com.huawei.hms.support.picker.activity.AccountPickerSignInHubContract.Presenter
    public void onSaveInstanceState(Bundle bundle) {
        String str = this.mTransId;
        if (str == null || bundle == null) {
            return;
        }
        bundle.putString(TAINSID_KEY, str);
    }

    @Override // com.huawei.hms.support.picker.activity.AccountPickerSignInHubContract.Presenter
    public void onSignInSuccess(String str) throws JSONException {
        nox.b(TAG, "onSignInSuccess: enter", true);
        AuthAccountPicker authAccountPickerFromJson = AuthAccountPicker.fromJson(resetJson(str));
        authAccountPickerFromJson.setAccountAttr(Integer.parseInt("1"));
        if (!this.mHasAtPerMission) {
            authAccountPickerFromJson.setAccessToken(null);
        }
        if (!this.mHasIDTokenPerMission) {
            authAccountPickerFromJson.setIdToken(null);
        }
        AccountPickerResult accountPickerResult = new AccountPickerResult();
        accountPickerResult.setAuthAccountPicker(authAccountPickerFromJson);
        accountPickerResult.setStatus(new Status(0));
        Intent intent = new Intent();
        String json = accountPickerResult.toJson();
        nox.b(TAG, "onSignInSuccess: json = " + json, false);
        intent.putExtra("HUAWEIID_SIGNIN_RESULT", json);
        report(0);
        this.mView.exit(-1, intent);
    }

    @Override // com.huawei.hms.support.picker.activity.AccountPickerSignInHubContract.Presenter
    public void onSignInFailed(int i) {
        nox.b(TAG, "onSignInFailed, retCode：" + i, true);
        report(i);
        Status status = new Status(i);
        AccountPickerResult accountPickerResult = new AccountPickerResult();
        accountPickerResult.setStatus(status);
        Intent intent = new Intent();
        try {
            intent.putExtra("HUAWEIID_SIGNIN_RESULT", accountPickerResult.toJson());
        } catch (JSONException unused) {
            nox.a(TAG, "translate result to json exception", true);
        }
        this.mView.exit(0, intent);
    }

    @Override // com.huawei.hms.support.picker.activity.AccountPickerSignInHubContract.Presenter
    public boolean isNeedRequestToken(String str) {
        if (this.mIsSignInByMCP) {
            return (this.mHasIDTokenPerMission || this.mHasAtPerMission) && "1".equals(str);
        }
        return false;
    }

    @Override // com.huawei.hms.support.picker.activity.AccountPickerSignInHubContract.Presenter
    public void report(int i) {
        a aVar;
        if (this.mTransId == null || (aVar = this.mClientInfo) == null) {
            return;
        }
        String str = this.mIsNewService ? PickerCommonNaming.signinAccountPickerType : PickerCommonNaming.signinIntent;
        nox.b(TAG, "report: api = " + str + ",HmsSdkVersion = " + aVar.getHmsSdkVersion() + ",appId = " + this.mClientInfo.getAppId(), true);
    }

    private String resetJson(String str) {
        nox.b(TAG, "resetJson before: json = " + str, false);
        String strReplace = str.replace("\"access_token\"", "\"accessToken\"").replace("\"open_id\"", "\"openId\"").replace("\"code\"", "\"serverAuthCode\"").replace("\"id_token\"", "\"idToken\"");
        nox.b(TAG, "resetJson before: json =  " + strReplace, false);
        return strReplace;
    }

    @Override // com.huawei.hms.support.picker.activity.AccountPickerSignInHubContract.Presenter
    public void startWebViewActivity() {
        if (this.mIsSignInByMCP || !TextUtils.isEmpty(this.mClientInfo.getSubAppId())) {
            if (TextUtils.isEmpty(this.mParentAccessToken)) {
                nox.a(TAG, "param is error, hostAccessToken cannot be empty", true);
                onSignInFailed(2003);
                return;
            } else {
                doSilentTokenRequest();
                return;
            }
        }
        getSignInIntentByH5();
    }

    @Override // com.huawei.hms.support.picker.activity.AccountPickerSignInHubContract.Presenter
    public AccountPickerSignInRequest getSignInRequest() {
        return this.mSignInRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealSilentTokenErrorResponse(int i) {
        nox.b(TAG, "dealSilentTokenErrorResponse:error = " + i, true);
        if (1301 == i) {
            nox.b(TAG, "dealSilentTokenErrorResponse: H5 unauthorized", true);
            getSignInIntentByH5();
            return;
        }
        if (1203 == i) {
            nox.b(TAG, "dealSilentTokenErrorResponse: H5 token revoked" + i, true);
            if (this.mIsGuideLogin) {
                this.mParentAccessToken = "";
                try {
                    nmq.e(this.mContext, new ResultCallBack<nml>() { // from class: com.huawei.hms.support.picker.activity.AccountPickerSignInHubPresenter.4
                        @Override // com.huawei.hwidauth.api.ResultCallBack
                        public void onResult(nml nmlVar) {
                            if (nmlVar.getStatus().d()) {
                                nox.b(AccountPickerSignInHubPresenter.TAG, "signOut success", false);
                                AccountPickerSignInHubPresenter.this.getSignInIntentByH5();
                            } else {
                                AccountPickerSignInHubPresenter.this.onSignInFailed(2015);
                            }
                        }
                    });
                    return;
                } catch (nmr unused) {
                    nox.a(TAG, "ParmaInvalidException", true);
                    onSignInFailed(2015);
                    return;
                }
            }
            onSignInFailed(2008);
            return;
        }
        onSignInFailed(2008);
    }

    private boolean checkClientInfo() {
        if (TextUtils.isEmpty(this.mJsonCpClientInfo)) {
            onSignInFailed("Activity started with invalid cp client info");
            return false;
        }
        try {
            this.mClientInfo = a.a(this.mJsonCpClientInfo);
        } catch (JSONException unused) {
            this.mClientInfo = null;
            nox.a(TAG, "checkClientInfo: JsonException", true);
        }
        if (this.mSignInRequest != null && this.mClientInfo != null) {
            return true;
        }
        onSignInFailed("Activity started with invalid sign in request info");
        return false;
    }

    private boolean checkParams(SafeIntent safeIntent) {
        String str;
        String action = safeIntent.getAction();
        this.mAction = action;
        if (!TextUtils.equals(AuthInternalPickerConstant.IntentAction.ACTION_SIGN_IN_HUB, action)) {
            if (this.mAction == null) {
                str = "unknow Action:";
            } else {
                str = "Action:" + this.mAction;
            }
            onSignInFailed(str);
            return false;
        }
        if (!checkClientInfo()) {
            return false;
        }
        AccountPickerParams accountPickerParams = this.mSignInRequest.getAccountPickerParams();
        if (!checkRequestParameters(safeIntent, accountPickerParams)) {
            onSignInFailed("Paramers is invalid");
            return false;
        }
        return initAccountPickerParam(accountPickerParams);
    }

    private boolean checkRequestParameters(SafeIntent safeIntent, AccountPickerParams accountPickerParams) {
        nox.b(TAG, "checkRequestParameters start.", true);
        try {
            JSONObject jSONObject = new JSONObject(accountPickerParams.getSignInParams());
            this.mPickerType = jSONObject.optInt(AuthInternalPickerConstant.SignInReqKey.PICKER_TYPE);
            int i = jSONObject.getInt("idTokenSignAlg");
            this.mIdTokenSignAlg = i;
            if (i != 1 && i != 2) {
                nox.a(TAG, "idTokenSignAlg is invalid", true);
                return false;
            }
            this.mParentAccessToken = jSONObject.optString(CommonPickerConstant.RequestParams.KEY_HOST_ACCESS_TOKEN, this.mParentAccessToken);
            nox.b(TAG, "hostAccessToken is " + this.mParentAccessToken, false);
            if (this.mIsSignInByMCP && (TextUtils.isEmpty(this.mParentAccessToken) || TextUtils.isEmpty(this.mClientInfo.getSubAppId()))) {
                nox.a(TAG, "hostAccessToken is empty or subAppId is empty when sign by MCP", true);
                return false;
            }
            if (TextUtils.isEmpty(jSONObject.optString(CommonPickerConstant.RequestParams.KEY_GRS_APP_NAME))) {
                nox.a(TAG, "grsAppName is empty", true);
                return false;
            }
            String stringExtra = safeIntent.getStringExtra(CommonPickerConstant.RequestParams.PETAL_MAIL_ADDR);
            int intExtra = safeIntent.getIntExtra(AuthInternalPickerConstant.SignInReqKey.PETAL_MAIL_FLAG, 0);
            int intExtra2 = safeIntent.getIntExtra(AuthInternalPickerConstant.SignInReqKey.UI_STYLE, 1);
            if (!TextUtils.isEmpty(stringExtra)) {
                jSONObject.put(CommonPickerConstant.RequestParams.PETAL_MAIL_ADDR, stringExtra);
            }
            jSONObject.put(AuthInternalPickerConstant.SignInReqKey.UI_STYLE, intExtra2);
            nox.b(TAG, "request picker type is " + this.mPickerType + " and petalMailFlag is " + intExtra + " and uiStyle is " + intExtra2, true);
            String stringExtra2 = safeIntent.getStringExtra(AuthInternalPickerConstant.SignInReqKey.MAIL_SUPPORT_COUNTRY_LIST);
            if (intExtra == 1 && TextUtils.isEmpty(stringExtra2)) {
                return false;
            }
            nox.b(TAG, "petalMail request Parameters is ok.", true);
            jSONObject.put(AuthInternalPickerConstant.SignInReqKey.PETAL_MAIL_FLAG, intExtra);
            jSONObject.put(AuthInternalPickerConstant.SignInReqKey.MAIL_SUPPORT_COUNTRY_LIST, stringExtra2);
            accountPickerParams.setSignInParams(jSONObject.toString());
            this.mJsonSignInRequest = this.mSignInRequest.toJson();
            return true;
        } catch (JSONException e) {
            nox.a(TAG, "JSONException:" + e.getClass().getSimpleName(), true);
            return false;
        }
    }

    private boolean initAccountPickerParam(AccountPickerParams accountPickerParams) {
        this.mRedirectUrl = accountPickerParams.getRedirectUrl();
        String deviceInfo = accountPickerParams.getDeviceInfo();
        this.mDeviceInfoStr = deviceInfo;
        this.mDeviceInfo = DeviceInfo.a(this.mContext, deviceInfo);
        if (TextUtils.isEmpty(this.mDeviceInfoStr) || this.mDeviceInfo == null) {
            onSignInFailed("device info is null");
            return false;
        }
        this.mScopes = accountPickerParams.getStringArray();
        this.mIsGuideLogin = accountPickerParams.isGuideLogin();
        this.mLoginUrl = accountPickerParams.getLoginUrl();
        this.mGrsAppName = accountPickerParams.getGrsAppName();
        if (accountPickerParams.getQRPromptSecondLevel().length() > 512) {
            onSignInFailed("qRPromptSecondLevel length is too long.");
            return false;
        }
        ArrayList<PermissionInfo> permissionArray = accountPickerParams.getPermissionArray();
        if (permissionArray != null) {
            for (PermissionInfo permissionInfo : permissionArray) {
                if ("https://www.huawei.com/auth/account/base.profile/accesstoken".equals(permissionInfo.getPermission())) {
                    this.mHasAtPerMission = true;
                } else if ("idtoken".equals(permissionInfo.getPermission())) {
                    this.mHasIDTokenPerMission = true;
                }
            }
        }
        return true;
    }

    private void onSignInFailed(String str) {
        nox.b(TAG, "onSignInFailed: errMSG = " + str, true);
        onSignInFailed(2003);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getSignInIntentByH5() {
        nox.b(TAG, "getSignInIntentByH5 start", true);
        if (!AccountPickerUtil.networkIsAvaiable(this.mContext)) {
            nox.b(TAG, "Network  is Unavailable", true);
            onSignInFailed(2005);
            return;
        }
        try {
            nox.b(TAG, "getSignInIntentByH5 input deviceInfo", true);
            Activity activity = this.mContext;
            String str = this.mGrsAppName;
            String[] strArr = this.mScopes;
            String str2 = this.mRedirectUrl;
            String str3 = this.mDeviceInfoStr;
            String str4 = this.mCodeVerifier;
            boolean z = this.mIsSignInByMCP;
            this.mView.startSignInActivity(AccountLiteSdkServiceImpl.signInH5(activity, str, strArr, str2, str3, str4, z, this.mParentAccessToken, z ? this.mClientInfo.getSubAppId() : this.mClientInfo.getAppId(), this.mLoginUrl), AccountPickerSignInHubActivity.IDENTIFIER_H5);
        } catch (Exception e) {
            nox.a(TAG, "Exception = " + e.getClass().getSimpleName(), true);
            if (e instanceof nmr) {
                onSignInFailed(2003);
            } else {
                onSignInFailed(2015);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent getApkSignInIntent() {
        nox.b(TAG, "getApkSignInIntent", true);
        try {
            ForegroundIntentBuilder kitSdkVersion = new ForegroundIntentBuilder(this.mContext).setAction(this.mAction).setRequestBody(this.mJsonSignInRequest).setKitSdkVersion(AuthInternalPickerConstant.HMS_SDK_VERSION);
            nox.b(TAG, "isNewService: " + this.mIsNewService, true);
            kitSdkVersion.setApiLevel(this.mIsNewService ? 11 : 9);
            String subAppId = this.mClientInfo.getSubAppId();
            if (!TextUtils.isEmpty(subAppId)) {
                this.mIsSignInByMCP = true;
                kitSdkVersion.setSubAppId(subAppId);
            }
            Intent intentBuild = kitSdkVersion.build();
            nox.b(TAG, "get package name of hms is " + HMSPackageManager.getInstance(this.mContext).getHMSPackageName(), true);
            nox.b(TAG, "current package is " + this.mContext.getPackageName(), true);
            intentBuild.setPackage(this.mContext.getPackageName());
            return intentBuild;
        } catch (Exception e) {
            nox.a(TAG, "getSignInIntent failed because:" + e.getClass().getSimpleName(), true);
            return new Intent();
        }
    }
}
