package jd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.activitites.ActivitiesDelegateImpl", f = "ActivitiesDelegateImpl.kt", l = {578}, m = "getRecentActivityTypes-0E7RQCE", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f98342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f98343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98344c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f98343b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98342a = obj;
        this.f98344c |= Integer.MIN_VALUE;
        Object objK0 = this.f98343b.k0(null, null, this);
        return objK0 == u13.a.COROUTINE_SUSPENDED ? objK0 : o13.q.a(objK0);
    }
}
