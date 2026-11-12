package a61;

import c80.y0;
import com.garmin.android.apps.connectmobile.performance.StrengthStatsActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f1592b;

    public /* synthetic */ f(Set set, int i14) {
        this.f1591a = i14;
        this.f1592b = set;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f1591a;
        boolean z14 = false;
        Set set = this.f1592b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.performance.dto.c cVar = (com.garmin.android.apps.connectmobile.performance.dto.c) obj;
                StrengthStatsActivity.a aVar = StrengthStatsActivity.f39815r;
                cVar.getClass();
                return new StrengthStatsActivity.b(new p71.b(cVar), !set.contains(cVar));
            case 1:
                y0 y0Var = (y0) obj;
                y0Var.getClass();
                Set<String> set2 = y0Var.f25650n;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator<T> it = set2.iterator();
                    while (it.hasNext()) {
                        if (set.contains((String) it.next())) {
                            z14 = true;
                        }
                    }
                }
                return Boolean.valueOf(z14);
            default:
                sd2.f fVar = (sd2.f) obj;
                Logger logger = vr2.c.f179562o;
                fVar.getClass();
                if (set.contains(Long.valueOf(fVar.getUnitID())) && fVar.i1() && fVar.getConnectionType() == 1) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
        }
    }
}
