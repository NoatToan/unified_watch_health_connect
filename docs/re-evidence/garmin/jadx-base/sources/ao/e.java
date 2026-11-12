package ao;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.data.ActivitiesRepositoryImpl", f = "ActivitiesRepositoryImpl.kt", l = {38}, m = "deleteActivity-gIAlu-s", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f11511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11512c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f11511b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f11510a = obj;
        this.f11512c |= Integer.MIN_VALUE;
        Object objE = this.f11511b.e(0L, this);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : q.a(objE);
    }
}
