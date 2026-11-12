package d60;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo", f = "CoursesRepo.kt", l = {78, 89, 89}, m = "getMyCourses", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.i0 f57900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f57901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f57902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f57903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f57904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f57905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f57906g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b bVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f57905f = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f57904e = obj;
        this.f57906g |= Integer.MIN_VALUE;
        return this.f57905f.d(null, 0, null, null, null, this);
    }
}
