package defpackage;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class lwa implements AlgorithmParameterSpec, nwa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vwa f25489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25490b;
    public String c;
    public String d;

    public lwa(String str, String str2) {
        this(str, str2, null);
    }

    public static lwa e(twa twaVar) {
        return twaVar.h() != null ? new lwa(twaVar.j().u(), twaVar.g().u(), twaVar.h().u()) : new lwa(twaVar.j().u(), twaVar.g().u());
    }

    @Override // defpackage.nwa
    public vwa a() {
        return this.f25489a;
    }

    @Override // defpackage.nwa
    public String b() {
        return this.f25490b;
    }

    @Override // defpackage.nwa
    public String c() {
        return this.d;
    }

    @Override // defpackage.nwa
    public String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof lwa)) {
            return false;
        }
        lwa lwaVar = (lwa) obj;
        if (!this.f25489a.equals(lwaVar.f25489a) || !this.c.equals(lwaVar.c)) {
            return false;
        }
        String str = this.d;
        String str2 = lwaVar.d;
        return str == str2 || (str != null && str.equals(str2));
    }

    public int hashCode() {
        int iHashCode = this.f25489a.hashCode() ^ this.c.hashCode();
        String str = this.d;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    public lwa(String str, String str2, String str3) {
        jwa jwaVarA;
        try {
            jwaVarA = hwa.a(new fe(str));
        } catch (IllegalArgumentException unused) {
            fe feVarB = hwa.b(str);
            if (feVarB != null) {
                str = feVarB.u();
                jwaVarA = hwa.a(feVarB);
            } else {
                jwaVarA = null;
            }
        }
        if (jwaVarA != null) {
            this.f25489a = new vwa(jwaVarA.h(), jwaVarA.i(), jwaVarA.g());
            this.f25490b = str;
            this.c = str2;
            this.d = str3;
            return;
        }
        throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
    }

    public lwa(vwa vwaVar) {
        this.f25489a = vwaVar;
        this.c = t45.m.u();
        this.d = null;
    }
}
