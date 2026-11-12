package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetEpicActivityDailyNotesUseCase", f = "GetEpicActivityDailyNotesUseCase.kt", l = {16}, m = "invoke", v = 2)
public final class h0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f80169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80170c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, t13.d<? super h0> dVar) {
        super(dVar);
        this.f80169b = i0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80168a = obj;
        this.f80170c |= Integer.MIN_VALUE;
        return this.f80169b.a(null, this);
    }
}
