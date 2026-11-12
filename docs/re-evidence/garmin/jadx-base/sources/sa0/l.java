package sa0;

import com.garmin.android.apps.connectmobile.R;
import g02.n1;
import gl1.y;
import l72.c1;
import p005kotlin.Unit;
import p3.o0;
import p3.x1;
import r53.p2;
import s70.j1;
import v62.ia;

/* JADX INFO: loaded from: classes8.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x0193  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b7  */
    public static final void a(final n nVar, boolean z14, boolean z15, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strJ;
        o0 o0VarE = mVar.E(-1348663665);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(nVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        final int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.startup_set_up_wi_fi_networks);
            String strQ2 = y.Q(o0VarE, R.string.msg_set_up_wifi_network);
            s62.a.f157643a.getClass();
            u4.d dVarA = ia.a(t62.b.f162798a);
            String strQ3 = y.Q(o0VarE, R.string.lbl_add_wifi_network);
            e23.a aVar3 = null;
            if (z15) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1014361821, R.string.lbl_set_up_wifi_later, o0VarE, false);
            } else {
                o0VarE.C(1380495662);
                o0VarE.g0(false);
                strJ = null;
            }
            p3.m.a aVar4 = p3.m.f135153a;
            if (z15) {
                o0VarE.C(1380558903);
                boolean zR = o0VarE.r(nVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new e23.a() { // from class: sa0.k
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            switch (i17) {
                                case 0:
                                    p2 p2Var = nVar.f158212c;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, n.b.a((n.b) value, false, false, false, true, null, null, null, 247)));
                                    break;
                                default:
                                    nVar.A4();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e23.a() { // from class: sa0.k
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                switch (i17) {
                                    case 0:
                                        p2 p2Var = nVar.f158212c;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, n.b.a((n.b) value, false, false, false, true, null, null, null, 247)));
                                        break;
                                    default:
                                        nVar.A4();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ);
                    }
                }
                aVar3 = (e23.a) objQ;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1380623383);
                o0VarE.g0(false);
            }
            boolean z16 = (57344 & i16) == 16384;
            Object objQ2 = o0VarE.q();
            if (z16) {
                objQ2 = new rk0.y(aVar2, 24);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new rk0.y(aVar2, 24);
                    o0VarE.K(objQ2);
                }
            }
            da0.p.b("wifi_setup_screen", strQ, dVarA, strQ2, null, strQ3, (e23.a) objQ2, false, strJ, aVar3, false, null, null, false, false, null, null, null, null, null, null, z3.f.c(298216335, new c02.d(z15, 5), o0VarE), o0VarE, 6, 0, 384, 4193424);
            o0Var = o0VarE;
            if (z14) {
                o0Var.C(1380964569);
                c1 c1Var = c1.f110940a;
                String strQ4 = y.Q(o0Var, R.string.wifi_skip_setup);
                String strQ5 = y.Q(o0Var, R.string.msg_skip_wifi_setup);
                String strQ6 = y.Q(o0Var, R.string.lbl_skip_button);
                boolean zR2 = ((i16 & 7168) == 2048) | o0Var.r(nVar);
                Object objQ3 = o0Var.q();
                if (zR2) {
                    objQ3 = new j1(4, nVar, aVar);
                    o0Var.K(objQ3);
                } else {
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new j1(4, nVar, aVar);
                        o0Var.K(objQ3);
                    }
                }
                e23.a<Unit> aVar5 = (e23.a) objQ3;
                String strQ7 = y.Q(o0Var, R.string.lbl_cancel);
                boolean zR3 = o0Var.r(nVar);
                Object objQ4 = o0Var.q();
                if (zR3) {
                    final int i18 = 1;
                    objQ4 = new e23.a() { // from class: sa0.k
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            switch (i18) {
                                case 0:
                                    p2 p2Var = nVar.f158212c;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, n.b.a((n.b) value, false, false, false, true, null, null, null, 247)));
                                    break;
                                default:
                                    nVar.A4();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var.K(objQ4);
                } else {
                    aVar4.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        final int i19 = 1;
                        objQ4 = new e23.a() { // from class: sa0.k
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                switch (i19) {
                                    case 0:
                                        p2 p2Var = nVar.f158212c;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, n.b.a((n.b) value, false, false, false, true, null, null, null, 247)));
                                        break;
                                    default:
                                        nVar.A4();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var.K(objQ4);
                    }
                }
                c1Var.a(false, strQ4, strQ5, null, null, strQ6, false, false, aVar5, strQ7, (e23.a) objQ4, o0Var, 0, 0, 217);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(1381481587);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n1(nVar, z14, z15, aVar, aVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public static final void b(n.b bVar, n nVar, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1806009742);
        int i15 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.r(nVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            boolean z15 = bVar.f158217d;
            boolean z16 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new rk0.y(aVar, 23);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rk0.y(aVar, 23);
                    o0VarE.K(objQ);
                }
            }
            a(nVar, z15, z14, (e23.a) objQ, aVar2, o0VarE, ((i15 >> 3) & 14) | (i15 & 896) | (i15 & 57344));
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(i14, 26, aVar, aVar2, bVar, nVar, z14);
        }
    }
}
