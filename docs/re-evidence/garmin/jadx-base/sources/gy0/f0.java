package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetEnduranceScoreDataUseCase", f = "GetEnduranceScoreDataUseCase.kt", l = {18, 19}, m = "invoke", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f80149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b63.o f80150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b63.o f80151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n61.f f80152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f80153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f80154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80155g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, t13.d<? super f0> dVar) {
        super(dVar);
        this.f80154f = g0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80153e = obj;
        this.f80155g |= Integer.MIN_VALUE;
        return this.f80154f.b(null, null, null, this);
    }
}
