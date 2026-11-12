package i90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.customization.cycling.SportProfileSetupUseCase", f = "SportProfileSetupUseCase.kt", l = {38}, m = "fetchSimpleSetupFeatures", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f92302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f92303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92304c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f92303b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92302a = obj;
        this.f92304c |= Integer.MIN_VALUE;
        return this.f92303b.a(this);
    }
}
