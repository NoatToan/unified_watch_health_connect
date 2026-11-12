package jd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.activitites.ActivitiesDelegateImpl", f = "ActivitiesDelegateImpl.kt", l = {212}, m = "getLatestWeightAsync", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f98338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f98339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98340c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f98339b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98338a = obj;
        this.f98340c |= Integer.MIN_VALUE;
        return this.f98339b.m(null, false, this);
    }
}
