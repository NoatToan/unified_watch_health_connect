package z41;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import l72.i3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import ya0.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    public static final void a(o51.f fVar, fe feVar, e23.l<? super w41.a, Unit> lVar, p3.m mVar, int i14) {
        fe feVar2;
        q13.b bVarB;
        fVar.getClass();
        Long l14 = fVar.f129237b;
        Long l15 = fVar.f129236a;
        feVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-782331085);
        int i15 = i14 | (o0VarE.B(fVar) ? 4 : 2) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean z14 = ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).orientation == 2;
            boolean z15 = fVar.J;
            boolean z16 = fVar.I || fVar.H.f129262a;
            boolean zB = o0VarE.B(l15) | o0VarE.B(l14);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                bVarB = w.b();
                if (!z15) {
                    if (l14 != null) {
                        String string = context.getString(R.string.lbl_edit_course);
                        string.getClass();
                        bVarB.add(new i3("edit_course", string, false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    }
                    String string2 = context.getString(R.string.workout_lbl_duplicate);
                    string2.getClass();
                    bVarB.add(new i3("duplicate", string2, false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    String string3 = context.getString(R.string.lbl_delete);
                    string3.getClass();
                    bVarB.add(new i3("delete", string3, false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                }
                objQ = p0.n(i53.a.e(w.a(bVarB)));
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    bVarB = w.b();
                    if (!z15 && l15 != null) {
                        if (l14 != null) {
                            String string4 = context.getString(R.string.lbl_edit_course);
                            string4.getClass();
                            bVarB.add(new i3("edit_course", string4, false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        }
                        String string5 = context.getString(R.string.workout_lbl_duplicate);
                        string5.getClass();
                        bVarB.add(new i3("duplicate", string5, false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        String string6 = context.getString(R.string.lbl_delete);
                        string6.getClass();
                        bVarB.add(new i3("delete", string6, false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    }
                    objQ = p0.n(i53.a.e(w.a(bVarB)));
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var = (p1) objQ;
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new yx2.b(27);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 48);
            boolean z17 = (i15 & 896) == 256;
            Object objQ3 = o0VarE.q();
            if (z17 || objQ3 == c2565a) {
                objQ3 = new f0(lVar, 15);
                o0VarE.K(objQ3);
            }
            c.w.a(0, 1, (e23.a) objQ3, o0VarE, false);
            boolean z18 = z14;
            feVar2 = feVar;
            boolean z19 = z16;
            z02.d.a(z19, z3.f.c(-283293896, new ak0.n(z18, z15, fVar, lVar, p1Var2, p1Var), o0VarE), z3.f.c(-851266119, new x91.f(feVar2, 5), o0VarE), null, null, z3.f.c(1739784508, new gw1.i(fVar, lVar, p1Var2, z15, z19, z18), o0VarE), o0VarE, 197040, 24);
        } else {
            feVar2 = feVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(fVar, feVar2, lVar, i14, 26);
        }
    }
}
