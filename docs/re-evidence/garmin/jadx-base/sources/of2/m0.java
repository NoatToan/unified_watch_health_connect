package of2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager", f = "LSVSessionManager.kt", l = {212}, m = "sendCompleteSkippedWorkoutStepsResponse-gIAlu-s", v = 2)
public final class m0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f131873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f131874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f131875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(c0 c0Var, t13.d<? super m0> dVar) {
        super(dVar);
        this.f131874b = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131873a = obj;
        this.f131875c |= Integer.MIN_VALUE;
        Object objI = this.f131874b.i(false, this);
        return objI == u13.a.COROUTINE_SUSPENDED ? objI : o13.q.a(objI);
    }
}
