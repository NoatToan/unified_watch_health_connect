package kp0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.hydration.data.repo.HydrationRepository", f = "HydrationRepository.kt", l = {78}, m = "saveHydrationSettings", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f106001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f106002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f106003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f106002b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f106001a = obj;
        this.f106003c |= Integer.MIN_VALUE;
        return this.f106002b.d(null, this);
    }
}
