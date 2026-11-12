package nw0;

import android.content.Intent;
import android.view.View;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.training.itp.ITPWorkoutScheduleActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.RoundConditionEditActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutRestStepHelpActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import java.util.Map;
import lc.u0;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Unit;
import r22.q0;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f128021b;

    public /* synthetic */ f(Object obj, int i14) {
        this.f128020a = i14;
        this.f128021b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v37, types: [T, com.mapbox.maps.extension.compose.animation.viewport.MapViewportState, java.lang.Object] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        b.u onBackPressedDispatcher;
        Object value3;
        int i14 = this.f128020a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i15 = 3;
        int i16 = 2;
        int i17 = 1;
        Object obj2 = this.f128021b;
        switch (i14) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i18 = g.f128025j;
                a2 a2Var = a2.LIFESTYLE_LOGGING;
                String strH = com.airbnb.lottie.animation.keyframe.a.h("Has any paired device: ", zBooleanValue);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "LifestyleLoggingAutoLogBehaviorsViewModel", strH);
                p2 p2Var = ((g) obj2).f128029d;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, a.a((a) value, false, false, zBooleanValue, 3)));
                return Unit.INSTANCE;
            case 1:
                return ((s60.a) obj2).a((Double) obj, s60.b.ABBREVIATED_NO_SPACE);
            case 2:
                RoundConditionEditActivity roundConditionEditActivity = (RoundConditionEditActivity) obj2;
                RoundConditionEditActivity.a aVar = RoundConditionEditActivity.f49565b;
                ((b.s) obj).getClass();
                if (roundConditionEditActivity.getSupportFragmentManager().M() > 0) {
                    roundConditionEditActivity.getSupportFragmentManager().b0();
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("GCM_workout_dto", roundConditionEditActivity.ca().x4());
                    Unit unit = Unit.INSTANCE;
                    roundConditionEditActivity.setResult(-1, intent);
                    roundConditionEditActivity.finish();
                }
                return Unit.INSTANCE;
            case 3:
                o62.s sVar = (o62.s) obj;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d.f49637i;
                sVar.getClass();
                ((com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d) obj2).w6(sVar);
                return Unit.INSTANCE;
            case 4:
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e.a aVar3 = com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e.f49652d;
                ((com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e) obj2).u6();
                return Unit.INSTANCE;
            case 5:
                o62.x xVar = o62.x.f129810a;
                ((f5.c0) obj).getClass();
                m4.b0.a((m4.b0) obj2);
                return Unit.INSTANCE;
            case 6:
                WorkoutRestStepHelpActivity workoutRestStepHelpActivity = (WorkoutRestStepHelpActivity) obj2;
                WorkoutRestStepHelpActivity.a aVar4 = WorkoutRestStepHelpActivity.f49572a;
                ((b.s) obj).getClass();
                if (workoutRestStepHelpActivity.getSupportFragmentManager().M() > 0) {
                    workoutRestStepHelpActivity.getSupportFragmentManager().b0();
                } else {
                    workoutRestStepHelpActivity.finish();
                }
                return Unit.INSTANCE;
            case 7:
                Integer num = (Integer) obj;
                WorkoutStepEditActivity.a aVar5 = WorkoutStepEditActivity.f49573h;
                num.getClass();
                ((WorkoutStepEditActivity) obj2).setTitle(num.intValue());
                return Unit.INSTANCE;
            case 8:
                p71.f fVar = (p71.f) obj2;
                com.garmin.android.apps.connectmobile.performance.dto.c cVar = (com.garmin.android.apps.connectmobile.performance.dto.c) obj;
                cVar.getClass();
                return Boolean.valueOf((fVar instanceof p71.a) || fVar.B0(cVar));
            case 9:
                Map map = (Map) obj;
                map.getClass();
                return c53.c0.s(new c53.a0(c53.c0.p(o71.g.f130204j.f130210c.invoke(((o71.e.a) obj2).f130183b), new bh2.e(map, i16)), new o71.c()));
            case 10:
                CameraPositionState cameraPositionState = (CameraPositionState) obj;
                cameraPositionState.getClass();
                CameraPosition cameraPositionFromLatLngZoom = CameraPosition.fromLatLngZoom((LatLng) obj2, 10.0f);
                cameraPositionFromLatLngZoom.getClass();
                cameraPositionState.setPosition(cameraPositionFromLatLngZoom);
                return Unit.INSTANCE;
            case 11:
                Feature feature = (Feature) obj2;
                GeoJsonSource.Builder builder = (GeoJsonSource.Builder) obj;
                builder.getClass();
                feature.getClass();
                GeoJsonSource.Builder.feature$default(builder, feature, null, 2, null);
                return Unit.INSTANCE;
            case 12:
                oe2.e eVar = (oe2.e) obj2;
                ?? r14 = (MapViewportState) obj;
                r14.getClass();
                eVar.f98598b = r14;
                CameraOptions.Builder builder2 = new CameraOptions.Builder();
                LatLng latLng = eVar.f98597a.f98593a;
                latLng.getClass();
                Point pointFromLngLat = Point.fromLngLat(latLng.longitude, latLng.latitude);
                pointFromLngLat.getClass();
                CameraOptions cameraOptionsBuild = builder2.center(pointFromLngLat).zoom(Double.valueOf(eVar.f98597a.f98594b)).bearing(Double.valueOf(eVar.f98597a.f98595c)).pitch(Double.valueOf(eVar.f98597a.f98596d)).build();
                cameraOptionsBuild.getClass();
                r14.setCameraOptions(cameraOptionsBuild);
                return Unit.INSTANCE;
            case 13:
                ((oi0.f) obj2).a((oi0.b) obj);
                return Unit.INSTANCE;
            case 14:
                String str = (String) obj;
                str.getClass();
                View view2 = ((ok0.b) obj2).getView();
                if (view2 != null) {
                    q0.b.c(q0.f149800b, view2, str, null, 12).show();
                }
                return Unit.INSTANCE;
            case 15:
                ok2.g gVar = (ok2.g) obj2;
                wk2.i iVar = (wk2.i) obj;
                ok2.g.b bVar = ok2.g.f132677s;
                iVar.getClass();
                ok2.b bVar2 = gVar.f132683b;
                rs2.c cVar2 = gVar.f132682a;
                if (iVar.getF205152b().a()) {
                    return iVar.getF205155e();
                }
                int i19 = cl2.c.a.f27941b[iVar.getF205155e().ordinal()];
                if (i19 != 1) {
                    return i19 != 2 ? cl2.c.e(bVar2.getConfiguration().k(iVar.getDirection()), iVar.getF205152b(), cVar2) : ok2.g0.AUTOMATIC_PREFERRED;
                }
                return iVar.getF205155e();
            case 16:
                String str2 = (String) obj;
                ok2.a0.a aVar6 = ok2.a0.f132585h;
                str2.getClass();
                return ((ok2.a0) obj2).d(str2);
            case 17:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                p2 p2Var2 = ((qo0.a) obj2).f145920e;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, qo0.d.a((qo0.d) value2, zBooleanValue2, false, false, false, null, null, null, false, 254)));
                return Unit.INSTANCE;
            case 18:
                NewFitPayWebNavigationActivity newFitPayWebNavigationActivity = (NewFitPayWebNavigationActivity) obj2;
                com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a enumC1069a = (com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a) obj;
                NewFitPayWebNavigationActivity.a aVar7 = NewFitPayWebNavigationActivity.f51549w;
                int i24 = enumC1069a != null ? NewFitPayWebNavigationActivity.c.f51568a[enumC1069a.ordinal()] : -1;
                if (i24 != 1) {
                    int i25 = 6;
                    if (i24 == 2) {
                        Logger logger = NewFitPayWebNavigationActivity.f51550x;
                        u62.z.i("onCreate: fitPay setup is failed, ensuring count and retrying again, retryCount: ", newFitPayWebNavigationActivity.f51557m, logger);
                        u62.z.i("initialization retry count ", newFitPayWebNavigationActivity.f51557m, logger);
                        int i26 = newFitPayWebNavigationActivity.f51557m;
                        if (i26 < 2) {
                            newFitPayWebNavigationActivity.f51557m = i26 + 1;
                            br2.c.f19585a.i(newFitPayWebNavigationActivity, new op2.i(newFitPayWebNavigationActivity, i15), new op2.i(newFitPayWebNavigationActivity, 4));
                        } else {
                            br2.c.f19585a.p(newFitPayWebNavigationActivity, new op2.i(newFitPayWebNavigationActivity, i25), new op2.i(newFitPayWebNavigationActivity, objArr == true ? 1 : 0));
                        }
                    } else if (i24 != 3) {
                        br2.c.f19585a.p(newFitPayWebNavigationActivity, new op2.i(newFitPayWebNavigationActivity, i25), new op2.i(newFitPayWebNavigationActivity, objArr2 == true ? 1 : 0));
                    } else {
                        androidx.appcompat.app.e eVarF = br2.c.f19585a.f(newFitPayWebNavigationActivity, new op2.i(newFitPayWebNavigationActivity, i17), new op2.i(newFitPayWebNavigationActivity, i16));
                        if (eVarF != null) {
                            eVarF.show();
                        }
                    }
                } else {
                    ge1.b.T(o53.f0.w(newFitPayWebNavigationActivity), null, null, new com.garmin.feature.garminpay.providers.gpay.ui.common.c(newFitPayWebNavigationActivity, null), 3);
                }
                return Unit.INSTANCE;
            case 19:
                or0.m mVar = (or0.m) obj2;
                if (((Boolean) obj).booleanValue()) {
                    mVar.getClass();
                    sn.a.o(f12.l.f68084a, true);
                    mVar.f133369h.g();
                    mVar.z4(mVar.f133370i);
                    mVar.z4(mVar.f133371j);
                    mVar.z4(mVar.f133372k);
                }
                return Unit.INSTANCE;
            case 20:
                hv1.e eVar2 = (hv1.e) obj;
                ov1.d.a aVar8 = ov1.d.f134149c;
                eVar2.getClass();
                ((pv1.b) ((ov1.d) obj2).f134150a.getValue()).j5(eVar2);
                return Unit.INSTANCE;
            case 21:
                ov1.l lVar = (ov1.l) obj2;
                vt1.h hVar = (vt1.h) obj;
                ov1.l.a aVar9 = ov1.l.f134184c;
                hVar.getClass();
                lVar.u6().v5("FBTEditStrengthWorkoutTypeFragment", new oe.j(17, lVar, hVar));
                return Unit.INSTANCE;
            case 22:
                ov1.r rVar = (ov1.r) obj2;
                tw1.k kVar = (tw1.k) obj;
                ov1.r.a aVar10 = ov1.r.f134213c;
                if (kVar != null) {
                    rVar.u6().v5("FBTEditTrainingLevelFragment", new oe.j(22, rVar, kVar));
                }
                return Unit.INSTANCE;
            case 23:
                ov1.t tVar = (ov1.t) obj2;
                hv1.i iVar2 = (hv1.i) obj;
                ov1.t.a aVar11 = ov1.t.f134225b;
                iVar2.getClass();
                p2 p2Var3 = ((pv1.b) tVar.f134226a.getValue()).R0;
                mv1.b bVar3 = (mv1.b) p2Var3.getValue();
                p2Var3.setValue(bVar3 != null ? mv1.b.a(bVar3, null, null, null, null, null, iVar2, null, 479) : null);
                androidx.fragment.app.m activity = tVar.getActivity();
                if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.d();
                }
                return Unit.INSTANCE;
            case 24:
                ((jw2.a) obj).getClass();
                ((dx2.c) obj2).f61489f.j(Boolean.TRUE);
                return Unit.INSTANCE;
            case 25:
                o13.p pVar = (o13.p) obj;
                pVar.getClass();
                LocalDate localDate = (LocalDate) pVar.f128594a;
                ((ow.a) obj2).getClass();
                return Boolean.valueOf(localDate.isAfter(LocalDate.now().minusDays(e32.o.f62807j.f62819a)));
            case 26:
                ITPWorkoutScheduleActivity iTPWorkoutScheduleActivity = (ITPWorkoutScheduleActivity) obj2;
                g3 g3Var = (g3) obj;
                ITPWorkoutScheduleActivity.a aVar12 = ITPWorkoutScheduleActivity.f45592b;
                if (g3Var != null) {
                    int i27 = ITPWorkoutScheduleActivity.b.f45594a[g3Var.f35300a.ordinal()];
                    if (i27 == 1) {
                        iTPWorkoutScheduleActivity.showProgressOverlay();
                    } else if (i27 == 2) {
                        iTPWorkoutScheduleActivity.hideProgressOverlay();
                        tw1.m mVar2 = (tw1.m) g3Var.f35301b;
                        if (mVar2 != null) {
                            iTPWorkoutScheduleActivity.da().f134305f = mVar2;
                            iTPWorkoutScheduleActivity.ca();
                        }
                    } else {
                        if (i27 != 3) {
                            u0.r();
                            return null;
                        }
                        iTPWorkoutScheduleActivity.hideProgressOverlay();
                    }
                }
                return Unit.INSTANCE;
            case 27:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                p2 p2Var4 = ((ix.j) obj2).f95627g;
                do {
                    value3 = p2Var4.getValue();
                } while (!p2Var4.b(value3, ix.l.a((ix.l) value3, zBooleanValue3, null, null, false, false, false, false, false, null, 510)));
                return Unit.INSTANCE;
            case 28:
                return obj == ((p13.a) obj2) ? "(this Collection)" : String.valueOf(obj);
            default:
                p13.d dVar = (p13.d) obj2;
                Map.Entry entry = (Map.Entry) obj;
                int i28 = p13.d.f134923a;
                entry.getClass();
                StringBuilder sb3 = new StringBuilder();
                Object key = entry.getKey();
                sb3.append(key == dVar ? "(this Map)" : String.valueOf(key));
                sb3.append('=');
                Object value4 = entry.getValue();
                sb3.append(value4 != dVar ? String.valueOf(value4) : "(this Map)");
                return sb3.toString();
        }
    }
}
