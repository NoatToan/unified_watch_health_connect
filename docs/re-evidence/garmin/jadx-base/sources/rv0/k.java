package rv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.data.repository.LifestyleLoggingRepositoryImpl", f = "LifestyleLoggingRepositoryImpl.kt", l = {165}, m = "isAutoLoggingEnabled", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f154663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f154664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f154665c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f154664b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154663a = obj;
        this.f154665c |= Integer.MIN_VALUE;
        return this.f154664b.o(this);
    }
}
