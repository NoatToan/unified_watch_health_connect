package t20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.biz.ImportCourseTask", f = "ImportCourseTask.kt", l = {30, 31, 32}, m = "execute", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f161790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f161791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f161792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f161791b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f161790a = obj;
        this.f161792c |= Integer.MIN_VALUE;
        return this.f161791b.a(this);
    }
}
