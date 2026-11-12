package of2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager", f = "LSVSessionManager.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "sendResumeRequest-IoAF18A", v = 2)
public final class s0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f131911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f131912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f131913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(c0 c0Var, t13.d<? super s0> dVar) {
        super(dVar);
        this.f131912b = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131911a = obj;
        this.f131913c |= Integer.MIN_VALUE;
        Object objN = this.f131912b.n(this);
        return objN == u13.a.COROUTINE_SUSPENDED ? objN : o13.q.a(objN);
    }
}
