package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.CreateMultiDayActivityUseCase", f = "CreateMultiDayActivityUseCase.kt", l = {15}, m = "invoke", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f80093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f80093b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80092a = obj;
        this.f80094c |= Integer.MIN_VALUE;
        return this.f80093b.a(null, this);
    }
}
