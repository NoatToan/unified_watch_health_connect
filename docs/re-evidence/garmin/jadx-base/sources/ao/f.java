package ao;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.data.ActivitiesRepositoryImpl", f = "ActivitiesRepositoryImpl.kt", l = {18}, m = "getActivityCount-gIAlu-s", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f11514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f11514b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f11513a = obj;
        this.f11515c |= Integer.MIN_VALUE;
        Object objD = this.f11514b.d(null, this);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : q.a(objD);
    }
}
