package com.huawei.featureuserprofile.util;

import android.content.Context;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.braintreepayments.api.PayPalRequest;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes23.dex */
public abstract class EventBus {
    private static final String TAG = "EventBus";
    private Context mContext = null;
    private boolean mIsAllowArea = false;
    private boolean mIsLoginAcount = false;
    private boolean mIsLoginStorage = false;
    private boolean mIsLogoutAcount = false;
    private boolean mIsLogoutStorage = false;
    private boolean mIsRecognizedForbiddenArea = false;
    private boolean mIsLogined = false;

    protected abstract void onDuplicateLoginIfAllow();

    protected abstract void onLoginIfAllow();

    protected abstract void onLogoutIfAllow();

    protected abstract void onRecognizeNotAllow();

    public void init(Context context) {
        this.mContext = context;
    }

    public void loadSceneIfExist() {
        String strE = SharedPreferenceManager.e(this.mContext, Integer.toString(PrebakedEffectId.RT_FLY), "user_profile_scene");
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        strE.hashCode();
        if (strE.equals("1")) {
            LogUtil.a(TAG, "loadScenceIfExist:AllowLogin_Logined");
            setAllowArea();
            loginInner();
        } else if (strE.equals("2")) {
            LogUtil.a(TAG, "loadScenceIfExist:NAllowLogin");
            setNotAllowArea();
        } else {
            LogUtil.a(TAG, "loadScenceIfExist:UNSETED");
        }
    }

    public void setAllowArea() {
        LogUtil.a(TAG, "setAllowArea");
        this.mIsAllowArea = true;
    }

    public void setNotAllowArea() {
        if (this.mIsRecognizedForbiddenArea) {
            LogUtil.a(TAG, "already onRecognizeNAllow");
            return;
        }
        LogUtil.a(TAG, "setNAllowArea");
        this.mIsAllowArea = false;
        SharedPreferenceManager.e(this.mContext, Integer.toString(PrebakedEffectId.RT_FLY), "user_profile_scene", "2", null);
        onRecognizeNotAllow();
        this.mIsRecognizedForbiddenArea = true;
    }

    public void loginAccount() {
        if (!this.mIsAllowArea) {
            LogUtil.j(TAG, "loginAccount not allowArea, don't login");
            return;
        }
        LogUtil.a(TAG, "loginAccount already");
        this.mIsLoginAcount = true;
        checkLogin();
    }

    public void loginStorage() {
        if (!this.mIsAllowArea) {
            LogUtil.j(TAG, "not allowArea,dont login");
            return;
        }
        LogUtil.a(TAG, "already loginStorage");
        this.mIsLoginStorage = true;
        checkLogin();
    }

    private void checkLogin() {
        if (!this.mIsLoginStorage || !this.mIsLoginAcount || this.mIsLogined) {
            LogUtil.j(TAG, "isLoginConsistency is false,return: ", Boolean.valueOf(this.mIsLogined));
        } else {
            loginInner();
        }
    }

    private void loginInner() {
        if (this.mIsLogined) {
            onDuplicateLoginIfAllow();
            LogUtil.a(TAG, "already logined");
        } else {
            LogUtil.a(TAG, PayPalRequest.LANDING_PAGE_TYPE_LOGIN);
            onLoginIfAllow();
            SharedPreferenceManager.e(this.mContext, Integer.toString(PrebakedEffectId.RT_FLY), "user_profile_scene", "1", null);
            this.mIsLogined = true;
        }
    }

    public void logoutAcount() {
        if (!this.mIsAllowArea) {
            LogUtil.j(TAG, "not allowArea,dont logout");
            return;
        }
        LogUtil.a(TAG, "logoutAcount");
        this.mIsLogoutAcount = true;
        checkLogout();
    }

    public void logoutStorage() {
        if (!this.mIsAllowArea) {
            LogUtil.j(TAG, "not allowArea,dont logout");
            return;
        }
        LogUtil.a(TAG, "logoutStorage");
        this.mIsLogoutStorage = true;
        checkLogout();
    }

    private void checkLogout() {
        if (!this.mIsLogoutStorage || !this.mIsLogoutAcount) {
            LogUtil.j(TAG, "isLoginConsistency is false,return");
        } else {
            logoutInner();
        }
    }

    private void logoutInner() {
        onLogoutIfAllow();
        SharedPreferenceManager.e(this.mContext, Integer.toString(PrebakedEffectId.RT_FLY), "user_profile_scene", "0", null);
        this.mIsLogined = false;
    }
}
