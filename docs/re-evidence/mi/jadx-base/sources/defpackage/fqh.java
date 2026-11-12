package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class fqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18086b;

    public final int a(String str) {
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    public String b() {
        return this.f18085a;
    }

    public String c() {
        return this.f18086b;
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
        if (!(obj instanceof fqh)) {
            return false;
        }
        fqh fqhVar = (fqh) obj;
        return fqhVar == this || (d(this.f18085a, fqhVar.f18085a) && d(this.f18086b, fqhVar.f18086b));
    }

    public int hashCode() {
        return a(this.f18085a) + (a(this.f18086b) * 31);
    }
}
