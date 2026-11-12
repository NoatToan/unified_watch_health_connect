package defpackage;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class oby {
    private static final String d = "ResponseAuthFirstInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44085a;
    private int g;
    private int h;
    private int i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44087c = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44086b = null;
    private String f = null;
    private String e = null;
    private String j = null;

    public int b() {
        return this.g;
    }

    public int d() {
        return this.i;
    }

    public void e(int i) {
        this.i = i;
    }

    public String e() {
        return this.f44087c;
    }

    public String c() {
        return this.f44086b;
    }

    public String a() {
        return this.f44085a;
    }

    public void e(String str) {
        JSONArray jSONArray;
        if (oco.c(str)) {
            try {
                int iIntValue = Integer.valueOf(str).intValue();
                this.i = iIntValue;
                if (408 == iIntValue || 99 == iIntValue || 98 == iIntValue) {
                    this.i = 1008;
                    return;
                }
                return;
            } catch (NumberFormatException unused) {
                ocq.e(d, "parseResponseAuthInfoArray NumberFormatException");
            }
        }
        try {
            if (TextUtils.isEmpty(str)) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray(str);
            }
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            if (jSONObject != null) {
                a(jSONObject.toString());
            }
            if (ocq.f44154c.booleanValue()) {
                ocq.e(d, "Parse response authinfo Array json string = " + jSONArray.toString());
            }
        } catch (JSONException unused2) {
            ocq.e(d, "ResponseAuthFirstInfo-parseResponseAuthInfoArray  JSONException");
        }
    }

    public void a(String str) {
        JSONObject jSONObject;
        if (oco.c(str)) {
            try {
                int iIntValue = Integer.valueOf(str).intValue();
                this.i = iIntValue;
                if (408 == iIntValue) {
                    this.i = 1008;
                    return;
                }
                return;
            } catch (NumberFormatException unused) {
                ocq.e(d, "parseResponseAuthFirstInfo NumberFormatException");
            }
        }
        try {
            if (str == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            this.g = jSONObject.optInt("RespSN");
            this.f44085a = jSONObject.optString("ReqName");
            this.i = jSONObject.optInt("ResultCode");
            this.f44087c = jSONObject.optString("Payload");
            this.f44086b = jSONObject.optString("AuthToken");
            this.f = jSONObject.optString("RSPServerAddress");
            this.e = jSONObject.optString("MSISDN");
            this.j = jSONObject.optString("Sessionid");
            this.h = jSONObject.optInt("SMSAuthExpireTime");
            if (ocq.f44154c.booleanValue()) {
                ocq.e(d, "Parse ResponseAuthFirstInfo result:" + jSONObject.toString());
            }
        } catch (JSONException unused2) {
            ocq.e(d, "ResponseAuthFirstInfo-parseResponseAuthFirstInfo JSONException");
        }
    }
}
