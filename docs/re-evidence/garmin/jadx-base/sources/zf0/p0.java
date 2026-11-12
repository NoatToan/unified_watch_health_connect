package zf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel", f = "RaceAndEventBaseViewModel.kt", l = {506, 508}, m = "getEventDetailsByIdOrUuid", v = 2)
public final class p0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f204471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f204472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f204473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f204474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f204475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(j0 j0Var, t13.d<? super p0> dVar) {
        super(dVar);
        this.f204474d = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204473c = obj;
        this.f204475e |= Integer.MIN_VALUE;
        return this.f204474d.G4(null, null, this);
    }
}
