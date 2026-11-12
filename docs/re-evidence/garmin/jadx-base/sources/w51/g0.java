package w51;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesViewModel", f = "PendingActivitiesViewModel.kt", l = {64, 85}, m = "loadPendingActivities", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f182262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f182263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f182264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, t13.d<? super g0> dVar) {
        super(dVar);
        this.f182263b = h0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f182262a = obj;
        this.f182264c |= Integer.MIN_VALUE;
        return h0.y4(this.f182263b, this);
    }
}
