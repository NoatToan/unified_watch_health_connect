package b30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.automatic.GetCourseDataUseCase", f = "GetCourseDataUseCase.kt", l = {31}, m = "createAutomaticCourseState", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n30.e f15507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f15508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f15510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f15510d = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f15509c = obj;
        this.f15511e |= Integer.MIN_VALUE;
        return h.a(this.f15510d, null, null, this);
    }
}
