package uk0;

import b63.z;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import i3.bc;
import i3.d3;
import i3.m4;
import i3.x3;
import l72.c1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import s70.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"uk0/h$a", "Li3/bc;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements bc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b63.o f171828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b63.o f171829b;

        public a(b63.o oVar, b63.o oVar2) {
            this.f171828a = oVar;
            this.f171829b = oVar2;
        }

        @Override // i3.bc
        public final boolean a(long j8) {
            b63.l.INSTANCE.getClass();
            b63.l lVarA = b63.l.Companion.a(j8);
            z.INSTANCE.getClass();
            b63.o oVarB = b63.b.d(lVarA, z.f16226b).b();
            b63.o oVar = this.f171828a;
            if (oVar != null && oVarB.compareTo(oVar) < 0) {
                return false;
            }
            b63.o oVar2 = this.f171829b;
            return oVar2 == null || oVarB.compareTo(oVar2) <= 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    public static final void a(b63.o oVar, e23.l<? super b63.o, Unit> lVar, e23.a<Unit> aVar, b63.o oVar2, b63.o oVar3, p3.m mVar, int i14, int i15) {
        b63.o oVar4;
        int i16;
        b63.o oVar5;
        int i17;
        b63.o oVar6;
        int year;
        int year2;
        oVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1654406281);
        int i18 = i14 | (o0VarE.r(oVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        int i19 = i15 & 8;
        if (i19 != 0) {
            i16 = i18 | 3072;
            oVar4 = oVar2;
        } else {
            oVar4 = oVar2;
            i16 = i18 | (o0VarE.r(oVar4) ? 2048 : 1024);
        }
        int i24 = i15 & 16;
        if (i24 != 0) {
            i17 = i16 | 24576;
            oVar5 = oVar3;
        } else {
            oVar5 = oVar3;
            i17 = i16 | (o0VarE.r(oVar5) ? 16384 : 8192);
        }
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            b63.o oVar7 = i19 != 0 ? null : oVar4;
            b63.o oVar8 = i24 != 0 ? null : oVar5;
            x1 x1Var = p3.n.f135158a;
            if (oVar7 != null) {
                year = oVar7.f16206a.getYear();
            } else {
                d3.f87817a.getClass();
                year = d3.f87818b.f96796a;
            }
            if (oVar8 != null) {
                year2 = oVar8.f16206a.getYear();
            } else {
                d3.f87817a.getClass();
                year2 = d3.f87818b.f96797b;
            }
            z.INSTANCE.getClass();
            m4 m4VarP = x3.p(Long.valueOf(b63.b.a(oVar, z.f16226b).c()), new j23.l(year, year2), new a(oVar7, oVar8), o0VarE, 0, 10);
            boolean z14 = (i17 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new ta0.j(lVar, 11);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ta0.j(lVar, 11);
                    o0VarE.K(objQ);
                }
            }
            vx.c.c(m4VarP, null, (e23.l) objQ, null, aVar, false, o0VarE, (i17 << 6) & 57344, 42);
            oVar4 = oVar7;
            oVar6 = oVar8;
        } else {
            o0VarE.e();
            oVar6 = oVar5;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(oVar, (e23.l) lVar, (e23.a) aVar, oVar4, oVar6, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    public static final void b(e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(286739776);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.max_gear_limit_reached);
            String strQ2 = y.Q(o0VarE, R.string.remove_gear_to_add_another_one);
            String strQ3 = y.Q(o0VarE, R.string.common_button_ok);
            int i16 = i15 & 14;
            boolean z14 = i16 == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new u11.b(aVar, 18);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new u11.b(aVar, 18);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar3 = (e23.a) objQ;
            boolean z15 = i16 == 4;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new u11.b(aVar, 19);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new u11.b(aVar, 19);
                    o0VarE.K(objQ2);
                }
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar3, null, (e23.a) objQ2, o0VarE, 0, 0, 729);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(aVar, i14, 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    public static final void c(e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-1765096007);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.lbl_error_occurred);
            String strQ2 = y.Q(o0VarE, R.string.generic_error_message);
            String strQ3 = y.Q(o0VarE, R.string.lbl_ok);
            int i16 = i15 & 14;
            boolean z14 = i16 == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new u11.b(aVar, 16);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new u11.b(aVar, 16);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar3 = (e23.a) objQ;
            boolean z15 = i16 == 4;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new u11.b(aVar, 17);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new u11.b(aVar, 17);
                    o0VarE.K(objQ2);
                }
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar3, null, (e23.a) objQ2, o0VarE, 0, 0, 729);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(aVar, i14, 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    public static final void d(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -984548216);
        int i16 = (o0VarP.r(aVar) ? 4 : 2) | i14 | (o0VarP.r(aVar2) ? 32 : 16);
        if (o0VarP.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarP, R.string.lbl_error_occurred);
            String strQ2 = y.Q(o0VarP, R.string.technical_challenge_message);
            String strQ3 = y.Q(o0VarP, R.string.lbl_try_again);
            boolean z14 = (i16 & 14) == 4;
            Object objQ = o0VarP.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z14) {
                objQ = new u11.b(aVar, 20);
                o0VarP.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new u11.b(aVar, 20);
                    o0VarP.K(objQ);
                }
            }
            e23.a<Unit> aVar4 = (e23.a) objQ;
            String strQ4 = y.Q(o0VarP, R.string.lbl_cancel);
            boolean z15 = (i16 & 112) == 32;
            Object objQ2 = o0VarP.q();
            if (z15) {
                objQ2 = new u11.b(aVar2, 21);
                o0VarP.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new u11.b(aVar2, 21);
                    o0VarP.K(objQ2);
                }
            }
            o0Var = o0VarP;
            i15 = 16;
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar4, strQ4, (e23.a) objQ2, o0Var, 0, 0, 217);
        } else {
            o0Var = o0VarP;
            i15 = 16;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    public static final void e(e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(1094746183);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.invalid_information);
            String strQ2 = y.Q(o0VarE, R.string.ensure_required_fields_valid_before_save);
            String strQ3 = y.Q(o0VarE, R.string.common_button_ok);
            int i16 = i15 & 14;
            boolean z14 = i16 == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new u11.b(aVar, 22);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new u11.b(aVar, 22);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar3 = (e23.a) objQ;
            boolean z15 = i16 == 4;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new u11.b(aVar, 23);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new u11.b(aVar, 23);
                    o0VarE.K(objQ2);
                }
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar3, null, (e23.a) objQ2, o0VarE, 0, 0, 729);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(aVar, i14, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    public static final void f(e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(121387256);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.missing_information);
            String strQ2 = y.Q(o0VarE, R.string.fill_required_fields_before_save);
            String strQ3 = y.Q(o0VarE, R.string.common_button_ok);
            int i16 = i15 & 14;
            boolean z14 = i16 == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new u11.b(aVar, 14);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new u11.b(aVar, 14);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar3 = (e23.a) objQ;
            boolean z15 = i16 == 4;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new u11.b(aVar, 15);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new u11.b(aVar, 15);
                    o0VarE.K(objQ2);
                }
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar3, null, (e23.a) objQ2, o0VarE, 0, 0, 729);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(aVar, i14, 20);
        }
    }
}
