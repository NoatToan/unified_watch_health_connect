package of2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager", f = "LSVSessionManager.kt", l = {746}, m = "isValueEstimationSessionActive", v = 2)
public final class j0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yf2.a f131838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f131839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f131840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f131841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(c0 c0Var, t13.d<? super j0> dVar) {
        super(dVar);
        this.f131840c = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131839b = obj;
        this.f131841d |= Integer.MIN_VALUE;
        return this.f131840c.h(0L, null, this);
    }
}
