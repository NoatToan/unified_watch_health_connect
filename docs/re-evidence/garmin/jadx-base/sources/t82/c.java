package t82;

import as.q;
import c2.j;
import c2.t0;
import e23.l;
import e23.p;
import h4.r;
import k2.i;
import l4.k;
import l72.v2;
import o4.m1;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114  */
    /* JADX WARN: Code duplicated, block: B:75:0x0127  */
    /* JADX WARN: Code duplicated, block: B:77:0x015c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0168  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void a(final i53.c cVar, r rVar, final int i14, float f14, final l lVar, m mVar, final int i15, final int i16) {
        int i17;
        r rVar2;
        int i18;
        boolean z14;
        final float f15;
        final r rVar3;
        p2 p2VarI0;
        float f16;
        boolean z15;
        boolean z16;
        int i19;
        int i24;
        cVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1539556057);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.B(cVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i25 = i16 & 2;
        if (i25 == 0) {
            if ((i15 & 48) == 0) {
                rVar2 = rVar;
                i17 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            if ((i15 & 384) == 0) {
                if (o0VarE.k(i14)) {
                    i24 = 256;
                } else {
                    i24 = 128;
                }
                i17 |= i24;
            }
            if ((i16 & 8) != 0) {
                i17 |= 3072;
            } else if ((i15 & 3072) == 0) {
                if (o0VarE.B(null)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i17 |= i18;
            }
            if ((i15 & 24576) == 0) {
                i17 |= 8192;
            }
            if ((196608 & i15) == 0) {
                if (o0VarE.r(lVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i17 |= i19;
            }
            if ((74899 & i17) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i15 & 1) != 0 || o0VarE.o0()) {
                    if (i25 != 0) {
                        rVar2 = r.S;
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f16 = j92.b.f97900c.f97910b;
                } else {
                    o0VarE.e();
                    f16 = f14;
                }
                r rVar4 = rVar2;
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                r.a aVar = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarE = u1.n.e(k.b(c2.l.A(aVar, j92.b.f97899b.f97920e, 0.0f, 2), i.a(f16)), d92.b.a(o0VarE).c().g(), m1.f128891a);
                if (cVar.size() <= 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                r rVarA = v2.a(rVarE, z15, new t21.e(12), o0VarE, 0);
                if (cVar.size() == 3) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                r rVarThen = v2.a(v2.a(rVarA, z16, new t21.e(13), o0VarE, 0), cVar.size() >= 4, new t21.e(14), o0VarE, 0).then(rVar4);
                j.f22691a.getClass();
                t0.a(rVarThen, j.f22697g, j.f22696f, null, 0, 0, z3.f.c(-1384492852, new q(i14, cVar, lVar, 7), o0VarE), o0VarE, 1573296, 56);
                rVar3 = rVar4;
                f15 = f16;
            } else {
                o0VarE.e();
                f15 = f14;
                rVar3 = rVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: t82.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c.a(cVar, rVar3, i14, f15, lVar, (m) obj, p0.t(i15 | 1), i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 48;
        rVar2 = rVar;
        if ((i15 & 384) == 0) {
            if (o0VarE.k(i14)) {
                i24 = 256;
            } else {
                i24 = 128;
            }
            i17 |= i24;
        }
        if ((i16 & 8) != 0) {
            i17 |= 3072;
        } else if ((i15 & 3072) == 0) {
            if (o0VarE.B(null)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i17 |= i18;
        }
        if ((i15 & 24576) == 0) {
            i17 |= 8192;
        }
        if ((196608 & i15) == 0) {
            if (o0VarE.r(lVar)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i17 |= i19;
        }
        if ((74899 & i17) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            if ((i15 & 1) != 0) {
                if (i25 != 0) {
                    rVar2 = r.S;
                }
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f16 = j92.b.f97900c.f97910b;
            } else {
                if (i25 != 0) {
                    rVar2 = r.S;
                }
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f16 = j92.b.f97900c.f97910b;
            }
            r rVar5 = rVar2;
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarE2 = u1.n.e(k.b(c2.l.A(aVar2, j92.b.f97899b.f97920e, 0.0f, 2), i.a(f16)), d92.b.a(o0VarE).c().g(), m1.f128891a);
            if (cVar.size() <= 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            r rVarA2 = v2.a(rVarE2, z15, new t21.e(12), o0VarE, 0);
            if (cVar.size() == 3) {
                z16 = true;
            } else {
                z16 = false;
            }
            r rVarThen2 = v2.a(v2.a(rVarA2, z16, new t21.e(13), o0VarE, 0), cVar.size() >= 4, new t21.e(14), o0VarE, 0).then(rVar5);
            j.f22691a.getClass();
            t0.a(rVarThen2, j.f22697g, j.f22696f, null, 0, 0, z3.f.c(-1384492852, new q(i14, cVar, lVar, 7), o0VarE), o0VarE, 1573296, 56);
            rVar3 = rVar5;
            f15 = f16;
        } else {
            o0VarE.e();
            f15 = f14;
            rVar3 = rVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: t82.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c.a(cVar, rVar3, i14, f15, lVar, (m) obj, p0.t(i15 | 1), i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
