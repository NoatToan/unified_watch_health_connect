package tf0;

import b21.n9;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import h5.e0;
import i3.e9;
import i3.mc;
import i3.mh;
import java.util.List;
import l72.c1;
import l72.f0;
import l72.w;
import lc.u0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import t70.a1;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    public static final void a(List<uf0.a> list, e23.a<Unit> aVar, e23.l<? super uf0.a, Unit> lVar, p3.m mVar, int i14) {
        list.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1066062143);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            mc mcVarF = e9.f(false, null, o0VarE, 0, 3);
            w wVar = w.f111301a;
            String strQ = y.Q(o0VarE, R.string.lbl_choose_device);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a1(aVar, 13);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a1(aVar, 13);
                    o0VarE.K(objQ);
                }
            }
            wVar.f(strQ, null, null, null, (e23.a) objQ, mcVarF, false, null, z3.f.c(-646898154, new c82.e(list, lVar, 5), o0VarE), o0VarE, C.ENCODING_PCM_32BIT, 462);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qa0.a(list, aVar, lVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    public static final void b(int i14, int i15, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i16) {
        o0 o0Var;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 703219474);
        int i17 = i16 | (o0VarP.k(i14) ? 4 : 2) | (o0VarP.k(i15) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128) | (o0VarP.r(aVar2) ? 2048 : 1024);
        if (o0VarP.n(i17 & 1, (i17 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarP, i14);
            String strQ2 = y.Q(o0VarP, i15);
            String strQ3 = y.Q(o0VarP, R.string.lbl_ok);
            boolean z14 = (i17 & 7168) == 2048;
            Object objQ = o0VarP.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z14) {
                objQ = new a1(aVar2, 11);
                o0VarP.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a1(aVar2, 11);
                    o0VarP.K(objQ);
                }
            }
            e23.a<Unit> aVar4 = (e23.a) objQ;
            boolean z15 = (i17 & 896) == 256;
            Object objQ2 = o0VarP.q();
            if (z15) {
                objQ2 = new a1(aVar, 12);
                o0VarP.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a1(aVar, 12);
                    o0VarP.K(objQ2);
                }
            }
            o0Var = o0VarP;
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar4, null, (e23.a) objQ2, o0Var, 0, 0, 729);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.f(i14, i15, aVar, aVar2, i16, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0185  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:148:0x023e  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0159  */
    public static final void c(boolean z14, final l lVar, h4.r rVar, final e23.l lVar2, e23.l lVar3, e23.l lVar4, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        final int i16;
        String strL;
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        o0 o0VarE = mVar.E(-9070744);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar4) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(eVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        final int i17 = 0;
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            p3.m.a aVar = p3.m.f135153a;
            if (!z14 || lVar.f164451a) {
                i16 = 1;
                o0VarE.C(357782817);
                b71.i.n((i15 >> 18) & 14, eVar, o0VarE, false);
            } else {
                o0VarE.C(356779533);
                Integer num = lVar.f164453c;
                if (num == null) {
                    o0VarE.C(356821754);
                    o0VarE.g0(false);
                    strL = null;
                } else {
                    strL = u0.l(o0VarE, 356821755, num, o0VarE, false);
                }
                int i18 = i15 & 458752;
                boolean z15 = i18 == 131072;
                Object objQ = o0VarE.q();
                if (z15) {
                    objQ = new sq1.e(lVar4, 25);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new sq1.e(lVar4, 25);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                boolean z16 = i18 == 131072;
                Object objQ2 = o0VarE.q();
                if (z16) {
                    objQ2 = new sq1.e(lVar4, 26);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new sq1.e(lVar4, 26);
                        o0VarE.K(objQ2);
                    }
                }
                d(rVar, strL, aVar2, (e23.a) objQ2, o0VarE, (i15 >> 6) & 14);
                l.a aVar3 = lVar.f164454d;
                if (aVar3 == null) {
                    o0VarE.C(357064112);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(357064113);
                    int i19 = aVar3.f164457a;
                    int i24 = aVar3.f164458b;
                    int i25 = i15 & 7168;
                    boolean zR = o0VarE.r(lVar) | (i25 == 2048);
                    Object objQ3 = o0VarE.q();
                    if (zR) {
                        objQ3 = new e23.a() { // from class: tf0.f
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        lVar2.invoke(l.a(lVar, 55));
                                        break;
                                    default:
                                        lVar2.invoke(l.a(lVar, 47));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: tf0.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            lVar2.invoke(l.a(lVar, 55));
                                            break;
                                        default:
                                            lVar2.invoke(l.a(lVar, 47));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ3);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ3;
                    boolean zR2 = (i25 == 2048) | ((i15 & 57344) == 16384) | o0VarE.r(lVar);
                    Object objQ4 = o0VarE.q();
                    if (zR2) {
                        objQ4 = new sg0.j(lVar3, 21, lVar2, lVar);
                        o0VarE.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new sg0.j(lVar3, 21, lVar2, lVar);
                            o0VarE.K(objQ4);
                        }
                    }
                    b(i19, i24, aVar4, (e23.a) objQ4, o0VarE, 0);
                    o0VarE.g0(false);
                }
                List<uf0.a> list = lVar.f164455e;
                if (list == null) {
                    o0VarE.C(357482798);
                    o0VarE.g0(false);
                    i16 = 1;
                } else {
                    o0VarE.C(357482799);
                    boolean zR3 = o0VarE.r(lVar) | ((i15 & 7168) == 2048);
                    Object objQ5 = o0VarE.q();
                    if (zR3) {
                        i16 = 1;
                        objQ5 = new e23.a() { // from class: tf0.f
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        lVar2.invoke(l.a(lVar, 55));
                                        break;
                                    default:
                                        lVar2.invoke(l.a(lVar, 47));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            i16 = 1;
                            objQ5 = new e23.a() { // from class: tf0.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            lVar2.invoke(l.a(lVar, 55));
                                            break;
                                        default:
                                            lVar2.invoke(l.a(lVar, 47));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ5);
                        } else {
                            i16 = 1;
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ5;
                    int i26 = (i15 & 57344) == 16384 ? i16 : 0;
                    Object objQ6 = o0VarE.q();
                    if (i26 == 0) {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new ta0.j(lVar3, 7);
                            o0VarE.K(objQ6);
                        }
                    } else {
                        objQ6 = new ta0.j(lVar3, 7);
                        o0VarE.K(objQ6);
                    }
                    a(list, aVar5, (e23.l) objQ6, o0VarE, 0);
                    o0VarE.g0(false);
                    Unit unit = Unit.INSTANCE;
                }
                o0VarE.g0(false);
            }
            int i27 = (o0VarE.r(lVar) ? 1 : 0) | ((i15 & 458752) == 131072 ? i16 : 0) | ((i15 & 7168) == 2048 ? i16 : 0);
            Object objQ7 = o0VarE.q();
            if (i27 == 0) {
                aVar.getClass();
                if (objQ7 == p3.m.a.f135155b) {
                    objQ7 = new g(lVar, lVar4, lVar2, null);
                    o0VarE.K(objQ7);
                }
            } else {
                objQ7 = new g(lVar, lVar4, lVar2, null);
                o0VarE.K(objQ7);
            }
            l0.e((e23.p) objQ7, lVar, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(z14, lVar, rVar, lVar2, lVar3, lVar4, eVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0108  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b7  */
    public static final void d(h4.r rVar, String str, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        int i15;
        e23.a aVar3;
        h4.r.a aVar4;
        int i16;
        boolean z14;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -1742096984);
        if ((i14 & 6) == 0) {
            i15 = (o0VarP.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarP.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarP.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarP.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarP.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar5 = h4.r.S;
            h4.r rVarThen = x2.x(x2.f(aVar5, 1.0f), null, 3).then(rVar);
            h4.d.f81522a.getClass();
            h4.g.a aVar6 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22696f, aVar6, o0VarP, 54);
            int iHashCode = Long.hashCode(o0VarP.U);
            i2 i2VarA0 = o0VarP.a0();
            h4.r rVarC = h4.k.c(rVarThen, o0VarP);
            h5.g.V.getClass();
            e0.a aVar7 = h5.g.a.f81805b;
            if (o0VarP.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar7);
            } else {
                o0VarP.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarP);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarP);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarP.T || !s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarP);
            b0 b0Var = b0.f22601a;
            p3.m.a aVar8 = p3.m.f135153a;
            if (str == null) {
                o0VarP.C(-327044879);
                f0 f0Var = f0.f110999a;
                String strQ = y.Q(o0VarP, R.string.epoch_reload_chart_button);
                boolean z15 = (i15 & 7168) == 2048;
                Object objQ = o0VarP.q();
                if (z15) {
                    objQ = new a1(aVar2, 9);
                    o0VarP.K(objQ);
                } else {
                    aVar8.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a1(aVar2, 9);
                        o0VarP.K(objQ);
                    }
                }
                aVar4 = aVar5;
                f0Var.i(strQ, null, false, (e23.a) objQ, o0VarP, 0, 6);
                o0VarP.g0(false);
                i16 = i15;
                z14 = false;
            } else {
                aVar4 = aVar5;
                o0VarP.C(-326894870);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                i16 = i15;
                z14 = false;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarP), o0VarP, (i15 >> 3) & 14, 0, 131070);
                o0VarP = o0VarP;
                o0VarP.g0(false);
            }
            f0.a aVar9 = f0.a.f111000a;
            String strQ2 = y.Q(o0VarP, R.string.common_learn_more);
            g6.f.a aVar10 = g6.f.f75994b;
            h4.r rVarC2 = c2.l.C(aVar4, 0.0f, 4, 0.0f, 0.0f, 13);
            boolean z16 = (i16 & 896) == 256 ? true : z14;
            Object objQ2 = o0VarP.q();
            if (z16) {
                aVar3 = aVar;
                objQ2 = new a1(aVar3, 10);
                o0VarP.K(objQ2);
            } else {
                aVar8.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    aVar3 = aVar;
                    objQ2 = new a1(aVar3, 10);
                    o0VarP.K(objQ2);
                } else {
                    aVar3 = aVar;
                }
            }
            aVar9.m(strQ2, rVarC2, false, (e23.a) objQ2, o0VarP, 48, 4);
            o0VarP.g0(true);
        } else {
            aVar3 = aVar;
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(rVar, str, aVar3, aVar2, i14, 26);
        }
    }
}
