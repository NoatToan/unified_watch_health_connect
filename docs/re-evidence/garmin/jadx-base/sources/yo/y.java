package yo;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.repo.MultisportLegsUpdateLogicHandler", f = "MultisportLegsUpdateLogicHandler.kt", l = {99, 100}, m = "updateLegDuration", v = 2)
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f198328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f198329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f198330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f198331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w wVar, t13.d<? super y> dVar) {
        super(dVar);
        this.f198330d = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f198329c = obj;
        this.f198331e |= Integer.MIN_VALUE;
        return this.f198330d.l(0, 0.0d, this);
    }
}
