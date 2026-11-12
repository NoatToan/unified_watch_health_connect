package uf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityInteractorAppToDevice", f = "LiveActivityInteractorAppToDevice.kt", l = {164}, m = "sendCompleteSkippedWorkoutStepsResponse-0E7RQCE$live_session_view", v = 2)
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f170545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170546c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(u uVar, t13.d<? super z> dVar) {
        super(dVar);
        this.f170545b = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170544a = obj;
        this.f170546c |= Integer.MIN_VALUE;
        Object objC = this.f170545b.c(null, false, this);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : o13.q.a(objC);
    }
}
