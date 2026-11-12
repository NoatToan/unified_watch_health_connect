package com.google.android.exoplayer2.source;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.r;
import defpackage.a1a;
import defpackage.ag4;
import defpackage.ayf;
import defpackage.h5n;
import defpackage.okh;
import defpackage.r61;
import defpackage.rk1;
import defpackage.snp;
import defpackage.toe;
import defpackage.wlq;
import defpackage.zm5;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class r implements snp {
    public boolean A;
    public Format B;
    public Format C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f8204a;
    public final com.google.android.exoplayer2.drm.c d;
    public final com.google.android.exoplayer2.drm.b.a e;
    public final Looper f;
    public d g;
    public Format h;
    public DrmSession i;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8207r;
    public int s;
    public int t;
    public boolean x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8205b = new b();
    public int j = 1000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f8206k = new int[1000];
    public long[] l = new long[1000];
    public long[] o = new long[1000];
    public int[] n = new int[1000];
    public int[] m = new int[1000];
    public snp.a[] p = new snp.a[1000];
    public final h5n<c> c = new h5n<>(new ag4() { // from class: j9l
        @Override // defpackage.ag4
        public final void accept(Object obj) {
            r.L((r.c) obj);
        }
    });
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean z = true;
    public boolean y = true;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f8209b;
        public snp.a c;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Format f8210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.drm.c.b f8211b;

        public c(Format format, com.google.android.exoplayer2.drm.c.b bVar) {
            this.f8210a = format;
            this.f8211b = bVar;
        }
    }

    public interface d {
        void a(Format format);
    }

    public r(r61 r61Var, Looper looper, com.google.android.exoplayer2.drm.c cVar, com.google.android.exoplayer2.drm.b.a aVar) {
        this.f = looper;
        this.d = cVar;
        this.e = aVar;
        this.f8204a = new q(r61Var);
    }

    public static /* synthetic */ void L(c cVar) {
        cVar.f8211b.release();
    }

    public static r k(r61 r61Var, Looper looper, com.google.android.exoplayer2.drm.c cVar, com.google.android.exoplayer2.drm.b.a aVar) {
        return new r(r61Var, (Looper) rk1.e(looper), (com.google.android.exoplayer2.drm.c) rk1.e(cVar), (com.google.android.exoplayer2.drm.b.a) rk1.e(aVar));
    }

    public static r l(r61 r61Var) {
        return new r(r61Var, null, null, null);
    }

    public final synchronized long A() {
        return Math.max(this.v, B(this.t));
    }

    public final long B(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iD = D(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.o[iD]);
            if ((this.n[iD] & 1) != 0) {
                break;
            }
            iD--;
            if (iD == -1) {
                iD = this.j - 1;
            }
        }
        return jMax;
    }

    public final int C() {
        return this.f8207r + this.t;
    }

    public final int D(int i) {
        int i2 = this.s + i;
        int i3 = this.j;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int E(long j, boolean z) {
        int iD = D(this.t);
        if (H() && j >= this.o[iD]) {
            if (j > this.w && z) {
                return this.q - this.t;
            }
            int iV = v(iD, this.q - this.t, j, true);
            if (iV == -1) {
                return 0;
            }
            return iV;
        }
        return 0;
    }

    public final synchronized Format F() {
        return this.z ? null : this.C;
    }

    public final int G() {
        return this.f8207r + this.q;
    }

    public final boolean H() {
        return this.t != this.q;
    }

    public final void I() {
        this.A = true;
    }

    public final synchronized boolean J() {
        return this.x;
    }

    public synchronized boolean K(boolean z) {
        Format format;
        boolean z2 = true;
        if (H()) {
            if (this.c.e(C()).f8210a != this.h) {
                return true;
            }
            return M(D(this.t));
        }
        if (!z && !this.x && ((format = this.C) == null || format == this.h)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean M(int i) {
        DrmSession drmSession = this.i;
        return drmSession == null || drmSession.getState() == 4 || ((this.n[i] & 1073741824) == 0 && this.i.b());
    }

    public void N() throws IOException {
        DrmSession drmSession = this.i;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) rk1.e(this.i.c()));
        }
    }

    public final void O(Format format, a1a a1aVar) {
        Format format2 = this.h;
        boolean z = format2 == null;
        DrmInitData drmInitData = z ? null : format2.o;
        this.h = format;
        DrmInitData drmInitData2 = format.o;
        com.google.android.exoplayer2.drm.c cVar = this.d;
        a1aVar.f517b = cVar != null ? format.c(cVar.c(format)) : format;
        a1aVar.f516a = this.i;
        if (this.d == null) {
            return;
        }
        if (z || !wlq.c(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.i;
            DrmSession drmSessionA = this.d.a((Looper) rk1.e(this.f), this.e, format);
            this.i = drmSessionA;
            a1aVar.f516a = drmSessionA;
            if (drmSession != null) {
                drmSession.a(this.e);
            }
        }
    }

    public final synchronized int P(a1a a1aVar, DecoderInputBuffer decoderInputBuffer, boolean z, boolean z2, b bVar) {
        try {
            decoderInputBuffer.d = false;
            if (!H()) {
                if (!z2 && !this.x) {
                    Format format = this.C;
                    if (format == null || (!z && format == this.h)) {
                        return -3;
                    }
                    O((Format) rk1.e(format), a1aVar);
                    return -5;
                }
                decoderInputBuffer.p(4);
                return -4;
            }
            Format format2 = this.c.e(C()).f8210a;
            if (!z && format2 == this.h) {
                int iD = D(this.t);
                if (!M(iD)) {
                    decoderInputBuffer.d = true;
                    return -3;
                }
                decoderInputBuffer.p(this.n[iD]);
                long j = this.o[iD];
                decoderInputBuffer.e = j;
                if (j < this.u) {
                    decoderInputBuffer.e(Integer.MIN_VALUE);
                }
                bVar.f8208a = this.m[iD];
                bVar.f8209b = this.l[iD];
                bVar.c = this.p[iD];
                return -4;
            }
            O(format2, a1aVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int Q() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return H() ? this.f8206k[D(this.t)] : this.D;
    }

    public void R() {
        r();
        U();
    }

    public int S(a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i, boolean z) {
        int iP = P(a1aVar, decoderInputBuffer, (i & 2) != 0, z, this.f8205b);
        if (iP == -4 && !decoderInputBuffer.n()) {
            boolean z2 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z2) {
                    this.f8204a.f(decoderInputBuffer, this.f8205b);
                } else {
                    this.f8204a.m(decoderInputBuffer, this.f8205b);
                }
            }
            if (!z2) {
                this.t++;
            }
        }
        return iP;
    }

    public void T() {
        W(true);
        U();
    }

    public final void U() {
        DrmSession drmSession = this.i;
        if (drmSession != null) {
            drmSession.a(this.e);
            this.i = null;
            this.h = null;
        }
    }

    public final void V() {
        W(false);
    }

    public void W(boolean z) {
        this.f8204a.n();
        this.q = 0;
        this.f8207r = 0;
        this.s = 0;
        this.t = 0;
        this.y = true;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.x = false;
        this.c.b();
        if (z) {
            this.B = null;
            this.C = null;
            this.z = true;
        }
    }

    public final synchronized void X() {
        this.t = 0;
        this.f8204a.o();
    }

    public final synchronized boolean Y(int i) {
        X();
        int i2 = this.f8207r;
        if (i >= i2 && i <= this.q + i2) {
            this.u = Long.MIN_VALUE;
            this.t = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean Z(long j, boolean z) {
        X();
        int iD = D(this.t);
        if (H() && j >= this.o[iD] && (j <= this.w || z)) {
            int iV = v(iD, this.q - this.t, j, true);
            if (iV == -1) {
                return false;
            }
            this.u = j;
            this.t += iV;
            return true;
        }
        return false;
    }

    @Override // defpackage.snp
    public final void a(okh okhVar, int i, int i2) {
        this.f8204a.q(okhVar, i);
    }

    public final void a0(long j) {
        if (this.G != j) {
            this.G = j;
            I();
        }
    }

    @Override // defpackage.snp
    public final void b(Format format) {
        Format formatW = w(format);
        this.A = false;
        this.B = format;
        boolean zC0 = c0(formatW);
        d dVar = this.g;
        if (dVar == null || !zC0) {
            return;
        }
        dVar.a(formatW);
    }

    public final void b0(long j) {
        this.u = j;
    }

    public final synchronized boolean c0(Format format) {
        try {
            this.z = false;
            if (wlq.c(format, this.C)) {
                return false;
            }
            if (this.c.g() || !this.c.f().f8210a.equals(format)) {
                this.C = format;
            } else {
                this.C = this.c.f().f8210a;
            }
            Format format2 = this.C;
            this.E = ayf.a(format2.l, format2.i);
            this.F = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d0(d dVar) {
        this.g = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    @Override // defpackage.snp
    public void e(long j, int i, int i2, int i3, snp.a aVar) {
        int i4;
        if (this.A) {
            b((Format) rk1.i(this.B));
        }
        int i5 = i & 1;
        boolean z = i5 != 0;
        if (this.y) {
            if (!z) {
                return;
            } else {
                this.y = false;
            }
        }
        long j2 = this.G + j;
        if (!this.E) {
            i4 = i;
        } else {
            if (j2 < this.u) {
                return;
            }
            if (i5 == 0) {
                if (!this.F) {
                    String strValueOf = String.valueOf(this.C);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 50);
                    sb.append("Overriding unexpected non-sync sample for format: ");
                    sb.append(strValueOf);
                    toe.h("SampleQueue", sb.toString());
                    this.F = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.H) {
            if (!z || !h(j2)) {
                return;
            } else {
                this.H = false;
            }
        }
        i(j2, i4, (this.f8204a.e() - ((long) i2)) - ((long) i3), i2, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void e0(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.t + i <= this.q) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        rk1.a(z);
        this.t += i;
    }

    @Override // defpackage.snp
    public final int f(zm5 zm5Var, int i, boolean z, int i2) throws IOException {
        return this.f8204a.p(zm5Var, i, z);
    }

    public final void f0(int i) {
        this.D = i;
    }

    public final void g0() {
        this.H = true;
    }

    public final synchronized boolean h(long j) {
        if (this.q == 0) {
            return j > this.v;
        }
        if (A() >= j) {
            return false;
        }
        t(this.f8207r + j(j));
        return true;
    }

    public final synchronized void i(long j, int i, long j2, int i2, snp.a aVar) {
        try {
            int i3 = this.q;
            if (i3 > 0) {
                int iD = D(i3 - 1);
                rk1.a(this.l[iD] + ((long) this.m[iD]) <= j2);
            }
            this.x = (536870912 & i) != 0;
            this.w = Math.max(this.w, j);
            int iD2 = D(this.q);
            this.o[iD2] = j;
            this.l[iD2] = j2;
            this.m[iD2] = i2;
            this.n[iD2] = i;
            this.p[iD2] = aVar;
            this.f8206k[iD2] = this.D;
            if (this.c.g() || !this.c.f().f8210a.equals(this.C)) {
                com.google.android.exoplayer2.drm.c cVar = this.d;
                this.c.a(G(), new c((Format) rk1.e(this.C), cVar != null ? cVar.b((Looper) rk1.e(this.f), this.e, this.C) : com.google.android.exoplayer2.drm.c.b.f7898a));
            }
            int i4 = this.q + 1;
            this.q = i4;
            int i5 = this.j;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                int[] iArr = new int[i6];
                long[] jArr = new long[i6];
                long[] jArr2 = new long[i6];
                int[] iArr2 = new int[i6];
                int[] iArr3 = new int[i6];
                snp.a[] aVarArr = new snp.a[i6];
                int i7 = this.s;
                int i8 = i5 - i7;
                System.arraycopy(this.l, i7, jArr, 0, i8);
                System.arraycopy(this.o, this.s, jArr2, 0, i8);
                System.arraycopy(this.n, this.s, iArr2, 0, i8);
                System.arraycopy(this.m, this.s, iArr3, 0, i8);
                System.arraycopy(this.p, this.s, aVarArr, 0, i8);
                System.arraycopy(this.f8206k, this.s, iArr, 0, i8);
                int i9 = this.s;
                System.arraycopy(this.l, 0, jArr, i8, i9);
                System.arraycopy(this.o, 0, jArr2, i8, i9);
                System.arraycopy(this.n, 0, iArr2, i8, i9);
                System.arraycopy(this.m, 0, iArr3, i8, i9);
                System.arraycopy(this.p, 0, aVarArr, i8, i9);
                System.arraycopy(this.f8206k, 0, iArr, i8, i9);
                this.l = jArr;
                this.o = jArr2;
                this.n = iArr2;
                this.m = iArr3;
                this.p = aVarArr;
                this.f8206k = iArr;
                this.s = 0;
                this.j = i6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int j(long j) {
        int i = this.q;
        int iD = D(i - 1);
        while (i > this.t && this.o[iD] >= j) {
            i--;
            iD--;
            if (iD == -1) {
                iD = this.j - 1;
            }
        }
        return i;
    }

    public final synchronized long m(long j, boolean z, boolean z2) {
        int i;
        try {
            int i2 = this.q;
            if (i2 != 0) {
                long[] jArr = this.o;
                int i3 = this.s;
                if (j >= jArr[i3]) {
                    if (z2 && (i = this.t) != i2) {
                        i2 = i + 1;
                    }
                    int iV = v(i3, i2, j, z);
                    if (iV == -1) {
                        return -1L;
                    }
                    return p(iV);
                }
            }
            return -1L;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long n() {
        int i = this.q;
        if (i == 0) {
            return -1L;
        }
        return p(i);
    }

    public synchronized long o() {
        int i = this.t;
        if (i == 0) {
            return -1L;
        }
        return p(i);
    }

    @GuardedBy("this")
    public final long p(int i) {
        this.v = Math.max(this.v, B(i));
        this.q -= i;
        int i2 = this.f8207r + i;
        this.f8207r = i2;
        int i3 = this.s + i;
        this.s = i3;
        int i4 = this.j;
        if (i3 >= i4) {
            this.s = i3 - i4;
        }
        int i5 = this.t - i;
        this.t = i5;
        if (i5 < 0) {
            this.t = 0;
        }
        this.c.d(i2);
        if (this.q != 0) {
            return this.l[this.s];
        }
        int i6 = this.s;
        if (i6 == 0) {
            i6 = this.j;
        }
        int i7 = i6 - 1;
        return this.l[i7] + ((long) this.m[i7]);
    }

    public final void q(long j, boolean z, boolean z2) {
        this.f8204a.b(m(j, z, z2));
    }

    public final void r() {
        this.f8204a.b(n());
    }

    public final void s() {
        this.f8204a.b(o());
    }

    public final long t(int i) {
        int iG = G() - i;
        boolean z = false;
        rk1.a(iG >= 0 && iG <= this.q - this.t);
        int i2 = this.q - iG;
        this.q = i2;
        this.w = Math.max(this.v, B(i2));
        if (iG == 0 && this.x) {
            z = true;
        }
        this.x = z;
        this.c.c(i);
        int i3 = this.q;
        if (i3 == 0) {
            return 0L;
        }
        int iD = D(i3 - 1);
        return this.l[iD] + ((long) this.m[iD]);
    }

    public final void u(int i) {
        this.f8204a.c(t(i));
    }

    public final int v(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.o[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.n[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.j) {
                i = 0;
            }
        }
        return i3;
    }

    public Format w(Format format) {
        return (this.G == 0 || format.p == Long.MAX_VALUE) ? format : format.a().i0(format.p + this.G).E();
    }

    public final int x() {
        return this.f8207r;
    }

    public final synchronized long y() {
        return this.q == 0 ? Long.MIN_VALUE : this.o[this.s];
    }

    public final synchronized long z() {
        return this.w;
    }
}
