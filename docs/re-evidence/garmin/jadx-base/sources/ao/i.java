package ao;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.data.ActivitiesRepositoryImpl", f = "ActivitiesRepositoryImpl.kt", l = {84}, m = "searchGearActivities-yxL6bBk", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f11523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11524c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f11523b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f11522a = obj;
        this.f11524c |= Integer.MIN_VALUE;
        Object objF = this.f11523b.f(null, 0, 0, null, this);
        return objF == u13.a.COROUTINE_SUSPENDED ? objF : q.a(objF);
    }
}
