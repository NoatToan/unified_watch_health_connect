package uf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LSVUpdateInteractor", f = "LSVUpdateInteractor.kt", l = {35}, m = "sendResumeRequest-IoAF18A$suspendImpl", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f170457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f170457b = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170456a = obj;
        this.f170458c |= Integer.MIN_VALUE;
        Object objQ = s.q(this.f170457b, this);
        return objQ == u13.a.COROUTINE_SUSPENDED ? objQ : o13.q.a(objQ);
    }
}
