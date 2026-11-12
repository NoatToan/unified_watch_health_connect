package uf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LSVUpdateInteractor", f = "LSVUpdateInteractor.kt", l = {41}, m = "sendCompleteSkippedWorkoutStepsResponse-gIAlu-s$suspendImpl", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f170430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f170430b = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170429a = obj;
        this.f170431c |= Integer.MIN_VALUE;
        Object objH = s.h(this.f170430b, false, this);
        return objH == u13.a.COROUTINE_SUSPENDED ? objH : o13.q.a(objH);
    }
}
