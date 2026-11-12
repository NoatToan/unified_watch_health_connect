package qy1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.domain.event.GetEventWeatherDataUseCase", f = "GetEventWeatherDataUseCase.kt", l = {106}, m = "getLinkedActivityWeather", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f148568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f148569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148570c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f148569b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148568a = obj;
        this.f148570c |= Integer.MIN_VALUE;
        return this.f148569b.b(0L, this);
    }
}
