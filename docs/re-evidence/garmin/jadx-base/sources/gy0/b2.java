package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.ValidateDateRangeUseCase", f = "ValidateDateRangeUseCase.kt", l = {18}, m = "invoke", v = 2)
public final class b2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f80114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var, t13.d<? super b2> dVar) {
        super(dVar);
        this.f80114b = c2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80113a = obj;
        this.f80115c |= Integer.MIN_VALUE;
        return this.f80114b.a(0L, 0L, this);
    }
}
