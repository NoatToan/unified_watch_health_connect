package jr0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.data.repository.IntensityMinutesRepositoryImpl", f = "IntensityMinutesRepositoryImpl.kt", l = {81}, m = "getIntensityMinutesHourlySummary", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f100534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f100535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f100536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f100535b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f100534a = obj;
        this.f100536c |= Integer.MIN_VALUE;
        return this.f100535b.d(null, 0, this);
    }
}
