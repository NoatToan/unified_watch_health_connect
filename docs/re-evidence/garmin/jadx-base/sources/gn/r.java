package gn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgn/r;", "Ln70/o;", "Lpb2/a$d;", "Lj70/d;", "Lo70/q;", "pendingActivities", "<init>", "(Lj70/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends n70.o<pb2.a.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j70.d<o70.q> f78056a;

    public r(j70.d<o70.q> dVar) {
        dVar.getClass();
        this.f78056a = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    @Override // n70.o
    public final ArrayList c() {
        LocalDate localDateNow;
        ?? arrayList;
        j70.d<o70.q> dVar = this.f78056a;
        o70.q qVar = dVar.f97521b;
        List<pb2.a.d> list = qVar != null ? qVar.f130054a : null;
        if (qVar == null || (localDateNow = qVar.f130055b) == null) {
            localDateNow = LocalDate.now();
        }
        localDateNow.getClass();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                LocalDateTime localDateTime = ((pb2.a.d) obj).f136897e;
                if (g22.k.g(localDateTime != null ? g22.k.x(localDateTime).toLocalDate() : null, localDateNow)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = j0.f134944a;
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(new j70.d(dVar.f97520a, (pb2.a.d) it.next()));
        }
        return arrayList2;
    }

    @Override // n70.o
    /* JADX INFO: renamed from: d */
    public final o70.b getF78054b() {
        return o70.b.PENDING_ACTIVITIES;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetPActivitiesDataUseCase";
    }
}
