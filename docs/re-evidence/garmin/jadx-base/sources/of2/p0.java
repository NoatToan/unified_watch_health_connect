package of2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager", f = "LSVSessionManager.kt", l = {154}, m = "sendPauseAndSaveRequests-IoAF18A", v = 2)
public final class p0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f131896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f131897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f131898c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(c0 c0Var, t13.d<? super p0> dVar) {
        super(dVar);
        this.f131897b = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131896a = obj;
        this.f131898c |= Integer.MIN_VALUE;
        Object objL = this.f131897b.l(this);
        return objL == u13.a.COROUTINE_SUSPENDED ? objL : o13.q.a(objL);
    }
}
