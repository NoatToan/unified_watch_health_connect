package uf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityInteractorDeviceToApp", f = "LiveActivityInteractorDeviceToApp.kt", l = {186}, m = "emitActivityState$live_session_view", v = 2)
public final class m0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f170433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(l0 l0Var, t13.d<? super m0> dVar) {
        super(dVar);
        this.f170433b = l0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170432a = obj;
        this.f170434c |= Integer.MIN_VALUE;
        return this.f170433b.a(null, null, this);
    }
}
