package h60;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import c.q;
import c.w;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import et.p;
import gl1.y;
import l72.c1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.x1;
import r53.b2;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82163a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130849b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130851d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130854g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o82.g.f130856i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f82163a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h hVar, e23.a<Unit> aVar, m mVar, int i14) {
        final h hVar2 = hVar;
        e23.a<Unit> aVar2 = aVar;
        hVar2.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1744324655);
        final int i15 = 2;
        int i16 = (o0VarE.r(hVar2) ? 4 : 2) | i14 | (o0VarE.r(aVar2) ? 32 : 16);
        final int i17 = 1;
        final int i18 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(hVar2.f82170f, o0VarE);
            g.h hVar3 = new g.h();
            boolean zR = o0VarE.r(hVar2);
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (zR) {
                objQ = new d(hVar2, 0);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new d(hVar2, 0);
                    o0VarE.K(objQ);
                }
            }
            q qVarC = w.c(hVar3, (l) objQ, o0VarE, 0);
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = i53.a.a(o82.g.f130849b, o82.g.f130851d, o82.g.f130854g, o82.g.f130856i);
                o0VarE.K(objQ2);
            }
            i53.f fVar = (i53.f) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                n82.f.a aVar4 = new n82.f.a((o82.g) fVar.get(0), null, null, 6, null);
                o0VarE.K(aVar4);
                objQ3 = aVar4;
            }
            n82.f fVarA = n82.j.a((n82.f.a) objQ3, null, o0VarE, 2);
            o82.g gVarA = fVarA.f124961b.a();
            z3.e eVarC = z3.f.c(1602449844, new p(hVar2, gVarA, aVar2, context, qVarC), o0VarE);
            hVar2 = hVar;
            aVar2 = aVar;
            z02.d.a(false, eVarC, null, null, null, z3.f.c(-1025209928, new p(fVar, gVarA, fVarA, context, hVar, 17), o0VarE), o0VarE, 196656, 29);
            if (((j) p1VarC.getF182175a()).f82194b != null) {
                o0VarE.C(374173469);
                c1 c1Var = c1.f110940a;
                String strQ = y.Q(o0VarE, R.string.lbl_delete_css_result_question);
                String strQ2 = y.Q(o0VarE, R.string.lbl_delete_css_warning);
                String strQ3 = y.Q(o0VarE, R.string.lbl_delete);
                String strQ4 = y.Q(o0VarE, R.string.common_cancel);
                boolean zR2 = o0VarE.r(hVar2);
                Object objQ4 = o0VarE.q();
                if (zR2 || objQ4 == c2565a) {
                    objQ4 = new e23.a() { // from class: h60.f
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            switch (i18) {
                                case 0:
                                    h hVar4 = hVar2;
                                    b2 b2Var = hVar4.f82170f;
                                    g60.b bVar = ((j) b2Var.f150540a.getValue()).f82194b;
                                    DateTime dateTimeF = bVar != null ? bVar.f() : null;
                                    g60.b bVar2 = ((j) b2Var.f150540a.getValue()).f82194b;
                                    Long version = bVar2 != null ? bVar2.getVersion() : null;
                                    if (dateTimeF != null && version != null) {
                                        ge1.b.T(v1.a(hVar4), null, null, new i(hVar4, dateTimeF, version, null), 3);
                                    }
                                    break;
                                case 1:
                                    hVar2.y4(null);
                                    break;
                                default:
                                    p2 p2Var = hVar2.f82169e;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, j.a((j) value, null, null, 3)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ4);
                }
                e23.a<Unit> aVar5 = (e23.a) objQ4;
                boolean zR3 = o0VarE.r(hVar2);
                Object objQ5 = o0VarE.q();
                if (zR3 || objQ5 == c2565a) {
                    objQ5 = new e23.a() { // from class: h60.f
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            switch (i17) {
                                case 0:
                                    h hVar4 = hVar2;
                                    b2 b2Var = hVar4.f82170f;
                                    g60.b bVar = ((j) b2Var.f150540a.getValue()).f82194b;
                                    DateTime dateTimeF = bVar != null ? bVar.f() : null;
                                    g60.b bVar2 = ((j) b2Var.f150540a.getValue()).f82194b;
                                    Long version = bVar2 != null ? bVar2.getVersion() : null;
                                    if (dateTimeF != null && version != null) {
                                        ge1.b.T(v1.a(hVar4), null, null, new i(hVar4, dateTimeF, version, null), 3);
                                    }
                                    break;
                                case 1:
                                    hVar2.y4(null);
                                    break;
                                default:
                                    p2 p2Var = hVar2.f82169e;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, j.a((j) value, null, null, 3)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ5);
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar5, strQ4, (e23.a) objQ5, o0VarE, 6, 0, 216);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(374692595);
                o0VarE.g0(false);
            }
            if (((j) p1VarC.getF182175a()).f82195c != null) {
                o0VarE.C(374763430);
                c1 c1Var2 = c1.f110940a;
                String strQ5 = y.Q(o0VarE, R.string.lbl_unable_to_delete);
                String strQ6 = y.Q(o0VarE, R.string.lbl_css_last_entry);
                String strQ7 = y.Q(o0VarE, R.string.lbl_ok);
                boolean zR4 = o0VarE.r(hVar2);
                Object objQ6 = o0VarE.q();
                if (zR4 || objQ6 == c2565a) {
                    objQ6 = new e23.a() { // from class: h60.f
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            switch (i15) {
                                case 0:
                                    h hVar4 = hVar2;
                                    b2 b2Var = hVar4.f82170f;
                                    g60.b bVar = ((j) b2Var.f150540a.getValue()).f82194b;
                                    DateTime dateTimeF = bVar != null ? bVar.f() : null;
                                    g60.b bVar2 = ((j) b2Var.f150540a.getValue()).f82194b;
                                    Long version = bVar2 != null ? bVar2.getVersion() : null;
                                    if (dateTimeF != null && version != null) {
                                        ge1.b.T(v1.a(hVar4), null, null, new i(hVar4, dateTimeF, version, null), 3);
                                    }
                                    break;
                                case 1:
                                    hVar2.y4(null);
                                    break;
                                default:
                                    p2 p2Var = hVar2.f82169e;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, j.a((j) value, null, null, 3)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ6);
                }
                o0 o0Var = o0VarE;
                c1Var2.a(false, strQ5, strQ6, null, null, strQ7, false, false, (e23.a) objQ6, null, null, o0Var, 6, 0, 1752);
                o0VarE = o0Var;
                o0VarE.g0(false);
            } else {
                o0VarE.C(375120147);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g80.e(hVar2, aVar2, i14, 14);
        }
    }
}
