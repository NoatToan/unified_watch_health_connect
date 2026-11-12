package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.DeleteEpicImagesUseCase", f = "DeleteEpicImagesUseCase.kt", l = {37}, m = "deleteImage", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cy0.o f80125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f80126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f80127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f80127c = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80126b = obj;
        this.f80128d |= Integer.MIN_VALUE;
        return g.a(this.f80127c, null, null, this);
    }
}
