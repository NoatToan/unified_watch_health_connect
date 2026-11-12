package fg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository", f = "LiveActivityRepository.kt", l = {145}, m = "sendCompleteSkippedWorkoutStepsResponse-gIAlu-s", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71556c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f fVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f71555b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71554a = obj;
        this.f71556c |= Integer.MIN_VALUE;
        Object objK = this.f71555b.k(false, this);
        return objK == u13.a.COROUTINE_SUSPENDED ? objK : o13.q.a(objK);
    }
}
