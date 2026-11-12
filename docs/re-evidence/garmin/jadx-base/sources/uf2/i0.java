package uf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityInteractorAppToDevice", f = "LiveActivityInteractorAppToDevice.kt", l = {38}, m = "sendStartRequest-yxL6bBk$live_session_view", v = 2)
public final class i0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f170408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170409c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(u uVar, t13.d<? super i0> dVar) {
        super(dVar);
        this.f170408b = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170407a = obj;
        this.f170409c |= Integer.MIN_VALUE;
        Object objH = this.f170408b.h(null, null, null, null, this);
        return objH == u13.a.COROUTINE_SUSPENDED ? objH : o13.q.a(objH);
    }
}
