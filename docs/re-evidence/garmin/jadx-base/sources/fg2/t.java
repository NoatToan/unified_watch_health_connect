package fg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository", f = "LiveActivityRepository.kt", l = {137}, m = "sendDiscardRequest-IoAF18A", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71559c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(f fVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f71558b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71557a = obj;
        this.f71559c |= Integer.MIN_VALUE;
        Object objL = this.f71558b.l(this);
        return objL == u13.a.COROUTINE_SUSPENDED ? objL : o13.q.a(objL);
    }
}
