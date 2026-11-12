package fg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository", f = "LiveActivityRepository.kt", l = {143}, m = "saveVo2MaxEstimation-IoAF18A", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71553c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(f fVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f71552b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71551a = obj;
        this.f71553c |= Integer.MIN_VALUE;
        Object objJ = this.f71552b.j(this);
        return objJ == u13.a.COROUTINE_SUSPENDED ? objJ : o13.q.a(objJ);
    }
}
