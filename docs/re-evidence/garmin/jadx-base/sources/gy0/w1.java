package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.UploadEpicImagesUseCase", f = "UploadEpicImagesUseCase.kt", l = {69, 70}, m = "processAndUploadImage", v = 2)
public final class w1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f80267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f80268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f80269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(a2 a2Var, t13.d<? super w1> dVar) {
        super(dVar);
        this.f80269c = a2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80268b = obj;
        this.f80270d |= Integer.MIN_VALUE;
        return a2.a(this.f80269c, null, null, this);
    }
}
