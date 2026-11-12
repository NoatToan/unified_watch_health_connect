package g11;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import f21.a0;
import fo.x;
import gl1.y;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p3.o0;
import p3.p2;
import p3.x1;
import p5.v;
import r53.u1;
import r70.q;
import r70.r;
import v01.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg11/f;", "Lr70/r;", "Lh11/a;", "stateHolder", "<init>", "(Lh11/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h11.a f74847a;

    public f(h11.a aVar) {
        aVar.getClass();
        this.f74847a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -2000066136);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        int i16 = 0;
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                v0 v0Var = this.f74847a.f80818a;
                objQ = new u1(v0Var.f174556a, v0Var.f174557b, new v01.u0(v0Var, null));
                o0VarQ.K(objQ);
            }
            q01.f.c cVar = q01.f.c.f142008b;
            q01.f fVar = (q01.f) s9.c.b((r53.i) objQ, cVar, o0VarQ, 48).getF182175a();
            if (s.g(fVar, cVar) || s.g(fVar, q01.f.b.f142007b)) {
                o0VarQ.C(111448848);
                Object objQ2 = o0VarQ.q();
                if (objQ2 == c2565a) {
                    objQ2 = new x(24);
                    o0VarQ.K(objQ2);
                }
                j.e(v.c((e23.l) objQ2, rVar, true), null, fVar.f142005a, null, null, null, false, null, o0VarQ, 0, 250);
                o0VarQ = o0VarQ;
                o0VarQ.g0(false);
            } else if (fVar instanceof q01.f.C2664f) {
                o0VarQ.C(111690617);
                Object objQ3 = o0VarQ.q();
                if (objQ3 == c2565a) {
                    objQ3 = new x(25);
                    o0VarQ.K(objQ3);
                }
                j.d(v.c((e23.l) objQ3, rVar, true), null, (q01.f.C2664f) fVar, o0VarQ, 0);
                o0VarQ.g0(false);
            } else if (fVar instanceof q01.f.d) {
                o0VarQ.C(111928697);
                Object objQ4 = o0VarQ.q();
                if (objQ4 == c2565a) {
                    objQ4 = new x(26);
                    o0VarQ.K(objQ4);
                }
                j.c(v.c((e23.l) objQ4, rVar, true), null, (q01.f.d) fVar, o0VarQ, 0);
                o0VarQ.g0(false);
            } else if (s.g(fVar, q01.f.e.f142013b)) {
                o0VarQ.C(112198428);
                Object objQ5 = o0VarQ.q();
                if (objQ5 == c2565a) {
                    objQ5 = new x(27);
                    o0VarQ.K(objQ5);
                }
                h4.r rVarC = v.c((e23.l) objQ5, rVar, true);
                String strQ = y.Q(o0VarQ, R.string.title_no_food_logged);
                String strQ2 = y.Q(o0VarQ, R.string.nutrition_no_data_description);
                String strQ3 = y.Q(o0VarQ, R.string.calories_edit_button);
                boolean zR = o0VarQ.r(context);
                Object objQ6 = o0VarQ.q();
                if (zR || objQ6 == c2565a) {
                    objQ6 = new cy1.a(context, 19);
                    o0VarQ.K(objQ6);
                }
                j.b(rVarC, strQ, strQ2, (e23.a) objQ6, strQ3, o0VarQ, 0, 0);
                o0VarQ.g0(false);
            } else if (s.g(fVar, q01.f.a.f142006b)) {
                o0VarQ.C(113156700);
                Object objQ7 = o0VarQ.q();
                if (objQ7 == c2565a) {
                    objQ7 = new x(28);
                    o0VarQ.K(objQ7);
                }
                j.b(v.c((e23.l) objQ7, rVar, true), y.Q(o0VarQ, R.string.nutrition_is_not_supported), y.Q(o0VarQ, R.string.nutrition_is_not_supported_child_account), null, null, o0VarQ, 0, 24);
                o0VarQ.g0(false);
            } else if (s.g(fVar, q01.f.g.f142018b)) {
                o0VarQ.C(113577587);
                Object objQ8 = o0VarQ.q();
                if (objQ8 == c2565a) {
                    objQ8 = new x(29);
                    o0VarQ.K(objQ8);
                }
                h4.r rVarC2 = v.c((e23.l) objQ8, rVar, true);
                String strQ4 = y.Q(o0VarQ, R.string.nutrition_set_up_title);
                String strQ5 = y.Q(o0VarQ, R.string.nutrition_set_up_description);
                String strQ6 = y.Q(o0VarQ, R.string.lbl_get_started);
                boolean zR2 = o0VarQ.r(context);
                Object objQ9 = o0VarQ.q();
                if (zR2 || objQ9 == c2565a) {
                    objQ9 = new cy1.a(context, 20);
                    o0VarQ.K(objQ9);
                }
                j.b(rVarC2, strQ4, strQ5, (e23.a) objQ9, strQ6, o0VarQ, 0, 0);
                o0VarQ.g0(false);
            } else {
                if (!(fVar instanceof q01.f.h)) {
                    throw kg.f.h(o0VarQ, 2081799965, false);
                }
                o0VarQ.C(114341830);
                Object objQ10 = o0VarQ.q();
                if (objQ10 == c2565a) {
                    objQ10 = new e(i16);
                    o0VarQ.K(objQ10);
                }
                h4.r rVarC3 = v.c((e23.l) objQ10, rVar, true);
                String strQ7 = y.Q(o0VarQ, R.string.nutrition_set_up_title);
                String strQ8 = y.Q(o0VarQ, R.string.nutrition_set_up_description);
                String strJ = ((q01.f.h) fVar).f142019b ? com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, 114668663, R.string.start_your_free_trial, o0VarQ, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, 114773474, R.string.edit_profile_frame_non_subscriber_join_gcp, o0VarQ, false);
                boolean zR3 = o0VarQ.r(context);
                Object objQ11 = o0VarQ.q();
                if (zR3 || objQ11 == c2565a) {
                    objQ11 = new cy1.a(context, 18);
                    o0VarQ.K(objQ11);
                }
                j.b(rVarC3, strQ7, strQ8, (e23.a) objQ11, strJ, o0VarQ, 0, 0);
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0((r) this, rVar, qVar, i14, 16);
        }
    }
}
