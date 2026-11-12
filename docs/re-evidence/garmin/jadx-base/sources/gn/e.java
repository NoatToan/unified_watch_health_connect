package gn;

import am.z0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgn/e;", "Ln70/o;", "Lin/a;", "Lj70/d;", "Lo70/a;", "activitiesData", "", "filterMultisportActivities", "<init>", "(Lj70/d;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends n70.o<in.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j70.d<o70.a> f78021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78022b;

    public e(j70.d<o70.a> dVar, boolean z14) {
        dVar.getClass();
        this.f78021a = dVar;
        this.f78022b = z14;
    }

    @Override // n70.o
    public final ArrayList c() {
        LocalDate localDateNow;
        ArrayList<ActivityListItemDTO> arrayList;
        Iterable iterable;
        List<String> list;
        j70.d<o70.a> dVar = this.f78021a;
        o70.a aVar = dVar.f97521b;
        String str = (aVar == null || (list = aVar.f129910a) == null) ? null : (String) h0.d0(list);
        o70.a aVar2 = dVar.f97521b;
        if (aVar2 == null || (localDateNow = aVar2.f129911b) == null) {
            localDateNow = LocalDate.now();
        }
        localDateNow.getClass();
        if (str == null) {
            iterable = j0.f134944a;
        } else {
            ps.b bVar = (ps.b) GsonUtil.f47253b.fromJson(str, ps.b.class);
            List list2 = (List) a(bVar.getActivities(), new c());
            if (list2 != null) {
                arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (g22.k.g(((ActivityListItemDTO) obj).C(), localDateNow)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (this.f78022b) {
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((ActivityListItemDTO) obj2).O1 <= 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
            }
            if (p005kotlin.jvm.internal.s.g(LocalDate.now().minusDays(1), localDateNow)) {
                if (arrayList != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        if (!z0.R(((ActivityListItemDTO) obj3).f29265g.f4358a)) {
                            arrayList3.add(obj3);
                        }
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
            }
            Map<Long, List<List<LatLng>>> mapB = bVar.b();
            Collection<n91.a> collection = (List) GsonUtil.f47253b.fromJson(bVar.getPersonalRecords(), new d().getType());
            if (collection == null) {
                collection = j0.f134944a;
            }
            if (arrayList != null) {
                ArrayList arrayList4 = new ArrayList(y.r(arrayList, 10));
                for (ActivityListItemDTO activityListItemDTO : arrayList) {
                    List<List<LatLng>> list3 = mapB != null ? mapB.get(Long.valueOf(activityListItemDTO.f29250b)) : null;
                    boolean z14 = false;
                    if (collection == null || !collection.isEmpty()) {
                        for (n91.a aVar3 : collection) {
                            if (aVar3.r()) {
                                Long activityId = aVar3.getActivityId();
                                long j8 = activityListItemDTO.f29250b;
                                if (activityId != null && activityId.longValue() == j8) {
                                    z14 = true;
                                    break;
                                }
                            }
                        }
                    }
                    arrayList4.add(new in.a(activityListItemDTO, list3, z14));
                }
                iterable = arrayList4;
            } else {
                iterable = j0.f134944a;
            }
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList5 = new ArrayList(y.r(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList5.add(new j70.d(dVar.f97520a, (in.a) it.next()));
        }
        return arrayList5;
    }

    @Override // n70.o
    /* JADX INFO: renamed from: d */
    public final o70.b getF78054b() {
        return o70.b.ACTIVITY;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetActivitiesDataUseCase";
    }

    public /* synthetic */ e(j70.d dVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, (i14 & 2) != 0 ? true : z14);
    }
}
