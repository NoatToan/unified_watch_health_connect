package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwlogsmodel.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mbm implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("background_file_time")
    private long f41341c;

    @SerializedName("background_file_name")
    private String d;
    private int e;
    private String f;
    private String g;
    private int h;
    private String i;
    private String j;
    private String k;

    @SerializedName("Rf_file_name")
    private String l;
    private String m;
    private boolean n;
    private String o;
    private String r;

    @SerializedName("Rf_File_time")
    private long s;
    private long t;

    public mbm() {
    }

    public mbm(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            b(jSONObject);
            c(jSONObject);
        } catch (JSONException e) {
            LogUtil.e("TACardInfo", "TACardInfo error : ", e.getMessage());
        }
    }

    public String d() {
        return this.f41339a;
    }

    public void d(String str) {
        this.f41339a = str;
    }

    public String o() {
        return this.k;
    }

    public void f(String str) {
        this.k = str;
    }

    public String k() {
        return this.m;
    }

    public void j(String str) {
        this.m = str;
    }

    public int c() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public boolean t() {
        return this.n;
    }

    public void c(boolean z) {
        this.n = z;
    }

    public String g() {
        return this.i;
    }

    public void e(String str) {
        this.i = str;
    }

    public String j() {
        return this.g;
    }

    public void h(String str) {
        this.g = str;
    }

    public String h() {
        return this.f;
    }

    public void c(String str) {
        this.f = str;
    }

    public String f() {
        return this.j;
    }

    public void b(String str) {
        this.j = str;
    }

    public int b() {
        return this.f41340b;
    }

    public void d(int i) {
        this.f41340b = i;
    }

    public long p() {
        return this.t;
    }

    public void c(long j) {
        this.t = j;
    }

    public int i() {
        return this.h;
    }

    public void c(int i) {
        this.h = i;
    }

    public String l() {
        return this.o;
    }

    public void g(String str) {
        this.o = str;
    }

    public String n() {
        return this.l;
    }

    public void i(String str) {
        this.l = str;
    }

    public long m() {
        return this.s;
    }

    public void e(long j) {
        this.s = j;
    }

    public String e() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public long a() {
        return this.f41341c;
    }

    public void a(long j) {
        this.f41341c = j;
    }

    public String q() {
        return this.r;
    }

    public void k(String str) {
        this.r = str;
    }

    private void c(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("card_type")) {
            this.h = jSONObject.getInt("card_type");
        }
        if (jSONObject.has("status_update_time")) {
            this.t = jSONObject.getLong("status_update_time");
        }
        if (jSONObject.has("name")) {
            this.o = jSONObject.getString("name");
        }
        if (jSONObject.has("Rf_File_time")) {
            this.s = jSONObject.getLong("Rf_File_time");
        }
        if (jSONObject.has("Rf_file_name")) {
            this.l = jSONObject.getString("Rf_file_name");
        }
        if (jSONObject.has("background_file_time")) {
            this.f41341c = jSONObject.getLong("background_file_time");
        }
        if (jSONObject.has("background_file_name")) {
            this.d = jSONObject.getString("background_file_name");
        }
        if (jSONObject.has("userid")) {
            this.r = jSONObject.getString("userid");
        }
    }

    private void b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("aid")) {
            this.f41339a = jSONObject.getString("aid");
        }
        if (jSONObject.has("issuerId")) {
            this.m = jSONObject.getString("issuerId");
        }
        if (jSONObject.has("productId")) {
            this.k = jSONObject.getString("productId");
        }
        if (jSONObject.has("card_group_type")) {
            this.e = jSONObject.getInt("card_group_type");
        }
        if (jSONObject.has("fpan_digest")) {
            this.i = jSONObject.getString("fpan_digest");
        }
        if (jSONObject.has("is_default_card")) {
            this.n = jSONObject.getBoolean("is_default_card");
        }
        if (jSONObject.has("fpan_four")) {
            this.g = jSONObject.getString("fpan_four");
        }
        if (jSONObject.has("dpan_four")) {
            this.j = jSONObject.getString("dpan_four");
        }
        if (jSONObject.has("dpan_digest")) {
            this.f = jSONObject.getString("dpan_digest");
        }
        if (jSONObject.has("card_status")) {
            this.f41340b = jSONObject.getInt("card_status");
        }
    }

    public String s() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aid", this.f41339a);
            jSONObject.put("productId", this.k);
            jSONObject.put("issuerId", this.m);
            jSONObject.put("card_group_type", this.e);
            jSONObject.put("is_default_card", this.n);
            jSONObject.put("fpan_digest", this.i);
            jSONObject.put("fpan_four", this.g);
            jSONObject.put("dpan_digest", this.f);
            jSONObject.put("dpan_four", this.j);
            jSONObject.put("card_status", this.f41340b);
            jSONObject.put("status_update_time", this.t);
            jSONObject.put("card_type", this.h);
            jSONObject.put("name", this.o);
            jSONObject.put("Rf_file_name", this.l);
            jSONObject.put("Rf_File_time", this.s);
            jSONObject.put("background_file_name", this.d);
            jSONObject.put("background_file_time", this.f41341c);
            jSONObject.put("userid", this.r);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(0);
        stringBuffer.append(this.e).append(System.lineSeparator());
        stringBuffer.append(this.n).append(System.lineSeparator());
        stringBuffer.append(this.i).append(System.lineSeparator());
        stringBuffer.append(this.g).append(System.lineSeparator());
        stringBuffer.append(this.f).append(System.lineSeparator());
        stringBuffer.append(this.j).append(System.lineSeparator());
        stringBuffer.append(this.f41339a).append(System.lineSeparator());
        stringBuffer.append(this.k).append(System.lineSeparator());
        stringBuffer.append(this.m).append(System.lineSeparator());
        stringBuffer.append(this.f41340b).append(System.lineSeparator());
        stringBuffer.append(this.t).append(System.lineSeparator());
        stringBuffer.append(this.h).append(System.lineSeparator());
        stringBuffer.append(this.o).append(System.lineSeparator());
        stringBuffer.append(this.l).append(System.lineSeparator());
        stringBuffer.append(this.s).append(System.lineSeparator());
        stringBuffer.append(this.d).append(System.lineSeparator());
        stringBuffer.append(this.f41341c).append(System.lineSeparator());
        stringBuffer.append(this.r).append(System.lineSeparator());
        return stringBuffer.toString();
    }

    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            LogUtil.e("TaCardInfo", "clone CloneNotSupportedException");
            mbm mbmVar = new mbm();
            mbmVar.f41339a = this.f41339a;
            mbmVar.d = this.d;
            mbmVar.f41341c = this.f41341c;
            mbmVar.e = this.e;
            mbmVar.f41340b = this.f41340b;
            mbmVar.h = this.h;
            mbmVar.f = this.f;
            mbmVar.j = this.j;
            mbmVar.i = this.i;
            mbmVar.g = this.g;
            mbmVar.n = this.n;
            mbmVar.m = this.m;
            mbmVar.o = this.o;
            mbmVar.k = this.k;
            mbmVar.l = this.l;
            mbmVar.s = this.s;
            mbmVar.t = this.t;
            mbmVar.r = this.r;
            return mbmVar;
        }
    }
}
