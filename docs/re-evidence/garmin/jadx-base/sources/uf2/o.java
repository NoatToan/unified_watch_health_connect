package uf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LSVUpdateInteractor", f = "LSVUpdateInteractor.kt", l = {33}, m = "sendPauseRequest-IoAF18A$suspendImpl", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f170444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170445c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f170444b = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170443a = obj;
        this.f170445c |= Integer.MIN_VALUE;
        Object objO = s.o(this.f170444b, this);
        return objO == u13.a.COROUTINE_SUSPENDED ? objO : o13.q.a(objO);
    }
}
