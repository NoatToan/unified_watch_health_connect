package jr0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.data.repository.IntensityMinutesRepositoryImpl", f = "IntensityMinutesRepositoryImpl.kt", l = {107}, m = "getIntensityMinutesWeeklySummary", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f100541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f100542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f100543c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b bVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f100542b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f100541a = obj;
        this.f100543c |= Integer.MIN_VALUE;
        return this.f100542b.b(null, null, this);
    }
}
