package kp0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.hydration.data.repo.HydrationRepository", f = "HydrationRepository.kt", l = {35}, m = "getHydrationData", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f105983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f105984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f105985c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f105984b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f105983a = obj;
        this.f105985c |= Integer.MIN_VALUE;
        return this.f105984b.a(null, this);
    }
}
