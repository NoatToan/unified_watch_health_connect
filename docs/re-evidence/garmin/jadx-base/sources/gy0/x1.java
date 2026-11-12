package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.UploadEpicImagesUseCase", f = "UploadEpicImagesUseCase.kt", l = {90}, m = "processImage", v = 2)
public final class x1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f80277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(a2 a2Var, t13.d<? super x1> dVar) {
        super(dVar);
        this.f80277b = a2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80276a = obj;
        this.f80278c |= Integer.MIN_VALUE;
        return this.f80277b.b(null, this);
    }
}
