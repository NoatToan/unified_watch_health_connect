package b82;

import android.annotation.SuppressLint;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import i3.v5;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb82/d2;", "", "<init>", "()V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2 f16532a = new d2();

    private d2() {
    }

    @SuppressLint({"ModifierFactoryExtensionFunction"})
    public static h4.r h() {
        h4.r.a aVar = h4.r.S;
        float f14 = 16;
        g6.f.a aVar2 = g6.f.f75994b;
        return c2.l.B(aVar, f14, 10, f14, 7);
    }

    @SuppressLint({"ModifierFactoryExtensionFunction"})
    public static h4.r i() {
        g6.f.a aVar = g6.f.f75994b;
        return c2.l.y(h4.r.S, 16);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x014a  */
    /* JADX WARN: Code duplicated, block: B:57:0x014f  */
    /* JADX WARN: Code duplicated, block: B:60:0x015d  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public final void a(t2 t2Var, String str, h4.r rVar, h4.d.b bVar, int i14, int i15, p3.m mVar, int i16, int i17) {
        int i18;
        h4.r rVar2;
        int i19;
        h4.d.b bVar2;
        int i24;
        int i25;
        boolean z14;
        int i26;
        h4.d.b bVar3;
        int i27;
        p2 p2VarI0;
        h4.r rVar3;
        int i28;
        int i29;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar;
        h5.g.a.b bVar4;
        t2Var.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(-409597772);
        if ((i16 & 48) == 0) {
            i18 = (o0VarE.B(str) ? 32 : 16) | i16;
        } else {
            i18 = i16;
        }
        int i30 = i17 & 2;
        if (i30 == 0) {
            if ((i16 & 384) == 0) {
                rVar2 = rVar;
                i18 |= o0VarE.B(rVar2) ? 256 : 128;
            }
            i19 = i17 & 4;
            if (i19 != 0) {
                if ((i16 & 3072) == 0) {
                    bVar2 = bVar;
                    if (o0VarE.B(bVar2)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i18 |= i24;
                }
                i25 = i18 | 221184;
                if ((74897 & i25) != 74896) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i25 & 1, z14)) {
                    if (i30 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i19 != 0) {
                        h4.d.f81522a.getClass();
                        bVar2 = h4.d.a.f81536n;
                    }
                    d6.p.f57793b.getClass();
                    i28 = d6.p.f57794c;
                    p3.x1 x1Var = p3.n.f135158a;
                    g6.f.a aVar2 = g6.f.f75994b;
                    h4.r rVarThen = c2.l.z(h4.r.S, 16, 8).then(rVar3);
                    i29 = i25 >> 3;
                    c2.j.f22691a.getClass();
                    zVarA = c2.y.a(c2.j.f22694d, bVar2, o0VarE, ((i29 & 896) >> 3) & 112);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarThen, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar4 = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i28, false, Integer.MAX_VALUE, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, i29 & 14, ((i25 >> 9) & 896) | (i25 & 57344), 110590);
                    o0VarE.g0(true);
                    rVar2 = rVar3;
                    bVar3 = bVar2;
                    i26 = i28;
                    i27 = Integer.MAX_VALUE;
                } else {
                    o0VarE.e();
                    i26 = i15;
                    bVar3 = bVar2;
                    i27 = i14;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a2(this, t2Var, str, rVar2, bVar3, i27, i26, i16, i17, 0);
                }
            }
            i18 |= 3072;
            bVar2 = bVar;
            i25 = i18 | 221184;
            if ((74897 & i25) != 74896) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i25 & 1, z14)) {
                if (i30 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i19 != 0) {
                    h4.d.f81522a.getClass();
                    bVar2 = h4.d.a.f81536n;
                }
                d6.p.f57793b.getClass();
                i28 = d6.p.f57794c;
                p3.x1 x1Var2 = p3.n.f135158a;
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarThen2 = c2.l.z(h4.r.S, 16, 8).then(rVar3);
                i29 = i25 >> 3;
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, bVar2, o0VarE, ((i29 & 896) >> 3) & 112);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen2, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar4 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i28, false, Integer.MAX_VALUE, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, i29 & 14, ((i25 >> 9) & 896) | (i25 & 57344), 110590);
                o0VarE.g0(true);
                rVar2 = rVar3;
                bVar3 = bVar2;
                i26 = i28;
                i27 = Integer.MAX_VALUE;
            } else {
                o0VarE.e();
                i26 = i15;
                bVar3 = bVar2;
                i27 = i14;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a2(this, t2Var, str, rVar2, bVar3, i27, i26, i16, i17, 0);
            }
        }
        i18 |= 384;
        rVar2 = rVar;
        i19 = i17 & 4;
        if (i19 != 0) {
            if ((i16 & 3072) == 0) {
                bVar2 = bVar;
                if (o0VarE.B(bVar2)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i18 |= i24;
            }
            i25 = i18 | 221184;
            if ((74897 & i25) != 74896) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i25 & 1, z14)) {
                if (i30 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i19 != 0) {
                    h4.d.f81522a.getClass();
                    bVar2 = h4.d.a.f81536n;
                }
                d6.p.f57793b.getClass();
                i28 = d6.p.f57794c;
                p3.x1 x1Var3 = p3.n.f135158a;
                g6.f.a aVar4 = g6.f.f75994b;
                h4.r rVarThen3 = c2.l.z(h4.r.S, 16, 8).then(rVar3);
                i29 = i25 >> 3;
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, bVar2, o0VarE, ((i29 & 896) >> 3) & 112);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen3, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar4 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var3 = c2.b0.f22601a;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i28, false, Integer.MAX_VALUE, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, i29 & 14, ((i25 >> 9) & 896) | (i25 & 57344), 110590);
                o0VarE.g0(true);
                rVar2 = rVar3;
                bVar3 = bVar2;
                i26 = i28;
                i27 = Integer.MAX_VALUE;
            } else {
                o0VarE.e();
                i26 = i15;
                bVar3 = bVar2;
                i27 = i14;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a2(this, t2Var, str, rVar2, bVar3, i27, i26, i16, i17, 0);
            }
        }
        i18 |= 3072;
        bVar2 = bVar;
        i25 = i18 | 221184;
        if ((74897 & i25) != 74896) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i25 & 1, z14)) {
            if (i30 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i19 != 0) {
                h4.d.f81522a.getClass();
                bVar2 = h4.d.a.f81536n;
            }
            d6.p.f57793b.getClass();
            i28 = d6.p.f57794c;
            p3.x1 x1Var4 = p3.n.f135158a;
            g6.f.a aVar5 = g6.f.f75994b;
            h4.r rVarThen4 = c2.l.z(h4.r.S, 16, 8).then(rVar3);
            i29 = i25 >> 3;
            c2.j.f22691a.getClass();
            zVarA = c2.y.a(c2.j.f22694d, bVar2, o0VarE, ((i29 & 896) >> 3) & 112);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarThen4, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar4 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var4 = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i28, false, Integer.MAX_VALUE, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, i29 & 14, ((i25 >> 9) & 896) | (i25 & 57344), 110590);
            o0VarE.g0(true);
            rVar2 = rVar3;
            bVar3 = bVar2;
            i26 = i28;
            i27 = Integer.MAX_VALUE;
        } else {
            o0VarE.e();
            i26 = i15;
            bVar3 = bVar2;
            i27 = i14;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a2(this, t2Var, str, rVar2, bVar3, i27, i26, i16, i17, 0);
        }
    }

    public final void b(h4.r rVar, e23.q<? super t2, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        e23.q<? super t2, ? super p3.m, ? super Integer, Unit> qVar2;
        h4.r rVar3;
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(-1062879413);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            h4.r rVar4 = i17 != 0 ? h4.r.S : rVar2;
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(x2.f(h4.r.S, 1.0f), am.j.c(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            g6.f.a aVar2 = g6.f.f75994b;
            v5.a(2, 48, 1, sn.a.c(o0VarE), null, o0VarE);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVar4, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            qVar2 = qVar;
            qVar2.invoke(u2.f22900a, o0VarE, 54);
            o0VarE.g0(true);
            o0VarE.g0(true);
            rVar3 = rVar4;
        } else {
            qVar2 = qVar;
            o0VarE.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(i14, i15, this, rVar3, qVar2, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015b  */
    /* JADX WARN: Code duplicated, block: B:103:0x016e  */
    /* JADX WARN: Code duplicated, block: B:105:0x017c  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:113:0x0202  */
    /* JADX WARN: Code duplicated, block: B:116:0x0210  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0150  */
    /* JADX WARN: Code duplicated, block: B:99:0x0157  */
    public final void c(t2 t2Var, String str, String str2, @SuppressLint({"ModifierParameter"}) h4.r rVar, h4.d.b bVar, int i14, int i15, p3.m mVar, int i16, int i17) {
        int i18;
        String str3;
        h4.r rVarA;
        int i19;
        h4.d.b bVar2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z14;
        p3.o0 o0Var;
        int i29;
        h4.d.b bVar3;
        int i30;
        p2 p2VarI0;
        int i34;
        int i35;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar;
        h5.g.a.b bVar4;
        String str4;
        int i36;
        t2Var.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(-1689932973);
        if ((i16 & 6) == 0) {
            i18 = (o0VarE.B(t2Var) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= o0VarE.B(str) ? 32 : 16;
        }
        int i37 = i17 & 2;
        if (i37 == 0) {
            if ((i16 & 384) == 0) {
                str3 = str2;
                i18 |= o0VarE.B(str3) ? 256 : 128;
            }
            if ((i16 & 3072) == 0) {
                if ((i17 & 4) == 0) {
                    rVarA = rVar;
                    int i38 = o0VarE.B(rVarA) ? 2048 : 1024;
                    i18 |= i38;
                } else {
                    rVarA = rVar;
                }
                i18 |= i38;
            } else {
                rVarA = rVar;
            }
            i19 = i17 & 8;
            if (i19 != 0) {
                if ((i16 & 24576) == 0) {
                    bVar2 = bVar;
                    if (o0VarE.B(bVar2)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i18 |= i24;
                }
                i25 = i17 & 16;
                if (i25 != 0) {
                    if ((196608 & i16) == 0) {
                        i26 = i14;
                        if (o0VarE.k(i26)) {
                            i27 = 131072;
                        } else {
                            i27 = 65536;
                        }
                        i18 |= i27;
                    }
                    i28 = i18 | 1572864;
                    if ((12582912 & i16) != 0) {
                        if (o0VarE.B(this)) {
                            i36 = 8388608;
                        } else {
                            i36 = 4194304;
                        }
                        i28 |= i36;
                    }
                    if ((4793491 & i28) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i28 & 1, z14)) {
                        o0VarE.G0();
                        if ((i16 & 1) != 0 || o0VarE.o0()) {
                            if (i37 != 0) {
                                str3 = null;
                            }
                            if ((i17 & 4) != 0) {
                                i28 &= -7169;
                                rVarA = t2Var.a(h(), 1.0f, true);
                            }
                            if (i19 != 0) {
                                h4.d.f81522a.getClass();
                                bVar2 = h4.d.a.f81536n;
                            }
                            if (i25 != 0) {
                                i26 = Integer.MAX_VALUE;
                            }
                            d6.p.f57793b.getClass();
                            i34 = d6.p.f57794c;
                        } else {
                            o0VarE.e();
                            if ((i17 & 4) != 0) {
                                i28 &= -7169;
                            }
                            i34 = i15;
                        }
                        i35 = i26;
                        o0VarE.h0();
                        p3.x1 x1Var = p3.n.f135158a;
                        c2.j.f22691a.getClass();
                        zVarA = c2.y.a(c2.j.f22694d, bVar2, o0VarE, ((((i28 >> 9) & 14) | ((i28 >> 6) & 896)) >> 3) & 112);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVarA, o0VarE);
                        h5.g.V.getClass();
                        aVar = h5.g.a.f81805b;
                        if (o0VarE.f135177b != null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                        bVar4 = h5.g.a.f81813j;
                        if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        c2.b0 b0Var = c2.b0.f22601a;
                        d92.b.f58623a.getClass();
                        j92.f fVar = d92.b.f58624b;
                        fVar.getClass();
                        int i39 = i28 >> 3;
                        int i44 = ((i28 >> 12) & 896) | (i39 & 57344);
                        mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, i39 & 14, i44, 110590);
                        o0Var = o0VarE;
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        fVar.getClass();
                        mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.f(j92.f.f97935l, o0Var), o0Var, 0, i44, 110590);
                        o0Var.g0(true);
                        bVar3 = bVar2;
                        i29 = i34;
                        i30 = i35;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        i29 = i15;
                        bVar3 = bVar2;
                        i30 = i26;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new z1(this, t2Var, str, str3, rVarA, bVar3, i30, i29, i16, i17);
                    }
                }
                i18 |= 196608;
                i26 = i14;
                i28 = i18 | 1572864;
                if ((12582912 & i16) != 0) {
                    if (o0VarE.B(this)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i28 |= i36;
                }
                if ((4793491 & i28) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i28 & 1, z14)) {
                    o0VarE.G0();
                    if ((i16 & 1) != 0) {
                        if (i37 != 0) {
                            str3 = null;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -7169;
                            rVarA = t2Var.a(h(), 1.0f, true);
                        }
                        if (i19 != 0) {
                            h4.d.f81522a.getClass();
                            bVar2 = h4.d.a.f81536n;
                        }
                        if (i25 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        d6.p.f57793b.getClass();
                        i34 = d6.p.f57794c;
                    } else {
                        if (i37 != 0) {
                            str3 = null;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -7169;
                            rVarA = t2Var.a(h(), 1.0f, true);
                        }
                        if (i19 != 0) {
                            h4.d.f81522a.getClass();
                            bVar2 = h4.d.a.f81536n;
                        }
                        if (i25 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        d6.p.f57793b.getClass();
                        i34 = d6.p.f57794c;
                    }
                    i35 = i26;
                    o0VarE.h0();
                    p3.x1 x1Var2 = p3.n.f135158a;
                    c2.j.f22691a.getClass();
                    zVarA = c2.y.a(c2.j.f22694d, bVar2, o0VarE, ((((i28 >> 9) & 14) | ((i28 >> 6) & 896)) >> 3) & 112);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarA, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar4 = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    j92.f fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    int i310 = i28 >> 3;
                    int i45 = ((i28 >> 12) & 896) | (i310 & 57344);
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, i310 & 14, i45, 110590);
                    o0Var = o0VarE;
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    fVar2.getClass();
                    mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.f(j92.f.f97935l, o0Var), o0Var, 0, i45, 110590);
                    o0Var.g0(true);
                    bVar3 = bVar2;
                    i29 = i34;
                    i30 = i35;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    i29 = i15;
                    bVar3 = bVar2;
                    i30 = i26;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new z1(this, t2Var, str, str3, rVarA, bVar3, i30, i29, i16, i17);
                }
            }
            i18 |= 24576;
            bVar2 = bVar;
            i25 = i17 & 16;
            if (i25 != 0) {
                if ((196608 & i16) == 0) {
                    i26 = i14;
                    if (o0VarE.k(i26)) {
                        i27 = 131072;
                    } else {
                        i27 = 65536;
                    }
                    i18 |= i27;
                }
                i28 = i18 | 1572864;
                if ((12582912 & i16) != 0) {
                    if (o0VarE.B(this)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i28 |= i36;
                }
                if ((4793491 & i28) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i28 & 1, z14)) {
                    o0VarE.G0();
                    if ((i16 & 1) != 0) {
                        if (i37 != 0) {
                            str3 = null;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -7169;
                            rVarA = t2Var.a(h(), 1.0f, true);
                        }
                        if (i19 != 0) {
                            h4.d.f81522a.getClass();
                            bVar2 = h4.d.a.f81536n;
                        }
                        if (i25 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        d6.p.f57793b.getClass();
                        i34 = d6.p.f57794c;
                    } else {
                        if (i37 != 0) {
                            str3 = null;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -7169;
                            rVarA = t2Var.a(h(), 1.0f, true);
                        }
                        if (i19 != 0) {
                            h4.d.f81522a.getClass();
                            bVar2 = h4.d.a.f81536n;
                        }
                        if (i25 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        d6.p.f57793b.getClass();
                        i34 = d6.p.f57794c;
                    }
                    i35 = i26;
                    o0VarE.h0();
                    p3.x1 x1Var3 = p3.n.f135158a;
                    c2.j.f22691a.getClass();
                    zVarA = c2.y.a(c2.j.f22694d, bVar2, o0VarE, ((((i28 >> 9) & 14) | ((i28 >> 6) & 896)) >> 3) & 112);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarA, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar4 = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    j92.f fVar3 = d92.b.f58624b;
                    fVar3.getClass();
                    int i311 = i28 >> 3;
                    int i46 = ((i28 >> 12) & 896) | (i311 & 57344);
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, i311 & 14, i46, 110590);
                    o0Var = o0VarE;
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    fVar3.getClass();
                    mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.f(j92.f.f97935l, o0Var), o0Var, 0, i46, 110590);
                    o0Var.g0(true);
                    bVar3 = bVar2;
                    i29 = i34;
                    i30 = i35;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    i29 = i15;
                    bVar3 = bVar2;
                    i30 = i26;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new z1(this, t2Var, str, str3, rVarA, bVar3, i30, i29, i16, i17);
                }
            }
            i18 |= 196608;
            i26 = i14;
            i28 = i18 | 1572864;
            if ((12582912 & i16) != 0) {
                if (o0VarE.B(this)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i28 |= i36;
            }
            if ((4793491 & i28) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i28 & 1, z14)) {
                o0VarE.G0();
                if ((i16 & 1) != 0) {
                    if (i37 != 0) {
                        str3 = null;
                    }
                    if ((i17 & 4) != 0) {
                        i28 &= -7169;
                        rVarA = t2Var.a(h(), 1.0f, true);
                    }
                    if (i19 != 0) {
                        h4.d.f81522a.getClass();
                        bVar2 = h4.d.a.f81536n;
                    }
                    if (i25 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    d6.p.f57793b.getClass();
                    i34 = d6.p.f57794c;
                } else {
                    if (i37 != 0) {
                        str3 = null;
                    }
                    if ((i17 & 4) != 0) {
                        i28 &= -7169;
                        rVarA = t2Var.a(h(), 1.0f, true);
                    }
                    if (i19 != 0) {
                        h4.d.f81522a.getClass();
                        bVar2 = h4.d.a.f81536n;
                    }
                    if (i25 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    d6.p.f57793b.getClass();
                    i34 = d6.p.f57794c;
                }
                i35 = i26;
                o0VarE.h0();
                p3.x1 x1Var4 = p3.n.f135158a;
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, bVar2, o0VarE, ((((i28 >> 9) & 14) | ((i28 >> 6) & 896)) >> 3) & 112);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar4 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var4 = c2.b0.f22601a;
                d92.b.f58623a.getClass();
                j92.f fVar4 = d92.b.f58624b;
                fVar4.getClass();
                int i312 = i28 >> 3;
                int i47 = ((i28 >> 12) & 896) | (i312 & 57344);
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, i312 & 14, i47, 110590);
                o0Var = o0VarE;
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                fVar4.getClass();
                mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.f(j92.f.f97935l, o0Var), o0Var, 0, i47, 110590);
                o0Var.g0(true);
                bVar3 = bVar2;
                i29 = i34;
                i30 = i35;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                i29 = i15;
                bVar3 = bVar2;
                i30 = i26;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new z1(this, t2Var, str, str3, rVarA, bVar3, i30, i29, i16, i17);
            }
        }
        i18 |= 384;
        str3 = str2;
        if ((i16 & 3072) == 0) {
            if ((i17 & 4) == 0) {
                rVarA = rVar;
                if (o0VarE.B(rVarA)) {
                }
                i18 |= i38;
            } else {
                rVarA = rVar;
            }
            i18 |= i38;
        } else {
            rVarA = rVar;
        }
        i19 = i17 & 8;
        if (i19 != 0) {
            if ((i16 & 24576) == 0) {
                bVar2 = bVar;
                if (o0VarE.B(bVar2)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i18 |= i24;
            }
            i25 = i17 & 16;
            if (i25 != 0) {
                if ((196608 & i16) == 0) {
                    i26 = i14;
                    if (o0VarE.k(i26)) {
                        i27 = 131072;
                    } else {
                        i27 = 65536;
                    }
                    i18 |= i27;
                }
                i28 = i18 | 1572864;
                if ((12582912 & i16) != 0) {
                    if (o0VarE.B(this)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i28 |= i36;
                }
                if ((4793491 & i28) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i28 & 1, z14)) {
                    o0VarE.G0();
                    if ((i16 & 1) != 0) {
                        if (i37 != 0) {
                            str3 = null;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -7169;
                            rVarA = t2Var.a(h(), 1.0f, true);
                        }
                        if (i19 != 0) {
                            h4.d.f81522a.getClass();
                            bVar2 = h4.d.a.f81536n;
                        }
                        if (i25 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        d6.p.f57793b.getClass();
                        i34 = d6.p.f57794c;
                    } else {
                        if (i37 != 0) {
                            str3 = null;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -7169;
                            rVarA = t2Var.a(h(), 1.0f, true);
                        }
                        if (i19 != 0) {
                            h4.d.f81522a.getClass();
                            bVar2 = h4.d.a.f81536n;
                        }
                        if (i25 != 0) {
                            i26 = Integer.MAX_VALUE;
                        }
                        d6.p.f57793b.getClass();
                        i34 = d6.p.f57794c;
                    }
                    i35 = i26;
                    o0VarE.h0();
                    p3.x1 x1Var5 = p3.n.f135158a;
                    c2.j.f22691a.getClass();
                    zVarA = c2.y.a(c2.j.f22694d, bVar2, o0VarE, ((((i28 >> 9) & 14) | ((i28 >> 6) & 896)) >> 3) & 112);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarA, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar4 = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var5 = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    j92.f fVar5 = d92.b.f58624b;
                    fVar5.getClass();
                    int i313 = i28 >> 3;
                    int i48 = ((i28 >> 12) & 896) | (i313 & 57344);
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, i313 & 14, i48, 110590);
                    o0Var = o0VarE;
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    fVar5.getClass();
                    mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.f(j92.f.f97935l, o0Var), o0Var, 0, i48, 110590);
                    o0Var.g0(true);
                    bVar3 = bVar2;
                    i29 = i34;
                    i30 = i35;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    i29 = i15;
                    bVar3 = bVar2;
                    i30 = i26;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new z1(this, t2Var, str, str3, rVarA, bVar3, i30, i29, i16, i17);
                }
            }
            i18 |= 196608;
            i26 = i14;
            i28 = i18 | 1572864;
            if ((12582912 & i16) != 0) {
                if (o0VarE.B(this)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i28 |= i36;
            }
            if ((4793491 & i28) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i28 & 1, z14)) {
                o0VarE.G0();
                if ((i16 & 1) != 0) {
                    if (i37 != 0) {
                        str3 = null;
                    }
                    if ((i17 & 4) != 0) {
                        i28 &= -7169;
                        rVarA = t2Var.a(h(), 1.0f, true);
                    }
                    if (i19 != 0) {
                        h4.d.f81522a.getClass();
                        bVar2 = h4.d.a.f81536n;
                    }
                    if (i25 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    d6.p.f57793b.getClass();
                    i34 = d6.p.f57794c;
                } else {
                    if (i37 != 0) {
                        str3 = null;
                    }
                    if ((i17 & 4) != 0) {
                        i28 &= -7169;
                        rVarA = t2Var.a(h(), 1.0f, true);
                    }
                    if (i19 != 0) {
                        h4.d.f81522a.getClass();
                        bVar2 = h4.d.a.f81536n;
                    }
                    if (i25 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    d6.p.f57793b.getClass();
                    i34 = d6.p.f57794c;
                }
                i35 = i26;
                o0VarE.h0();
                p3.x1 x1Var6 = p3.n.f135158a;
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, bVar2, o0VarE, ((((i28 >> 9) & 14) | ((i28 >> 6) & 896)) >> 3) & 112);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar4 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var6 = c2.b0.f22601a;
                d92.b.f58623a.getClass();
                j92.f fVar6 = d92.b.f58624b;
                fVar6.getClass();
                int i314 = i28 >> 3;
                int i49 = ((i28 >> 12) & 896) | (i314 & 57344);
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, i314 & 14, i49, 110590);
                o0Var = o0VarE;
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                fVar6.getClass();
                mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.f(j92.f.f97935l, o0Var), o0Var, 0, i49, 110590);
                o0Var.g0(true);
                bVar3 = bVar2;
                i29 = i34;
                i30 = i35;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                i29 = i15;
                bVar3 = bVar2;
                i30 = i26;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new z1(this, t2Var, str, str3, rVarA, bVar3, i30, i29, i16, i17);
            }
        }
        i18 |= 24576;
        bVar2 = bVar;
        i25 = i17 & 16;
        if (i25 != 0) {
            if ((196608 & i16) == 0) {
                i26 = i14;
                if (o0VarE.k(i26)) {
                    i27 = 131072;
                } else {
                    i27 = 65536;
                }
                i18 |= i27;
            }
            i28 = i18 | 1572864;
            if ((12582912 & i16) != 0) {
                if (o0VarE.B(this)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i28 |= i36;
            }
            if ((4793491 & i28) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i28 & 1, z14)) {
                o0VarE.G0();
                if ((i16 & 1) != 0) {
                    if (i37 != 0) {
                        str3 = null;
                    }
                    if ((i17 & 4) != 0) {
                        i28 &= -7169;
                        rVarA = t2Var.a(h(), 1.0f, true);
                    }
                    if (i19 != 0) {
                        h4.d.f81522a.getClass();
                        bVar2 = h4.d.a.f81536n;
                    }
                    if (i25 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    d6.p.f57793b.getClass();
                    i34 = d6.p.f57794c;
                } else {
                    if (i37 != 0) {
                        str3 = null;
                    }
                    if ((i17 & 4) != 0) {
                        i28 &= -7169;
                        rVarA = t2Var.a(h(), 1.0f, true);
                    }
                    if (i19 != 0) {
                        h4.d.f81522a.getClass();
                        bVar2 = h4.d.a.f81536n;
                    }
                    if (i25 != 0) {
                        i26 = Integer.MAX_VALUE;
                    }
                    d6.p.f57793b.getClass();
                    i34 = d6.p.f57794c;
                }
                i35 = i26;
                o0VarE.h0();
                p3.x1 x1Var7 = p3.n.f135158a;
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, bVar2, o0VarE, ((((i28 >> 9) & 14) | ((i28 >> 6) & 896)) >> 3) & 112);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar4 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var7 = c2.b0.f22601a;
                d92.b.f58623a.getClass();
                j92.f fVar7 = d92.b.f58624b;
                fVar7.getClass();
                int i315 = i28 >> 3;
                int i410 = ((i28 >> 12) & 896) | (i315 & 57344);
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, i315 & 14, i410, 110590);
                o0Var = o0VarE;
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                fVar7.getClass();
                mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.f(j92.f.f97935l, o0Var), o0Var, 0, i410, 110590);
                o0Var.g0(true);
                bVar3 = bVar2;
                i29 = i34;
                i30 = i35;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                i29 = i15;
                bVar3 = bVar2;
                i30 = i26;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new z1(this, t2Var, str, str3, rVarA, bVar3, i30, i29, i16, i17);
            }
        }
        i18 |= 196608;
        i26 = i14;
        i28 = i18 | 1572864;
        if ((12582912 & i16) != 0) {
            if (o0VarE.B(this)) {
                i36 = 8388608;
            } else {
                i36 = 4194304;
            }
            i28 |= i36;
        }
        if ((4793491 & i28) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i28 & 1, z14)) {
            o0VarE.G0();
            if ((i16 & 1) != 0) {
                if (i37 != 0) {
                    str3 = null;
                }
                if ((i17 & 4) != 0) {
                    i28 &= -7169;
                    rVarA = t2Var.a(h(), 1.0f, true);
                }
                if (i19 != 0) {
                    h4.d.f81522a.getClass();
                    bVar2 = h4.d.a.f81536n;
                }
                if (i25 != 0) {
                    i26 = Integer.MAX_VALUE;
                }
                d6.p.f57793b.getClass();
                i34 = d6.p.f57794c;
            } else {
                if (i37 != 0) {
                    str3 = null;
                }
                if ((i17 & 4) != 0) {
                    i28 &= -7169;
                    rVarA = t2Var.a(h(), 1.0f, true);
                }
                if (i19 != 0) {
                    h4.d.f81522a.getClass();
                    bVar2 = h4.d.a.f81536n;
                }
                if (i25 != 0) {
                    i26 = Integer.MAX_VALUE;
                }
                d6.p.f57793b.getClass();
                i34 = d6.p.f57794c;
            }
            i35 = i26;
            o0VarE.h0();
            p3.x1 x1Var8 = p3.n.f135158a;
            c2.j.f22691a.getClass();
            zVarA = c2.y.a(c2.j.f22694d, bVar2, o0VarE, ((((i28 >> 9) & 14) | ((i28 >> 6) & 896)) >> 3) & 112);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar4 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var8 = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.f fVar8 = d92.b.f58624b;
            fVar8.getClass();
            int i316 = i28 >> 3;
            int i411 = ((i28 >> 12) & 896) | (i316 & 57344);
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, i316 & 14, i411, 110590);
            o0Var = o0VarE;
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            fVar8.getClass();
            mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, i34, false, i35, 0, null, d92.c.f(j92.f.f97935l, o0Var), o0Var, 0, i411, 110590);
            o0Var.g0(true);
            bVar3 = bVar2;
            i29 = i34;
            i30 = i35;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            i29 = i15;
            bVar3 = bVar2;
            i30 = i26;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(this, t2Var, str, str3, rVarA, bVar3, i30, i29, i16, i17);
        }
    }

    public final void d(h4.r rVar, e23.q<? super t2, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        e23.q<? super t2, ? super p3.m, ? super Integer, Unit> qVar2;
        h4.r rVar3;
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(1973835289);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            h4.r rVar4 = i17 != 0 ? h4.r.S : rVar2;
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(x2.f(h4.r.S, 1.0f), am.j.c(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVar4, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            qVar2 = qVar;
            qVar2.invoke(u2.f22900a, o0VarE, 54);
            o0VarE.g0(true);
            g6.f.a aVar2 = g6.f.f75994b;
            v5.a(2, 48, 1, sn.a.c(o0VarE), null, o0VarE);
            o0VarE.g0(true);
            rVar3 = rVar4;
        } else {
            qVar2 = qVar;
            o0VarE.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(this, rVar3, qVar2, i14, i15, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:75:0x011a  */
    /* JADX WARN: Code duplicated, block: B:78:0x012d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0132  */
    /* JADX WARN: Code duplicated, block: B:83:0x013c  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public final void e(t2 t2Var, @SuppressLint({"ModifierParameter"}) h4.r rVar, h4.d.b bVar, z3.e eVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVarA;
        h4.d.b bVar2;
        boolean z14;
        h4.d.b bVar3;
        p2 p2VarI0;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar;
        h5.g.a.b bVar4;
        int i17;
        int i18;
        t2Var.getClass();
        p3.o0 o0VarE = mVar.E(1390019616);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            if ((i15 & 1) == 0) {
                rVarA = rVar;
                int i19 = o0VarE.B(rVarA) ? 32 : 16;
                i16 |= i19;
            } else {
                rVarA = rVar;
            }
            i16 |= i19;
        } else {
            rVarA = rVar;
        }
        int i24 = i15 & 2;
        if (i24 == 0) {
            if ((i14 & 384) == 0) {
                bVar2 = bVar;
                i16 |= o0VarE.B(bVar2) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(eVar)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(this)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i16 |= i17;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if ((i15 & 1) != 0) {
                        rVarA = t2Var.a(i(), 1.0f, true);
                        i16 &= -113;
                    }
                    if (i24 != 0) {
                        h4.d.f81522a.getClass();
                        bVar2 = h4.d.a.f81536n;
                    }
                } else {
                    o0VarE.e();
                    if ((i15 & 1) != 0) {
                        i16 &= -113;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var = p3.n.f135158a;
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, bVar2, o0VarE, ((((i16 >> 3) & 14) | (i16 & 896)) >> 3) & 112);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar4 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                b71.i.n((i16 >> 9) & 14, eVar, o0VarE, true);
            } else {
                o0VarE.e();
            }
            bVar3 = bVar2;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a42.a0((Object) this, (Object) t2Var, rVarA, (Object) bVar3, (Object) eVar, i14, i15, 6);
            }
        }
        i16 |= 384;
        bVar2 = bVar;
        if ((i14 & 3072) == 0) {
            if (o0VarE.r(eVar)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i16 |= i18;
        }
        if ((i14 & 24576) == 0) {
            if (o0VarE.B(this)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i16 |= i17;
        }
        if ((i16 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if ((i15 & 1) != 0) {
                    rVarA = t2Var.a(i(), 1.0f, true);
                    i16 &= -113;
                }
                if (i24 != 0) {
                    h4.d.f81522a.getClass();
                    bVar2 = h4.d.a.f81536n;
                }
            } else {
                if ((i15 & 1) != 0) {
                    rVarA = t2Var.a(i(), 1.0f, true);
                    i16 &= -113;
                }
                if (i24 != 0) {
                    h4.d.f81522a.getClass();
                    bVar2 = h4.d.a.f81536n;
                }
            }
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            c2.j.f22691a.getClass();
            zVarA = c2.y.a(c2.j.f22694d, bVar2, o0VarE, ((((i16 >> 3) & 14) | (i16 & 896)) >> 3) & 112);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar4 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            b71.i.n((i16 >> 9) & 14, eVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        bVar3 = bVar2;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.a0((Object) this, (Object) t2Var, rVarA, (Object) bVar3, (Object) eVar, i14, i15, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0108  */
    /* JADX WARN: Code duplicated, block: B:73:0x0118  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public final void f(t2 t2Var, String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, h4.d.b bVar, int i14, int i15, p3.m mVar, int i16, int i17) {
        int i18;
        h4.r rVarA;
        h4.d.b bVar2;
        int i19;
        boolean z14;
        int i24;
        int i25;
        h4.d.b bVar3;
        h4.r rVar2;
        p2 p2VarI0;
        h4.d.b bVar4;
        int i26;
        int i27;
        int i28;
        t2Var.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(-905967961);
        if ((i16 & 6) == 0) {
            i18 = (o0VarE.B(t2Var) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            if ((i17 & 2) == 0) {
                rVarA = rVar;
                int i29 = o0VarE.B(rVarA) ? 256 : 128;
                i18 |= i29;
            } else {
                rVarA = rVar;
            }
            i18 |= i29;
        } else {
            rVarA = rVar;
        }
        int i30 = i17 & 4;
        if (i30 == 0) {
            if ((i16 & 3072) == 0) {
                bVar2 = bVar;
                i18 |= o0VarE.B(bVar2) ? 2048 : 1024;
            }
            i19 = i18 | 221184;
            if ((1572864 & i16) == 0) {
                if (o0VarE.B(this)) {
                    i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i28 = 524288;
                }
                i19 |= i28;
            }
            if ((599187 & i19) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i19 & 1, z14)) {
                o0VarE.G0();
                if ((i16 & 1) != 0 || o0VarE.o0()) {
                    if ((i17 & 2) != 0) {
                        rVarA = t2Var.a(i(), 1.0f, true);
                        i19 &= -897;
                    }
                    if (i30 != 0) {
                        h4.d.f81522a.getClass();
                        bVar4 = h4.d.a.f81536n;
                    } else {
                        bVar4 = bVar2;
                    }
                    d6.p.f57793b.getClass();
                    i26 = d6.p.f57794c;
                    i27 = Integer.MAX_VALUE;
                } else {
                    o0VarE.e();
                    if ((i17 & 2) != 0) {
                        i19 &= -897;
                    }
                    i27 = i14;
                    i26 = i15;
                    bVar4 = bVar2;
                }
                o0VarE.h0();
                p3.x1 x1Var = p3.n.f135158a;
                int i34 = i19 >> 3;
                e(t2Var, rVarA, bVar4, z3.f.c(37943701, new c2(str, i26, i27), o0VarE), o0VarE, ((i19 >> 6) & 57344) | (i19 & 14) | 3072 | (i34 & 112) | (i34 & 896), 0);
                i24 = i27;
                i25 = i26;
                bVar3 = bVar4;
            } else {
                o0VarE.e();
                i24 = i14;
                i25 = i15;
                bVar3 = bVar2;
            }
            rVar2 = rVarA;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a2(this, t2Var, str, rVar2, bVar3, i24, i25, i16, i17, 1);
            }
        }
        i18 |= 3072;
        bVar2 = bVar;
        i19 = i18 | 221184;
        if ((1572864 & i16) == 0) {
            if (o0VarE.B(this)) {
                i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i28 = 524288;
            }
            i19 |= i28;
        }
        if ((599187 & i19) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i19 & 1, z14)) {
            o0VarE.G0();
            if ((i16 & 1) != 0) {
                if ((i17 & 2) != 0) {
                    rVarA = t2Var.a(i(), 1.0f, true);
                    i19 &= -897;
                }
                if (i30 != 0) {
                    h4.d.f81522a.getClass();
                    bVar4 = h4.d.a.f81536n;
                } else {
                    bVar4 = bVar2;
                }
                d6.p.f57793b.getClass();
                i26 = d6.p.f57794c;
                i27 = Integer.MAX_VALUE;
            } else {
                if ((i17 & 2) != 0) {
                    rVarA = t2Var.a(i(), 1.0f, true);
                    i19 &= -897;
                }
                if (i30 != 0) {
                    h4.d.f81522a.getClass();
                    bVar4 = h4.d.a.f81536n;
                } else {
                    bVar4 = bVar2;
                }
                d6.p.f57793b.getClass();
                i26 = d6.p.f57794c;
                i27 = Integer.MAX_VALUE;
            }
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            int i35 = i19 >> 3;
            e(t2Var, rVarA, bVar4, z3.f.c(37943701, new c2(str, i26, i27), o0VarE), o0VarE, ((i19 >> 6) & 57344) | (i19 & 14) | 3072 | (i35 & 112) | (i35 & 896), 0);
            i24 = i27;
            i25 = i26;
            bVar3 = bVar4;
        } else {
            o0VarE.e();
            i24 = i14;
            i25 = i15;
            bVar3 = bVar2;
        }
        rVar2 = rVarA;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a2(this, t2Var, str, rVar2, bVar3, i24, i25, i16, i17, 1);
        }
    }

    public final void g(int i14, int i15, int i16, h4.r rVar, p3.m mVar, z3.e eVar) {
        int i17;
        long jB;
        p3.o0 o0VarE = mVar.E(-1947812105);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.r(eVar) ? 256 : 128;
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            if (i18 != 0) {
                rVar = h4.r.S;
            }
            p3.x1 x1Var = p3.n.f135158a;
            if (i14 % 2 == 0) {
                o0VarE.C(758313439);
                jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
            } else {
                o0VarE.C(758314622);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).c().b();
                o0VarE.g0(false);
            }
            h4.r rVarThen = u1.n.e(x2.f(h4.r.S, 1.0f), jB, o4.m1.f128891a).then(rVar);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            eVar.invoke(u2.f22900a, o0VarE, Integer.valueOf(((i17 >> 3) & 112) | 6));
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        h4.r rVar2 = rVar;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b2(this, i14, rVar2, eVar, i15, i16);
        }
    }
}
