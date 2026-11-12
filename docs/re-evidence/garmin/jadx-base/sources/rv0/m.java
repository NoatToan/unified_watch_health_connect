package rv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.data.repository.LifestyleLoggingRepositoryImpl", f = "LifestyleLoggingRepositoryImpl.kt", l = {77}, m = "isOnboardingCompleted", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f154668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f154669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f154670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f154669b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154668a = obj;
        this.f154670c |= Integer.MIN_VALUE;
        return this.f154669b.k(this);
    }
}
