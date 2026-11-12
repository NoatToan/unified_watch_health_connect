package x40;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx40/o;", "Lt30/c$a;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements t30.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CreateCustomCourseActivity f188763a;

    public o(CreateCustomCourseActivity createCustomCourseActivity) {
        this.f188763a = createCustomCourseActivity;
    }

    @Override // t30.c.a
    public final void a(com.garmin.android.library.mapsdkadapter.f fVar) {
        CreateCustomCourseActivity createCustomCourseActivity = this.f188763a;
        androidx.fragment.app.v supportFragmentManager = createCustomCourseActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.a(supportFragmentManager);
        a50.c.v vVar = new a50.c.v(fVar, null);
        CreateCustomCourseActivity.a aVar = CreateCustomCourseActivity.f33013f;
        createCustomCourseActivity.ha(vVar);
    }

    @Override // t30.c.a
    public final void b(List<GeoPointDTO> list) {
        list.getClass();
        CreateCustomCourseActivity createCustomCourseActivity = this.f188763a;
        androidx.fragment.app.v supportFragmentManager = createCustomCourseActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.a(supportFragmentManager);
        a50.c.a aVar = new a50.c.a(list);
        CreateCustomCourseActivity.a aVar2 = CreateCustomCourseActivity.f33013f;
        createCustomCourseActivity.ha(aVar);
    }
}
