package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class tcs extends eps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34579b;
    public final long c;
    public final long d;
    public final int e;

    public tcs(int i, String str, long j, long j2, int i2) {
        this.f34578a = i;
        this.f34579b = str;
        this.c = j;
        this.d = j2;
        this.e = i2;
    }

    @Override // defpackage.eps
    public final int a() {
        return this.f34578a;
    }

    @Override // defpackage.eps
    public final int b() {
        return this.e;
    }

    @Override // defpackage.eps
    public final long c() {
        return this.c;
    }

    @Override // defpackage.eps
    public final long d() {
        return this.d;
    }

    @Override // defpackage.eps
    public final String e() {
        return this.f34579b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eps) {
            eps epsVar = (eps) obj;
            if (this.f34578a == epsVar.a() && ((str = this.f34579b) != null ? str.equals(epsVar.e()) : epsVar.e() == null) && this.c == epsVar.c() && this.d == epsVar.d() && this.e == epsVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f34579b;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.f34578a;
        long j = this.c;
        long j2 = this.d;
        return ((((((iHashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "SliceCheckpoint{fileExtractionStatus=" + this.f34578a + ", filePath=" + this.f34579b + ", fileOffset=" + this.c + ", remainingBytes=" + this.d + ", previousChunk=" + this.e + "}";
    }
}
