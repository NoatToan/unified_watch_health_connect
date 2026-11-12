package o61;

import im.d0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo61/j;", "", "Lim/d0;", "aerobicChartData", "anaerobicChartData", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;", "activityList", "<init>", "(Lim/d0;Lim/d0;Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f129597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f129598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.activities.newmodel.h> f129599c;

    public j(d0 d0Var, d0 d0Var2, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d0Var, (i14 & 2) != 0 ? null : d0Var2, (i14 & 4) != 0 ? j0.f134944a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f129597a, jVar.f129597a) && s.g(this.f129598b, jVar.f129598b) && s.g(this.f129599c, jVar.f129599c);
    }

    public final int hashCode() {
        d0 d0Var = this.f129597a;
        int iHashCode = (d0Var == null ? 0 : d0Var.hashCode()) * 31;
        d0 d0Var2 = this.f129598b;
        return this.f129599c.hashCode() + ((iHashCode + (d0Var2 != null ? d0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrainingEffectDailySummary(aerobicChartData=");
        sb3.append(this.f129597a);
        sb3.append(", anaerobicChartData=");
        sb3.append(this.f129598b);
        sb3.append(", activityList=");
        return z.c(sb3, this.f129599c, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(d0 d0Var, d0 d0Var2, List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.h> list) {
        list.getClass();
        this.f129597a = d0Var;
        this.f129598b = d0Var2;
        this.f129599c = list;
    }

    public j() {
        this(null, null, null, 7, null);
    }
}
