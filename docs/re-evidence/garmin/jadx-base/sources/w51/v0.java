package w51;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivityDetailsViewModel", f = "PendingActivityDetailsViewModel.kt", l = {419}, m = "loadNoGPSDataActivityTypes", v = 2)
public final class v0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f182442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f182443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f182444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(q0 q0Var, t13.d<? super v0> dVar) {
        super(dVar);
        this.f182443b = q0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f182442a = obj;
        this.f182444c |= Integer.MIN_VALUE;
        return q0.y4(this.f182443b, this);
    }
}
