package ao;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.data.ActivitiesRepositoryImpl", f = "ActivitiesRepositoryImpl.kt", l = {59}, m = "searchBadgeActivities-yxL6bBk", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f11520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f11520b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f11519a = obj;
        this.f11521c |= Integer.MIN_VALUE;
        Object objC = this.f11520b.c(0, 0, 0, null, this);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : q.a(objC);
    }
}
