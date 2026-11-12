package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.push.f;

/* JADX INFO: loaded from: classes11.dex */
public class dys extends fys {
    public String A;
    public boolean B;
    public String p;
    public String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f16083r;
    public String s;
    public String t;
    public String u;
    public boolean v;
    public String w;
    public String x;
    public String y;
    public String z;

    public dys() {
        this.p = null;
        this.q = null;
        this.v = false;
        this.x = "";
        this.y = "";
        this.z = "";
        this.A = "";
        this.B = false;
    }

    public void A(boolean z) {
        this.v = z;
    }

    public String B() {
        return this.p;
    }

    public void C(String str) {
        this.x = str;
    }

    public void D(boolean z) {
        this.B = z;
    }

    public String E() {
        return this.w;
    }

    public void F(String str) {
        this.y = str;
    }

    public String G() {
        return this.x;
    }

    public void H(String str) {
        this.z = str;
    }

    public String I() {
        return this.y;
    }

    public void J(String str) {
        this.A = str;
    }

    public String K() {
        return this.z;
    }

    public void L(String str) {
        this.p = str;
    }

    public String M() {
        return this.A;
    }

    public void N(String str) {
        this.s = str;
    }

    public String O() {
        return this.f16083r;
    }

    public void P(String str) {
        this.t = str;
    }

    public void Q(String str) {
        this.q = str;
    }

    public void R(String str) {
        this.f16083r = str;
    }

    @Override // defpackage.fys
    public Bundle a() {
        Bundle bundleA = super.a();
        if (!TextUtils.isEmpty(this.p)) {
            bundleA.putString("ext_msg_type", this.p);
        }
        String str = this.f16083r;
        if (str != null) {
            bundleA.putString("ext_msg_lang", str);
        }
        String str2 = this.s;
        if (str2 != null) {
            bundleA.putString("ext_msg_sub", str2);
        }
        String str3 = this.t;
        if (str3 != null) {
            bundleA.putString("ext_msg_body", str3);
        }
        if (!TextUtils.isEmpty(this.u)) {
            bundleA.putString("ext_body_encode", this.u);
        }
        String str4 = this.q;
        if (str4 != null) {
            bundleA.putString("ext_msg_thread", str4);
        }
        String str5 = this.w;
        if (str5 != null) {
            bundleA.putString("ext_msg_appid", str5);
        }
        if (this.v) {
            bundleA.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.x)) {
            bundleA.putString("ext_msg_seq", this.x);
        }
        if (!TextUtils.isEmpty(this.y)) {
            bundleA.putString("ext_msg_mseq", this.y);
        }
        if (!TextUtils.isEmpty(this.z)) {
            bundleA.putString("ext_msg_fseq", this.z);
        }
        if (this.B) {
            bundleA.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.A)) {
            bundleA.putString("ext_msg_status", this.A);
        }
        return bundleA;
    }

    @Override // defpackage.fys
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dys dysVar = (dys) obj;
        if (!super.equals(dysVar)) {
            return false;
        }
        String str = this.t;
        if (str == null ? dysVar.t != null : !str.equals(dysVar.t)) {
            return false;
        }
        String str2 = this.f16083r;
        if (str2 == null ? dysVar.f16083r != null : !str2.equals(dysVar.f16083r)) {
            return false;
        }
        String str3 = this.s;
        if (str3 == null ? dysVar.s != null : !str3.equals(dysVar.s)) {
            return false;
        }
        String str4 = this.q;
        if (str4 == null ? dysVar.q == null : str4.equals(dysVar.q)) {
            return this.p == dysVar.p;
        }
        return false;
    }

    @Override // defpackage.fys
    public String f() {
        f fVarB;
        StringBuilder sb = new StringBuilder();
        sb.append("<message");
        if (w() != null) {
            sb.append(" xmlns=\"");
            sb.append(w());
            sb.append("\"");
        }
        if (this.f16083r != null) {
            sb.append(" xml:lang=\"");
            sb.append(O());
            sb.append("\"");
        }
        if (l() != null) {
            sb.append(" id=\"");
            sb.append(l());
            sb.append("\"");
        }
        if (o() != null) {
            sb.append(" to=\"");
            sb.append(uys.b(o()));
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(G())) {
            sb.append(" seq=\"");
            sb.append(G());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(I())) {
            sb.append(" mseq=\"");
            sb.append(I());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(K())) {
            sb.append(" fseq=\"");
            sb.append(K());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(M())) {
            sb.append(" status=\"");
            sb.append(M());
            sb.append("\"");
        }
        if (q() != null) {
            sb.append(" from=\"");
            sb.append(uys.b(q()));
            sb.append("\"");
        }
        if (m() != null) {
            sb.append(" chid=\"");
            sb.append(uys.b(m()));
            sb.append("\"");
        }
        if (this.v) {
            sb.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.w)) {
            sb.append(" appid=\"");
            sb.append(E());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(this.p)) {
            sb.append(" type=\"");
            sb.append(this.p);
            sb.append("\"");
        }
        if (this.B) {
            sb.append(" s=\"1\"");
        }
        sb.append(">");
        if (this.s != null) {
            sb.append("<subject>");
            sb.append(uys.b(this.s));
            sb.append("</subject>");
        }
        if (this.t != null) {
            sb.append("<body");
            if (!TextUtils.isEmpty(this.u)) {
                sb.append(" encode=\"");
                sb.append(this.u);
                sb.append("\"");
            }
            sb.append(">");
            sb.append(uys.b(this.t));
            sb.append("</body>");
        }
        if (this.q != null) {
            sb.append("<thread>");
            sb.append(this.q);
            sb.append("</thread>");
        }
        if ("error".equalsIgnoreCase(this.p) && (fVarB = b()) != null) {
            sb.append(fVarB.b());
        }
        sb.append(u());
        sb.append("</message>");
        return sb.toString();
    }

    @Override // defpackage.fys
    public int hashCode() {
        String str = this.p;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.t;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.q;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f16083r;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.s;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public void y(String str) {
        this.w = str;
    }

    public void z(String str, String str2) {
        this.t = str;
        this.u = str2;
    }

    public dys(Bundle bundle) {
        super(bundle);
        this.p = null;
        this.q = null;
        this.v = false;
        this.x = "";
        this.y = "";
        this.z = "";
        this.A = "";
        this.B = false;
        this.p = bundle.getString("ext_msg_type");
        this.f16083r = bundle.getString("ext_msg_lang");
        this.q = bundle.getString("ext_msg_thread");
        this.s = bundle.getString("ext_msg_sub");
        this.t = bundle.getString("ext_msg_body");
        this.u = bundle.getString("ext_body_encode");
        this.w = bundle.getString("ext_msg_appid");
        this.v = bundle.getBoolean("ext_msg_trans", false);
        this.B = bundle.getBoolean("ext_msg_encrypt", false);
        this.x = bundle.getString("ext_msg_seq");
        this.y = bundle.getString("ext_msg_mseq");
        this.z = bundle.getString("ext_msg_fseq");
        this.A = bundle.getString("ext_msg_status");
    }
}
