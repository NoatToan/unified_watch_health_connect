package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.UploadEpicImagesUseCase", f = "UploadEpicImagesUseCase.kt", l = {77}, m = "uploadImage", v = 2)
public final class z1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f80287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a2 a2Var, t13.d<? super z1> dVar) {
        super(dVar);
        this.f80287b = a2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80286a = obj;
        this.f80288c |= Integer.MIN_VALUE;
        return this.f80287b.c(null, null, null, this);
    }
}
