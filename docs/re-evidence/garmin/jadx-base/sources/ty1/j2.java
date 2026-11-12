package ty1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.TIReviewEntriesFragment", f = "TIReviewEntriesFragment.kt", l = {2229}, m = "getActivePlanDTO", v = 2)
public final class j2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f167150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 f167151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f167152c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var, t13.d<? super j2> dVar) {
        super(dVar);
        this.f167151b = a0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f167150a = obj;
        this.f167152c |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.A6(this.f167151b, null, this);
    }
}
