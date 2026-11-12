package qy1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.domain.event.GetEventWeatherDataUseCase", f = "GetEventWeatherDataUseCase.kt", l = {93}, m = "getPastEventWeather", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f148571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f148572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f148572b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148571a = obj;
        this.f148573c |= Integer.MIN_VALUE;
        return this.f148572b.c(0, 0, 0L, this);
    }
}
