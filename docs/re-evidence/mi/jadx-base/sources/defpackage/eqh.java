package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class eqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16964b;

    public final int a(String str) {
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    public String b() {
        return this.f16963a;
    }

    public String c() {
        return this.f16964b;
    }

    public final boolean d(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof eqh)) {
            return false;
        }
        eqh eqhVar = (eqh) obj;
        return eqhVar == this || (d(this.f16963a, eqhVar.f16963a) && d(this.f16964b, eqhVar.f16964b));
    }

    public int hashCode() {
        return a(this.f16963a) + (a(this.f16964b) * 31);
    }
}
