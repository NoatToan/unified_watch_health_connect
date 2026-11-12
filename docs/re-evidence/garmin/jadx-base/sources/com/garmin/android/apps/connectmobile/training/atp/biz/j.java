package com.garmin.android.apps.connectmobile.training.atp.biz;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/j;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lfu1/m;", "", ModelSourceWrapper.POSITION, "", "activityId", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(IJLcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends com.garmin.android.library.backgroundtaskmanagement.b<fu1.m> {

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/j$a", "Liu1/k;", "Lps/m;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements iu1.k<ps.m> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f45172b;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.atp.biz.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/j$a$a", "Liu1/k;", "Lps/m;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0868a implements iu1.k<ps.m> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f45173a;

            public C0868a(j jVar) {
                this.f45173a = jVar;
            }

            @Override // iu1.k
            public final void onSuccess(ps.m mVar) {
                ps.m mVar2 = mVar;
                com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
                j jVar = this.f45173a;
                ((fu1.m) jVar.f50097g.get(eVar)).f73537c = mVar2;
                cw.e.a(jVar, new xt1.a(0L, null, mVar2, 3, null));
            }
        }

        public a(long j8) {
            this.f45172b = j8;
        }

        @Override // iu1.k
        public final void a(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA) {
                j jVar = j.this;
                cw.e.a(jVar, new em.e(this.f45172b, new C0868a(jVar)));
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // iu1.k
        public final void onSuccess(ps.m mVar) {
            ((fu1.m) j.this.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f73537c = mVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/j$b", "Liu1/k;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements iu1.k<com.garmin.android.apps.connectmobile.activities.newmodel.h> {
        public b() {
        }

        @Override // iu1.k
        public final void a(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            iu1.m.a(cVar);
            com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
            j jVar = j.this;
            ((fu1.m) jVar.f50097g.get(eVar)).f73538d = true;
            SoftReference<com.garmin.android.library.backgroundtaskmanagement.b.a> softReference = jVar.f50099i;
            ConcurrentHashMap concurrentHashMap = jVar.f50097g;
            if (jVar.f50098h.get()) {
                return;
            }
            Object obj = concurrentHashMap.get(eVar);
            if (softReference == null || softReference.get() == null || obj == null) {
                return;
            }
            softReference.get().J(jVar, eVar, concurrentHashMap.get(eVar));
        }

        @Override // iu1.k
        public final void onSuccess(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar) {
            ((fu1.m) j.this.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE)).f73536b = hVar;
        }
    }

    public j(int i14, long j8, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new fu1.m(i14, null, null, false, 14, null));
        cw.e.b(this, x.m(new em.g(j8, new b(), false, 4, null), new xt1.a(j8, new a(j8), null, 4, null)));
    }
}
