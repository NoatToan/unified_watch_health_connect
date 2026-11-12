package rv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.data.repository.LifestyleLoggingRepositoryImpl", f = "LifestyleLoggingRepositoryImpl.kt", l = {187}, m = "setAutoLoggingEnabled", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f154673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f154674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f154675c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b bVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f154674b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154673a = obj;
        this.f154675c |= Integer.MIN_VALUE;
        int i14 = b.f154624c;
        return this.f154674b.B(false, this);
    }
}
