package b30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.automatic.GetCourseRouteUseCase", f = "GetCourseRouteUseCase.kt", l = {125}, m = "getRoundTripCourse", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f15520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f15520b = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f15519a = obj;
        this.f15521c |= Integer.MIN_VALUE;
        return k.a(this.f15520b, null, null, null, 0.0d, null, false, false, false, this);
    }
}
