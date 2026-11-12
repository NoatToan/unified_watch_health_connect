package v41;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.InitializePaceProPlanUseCase", f = "InitializePaceProPlanUseCase.kt", l = {295}, m = "fetchPacebandParameters", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f175595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f175596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f175597c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f175596b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f175595a = obj;
        this.f175597c |= Integer.MIN_VALUE;
        return m.a(this.f175596b, this);
    }
}
