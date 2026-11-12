package l30;

import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll30/j;", "Lu40/o$b;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements u40.o.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CreateCourseActivity f109590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f109591b;

    public j(CreateCourseActivity createCourseActivity, com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        this.f109590a = createCourseActivity;
        this.f109591b = gVar;
    }

    @Override // u40.o.b
    public final void a(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        gVar.getClass();
        Long coursePointId = gVar.getCoursePointId();
        if (coursePointId != null) {
            n30.a.b bVar = new n30.a.b(coursePointId.longValue());
            CreateCourseActivity.a aVar = CreateCourseActivity.f32989g;
            this.f109590a.fa(bVar);
        }
    }

    @Override // u40.o.b
    public final void b(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        gVar.getClass();
        n30.a.c cVar = new n30.a.c(this.f109591b, gVar, true);
        CreateCourseActivity.a aVar = CreateCourseActivity.f32989g;
        this.f109590a.fa(cVar);
    }
}
