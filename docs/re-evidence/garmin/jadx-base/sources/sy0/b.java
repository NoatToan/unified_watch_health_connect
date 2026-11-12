package sy0;

import am.x0;
import am.z0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p13.h0;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsy0/b;", "", "Li53/c;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "fullActivityList", "Lam/x0;", "fullListFilters", "Li53/e;", "selectedFilters", "", "isFullActivitiesLoaded", "<init>", "(Li53/c;Li53/c;Li53/e;Z)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<ActivityListItemDTO> f161201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<x0> f161202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.e<x0> f161203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f161204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.f f161205e;

    /* JADX WARN: Multi-variable type inference failed */
    public b(i53.c<? extends ActivityListItemDTO> cVar, i53.c<? extends x0> cVar2, i53.e<? extends x0> eVar, boolean z14) {
        cVar.getClass();
        cVar2.getClass();
        eVar.getClass();
        this.f161201a = cVar;
        this.f161202b = cVar2;
        this.f161203c = eVar;
        this.f161204d = z14;
        ArrayList arrayList = new ArrayList();
        for (Object obj : cVar) {
            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj;
            if (!eVar.isEmpty()) {
                x0 x0Var = activityListItemDTO.f29265g;
                if (x0Var != null && !eVar.isEmpty()) {
                    Iterator it = eVar.iterator();
                    while (it.hasNext()) {
                        if (((x0) it.next()) == z0.d(x0Var, x0Var)) {
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        this.f161205e = i53.a.j(h0.N0(arrayList, new a()));
    }

    public static b a(b bVar, i53.h hVar, int i14) {
        i53.c<ActivityListItemDTO> cVar = bVar.f161201a;
        i53.c<x0> cVar2 = bVar.f161202b;
        i53.e<x0> eVar = hVar;
        if ((i14 & 4) != 0) {
            eVar = bVar.f161203c;
        }
        boolean z14 = (i14 & 8) != 0 ? bVar.f161204d : false;
        bVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        eVar.getClass();
        return new b(cVar, cVar2, eVar, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.f161201a, bVar.f161201a) && p005kotlin.jvm.internal.s.g(this.f161202b, bVar.f161202b) && p005kotlin.jvm.internal.s.g(this.f161203c, bVar.f161203c) && this.f161204d == bVar.f161204d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161204d) + ((this.f161203c.hashCode() + l2.a(this.f161202b, this.f161201a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ActivitiesSelectionState(fullActivityList=" + this.f161201a + ", fullListFilters=" + this.f161202b + ", selectedFilters=" + this.f161203c + ", isFullActivitiesLoaded=" + this.f161204d + ")";
    }

    public b() {
        this(null, null, null, false, 15, null);
    }

    public b(i53.c cVar, i53.c cVar2, i53.e eVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j53.l.b() : cVar, (i14 & 2) != 0 ? j53.l.b() : cVar2, (i14 & 4) != 0 ? i53.a.d() : eVar, (i14 & 8) != 0 ? false : z14);
    }
}
