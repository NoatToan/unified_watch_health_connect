package ty1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsTrainingFragment", f = "EventDetailsTrainingFragment.kt", l = {110}, m = "getActiveTrainingPlanDTO", v = 2)
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f167267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.e f167268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f167269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar, t13.d<? super y> dVar) {
        super(dVar);
        this.f167268b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f167267a = obj;
        this.f167269c |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.traininginitiative.ui.e.u6(this.f167268b, null, this);
    }
}
