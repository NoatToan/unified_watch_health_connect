package vs1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.UploadTrailReviewImagesUseCase", f = "UploadTrailReviewImagesUseCase.kt", l = {59}, m = "submitTrailReviewPhoto", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pt1.u f179790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f179791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f179792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f179793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e0 e0Var, t13.d<? super f0> dVar) {
        super(dVar);
        this.f179792c = e0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179791b = obj;
        this.f179793d |= Integer.MIN_VALUE;
        return e0.a(this.f179792c, null, 0L, 0, null, this);
    }
}
