package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class h9c extends tif {
    public static final AtomicInteger L = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public i9c C;
    public q9c D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public ImmutableList<Integer> I;
    public boolean J;
    public boolean K;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f19830k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final a p;
    public final b q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i9c f19831r;
    public final boolean s;
    public final boolean t;
    public final rfp u;
    public final f9c v;
    public final List<Format> w;
    public final DrmInitData x;
    public final z1d y;
    public final okh z;

    public h9c(f9c f9cVar, a aVar, b bVar, Format format, boolean z, a aVar2, b bVar2, boolean z2, Uri uri, List<Format> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, rfp rfpVar, DrmInitData drmInitData, i9c i9cVar, z1d z1dVar, okh okhVar, boolean z6) {
        super(aVar, bVar, format, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.K = z3;
        this.l = i3;
        this.q = bVar2;
        this.p = aVar2;
        this.F = bVar2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = rfpVar;
        this.t = z4;
        this.v = f9cVar;
        this.w = list;
        this.x = drmInitData;
        this.f19831r = i9cVar;
        this.y = z1dVar;
        this.z = okhVar;
        this.n = z6;
        this.I = ImmutableList.of();
        this.f19830k = L.getAndIncrement();
    }

    public static a h(a aVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return aVar;
        }
        rk1.e(bArr2);
        return new av0(aVar, bArr, bArr2);
    }

    public static h9c i(f9c f9cVar, a aVar, Format format, long j, c cVar, d9c.e eVar, Uri uri, List<Format> list, int i, Object obj, boolean z, sfp sfpVar, h9c h9cVar, byte[] bArr, byte[] bArr2) {
        a aVarH;
        b bVar;
        boolean z2;
        int i2;
        z1d z1dVar;
        okh okhVar;
        i9c i9cVar;
        boolean z3;
        c.e eVar2 = eVar.f15259a;
        b bVarA = new b.C0206b().i(hdq.d(cVar.f23628a, eVar2.f8166a)).h(eVar2.i).g(eVar2.j).b(eVar.d ? 8 : 0).a();
        boolean z4 = bArr != null;
        a aVarH2 = h(aVar, bArr, z4 ? k((String) rk1.e(eVar2.h)) : null);
        c.d dVar = eVar2.f8167b;
        if (dVar != null) {
            boolean z5 = bArr2 != null;
            byte[] bArrK = z5 ? k((String) rk1.e(dVar.h)) : null;
            bVar = new b(hdq.d(cVar.f23628a, dVar.f8166a), dVar.i, dVar.j);
            aVarH = h(aVar, bArr2, bArrK);
            z2 = z5;
        } else {
            aVarH = null;
            bVar = null;
            z2 = false;
        }
        long j2 = j + eVar2.e;
        long j3 = j2 + eVar2.c;
        int i3 = cVar.h + eVar2.d;
        if (h9cVar != null) {
            boolean z6 = uri.equals(h9cVar.m) && h9cVar.H;
            z1d z1dVar2 = h9cVar.y;
            okh okhVar2 = h9cVar.z;
            boolean z7 = !(z6 || (o(eVar, cVar) && j2 >= h9cVar.h));
            if (!z6 || h9cVar.J) {
                i2 = i3;
            } else {
                i2 = i3;
                i9c i9cVar2 = h9cVar.l == i2 ? h9cVar.C : null;
                z3 = z7;
                z1dVar = z1dVar2;
                okhVar = okhVar2;
                i9cVar = i9cVar2;
            }
            z3 = z7;
            z1dVar = z1dVar2;
            okhVar = okhVar2;
            i9cVar = i9cVar2;
        } else {
            i2 = i3;
            z1dVar = new z1d();
            okhVar = new okh(10);
            i9cVar = null;
            z3 = false;
        }
        return new h9c(f9cVar, aVarH2, bVarA, format, z4, aVarH, bVar, z2, uri, list, i, obj, j2, j3, eVar.f15260b, eVar.c, !eVar.d, i2, eVar2.f8168k, z, sfpVar.a(i2), eVar2.f, i9cVar, z1dVar, okhVar, z3);
    }

    public static byte[] k(String str) {
        if (fk1.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public static boolean o(d9c.e eVar, c cVar) {
        c.e eVar2 = eVar.f15259a;
        if (eVar2 instanceof c.b) {
            return ((c.b) eVar2).l || (eVar.c == 0 && cVar.c);
        }
        return cVar.c;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void b() {
        this.G = true;
    }

    @Override // defpackage.tif
    public boolean g() {
        return this.H;
    }

    public final void j(a aVar, b bVar, boolean z) throws IOException {
        b bVarE;
        long position;
        long j;
        boolean z2 = false;
        if (z) {
            z2 = this.E != 0;
            bVarE = bVar;
        } else {
            bVarE = bVar.e(this.E);
        }
        try {
            xu5 xu5VarT = t(aVar, bVarE);
            if (z2) {
                xu5VarT.p(this.E);
            }
            while (!this.G && this.C.a(xu5VarT)) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.e & 16384) == 0) {
                            throw e;
                        }
                        this.C.c();
                        position = xu5VarT.getPosition();
                        j = bVar.g;
                    }
                } catch (Throwable th) {
                    this.E = (int) (xu5VarT.getPosition() - bVar.g);
                    throw th;
                }
            }
            position = xu5VarT.getPosition();
            j = bVar.g;
            this.E = (int) (position - j);
            wlq.n(aVar);
        } catch (Throwable th2) {
            wlq.n(aVar);
            throw th2;
        }
    }

    public int l(int i) {
        rk1.g(!this.n);
        if (i >= this.I.size()) {
            return 0;
        }
        return this.I.get(i).intValue();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void load() throws IOException {
        i9c i9cVar;
        rk1.e(this.D);
        if (this.C == null && (i9cVar = this.f19831r) != null && i9cVar.d()) {
            this.C = this.f19831r;
            this.F = false;
        }
        r();
        if (this.G) {
            return;
        }
        if (!this.t) {
            q();
        }
        this.H = !this.G;
    }

    public void m(q9c q9cVar, ImmutableList<Integer> immutableList) {
        this.D = q9cVar;
        this.I = immutableList;
    }

    public void n() {
        this.J = true;
    }

    public boolean p() {
        return this.K;
    }

    public final void q() throws IOException {
        try {
            this.u.h(this.s, this.g);
            j(this.i, this.f14795b, this.A);
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    public final void r() throws IOException {
        if (this.F) {
            rk1.e(this.p);
            rk1.e(this.q);
            j(this.p, this.q, this.B);
            this.E = 0;
            this.F = false;
        }
    }

    public final long s(jl8 jl8Var) throws IOException {
        jl8Var.l();
        try {
            this.z.L(10);
            jl8Var.i(this.z.d(), 0, 10);
            if (this.z.G() != 4801587) {
                return -9223372036854775807L;
            }
            this.z.Q(3);
            int iC = this.z.C();
            int i = iC + 10;
            if (i > this.z.b()) {
                byte[] bArrD = this.z.d();
                this.z.L(i);
                System.arraycopy(bArrD, 0, this.z.d(), 0, 10);
            }
            jl8Var.i(this.z.d(), 10, iC);
            Metadata metadataE = this.y.e(this.z.d(), iC);
            if (metadataE == null) {
                return -9223372036854775807L;
            }
            int iE = metadataE.e();
            for (int i2 = 0; i2 < iE; i2++) {
                Metadata.Entry entryD = metadataE.d(i2);
                if (entryD instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) entryD;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f8008b)) {
                        System.arraycopy(privFrame.c, 0, this.z.d(), 0, 8);
                        this.z.P(0);
                        this.z.O(8);
                        return this.z.w() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    public final xu5 t(a aVar, b bVar) throws IOException {
        xu5 xu5Var = new xu5(aVar, bVar.g, aVar.b(bVar));
        if (this.C == null) {
            long jS = s(xu5Var);
            xu5Var.l();
            i9c i9cVar = this.f19831r;
            i9c i9cVarF = i9cVar != null ? i9cVar.f() : this.v.a(bVar.f8404a, this.d, this.w, this.u, aVar.d(), xu5Var);
            this.C = i9cVarF;
            if (i9cVarF.e()) {
                this.D.m0(jS != -9223372036854775807L ? this.u.b(jS) : this.g);
            } else {
                this.D.m0(0L);
            }
            this.D.Y();
            this.C.b(this.D);
        }
        this.D.j0(this.x);
        return xu5Var;
    }

    public void u() {
        this.K = true;
    }
}
