package x40;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx40/p;", "Lt30/k$a;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements t30.k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<ClimbDTO> f188767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateCustomCourseActivity f188768b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"x40/p$a", "Lt30/c$a;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements t30.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CreateCustomCourseActivity f188769a;

        public a(CreateCustomCourseActivity createCustomCourseActivity) {
            this.f188769a = createCustomCourseActivity;
        }

        @Override // t30.c.a
        public final void a(com.garmin.android.library.mapsdkadapter.f fVar) {
            CreateCustomCourseActivity createCustomCourseActivity = this.f188769a;
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
            CreateCustomCourseActivity createCustomCourseActivity = this.f188769a;
            androidx.fragment.app.v supportFragmentManager = createCustomCourseActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            c60.e.a(supportFragmentManager);
            a50.c.a aVar = new a50.c.a(list);
            CreateCustomCourseActivity.a aVar2 = CreateCustomCourseActivity.f33013f;
            createCustomCourseActivity.ha(aVar);
        }
    }

    public p(List<ClimbDTO> list, CreateCustomCourseActivity createCustomCourseActivity) {
        this.f188767a = list;
        this.f188768b = createCustomCourseActivity;
    }

    @Override // t30.k.a
    public final void a(com.garmin.android.library.mapsdkadapter.f fVar) {
        CreateCustomCourseActivity createCustomCourseActivity = this.f188768b;
        androidx.fragment.app.v supportFragmentManager = createCustomCourseActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.a(supportFragmentManager);
        a50.c.v vVar = new a50.c.v(fVar, null);
        CreateCustomCourseActivity.a aVar = CreateCustomCourseActivity.f33013f;
        createCustomCourseActivity.ha(vVar);
    }

    @Override // t30.k.a
    public final void b(ClimbDTO climbDTO, int i14, int i15) {
        climbDTO.getClass();
        CreateCustomCourseActivity.a aVar = CreateCustomCourseActivity.f33013f;
        CreateCustomCourseActivity createCustomCourseActivity = this.f188768b;
        List<com.garmin.android.library.mapsdkadapter.f> listEa = createCustomCourseActivity.ea();
        androidx.fragment.app.v supportFragmentManager = createCustomCourseActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        d dVar = new d(createCustomCourseActivity, 19);
        a aVar2 = new a(createCustomCourseActivity);
        List<ClimbDTO> list = this.f188767a;
        c60.e.f(this.f188767a, i14, i15, listEa, true, false, true, supportFragmentManager, dVar, aVar2, new wb1.i(18, list, createCustomCourseActivity), new w02.b(29, list, createCustomCourseActivity));
        createCustomCourseActivity.fa().H4(createCustomCourseActivity.getResources().getDisplayMetrics().heightPixels / 2);
        l0 l0VarFa = createCustomCourseActivity.fa();
        l0VarFa.getClass();
        l0VarFa.D4(new a50.e.r(climbDTO));
    }
}
