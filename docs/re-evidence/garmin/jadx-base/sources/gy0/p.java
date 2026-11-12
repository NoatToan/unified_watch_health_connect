package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetActivityListUseCase", f = "GetActivityListUseCase.kt", l = {23}, m = "invoke", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f80208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80209c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f80208b = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80207a = obj;
        this.f80209c |= Integer.MIN_VALUE;
        return this.f80208b.a(0L, 0L, null, this);
    }
}
