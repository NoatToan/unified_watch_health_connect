package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class obz {
    private static final String e = "ResponseGetDevServInfo";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44090c;
    private String d;
    private String f;
    private int g;
    private int h;
    private int j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private obk f44088a = null;
    private och i = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44089b = null;

    public String d() {
        return this.f44090c;
    }

    public String b() {
        return this.d;
    }

    public int a() {
        return this.h;
    }

    public obk c() {
        return this.f44088a;
    }

    public String e() {
        return this.f44089b;
    }

    public void c(String str) {
        JSONObject jSONObject;
        try {
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            this.g = jSONObject.optInt("RespSN");
            this.f = jSONObject.optString("ReqName");
            this.h = jSONObject.optInt("ResultCode");
            this.f44090c = jSONObject.optString("ManageUrl");
            this.d = jSONObject.optString("PostData");
            obk obkVar = new obk();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("MultiSIMServiceInfo");
            if (jSONObjectOptJSONObject != null) {
                obkVar.a(jSONObjectOptJSONObject.toString());
            }
            this.f44088a = obkVar;
            och ochVar = new och();
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("eSIMInfo");
            if (jSONObjectOptJSONObject2 != null) {
                ochVar.c(jSONObjectOptJSONObject2.toString());
            }
            this.f44088a = obkVar;
            this.f44089b = jSONObject.optString("OldTimeStamp");
            this.j = jSONObject.optInt("Timer1");
            if (ocq.f44154c.booleanValue()) {
                ocq.e(e, "Parse ResponseInfo to jsonObj result:" + jSONObject.toString());
            }
        } catch (JSONException unused) {
            ocq.e(e, "ResponseGetDevServInfo-parseResponseInfo JSONException");
        }
    }
}
