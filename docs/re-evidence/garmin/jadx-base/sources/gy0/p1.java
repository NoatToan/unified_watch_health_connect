package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.ReorderEpicImagesUseCase", f = "ReorderEpicImagesUseCase.kt", l = {13}, m = "invoke", v = 2)
public final class p1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f80215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1 q1Var, t13.d<? super p1> dVar) {
        super(dVar);
        this.f80215b = q1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80214a = obj;
        this.f80216c |= Integer.MIN_VALUE;
        return this.f80215b.a(null, null, this);
    }
}
