package yg2;

import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class w0<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f197230a;

    public w0(u0 u0Var) {
        this.f197230a = u0Var;
    }

    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        a next;
        T next2;
        String str;
        sf2.e eVar = (sf2.e) obj;
        if (eVar instanceof sf2.e.d) {
            u0 u0Var = this.f197230a;
            Iterator<a> it = ((o) u0Var.z4().f150540a.getValue()).b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                a aVar = next;
                if (aVar.getStartStepIndex() < aVar.getEndStepIndex()) {
                    j23.l lVar = new j23.l(aVar.getStartStepIndex(), aVar.getEndStepIndex());
                    h0 h0Var = (h0) u0Var.y4().f71478b.f131781j.f71431f.f150540a.getValue();
                    Integer num = h0Var != null ? new Integer(h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()) : null;
                    if (num != null && lVar.d(num.intValue())) {
                        break;
                    }
                }
            }
            a aVar2 = next;
            h0 h0VarA = g0.a(((o) u0Var.z4().f150540a.getValue()).d(), aVar2 != null ? new Integer(aVar2.getEndStepIndex()) : null);
            if (h0VarA != null && h0VarA.f197048o) {
                lt2.a duration = h0VarA.getDuration();
                if ((duration != null ? duration.f114866a : null) == mt2.c.TIME) {
                    Iterator<T> it3 = ((sf2.e.d) eVar).f158954a.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = (T) null;
                            break;
                        }
                        next2 = it3.next();
                    } while (((rf2.b) next2).f152455a != rf2.a.WORKOUT_REPS_TO_GO);
                    rf2.b bVar = next2;
                    if (bVar != null && (str = bVar.f152461g) != null) {
                        u0Var.f197213d.k(null, str);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
