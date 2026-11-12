package fg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository", f = "LiveActivityRepository.kt", l = {131}, m = "sendStartRequest-IoAF18A", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71571c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f fVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f71570b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71569a = obj;
        this.f71571c |= Integer.MIN_VALUE;
        Object objP = this.f71570b.p(this);
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : o13.q.a(objP);
    }
}
