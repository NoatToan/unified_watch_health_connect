package zf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel", f = "RaceAndEventBaseViewModel.kt", l = {174}, m = "getImage", v = 2)
public final class u0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg0.k f204509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f204511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f204512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(j0 j0Var, t13.d<? super u0> dVar) {
        super(dVar);
        this.f204511c = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204510b = obj;
        this.f204512d |= Integer.MIN_VALUE;
        return this.f204511c.L4(null, this);
    }
}
