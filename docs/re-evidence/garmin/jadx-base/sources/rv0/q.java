package rv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.data.repository.LifestyleLoggingRepositoryImpl", f = "LifestyleLoggingRepositoryImpl.kt", l = {100}, m = "setOnboardingCompleted", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f154679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f154680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f154681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f154682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b bVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f154681c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154680b = obj;
        this.f154682d |= Integer.MIN_VALUE;
        int i14 = b.f154624c;
        return this.f154681c.E(false, this);
    }
}
