package com.garmin.android.apps.connectmobile.courses.presentation.automatic;

import am.x0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.g1;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.garmin.android.apps.connectmobile.courses.model.i;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.chart.CourseFullscreenChartActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.setup.CourseParametersActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.library.mapsdkadapter.e;
import com.garmin.android.library.mapsdkadapter.f;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import g.h;
import hv0.d;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k30.k;
import lc.u0;
import m30.m;
import m30.z;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import r53.b2;
import ro0.l;
import u20.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/automatic/CreateCourseActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lm30/m$b;", "Lu20/g;", "Lu40/g;", "Ll40/b;", "Lm30/z$a;", "<init>", "()V", "a", "Ln30/f;", RemoteConfigConstants.ResponseFieldKey.STATE, "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CreateCourseActivity extends c implements m.b, g, u40.g, l40.b, z.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f32989g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f32993d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32990a = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f32994e = o13.m.a(n.NONE, new b(this, null, null, new l30.a(this, 0)));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Intent> f32995f = registerForActivityResult(new h(), new jp.a(this, 4));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<l30.z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f32996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f32997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f32998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f32999d;

        public b(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f32996a = gVar;
            this.f32997b = qualifier;
            this.f32998c = aVar;
            this.f32999d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, l30.z] */
        @Override // e23.a
        public final l30.z invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f32996a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f32998c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(l30.z.class), viewModelStore, null, defaultViewModelCreationExtras, this.f32997b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f32999d, 4, null);
        }
    }

    public static void ca(CreateCourseActivity createCourseActivity, boolean z14) {
        if (z14) {
            super.onBackPressed();
        }
    }

    @Override // l40.b
    public final void F3(l40.a aVar) {
        ea().F3(aVar);
    }

    @Override // u20.g
    public final void H1(e eVar, int i14, List<? extends com.garmin.android.apps.connectmobile.courses.model.h> list) {
        list.getClass();
        fa(new n30.a.r(eVar, i14, list));
    }

    @Override // u40.g
    public final void J4(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
        fa(new n30.a.j(gVar, geoPointDTO));
    }

    @Override // u20.g
    public final void K2(e eVar, com.garmin.android.apps.connectmobile.courses.model.c cVar, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2) {
        cVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        fa(new n30.a.p(eVar, cVar, bVar, bVar2));
    }

    @Override // m30.z.a
    public final void L5() {
        l30.z zVarEa = ea();
        zVarEa.getClass();
        zVarEa.z4(n30.c.k.f123422a);
    }

    @Override // l40.b
    /* JADX INFO: renamed from: S2 */
    public final b2 getF102929e() {
        return ea().A;
    }

    @Override // m30.m.b
    public final void X(f fVar) {
        if (this.f32992c) {
            return;
        }
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.a(supportFragmentManager);
        fa(new n30.a.y(fVar.f50283a));
    }

    @Override // m30.z.a
    public final void Y1() {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.m(supportFragmentManager, new l30.c(this, 9));
    }

    @Override // u20.g
    public final void a5(PointOfInterestDTO pointOfInterestDTO) {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.c(supportFragmentManager);
        ea().A4();
        j0 j0Var = j0.f134944a;
        boolean z14 = this.f32992c;
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        c60.e.r(pointOfInterestDTO, j0Var, true, z14, supportFragmentManager2, new k11.h(29, this, pointOfInterestDTO), new c50.a(2), new l30.b(this, 5), new l30.c(this, 14));
        l30.z zVarEa = ea();
        zVarEa.getClass();
        zVarEa.z4(new n30.c.s(pointOfInterestDTO));
    }

    @Override // m30.z.a
    public final void b2() {
        i iVarM;
        w20.b bVar;
        n30.e eVar;
        n30.e eVar2;
        n30.e eVar3;
        n30.e eVar4;
        n30.e eVar5;
        n30.e eVar6;
        n30.e eVar7;
        CourseParametersActivity.a aVar = CourseParametersActivity.f33102c;
        com.garmin.android.apps.connectmobile.courses.model.e eVarDa = da();
        String str = eVarDa != null ? eVarDa.courseName : null;
        if (str == null) {
            str = "";
        }
        n30.g gVarB = ((n30.f) ea().f109669x.f150540a.getValue()).b();
        k kVar = (gVarB == null || (eVar7 = gVarB.f123469d) == null) ? k.POPULARITY : eVar7.f123446a;
        n30.g gVarB2 = ((n30.f) ea().f109669x.f150540a.getValue()).b();
        boolean z14 = false;
        boolean z15 = (gVarB2 == null || (eVar6 = gVarB2.f123469d) == null) ? false : eVar6.f123447b;
        n30.g gVarB3 = ((n30.f) ea().f109669x.f150540a.getValue()).b();
        boolean z16 = (gVarB3 == null || (eVar5 = gVarB3.f123469d) == null) ? false : eVar5.f123448c;
        n30.g gVarB4 = ((n30.f) ea().f109669x.f150540a.getValue()).b();
        if (gVarB4 != null && (eVar4 = gVarB4.f123469d) != null) {
            z14 = eVar4.f123449d;
        }
        n30.g gVarB5 = ((n30.f) ea().f109669x.f150540a.getValue()).b();
        double d14 = (gVarB5 == null || (eVar3 = gVarB5.f123469d) == null) ? 0.0d : eVar3.f123450e;
        com.garmin.android.apps.connectmobile.courses.model.e eVarDa2 = da();
        if (eVarDa2 == null || (iVarM = eVarDa2.m()) == null) {
            iVarM = i.OTHER;
        }
        n30.g gVarB6 = ((n30.f) ea().f109669x.f150540a.getValue()).b();
        if (gVarB6 == null || (eVar2 = gVarB6.f123469d) == null) {
            w20.b.f181482c.getClass();
            bVar = ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).c() ? w20.b.TAILWIND : w20.b.NORTH;
        } else {
            bVar = eVar2.f123451f;
        }
        n30.g gVarB7 = ((n30.f) ea().f109669x.f150540a.getValue()).b();
        int i14 = (gVarB7 == null || (eVar = gVarB7.f123469d) == null) ? -1 : eVar.f123452g;
        aVar.getClass();
        kVar.getClass();
        bVar.getClass();
        Intent intent = new Intent(this, (Class<?>) CourseParametersActivity.class);
        intent.putExtra("GCM_extra_course_name", str);
        intent.putExtra("GCM_extra_course_routing_type", kVar);
        intent.putExtra("GCM_extra_course_avoid_high_traffic", z15);
        intent.putExtra("GCM_extra_course_avoid_closed_roads", z16);
        intent.putExtra("GCM_extra_course_avoid_unpaved_roads", z14);
        intent.putExtra("GCM_extra_course_distance", d14);
        intent.putExtra("GCM_extra_course_type", iVarM);
        intent.putExtra("GCM_extra_course_direction", bVar);
        intent.putExtra("GCM_create_course_flow", i14);
        intent.putExtra("GCM_reroute_flow", true);
        startActivityForResult(intent, 1);
    }

    @Override // u20.g
    public final void c4(int i14, int i15, List list) {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.c(supportFragmentManager);
        ea().A4();
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        c60.e.g(list, i14, i15, supportFragmentManager2, new l30.b(this, 4), new l30.c(this, 12), new l30.c(this, 13));
        ea().C4(getResources().getDisplayMetrics().heightPixels / 2);
        l30.z zVarEa = ea();
        zVarEa.getClass();
        zVarEa.z4(new n30.c.n(i14));
    }

    @Override // m30.z.a
    public final void d() {
        com.garmin.android.apps.connectmobile.courses.model.e eVarDa = da();
        if (g22.n.d(eVarDa != null ? eVarDa.courseId : null)) {
            HelpActivity.a aVar = HelpActivity.f36653a;
            l lVar = l.SAVED_COURSE;
            aVar.getClass();
            HelpActivity.a.d(this, lVar, null, null);
            return;
        }
        HelpActivity.a aVar2 = HelpActivity.f36653a;
        l lVar2 = l.CREATE_COURSE;
        aVar2.getClass();
        HelpActivity.a.d(this, lVar2, null, null);
    }

    public final com.garmin.android.apps.connectmobile.courses.model.e da() {
        w20.a aVar = ((n30.f) ea().f109669x.f150540a.getValue()).f123456d;
        if (aVar != null) {
            return aVar.f181476a;
        }
        return null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isProgressOverlayVisible()) {
            return true;
        }
        n30.h hVar = ((n30.f) ea().f109669x.f150540a.getValue()).f123459g;
        hVar.getClass();
        if (hVar.f123470a && !hVar.f123471b && hVar.f123472c) {
            fa(n30.a.g.f123354a);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final l30.z ea() {
        return (l30.z) this.f32994e.getValue();
    }

    @Override // u40.g
    public final void f8(com.garmin.android.library.mapsdkadapter.i iVar) {
        if (this.f32992c) {
            return;
        }
        j22.b bVar = j22.b.f96736a;
        j22.a aVar = j22.a.f96719h;
        bVar.getClass();
        if (!j22.b.k(aVar)) {
            j22.b.x(this, 2, aVar);
            return;
        }
        l30.z zVarEa = ea();
        zVarEa.getClass();
        zVarEa.z4(n30.c.d.f123407a);
    }

    public final void fa(n30.a aVar) {
        ArrayList parcelableArrayList;
        if (s.g(aVar, n30.a.h.f123355a)) {
            onBackPressed();
            return;
        }
        int i14 = 2;
        boolean z14 = false;
        z14 = false;
        if (s.g(aVar, n30.a.n.f123368a)) {
            if (getSupportFragmentManager().G("CreateCourseOnboarding") != null) {
                return;
            }
            o40.b.f129051d.getClass();
            o40.b bVarA = o40.b.a.a(false);
            bVarA.u6(bVarA.f129054c);
            bVarA.f129053b = new l30.a(this, i14);
            bVarA.show(getSupportFragmentManager(), "CreateCourseOnboarding");
            return;
        }
        int i15 = 1;
        if (s.g(aVar, n30.a.i.f123356a)) {
            z.b bVar = z.f116414c;
            boolean z15 = this.f32992c;
            bVar.getClass();
            z zVar = new z();
            Bundle bundle = new Bundle(1);
            bundle.putBoolean("extraIsEditMode", z15);
            zVar.setArguments(bundle);
            zVar.show(getSupportFragmentManager(), zVar.getTag());
            return;
        }
        if (!(aVar instanceof n30.a.e)) {
            if (!(aVar instanceof n30.a.d)) {
                ea().B4(aVar);
                return;
            }
            n50.c cVar = ((n30.a.d) aVar).f123351a;
            if (!cVar.equals(n50.c.a.f123740a)) {
                if (cVar instanceof n50.c.b) {
                    ea().B4(aVar);
                    return;
                } else {
                    u0.r();
                    return;
                }
            }
            com.garmin.android.apps.connectmobile.courses.model.e eVarDa = da();
            if (((n30.f) ea().f109668w.getValue()).f123463k == null && eVarDa != null) {
                CourseFullscreenChartActivity.f33012a.getClass();
                CourseFullscreenChartActivity.a.a(this, eVarDa);
                return;
            }
            return;
        }
        n50.f fVar = ((n30.a.e) aVar).f123352a;
        ArrayList parcelableArrayList2 = null;
        if (fVar.equals(n50.f.a.f123747a)) {
            w20.a aVar2 = ((n30.f) ea().f109669x.f150540a.getValue()).f123456d;
            List<ClimbDTO> list = aVar2 != null ? aVar2.f181477b : null;
            if (list == null || list.isEmpty()) {
                return;
            }
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            c60.e.c(supportFragmentManager);
            ea().A4();
            v supportFragmentManager2 = getSupportFragmentManager();
            supportFragmentManager2.getClass();
            c60.e.i(list, supportFragmentManager2, new d(23, this, list), new l30.b(this, z14 ? 1 : 0), new l30.c(this, z14 ? 1 : 0), new l30.a(this, i15));
            return;
        }
        if (fVar.equals(n50.f.b.f123748a)) {
            com.garmin.android.apps.connectmobile.courses.model.e eVarDa2 = da();
            if (eVarDa2 == null) {
                return;
            }
            CoursePointListActivity.a aVar3 = CoursePointListActivity.f33079c;
            com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e(eVarDa2);
            aVar3.getClass();
            CoursePointListActivity.a.a(this, eVar, true, this.f32995f);
            return;
        }
        if (fVar.equals(n50.f.c.f123749a)) {
            if (getF104023a() == i.OBSTACLE_COURSE_RACING) {
                new androidx.appcompat.app.e.a(this).setTitle(R.string.lbl_course_type_locked_title).setMessage(R.string.ocr_course_type_locked_message).setNeutralButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
                return;
            }
            Bundle bundle2 = this.f32993d;
            if (bundle2 != null) {
                parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle2.getParcelableArrayList("EXTRA_RELATED_PACEBANDS", com.garmin.android.apps.connectmobile.pacepro.data.dto.b.class) : bundle2.getParcelableArrayList("EXTRA_RELATED_PACEBANDS");
            } else {
                parcelableArrayList = null;
            }
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                new androidx.appcompat.app.e.a(this).setTitle(R.string.lbl_course_type_locked_title).setMessage(R.string.lbl_course_type_locked_message).setNeutralButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
                return;
            }
            Bundle bundle3 = this.f32993d;
            if (bundle3 != null) {
                parcelableArrayList2 = Build.VERSION.SDK_INT >= 33 ? bundle3.getParcelableArrayList("EXTRA_RELATED_POWER_GUIDES", ab1.g.class) : bundle3.getParcelableArrayList("EXTRA_RELATED_POWER_GUIDES");
            }
            if (parcelableArrayList2 == null || parcelableArrayList2.isEmpty()) {
                com.garmin.android.apps.connectmobile.courses.model.e eVarDa3 = da();
                i15 = (eVarDa3 == null || !eVarDa3.G()) ? -1 : 2;
            }
            i f104023a = getF104023a();
            l30.c cVar2 = new l30.c(this, i14);
            v supportFragmentManager3 = getSupportFragmentManager();
            supportFragmentManager3.getClass();
            c60.e.n(f104023a, i15, cVar2, supportFragmentManager3);
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (fVar.equals(n50.f.d.f123750a)) {
            com.garmin.android.apps.connectmobile.courses.model.e eVarDa4 = da();
            if (eVarDa4 != null && eVarDa4.e0()) {
                z14 = true;
            }
            v supportFragmentManager4 = getSupportFragmentManager();
            supportFragmentManager4.getClass();
            c60.e.s(z14, supportFragmentManager4, new l30.c(this, i15));
            return;
        }
        if (!fVar.equals(n50.f.e.f123751a)) {
            ea().B4(aVar);
            return;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVarDa5 = da();
        Double dValueOf = eVarDa5 != null ? Double.valueOf(eVarDa5.q()) : null;
        if (!zf.b.D(dValueOf) || dValueOf.doubleValue() <= 0.0d) {
            return;
        }
        g40.d.a aVar4 = g40.d.f75763t;
        i iVarM = eVarDa5.m();
        x0 x0VarG = eVarDa5.g();
        Double dValueOf2 = Double.valueOf(eVarDa5.A());
        Double d14 = eVarDa5.elapsedSeconds;
        aVar4.getClass();
        g40.d dVarA = g40.d.a.a(iVarM, x0VarG, dValueOf2, d14, dValueOf);
        dVarA.f75764h = new l30.b(this, 7);
        dVarA.show(getSupportFragmentManager(), "");
    }

    public final void ga(final com.garmin.android.apps.connectmobile.courses.model.g gVar, final boolean z14) {
        ea().A4();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        final int i14 = 0;
        final int i15 = 1;
        c60.e.l(gVar, supportFragmentManager, new e23.a(this) { // from class: l30.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateCourseActivity f109563b;

            {
                this.f109563b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
                int i16 = i14;
                boolean z15 = z14;
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = gVar;
                CreateCourseActivity createCourseActivity = this.f109563b;
                switch (i16) {
                    case 0:
                        CreateCourseActivity.a aVar = CreateCourseActivity.f32989g;
                        z zVarEa = createCourseActivity.ea();
                        zVarEa.getClass();
                        zVarEa.z4(new n30.c.z(gVar2));
                        createCourseActivity.ea().x4();
                        if (z15) {
                            createCourseActivity.fa(n30.a.s.f123381a);
                        } else {
                            Long coursePointId = gVar2.getCoursePointId();
                            if (coursePointId != null) {
                                createCourseActivity.fa(new n30.a.b(coursePointId.longValue()));
                            }
                        }
                        break;
                    default:
                        CreateCourseActivity.a aVar2 = CreateCourseActivity.f32989g;
                        z zVarEa2 = createCourseActivity.ea();
                        zVarEa2.getClass();
                        zVarEa2.z4(new n30.c.z(gVar2));
                        createCourseActivity.ea().x4();
                        com.garmin.android.apps.connectmobile.courses.model.e eVarDa = createCourseActivity.da();
                        com.garmin.android.apps.connectmobile.courses.model.g gVar3 = null;
                        Object obj = null;
                        gVar3 = null;
                        if (eVarDa != null && (listJ = eVarDa.j()) != null) {
                            for (Object obj2 : listJ) {
                                if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.courses.model.g) obj2).getCoursePointId(), gVar2.getCoursePointId())) {
                                    obj = obj2;
                                    gVar3 = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                                }
                            }
                            gVar3 = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                        }
                        if (gVar3 != null) {
                            z zVarEa3 = createCourseActivity.ea();
                            zVarEa3.getClass();
                            zVarEa3.z4(new n30.c.n0(gVar3));
                        }
                        if (z15) {
                            createCourseActivity.fa(n30.a.s.f123381a);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new ad0.f(this, gVar, z14, 12), null, null, new l30.c(this, 5), new e23.a(this) { // from class: l30.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateCourseActivity f109563b;

            {
                this.f109563b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
                int i16 = i15;
                boolean z15 = z14;
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = gVar;
                CreateCourseActivity createCourseActivity = this.f109563b;
                switch (i16) {
                    case 0:
                        CreateCourseActivity.a aVar = CreateCourseActivity.f32989g;
                        z zVarEa = createCourseActivity.ea();
                        zVarEa.getClass();
                        zVarEa.z4(new n30.c.z(gVar2));
                        createCourseActivity.ea().x4();
                        if (z15) {
                            createCourseActivity.fa(n30.a.s.f123381a);
                        } else {
                            Long coursePointId = gVar2.getCoursePointId();
                            if (coursePointId != null) {
                                createCourseActivity.fa(new n30.a.b(coursePointId.longValue()));
                            }
                        }
                        break;
                    default:
                        CreateCourseActivity.a aVar2 = CreateCourseActivity.f32989g;
                        z zVarEa2 = createCourseActivity.ea();
                        zVarEa2.getClass();
                        zVarEa2.z4(new n30.c.z(gVar2));
                        createCourseActivity.ea().x4();
                        com.garmin.android.apps.connectmobile.courses.model.e eVarDa = createCourseActivity.da();
                        com.garmin.android.apps.connectmobile.courses.model.g gVar3 = null;
                        Object obj = null;
                        gVar3 = null;
                        if (eVarDa != null && (listJ = eVarDa.j()) != null) {
                            for (Object obj2 : listJ) {
                                if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.courses.model.g) obj2).getCoursePointId(), gVar2.getCoursePointId())) {
                                    obj = obj2;
                                    gVar3 = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                                }
                            }
                            gVar3 = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                        }
                        if (gVar3 != null) {
                            z zVarEa3 = createCourseActivity.ea();
                            zVarEa3.getClass();
                            zVarEa3.z4(new n30.c.n0(gVar3));
                        }
                        if (z15) {
                            createCourseActivity.fa(n30.a.s.f123381a);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        l30.z zVarEa = ea();
        zVarEa.getClass();
        zVarEa.z4(new n30.c.q(gVar));
    }

    @Override // u40.g
    public final void h1(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        ArrayList arrayListK;
        fa(new n30.a.C2314a(gVar));
        bv.b.f21239a.getClass();
        bv.b.a();
        if (k1.f37122a.s()) {
            com.garmin.android.apps.connectmobile.courses.model.e eVarDa = da();
            com.garmin.android.apps.connectmobile.courses.model.g gVar2 = (eVarDa == null || (arrayListK = eVarDa.k()) == null) ? null : (com.garmin.android.apps.connectmobile.courses.model.g) h0.n0(arrayListK);
            if (gVar2 != null) {
                ga(gVar2, true);
            }
        }
    }

    @Override // u20.g
    public final void h2(ArrayList arrayList, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        fa(new n30.a.o(arrayList, bVar, bVar2));
    }

    public final void ha(int i14, int i15) {
        if (isFinishing()) {
            return;
        }
        q1.b bVar = q1.f41066b;
        String string = getString(i14);
        string.getClass();
        hy.d dVar = new hy.d(this, 17);
        bVar.getClass();
        q1 q1VarA = q1.b.a(i15, string, R.string.lbl_yes, R.string.lbl_cancel, dVar);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarA.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // u20.g
    /* JADX INFO: renamed from: j6 */
    public final i getF104023a() {
        i iVarM;
        com.garmin.android.apps.connectmobile.courses.model.e eVarDa = da();
        return (eVarDa == null || (iVarM = eVarDa.m()) == null) ? i.OTHER : iVarM;
    }

    @Override // u20.g
    public final void l8(fn0.a aVar) {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.c(supportFragmentManager);
        ea().A4();
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        c60.e.p(aVar, supportFragmentManager2, new k11.h(27, this, aVar), new l30.b(this, 3), new l30.c(this, 10));
        l30.z zVarEa = ea();
        zVarEa.getClass();
        zVarEa.z4(new n30.c.r(aVar));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Object serializableExtra;
        Object serializableExtra2;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 1 && i15 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("GCM_extra_course_name");
            if (g22.n.d(stringExtra)) {
                fa(new n30.a.e(new n50.f.i(stringExtra)));
            }
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 33) {
                serializableExtra = intent.getSerializableExtra("GCM_extra_course_routing_type", k.class);
            } else {
                Object serializableExtra3 = intent.getSerializableExtra("GCM_extra_course_routing_type");
                if (!(serializableExtra3 instanceof k)) {
                    serializableExtra3 = null;
                }
                serializableExtra = (k) serializableExtra3;
            }
            k kVar = (k) serializableExtra;
            boolean booleanExtra = intent.getBooleanExtra("GCM_extra_course_avoid_high_traffic", false);
            boolean booleanExtra2 = intent.getBooleanExtra("GCM_extra_course_avoid_closed_roads", false);
            boolean booleanExtra3 = intent.getBooleanExtra("GCM_extra_course_avoid_unpaved_roads", false);
            double doubleExtra = intent.getDoubleExtra("GCM_extra_course_distance", Double.NaN);
            if (i16 >= 33) {
                serializableExtra2 = intent.getSerializableExtra("GCM_extra_course_direction", w20.b.class);
            } else {
                Object serializableExtra4 = intent.getSerializableExtra("GCM_extra_course_direction");
                serializableExtra2 = (w20.b) (serializableExtra4 instanceof w20.b ? serializableExtra4 : null);
            }
            w20.b bVar = (w20.b) serializableExtra2;
            if (kVar == null || bVar == null || Double.isNaN(doubleExtra)) {
                return;
            }
            fa(new n30.a.l(kVar, bVar, doubleExtra, booleanExtra, booleanExtra2, booleanExtra3));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        com.garmin.android.apps.connectmobile.courses.model.e eVarDa = da();
        ArrayList arrayListK = eVarDa != null ? eVarDa.k() : null;
        if (arrayListK != null && !arrayListK.isEmpty()) {
            com.garmin.android.apps.connectmobile.courses.model.e eVarDa2 = da();
            String str = eVarDa2 != null ? eVarDa2.courseId : null;
            if (str == null || str.length() == 0) {
                ha(R.string.message_going_back_lose_course_points, R.string.concept_courses);
                return;
            }
        }
        if (((n30.f) ea().f109669x.f150540a.getValue()).f123465m && ((n30.f) ea().f109669x.f150540a.getValue()).f123464l && !this.f32991b) {
            ha(R.string.msg_quit_without_save, 0);
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundleA;
        w20.a aVar;
        List<GeoPointDTO> list;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.course_details_content);
        if (bundle != null) {
            l2.f37135b.getClass();
            bundleA = l2.a.b().e(bundle);
        } else {
            l2.a aVar2 = l2.f37135b;
            Intent intent = getIntent();
            aVar2.getClass();
            bundleA = l2.a.a(intent);
        }
        this.f32993d = bundleA;
        if (bundleA == null) {
            finish();
            return;
        }
        this.f32990a = bundleA.getBoolean("GCM_extra_course_navigate_up", true);
        Bundle bundle2 = this.f32993d;
        boolean z14 = false;
        this.f32991b = bundle2 != null ? bundle2.getBoolean("GCM_extra_course_navigate_multiple_courses", false) : false;
        Bundle bundle3 = this.f32993d;
        if (bundle3 == null) {
            aVar = new w20.a(new com.garmin.android.apps.connectmobile.courses.model.e(), null, null, null, null, false, 62, null);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle3.getParcelable("GCM_extra_course_data", w20.a.class);
            } else {
                Parcelable parcelable2 = bundle3.getParcelable("GCM_extra_course_data");
                if (!(parcelable2 instanceof w20.a)) {
                    parcelable2 = null;
                }
                parcelable = (w20.a) parcelable2;
            }
            aVar = (w20.a) parcelable;
            if (aVar == null) {
                aVar = new w20.a(new com.garmin.android.apps.connectmobile.courses.model.e(), null, null, null, null, false, 62, null);
            }
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVar = aVar.f181476a;
        if (g22.n.d(eVar.courseId) || ((list = eVar.geoPoints) != null && !list.isEmpty())) {
            z14 = true;
        }
        this.f32992c = z14;
        View viewFindViewById = findViewById(R.id.course_details_layout);
        kg.f fVar = new kg.f(18);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById, fVar);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(-1256445083, true, new l30.b(this, 6)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i14, strArr, iArr);
        if (this.f32992c) {
            return;
        }
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            l30.z zVarEa = ea();
            zVarEa.getClass();
            zVarEa.z4(n30.c.d.f123407a);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f32993d;
        if (bundle2 != null) {
            l2.f37135b.getClass();
            l2.a.b().d(bundle, bundle2);
        }
    }

    @Override // u20.g
    public final void p5(e eVar, List<? extends fn0.c> list) {
        list.getClass();
        fa(new n30.a.q(eVar, list));
    }

    @Override // u20.g
    public final void q8() {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.b(supportFragmentManager);
    }

    @Override // u40.g
    public final void z4(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        if (gVar.g()) {
            return;
        }
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.c(supportFragmentManager);
        bv.b.f21239a.getClass();
        bv.b.a();
        if (k1.f37122a.s()) {
            ga(gVar, false);
            return;
        }
        ea().A4();
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        c60.e.k(gVar, supportFragmentManager2, new l30.c(this, 15), new l30.f(this, gVar, 3), true, new l30.c(this, 16));
        l30.z zVarEa = ea();
        zVarEa.getClass();
        zVarEa.z4(new n30.c.q(gVar));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/automatic/CreateCourseActivity$a;", "", "<init>", "()V", "", "GARMIN_SUPPORT_URL", "Ljava/lang/String;", "", "REQUEST_CODE_REROUTE", "I", "REQUEST_CODE_PERM_LOCATION", "EXTRA_RELATED_PACEBANDS", "EXTRA_RELATED_POWER_GUIDES", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, com.garmin.android.apps.connectmobile.courses.model.e eVar, List list, List list2, boolean z14, boolean z15, boolean z16) {
            context.getClass();
            com.garmin.android.apps.connectmobile.courses.model.e eVar2 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar);
            Intent intent = new Intent(context, (Class<?>) CreateCourseActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("GCM_extra_course_data", new w20.a(eVar2, null, null, null, null, false, 62, null));
            bundle.putBoolean("GCM_extra_course_has_linked_events", z14);
            bundle.putBoolean("GCM_extra_course_has_linked_shareable_events", z15);
            bundle.putBoolean("GCM_extra_course_navigate_up", z16);
            if (list != null) {
                bundle.putParcelableArrayList("EXTRA_RELATED_PACEBANDS", new ArrayList<>(list));
            }
            if (list2 != null) {
                bundle.putParcelableArrayList("EXTRA_RELATED_POWER_GUIDES", new ArrayList<>(list2));
            }
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
            return intent;
        }

        private a() {
        }
    }
}
