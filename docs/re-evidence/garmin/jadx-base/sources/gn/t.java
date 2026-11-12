package gn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgn/t;", "Ln70/o;", "Lsn/h;", "Lj70/d;", "Lo70/a;", "wellnessActivities", "<init>", "(Lj70/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends n70.o<sn.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j70.d<o70.a> f78057a;

    public t(j70.d<o70.a> dVar) {
        dVar.getClass();
        this.f78057a = dVar;
    }

    @Override // n70.o
    public final ArrayList c() {
        LocalDate localDateNow;
        List<String> list;
        j70.d<o70.a> dVar = this.f78057a;
        o70.a aVar = dVar.f97521b;
        List list2 = (List) a((aVar == null || (list = aVar.f129910a) == null) ? null : (String) h0.d0(list), new s());
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            LocalDate localDateO = ((sn.h) obj).o();
            o70.a aVar2 = dVar.f97521b;
            if (aVar2 == null || (localDateNow = aVar2.f129911b) == null) {
                localDateNow = LocalDate.now();
            }
            if (g22.k.g(localDateO, localDateNow)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new j70.d(dVar.f97520a, (sn.h) it.next()));
        }
        return arrayList2;
    }

    @Override // n70.o
    /* JADX INFO: renamed from: d */
    public final o70.b getF78054b() {
        return o70.b.HEALTH_SNAPSHOT;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetWellnessActivitiesDataUseCase";
    }
}
