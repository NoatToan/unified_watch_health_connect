package yo;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.repo.MultisportEditLegsRepo", f = "MultisportEditLegsRepo.kt", l = {276, 282}, m = "saveUpdatedLegs", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zo.k f198281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f198282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f198283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f198284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f198285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f198286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f198287g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f198286f = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f198285e = obj;
        this.f198287g |= Integer.MIN_VALUE;
        return this.f198286f.i(null, this);
    }
}
