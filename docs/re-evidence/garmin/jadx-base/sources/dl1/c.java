package dl1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.data.repository.RecordActivityRepositoryImpl", f = "RecordActivityRepositoryImpl.kt", l = {15}, m = "isOnboardingCompleted", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f60303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f60304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f60305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f60305c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60304b = obj;
        this.f60306d |= Integer.MIN_VALUE;
        return this.f60305c.b(0L, this);
    }
}
