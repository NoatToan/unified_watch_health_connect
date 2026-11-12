package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.primitives.Longs;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Handler.Callback, androidx.media3.exoplayer.source.i.a, o0.d, k.a, r0.a {
    public static final long V0 = fa.z.Y(AbstractComponentTracker.LINGERING_TIMEOUT);
    public static final /* synthetic */ int W0 = 0;
    public final boolean A;
    public final ja.a B;
    public final fa.i C;
    public x0 D;
    public p0 E;
    public d F;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public int L0;
    public g M0;
    public long N0;
    public long O0;
    public boolean P;
    public int P0;
    public boolean Q0;
    public ExoPlaybackException R0;
    public boolean T;
    public ExoPlayer.c T0;
    public boolean X;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0[] f9885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<t0> f9886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0[] f9887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f9888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wa.l f9889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wa.m f9890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f9891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xa.c f9892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fa.i f9893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q0 f9894j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Looper f9895k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f9896k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.media3.common.d0.c f9897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.media3.common.d0.b f9898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f9899n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f9900o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f9901p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList<c> f9902q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fa.c f9903r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f9904t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h0 f9905v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o0 f9906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b0 f9907x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f9908y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ja.q f9909z;
    public long S0 = C.TIME_UNSET;
    public long Y = C.TIME_UNSET;
    public androidx.media3.common.d0 U0 = androidx.media3.common.d0.f8186a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.t f9917d;

        public b(int i14, int i15, int i16, androidx.media3.exoplayer.source.t tVar) {
            this.f9914a = i14;
            this.f9915b = i15;
            this.f9916c = i16;
            this.f9917d = tVar;
        }
    }

    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r0 f9918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f9920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f9921d;

        public c(r0 r0Var) {
            this.f9918a = r0Var;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            Object obj = this.f9921d;
            if ((obj == null) == (cVar2.f9921d == null)) {
                if (obj != null) {
                    int i14 = this.f9919b - cVar2.f9919b;
                    if (i14 != 0) {
                        return i14;
                    }
                    long j8 = this.f9920c;
                    long j14 = cVar2.f9920c;
                    int i15 = fa.z.f70071a;
                    if (j8 < j14) {
                        return -1;
                    }
                    if (j8 == j14) {
                    }
                }
                return 0;
            }
            if (obj != null) {
                return -1;
            }
            return 1;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f9922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p0 f9923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f9925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9926e;

        public d(p0 p0Var) {
            this.f9923b = p0Var;
        }

        public final void a(int i14) {
            this.f9922a |= i14 > 0;
            this.f9924c += i14;
        }
    }

    public interface e {
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.j.b f9927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f9930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f9931e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f9932f;

        public f(androidx.media3.exoplayer.source.j.b bVar, long j8, long j14, boolean z14, boolean z15, boolean z16) {
            this.f9927a = bVar;
            this.f9928b = j8;
            this.f9929c = j14;
            this.f9930d = z14;
            this.f9931e = z15;
            this.f9932f = z16;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.d0 f9933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9935c;

        public g(androidx.media3.common.d0 d0Var, int i14, long j8) {
            this.f9933a = d0Var;
            this.f9934b = i14;
            this.f9935c = j8;
        }
    }

    public z(t0[] t0VarArr, wa.l lVar, wa.m mVar, c0 c0Var, xa.c cVar, int i14, boolean z14, ja.a aVar, x0 x0Var, b0 b0Var, long j8, boolean z15, boolean z16, Looper looper, fa.c cVar2, e eVar, ja.q qVar, q0 q0Var, ExoPlayer.c cVar3) {
        Looper looper2;
        this.f9904t = eVar;
        this.f9885a = t0VarArr;
        this.f9889e = lVar;
        this.f9890f = mVar;
        this.f9891g = c0Var;
        this.f9892h = cVar;
        this.f9896k0 = i14;
        this.H0 = z14;
        this.D = x0Var;
        this.f9907x = b0Var;
        this.f9908y = j8;
        this.P = z15;
        this.A = z16;
        this.f9903r = cVar2;
        this.f9909z = qVar;
        this.T0 = cVar3;
        this.B = aVar;
        this.f9899n = c0Var.getBackBufferDurationUs();
        this.f9900o = c0Var.retainBackBufferFromKeyframe();
        p0 p0VarI = p0.i(mVar);
        this.E = p0VarI;
        this.F = new d(p0VarI);
        this.f9887c = new u0[t0VarArr.length];
        this.f9888d = new boolean[t0VarArr.length];
        u0.a aVarB = lVar.b();
        boolean z17 = false;
        for (int i15 = 0; i15 < t0VarArr.length; i15++) {
            t0VarArr[i15].d(i15, qVar, cVar2);
            this.f9887c[i15] = t0VarArr[i15].getCapabilities();
            if (aVarB != null) {
                androidx.media3.exoplayer.f fVar = (androidx.media3.exoplayer.f) this.f9887c[i15];
                synchronized (fVar.f8921a) {
                    fVar.f8937q = aVarB;
                }
            }
        }
        this.f9901p = new k(this, cVar2);
        this.f9902q = new ArrayList<>();
        this.f9886b = Sets.newIdentityHashSet();
        this.f9897l = new androidx.media3.common.d0.c();
        this.f9898m = new androidx.media3.common.d0.b();
        lVar.f183753a = this;
        lVar.f183754b = cVar;
        this.Q0 = true;
        fa.u uVarCreateHandler = cVar2.createHandler(looper, null);
        this.C = uVarCreateHandler;
        this.f9905v = new h0(aVar, uVarCreateHandler, new a73.j(this, 15), cVar3);
        this.f9906w = new o0(this, aVar, uVarCreateHandler, qVar);
        q0 q0Var2 = q0Var == null ? new q0() : q0Var;
        this.f9894j = q0Var2;
        synchronized (q0Var2.f9340a) {
            try {
                if (q0Var2.f9341b == null) {
                    if (q0Var2.f9343d == 0 && q0Var2.f9342c == null) {
                        z17 = true;
                    }
                    fa.a.d(z17);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    q0Var2.f9342c = handlerThread;
                    handlerThread.start();
                    q0Var2.f9341b = q0Var2.f9342c.getLooper();
                }
                q0Var2.f9343d++;
                looper2 = q0Var2.f9341b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f9895k = looper2;
        this.f9893i = cVar2.createHandler(looper2, this);
    }

    public static Pair<Object, Long> J(androidx.media3.common.d0 d0Var, g gVar, boolean z14, int i14, boolean z15, androidx.media3.common.d0.c cVar, androidx.media3.common.d0.b bVar) {
        int iK;
        androidx.media3.common.d0 d0Var2 = gVar.f9933a;
        if (d0Var.p()) {
            return null;
        }
        androidx.media3.common.d0 d0Var3 = d0Var2.p() ? d0Var : d0Var2;
        try {
            Pair<Object, Long> pairI = d0Var3.i(cVar, bVar, gVar.f9934b, gVar.f9935c);
            if (!d0Var.equals(d0Var3)) {
                if (d0Var.b(pairI.first) == -1) {
                    if (!z14 || (iK = K(cVar, bVar, i14, z15, pairI.first, d0Var3, d0Var)) == -1) {
                        return null;
                    }
                    return d0Var.i(cVar, bVar, iK, C.TIME_UNSET);
                }
                if (d0Var3.g(pairI.first, bVar).f8192f && d0Var3.m(bVar.f8189c, cVar, 0L).f8209n == d0Var3.b(pairI.first)) {
                    return d0Var.i(cVar, bVar, d0Var.g(pairI.first, bVar).f8189c, gVar.f9935c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int K(androidx.media3.common.d0.c cVar, androidx.media3.common.d0.b bVar, int i14, boolean z14, Object obj, androidx.media3.common.d0 d0Var, androidx.media3.common.d0 d0Var2) {
        androidx.media3.common.d0 d0Var3 = d0Var;
        Object obj2 = d0Var3.m(d0Var3.g(obj, bVar).f8189c, cVar, 0L).f8196a;
        for (int i15 = 0; i15 < d0Var2.o(); i15++) {
            if (d0Var2.m(i15, cVar, 0L).f8196a.equals(obj2)) {
                return i15;
            }
        }
        int iB = d0Var3.b(obj);
        int iH = d0Var3.h();
        int iB2 = -1;
        int i16 = 0;
        while (i16 < iH && iB2 == -1) {
            androidx.media3.common.d0 d0Var4 = d0Var3;
            int iD = d0Var4.d(iB, bVar, cVar, i14, z14);
            if (iD == -1) {
                break;
            }
            iB2 = d0Var2.b(d0Var4.l(iD));
            i16++;
            d0Var3 = d0Var4;
            iB = iD;
        }
        if (iB2 == -1) {
            return -1;
        }
        return d0Var2.f(iB2, bVar, false).f8189c;
    }

    public static void R(t0 t0Var, long j8) {
        t0Var.setCurrentStreamFinal();
        if (t0Var instanceof va.g) {
            va.g gVar = (va.g) t0Var;
            fa.a.d(gVar.f8934n);
            gVar.Z = j8;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.i, androidx.media3.exoplayer.source.s, java.lang.Object] */
    public static boolean r(f0 f0Var) {
        if (f0Var != null) {
            try {
                ?? r14 = f0Var.f8938a;
                if (f0Var.f8943f) {
                    for (sa.n nVar : f0Var.f8940c) {
                        if (nVar != null) {
                            nVar.maybeThrowError();
                        }
                    }
                } else {
                    r14.maybeThrowPrepareError();
                }
                if ((!f0Var.f8943f ? 0L : r14.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static boolean s(t0 t0Var) {
        return t0Var.getState() != 0;
    }

    public final void A(b bVar) throws Throwable {
        androidx.media3.common.d0 d0VarB;
        this.F.a(1);
        int i14 = bVar.f9914a;
        int i15 = bVar.f9915b;
        int i16 = bVar.f9916c;
        androidx.media3.exoplayer.source.t tVar = bVar.f9917d;
        o0 o0Var = this.f9906w;
        ArrayList arrayList = o0Var.f9294b;
        fa.a.a(i14 >= 0 && i14 <= i15 && i15 <= arrayList.size() && i16 >= 0);
        o0Var.f9302j = tVar;
        if (i14 == i15 || i14 == i16) {
            d0VarB = o0Var.b();
        } else {
            int iMin = Math.min(i14, i16);
            int i17 = i15 - i14;
            int iMax = Math.max((i16 + i17) - 1, i15 - 1);
            int iO = ((o0.c) arrayList.get(iMin)).f9313d;
            int i18 = fa.z.f70071a;
            ArrayDeque arrayDeque = new ArrayDeque();
            for (int i19 = i17 - 1; i19 >= 0; i19--) {
                arrayDeque.addFirst(arrayList.remove(i14 + i19));
            }
            arrayList.addAll(Math.min(i16, arrayList.size()), arrayDeque);
            while (iMin <= iMax) {
                o0.c cVar = (o0.c) arrayList.get(iMin);
                cVar.f9313d = iO;
                iO += cVar.f9310a.f9510o.f158114b.o();
                iMin++;
            }
            d0VarB = o0Var.b();
        }
        n(d0VarB, false);
    }

    public final void B() {
        this.F.a(1);
        F(false, false, false, true);
        this.f9891g.g(this.f9909z);
        b0(this.E.f9318a.p() ? 4 : 2);
        xa.h transferListener = this.f9892h.getTransferListener();
        o0 o0Var = this.f9906w;
        ArrayList arrayList = o0Var.f9294b;
        fa.a.d(!o0Var.f9303k);
        o0Var.f9304l = transferListener;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            o0.c cVar = (o0.c) arrayList.get(i14);
            o0Var.e(cVar);
            o0Var.f9299g.add(cVar);
        }
        o0Var.f9303k = true;
        this.f9893i.sendEmptyMessage(2);
    }

    public final void C() {
        try {
            F(true, false, true, false);
            for (int i14 = 0; i14 < this.f9885a.length; i14++) {
                androidx.media3.exoplayer.f fVar = (androidx.media3.exoplayer.f) this.f9887c[i14];
                synchronized (fVar.f8921a) {
                    fVar.f8937q = null;
                }
                this.f9885a[i14].release();
            }
            this.f9891g.c(this.f9909z);
            b0(1);
            this.f9894j.a();
            synchronized (this) {
                this.I = true;
                notifyAll();
            }
        } catch (Throwable th3) {
            this.f9894j.a();
            synchronized (this) {
                this.I = true;
                notifyAll();
                throw th3;
            }
        }
    }

    public final void D(int i14, int i15, androidx.media3.exoplayer.source.t tVar) throws Throwable {
        this.F.a(1);
        o0 o0Var = this.f9906w;
        o0Var.getClass();
        fa.a.a(i14 >= 0 && i14 <= i15 && i15 <= o0Var.f9294b.size());
        o0Var.f9302j = tVar;
        o0Var.g(i14, i15);
        n(o0Var.b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public final void E() throws ExoPlaybackException {
        int i14;
        int i15;
        float f14 = this.f9901p.getPlaybackParameters().f8584a;
        h0 h0Var = this.f9905v;
        f0 f0Var = h0Var.f8990j;
        f0 f0Var2 = h0Var.f8991k;
        wa.m mVar = null;
        f0 f0Var3 = f0Var;
        boolean z14 = true;
        while (f0Var3 != null && f0Var3.f8943f) {
            p0 p0Var = this.E;
            wa.m mVarJ = f0Var3.j(f14, p0Var.f9318a, p0Var.f9329l);
            wa.m mVar2 = f0Var3 == this.f9905v.f8990j ? mVarJ : mVar;
            wa.m mVar3 = f0Var3.f8953p;
            wa.g[] gVarArr = mVarJ.f183757c;
            if (mVar3 != null && mVar3.f183757c.length == gVarArr.length) {
                int i16 = 0;
                while (true) {
                    if (i16 >= gVarArr.length) {
                        if (f0Var3 == f0Var2) {
                            z14 = false;
                        }
                        f0Var3 = f0Var3.f8951n;
                        mVar = mVar2;
                    } else if (mVarJ.a(mVar3, i16)) {
                        i16++;
                    }
                }
            }
            h0 h0Var2 = this.f9905v;
            if (!z14) {
                i14 = 4;
                h0Var2.o(f0Var3);
                if (f0Var3.f8943f) {
                    i15 = 4;
                    f0Var3.a(mVarJ, Math.max(f0Var3.f8945h.f8968b, this.N0 - f0Var3.f8954q), false, new boolean[f0Var3.f8948k.length]);
                }
                m(true);
                if (this.E.f9322e != i15) {
                    u();
                    k0();
                    this.f9893i.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            f0 f0Var4 = h0Var2.f8990j;
            boolean zO = h0Var2.o(f0Var4);
            boolean[] zArr = new boolean[this.f9885a.length];
            mVar2.getClass();
            long jA = f0Var4.a(mVar2, this.E.f9336s, zO, zArr);
            p0 p0Var2 = this.E;
            boolean z15 = (p0Var2.f9322e == 4 || jA == p0Var2.f9336s) ? false : true;
            p0 p0Var3 = this.E;
            i14 = 4;
            this.E = q(p0Var3.f9319b, jA, p0Var3.f9320c, p0Var3.f9321d, z15, 5);
            if (z15) {
                H(jA);
            }
            boolean[] zArr2 = new boolean[this.f9885a.length];
            int i17 = 0;
            while (true) {
                t0[] t0VarArr = this.f9885a;
                if (i17 >= t0VarArr.length) {
                    break;
                }
                t0 t0Var = t0VarArr[i17];
                boolean zS = s(t0Var);
                zArr2[i17] = zS;
                sa.n nVar = f0Var4.f8940c[i17];
                if (zS) {
                    if (nVar != t0Var.getStream()) {
                        d(i17);
                    } else if (zArr[i17]) {
                        t0Var.resetPosition(this.N0);
                    }
                }
                i17++;
            }
            f(zArr2, this.N0);
            i15 = i14;
            m(true);
            if (this.E.f9322e != i15) {
                u();
                k0();
                this.f9893i.sendEmptyMessage(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[PHI: r5 r6 r8
      0x00ba: PHI (r5v5 androidx.media3.exoplayer.source.j$b) = (r5v4 androidx.media3.exoplayer.source.j$b), (r5v10 androidx.media3.exoplayer.source.j$b) binds: [B:34:0x0090, B:36:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r6v2 long) = (r6v1 long), (r6v16 long) binds: [B:34:0x0090, B:36:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r8v2 long) = (r8v1 long), (r8v7 long) binds: [B:34:0x0090, B:36:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0100 A[PHI: r0
      0x0100: PHI (r0v12 androidx.media3.common.d0) = 
      (r0v11 androidx.media3.common.d0)
      (r0v11 androidx.media3.common.d0)
      (r0v29 androidx.media3.common.d0)
      (r0v29 androidx.media3.common.d0)
     binds: [B:40:0x00c7, B:42:0x00cb, B:44:0x00da, B:46:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    public final void F(boolean z14, boolean z15, boolean z16, boolean z17) {
        t0[] t0VarArr;
        long j8;
        boolean z18;
        androidx.media3.common.d0 d0Var;
        androidx.media3.exoplayer.source.j.b bVar;
        this.f9893i.removeMessages(2);
        this.R0 = null;
        m0(false, true);
        k kVar = this.f9901p;
        kVar.f9190f = false;
        y0 y0Var = kVar.f9185a;
        if (y0Var.f9881b) {
            y0Var.a(y0Var.getPositionUs());
            y0Var.f9881b = false;
        }
        this.N0 = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
        int i14 = 0;
        while (true) {
            t0VarArr = this.f9885a;
            if (i14 >= t0VarArr.length) {
                break;
            }
            try {
                d(i14);
            } catch (ExoPlaybackException | RuntimeException e4) {
                fa.k.d("Disable failed.", e4);
            }
            i14++;
        }
        if (z14) {
            for (t0 t0Var : t0VarArr) {
                if (this.f9886b.remove(t0Var)) {
                    try {
                        t0Var.reset();
                    } catch (RuntimeException e14) {
                        fa.k.d("Reset failed.", e14);
                    }
                }
            }
        }
        this.L0 = 0;
        p0 p0Var = this.E;
        androidx.media3.exoplayer.source.j.b bVar2 = p0Var.f9319b;
        long jLongValue = p0Var.f9336s;
        if (this.E.f9319b.b()) {
            j8 = this.E.f9320c;
        } else {
            p0 p0Var2 = this.E;
            androidx.media3.common.d0.b bVar3 = this.f9898m;
            androidx.media3.exoplayer.source.j.b bVar4 = p0Var2.f9319b;
            androidx.media3.common.d0 d0Var2 = p0Var2.f9318a;
            if (d0Var2.p() || d0Var2.g(bVar4.f9519a, bVar3).f8192f) {
                j8 = this.E.f9320c;
            } else {
                j8 = this.E.f9336s;
            }
        }
        if (z15) {
            this.M0 = null;
            Pair<androidx.media3.exoplayer.source.j.b, Long> pairI = i(this.E.f9318a);
            bVar2 = (androidx.media3.exoplayer.source.j.b) pairI.first;
            jLongValue = ((Long) pairI.second).longValue();
            boolean zEquals = bVar2.equals(this.E.f9319b);
            j8 = C.TIME_UNSET;
            z18 = zEquals ? false : true;
        }
        long j14 = jLongValue;
        long j15 = j8;
        this.f9905v.b();
        this.Z = false;
        androidx.media3.common.d0 d0VarY = this.E.f9318a;
        if (z16 && (d0VarY instanceof s0)) {
            d0VarY = ((s0) d0VarY).y(this.f9906w.f9302j);
            if (bVar2.f9520b != -1) {
                d0VarY.g(bVar2.f9519a, this.f9898m);
                int i15 = this.f9898m.f8189c;
                androidx.media3.common.d0.c cVar = this.f9897l;
                d0VarY.m(i15, cVar, 0L);
                if (cVar.a()) {
                    d0Var = d0VarY;
                    bVar = new androidx.media3.exoplayer.source.j.b(bVar2.f9519a, bVar2.f9522d);
                } else {
                    d0Var = d0VarY;
                    bVar = bVar2;
                }
            } else {
                d0Var = d0VarY;
                bVar = bVar2;
            }
        } else {
            d0Var = d0VarY;
            bVar = bVar2;
        }
        p0 p0Var3 = this.E;
        int i16 = p0Var3.f9322e;
        ExoPlaybackException exoPlaybackException = z17 ? null : p0Var3.f9323f;
        sa.r rVar = z18 ? sa.r.f158151d : p0Var3.f9325h;
        wa.m mVar = z18 ? this.f9890f : p0Var3.f9326i;
        List listOf = z18 ? ImmutableList.of() : p0Var3.f9327j;
        p0 p0Var4 = this.E;
        this.E = new p0(d0Var, bVar, j15, j14, i16, exoPlaybackException, false, rVar, mVar, listOf, bVar, p0Var4.f9329l, p0Var4.f9330m, p0Var4.f9331n, p0Var4.f9332o, j14, 0L, j14, 0L, false);
        if (z16) {
            h0 h0Var = this.f9905v;
            if (!h0Var.f8997q.isEmpty()) {
                h0Var.n(new ArrayList());
            }
            o0 o0Var = this.f9906w;
            HashMap<o0.c, o0.b> map = o0Var.f9298f;
            for (o0.b bVar5 : map.values()) {
                try {
                    bVar5.f9307a.b(bVar5.f9308b);
                } catch (RuntimeException e15) {
                    fa.k.d("Failed to release child source.", e15);
                }
                androidx.media3.exoplayer.source.j jVar = bVar5.f9307a;
                o0.a aVar = bVar5.f9309c;
                jVar.i(aVar);
                bVar5.f9307a.j(aVar);
            }
            map.clear();
            o0Var.f9299g.clear();
            o0Var.f9303k = false;
        }
    }

    public final void G() {
        f0 f0Var = this.f9905v.f8990j;
        this.T = f0Var != null && f0Var.f8945h.f8974h && this.P;
    }

    public final void H(long j8) {
        f0 f0Var = this.f9905v.f8990j;
        long j14 = j8 + (f0Var == null ? MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : f0Var.f8954q);
        this.N0 = j14;
        this.f9901p.f9185a.a(j14);
        for (t0 t0Var : this.f9885a) {
            if (s(t0Var)) {
                t0Var.resetPosition(this.N0);
            }
        }
        for (f0 f0Var2 = r0.f8990j; f0Var2 != null; f0Var2 = f0Var2.f8951n) {
            for (wa.g gVar : f0Var2.f8953p.f183757c) {
                if (gVar != null) {
                    gVar.onDiscontinuity();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0076 A[PHI: r3
      0x0076: PHI (r3v5 androidx.media3.common.d0) = (r3v1 androidx.media3.common.d0), (r3v9 androidx.media3.common.d0) binds: [B:17:0x0074, B:12:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public final void I(androidx.media3.common.d0 d0Var, androidx.media3.common.d0 d0Var2) {
        androidx.media3.common.d0 d0Var3;
        if (d0Var.p() && d0Var2.p()) {
            return;
        }
        ArrayList<c> arrayList = this.f9902q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = arrayList.get(size);
            int i14 = this.f9896k0;
            boolean z14 = this.H0;
            Object obj = cVar.f9921d;
            r0 r0Var = cVar.f9918a;
            androidx.media3.common.d0.c cVar2 = this.f9897l;
            androidx.media3.common.d0.b bVar = this.f9898m;
            boolean z15 = true;
            if (obj == null) {
                r0Var.getClass();
                Pair<Object, Long> pairJ = J(d0Var, new g(r0Var.f9348d, r0Var.f9352h, fa.z.O(C.TIME_UNSET)), false, i14, z14, cVar2, bVar);
                d0Var3 = d0Var;
                if (pairJ == null) {
                    z15 = false;
                } else {
                    int iB = d0Var3.b(pairJ.first);
                    long jLongValue = ((Long) pairJ.second).longValue();
                    Object obj2 = pairJ.first;
                    cVar.f9919b = iB;
                    cVar.f9920c = jLongValue;
                    cVar.f9921d = obj2;
                }
            } else {
                d0Var3 = d0Var;
                int iB2 = d0Var3.b(obj);
                if (iB2 == -1) {
                    z15 = false;
                } else {
                    r0Var.getClass();
                    cVar.f9919b = iB2;
                    d0Var2.g(cVar.f9921d, bVar);
                    if (bVar.f8192f && d0Var2.m(bVar.f8189c, cVar2, 0L).f8209n == d0Var2.b(cVar.f9921d)) {
                        Pair<Object, Long> pairI = d0Var3.i(cVar2, bVar, d0Var3.g(cVar.f9921d, bVar).f8189c, cVar.f9920c + bVar.f8191e);
                        int iB3 = d0Var3.b(pairI.first);
                        long jLongValue2 = ((Long) pairI.second).longValue();
                        Object obj3 = pairI.first;
                        cVar.f9919b = iB3;
                        cVar.f9920c = jLongValue2;
                        cVar.f9921d = obj3;
                    }
                }
            }
            if (!z15) {
                arrayList.get(size).f9918a.b(false);
                arrayList.remove(size);
            }
        }
        Collections.sort(arrayList);
    }

    public final void L(long j8) {
        int i14 = this.E.f9322e;
        boolean z14 = this.A;
        long jMin = (i14 != 3 || (!z14 && c0())) ? V0 : 1000L;
        if (z14 && c0()) {
            for (t0 t0Var : this.f9885a) {
                if (s(t0Var)) {
                    jMin = Math.min(jMin, fa.z.Y(t0Var.k(this.N0, this.O0)));
                }
            }
        }
        this.f9893i.b(j8 + jMin);
    }

    public final void M(boolean z14) throws ExoPlaybackException {
        androidx.media3.exoplayer.source.j.b bVar = this.f9905v.f8990j.f8945h.f8967a;
        long jO = O(bVar, this.E.f9336s, true, false);
        if (jO != this.E.f9336s) {
            p0 p0Var = this.E;
            this.E = q(bVar, jO, p0Var.f9320c, p0Var.f9321d, z14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1 A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:32:0x00af, B:34:0x00b3, B:35:0x00b6, B:37:0x00be, B:41:0x00cc, B:45:0x00d4), top: B:99:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af A[Catch: all -> 0x00a4, TRY_ENTER, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:32:0x00af, B:34:0x00b3, B:35:0x00b6, B:37:0x00be, B:41:0x00cc, B:45:0x00d4), top: B:99:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:32:0x00af, B:34:0x00b3, B:35:0x00b6, B:37:0x00be, B:41:0x00cc, B:45:0x00d4), top: B:99:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00be A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:32:0x00af, B:34:0x00b3, B:35:0x00b6, B:37:0x00be, B:41:0x00cc, B:45:0x00d4), top: B:99:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0118  */
    /* JADX WARN: Code duplicated, block: B:66:0x011a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0123  */
    /* JADX WARN: Code duplicated, block: B:71:0x0126  */
    /* JADX WARN: Code duplicated, block: B:75:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133  */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.media3.exoplayer.source.i, java.lang.Object] */
    public final void N(g gVar) throws Throwable {
        long jLongValue;
        androidx.media3.exoplayer.source.j.b bVarR;
        long j8;
        boolean z14;
        long j14;
        long j15;
        p0 p0Var;
        f0 f0Var;
        long jE;
        p0 p0Var2;
        int i14;
        long j16;
        androidx.media3.exoplayer.source.j.b bVar;
        int i15;
        long j17;
        boolean z15;
        h0 h0Var;
        boolean z16;
        long jO;
        boolean z17;
        androidx.media3.exoplayer.source.j.b bVar2;
        long j18;
        z zVar = this;
        zVar.F.a(1);
        Pair<Object, Long> pairJ = J(zVar.E.f9318a, gVar, true, zVar.f9896k0, zVar.H0, zVar.f9897l, zVar.f9898m);
        try {
            if (pairJ != null) {
                Object obj = pairJ.first;
                jLongValue = ((Long) pairJ.second).longValue();
                long j19 = gVar.f9935c == C.TIME_UNSET ? -9223372036854775807L : jLongValue;
                bVarR = zVar.f9905v.r(zVar.E.f9318a, obj, jLongValue);
                if (bVarR.b()) {
                    zVar.E.f9318a.g(bVarR.f9519a, zVar.f9898m);
                    jLongValue = zVar.f9898m.f(bVarR.f9520b) == bVarR.f9521c ? zVar.f9898m.f8193g.f8157c : 0L;
                    z14 = true;
                    j14 = j19;
                } else {
                    j8 = 0;
                    z14 = gVar.f9935c == C.TIME_UNSET;
                    j14 = j19;
                }
                if (zVar.E.f9318a.p()) {
                    p0Var = zVar.E;
                    if (pairJ == null) {
                        if (p0Var.f9322e != 1) {
                            zVar.b0(4);
                        }
                        zVar.F(false, true, false, true);
                    } else {
                        if (bVarR.equals(p0Var.f9319b)) {
                            try {
                                f0Var = zVar.f9905v.f8990j;
                                if (f0Var == null && f0Var.f8943f && jLongValue != j8) {
                                    jE = f0Var.f8938a.e(jLongValue, zVar.D);
                                } else {
                                    jE = jLongValue;
                                }
                                if (fa.z.Y(jE) != fa.z.Y(zVar.E.f9336s) && ((i14 = (p0Var2 = zVar.E).f9322e) == 2 || i14 == 3)) {
                                    j16 = p0Var2.f9336s;
                                    z14 = z14;
                                    bVar = bVarR;
                                    i15 = 2;
                                    j17 = j16;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bVarR = bVarR;
                                j15 = jLongValue;
                                zVar.E = zVar.q(bVarR, j15, j14, j15, z14, 2);
                                throw th;
                            }
                        } else {
                            jE = jLongValue;
                        }
                        try {
                            if (zVar.E.f9322e == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            h0Var = zVar.f9905v;
                            if (h0Var.f8990j != h0Var.f8991k) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            jO = zVar.O(bVarR, jE, z16, z15);
                            if (jLongValue != jO) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z14 |= z17;
                            try {
                                p0 p0Var3 = zVar.E;
                                bVar2 = bVarR;
                                try {
                                    androidx.media3.common.d0 d0Var = p0Var3.f9318a;
                                    j18 = j14;
                                    try {
                                        zVar.l0(d0Var, bVar2, d0Var, p0Var3.f9319b, j18, true);
                                        bVar = bVar2;
                                        j14 = j18;
                                        j16 = jO;
                                        i15 = 2;
                                        j17 = j16;
                                        zVar = this;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        bVarR = bVar2;
                                        j14 = j18;
                                        j15 = jO;
                                        zVar.E = zVar.q(bVarR, j15, j14, j15, z14, 2);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bVarR = bVar2;
                                    j14 = j14;
                                    j15 = jO;
                                    zVar.E = zVar.q(bVarR, j15, j14, j15, z14, 2);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            j14 = j14;
                            j15 = jLongValue;
                            zVar.E = zVar.q(bVarR, j15, j14, j15, z14, 2);
                            throw th;
                        }
                    }
                    zVar.E = zVar.q(bVar, j16, j14, j17, z14, i15);
                    return;
                }
                zVar.M0 = gVar;
                z14 = z14;
                bVar = bVarR;
                j16 = jLongValue;
                i15 = 2;
                j17 = j16;
                zVar = this;
                zVar.E = zVar.q(bVar, j16, j14, j17, z14, i15);
                return;
            }
            Pair<androidx.media3.exoplayer.source.j.b, Long> pairI = zVar.i(zVar.E.f9318a);
            bVarR = (androidx.media3.exoplayer.source.j.b) pairI.first;
            jLongValue = ((Long) pairI.second).longValue();
            z14 = !zVar.E.f9318a.p();
            j14 = -9223372036854775807L;
            if (zVar.E.f9318a.p()) {
                p0Var = zVar.E;
                if (pairJ == null) {
                    if (p0Var.f9322e != 1) {
                        zVar.b0(4);
                    }
                    zVar.F(false, true, false, true);
                } else {
                    if (bVarR.equals(p0Var.f9319b)) {
                        f0Var = zVar.f9905v.f8990j;
                        if (f0Var == null) {
                            jE = jLongValue;
                        } else {
                            jE = jLongValue;
                        }
                        if (fa.z.Y(jE) != fa.z.Y(zVar.E.f9336s)) {
                        }
                    } else {
                        jE = jLongValue;
                    }
                    if (zVar.E.f9322e == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    h0Var = zVar.f9905v;
                    if (h0Var.f8990j != h0Var.f8991k) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    jO = zVar.O(bVarR, jE, z16, z15);
                    if (jLongValue != jO) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z14 |= z17;
                    p0 p0Var4 = zVar.E;
                    bVar2 = bVarR;
                    androidx.media3.common.d0 d0Var2 = p0Var4.f9318a;
                    j18 = j14;
                    zVar.l0(d0Var2, bVar2, d0Var2, p0Var4.f9319b, j18, true);
                    bVar = bVar2;
                    j14 = j18;
                    j16 = jO;
                    i15 = 2;
                    j17 = j16;
                    zVar = this;
                }
                zVar.E = zVar.q(bVar, j16, j14, j17, z14, i15);
                return;
            }
            zVar.M0 = gVar;
            z14 = z14;
            bVar = bVarR;
            j16 = jLongValue;
            i15 = 2;
            j17 = j16;
            zVar = this;
            zVar.E = zVar.q(bVar, j16, j14, j17, z14, i15);
            return;
        } catch (Throwable th8) {
            th = th8;
        }
        j8 = 0;
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [androidx.media3.exoplayer.source.i, java.lang.Object] */
    public final long O(androidx.media3.exoplayer.source.j.b bVar, long j8, boolean z14, boolean z15) throws ExoPlaybackException {
        t0[] t0VarArr;
        g0();
        m0(false, true);
        if (z15 || this.E.f9322e == 3) {
            b0(2);
        }
        h0 h0Var = this.f9905v;
        f0 f0Var = h0Var.f8990j;
        f0 f0Var2 = f0Var;
        while (f0Var2 != null && !bVar.equals(f0Var2.f8945h.f8967a)) {
            f0Var2 = f0Var2.f8951n;
        }
        if (z14 || f0Var != f0Var2 || (f0Var2 != null && f0Var2.f8954q + j8 < 0)) {
            int i14 = 0;
            while (true) {
                t0VarArr = this.f9885a;
                if (i14 >= t0VarArr.length) {
                    break;
                }
                d(i14);
                i14++;
            }
            if (f0Var2 != null) {
                while (h0Var.f8990j != f0Var2) {
                    h0Var.a();
                }
                h0Var.o(f0Var2);
                f0Var2.f8954q = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
                f(new boolean[t0VarArr.length], h0Var.f8991k.e());
            }
        }
        if (f0Var2 != null) {
            ?? r14 = f0Var2.f8938a;
            h0Var.o(f0Var2);
            if (!f0Var2.f8943f) {
                f0Var2.f8945h = f0Var2.f8945h.b(j8);
            } else if (f0Var2.f8944g) {
                j8 = r14.seekToUs(j8);
                r14.discardBuffer(j8 - this.f9899n, this.f9900o);
            }
            H(j8);
            u();
        } else {
            h0Var.b();
            H(j8);
        }
        m(false);
        this.f9893i.sendEmptyMessage(2);
        return j8;
    }

    public final void P(r0 r0Var) {
        fa.i iVar = this.f9893i;
        if (r0Var.f9351g != this.f9895k) {
            iVar.obtainMessage(15, r0Var).b();
            return;
        }
        synchronized (r0Var) {
        }
        try {
            r0Var.f9345a.handleMessage(r0Var.f9349e, r0Var.f9350f);
            r0Var.b(true);
            int i14 = this.E.f9322e;
            if (i14 == 3 || i14 == 2) {
                iVar.sendEmptyMessage(2);
            }
        } catch (Throwable th3) {
            r0Var.b(true);
            throw th3;
        }
    }

    public final void Q(r0 r0Var) {
        Looper looper = r0Var.f9351g;
        if (looper.getThread().isAlive()) {
            this.f9903r.createHandler(looper, null).post(new a0.c(this, r0Var));
        } else {
            fa.k.g("Trying to send message on a dead thread.");
            r0Var.b(false);
        }
    }

    public final void S(boolean z14, AtomicBoolean atomicBoolean) {
        if (this.I0 != z14) {
            this.I0 = z14;
            if (!z14) {
                for (t0 t0Var : this.f9885a) {
                    if (!s(t0Var) && this.f9886b.remove(t0Var)) {
                        t0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void T(a aVar) throws Throwable {
        this.F.a(1);
        int i14 = aVar.f9912c;
        androidx.media3.exoplayer.source.t tVar = aVar.f9911b;
        List<o0.c> list = aVar.f9910a;
        if (i14 != -1) {
            this.M0 = new g(new s0(list, tVar), aVar.f9912c, aVar.f9913d);
        }
        o0 o0Var = this.f9906w;
        ArrayList arrayList = o0Var.f9294b;
        o0Var.g(0, arrayList.size());
        n(o0Var.a(arrayList.size(), list, tVar), false);
    }

    public final void U(boolean z14) throws ExoPlaybackException {
        this.P = z14;
        G();
        if (this.T) {
            h0 h0Var = this.f9905v;
            if (h0Var.f8991k != h0Var.f8990j) {
                M(true);
                m(false);
            }
        }
    }

    public final void V(boolean z14, int i14, boolean z15, int i15) {
        this.F.a(z15 ? 1 : 0);
        this.E = this.E.d(i15, i14, z14);
        m0(false, false);
        for (f0 f0Var = this.f9905v.f8990j; f0Var != null; f0Var = f0Var.f8951n) {
            for (wa.g gVar : f0Var.f8953p.f183757c) {
                if (gVar != null) {
                    gVar.onPlayWhenReadyChanged(z14);
                }
            }
        }
        if (!c0()) {
            g0();
            k0();
            return;
        }
        int i16 = this.E.f9322e;
        fa.i iVar = this.f9893i;
        if (i16 != 3) {
            if (i16 == 2) {
                iVar.sendEmptyMessage(2);
                return;
            }
            return;
        }
        k kVar = this.f9901p;
        kVar.f9190f = true;
        y0 y0Var = kVar.f9185a;
        if (!y0Var.f9881b) {
            y0Var.f9883d = y0Var.f9880a.elapsedRealtime();
            y0Var.f9881b = true;
        }
        e0();
        iVar.sendEmptyMessage(2);
    }

    public final void W(androidx.media3.common.y yVar) {
        this.f9893i.removeMessages(16);
        k kVar = this.f9901p;
        kVar.b(yVar);
        androidx.media3.common.y playbackParameters = kVar.getPlaybackParameters();
        p(playbackParameters, playbackParameters.f8584a, true, true);
    }

    public final void X(ExoPlayer.c cVar) {
        this.T0 = cVar;
        androidx.media3.common.d0 d0Var = this.E.f9318a;
        h0 h0Var = this.f9905v;
        h0Var.f8989i = cVar;
        h0Var.i(d0Var);
    }

    public final void Y(int i14) throws ExoPlaybackException {
        this.f9896k0 = i14;
        androidx.media3.common.d0 d0Var = this.E.f9318a;
        h0 h0Var = this.f9905v;
        h0Var.f8987g = i14;
        if (!h0Var.t(d0Var)) {
            M(true);
        }
        m(false);
    }

    public final void Z(boolean z14) throws ExoPlaybackException {
        this.H0 = z14;
        androidx.media3.common.d0 d0Var = this.E.f9318a;
        h0 h0Var = this.f9905v;
        h0Var.f8988h = z14;
        if (!h0Var.t(d0Var)) {
            M(true);
        }
        m(false);
    }

    @Override // androidx.media3.exoplayer.source.i.a
    public final void a(androidx.media3.exoplayer.source.i iVar) {
        this.f9893i.obtainMessage(8, iVar).b();
    }

    public final void a0(androidx.media3.exoplayer.source.t tVar) throws Throwable {
        this.F.a(1);
        o0 o0Var = this.f9906w;
        int size = o0Var.f9294b.size();
        if (tVar.getLength() != size) {
            tVar = tVar.cloneAndClear().cloneAndInsert(0, size);
        }
        o0Var.f9302j = tVar;
        n(o0Var.b(), false);
    }

    @Override // androidx.media3.exoplayer.source.s.a
    public final void b(androidx.media3.exoplayer.source.s sVar) {
        this.f9893i.obtainMessage(9, (androidx.media3.exoplayer.source.i) sVar).b();
    }

    public final void b0(int i14) {
        p0 p0Var = this.E;
        if (p0Var.f9322e != i14) {
            if (i14 != 2) {
                this.S0 = C.TIME_UNSET;
            }
            this.E = p0Var.g(i14);
        }
    }

    public final void c(a aVar, int i14) throws Throwable {
        this.F.a(1);
        o0 o0Var = this.f9906w;
        if (i14 == -1) {
            i14 = o0Var.f9294b.size();
        }
        n(o0Var.a(i14, aVar.f9910a, aVar.f9911b), false);
    }

    public final boolean c0() {
        p0 p0Var = this.E;
        return p0Var.f9329l && p0Var.f9331n == 0;
    }

    public final void d(int i14) {
        t0 t0Var = this.f9885a[i14];
        if (s(t0Var)) {
            y(i14, false);
            k kVar = this.f9901p;
            if (t0Var == kVar.f9187c) {
                kVar.f9188d = null;
                kVar.f9187c = null;
                kVar.f9189e = true;
            }
            if (t0Var.getState() == 2) {
                t0Var.stop();
            }
            t0Var.disable();
            this.L0--;
        }
    }

    public final boolean d0(androidx.media3.common.d0 d0Var, androidx.media3.exoplayer.source.j.b bVar) {
        if (bVar.b() || d0Var.p()) {
            return false;
        }
        int i14 = d0Var.g(bVar.f9519a, this.f9898m).f8189c;
        androidx.media3.common.d0.c cVar = this.f9897l;
        d0Var.n(i14, cVar);
        return cVar.a() && cVar.f8204i && cVar.f8201f != C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0279  */
    /* JADX WARN: Code duplicated, block: B:134:0x027d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0281  */
    /* JADX WARN: Code duplicated, block: B:139:0x0289  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:166:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:167:0x02df  */
    /* JADX WARN: Code duplicated, block: B:172:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:174:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:176:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:177:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:180:0x0300 A[LOOP:1: B:179:0x02fe->B:180:0x0300, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:183:0x0322 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x0335  */
    /* JADX WARN: Code duplicated, block: B:190:0x033b  */
    /* JADX WARN: Code duplicated, block: B:191:0x033f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0346  */
    /* JADX WARN: Code duplicated, block: B:212:0x0380  */
    /* JADX WARN: Code duplicated, block: B:215:0x039c  */
    /* JADX WARN: Code duplicated, block: B:217:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:222:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:225:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:229:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:231:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:237:0x0408  */
    /* JADX WARN: Code duplicated, block: B:240:0x0416  */
    /* JADX WARN: Code duplicated, block: B:321:0x052f  */
    /* JADX WARN: Code duplicated, block: B:349:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:359:0x0602  */
    /* JADX WARN: Code duplicated, block: B:361:0x0608  */
    /* JADX WARN: Code duplicated, block: B:363:0x0610  */
    /* JADX WARN: Code duplicated, block: B:365:0x0614  */
    /* JADX WARN: Code duplicated, block: B:371:0x0628  */
    /* JADX WARN: Code duplicated, block: B:380:0x0647  */
    /* JADX WARN: Code duplicated, block: B:383:0x064d  */
    /* JADX WARN: Code duplicated, block: B:396:0x0684  */
    /* JADX WARN: Code duplicated, block: B:398:0x0687  */
    /* JADX WARN: Code duplicated, block: B:399:0x068f  */
    /* JADX WARN: Code duplicated, block: B:401:0x069c  */
    /* JADX WARN: Code duplicated, block: B:402:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:409:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:416:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:419:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:421:0x072d  */
    /* JADX WARN: Code duplicated, block: B:437:0x0751  */
    /* JADX WARN: Code duplicated, block: B:439:0x0344 A[EDGE_INSN: B:439:0x0344->B:193:0x0344 BREAK  A[LOOP:0: B:159:0x02c5->B:192:0x0341], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x0341 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x0669 A[EDGE_INSN: B:462:0x0669->B:389:0x0669 BREAK  A[LOOP:5: B:381:0x0648->B:388:0x0666], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x0617 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x02ac A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0147  */
    /* JADX WARN: Code duplicated, block: B:63:0x0155  */
    /* JADX WARN: Code duplicated, block: B:66:0x0160 A[EDGE_INSN: B:66:0x0160->B:151:0x02af BREAK  A[LOOP:8: B:76:0x0176->B:93:0x01ad]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0164  */
    /* JADX WARN: Code duplicated, block: B:71:0x016c  */
    /* JADX WARN: Instruction removed from duplicated block: B:361:0x0608, please report this as an issue */
    /* JADX WARN: Type inference failed for: r1v60, types: [androidx.media3.exoplayer.source.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.media3.exoplayer.source.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v63, types: [androidx.media3.exoplayer.source.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v82, types: [androidx.media3.exoplayer.source.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v56, types: [androidx.media3.exoplayer.source.s, java.lang.Object] */
    public final void e() throws ExoPlaybackException {
        boolean z14;
        long j8;
        long j14;
        boolean z15;
        boolean z16;
        boolean z17;
        f0 f0Var;
        i iVar;
        long j15;
        long j16;
        int i14;
        boolean zF;
        boolean z18;
        long j17;
        fa.c cVar;
        boolean z19;
        p0 p0Var;
        boolean z24;
        int i15;
        int i16;
        t0[] t0VarArr;
        p0 p0Var2;
        long j18;
        boolean z25;
        t0[] t0VarArr2;
        f0 f0Var2;
        int i17;
        sa.n nVar;
        f0 f0Var3;
        h0 h0Var;
        boolean z26;
        boolean z27;
        f0 f0Var4;
        f0 f0Var5;
        f0 f0VarA;
        boolean z28;
        t0[] t0VarArr3;
        wa.m mVar;
        int i18;
        androidx.media3.exoplayer.source.j.b bVar;
        androidx.media3.exoplayer.source.j.b bVar2;
        wa.m mVar2;
        sa.n[] nVarArr;
        boolean z29;
        int i19;
        t0[] t0VarArr4;
        t0 t0Var;
        boolean z34;
        wa.g gVar;
        int length;
        androidx.media3.common.q[] qVarArr;
        int i24;
        boolean z35;
        long jUptimeMillis = this.f9903r.uptimeMillis();
        this.f9893i.removeMessages(2);
        boolean zP = this.E.f9318a.p();
        long j19 = C.TIME_UNSET;
        if (zP || !this.f9906w.f9303k) {
            z14 = true;
            j8 = -9223372036854775807L;
        } else {
            h0 h0Var2 = this.f9905v;
            long j24 = this.N0;
            f0 f0Var6 = h0Var2.f8992l;
            if (f0Var6 != null) {
                fa.a.d(f0Var6.f8951n == null);
                if (f0Var6.f8943f) {
                    f0Var6.f8938a.reevaluateBuffer(j24 - f0Var6.f8954q);
                }
            }
            h0 h0Var3 = this.f9905v;
            f0 f0Var7 = h0Var3.f8992l;
            if (f0Var7 == null || (!f0Var7.f8945h.f8975i && f0Var7.g() && h0Var3.f8992l.f8945h.f8971e != C.TIME_UNSET && h0Var3.f8994n < 100)) {
                h0 h0Var4 = this.f9905v;
                long j25 = this.N0;
                p0 p0Var3 = this.E;
                f0 f0Var8 = h0Var4.f8992l;
                g0 g0VarE = f0Var8 == null ? h0Var4.e(p0Var3.f9318a, p0Var3.f9319b, p0Var3.f9320c, p0Var3.f9336s) : h0Var4.d(p0Var3.f9318a, f0Var8, j25);
                if (g0VarE != null) {
                    h0 h0Var5 = this.f9905v;
                    f0 f0Var9 = h0Var5.f8992l;
                    long j26 = f0Var9 == null ? MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : (f0Var9.f8954q + f0Var9.f8945h.f8971e) - g0VarE.f8968b;
                    f0 f0VarP = h0Var5.p(g0VarE);
                    if (f0VarP == null) {
                        z zVar = (z) ((a73.j) h0Var5.f8985e).f1851b;
                        f0VarP = new f0(zVar.f9887c, j26, zVar.f9889e, zVar.f9891g.getAllocator(), zVar.f9906w, g0VarE, zVar.f9890f, zVar.T0.f8661a);
                    } else {
                        f0VarP.f8945h = g0VarE;
                        f0VarP.f8954q = j26;
                    }
                    f0 f0Var10 = h0Var5.f8992l;
                    if (f0Var10 == null) {
                        h0Var5.f8990j = f0VarP;
                        h0Var5.f8991k = f0VarP;
                    } else if (f0VarP != f0Var10.f8951n) {
                        f0Var10.b();
                        f0Var10.f8951n = f0VarP;
                        f0Var10.c();
                    }
                    h0Var5.f8995o = null;
                    h0Var5.f8992l = f0VarP;
                    h0Var5.f8994n++;
                    h0Var5.m();
                    if (!f0VarP.f8942e) {
                        long j27 = g0VarE.f8968b;
                        f0VarP.f8942e = true;
                        f0VarP.f8938a.c(this, j27);
                    } else if (f0VarP.f8943f) {
                        this.f9893i.obtainMessage(8, f0VarP.f8938a).b();
                    }
                    if (this.f9905v.f8990j == f0VarP) {
                        H(g0VarE.f8968b);
                    }
                    m(false);
                    z25 = true;
                }
                if (this.Z) {
                    this.Z = r(this.f9905v.f8992l);
                    h0();
                } else {
                    u();
                }
                t0VarArr2 = this.f9885a;
                h0 h0Var6 = this.f9905v;
                f0Var2 = h0Var6.f8991k;
                if (f0Var2 != null) {
                    z14 = true;
                    break;
                }
                if (f0Var2.f8951n == null && !this.T) {
                    if (!f0Var2.f8943f) {
                        z14 = true;
                        break;
                    }
                    int i25 = 0;
                    while (true) {
                        if (i25 >= t0VarArr2.length) {
                            f0 f0Var11 = f0Var2.f8951n;
                            if (f0Var11.f8943f || this.N0 >= f0Var11.e()) {
                                wa.m mVar3 = f0Var2.f8953p;
                                f0 f0Var12 = h0Var6.f8991k;
                                fa.a.f(f0Var12);
                                h0Var6.f8991k = f0Var12.f8951n;
                                h0Var6.m();
                                f0 f0Var13 = h0Var6.f8991k;
                                fa.a.f(f0Var13);
                                wa.m mVar4 = f0Var13.f8953p;
                                androidx.media3.common.d0 d0Var = this.E.f9318a;
                                z14 = true;
                                l0(d0Var, f0Var13.f8945h.f8967a, d0Var, f0Var2.f8945h.f8967a, C.TIME_UNSET, false);
                                if (f0Var13.f8943f && f0Var13.f8938a.readDiscontinuity() != j19) {
                                    long jE = f0Var13.e();
                                    for (t0 t0Var2 : t0VarArr2) {
                                        if (t0Var2.getStream() != null) {
                                            R(t0Var2, jE);
                                        }
                                    }
                                    if (!f0Var13.g()) {
                                        h0Var6.o(f0Var13);
                                        m(false);
                                        u();
                                        break;
                                    }
                                    break;
                                }
                                for (int i26 = 0; i26 < t0VarArr2.length; i26++) {
                                    boolean zB = mVar3.b(i26);
                                    boolean zB2 = mVar4.b(i26);
                                    if (zB && !t0VarArr2[i26].isCurrentStreamFinal()) {
                                        boolean z36 = ((androidx.media3.exoplayer.f) this.f9887c[i26]).f8922b == -2;
                                        v0 v0Var = mVar3.f183756b[i26];
                                        v0 v0Var2 = mVar4.f183756b[i26];
                                        if (!zB2 || !v0Var2.equals(v0Var) || z36) {
                                            R(t0VarArr2[i26], f0Var13.e());
                                        }
                                    }
                                }
                                break;
                            }
                        } else {
                            t0 t0Var3 = t0VarArr2[i25];
                            sa.n nVar2 = f0Var2.f8940c[i25];
                            if (t0Var3.getStream() == nVar2) {
                                if (nVar2 != null && !t0Var3.hasReadStreamToEnd()) {
                                    f0 f0Var14 = f0Var2.f8951n;
                                    if (!f0Var2.f8945h.f8972f || !f0Var14.f8943f || (!(t0Var3 instanceof va.g) && !(t0Var3 instanceof qa.c) && t0Var3.getReadingPositionUs() < f0Var14.e())) {
                                    }
                                }
                                i25++;
                            }
                        }
                        z14 = true;
                        break;
                    }
                }
                z14 = true;
                if (f0Var2.f8945h.f8975i || this.T) {
                    for (i17 = 0; i17 < t0VarArr2.length; i17++) {
                        t0 t0Var4 = t0VarArr2[i17];
                        nVar = f0Var2.f8940c[i17];
                        if (nVar == null && t0Var4.getStream() == nVar && t0Var4.hasReadStreamToEnd()) {
                            long j28 = f0Var2.f8945h.f8971e;
                            R(t0Var4, (j28 == j19 || j28 == Long.MIN_VALUE) ? j19 : f0Var2.f8954q + j28);
                        }
                    }
                }
                h0 h0Var7 = this.f9905v;
                f0Var3 = h0Var7.f8991k;
                if (f0Var3 != null && h0Var7.f8990j != f0Var3 && !f0Var3.f8946i) {
                    mVar2 = f0Var3.f8953p;
                    nVarArr = f0Var3.f8940c;
                    z29 = false;
                    i19 = 0;
                    while (true) {
                        t0VarArr4 = this.f9885a;
                        if (i19 < t0VarArr4.length) {
                            break;
                        }
                        t0Var = t0VarArr4[i19];
                        if (s(t0Var)) {
                            if (t0Var.getStream() != nVarArr[i19]) {
                                z34 = z14;
                            } else {
                                z34 = false;
                            }
                            if (mVar2.b(i19) || z34) {
                                if (!t0Var.isCurrentStreamFinal()) {
                                    gVar = mVar2.f183757c[i19];
                                    if (gVar != null) {
                                        length = gVar.length();
                                    } else {
                                        length = 0;
                                    }
                                    qVarArr = new androidx.media3.common.q[length];
                                    for (i24 = 0; i24 < length; i24++) {
                                        qVarArr[i24] = gVar.getFormat(i24);
                                    }
                                    t0Var.e(qVarArr, nVarArr[i19], f0Var3.e(), f0Var3.f8954q, f0Var3.f8945h.f8967a);
                                    z35 = this.K0;
                                    if (!z35 && z35) {
                                        this.K0 = false;
                                        if (this.E.f9333p) {
                                            this.f9893i.sendEmptyMessage(2);
                                        }
                                    }
                                } else if (t0Var.isEnded()) {
                                    d(i19);
                                } else {
                                    z29 = z14;
                                }
                            }
                        }
                        i19++;
                    }
                    if (!z29) {
                        f(new boolean[t0VarArr4.length], this.f9905v.f8991k.e());
                    }
                }
                h0Var = this.f9905v;
                z26 = false;
                while (c0() && !this.T && (f0Var4 = h0Var.f8990j) != null && (f0Var5 = f0Var4.f8951n) != null && this.N0 >= f0Var5.e() && f0Var5.f8946i) {
                    if (z26) {
                        w();
                    }
                    f0VarA = h0Var.a();
                    f0VarA.getClass();
                    if (this.E.f9319b.f9519a.equals(f0VarA.f8945h.f8967a.f9519a)) {
                        bVar = this.E.f9319b;
                        if (bVar.f9520b == -1) {
                            bVar2 = f0VarA.f8945h.f8967a;
                            if (bVar2.f9520b == -1 || bVar.f9523e == bVar2.f9523e) {
                                z28 = false;
                            } else {
                                z28 = z14;
                            }
                        } else {
                            z28 = false;
                        }
                    } else {
                        z28 = false;
                    }
                    g0 g0Var = f0VarA.f8945h;
                    androidx.media3.exoplayer.source.j.b bVar3 = g0Var.f8967a;
                    boolean z37 = z28;
                    long j29 = g0Var.f8968b;
                    boolean z38 = z25;
                    long j34 = j19;
                    this.E = q(bVar3, j29, g0Var.f8969c, j29, !z37, 0);
                    G();
                    k0();
                    if (this.E.f9322e == 3) {
                        e0();
                    }
                    t0VarArr3 = this.f9885a;
                    mVar = h0Var.f8990j.f8953p;
                    for (i18 = 0; i18 < t0VarArr3.length; i18++) {
                        if (mVar.b(i18)) {
                            t0VarArr3[i18].c();
                        }
                    }
                    j19 = j34;
                    z25 = z38;
                    z26 = z14;
                }
                z27 = z25;
                j8 = j19;
                if (this.T0.f8661a != j8) {
                    if (z27 || !this.E.f9318a.equals(this.U0)) {
                        androidx.media3.common.d0 d0Var2 = this.E.f9318a;
                        this.U0 = d0Var2;
                        this.f9905v.i(d0Var2);
                    }
                    v();
                }
            } else {
                j19 = -9223372036854775807L;
            }
            z25 = false;
            if (this.Z) {
                this.Z = r(this.f9905v.f8992l);
                h0();
            } else {
                u();
            }
            t0VarArr2 = this.f9885a;
            h0 h0Var8 = this.f9905v;
            f0Var2 = h0Var8.f8991k;
            if (f0Var2 != null) {
                z14 = true;
                break;
            }
            if (f0Var2.f8951n == null) {
                z14 = true;
                if (f0Var2.f8945h.f8975i) {
                    while (i17 < t0VarArr2.length) {
                        t0 t0Var5 = t0VarArr2[i17];
                        nVar = f0Var2.f8940c[i17];
                        if (nVar == null) {
                        }
                    }
                } else {
                    while (i17 < t0VarArr2.length) {
                        t0 t0Var6 = t0VarArr2[i17];
                        nVar = f0Var2.f8940c[i17];
                        if (nVar == null) {
                        }
                    }
                }
            } else {
                z14 = true;
                if (f0Var2.f8945h.f8975i) {
                    while (i17 < t0VarArr2.length) {
                        t0 t0Var7 = t0VarArr2[i17];
                        nVar = f0Var2.f8940c[i17];
                        if (nVar == null) {
                        }
                    }
                } else {
                    while (i17 < t0VarArr2.length) {
                        t0 t0Var8 = t0VarArr2[i17];
                        nVar = f0Var2.f8940c[i17];
                        if (nVar == null) {
                        }
                    }
                }
            }
            h0 h0Var9 = this.f9905v;
            f0Var3 = h0Var9.f8991k;
            if (f0Var3 != null) {
                mVar2 = f0Var3.f8953p;
                nVarArr = f0Var3.f8940c;
                z29 = false;
                i19 = 0;
                while (true) {
                    t0VarArr4 = this.f9885a;
                    if (i19 < t0VarArr4.length) {
                        break;
                        break;
                    }
                    t0Var = t0VarArr4[i19];
                    if (s(t0Var)) {
                        if (t0Var.getStream() != nVarArr[i19]) {
                            z34 = z14;
                        } else {
                            z34 = false;
                        }
                        if (mVar2.b(i19)) {
                            if (!t0Var.isCurrentStreamFinal()) {
                                gVar = mVar2.f183757c[i19];
                                if (gVar != null) {
                                    length = gVar.length();
                                } else {
                                    length = 0;
                                }
                                qVarArr = new androidx.media3.common.q[length];
                                while (i24 < length) {
                                    qVarArr[i24] = gVar.getFormat(i24);
                                }
                                t0Var.e(qVarArr, nVarArr[i19], f0Var3.e(), f0Var3.f8954q, f0Var3.f8945h.f8967a);
                                z35 = this.K0;
                                if (!z35) {
                                }
                            } else if (t0Var.isEnded()) {
                                d(i19);
                            } else {
                                z29 = z14;
                            }
                        } else if (!t0Var.isCurrentStreamFinal()) {
                            gVar = mVar2.f183757c[i19];
                            if (gVar != null) {
                                length = gVar.length();
                            } else {
                                length = 0;
                            }
                            qVarArr = new androidx.media3.common.q[length];
                            while (i24 < length) {
                                qVarArr[i24] = gVar.getFormat(i24);
                            }
                            t0Var.e(qVarArr, nVarArr[i19], f0Var3.e(), f0Var3.f8954q, f0Var3.f8945h.f8967a);
                            z35 = this.K0;
                            if (!z35) {
                            }
                        } else if (t0Var.isEnded()) {
                            d(i19);
                        } else {
                            z29 = z14;
                        }
                    }
                    i19++;
                }
                if (!z29) {
                    f(new boolean[t0VarArr4.length], this.f9905v.f8991k.e());
                }
            }
            h0Var = this.f9905v;
            z26 = false;
            while (c0()) {
                if (z26) {
                    w();
                }
                f0VarA = h0Var.a();
                f0VarA.getClass();
                if (this.E.f9319b.f9519a.equals(f0VarA.f8945h.f8967a.f9519a)) {
                    bVar = this.E.f9319b;
                    if (bVar.f9520b == -1) {
                        bVar2 = f0VarA.f8945h.f8967a;
                        if (bVar2.f9520b == -1) {
                            z28 = false;
                        } else {
                            z28 = false;
                        }
                    } else {
                        z28 = false;
                    }
                } else {
                    z28 = false;
                }
                g0 g0Var2 = f0VarA.f8945h;
                androidx.media3.exoplayer.source.j.b bVar4 = g0Var2.f8967a;
                boolean z39 = z28;
                long j210 = g0Var2.f8968b;
                boolean z310 = z25;
                long j35 = j19;
                this.E = q(bVar4, j210, g0Var2.f8969c, j210, !z39, 0);
                G();
                k0();
                if (this.E.f9322e == 3) {
                    e0();
                }
                t0VarArr3 = this.f9885a;
                mVar = h0Var.f8990j.f8953p;
                while (i18 < t0VarArr3.length) {
                    if (mVar.b(i18)) {
                        t0VarArr3[i18].c();
                    }
                }
                j19 = j35;
                z25 = z310;
                z26 = z14;
            }
            z27 = z25;
            j8 = j19;
            if (this.T0.f8661a != j8) {
                if (z27) {
                    androidx.media3.common.d0 d0Var3 = this.E.f9318a;
                    this.U0 = d0Var3;
                    this.f9905v.i(d0Var3);
                } else {
                    androidx.media3.common.d0 d0Var4 = this.E.f9318a;
                    this.U0 = d0Var4;
                    this.f9905v.i(d0Var4);
                }
                v();
            }
        }
        int i27 = this.E.f9322e;
        if (i27 == z14 || i27 == 4) {
            return;
        }
        f0 f0Var15 = this.f9905v.f8990j;
        if (f0Var15 == null) {
            L(jUptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        k0();
        if (f0Var15.f8943f) {
            this.O0 = fa.z.O(this.f9903r.elapsedRealtime());
            f0Var15.f8938a.discardBuffer(this.E.f9336s - this.f9899n, this.f9900o);
            z15 = true;
            z16 = true;
            int i28 = 0;
            while (true) {
                t0[] t0VarArr5 = this.f9885a;
                if (i28 >= t0VarArr5.length) {
                    break;
                }
                t0 t0Var9 = t0VarArr5[i28];
                if (s(t0Var9)) {
                    j18 = j8;
                    t0Var9.render(this.N0, this.O0);
                    z15 = z15 && t0Var9.isEnded();
                    boolean z44 = f0Var15.f8940c[i28] != t0Var9.getStream();
                    boolean z45 = z44 || (!z44 && t0Var9.hasReadStreamToEnd()) || t0Var9.isReady() || t0Var9.isEnded();
                    y(i28, z45);
                    z16 = z16 && z45;
                    if (!z45) {
                        x(i28);
                    }
                } else {
                    y(i28, false);
                    j18 = j8;
                }
                i28++;
                j8 = j18;
            }
            j14 = j8;
        } else {
            j14 = j8;
            f0Var15.f8938a.maybeThrowPrepareError();
            z15 = true;
            z16 = true;
        }
        long j36 = f0Var15.f8945h.f8971e;
        boolean z46 = z15 && f0Var15.f8943f && (j36 == j14 || j36 <= this.E.f9336s);
        if (z46 && this.T) {
            this.T = false;
            V(false, this.E.f9331n, false, 5);
        }
        if (!z46 || !f0Var15.f8945h.f8975i) {
            p0 p0Var4 = this.E;
            if (p0Var4.f9322e == 2) {
                h0 h0Var10 = this.f9905v;
                if (this.L0 == 0) {
                    zF = t();
                } else if (!z16) {
                    zF = false;
                } else if (p0Var4.f9324g) {
                    f0 f0Var16 = h0Var10.f8990j;
                    long j37 = d0(p0Var4.f9318a, f0Var16.f8945h.f8967a) ? ((i) this.f9907x).f9160m : j14;
                    f0 f0Var17 = h0Var10.f8992l;
                    boolean z47 = f0Var17.g() && f0Var17.f8945h.f8975i;
                    boolean z48 = f0Var17.f8945h.f8967a.b() && !f0Var17.f8943f;
                    if (z47 || z48) {
                        zF = true;
                    } else {
                        zF = this.f9891g.f(new c0.a(this.f9909z, this.E.f9318a, f0Var16.f8945h.f8967a, this.N0 - f0Var16.f8954q, j(f0Var17.d()), this.f9901p.getPlaybackParameters().f8584a, this.E.f9329l, this.X, j37));
                    }
                } else {
                    zF = true;
                }
                if (zF) {
                    b0(3);
                    this.R0 = null;
                    if (c0()) {
                        m0(false, false);
                        k kVar = this.f9901p;
                        z17 = true;
                        kVar.f9190f = true;
                        y0 y0Var = kVar.f9185a;
                        if (!y0Var.f9881b) {
                            y0Var.f9883d = y0Var.f9880a.elapsedRealtime();
                            y0Var.f9881b = true;
                        }
                        e0();
                    }
                } else {
                    z17 = true;
                    if (this.E.f9322e == 3 && (this.L0 != 0 ? !z16 : !t())) {
                        m0(c0(), false);
                        b0(2);
                        if (this.X) {
                            for (f0Var = this.f9905v.f8990j; f0Var != null; f0Var = f0Var.f8951n) {
                                for (wa.g gVar2 : f0Var.f8953p.f183757c) {
                                    if (gVar2 != null) {
                                        gVar2.onRebuffer();
                                    }
                                }
                            }
                            iVar = (i) this.f9907x;
                            j15 = iVar.f9160m;
                            if (j15 != j14) {
                                long j38 = j15 + iVar.f9153f;
                                iVar.f9160m = j38;
                                j16 = iVar.f9159l;
                                if (j16 != j14 && j38 > j16) {
                                    iVar.f9160m = j16;
                                }
                                iVar.f9164q = j14;
                            }
                        }
                        g0();
                    }
                }
            } else {
                z17 = true;
                if (this.E.f9322e == 3) {
                    m0(c0(), false);
                    b0(2);
                    if (this.X) {
                        while (f0Var != null) {
                            while (i14 < r6) {
                                if (gVar2 != null) {
                                    gVar2.onRebuffer();
                                }
                            }
                        }
                        iVar = (i) this.f9907x;
                        j15 = iVar.f9160m;
                        if (j15 != j14) {
                            long j39 = j15 + iVar.f9153f;
                            iVar.f9160m = j39;
                            j16 = iVar.f9159l;
                            if (j16 != j14) {
                                iVar.f9160m = j16;
                            }
                            iVar.f9164q = j14;
                        }
                    }
                    g0();
                }
            }
            if (this.E.f9322e == 2) {
                i16 = 0;
                while (true) {
                    t0VarArr = this.f9885a;
                    if (i16 < t0VarArr.length) {
                        break;
                    }
                    if (!s(t0VarArr[i16]) && this.f9885a[i16].getStream() == f0Var15.f8940c[i16]) {
                        x(i16);
                    }
                    i16++;
                }
                p0Var2 = this.E;
                if (p0Var2.f9324g && p0Var2.f9335r < 500000 && r(this.f9905v.f8992l)) {
                    z18 = z17;
                } else {
                    z18 = false;
                }
            } else {
                z18 = false;
            }
            if (z18) {
                j17 = this.S0;
                cVar = this.f9903r;
                if (j17 == C.TIME_UNSET) {
                    this.S0 = cVar.elapsedRealtime();
                } else if (cVar.elapsedRealtime() - this.S0 >= 4000) {
                    vb.h.z("Playback stuck buffering and not loading");
                    return;
                }
            } else {
                this.S0 = C.TIME_UNSET;
            }
            if (c0() || this.E.f9322e != 3) {
                z19 = false;
            } else {
                z19 = z17;
            }
            if (this.K0 || !this.J0 || !z19) {
                z17 = false;
            }
            p0Var = this.E;
            if (p0Var.f9333p != z17) {
                z24 = z17;
                this.E = new p0(p0Var.f9318a, p0Var.f9319b, p0Var.f9320c, p0Var.f9321d, p0Var.f9322e, p0Var.f9323f, p0Var.f9324g, p0Var.f9325h, p0Var.f9326i, p0Var.f9327j, p0Var.f9328k, p0Var.f9329l, p0Var.f9330m, p0Var.f9331n, p0Var.f9332o, p0Var.f9334q, p0Var.f9335r, p0Var.f9336s, p0Var.f9337t, z24);
            } else {
                z24 = z17;
            }
            this.J0 = false;
            if (!z24 && (i15 = this.E.f9322e) != 4 && (z19 || i15 == 2 || (i15 == 3 && this.L0 != 0))) {
                L(jUptimeMillis);
            }
            Trace.endSection();
        }
        b0(4);
        g0();
        z17 = true;
        if (this.E.f9322e == 2) {
            i16 = 0;
            while (true) {
                t0VarArr = this.f9885a;
                if (i16 < t0VarArr.length) {
                    break;
                    break;
                } else {
                    if (!s(t0VarArr[i16])) {
                    }
                    i16++;
                }
            }
            p0Var2 = this.E;
            if (p0Var2.f9324g) {
                z18 = false;
            } else {
                z18 = false;
            }
        } else {
            z18 = false;
        }
        if (z18) {
            this.S0 = C.TIME_UNSET;
        } else {
            j17 = this.S0;
            cVar = this.f9903r;
            if (j17 == C.TIME_UNSET) {
                this.S0 = cVar.elapsedRealtime();
            } else if (cVar.elapsedRealtime() - this.S0 >= 4000) {
                vb.h.z("Playback stuck buffering and not loading");
                return;
            }
        }
        if (c0()) {
            z19 = false;
        } else {
            z19 = false;
        }
        if (this.K0) {
            z17 = false;
        } else {
            z17 = false;
        }
        p0Var = this.E;
        if (p0Var.f9333p != z17) {
            z24 = z17;
            this.E = new p0(p0Var.f9318a, p0Var.f9319b, p0Var.f9320c, p0Var.f9321d, p0Var.f9322e, p0Var.f9323f, p0Var.f9324g, p0Var.f9325h, p0Var.f9326i, p0Var.f9327j, p0Var.f9328k, p0Var.f9329l, p0Var.f9330m, p0Var.f9331n, p0Var.f9332o, p0Var.f9334q, p0Var.f9335r, p0Var.f9336s, p0Var.f9337t, z24);
        } else {
            z24 = z17;
        }
        this.J0 = false;
        if (!z24) {
            L(jUptimeMillis);
        }
        Trace.endSection();
    }

    public final void e0() {
        f0 f0Var = this.f9905v.f8990j;
        if (f0Var == null) {
            return;
        }
        wa.m mVar = f0Var.f8953p;
        int i14 = 0;
        while (true) {
            t0[] t0VarArr = this.f9885a;
            if (i14 >= t0VarArr.length) {
                return;
            }
            if (mVar.b(i14) && t0VarArr[i14].getState() == 1) {
                t0VarArr[i14].start();
            }
            i14++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e0  */
    public final void f(boolean[] zArr, long j8) throws ExoPlaybackException {
        t0[] t0VarArr;
        Set<t0> set;
        wa.m mVar;
        e0 e0Var;
        h0 h0Var = this.f9905v;
        f0 f0Var = h0Var.f8991k;
        wa.m mVar2 = f0Var.f8953p;
        int i14 = 0;
        while (true) {
            t0VarArr = this.f9885a;
            int length = t0VarArr.length;
            set = this.f9886b;
            if (i14 >= length) {
                break;
            }
            if (!mVar2.b(i14) && set.remove(t0VarArr[i14])) {
                t0VarArr[i14].reset();
            }
            i14++;
        }
        int i15 = 0;
        while (i15 < t0VarArr.length) {
            if (mVar2.b(i15)) {
                boolean z14 = zArr[i15];
                t0 t0Var = t0VarArr[i15];
                if (s(t0Var)) {
                    mVar = mVar2;
                } else {
                    f0 f0Var2 = h0Var.f8991k;
                    boolean z15 = f0Var2 == h0Var.f8990j;
                    wa.m mVar3 = f0Var2.f8953p;
                    v0 v0Var = mVar3.f183756b[i15];
                    wa.g gVar = mVar3.f183757c[i15];
                    int length2 = gVar != null ? gVar.length() : 0;
                    androidx.media3.common.q[] qVarArr = new androidx.media3.common.q[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        qVarArr[i16] = gVar.getFormat(i16);
                    }
                    boolean z16 = c0() && this.E.f9322e == 3;
                    boolean z17 = !z14 && z16;
                    this.L0++;
                    set.add(t0Var);
                    mVar = mVar2;
                    t0Var.g(v0Var, qVarArr, f0Var2.f8940c[i15], z17, z15, j8, f0Var2.f8954q, f0Var2.f8945h.f8967a);
                    t0Var.handleMessage(11, new y(this));
                    k kVar = this.f9901p;
                    kVar.getClass();
                    e0 mediaClock = t0Var.getMediaClock();
                    if (mediaClock != null && mediaClock != (e0Var = kVar.f9188d)) {
                        if (e0Var != null) {
                            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        kVar.f9188d = mediaClock;
                        kVar.f9187c = t0Var;
                        ((androidx.media3.exoplayer.audio.f) mediaClock).b(kVar.f9185a.f9884e);
                    }
                    if (z16 && z15) {
                        t0Var.start();
                    }
                }
            } else {
                mVar = mVar2;
            }
            i15++;
            mVar2 = mVar;
        }
        f0Var.f8946i = true;
    }

    public final void f0(boolean z14, boolean z15) {
        F(z14 || !this.I0, false, true, false);
        this.F.a(z15 ? 1 : 0);
        this.f9891g.e(this.f9909z);
        b0(1);
    }

    public final long g(androidx.media3.common.d0 d0Var, Object obj, long j8) {
        androidx.media3.common.d0.b bVar = this.f9898m;
        int i14 = d0Var.g(obj, bVar).f8189c;
        androidx.media3.common.d0.c cVar = this.f9897l;
        d0Var.n(i14, cVar);
        if (cVar.f8201f == C.TIME_UNSET || !cVar.a() || !cVar.f8204i) {
            return C.TIME_UNSET;
        }
        long j14 = cVar.f8202g;
        return fa.z.O((j14 == C.TIME_UNSET ? System.currentTimeMillis() : j14 + SystemClock.elapsedRealtime()) - cVar.f8201f) - (j8 + bVar.f8191e);
    }

    public final void g0() {
        k kVar = this.f9901p;
        kVar.f9190f = false;
        y0 y0Var = kVar.f9185a;
        if (y0Var.f9881b) {
            y0Var.a(y0Var.getPositionUs());
            y0Var.f9881b = false;
        }
        for (t0 t0Var : this.f9885a) {
            if (s(t0Var) && t0Var.getState() == 2) {
                t0Var.stop();
            }
        }
    }

    public final long h() {
        f0 f0Var = this.f9905v.f8991k;
        if (f0Var == null) {
            return 0L;
        }
        long jMax = f0Var.f8954q;
        if (!f0Var.f8943f) {
            return jMax;
        }
        int i14 = 0;
        while (true) {
            t0[] t0VarArr = this.f9885a;
            if (i14 >= t0VarArr.length) {
                return jMax;
            }
            if (s(t0VarArr[i14]) && t0VarArr[i14].getStream() == f0Var.f8940c[i14]) {
                long readingPositionUs = t0VarArr[i14].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(readingPositionUs, jMax);
            }
            i14++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.media3.exoplayer.source.s, java.lang.Object] */
    public final void h0() {
        f0 f0Var = this.f9905v.f8992l;
        boolean z14 = this.Z || (f0Var != null && f0Var.f8938a.isLoading());
        p0 p0Var = this.E;
        if (z14 != p0Var.f9324g) {
            this.E = new p0(p0Var.f9318a, p0Var.f9319b, p0Var.f9320c, p0Var.f9321d, p0Var.f9322e, p0Var.f9323f, z14, p0Var.f9325h, p0Var.f9326i, p0Var.f9327j, p0Var.f9328k, p0Var.f9329l, p0Var.f9330m, p0Var.f9331n, p0Var.f9332o, p0Var.f9334q, p0Var.f9335r, p0Var.f9336s, p0Var.f9337t, p0Var.f9333p);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        f0 f0Var;
        int i14;
        f0 f0Var2;
        int i15;
        int i16 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z14 = message.arg1 != 0;
                    int i17 = message.arg2;
                    V(z14, i17 >> 4, true, i17 & 15);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    N((g) message.obj);
                    break;
                case 4:
                    W((androidx.media3.common.y) message.obj);
                    break;
                case 5:
                    this.D = (x0) message.obj;
                    break;
                case 6:
                    f0(false, true);
                    break;
                case 7:
                    C();
                    return true;
                case 8:
                    o((androidx.media3.exoplayer.source.i) message.obj);
                    break;
                case 9:
                    k((androidx.media3.exoplayer.source.i) message.obj);
                    break;
                case 10:
                    E();
                    break;
                case 11:
                    Y(message.arg1);
                    break;
                case 12:
                    Z(message.arg1 != 0);
                    break;
                case 13:
                    S(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    r0 r0Var = (r0) message.obj;
                    r0Var.getClass();
                    P(r0Var);
                    break;
                case 15:
                    Q((r0) message.obj);
                    break;
                case 16:
                    androidx.media3.common.y yVar = (androidx.media3.common.y) message.obj;
                    p(yVar, yVar.f8584a, true, false);
                    break;
                case 17:
                    T((a) message.obj);
                    break;
                case 18:
                    c((a) message.obj, message.arg1);
                    break;
                case 19:
                    A((b) message.obj);
                    break;
                case 20:
                    D(message.arg1, message.arg2, (androidx.media3.exoplayer.source.t) message.obj);
                    break;
                case 21:
                    a0((androidx.media3.exoplayer.source.t) message.obj);
                    break;
                case 22:
                    z();
                    break;
                case 23:
                    U(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    E();
                    M(true);
                    break;
                case 26:
                    E();
                    M(true);
                    break;
                case 27:
                    j0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    X((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    B();
                    break;
            }
        } catch (ParserException e4) {
            int i18 = e4.dataType;
            if (i18 == 1) {
                i15 = e4.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i18 == 4) {
                    i15 = e4.contentIsMalformed ? 3002 : 3004;
                }
                l(e4, i16);
            }
            i16 = i15;
            l(e4, i16);
        } catch (DataSourceException e14) {
            l(e14, e14.reason);
        } catch (ExoPlaybackException e15) {
            e = e15;
            int i19 = e.type;
            h0 h0Var = this.f9905v;
            if (i19 == 1 && (f0Var2 = h0Var.f8991k) != null) {
                e = e.copyWithMediaPeriodId(f0Var2.f8945h.f8967a);
            }
            if (e.isRecoverable && (this.R0 == null || (i14 = e.errorCode) == 5004 || i14 == 5003)) {
                fa.k.h("Recoverable renderer error", e);
                ExoPlaybackException exoPlaybackException = this.R0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.R0;
                } else {
                    this.R0 = e;
                }
                fa.i iVar = this.f9893i;
                iVar.d(iVar.obtainMessage(25, e));
            } else {
                ExoPlaybackException exoPlaybackException2 = this.R0;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(e);
                    e = this.R0;
                }
                fa.k.d("Playback error", e);
                if (e.type == 1 && h0Var.f8990j != h0Var.f8991k) {
                    while (true) {
                        f0Var = h0Var.f8990j;
                        if (f0Var == h0Var.f8991k) {
                            break;
                        }
                        h0Var.a();
                    }
                    f0Var.getClass();
                    w();
                    g0 g0Var = f0Var.f8945h;
                    androidx.media3.exoplayer.source.j.b bVar = g0Var.f8967a;
                    long j8 = g0Var.f8968b;
                    this.E = q(bVar, j8, g0Var.f8969c, j8, true, 0);
                }
                f0(true, false);
                this.E = this.E.e(e);
            }
        } catch (DrmSession.DrmSessionException e16) {
            l(e16, e16.errorCode);
        } catch (BehindLiveWindowException e17) {
            l(e17, 1002);
        } catch (IOException e18) {
            l(e18, 2000);
        } catch (RuntimeException e19) {
            ExoPlaybackException exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForUnexpected(e19, ((e19 instanceof IllegalStateException) || (e19 instanceof IllegalArgumentException)) ? 1004 : 1000);
            fa.k.d("Playback error", exoPlaybackExceptionCreateForUnexpected);
            f0(true, false);
            this.E = this.E.e(exoPlaybackExceptionCreateForUnexpected);
        }
        w();
        return true;
    }

    public final Pair<androidx.media3.exoplayer.source.j.b, Long> i(androidx.media3.common.d0 d0Var) {
        if (d0Var.p()) {
            return Pair.create(p0.f9317u, 0L);
        }
        Pair<Object, Long> pairI = d0Var.i(this.f9897l, this.f9898m, d0Var.a(this.H0), C.TIME_UNSET);
        androidx.media3.exoplayer.source.j.b bVarR = this.f9905v.r(d0Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (bVarR.b()) {
            Object obj = bVarR.f9519a;
            androidx.media3.common.d0.b bVar = this.f9898m;
            d0Var.g(obj, bVar);
            jLongValue = bVarR.f9521c == bVar.f(bVarR.f9520b) ? bVar.f8193g.f8157c : 0L;
        }
        return Pair.create(bVarR, Long.valueOf(jLongValue));
    }

    public final void i0(androidx.media3.exoplayer.source.j.b bVar, sa.r rVar, wa.m mVar) {
        h0 h0Var = this.f9905v;
        f0 f0Var = h0Var.f8992l;
        f0Var.getClass();
        f0 f0Var2 = h0Var.f8990j;
        long j8 = this.N0;
        long j14 = f0Var.f8954q;
        if (f0Var != f0Var2) {
            j8 -= j14;
            j14 = f0Var.f8945h.f8968b;
        }
        this.f9891g.d(new c0.a(this.f9909z, this.E.f9318a, bVar, j8 - j14, j(f0Var.d()), this.f9901p.getPlaybackParameters().f8584a, this.E.f9329l, this.X, d0(this.E.f9318a, f0Var.f8945h.f8967a) ? ((i) this.f9907x).f9160m : C.TIME_UNSET), mVar.f183757c);
    }

    public final long j(long j8) {
        f0 f0Var = this.f9905v.f8992l;
        if (f0Var == null) {
            return 0L;
        }
        return Math.max(0L, j8 - (this.N0 - f0Var.f8954q));
    }

    public final void j0(int i14, int i15, List<androidx.media3.common.t> list) throws Throwable {
        this.F.a(1);
        o0 o0Var = this.f9906w;
        o0Var.getClass();
        ArrayList arrayList = o0Var.f9294b;
        fa.a.a(i14 >= 0 && i14 <= i15 && i15 <= arrayList.size());
        fa.a.a(list.size() == i15 - i14);
        for (int i16 = i14; i16 < i15; i16++) {
            ((o0.c) arrayList.get(i16)).f9310a.k(list.get(i16 - i14));
        }
        n(o0Var.b(), false);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.media3.exoplayer.source.s, java.lang.Object] */
    public final void k(androidx.media3.exoplayer.source.i iVar) {
        h0 h0Var = this.f9905v;
        f0 f0Var = h0Var.f8992l;
        if (f0Var == null || f0Var.f8938a != iVar) {
            f0 f0Var2 = h0Var.f8993m;
            if (f0Var2 == null || f0Var2.f8938a != iVar) {
                return;
            }
            v();
            return;
        }
        long j8 = this.N0;
        if (f0Var != null) {
            fa.a.d(f0Var.f8951n == null);
            if (f0Var.f8943f) {
                f0Var.f8938a.reevaluateBuffer(j8 - f0Var.f8954q);
            }
        }
        u();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v55, types: [androidx.media3.exoplayer.source.i, java.lang.Object] */
    public final void k0() {
        long j8;
        ?? r14;
        androidx.media3.common.y playbackParameters;
        f0 f0Var = this.f9905v.f8990j;
        if (f0Var == null) {
            return;
        }
        long discontinuity = f0Var.f8943f ? f0Var.f8938a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != C.TIME_UNSET) {
            if (!f0Var.g()) {
                this.f9905v.o(f0Var);
                m(false);
                u();
            }
            H(discontinuity);
            if (discontinuity != this.E.f9336s) {
                p0 p0Var = this.E;
                androidx.media3.exoplayer.source.j.b bVar = p0Var.f9319b;
                long j14 = p0Var.f9320c;
                r14 = 0;
                this.E = q(bVar, discontinuity, j14, discontinuity, true, 5);
            } else {
                r14 = 0;
            }
        } else {
            k kVar = this.f9901p;
            boolean z14 = f0Var != this.f9905v.f8991k;
            y0 y0Var = kVar.f9185a;
            t0 t0Var = kVar.f9187c;
            if (t0Var == null || t0Var.isEnded() || ((z14 && kVar.f9187c.getState() != 2) || (!kVar.f9187c.isReady() && (z14 || kVar.f9187c.hasReadStreamToEnd())))) {
                kVar.f9189e = true;
                if (kVar.f9190f && !y0Var.f9881b) {
                    y0Var.f9883d = y0Var.f9880a.elapsedRealtime();
                    y0Var.f9881b = true;
                }
            } else {
                e0 e0Var = kVar.f9188d;
                e0Var.getClass();
                long positionUs = e0Var.getPositionUs();
                if (!kVar.f9189e) {
                    y0Var.a(positionUs);
                    playbackParameters = e0Var.getPlaybackParameters();
                    if (!playbackParameters.equals(y0Var.f9884e)) {
                        y0Var.b(playbackParameters);
                        ((z) kVar.f9186b).f9893i.obtainMessage(16, playbackParameters).b();
                    }
                } else if (positionUs >= y0Var.getPositionUs()) {
                    kVar.f9189e = false;
                    if (kVar.f9190f && !y0Var.f9881b) {
                        y0Var.f9883d = y0Var.f9880a.elapsedRealtime();
                        y0Var.f9881b = true;
                    }
                    y0Var.a(positionUs);
                    playbackParameters = e0Var.getPlaybackParameters();
                    if (!playbackParameters.equals(y0Var.f9884e)) {
                        y0Var.b(playbackParameters);
                        ((z) kVar.f9186b).f9893i.obtainMessage(16, playbackParameters).b();
                    }
                } else if (y0Var.f9881b) {
                    y0Var.a(y0Var.getPositionUs());
                    y0Var.f9881b = false;
                }
            }
            long positionUs2 = kVar.getPositionUs();
            this.N0 = positionUs2;
            long j15 = positionUs2 - f0Var.f8954q;
            long j16 = this.E.f9336s;
            if (this.f9902q.isEmpty() || this.E.f9319b.b()) {
                j8 = j15;
            } else {
                if (this.Q0) {
                    j16--;
                    this.Q0 = false;
                }
                p0 p0Var2 = this.E;
                int iB = p0Var2.f9318a.b(p0Var2.f9319b.f9519a);
                int iMin = Math.min(this.P0, this.f9902q.size());
                c cVar = iMin > 0 ? this.f9902q.get(iMin - 1) : null;
                while (cVar != null) {
                    int i14 = cVar.f9919b;
                    if (i14 <= iB && (i14 != iB || cVar.f9920c <= j16)) {
                        break;
                    }
                    int i15 = iMin - 1;
                    cVar = i15 > 0 ? this.f9902q.get(iMin - 2) : null;
                    iMin = i15;
                }
                c cVar2 = iMin < this.f9902q.size() ? this.f9902q.get(iMin) : null;
                while (true) {
                    if (cVar2 != null && cVar2.f9921d != null) {
                        int i16 = cVar2.f9919b;
                        if (i16 < iB) {
                            j8 = j15;
                        } else if (i16 == iB) {
                            j8 = j15;
                            if (cVar2.f9920c > j16) {
                                break;
                            }
                        }
                        iMin++;
                        cVar2 = iMin < this.f9902q.size() ? this.f9902q.get(iMin) : null;
                        j15 = j8;
                    }
                    j8 = j15;
                    break;
                }
                while (cVar2 != null && cVar2.f9921d != null && cVar2.f9919b == iB) {
                    long j17 = cVar2.f9920c;
                    if (j17 <= j16 || j17 > j8) {
                        break;
                    }
                    try {
                        P(cVar2.f9918a);
                        cVar2.f9918a.getClass();
                        this.f9902q.remove(iMin);
                        cVar2 = iMin < this.f9902q.size() ? this.f9902q.get(iMin) : null;
                    } catch (Throwable th3) {
                        cVar2.f9918a.getClass();
                        this.f9902q.remove(iMin);
                        throw th3;
                    }
                }
                this.P0 = iMin;
            }
            if (this.f9901p.i()) {
                boolean z15 = !this.F.f9925d;
                p0 p0Var3 = this.E;
                androidx.media3.exoplayer.source.j.b bVar2 = p0Var3.f9319b;
                long j18 = p0Var3.f9320c;
                r14 = 0;
                this.E = q(bVar2, j8, j18, j8, z15, 6);
            } else {
                r14 = 0;
                p0 p0Var4 = this.E;
                p0Var4.f9336s = j8;
                p0Var4.f9337t = SystemClock.elapsedRealtime();
            }
        }
        this.E.f9334q = this.f9905v.f8992l.d();
        p0 p0Var5 = this.E;
        p0Var5.f9335r = j(p0Var5.f9334q);
        p0 p0Var6 = this.E;
        if (p0Var6.f9329l && p0Var6.f9322e == 3 && d0(p0Var6.f9318a, p0Var6.f9319b)) {
            p0 p0Var7 = this.E;
            float f14 = 1.0f;
            if (p0Var7.f9332o.f8584a == 1.0f) {
                b0 b0Var = this.f9907x;
                long jG = g(p0Var7.f9318a, p0Var7.f9319b.f9519a, p0Var7.f9336s);
                long j19 = this.E.f9335r;
                i iVar = (i) b0Var;
                float f15 = iVar.f9151d;
                long j24 = iVar.f9150c;
                if (iVar.f9155h != C.TIME_UNSET) {
                    float f16 = iVar.f9154g;
                    long j25 = jG - j19;
                    long j26 = iVar.f9165r;
                    if (j26 == C.TIME_UNSET) {
                        iVar.f9165r = j25;
                        iVar.f9166s = 0L;
                    } else {
                        float f17 = 1.0f - f16;
                        long jMax = Math.max(j25, (long) ((j25 * f17) + (j26 * f16)));
                        iVar.f9165r = jMax;
                        iVar.f9166s = (long) ((f17 * Math.abs(j25 - jMax)) + (f16 * iVar.f9166s));
                    }
                    if (iVar.f9164q == C.TIME_UNSET || SystemClock.elapsedRealtime() - iVar.f9164q >= j24) {
                        iVar.f9164q = SystemClock.elapsedRealtime();
                        long j27 = (iVar.f9166s * 3) + iVar.f9165r;
                        if (iVar.f9160m > j27) {
                            float fO = fa.z.O(j24);
                            long j28 = ((long) ((iVar.f9163p - 1.0f) * fO)) + ((long) ((iVar.f9161n - 1.0f) * fO));
                            long j29 = iVar.f9157j;
                            long j34 = iVar.f9160m - j28;
                            long[] jArr = new long[3];
                            jArr[r14] = j27;
                            jArr[1] = j29;
                            jArr[2] = j34;
                            iVar.f9160m = Longs.max(jArr);
                        } else {
                            long j35 = fa.z.j(jG - ((long) (Math.max(0.0f, iVar.f9163p - 1.0f) / f15)), iVar.f9160m, j27);
                            iVar.f9160m = j35;
                            long j36 = iVar.f9159l;
                            if (j36 != C.TIME_UNSET && j35 > j36) {
                                iVar.f9160m = j36;
                            }
                        }
                        long j37 = jG - iVar.f9160m;
                        if (Math.abs(j37) < iVar.f9152e) {
                            iVar.f9163p = 1.0f;
                        } else {
                            iVar.f9163p = fa.z.h((f15 * j37) + 1.0f, iVar.f9162o, iVar.f9161n);
                        }
                        f14 = iVar.f9163p;
                    } else {
                        f14 = iVar.f9163p;
                    }
                }
                if (this.f9901p.getPlaybackParameters().f8584a != f14) {
                    androidx.media3.common.y yVar = new androidx.media3.common.y(f14, this.E.f9332o.f8585b);
                    this.f9893i.removeMessages(16);
                    this.f9901p.b(yVar);
                    p(this.E.f9332o, this.f9901p.getPlaybackParameters().f8584a, r14, r14);
                }
            }
        }
    }

    public final void l(IOException iOException, int i14) {
        ExoPlaybackException exoPlaybackExceptionCreateForSource = ExoPlaybackException.createForSource(iOException, i14);
        f0 f0Var = this.f9905v.f8990j;
        if (f0Var != null) {
            exoPlaybackExceptionCreateForSource = exoPlaybackExceptionCreateForSource.copyWithMediaPeriodId(f0Var.f8945h.f8967a);
        }
        fa.k.d("Playback error", exoPlaybackExceptionCreateForSource);
        f0(false, false);
        this.E = this.E.e(exoPlaybackExceptionCreateForSource);
    }

    public final void l0(androidx.media3.common.d0 d0Var, androidx.media3.exoplayer.source.j.b bVar, androidx.media3.common.d0 d0Var2, androidx.media3.exoplayer.source.j.b bVar2, long j8, boolean z14) {
        boolean zD0 = d0(d0Var, bVar);
        Object obj = bVar.f9519a;
        if (!zD0) {
            androidx.media3.common.y yVar = bVar.b() ? androidx.media3.common.y.f8583d : this.E.f9332o;
            k kVar = this.f9901p;
            if (kVar.getPlaybackParameters().equals(yVar)) {
                return;
            }
            this.f9893i.removeMessages(16);
            kVar.b(yVar);
            p(this.E.f9332o, yVar.f8584a, false, false);
            return;
        }
        androidx.media3.common.d0.b bVar3 = this.f9898m;
        int i14 = d0Var.g(obj, bVar3).f8189c;
        androidx.media3.common.d0.c cVar = this.f9897l;
        d0Var.n(i14, cVar);
        androidx.media3.common.t.g gVar = cVar.f8205j;
        i iVar = (i) this.f9907x;
        iVar.getClass();
        iVar.f9155h = fa.z.O(gVar.f8472a);
        iVar.f9158k = fa.z.O(gVar.f8473b);
        iVar.f9159l = fa.z.O(gVar.f8474c);
        float f14 = gVar.f8475d;
        if (f14 == -3.4028235E38f) {
            f14 = iVar.f9148a;
        }
        iVar.f9162o = f14;
        float f15 = gVar.f8476e;
        if (f15 == -3.4028235E38f) {
            f15 = iVar.f9149b;
        }
        iVar.f9161n = f15;
        if (f14 == 1.0f && f15 == 1.0f) {
            iVar.f9155h = C.TIME_UNSET;
        }
        iVar.a();
        if (j8 != C.TIME_UNSET) {
            iVar.f9156i = g(d0Var, obj, j8);
            iVar.a();
            return;
        }
        if (!Objects.equals(!d0Var2.p() ? d0Var2.m(d0Var2.g(bVar2.f9519a, bVar3).f8189c, cVar, 0L).f8196a : null, cVar.f8196a) || z14) {
            iVar.f9156i = C.TIME_UNSET;
            iVar.a();
        }
    }

    public final void m(boolean z14) {
        f0 f0Var = this.f9905v.f8992l;
        androidx.media3.exoplayer.source.j.b bVar = f0Var == null ? this.E.f9319b : f0Var.f8945h.f8967a;
        boolean zEquals = this.E.f9328k.equals(bVar);
        if (!zEquals) {
            this.E = this.E.b(bVar);
        }
        p0 p0Var = this.E;
        p0Var.f9334q = f0Var == null ? p0Var.f9336s : f0Var.d();
        p0 p0Var2 = this.E;
        p0Var2.f9335r = j(p0Var2.f9334q);
        if ((!zEquals || z14) && f0Var != null && f0Var.f8943f) {
            i0(f0Var.f8945h.f8967a, f0Var.f8952o, f0Var.f8953p);
        }
    }

    public final void m0(boolean z14, boolean z15) {
        this.X = z14;
        this.Y = (!z14 || z15) ? C.TIME_UNSET : this.f9903r.elapsedRealtime();
    }

    /* JADX WARN: Code duplicated, block: B:182:0x030e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0310  */
    /* JADX WARN: Code duplicated, block: B:190:0x0326  */
    /* JADX WARN: Code duplicated, block: B:192:0x0330 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x0345  */
    /* JADX WARN: Code duplicated, block: B:201:0x0351  */
    /* JADX WARN: Code duplicated, block: B:203:0x0357  */
    /* JADX WARN: Code duplicated, block: B:207:0x0379  */
    /* JADX WARN: Code duplicated, block: B:214:0x039a  */
    /* JADX WARN: Code duplicated, block: B:215:0x039c  */
    /* JADX WARN: Code duplicated, block: B:218:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:220:0x03af  */
    /* JADX WARN: Code duplicated, block: B:222:0x03b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:231:0x03da  */
    /* JADX WARN: Code duplicated, block: B:233:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:237:0x0403  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ef  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.media3.exoplayer.t0[]] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [androidx.media3.common.d0] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [androidx.media3.exoplayer.z$g] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v22 */
    /* JADX WARN: Type inference failed for: r18v23 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.media3.common.d0] */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.media3.common.d0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.media3.common.d0] */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.media3.exoplayer.p0] */
    /* JADX WARN: Type inference failed for: r2v37, types: [androidx.media3.exoplayer.h0] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.media3.common.d0] */
    /* JADX WARN: Type inference failed for: r36v0, types: [androidx.media3.exoplayer.z] */
    /* JADX WARN: Type inference failed for: r37v0, types: [androidx.media3.common.d0] */
    /* JADX WARN: Type inference failed for: r3v67, types: [androidx.media3.exoplayer.t0] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [int] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v35, types: [androidx.media3.common.d0] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.media3.exoplayer.h0] */
    /* JADX WARN: Type inference failed for: r9v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void n(androidx.media3.common.d0 d0Var, boolean z14) throws Throwable {
        long j8;
        androidx.media3.common.d0.c cVar;
        androidx.media3.exoplayer.source.j.b bVar;
        int iA;
        Object obj;
        int i14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ?? r14;
        long j14;
        Object obj2;
        boolean z19;
        f fVar;
        int i15;
        boolean z24;
        int iA2;
        boolean z25;
        ?? r18;
        ?? r15;
        ?? r16;
        androidx.media3.exoplayer.source.j.b bVar2;
        long j15;
        ?? r17;
        ?? r19;
        long j16;
        androidx.media3.exoplayer.source.j.b bVar3;
        Object obj3;
        ?? r24;
        int i16;
        boolean z26;
        char c14;
        char c15;
        ?? r110;
        char c16;
        ?? r25;
        ?? r111;
        g gVar;
        long j17;
        androidx.media3.exoplayer.source.j.b bVar4;
        Object obj4;
        ?? r26;
        int i17;
        ?? r112;
        p0 p0Var = this.E;
        g gVar2 = this.M0;
        ?? r27 = this.f9905v;
        int i18 = this.f9896k0;
        boolean z27 = this.H0;
        androidx.media3.common.d0.c cVar2 = this.f9897l;
        androidx.media3.common.d0.b bVar5 = this.f9898m;
        if (d0Var.p()) {
            r18 = 0;
            r15 = d0Var;
            fVar = new f(p0.f9317u, 0L, C.TIME_UNSET, false, true, false);
            j8 = C.TIME_UNSET;
        } else {
            androidx.media3.exoplayer.source.j.b bVar6 = p0Var.f9319b;
            j8 = C.TIME_UNSET;
            Object obj5 = bVar6.f9519a;
            androidx.media3.common.d0 d0Var2 = p0Var.f9318a;
            boolean zP = d0Var2.p();
            boolean z28 = zP || d0Var2.g(bVar6.f9519a, bVar5).f8192f;
            long jLongValue = (p0Var.f9319b.b() || z28) ? p0Var.f9320c : p0Var.f9336s;
            Object obj6 = obj5;
            if (gVar2 != null) {
                bVar = bVar6;
                boolean z29 = true;
                cVar = cVar2;
                Pair<Object, Long> pairJ = J(d0Var, gVar2, true, i18, z27, cVar, bVar5);
                if (pairJ == null) {
                    iA2 = d0Var.a(z27);
                    jLongValue = jLongValue;
                    z24 = false;
                    z25 = false;
                } else {
                    long j18 = gVar2.f9935c;
                    Object obj7 = pairJ.first;
                    if (j18 == C.TIME_UNSET) {
                        iA2 = d0Var.g(obj7, bVar5).f8189c;
                        jLongValue = jLongValue;
                        z24 = false;
                    } else {
                        jLongValue = ((Long) pairJ.second).longValue();
                        obj6 = obj7;
                        z24 = true;
                        iA2 = -1;
                    }
                    z25 = p0Var.f9322e == 4;
                    z29 = false;
                }
                z17 = z24;
                iA = iA2;
                z16 = z29;
                z15 = z25;
                i14 = -1;
            } else {
                cVar = cVar2;
                bVar = bVar6;
                if (p0Var.f9318a.p()) {
                    iA = d0Var.a(z27);
                } else if (d0Var.b(obj6) == -1) {
                    int iK = K(cVar, bVar5, i18, z27, obj6, p0Var.f9318a, d0Var);
                    if (iK == -1) {
                        cVar = cVar;
                        bVar5 = bVar5;
                        iA = d0Var.a(z27);
                        z18 = true;
                    } else {
                        cVar = cVar;
                        bVar5 = bVar5;
                        iA = iK;
                        z18 = false;
                    }
                    obj6 = obj6;
                    z16 = z18;
                    jLongValue = jLongValue;
                    i14 = -1;
                    z15 = false;
                    z17 = false;
                } else if (jLongValue == C.TIME_UNSET) {
                    int i19 = d0Var.g(obj6, bVar5).f8189c;
                    obj6 = obj6;
                    iA = i19;
                } else if (z28) {
                    p0Var.f9318a.g(bVar.f9519a, bVar5);
                    bVar = bVar;
                    if (p0Var.f9318a.m(bVar5.f8189c, cVar, 0L).f8209n == p0Var.f9318a.b(bVar.f9519a)) {
                        Pair<Object, Long> pairI = d0Var.i(cVar, bVar5, d0Var.g(obj6, bVar5).f8189c, bVar5.f8191e + jLongValue);
                        cVar = cVar;
                        obj = pairI.first;
                        jLongValue = ((Long) pairI.second).longValue();
                    } else {
                        obj = obj6;
                        jLongValue = jLongValue;
                    }
                    obj6 = obj;
                    iA = -1;
                    i14 = -1;
                    z15 = false;
                    z16 = false;
                    z17 = true;
                } else {
                    obj6 = obj6;
                    iA = -1;
                    i14 = -1;
                    z15 = false;
                    z16 = false;
                    z17 = false;
                }
                i14 = -1;
                z15 = false;
                z16 = false;
                z17 = false;
            }
            if (iA != i14) {
                ?? r28 = d0Var;
                Pair<Object, Long> pairI2 = r28.i(cVar, bVar5, iA, C.TIME_UNSET);
                obj2 = pairI2.first;
                jLongValue = ((Long) pairI2.second).longValue();
                j14 = -9223372036854775807L;
                r14 = r28;
            } else {
                r14 = d0Var;
                j14 = jLongValue;
                obj2 = obj6;
            }
            androidx.media3.exoplayer.source.j.b bVarR = r27.r(r14, obj2, jLongValue);
            int i24 = bVarR.f9523e;
            boolean z34 = bVar.f9519a.equals(obj2) && !bVar.b() && !bVarR.b() && (i24 == i14 || ((i15 = bVar.f9523e) != i14 && i24 >= i15));
            androidx.media3.common.d0.b bVarG = r14.g(obj2, bVar5);
            if (z28 || jLongValue != j14) {
                z19 = false;
            } else {
                Object obj8 = bVar.f9519a;
                int i25 = bVar.f9521c;
                int i26 = bVar.f9520b;
                if (obj8.equals(bVarR.f9519a) && (!(bVar.b() && bVarG.h(i26)) ? bVarR.b() && bVarG.h(bVarR.f9520b) : !(bVarG.e(i26, i25) == 4 || bVarG.e(i26, i25) == 2))) {
                    z19 = true;
                } else {
                    z19 = false;
                }
            }
            if (z34 || z19) {
                bVarR = bVar;
            }
            if (bVarR.b()) {
                if (bVarR.equals(bVar)) {
                    jLongValue = p0Var.f9336s;
                } else {
                    r14.g(bVarR.f9519a, bVar5);
                    jLongValue = bVarR.f9521c == bVar5.f(bVarR.f9520b) ? bVar5.f8193g.f8157c : 0L;
                }
            }
            fVar = new f(bVarR, jLongValue, j14, z15, z16, z17);
            r15 = r14;
            r18 = zP;
        }
        androidx.media3.exoplayer.source.j.b bVar7 = fVar.f9927a;
        long j19 = fVar.f9929c;
        boolean z35 = fVar.f9930d;
        long jO = fVar.f9928b;
        boolean z36 = (this.E.f9319b.equals(bVar7) && jO == this.E.f9336s) ? false : true;
        try {
            if (fVar.f9931e) {
                try {
                    z26 = true;
                    if (this.E.f9322e != 1) {
                        c14 = 4;
                        try {
                            b0(4);
                        } catch (Throwable th3) {
                            th = th3;
                            r16 = r15;
                            bVar2 = bVar7;
                            j15 = j19;
                            r19 = z26;
                            r17 = 0;
                        }
                    } else {
                        c14 = 4;
                    }
                    F(false, false, false, true);
                    c15 = c14;
                } catch (Throwable th4) {
                    th = th4;
                    z26 = true;
                    r16 = r15;
                    bVar2 = bVar7;
                    j15 = j19;
                    r19 = z26;
                    r17 = 0;
                }
            } else {
                z26 = true;
                c15 = 4;
            }
            ?? r29 = this.f9885a;
            int length = r29.length;
            d0Var = 0;
            while (d0Var < length) {
                r29[d0Var].f(r15);
                d0Var++;
            }
            try {
                if (z36) {
                    d0Var = r15;
                    r18 = z26;
                    gVar = null;
                    gVar = null;
                    c16 = 0;
                    c15 = 0;
                    if (d0Var.p()) {
                        r112 = r18;
                        bVar2 = bVar7;
                        r111 = r112;
                    } else {
                        for (f0 f0Var = this.f9905v.f8990j; f0Var != null; f0Var = f0Var.f8951n) {
                            if (f0Var.f8945h.f8967a.equals(bVar7)) {
                                r112 = r18;
                                f0Var.f8945h = this.f9905v.h(d0Var, f0Var.f8945h);
                                f0Var.k();
                            } else {
                                r112 = r18;
                            }
                        }
                        try {
                            r112 = r18;
                            h0 h0Var = this.f9905v;
                            bVar2 = bVar7;
                            try {
                                jO = O(bVar2, jO, h0Var.f8990j != h0Var.f8991k ? r18 == true ? 1 : 0 : false, z35);
                                r111 = r18;
                            } catch (Throwable th5) {
                                th = th5;
                                jO = jO;
                                r25 = d0Var;
                                r110 = r18;
                                j15 = j19;
                                r16 = r25;
                                r17 = c16;
                                r19 = r110;
                                p0 p0Var2 = this.E;
                                androidx.media3.common.d0 d0Var3 = p0Var2.f9318a;
                                androidx.media3.exoplayer.source.j.b bVar8 = p0Var2.f9319b;
                                if (fVar.f9932f) {
                                    j16 = jO;
                                } else {
                                    j16 = j8;
                                }
                                bVar3 = bVar2;
                                l0(r16, bVar3, d0Var3, bVar8, j16, false);
                                if (z36) {
                                    p0 p0Var3 = this.E;
                                    obj3 = p0Var3.f9319b.f9519a;
                                    androidx.media3.common.d0 d0Var4 = p0Var3.f9318a;
                                    if (z36) {
                                        r24 = 0;
                                    } else {
                                        r24 = 0;
                                    }
                                    long j24 = this.E.f9321d;
                                    if (r16.b(obj3) == -1) {
                                        i16 = 4;
                                    } else {
                                        i16 = 3;
                                    }
                                    this.E = q(bVar3, jO, j15, j24, r24, i16);
                                } else {
                                    p0 p0Var4 = this.E;
                                    obj3 = p0Var4.f9319b.f9519a;
                                    androidx.media3.common.d0 d0Var5 = p0Var4.f9318a;
                                    if (z36) {
                                        r24 = 0;
                                    } else {
                                        r24 = 0;
                                    }
                                    long j25 = this.E.f9321d;
                                    if (r16.b(obj3) == -1) {
                                        i16 = 4;
                                    } else {
                                        i16 = 3;
                                    }
                                    this.E = q(bVar3, jO, j15, j25, r24, i16);
                                }
                                G();
                                I(r16, this.E.f9318a);
                                this.E = this.E.h(r16);
                                if (!r16.p()) {
                                    this.M0 = r17;
                                }
                                m(false);
                                this.f9893i.sendEmptyMessage(2);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            bVar2 = bVar7;
                            r25 = d0Var;
                            c16 = c15;
                            r110 = r18;
                            j15 = j19;
                            r16 = r25;
                            r17 = c16;
                            r19 = r110;
                            p0 p0Var5 = this.E;
                            androidx.media3.common.d0 d0Var6 = p0Var5.f9318a;
                            androidx.media3.exoplayer.source.j.b bVar9 = p0Var5.f9319b;
                            if (fVar.f9932f) {
                                j16 = jO;
                            } else {
                                j16 = j8;
                            }
                            bVar3 = bVar2;
                            l0(r16, bVar3, d0Var6, bVar9, j16, false);
                            if (z36) {
                                p0 p0Var6 = this.E;
                                obj3 = p0Var6.f9319b.f9519a;
                                androidx.media3.common.d0 d0Var7 = p0Var6.f9318a;
                                if (z36) {
                                    r24 = 0;
                                } else {
                                    r24 = 0;
                                }
                                long j26 = this.E.f9321d;
                                if (r16.b(obj3) == -1) {
                                    i16 = 4;
                                } else {
                                    i16 = 3;
                                }
                                this.E = q(bVar3, jO, j15, j26, r24, i16);
                            } else {
                                p0 p0Var7 = this.E;
                                obj3 = p0Var7.f9319b.f9519a;
                                androidx.media3.common.d0 d0Var8 = p0Var7.f9318a;
                                if (z36) {
                                    r24 = 0;
                                } else {
                                    r24 = 0;
                                }
                                long j27 = this.E.f9321d;
                                if (r16.b(obj3) == -1) {
                                    i16 = 4;
                                } else {
                                    i16 = 3;
                                }
                                this.E = q(bVar3, jO, j15, j27, r24, i16);
                            }
                            G();
                            I(r16, this.E.f9318a);
                            this.E = this.E.h(r16);
                            if (!r16.p()) {
                                this.M0 = r17;
                            }
                            m(false);
                            this.f9893i.sendEmptyMessage(2);
                            throw th;
                        }
                    }
                    p0 p0Var8 = this.E;
                    androidx.media3.common.d0 d0Var9 = p0Var8.f9318a;
                    androidx.media3.exoplayer.source.j.b bVar10 = p0Var8.f9319b;
                    if (fVar.f9932f) {
                        j17 = jO;
                    } else {
                        j17 = j8;
                    }
                    bVar4 = bVar2;
                    l0(d0Var, bVar4, d0Var9, bVar10, j17, false);
                    if (z36) {
                        p0 p0Var9 = this.E;
                        obj4 = p0Var9.f9319b.f9519a;
                        androidx.media3.common.d0 d0Var10 = p0Var9.f9318a;
                        if (z36) {
                            r26 = 0;
                        } else {
                            r26 = 0;
                        }
                        long j28 = this.E.f9321d;
                        if (d0Var.b(obj4) == -1) {
                            i17 = 4;
                        } else {
                            i17 = 3;
                        }
                        this.E = q(bVar4, jO, j19, j28, r26, i17);
                    } else {
                        p0 p0Var10 = this.E;
                        obj4 = p0Var10.f9319b.f9519a;
                        androidx.media3.common.d0 d0Var11 = p0Var10.f9318a;
                        if (z36) {
                            r26 = 0;
                        } else {
                            r26 = 0;
                        }
                        long j29 = this.E.f9321d;
                        if (d0Var.b(obj4) == -1) {
                            i17 = 4;
                        } else {
                            i17 = 3;
                        }
                        this.E = q(bVar4, jO, j19, j29, r26, i17);
                    }
                    G();
                    I(r2, this.E.f9318a);
                    this.E = this.E.h(r2);
                    if (!d0Var.p()) {
                        this.M0 = gVar;
                    }
                    m(false);
                    this.f9893i.sendEmptyMessage(2);
                    return;
                }
                try {
                    boolean z37 = z26;
                    try {
                        r18 = z37;
                        c15 = 0;
                        gVar = null;
                        gVar = null;
                        try {
                            r112 = r18;
                            if (!this.f9905v.u(d0Var, this.N0, h())) {
                                M(false);
                                r112 = r18;
                            }
                            r112 = r18;
                            bVar2 = bVar7;
                            r111 = r112;
                            p0 p0Var11 = this.E;
                            androidx.media3.common.d0 d0Var12 = p0Var11.f9318a;
                            androidx.media3.exoplayer.source.j.b bVar11 = p0Var11.f9319b;
                            if (fVar.f9932f) {
                                j17 = jO;
                            } else {
                                j17 = j8;
                            }
                            bVar4 = bVar2;
                            l0(d0Var, bVar4, d0Var12, bVar11, j17, false);
                            if (z36 || j19 != this.E.f9320c) {
                                p0 p0Var12 = this.E;
                                obj4 = p0Var12.f9319b.f9519a;
                                androidx.media3.common.d0 d0Var13 = p0Var12.f9318a;
                                if (z36 || !z14 || d0Var13.p() || d0Var13.g(obj4, this.f9898m).f8192f) {
                                    r26 = 0;
                                } else {
                                    r26 = r111;
                                }
                                long j210 = this.E.f9321d;
                                if (d0Var.b(obj4) == -1) {
                                    i17 = 4;
                                } else {
                                    i17 = 3;
                                }
                                this.E = q(bVar4, jO, j19, j210, r26, i17);
                            }
                            G();
                            I(r2, this.E.f9318a);
                            this.E = this.E.h(r2);
                            if (!d0Var.p()) {
                                this.M0 = gVar;
                            }
                            m(false);
                            this.f9893i.sendEmptyMessage(2);
                            return;
                        } catch (Throwable th7) {
                            th = th7;
                            d0Var = d0Var;
                            bVar2 = bVar7;
                            r25 = d0Var;
                            c16 = c15;
                            r110 = r18;
                            j15 = j19;
                            r16 = r25;
                            r17 = c16;
                            r19 = r110;
                            p0 p0Var13 = this.E;
                            androidx.media3.common.d0 d0Var14 = p0Var13.f9318a;
                            androidx.media3.exoplayer.source.j.b bVar12 = p0Var13.f9319b;
                            if (fVar.f9932f) {
                                j16 = jO;
                            } else {
                                j16 = j8;
                            }
                            bVar3 = bVar2;
                            l0(r16, bVar3, d0Var14, bVar12, j16, false);
                            if (z36) {
                                p0 p0Var14 = this.E;
                                obj3 = p0Var14.f9319b.f9519a;
                                androidx.media3.common.d0 d0Var15 = p0Var14.f9318a;
                                if (z36) {
                                    r24 = 0;
                                } else {
                                    r24 = 0;
                                }
                                long j211 = this.E.f9321d;
                                if (r16.b(obj3) == -1) {
                                    i16 = 4;
                                } else {
                                    i16 = 3;
                                }
                                this.E = q(bVar3, jO, j15, j211, r24, i16);
                            } else {
                                p0 p0Var15 = this.E;
                                obj3 = p0Var15.f9319b.f9519a;
                                androidx.media3.common.d0 d0Var16 = p0Var15.f9318a;
                                if (z36) {
                                    r24 = 0;
                                } else {
                                    r24 = 0;
                                }
                                long j212 = this.E.f9321d;
                                if (r16.b(obj3) == -1) {
                                    i16 = 4;
                                } else {
                                    i16 = 3;
                                }
                                this.E = q(bVar3, jO, j15, j212, r24, i16);
                            }
                            G();
                            I(r16, this.E.f9318a);
                            this.E = this.E.h(r16);
                            if (!r16.p()) {
                                this.M0 = r17;
                            }
                            m(false);
                            this.f9893i.sendEmptyMessage(2);
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        r18 = z37;
                        c15 = 0;
                        bVar2 = bVar7;
                        r25 = d0Var;
                        c16 = c15;
                        r110 = r18;
                        j15 = j19;
                        r16 = r25;
                        r17 = c16;
                        r19 = r110;
                        p0 p0Var16 = this.E;
                        androidx.media3.common.d0 d0Var17 = p0Var16.f9318a;
                        androidx.media3.exoplayer.source.j.b bVar13 = p0Var16.f9319b;
                        if (fVar.f9932f) {
                            j16 = jO;
                        } else {
                            j16 = j8;
                        }
                        bVar3 = bVar2;
                        l0(r16, bVar3, d0Var17, bVar13, j16, false);
                        if (z36) {
                            p0 p0Var17 = this.E;
                            obj3 = p0Var17.f9319b.f9519a;
                            androidx.media3.common.d0 d0Var18 = p0Var17.f9318a;
                            if (z36) {
                                r24 = 0;
                            } else {
                                r24 = 0;
                            }
                            long j213 = this.E.f9321d;
                            if (r16.b(obj3) == -1) {
                                i16 = 4;
                            } else {
                                i16 = 3;
                            }
                            this.E = q(bVar3, jO, j15, j213, r24, i16);
                        } else {
                            p0 p0Var18 = this.E;
                            obj3 = p0Var18.f9319b.f9519a;
                            androidx.media3.common.d0 d0Var19 = p0Var18.f9318a;
                            if (z36) {
                                r24 = 0;
                            } else {
                                r24 = 0;
                            }
                            long j214 = this.E.f9321d;
                            if (r16.b(obj3) == -1) {
                                i16 = 4;
                            } else {
                                i16 = 3;
                            }
                            this.E = q(bVar3, jO, j15, j214, r24, i16);
                        }
                        G();
                        I(r16, this.E.f9318a);
                        this.E = this.E.h(r16);
                        if (!r16.p()) {
                            this.M0 = r17;
                        }
                        m(false);
                        this.f9893i.sendEmptyMessage(2);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    r18 = z26;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
            r16 = r15;
            bVar2 = bVar7;
            j15 = j19;
            r17 = 0;
            r19 = 1;
        }
        p0 p0Var19 = this.E;
        androidx.media3.common.d0 d0Var110 = p0Var19.f9318a;
        androidx.media3.exoplayer.source.j.b bVar14 = p0Var19.f9319b;
        if (fVar.f9932f) {
            j16 = jO;
        } else {
            j16 = j8;
        }
        bVar3 = bVar2;
        l0(r16, bVar3, d0Var110, bVar14, j16, false);
        if (z36 || j15 != this.E.f9320c) {
            p0 p0Var110 = this.E;
            obj3 = p0Var110.f9319b.f9519a;
            androidx.media3.common.d0 d0Var111 = p0Var110.f9318a;
            if (z36 || !z14 || d0Var111.p() || d0Var111.g(obj3, this.f9898m).f8192f) {
                r24 = 0;
            } else {
                r24 = r19;
            }
            long j215 = this.E.f9321d;
            if (r16.b(obj3) == -1) {
                i16 = 4;
            } else {
                i16 = 3;
            }
            this.E = q(bVar3, jO, j15, j215, r24, i16);
        }
        G();
        I(r16, this.E.f9318a);
        this.E = this.E.h(r16);
        if (!r16.p()) {
            this.M0 = r17;
        }
        m(false);
        this.f9893i.sendEmptyMessage(2);
        throw th;
    }

    public final synchronized void n0(m mVar, long j8) {
        long jElapsedRealtime = this.f9903r.elapsedRealtime() + j8;
        boolean z14 = false;
        while (!((Boolean) mVar.get()).booleanValue() && j8 > 0) {
            try {
                this.f9903r.getClass();
                wait(j8);
            } catch (InterruptedException unused) {
                z14 = true;
            }
            j8 = jElapsedRealtime - this.f9903r.elapsedRealtime();
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
    }

    public final void o(androidx.media3.exoplayer.source.i iVar) throws ExoPlaybackException {
        f0 f0Var;
        h0 h0Var = this.f9905v;
        f0 f0Var2 = h0Var.f8992l;
        k kVar = this.f9901p;
        if (f0Var2 != null && f0Var2.f8938a == iVar) {
            f0Var2.getClass();
            if (!f0Var2.f8943f) {
                float f14 = kVar.getPlaybackParameters().f8584a;
                p0 p0Var = this.E;
                f0Var2.f(f14, p0Var.f9318a, p0Var.f9329l);
            }
            i0(f0Var2.f8945h.f8967a, f0Var2.f8952o, f0Var2.f8953p);
            if (f0Var2 == h0Var.f8990j) {
                H(f0Var2.f8945h.f8968b);
                f(new boolean[this.f9885a.length], h0Var.f8991k.e());
                p0 p0Var2 = this.E;
                androidx.media3.exoplayer.source.j.b bVar = p0Var2.f9319b;
                long j8 = f0Var2.f8945h.f8968b;
                this.E = q(bVar, j8, p0Var2.f9320c, j8, false, 5);
            }
            u();
            return;
        }
        int i14 = 0;
        while (true) {
            if (i14 >= h0Var.f8997q.size()) {
                f0Var = null;
                break;
            }
            f0Var = (f0) h0Var.f8997q.get(i14);
            if (f0Var.f8938a == iVar) {
                break;
            } else {
                i14++;
            }
        }
        if (f0Var != null) {
            fa.a.d(!f0Var.f8943f);
            float f15 = kVar.getPlaybackParameters().f8584a;
            p0 p0Var3 = this.E;
            f0Var.f(f15, p0Var3.f9318a, p0Var3.f9329l);
            f0 f0Var3 = h0Var.f8993m;
            if (f0Var3 == null || f0Var3.f8938a != iVar) {
                return;
            }
            v();
        }
    }

    public final void p(androidx.media3.common.y yVar, float f14, boolean z14, boolean z15) {
        int i14;
        if (z14) {
            if (z15) {
                this.F.a(1);
            }
            this.E = this.E.f(yVar);
        }
        float f15 = yVar.f8584a;
        f0 f0Var = this.f9905v.f8990j;
        while (true) {
            i14 = 0;
            if (f0Var == null) {
                break;
            }
            wa.g[] gVarArr = f0Var.f8953p.f183757c;
            int length = gVarArr.length;
            while (i14 < length) {
                wa.g gVar = gVarArr[i14];
                if (gVar != null) {
                    gVar.onPlaybackSpeed(f15);
                }
                i14++;
            }
            f0Var = f0Var.f8951n;
        }
        t0[] t0VarArr = this.f9885a;
        int length2 = t0VarArr.length;
        while (i14 < length2) {
            t0 t0Var = t0VarArr[i14];
            if (t0Var != null) {
                t0Var.setPlaybackSpeed(f14, yVar.f8584a);
            }
            i14++;
        }
    }

    public final p0 q(androidx.media3.exoplayer.source.j.b bVar, long j8, long j14, long j15, boolean z14, int i14) {
        boolean z15;
        this.Q0 = (!this.Q0 && j8 == this.E.f9336s && bVar.equals(this.E.f9319b)) ? false : true;
        G();
        p0 p0Var = this.E;
        sa.r rVar = p0Var.f9325h;
        wa.m mVar = p0Var.f9326i;
        List<androidx.media3.common.w> listOf = p0Var.f9327j;
        if (this.f9906w.f9303k) {
            f0 f0Var = this.f9905v.f8990j;
            rVar = f0Var == null ? sa.r.f158151d : f0Var.f8952o;
            mVar = f0Var == null ? this.f9890f : f0Var.f8953p;
            wa.g[] gVarArr = mVar.f183757c;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            boolean z16 = false;
            for (wa.g gVar : gVarArr) {
                if (gVar != null) {
                    androidx.media3.common.w wVar = gVar.getFormat(0).f8384l;
                    if (wVar == null) {
                        builder.add(new androidx.media3.common.w(new androidx.media3.common.w.b[0]));
                    } else {
                        builder.add(wVar);
                        z16 = true;
                    }
                }
            }
            listOf = z16 ? builder.build() : ImmutableList.of();
            if (f0Var != null) {
                g0 g0Var = f0Var.f8945h;
                if (g0Var.f8969c != j14) {
                    f0Var.f8945h = g0Var.a(j14);
                }
            }
            t0[] t0VarArr = this.f9885a;
            f0 f0Var2 = this.f9905v.f8990j;
            if (f0Var2 != null) {
                wa.m mVar2 = f0Var2.f8953p;
                int i15 = 0;
                boolean z17 = false;
                while (true) {
                    if (i15 >= t0VarArr.length) {
                        z15 = true;
                        break;
                    }
                    if (mVar2.b(i15)) {
                        if (t0VarArr[i15].getTrackType() != 1) {
                            z15 = false;
                            break;
                        }
                        if (mVar2.f183756b[i15].f9774a != 0) {
                            z17 = true;
                        }
                    }
                    i15++;
                }
                boolean z18 = z17 && z15;
                if (z18 != this.K0) {
                    this.K0 = z18;
                    if (!z18 && this.E.f9333p) {
                        this.f9893i.sendEmptyMessage(2);
                    }
                }
            }
        } else if (!bVar.equals(p0Var.f9319b)) {
            rVar = sa.r.f158151d;
            mVar = this.f9890f;
            listOf = ImmutableList.of();
        }
        sa.r rVar2 = rVar;
        wa.m mVar3 = mVar;
        List<androidx.media3.common.w> list = listOf;
        if (z14) {
            d dVar = this.F;
            if (!dVar.f9925d || dVar.f9926e == 5) {
                dVar.f9922a = true;
                dVar.f9925d = true;
                dVar.f9926e = i14;
            } else {
                fa.a.a(i14 == 5);
            }
        }
        p0 p0Var2 = this.E;
        return p0Var2.c(bVar, j8, j14, j15, j(p0Var2.f9334q), rVar2, mVar3, list);
    }

    public final boolean t() {
        f0 f0Var = this.f9905v.f8990j;
        long j8 = f0Var.f8945h.f8971e;
        if (f0Var.f8943f) {
            return j8 == C.TIME_UNSET || this.E.f9336s < j8 || !c0();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.media3.exoplayer.source.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [androidx.media3.exoplayer.source.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.media3.exoplayer.source.s, java.lang.Object] */
    public final void u() {
        boolean zA;
        if (r(this.f9905v.f8992l)) {
            f0 f0Var = this.f9905v.f8992l;
            long j8 = j(!f0Var.f8943f ? 0L : f0Var.f8938a.getNextLoadPositionUs());
            f0 f0Var2 = this.f9905v.f8990j;
            long j14 = this.N0;
            long j15 = f0Var.f8954q;
            if (f0Var != f0Var2) {
                j14 -= j15;
                j15 = f0Var.f8945h.f8968b;
            }
            c0.a aVar = new c0.a(this.f9909z, this.E.f9318a, f0Var.f8945h.f8967a, j14 - j15, j8, this.f9901p.getPlaybackParameters().f8584a, this.E.f9329l, this.X, d0(this.E.f9318a, f0Var.f8945h.f8967a) ? ((i) this.f9907x).f9160m : -9223372036854775807L);
            zA = this.f9891g.a(aVar);
            f0 f0Var3 = this.f9905v.f8990j;
            if (!zA && f0Var3.f8943f && j8 < 500000 && (this.f9899n > 0 || this.f9900o)) {
                f0Var3.f8938a.discardBuffer(this.E.f9336s, false);
                zA = this.f9891g.a(aVar);
            }
        } else {
            zA = false;
        }
        this.Z = zA;
        if (zA) {
            f0 f0Var4 = this.f9905v.f8992l;
            f0Var4.getClass();
            d0.b bVar = new d0.b();
            bVar.f8815a = this.N0 - f0Var4.f8954q;
            float f14 = this.f9901p.getPlaybackParameters().f8584a;
            fa.a.a(f14 > 0.0f || f14 == -3.4028235E38f);
            bVar.f8816b = f14;
            long j16 = this.Y;
            fa.a.a(j16 >= 0 || j16 == C.TIME_UNSET);
            bVar.f8817c = j16;
            d0 d0VarA = bVar.a();
            fa.a.d(f0Var4.f8951n == null);
            f0Var4.f8938a.f(d0VarA);
        }
        h0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.i, androidx.media3.exoplayer.source.s, java.lang.Object] */
    public final void v() {
        h0 h0Var = this.f9905v;
        h0Var.l();
        f0 f0Var = h0Var.f8993m;
        if (f0Var != null) {
            ?? r14 = f0Var.f8938a;
            if ((!f0Var.f8942e || f0Var.f8943f) && !r14.isLoading()) {
                androidx.media3.common.d0 d0Var = this.E.f9318a;
                if (f0Var.f8943f) {
                    r14.getBufferedPositionUs();
                }
                if (this.f9891g.b()) {
                    if (!f0Var.f8942e) {
                        long j8 = f0Var.f8945h.f8968b;
                        f0Var.f8942e = true;
                        r14.c(this, j8);
                        return;
                    }
                    d0.b bVar = new d0.b();
                    bVar.f8815a = this.N0 - f0Var.f8954q;
                    float f14 = this.f9901p.getPlaybackParameters().f8584a;
                    fa.a.a(f14 > 0.0f || f14 == -3.4028235E38f);
                    bVar.f8816b = f14;
                    long j14 = this.Y;
                    fa.a.a(j14 >= 0 || j14 == C.TIME_UNSET);
                    bVar.f8817c = j14;
                    d0 d0VarA = bVar.a();
                    fa.a.d(f0Var.f8951n == null);
                    r14.f(d0VarA);
                }
            }
        }
    }

    public final void w() {
        d dVar = this.F;
        p0 p0Var = this.E;
        boolean z14 = dVar.f9922a | (dVar.f9923b != p0Var);
        dVar.f9922a = z14;
        dVar.f9923b = p0Var;
        if (z14) {
            v vVar = ((t) this.f9904t).f9692a;
            vVar.f9747i.post(new ab.j(11, vVar, dVar));
            this.F = new d(this.E);
        }
    }

    public final void x(int i14) {
        t0 t0Var = this.f9885a[i14];
        try {
            t0Var.maybeThrowStreamError();
        } catch (IOException | RuntimeException e4) {
            int trackType = t0Var.getTrackType();
            if (trackType != 3 && trackType != 5) {
                throw e4;
            }
            wa.m mVar = this.f9905v.f8990j.f8953p;
            fa.k.d("Disabling track due to error: ".concat(androidx.media3.common.q.d(mVar.f183757c[i14].getSelectedFormat())), e4);
            wa.m mVar2 = new wa.m((v0[]) mVar.f183756b.clone(), (wa.g[]) mVar.f183757c.clone(), mVar.f183758d, mVar.f183759e);
            mVar2.f183756b[i14] = null;
            mVar2.f183757c[i14] = null;
            d(i14);
            f0 f0Var = this.f9905v.f8990j;
            f0Var.a(mVar2, this.E.f9336s, false, new boolean[f0Var.f8948k.length]);
        }
    }

    public final void y(final int i14, final boolean z14) {
        boolean[] zArr = this.f9888d;
        if (zArr[i14] != z14) {
            zArr[i14] = z14;
            this.C.post(new Runnable() { // from class: androidx.media3.exoplayer.x
                @Override // java.lang.Runnable
                public final void run() {
                    z zVar = this.f9873a;
                    ja.a aVar = zVar.B;
                    t0[] t0VarArr = zVar.f9885a;
                    int i15 = i14;
                    aVar.L8(i15, t0VarArr[i15].getTrackType(), z14);
                }
            });
        }
    }

    public final void z() throws Throwable {
        n(this.f9906w.b(), true);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<o0.c> f9910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.t f9911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f9913d;

        private a(List<o0.c> list, androidx.media3.exoplayer.source.t tVar, int i14, long j8) {
            this.f9910a = list;
            this.f9911b = tVar;
            this.f9912c = i14;
            this.f9913d = j8;
        }

        public /* synthetic */ a(List list, androidx.media3.exoplayer.source.t tVar, int i14, long j8, y yVar) {
            this(list, tVar, i14, j8);
        }
    }
}
