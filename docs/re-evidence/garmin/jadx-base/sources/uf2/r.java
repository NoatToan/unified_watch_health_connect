package uf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LSVUpdateInteractor", f = "LSVUpdateInteractor.kt", l = {25}, m = "sendStartRequest-BWLJW6A$suspendImpl", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f170469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f170469b = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170468a = obj;
        this.f170470c |= Integer.MIN_VALUE;
        Object objU = s.u(this.f170469b, null, null, null, this);
        return objU == u13.a.COROUTINE_SUSPENDED ? objU : o13.q.a(objU);
    }
}
