package f62;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p006l2.w2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf62/v;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q;", "Lr52/c;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q, r52.c> {
    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(r52.c cVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar, p3.m mVar, int i14) {
        int i15;
        cVar.getClass();
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(-909540043);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(qVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = qVar.f49269y;
            int i16 = R.string.lbl_done;
            if (z14) {
                o0VarE.C(841681562);
                r52.c.a(cVar, "REORDER_DONE", gl1.y.Q(o0VarE, R.string.lbl_done), true, 4);
                o0VarE.g0(false);
            } else {
                o0VarE.C(841364432);
                if (!(qVar.f49263s instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.a)) {
                    i16 = R.string.lbl_save;
                }
                String strQ = gl1.y.Q(o0VarE, i16);
                l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar = qVar.f49250f;
                iVar.getClass();
                r52.c.a(cVar, "SAVE_WORKOUT", strQ, l52.o.c(iVar, new w2(22)), 4);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.a0(this, cVar, qVar, i14, 6);
        }
    }
}
