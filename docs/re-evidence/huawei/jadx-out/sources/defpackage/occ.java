package defpackage;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class occ {
    private static final String e = "ResponseAuthSecondInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44100c;
    private String d;
    private int i;

    public int c() {
        return this.f44100c;
    }

    public int b() {
        return this.i;
    }

    public String a() {
        return this.d;
    }

    public String d() {
        return this.f44098a;
    }

    public String e() {
        return this.f44099b;
    }

    public void b(String str) {
        JSONArray jSONArray;
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
                ocq.e(e, "parseResponseAuthInfoArray NumberFormatException");
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
                e(jSONObject.toString());
            }
            if (ocq.f44154c.booleanValue()) {
                ocq.e(e, "Parse ResponseAuthInfoArray to jsonObj result:" + jSONArray.toString());
            }
        } catch (JSONException unused2) {
            ocq.e(e, "ResponseAuthSecondInfo-parseResponseAuthInfoArray JSONException");
        }
    }

    public void e(String str) {
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
                ocq.e(e, "parseResponseAuthInfo NumberFormatException");
            }
        }
        try {
            if (str == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            this.f44100c = jSONObject.optInt("RespSN");
            this.f44098a = jSONObject.optString("ReqName");
            this.d = jSONObject.optString("AuthToken");
            this.i = jSONObject.optInt("ResultCode");
            this.f44099b = jSONObject.optString("MSISDN");
            if (ocq.f44154c.booleanValue()) {
                ocq.e(e, "Parse ResponseAuthInfo to jsonObj result:" + jSONObject.toString());
            }
        } catch (JSONException unused2) {
            ocq.e(e, "ResponseAuthSecondInfo-parseResponseAuthInfo  JSONException");
        }
    }
}
