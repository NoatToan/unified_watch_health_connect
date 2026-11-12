package defpackage;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a3r extends xio {
    public a n;
    public int o;
    public boolean p;
    public b3r.d q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b3r.b f587r;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b3r.d f588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b3r.b f589b;
        public final byte[] c;
        public final b3r.c[] d;
        public final int e;

        public a(b3r.d dVar, b3r.b bVar, byte[] bArr, b3r.c[] cVarArr, int i) {
            this.f588a = dVar;
            this.f589b = bVar;
            this.c = bArr;
            this.d = cVarArr;
            this.e = i;
        }
    }

    @VisibleForTesting
    public static void n(okh okhVar, long j) {
        if (okhVar.b() < okhVar.f() + 4) {
            okhVar.M(Arrays.copyOf(okhVar.d(), okhVar.f() + 4));
        } else {
            okhVar.O(okhVar.f() + 4);
        }
        byte[] bArrD = okhVar.d();
        bArrD[okhVar.f() - 4] = (byte) (j & 255);
        bArrD[okhVar.f() - 3] = (byte) ((j >>> 8) & 255);
        bArrD[okhVar.f() - 2] = (byte) ((j >>> 16) & 255);
        bArrD[okhVar.f() - 1] = (byte) ((j >>> 24) & 255);
    }

    public static int o(byte b2, a aVar) {
        return !aVar.d[p(b2, aVar.e, 1)].f3761a ? aVar.f588a.g : aVar.f588a.h;
    }

    @VisibleForTesting
    public static int p(byte b2, int i, int i2) {
        return (b2 >> i2) & (255 >>> (8 - i));
    }

    public static boolean r(okh okhVar) {
        try {
            return b3r.l(1, okhVar, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // defpackage.xio
    public void e(long j) {
        super.e(j);
        this.p = j != 0;
        b3r.d dVar = this.q;
        this.o = dVar != null ? dVar.g : 0;
    }

    @Override // defpackage.xio
    public long f(okh okhVar) {
        if ((okhVar.d()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(okhVar.d()[0], (a) rk1.i(this.n));
        long j = this.p ? (this.o + iO) / 4 : 0;
        n(okhVar, j);
        this.p = true;
        this.o = iO;
        return j;
    }

    @Override // defpackage.xio
    public boolean i(okh okhVar, long j, xio.b bVar) throws IOException {
        if (this.n != null) {
            rk1.e(bVar.f39170a);
            return false;
        }
        a aVarQ = q(okhVar);
        this.n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        b3r.d dVar = aVarQ.f588a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.j);
        arrayList.add(aVarQ.c);
        bVar.f39170a = new Format.b().e0("audio/vorbis").G(dVar.e).Z(dVar.d).H(dVar.f3764b).f0(dVar.c).T(arrayList).E();
        return true;
    }

    @Override // defpackage.xio
    public void l(boolean z) {
        super.l(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.f587r = null;
        }
        this.o = 0;
        this.p = false;
    }

    @VisibleForTesting
    public a q(okh okhVar) throws IOException {
        b3r.d dVar = this.q;
        if (dVar == null) {
            this.q = b3r.j(okhVar);
            return null;
        }
        b3r.b bVar = this.f587r;
        if (bVar == null) {
            this.f587r = b3r.h(okhVar);
            return null;
        }
        byte[] bArr = new byte[okhVar.f()];
        System.arraycopy(okhVar.d(), 0, bArr, 0, okhVar.f());
        b3r.c[] cVarArrK = b3r.k(okhVar, dVar.f3764b);
        return new a(dVar, bVar, bArr, cVarArrK, b3r.a(cVarArrK.length - 1));
    }
}
