package yo;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.repo.MultisportLegsUpdateLogicHandler", f = "MultisportLegsUpdateLogicHandler.kt", l = {107, 108}, m = "updateLegDistance", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f198323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f198324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f198325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f198326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(w wVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f198325d = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f198324c = obj;
        this.f198326e |= Integer.MIN_VALUE;
        return this.f198325d.k(0, 0.0d, this);
    }
}
