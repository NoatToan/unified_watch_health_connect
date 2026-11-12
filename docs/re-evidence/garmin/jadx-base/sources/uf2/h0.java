package uf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityInteractorAppToDevice", f = "LiveActivityInteractorAppToDevice.kt", l = {59}, m = "sendSaveRequest-0E7RQCE$live_session_view", v = 2)
public final class h0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f170390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170391c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(u uVar, t13.d<? super h0> dVar) {
        super(dVar);
        this.f170390b = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170389a = obj;
        this.f170391c |= Integer.MIN_VALUE;
        Object objG = this.f170390b.g(null, null, this);
        return objG == u13.a.COROUTINE_SUSPENDED ? objG : o13.q.a(objG);
    }
}
