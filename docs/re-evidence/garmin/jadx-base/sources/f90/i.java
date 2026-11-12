package f90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.consent.FetchStartupConsentsDataUseCase", f = "FetchStartupConsentsDataUseCase.kt", l = {26, 28}, m = "invoke", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f69993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f69994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69995c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f69994b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f69993a = obj;
        this.f69995c |= Integer.MIN_VALUE;
        return this.f69994b.c(null, this);
    }
}
