package c30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.GetCleanCourseSegmentUseCase", f = "GetCleanCourseSegmentUseCase.kt", l = {41}, m = "invoke", v = 2)
public final class a0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f23779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z zVar, t13.d<? super a0> dVar) {
        super(dVar);
        this.f23779b = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23778a = obj;
        this.f23780c |= Integer.MIN_VALUE;
        return this.f23779b.a(null, null, null, 0, null, null, false, false, false, this);
    }
}
