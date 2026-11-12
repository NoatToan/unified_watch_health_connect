package l30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import java.util.List;
import l3.p1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll30/k;", "Lt30/k$a;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements t30.k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<ClimbDTO> f109594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateCourseActivity f109595b;

    public k(List<ClimbDTO> list, CreateCourseActivity createCourseActivity) {
        this.f109594a = list;
        this.f109595b = createCourseActivity;
    }

    @Override // t30.k.a
    public final void a(com.garmin.android.library.mapsdkadapter.f fVar) {
    }

    @Override // t30.k.a
    public final void b(ClimbDTO climbDTO, int i14, int i15) {
        climbDTO.getClass();
        p13.j0 j0Var = p13.j0.f134944a;
        CreateCourseActivity createCourseActivity = this.f109595b;
        boolean z14 = createCourseActivity.f32992c;
        androidx.fragment.app.v supportFragmentManager = createCourseActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        c cVar = new c(createCourseActivity, 17);
        List<ClimbDTO> list = this.f109594a;
        c60.e.f(this.f109594a, i14, i15, j0Var, false, true, z14, supportFragmentManager, cVar, null, new k41.e(29, list, createCourseActivity), new p1(5, list, createCourseActivity));
        createCourseActivity.ea().C4(createCourseActivity.getResources().getDisplayMetrics().heightPixels / 2);
        z zVarEa = createCourseActivity.ea();
        zVarEa.getClass();
        zVarEa.z4(new n30.c.o(climbDTO));
    }
}
