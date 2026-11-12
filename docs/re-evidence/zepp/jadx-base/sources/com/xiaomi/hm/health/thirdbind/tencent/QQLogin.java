package com.xiaomi.hm.health.thirdbind.tencent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huami.account.HMLoginManager;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.tencent.connect.UserInfo;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class QQLogin {
    public static final String DEFAULT_APP_ID = "1105651418";
    public static final String KEY_RESULT = "ret";
    private static final String j = "QQ.Login";
    private static final String k = "all";
    private static final String l = "openid";
    private static final String m = "access_token";
    private static final String n = "expires_in";
    private static final String o = "oauth_consumer_key";
    private static final String p = "UserInfo";
    private static final String q = "nickname";
    private static final String r = "figureurl_qq_2";
    private static QQLogin s;
    private static Tencent t;
    private IUiListener a;
    private IUiListener b;
    private QQUserInfo c;
    private Context d;
    private SharedPreferences e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;

    public static class QQUserInfo {
        private String a;
        private String b;

        public void a(String avatarUrl) {
            this.b = avatarUrl;
        }

        public String getNickName() {
            return this.a;
        }

        public void setNickName(String nickName) {
            this.a = nickName;
        }
    }

    public class a implements IUiListener {
        public a() {
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            QQLogin.this.i();
            if (QQLogin.this.a != null) {
                QQLogin.this.a.onCancel();
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object response) {
            QQLogin.this.j(response);
            if (QQLogin.this.a != null) {
                QQLogin.this.a.onComplete(response);
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError e) {
            QQLogin.this.k(e);
            if (QQLogin.this.a != null) {
                QQLogin.this.a.onError(e);
            }
        }
    }

    public class b implements IUiListener {
        public b() {
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            HMLog.d(QQLogin.j, "Request UserInfo Cancel!", new Object[0]);
            if (QQLogin.this.b != null) {
                QQLogin.this.b.onCancel();
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object response) {
            HMLog.d(QQLogin.j, "Request UserInfo Complete : " + response, new Object[0]);
            QQLogin.this.l(response);
            if (QQLogin.this.b != null) {
                QQLogin.this.b.onComplete(response);
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError e) {
            HMLog.d(QQLogin.j, "Request UserInfo Error : " + e, new Object[0]);
            if (e != null) {
                Analytics.event(QQLogin.this.d, StatEvent.EVENT_QQ_REQUEST_USER_INFO_ERROR, e.toString());
            } else {
                Analytics.event(QQLogin.this.d, StatEvent.EVENT_QQ_REQUEST_USER_INFO_ERROR);
            }
            if (QQLogin.this.b != null) {
                QQLogin.this.b.onError(e);
            }
        }
    }

    private QQLogin(Context context) {
        this.d = context;
        this.e = context.getSharedPreferences(j, 0);
        try {
            t = Tencent.createInstance("1105651418", context);
        } catch (Exception e) {
            HMLog.i(j, "" + e.toString(), new Object[0]);
        }
    }

    public static String fetchMiID() {
        String thirdId = HMLoginManager.getThirdId();
        return TextUtils.isEmpty(thirdId) ? "" : thirdId;
    }

    public static QQLogin getInstance(Context context) {
        if (s == null) {
            h(context);
        }
        return s;
    }

    private static void h(Context context) {
        if (s == null) {
            s = new QQLogin(context);
        }
        try {
            if (t == null) {
                t = Tencent.createInstance("1105651418", context);
            }
        } catch (Exception e) {
            HMLog.i(j, "" + e.toString(), new Object[0]);
        }
        if (TextUtils.isEmpty(s.f)) {
            s.f = fetchMiID();
            s.restoreOAuthInfo();
            s.restoreQQUserInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        HMLog.d(j, "Login Cancel!", new Object[0]);
        Analytics.event(this.d, StatEvent.EVENT_QQ_LOGIN_CANCEL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Object response) {
        HMLog.d(j, "Login Complete : " + response, new Object[0]);
        try {
            JSONObject jSONObject = (JSONObject) response;
            if (jSONObject.optInt(KEY_RESULT, -1) == 0) {
                Analytics.event(this.d, StatEvent.EVENT_QQ_LOGIN_SUCCESS);
                String string = jSONObject.getString("openid");
                String string2 = jSONObject.getString("access_token");
                String string3 = jSONObject.getString("expires_in");
                t.setOpenId(string);
                t.setAccessToken(string2, string3);
            } else {
                Analytics.event(this.d, StatEvent.EVENT_QQ_LOGIN_FAIL, response.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            Analytics.exception(this.d, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(UiError e) {
        HMLog.d(j, "Login Error : " + e, new Object[0]);
        if (e == null) {
            Analytics.event(this.d, StatEvent.EVENT_QQ_LOGIN_ERROR);
            return;
        }
        Analytics.event(this.d, StatEvent.EVENT_QQ_LOGIN_ERROR, "Code:" + e.errorCode + "Msg:" + e.errorMessage + ",Detail:" + e.errorDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(Object response) {
        try {
            JSONObject jSONObject = (JSONObject) response;
            if (jSONObject.optInt(KEY_RESULT, -1) == 0) {
                HMLog.d(j, "Request User Info Success!", new Object[0]);
                QQUserInfo qQUserInfo = new QQUserInfo();
                this.c = qQUserInfo;
                qQUserInfo.setNickName(jSONObject.optString("nickname"));
                this.c.a(jSONObject.optString(r));
                saveQQUserInfo(this.c);
                Analytics.event(this.d, StatEvent.EVENT_QQ_REQUEST_USER_INFO_SUCCESS);
            } else {
                Analytics.event(this.d, StatEvent.EVENT_QQ_REQUEST_USER_INFO_FAIL, response.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            Analytics.exception(this.d, e);
        }
    }

    public void clean(boolean cleanData) {
        if (!cleanData) {
            this.b = null;
            this.a = null;
            return;
        }
        this.c = null;
        SharedPreferences.Editor editorEdit = this.e.edit();
        editorEdit.remove("UserInfo");
        editorEdit.remove("openid");
        editorEdit.remove("access_token");
        editorEdit.remove("expires_in");
        editorEdit.remove("UserInfo" + this.f);
        editorEdit.remove("openid" + this.f);
        editorEdit.remove("access_token" + this.f);
        editorEdit.remove("expires_in" + this.f);
        editorEdit.apply();
    }

    public Map<String, Object> getOAuthInfo() {
        HashMap map = new HashMap();
        if (isLoginValid()) {
            map.put("access_token", t.getAccessToken());
            map.put("oauth_consumer_key", t.getAppId());
            map.put("openid", t.getOpenId());
            map.put(Constants.PARAM_PLATFORM_ID, "qzone");
        }
        return map;
    }

    public QQUserInfo getQQUserInfo() {
        return this.c;
    }

    public Tencent getTencent() {
        return t;
    }

    public boolean isLoginCanceled() {
        return this.i;
    }

    public boolean isLoginValid() {
        return t.isSessionValid() && t.getOpenId() != null;
    }

    public boolean isNeedLogin() {
        return this.g;
    }

    public boolean isNeedSwitchLogin() {
        return this.h;
    }

    public void login(Activity activity) {
        StringBuilder sb = new StringBuilder();
        sb.append("Login : ");
        sb.append(!isLoginValid());
        HMLog.d(j, sb.toString(), new Object[0]);
        if (isLoginValid()) {
            return;
        }
        t.login(activity, "all", new a());
    }

    public void logout() {
        HMLog.d(j, "Logout", new Object[0]);
        t.logout(this.d);
    }

    public void onResult(int requestCode, int resultCode, Intent data, IUiListener listener) {
        Tencent.onActivityResultData(requestCode, resultCode, data, listener);
    }

    public void requestUserInfo() {
        HMLog.d(j, "Request User Info : " + isLoginValid(), new Object[0]);
        if (isLoginValid()) {
            new UserInfo(this.d, t.getQQToken()).getUserInfo(new b());
            Analytics.event(this.d, StatEvent.EVENT_QQ_REQUEST_USER_INFO);
        }
    }

    public void restoreOAuthInfo() {
        String string = this.e.getString("openid" + this.f, null);
        if (string == null) {
            string = this.e.getString("openid", null);
        }
        if (string != null) {
            t.setOpenId(string);
            String string2 = this.e.getString("access_token" + this.f, null);
            if (string2 == null) {
                string2 = this.e.getString("access_token", null);
            }
            String string3 = this.e.getString("expires_in" + this.f, null);
            if (string3 == null) {
                string3 = this.e.getString("expires_in", null);
            }
            if (string2 != null && string3 != null) {
                string3 = String.valueOf((Long.valueOf(string3).longValue() - System.currentTimeMillis()) / 1000);
                t.setAccessToken(string2, string3);
            }
            HMLog.d(j, "Read : OpenId = " + string + " , AccessToken = " + string2 + " , ExpiresIn = " + string3, new Object[0]);
        }
    }

    public void restoreQQUserInfo() {
        if (isLoginValid()) {
            String string = this.e.getString("UserInfo" + this.f, null);
            if (string == null) {
                string = this.e.getString("UserInfo", null);
            }
            HMLog.d(j, "Read User Info : " + string, new Object[0]);
            if (string != null) {
                this.c = (QQUserInfo) new Gson().fromJson(string, QQUserInfo.class);
            }
        }
    }

    public void saveExpiresIn(String ex) {
        SharedPreferences.Editor editorEdit = this.e.edit();
        editorEdit.putString("expires_in" + this.f, ex);
        editorEdit.apply();
    }

    public void saveOAuthInfo() {
        String openId = t.getOpenId();
        String accessToken = t.getAccessToken();
        long expiresIn = t.getExpiresIn();
        HMLog.d(j, "Save : OpenId = " + openId + " , AccessToken = " + accessToken + " , ExpiresIn = " + expiresIn, new Object[0]);
        SharedPreferences.Editor editorEdit = this.e.edit();
        StringBuilder sb = new StringBuilder();
        sb.append("openid");
        sb.append(this.f);
        editorEdit.putString(sb.toString(), openId);
        editorEdit.putString("access_token" + this.f, accessToken);
        editorEdit.putString("expires_in" + this.f, String.valueOf(expiresIn));
        editorEdit.apply();
    }

    public void saveOpenId(String id) {
        SharedPreferences.Editor editorEdit = this.e.edit();
        editorEdit.putString("openid" + this.f, id);
        editorEdit.apply();
    }

    public void saveQQUserInfo(QQUserInfo userInfo) {
        String json = new Gson().toJson(userInfo);
        HMLog.d(j, "Save User Info : " + json, new Object[0]);
        SharedPreferences.Editor editorEdit = this.e.edit();
        editorEdit.putString("UserInfo" + this.f, json);
        editorEdit.apply();
    }

    public void saveToken(String token) {
        SharedPreferences.Editor editorEdit = this.e.edit();
        editorEdit.putString("access_token" + this.f, token);
        editorEdit.apply();
    }

    public void setLoginCanceled(boolean canceled) {
        this.i = canceled;
    }

    public void setLoginListener(IUiListener listener) {
        this.a = listener;
    }

    public void setNeedLogin(boolean need) {
        this.g = need;
    }

    public void setNeedSwitchLogin(boolean need) {
        this.h = need;
    }

    public void setUserInfoListener(IUiListener listener) {
        this.b = listener;
    }

    public static QQLogin getInstance() {
        return s;
    }
}
