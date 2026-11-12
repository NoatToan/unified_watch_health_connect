package jr0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.data.repository.IntensityMinutesRepositoryImpl", f = "IntensityMinutesRepositoryImpl.kt", l = {96}, m = "getIntensityMinutesDailySummary", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f100527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f100528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f100529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f100528b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f100527a = obj;
        this.f100529c |= Integer.MIN_VALUE;
        return this.f100528b.c(null, null, this);
    }
}
