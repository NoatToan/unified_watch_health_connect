package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class obq {
    private static final String d = "PairedDeviceList";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44063c;
    private String f;
    private String g;
    private String h;
    private String i;
    private String l;
    private int n;
    private String o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private obn f44062b = null;
    private String j = null;
    private String e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44061a = null;

    public String c() {
        return this.h;
    }

    public String d() {
        return this.g;
    }

    public String e() {
        return this.o;
    }

    public String a() {
        return this.f44063c;
    }

    public void a(String str) {
        this.f44063c = str;
    }

    public void e(String str) {
        JSONObject jSONObject;
        try {
            if (str == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            this.f = jSONObject.optString("DevType");
            this.g = jSONObject.optString("ICCID");
            this.i = jSONObject.optString("IMSI");
            this.o = jSONObject.optString("MSISDN");
            this.h = jSONObject.optString("RSPServerAddress");
            this.l = jSONObject.optString("Status");
            this.f44063c = jSONObject.optString("DeviceName");
            this.e = jSONObject.optString("ActivationCode");
            this.f44061a = jSONObject.optString("ConfirmationCode");
            this.n = jSONObject.optInt("MAXReTryTimes");
            this.j = jSONObject.optString("EID");
            obn obnVar = new obn();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("DeviceID");
            if (jSONObjectOptJSONObject != null) {
                obnVar.c(jSONObjectOptJSONObject.toString());
            }
            this.f44062b = obnVar;
            if (ocq.f44154c.booleanValue()) {
                ocq.e(d, "PairedDeviceList to json string = " + jSONObject.toString());
            }
        } catch (JSONException unused) {
            ocq.e(d, "Parse response information occured JSONException");
        }
    }

    public String b() {
        return this.j;
    }
}
