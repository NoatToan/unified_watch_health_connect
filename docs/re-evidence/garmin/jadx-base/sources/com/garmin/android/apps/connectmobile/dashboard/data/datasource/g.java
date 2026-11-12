package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/g;", "Lgm0/a;", "Lpb2/b$g;", "Lj70/h;", "Luh/b;", "apolloClient", "Lf12/b;", "userAccount", "<init>", "(Luh/b;Lf12/b;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends gm0.a<pb2.b.g, j70.h> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uh.b f33198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f12.b f33199f;

    static {
        new a(null);
    }

    public g(uh.b bVar, f12.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        this.f33198e = bVar;
        this.f33199f = bVar2;
    }

    @Override // gm0.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final uh.b getF33198e() {
        return this.f33198e;
    }

    @Override // gm0.a
    public final vh.s0 d(hm0.a aVar) {
        Set<o70.r> set = ((j70.h) aVar).f97530b;
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDateTime localDateTimeWithTime = localDateTimeNow.withTime(0, 0, 0, 0);
        LocalDateTime localDateTimeWithTime2 = localDateTimeNow.withTime(23, 59, 59, 0);
        String userDisplayName = this.f33199f.getUserDisplayName();
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof o70.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((o70.c) it.next()).d());
        }
        LocalDateTime localDateTimePlusDays = localDateTimeWithTime.minusWeeks(4).plusDays(1);
        localDateTimePlusDays.getClass();
        localDateTimeWithTime2.getClass();
        pb2.b bVar = new pb2.b(localDateTimePlusDays, localDateTimeWithTime2, userDisplayName, null, !arrayList2.isEmpty(), arrayList2, 8, null);
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String string = bVar.toString();
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GraphQLQueryActivities", string);
        return bVar;
    }

    @Override // gm0.a
    public final vh.s0.a i(vh.s0.a aVar, vh.s0.a aVar2) {
        pb2.b.a aVar3;
        pb2.b.g gVar = (pb2.b.g) aVar;
        pb2.b.g gVar2 = (pb2.b.g) aVar2;
        if (gVar2 == null || (aVar3 = gVar2.f136923a) == null) {
            aVar3 = gVar.f136923a;
        }
        return new pb2.b.g(aVar3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
