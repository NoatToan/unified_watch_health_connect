package uf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityProtobufDataHandler", f = "LiveActivityProtobufDataHandler.kt", l = {275}, m = "getAdaptiveCoachWorkouts", v = 2)
public final class s0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f170498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(r0 r0Var, t13.d<? super s0> dVar) {
        super(dVar);
        this.f170498b = r0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170497a = obj;
        this.f170499c |= Integer.MIN_VALUE;
        return this.f170498b.c(this);
    }
}
