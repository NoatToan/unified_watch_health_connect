package ai1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.NumberPicker;
import androidx.lifecycle.v1;
import aq.n0;
import bi2.b0;
import bi2.k0;
import bi2.m0;
import c22.n1;
import c62.p;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppDetailsActivity;
import com.garmin.android.apps.connectmobile.golf.truswing.SwingDetailsActivity;
import com.garmin.android.apps.connectmobile.groupride.GroupRideShareActivity;
import com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity;
import com.garmin.android.apps.connectmobile.handalignment.HandAlignmentCameraActivity;
import com.garmin.android.apps.connectmobile.imagemultipicker.ImageMultiPickerActivity;
import com.garmin.android.apps.connectmobile.o1;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive4.Vva4AppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.f;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.i;
import com.garmin.android.apps.connectmobile.z1;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import cv.o;
import dn0.j;
import dn0.k;
import ei2.h;
import hb2.g;
import ii2.b;
import java.util.Map;
import java.util.UUID;
import kd0.m;
import o53.s0;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.s;
import p13.x;
import x53.c;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3310b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f3309a = i14;
        this.f3310b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f3309a;
        Object obj = this.f3310b;
        switch (i15) {
            case 0:
                Vva4AppearanceActivity vva4AppearanceActivity = (Vva4AppearanceActivity) obj;
                vva4AppearanceActivity.setResult(0);
                vva4AppearanceActivity.finish();
                return;
            case 1:
                int i16 = n0.f12063j;
                ((n0) obj).requireActivity().finish();
                return;
            case 2:
                b0 b0Var = (b0) obj;
                b0Var.f18114e.getClass();
                h hVar = b0Var.f18111b;
                b bVar = b0Var.f18112c;
                Map<String, ? extends Object> map = b0Var.f18113d;
                NumberPicker numberPicker = b0Var.f18115f;
                if (numberPicker != null) {
                    hVar.n(bVar, map, Integer.valueOf(numberPicker.getValue()));
                    return;
                } else {
                    s.m("numberPicker");
                    throw null;
                }
            case 3:
                k0 k0Var = (k0) obj;
                h hVar2 = k0Var.f18187b;
                b bVar2 = k0Var.f18188c;
                Map<String, ? extends Object> map2 = k0Var.f18189d;
                NumberPicker numberPicker2 = k0Var.f18192g;
                if (numberPicker2 == null) {
                    s.m("hoursPicker");
                    throw null;
                }
                Integer numValueOf = Integer.valueOf(numberPicker2.getValue());
                NumberPicker numberPicker3 = k0Var.f18194i;
                if (numberPicker3 == null) {
                    s.m("minutesPicker");
                    throw null;
                }
                Integer numValueOf2 = Integer.valueOf(numberPicker3.getValue());
                NumberPicker numberPicker4 = k0Var.f18196k;
                if (numberPicker4 != null) {
                    hVar2.n(bVar2, map2, x.k(numValueOf, numValueOf2, Integer.valueOf(numberPicker4.getValue())));
                    return;
                } else {
                    s.m("meridiesPicker");
                    throw null;
                }
            case 4:
                m0 m0Var = (m0) obj;
                h hVar3 = m0Var.f18214b;
                b bVar3 = m0Var.f18215c;
                Map<String, ? extends Object> map3 = m0Var.f18216d;
                NumberPicker numberPicker5 = m0Var.f18219g;
                if (numberPicker5 == null) {
                    s.m("hoursPicker");
                    throw null;
                }
                Integer numValueOf3 = Integer.valueOf(numberPicker5.getValue());
                NumberPicker numberPicker6 = m0Var.f18222j;
                if (numberPicker6 == null) {
                    s.m("minutesPicker");
                    throw null;
                }
                Integer numValueOf4 = Integer.valueOf(numberPicker6.getValue());
                NumberPicker numberPicker7 = m0Var.f18225m;
                if (numberPicker7 != null) {
                    hVar3.n(bVar3, map3, x.k(numValueOf3, numValueOf4, Integer.valueOf(numberPicker7.getValue())));
                    return;
                } else {
                    s.m("secondsPicker");
                    throw null;
                }
            case 5:
                GroupRideShareActivity groupRideShareActivity = (GroupRideShareActivity) obj;
                GroupRideShareActivity.a aVar = GroupRideShareActivity.f36417i;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                bv.b.f21239a.getClass();
                ((m) bv.b.a()).a(groupRideShareActivity, new Bundle(), 335544320);
                return;
            case 6:
                int i17 = ImageMultiPickerActivity.f36770j;
                ((ImageMultiPickerActivity) obj).finish();
                return;
            case 7:
                MultiSportsDetailsActivity multiSportsDetailsActivity = (MultiSportsDetailsActivity) obj;
                MultiSportsDetailsActivity.a aVar2 = MultiSportsDetailsActivity.f48440z;
                multiSportsDetailsActivity.showProgressOverlay();
                p pVarEa = multiSportsDetailsActivity.ea();
                WorkoutDetailsDTO workoutDetailsDTO = multiSportsDetailsActivity.ea().f48605r;
                Long lValueOf = workoutDetailsDTO != null ? Long.valueOf(workoutDetailsDTO.f48040a) : null;
                WorkoutDetailsDTO workoutDetailsDTO2 = multiSportsDetailsActivity.ea().f48605r;
                String str = workoutDetailsDTO2 != null ? workoutDetailsDTO2.E : null;
                w9.a aVarA = v1.a(pVarEa);
                c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new i(lValueOf, str, pVarEa, null), 2);
                return;
            case 8:
                WorkoutDetailsActivity workoutDetailsActivity = (WorkoutDetailsActivity) obj;
                WorkoutDetailsActivity.a aVar3 = WorkoutDetailsActivity.f48482f;
                f fVarEa = workoutDetailsActivity.ea();
                WorkoutDetailsDTO workoutDetailsDTO3 = workoutDetailsActivity.ea().f48605r;
                Long lValueOf2 = workoutDetailsDTO3 != null ? Long.valueOf(workoutDetailsDTO3.f48040a) : null;
                WorkoutDetailsDTO workoutDetailsDTO4 = workoutDetailsActivity.ea().f48605r;
                String str2 = workoutDetailsDTO4 != null ? workoutDetailsDTO4.E : null;
                w9.a aVarA2 = v1.a(fVarEa);
                c cVar2 = s0.f129406a;
                ge1.b.T(aVarA2, x53.b.f189152a, null, new i(lValueOf2, str2, fVarEa, null), 2);
                return;
            case 9:
                int i18 = com.garmin.android.apps.connectmobile.segments.presentation.b.f41423w;
                ((com.garmin.android.apps.connectmobile.segments.presentation.b) obj).startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                return;
            case 10:
                o1.b bVar4 = o1.f39651c;
                dialogInterface.getClass();
                o1.a aVar4 = ((o1) obj).f39652a;
                if (aVar4 != null) {
                    aVar4.a(i14 == -1);
                }
                dialogInterface.dismiss();
                return;
            case 11:
                ((z1) obj).lambda$initActionBar$0(dialogInterface, i14);
                return;
            case 12:
                ConnectIQAppDetailsActivity connectIQAppDetailsActivity = ((ConnectIQAppDetailsActivity.c.a) obj).f31732a.f31731a;
                int i19 = ConnectIQAppDetailsActivity.C;
                connectIQAppDetailsActivity.ea(false, true);
                return;
            case 13:
                ConnectIQAppDetailsActivity connectIQAppDetailsActivity2 = ((ConnectIQAppDetailsActivity.e) obj).f31735a;
                connectIQAppDetailsActivity2.f31709e.G(true);
                ConnectIQAppDetailsActivity.ca(connectIQAppDetailsActivity2, UUID.fromString(connectIQAppDetailsActivity2.f31709e.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String()));
                return;
            case 14:
                ConnectIQAppDetailsActivity connectIQAppDetailsActivity3 = ((ConnectIQAppDetailsActivity.f) obj).f31736a;
                ConnectIQAppDetailsActivity.ca(connectIQAppDetailsActivity3, UUID.fromString(connectIQAppDetailsActivity3.f31709e.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String()));
                return;
            case 15:
                dialogInterface.dismiss();
                ConnectIQAppDetailsActivity connectIQAppDetailsActivity4 = ((ConnectIQAppDetailsActivity.g) obj).f31737a;
                connectIQAppDetailsActivity4.f31707c.setResult(0);
                connectIQAppDetailsActivity4.f31707c.finish();
                return;
            case 16:
                dialogInterface.dismiss();
                ConnectIQAppDetailsActivity connectIQAppDetailsActivity5 = ((ConnectIQAppDetailsActivity.i) obj).f31740a;
                connectIQAppDetailsActivity5.f31707c.setResult(0);
                connectIQAppDetailsActivity5.f31707c.finish();
                return;
            case 17:
                dialogInterface.dismiss();
                ConnectIQAppDetailsActivity connectIQAppDetailsActivity6 = ((ConnectIQAppDetailsActivity.j) obj).f31741a;
                connectIQAppDetailsActivity6.f31707c.setResult(0);
                connectIQAppDetailsActivity6.f31707c.finish();
                return;
            case 18:
                OnDemandResourcesInstall.handleClick$bindAction$lambda$1((o13.p) obj, dialogInterface, i14);
                return;
            case 19:
                ((p0) obj).f105807a = i14;
                return;
            case 20:
                ((androidx.fragment.app.m) obj).finish();
                return;
            case 21:
                ((GNCSOptOutSettingsFragment) obj).lambda$showNotificationAccessTerminatedDialog$9(dialogInterface, i14);
                return;
            case 22:
                int i24 = o.f55830c;
                bv.b.f21239a.getClass();
                bv.b.a();
                SwingDetailsActivity.ca(((o) obj).f55831a);
                return;
            case 23:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.b.C0803b c0803b = com.garmin.android.apps.connectmobile.settings.devices.wifi.b.f43259w;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                ((com.garmin.android.apps.connectmobile.settings.devices.wifi.b) obj).C6(true);
                return;
            case 24:
                GCMWiFiNetworksActivity.a aVar5 = GCMWiFiNetworksActivity.f43245f;
                dialogInterface.dismiss();
                ((GCMWiFiNetworksActivity) obj).finish();
                return;
            case 25:
                k kVar = (k) obj;
                kVar.getClass();
                ge1.b.T(v1.a(kVar), null, null, new j(null), 3);
                return;
            case 26:
                GSMRedirectActivity gSMRedirectActivity = GSMRedirectActivity.this;
                gSMRedirectActivity.setResult(4);
                gSMRedirectActivity.finish();
                return;
            case 27:
                GSMRedirectActivity.c cVar3 = (GSMRedirectActivity.c) obj;
                cVar3.f36465d = false;
                GSMRedirectActivity gSMRedirectActivity2 = GSMRedirectActivity.this;
                gSMRedirectActivity2.setResult(3);
                gSMRedirectActivity2.finish();
                return;
            case 28:
                dialogInterface.getClass();
                new n1(((en.j) obj).f64660b, g.a.GARMIN_DIVE).a();
                dialogInterface.dismiss();
                return;
            default:
                HandAlignmentCameraActivity.b bVar5 = HandAlignmentCameraActivity.f36526q;
                ((HandAlignmentCameraActivity) obj).finish();
                return;
        }
    }
}
