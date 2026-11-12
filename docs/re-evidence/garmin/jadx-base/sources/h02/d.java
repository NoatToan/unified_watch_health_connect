package h02;

import c2.a0;
import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import cn1.q;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d6.p;
import e23.l;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import j92.e;
import j92.f;
import kotlin.t1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:131:0x0205  */
    /* JADX WARN: Code duplicated, block: B:136:0x0233  */
    /* JADX WARN: Code duplicated, block: B:141:0x026c  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:175:0x037b  */
    /* JADX WARN: Code duplicated, block: B:180:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:196:0x0410  */
    /* JADX WARN: Code duplicated, block: B:201:0x044c  */
    /* JADX WARN: Code duplicated, block: B:206:0x048d  */
    public static final void a(a0 a0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, m mVar, int i14, int i15) {
        int i16;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i17;
        String str15;
        int i18;
        String str16;
        String str17;
        String str18;
        a0Var.getClass();
        str.getClass();
        str3.getClass();
        str5.getClass();
        str6.getClass();
        str8.getClass();
        o0 o0VarE = mVar.E(-1028472134);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 48) == 0) {
            i16 = (o0VarE.B(str) ? 32 : 16) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 384) == 0) {
            if ((i15 & 2) == 0) {
                str9 = str2;
                int i19 = o0VarE.B(str9) ? 256 : 128;
                i16 |= i19;
            } else {
                str9 = str2;
            }
            i16 |= i19;
        } else {
            str9 = str2;
        }
        if ((i14 & 3072) == 0) {
            str10 = str3;
            i16 |= o0VarE.B(str10) ? 2048 : 1024;
        } else {
            str10 = str3;
        }
        if ((i14 & 24576) == 0) {
            i16 |= ((i15 & 8) == 0 && o0VarE.B(str4)) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.B(str5) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            str11 = str6;
            i16 |= o0VarE.B(str11) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            str11 = str6;
        }
        if ((12582912 & i14) == 0) {
            if ((i15 & 64) == 0) {
                str12 = str7;
                int i24 = o0VarE.B(str12) ? 8388608 : 4194304;
                i16 |= i24;
            } else {
                str12 = str7;
            }
            i16 |= i24;
        } else {
            str12 = str7;
        }
        if ((100663296 & i14) == 0) {
            i16 |= o0VarE.B(str8) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i16 & 1, (38347921 & i16) != 38347920)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if ((i15 & 2) != 0) {
                    i16 &= -897;
                    str9 = str;
                }
                if ((i15 & 8) != 0) {
                    i17 = i16 & (-57345);
                    str15 = str10;
                } else {
                    i17 = i16;
                    str15 = str4;
                }
                if ((i15 & 64) != 0) {
                    int i25 = i17 & (-29360129);
                    str16 = str11;
                    i18 = i25;
                } else {
                    i18 = i17;
                    str16 = str12;
                }
                str17 = str15;
                str18 = str9;
            } else {
                o0VarE.e();
                if ((i15 & 2) != 0) {
                    i16 &= -897;
                }
                if ((i15 & 8) != 0) {
                    i16 &= -57345;
                }
                if ((i15 & 64) != 0) {
                    i16 &= -29360129;
                }
                i18 = i16;
                str18 = str9;
                str16 = str12;
                str17 = str4;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            String strG = e5.g(str5, ", ", str17);
            String strG2 = e5.g(str8, ", ", str16);
            m.a aVar = m.f135153a;
            if (f75992b <= 1.0f) {
                o0VarE.C(1083869510);
                j jVar = j.f22691a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f14 = j92.b.f97899b.f97920e;
                jVar.getClass();
                j.i iVarI = j.i(f14);
                h4.d.f81522a.getClass();
                g.b bVar = h4.d.a.f81534l;
                r.a aVar2 = r.S;
                s2 s2VarA = q2.a(iVarI, bVar, o0VarE, 48);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = k.c(aVar2, o0VarE);
                h5.g.V.getClass();
                e0.a aVar3 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                r rVarA = u2Var.a(aVar2, 0.38f, true);
                boolean z14 = (((i18 & 896) ^ 384) > 256 && o0VarE.B(str18)) || (i18 & 384) == 256;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new gp.j(str18, 6);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new gp.j(str18, 6);
                        o0VarE.K(objQ);
                    }
                }
                b(i18 & 112, v.c((l) objQ, rVarA, false), str, o0VarE);
                r rVarA2 = u2Var.a(aVar2, 0.31f, true);
                boolean zB = o0VarE.B(strG);
                Object objQ2 = o0VarE.q();
                if (zB) {
                    objQ2 = new gp.j(strG, 7);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new gp.j(strG, 7);
                        o0VarE.K(objQ2);
                    }
                }
                c(v.c((l) objQ2, rVarA2, false), str3, str5, o0VarE, ((i18 >> 9) & 896) | ((i18 >> 6) & 112), 0);
                r rVarA3 = u2Var.a(aVar2, 0.31f, true);
                boolean zB2 = o0VarE.B(strG2);
                Object objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new gp.j(strG2, 8);
                    o0VarE.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new gp.j(strG2, 8);
                        o0VarE.K(objQ3);
                    }
                }
                c(v.c((l) objQ3, rVarA3, false), str11, str8, o0VarE, ((i18 >> 15) & 112) | ((i18 >> 18) & 896), 0);
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else if (f75992b <= 1.5d) {
                o0VarE.C(1084914365);
                r.a aVar4 = r.S;
                boolean z15 = (((i18 & 896) ^ 384) > 256 && o0VarE.B(str18)) || (i18 & 384) == 256;
                Object objQ4 = o0VarE.q();
                if (z15) {
                    objQ4 = new gp.j(str18, 9);
                    o0VarE.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new gp.j(str18, 9);
                        o0VarE.K(objQ4);
                    }
                }
                b(i18 & 112, v.c((l) objQ4, aVar4, false), str, o0VarE);
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                e eVar = j92.b.f97899b;
                c2.l.f(x2.q(aVar4, eVar.f97920e), o0VarE);
                j jVar2 = j.f22691a;
                bVar3.getClass();
                float f15 = eVar.f97920e;
                jVar2.getClass();
                j.i iVarI2 = j.i(f15);
                h4.d.f81522a.getClass();
                s2 s2VarA2 = q2.a(iVarI2, h4.d.a.f81534l, o0VarE, 48);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC2 = k.c(aVar4, o0VarE);
                h5.g.V.getClass();
                e0.a aVar5 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA2, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar4 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                u2 u2Var2 = u2.f22900a;
                r rVarA4 = u2Var2.a(aVar4, 1.0f, true);
                boolean zB3 = o0VarE.B(strG);
                Object objQ5 = o0VarE.q();
                if (zB3) {
                    objQ5 = new gp.j(strG, 10);
                    o0VarE.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new gp.j(strG, 10);
                        o0VarE.K(objQ5);
                    }
                }
                c(v.c((l) objQ5, rVarA4, false), str3, str5, o0VarE, ((i18 >> 9) & 896) | ((i18 >> 6) & 112), 0);
                r rVarA5 = u2Var2.a(aVar4, 1.0f, true);
                boolean zB4 = o0VarE.B(strG2);
                Object objQ6 = o0VarE.q();
                if (zB4) {
                    objQ6 = new gp.j(strG2, 11);
                    o0VarE.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == m.a.f135155b) {
                        objQ6 = new gp.j(strG2, 11);
                        o0VarE.K(objQ6);
                    }
                }
                c(v.c((l) objQ6, rVarA5, false), str6, str8, o0VarE, ((i18 >> 15) & 112) | ((i18 >> 18) & 896), 0);
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1085908504);
                r.a aVar6 = r.S;
                boolean z16 = (((i18 & 896) ^ 384) > 256 && o0VarE.B(str18)) || (i18 & 384) == 256;
                Object objQ7 = o0VarE.q();
                if (z16) {
                    objQ7 = new gp.j(str18, 12);
                    o0VarE.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == m.a.f135155b) {
                        objQ7 = new gp.j(str18, 12);
                        o0VarE.K(objQ7);
                    }
                }
                b(i18 & 112, v.c((l) objQ7, aVar6, false), str, o0VarE);
                d92.b.f58623a.getClass();
                j92.b bVar5 = d92.b.f58625c;
                bVar5.getClass();
                e eVar2 = j92.b.f97899b;
                c2.l.f(x2.q(aVar6, eVar2.f97920e), o0VarE);
                boolean zB5 = o0VarE.B(strG);
                Object objQ8 = o0VarE.q();
                if (zB5) {
                    objQ8 = new gp.j(strG, 13);
                    o0VarE.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == m.a.f135155b) {
                        objQ8 = new gp.j(strG, 13);
                        o0VarE.K(objQ8);
                    }
                }
                c(v.c((l) objQ8, aVar6, false), str3, str5, o0VarE, ((i18 >> 6) & 112) | ((i18 >> 9) & 896), 0);
                bVar5.getClass();
                c2.l.f(x2.q(aVar6, eVar2.f97920e), o0VarE);
                boolean zB6 = o0VarE.B(strG2);
                Object objQ9 = o0VarE.q();
                if (zB6) {
                    objQ9 = new gp.j(strG2, 14);
                    o0VarE.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == m.a.f135155b) {
                        objQ9 = new gp.j(strG2, 14);
                        o0VarE.K(objQ9);
                    }
                }
                c(v.c((l) objQ9, aVar6, false), str6, str8, o0VarE, ((i18 >> 15) & 112) | ((i18 >> 18) & 896), 0);
                o0VarE.g0(false);
            }
            str9 = str18;
            str13 = str17;
            str14 = str16;
        } else {
            o0VarE.e();
            str13 = str4;
            str14 = str12;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(a0Var, str, str9, str3, str13, str5, str6, str14, str8, i14, i15, 0);
        }
    }

    public static final void b(int i14, r rVar, String str, m mVar) {
        int i15;
        String str2;
        str.getClass();
        o0 o0VarE = mVar.E(-527136701);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            str2 = str;
            i15 |= o0VarE.B(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            g02.c.a(str2, rVar, 0L, null, 0, false, 1, d92.c.b(f.f97928e, o0VarE), 0.0d, o0VarE, ((i15 >> 3) & 14) | 1572864 | ((i15 << 3) & 112), 316);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.d(rVar, str, i14, 3, (byte) 0);
        }
    }

    public static final void c(r rVar, String str, String str2, m mVar, int i14, int i15) {
        r rVar2;
        int i16;
        o0 o0Var;
        r rVar3;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, -1246620428);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarK.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarK.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarK.B(str2) ? 256 : 128;
        }
        if (o0VarK.n(i16 & 1, (i16 & 147) != 146)) {
            r rVar4 = i17 != 0 ? r.S : rVar2;
            x1 x1Var = n.f135158a;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarK, 0);
            int iHashCode = Long.hashCode(o0VarK.U);
            i2 i2VarA0 = o0VarK.a0();
            r rVarC = k.c(rVar4, o0VarK);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarK.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar);
            } else {
                o0VarK.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarK);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarK);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarK, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarK);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(f.f97931h, o0VarK);
            p.f57793b.getClass();
            int i18 = p.f57795d;
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i18, false, 1, 0, null, x0VarB, o0VarK, (i16 >> 3) & 14, 24960, 110590);
            fVar.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, i18, false, 1, 0, null, d92.c.f(f.f97933j, o0VarK), o0VarK, (i16 >> 6) & 14, 24960, 110590);
            o0Var = o0VarK;
            o0Var.g0(true);
            rVar3 = rVar4;
        } else {
            o0Var = o0VarK;
            o0Var.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(rVar3, str, str2, i14, i15, 1);
        }
    }
}
