package of2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager", f = "LSVSessionManager.kt", l = {109, 118}, m = "autoStartSession-IoAF18A$live_session_view", v = 2)
public final class e0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f131809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f131810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f131811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(c0 c0Var, t13.d<? super e0> dVar) {
        super(dVar);
        this.f131810b = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131809a = obj;
        this.f131811c |= Integer.MIN_VALUE;
        Object objD = this.f131810b.d(this);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : o13.q.a(objD);
    }
}
