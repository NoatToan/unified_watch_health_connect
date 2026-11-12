package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wzk {
    public static final byte[] l = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f38518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38519b;
    public final boolean c;
    public final byte d;
    public final boolean e;
    public final byte f;
    public final int g;
    public final long h;
    public final int i;
    public final byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f38520k;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f38521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f38522b;
        public byte c;
        public int d;
        public long e;
        public int f;
        public byte[] g = wzk.l;
        public byte[] h = wzk.l;

        public wzk i() {
            return new wzk(this);
        }

        public b j(byte[] bArr) {
            rk1.e(bArr);
            this.g = bArr;
            return this;
        }

        public b k(boolean z) {
            this.f38522b = z;
            return this;
        }

        public b l(boolean z) {
            this.f38521a = z;
            return this;
        }

        public b m(byte[] bArr) {
            rk1.e(bArr);
            this.h = bArr;
            return this;
        }

        public b n(byte b2) {
            this.c = b2;
            return this;
        }

        public b o(int i) {
            rk1.a(i >= 0 && i <= 65535);
            this.d = i & 65535;
            return this;
        }

        public b p(int i) {
            this.f = i;
            return this;
        }

        public b q(long j) {
            this.e = j;
            return this;
        }
    }

    public static wzk b(okh okhVar) {
        byte[] bArr;
        if (okhVar.a() < 12) {
            return null;
        }
        int iD = okhVar.D();
        byte b2 = (byte) (iD >> 6);
        boolean z = ((iD >> 5) & 1) == 1;
        byte b3 = (byte) (iD & 15);
        if (b2 != 2) {
            return null;
        }
        int iD2 = okhVar.D();
        boolean z2 = ((iD2 >> 7) & 1) == 1;
        byte b4 = (byte) (iD2 & 127);
        int iJ = okhVar.J();
        long jF = okhVar.F();
        int iN = okhVar.n();
        if (b3 > 0) {
            bArr = new byte[b3 * 4];
            for (int i = 0; i < b3; i++) {
                okhVar.j(bArr, i * 4, 4);
            }
        } else {
            bArr = l;
        }
        byte[] bArr2 = new byte[okhVar.a()];
        okhVar.j(bArr2, 0, okhVar.a());
        return new b().l(z).k(z2).n(b4).o(iJ).q(jF).p(iN).j(bArr).m(bArr2).i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wzk.class != obj.getClass()) {
            return false;
        }
        wzk wzkVar = (wzk) obj;
        return this.f == wzkVar.f && this.g == wzkVar.g && this.e == wzkVar.e && this.h == wzkVar.h && this.i == wzkVar.i;
    }

    public int hashCode() {
        int i = (((((527 + this.f) * 31) + this.g) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.h;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.i;
    }

    public String toString() {
        return wlq.D("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f), Integer.valueOf(this.g), Long.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.e));
    }

    public wzk(b bVar) {
        this.f38518a = (byte) 2;
        this.f38519b = bVar.f38521a;
        this.c = false;
        this.e = bVar.f38522b;
        this.f = bVar.c;
        this.g = bVar.d;
        this.h = bVar.e;
        this.i = bVar.f;
        byte[] bArr = bVar.g;
        this.j = bArr;
        this.d = (byte) (bArr.length / 4);
        this.f38520k = bVar.h;
    }
}
