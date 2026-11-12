package b30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.automatic.GetMultipleCourseRoutesUseCase", f = "GetMultipleCourseRoutesUseCase.kt", l = {83}, m = "getRoundTripCourses", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f15540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15541c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f15540b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f15539a = obj;
        this.f15541c |= Integer.MIN_VALUE;
        return n.a(this.f15540b, null, null, null, this);
    }
}
