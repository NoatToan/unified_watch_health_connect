package uf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityInteractorAppToDevice", f = "LiveActivityInteractorAppToDevice.kt", l = {46}, m = "sendPauseRequest-gIAlu-s$live_session_view", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f170357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170358c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(u uVar, t13.d<? super f0> dVar) {
        super(dVar);
        this.f170357b = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170356a = obj;
        this.f170358c |= Integer.MIN_VALUE;
        Object objE = this.f170357b.e(null, this);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : o13.q.a(objE);
    }
}
