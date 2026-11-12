package v41;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.InitializePaceProPlanUseCase", f = "InitializePaceProPlanUseCase.kt", l = {154}, m = "initializeBasedOnCourseId", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f175614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f175615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f175616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f175617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f175618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f175619f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f175618e = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f175617d = obj;
        this.f175619f |= Integer.MIN_VALUE;
        return m.b(this.f175618e, 0L, null, null, this);
    }
}
