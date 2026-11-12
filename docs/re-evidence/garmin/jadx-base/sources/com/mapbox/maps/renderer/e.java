package com.mapbox.maps.renderer;

import android.content.Intent;
import androidx.preference.Preference;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.handalignment.HandAlignmentCameraActivity;
import com.garmin.android.apps.connectmobile.handalignment.HandAlignmentCameraDebugActivity;
import com.garmin.android.apps.connectmobile.handalignment.HandsCalibrationActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.incidentdetection.EdgeIncidentDetectionService;
import com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectedActivity;
import com.garmin.android.apps.connectmobile.incidentdetection.service.WellnessIncidentDetectionService;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.RescheduleWorkoutActivity;
import com.garmin.android.framework.widget.SwitchPreferenceCompat;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.fragment.FitPayAddressManagementFragment;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;
import cp2.g;
import en0.l;
import org.slf4j.Logger;
import p005kotlin.jvm.internal.s;
import xg1.i;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements RenderFrameFinishedCallback, u03.d, q1.a, Preference.c, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54611b;

    public /* synthetic */ e(Object obj, int i14) {
        this.f54610a = i14;
        this.f54611b = obj;
    }

    @Override // xg1.i
    public void a(Object obj) {
        eh1.b bVar = (eh1.b) this.f54611b;
        bVar.k(obj);
        bVar.f(obj);
        i2.k(a2.SETTINGS, "ValueSelectionViewDecorator", "onValueChanged(): notifyListener with selectedFieldValue=" + obj);
    }

    @Override // u03.d
    public void accept(Object obj) {
        int i14 = this.f54610a;
        Object obj2 = this.f54611b;
        switch (i14) {
            case 1:
                cp2.a.C1196a c1196a = cp2.a.f54915g;
                ((cp2.a.b) obj2).invoke(obj);
                break;
            case 2:
                cp2.a.C1196a c1196a2 = cp2.a.f54915g;
                ((com.google.maps.android.compose.clustering.d) obj2).invoke(obj);
                break;
            case 3:
                FitPayAddressManagementFragment.b bVar = FitPayAddressManagementFragment.f51413t;
                ((FitPayAddressManagementFragment.d) obj2).invoke(obj);
                break;
            case 4:
                FitPayAddressManagementFragment.b bVar2 = FitPayAddressManagementFragment.f51413t;
                ((com.google.maps.android.compose.clustering.d) obj2).invoke(obj);
                break;
            case 5:
                g.a aVar = g.f54953g;
                ((g.b) obj2).invoke(obj);
                break;
            case 6:
                g.a aVar2 = g.f54953g;
                ((com.google.maps.android.compose.clustering.d) obj2).invoke(obj);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                HandsCalibrationActivity.a aVar3 = HandsCalibrationActivity.f36565z;
                ((l) obj2).invoke(obj);
                break;
            case 12:
                HandAlignmentCameraActivity.b bVar3 = HandAlignmentCameraActivity.f36526q;
                ((en0.d) obj2).invoke(obj);
                break;
            case 13:
                HandAlignmentCameraActivity.b bVar4 = HandAlignmentCameraActivity.f36526q;
                ((en0.d) obj2).invoke(obj);
                break;
            case 14:
                HandAlignmentCameraActivity.b bVar5 = HandAlignmentCameraActivity.f36526q;
                ((en0.d) obj2).invoke(obj);
                break;
            case 15:
                HandAlignmentCameraActivity.b bVar6 = HandAlignmentCameraActivity.f36526q;
                ((en0.d) obj2).invoke(obj);
                break;
            case 16:
                HandAlignmentCameraActivity.b bVar7 = HandAlignmentCameraActivity.f36526q;
                ((en0.d) obj2).invoke(obj);
                break;
            case 17:
                HandAlignmentCameraActivity.b bVar8 = HandAlignmentCameraActivity.f36526q;
                ((en0.d) obj2).invoke(obj);
                break;
            case 18:
                HandAlignmentCameraActivity.b bVar9 = HandAlignmentCameraActivity.f36526q;
                ((en0.d) obj2).invoke(obj);
                break;
            case 19:
                HandAlignmentCameraActivity.b bVar10 = HandAlignmentCameraActivity.f36526q;
                ((en0.d) obj2).invoke(obj);
                break;
            case 20:
                HandAlignmentCameraActivity.b bVar11 = HandAlignmentCameraActivity.f36526q;
                ((en0.d) obj2).invoke(obj);
                break;
            case 21:
                HandAlignmentCameraActivity.b bVar12 = HandAlignmentCameraActivity.f36526q;
                ((en0.d) obj2).invoke(obj);
                break;
            case 22:
                Logger logger = HandAlignmentCameraDebugActivity.f36551n;
                ((e70.a) obj2).invoke(obj);
                break;
            case 23:
                Logger logger2 = HandAlignmentCameraDebugActivity.f36551n;
                ((en0.g) obj2).invoke(obj);
                break;
            case 24:
                Logger logger3 = HandAlignmentCameraDebugActivity.f36551n;
                ((en0.g) obj2).invoke(obj);
                break;
            case 25:
                HandsCalibrationActivity.a aVar4 = HandsCalibrationActivity.f36565z;
                ((e70.a) obj2).invoke(obj);
                break;
            case 26:
                HandsCalibrationActivity.a aVar5 = HandsCalibrationActivity.f36565z;
                ((l) obj2).invoke(obj);
                break;
            case 27:
                HandsCalibrationActivity.a aVar6 = HandsCalibrationActivity.f36565z;
                ((l) obj2).invoke(obj);
                break;
            case 28:
                HandsCalibrationActivity.a aVar7 = HandsCalibrationActivity.f36565z;
                ((l) obj2).invoke(obj);
                break;
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean f(Preference preference, Object obj) {
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.f54611b;
        com.garmin.android.apps.connectmobile.instantinput.b.a aVar = com.garmin.android.apps.connectmobile.instantinput.b.f36934i;
        if (s.g(obj, Boolean.TRUE)) {
            switchPreferenceCompat.x(R.string.instant_input_description_allow_instant_input_on);
            return true;
        }
        switchPreferenceCompat.x(R.string.instant_input_description_allow_instant_input_off);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        IncidentDetectedActivity incidentDetectedActivity;
        int i14 = this.f54610a;
        Object obj = this.f54611b;
        switch (i14) {
            case 7:
                com.garmin.android.apps.connectmobile.incidentdetection.e eVar = (com.garmin.android.apps.connectmobile.incidentdetection.e) obj;
                com.garmin.android.apps.connectmobile.incidentdetection.e.a aVar = com.garmin.android.apps.connectmobile.incidentdetection.e.f36857e;
                if (z14 && eVar.getActivity() != null && !eVar.requireActivity().isFinishing() && (incidentDetectedActivity = (IncidentDetectedActivity) eVar.getActivity()) != null) {
                    boolean zDa = incidentDetectedActivity.da(EdgeIncidentDetectionService.class);
                    incidentDetectedActivity.da(WellnessIncidentDetectionService.class);
                    Intent intent = new Intent(incidentDetectedActivity, zDa ? EdgeIncidentDetectionService.class : WellnessIncidentDetectionService.class);
                    intent.setAction("action.cancel.incident.from.gcm");
                    intent.putExtra("extra.incident.from.gcm.i.am.ok", true);
                    incidentDetectedActivity.startService(intent);
                    break;
                }
                break;
            default:
                RescheduleWorkoutActivity rescheduleWorkoutActivity = (RescheduleWorkoutActivity) obj;
                if (!z14) {
                    RescheduleWorkoutActivity.a aVar2 = RescheduleWorkoutActivity.f45357n;
                } else {
                    com.garmin.android.apps.connectmobile.training.atp.dashboard.a aVar3 = rescheduleWorkoutActivity.f45367j;
                    rescheduleWorkoutActivity.f45365h = aVar3 != null ? aVar3.F : null;
                    rescheduleWorkoutActivity.da();
                }
                break;
        }
    }

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public void run(RenderFrameFinished renderFrameFinished) {
        MapboxRenderer.renderFrameFinishedCallback$lambda$0((MapboxRenderer) this.f54611b, renderFrameFinished);
    }
}
