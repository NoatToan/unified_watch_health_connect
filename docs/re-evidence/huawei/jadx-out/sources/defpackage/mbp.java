package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mbp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41344a;
    private String e;
    private String d = "";
    private String i = "";
    private int f = 0;
    private int j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41346c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41345b = 0;

    public void b(String str) {
        this.d = str;
    }

    public void a(String str) {
        this.i = c(str);
    }

    private String c(String str) {
        return (str == null || !str.contains("t_vfc_xian")) ? str : str.concat("|t_vfc_changan");
    }

    public void a(int i) {
        this.f = i;
    }

    public void e(int i) {
        this.j = i;
    }

    public void c(int i) {
        this.f41345b = i;
    }

    public void d(int i) {
        this.f41346c = i;
    }

    public void e(String str) {
        this.e = str;
    }

    public void d(String str) {
        this.f41344a = str;
    }

    public String c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("supportBusiness", this.d);
            jSONObject.put("supportIssuers", this.i);
            jSONObject.put("supportDefautcard", this.f);
            jSONObject.put("supportDecouple", this.j);
            jSONObject.put("pictureWidth", this.f41346c);
            jSONObject.put("pictureHeight", this.f41345b);
            String str = this.e;
            if (str != null) {
                jSONObject.put("supportBlankCardSak", str);
            }
            String str2 = this.f41344a;
            if (str2 != null) {
                jSONObject.put("payVersion", str2);
            }
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }
}
