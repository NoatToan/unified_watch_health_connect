package uf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LSVUpdateInteractor", f = "LSVUpdateInteractor.kt", l = {39}, m = "sendDiscardRequest-IoAF18A$suspendImpl", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f170436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f170436b = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170435a = obj;
        this.f170437c |= Integer.MIN_VALUE;
        Object objK = s.k(this.f170436b, this);
        return objK == u13.a.COROUTINE_SUSPENDED ? objK : o13.q.a(objK);
    }
}
