package of2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager", f = "LSVSessionManager.kt", l = {752}, m = "valueEstimationComplete", v = 2)
public final class x0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f131953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yf2.a f131954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f131955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f131956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f131957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(c0 c0Var, t13.d<? super x0> dVar) {
        super(dVar);
        this.f131956d = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131955c = obj;
        this.f131957e |= Integer.MIN_VALUE;
        return this.f131956d.s(0L, null, this);
    }
}
