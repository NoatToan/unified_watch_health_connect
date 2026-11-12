package rg2;

import fg2.d0;
import java.util.ArrayList;
import java.util.Iterator;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p13.x;
import yg2.h0;
import yg2.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class k extends q implements e23.a<p<? extends String, ? extends String>> {
    public k(Object obj) {
        super(0, obj, fg2.f.class, "currentStepCount", "currentStepCount$live_session_view()Lkotlin/Pair;", 0);
    }

    @Override // e23.a
    public final p<? extends String, ? extends String> invoke() {
        int i14;
        h0 next;
        h0 h0Var;
        lt2.a duration;
        d0 d0Var = ((fg2.f) this.receiver).f71478b.f131781j;
        o oVar = (o) d0Var.f71428c.getValue();
        h0 h0Var2 = (h0) d0Var.f71431f.f150540a.getValue();
        yg2.a aVarC = fg2.h0.c(oVar, h0Var2 != null ? Integer.valueOf(h0Var2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()) : null);
        if (h0Var2 != null && aVarC != null && !fg2.h0.b(oVar)) {
            i53.c<h0> cVarD = oVar.d();
            int i15 = 0;
            if (cVarD == null || !cVarD.isEmpty()) {
                Iterator<h0> it = cVarD.iterator();
                i14 = 0;
                while (it.hasNext()) {
                    if (it.next().f197048o && (i14 = i14 + 1) < 0) {
                        x.p();
                        throw null;
                    }
                }
            } else {
                i14 = 0;
            }
            if (i14 == 0) {
                Iterator<yg2.a> it3 = oVar.b().iterator();
                int i16 = 0;
                while (it3.hasNext()) {
                    if (it3.next().getClusterIndex() == aVarC.getClusterIndex()) {
                        return new p<>(String.valueOf(i16 + 1), String.valueOf(oVar.b().size()));
                    }
                    i16++;
                }
                i16 = -1;
                return new p<>(String.valueOf(i16 + 1), String.valueOf(oVar.b().size()));
            }
            ArrayList arrayListG = fg2.h0.g(oVar.d(), aVarC.getStartStepIndex(), aVarC.getEndStepIndex());
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListG) {
                if (((h0) obj).f197048o) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() <= 1) {
                ArrayList<h0> arrayList2 = new ArrayList();
                for (Object obj2 : arrayListG) {
                    if (!((h0) obj2).f197048o) {
                        arrayList2.add(obj2);
                    }
                }
                int startStepIndex = aVarC.getStartStepIndex();
                int i17 = 0;
                while (startStepIndex <= h0Var2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()) {
                    Iterator<h0> it4 = oVar.d().iterator();
                    do {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                    } while (!(next.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == startStepIndex));
                    h0 h0Var3 = next;
                    if (h0Var3 == null) {
                        break;
                    }
                    if (h0Var3.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == mt2.l.INTERVAL || h0Var3.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == mt2.l.OTHER) {
                        i17++;
                    }
                    startStepIndex++;
                }
                if (!arrayList2.isEmpty()) {
                    int i18 = 0;
                    for (h0 h0Var4 : arrayList2) {
                        if ((h0Var4.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == mt2.l.INTERVAL || h0Var4.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == mt2.l.OTHER) && (i18 = i18 + 1) < 0) {
                            x.p();
                            throw null;
                        }
                    }
                    i15 = i18;
                }
                return new p<>(String.valueOf(i17), String.valueOf(i15));
            }
            Iterator it5 = p13.h0.V(1, arrayList).iterator();
            while (it5.hasNext() && (duration = (h0Var = (h0) it5.next()).getDuration()) != null) {
                int i19 = (int) duration.f114867b;
                int i24 = h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
                int i25 = h0Var2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
                if (i19 <= i25 && i25 <= i24) {
                    return s.g(d0Var.f71427b.getValue(), rf2.l.a.f152496a) ? new p<>(String.valueOf(d0Var.f71434i), String.valueOf(d0Var.f71435j)) : new p<>(String.valueOf((h0Var2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() + 1) - i19), String.valueOf((h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() - i19) + 1));
                }
            }
        }
        return null;
    }
}
