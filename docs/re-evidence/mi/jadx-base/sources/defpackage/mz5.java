package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class mz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27367b;
    public final String c;

    public mz5(String str, String str2, String str3) {
        this.f27366a = str;
        this.f27367b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mz5.class != obj.getClass()) {
            return false;
        }
        mz5 mz5Var = (mz5) obj;
        return wlq.c(this.f27366a, mz5Var.f27366a) && wlq.c(this.f27367b, mz5Var.f27367b) && wlq.c(this.c, mz5Var.c);
    }

    public int hashCode() {
        int iHashCode = this.f27366a.hashCode() * 31;
        String str = this.f27367b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
