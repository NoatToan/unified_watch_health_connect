package of2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager", f = "LSVSessionManager.kt", l = {697}, m = "endSession", v = 2)
public final class i0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f131832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f131833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f131834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f131835d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(c0 c0Var, t13.d<? super i0> dVar) {
        super(dVar);
        this.f131834c = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131833b = obj;
        this.f131835d |= Integer.MIN_VALUE;
        int i14 = c0.f131771p;
        return this.f131834c.f(null, this);
    }
}
