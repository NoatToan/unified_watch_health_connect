package of2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager", f = "LSVSessionManager.kt", l = {127}, m = "sendStartRequest-IoAF18A", v = 2)
public final class u0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f131922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f131923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f131924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(c0 c0Var, t13.d<? super u0> dVar) {
        super(dVar);
        this.f131923b = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131922a = obj;
        this.f131924c |= Integer.MIN_VALUE;
        Object objP = this.f131923b.p(this);
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : o13.q.a(objP);
    }
}
