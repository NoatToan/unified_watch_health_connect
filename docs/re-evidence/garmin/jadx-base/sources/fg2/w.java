package fg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository", f = "LiveActivityRepository.kt", l = {141}, m = "sendSaveRequest-gIAlu-s", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(f fVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f71567b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71566a = obj;
        this.f71568c |= Integer.MIN_VALUE;
        Object objO = this.f71567b.o(null, this);
        return objO == u13.a.COROUTINE_SUSPENDED ? objO : o13.q.a(objO);
    }
}
