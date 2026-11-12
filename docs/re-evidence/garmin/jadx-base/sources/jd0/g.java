package jd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.activitites.ActivityTimelineDelegateImpl", f = "ActivityTimelineDelegateImpl.kt", l = {20}, m = "getEcgTimelineActivitiesFor", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f98347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f98348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f98348b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98347a = obj;
        this.f98349c |= Integer.MIN_VALUE;
        return this.f98348b.a(null, this);
    }
}
