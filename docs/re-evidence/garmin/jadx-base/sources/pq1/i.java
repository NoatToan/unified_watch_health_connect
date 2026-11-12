package pq1;

import java.util.List;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<Long> f139597a = x.k(12L, 16L);

    public static final jq1.h a(n91.a aVar) {
        jq1.h.b bVar;
        long typeId = aVar.getTypeId();
        if (typeId == 16) {
            bVar = jq1.h.b.a.f100016a;
        } else {
            q91.d.f143558e.getClass();
            bVar = q91.d.f143559f.contains(Long.valueOf(typeId)) ? jq1.h.b.C1927b.f100017a : null;
        }
        jq1.h.b bVar2 = bVar;
        Long prStartTimeGmt = aVar.getPrStartTimeGmt();
        return new jq1.h(bVar2, prStartTimeGmt != null ? prStartTimeGmt.longValue() : 0L, aVar.getValue());
    }
}
