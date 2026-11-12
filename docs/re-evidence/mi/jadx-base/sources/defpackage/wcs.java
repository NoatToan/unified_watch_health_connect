package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class wcs extends ups {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37858b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final byte[] f;

    public wcs(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this.f37857a = str;
        this.f37858b = j;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = bArr;
    }

    @Override // defpackage.ups
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ups
    public final long b() {
        return this.f37858b;
    }

    @Override // defpackage.ups
    public final String c() {
        return this.f37857a;
    }

    @Override // defpackage.ups
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.ups
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ups) {
            ups upsVar = (ups) obj;
            String str = this.f37857a;
            if (str != null ? str.equals(upsVar.c()) : upsVar.c() == null) {
                if (this.f37858b == upsVar.b() && this.c == upsVar.a() && this.d == upsVar.e() && this.e == upsVar.d()) {
                    if (Arrays.equals(this.f, upsVar instanceof wcs ? ((wcs) upsVar).f : upsVar.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ups
    public final byte[] f() {
        return this.f;
    }

    public final int hashCode() {
        String str = this.f37857a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f37858b;
        int i = this.c;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        return "ZipEntry{name=" + this.f37857a + ", size=" + this.f37858b + ", compressionMethod=" + this.c + ", isPartial=" + this.d + ", isEndOfArchive=" + this.e + ", headerBytes=" + Arrays.toString(this.f) + "}";
    }
}
