package l30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity;
import java.util.List;
import l3.p1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll30/z0;", "Lt30/k$a;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z0 implements t30.k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<ClimbDTO> f109684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultipleCoursesActivity f109685b;

    public z0(List<ClimbDTO> list, MultipleCoursesActivity multipleCoursesActivity) {
        this.f109684a = list;
        this.f109685b = multipleCoursesActivity;
    }

    @Override // t30.k.a
    public final void a(com.garmin.android.library.mapsdkadapter.f fVar) {
    }

    @Override // t30.k.a
    public final void b(ClimbDTO climbDTO, int i14, int i15) {
        climbDTO.getClass();
        p13.j0 j0Var = p13.j0.f134944a;
        MultipleCoursesActivity multipleCoursesActivity = this.f109685b;
        androidx.fragment.app.v supportFragmentManager = multipleCoursesActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        u0 u0Var = new u0(multipleCoursesActivity, 6);
        List<ClimbDTO> list = this.f109684a;
        c60.e.f(this.f109684a, i14, i15, j0Var, false, true, false, supportFragmentManager, u0Var, null, new y0(0, list, multipleCoursesActivity), new p1(7, list, multipleCoursesActivity));
        MultipleCoursesActivity.a aVar = MultipleCoursesActivity.f33000c;
        multipleCoursesActivity.da().z4(multipleCoursesActivity.getResources().getDisplayMetrics().heightPixels / 2);
        a1 a1VarDa = multipleCoursesActivity.da();
        a1VarDa.getClass();
        a1VarDa.x4(new n30.j.f(climbDTO));
    }
}
