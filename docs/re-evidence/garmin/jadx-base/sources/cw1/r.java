package cw1;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import i3.i7;
import i3.mh;
import i3.ve;
import l72.v2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x010b  */
    /* JADX WARN: Code duplicated, block: B:87:0x014d  */
    /* JADX WARN: Code duplicated, block: B:90:0x015b  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void a(h4.r rVar, String str, b92.a aVar, final boolean z14, boolean z15, e23.a<Unit> aVar2, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        final String str2;
        boolean z16;
        e23.a<Unit> aVar3;
        boolean z17;
        p3.o0 o0Var;
        final b92.a aVar4;
        boolean z18;
        h4.r rVar3;
        p2 p2VarI0;
        h4.r rVar4;
        String str3;
        final boolean z19;
        long jB;
        int i17;
        str.getClass();
        p3.o0 o0VarE = mVar.E(147266058);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            str2 = str;
            i16 |= o0VarE.B(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        int i19 = i15 & 4;
        if (i19 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        int i24 = i15 & 16;
        if (i24 == 0) {
            if ((i14 & 24576) == 0) {
                z16 = z15;
                i16 |= o0VarE.h(z16) ? 16384 : 8192;
            }
            if ((196608 & i14) == 0) {
                aVar3 = aVar2;
                if (o0VarE.r(aVar3)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i16 |= i17;
            } else {
                aVar3 = aVar2;
            }
            if ((74899 & i16) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i16 & 1, z17)) {
                if (i18 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i19 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar;
                }
                str3 = null;
                if (i24 != 0) {
                    z19 = true;
                } else {
                    z19 = z16;
                }
                x1 x1Var = p3.n.f135158a;
                final float f75992b = ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b();
                if (aVar4 != null) {
                    str3 = aVar4.f16961a.get(Constants.ScionAnalytics.PARAM_LABEL);
                }
                h4.r rVarA = v2.a(x2.f(rVar4, 1.0f), !z19, new bk0.i(18), o0VarE, 0);
                if (z14) {
                    o0VarE.C(-211221614);
                    jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
                } else {
                    o0VarE.C(-211220430);
                    d92.b.f58623a.getClass();
                    long jE = d92.b.a(o0VarE).c().e();
                    o0VarE.g0(false);
                    jB = jE;
                }
                final String str4 = str3;
                final e23.a<Unit> aVar5 = aVar3;
                z3.e eVarC = z3.f.c(2129842191, new e23.p() { // from class: cw1.p
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            x1 x1Var2 = p3.n.f135158a;
                            h4.r.a aVar6 = h4.r.S;
                            Object objQ = mVar2.q();
                            p3.m.f135153a.getClass();
                            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                            if (objQ == c2565a) {
                                objQ = tn.k.c(mVar2);
                            }
                            a2.j jVar = (a2.j) objQ;
                            boolean z24 = z19;
                            e23.a aVar7 = aVar5;
                            boolean z25 = z24 && aVar7 != null;
                            if (aVar7 == null) {
                                mVar2.C(577179665);
                                Object objQ2 = mVar2.q();
                                if (objQ2 == c2565a) {
                                    objQ2 = new com.google.accompanist.drawablepainter.a(18);
                                    mVar2.K(objQ2);
                                }
                                aVar7 = (e23.a) objQ2;
                            } else {
                                mVar2.C(-1921044292);
                            }
                            mVar2.f();
                            e23.a aVar8 = aVar7;
                            b92.a aVar9 = aVar4;
                            h4.r rVarB = u1.w.b(aVar6, jVar, null, z25, aVar9 != null ? aVar9.f16961a.get("onClickLabel") : null, null, aVar8, 16);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar = j92.b.f97899b;
                            h4.r rVarF = x2.f(c2.l.y(rVarB, eVar.f97920e), 1.0f);
                            h4.d.f81522a.getClass();
                            h4.g.b bVar = h4.d.a.f81534l;
                            c2.j.f22691a.getClass();
                            s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                            int iHashCode = Long.hashCode(mVar2.getU());
                            i2 i2VarX = mVar2.x();
                            h4.r rVarC = h4.k.c(rVarF, mVar2);
                            h5.g.V.getClass();
                            h5.e0.a aVar10 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar10);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar2);
                            u2 u2Var = u2.f22900a;
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                            h4.r rVarA2 = u2Var.a(c2.l.C(aVar6, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), 1.0f, true);
                            String str5 = str4;
                            mh.c(str2, v2.a(rVarA2, str5 != null, new as.s(str5, 7), mVar2, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
                            if (z14) {
                                mVar2.C(-1457613189);
                                float f14 = j92.b.f97901d.f97904c * f75992b;
                                g6.f.a aVar11 = g6.f.f75994b;
                                h4.r rVarQ = x2.q(aVar6, f14);
                                s62.a.f157643a.getClass();
                                i7.b(v62.e1.a(t62.b.f162798a), null, rVarQ, androidx.room.a0.c(mVar2), mVar2, 48, 0);
                                mVar2.f();
                            } else {
                                mVar2.C(-1457303313);
                                mVar2.f();
                            }
                            mVar2.y();
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE);
                o0Var = o0VarE;
                rVar2 = rVar4;
                ve.a(rVarA, null, jB, 0L, 0.0f, 0.0f, null, eVarC, o0Var, 12582912, 122);
                z18 = z19;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                aVar4 = aVar;
                z18 = z16;
            }
            rVar3 = rVar2;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new at.a(rVar3, str, aVar4, z14, z18, aVar2, i14, i15, 1);
            }
        }
        i16 |= 24576;
        z16 = z15;
        if ((196608 & i14) == 0) {
            aVar3 = aVar2;
            if (o0VarE.r(aVar3)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i16 |= i17;
        } else {
            aVar3 = aVar2;
        }
        if ((74899 & i16) != 74898) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i16 & 1, z17)) {
            if (i18 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i19 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar;
            }
            str3 = null;
            if (i24 != 0) {
                z19 = true;
            } else {
                z19 = z16;
            }
            x1 x1Var2 = p3.n.f135158a;
            final float f75992b2 = ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b();
            if (aVar4 != null) {
                str3 = aVar4.f16961a.get(Constants.ScionAnalytics.PARAM_LABEL);
            }
            h4.r rVarA2 = v2.a(x2.f(rVar4, 1.0f), !z19, new bk0.i(18), o0VarE, 0);
            if (z14) {
                o0VarE.C(-211221614);
                jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
            } else {
                o0VarE.C(-211220430);
                d92.b.f58623a.getClass();
                long jE2 = d92.b.a(o0VarE).c().e();
                o0VarE.g0(false);
                jB = jE2;
            }
            final String str5 = str3;
            final e23.a aVar6 = aVar3;
            z3.e eVarC2 = z3.f.c(2129842191, new e23.p() { // from class: cw1.p
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var3 = p3.n.f135158a;
                        h4.r.a aVar7 = h4.r.S;
                        Object objQ = mVar2.q();
                        p3.m.f135153a.getClass();
                        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = tn.k.c(mVar2);
                        }
                        a2.j jVar = (a2.j) objQ;
                        boolean z24 = z19;
                        e23.a aVar8 = aVar6;
                        boolean z25 = z24 && aVar8 != null;
                        if (aVar8 == null) {
                            mVar2.C(577179665);
                            Object objQ2 = mVar2.q();
                            if (objQ2 == c2565a) {
                                objQ2 = new com.google.accompanist.drawablepainter.a(18);
                                mVar2.K(objQ2);
                            }
                            aVar8 = (e23.a) objQ2;
                        } else {
                            mVar2.C(-1921044292);
                        }
                        mVar2.f();
                        e23.a aVar9 = aVar8;
                        b92.a aVar10 = aVar4;
                        h4.r rVarB = u1.w.b(aVar7, jVar, null, z25, aVar10 != null ? aVar10.f16961a.get("onClickLabel") : null, null, aVar9, 16);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        h4.r rVarF = x2.f(c2.l.y(rVarB, eVar.f97920e), 1.0f);
                        h4.d.f81522a.getClass();
                        h4.g.b bVar = h4.d.a.f81534l;
                        c2.j.f22691a.getClass();
                        s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarF, mVar2);
                        h5.g.V.getClass();
                        h5.e0.a aVar11 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar11);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        u2 u2Var = u2.f22900a;
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                        h4.r rVarA3 = u2Var.a(c2.l.C(aVar7, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), 1.0f, true);
                        String str6 = str5;
                        mh.c(str2, v2.a(rVarA3, str6 != null, new as.s(str6, 7), mVar2, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
                        if (z14) {
                            mVar2.C(-1457613189);
                            float f14 = j92.b.f97901d.f97904c * f75992b2;
                            g6.f.a aVar12 = g6.f.f75994b;
                            h4.r rVarQ = x2.q(aVar7, f14);
                            s62.a.f157643a.getClass();
                            i7.b(v62.e1.a(t62.b.f162798a), null, rVarQ, androidx.room.a0.c(mVar2), mVar2, 48, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(-1457303313);
                            mVar2.f();
                        }
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            o0Var = o0VarE;
            rVar2 = rVar4;
            ve.a(rVarA2, null, jB, 0L, 0.0f, 0.0f, null, eVarC2, o0Var, 12582912, 122);
            z18 = z19;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            aVar4 = aVar;
            z18 = z16;
        }
        rVar3 = rVar2;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.a(rVar3, str, aVar4, z14, z18, aVar2, i14, i15, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:83:0x0102  */
    /* JADX WARN: Code duplicated, block: B:84:0x0110  */
    /* JADX WARN: Code duplicated, block: B:86:0x0153  */
    /* JADX WARN: Code duplicated, block: B:89:0x0162  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void b(h4.r rVar, final String str, final String str2, b92.a aVar, final boolean z14, boolean z15, final e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z16;
        boolean z17;
        p3.o0 o0Var;
        h4.r rVar2;
        b92.a aVar2;
        boolean z18;
        p2 p2VarI0;
        h4.r rVar3;
        final b92.a aVar3;
        int i17;
        final boolean z19;
        final String str3;
        String str4;
        long jE;
        int i18;
        str.getClass();
        p3.o0 o0VarE = mVar.E(-1731817734);
        if ((i14 & 48) == 0) {
            i16 = (o0VarE.B(str) ? 32 : 16) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str2) ? 256 : 128;
        }
        int i19 = i15 & 8;
        if (i19 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        int i24 = i15 & 32;
        if (i24 == 0) {
            if ((196608 & i14) == 0) {
                z16 = z15;
                i16 |= o0VarE.h(z16) ? 131072 : 65536;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(lVar)) {
                    i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
            if ((599185 & i16) != 599184) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i16 & 1, z17)) {
                if ((i15 & 1) != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i19 != 0) {
                    i17 = i24;
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                    i17 = i24;
                }
                if (i17 != 0) {
                    z19 = true;
                } else {
                    z19 = z16;
                }
                x1 x1Var = p3.n.f135158a;
                final float f75992b = ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b();
                if (aVar3 != null) {
                    str3 = aVar3.f16961a.get("merge");
                } else {
                    str3 = r1;
                }
                if (aVar3 != null) {
                    str4 = aVar3.f16961a.get(Constants.ScionAnalytics.PARAM_LABEL);
                } else {
                    str4 = r1;
                }
                final String str5 = aVar3 != null ? aVar3.f16961a.get("label_secondary") : null;
                if (z14) {
                    o0VarE.C(-2124472190);
                    jE = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
                } else {
                    o0VarE.C(-2124471006);
                    d92.b.f58623a.getClass();
                    jE = d92.b.a(o0VarE).c().e();
                    o0VarE.g0(false);
                }
                final String str6 = str4;
                o0Var = o0VarE;
                ve.a(null, null, jE, 0L, 0.0f, 0.0f, null, z3.f.c(646240319, new e23.p() { // from class: cw1.q
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            x1 x1Var2 = p3.n.f135158a;
                            h4.r.a aVar4 = h4.r.S;
                            boolean z24 = z19;
                            h4.r rVarA = v2.a(aVar4, !z24, new bk0.i(19), mVar2, 6);
                            Object objQ = mVar2.q();
                            p3.m.f135153a.getClass();
                            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                            if (objQ == c2565a) {
                                objQ = tn.k.c(mVar2);
                            }
                            a2.j jVar = (a2.j) objQ;
                            e23.l lVar2 = lVar;
                            boolean z25 = z24 && lVar2 != null;
                            b92.a aVar5 = aVar3;
                            String str7 = aVar5 != null ? aVar5.f16961a.get("onClickLabel") : null;
                            boolean zB = mVar2.B(lVar2);
                            boolean z26 = z14;
                            boolean zH = zB | mVar2.h(z26);
                            Object objQ2 = mVar2.q();
                            if (zH || objQ2 == c2565a) {
                                objQ2 = new ad0.e(lVar2, z26, 1);
                                mVar2.K(objQ2);
                            }
                            h4.r rVarB = u1.w.b(rVarA, jVar, null, z25, str7, null, (e23.a) objQ2, 16);
                            b82.i iVar = new b82.i(1);
                            String str8 = str3;
                            h4.r rVarB2 = v2.b(rVarB, str8, iVar, mVar2, 0);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar = j92.b.f97899b;
                            h4.r rVarF = x2.f(c2.l.y(rVarB2, eVar.f97920e), 1.0f);
                            h4.d.f81522a.getClass();
                            h4.g.b bVar = h4.d.a.f81534l;
                            c2.j.f22691a.getClass();
                            s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                            int iHashCode = Long.hashCode(mVar2.getU());
                            i2 i2VarX = mVar2.x();
                            h4.r rVarC = h4.k.c(rVarF, mVar2);
                            h5.g.V.getClass();
                            h5.e0.a aVar6 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar6);
                            } else {
                                mVar2.c();
                            }
                            h5.g.a.e eVar2 = h5.g.a.f81810g;
                            b4.c(eVar2, s2VarA, mVar2);
                            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                            b4.c(c1623g, i2VarX, mVar2);
                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                            }
                            h5.g.a.f fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC, mVar2);
                            u2 u2Var = u2.f22900a;
                            float f14 = z26 ? 16 : 0;
                            g6.f.a aVar7 = g6.f.f75994b;
                            h4.r rVarC2 = c2.l.C(u2Var.a(aVar4, 1.0f, true), 0.0f, 0.0f, f14, 0.0f, 11);
                            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                            int iHashCode2 = Long.hashCode(mVar2.getU());
                            i2 i2VarX2 = mVar2.x();
                            h4.r rVarC3 = h4.k.c(rVarC2, mVar2);
                            if (mVar2.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar6);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar2, zVarA, mVar2);
                            b4.c(c1623g, i2VarX2, mVar2);
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                            }
                            b4.c(fVar, rVarC3, mVar2);
                            c2.b0 b0Var = c2.b0.f22601a;
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                            h4.r rVarC4 = c2.l.C(aVar4, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
                            String str9 = str6;
                            mh.c(str, v2.a(rVarC4, str9 != null && str8 == null, new as.s(str9, 8), mVar2, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
                            s5.x0 x0VarF = d92.c.f(j92.f.f97933j, mVar2);
                            String str10 = str5;
                            mh.c(str2, v2.a(aVar4, str10 != null && str8 == null, new as.s(str10, 9), mVar2, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 131068);
                            mVar2.y();
                            if (z26) {
                                mVar2.C(-1051405952);
                                h4.r rVarQ = x2.q(aVar4, j92.b.f97901d.f97904c * f75992b);
                                s62.a.f157643a.getClass();
                                i7.b(v62.e1.a(t62.b.f162798a), null, rVarQ, androidx.room.a0.c(mVar2), mVar2, 48, 0);
                                mVar2.f();
                            } else {
                                mVar2.C(-1051147009);
                                mVar2.f();
                            }
                            mVar2.y();
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0Var, 12582912, 123);
                z18 = z19;
                aVar2 = aVar3;
                rVar2 = rVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                aVar2 = aVar;
                z18 = z16;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ak0.r(rVar2, str, str2, aVar2, z14, z18, lVar, i14, i15);
            }
        }
        i16 |= 196608;
        z16 = z15;
        if ((1572864 & i14) == 0) {
            if (o0VarE.r(lVar)) {
                i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i18 = 524288;
            }
            i16 |= i18;
        }
        if ((599185 & i16) != 599184) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i16 & 1, z17)) {
            if ((i15 & 1) != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar;
            }
            if (i19 != 0) {
                i17 = i24;
                aVar3 = null;
            } else {
                aVar3 = aVar;
                i17 = i24;
            }
            if (i17 != 0) {
                z19 = true;
            } else {
                z19 = z16;
            }
            x1 x1Var2 = p3.n.f135158a;
            final float f75992b2 = ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b();
            if (aVar3 != null) {
                str3 = aVar3.f16961a.get("merge");
            } else {
                str3 = r1;
            }
            if (aVar3 != null) {
                str4 = aVar3.f16961a.get(Constants.ScionAnalytics.PARAM_LABEL);
            } else {
                str4 = r1;
            }
            final String str7 = aVar3 != null ? aVar3.f16961a.get("label_secondary") : null;
            if (z14) {
                o0VarE.C(-2124472190);
                jE = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
            } else {
                o0VarE.C(-2124471006);
                d92.b.f58623a.getClass();
                jE = d92.b.a(o0VarE).c().e();
                o0VarE.g0(false);
            }
            final String str8 = str4;
            o0Var = o0VarE;
            ve.a(null, null, jE, 0L, 0.0f, 0.0f, null, z3.f.c(646240319, new e23.p() { // from class: cw1.q
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var3 = p3.n.f135158a;
                        h4.r.a aVar4 = h4.r.S;
                        boolean z24 = z19;
                        h4.r rVarA = v2.a(aVar4, !z24, new bk0.i(19), mVar2, 6);
                        Object objQ = mVar2.q();
                        p3.m.f135153a.getClass();
                        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = tn.k.c(mVar2);
                        }
                        a2.j jVar = (a2.j) objQ;
                        e23.l lVar2 = lVar;
                        boolean z25 = z24 && lVar2 != null;
                        b92.a aVar5 = aVar3;
                        String str9 = aVar5 != null ? aVar5.f16961a.get("onClickLabel") : null;
                        boolean zB = mVar2.B(lVar2);
                        boolean z26 = z14;
                        boolean zH = zB | mVar2.h(z26);
                        Object objQ2 = mVar2.q();
                        if (zH || objQ2 == c2565a) {
                            objQ2 = new ad0.e(lVar2, z26, 1);
                            mVar2.K(objQ2);
                        }
                        h4.r rVarB = u1.w.b(rVarA, jVar, null, z25, str9, null, (e23.a) objQ2, 16);
                        b82.i iVar = new b82.i(1);
                        String str10 = str3;
                        h4.r rVarB2 = v2.b(rVarB, str10, iVar, mVar2, 0);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        h4.r rVarF = x2.f(c2.l.y(rVarB2, eVar.f97920e), 1.0f);
                        h4.d.f81522a.getClass();
                        h4.g.b bVar = h4.d.a.f81534l;
                        c2.j.f22691a.getClass();
                        s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarF, mVar2);
                        h5.g.V.getClass();
                        h5.e0.a aVar6 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar2 = h5.g.a.f81810g;
                        b4.c(eVar2, s2VarA, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, mVar2);
                        u2 u2Var = u2.f22900a;
                        float f14 = z26 ? 16 : 0;
                        g6.f.a aVar7 = g6.f.f75994b;
                        h4.r rVarC2 = c2.l.C(u2Var.a(aVar4, 1.0f, true), 0.0f, 0.0f, f14, 0.0f, 11);
                        c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        h4.r rVarC3 = h4.k.c(rVarC2, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, zVarA, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                        }
                        b4.c(fVar, rVarC3, mVar2);
                        c2.b0 b0Var = c2.b0.f22601a;
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                        h4.r rVarC4 = c2.l.C(aVar4, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
                        String str11 = str8;
                        mh.c(str, v2.a(rVarC4, str11 != null && str10 == null, new as.s(str11, 8), mVar2, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
                        s5.x0 x0VarF = d92.c.f(j92.f.f97933j, mVar2);
                        String str12 = str7;
                        mh.c(str2, v2.a(aVar4, str12 != null && str10 == null, new as.s(str12, 9), mVar2, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 131068);
                        mVar2.y();
                        if (z26) {
                            mVar2.C(-1051405952);
                            h4.r rVarQ = x2.q(aVar4, j92.b.f97901d.f97904c * f75992b2);
                            s62.a.f157643a.getClass();
                            i7.b(v62.e1.a(t62.b.f162798a), null, rVarQ, androidx.room.a0.c(mVar2), mVar2, 48, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(-1051147009);
                            mVar2.f();
                        }
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var, 12582912, 123);
            z18 = z19;
            aVar2 = aVar3;
            rVar2 = rVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            aVar2 = aVar;
            z18 = z16;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ak0.r(rVar2, str, str2, aVar2, z14, z18, lVar, i14, i15);
        }
    }
}
