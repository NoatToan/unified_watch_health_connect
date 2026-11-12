package d60;

import okhttp3.HttpUrl;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo", f = "CoursesRepo.kt", l = {475, 487, 493}, m = "getNutritionAndHydrationAsync", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w01.b f57919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HttpUrl f57920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q22.b f57921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f57922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f57923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f57924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f57925g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b bVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f57924f = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f57923e = obj;
        this.f57925g |= Integer.MIN_VALUE;
        return this.f57924f.g(null, null, null, null, null, this);
    }
}
