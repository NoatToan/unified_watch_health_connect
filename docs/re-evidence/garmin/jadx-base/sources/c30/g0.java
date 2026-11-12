package c30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.GetCourseSegmentUseCase", f = "GetCourseSegmentUseCase.kt", l = {96}, m = "getRoute", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f23874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(e0 e0Var, t13.d<? super g0> dVar) {
        super(dVar);
        this.f23874b = e0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23873a = obj;
        this.f23875c |= Integer.MIN_VALUE;
        int i14 = e0.f23844b;
        return this.f23874b.b(null, null, null, null, false, false, false, this);
    }
}
