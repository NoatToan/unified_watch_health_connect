package g30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.planner.UpdateCourseDetailsUseCase", f = "UpdateCourseDetailsUseCase.kt", l = {14, 23}, m = "invoke", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f75674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f75675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f75676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f75676c = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f75675b = obj;
        this.f75677d |= Integer.MIN_VALUE;
        return this.f75676c.a(null, this);
    }
}
