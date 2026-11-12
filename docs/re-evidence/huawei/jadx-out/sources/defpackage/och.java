package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class och {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f44114c = "ResponseeSIMProfileInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44116b;
    private String d;
    private String e;

    public void c(String str) {
        JSONObject jSONObject;
        try {
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            this.f44115a = jSONObject.optString("AC_Format");
            this.e = jSONObject.optString("SM-DP+Address");
            this.f44116b = jSONObject.optString("AC_Token");
            this.d = jSONObject.optString("SM-DP+OID");
            if (ocq.f44154c.booleanValue()) {
                ocq.e(f44114c, "Parse ResponseInfo to jsonObj result:" + jSONObject.toString());
            }
        } catch (JSONException unused) {
            ocq.e(f44114c, "ResponseeSIMProfileInfo-parseResponseInfo JSONException");
        }
    }
}
