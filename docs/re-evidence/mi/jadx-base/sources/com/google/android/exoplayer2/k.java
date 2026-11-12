package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.CheckResult;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.common.collect.ImmutableList;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import defpackage.bop;
import defpackage.brl;
import defpackage.cop;
import defpackage.f14;
import defpackage.g83;
import defpackage.gy1;
import defpackage.j1i;
import defpackage.k9l;
import defpackage.l8p;
import defpackage.lie;
import defpackage.m0i;
import defpackage.mjf;
import defpackage.n0i;
import defpackage.nkp;
import defpackage.o91;
import defpackage.ojf;
import defpackage.rk1;
import defpackage.rkk;
import defpackage.skb;
import defpackage.skk;
import defpackage.spo;
import defpackage.toe;
import defpackage.wlq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Handler.Callback, com.google.android.exoplayer2.source.j.a, bop.a, p.d, com.google.android.exoplayer2.h.a, r.a {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public h J;
    public long K;
    public int L;
    public boolean M;
    public ExoPlaybackException N;
    public long O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s[] f7931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rkk[] f7932b;
    public final bop c;
    public final cop d;
    public final lie e;
    public final gy1 f;
    public final skb g;
    public final HandlerThread h;
    public final Looper i;
    public final v.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v.b f7933k;
    public final long l;
    public final boolean m;
    public final com.google.android.exoplayer2.h n;
    public final ArrayList<d> o;
    public final f14 p;
    public final f q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f7934r;
    public final p s;
    public final l t;
    public final long u;
    public brl v;
    public m0i w;
    public e x;
    public boolean y;
    public boolean z;

    public class a implements s.a {
        public a() {
        }

        @Override // com.google.android.exoplayer2.s.a
        public void a() {
            k.this.g.h(2);
        }

        @Override // com.google.android.exoplayer2.s.a
        public void b(long j) {
            if (j >= VibrateModeProgressBar.sLongToLong) {
                k.this.G = true;
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<p.c> f7936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.t f7937b;
        public final int c;
        public final long d;

        public /* synthetic */ b(List list, com.google.android.exoplayer2.source.t tVar, int i, long j, a aVar) {
            this(list, tVar, i, j);
        }

        public b(List<p.c> list, com.google.android.exoplayer2.source.t tVar, int i, long j) {
            this.f7936a = list;
            this.f7937b = tVar;
            this.c = i;
            this.d = j;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7939b;
        public final int c;
        public final com.google.android.exoplayer2.source.t d;
    }

    public static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f7940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7941b;
        public long c;
        public Object d;

        public d(r rVar) {
            this.f7940a = rVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.d;
            if ((obj == null) != (dVar.d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f7941b - dVar.f7941b;
            return i != 0 ? i : wlq.p(this.c, dVar.c);
        }

        public void b(int i, long j, Object obj) {
            this.f7941b = i;
            this.c = j;
            this.d = obj;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public m0i f7943b;
        public int c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;

        public e(m0i m0iVar) {
            this.f7943b = m0iVar;
        }

        public void b(int i) {
            this.f7942a |= i > 0;
            this.c += i;
        }

        public void c(int i) {
            this.f7942a = true;
            this.f = true;
            this.g = i;
        }

        public void d(m0i m0iVar) {
            this.f7942a |= this.f7943b != m0iVar;
            this.f7943b = m0iVar;
        }

        public void e(int i) {
            if (this.d && this.e != 5) {
                rk1.a(i == 5);
                return;
            }
            this.f7942a = true;
            this.d = true;
            this.e = i;
        }
    }

    public interface f {
        void a(e eVar);
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.k.a f7944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7945b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public g(com.google.android.exoplayer2.source.k.a aVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f7944a = aVar;
            this.f7945b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f7946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7947b;
        public final long c;

        public h(v vVar, int i, long j) {
            this.f7946a = vVar;
            this.f7947b = i;
            this.c = j;
        }
    }

    public k(s[] sVarArr, bop bopVar, cop copVar, lie lieVar, gy1 gy1Var, int i, boolean z, o91 o91Var, brl brlVar, l lVar, long j, boolean z2, Looper looper, f14 f14Var, f fVar) {
        this.q = fVar;
        this.f7931a = sVarArr;
        this.c = bopVar;
        this.d = copVar;
        this.e = lieVar;
        this.f = gy1Var;
        this.D = i;
        this.E = z;
        this.v = brlVar;
        this.t = lVar;
        this.u = j;
        this.O = j;
        this.z = z2;
        this.p = f14Var;
        this.l = lieVar.f();
        this.m = lieVar.b();
        m0i m0iVarK = m0i.k(copVar);
        this.w = m0iVarK;
        this.x = new e(m0iVarK);
        this.f7932b = new rkk[sVarArr.length];
        for (int i2 = 0; i2 < sVarArr.length; i2++) {
            sVarArr[i2].setIndex(i2);
            this.f7932b[i2] = sVarArr[i2].getCapabilities();
        }
        this.n = new com.google.android.exoplayer2.h(this, f14Var);
        this.o = new ArrayList<>();
        this.j = new v.c();
        this.f7933k = new v.b();
        bopVar.b(this, gy1Var);
        this.M = true;
        Handler handler = new Handler(looper);
        this.f7934r = new o(o91Var, handler);
        this.s = new p(this, o91Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.h = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.i = looper2;
        this.g = f14Var.c(looper2, this);
    }

    public static boolean N(s sVar) {
        return sVar.getState() != 0;
    }

    public static boolean c1(m0i m0iVar, v.b bVar) {
        com.google.android.exoplayer2.source.k.a aVar = m0iVar.f25619b;
        v vVar = m0iVar.f25618a;
        return aVar.b() || vVar.q() || vVar.h(aVar.f27977a, bVar).f;
    }

    public static void q0(v vVar, d dVar, v.c cVar, v.b bVar) {
        int i = vVar.n(vVar.h(dVar.d, bVar).c, cVar).p;
        Object obj = vVar.g(i, bVar, true).f8447b;
        long j = bVar.d;
        dVar.b(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    public static boolean r0(d dVar, v vVar, v vVar2, int i, boolean z, v.c cVar, v.b bVar) {
        Object obj = dVar.d;
        if (obj == null) {
            Pair<Object, Long> pairU0 = u0(vVar, new h(dVar.f7940a.g(), dVar.f7940a.i(), dVar.f7940a.e() == Long.MIN_VALUE ? -9223372036854775807L : g83.c(dVar.f7940a.e())), false, i, z, cVar, bVar);
            if (pairU0 == null) {
                return false;
            }
            dVar.b(vVar.b(pairU0.first), ((Long) pairU0.second).longValue(), pairU0.first);
            if (dVar.f7940a.e() == Long.MIN_VALUE) {
                q0(vVar, dVar, cVar, bVar);
            }
            return true;
        }
        int iB = vVar.b(obj);
        if (iB == -1) {
            return false;
        }
        if (dVar.f7940a.e() == Long.MIN_VALUE) {
            q0(vVar, dVar, cVar, bVar);
            return true;
        }
        dVar.f7941b = iB;
        vVar2.h(dVar.d, bVar);
        if (bVar.f && vVar2.n(bVar.c, cVar).o == vVar2.b(dVar.d)) {
            Pair<Object, Long> pairJ = vVar.j(cVar, bVar, vVar.h(dVar.d, bVar).c, dVar.c + bVar.l());
            dVar.b(vVar.b(pairJ.first), ((Long) pairJ.second).longValue(), pairJ.first);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x014a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0168  */
    /* JADX WARN: Code duplicated, block: B:52:0x0174  */
    /* JADX WARN: Code duplicated, block: B:56:0x017c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0186  */
    /* JADX WARN: Code duplicated, block: B:67:0x019b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bd  */
    public static g t0(v vVar, m0i m0iVar, h hVar, o oVar, int i, boolean z, v.c cVar, v.b bVar) {
        com.google.android.exoplayer2.source.k.a aVar;
        int i2;
        com.google.android.exoplayer2.source.k.a aVar2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int iA;
        int iA2;
        boolean z5;
        long j;
        com.google.android.exoplayer2.source.k.a aVarZ;
        long j2;
        long jG;
        int i4;
        int i5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        if (vVar.q()) {
            return new g(m0i.l(), 0L, -9223372036854775807L, false, true, false);
        }
        com.google.android.exoplayer2.source.k.a aVar3 = m0iVar.f25619b;
        Object obj = aVar3.f27977a;
        boolean zC1 = c1(m0iVar, bVar);
        long jLongValue = zC1 ? m0iVar.c : m0iVar.s;
        boolean z10 = false;
        if (hVar == null) {
            aVar = aVar3;
            i2 = -1;
            if (!m0iVar.f25618a.q()) {
                if (vVar.b(obj) == -1) {
                    Object objV0 = v0(cVar, bVar, i, z, obj, m0iVar.f25618a, vVar);
                    if (objV0 == null) {
                        iA2 = vVar.a(z);
                        z5 = true;
                    } else {
                        iA2 = vVar.h(objV0, bVar).c;
                        z5 = false;
                    }
                    z3 = z5;
                    z2 = false;
                    z4 = false;
                } else if (!zC1) {
                    aVar2 = aVar;
                    i3 = -1;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                } else if (jLongValue == -9223372036854775807L) {
                    iA = vVar.h(obj, bVar).c;
                } else {
                    aVar2 = aVar;
                    m0iVar.f25618a.h(aVar2.f27977a, bVar);
                    if (m0iVar.f25618a.n(bVar.c, cVar).o == m0iVar.f25618a.b(aVar2.f27977a)) {
                        Pair<Object, Long> pairJ = vVar.j(cVar, bVar, vVar.h(obj, bVar).c, jLongValue + bVar.l());
                        obj = pairJ.first;
                        jLongValue = ((Long) pairJ.second).longValue();
                    }
                    i3 = -1;
                    z2 = false;
                    z3 = false;
                    z4 = true;
                }
                if (i3 != i2) {
                    Pair<Object, Long> pairJ2 = vVar.j(cVar, bVar, i3, -9223372036854775807L);
                    obj = pairJ2.first;
                    jLongValue = ((Long) pairJ2.second).longValue();
                    j = -9223372036854775807L;
                } else {
                    j = jLongValue;
                }
                aVarZ = oVar.z(vVar, obj, jLongValue);
                if (aVarZ.e != i2 || ((i4 = aVar2.e) != i2 && aVarZ.f27978b >= i4)) {
                    z10 = true;
                }
                if (aVar2.f27977a.equals(obj) && !aVar2.b() && !aVarZ.b() && z10) {
                    aVarZ = aVar2;
                }
                if (aVarZ.b()) {
                    if (aVarZ.equals(aVar2)) {
                        jG = m0iVar.s;
                    } else {
                        vVar.h(aVarZ.f27977a, bVar);
                        if (aVarZ.c == bVar.i(aVarZ.f27978b)) {
                            jG = bVar.g();
                        } else {
                            jG = 0;
                        }
                    }
                    j2 = jG;
                } else {
                    j2 = jLongValue;
                }
                return new g(aVarZ, j2, j, z2, z3, z4);
            }
            iA = vVar.a(z);
            i3 = iA;
            z2 = false;
            z3 = false;
            z4 = false;
            aVar2 = aVar;
            if (i3 != i2) {
                Pair<Object, Long> pairJ3 = vVar.j(cVar, bVar, i3, -9223372036854775807L);
                obj = pairJ3.first;
                jLongValue = ((Long) pairJ3.second).longValue();
                j = -9223372036854775807L;
            } else {
                j = jLongValue;
            }
            aVarZ = oVar.z(vVar, obj, jLongValue);
            if (aVarZ.e != i2) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (aVar2.f27977a.equals(obj)) {
                aVarZ = aVar2;
            }
            if (aVarZ.b()) {
                if (aVarZ.equals(aVar2)) {
                    jG = m0iVar.s;
                } else {
                    vVar.h(aVarZ.f27977a, bVar);
                    if (aVarZ.c == bVar.i(aVarZ.f27978b)) {
                        jG = bVar.g();
                    } else {
                        jG = 0;
                    }
                }
                j2 = jG;
            } else {
                j2 = jLongValue;
            }
            return new g(aVarZ, j2, j, z2, z3, z4);
        }
        aVar = aVar3;
        i2 = -1;
        Pair<Object, Long> pairU0 = u0(vVar, hVar, true, i, z, cVar, bVar);
        if (pairU0 == null) {
            iA2 = vVar.a(z);
            z9 = false;
            z7 = false;
            z8 = true;
        } else {
            if (hVar.c == -9223372036854775807L) {
                i5 = vVar.h(pairU0.first, bVar).c;
                z6 = false;
            } else {
                obj = pairU0.first;
                jLongValue = ((Long) pairU0.second).longValue();
                i5 = -1;
                z6 = true;
            }
            z7 = m0iVar.e == 4;
            z8 = false;
            z9 = z6;
            iA2 = i5;
        }
        z4 = z9;
        z2 = z7;
        z3 = z8;
        aVar2 = aVar;
        i3 = iA2;
        if (i3 != i2) {
            Pair<Object, Long> pairJ4 = vVar.j(cVar, bVar, i3, -9223372036854775807L);
            obj = pairJ4.first;
            jLongValue = ((Long) pairJ4.second).longValue();
            j = -9223372036854775807L;
        } else {
            j = jLongValue;
        }
        aVarZ = oVar.z(vVar, obj, jLongValue);
        if (aVarZ.e != i2) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (aVar2.f27977a.equals(obj)) {
            aVarZ = aVar2;
        }
        if (aVarZ.b()) {
            if (aVarZ.equals(aVar2)) {
                jG = m0iVar.s;
            } else {
                vVar.h(aVarZ.f27977a, bVar);
                if (aVarZ.c == bVar.i(aVarZ.f27978b)) {
                    jG = bVar.g();
                } else {
                    jG = 0;
                }
            }
            j2 = jG;
        } else {
            j2 = jLongValue;
        }
        return new g(aVarZ, j2, j, z2, z3, z4);
    }

    public static Pair<Object, Long> u0(v vVar, h hVar, boolean z, int i, boolean z2, v.c cVar, v.b bVar) {
        Object objV0;
        v vVar2 = hVar.f7946a;
        if (vVar.q()) {
            return null;
        }
        v vVar3 = vVar2.q() ? vVar : vVar2;
        try {
            Pair<Object, Long> pairJ = vVar3.j(cVar, bVar, hVar.f7947b, hVar.c);
            if (vVar.equals(vVar3)) {
                return pairJ;
            }
            if (vVar.b(pairJ.first) != -1) {
                return (vVar3.h(pairJ.first, bVar).f && vVar3.n(bVar.c, cVar).o == vVar3.b(pairJ.first)) ? vVar.j(cVar, bVar, vVar.h(pairJ.first, bVar).c, hVar.c) : pairJ;
            }
            if (z && (objV0 = v0(cVar, bVar, i, z2, pairJ.first, vVar3, vVar)) != null) {
                return vVar.j(cVar, bVar, vVar.h(objV0, bVar).c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static Object v0(v.c cVar, v.b bVar, int i, boolean z, Object obj, v vVar, v vVar2) {
        int iB = vVar.b(obj);
        int i2 = vVar.i();
        int iD = iB;
        int iB2 = -1;
        for (int i3 = 0; i3 < i2 && iB2 == -1; i3++) {
            iD = vVar.d(iD, bVar, cVar, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = vVar2.b(vVar.m(iD));
        }
        if (iB2 == -1) {
            return null;
        }
        return vVar2.m(iB2);
    }

    public static Format[] x(com.google.android.exoplayer2.trackselection.b bVar) {
        int length = bVar != null ? bVar.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = bVar.l(i);
        }
        return formatArr;
    }

    public final Pair<com.google.android.exoplayer2.source.k.a, Long> A(v vVar) {
        if (vVar.q()) {
            return Pair.create(m0i.l(), 0L);
        }
        Pair<Object, Long> pairJ = vVar.j(this.j, this.f7933k, vVar.a(this.E), -9223372036854775807L);
        com.google.android.exoplayer2.source.k.a aVarZ = this.f7934r.z(vVar, pairJ.first, 0L);
        long jLongValue = ((Long) pairJ.second).longValue();
        if (aVarZ.b()) {
            vVar.h(aVarZ.f27977a, this.f7933k);
            jLongValue = aVarZ.c == this.f7933k.i(aVarZ.f27978b) ? this.f7933k.g() : 0L;
        }
        return Pair.create(aVarZ, Long.valueOf(jLongValue));
    }

    public final long A0(com.google.android.exoplayer2.source.k.a aVar, long j, boolean z) throws ExoPlaybackException {
        return B0(aVar, j, this.f7934r.o() != this.f7934r.p(), z);
    }

    public Looper B() {
        return this.i;
    }

    public final long B0(com.google.android.exoplayer2.source.k.a aVar, long j, boolean z, boolean z2) throws ExoPlaybackException {
        g1();
        this.B = false;
        if (z2 || this.w.e == 3) {
            W0(2);
        }
        mjf mjfVarO = this.f7934r.o();
        mjf mjfVarJ = mjfVarO;
        while (mjfVarJ != null && !aVar.equals(mjfVarJ.f.f29217a)) {
            mjfVarJ = mjfVarJ.j();
        }
        if (z || mjfVarO != mjfVarJ || (mjfVarJ != null && mjfVarJ.z(j) < 0)) {
            for (s sVar : this.f7931a) {
                n(sVar);
            }
            if (mjfVarJ != null) {
                while (this.f7934r.o() != mjfVarJ) {
                    this.f7934r.b();
                }
                this.f7934r.y(mjfVarJ);
                mjfVarJ.x(0L);
                r();
            }
        }
        if (mjfVarJ != null) {
            this.f7934r.y(mjfVarJ);
            if (mjfVarJ.d) {
                long j2 = mjfVarJ.f.e;
                if (j2 != -9223372036854775807L && j >= j2) {
                    j = Math.max(0L, j2 - 1);
                }
                if (mjfVarJ.e) {
                    j = mjfVarJ.f26926a.i(j);
                    mjfVarJ.f26926a.u(j - this.l, this.m);
                }
            } else {
                mjfVarJ.f = mjfVarJ.f.b(j);
            }
            p0(j);
            R();
        } else {
            this.f7934r.f();
            p0(j);
        }
        F(false);
        this.g.h(2);
        return j;
    }

    public final long C() {
        return D(this.w.q);
    }

    public final void C0(r rVar) throws ExoPlaybackException {
        if (rVar.e() == -9223372036854775807L) {
            D0(rVar);
            return;
        }
        if (this.w.f25618a.q()) {
            this.o.add(new d(rVar));
            return;
        }
        d dVar = new d(rVar);
        v vVar = this.w.f25618a;
        if (!r0(dVar, vVar, vVar, this.D, this.E, this.j, this.f7933k)) {
            rVar.k(false);
        } else {
            this.o.add(dVar);
            Collections.sort(this.o);
        }
    }

    public final long D(long j) {
        mjf mjfVarJ = this.f7934r.j();
        if (mjfVarJ == null) {
            return 0L;
        }
        return Math.max(0L, j - mjfVarJ.y(this.K));
    }

    public final void D0(r rVar) throws ExoPlaybackException {
        if (rVar.c() != this.i) {
            this.g.c(15, rVar).a();
            return;
        }
        l(rVar);
        int i = this.w.e;
        if (i == 3 || i == 2) {
            this.g.h(2);
        }
    }

    public final void E(com.google.android.exoplayer2.source.j jVar) {
        if (this.f7934r.u(jVar)) {
            this.f7934r.x(this.K);
            R();
        }
    }

    public final void E0(final r rVar) {
        Looper looperC = rVar.c();
        if (looperC.getThread().isAlive()) {
            this.p.c(looperC, null).post(new Runnable() { // from class: oi8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29194a.Q(rVar);
                }
            });
        } else {
            toe.h("TAG", "Trying to send message on a dead thread.");
            rVar.k(false);
        }
    }

    public final void F(boolean z) {
        mjf mjfVarJ = this.f7934r.j();
        com.google.android.exoplayer2.source.k.a aVar = mjfVarJ == null ? this.w.f25619b : mjfVarJ.f.f29217a;
        boolean z2 = !this.w.f25620k.equals(aVar);
        if (z2) {
            this.w = this.w.b(aVar);
        }
        m0i m0iVar = this.w;
        m0iVar.q = mjfVarJ == null ? m0iVar.s : mjfVarJ.i();
        this.w.f25621r = C();
        if ((z2 || z) && mjfVarJ != null && mjfVarJ.d) {
            j1(mjfVarJ.n(), mjfVarJ.o());
        }
    }

    public final void F0(long j) {
        for (s sVar : this.f7931a) {
            if (sVar.getStream() != null) {
                G0(sVar, j);
            }
        }
    }

    public final void G(v vVar, boolean z) throws Throwable {
        int i;
        int i2;
        boolean z2;
        g gVarT0 = t0(vVar, this.w, this.J, this.f7934r, this.D, this.E, this.j, this.f7933k);
        com.google.android.exoplayer2.source.k.a aVar = gVarT0.f7944a;
        long j = gVarT0.c;
        boolean z3 = gVarT0.d;
        long jA0 = gVarT0.f7945b;
        boolean z4 = (this.w.f25619b.equals(aVar) && jA0 == this.w.s) ? false : true;
        h hVar = null;
        try {
            if (gVarT0.e) {
                if (this.w.e != 1) {
                    W0(4);
                }
                n0(false, false, false, true);
            }
            try {
                if (z4) {
                    i2 = 4;
                    z2 = false;
                    if (!vVar.q()) {
                        for (mjf mjfVarO = this.f7934r.o(); mjfVarO != null; mjfVarO = mjfVarO.j()) {
                            if (mjfVarO.f.f29217a.equals(aVar)) {
                                mjfVarO.f = this.f7934r.q(vVar, mjfVarO.f);
                            }
                        }
                        jA0 = A0(aVar, jA0, z3);
                    }
                } else {
                    try {
                        try {
                            i2 = 4;
                            z2 = false;
                            if (!this.f7934r.E(vVar, this.K, z())) {
                                y0(false);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = 4;
                            hVar = null;
                            m0i m0iVar = this.w;
                            h hVar2 = hVar;
                            i1(vVar, aVar, m0iVar.f25618a, m0iVar.f25619b, gVarT0.f ? jA0 : -9223372036854775807L);
                            if (z4 || j != this.w.c) {
                                m0i m0iVar2 = this.w;
                                Object obj = m0iVar2.f25619b.f27977a;
                                v vVar2 = m0iVar2.f25618a;
                                this.w = K(aVar, jA0, j, this.w.d, z4 && z && !vVar2.q() && !vVar2.h(obj, this.f7933k).f, vVar.b(obj) == -1 ? i : 3);
                            }
                            o0();
                            s0(vVar, this.w.f25618a);
                            this.w = this.w.j(vVar);
                            if (!vVar.q()) {
                                this.J = hVar2;
                            }
                            F(false);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i = 4;
                    }
                }
                m0i m0iVar3 = this.w;
                i1(vVar, aVar, m0iVar3.f25618a, m0iVar3.f25619b, gVarT0.f ? jA0 : -9223372036854775807L);
                if (z4 || j != this.w.c) {
                    m0i m0iVar4 = this.w;
                    Object obj2 = m0iVar4.f25619b.f27977a;
                    v vVar3 = m0iVar4.f25618a;
                    this.w = K(aVar, jA0, j, this.w.d, (!z4 || !z || vVar3.q() || vVar3.h(obj2, this.f7933k).f) ? z2 : true, vVar.b(obj2) == -1 ? i2 : 3);
                }
                o0();
                s0(vVar, this.w.f25618a);
                this.w = this.w.j(vVar);
                if (!vVar.q()) {
                    this.J = null;
                }
                F(z2);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            i = 4;
        }
    }

    public final void G0(s sVar, long j) {
        sVar.q();
        if (sVar instanceof l8p) {
            ((l8p) sVar).W(j);
        }
    }

    public final void H(com.google.android.exoplayer2.source.j jVar) throws ExoPlaybackException {
        if (this.f7934r.u(jVar)) {
            mjf mjfVarJ = this.f7934r.j();
            mjfVarJ.p(this.n.c().f27406a, this.w.f25618a);
            j1(mjfVarJ.n(), mjfVarJ.o());
            if (mjfVarJ == this.f7934r.o()) {
                p0(mjfVarJ.f.f29218b);
                r();
                m0i m0iVar = this.w;
                com.google.android.exoplayer2.source.k.a aVar = m0iVar.f25619b;
                long j = mjfVarJ.f.f29218b;
                this.w = K(aVar, j, m0iVar.c, j, false, 5);
            }
            R();
        }
    }

    public final void H0(boolean z, AtomicBoolean atomicBoolean) {
        if (this.F != z) {
            this.F = z;
            if (!z) {
                for (s sVar : this.f7931a) {
                    if (!N(sVar)) {
                        sVar.reset();
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

    public final void I(n0i n0iVar, float f2, boolean z, boolean z2) throws ExoPlaybackException {
        if (z) {
            if (z2) {
                this.x.b(1);
            }
            this.w = this.w.g(n0iVar);
        }
        m1(n0iVar.f27406a);
        for (s sVar : this.f7931a) {
            if (sVar != null) {
                sVar.w(f2, n0iVar.f27406a);
            }
        }
    }

    public final void I0(b bVar) throws Throwable {
        this.x.b(1);
        if (bVar.c != -1) {
            this.J = new h(new j1i(bVar.f7936a, bVar.f7937b), bVar.c, bVar.d);
        }
        G(this.s.C(bVar.f7936a, bVar.f7937b), false);
    }

    public final void J(n0i n0iVar, boolean z) throws ExoPlaybackException {
        I(n0iVar, n0iVar.f27406a, true, z);
    }

    public void J0(List<p.c> list, int i, long j, com.google.android.exoplayer2.source.t tVar) {
        this.g.c(17, new b(list, tVar, i, j, null)).a();
    }

    @CheckResult
    public final m0i K(com.google.android.exoplayer2.source.k.a aVar, long j, long j2, long j3, boolean z, int i) {
        List<Metadata> listOf;
        TrackGroupArray trackGroupArray;
        cop copVar;
        this.M = (!this.M && j == this.w.s && aVar.equals(this.w.f25619b)) ? false : true;
        o0();
        m0i m0iVar = this.w;
        TrackGroupArray trackGroupArray2 = m0iVar.h;
        cop copVar2 = m0iVar.i;
        List<Metadata> list = m0iVar.j;
        if (this.s.s()) {
            mjf mjfVarO = this.f7934r.o();
            TrackGroupArray trackGroupArrayN = mjfVarO == null ? TrackGroupArray.EMPTY : mjfVarO.n();
            cop copVarO = mjfVarO == null ? this.d : mjfVarO.o();
            ImmutableList<Metadata> immutableListV = v(copVarO.c);
            if (mjfVarO != null) {
                ojf ojfVar = mjfVarO.f;
                if (ojfVar.c != j2) {
                    mjfVarO.f = ojfVar.a(j2);
                }
            }
            trackGroupArray = trackGroupArrayN;
            copVar = copVarO;
            listOf = immutableListV;
        } else if (aVar.equals(this.w.f25619b)) {
            listOf = list;
            trackGroupArray = trackGroupArray2;
            copVar = copVar2;
        } else {
            trackGroupArray = TrackGroupArray.EMPTY;
            copVar = this.d;
            listOf = ImmutableList.of();
        }
        if (z) {
            this.x.e(i);
        }
        return this.w.c(aVar, j, j2, j3, C(), trackGroupArray, copVar, listOf);
    }

    public final void K0(boolean z) {
        if (z == this.H) {
            return;
        }
        this.H = z;
        m0i m0iVar = this.w;
        int i = m0iVar.e;
        if (z || i == 4 || i == 1) {
            this.w = m0iVar.d(z);
        } else {
            this.g.h(2);
        }
    }

    public final boolean L() {
        mjf mjfVarP = this.f7934r.p();
        if (!mjfVarP.d) {
            return false;
        }
        int i = 0;
        while (true) {
            s[] sVarArr = this.f7931a;
            if (i >= sVarArr.length) {
                return true;
            }
            s sVar = sVarArr[i];
            k9l k9lVar = mjfVarP.c[i];
            if (sVar.getStream() != k9lVar || (k9lVar != null && !sVar.f())) {
                return false;
            }
            i++;
        }
    }

    public final void L0(boolean z) throws ExoPlaybackException {
        this.z = z;
        o0();
        if (!this.A || this.f7934r.p() == this.f7934r.o()) {
            return;
        }
        y0(true);
        F(false);
    }

    public final boolean M() {
        mjf mjfVarJ = this.f7934r.j();
        return (mjfVarJ == null || mjfVarJ.k() == Long.MIN_VALUE) ? false : true;
    }

    public void M0(boolean z, int i) {
        this.g.e(1, z ? 1 : 0, i).a();
    }

    public final void N0(boolean z, int i, boolean z2, int i2) throws ExoPlaybackException {
        this.x.b(z2 ? 1 : 0);
        this.x.c(i2);
        this.w = this.w.e(z, i);
        this.B = false;
        c0(z);
        if (!Z0()) {
            g1();
            l1();
            return;
        }
        int i3 = this.w.e;
        if (i3 == 3) {
            d1();
            this.g.h(2);
        } else if (i3 == 2) {
            this.g.h(2);
        }
    }

    public final boolean O() {
        mjf mjfVarO = this.f7934r.o();
        long j = mjfVarO.f.e;
        return mjfVarO.d && (j == -9223372036854775807L || this.w.s < j || !Z0());
    }

    public void O0(n0i n0iVar) {
        this.g.c(4, n0iVar).a();
    }

    public final /* synthetic */ Boolean P() {
        return Boolean.valueOf(this.y);
    }

    public final void P0(n0i n0iVar) throws ExoPlaybackException {
        this.n.d(n0iVar);
        J(this.n.c(), true);
    }

    public final /* synthetic */ void Q(r rVar) {
        try {
            l(rVar);
        } catch (ExoPlaybackException e2) {
            toe.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    public void Q0(int i) {
        this.g.e(11, i, 0).a();
    }

    public final void R() {
        boolean zY0 = Y0();
        this.C = zY0;
        if (zY0) {
            this.f7934r.j().d(this.K);
        }
        h1();
    }

    public final void R0(int i) throws ExoPlaybackException {
        this.D = i;
        if (!this.f7934r.F(this.w.f25618a, i)) {
            y0(true);
        }
        F(false);
    }

    public final void S() {
        this.x.d(this.w);
        if (this.x.f7942a) {
            this.q.a(this.x);
            this.x = new e(this.w);
        }
    }

    public final void S0(brl brlVar) {
        this.v = brlVar;
    }

    public final boolean T(long j, long j2) {
        if (this.H && this.G) {
            return false;
        }
        w0(j, j2);
        return true;
    }

    public void T0(boolean z) {
        this.g.e(12, z ? 1 : 0, 0).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(long r9, long r11) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.k.U(long, long):void");
    }

    public final void U0(boolean z) throws ExoPlaybackException {
        this.E = z;
        if (!this.f7934r.G(this.w.f25618a, z)) {
            y0(true);
        }
        F(false);
    }

    public final void V() throws ExoPlaybackException {
        ojf ojfVarN;
        this.f7934r.x(this.K);
        if (this.f7934r.C() && (ojfVarN = this.f7934r.n(this.K, this.w)) != null) {
            mjf mjfVarG = this.f7934r.g(this.f7932b, this.c, this.e.h(), this.s, ojfVarN, this.d);
            mjfVarG.f26926a.r(this, ojfVarN.f29218b);
            if (this.f7934r.o() == mjfVarG) {
                p0(mjfVarG.m());
            }
            F(false);
        }
        if (!this.C) {
            R();
        } else {
            this.C = M();
            h1();
        }
    }

    public final void V0(com.google.android.exoplayer2.source.t tVar) throws Throwable {
        this.x.b(1);
        G(this.s.D(tVar), false);
    }

    public final void W() throws ExoPlaybackException {
        boolean z = false;
        while (X0()) {
            if (z) {
                S();
            }
            mjf mjfVarO = this.f7934r.o();
            mjf mjfVarB = this.f7934r.b();
            ojf ojfVar = mjfVarB.f;
            com.google.android.exoplayer2.source.k.a aVar = ojfVar.f29217a;
            long j = ojfVar.f29218b;
            m0i m0iVarK = K(aVar, j, ojfVar.c, j, true, 0);
            this.w = m0iVarK;
            v vVar = m0iVarK.f25618a;
            i1(vVar, mjfVarB.f.f29217a, vVar, mjfVarO.f.f29217a, -9223372036854775807L);
            o0();
            l1();
            z = true;
        }
    }

    public final void W0(int i) {
        m0i m0iVar = this.w;
        if (m0iVar.e != i) {
            this.w = m0iVar.h(i);
        }
    }

    public final void X() {
        mjf mjfVarP = this.f7934r.p();
        if (mjfVarP == null) {
            return;
        }
        int i = 0;
        if (mjfVarP.j() != null && !this.A) {
            if (L()) {
                if (mjfVarP.j().d || this.K >= mjfVarP.j().m()) {
                    cop copVarO = mjfVarP.o();
                    mjf mjfVarC = this.f7934r.c();
                    cop copVarO2 = mjfVarC.o();
                    if (mjfVarC.d && mjfVarC.f26926a.j() != -9223372036854775807L) {
                        F0(mjfVarC.m());
                        return;
                    }
                    for (int i2 = 0; i2 < this.f7931a.length; i2++) {
                        boolean zC = copVarO.c(i2);
                        boolean zC2 = copVarO2.c(i2);
                        if (zC && !this.f7931a[i2].j()) {
                            boolean z = this.f7932b[i2].e() == 7;
                            skk skkVar = copVarO.f14571b[i2];
                            skk skkVar2 = copVarO2.f14571b[i2];
                            if (!zC2 || !skkVar2.equals(skkVar) || z) {
                                G0(this.f7931a[i2], mjfVarC.m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!mjfVarP.f.h && !this.A) {
            return;
        }
        while (true) {
            s[] sVarArr = this.f7931a;
            if (i >= sVarArr.length) {
                return;
            }
            s sVar = sVarArr[i];
            k9l k9lVar = mjfVarP.c[i];
            if (k9lVar != null && sVar.getStream() == k9lVar && sVar.f()) {
                long j = mjfVarP.f.e;
                G0(sVar, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : mjfVarP.l() + mjfVarP.f.e);
            }
            i++;
        }
    }

    public final boolean X0() {
        mjf mjfVarO;
        mjf mjfVarJ;
        return Z0() && !this.A && (mjfVarO = this.f7934r.o()) != null && (mjfVarJ = mjfVarO.j()) != null && this.K >= mjfVarJ.m() && mjfVarJ.g;
    }

    public final void Y() throws ExoPlaybackException {
        mjf mjfVarP = this.f7934r.p();
        if (mjfVarP == null || this.f7934r.o() == mjfVarP || mjfVarP.g || !l0()) {
            return;
        }
        r();
    }

    public final boolean Y0() {
        if (!M()) {
            return false;
        }
        mjf mjfVarJ = this.f7934r.j();
        return this.e.e(mjfVarJ == this.f7934r.o() ? mjfVarJ.y(this.K) : mjfVarJ.y(this.K) - mjfVarJ.f.f29218b, D(mjfVarJ.k()), this.n.c().f27406a);
    }

    public final void Z() throws Throwable {
        G(this.s.i(), true);
    }

    public final boolean Z0() {
        m0i m0iVar = this.w;
        return m0iVar.l && m0iVar.m == 0;
    }

    public final void a0(c cVar) throws Throwable {
        this.x.b(1);
        G(this.s.v(cVar.f7938a, cVar.f7939b, cVar.c, cVar.d), false);
    }

    public final boolean a1(boolean z) {
        if (this.I == 0) {
            return O();
        }
        if (!z) {
            return false;
        }
        m0i m0iVar = this.w;
        if (!m0iVar.g) {
            return true;
        }
        long jC = b1(m0iVar.f25618a, this.f7934r.o().f.f29217a) ? this.t.c() : -9223372036854775807L;
        mjf mjfVarJ = this.f7934r.j();
        return (mjfVarJ.q() && mjfVarJ.f.h) || (mjfVarJ.f.f29217a.b() && !mjfVarJ.d) || this.e.g(C(), this.n.c().f27406a, this.B, jC);
    }

    @Override // bop.a
    public void b() {
        this.g.h(10);
    }

    public final void b0() {
        for (mjf mjfVarO = this.f7934r.o(); mjfVarO != null; mjfVarO = mjfVarO.j()) {
            for (com.google.android.exoplayer2.trackselection.b bVar : mjfVarO.o().c) {
                if (bVar != null) {
                    bVar.d();
                }
            }
        }
    }

    public final boolean b1(v vVar, com.google.android.exoplayer2.source.k.a aVar) {
        if (aVar.b() || vVar.q()) {
            return false;
        }
        vVar.n(vVar.h(aVar.f27977a, this.f7933k).c, this.j);
        if (!this.j.f()) {
            return false;
        }
        v.c cVar = this.j;
        return cVar.i && cVar.f != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.p.d
    public void c() {
        this.g.h(22);
    }

    public final void c0(boolean z) {
        for (mjf mjfVarO = this.f7934r.o(); mjfVarO != null; mjfVarO = mjfVarO.j()) {
            for (com.google.android.exoplayer2.trackselection.b bVar : mjfVarO.o().c) {
                if (bVar != null) {
                    bVar.p(z);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.r.a
    public synchronized void d(r rVar) {
        if (!this.y && this.h.isAlive()) {
            this.g.c(14, rVar).a();
            return;
        }
        toe.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        rVar.k(false);
    }

    public final void d0() {
        for (mjf mjfVarO = this.f7934r.o(); mjfVarO != null; mjfVarO = mjfVarO.j()) {
            for (com.google.android.exoplayer2.trackselection.b bVar : mjfVarO.o().c) {
                if (bVar != null) {
                    bVar.j();
                }
            }
        }
    }

    public final void d1() throws ExoPlaybackException {
        this.B = false;
        this.n.g();
        for (s sVar : this.f7931a) {
            if (N(sVar)) {
                sVar.start();
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.s.a
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void k(com.google.android.exoplayer2.source.j jVar) {
        this.g.c(9, jVar).a();
    }

    public void e1() {
        this.g.a(6).a();
    }

    public void f0() {
        this.g.a(0).a();
    }

    public final void f1(boolean z, boolean z2) {
        n0(z || !this.F, false, true, false);
        this.x.b(z2 ? 1 : 0);
        this.e.onStopped();
        W0(1);
    }

    public final void g0() {
        this.x.b(1);
        n0(false, false, false, true);
        this.e.a();
        W0(this.w.f25618a.q() ? 4 : 2);
        this.s.w(this.f.g());
        this.g.h(2);
    }

    public final void g1() throws ExoPlaybackException {
        this.n.h();
        for (s sVar : this.f7931a) {
            if (N(sVar)) {
                t(sVar);
            }
        }
    }

    public synchronized boolean h0() {
        if (!this.y && this.h.isAlive()) {
            this.g.h(7);
            n1(new spo() { // from class: ni8
                @Override // defpackage.spo
                public final Object get() {
                    return this.f27957a.P();
                }
            }, this.u);
            return this.y;
        }
        return true;
    }

    public final void h1() {
        mjf mjfVarJ = this.f7934r.j();
        boolean z = this.C || (mjfVarJ != null && mjfVarJ.f26926a.h());
        m0i m0iVar = this.w;
        if (z != m0iVar.g) {
            this.w = m0iVar.a(z);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        mjf mjfVarP;
        try {
            switch (message.what) {
                case 0:
                    g0();
                    break;
                case 1:
                    N0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    p();
                    break;
                case 3:
                    z0((h) message.obj);
                    break;
                case 4:
                    P0((n0i) message.obj);
                    break;
                case 5:
                    S0((brl) message.obj);
                    break;
                case 6:
                    f1(false, true);
                    break;
                case 7:
                    i0();
                    return true;
                case 8:
                    H((com.google.android.exoplayer2.source.j) message.obj);
                    break;
                case 9:
                    E((com.google.android.exoplayer2.source.j) message.obj);
                    break;
                case 10:
                    m0();
                    break;
                case 11:
                    R0(message.arg1);
                    break;
                case 12:
                    U0(message.arg1 != 0);
                    break;
                case 13:
                    H0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    C0((r) message.obj);
                    break;
                case 15:
                    E0((r) message.obj);
                    break;
                case 16:
                    J((n0i) message.obj, false);
                    break;
                case 17:
                    I0((b) message.obj);
                    break;
                case 18:
                    i((b) message.obj, message.arg1);
                    break;
                case 19:
                    a0((c) message.obj);
                    break;
                case 20:
                    j0(message.arg1, message.arg2, (com.google.android.exoplayer2.source.t) message.obj);
                    break;
                case 21:
                    V0((com.google.android.exoplayer2.source.t) message.obj);
                    break;
                case 22:
                    Z();
                    break;
                case 23:
                    L0(message.arg1 != 0);
                    break;
                case 24:
                    K0(message.arg1 == 1);
                    break;
                case 25:
                    j();
                    break;
                default:
                    return false;
            }
            S();
        } catch (ExoPlaybackException e2) {
            e = e2;
            if (e.type == 1 && (mjfVarP = this.f7934r.p()) != null) {
                e = e.copyWithMediaPeriodId(mjfVarP.f.f29217a);
            }
            if (e.isRecoverable && this.N == null) {
                toe.i("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.N = e;
                skb skbVar = this.g;
                skbVar.f(skbVar.c(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.N;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.N;
                }
                toe.d("ExoPlayerImplInternal", "Playback error", e);
                f1(true, false);
                this.w = this.w.f(e);
            }
            S();
        } catch (IOException e3) {
            ExoPlaybackException exoPlaybackExceptionCreateForSource = ExoPlaybackException.createForSource(e3);
            mjf mjfVarO = this.f7934r.o();
            if (mjfVarO != null) {
                exoPlaybackExceptionCreateForSource = exoPlaybackExceptionCreateForSource.copyWithMediaPeriodId(mjfVarO.f.f29217a);
            }
            toe.d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionCreateForSource);
            f1(false, false);
            this.w = this.w.f(exoPlaybackExceptionCreateForSource);
            S();
        } catch (RuntimeException e4) {
            ExoPlaybackException exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForUnexpected(e4);
            toe.d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionCreateForUnexpected);
            f1(true, false);
            this.w = this.w.f(exoPlaybackExceptionCreateForUnexpected);
            S();
        }
        return true;
    }

    public final void i(b bVar, int i) throws Throwable {
        this.x.b(1);
        p pVar = this.s;
        if (i == -1) {
            i = pVar.q();
        }
        G(pVar.f(i, bVar.f7936a, bVar.f7937b), false);
    }

    public final void i0() {
        n0(true, false, true, false);
        this.e.d();
        W0(1);
        this.h.quit();
        synchronized (this) {
            this.y = true;
            notifyAll();
        }
    }

    public final void i1(v vVar, com.google.android.exoplayer2.source.k.a aVar, v vVar2, com.google.android.exoplayer2.source.k.a aVar2, long j) {
        if (vVar.q() || !b1(vVar, aVar)) {
            float f2 = this.n.c().f27406a;
            n0i n0iVar = this.w.n;
            if (f2 != n0iVar.f27406a) {
                this.n.d(n0iVar);
                return;
            }
            return;
        }
        vVar.n(vVar.h(aVar.f27977a, this.f7933k).c, this.j);
        this.t.a((m.f) wlq.j(this.j.f8451k));
        if (j != -9223372036854775807L) {
            this.t.e(y(vVar, aVar.f27977a, j));
            return;
        }
        if (wlq.c(!vVar2.q() ? vVar2.n(vVar2.h(aVar2.f27977a, this.f7933k).c, this.j).f8449a : null, this.j.f8449a)) {
            return;
        }
        this.t.e(-9223372036854775807L);
    }

    public final void j() throws ExoPlaybackException {
        y0(true);
    }

    public final void j0(int i, int i2, com.google.android.exoplayer2.source.t tVar) throws Throwable {
        this.x.b(1);
        G(this.s.A(i, i2, tVar), false);
    }

    public final void j1(TrackGroupArray trackGroupArray, cop copVar) {
        this.e.c(this.f7931a, trackGroupArray, copVar.c);
    }

    public void k0(int i, int i2, com.google.android.exoplayer2.source.t tVar) {
        this.g.g(20, i, i2, tVar).a();
    }

    public final void k1() throws ExoPlaybackException, IOException {
        if (this.w.f25618a.q() || !this.s.s()) {
            return;
        }
        V();
        X();
        Y();
        W();
    }

    public final void l(r rVar) throws ExoPlaybackException {
        if (rVar.j()) {
            return;
        }
        try {
            rVar.f().h(rVar.h(), rVar.d());
        } finally {
            rVar.k(true);
        }
    }

    public final boolean l0() throws ExoPlaybackException {
        mjf mjfVarP = this.f7934r.p();
        cop copVarO = mjfVarP.o();
        int i = 0;
        boolean z = false;
        while (true) {
            s[] sVarArr = this.f7931a;
            if (i >= sVarArr.length) {
                return !z;
            }
            s sVar = sVarArr[i];
            if (N(sVar)) {
                boolean z2 = sVar.getStream() != mjfVarP.c[i];
                if (!copVarO.c(i) || z2) {
                    if (!sVar.j()) {
                        sVar.i(x(copVarO.c[i]), mjfVarP.c[i], mjfVarP.m(), mjfVarP.l());
                    } else if (sVar.b()) {
                        n(sVar);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    public final void l1() throws ExoPlaybackException {
        mjf mjfVarO = this.f7934r.o();
        if (mjfVarO == null) {
            return;
        }
        long j = mjfVarO.d ? mjfVarO.f26926a.j() : -9223372036854775807L;
        if (j != -9223372036854775807L) {
            p0(j);
            if (j != this.w.s) {
                m0i m0iVar = this.w;
                this.w = K(m0iVar.f25619b, j, m0iVar.c, j, true, 5);
            }
        } else {
            long jI = this.n.i(mjfVarO != this.f7934r.p());
            this.K = jI;
            long jY = mjfVarO.y(jI);
            U(this.w.s, jY);
            this.w.s = jY;
        }
        this.w.q = this.f7934r.j().i();
        this.w.f25621r = C();
        m0i m0iVar2 = this.w;
        if (m0iVar2.l && m0iVar2.e == 3 && b1(m0iVar2.f25618a, m0iVar2.f25619b) && this.w.n.f27406a == 1.0f) {
            float fB = this.t.b(w(), C());
            if (this.n.c().f27406a != fB) {
                this.n.d(this.w.n.b(fB));
                I(this.w.n, this.n.c().f27406a, false, false);
            }
        }
    }

    public final void m0() throws ExoPlaybackException {
        float f2 = this.n.c().f27406a;
        mjf mjfVarP = this.f7934r.p();
        boolean z = true;
        for (mjf mjfVarO = this.f7934r.o(); mjfVarO != null && mjfVarO.d; mjfVarO = mjfVarO.j()) {
            cop copVarV = mjfVarO.v(f2, this.w.f25618a);
            if (!copVarV.a(mjfVarO.o())) {
                if (z) {
                    mjf mjfVarO2 = this.f7934r.o();
                    boolean zY = this.f7934r.y(mjfVarO2);
                    boolean[] zArr = new boolean[this.f7931a.length];
                    long jB = mjfVarO2.b(copVarV, this.w.s, zY, zArr);
                    m0i m0iVar = this.w;
                    boolean z2 = (m0iVar.e == 4 || jB == m0iVar.s) ? false : true;
                    m0i m0iVar2 = this.w;
                    this.w = K(m0iVar2.f25619b, jB, m0iVar2.c, m0iVar2.d, z2, 5);
                    if (z2) {
                        p0(jB);
                    }
                    boolean[] zArr2 = new boolean[this.f7931a.length];
                    int i = 0;
                    while (true) {
                        s[] sVarArr = this.f7931a;
                        if (i >= sVarArr.length) {
                            break;
                        }
                        s sVar = sVarArr[i];
                        boolean zN = N(sVar);
                        zArr2[i] = zN;
                        k9l k9lVar = mjfVarO2.c[i];
                        if (zN) {
                            if (k9lVar != sVar.getStream()) {
                                n(sVar);
                            } else if (zArr[i]) {
                                sVar.n(this.K);
                            }
                        }
                        i++;
                    }
                    s(zArr2);
                } else {
                    this.f7934r.y(mjfVarO);
                    if (mjfVarO.d) {
                        mjfVarO.a(copVarV, Math.max(mjfVarO.f.f29218b, mjfVarO.y(this.K)), false);
                    }
                }
                F(true);
                if (this.w.e != 4) {
                    R();
                    l1();
                    this.g.h(2);
                    return;
                }
                return;
            }
            if (mjfVarO == mjfVarP) {
                z = false;
            }
        }
    }

    public final void m1(float f2) {
        for (mjf mjfVarO = this.f7934r.o(); mjfVarO != null; mjfVarO = mjfVarO.j()) {
            for (com.google.android.exoplayer2.trackselection.b bVar : mjfVarO.o().c) {
                if (bVar != null) {
                    bVar.m(f2);
                }
            }
        }
    }

    public final void n(s sVar) throws ExoPlaybackException {
        if (N(sVar)) {
            this.n.a(sVar);
            t(sVar);
            sVar.disable();
            this.I--;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0090 A[PHI: r4 r5 r7
      0x0090: PHI (r4v3 com.google.android.exoplayer2.source.k$a) = (r4v2 com.google.android.exoplayer2.source.k$a), (r4v9 com.google.android.exoplayer2.source.k$a) binds: [B:26:0x0063, B:28:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:26:0x0063, B:28:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r7v4 long) = (r7v3 long), (r7v6 long) binds: [B:26:0x0063, B:28:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    public final void n0(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        this.g.j(2);
        this.N = null;
        this.B = false;
        this.n.h();
        this.K = 0L;
        for (s sVar : this.f7931a) {
            try {
                n(sVar);
            } catch (ExoPlaybackException | RuntimeException e2) {
                toe.d("ExoPlayerImplInternal", "Disable failed.", e2);
            }
        }
        if (z) {
            for (s sVar2 : this.f7931a) {
                try {
                    sVar2.reset();
                } catch (RuntimeException e3) {
                    toe.d("ExoPlayerImplInternal", "Reset failed.", e3);
                }
            }
        }
        this.I = 0;
        m0i m0iVar = this.w;
        com.google.android.exoplayer2.source.k.a aVar = m0iVar.f25619b;
        long jLongValue = m0iVar.s;
        long j = c1(this.w, this.f7933k) ? this.w.c : this.w.s;
        if (z2) {
            this.J = null;
            Pair<com.google.android.exoplayer2.source.k.a, Long> pairA = A(this.w.f25618a);
            aVar = (com.google.android.exoplayer2.source.k.a) pairA.first;
            jLongValue = ((Long) pairA.second).longValue();
            j = -9223372036854775807L;
            if (aVar.equals(this.w.f25619b)) {
                z5 = false;
            } else {
                z5 = true;
            }
        } else {
            z5 = false;
        }
        com.google.android.exoplayer2.source.k.a aVar2 = aVar;
        long j2 = jLongValue;
        this.f7934r.f();
        this.C = false;
        m0i m0iVar2 = this.w;
        v vVar = m0iVar2.f25618a;
        int i = m0iVar2.e;
        ExoPlaybackException exoPlaybackException = z4 ? null : m0iVar2.f;
        TrackGroupArray trackGroupArray = z5 ? TrackGroupArray.EMPTY : m0iVar2.h;
        cop copVar = z5 ? this.d : m0iVar2.i;
        List listOf = z5 ? ImmutableList.of() : m0iVar2.j;
        m0i m0iVar3 = this.w;
        this.w = new m0i(vVar, aVar2, j, j2, i, exoPlaybackException, false, trackGroupArray, copVar, listOf, aVar2, m0iVar3.l, m0iVar3.m, m0iVar3.n, j2, 0L, j2, this.H, false);
        if (z3) {
            this.s.y();
        }
    }

    public final synchronized void n1(spo<Boolean> spoVar, long j) {
        long jElapsedRealtime = this.p.elapsedRealtime() + j;
        boolean z = false;
        while (!spoVar.get().booleanValue() && j > 0) {
            try {
                this.p.b();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - this.p.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.google.android.exoplayer2.source.j.a
    public void o(com.google.android.exoplayer2.source.j jVar) {
        this.g.c(8, jVar).a();
    }

    public final void o0() {
        mjf mjfVarO = this.f7934r.o();
        this.A = mjfVarO != null && mjfVarO.f.g && this.z;
    }

    @Override // com.google.android.exoplayer2.h.a
    public void onPlaybackParametersChanged(n0i n0iVar) {
        this.g.c(16, n0iVar).a();
    }

    public final void p() throws ExoPlaybackException, IOException {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        long jA = this.p.a();
        k1();
        int i2 = this.w.e;
        if (i2 == 1 || i2 == 4) {
            this.g.j(2);
            return;
        }
        mjf mjfVarO = this.f7934r.o();
        if (mjfVarO == null) {
            w0(jA, 10L);
            return;
        }
        nkp.a("doSomeWork");
        l1();
        if (mjfVarO.d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            mjfVarO.f26926a.u(this.w.s - this.l, this.m);
            z = true;
            z2 = true;
            int i3 = 0;
            while (true) {
                s[] sVarArr = this.f7931a;
                if (i3 >= sVarArr.length) {
                    break;
                }
                s sVar = sVarArr[i3];
                if (N(sVar)) {
                    sVar.l(this.K, jElapsedRealtime);
                    z = z && sVar.b();
                    boolean z4 = mjfVarO.c[i3] != sVar.getStream();
                    boolean z5 = z4 || (!z4 && sVar.f()) || sVar.isReady() || sVar.b();
                    z2 = z2 && z5;
                    if (!z5) {
                        sVar.u();
                    }
                }
                i3++;
            }
        } else {
            mjfVarO.f26926a.t();
            z = true;
            z2 = true;
        }
        long j = mjfVarO.f.e;
        boolean z6 = z && mjfVarO.d && (j == -9223372036854775807L || j <= this.w.s);
        if (z6 && this.A) {
            this.A = false;
            N0(false, this.w.m, false, 5);
        }
        if (z6 && mjfVarO.f.h) {
            W0(4);
            g1();
        } else if (this.w.e == 2 && a1(z2)) {
            W0(3);
            this.N = null;
            if (Z0()) {
                d1();
            }
        } else if (this.w.e == 3 && (this.I != 0 ? !z2 : !O())) {
            this.B = Z0();
            W0(2);
            if (this.B) {
                d0();
                this.t.d();
            }
            g1();
        }
        if (this.w.e == 2) {
            int i4 = 0;
            while (true) {
                s[] sVarArr2 = this.f7931a;
                if (i4 >= sVarArr2.length) {
                    break;
                }
                if (N(sVarArr2[i4]) && this.f7931a[i4].getStream() == mjfVarO.c[i4]) {
                    this.f7931a[i4].u();
                }
                i4++;
            }
            m0i m0iVar = this.w;
            if (!m0iVar.g && m0iVar.f25621r < 500000 && M()) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        boolean z7 = this.H;
        m0i m0iVar2 = this.w;
        if (z7 != m0iVar2.o) {
            this.w = m0iVar2.d(z7);
        }
        if ((Z0() && this.w.e == 3) || (i = this.w.e) == 2) {
            z3 = !T(jA, 10L);
        } else {
            if (this.I == 0 || i == 4) {
                this.g.j(2);
            } else {
                w0(jA, 1000L);
            }
            z3 = false;
        }
        m0i m0iVar3 = this.w;
        if (m0iVar3.p != z3) {
            this.w = m0iVar3.i(z3);
        }
        this.G = false;
        nkp.c();
    }

    public final void p0(long j) throws ExoPlaybackException {
        mjf mjfVarO = this.f7934r.o();
        if (mjfVarO != null) {
            j = mjfVarO.z(j);
        }
        this.K = j;
        this.n.e(j);
        for (s sVar : this.f7931a) {
            if (N(sVar)) {
                sVar.n(this.K);
            }
        }
        b0();
    }

    public final void q(int i, boolean z) throws ExoPlaybackException {
        s sVar = this.f7931a[i];
        if (N(sVar)) {
            return;
        }
        mjf mjfVarP = this.f7934r.p();
        boolean z2 = mjfVarP == this.f7934r.o();
        cop copVarO = mjfVarP.o();
        skk skkVar = copVarO.f14571b[i];
        Format[] formatArrX = x(copVarO.c[i]);
        boolean z3 = Z0() && this.w.e == 3;
        boolean z4 = !z && z3;
        this.I++;
        sVar.r(skkVar, formatArrX, mjfVarP.c[i], this.K, z4, z2, mjfVarP.m(), mjfVarP.l());
        sVar.h(103, new a());
        this.n.b(sVar);
        if (z3) {
            sVar.start();
        }
    }

    public final void r() throws ExoPlaybackException {
        s(new boolean[this.f7931a.length]);
    }

    public final void s(boolean[] zArr) throws ExoPlaybackException {
        mjf mjfVarP = this.f7934r.p();
        cop copVarO = mjfVarP.o();
        for (int i = 0; i < this.f7931a.length; i++) {
            if (!copVarO.c(i)) {
                this.f7931a[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f7931a.length; i2++) {
            if (copVarO.c(i2)) {
                q(i2, zArr[i2]);
            }
        }
        mjfVarP.g = true;
    }

    public final void s0(v vVar, v vVar2) {
        if (vVar.q() && vVar2.q()) {
            return;
        }
        for (int size = this.o.size() - 1; size >= 0; size--) {
            if (!r0(this.o.get(size), vVar, vVar2, this.D, this.E, this.j, this.f7933k)) {
                this.o.get(size).f7940a.k(false);
                this.o.remove(size);
            }
        }
        Collections.sort(this.o);
    }

    public final void t(s sVar) throws ExoPlaybackException {
        if (sVar.getState() == 2) {
            sVar.stop();
        }
    }

    public void u(long j) {
        this.O = j;
    }

    public final ImmutableList<Metadata> v(com.google.android.exoplayer2.trackselection.b[] bVarArr) {
        ImmutableList.a aVar = new ImmutableList.a();
        boolean z = false;
        for (com.google.android.exoplayer2.trackselection.b bVar : bVarArr) {
            if (bVar != null) {
                Metadata metadata = bVar.l(0).j;
                if (metadata == null) {
                    aVar.a(new Metadata(new Metadata.Entry[0]));
                } else {
                    aVar.a(metadata);
                    z = true;
                }
            }
        }
        return z ? aVar.k() : ImmutableList.of();
    }

    public final long w() {
        m0i m0iVar = this.w;
        return y(m0iVar.f25618a, m0iVar.f25619b.f27977a, m0iVar.s);
    }

    public final void w0(long j, long j2) {
        this.g.j(2);
        this.g.i(2, j + j2);
    }

    public void x0(v vVar, int i, long j) {
        this.g.c(3, new h(vVar, i, j)).a();
    }

    public final long y(v vVar, Object obj, long j) {
        vVar.n(vVar.h(obj, this.f7933k).c, this.j);
        v.c cVar = this.j;
        if (cVar.f != -9223372036854775807L && cVar.f()) {
            v.c cVar2 = this.j;
            if (cVar2.i) {
                return g83.c(cVar2.a() - this.j.f) - (j + this.f7933k.l());
            }
        }
        return -9223372036854775807L;
    }

    public final void y0(boolean z) throws ExoPlaybackException {
        com.google.android.exoplayer2.source.k.a aVar = this.f7934r.o().f.f29217a;
        long jB0 = B0(aVar, this.w.s, true, false);
        if (jB0 != this.w.s) {
            m0i m0iVar = this.w;
            this.w = K(aVar, jB0, m0iVar.c, m0iVar.d, z, 5);
        }
    }

    public final long z() {
        mjf mjfVarP = this.f7934r.p();
        if (mjfVarP == null) {
            return 0L;
        }
        long jL = mjfVarP.l();
        if (!mjfVarP.d) {
            return jL;
        }
        int i = 0;
        while (true) {
            s[] sVarArr = this.f7931a;
            if (i >= sVarArr.length) {
                return jL;
            }
            if (N(sVarArr[i]) && this.f7931a[i].getStream() == mjfVarP.c[i]) {
                long jM = this.f7931a[i].m();
                if (jM == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jL = Math.max(jM, jL);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ac A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:22:0x00a2, B:24:0x00ac, B:29:0x00b6, B:31:0x00bc, B:32:0x00bf, B:34:0x00c5, B:36:0x00cf, B:38:0x00d7, B:42:0x00df, B:44:0x00e9, B:46:0x00f9, B:50:0x0103, B:54:0x0115, B:58:0x011e), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:22:0x00a2, B:24:0x00ac, B:29:0x00b6, B:31:0x00bc, B:32:0x00bf, B:34:0x00c5, B:36:0x00cf, B:38:0x00d7, B:42:0x00df, B:44:0x00e9, B:46:0x00f9, B:50:0x0103, B:54:0x0115, B:58:0x011e), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:22:0x00a2, B:24:0x00ac, B:29:0x00b6, B:31:0x00bc, B:32:0x00bf, B:34:0x00c5, B:36:0x00cf, B:38:0x00d7, B:42:0x00df, B:44:0x00e9, B:46:0x00f9, B:50:0x0103, B:54:0x0115, B:58:0x011e), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5 A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:22:0x00a2, B:24:0x00ac, B:29:0x00b6, B:31:0x00bc, B:32:0x00bf, B:34:0x00c5, B:36:0x00cf, B:38:0x00d7, B:42:0x00df, B:44:0x00e9, B:46:0x00f9, B:50:0x0103, B:54:0x0115, B:58:0x011e), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:22:0x00a2, B:24:0x00ac, B:29:0x00b6, B:31:0x00bc, B:32:0x00bf, B:34:0x00c5, B:36:0x00cf, B:38:0x00d7, B:42:0x00df, B:44:0x00e9, B:46:0x00f9, B:50:0x0103, B:54:0x0115, B:58:0x011e), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0114  */
    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    public final void z0(h hVar) throws Throwable {
        long jLongValue;
        long j;
        boolean z;
        com.google.android.exoplayer2.source.k.a aVar;
        long jG;
        long j2;
        long j3;
        long jB;
        boolean z2;
        long jA0;
        boolean z3;
        long j4;
        mjf mjfVarO;
        m0i m0iVar;
        int i;
        this.x.b(1);
        Pair<Object, Long> pairU0 = u0(this.w.f25618a, hVar, true, this.D, this.E, this.j, this.f7933k);
        try {
            if (pairU0 != null) {
                Object obj = pairU0.first;
                jLongValue = ((Long) pairU0.second).longValue();
                long j5 = hVar.c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                com.google.android.exoplayer2.source.k.a aVarZ = this.f7934r.z(this.w.f25618a, obj, jLongValue);
                if (aVarZ.b()) {
                    this.w.f25618a.h(aVarZ.f27977a, this.f7933k);
                    jG = this.f7933k.i(aVarZ.f27978b) == aVarZ.c ? this.f7933k.g() : 0L;
                    j2 = j5;
                    aVar = aVarZ;
                    z = true;
                } else {
                    j = j5;
                    z = hVar.c == -9223372036854775807L;
                    aVar = aVarZ;
                }
                if (this.w.f25618a.q()) {
                    if (pairU0 == null) {
                        if (this.w.e != 1) {
                            W0(4);
                        }
                        n0(false, true, false, true);
                    } else {
                        if (aVar.equals(this.w.f25619b)) {
                            mjfVarO = this.f7934r.o();
                            if (mjfVarO == null && mjfVarO.d && jG != 0) {
                                jB = mjfVarO.f26926a.b(jG, this.v);
                            } else {
                                jB = jG;
                            }
                            if (g83.d(jB) == g83.d(this.w.s) && ((i = (m0iVar = this.w).e) == 2 || i == 3)) {
                                long j6 = m0iVar.s;
                                this.w = K(aVar, j6, j2, j6, z, 2);
                                return;
                            }
                        } else {
                            jB = jG;
                        }
                        if (this.w.e == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        jA0 = A0(aVar, jB, z2);
                        z3 = (jG != jA0) | z;
                        try {
                            m0i m0iVar2 = this.w;
                            v vVar = m0iVar2.f25618a;
                            i1(vVar, aVar, vVar, m0iVar2.f25619b, j2);
                            z = z3;
                            j4 = jA0;
                        } catch (Throwable th) {
                            th = th;
                            z = z3;
                            j3 = jA0;
                            this.w = K(aVar, j3, j2, j3, z, 2);
                            throw th;
                        }
                    }
                    this.w = K(aVar, j4, j2, j4, z, 2);
                    return;
                }
                this.J = hVar;
                j4 = jG;
                this.w = K(aVar, j4, j2, j4, z, 2);
                return;
            }
            Pair<com.google.android.exoplayer2.source.k.a, Long> pairA = A(this.w.f25618a);
            aVar = (com.google.android.exoplayer2.source.k.a) pairA.first;
            jLongValue = ((Long) pairA.second).longValue();
            z = !this.w.f25618a.q();
            j = -9223372036854775807L;
            if (this.w.f25618a.q()) {
                if (pairU0 == null) {
                    if (this.w.e != 1) {
                        W0(4);
                    }
                    n0(false, true, false, true);
                } else {
                    if (aVar.equals(this.w.f25619b)) {
                        mjfVarO = this.f7934r.o();
                        if (mjfVarO == null) {
                            jB = jG;
                        } else {
                            jB = jG;
                        }
                        if (g83.d(jB) == g83.d(this.w.s)) {
                            long j7 = m0iVar.s;
                            this.w = K(aVar, j7, j2, j7, z, 2);
                            return;
                        }
                    } else {
                        jB = jG;
                    }
                    if (this.w.e == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jA0 = A0(aVar, jB, z2);
                    z3 = (jG != jA0) | z;
                    m0i m0iVar3 = this.w;
                    v vVar2 = m0iVar3.f25618a;
                    i1(vVar2, aVar, vVar2, m0iVar3.f25619b, j2);
                    z = z3;
                    j4 = jA0;
                }
                this.w = K(aVar, j4, j2, j4, z, 2);
                return;
            }
            this.J = hVar;
            j4 = jG;
            this.w = K(aVar, j4, j2, j4, z, 2);
            return;
        } catch (Throwable th2) {
            th = th2;
            j3 = jG;
        }
        jG = jLongValue;
        j2 = j;
    }
}
