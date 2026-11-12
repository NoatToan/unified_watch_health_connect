package z20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.GetCourseElevationUseCase", f = "GetCourseElevationUseCase.kt", l = {18}, m = "invoke", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f201922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f201923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f201924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f201923b = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f201922a = obj;
        this.f201924c |= Integer.MIN_VALUE;
        return this.f201923b.a(null, null, this);
    }
}
