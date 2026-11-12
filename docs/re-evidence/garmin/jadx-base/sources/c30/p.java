package c30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.AddPointOfInterestToCourseRouteUseCase", f = "AddPointOfInterestToCourseRouteUseCase.kt", l = {161}, m = "buildSegment", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a50.g f23977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f23979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f23979c = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23978b = obj;
        this.f23980d |= Integer.MIN_VALUE;
        int i14 = n.f23956e;
        return this.f23979c.b(null, null, null, null, this);
    }
}
