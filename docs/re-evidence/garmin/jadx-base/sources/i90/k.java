package i90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.customization.cycling.SportProfileSetupUseCase", f = "SportProfileSetupUseCase.kt", l = {24}, m = "fetchSports", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f92305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f92306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92307c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f92306b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92305a = obj;
        this.f92307c |= Integer.MIN_VALUE;
        return this.f92306b.b(this);
    }
}
