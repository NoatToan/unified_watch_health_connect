package com.huawei.hms.support.picker.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.a.a.c.a;
import com.huawei.hms.support.api.entity.common.CommonPickerConstant;
import com.huawei.hms.support.picker.common.AccountPickerUtil;
import com.huawei.hms.support.picker.result.AccountPickerResult;
import defpackage.nos;
import defpackage.nox;
import defpackage.npi;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AccountPickerSignInHubActivity extends Activity implements AccountPickerSignInHubContract.View {
    public static final int IDENTIFIER = 16587;
    public static final int IDENTIFIER_H5 = 16588;
    private static final String TAG = "AccountPickerSignInHubActivity";
    private AccountPickerSignInHubPresenter mPresenter;
    private boolean signInNotFoundActivity;
    private AccountPickerResult signInResult = null;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        nox.b(TAG, "onCreate", true);
        super.onCreate(bundle);
        setStatusBar();
        AccountPickerSignInHubPresenter accountPickerSignInHubPresenter = new AccountPickerSignInHubPresenter(this, this);
        this.mPresenter = accountPickerSignInHubPresenter;
        if (accountPickerSignInHubPresenter.initIntent(getIntent())) {
            if (this.mPresenter.mIsActivityFullScreen) {
                AccountPickerUtil.setFullScreenAdaptCutout(getWindow());
            } else {
                AccountPickerUtil.setStatusBarColor(this);
            }
            AccountPickerUtil.setEMUI10StatusBarColor(this);
            if (bundle != null) {
                this.mPresenter.restoreInstanceState(bundle);
            } else {
                this.mPresenter.checkMinVersion();
            }
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        nox.b(TAG, "onActivityResult: requestCode = " + i + "; resultCode = " + i2, true);
        if (!this.signInNotFoundActivity && i == 16587 && intent != null) {
            nox.b(TAG, "data is not null", true);
            String stringExtra = intent.getStringExtra("HUAWEIID_SIGNIN_RESULT");
            if (stringExtra != null) {
                nox.b(TAG, "jsonSignInResult is not null", true);
                dealApkSignInResult(stringExtra, intent, 2015, i2);
                return;
            }
        }
        if (i == 16588) {
            handleH5LoginResult(i2, intent, 2015);
            return;
        }
        if (i2 <= 0) {
            i2 = 2015;
        }
        this.mPresenter.onSignInFailed(i2);
    }

    private void handleH5LoginResult(int i, Intent intent, int i2) {
        nox.b(TAG, "handleH5LoginResult start.", true);
        if (intent != null) {
            nox.b(TAG, "data is not null", true);
            String stringExtra = intent.getStringExtra("HUAWEIID_SIGNIN_RESULT");
            nox.b(TAG, "handleH5LoginResult: jsonSignInResult = " + stringExtra, false);
            if (stringExtra != null) {
                nox.b(TAG, "jsonSignInResult is not null", true);
                int iSaveDataByApkOrH5 = saveDataByApkOrH5(i2, stringExtra);
                if (iSaveDataByApkOrH5 != 0 || this.signInResult.getAuthAccountPicker() == null) {
                    nox.b(TAG, "handleH5LoginResult: status code is invalid", true);
                    this.mPresenter.onSignInFailed(iSaveDataByApkOrH5);
                    return;
                }
                nox.b(TAG, "onActivityResultFromH5 SUCCESS", true);
                try {
                    addAccountAttr(stringExtra, intent, i, "1");
                    return;
                } catch (JSONException unused) {
                    nox.a(TAG, "onActivityResultFromH5: JsonException", true);
                    this.mPresenter.onSignInFailed(i2);
                    return;
                }
            }
            nox.b(TAG, "handleH5LoginResult: jsonSignInResult is null", true);
            this.mPresenter.onSignInFailed(i2);
            return;
        }
        nox.a(TAG, "data is null.", true);
        this.mPresenter.onSignInFailed(i2);
    }

    protected int saveDataByApkOrH5(int i, String str) {
        nox.b(TAG, "saveDataByApkOrH5 start.", true);
        try {
            this.signInResult = new AccountPickerResult().fromJson(str);
            a.a().a(this.signInResult.getAuthAccountPicker(), this.mPresenter.getSignInRequest().getAccountPickerParams());
            i = this.signInResult.getStatus().getStatusCode();
        } catch (JSONException unused) {
            this.signInResult = null;
            nox.a(TAG, "saveDataByApkOrH5: JsonException", true);
        }
        this.mPresenter.report(i);
        return i;
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.mPresenter.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        nox.b(TAG, "onDestroy", true);
    }

    @Override // com.huawei.hms.support.picker.activity.AccountPickerSignInHubContract.View
    public void startSignInActivity(Intent intent, int i) {
        nox.b(TAG, "startSignInActivity:requestCode = " + i, true);
        if (intent == null) {
            nox.a(TAG, "startSignInActivity:intent is null.", true);
            this.mPresenter.onSignInFailed(17);
            return;
        }
        try {
            startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e) {
            this.signInNotFoundActivity = true;
            nox.a(TAG, "Launch sign in Intent failed. hms is probably being updated：" + e.getClass().getSimpleName(), true);
            this.mPresenter.onSignInFailed(17);
        }
    }

    private void addAccountAttr(String str, Intent intent, int i, String str2) throws JSONException {
        nox.b(TAG, "addAccountAttr start.", true);
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(CommonPickerConstant.RequestParams.KEY_SIGN_IN_HUAWEI_ID);
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.put("accountAttr", str2);
            nox.b(TAG, "addAccountAttr: accountPickerJson = " + jSONObjectOptJSONObject.toString(), false);
            String strOptString = jSONObjectOptJSONObject.optString("serverAuthCode");
            nox.b(TAG, "addAccountAttr: jsonObject = " + jSONObject.toString(), false);
            boolean zIsNeedRequestToken = this.mPresenter.isNeedRequestToken(str2);
            if (!TextUtils.isEmpty(strOptString) && zIsNeedRequestToken) {
                this.mPresenter.doTokenRequest(strOptString);
            }
            if (zIsNeedRequestToken) {
                return;
            }
        }
        intent.putExtra("HUAWEIID_SIGNIN_RESULT", jSONObject.toString());
        setResult(i, intent);
        finish();
    }

    private void dealApkSignInResult(String str, Intent intent, int i, int i2) {
        nox.b(TAG, "dealApkSignInResult", true);
        int iSaveDataByApkOrH5 = saveDataByApkOrH5(i, str);
        nox.b(TAG, "statusCode is " + iSaveDataByApkOrH5, true);
        if (iSaveDataByApkOrH5 != 0) {
            if (20051 == iSaveDataByApkOrH5) {
                nox.b(TAG, "logIn By H5", true);
                this.mPresenter.startWebViewActivity();
                return;
            } else {
                nox.b(TAG, "logIn By APK failed", true);
                this.mPresenter.onSignInFailed(iSaveDataByApkOrH5);
                return;
            }
        }
        if (this.signInResult.getAuthAccountPicker() != null) {
            nox.b(TAG, "onActivityResultFromApk SUCCESS", true);
            try {
                addAccountAttr(str, intent, i2, getAccountAttr(str));
            } catch (JSONException unused) {
                nox.a(TAG, "onActivityResultFromApk: JsonException", true);
                this.mPresenter.onSignInFailed(i);
            }
        }
    }

    private String getAccountAttr(String str) {
        nox.b(TAG, "getAccountAttr start.", true);
        try {
            if (!AccountPickerUtil.isPcSimulator(str)) {
                return "0";
            }
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(CommonPickerConstant.RequestParams.KEY_SIGN_IN_HUAWEI_ID);
            if (jSONObjectOptJSONObject != null) {
                return jSONObjectOptJSONObject.optString("accountAttr", "-1");
            }
        } catch (Exception e) {
            nox.a(TAG, "getAccountAttr: Exception = " + e.getClass().getSimpleName(), true);
        }
        return "-1";
    }

    @Override // com.huawei.hms.support.picker.activity.AccountPickerSignInHubContract.View
    public void exit(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    private void setStatusBar() {
        if (!nos.f() || npi.c(this)) {
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(9216);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
