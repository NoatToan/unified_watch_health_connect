package com.garmin.android.apps.connectmobile.courses.presentation.custom;

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
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.chart.CourseFullscreenChartActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.library.mapsdkadapter.e;
import com.garmin.android.library.mapsdkadapter.f;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i3.fe;
import j40.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import k30.k;
import lc.u0;
import o13.m;
import o13.n;
import o53.f0;
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
import r53.b2;
import ro0.l;
import tr2.y;
import u20.g;
import vn2.t0;
import x40.l0;
import y40.h;
import y40.i;
import y40.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/custom/CreateCustomCourseActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Ly40/i$b;", "Lu20/g;", "Ly40/h$a;", "Lu40/g;", "Ll40/b;", "Lj40/d;", "<init>", "()V", "a", "La50/g;", RemoteConfigConstants.ResponseFieldKey.STATE, "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CreateCustomCourseActivity extends com.garmin.android.apps.connectmobile.c implements i.b, g, h.a, u40.g, l40.b, d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f33013f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f33016c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33014a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f33017d = m.a(n.NONE, new c(this, null, null, new x40.c(this, 4)));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Intent> f33018e = registerForActivityResult(new g.h(), new y(this, 11));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33019a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.POPULARITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.FOLLOW_ROADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.MIN_ASCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.FREE_FLOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f33019a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<l0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f33020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33023d;

        public c(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33020a = gVar;
            this.f33021b = qualifier;
            this.f33022c = aVar;
            this.f33023d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, x40.l0] */
        @Override // e23.a
        public final l0 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f33020a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f33022c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(l0.class), viewModelStore, null, defaultViewModelCreationExtras, this.f33021b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33023d, 4, null);
        }
    }

    public static void ca(CreateCustomCourseActivity createCustomCourseActivity, boolean z14) {
        if (z14) {
            super.onBackPressed();
        }
    }

    @Override // j40.d
    public final void A5(f fVar, int i14) {
        fVar.getClass();
        ha(new a50.c.l0(fVar, i14));
    }

    @Override // l40.b
    public final void F3(l40.a aVar) {
        fa().F3(aVar);
    }

    @Override // u20.g
    public final void H1(e eVar, int i14, List<? extends com.garmin.android.apps.connectmobile.courses.model.h> list) {
        list.getClass();
        ha(new a50.c.f0(eVar, i14, list));
    }

    @Override // u40.g
    public final void J4(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
        ha(new a50.c.u(gVar, geoPointDTO));
    }

    @Override // u20.g
    public final void K2(e eVar, com.garmin.android.apps.connectmobile.courses.model.c cVar, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2) {
        cVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        ha(new a50.c.d0(eVar, cVar, bVar, bVar2));
    }

    @Override // l40.b
    /* JADX INFO: renamed from: S2 */
    public final b2 getF150436o() {
        return fa().X;
    }

    @Override // y40.h.a
    public final void V3() {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.m(supportFragmentManager, new x40.d(this, 11));
    }

    @Override // u20.g
    public final void a5(PointOfInterestDTO pointOfInterestDTO) {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.c(supportFragmentManager);
        fa().F4();
        List<f> listEa = ea();
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        c60.e.r(pointOfInterestDTO, listEa, false, true, supportFragmentManager2, new wz1.c(4, this, pointOfInterestDTO), new x40.a(this, 5), new x40.a(this, 6), new x40.d(this, 12));
        l0 l0VarFa = fa();
        l0VarFa.getClass();
        l0VarFa.D4(new a50.e.v(pointOfInterestDTO));
    }

    @Override // y40.h.a
    public final void b1() {
        ha(a50.c.m.f1290a);
    }

    @Override // u20.g
    public final void c4(int i14, int i15, List list) {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.c(supportFragmentManager);
        fa().F4();
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        c60.e.g(list, i14, i15, supportFragmentManager2, new x40.a(this, 8), new x40.d(this, 16), new x40.d(this, 17));
        fa().H4(getResources().getDisplayMetrics().heightPixels / 2);
        l0 l0VarFa = fa();
        l0VarFa.getClass();
        l0VarFa.D4(new a50.e.q(i14));
    }

    @Override // y40.h.a
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

    @Override // y40.h.a
    public final void d0() {
        l0 l0VarFa = fa();
        l0VarFa.getClass();
        l0VarFa.D4(a50.e.n.f1358a);
    }

    public final com.garmin.android.apps.connectmobile.courses.model.e da() {
        w20.a aVar = ((a50.g) fa().I.f150540a.getValue()).f1393d;
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
        a50.b bVar = ((a50.g) fa().I.f150540a.getValue()).f1398i;
        bVar.getClass();
        if (bVar.f1247a && !bVar.f1248b && bVar.f1249c) {
            ha(a50.c.j.f1282a);
        }
        a50.g gVar = (a50.g) fa().I.f150540a.getValue();
        gVar.getClass();
        a50.b bVar2 = gVar.f1398i;
        if (bVar2.f1247a && gVar.f1407r && bVar2.f1250d) {
            ha(a50.c.k.f1284a);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final List<f> ea() {
        return ((a50.g) fa().I.f150540a.getValue()).d();
    }

    @Override // y40.i.b
    public final void f4(f fVar, Integer num) {
        ha(new a50.c.C0014c(fVar, num));
    }

    @Override // u40.g
    public final void f8(com.garmin.android.library.mapsdkadapter.i iVar) {
        ha(new a50.c.o0(iVar.getF118185r()));
        if (this.f33015b) {
            return;
        }
        j22.b bVar = j22.b.f96736a;
        j22.a aVar = j22.a.f96719h;
        bVar.getClass();
        if (!j22.b.k(aVar)) {
            j22.b.x(this, 2, aVar);
            return;
        }
        l0 l0VarFa = fa();
        l0VarFa.getClass();
        l0VarFa.D4(a50.e.C0015e.f1338a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final l0 fa() {
        return (l0) this.f33017d.getValue();
    }

    public final boolean ga() {
        com.garmin.android.apps.connectmobile.courses.model.i iVarM;
        s20.h hVar = (s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null);
        com.garmin.android.apps.connectmobile.courses.model.e eVarDa = da();
        return (eVarDa == null || (iVarM = eVarDa.m()) == null || !iVarM.c() || !hVar.a() || sa1.h.e(eVarDa.q())) ? false : true;
    }

    @Override // u40.g
    public final void h1(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        ArrayList arrayListK;
        ha(new a50.c.b(gVar));
        bv.b.f21239a.getClass();
        bv.b.a();
        if (k1.f37122a.s()) {
            com.garmin.android.apps.connectmobile.courses.model.e eVarDa = da();
            com.garmin.android.apps.connectmobile.courses.model.g gVar2 = (eVarDa == null || (arrayListK = eVarDa.k()) == null) ? null : (com.garmin.android.apps.connectmobile.courses.model.g) h0.n0(arrayListK);
            if (gVar2 != null) {
                ia(gVar2, true);
            }
        }
    }

    @Override // u20.g
    public final void h2(ArrayList arrayList, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        ha(new a50.c.c0(arrayList, bVar, bVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ha(a50.c cVar) {
        ArrayList parcelableArrayList;
        String str;
        ArrayList parcelableArrayList2;
        ArrayList parcelableArrayList3;
        if (s.g(cVar, a50.c.n.f1292a)) {
            onBackPressed();
            return;
        }
        boolean z14 = false;
        z = false;
        boolean z15 = false;
        z14 = false;
        int i14 = 1;
        if (cVar instanceof a50.c.b0) {
            int i15 = ((a50.c.b0) cVar).f1254a;
            if (getSupportFragmentManager().G("CreateCourseOnboarding") != null) {
                return;
            }
            o40.b.f129051d.getClass();
            o40.b bVarA = o40.b.a.a(true);
            bVarA.u6(i15);
            bVarA.f129052a = new x40.c(this, z14 ? 1 : 0);
            bVarA.f129053b = new x40.c(this, i14);
            bVarA.show(getSupportFragmentManager(), "CreateCourseOnboarding");
            return;
        }
        if (s.g(cVar, a50.c.s.f1302a)) {
            l0 l0VarFa = fa();
            l0VarFa.getClass();
            l0VarFa.D4(a50.e.k.f1351a);
            fa().F4();
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            c60.e.e(supportFragmentManager, new x40.d(this, 4), new x40.c(this, 7), new x40.c(this, 9));
            return;
        }
        int i16 = 3;
        int i17 = 2;
        if (cVar instanceof a50.c.r) {
            com.garmin.android.apps.connectmobile.courses.model.f fVar = ((a50.c.r) cVar).f1300a;
            l0 l0VarFa2 = fa();
            l0VarFa2.getClass();
            l0VarFa2.D4(new a50.e.j(fVar));
            fa().F4();
            v supportFragmentManager2 = getSupportFragmentManager();
            supportFragmentManager2.getClass();
            c60.e.e(supportFragmentManager2, new x40.d(this, i14), new x40.c(this, i16), new wz1.c(i17, this, fVar));
            return;
        }
        if (s.g(cVar, a50.c.p.f1296a)) {
            a50.a aVarE = ((a50.g) fa().I.f150540a.getValue()).e();
            long j8 = aVarE != null ? aVarE.f1243d : -1L;
            h.f194409c.getClass();
            h hVar = new h();
            Bundle bundle = new Bundle();
            bundle.putLong("currentRouteOption", j8);
            hVar.setArguments(bundle);
            hVar.show(getSupportFragmentManager(), hVar.getTag());
            return;
        }
        if (s.g(cVar, a50.c.o.f1294a)) {
            k kVar = ((a50.g) fa().I.f150540a.getValue()).f1397h;
            v40.d.a aVar = v40.d.f175552h;
            com.garmin.android.apps.connectmobile.courses.model.i f104023a = getF104023a();
            boolean z16 = ((a50.g) fa().I.f150540a.getValue()).f1401l;
            boolean z17 = ((a50.g) fa().I.f150540a.getValue()).f1402m;
            boolean z18 = ((a50.g) fa().I.f150540a.getValue()).f1403n;
            aVar.getClass();
            kVar.getClass();
            f104023a.getClass();
            v40.d dVar = new v40.d();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("routingType", kVar);
            bundle2.putSerializable("courseType", f104023a);
            bundle2.putBoolean("avoidHighTraffic", z16);
            bundle2.putBoolean("avoidClosedRoads", z17);
            bundle2.putBoolean("avoidUnpavedRoads", z18);
            dVar.setArguments(bundle2);
            dVar.f175553g = new x40.l(this);
            dVar.show(getSupportFragmentManager(), dVar.getTag());
            return;
        }
        String str2 = "";
        ArrayList parcelableArrayList4 = null;
        if (s.g(cVar, a50.c.a0.f1252a)) {
            if (!this.f33015b) {
                q.a aVar2 = q.f194465b;
                com.garmin.android.apps.connectmobile.courses.model.e eVarDa = da();
                if (eVarDa != null && (str = eVarDa.courseName) != null) {
                    str2 = str;
                }
                com.garmin.android.apps.connectmobile.courses.model.e eVarDa2 = da();
                boolean z19 = eVarDa2 != null && eVarDa2.e0();
                com.garmin.android.apps.connectmobile.courses.model.e eVarDa3 = da();
                if (eVarDa3 != null && !eVarDa3.Z()) {
                    z15 = true;
                }
                x40.g gVar = new x40.g(this);
                aVar2.getClass();
                Bundle bundle3 = new Bundle();
                bundle3.putString("EXTRA_COURSE_NAME", str2);
                bundle3.putBoolean("EXTRA_IS_COURSE_PUBLIC", z19);
                bundle3.putBoolean("EXTRA_CAN_COURSE_BE_PUBLIC", z15);
                q qVar = new q();
                qVar.setArguments(bundle3);
                qVar.f194466a = gVar;
                qVar.show(getSupportFragmentManager(), "SaveCustomCourseDialog");
                Unit unit = Unit.INSTANCE;
                return;
            }
            Bundle bundle4 = this.f33016c;
            if (bundle4 != null) {
                parcelableArrayList2 = Build.VERSION.SDK_INT >= 33 ? bundle4.getParcelableArrayList("EXTRA_RELATED_PACEBANDS", com.garmin.android.apps.connectmobile.pacepro.data.dto.b.class) : bundle4.getParcelableArrayList("EXTRA_RELATED_PACEBANDS");
            } else {
                parcelableArrayList2 = null;
            }
            if (parcelableArrayList2 != null && !parcelableArrayList2.isEmpty()) {
                Iterator it = parcelableArrayList2.iterator();
                while (it.hasNext()) {
                    if (((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) it.next()).f39778o) {
                        new androidx.appcompat.app.e.a(this).setTitle(R.string.pacepro_save_course_changes_title).setMessage(R.string.pacepro_save_course_changes_message).setNegativeButton(R.string.lbl_cancel, new vu1.k(14)).setPositiveButton(R.string.lbl_common_continue, new x40.b(this, i16)).show();
                        return;
                    }
                }
            }
            Bundle bundle5 = this.f33016c;
            if (bundle5 != null) {
                parcelableArrayList3 = Build.VERSION.SDK_INT >= 33 ? bundle5.getParcelableArrayList("EXTRA_RELATED_POWER_GUIDES", ab1.g.class) : bundle5.getParcelableArrayList("EXTRA_RELATED_POWER_GUIDES");
            } else {
                parcelableArrayList3 = null;
            }
            if (parcelableArrayList3 != null && !parcelableArrayList3.isEmpty()) {
                com.garmin.android.apps.connectmobile.courses.model.e eVarDa4 = da();
                if (sa1.h.e(eVarDa4 != null ? eVarDa4.q() : 0.0d)) {
                    androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(this).setTitle(R.string.pacepro_save_course_changes_title);
                    boolean zY = ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).y();
                    String string = getString(zY ? R.string.common_lbl_kilometers : R.string.common_lbl_miles);
                    string.getClass();
                    String string2 = getString(R.string.power_guide_save_course_confirmation, String.valueOf(zY ? 15 : 10), String.valueOf(zY ? 400 : 250), string);
                    string2.getClass();
                    title.setMessage(string2).setNegativeButton(R.string.lbl_cancel, new vu1.k(15)).setPositiveButton(R.string.lbl_save, new x40.b(this, z14 ? 1 : 0)).show();
                    return;
                }
            }
            Bundle bundle6 = this.f33016c;
            if ((bundle6 != null ? bundle6.getBoolean("GCM_extra_course_has_linked_shareable_events", false) : false) && ga()) {
                if ((((a50.g) fa().F.getValue()).f1396g.size() > 1 ? 1 : 0) != 0) {
                    new androidx.appcompat.app.e.a(this).setTitle(R.string.ti_edit_shared_course).setMessage(getString(R.string.ti_msg_edit_shared_course, getString(R.string.power_guide_title))).setNegativeButton(R.string.lbl_cancel, new vu1.k(12)).setPositiveButton(R.string.lbl_common_continue, new x40.b(this, i14)).show();
                    return;
                }
            }
            fa().G4(a50.c.a0.f1252a);
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        if (!(cVar instanceof a50.c.h)) {
            if (!(cVar instanceof a50.c.g)) {
                fa().G4(cVar);
                return;
            }
            n50.c cVar2 = ((a50.c.g) cVar).f1275a;
            if (!cVar2.equals(n50.c.a.f123740a)) {
                if (cVar2 instanceof n50.c.b) {
                    fa().G4(cVar);
                    return;
                } else {
                    u0.r();
                    return;
                }
            }
            com.garmin.android.apps.connectmobile.courses.model.e eVarDa5 = da();
            if (((a50.g) fa().F.getValue()).f1405p == null && eVarDa5 != null) {
                CourseFullscreenChartActivity.f33012a.getClass();
                CourseFullscreenChartActivity.a.a(this, eVarDa5);
                return;
            }
            return;
        }
        n50.f fVar2 = ((a50.c.h) cVar).f1277a;
        if (fVar2.equals(n50.f.a.f123747a)) {
            w20.a aVar3 = ((a50.g) fa().I.f150540a.getValue()).f1393d;
            List<ClimbDTO> list = aVar3 != null ? aVar3.f181477b : null;
            if (list == null || list.isEmpty()) {
                return;
            }
            v supportFragmentManager3 = getSupportFragmentManager();
            supportFragmentManager3.getClass();
            c60.e.c(supportFragmentManager3);
            fa().F4();
            v supportFragmentManager4 = getSupportFragmentManager();
            supportFragmentManager4.getClass();
            c60.e.i(list, supportFragmentManager4, new vv0.e(20, this, list), new x40.a(this, i14), new x40.d(this, z14 ? 1 : 0), new x40.c(this, i17));
            return;
        }
        if (fVar2.equals(n50.f.b.f123748a)) {
            com.garmin.android.apps.connectmobile.courses.model.e eVarDa6 = da();
            if (eVarDa6 == null) {
                return;
            }
            CoursePointListActivity.a aVar4 = CoursePointListActivity.f33079c;
            com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e(eVarDa6);
            aVar4.getClass();
            CoursePointListActivity.a.a(this, eVar, true, this.f33018e);
            return;
        }
        if (fVar2.equals(n50.f.c.f123749a)) {
            if (getF104023a() == com.garmin.android.apps.connectmobile.courses.model.i.OBSTACLE_COURSE_RACING) {
                new androidx.appcompat.app.e.a(this).setTitle(R.string.lbl_course_type_locked_title).setMessage(R.string.ocr_course_type_locked_message).setNeutralButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
                return;
            }
            Bundle bundle7 = this.f33016c;
            if (bundle7 != null) {
                parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle7.getParcelableArrayList("EXTRA_RELATED_PACEBANDS", com.garmin.android.apps.connectmobile.pacepro.data.dto.b.class) : bundle7.getParcelableArrayList("EXTRA_RELATED_PACEBANDS");
            } else {
                parcelableArrayList = null;
            }
            if ((parcelableArrayList == null || parcelableArrayList.isEmpty()) != true) {
                new androidx.appcompat.app.e.a(this).setTitle(R.string.lbl_course_type_locked_title).setMessage(R.string.lbl_course_type_locked_message).setNeutralButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
                return;
            }
            Bundle bundle8 = this.f33016c;
            if (bundle8 != null) {
                parcelableArrayList4 = Build.VERSION.SDK_INT >= 33 ? bundle8.getParcelableArrayList("EXTRA_RELATED_POWER_GUIDES", ab1.g.class) : bundle8.getParcelableArrayList("EXTRA_RELATED_POWER_GUIDES");
            }
            if (((parcelableArrayList4 == null || parcelableArrayList4.isEmpty()) ? 1 : 0) != 0) {
                com.garmin.android.apps.connectmobile.courses.model.e eVarDa7 = da();
                i14 = (eVarDa7 == null || !eVarDa7.G()) ? -1 : 2;
            }
            com.garmin.android.apps.connectmobile.courses.model.i f104023a2 = getF104023a();
            x40.d dVar2 = new x40.d(this, i17);
            v supportFragmentManager5 = getSupportFragmentManager();
            supportFragmentManager5.getClass();
            c60.e.n(f104023a2, i14, dVar2, supportFragmentManager5);
            Unit unit3 = Unit.INSTANCE;
            return;
        }
        if (fVar2.equals(n50.f.d.f123750a)) {
            com.garmin.android.apps.connectmobile.courses.model.e eVarDa8 = da();
            if (eVarDa8 != null && eVarDa8.e0()) {
                z14 = true;
            }
            v supportFragmentManager6 = getSupportFragmentManager();
            supportFragmentManager6.getClass();
            c60.e.s(z14, supportFragmentManager6, new x40.d(this, 18));
            return;
        }
        if (!fVar2.equals(n50.f.e.f123751a)) {
            fa().G4(cVar);
            return;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVarDa9 = da();
        Double dValueOf = eVarDa9 != null ? Double.valueOf(eVarDa9.q()) : null;
        if (!zf.b.D(dValueOf) || dValueOf.doubleValue() <= 0.0d) {
            return;
        }
        g40.d.a aVar5 = g40.d.f75763t;
        com.garmin.android.apps.connectmobile.courses.model.i iVarM = eVarDa9.m();
        x0 x0VarG = eVarDa9.g();
        Double dValueOf2 = Double.valueOf(eVarDa9.A());
        Double d14 = eVarDa9.elapsedSeconds;
        aVar5.getClass();
        g40.d dVarA = g40.d.a.a(iVarM, x0VarG, dValueOf2, d14, dValueOf);
        dVarA.f75764h = new x40.a(this, z14 ? 1 : 0);
        dVarA.show(getSupportFragmentManager(), "");
    }

    public final void ia(final com.garmin.android.apps.connectmobile.courses.model.g gVar, final boolean z14) {
        fa().F4();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        final int i14 = 0;
        final int i15 = 1;
        c60.e.l(gVar, supportFragmentManager, new e23.a(this) { // from class: x40.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateCustomCourseActivity f188676b;

            {
                this.f188676b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
                int i16 = i14;
                boolean z15 = z14;
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = gVar;
                CreateCustomCourseActivity createCustomCourseActivity = this.f188676b;
                switch (i16) {
                    case 0:
                        CreateCustomCourseActivity.a aVar = CreateCustomCourseActivity.f33013f;
                        l0 l0VarFa = createCustomCourseActivity.fa();
                        l0VarFa.getClass();
                        l0VarFa.D4(new a50.e.c0(gVar2));
                        createCustomCourseActivity.fa().A4();
                        if (z15) {
                            createCustomCourseActivity.ha(a50.c.g0.f1276a);
                        } else {
                            Long coursePointId = gVar2.getCoursePointId();
                            if (coursePointId != null) {
                                createCustomCourseActivity.ha(new a50.c.e(coursePointId.longValue()));
                            }
                        }
                        break;
                    default:
                        CreateCustomCourseActivity.a aVar2 = CreateCustomCourseActivity.f33013f;
                        l0 l0VarFa2 = createCustomCourseActivity.fa();
                        l0VarFa2.getClass();
                        l0VarFa2.D4(new a50.e.c0(gVar2));
                        createCustomCourseActivity.fa().A4();
                        com.garmin.android.apps.connectmobile.courses.model.e eVarDa = createCustomCourseActivity.da();
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
                            l0 l0VarFa3 = createCustomCourseActivity.fa();
                            l0VarFa3.getClass();
                            l0VarFa3.D4(new a50.e.x0(gVar3));
                        }
                        if (z15) {
                            createCustomCourseActivity.ha(a50.c.g0.f1276a);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new w52.a(this, gVar, z14, 2), null, null, new x40.d(this, 10), new e23.a(this) { // from class: x40.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateCustomCourseActivity f188676b;

            {
                this.f188676b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
                int i16 = i15;
                boolean z15 = z14;
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = gVar;
                CreateCustomCourseActivity createCustomCourseActivity = this.f188676b;
                switch (i16) {
                    case 0:
                        CreateCustomCourseActivity.a aVar = CreateCustomCourseActivity.f33013f;
                        l0 l0VarFa = createCustomCourseActivity.fa();
                        l0VarFa.getClass();
                        l0VarFa.D4(new a50.e.c0(gVar2));
                        createCustomCourseActivity.fa().A4();
                        if (z15) {
                            createCustomCourseActivity.ha(a50.c.g0.f1276a);
                        } else {
                            Long coursePointId = gVar2.getCoursePointId();
                            if (coursePointId != null) {
                                createCustomCourseActivity.ha(new a50.c.e(coursePointId.longValue()));
                            }
                        }
                        break;
                    default:
                        CreateCustomCourseActivity.a aVar2 = CreateCustomCourseActivity.f33013f;
                        l0 l0VarFa2 = createCustomCourseActivity.fa();
                        l0VarFa2.getClass();
                        l0VarFa2.D4(new a50.e.c0(gVar2));
                        createCustomCourseActivity.fa().A4();
                        com.garmin.android.apps.connectmobile.courses.model.e eVarDa = createCustomCourseActivity.da();
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
                            l0 l0VarFa3 = createCustomCourseActivity.fa();
                            l0VarFa3.getClass();
                            l0VarFa3.D4(new a50.e.x0(gVar3));
                        }
                        if (z15) {
                            createCustomCourseActivity.ha(a50.c.g0.f1276a);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        l0 l0VarFa = fa();
        l0VarFa.getClass();
        l0VarFa.D4(new a50.e.t(gVar));
    }

    @Override // u20.g
    /* JADX INFO: renamed from: j6 */
    public final com.garmin.android.apps.connectmobile.courses.model.i getF104023a() {
        com.garmin.android.apps.connectmobile.courses.model.i iVarM;
        com.garmin.android.apps.connectmobile.courses.model.e eVarDa = da();
        return (eVarDa == null || (iVarM = eVarDa.m()) == null) ? com.garmin.android.apps.connectmobile.courses.model.i.OTHER : iVarM;
    }

    public final void ja(fe feVar, String str, String str2) {
        ge1.b.T(f0.w(this), null, null, new x40.q(feVar, str, str2, null), 3);
    }

    @Override // u20.g
    public final void l8(fn0.a aVar) {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.c(supportFragmentManager);
        fa().F4();
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        c60.e.p(aVar, supportFragmentManager2, new wz1.c(5, this, aVar), new x40.a(this, 7), new x40.d(this, 13));
        l0 l0VarFa = fa();
        l0VarFa.getClass();
        l0VarFa.D4(new a50.e.u(aVar));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (!((a50.g) fa().I.f150540a.getValue()).f1407r || !((a50.g) fa().I.f150540a.getValue()).f1406q) {
            super.onBackPressed();
            return;
        }
        if (isFinishing()) {
            return;
        }
        String string = getString(R.string.msg_quit_without_save);
        string.getClass();
        q1.b bVar = q1.f41066b;
        t0 t0Var = new t0(this, 23);
        bVar.getClass();
        q1 q1VarA = q1.b.a(0, string, R.string.lbl_yes, R.string.lbl_cancel, t0Var);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarA.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundleA;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        boolean z14;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.course_details_content);
        if (bundle != null) {
            l2.f37135b.getClass();
            bundleA = l2.a.b().e(bundle);
        } else {
            l2.a aVar = l2.f37135b;
            Intent intent = getIntent();
            aVar.getClass();
            bundleA = l2.a.a(intent);
        }
        this.f33016c = bundleA;
        if (bundleA == null) {
            finish();
            return;
        }
        this.f33014a = bundleA.getBoolean("GCM_extra_course_navigate_up", true);
        Bundle bundle2 = this.f33016c;
        if (bundle2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle2.getParcelable("GCM_extra_course_detail", com.garmin.android.apps.connectmobile.courses.model.e.class);
            } else {
                Parcelable parcelable2 = bundle2.getParcelable("GCM_extra_course_detail");
                if (!(parcelable2 instanceof com.garmin.android.apps.connectmobile.courses.model.e)) {
                    parcelable2 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.courses.model.e) parcelable2;
            }
            eVar = (com.garmin.android.apps.connectmobile.courses.model.e) parcelable;
        } else {
            eVar = null;
        }
        if (g22.n.d(eVar != null ? eVar.courseId : null)) {
            z14 = true;
        } else {
            List<GeoPointDTO> list = eVar != null ? eVar.geoPoints : null;
            if (list == null || list.isEmpty()) {
                z14 = false;
            } else {
                z14 = true;
            }
        }
        this.f33015b = z14;
        View viewFindViewById = findViewById(R.id.course_details_layout);
        wr.g gVar = new wr.g(4);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById, gVar);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(1772627739, true, new x40.a(this, 2)));
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
        if (this.f33015b) {
            return;
        }
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            l0 l0VarFa = fa();
            l0VarFa.getClass();
            l0VarFa.D4(a50.e.C0015e.f1338a);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f33016c;
        if (bundle2 != null) {
            l2.f37135b.getClass();
            l2.a.b().d(bundle, bundle2);
        }
    }

    @Override // u20.g
    public final void p5(e eVar, List<? extends fn0.c> list) {
        list.getClass();
        ha(new a50.c.e0(eVar, list));
    }

    @Override // u20.g
    public final void q8() {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.b(supportFragmentManager);
    }

    @Override // y40.h.a
    public final void w7() {
        ha(a50.c.t.f1304a);
    }

    @Override // y40.h.a
    public final void x2() {
        ha(a50.c.y.f1315a);
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
            ia(gVar, false);
            return;
        }
        fa().F4();
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        c60.e.k(gVar, supportFragmentManager2, new x40.d(this, 14), new x40.f(this, gVar, 3), true, new x40.d(this, 15));
        l0 l0VarFa = fa();
        l0VarFa.getClass();
        l0VarFa.D4(new a50.e.t(gVar));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/custom/CreateCustomCourseActivity$a;", "", "<init>", "()V", "", "EXTRA_COURSE_IMPORTED", "Ljava/lang/String;", "EXTRA_RELATED_PACEBANDS", "EXTRA_RELATED_POWER_GUIDES", "", "REQUEST_CODE_PERM_LOCATION", "I", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, com.garmin.android.apps.connectmobile.courses.model.e eVar, List list, List list2, boolean z14, boolean z15, boolean z16) {
            context.getClass();
            com.garmin.android.apps.connectmobile.courses.model.e eVar2 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar);
            Intent intent = new Intent(context, (Class<?>) CreateCustomCourseActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("GCM_extra_course_detail", eVar2);
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
