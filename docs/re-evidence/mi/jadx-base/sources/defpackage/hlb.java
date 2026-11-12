package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class hlb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f20209a = "0123456789abcdef".toCharArray();

    public static final class a extends hlb implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f20210b;

        public a(byte[] bArr) {
            this.f20210b = (byte[]) c6i.o(bArr);
        }

        @Override // defpackage.hlb
        public byte[] a() {
            return (byte[]) this.f20210b.clone();
        }

        @Override // defpackage.hlb
        public int b() {
            byte[] bArr = this.f20210b;
            c6i.v(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.f20210b;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // defpackage.hlb
        public long c() {
            byte[] bArr = this.f20210b;
            c6i.v(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return h();
        }

        @Override // defpackage.hlb
        public int d() {
            return this.f20210b.length * 8;
        }

        @Override // defpackage.hlb
        public boolean e(hlb hlbVar) {
            if (this.f20210b.length != hlbVar.g().length) {
                return false;
            }
            boolean z = true;
            int i = 0;
            while (true) {
                byte[] bArr = this.f20210b;
                if (i >= bArr.length) {
                    return z;
                }
                z &= bArr[i] == hlbVar.g()[i];
                i++;
            }
        }

        @Override // defpackage.hlb
        public byte[] g() {
            return this.f20210b;
        }

        public long h() {
            long j = this.f20210b[0] & 255;
            for (int i = 1; i < Math.min(this.f20210b.length, 8); i++) {
                j |= (((long) this.f20210b[i]) & 255) << (i * 8);
            }
            return j;
        }
    }

    public static hlb f(byte[] bArr) {
        return new a(bArr);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract boolean e(hlb hlbVar);

    public final boolean equals(Object obj) {
        if (!(obj instanceof hlb)) {
            return false;
        }
        hlb hlbVar = (hlb) obj;
        return d() == hlbVar.d() && e(hlbVar);
    }

    public byte[] g() {
        return a();
    }

    public final int hashCode() {
        if (d() >= 32) {
            return b();
        }
        byte[] bArrG = g();
        int i = bArrG[0] & 255;
        for (int i2 = 1; i2 < bArrG.length; i2++) {
            i |= (bArrG[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArrG = g();
        StringBuilder sb = new StringBuilder(bArrG.length * 2);
        for (byte b2 : bArrG) {
            char[] cArr = f20209a;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }
}
