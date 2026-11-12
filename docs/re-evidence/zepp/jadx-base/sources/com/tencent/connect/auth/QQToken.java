package com.tencent.connect.auth;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.d;
import com.tencent.open.utils.e;
import com.tencent.open.utils.k;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class QQToken {
    public static final int AUTH_QQ = 2;
    public static final int AUTH_QZONE = 3;
    public static final int AUTH_WEB = 1;
    private static SharedPreferences f;
    private String a;
    private String b;
    private String c;
    private int d = 1;
    private long e = -1;

    public QQToken(String str) {
        this.a = str;
    }

    @TargetApi(11)
    private static synchronized SharedPreferences a() {
        if (f == null) {
            f = e.a().getSharedPreferences("token_info_file", 0);
        }
        return f;
    }

    public String getAccessToken() {
        return this.b;
    }

    public String getAppId() {
        return this.a;
    }

    public int getAuthSource() {
        return this.d;
    }

    public long getExpireTimeInSecond() {
        return this.e;
    }

    public String getOpenId() {
        return this.c;
    }

    public String getOpenIdWithCache() {
        String openId = getOpenId();
        try {
            if (TextUtils.isEmpty(openId)) {
                JSONObject jSONObjectLoadSession = loadSession(this.a);
                if (jSONObjectLoadSession != null) {
                    openId = jSONObjectLoadSession.getString("openid");
                    if (!TextUtils.isEmpty(openId)) {
                        setOpenId(openId);
                    }
                }
                SLog.i("QQToken", "getOpenId from Session openId = " + openId + " appId = " + this.a);
            } else {
                SLog.i("QQToken", "getOpenId from field openId = " + openId + " appId = " + this.a);
            }
        } catch (Exception e) {
            SLog.i("QQToken", "getLocalOpenIdByAppId " + e.toString());
        }
        return openId;
    }

    public boolean isSessionValid() {
        return this.b != null && System.currentTimeMillis() < this.e;
    }

    public JSONObject loadSession(String str) {
        try {
            return a(str);
        } catch (Exception e) {
            SLog.i("QQToken", "login loadSession" + e.toString());
            return null;
        }
    }

    public void removeSession(String str) {
        String strEncodeToString = Base64.encodeToString(k.i(str), 2);
        a().edit().remove(strEncodeToString + "_spkey").commit();
        a().edit().remove(strEncodeToString).commit();
        SLog.i("QQToken", "removeSession sucess");
    }

    public void saveSession(JSONObject jSONObject) {
        try {
            a(this.a, jSONObject);
        } catch (Exception e) {
            SLog.i("QQToken", "login saveSession" + e.toString());
        }
    }

    public void setAccessToken(String str, String str2) throws NumberFormatException {
        this.b = str;
        this.e = 0L;
        if (str2 != null) {
            this.e = System.currentTimeMillis() + (Long.parseLong(str2) * 1000);
        }
    }

    public void setAppId(String str) {
        this.a = str;
    }

    public void setAuthSource(int i) {
        this.d = i;
    }

    public void setOpenId(String str) {
        this.c = str;
    }

    private static synchronized JSONObject a(String str) {
        String strC;
        if (e.a() == null) {
            SLog.i("QQToken", "loadJsonPreference context null");
            return null;
        }
        if (str == null) {
            SLog.i("QQToken", "loadJsonPreference prefKey is null");
            return null;
        }
        String strEncodeToString = Base64.encodeToString(k.i(str), 2);
        String str2 = strEncodeToString + "_spkey";
        String string = a().getString(str2, null);
        if (string == null) {
            String string2 = a().getString(strEncodeToString, null);
            if (string2 == null) {
                SLog.i("QQToken", "loadJsonPreference encoded value null");
                return null;
            }
            strC = d.a(string2, "asdfghjk");
            if (!TextUtils.isEmpty(strC)) {
                String strB = d.b(strC, "4026aec5f46360286842041e8cd49856");
                if (str2.length() > 6 && strB != null) {
                    a().edit().putString(str2, strB).commit();
                    a().edit().remove(strEncodeToString).commit();
                    SLog.i("QQToken", "loadJsonPreference convert old to new save sucess");
                }
            }
        } else {
            strC = d.c(string, "4026aec5f46360286842041e8cd49856");
        }
        try {
            JSONObject jSONObject = new JSONObject(strC);
            SLog.i("QQToken", "loadJsonPreference sucess");
            return jSONObject;
        } catch (Exception e) {
            SLog.i("QQToken", "loadJsonPreference decode " + e.toString());
            return null;
        }
    }

    private static synchronized void a(String str, JSONObject jSONObject) {
        if (e.a() == null) {
            SLog.i("QQToken", "saveJsonPreference context null");
            return;
        }
        if (str != null && jSONObject != null) {
            try {
                String string = jSONObject.getString("expires_in");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(Constants.PARAM_EXPIRES_TIME, System.currentTimeMillis() + (Long.parseLong(string) * 1000));
                    String str2 = Base64.encodeToString(k.i(str), 2) + "_spkey";
                    String strB = d.b(jSONObject.toString(), "4026aec5f46360286842041e8cd49856");
                    if (str2.length() > 6 && strB != null) {
                        a().edit().putString(str2, strB).commit();
                        SLog.i("QQToken", "saveJsonPreference sucess");
                        return;
                    }
                    SLog.i("QQToken", "saveJsonPreference keyEncode or josnEncode null");
                    return;
                }
                SLog.i("QQToken", "expires is null");
                return;
            } catch (Exception e) {
                SLog.e("QQToken", "saveJsonPreference exception:" + e.toString());
                return;
            }
        }
        SLog.i("QQToken", "saveJsonPreference prefKey or jsonObject null");
    }
}
