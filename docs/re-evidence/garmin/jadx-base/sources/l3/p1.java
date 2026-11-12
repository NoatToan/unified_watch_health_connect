package l3;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2WebVerificationFragment;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2WebVerificationFragment.b;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayOnlineVerificationFragment;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayOnlineVerificationFragment.a;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.common.base.Optional;
import com.google.maps.android.compose.CameraPositionState;
import i3.wg;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f109383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f109384c;

    public /* synthetic */ p1(int i14, Object obj, Object obj2) {
        this.f109382a = i14;
        this.f109384c = obj;
        this.f109383b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v138, types: [T, com.google.maps.android.compose.CameraPositionState, java.lang.Object] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        String strA;
        lc.h0 h0VarC;
        String str;
        int i14 = this.f109382a;
        int i15 = 3;
        boolean z14 = false;
        z14 = false;
        int i16 = 2;
        int i17 = 1;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj3 = this.f109383b;
        Object obj4 = this.f109384c;
        switch (i14) {
            case 0:
                o4.c1.a((q4.f) obj, (o4.b1) obj4, ((wg.c) obj3).a());
                return Unit.INSTANCE;
            case 1:
                l4.f fVar = (l4.f) obj;
                return fVar.e(new l4.e(new p1(z14 ? 1 : 0, ((o4.r1) obj4).a(fVar.f109845a.b(), fVar.f109845a.getLayoutDirection(), fVar), (wg.c) obj3)));
            case 2:
                GeoPointDTO geoPointDTO = (GeoPointDTO) obj;
                CreateCourseActivity.a aVar = CreateCourseActivity.f32989g;
                geoPointDTO.getClass();
                ((CreateCourseActivity) obj4).fa(new n30.a.u((com.garmin.android.apps.connectmobile.courses.model.g) obj3, geoPointDTO));
                return Unit.INSTANCE;
            case 3:
                CreateCourseActivity createCourseActivity = (CreateCourseActivity) obj4;
                ((Integer) obj).getClass();
                CreateCourseActivity.a aVar2 = CreateCourseActivity.f32989g;
                CourseDetailsActivity.a aVar3 = CourseDetailsActivity.f33024k;
                boolean z15 = createCourseActivity.f32990a;
                aVar3.getClass();
                CourseDetailsActivity.a.c(createCourseActivity, (com.garmin.android.apps.connectmobile.courses.model.e) obj3, z15);
                createCourseActivity.finish();
                return Unit.INSTANCE;
            case 4:
                CreateCourseActivity createCourseActivity2 = (CreateCourseActivity) obj4;
                ((Integer) obj).getClass();
                CreateCourseActivity.a aVar4 = CreateCourseActivity.f32989g;
                l30.z zVarEa = createCourseActivity2.ea();
                zVarEa.getClass();
                zVarEa.z4(new n30.c.c0((Long) obj3));
                createCourseActivity2.ea().x4();
                return Unit.INSTANCE;
            case 5:
                CreateCourseActivity createCourseActivity3 = (CreateCourseActivity) obj3;
                ClimbDTO climbDTO = (ClimbDTO) p13.h0.e0(((Integer) obj).intValue(), (List) obj4);
                if (climbDTO != null) {
                    CreateCourseActivity.a aVar5 = CreateCourseActivity.f32989g;
                    l30.z zVarEa2 = createCourseActivity3.ea();
                    zVarEa2.getClass();
                    zVarEa2.z4(new n30.c.x(climbDTO));
                }
                return Unit.INSTANCE;
            case 6:
                MultipleCoursesActivity multipleCoursesActivity = (MultipleCoursesActivity) obj4;
                ((Integer) obj).getClass();
                MultipleCoursesActivity.a aVar6 = MultipleCoursesActivity.f33000c;
                l30.a1 a1VarDa = multipleCoursesActivity.da();
                a1VarDa.getClass();
                a1VarDa.x4(new n30.j.s((Long) obj3));
                l30.a1 a1VarDa2 = multipleCoursesActivity.da();
                a1VarDa2.getClass();
                a1VarDa2.x4(n30.j.b.f123497a);
                return Unit.INSTANCE;
            case 7:
                MultipleCoursesActivity multipleCoursesActivity2 = (MultipleCoursesActivity) obj3;
                ClimbDTO climbDTO2 = (ClimbDTO) p13.h0.e0(((Integer) obj).intValue(), (List) obj4);
                if (climbDTO2 != null) {
                    MultipleCoursesActivity.a aVar7 = MultipleCoursesActivity.f33000c;
                    l30.a1 a1VarDa3 = multipleCoursesActivity2.da();
                    a1VarDa3.getClass();
                    a1VarDa3.x4(new n30.j.o(climbDTO2));
                }
                return Unit.INSTANCE;
            case 8:
                lc.y yVar = (lc.y) obj4;
                l51.j jVar = (l51.j) obj3;
                lc.k0 k0Var = (lc.k0) obj;
                k0Var.getClass();
                Map mapB = p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.b(u41.a.class), new l51.i(n63.b.f123892d)));
                lc.f0 f0Var = new lc.f0();
                f0Var.f111765d = "connect://viewPacePro";
                f0Var.f111766e = "android.intent.action.VIEW";
                Unit unit = Unit.INSTANCE;
                lc.d0.a aVar8 = f0Var.f111762a;
                aVar8.getClass();
                aVar8.f111748a = "connect://viewPacePro";
                String str2 = f0Var.f111766e;
                if (str2 != null) {
                    aVar8.b(str2);
                }
                List listC = p13.w.c(aVar8.a());
                z3.e eVar = new z3.e(-452276081, true, new ao1.f(26, yVar, jVar));
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var, t0Var.b(n51.b.C2324b.class), mapB, listC, null, null, null, null, eVar);
                z3.e eVar2 = new z3.e(2008340536, true, new l51.e(yVar, z14 ? 1 : 0));
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                p13.j0 j0Var = p13.j0.f134944a;
                nc.n.a(k0Var, t0Var.b(n51.b.i.class), k0Var2, j0Var, null, null, null, null, eVar2);
                nc.n.a(k0Var, t0Var.b(n51.b.d.class), k0Var2, j0Var, null, null, null, null, new z3.e(628555223, true, new l51.e(yVar, i17)));
                nc.n.a(k0Var, t0Var.b(n51.b.e.class), k0Var2, j0Var, null, null, null, null, new z3.e(-751230090, true, new l51.e(yVar, i16)));
                nc.n.a(k0Var, t0Var.b(n51.b.c.class), k0Var2, j0Var, null, null, null, null, new z3.e(-2131015403, true, new l51.e(yVar, i15)));
                return Unit.INSTANCE;
            case 9:
                lc.m0 m0Var = (lc.m0) obj4;
                long jLongValue = ((Long) obj).longValue();
                for (Object obj5 : (Iterable) ((p51.c) obj3).f136157f.getValue()) {
                    Long l14 = ((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj5).f39764a;
                    if (l14 != null && l14.longValue() == jLongValue) {
                        obj2 = obj5;
                        lc.y.l(m0Var, new n51.b.C2324b(new u41.a((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj2, (String) null, (Double) null, (Long) null, (t41.a) null, (Boolean) null, (String) null, (Boolean) null, false, false, 1022, (p005kotlin.jvm.internal.j) null)));
                        return Unit.INSTANCE;
                    }
                }
                lc.y.l(m0Var, new n51.b.C2324b(new u41.a((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj2, (String) null, (Double) null, (Long) null, (t41.a) null, (Boolean) null, (String) null, (Boolean) null, false, false, 1022, (p005kotlin.jvm.internal.j) null)));
                return Unit.INSTANCE;
            case 10:
                b92.a aVar9 = (b92.a) obj4;
                s5.c cVar = (s5.c) obj3;
                p5.k0 k0Var3 = (p5.k0) obj;
                l72.s sVar = l72.s.f111232a;
                k0Var3.getClass();
                if (aVar9 == null || (strA = aVar9.a(TtmlNode.TAG_BODY)) == null) {
                    strA = cVar.f157138b;
                }
                p5.h0.n(k0Var3, strA);
                return Unit.INSTANCE;
            case 11:
                lc.h0 h0Var = (lc.h0) obj4;
                qc.h hVar = ((lc.y) obj3).f111904b;
                lc.p0 p0Var = (lc.p0) obj;
                boolean z16 = lc.y.f111902i;
                p0Var.getClass();
                new lc.c();
                Unit unit2 = Unit.INSTANCE;
                lc.o0.a aVar10 = p0Var.f111828a;
                aVar10.f111824i = 0;
                aVar10.f111825j = 0;
                aVar10.f111826k = -1;
                aVar10.f111827l = -1;
                if (h0Var instanceof lc.j0) {
                    lc.h0.f111771f.getClass();
                    for (lc.h0 h0Var2 : lc.h0.a.b(h0Var)) {
                        lc.h0 h0VarJ = hVar.j();
                        if (p005kotlin.jvm.internal.s.g(h0Var2, h0VarJ != null ? h0VarJ.f111774c : null)) {
                        }
                    }
                    if (lc.y.f111902i) {
                        lc.j0.a aVar11 = lc.j0.f111790h;
                        lc.j0 j0VarK = hVar.k();
                        aVar11.getClass();
                        lc.y0 y0VarI = kg.f.i(p0Var, lc.j0.a.a(j0VarK).f111773b.f144346e);
                        y0VarI.f111915b = true;
                        Unit unit3 = Unit.INSTANCE;
                        p0Var.f111833f = y0VarI.f111914a;
                        p0Var.f111834g = true;
                    }
                }
                return Unit.INSTANCE;
            case 12:
                lc.v0 v0Var = (lc.v0) obj4;
                lc.o0 o0Var = (lc.o0) obj3;
                lc.v vVar = (lc.v) obj;
                vVar.getClass();
                qc.d dVar = vVar.f111888h;
                lc.h0 h0Var3 = vVar.f111882b;
                if (h0Var3 == null) {
                    h0Var3 = null;
                }
                if (h0Var3 == null || (h0VarC = v0Var.c(h0Var3, dVar.a(), o0Var)) == null) {
                    return null;
                }
                return h0VarC.equals(h0Var3) ? vVar : v0Var.b().a(h0VarC, h0VarC.b(dVar.a()));
            case 13:
                ld.b.C2149b c2149b = (ld.b.C2149b) obj4;
                e23.l lVar = (e23.l) obj3;
                vd.c cVar2 = (vd.c) obj;
                int i18 = ld.b.C2149b.f112008h;
                cVar2.getClass();
                vd.g gVarC1 = cVar2.C1(c2149b.f112009a);
                int length = c2149b.f112011c.length;
                for (int i19 = 1; i19 < length; i19++) {
                    int i24 = c2149b.f112011c[i19];
                    if (i24 == 1) {
                        gVarC1.h(i19, c2149b.f112012d[i19]);
                    } else if (i24 == 2) {
                        gVarC1.m(c2149b.f112013e[i19], i19);
                    } else if (i24 == 3) {
                        String str3 = c2149b.f112014f[i19];
                        str3.getClass();
                        gVarC1.r(i19, str3);
                    } else if (i24 == 4) {
                        byte[] bArr = c2149b.f112015g[i19];
                        bArr.getClass();
                        gVarC1.t(i19, bArr);
                    } else if (i24 == 5) {
                        gVarC1.u(i19);
                    }
                }
                return lVar.invoke(gVarC1);
            case 14:
                nj2.a aVar12 = (nj2.a) obj3;
                String str4 = (String) obj;
                ((p3.p1) obj4).setValue(Boolean.TRUE);
                if (str4 != null) {
                    aVar12.O4(nj2.a.b.PHONE_REGION, str4);
                }
                return Unit.INSTANCE;
            case 15:
                Activity activity = (Activity) obj4;
                c.q qVar = (c.q) obj3;
                Uri uri = (Uri) obj;
                if (activity != null && uri != null) {
                    qVar.a(((jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null)).b(activity, uri, null, 0.0f), null);
                }
                return Unit.INSTANCE;
            case 16:
                Context context = (Context) obj4;
                km1.c cVar3 = (km1.c) obj3;
                View view2 = (View) obj;
                if (view2 instanceof CustomBarChart) {
                    BarLineChartBase barLineChartBase = (BarLineChartBase) view2;
                    rz.a aVar13 = new rz.a((CustomBarChart) view2, new dm1.a(context), new dm1.b(barLineChartBase, (BarDataProvider) view2), new gt.e(barLineChartBase, objArr2 == true ? 1 : 0, i16, objArr == true ? 1 : 0), new gt.f((Chart) view2), null, 32, null);
                    tm1.a.f165439a.getClass();
                    qz.a.b(aVar13, tm1.a.C3110a.a(cVar3), null, 6);
                }
                return Unit.INSTANCE;
            case 17:
                lo.t tVar = (lo.t) obj4;
                tVar.f113949a.e1(false, (String) obj3, ((Double) obj).doubleValue());
                tVar.w6();
                return Unit.INSTANCE;
            case 18:
                ((CustomLineChart) obj).getClass();
                qz.a.b((tz.a) obj4, (ArrayList) obj3, null, 6);
                return Unit.INSTANCE;
            case 19:
                FitPayApp2WebVerificationFragment fitPayApp2WebVerificationFragment = (FitPayApp2WebVerificationFragment) obj4;
                View view3 = (View) obj3;
                if (((Boolean) obj).booleanValue()) {
                    fitPayApp2WebVerificationFragment.w6().debug("onViewCreated: viewModel is initialized");
                    ge1.b.T(o53.f0.w(fitPayApp2WebVerificationFragment), o53.s0.f129406a, null, fitPayApp2WebVerificationFragment.new b(view3, null), 2);
                } else {
                    com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar = fitPayApp2WebVerificationFragment.f51495e;
                    if (bVar == null) {
                        p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                    bVar.P0(FitPayCardVerificationActivity.a.g.f51462a);
                }
                return Unit.INSTANCE;
            case 20:
                FitPayOnlineVerificationFragment fitPayOnlineVerificationFragment = (FitPayOnlineVerificationFragment) obj4;
                View view4 = (View) obj3;
                if (((Boolean) obj).booleanValue()) {
                    fitPayOnlineVerificationFragment.w6().debug("onViewCreated: viewModel is initialized");
                    ge1.b.T(o53.f0.w(fitPayOnlineVerificationFragment), o53.s0.f129406a, null, fitPayOnlineVerificationFragment.new a(view4, null), 2);
                } else {
                    com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar2 = fitPayOnlineVerificationFragment.f51531d;
                    if (bVar2 == null) {
                        p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                    bVar2.P0(FitPayCardVerificationActivity.a.g.f51462a);
                }
                return Unit.INSTANCE;
            case 21:
                lq2.e eVar3 = (lq2.e) obj4;
                int i25 = lq2.e.f114359e;
                ((Optional) obj).getClass();
                kq2.a aVar14 = eVar3.f114360a;
                int i26 = lq2.e.b.f114363a[((is2.b) obj3).ordinal()];
                if (i26 == 1) {
                    str = "easycard";
                } else {
                    if (i26 != 2) {
                        vb.h.s("Not supported card type");
                        return null;
                    }
                    str = "ipass";
                }
                q03.r<c83.a0<jq2.c>> rVarB = aVar14.b(str);
                lp2.h hVar2 = new lp2.h(new kp2.a(eVar3, 12), 7);
                rVarB.getClass();
                int i27 = w03.b.f181178a;
                return new e13.o(rVarB, hVar2);
            case 22:
                com.garmin.android.library.mapsdkadapter.l lVar2 = (com.garmin.android.library.mapsdkadapter.l) obj3;
                com.garmin.android.library.mapsdkadapter.l lVar3 = (com.garmin.android.library.mapsdkadapter.l) obj;
                lVar3.getClass();
                if (p005kotlin.jvm.internal.s.g(lVar3.getTag(), ((com.garmin.android.library.mapsdkadapter.l) obj4).getTag()) && lVar3.getZIndex() == lVar2.getZIndex()) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 23:
                ry0.d dVar2 = (ry0.d) obj4;
                ly0.s sVar2 = (ly0.s) obj3;
                if (((Boolean) obj).booleanValue() && !dVar2.f155068b) {
                    ly0.q.c(sVar2, dVar2.f155067a);
                    dVar2.f155068b = true;
                }
                return Unit.INSTANCE;
            case 24:
                com.garmin.android.library.mapsdkadapter.i.d dVar3 = (com.garmin.android.library.mapsdkadapter.i.d) obj;
                m40.g.a aVar15 = m40.g.f116591h;
                dVar3.getClass();
                ((p3.p1) obj3).setValue(dVar3);
                j40.c.C1850c c1850c = ((m40.g) obj4).f116592g;
                if (c1850c != null) {
                    c1850c.b(dVar3);
                }
                return Unit.INSTANCE;
            case 25:
                k63.a aVar16 = (k63.a) obj;
                aVar16.getClass();
                k63.a.b(aVar16, Action.KEY_ATTRIBUTE, ((i63.c) obj4).getF158591b());
                k63.a.b(aVar16, "value", ((i63.c) obj3).getF158591b());
                return Unit.INSTANCE;
            case 26:
                x72.o oVar = (x72.o) obj4;
                x72.e eVar4 = (x72.e) obj;
                int i28 = PreviewCatalogActivity.f49781a;
                eVar4.getClass();
                ((p3.p1) obj3).setValue(eVar4);
                oVar.getClass();
                oVar.a().edit().putInt("themeMode", eVar4.f189449a.ordinal()).apply();
                oVar.a().edit().putInt("colorMode", eVar4.f189450b.ordinal()).apply();
                oVar.a().edit().putInt("fontScaleMode", eVar4.f189452d.ordinal()).apply();
                oVar.a().edit().putFloat("fontScale", eVar4.f189451c).apply();
                oVar.a().edit().putInt("textDirection", eVar4.f189453e.ordinal()).apply();
                return Unit.INSTANCE;
            case 27:
                ((ky0.k) obj4).invoke((n4.c) obj);
                ((ky0.k) obj3).invoke(Boolean.TRUE);
                return Unit.INSTANCE;
            case 28:
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                m92.f0.b(fVar2, (j23.l) obj4, (m92.z) obj3, null, null);
                return Unit.INSTANCE;
            default:
                ?? r14 = (CameraPositionState) obj;
                r14.getClass();
                ((me2.e) obj4).f98598b = r14;
                CameraPositionState.INSTANCE.invoke(new CameraPosition(me2.z.i((List) obj3).getCenter(), 10.5f, 0.0f, 0.0f));
                return Unit.INSTANCE;
        }
    }
}
