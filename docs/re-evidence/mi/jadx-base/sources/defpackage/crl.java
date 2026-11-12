package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class crl {
    public static final crl c = new crl(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14649b;

    public crl(long j, long j2) {
        this.f14648a = j;
        this.f14649b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || crl.class != obj.getClass()) {
            return false;
        }
        crl crlVar = (crl) obj;
        return this.f14648a == crlVar.f14648a && this.f14649b == crlVar.f14649b;
    }

    public int hashCode() {
        return (((int) this.f14648a) * 31) + ((int) this.f14649b);
    }

    public String toString() {
        long j = this.f14648a;
        long j2 = this.f14649b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
