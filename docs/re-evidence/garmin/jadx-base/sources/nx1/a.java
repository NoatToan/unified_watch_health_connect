package nx1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.domain.usecase.BenchmarkScreenUseCase", f = "BenchmarkScreenUseCase.kt", l = {107, 108}, m = "pushBenchmarksToApi", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l22.b f128191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f128192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f128193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f128194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f128195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f128196f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f128195e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f128194d = obj;
        this.f128196f |= Integer.MIN_VALUE;
        return this.f128195e.c(null, false, this);
    }
}
