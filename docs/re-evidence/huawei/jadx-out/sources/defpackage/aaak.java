package defpackage;

import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import org.eclipse.californium.scandium.dtls.DTLSConnectionState;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class aaak implements Destroyable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f37a = aaex.a((Class<?>) aaak.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zzs.b f38c = new zzs.b(4, 2, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aabn f39b;
    private SecretKey d;
    private SecretKey e;
    private aaae f;
    private int g;
    private boolean h;
    private final long i;
    private volatile long j;
    private volatile long k;
    private int l;
    private long m;
    private DTLSConnectionState n;
    private int o;
    private long[] p;
    private final aaam q;
    private volatile long r;
    private aabn s;
    private volatile long t;
    private final boolean u;
    private aaae v;
    private DTLSConnectionState w;
    private int x;
    private boolean y;

    public aaak(long j, boolean z) {
        this.v = null;
        this.f = null;
        this.n = DTLSConnectionState.NULL;
        this.w = DTLSConnectionState.NULL;
        this.d = null;
        this.e = null;
        this.o = 0;
        this.x = 0;
        this.p = new long[2];
        this.t = -1L;
        this.k = 0L;
        this.r = 0L;
        this.j = 0L;
        if (j < 0 || j > 281474976710655L) {
            throw new IllegalArgumentException("Initial sequence number must be greater than 0 and less than 2^48");
        }
        this.q = new aaam();
        this.i = System.currentTimeMillis();
        this.p[0] = j;
        this.u = z;
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        aadd.a(this.q);
        aadd.e(this.d);
        this.d = null;
        aadd.e(this.e);
        this.e = null;
        if (this.n != DTLSConnectionState.NULL) {
            this.n.destroy();
            this.n = DTLSConnectionState.NULL;
        }
        if (this.w != DTLSConnectionState.NULL) {
            this.w.destroy();
            this.w = DTLSConnectionState.NULL;
        }
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return aadd.b(this.q) && aadd.b(this.n) && aadd.b(this.w) && aadd.a(this.e) && aadd.a(this.d);
    }

    public aaam d() {
        return this.q;
    }

    public boolean m() {
        return this.y;
    }

    void e(boolean z) {
        this.y = z;
    }

    public aaae h() {
        return this.v;
    }

    void e(aaae aaaeVar) {
        this.v = aaaeVar;
    }

    public aaae a() {
        return this.f;
    }

    void d(aaae aaaeVar) {
        this.f = aaaeVar;
    }

    public void c(SecretKey secretKey, SecretKey secretKey2) {
        this.d = aadd.d(secretKey);
        this.e = aadd.d(secretKey2);
    }

    public void b(aabn aabnVar, aabn aabnVar2) {
        if (this.u) {
            this.f39b = aabnVar;
            this.s = aabnVar2;
        }
    }

    public void a(zya.e eVar) {
        d(eVar, this.x);
    }

    public void e(zya.e eVar) {
        d(eVar, this.o);
    }

    private void d(zya.e eVar, int i) {
        this.q.d(eVar);
        eVar.d(zxu.i, Integer.valueOf(i));
        eVar.d(zxu.m, Long.valueOf(this.i));
        if (this.v != null && this.f != null) {
            eVar.d(zxu.q, this.f);
            eVar.d(zxu.r, this.v);
        }
        if (this.g > 0) {
            eVar.d(zxu.o, Integer.valueOf(this.g));
        }
    }

    public int i() {
        return this.x;
    }

    public int b() {
        return this.o;
    }

    void f() {
        l();
        this.o++;
    }

    private void k() {
        int i = this.x + 1;
        this.x = i;
        this.p[i] = 0;
    }

    public long e() {
        return b(this.x);
    }

    public long b(int i) {
        long[] jArr = this.p;
        long j = jArr[i];
        if (j <= 281474976710655L) {
            jArr[i] = 1 + j;
            return j;
        }
        throw new IllegalStateException("Maximum sequence number for epoch has been reached");
    }

    public DTLSConnectionState c() {
        return this.n;
    }

    public void e(SecretKey secretKey, aacw aacwVar, SecretKey secretKey2) {
        DTLSConnectionState dTLSConnectionStateCreate = DTLSConnectionState.create(this.q.a(), this.q.e(), secretKey, aacwVar, secretKey2);
        aadd.a(this.n);
        this.n = dTLSConnectionStateCreate;
        f();
        f37a.trace("Setting current read state to{}{}", zzp.c(), dTLSConnectionStateCreate);
    }

    public DTLSConnectionState g() {
        return d(this.x);
    }

    DTLSConnectionState d(int i) {
        if (i == 0) {
            return DTLSConnectionState.NULL;
        }
        return this.w;
    }

    public void d(SecretKey secretKey, aacw aacwVar, SecretKey secretKey2) {
        DTLSConnectionState dTLSConnectionStateCreate = DTLSConnectionState.create(this.q.a(), this.q.e(), secretKey, aacwVar, secretKey2);
        aadd.a(this.w);
        this.w = dTLSConnectionStateCreate;
        k();
        f37a.trace("Setting current write state to{}{}", zzp.c(), dTLSConnectionStateCreate);
    }

    public void a(int i) {
        this.g = i;
    }

    public boolean e(int i, long j, int i2) {
        int iB = b();
        if (i != iB) {
            throw new IllegalArgumentException("wrong epoch! " + i + " != " + iB);
        }
        if (j < this.k) {
            return i2 < 0 || j > this.k - ((long) i2);
        }
        if (this.h) {
            int i3 = this.l;
            if (i > i3) {
                return false;
            }
            if (i == i3 && j >= this.m) {
                return false;
            }
        }
        return !a(j);
    }

    boolean a(long j) {
        if (j > this.t) {
            return false;
        }
        long j2 = 1 << ((int) (j - this.k));
        Logger logger = f37a;
        if (logger.isDebugEnabled()) {
            logger.debug("Checking sequence no [{}] using bit mask [{}] against received records [{}] with lower boundary [{}]", Long.valueOf(j), Long.toBinaryString(j2), Long.toBinaryString(this.r), Long.valueOf(this.k));
        }
        return (this.r & j2) == j2;
    }

    public boolean e(int i, long j) {
        int iB = b();
        if (i != iB) {
            throw new IllegalArgumentException("wrong epoch! " + i + " != " + iB);
        }
        boolean z = j > this.t;
        if (z) {
            this.t = j;
            long jMax = Math.max(0L, j - 63);
            long j2 = jMax - this.k;
            if (j2 > 0) {
                this.r >>>= (int) j2;
                this.k = jMax;
            }
        }
        this.r = (1 << ((int) (j - this.k))) | this.r;
        Logger logger = f37a;
        if (logger.isDebugEnabled()) {
            logger.debug("Updated receive window with sequence number [{}]: new upper boundary [{}], new bit vector [{}]", Long.valueOf(j), Long.valueOf(this.t), Long.toBinaryString(this.r));
        }
        return z;
    }

    public boolean n() {
        return this.h;
    }

    public void a(int i, long j) {
        this.h = true;
        this.l = i;
        this.m = j;
    }

    public int hashCode() {
        int i;
        long j;
        long j2 = this.i;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) + 31;
        if (this.h) {
            i = ((i2 * 31) + this.l) * 31;
            j = this.m;
        } else {
            i = ((i2 * 31) + this.o) * 31;
            j = this.t;
        }
        int i3 = (int) j;
        int i4 = this.x;
        int i5 = (int) this.p[i4];
        int i6 = (int) this.k;
        int i7 = (int) (this.r ^ (this.r >>> 32));
        aaae aaaeVar = this.f;
        int iHashCode = aaaeVar == null ? 0 : aaaeVar.hashCode();
        aaae aaaeVar2 = this.v;
        return ((((((((((((((((((i + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + iHashCode) * 31) + (aaaeVar2 != null ? aaaeVar2.hashCode() : 0)) * 31) + (this.y ? 1 : 0)) * 31) + this.g) * 31) + this.q.hashCode();
    }

    public boolean equals(Object obj) {
        boolean z;
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aaak aaakVar = (aaak) obj;
        if (this.q.equals(aaakVar.q) && this.i == aaakVar.i && (z = this.h) == aaakVar.h) {
            return (!z || (this.l == aaakVar.l && this.m == aaakVar.m)) && zzg.c(this.f, aaakVar.f) && zzg.c(this.v, aaakVar.v) && this.o == aaakVar.o && this.k == aaakVar.k && this.t == aaakVar.t && this.r == aaakVar.r && (i = this.x) == aaakVar.x && this.p[i] == aaakVar.p[i] && this.y == aaakVar.y && this.g == aaakVar.g;
        }
        return false;
    }

    private void l() {
        this.r = 0L;
        this.t = -1L;
        this.k = 0L;
    }

    public void j() {
        this.j++;
    }

    public boolean a(zzl zzlVar) {
        if (this.h) {
            return false;
        }
        int iE = zzs.e(zzlVar, 4, 16);
        zzlVar.e(this.i, 64);
        this.q.c(zzlVar);
        zzlVar.d(this.o, 8);
        if (this.o > 0) {
            c().writeTo(zzlVar);
        }
        zzlVar.d(this.x, 8);
        if (this.x > 0) {
            g().writeTo(zzlVar);
        }
        zzlVar.c(this.v, 8);
        c(zzlVar);
        zzlVar.d(this.y ? (byte) 1 : (byte) 0);
        zzlVar.d(this.g, 16);
        zzlVar.d(this.u ? (byte) 1 : (byte) 0);
        if (this.u) {
            zzlVar.c(this.f39b, 8);
            zzlVar.c(this.s, 8);
        }
        zzs.a(zzlVar, iE, 16);
        return true;
    }

    public static aaak c(zzf zzfVar) {
        zzs.a aVarE = f38c.e();
        int iB = zzs.b(zzfVar, aVarE, 16);
        if (iB <= 0) {
            return null;
        }
        return new aaak(aVarE.c(), zzfVar.d(iB));
    }

    private aaak(int i, zzf zzfVar) {
        this.v = null;
        this.f = null;
        this.n = DTLSConnectionState.NULL;
        this.w = DTLSConnectionState.NULL;
        this.d = null;
        this.e = null;
        this.o = 0;
        this.x = 0;
        this.p = new long[2];
        this.t = -1L;
        this.k = 0L;
        this.r = 0L;
        this.j = 0L;
        this.i = zzfVar.e(64);
        aaam aaamVarC = aaam.c(zzfVar);
        this.q = aaamVarC;
        if (aaamVarC == null) {
            throw new IllegalArgumentException("read session must not be null!");
        }
        int iA = zzfVar.a(8);
        this.o = iA;
        if (iA > 0) {
            this.n = DTLSConnectionState.fromReader(aaamVarC.a(), aaamVarC.e(), zzfVar);
        }
        int iA2 = zzfVar.a(8);
        this.x = iA2;
        if (iA2 == 1) {
            this.w = DTLSConnectionState.fromReader(aaamVarC.a(), aaamVarC.e(), zzfVar);
        } else if (iA2 > 1) {
            throw new IllegalArgumentException("write epoch must be 1!");
        }
        byte[] bArrJ = zzfVar.j(8);
        if (bArrJ != null) {
            this.v = new aaae(bArrJ);
        }
        e(zzfVar);
        if (i == 2) {
            this.y = true;
            this.g = 0;
            this.u = false;
        } else if (i == 3) {
            this.y = zzfVar.e() == 1;
            this.g = zzfVar.a(16);
            this.u = false;
        } else if (i == 4) {
            this.y = zzfVar.e() == 1;
            this.g = zzfVar.a(16);
            boolean z = zzfVar.e() == 1;
            this.u = z;
            if (z) {
                byte[] bArrJ2 = zzfVar.j(8);
                if (bArrJ2 != null) {
                    this.f39b = new aabn(bArrJ2);
                }
                byte[] bArrJ3 = zzfVar.j(8);
                if (bArrJ3 != null) {
                    this.s = new aabn(bArrJ3);
                }
            }
        } else {
            this.u = false;
        }
        zzfVar.b("dtls-context");
    }

    public void c(zzl zzlVar) {
        int iE = zzs.e(zzlVar, 1, 8);
        zzlVar.e(this.p[this.x], 48);
        zzlVar.e(this.k, 48);
        zzlVar.e(this.r, 64);
        zzlVar.e(this.j, 64);
        zzs.a(zzlVar, iE, 8);
    }

    public void e(zzf zzfVar) {
        int iC = zzs.c(zzfVar, 1, 8);
        if (iC > 0) {
            zzf zzfVarD = zzfVar.d(iC);
            long jE = zzfVarD.e(48);
            long jE2 = zzfVarD.e(48);
            long jE3 = zzfVarD.e(64);
            long jE4 = zzfVarD.e(64);
            zzfVarD.b("dtls-context-sequence-numbers");
            int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(jE3);
            this.p[this.x] = jE;
            this.k = jE2;
            this.r = jE3;
            this.t = ((jE2 + 64) - ((long) iNumberOfLeadingZeros)) - 1;
            this.j = jE4;
        }
    }
}
