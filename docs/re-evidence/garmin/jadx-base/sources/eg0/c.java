package eg0;

import android.view.View;
import com.garmin.android.apps.connectmobile.workouts.data.model.z;
import fg0.d;
import fg0.j;
import fg0.k;
import gg0.f;
import gg0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.y;
import r22.q0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public static final k a(k kVar, j jVar) {
        ?? arrayList;
        d dVarH;
        j jVar2;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH = kVar.h();
        if (listH != null) {
            arrayList = new ArrayList(y.r(listH, 10));
            Iterator it = listH.iterator();
            while (it.hasNext()) {
                arrayList.add(com.garmin.android.apps.connectmobile.workouts.data.model.k.b((com.garmin.android.apps.connectmobile.workouts.data.model.k) it.next(), null, null, null, 63));
            }
        } else {
            arrayList = j0.f134944a;
        }
        ?? r16 = arrayList;
        d completionTarget = kVar.getCompletionTarget();
        if (completionTarget != null) {
            dVarH = d.h(completionTarget);
        } else {
            og0.a.f131967a.getClass();
            z zVarF = og0.a.f(r16);
            d dVar = new d(null, null, null, 7, null);
            dVar.s(h.DISTANCE);
            dVar.t(zVarF.getValue());
            dVar.r(zVarF.getUnit());
            dVarH = dVar;
        }
        f fVar = f.f77136l;
        if (jVar == null) {
            j eventCustomization = kVar.getEventCustomization();
            j jVarB = eventCustomization != null ? j.b(eventCustomization, null, null, null, null, null, null, 8191) : null;
            jVar2 = jVarB == null ? new j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null) : jVarB;
        } else {
            jVar2 = jVar;
        }
        return new k(null, null, null, null, null, null, null, null, null, null, null, dVarH, r16, null, null, null, null, null, null, null, fVar, null, null, null, jVar2, kVar.getEventOrganizer(), null, null, null, null, null, null, null, -51386369, 1, null);
    }

    public static final dg0.a b(j jVar) {
        jVar.getClass();
        Boolean isPrimaryEvent = jVar.getIsPrimaryEvent();
        Boolean bool = Boolean.TRUE;
        if (s.g(isPrimaryEvent, bool)) {
            return dg0.a.PRIMARY_EVENT;
        }
        Boolean isPrimaryEvent2 = jVar.getIsPrimaryEvent();
        Boolean bool2 = Boolean.FALSE;
        if (s.g(isPrimaryEvent2, bool2) && s.g(jVar.getIsTrainingEvent(), bool)) {
            return dg0.a.SUPPORTING_EVENT;
        }
        if (s.g(jVar.getIsPrimaryEvent(), bool2) && s.g(jVar.getIsTrainingEvent(), bool2)) {
            return dg0.a.NO_PRIORITY;
        }
        return null;
    }

    public static final void c(View view2, String str) {
        view2.getClass();
        q0.b.c(q0.f149800b, view2, str, null, 12).show();
    }
}
