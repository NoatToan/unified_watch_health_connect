package x40;

import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx40/m;", "Lu40/o$b;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements u40.o.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CreateCustomCourseActivity f188752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f188753b;

    public m(CreateCustomCourseActivity createCustomCourseActivity, com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        this.f188752a = createCustomCourseActivity;
        this.f188753b = gVar;
    }

    @Override // u40.o.b
    public final void a(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        gVar.getClass();
        Long coursePointId = gVar.getCoursePointId();
        if (coursePointId != null) {
            a50.c.e eVar = new a50.c.e(coursePointId.longValue());
            CreateCustomCourseActivity.a aVar = CreateCustomCourseActivity.f33013f;
            this.f188752a.ha(eVar);
        }
    }

    @Override // u40.o.b
    public final void b(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        gVar.getClass();
        a50.c.f fVar = new a50.c.f(this.f188753b, gVar, true);
        CreateCustomCourseActivity.a aVar = CreateCustomCourseActivity.f33013f;
        this.f188752a.ha(fVar);
    }
}
