package yo;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.repo.MultisportEditLegsRepo", f = "MultisportEditLegsRepo.kt", l = {116}, m = "deleteLeg", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f198261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f198262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f198263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f198262b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f198261a = obj;
        this.f198263c |= Integer.MIN_VALUE;
        return this.f198262b.d(0, this);
    }
}
