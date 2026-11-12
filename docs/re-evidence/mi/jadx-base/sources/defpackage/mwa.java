package defpackage;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class mwa implements AlgorithmParameterSpec, owa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wwa f27280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27281b;
    public String c;
    public String d;

    public mwa(wwa wwaVar) {
        this.f27280a = wwaVar;
        this.c = u45.p.u();
        this.d = null;
    }

    public static mwa e(uwa uwaVar) {
        return uwaVar.h() != null ? new mwa(uwaVar.j().u(), uwaVar.g().u(), uwaVar.h().u()) : new mwa(uwaVar.j().u(), uwaVar.g().u());
    }

    @Override // defpackage.owa
    public wwa a() {
        return this.f27280a;
    }

    @Override // defpackage.owa
    public String b() {
        return this.f27281b;
    }

    @Override // defpackage.owa
    public String c() {
        return this.d;
    }

    @Override // defpackage.owa
    public String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mwa)) {
            return false;
        }
        mwa mwaVar = (mwa) obj;
        if (!this.f27280a.equals(mwaVar.f27280a) || !this.c.equals(mwaVar.c)) {
            return false;
        }
        String str = this.d;
        String str2 = mwaVar.d;
        return str == str2 || (str != null && str.equals(str2));
    }

    public int hashCode() {
        int iHashCode = this.f27280a.hashCode() ^ this.c.hashCode();
        String str = this.d;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    public mwa(String str, String str2) {
        this(str, str2, null);
    }

    public mwa(String str, String str2, String str3) {
        kwa kwaVarA;
        try {
            kwaVarA = iwa.a(new ee(str));
        } catch (IllegalArgumentException unused) {
            ee eeVarB = iwa.b(str);
            if (eeVarB != null) {
                str = eeVarB.u();
                kwaVarA = iwa.a(eeVarB);
            } else {
                kwaVarA = null;
            }
        }
        if (kwaVarA == null) {
            throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
        }
        this.f27280a = new wwa(kwaVarA.h(), kwaVarA.i(), kwaVarA.g());
        this.f27281b = str;
        this.c = str2;
        this.d = str3;
    }
}
