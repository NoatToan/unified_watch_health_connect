package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.DeleteEpicImagesUseCase", f = "DeleteEpicImagesUseCase.kt", l = {47}, m = "deleteImage", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f80134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80135c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f80134b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80133a = obj;
        this.f80135c |= Integer.MIN_VALUE;
        return this.f80134b.b(null, null, this);
    }
}
