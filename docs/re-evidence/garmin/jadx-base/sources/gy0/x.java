package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetCyclingAbilityDataUseCase", f = "GetCyclingAbilityDataUseCase.kt", l = {23}, m = "invoke", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o82.a f80271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f80272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f80273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f80273c = yVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80272b = obj;
        this.f80274d |= Integer.MIN_VALUE;
        return this.f80273c.a(null, null, null, null, this);
    }
}
