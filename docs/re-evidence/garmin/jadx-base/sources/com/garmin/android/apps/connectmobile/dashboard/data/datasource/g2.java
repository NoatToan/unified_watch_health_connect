package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/g2;", "Lgm0/a;", "Lpb2/h$b;", "Lhm0/b;", "Luh/b;", "apolloClient", "Lf12/l;", "userSettings", "<init>", "(Luh/b;Lf12/l;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g2 extends gm0.a<pb2.h.b, hm0.b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uh.b f33214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f12.l f33215f;

    static {
        new a(null);
    }

    public g2(uh.b bVar, f12.l lVar) {
        bVar.getClass();
        lVar.getClass();
        this.f33214e = bVar;
        this.f33215f = lVar;
    }

    @Override // gm0.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final uh.b getF33216e() {
        return this.f33214e;
    }

    @Override // gm0.a
    public final vh.s0 d(hm0.a aVar) {
        fy1.i.f73924a.getClass();
        String strF = fy1.i.a.f();
        String str = this.f33215f.e1().f77269a;
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        pb2.h hVar = new pb2.h(dateTimeNow, strF, str);
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String string = hVar.toString();
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GraphQLQueryTrainingPlans", string);
        return hVar;
    }

    @Override // gm0.a
    public final vh.s0.a i(vh.s0.a aVar, vh.s0.a aVar2) {
        Object obj;
        pb2.h.b bVar = (pb2.h.b) aVar;
        pb2.h.b bVar2 = (pb2.h.b) aVar2;
        if (bVar2 == null || (obj = bVar2.f137159a) == null) {
            obj = bVar.f137159a;
        }
        return new pb2.h.b(obj);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/g2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
