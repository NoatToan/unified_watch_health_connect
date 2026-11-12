package x40;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import c22.g2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import i3.e5;
import i3.fe;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity$setupComposeContent$1$1$3$1", f = "CreateCustomCourseActivity.kt", l = {235}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f188698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateCustomCourseActivity f188699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe f188700c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CreateCustomCourseActivity f188701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f188702b;

        public a(CreateCustomCourseActivity createCustomCourseActivity, fe feVar) {
            this.f188701a = createCustomCourseActivity;
            this.f188702b = feVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            com.garmin.android.apps.connectmobile.courses.model.e eVar;
            Address address;
            String locality;
            int i14;
            int i15;
            a50.e eVar2 = (a50.e) obj;
            CreateCustomCourseActivity.a aVar = CreateCustomCourseActivity.f33013f;
            CreateCustomCourseActivity createCustomCourseActivity = this.f188701a;
            createCustomCourseActivity.getClass();
            if (p005kotlin.jvm.internal.s.g(eVar2, a50.e.m0.f1357a)) {
                createCustomCourseActivity.displayFailedMessage();
            } else if (eVar2 instanceof a50.e.s0) {
                int i16 = CreateCustomCourseActivity.b.f33019a[((a50.e.s0) eVar2).f1370a.ordinal()];
                if (i16 == 1) {
                    i14 = R.string.title_no_popularity_data;
                    i15 = R.string.msg_no_popularity_data;
                } else if (i16 == 2 || i16 == 3 || i16 == 4) {
                    i14 = R.string.title_no_road_data;
                    i15 = R.string.msg_no_road_data;
                } else {
                    i14 = R.string.lbl_course_not_available;
                    i15 = R.string.msg_course_route_fail;
                }
                u20.e.u6(i14, i15).g(createCustomCourseActivity.getSupportFragmentManager());
            } else {
                boolean z14 = eVar2 instanceof a50.e.q0;
                fe feVar = this.f188702b;
                if (z14) {
                    String string = createCustomCourseActivity.getString(R.string.out_and_back_course_disclaimer);
                    string.getClass();
                    createCustomCourseActivity.ja(feVar, string, createCustomCourseActivity.getString(R.string.lbl_close));
                } else if (eVar2 instanceof a50.e.w0) {
                    s20.l.f156021a.getClass();
                    if (s20.l.a().f156020a.W2("KeyCleanCourseCorrectionWarning", true)) {
                        c22.x0.f23314a.getClass();
                        String str = c22.x0.f23430gd;
                        str.getClass();
                        createCustomCourseActivity.ja(feVar, g2.f(str), createCustomCourseActivity.getString(R.string.lbl_close));
                        s20.l.a().f156020a.O2("KeyCleanCourseCorrectionWarning", false);
                    }
                } else if (eVar2 instanceof a50.e.v0) {
                    c22.x0.f23314a.getClass();
                    String str2 = c22.x0.f23396ed;
                    str2.getClass();
                    createCustomCourseActivity.ja(feVar, g2.f(str2), createCustomCourseActivity.getString(R.string.lbl_close));
                } else if (eVar2 instanceof a50.e.j0) {
                    a50.e.j0 j0Var = (a50.e.j0) eVar2;
                    com.garmin.android.library.mapsdkadapter.f fVar = j0Var.f1349a;
                    Integer num = j0Var.f1350b;
                    createCustomCourseActivity.fa().F4();
                    y40.c.f194395c.getClass();
                    y40.c cVar = new y40.c();
                    cVar.f194396a = new k(createCustomCourseActivity, fVar, num);
                    cVar.f194397b = new c(createCustomCourseActivity, 5);
                    cVar.show(createCustomCourseActivity.getSupportFragmentManager(), cVar.getTag());
                } else if (eVar2 instanceof a50.e.l0) {
                    a50.e.l0 l0Var = (a50.e.l0) eVar2;
                    List<com.garmin.android.library.mapsdkadapter.f> list = l0Var.f1354a;
                    List<String> list2 = l0Var.f1355b;
                    if (!list.isEmpty() && list.size() == list2.size()) {
                        createCustomCourseActivity.fa().F4();
                        l0 l0VarFa = createCustomCourseActivity.fa();
                        l0VarFa.getClass();
                        l0VarFa.D4(new a50.e.i0(false));
                        createCustomCourseActivity.fa().H4(createCustomCourseActivity.getResources().getDisplayMetrics().heightPixels / 2);
                        l0 l0VarFa2 = createCustomCourseActivity.fa();
                        l0VarFa2.getClass();
                        l0VarFa2.D4(a50.e.d.f1336a);
                        androidx.fragment.app.v supportFragmentManager = createCustomCourseActivity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        n nVar = new n(createCustomCourseActivity);
                        d dVar2 = new d(createCustomCourseActivity, 8);
                        c cVar2 = new c(createCustomCourseActivity, 6);
                        z40.b.f202315r.getClass();
                        z40.b bVar = new z40.b();
                        bVar.f202317l = nVar;
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("EXTRA_COURSE_POINTS", new ArrayList<>(list));
                        bundle.putStringArrayList("EXTRA_WAYPOINT_NAMES", new ArrayList<>(list2));
                        bVar.setArguments(bundle);
                        bVar.f30950g = dVar2;
                        bVar.f47369h = new bb0.d(19, supportFragmentManager, cVar2);
                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                        aVar2.j(R.id.standard_bottom_sheet_layout, bVar, "EditWayPointsBottomSheetFragment", 1);
                        aVar2.s(true, true);
                    }
                } else if (eVar2 instanceof a50.e.u0) {
                    List<ClimbDTO> list3 = ((a50.e.u0) eVar2).f1374a;
                    if (list3 != null && !list3.isEmpty()) {
                        androidx.fragment.app.v supportFragmentManager2 = createCustomCourseActivity.getSupportFragmentManager();
                        supportFragmentManager2.getClass();
                        c60.e.c(supportFragmentManager2);
                        createCustomCourseActivity.fa().F4();
                        if (list3.size() == 1) {
                            ClimbDTO climbDTO = (ClimbDTO) p13.h0.b0(list3);
                            Long gmapClimbId = climbDTO.getGmapClimbId();
                            List<com.garmin.android.library.mapsdkadapter.f> listEa = createCustomCourseActivity.ea();
                            androidx.fragment.app.v supportFragmentManager3 = createCustomCourseActivity.getSupportFragmentManager();
                            supportFragmentManager3.getClass();
                            c60.e.f(list3, -1, -1, listEa, true, false, true, supportFragmentManager3, new d(createCustomCourseActivity, 6), new o(createCustomCourseActivity), null, new w02.b(26, createCustomCourseActivity, gmapClimbId));
                            createCustomCourseActivity.fa().H4(createCustomCourseActivity.getResources().getDisplayMetrics().heightPixels / 2);
                            l0 l0VarFa3 = createCustomCourseActivity.fa();
                            l0VarFa3.getClass();
                            l0VarFa3.D4(new a50.e.w(climbDTO));
                        } else {
                            List<com.garmin.android.library.mapsdkadapter.f> listEa2 = createCustomCourseActivity.ea();
                            androidx.fragment.app.v supportFragmentManager4 = createCustomCourseActivity.getSupportFragmentManager();
                            supportFragmentManager4.getClass();
                            c60.e.h(list3, listEa2, true, supportFragmentManager4, new d(createCustomCourseActivity, 7), new p(list3, createCustomCourseActivity), new wz1.c(3, createCustomCourseActivity, list3));
                            createCustomCourseActivity.fa().H4(createCustomCourseActivity.getResources().getDisplayMetrics().heightPixels / 2);
                            l0 l0VarFa4 = createCustomCourseActivity.fa();
                            l0VarFa4.getClass();
                            l0VarFa4.D4(new a50.e.s(list3));
                        }
                    }
                } else {
                    List<GeoPointDTO> list4 = null;
                    String string2 = null;
                    list4 = null;
                    if (eVar2 instanceof a50.e.t0) {
                        com.garmin.android.apps.connectmobile.courses.model.e eVar3 = ((a50.e.t0) eVar2).f1372a;
                        if (!createCustomCourseActivity.isFinishing()) {
                            View viewFindViewById = createCustomCourseActivity.findViewById(R.id.fullscreen_content_overlay);
                            viewFindViewById.getClass();
                            ((FrameLayout) viewFindViewById).setVisibility(0);
                            z30.b.f202126f.getClass();
                            z30.b bVarA = z30.b.a.a();
                            androidx.fragment.app.v supportFragmentManager5 = createCustomCourseActivity.getSupportFragmentManager();
                            supportFragmentManager5.getClass();
                            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager5);
                            aVar3.l(R.id.fullscreen_content_overlay, bVarA, null);
                            aVar3.s(true, true);
                            bVarA.f202127a = new w02.b(27, createCustomCourseActivity, eVar3);
                        }
                    } else if (eVar2 instanceof a50.e.z0) {
                        com.garmin.android.apps.connectmobile.courses.model.e eVarDa = createCustomCourseActivity.da();
                        if (eVarDa != null) {
                            f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
                            GeoPointDTO geoPointDTOD = eVarDa.D();
                            String str3 = "";
                            if (geoPointDTOD != null) {
                                s20.e eVar4 = s20.e.f156007a;
                                Double d14 = geoPointDTOD.latitude;
                                double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                                Double d15 = geoPointDTOD.longitude;
                                double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
                                eVar4.getClass();
                                try {
                                    List<Address> fromLocation = new Geocoder(createCustomCourseActivity, Locale.getDefault()).getFromLocation(dDoubleValue, dDoubleValue2, 1);
                                    List listB1 = fromLocation != null ? p13.h0.b1(fromLocation) : null;
                                    if (listB1 != null && !listB1.isEmpty() && (address = (Address) listB1.get(0)) != null && (locality = address.getLocality()) != null) {
                                        str3 = locality;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            s20.e eVar5 = s20.e.f156007a;
                            double dQ = eVarDa.q();
                            boolean zY = lVar.y();
                            eVar5.getClass();
                            String strC = s20.e.c(dQ, createCustomCourseActivity, zY);
                            String string3 = createCustomCourseActivity.getString(eVarDa.m().f32980b);
                            string3.getClass();
                            String string4 = DateTime.now().toString("MMM dd");
                            StringBuilder sbL = e5.l(str3, StringUtils.SPACE, string3, StringUtils.SPACE, strC);
                            sbL.append(" - ");
                            sbL.append(string4);
                            string2 = d53.w.i0(sbL.toString()).toString();
                        }
                        createCustomCourseActivity.ha(new a50.c.n0(string2));
                    } else if (eVar2 instanceof a50.e.y0) {
                        com.garmin.android.apps.connectmobile.courses.model.g gVar = ((a50.e.y0) eVar2).f1382a;
                        l0 l0VarFa5 = createCustomCourseActivity.fa();
                        l0VarFa5.getClass();
                        l0VarFa5.D4(new a50.e.x0(gVar));
                        l0 l0VarFa6 = createCustomCourseActivity.fa();
                        l0VarFa6.getClass();
                        l0VarFa6.D4(new a50.e.t(gVar));
                        createCustomCourseActivity.ia(gVar, false);
                    } else if (eVar2 instanceof a50.e.c) {
                        a50.e.c cVar3 = (a50.e.c) eVar2;
                        com.garmin.android.apps.connectmobile.courses.model.f fVar2 = cVar3.f1333a;
                        com.garmin.android.library.mapsdkadapter.f fVar3 = cVar3.f1334b;
                        l0 l0VarFa7 = createCustomCourseActivity.fa();
                        t21.v0 v0Var = new t21.v0(createCustomCourseActivity, 23);
                        d dVar3 = new d(createCustomCourseActivity, 9);
                        l0VarFa7.getClass();
                        w20.a aVar4 = ((a50.g) l0VarFa7.F.getValue()).f1393d;
                        if (aVar4 != null && (eVar = aVar4.f181476a) != null) {
                            list4 = eVar.geoPoints;
                        }
                        l0VarFa7.D4(new a50.e.b(list4, fVar2, fVar3, v0Var, dVar3));
                    } else if (eVar2 instanceof a50.e.p0) {
                        a50.e.p0 p0Var = (a50.e.p0) eVar2;
                        List<GeoPointDTO> list5 = p0Var.f1363a;
                        com.garmin.android.apps.connectmobile.courses.model.g gVar2 = p0Var.f1364b;
                        l0 l0VarFa8 = createCustomCourseActivity.fa();
                        l0VarFa8.getClass();
                        l0VarFa8.D4(new a50.e.i0(false));
                        androidx.fragment.app.v supportFragmentManager6 = createCustomCourseActivity.getSupportFragmentManager();
                        supportFragmentManager6.getClass();
                        c60.e.q(supportFragmentManager6, list5, new x1.b(2), new w02.b(28, createCustomCourseActivity, gVar2));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CreateCustomCourseActivity createCustomCourseActivity, fe feVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f188699b = createCustomCourseActivity;
        this.f188700c = feVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f188699b, this.f188700c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to x40.j for r6v1 'this'  t13.d
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r6.f188698a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r7)
            return r2
        L10:
            o13.r.b(r7)
            goto L33
        L14:
            o13.r.b(r7)
            com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity$a r7 = com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity.f33013f
            com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity r7 = r6.f188699b
            x40.l0 r1 = r7.fa()
            r53.a2 r1 = r1.T
            x40.j$a r4 = new x40.j$a
            i3.fe r5 = r6.f188700c
            r4.<init>(r7, r5)
            r6.f188698a = r3
            r53.d2<T> r7 = r1.f150526a
            java.lang.Object r7 = r7.collect(r4, r6)
            if (r7 != r0) goto L33
            return r0
        L33:
            o2.c.f()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x40.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
