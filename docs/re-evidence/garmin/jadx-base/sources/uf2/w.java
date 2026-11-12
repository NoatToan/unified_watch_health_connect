package uf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityInteractorAppToDevice", f = "LiveActivityInteractorAppToDevice.kt", l = {132}, m = "sendAppInitiatedCommandWithResponse-bMdYcbs", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f170525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170526c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(u uVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f170525b = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170524a = obj;
        this.f170526c |= Integer.MIN_VALUE;
        int i14 = u.f170505d;
        Object objA = this.f170525b.a(null, null, null, null, null, null, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : o13.q.a(objA);
    }
}
