package jd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.activitites.GetGearActivitiesUseCaseImpl", f = "GetGearActivitiesUseCaseImpl.kt", l = {36}, m = "invoke-yxL6bBk", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f98354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f98355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98356c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f98355b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98354a = obj;
        this.f98356c |= Integer.MIN_VALUE;
        Object objA = this.f98355b.a(null, null, 0, 0, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : o13.q.a(objA);
    }
}
