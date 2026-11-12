package p52;

import com.garmin.android.apps.connectmobile.workouts.data.model.d;
import f12.l;
import g22.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n70.o;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp52/b;", "Ln70/o;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/d;", "Lj70/d;", "Lo70/a;", "workoutsData", "Lf12/l;", "gcmUserSettings", "<init>", "(Lj70/d;Lf12/l;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends o<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j70.d<o70.a> f136179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f136180b;

    public b(j70.d<o70.a> dVar, l lVar) {
        dVar.getClass();
        lVar.getClass();
        this.f136179a = dVar;
        this.f136180b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    @Override // n70.o
    public final ArrayList c() {
        ?? arrayList;
        List<String> list;
        j70.d<o70.a> dVar = this.f136179a;
        o70.a aVar = dVar.f97521b;
        ArrayList arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        List list2 = (List) a((aVar == null || (list = aVar.f129910a) == null) ? null : (String) h0.d0(list), new a());
        if (list2 != null) {
            arrayList = new ArrayList();
            for (Object obj : list2) {
                d dVar2 = (d) obj;
                DateTime dateTimeG = dVar2.g();
                if (dateTimeG != null && k.k(dateTimeG) && dVar2.getAssociatedActivityId() == null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = j0.f134944a;
        }
        int iH = (int) this.f136180b.h();
        if (iH >= 0) {
            int secondOfDay = DateTime.now().getSecondOfDay();
            int i14 = iH - 7200;
            boolean z14 = i14 < 0;
            int i15 = iH + 7200;
            if (i15 < 86400 ? !(!z14 ? Math.abs(secondOfDay - iH) > 7200 : secondOfDay > i15 && secondOfDay < iH - (-79200)) : !(secondOfDay < i14 && secondOfDay > iH - 79200)) {
                if (list2 != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        d dVar3 = (d) obj2;
                        DateTime dateTimeG2 = dVar3.g();
                        if (dateTimeG2 != null && k.l(dateTimeG2) && dVar3.getAssociatedActivityId() == null) {
                            arrayList2.add(obj2);
                        }
                    }
                }
            }
        }
        Collection collection = (Collection) arrayList;
        Iterable iterable = arrayList2;
        if (arrayList2 == null) {
            iterable = j0.f134944a;
        }
        ArrayList arrayListC0 = h0.C0(collection, iterable);
        ArrayList arrayList3 = new ArrayList(y.r(arrayListC0, 10));
        Iterator it = arrayListC0.iterator();
        while (it.hasNext()) {
            arrayList3.add(new j70.d(dVar.f97520a, (d) it.next()));
        }
        return arrayList3;
    }

    @Override // n70.o
    /* JADX INFO: renamed from: d */
    public final o70.b getF78054b() {
        return o70.b.WORKOUT;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetWorkoutsDataUseCase";
    }
}
