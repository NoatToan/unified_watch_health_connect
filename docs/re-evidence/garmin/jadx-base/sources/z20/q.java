package z20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.GetOnCourseRouteFeaturesUseCase", f = "GetOnCourseRouteFeaturesUseCase.kt", l = {16}, m = "invoke", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f201938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f201939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f201940c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f201939b = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f201938a = obj;
        this.f201940c |= Integer.MIN_VALUE;
        return this.f201939b.a(null, false, this);
    }
}
