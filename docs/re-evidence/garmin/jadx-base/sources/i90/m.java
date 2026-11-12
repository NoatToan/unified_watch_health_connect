package i90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.customization.cycling.SportProfileSetupUseCase", f = "SportProfileSetupUseCase.kt", l = {31}, m = "sendSelectedSports", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f92311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f92312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92313c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f92312b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92311a = obj;
        this.f92313c |= Integer.MIN_VALUE;
        return this.f92312b.d(null, this);
    }
}
