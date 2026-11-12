package c30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.GetWaypointsLocationNamesUseCase", f = "GetWaypointsLocationNamesUseCase.kt", l = {23}, m = "getAddressFromLocation", v = 2)
public final class h0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f23890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, t13.d<? super h0> dVar) {
        super(dVar);
        this.f23890b = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23889a = obj;
        this.f23891c |= Integer.MIN_VALUE;
        return j0.a(this.f23890b, null, this);
    }
}
