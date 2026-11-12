package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/i0;", "Lgm0/a;", "Lpb2/d$b;", "Lhm0/b;", "Luh/b;", "apolloClient", "<init>", "(Luh/b;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 extends gm0.a<pb2.d.b, hm0.b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uh.b f33230e;

    static {
        new a(null);
    }

    public i0(uh.b bVar) {
        bVar.getClass();
        this.f33230e = bVar;
    }

    @Override // gm0.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final uh.b getF33230e() {
        return this.f33230e;
    }

    @Override // gm0.a
    public final vh.s0 d(hm0.a aVar) {
        pb2.d dVar = new pb2.d(3);
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String string = dVar.toString();
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GraphQLQueryChallenges", string);
        return dVar;
    }

    @Override // gm0.a
    public final vh.s0.a i(vh.s0.a aVar, vh.s0.a aVar2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        pb2.d.b bVar = (pb2.d.b) aVar;
        pb2.d.b bVar2 = (pb2.d.b) aVar2;
        if (bVar2 == null || (obj = bVar2.f136931a) == null) {
            obj = bVar.f136931a;
        }
        if (bVar2 == null || (obj2 = bVar2.f136932b) == null) {
            obj2 = bVar.f136932b;
        }
        if (bVar2 == null || (obj3 = bVar2.f136933c) == null) {
            obj3 = bVar.f136933c;
        }
        if (bVar2 == null || (obj4 = bVar2.f136934d) == null) {
            obj4 = bVar.f136934d;
        }
        return new pb2.d.b(obj, obj2, obj3, obj4);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/i0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "CHALLENGES_QUERY_LIMIT", "I", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
