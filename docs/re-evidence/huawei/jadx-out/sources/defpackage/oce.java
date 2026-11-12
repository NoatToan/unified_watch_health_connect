package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class oce {
    private static final String d = "ResponseServiceProvisionInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44105b;
    private int e;
    private String g = null;
    private String f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ocd f44106c = null;

    public int e() {
        return this.f44104a;
    }

    public String d() {
        return this.g;
    }

    public String a() {
        return this.f;
    }

    public ocd c() {
        return this.f44106c;
    }

    public void b(String str) {
        JSONObject jSONObject;
        try {
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            this.e = jSONObject.optInt("RespSN");
            this.f44105b = jSONObject.optString("ReqName");
            this.f44104a = jSONObject.optInt("ResultCode");
            this.g = jSONObject.optString("WSAddress");
            this.f = jSONObject.optString("WSUrlDataPart");
            ocd ocdVar = new ocd();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("MultiSIMServiceRequestResponse");
            if (jSONObjectOptJSONObject != null) {
                ocdVar.e(jSONObjectOptJSONObject.toString());
            }
            this.f44106c = ocdVar;
            if (ocq.f44154c.booleanValue()) {
                ocq.e(d, "Parse ResponseMultiSIMService to jsonObj result:" + jSONObject.toString());
            }
        } catch (JSONException unused) {
            ocq.e(d, "Parse ResponseMultiSIMService to jsonObj occured JSONException");
        }
    }
}
