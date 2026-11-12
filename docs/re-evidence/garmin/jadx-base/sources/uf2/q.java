package uf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LSVUpdateInteractor", f = "LSVUpdateInteractor.kt", l = {37}, m = "sendSaveRequest-gIAlu-s$suspendImpl", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f170461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f170461b = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170460a = obj;
        this.f170462c |= Integer.MIN_VALUE;
        Object objS = s.s(this.f170461b, null, this);
        return objS == u13.a.COROUTINE_SUSPENDED ? objS : o13.q.a(objS);
    }
}
