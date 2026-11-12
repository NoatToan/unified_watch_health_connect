package fg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository", f = "LiveActivityRepository.kt", l = {133}, m = "sendPauseRequest-IoAF18A", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(f fVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f71561b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71560a = obj;
        this.f71562c |= Integer.MIN_VALUE;
        Object objM = this.f71561b.m(this);
        return objM == u13.a.COROUTINE_SUSPENDED ? objM : o13.q.a(objM);
    }
}
