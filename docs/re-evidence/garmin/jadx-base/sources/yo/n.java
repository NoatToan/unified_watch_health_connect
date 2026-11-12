package yo;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.repo.MultisportEditLegsRepo", f = "MultisportEditLegsRepo.kt", l = {132}, m = "updateLegDistance", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f198288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f198289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f198290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e eVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f198289b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f198288a = obj;
        this.f198290c |= Integer.MIN_VALUE;
        return this.f198289b.j(0, 0.0d, this);
    }
}
