package d60;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo", f = "CoursesRepo.kt", l = {533, 546}, m = "getCourseDemandsData", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f57852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j61.i f57853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f57854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f57855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f57856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f57857f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f57856e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f57855d = obj;
        this.f57857f |= Integer.MIN_VALUE;
        return this.f57856e.a(null, this);
    }
}
