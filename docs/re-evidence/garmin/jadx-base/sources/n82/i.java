package n82;

import android.content.Intent;
import bd0.u;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.IntroFragment;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.developer.screen.NutritionDeveloperSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting;
import com.garmin.android.apps.connectmobile.shareableevents.ShareableEventActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.preferences.view.activity.FBTEditPreferencesActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity.m;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditWeightActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepTargetTypeActivity;
import com.google.android.gms.maps.model.LatLng;
import com.mapbox.maps.MapView;
import com.mapbox.maps.extension.compose.style.terrain.generated.TerrainState;
import com.mapbox.maps.plugin.compass.CompassUtils;
import com.mapbox.maps.plugin.gestures.GesturesUtils;
import com.mapbox.maps.plugin.scalebar.ScaleBarUtils;
import lc.u0;
import na0.q;
import ne2.e0;
import ne2.s;
import org.koin.core.parameter.ParametersHolderKt;
import ov1.r;
import p005kotlin.Unit;
import p3.p0;
import r22.t1;
import r22.u1;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f124968b;

    public /* synthetic */ i(of0.n nVar, IntroFragment introFragment) {
        this.f124967a = 20;
        this.f124968b = introFragment;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0147  */
    @Override // e23.a
    public final Object invoke() {
        t1 t1Var;
        Object value;
        String str;
        String str2;
        int i14 = this.f124967a;
        Object obj = null;
        Object obj2 = this.f124968b;
        switch (i14) {
            case 0:
                return Integer.valueOf(((b) obj2).f124951d.getIntValue());
            case 1:
                q qVar = (q) obj2;
                return ParametersHolderKt.parametersOf(qVar.f125174f, Integer.valueOf(qVar.f125173e));
            case 2:
                nd.e eVar = (nd.e) obj2;
                eVar.getF158016a().a(new nd.a(eVar));
                return Unit.INSTANCE;
            case 3:
                oi2.a.f132270a.getClass();
                oi2.a.C2513a.c((nd0.d.a) obj2);
                return Unit.INSTANCE;
            case 4:
                MapView mapView = ((s) obj2).f125704v;
                if (mapView != null) {
                    return new e0(GesturesUtils.getGestures(mapView), CompassUtils.getCompass(mapView), ScaleBarUtils.getScaleBar(mapView));
                }
                return null;
            case 5:
                ActivityTrackingPulseOXSetting activityTrackingPulseOXSetting = (ActivityTrackingPulseOXSetting) obj2;
                DeviceSettingsDTO deviceSettingsDTO = activityTrackingPulseOXSetting.f41787a;
                long j8 = deviceSettingsDTO != null ? deviceSettingsDTO.f33860a : -1L;
                return new u(j8, new ActivityTrackingPulseOXSetting.d(j8, activityTrackingPulseOXSetting));
            case 6:
                GearActivity.a aVar = GearActivity.f35500b;
                return ParametersHolderKt.parametersOf(((GearRoute.l) obj2).f35655a);
            case 7:
                GearActivity.a aVar2 = GearActivity.f35500b;
                return ParametersHolderKt.parametersOf(((GearRoute.i) obj2).f35644a);
            case 8:
                GearRoute.k kVar = (GearRoute.k) obj2;
                GearActivity.a aVar3 = GearActivity.f35500b;
                return ParametersHolderKt.parametersOf(Long.valueOf(kVar.f35649a), kVar.f35650b, kVar.f35651c);
            case 9:
                GearActivity.a aVar4 = GearActivity.f35500b;
                return ParametersHolderKt.parametersOf(((GearRoute.d) obj2).f35634a);
            case 10:
                FBTEditPreferencesActivity.a aVar5 = FBTEditPreferencesActivity.f45500c;
                ((FBTEditPreferencesActivity) obj2).ca().f141491c1.setValue(null);
                return Unit.INSTANCE;
            case 11:
                int i15 = NutritionDeveloperSettingsActivity.f39594a;
                ((NutritionDeveloperSettingsActivity) obj2).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 12:
                EditProfileActivity.a aVar6 = EditProfileActivity.f46981h;
                ((EditProfileActivity) obj2).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 13:
                WorkoutStepEditActivity.a aVar7 = WorkoutStepEditActivity.f49573h;
                return ((WorkoutStepEditActivity) obj2).new m();
            case 14:
                WorkoutStepEditWeightActivity.a aVar8 = WorkoutStepEditWeightActivity.f49597b;
                return new WorkoutStepEditWeightActivity.j((WorkoutStepEditWeightActivity) obj2);
            case 15:
                WorkoutStepTargetTypeActivity workoutStepTargetTypeActivity = (WorkoutStepTargetTypeActivity) obj2;
                u1 u1Var = workoutStepTargetTypeActivity.f49604a;
                if (u1Var == null) {
                    p005kotlin.jvm.internal.s.m("adapter");
                    throw null;
                }
                for (Object obj3 : u1Var.A()) {
                    if (((t1) obj3).f149897g) {
                        obj = obj3;
                        t1Var = (t1) obj;
                        if (t1Var != null) {
                            x52.f fVarValueOf = x52.f.valueOf(t1Var.f149891a);
                            Intent intent = new Intent();
                            intent.putExtra("SEL_WORKOUT_STEP_TARGET_TYPE", fVarValueOf);
                            workoutStepTargetTypeActivity.setResult(-1, intent);
                            workoutStepTargetTypeActivity.finish();
                        }
                        return Unit.INSTANCE;
                    }
                }
                t1Var = (t1) obj;
                if (t1Var != null) {
                    x52.f fVarValueOf2 = x52.f.valueOf(t1Var.f149891a);
                    Intent intent2 = new Intent();
                    intent2.putExtra("SEL_WORKOUT_STEP_TARGET_TYPE", fVarValueOf2);
                    workoutStepTargetTypeActivity.setResult(-1, intent2);
                    workoutStepTargetTypeActivity.finish();
                }
                return Unit.INSTANCE;
            case 16:
                ((o81.g) obj2).dismiss();
                return Unit.INSTANCE;
            case 17:
                ob0.h hVar = (ob0.h) obj2;
                p2 p2Var = hVar.f131134h;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.FALSE));
                hVar.y4();
                return Unit.INSTANCE;
            case 18:
                LatLng latLngC = ke2.c.c(((le2.b) obj2).f112054a);
                com.garmin.android.library.mapsdkadapter.f.f50281c.getClass();
                return p0.n(Boolean.valueOf(!latLngC.equals(com.garmin.android.library.mapsdkadapter.f.f50282d.f50283a)));
            case 19:
                return p0.n((TerrainState) obj2);
            case 20:
                a2 a2Var = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "IntroFragment", "[checkEnabledAtCurrentLocation] exit onboarding");
                int i16 = IntroFragment.f34814j;
                ((IntroFragment) obj2).z6().K4();
                return Unit.INSTANCE;
            case 21:
                int i17 = ShareableEventActivity.f44216b;
                Intent intent3 = ((ShareableEventActivity) obj2).getIntent();
                intent3.getClass();
                return new ol1.j(intent3, zx.f.a.a(zx.f.f207316b), u0.g(d60.b.f57806c));
            case 22:
                int i18 = com.garmin.android.apps.connectmobile.group.details.about.member.c.f36233h;
                GroupDTO groupDTO = ((com.garmin.android.apps.connectmobile.group.details.about.member.c) obj2).f36234a;
                return new om0.n((groupDTO == null || (str = groupDTO.f31558a) == null) ? "" : str, true, false, false, 12, null);
            case 23:
                GroupDTO groupDTO2 = ((com.garmin.android.apps.connectmobile.group.details.about.member.d) obj2).f36251a;
                return new om0.n((groupDTO2 == null || (str2 = groupDTO2.f31558a) == null) ? "" : str2, true, false, false, 12, null);
            case 24:
                IntensityMinutesReportsActivity.a aVar9 = IntensityMinutesReportsActivity.f36935b;
                ((IntensityMinutesReportsActivity) obj2).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 25:
                ((os0.c) obj2).f133542a.invoke();
                return Unit.INSTANCE;
            case 26:
                ov1.b bVar = (ov1.b) obj2;
                ov1.b.a aVar10 = ov1.b.f134135c;
                bVar.u6().t5();
                bVar.u6().b5();
                return Unit.INSTANCE;
            case 27:
                ov1.c.a aVar11 = ov1.c.f134143b;
                ((ov1.c) obj2).getParentFragmentManager().Z();
                return Unit.INSTANCE;
            case 28:
                ov1.l lVar = (ov1.l) obj2;
                lVar.f134186b.f(false);
                lVar.requireActivity().onBackPressed();
                return Unit.INSTANCE;
            default:
                r rVar = (r) obj2;
                rVar.f134215b.f(false);
                rVar.requireActivity().onBackPressed();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(Object obj, int i14) {
        this.f124967a = i14;
        this.f124968b = obj;
    }
}
