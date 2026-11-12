package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import java.util.Set;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/h;", "Lgm0/a;", "Lpb2/a$b;", "Lj70/h;", "Luh/b;", "apolloClient", "Lf12/b;", "userAccount", "Lc22/k;", "appConfigurationDelegate", "<init>", "(Luh/b;Lf12/b;Lc22/k;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends gm0.a<pb2.a.b, j70.h> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uh.b f33216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f12.b f33217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c22.k f33218g;

    static {
        new a(null);
    }

    public h(uh.b bVar, f12.b bVar2, c22.k kVar) {
        bVar.getClass();
        bVar2.getClass();
        kVar.getClass();
        this.f33216e = bVar;
        this.f33217f = bVar2;
        this.f33218g = kVar;
    }

    @Override // gm0.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final uh.b getF33216e() {
        return this.f33216e;
    }

    @Override // gm0.a
    public final vh.s0 d(hm0.a aVar) {
        DateTime dateTimeMinusDays;
        Set<o70.f> set = ((j70.h) aVar).f97529a;
        LocalDateTime localDateTimeWithTime = LocalDateTime.now().withTime(0, 0, 0, 0);
        o70.f fVar = o70.f.LAST_SEVEN_DAYS;
        if (set.contains(fVar)) {
            localDateTimeWithTime = localDateTimeWithTime.minusDays(6);
        } else if (set.contains(o70.f.YESTERDAY)) {
            localDateTimeWithTime = localDateTimeWithTime.minusDays(1);
        }
        LocalDateTime localDateTime = localDateTimeWithTime;
        LocalDateTime localDateTimeWithTime2 = LocalDateTime.now().withTime(23, 59, 59, 0);
        if (set.contains(fVar)) {
            dateTimeMinusDays = DateTime.now().minusDays(6);
        } else {
            dateTimeMinusDays = set.contains(o70.f.YESTERDAY) ? DateTime.now().minusDays(1) : DateTime.now();
        }
        DateTime dateTime = dateTimeMinusDays;
        DateTime dateTimePlusDays = DateTime.now().plusDays(1);
        String userDisplayName = this.f33217f.getUserDisplayName();
        int iD = (int) this.f33218g.d("gc5_activity_scalar_limit");
        dateTime.getClass();
        dateTimePlusDays.getClass();
        localDateTime.getClass();
        localDateTimeWithTime2.getClass();
        vh.p0.b bVar = vh.p0.f178367a;
        if (iD <= 0) {
            iD = 30;
        }
        Integer numValueOf = Integer.valueOf(iD);
        bVar.getClass();
        pb2.a aVar2 = new pb2.a(dateTime, dateTimePlusDays, localDateTime, localDateTimeWithTime2, userDisplayName, new vh.p0.c(numValueOf));
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String string = aVar2.toString();
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GraphQLQueryActivitiesAndWorkouts", string);
        return aVar2;
    }

    @Override // gm0.a
    public final vh.s0.a i(vh.s0.a aVar, vh.s0.a aVar2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        pb2.a.b bVar = (pb2.a.b) aVar;
        pb2.a.b bVar2 = (pb2.a.b) aVar2;
        if (bVar2 == null || (obj = bVar2.f136887a) == null) {
            obj = bVar.f136887a;
        }
        if (bVar2 == null || (obj2 = bVar2.f136888b) == null) {
            obj2 = bVar.f136888b;
        }
        if (bVar2 == null || (obj3 = bVar2.f136889c) == null) {
            obj3 = bVar.f136889c;
        }
        if (bVar2 == null || (obj4 = bVar2.f136890d) == null) {
            obj4 = bVar.f136890d;
        }
        return new pb2.a.b(obj, obj2, obj3, obj4, bVar2 != null ? bVar2.f136891e : null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
