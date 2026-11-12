package qy1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.domain.event.GetEventWeatherDataUseCase", f = "GetEventWeatherDataUseCase.kt", l = {53}, m = "getForecastWeather", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f148565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f148566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f148566b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148565a = obj;
        this.f148567c |= Integer.MIN_VALUE;
        return this.f148566b.a(0.0d, 0.0d, 0L, 0, this);
    }
}
