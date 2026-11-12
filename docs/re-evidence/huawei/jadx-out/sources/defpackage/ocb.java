package defpackage;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ocb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44096b = "ResponseInfo";
    oby e;
    obz d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    oce f44097c = null;

    public oby d() {
        return this.e;
    }

    public obz a() {
        return this.d;
    }

    public oce c() {
        return this.f44097c;
    }

    private void b(String str, String str2) {
        if ("DevAuth".equals(str)) {
            oby obyVar = new oby();
            this.e = obyVar;
            obyVar.a(str2);
            if (ocq.f44154c.booleanValue()) {
                ocq.e(f44096b, "Parse SingleInfo to jsonObj result:" + str2);
                return;
            }
            return;
        }
        if ("GetDevServInfo".equals(str)) {
            obz obzVar = new obz();
            this.d = obzVar;
            obzVar.c(str2);
            if (ocq.f44154c.booleanValue()) {
                ocq.e(f44096b, "Parse ResponseGetDevServInfo to jsonObj result:" + str2);
                return;
            }
            return;
        }
        if ("ServiceProvisionRequest".equals(str)) {
            oce oceVar = new oce();
            this.f44097c = oceVar;
            oceVar.b(str2);
            if (ocq.f44154c.booleanValue()) {
                ocq.e(f44096b, "Parse ResponseServiceProvisionInfo to jsonObj result:" + str2);
            }
        }
    }

    public void d(String str) {
        JSONArray jSONArray;
        if (oco.c(str)) {
            try {
                oby obyVar = new oby();
                this.e = obyVar;
                obyVar.e(Integer.valueOf(str).intValue());
                return;
            } catch (NumberFormatException unused) {
                ocq.e(f44096b, "parseResponseInfo NumberFormatException");
            }
        }
        try {
            if (TextUtils.isEmpty(str)) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray(str);
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    b(jSONObject.optString("ReqName"), jSONObject.toString());
                }
            }
            if (ocq.f44154c.booleanValue()) {
                ocq.e(f44096b, "Parse ResponseAuthFirstInfo to jsonObj result:" + jSONArray.toString());
            }
        } catch (JSONException unused2) {
            ocq.e(f44096b, "ResponseInfo-ResponseAuthFirstInfo  JSONException");
        }
    }
}
