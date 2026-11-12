package qy1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.domain.event.GetEventWeatherDataUseCase", f = "GetEventWeatherDataUseCase.kt", l = {30, 34, 40}, m = "invoke", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f148574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f148575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f148576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f148577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f148578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f148579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f148580g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f148579f = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148578e = obj;
        this.f148580g |= Integer.MIN_VALUE;
        return this.f148579f.d(null, this);
    }
}
