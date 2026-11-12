package yo;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.repo.MultisportEditLegsRepo", f = "MultisportEditLegsRepo.kt", l = {123}, m = "updateLegDuration", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f198291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f198292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f198293c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e eVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f198292b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f198291a = obj;
        this.f198293c |= Integer.MIN_VALUE;
        return this.f198292b.k(0, 0.0d, this);
    }
}
