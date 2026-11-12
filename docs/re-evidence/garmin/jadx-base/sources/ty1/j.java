package ty1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsFragment", f = "EventDetailsFragment.kt", l = {1354}, m = "getActivePlanDTO", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f167140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.a f167141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f167142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f167141b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f167140a = obj;
        this.f167142c |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.traininginitiative.ui.a.v6(this.f167141b, null, this);
    }
}
