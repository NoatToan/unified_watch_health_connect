package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mbk {
    private String d;
    private int i;
    private String f = "";
    private int g = 0;
    private int h = 0;
    private int j = 0;
    private String o = "";
    private String e = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41334a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41335b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41336c = "";

    public String d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("techlist", this.f);
            jSONObject.put("ntfType", this.g);
            jSONObject.put("supportMifareClassic", this.h);
            jSONObject.put("supprotIsodep", this.j);
            jSONObject.put("uid", this.o);
            jSONObject.put("atqa", this.e);
            jSONObject.put("sak", this.i);
            jSONObject.put("isodepHistoryBytes", this.f41334a);
            jSONObject.put("errCode", this.f41335b);
            jSONObject.put("ats", this.f41336c);
            String str = this.d;
            if (str != null) {
                jSONObject.put("newSak", str);
            }
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "NfcTagInfo{nfcType='" + this.g + "', supportMifareClassic=" + this.h + ", supprotIsodep=" + this.j + "', uid=" + c() + ", atqa=" + this.e + ", sak=" + this.i + ", isodepHistoryBytes=" + this.f41334a + ", errCode=" + this.f41335b + ", ats=" + this.f41336c + '}';
    }

    public void c(String str) {
        this.f = str;
    }

    public void a(int i) {
        this.g = i;
    }

    public void c(int i) {
        this.h = i;
    }

    public void e(int i) {
        this.j = i;
    }

    public void f(String str) {
        this.o = str;
    }

    public void b(String str) {
        this.e = str;
    }

    public void d(int i) {
        this.i = i;
    }

    public void d(String str) {
        this.d = str;
    }

    public void a(String str) {
        this.f41334a = str;
    }

    public void b(int i) {
        this.f41335b = i;
    }

    public void e(String str) {
        this.f41336c = str;
    }

    private String c() {
        String str = this.o;
        if (str == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(str.length());
        for (int i = 0; i < this.o.length(); i++) {
            stringBuffer.append("*");
        }
        return stringBuffer.toString();
    }
}
