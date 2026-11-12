package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetAllEpicsLifetimeStatsUseCase", f = "GetAllEpicsLifetimeStatsUseCase.kt", l = {16}, m = "invoke", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f80226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f80226b = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80225a = obj;
        this.f80227c |= Integer.MIN_VALUE;
        return this.f80226b.a(null, this);
    }
}
