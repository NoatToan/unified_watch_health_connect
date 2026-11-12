package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class tbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f34542b;
    public final String c;
    public int d;

    public tbj(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.f34541a = j;
        this.f34542b = j2;
    }

    public tbj a(tbj tbjVar, String str) {
        String strC = c(str);
        if (tbjVar != null && strC.equals(tbjVar.c(str))) {
            long j = this.f34542b;
            if (j != -1) {
                long j2 = this.f34541a;
                if (j2 + j == tbjVar.f34541a) {
                    long j3 = tbjVar.f34542b;
                    return new tbj(strC, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = tbjVar.f34542b;
            if (j4 != -1) {
                long j5 = tbjVar.f34541a;
                if (j5 + j4 == this.f34541a) {
                    return new tbj(strC, j5, j != -1 ? j4 + j : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return hdq.d(str, this.c);
    }

    public String c(String str) {
        return hdq.c(str, this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tbj.class != obj.getClass()) {
            return false;
        }
        tbj tbjVar = (tbj) obj;
        return this.f34541a == tbjVar.f34541a && this.f34542b == tbjVar.f34542b && this.c.equals(tbjVar.c);
    }

    public int hashCode() {
        if (this.d == 0) {
            this.d = ((((527 + ((int) this.f34541a)) * 31) + ((int) this.f34542b)) * 31) + this.c.hashCode();
        }
        return this.d;
    }

    public String toString() {
        String str = this.c;
        long j = this.f34541a;
        long j2 = this.f34542b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 81);
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(j);
        sb.append(", length=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
