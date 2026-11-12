package ao;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.data.ActivitiesRepositoryImpl", f = "ActivitiesRepositoryImpl.kt", l = {28}, m = "searchActivities-gIAlu-s", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f11517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f11517b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f11516a = obj;
        this.f11518c |= Integer.MIN_VALUE;
        Object objG = this.f11517b.g(null, this);
        return objG == u13.a.COROUTINE_SUSPENDED ? objG : q.a(objG);
    }
}
