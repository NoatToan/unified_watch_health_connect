package c60;

import a03.h0;
import am.e1;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import as.n;
import bp.h;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.garmin.android.apps.connectmobile.courses.model.f;
import com.garmin.android.apps.connectmobile.courses.model.i;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.v0;
import e23.p;
import e23.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p40.l;
import s40.g;
import t30.k;
import t30.m;
import u40.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24622a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.COURSE_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.COURSE_FINISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24622a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"c60/e$b", "", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f24623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f24624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<Integer, Integer, Unit> f24625c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(v vVar, e23.a<Unit> aVar, p<? super Integer, ? super Integer, Unit> pVar) {
            this.f24623a = vVar;
            this.f24624b = aVar;
            this.f24625c = pVar;
        }

        public final void a(int i14, int i15) {
            this.f24625c.invoke(Integer.valueOf(i14), Integer.valueOf(i15));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"c60/e$c", "", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f24626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f24627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<PointOfInterestDTO, String, Unit> f24628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p<Integer, Integer, Unit> f24629d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(v vVar, e23.a<Unit> aVar, p<? super PointOfInterestDTO, ? super String, Unit> pVar, p<? super Integer, ? super Integer, Unit> pVar2) {
            this.f24626a = vVar;
            this.f24627b = aVar;
            this.f24628c = pVar;
            this.f24629d = pVar2;
        }

        public final void a(int i14, int i15) {
            this.f24629d.invoke(Integer.valueOf(i14), Integer.valueOf(i15));
        }
    }

    public static final void a(v vVar) {
        Fragment fragmentG = vVar.G("ClimbSystemBottomSheet");
        k kVar = fragmentG instanceof k ? (k) fragmentG : null;
        if (kVar != null) {
            kVar.dismiss();
        }
        Fragment fragmentG2 = vVar.G("ClimbDetailsBottomSheet");
        t30.c cVar = fragmentG2 instanceof t30.c ? (t30.c) fragmentG2 : null;
        if (cVar != null) {
            cVar.dismiss();
        }
        Fragment fragmentG3 = vVar.G("CourseClimbsBottomSheet");
        m mVar = fragmentG3 instanceof m ? (m) fragmentG3 : null;
        if (mVar != null) {
            mVar.dismiss();
        }
    }

    public static final void b(v vVar) {
        List<Fragment> listF = vVar.f7372c.f();
        ArrayList arrayListL = j.l(listF);
        for (Object obj : listF) {
            if (obj instanceof v0) {
                arrayListL.add(obj);
            }
        }
        Iterator it = arrayListL.iterator();
        while (it.hasNext()) {
            ((v0) it.next()).dismiss();
        }
        Fragment fragmentG = vVar.G("CoursePointBottomSheetFragment");
        l lVar = fragmentG instanceof l ? (l) fragmentG : null;
        if (lVar != null) {
            lVar.z6();
        }
        Fragment fragmentG2 = vVar.G("CoursePointDetailsBottomSheet");
        u40.b bVar = fragmentG2 instanceof u40.b ? (u40.b) fragmentG2 : null;
        if (bVar != null) {
            bVar.z6();
        }
        Fragment fragmentG3 = vVar.G("ChooseCoursePointBottomSheet");
        u40.a aVar = fragmentG3 instanceof u40.a ? (u40.a) fragmentG3 : null;
        if (aVar != null) {
            aVar.z6();
        }
        Fragment fragmentG4 = vVar.G("HazardDetailsBottomSheet");
        h40.a aVar2 = fragmentG4 instanceof h40.a ? (h40.a) fragmentG4 : null;
        if (aVar2 != null) {
            aVar2.z6();
        }
        Fragment fragmentG5 = vVar.G("POIDetailsBottomSheet");
        g gVar = fragmentG5 instanceof g ? (g) fragmentG5 : null;
        if (gVar != null) {
            gVar.z6();
        }
    }

    public static final void c(v vVar) {
        List<Fragment> listF = vVar.f7372c.f();
        ArrayList arrayListL = j.l(listF);
        for (Object obj : listF) {
            if (obj instanceof v0) {
                arrayListL.add(obj);
            }
        }
        Iterator it = arrayListL.iterator();
        while (it.hasNext()) {
            ((v0) it.next()).dismiss();
        }
        Fragment fragmentG = vVar.G("CoursePointBottomSheetFragment");
        l lVar = fragmentG instanceof l ? (l) fragmentG : null;
        if (lVar != null) {
            lVar.z6();
        }
        Fragment fragmentG2 = vVar.G("CoursePointDetailsBottomSheet");
        u40.b bVar = fragmentG2 instanceof u40.b ? (u40.b) fragmentG2 : null;
        if (bVar != null) {
            bVar.z6();
        }
        Fragment fragmentG3 = vVar.G("ChooseCoursePointBottomSheet");
        u40.a aVar = fragmentG3 instanceof u40.a ? (u40.a) fragmentG3 : null;
        if (aVar != null) {
            aVar.z6();
        }
        Fragment fragmentG4 = vVar.G("HazardDetailsBottomSheet");
        h40.a aVar2 = fragmentG4 instanceof h40.a ? (h40.a) fragmentG4 : null;
        if (aVar2 != null) {
            aVar2.z6();
        }
        Fragment fragmentG5 = vVar.G("POIDetailsBottomSheet");
        g gVar = fragmentG5 instanceof g ? (g) fragmentG5 : null;
        if (gVar != null) {
            gVar.z6();
        }
    }

    public static final void d(v vVar, String str) {
        Fragment fragmentG = vVar.G(str);
        if (fragmentG != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(vVar);
            aVar.k(fragmentG);
            aVar.s(true, true);
        }
    }

    public static final void e(v vVar, e23.l<? super Integer, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        c(vVar);
        c60.a aVar3 = new c60.a(vVar, 0);
        u40.a aVar4 = new u40.a();
        d dVar = new d(aVar3, aVar, 0);
        d dVar2 = new d(aVar3, aVar2, 1);
        aVar4.f168541h = dVar;
        aVar4.f30950g = lVar;
        aVar4.f168542i = dVar2;
        androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(vVar);
        aVar5.j(R.id.standard_bottom_sheet_layout, aVar4, "ChooseCoursePointBottomSheet", 1);
        aVar5.s(true, true);
    }

    public static final void f(List<ClimbDTO> list, int i14, int i15, List<com.garmin.android.library.mapsdkadapter.f> list2, boolean z14, boolean z15, boolean z16, v vVar, e23.l<? super Integer, Unit> lVar, t30.c.a aVar, p<? super Integer, ? super Integer, Unit> pVar, e23.l<? super Integer, Unit> lVar2) {
        list.getClass();
        list2.getClass();
        Bundle bundle = new Bundle(1);
        bundle.putString("Screen", "Courses");
        ht.a.f85464a.getClass();
        ht.a.a(bundle, "ViewClimbDetails");
        t30.c.b bVar = t30.c.f162148z;
        ArrayList arrayList = new ArrayList(list);
        bVar.getClass();
        t30.c cVarA = t30.c.b.a(arrayList, i14, i15, list2, z14, z15, z16);
        cVarA.f162159w = aVar;
        cVarA.f162160x = pVar;
        cVarA.f162161y = lVar2;
        cVarA.f47369h = new c60.a(vVar, 3);
        cVarA.f30950g = lVar;
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(vVar);
        aVar2.j(R.id.standard_bottom_sheet_layout, cVarA, "ClimbDetailsBottomSheet", 1);
        aVar2.s(true, true);
    }

    public static final void g(List<ClimbDTO> list, int i14, int i15, v vVar, p<? super Integer, ? super Integer, Unit> pVar, e23.l<? super Integer, Unit> lVar, e23.l<? super Integer, Unit> lVar2) {
        list.getClass();
        Bundle bundle = new Bundle(1);
        bundle.putString("Screen", "Courses");
        ht.a.f85464a.getClass();
        ht.a.a(bundle, "ViewClimbDetails");
        Fragment fragmentG = vVar.G("CourseClimbsBottomSheet");
        m mVar = fragmentG instanceof m ? (m) fragmentG : null;
        if (mVar != null) {
            View view2 = mVar.getView();
            if (view2 != null) {
                view2.setImportantForAccessibility(4);
            }
            mVar.w6().removeBottomSheetCallback(mVar.f162196n);
            mVar.w6().setHideable(false);
            mVar.w6().setState(4);
        }
        t30.c.b bVar = t30.c.f162148z;
        ArrayList arrayList = new ArrayList(list);
        j0 j0Var = j0.f134944a;
        bVar.getClass();
        t30.c cVarA = t30.c.b.a(arrayList, i14, i15, j0Var, false, false, false);
        cVarA.f162159w = null;
        cVarA.f162160x = pVar;
        cVarA.f162161y = lVar2;
        cVarA.f47369h = new c60.a(vVar, 2);
        cVarA.f30950g = lVar;
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(vVar);
        aVar.j(R.id.standard_bottom_sheet_layout, cVarA, "ClimbDetailsBottomSheet", 1);
        aVar.s(true, true);
    }

    public static final void h(List<ClimbDTO> list, List<com.garmin.android.library.mapsdkadapter.f> list2, boolean z14, v vVar, e23.l<? super Integer, Unit> lVar, k.a aVar, e23.a<Unit> aVar2) {
        list2.getClass();
        k.b bVar = k.f162180q;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list);
        bVar.getClass();
        k kVar = new k();
        l2.a aVar3 = l2.f37135b;
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("EXTRA_CLIMBS", arrayList);
        bundle.putParcelableArrayList("EXTRA_COURSE_POINTS", new ArrayList<>(list2));
        bundle.putBoolean("EXTRA_SHOW_ADD_POINT_TO_COURSE", z14);
        Unit unit = Unit.INSTANCE;
        aVar3.getClass();
        l2.a.c(kVar, bundle);
        kVar.f162184n = aVar;
        kVar.f47369h = new c60.b(vVar, aVar2, 4);
        kVar.f30950g = lVar;
        androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(vVar);
        aVar4.j(R.id.standard_bottom_sheet_layout, kVar, "ClimbSystemBottomSheet", 1);
        aVar4.s(true, true);
    }

    public static final void i(List<ClimbDTO> list, v vVar, q<? super ClimbDTO, ? super Integer, ? super Integer, Unit> qVar, p<? super Integer, ? super Integer, Unit> pVar, e23.l<? super Integer, Unit> lVar, e23.a<Unit> aVar) {
        list.getClass();
        c(vVar);
        m.a aVar2 = m.f162192o;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list);
        aVar2.getClass();
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("EXTRA_CLIMBS", arrayList);
        l2.f37135b.getClass();
        l2.a.c(mVar, bundle);
        mVar.f162193k = qVar;
        mVar.f162194l = pVar;
        mVar.f47369h = new c60.b(vVar, aVar, 3);
        mVar.f30950g = lVar;
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(vVar);
        aVar3.j(R.id.standard_bottom_sheet_layout, mVar, "CourseClimbsBottomSheet", 1);
        aVar3.s(true, true);
    }

    public static final void j(com.garmin.android.apps.connectmobile.courses.model.g gVar, boolean z14, v vVar, e23.l lVar, e23.a aVar, e23.l lVar2, r50.c cVar, r50.e eVar, e23.a aVar2, e23.a aVar3) {
        c60.b bVar = new c60.b(vVar, aVar3, 0);
        l.a aVar4 = l.f135693p;
        Long coursePointId = gVar.getCoursePointId();
        aVar4.getClass();
        l lVar3 = new l();
        Bundle bundle = new Bundle();
        if (coursePointId != null) {
            bundle.putLong("coursePoint", coursePointId.longValue());
        }
        bundle.putBoolean("isEditable", z14);
        lVar3.setArguments(bundle);
        lVar3.f135701o = new c60.c(gVar, 0);
        lVar3.f135700n = lVar;
        lVar3.f135696j = bVar;
        lVar3.f135698l = new h(12, bVar, aVar);
        lVar3.f135697k = new e1(bVar, cVar, eVar, gVar, lVar2, 4);
        lVar3.f135699m = new h0(aVar2, 12);
        androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(vVar);
        aVar5.o(R.anim.slide_in_up, R.anim.exit_out_down, R.anim.slide_in_up, R.anim.exit_out_down);
        aVar5.j(R.id.standard_bottom_sheet_layout, lVar3, "CoursePointBottomSheetFragment", 1);
        aVar5.s(true, true);
    }

    public static final void k(com.garmin.android.apps.connectmobile.courses.model.g gVar, v vVar, e23.l<? super Integer, Unit> lVar, e23.a<Unit> aVar, boolean z14, e23.l<? super com.garmin.android.apps.connectmobile.courses.model.g, Unit> lVar2) {
        c60.b bVar = new c60.b(vVar, aVar, 2);
        u40.b.f168543j.getClass();
        u40.b bVar2 = new u40.b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("COURSE_POINT", gVar);
        bundle.putBoolean("IS_EDITABLE", z14);
        bVar2.setArguments(bundle);
        bVar2.f168544h = bVar;
        if (z14) {
            bVar2.f168545i = new h(15, bVar, lVar2);
        }
        bVar2.f30950g = lVar;
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(vVar);
        aVar2.j(R.id.standard_bottom_sheet_layout, bVar2, "CoursePointDetailsBottomSheet", 1);
        aVar2.s(true, true);
    }

    public static final void l(com.garmin.android.apps.connectmobile.courses.model.g gVar, v vVar, e23.a aVar, e23.l lVar, r50.c cVar, r50.e eVar, e23.l lVar2, e23.a aVar2) {
        c60.a aVar3 = new c60.a(vVar, 1);
        aVar3.invoke();
        Fragment fragmentG = vVar.G("CoursePointBottomSheetFragment");
        l lVar3 = fragmentG instanceof l ? (l) fragmentG : null;
        if (lVar3 != null) {
            View view2 = lVar3.getView();
            if (view2 != null) {
                view2.setImportantForAccessibility(4);
            }
            lVar3.w6().setState(4);
        }
        p40.h0.a aVar4 = p40.h0.f135666q;
        Long coursePointId = gVar.getCoursePointId();
        String coursePointType = gVar.getCoursePointType();
        aVar4.getClass();
        p40.h0 h0Var = new p40.h0(false);
        Bundle bundle = new Bundle();
        if (coursePointId != null) {
            bundle.putLong("coursePoint", coursePointId.longValue());
        }
        if (coursePointType != null) {
            bundle.putString("coursePointType", coursePointType);
        }
        h0Var.setArguments(bundle);
        h0Var.f135675p = new a61.d(gVar, 27);
        h0Var.f135671l = new ak0.m(aVar3, vVar, aVar2);
        h0Var.f135673n = new h(13, aVar3, aVar);
        h0Var.f135672m = new e1(aVar3, cVar, eVar, gVar, lVar, 5);
        h0Var.f135674o = new h(14, gVar, lVar2);
        androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(vVar);
        aVar5.o(R.anim.slide_in_up, R.anim.exit_out_down, R.anim.slide_in_up, R.anim.exit_out_down);
        aVar5.j(R.id.standard_bottom_sheet_layout, h0Var, "EditCoursePointBottomSheetFrag", 1);
        aVar5.s(true, true);
    }

    public static final void m(v vVar, e23.l lVar) {
        u40.j.f168573h.getClass();
        u40.j jVarA = u40.j.a.a(null, false);
        jVarA.f168575g = lVar;
        jVarA.show(vVar, "");
    }

    public static final void n(i iVar, int i14, e23.l<? super i, Unit> lVar, v vVar) {
        iVar.getClass();
        e40.e.f62848m.getClass();
        e40.e eVar = new e40.e();
        Bundle bundle = new Bundle();
        bundle.putSerializable("courseType", iVar);
        bundle.putInt("flowType", i14);
        eVar.setArguments(bundle);
        eVar.f62849h = lVar;
        eVar.show(vVar, "");
    }

    public static final void o(com.garmin.android.apps.connectmobile.courses.model.g gVar, v vVar, o.b bVar) {
        gVar.getClass();
        o.f168590m.getClass();
        o oVar = new o();
        Bundle bundle = new Bundle();
        bundle.putParcelable("COURSE_POINT", gVar);
        oVar.setArguments(bundle);
        oVar.f168591h = bVar;
        oVar.show(vVar, "");
    }

    public static final void p(fn0.a aVar, v vVar, e23.a<Unit> aVar2, p<? super Integer, ? super Integer, Unit> pVar, e23.l<? super Integer, Unit> lVar) {
        h40.a.f81589i.getClass();
        h40.a aVar3 = new h40.a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HAZARD_DETAILS", aVar);
        aVar3.setArguments(bundle);
        aVar3.f81590h = new b(vVar, aVar2, pVar);
        aVar3.f30950g = lVar;
        androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(vVar);
        aVar4.j(R.id.standard_bottom_sheet_layout, aVar3, "HazardDetailsBottomSheet", 1);
        aVar4.s(true, true);
    }

    public static final void q(v vVar, List<GeoPointDTO> list, e23.a<Unit> aVar, e23.l<? super GeoPointDTO, Unit> lVar) {
        list.getClass();
        c60.a aVar2 = new c60.a(vVar, 4);
        bb0.d dVar = new bb0.d(21, aVar2, aVar);
        h hVar = new h(16, aVar2, lVar);
        r40.k.f150284l.getClass();
        r40.k kVar = new r40.k();
        kVar.f150285h = new c32.k(dVar, 3);
        kVar.f150287j = new ad.b(list, 3);
        kVar.f150286i = new b41.a(hVar, 16);
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(vVar);
        aVar3.j(R.id.standard_bottom_sheet_layout, kVar, "UpdateCoursePointMultipleSelectionFragment", 1);
        aVar3.s(true, true);
    }

    public static final void r(PointOfInterestDTO pointOfInterestDTO, List<com.garmin.android.library.mapsdkadapter.f> list, boolean z14, boolean z15, v vVar, e23.a<Unit> aVar, p<? super PointOfInterestDTO, ? super String, Unit> pVar, p<? super Integer, ? super Integer, Unit> pVar2, e23.l<? super Integer, Unit> lVar) {
        list.getClass();
        g.f157056i.getClass();
        g gVar = new g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("POI_DETAILS", pointOfInterestDTO);
        bundle.putParcelableArrayList("EXTRA_GEO_COURSE_POINTS", new ArrayList<>(list));
        bundle.putBoolean("EXTRA_SHOW_EXIT_LINK", z14);
        bundle.putBoolean("EXTRA_COURSE_EDIT_MODE", z15);
        gVar.setArguments(bundle);
        gVar.f157057h = new c(vVar, aVar, pVar, pVar2);
        gVar.f30950g = lVar;
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(vVar);
        aVar2.j(R.id.standard_bottom_sheet_layout, gVar, "POIDetailsBottomSheet", 1);
        aVar2.s(true, true);
    }

    public static final void s(boolean z14, v vVar, e23.l<? super Boolean, Unit> lVar) {
        e40.a.f62830l.getClass();
        e40.a aVar = new e40.a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isPublicCourse", z14);
        aVar.setArguments(bundle);
        aVar.f62831h = lVar;
        aVar.show(vVar, "");
    }

    public static final void t(v vVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3) {
        Fragment fragmentG = vVar.G("EditCoursePointBottomSheetFrag");
        p40.h0 h0Var = fragmentG instanceof p40.h0 ? (p40.h0) fragmentG : null;
        if (h0Var != null) {
            View view2 = h0Var.getView();
            if (view2 != null) {
                view2.setImportantForAccessibility(4);
            }
            h0Var.w6().setState(4);
        }
        c60.b bVar = new c60.b(vVar, aVar3, 1);
        r40.e.f150271k.getClass();
        r40.e eVar = new r40.e();
        eVar.f150272h = bVar;
        eVar.f150274j = new n(aVar, 25);
        eVar.f150273i = new bb0.d(20, bVar, aVar2);
        androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(vVar);
        aVar4.o(R.anim.slide_in_up, R.anim.exit_out_down, R.anim.slide_in_up, R.anim.exit_out_down);
        aVar4.j(R.id.standard_bottom_sheet_layout, eVar, "UpdateCoursePointLocationSheetFragment", 1);
        aVar4.s(true, true);
    }
}
