package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class mdh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41464a = 0;
    private int d = 0;
    private String e;

    public String b() {
        return this.e;
    }

    public void d(String str) {
        this.e = str;
    }

    public int c() {
        return this.f41464a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !(obj instanceof mdh)) {
            return false;
        }
        mdh mdhVar = (mdh) obj;
        if (mdhVar.f41464a == this.f41464a && this.d == mdhVar.d && (str = this.e) != null) {
            return str.equals(mdhVar.e);
        }
        return false;
    }

    public int hashCode() {
        String str = this.e;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f41464a) * 31) + this.d;
    }
}
