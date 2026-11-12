package z20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.ConvertToGCJ02UseCase", f = "ConvertToGCJ02UseCase.kt", l = {116}, m = "getOnCourseRouteFeatures", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f201875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f201876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f201877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, t13.d<? super b> dVar2) {
        super(dVar2);
        this.f201876b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f201875a = obj;
        this.f201877c |= Integer.MIN_VALUE;
        int i14 = d.f201889b;
        return this.f201876b.b(null, this);
    }
}
