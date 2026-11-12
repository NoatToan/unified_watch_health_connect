package a61;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.GCMActivityStartup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.deeplink.AppPromoPopupActivity;
import com.garmin.android.apps.connectmobile.activities.photos.PhotoManagementActivity;
import com.garmin.android.apps.connectmobile.activities.photos.PostPhotoManagementActivity;
import com.garmin.android.apps.connectmobile.activity.details.presentation.share.ActivityShareFragment;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.connections.groups.GroupsActivity;
import com.garmin.android.apps.connectmobile.devices.setup.BLEScanningActivity;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEScanningWizardActivity;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import com.garmin.android.apps.connectmobile.groupride.GroupRideShareActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.ManageTripsActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.TripDetailsActivity;
import com.garmin.android.apps.connectmobile.performance.StrengthStatsActivity;
import com.garmin.android.apps.connectmobile.settings.GCMUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.autodetect.DeviceAutoDetectActivity;
import com.garmin.android.apps.connectmobile.solarcharge.EdgeSolarChargeActivity;
import com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesActivity;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateActivity;
import com.garmin.feature.garminpay.providers.gpay.ecom.EcomMainActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.s0;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p3.p1;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1603b;

    public /* synthetic */ i(Object obj, int i14) {
        this.f1602a = i14;
        this.f1603b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Object, o13.l] */
    @Override // f.b
    public final void a(Object obj) {
        int i14;
        Boolean boolValueOf;
        String str;
        String str2;
        Parcelable parcelable;
        Intent intent;
        Intent intent2;
        Uri uri;
        Object value;
        Parcelable parcelable2;
        e32.j jVar;
        ArrayList arrayList;
        Boolean boolValueOf2;
        l20.a aVar;
        List<l20.c> listZ;
        Parcelable parcelable3;
        Bundle extras;
        Parcelable parcelable4;
        int i15 = this.f1602a;
        boolean z14 = false;
        oVar = null;
        yr0.o oVar = null;
        WorkoutDetailsDTO workoutDetailsDTO = null;
        com.garmin.android.apps.connectmobile.repcounting.model.d dVar = null;
        Object obj2 = this.f1603b;
        switch (i15) {
            case 0:
                StrengthStatsActivity strengthStatsActivity = (StrengthStatsActivity) obj2;
                StrengthStatsActivity.b bVar = (StrengthStatsActivity.b) obj;
                StrengthStatsActivity.a aVar2 = StrengthStatsActivity.f39815r;
                if (bVar == null) {
                    return;
                }
                o71.i iVar = (o71.i) strengthStatsActivity.f39816n.getValue();
                p71.f fVar = bVar.f39820a;
                y0<o71.i.b> y0Var = iVar.f130240b;
                o71.i.b bVarD = y0Var.d();
                y0Var.j(bVarD != null ? new o71.i.b(bVarD.f130244a, fVar) : null);
                o71.i.b bVarD2 = y0Var.d();
                p71.c cVar = bVarD2 != null ? bVarD2.f130244a : null;
                i14 = cVar != null ? o71.i.c.f130246a[cVar.ordinal()] : -1;
                if (i14 == 1) {
                    l.f1621a.getClass();
                    boolValueOf = Boolean.valueOf(fVar.equals((p71.a) l.f1622b.getValue()));
                    str = "StrengthStatsExerciseFilterApplied";
                    str2 = "isAllExercise";
                } else {
                    if (i14 != 2) {
                        return;
                    }
                    l.f1621a.getClass();
                    boolValueOf = Boolean.valueOf(fVar.equals((p71.a) l.f1623c.getValue()));
                    str = "StrengthStatsMuscleFilterApplied";
                    str2 = "isAllMuscle";
                }
                ht.a aVar3 = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p(str2, boolValueOf));
                aVar3.getClass();
                ht.a.a(bundleA, str);
                return;
            case 1:
                FitPayAddCardActivity fitPayAddCardActivity = (FitPayAddCardActivity) obj2;
                f.a aVar4 = (f.a) obj;
                FitPayAddCardActivity.a aVar5 = FitPayAddCardActivity.f51376x;
                aVar4.getClass();
                Logger loggerA = FitPayAddCardActivity.a.a(FitPayAddCardActivity.f51376x);
                int i16 = aVar4.f67585a;
                u62.z.i("customerManagementActivityLauncher: resultCode=", i16, loggerA);
                if (i16 == 0) {
                    fitPayAddCardActivity.ea();
                    return;
                }
                return;
            case 2:
                aq.c0 c0Var = (aq.c0) obj2;
                f.a aVar6 = (f.a) obj;
                int i17 = aq.c0.f11852i;
                aVar6.getClass();
                if (aVar6.f67585a != -1) {
                    return;
                }
                Intent intent3 = aVar6.f67586b;
                if (intent3 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) intent3.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                    } else {
                        Parcelable parcelableExtra = intent3.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                        parcelable = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra : null);
                    }
                    dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable;
                }
                com.garmin.android.apps.connectmobile.repcounting.model.d dVarA4 = c0Var.u6().A4(dVar);
                aq.i0 i0VarV6 = c0Var.v6();
                ArrayList<aq.x> arrayList2 = i0VarV6.f11990a;
                if (dVar == null) {
                    return;
                }
                for (aq.x xVar : arrayList2) {
                    com.garmin.android.apps.connectmobile.repcounting.model.e eVar = xVar.f12286b;
                    com.garmin.android.apps.connectmobile.repcounting.model.e eVarP = gl.b.P(dVar);
                    eVarP.g0(eVar.D());
                    eVarP.i0(eVar.H());
                    eVarP.j0(eVar.I());
                    Long lZ = eVar.Z();
                    if (dVar.f41105d) {
                        lZ = -1L;
                    } else if (lZ == null || lZ.longValue() <= 0.0d) {
                        lZ = -2L;
                    }
                    eVarP.n0(lZ);
                    xVar.f12286b = eVarP;
                    xVar.f12287c = dVar;
                    xVar.f12288d = dVarA4;
                }
                i0VarV6.x4(arrayList2);
                return;
            case 3:
                aq.n0 n0Var = (aq.n0) obj2;
                f.a aVar7 = (f.a) obj;
                int i18 = aq.n0.f12063j;
                aVar7.getClass();
                if (aVar7.f67585a != -1) {
                    return;
                }
                ge1.b.T(g22.f.b(n0Var), null, null, new aq.n0.i(aVar7, n0Var, null), 3);
                return;
            case 4:
                BLEScanningActivity bLEScanningActivity = (BLEScanningActivity) obj2;
                int i19 = BLEScanningActivity.A;
                if (((f.a) obj).f67585a == -1) {
                    bLEScanningActivity.ga();
                    return;
                }
                return;
            case 5:
                GroupRideShareActivity groupRideShareActivity = (GroupRideShareActivity) obj2;
                f.a aVar8 = (f.a) obj;
                GroupRideShareActivity.a aVar9 = GroupRideShareActivity.f36417i;
                aVar8.getClass();
                if (aVar8.f67585a == -1) {
                    groupRideShareActivity.f36419a.debug(GroupRideShareActivity.f36418j + " - Consented LiveTrack with GroupRide feature");
                    Intent intentE = groupRideShareActivity.f36426h.e(groupRideShareActivity);
                    f.c<Intent> cVar2 = groupRideShareActivity.f36422d;
                    if (cVar2 != null) {
                        cVar2.a(intentE, null);
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("selectCompatibleDeviceLauncher");
                        throw null;
                    }
                }
                return;
            case 6:
                PhotoManagementActivity photoManagementActivity = (PhotoManagementActivity) obj2;
                f.a aVar10 = (f.a) obj;
                PhotoManagementActivity.a aVar11 = PhotoManagementActivity.f29713t;
                aVar10.getClass();
                if (aVar10.f67585a == -1 && (intent = aVar10.f67586b) != null && intent.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                    ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                    photoManagementActivity.f82662d = true;
                    photoManagementActivity.ca().clear();
                    if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                        photoManagementActivity.z6();
                        return;
                    } else {
                        photoManagementActivity.ca().f82686b.addAll(PhotoManagementActivity.ka(parcelableArrayListExtra));
                        photoManagementActivity.ca().notifyDataSetChanged();
                        return;
                    }
                }
                return;
            case 7:
                PostPhotoManagementActivity postPhotoManagementActivity = (PostPhotoManagementActivity) obj2;
                f.a aVar12 = (f.a) obj;
                PostPhotoManagementActivity.a aVar13 = PostPhotoManagementActivity.f29721q;
                aVar12.getClass();
                if (aVar12.f67585a == -1 && (intent2 = aVar12.f67586b) != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                    ArrayList parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", jo1.f.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                    postPhotoManagementActivity.f82662d = true;
                    postPhotoManagementActivity.ca().clear();
                    if (parcelableArrayListExtra2 == null || parcelableArrayListExtra2.isEmpty()) {
                        postPhotoManagementActivity.z6();
                        return;
                    } else {
                        postPhotoManagementActivity.ca().f82686b.addAll(PostPhotoManagementActivity.ja(parcelableArrayListExtra2));
                        postPhotoManagementActivity.ca().notifyDataSetChanged();
                        return;
                    }
                }
                return;
            case 8:
                ((e23.l) ((p1) obj2).getF182175a()).invoke(obj);
                return;
            case 9:
                WorkoutDetailsActivity workoutDetailsActivity = (WorkoutDetailsActivity) obj2;
                f.a aVar14 = (f.a) obj;
                WorkoutDetailsActivity.a aVar15 = WorkoutDetailsActivity.f48482f;
                aVar14.getClass();
                if (aVar14.f67585a == -1) {
                    bv.b.f21239a.getClass();
                    ((kd0.m) bv.b.a()).a(workoutDetailsActivity, null, 268468224);
                    return;
                }
                return;
            case 10:
                GCMActivityStartup gCMActivityStartup = (GCMActivityStartup) obj2;
                Logger logger = GCMActivityStartup.f28658d;
                int i24 = ((f.a) obj).f67585a;
                com.airbnb.lottie.animation.keyframe.a.r("onActivityResult: resultCode [", i24, "]", GCMActivityStartup.f28658d);
                if (i24 == 32025 || i24 == 0) {
                    gCMActivityStartup.finish();
                    return;
                }
                return;
            case 11:
                com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar2 = (com.garmin.android.apps.connectmobile.training.atp.dashboard.d) obj2;
                com.garmin.android.apps.connectmobile.training.atp.dashboard.d.a aVar16 = com.garmin.android.apps.connectmobile.training.atp.dashboard.d.f45412x;
                ((f.a) obj).getClass();
                p92.o oVar2 = p92.o.f136619a;
                q92.x xVar2 = q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN;
                oVar2.getClass();
                q92.v vVarN = p92.o.n(xVar2);
                if (!dVar2.f45431t || vVarN == null || vVarN.b() || q92.c.a(vVarN)) {
                    return;
                }
                Intent intent4 = new Intent();
                intent4.putExtra("EXTRA_REFRESH_CHILD_COACH", true);
                dVar2.requireActivity().setResult(-1, intent4);
                dVar2.requireActivity().finish();
                return;
            case 12:
                PushesActivity pushesActivity = (PushesActivity) obj2;
                f.a aVar17 = (f.a) obj;
                PushesActivity.a aVar18 = PushesActivity.f48030d;
                aVar17.getClass();
                if (aVar17.f67585a == -1) {
                    pushesActivity.da().f57619h.g();
                    return;
                }
                return;
            case 13:
                BLEScanningWizardActivity bLEScanningWizardActivity = (BLEScanningWizardActivity) obj2;
                int i25 = BLEScanningWizardActivity.f34476l;
                if (((f.a) obj).f67585a == -1) {
                    bLEScanningWizardActivity.oa();
                    return;
                }
                return;
            case 14:
                ActivityShareFragment activityShareFragment = (ActivityShareFragment) obj2;
                f.a aVar19 = (f.a) obj;
                aVar19.getClass();
                if (aVar19.f67585a == -1) {
                    Intent intent5 = aVar19.f67586b;
                    if (intent5 != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable2 = (Parcelable) intent5.getParcelableExtra("input_uri", Uri.class);
                        } else {
                            Parcelable parcelableExtra2 = intent5.getParcelableExtra("input_uri");
                            if (!(parcelableExtra2 instanceof Uri)) {
                                parcelableExtra2 = null;
                            }
                            parcelable2 = (Uri) parcelableExtra2;
                        }
                        uri = (Uri) parcelable2;
                    } else {
                        uri = null;
                    }
                    p2 p2Var = ((qr.t) activityShareFragment.f30125b.getValue()).f146506b2;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, uri));
                    NavHostFragment.f10124e.getClass();
                    lc.y yVarA = NavHostFragment.a.a(activityShareFragment);
                    lc.h0 h0VarJ = yVarA.f111904b.j();
                    if (h0VarJ == null || h0VarJ.f111773b.f144346e != R.id.activityShareFragment) {
                        return;
                    }
                    yVarA.g(R.id.action_activityShareFragment_to_activityCustomShareFragment, null);
                    return;
                }
                return;
            case 15:
                AppPromoPopupActivity appPromoPopupActivity = (AppPromoPopupActivity) obj2;
                AppPromoPopupActivity.a aVar20 = AppPromoPopupActivity.f29002e;
                ((f.a) obj).getClass();
                a2 a2Var = a2.GENERAL;
                hb2.g.a aVar21 = appPromoPopupActivity.f29005c;
                a31.e eVar2 = appPromoPopupActivity.f29004b;
                String str3 = "onActivityResult: requestAppInstall[" + aVar21 + "] deviceUnitId[" + appPromoPopupActivity.f29003a + "]";
                i2.f36769a.getClass();
                i2.a.b(a2Var, "AppPromoPopupActivity", str3);
                hb2.g.a aVar22 = appPromoPopupActivity.f29005c;
                i14 = aVar22 != null ? AppPromoPopupActivity.b.f29007a[aVar22.ordinal()] : -1;
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            long j8 = appPromoPopupActivity.f29003a;
                            if (j8 != -1) {
                                eVar2.a(j8, e31.a.ENTERED_GARMIN_PILOT);
                            }
                        } else if (i14 == 4 && hb2.g.b(appPromoPopupActivity, hb2.g.a.GARMIN_MESSENGER)) {
                            eVar2.b(e31.a.HAS_MESSENGER_APP_INSTALLED);
                        }
                    } else if (hb2.g.b(appPromoPopupActivity, hb2.g.a.GARMIN_DIVE)) {
                        eVar2.b(e31.a.GARMIN_DIVE_APP_ONBOARDING);
                    }
                } else if (hb2.g.b(appPromoPopupActivity, hb2.g.a.GARMIN_DEZL)) {
                    eVar2.b(e31.a.HAS_DEZL_APP_INSTALLED);
                }
                appPromoPopupActivity.finish();
                return;
            case 16:
                EcomMainActivity ecomMainActivity = (EcomMainActivity) obj2;
                f.a aVar23 = (f.a) obj;
                EcomMainActivity.a aVar24 = EcomMainActivity.f51133k;
                aVar23.getClass();
                Logger logger2 = EcomMainActivity.f51134l;
                int i26 = aVar23.f67585a;
                com.airbnb.lottie.animation.keyframe.a.r("termsConditionActivityLauncher: result.resultCode: ", i26, ")", logger2);
                if (i26 == -1) {
                    ge1.b.T(o53.f0.w(ecomMainActivity), null, null, new com.garmin.feature.garminpay.providers.gpay.ecom.a(ecomMainActivity, null), 3);
                    return;
                } else {
                    if (i26 != 0) {
                        return;
                    }
                    logger2.debug("navigateWalletWithCardRefresh");
                    androidx.lifecycle.i0 i0VarW = o53.f0.w(ecomMainActivity);
                    x53.c cVar3 = s0.f129406a;
                    ge1.b.T(i0VarW, u53.o.f168762a, null, new eo2.c(ecomMainActivity, null), 2);
                    return;
                }
            case 17:
                EdgeSolarChargeActivity edgeSolarChargeActivity = (EdgeSolarChargeActivity) obj2;
                f.a aVar25 = (f.a) obj;
                EdgeSolarChargeActivity.a aVar26 = EdgeSolarChargeActivity.f44765o;
                aVar25.getClass();
                if (aVar25.f67585a != -1 || (jVar = (e32.j) edgeSolarChargeActivity.oa()) == null) {
                    return;
                }
                jVar.b(e32.o.f62806i);
                return;
            case 18:
                GCMCalendarActivity gCMCalendarActivity = (GCMCalendarActivity) obj2;
                DateTime dateTime = gCMCalendarActivity.f31082t;
                if (dateTime != null) {
                    gCMCalendarActivity.na(null, dateTime);
                    return;
                }
                return;
            case 19:
                WorkoutPreCreateActivity workoutPreCreateActivity = (WorkoutPreCreateActivity) obj2;
                f.a aVar27 = (f.a) obj;
                WorkoutPreCreateActivity.a aVar28 = WorkoutPreCreateActivity.f48888d;
                aVar27.getClass();
                int i27 = aVar27.f67585a;
                if (i27 == -1) {
                    workoutPreCreateActivity.setResult(i27);
                }
                workoutPreCreateActivity.finish();
                return;
            case 20:
                com.garmin.android.apps.connectmobile.contacts.details.c cVar4 = (com.garmin.android.apps.connectmobile.contacts.details.c) obj2;
                com.garmin.android.apps.connectmobile.contacts.details.c.a aVar29 = com.garmin.android.apps.connectmobile.contacts.details.c.f32482m;
                ((f.a) obj).getClass();
                g20.n nVar = (g20.n) cVar4.v6().f75347k.d();
                l20.a aVar30 = nVar != null ? nVar.f75368i : null;
                if (aVar30 != null) {
                    g20.n nVar2 = (g20.n) cVar4.v6().f75347k.d();
                    if (nVar2 == null || (aVar = nVar2.f75368i) == null || (listZ = aVar.z()) == null) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList(p13.y.r(listZ, 10));
                        for (l20.c cVarB : listZ) {
                            if (p005kotlin.jvm.internal.s.g(cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), cVar4.f32486h)) {
                                cVarB = l20.c.b(cVarB, null, null, null, null, Boolean.TRUE, null, null, null, null, null, 0, 1048543);
                            }
                            arrayList3.add(cVarB);
                        }
                        arrayList = arrayList3;
                    }
                    g20.i iVarV6 = cVar4.v6();
                    if (arrayList != null) {
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (p005kotlin.jvm.internal.s.g(((l20.c) it.next()).getIsLiveEventSharingDefault(), Boolean.TRUE)) {
                                    z14 = true;
                                }
                            }
                        }
                        boolValueOf2 = Boolean.valueOf(z14);
                    } else {
                        boolValueOf2 = null;
                    }
                    iVarV6.B4(l20.a.g(aVar30, null, null, null, null, null, boolValueOf2, null, arrayList, null, 8031));
                }
                cVar4.f32486h = null;
                return;
            case 21:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b) obj2;
                f.a aVar31 = (f.a) obj;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar32 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                aVar31.getClass();
                Intent intent6 = aVar31.f67586b;
                if (aVar31.f67585a == -1) {
                    Integer numValueOf = intent6 != null ? Integer.valueOf(intent6.getIntExtra("extra_sports_segment_index", -1)) : null;
                    if (intent6 != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable3 = (Parcelable) intent6.getParcelableExtra("extra_workout_dto", WorkoutDetailsDTO.class);
                        } else {
                            Parcelable parcelableExtra3 = intent6.getParcelableExtra("extra_workout_dto");
                            parcelable3 = (WorkoutDetailsDTO) (parcelableExtra3 instanceof WorkoutDetailsDTO ? parcelableExtra3 : null);
                        }
                        workoutDetailsDTO = (WorkoutDetailsDTO) parcelable3;
                    }
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVarY6 = bVar2.y6();
                    if (numValueOf == null || workoutDetailsDTO == null) {
                        a2 a2Var2 = a2.WORKOUTS;
                        i2.f36769a.getClass();
                        i2.a.e(a2Var2, "Unable to save segment, segment Index or workout details is null.");
                        return;
                    } else {
                        cVarY6.f49138r.Q0.set(numValueOf.intValue(), workoutDetailsDTO.Q0.get(0));
                        if (workoutDetailsDTO.f48044e == m52.k.f116758r) {
                            WorkoutDetailsDTO workoutDetailsDTO2 = cVarY6.f49138r;
                            workoutDetailsDTO2.f48047h = workoutDetailsDTO.f48047h;
                            workoutDetailsDTO2.f48048i = workoutDetailsDTO.f48048i;
                        }
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.Y4(cVarY6, cVarY6.f49138r, false, false, 6);
                        return;
                    }
                }
                return;
            case 22:
                GCMUserSettingsActivity gCMUserSettingsActivity = (GCMUserSettingsActivity) obj2;
                f.a aVar33 = (f.a) obj;
                int i28 = GCMUserSettingsActivity.f41539t;
                if (aVar33.f67585a != -1) {
                    gCMUserSettingsActivity.f41553n = null;
                    return;
                }
                Intent intent7 = aVar33.f67586b;
                if (intent7 != null) {
                    gCMUserSettingsActivity.f41553n = intent7.getParcelableArrayListExtra("change_list_extra");
                    return;
                } else {
                    gCMUserSettingsActivity.f41553n = null;
                    return;
                }
            case 23:
                GroupsActivity groupsActivity = (GroupsActivity) obj2;
                int i29 = GroupsActivity.f31357h;
                if (((f.a) obj).f67585a == -1) {
                    groupsActivity.ca();
                    return;
                }
                return;
            case 24:
                hc0.k kVar = (hc0.k) obj2;
                if (((f.a) obj).f67585a == -1) {
                    kVar.d7();
                    return;
                }
                return;
            case 25:
                GarminPayLaunchScreenActivity garminPayLaunchScreenActivity = (GarminPayLaunchScreenActivity) obj2;
                GarminPayLaunchScreenActivity.a aVar34 = GarminPayLaunchScreenActivity.f35305d;
                ((f.a) obj).getClass();
                Logger logger3 = garminPayLaunchScreenActivity.f35306a;
                logger3.debug("notifyProvidersOfGarminPayExit");
                ps2.w.f140538a.getClass();
                Iterator it3 = ps2.w.f140542e.values().iterator();
                while (it3.hasNext()) {
                    ((ms2.g) it3.next()).o();
                }
                kj0.c.f104941a.getClass();
                kj0.c.f104947g.set(null);
                logger3.trace("garminPayEntryContext set null");
                garminPayLaunchScreenActivity.finish();
                return;
            case 26:
                com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b bVar3 = (com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b) obj2;
                f.a aVar35 = (f.a) obj;
                com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.a aVar36 = com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.f37020x;
                aVar35.getClass();
                if (aVar35.f67585a == -1) {
                    bVar3.E6();
                    is0.c cVar5 = (is0.c) bVar3.f37021n.getValue();
                    w9.a aVarA = v1.a(cVar5);
                    x53.c cVar6 = s0.f129406a;
                    ge1.b.T(aVarA, x53.b.f189152a, null, new is0.d(cVar5, null), 2);
                    return;
                }
                return;
            case 27:
                ManageTripsActivity manageTripsActivity = (ManageTripsActivity) obj2;
                f.a aVar37 = (f.a) obj;
                ManageTripsActivity.a aVar38 = ManageTripsActivity.f36985h;
                aVar37.getClass();
                if (aVar37.f67585a == -1) {
                    is0.i iVar2 = (is0.i) manageTripsActivity.f36986a.getValue();
                    w9.a aVarA2 = v1.a(iVar2);
                    x53.c cVar7 = s0.f129406a;
                    ge1.b.T(aVarA2, x53.b.f189152a, null, new is0.h(iVar2, null), 2);
                    return;
                }
                return;
            case 28:
                TripDetailsActivity tripDetailsActivity = (TripDetailsActivity) obj2;
                f.a aVar39 = (f.a) obj;
                TripDetailsActivity.a aVar40 = TripDetailsActivity.f37000i;
                aVar39.getClass();
                if (aVar39.f67585a == -1) {
                    is0.k kVarCa = tripDetailsActivity.ca();
                    Intent intent8 = aVar39.f67586b;
                    if (intent8 != null && (extras = intent8.getExtras()) != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable4 = (Parcelable) extras.getParcelable("EXTRA_UPDATED_TRIP", yr0.o.class);
                        } else {
                            Parcelable parcelable5 = extras.getParcelable("EXTRA_UPDATED_TRIP");
                            parcelable4 = (yr0.o) (parcelable5 instanceof yr0.o ? parcelable5 : null);
                        }
                        oVar = (yr0.o) parcelable4;
                    }
                    if (oVar != null) {
                        kVarCa.f94939a = oVar;
                    }
                    os0.c cVar8 = tripDetailsActivity.f37002b;
                    if (cVar8 != null) {
                        cVar8.a(tripDetailsActivity.ca().f94939a);
                    }
                    tripDetailsActivity.f37007g = true;
                    return;
                }
                return;
            default:
                DeviceAutoDetectActivity deviceAutoDetectActivity = (DeviceAutoDetectActivity) obj2;
                f.a aVar41 = (f.a) obj;
                DeviceAutoDetectActivity.a aVar42 = DeviceAutoDetectActivity.f41730c;
                aVar41.getClass();
                deviceAutoDetectActivity.setResult(aVar41.f67585a);
                deviceAutoDetectActivity.finish();
                return;
        }
    }
}
