package com.xiaomi.push;

import android.os.Bundle;
import android.text.TextUtils;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class ci extends cj {
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private boolean t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private boolean z;

    public ci() {
        this.n = null;
        this.o = null;
        this.t = false;
        this.v = "";
        this.w = "";
        this.x = "";
        this.y = "";
        this.z = false;
    }

    public ci(Bundle bundle) {
        super(bundle);
        this.n = null;
        this.o = null;
        this.t = false;
        this.v = "";
        this.w = "";
        this.x = "";
        this.y = "";
        this.z = false;
        this.n = bundle.getString("ext_msg_type");
        this.p = bundle.getString("ext_msg_lang");
        this.o = bundle.getString("ext_msg_thread");
        this.q = bundle.getString("ext_msg_sub");
        this.r = bundle.getString("ext_msg_body");
        this.s = bundle.getString("ext_body_encode");
        this.u = bundle.getString("ext_msg_appid");
        this.t = bundle.getBoolean("ext_msg_trans", false);
        this.z = bundle.getBoolean("ext_msg_encrypt", false);
        this.v = bundle.getString("ext_msg_seq");
        this.w = bundle.getString("ext_msg_mseq");
        this.x = bundle.getString("ext_msg_fseq");
        this.y = bundle.getString("ext_msg_status");
    }

    @Override // com.xiaomi.push.cj
    public Bundle a() {
        Bundle bundleA = super.a();
        if (!TextUtils.isEmpty(this.n)) {
            bundleA.putString("ext_msg_type", this.n);
        }
        String str = this.p;
        if (str != null) {
            bundleA.putString("ext_msg_lang", str);
        }
        String str2 = this.q;
        if (str2 != null) {
            bundleA.putString("ext_msg_sub", str2);
        }
        String str3 = this.r;
        if (str3 != null) {
            bundleA.putString("ext_msg_body", str3);
        }
        if (!TextUtils.isEmpty(this.s)) {
            bundleA.putString("ext_body_encode", this.s);
        }
        String str4 = this.o;
        if (str4 != null) {
            bundleA.putString("ext_msg_thread", str4);
        }
        String str5 = this.u;
        if (str5 != null) {
            bundleA.putString("ext_msg_appid", str5);
        }
        if (this.t) {
            bundleA.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.v)) {
            bundleA.putString("ext_msg_seq", this.v);
        }
        if (!TextUtils.isEmpty(this.w)) {
            bundleA.putString("ext_msg_mseq", this.w);
        }
        if (!TextUtils.isEmpty(this.x)) {
            bundleA.putString("ext_msg_fseq", this.x);
        }
        if (this.z) {
            bundleA.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.y)) {
            bundleA.putString("ext_msg_status", this.y);
        }
        return bundleA;
    }

    @Override // com.xiaomi.push.cj
    /* JADX INFO: renamed from: a */
    public String mo3639a() {
        cn cnVarM3640a;
        StringBuilder sb = new StringBuilder();
        sb.append("<message");
        if (p() != null) {
            sb.append(" xmlns=\"");
            sb.append(p());
            sb.append("\"");
        }
        if (this.p != null) {
            sb.append(" xml:lang=\"");
            sb.append(h());
            sb.append("\"");
        }
        if (j() != null) {
            sb.append(" id=\"");
            sb.append(j());
            sb.append("\"");
        }
        if (l() != null) {
            sb.append(" to=\"");
            sb.append(cu.a(l()));
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(d())) {
            sb.append(" seq=\"");
            sb.append(d());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(e())) {
            sb.append(" mseq=\"");
            sb.append(e());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(f())) {
            sb.append(" fseq=\"");
            sb.append(f());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(g())) {
            sb.append(" status=\"");
            sb.append(g());
            sb.append("\"");
        }
        if (m() != null) {
            sb.append(" from=\"");
            sb.append(cu.a(m()));
            sb.append("\"");
        }
        if (k() != null) {
            sb.append(" chid=\"");
            sb.append(cu.a(k()));
            sb.append("\"");
        }
        if (this.t) {
            sb.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.u)) {
            sb.append(" appid=\"");
            sb.append(c());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(this.n)) {
            sb.append(" type=\"");
            sb.append(this.n);
            sb.append("\"");
        }
        if (this.z) {
            sb.append(" s=\"1\"");
        }
        sb.append(SearchCriteria.GT);
        if (this.q != null) {
            sb.append("<subject>");
            sb.append(cu.a(this.q));
            sb.append("</subject>");
        }
        if (this.r != null) {
            sb.append("<body");
            if (!TextUtils.isEmpty(this.s)) {
                sb.append(" encode=\"");
                sb.append(this.s);
                sb.append("\"");
            }
            sb.append(SearchCriteria.GT);
            sb.append(cu.a(this.r));
            sb.append("</body>");
        }
        if (this.o != null) {
            sb.append("<thread>");
            sb.append(this.o);
            sb.append("</thread>");
        }
        if ("error".equalsIgnoreCase(this.n) && (cnVarM3640a = m3640a()) != null) {
            sb.append(cnVarM3640a.m3643a());
        }
        sb.append(o());
        sb.append("</message>");
        return sb.toString();
    }

    public void a(String str) {
        this.u = str;
    }

    public void a(String str, String str2) {
        this.r = str;
        this.s = str2;
    }

    public void a(boolean z) {
        this.t = z;
    }

    public String b() {
        return this.n;
    }

    public void b(String str) {
        this.v = str;
    }

    public void b(boolean z) {
        this.z = z;
    }

    public String c() {
        return this.u;
    }

    public void c(String str) {
        this.w = str;
    }

    public String d() {
        return this.v;
    }

    public void d(String str) {
        this.x = str;
    }

    public String e() {
        return this.w;
    }

    public void e(String str) {
        this.y = str;
    }

    @Override // com.xiaomi.push.cj
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ci ciVar = (ci) obj;
        if (!super.equals(ciVar)) {
            return false;
        }
        String str = this.r;
        if (str == null ? ciVar.r != null : !str.equals(ciVar.r)) {
            return false;
        }
        String str2 = this.p;
        if (str2 == null ? ciVar.p != null : !str2.equals(ciVar.p)) {
            return false;
        }
        String str3 = this.q;
        if (str3 == null ? ciVar.q != null : !str3.equals(ciVar.q)) {
            return false;
        }
        String str4 = this.o;
        if (str4 == null ? ciVar.o == null : str4.equals(ciVar.o)) {
            return this.n == ciVar.n;
        }
        return false;
    }

    public String f() {
        return this.x;
    }

    public void f(String str) {
        this.n = str;
    }

    public String g() {
        return this.y;
    }

    public void g(String str) {
        this.q = str;
    }

    public String h() {
        return this.p;
    }

    public void h(String str) {
        this.r = str;
    }

    @Override // com.xiaomi.push.cj
    public int hashCode() {
        String str = this.n;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.r;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.o;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.p;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.q;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public void i(String str) {
        this.o = str;
    }

    public void j(String str) {
        this.p = str;
    }
}
