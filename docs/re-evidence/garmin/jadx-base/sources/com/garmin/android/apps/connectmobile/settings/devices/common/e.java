package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.m;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c3;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.lteconnect.LteConnectionActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.BikeAlarmSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSettingsActivityTrackerSetupDefault;
import com.garmin.android.apps.connectmobile.settings.devices.index.ManagePeopleActivity;
import com.garmin.android.apps.connectmobile.settings.devices.music.MusicSetupActivity;
import com.garmin.android.apps.connectmobile.solarintensity.presentation.activity.SolarIntensityActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.Locale;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import rd2.j;
import vg1.c0;
import vg1.z;
import z10.l0;
import zb0.d0;
import zb0.g;
import zb0.h;
import zb0.n0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class e extends g22.c<Void, Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f42830c;

    public e(f fVar) {
        this.f42830c = fVar;
    }

    @Override // g22.c
    public final Boolean b(Void[] voidArr) {
        j jVar = rd2.f.a().f152045a;
        f fVar = this.f42830c;
        long j8 = fVar.f42832i;
        jVar.getClass();
        sd2.f fVarI = j.i(j8, null);
        fVar.f42836l = fVarI;
        if (fVarI != null) {
            fVar.f42837m = (u0) u0.f203782n6.get(fVarI.getProductNumber());
            fVar.f42838n = ((d0) KoinJavaComponent.get(d0.class)).J(fVar.f42837m);
            new ArrayList(1).add(fVar.f42839o);
            return Boolean.TRUE;
        }
        i2.f(a2.SETTINGS, "DeviceSettingFragment", am.j.i(fVar.f42832i, "].", new StringBuilder("No database record for unit ID [")));
        return Boolean.FALSE;
    }

    @Override // g22.c
    public final void d(Boolean bool) {
        Boolean bool2 = bool;
        f fVar = this.f42830c;
        if (fVar.isAdded()) {
            final int i14 = 0;
            final int i15 = 1;
            if (bool2.booleanValue()) {
                c3 c3Var = fVar.J0;
                if (c3Var != null) {
                    c3Var.checkConsentBannerStatus(l0.DEVICE_SETTINGS, R.string.msg_more_feature_available_upload);
                }
                fVar.J6();
                sd2.f fVar2 = fVar.f42836l;
                if (fVar2 == null || fVar.f42837m == null || fVar.f42838n == null) {
                    g22.e.b(fVar, lj0.b.f112956j);
                } else {
                    if (fVar2.L2()) {
                        fVar.B.d();
                        fVar.f42839o.setVisibility(0);
                        fVar.B.c(new View.OnClickListener(this) { // from class: vg1.r

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                            {
                                this.f178150b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                sd2.f fVar3;
                                androidx.fragment.app.m activity;
                                Intent intentD;
                                switch (i14) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar4 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar4.getActivity()) && fVar4.f42836l != null) {
                                            androidx.fragment.app.m activity2 = fVar4.getActivity();
                                            long unitID = fVar4.f42836l.getUnitID();
                                            SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                            if (activity2 == null) {
                                                aVar.getClass();
                                            } else {
                                                aVar.getClass();
                                                activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar5 = this.f178150b.f42830c;
                                        Intent intentK6 = fVar5.K6(null, fVar5.f42838n.getF178171d());
                                        intentK6.putExtra("GCM_deviceName", fVar5.f42836l.getDisplayName());
                                        fVar5.startActivity(intentK6);
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar6 = this.f178150b.f42830c;
                                        Intent intentK7 = fVar6.K6(null, LteConnectionActivity.class.getName());
                                        intentK7.putExtra("GCM_deviceName", fVar6.f42836l.getDisplayName());
                                        intentK7.putExtra("GCM_deviceUnitID", fVar6.f42836l.getUnitID());
                                        fVar6.startActivity(intentK7);
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                        fVar7.startActivity(fVar7.K6(null, BikeAlarmSettingActivity.class.getName()));
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar8.getActivity()) && (fVar3 = fVar8.f42836l) != null) {
                                            if (!hk0.p.k(fVar3.getUnitID())) {
                                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar8.getActivity());
                                                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                                aVar2.create().show();
                                            } else {
                                                fVar8.startActivity(fVar8.K6(null, fVar8.f42838n.getF178168a()));
                                            }
                                            break;
                                        }
                                        break;
                                    case 5:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                        fVar9.startActivity(fVar9.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar9.f42838n.getF178181n()));
                                        break;
                                    case 6:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                        fVar10.startActivity(fVar10.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar10.f42838n.getF178181n()));
                                        break;
                                    case 7:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                        Intent intentK8 = fVar11.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar11.f42838n.getF178174g());
                                        intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar11.f42836l));
                                        fVar11.startActivity(intentK8);
                                        break;
                                    case 8:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                        fVar12.startActivity(fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar12.f42838n.getF178181n()));
                                        break;
                                    case 9:
                                        boolean zF = z10.d1.f();
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                        if (!zF) {
                                            fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar13.f42838n.getF178176i()));
                                        } else {
                                            Context contextRequireContext = fVar13.requireContext();
                                            contextRequireContext.getClass();
                                            z10.d1.o(contextRequireContext, new xk1.v(12));
                                        }
                                        break;
                                    case 10:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                        fVar14.startActivity(fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar14.f42838n.getF178181n()));
                                        break;
                                    case 11:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                        if (fVar15.getActivity() != null && (intentD = ar.a.d((activity = fVar15.getActivity()), fVar15.f42832i)) != null) {
                                            activity.startActivity(intentD);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                        fVar16.startActivity(fVar16.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                        break;
                                    case 13:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar17.getActivity()) && fVar17.f42836l != null) {
                                            MusicSetupActivity.ea(fVar17.getActivity(), fVar17.f42836l.getUnitID(), fVar17.f42836l.getProductDisplayName());
                                            break;
                                        }
                                        break;
                                    default:
                                        GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                        androidx.fragment.app.m activity3 = fVar18.getActivity();
                                        kj0.a.c cVar = new kj0.a.c(Long.valueOf(fVar18.f42836l.getUnitID()), fVar18.f42836l.getImageURL(), fVar18.f42836l.getProductDisplayName());
                                        aVar3.getClass();
                                        fVar18.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar)));
                                        break;
                                }
                            }
                        });
                    }
                    if (km2.a.i(fVar.f42832i, null, SupportedCapability.CIQ_AUDIO_CONTENT_PROVIDER.ordinal())) {
                        fVar.C.d();
                        fVar.f42839o.setVisibility(0);
                        final int i16 = 13;
                        fVar.C.c(new View.OnClickListener(this) { // from class: vg1.r

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                            {
                                this.f178150b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                sd2.f fVar3;
                                androidx.fragment.app.m activity;
                                Intent intentD;
                                switch (i16) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar4 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar4.getActivity()) && fVar4.f42836l != null) {
                                            androidx.fragment.app.m activity2 = fVar4.getActivity();
                                            long unitID = fVar4.f42836l.getUnitID();
                                            SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                            if (activity2 == null) {
                                                aVar.getClass();
                                            } else {
                                                aVar.getClass();
                                                activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar5 = this.f178150b.f42830c;
                                        Intent intentK6 = fVar5.K6(null, fVar5.f42838n.getF178171d());
                                        intentK6.putExtra("GCM_deviceName", fVar5.f42836l.getDisplayName());
                                        fVar5.startActivity(intentK6);
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar6 = this.f178150b.f42830c;
                                        Intent intentK7 = fVar6.K6(null, LteConnectionActivity.class.getName());
                                        intentK7.putExtra("GCM_deviceName", fVar6.f42836l.getDisplayName());
                                        intentK7.putExtra("GCM_deviceUnitID", fVar6.f42836l.getUnitID());
                                        fVar6.startActivity(intentK7);
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                        fVar7.startActivity(fVar7.K6(null, BikeAlarmSettingActivity.class.getName()));
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar8.getActivity()) && (fVar3 = fVar8.f42836l) != null) {
                                            if (!hk0.p.k(fVar3.getUnitID())) {
                                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar8.getActivity());
                                                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                                aVar2.create().show();
                                            } else {
                                                fVar8.startActivity(fVar8.K6(null, fVar8.f42838n.getF178168a()));
                                            }
                                            break;
                                        }
                                        break;
                                    case 5:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                        fVar9.startActivity(fVar9.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar9.f42838n.getF178181n()));
                                        break;
                                    case 6:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                        fVar10.startActivity(fVar10.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar10.f42838n.getF178181n()));
                                        break;
                                    case 7:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                        Intent intentK8 = fVar11.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar11.f42838n.getF178174g());
                                        intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar11.f42836l));
                                        fVar11.startActivity(intentK8);
                                        break;
                                    case 8:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                        fVar12.startActivity(fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar12.f42838n.getF178181n()));
                                        break;
                                    case 9:
                                        boolean zF = z10.d1.f();
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                        if (!zF) {
                                            fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar13.f42838n.getF178176i()));
                                        } else {
                                            Context contextRequireContext = fVar13.requireContext();
                                            contextRequireContext.getClass();
                                            z10.d1.o(contextRequireContext, new xk1.v(12));
                                        }
                                        break;
                                    case 10:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                        fVar14.startActivity(fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar14.f42838n.getF178181n()));
                                        break;
                                    case 11:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                        if (fVar15.getActivity() != null && (intentD = ar.a.d((activity = fVar15.getActivity()), fVar15.f42832i)) != null) {
                                            activity.startActivity(intentD);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                        fVar16.startActivity(fVar16.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                        break;
                                    case 13:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar17.getActivity()) && fVar17.f42836l != null) {
                                            MusicSetupActivity.ea(fVar17.getActivity(), fVar17.f42836l.getUnitID(), fVar17.f42836l.getProductDisplayName());
                                            break;
                                        }
                                        break;
                                    default:
                                        GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                        androidx.fragment.app.m activity3 = fVar18.getActivity();
                                        kj0.a.c cVar = new kj0.a.c(Long.valueOf(fVar18.f42836l.getUnitID()), fVar18.f42836l.getImageURL(), fVar18.f42836l.getProductDisplayName());
                                        aVar3.getClass();
                                        fVar18.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar)));
                                        break;
                                }
                            }
                        });
                    }
                    kj0.c cVar = kj0.c.f104941a;
                    sd2.f fVar3 = fVar.f42836l;
                    cVar.getClass();
                    fVar3.getClass();
                    if (fVar3.i1()) {
                        fVar.Y.d();
                        fVar.f42839o.setVisibility(0);
                        final int i17 = 14;
                        fVar.Y.c(new View.OnClickListener(this) { // from class: vg1.r

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                            {
                                this.f178150b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                sd2.f fVar4;
                                androidx.fragment.app.m activity;
                                Intent intentD;
                                switch (i17) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar5 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar5.getActivity()) && fVar5.f42836l != null) {
                                            androidx.fragment.app.m activity2 = fVar5.getActivity();
                                            long unitID = fVar5.f42836l.getUnitID();
                                            SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                            if (activity2 == null) {
                                                aVar.getClass();
                                            } else {
                                                aVar.getClass();
                                                activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar6 = this.f178150b.f42830c;
                                        Intent intentK6 = fVar6.K6(null, fVar6.f42838n.getF178171d());
                                        intentK6.putExtra("GCM_deviceName", fVar6.f42836l.getDisplayName());
                                        fVar6.startActivity(intentK6);
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                        Intent intentK7 = fVar7.K6(null, LteConnectionActivity.class.getName());
                                        intentK7.putExtra("GCM_deviceName", fVar7.f42836l.getDisplayName());
                                        intentK7.putExtra("GCM_deviceUnitID", fVar7.f42836l.getUnitID());
                                        fVar7.startActivity(intentK7);
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                        fVar8.startActivity(fVar8.K6(null, BikeAlarmSettingActivity.class.getName()));
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar9.getActivity()) && (fVar4 = fVar9.f42836l) != null) {
                                            if (!hk0.p.k(fVar4.getUnitID())) {
                                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar9.getActivity());
                                                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                                aVar2.create().show();
                                            } else {
                                                fVar9.startActivity(fVar9.K6(null, fVar9.f42838n.getF178168a()));
                                            }
                                            break;
                                        }
                                        break;
                                    case 5:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                        fVar10.startActivity(fVar10.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar10.f42838n.getF178181n()));
                                        break;
                                    case 6:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                        fVar11.startActivity(fVar11.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar11.f42838n.getF178181n()));
                                        break;
                                    case 7:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                        Intent intentK8 = fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar12.f42838n.getF178174g());
                                        intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar12.f42836l));
                                        fVar12.startActivity(intentK8);
                                        break;
                                    case 8:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                        fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar13.f42838n.getF178181n()));
                                        break;
                                    case 9:
                                        boolean zF = z10.d1.f();
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                        if (!zF) {
                                            fVar14.startActivity(fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar14.f42838n.getF178176i()));
                                        } else {
                                            Context contextRequireContext = fVar14.requireContext();
                                            contextRequireContext.getClass();
                                            z10.d1.o(contextRequireContext, new xk1.v(12));
                                        }
                                        break;
                                    case 10:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                        fVar15.startActivity(fVar15.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar15.f42838n.getF178181n()));
                                        break;
                                    case 11:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                        if (fVar16.getActivity() != null && (intentD = ar.a.d((activity = fVar16.getActivity()), fVar16.f42832i)) != null) {
                                            activity.startActivity(intentD);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                        fVar17.startActivity(fVar17.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                        break;
                                    case 13:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar18.getActivity()) && fVar18.f42836l != null) {
                                            MusicSetupActivity.ea(fVar18.getActivity(), fVar18.f42836l.getUnitID(), fVar18.f42836l.getProductDisplayName());
                                            break;
                                        }
                                        break;
                                    default:
                                        GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar19 = this.f178150b.f42830c;
                                        androidx.fragment.app.m activity3 = fVar19.getActivity();
                                        kj0.a.c cVar2 = new kj0.a.c(Long.valueOf(fVar19.f42836l.getUnitID()), fVar19.f42836l.getImageURL(), fVar19.f42836l.getProductDisplayName());
                                        aVar3.getClass();
                                        fVar19.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar2)));
                                        break;
                                }
                            }
                        });
                    }
                    g gVar = fVar.f42831h;
                    final int i18 = 2;
                    if (gVar != null) {
                        long j8 = fVar.f42832i;
                        t13.g gVar2 = v1.a(gVar).f183565a;
                        x53.c cVar2 = s0.f129406a;
                        m.a(gVar2.plus(x53.b.f189152a), new h(gVar, j8, null), 2).f(fVar.getViewLifecycleOwner(), new iz1.g(this, 25));
                    }
                    if (fVar.f42838n.h() && fVar.f42836l != null && fVar.I0) {
                        fVar.E.d();
                        fVar.f42839o.setVisibility(0);
                        fVar.E.c(new View.OnClickListener(this) { // from class: vg1.r

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                            {
                                this.f178150b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                sd2.f fVar4;
                                androidx.fragment.app.m activity;
                                Intent intentD;
                                switch (i15) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar5 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar5.getActivity()) && fVar5.f42836l != null) {
                                            androidx.fragment.app.m activity2 = fVar5.getActivity();
                                            long unitID = fVar5.f42836l.getUnitID();
                                            SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                            if (activity2 == null) {
                                                aVar.getClass();
                                            } else {
                                                aVar.getClass();
                                                activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar6 = this.f178150b.f42830c;
                                        Intent intentK6 = fVar6.K6(null, fVar6.f42838n.getF178171d());
                                        intentK6.putExtra("GCM_deviceName", fVar6.f42836l.getDisplayName());
                                        fVar6.startActivity(intentK6);
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                        Intent intentK7 = fVar7.K6(null, LteConnectionActivity.class.getName());
                                        intentK7.putExtra("GCM_deviceName", fVar7.f42836l.getDisplayName());
                                        intentK7.putExtra("GCM_deviceUnitID", fVar7.f42836l.getUnitID());
                                        fVar7.startActivity(intentK7);
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                        fVar8.startActivity(fVar8.K6(null, BikeAlarmSettingActivity.class.getName()));
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar9.getActivity()) && (fVar4 = fVar9.f42836l) != null) {
                                            if (!hk0.p.k(fVar4.getUnitID())) {
                                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar9.getActivity());
                                                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                                aVar2.create().show();
                                            } else {
                                                fVar9.startActivity(fVar9.K6(null, fVar9.f42838n.getF178168a()));
                                            }
                                            break;
                                        }
                                        break;
                                    case 5:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                        fVar10.startActivity(fVar10.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar10.f42838n.getF178181n()));
                                        break;
                                    case 6:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                        fVar11.startActivity(fVar11.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar11.f42838n.getF178181n()));
                                        break;
                                    case 7:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                        Intent intentK8 = fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar12.f42838n.getF178174g());
                                        intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar12.f42836l));
                                        fVar12.startActivity(intentK8);
                                        break;
                                    case 8:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                        fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar13.f42838n.getF178181n()));
                                        break;
                                    case 9:
                                        boolean zF = z10.d1.f();
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                        if (!zF) {
                                            fVar14.startActivity(fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar14.f42838n.getF178176i()));
                                        } else {
                                            Context contextRequireContext = fVar14.requireContext();
                                            contextRequireContext.getClass();
                                            z10.d1.o(contextRequireContext, new xk1.v(12));
                                        }
                                        break;
                                    case 10:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                        fVar15.startActivity(fVar15.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar15.f42838n.getF178181n()));
                                        break;
                                    case 11:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                        if (fVar16.getActivity() != null && (intentD = ar.a.d((activity = fVar16.getActivity()), fVar16.f42832i)) != null) {
                                            activity.startActivity(intentD);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                        fVar17.startActivity(fVar17.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                        break;
                                    case 13:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar18.getActivity()) && fVar18.f42836l != null) {
                                            MusicSetupActivity.ea(fVar18.getActivity(), fVar18.f42836l.getUnitID(), fVar18.f42836l.getProductDisplayName());
                                            break;
                                        }
                                        break;
                                    default:
                                        GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar19 = this.f178150b.f42830c;
                                        androidx.fragment.app.m activity3 = fVar19.getActivity();
                                        kj0.a.c cVar3 = new kj0.a.c(Long.valueOf(fVar19.f42836l.getUnitID()), fVar19.f42836l.getImageURL(), fVar19.f42836l.getProductDisplayName());
                                        aVar3.getClass();
                                        fVar19.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar3)));
                                        break;
                                }
                            }
                        });
                    }
                    if (km2.a.i(fVar.f42832i, null, SupportedCapability.HANDS_CALIBRATION.ordinal())) {
                        fVar.F.d();
                        fVar.f42839o.setVisibility(0);
                        com.garmin.android.apps.connectmobile.handalignment.e eVar = new com.garmin.android.apps.connectmobile.handalignment.e();
                        fVar.getF158016a().a(eVar);
                        fVar.F.c(new u12.e(21, this, eVar));
                    }
                    if (fVar.f42838n.q()) {
                        fVar.D.d();
                        fVar.f42839o.setVisibility(0);
                        fVar.D.c(new View.OnClickListener(this) { // from class: vg1.r

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                            {
                                this.f178150b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                sd2.f fVar4;
                                androidx.fragment.app.m activity;
                                Intent intentD;
                                switch (i18) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar5 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar5.getActivity()) && fVar5.f42836l != null) {
                                            androidx.fragment.app.m activity2 = fVar5.getActivity();
                                            long unitID = fVar5.f42836l.getUnitID();
                                            SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                            if (activity2 == null) {
                                                aVar.getClass();
                                            } else {
                                                aVar.getClass();
                                                activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar6 = this.f178150b.f42830c;
                                        Intent intentK6 = fVar6.K6(null, fVar6.f42838n.getF178171d());
                                        intentK6.putExtra("GCM_deviceName", fVar6.f42836l.getDisplayName());
                                        fVar6.startActivity(intentK6);
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                        Intent intentK7 = fVar7.K6(null, LteConnectionActivity.class.getName());
                                        intentK7.putExtra("GCM_deviceName", fVar7.f42836l.getDisplayName());
                                        intentK7.putExtra("GCM_deviceUnitID", fVar7.f42836l.getUnitID());
                                        fVar7.startActivity(intentK7);
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                        fVar8.startActivity(fVar8.K6(null, BikeAlarmSettingActivity.class.getName()));
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar9.getActivity()) && (fVar4 = fVar9.f42836l) != null) {
                                            if (!hk0.p.k(fVar4.getUnitID())) {
                                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar9.getActivity());
                                                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                                aVar2.create().show();
                                            } else {
                                                fVar9.startActivity(fVar9.K6(null, fVar9.f42838n.getF178168a()));
                                            }
                                            break;
                                        }
                                        break;
                                    case 5:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                        fVar10.startActivity(fVar10.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar10.f42838n.getF178181n()));
                                        break;
                                    case 6:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                        fVar11.startActivity(fVar11.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar11.f42838n.getF178181n()));
                                        break;
                                    case 7:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                        Intent intentK8 = fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar12.f42838n.getF178174g());
                                        intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar12.f42836l));
                                        fVar12.startActivity(intentK8);
                                        break;
                                    case 8:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                        fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar13.f42838n.getF178181n()));
                                        break;
                                    case 9:
                                        boolean zF = z10.d1.f();
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                        if (!zF) {
                                            fVar14.startActivity(fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar14.f42838n.getF178176i()));
                                        } else {
                                            Context contextRequireContext = fVar14.requireContext();
                                            contextRequireContext.getClass();
                                            z10.d1.o(contextRequireContext, new xk1.v(12));
                                        }
                                        break;
                                    case 10:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                        fVar15.startActivity(fVar15.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar15.f42838n.getF178181n()));
                                        break;
                                    case 11:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                        if (fVar16.getActivity() != null && (intentD = ar.a.d((activity = fVar16.getActivity()), fVar16.f42832i)) != null) {
                                            activity.startActivity(intentD);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                        fVar17.startActivity(fVar17.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                        break;
                                    case 13:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar18.getActivity()) && fVar18.f42836l != null) {
                                            MusicSetupActivity.ea(fVar18.getActivity(), fVar18.f42836l.getUnitID(), fVar18.f42836l.getProductDisplayName());
                                            break;
                                        }
                                        break;
                                    default:
                                        GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar19 = this.f178150b.f42830c;
                                        androidx.fragment.app.m activity3 = fVar19.getActivity();
                                        kj0.a.c cVar3 = new kj0.a.c(Long.valueOf(fVar19.f42836l.getUnitID()), fVar19.f42836l.getImageURL(), fVar19.f42836l.getProductDisplayName());
                                        aVar3.getClass();
                                        fVar19.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar3)));
                                        break;
                                }
                            }
                        });
                    }
                    if (fVar.f42838n.F()) {
                        fVar.f42842r.d();
                        final int i19 = 3;
                        fVar.f42842r.c(new View.OnClickListener(this) { // from class: vg1.r

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                            {
                                this.f178150b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                sd2.f fVar4;
                                androidx.fragment.app.m activity;
                                Intent intentD;
                                switch (i19) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar5 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar5.getActivity()) && fVar5.f42836l != null) {
                                            androidx.fragment.app.m activity2 = fVar5.getActivity();
                                            long unitID = fVar5.f42836l.getUnitID();
                                            SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                            if (activity2 == null) {
                                                aVar.getClass();
                                            } else {
                                                aVar.getClass();
                                                activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar6 = this.f178150b.f42830c;
                                        Intent intentK6 = fVar6.K6(null, fVar6.f42838n.getF178171d());
                                        intentK6.putExtra("GCM_deviceName", fVar6.f42836l.getDisplayName());
                                        fVar6.startActivity(intentK6);
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                        Intent intentK7 = fVar7.K6(null, LteConnectionActivity.class.getName());
                                        intentK7.putExtra("GCM_deviceName", fVar7.f42836l.getDisplayName());
                                        intentK7.putExtra("GCM_deviceUnitID", fVar7.f42836l.getUnitID());
                                        fVar7.startActivity(intentK7);
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                        fVar8.startActivity(fVar8.K6(null, BikeAlarmSettingActivity.class.getName()));
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar9.getActivity()) && (fVar4 = fVar9.f42836l) != null) {
                                            if (!hk0.p.k(fVar4.getUnitID())) {
                                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar9.getActivity());
                                                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                                aVar2.create().show();
                                            } else {
                                                fVar9.startActivity(fVar9.K6(null, fVar9.f42838n.getF178168a()));
                                            }
                                            break;
                                        }
                                        break;
                                    case 5:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                        fVar10.startActivity(fVar10.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar10.f42838n.getF178181n()));
                                        break;
                                    case 6:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                        fVar11.startActivity(fVar11.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar11.f42838n.getF178181n()));
                                        break;
                                    case 7:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                        Intent intentK8 = fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar12.f42838n.getF178174g());
                                        intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar12.f42836l));
                                        fVar12.startActivity(intentK8);
                                        break;
                                    case 8:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                        fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar13.f42838n.getF178181n()));
                                        break;
                                    case 9:
                                        boolean zF = z10.d1.f();
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                        if (!zF) {
                                            fVar14.startActivity(fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar14.f42838n.getF178176i()));
                                        } else {
                                            Context contextRequireContext = fVar14.requireContext();
                                            contextRequireContext.getClass();
                                            z10.d1.o(contextRequireContext, new xk1.v(12));
                                        }
                                        break;
                                    case 10:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                        fVar15.startActivity(fVar15.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar15.f42838n.getF178181n()));
                                        break;
                                    case 11:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                        if (fVar16.getActivity() != null && (intentD = ar.a.d((activity = fVar16.getActivity()), fVar16.f42832i)) != null) {
                                            activity.startActivity(intentD);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                        fVar17.startActivity(fVar17.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                        break;
                                    case 13:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar18.getActivity()) && fVar18.f42836l != null) {
                                            MusicSetupActivity.ea(fVar18.getActivity(), fVar18.f42836l.getUnitID(), fVar18.f42836l.getProductDisplayName());
                                            break;
                                        }
                                        break;
                                    default:
                                        GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar19 = this.f178150b.f42830c;
                                        androidx.fragment.app.m activity3 = fVar19.getActivity();
                                        kj0.a.c cVar3 = new kj0.a.c(Long.valueOf(fVar19.f42836l.getUnitID()), fVar19.f42836l.getImageURL(), fVar19.f42836l.getProductDisplayName());
                                        aVar3.getClass();
                                        fVar19.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar3)));
                                        break;
                                }
                            }
                        });
                    }
                    if (fVar.f42838n.C() && fVar.f42836l != null) {
                        fVar.f42843t.d();
                        final int i24 = 4;
                        fVar.f42843t.c(new View.OnClickListener(this) { // from class: vg1.r

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                            {
                                this.f178150b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                sd2.f fVar4;
                                androidx.fragment.app.m activity;
                                Intent intentD;
                                switch (i24) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar5 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar5.getActivity()) && fVar5.f42836l != null) {
                                            androidx.fragment.app.m activity2 = fVar5.getActivity();
                                            long unitID = fVar5.f42836l.getUnitID();
                                            SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                            if (activity2 == null) {
                                                aVar.getClass();
                                            } else {
                                                aVar.getClass();
                                                activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar6 = this.f178150b.f42830c;
                                        Intent intentK6 = fVar6.K6(null, fVar6.f42838n.getF178171d());
                                        intentK6.putExtra("GCM_deviceName", fVar6.f42836l.getDisplayName());
                                        fVar6.startActivity(intentK6);
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                        Intent intentK7 = fVar7.K6(null, LteConnectionActivity.class.getName());
                                        intentK7.putExtra("GCM_deviceName", fVar7.f42836l.getDisplayName());
                                        intentK7.putExtra("GCM_deviceUnitID", fVar7.f42836l.getUnitID());
                                        fVar7.startActivity(intentK7);
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                        fVar8.startActivity(fVar8.K6(null, BikeAlarmSettingActivity.class.getName()));
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar9.getActivity()) && (fVar4 = fVar9.f42836l) != null) {
                                            if (!hk0.p.k(fVar4.getUnitID())) {
                                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar9.getActivity());
                                                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                                aVar2.create().show();
                                            } else {
                                                fVar9.startActivity(fVar9.K6(null, fVar9.f42838n.getF178168a()));
                                            }
                                            break;
                                        }
                                        break;
                                    case 5:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                        fVar10.startActivity(fVar10.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar10.f42838n.getF178181n()));
                                        break;
                                    case 6:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                        fVar11.startActivity(fVar11.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar11.f42838n.getF178181n()));
                                        break;
                                    case 7:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                        Intent intentK8 = fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar12.f42838n.getF178174g());
                                        intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar12.f42836l));
                                        fVar12.startActivity(intentK8);
                                        break;
                                    case 8:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                        fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar13.f42838n.getF178181n()));
                                        break;
                                    case 9:
                                        boolean zF = z10.d1.f();
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                        if (!zF) {
                                            fVar14.startActivity(fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar14.f42838n.getF178176i()));
                                        } else {
                                            Context contextRequireContext = fVar14.requireContext();
                                            contextRequireContext.getClass();
                                            z10.d1.o(contextRequireContext, new xk1.v(12));
                                        }
                                        break;
                                    case 10:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                        fVar15.startActivity(fVar15.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar15.f42838n.getF178181n()));
                                        break;
                                    case 11:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                        if (fVar16.getActivity() != null && (intentD = ar.a.d((activity = fVar16.getActivity()), fVar16.f42832i)) != null) {
                                            activity.startActivity(intentD);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                        fVar17.startActivity(fVar17.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                        break;
                                    case 13:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar18.getActivity()) && fVar18.f42836l != null) {
                                            MusicSetupActivity.ea(fVar18.getActivity(), fVar18.f42836l.getUnitID(), fVar18.f42836l.getProductDisplayName());
                                            break;
                                        }
                                        break;
                                    default:
                                        GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar19 = this.f178150b.f42830c;
                                        androidx.fragment.app.m activity3 = fVar19.getActivity();
                                        kj0.a.c cVar3 = new kj0.a.c(Long.valueOf(fVar19.f42836l.getUnitID()), fVar19.f42836l.getImageURL(), fVar19.f42836l.getProductDisplayName());
                                        aVar3.getClass();
                                        fVar19.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar3)));
                                        break;
                                }
                            }
                        });
                    }
                    if (fVar.f42838n.I()) {
                        fVar.f42844v.d();
                        final int i25 = 5;
                        fVar.f42844v.c(new View.OnClickListener(this) { // from class: vg1.r

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                            {
                                this.f178150b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                sd2.f fVar4;
                                androidx.fragment.app.m activity;
                                Intent intentD;
                                switch (i25) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar5 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar5.getActivity()) && fVar5.f42836l != null) {
                                            androidx.fragment.app.m activity2 = fVar5.getActivity();
                                            long unitID = fVar5.f42836l.getUnitID();
                                            SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                            if (activity2 == null) {
                                                aVar.getClass();
                                            } else {
                                                aVar.getClass();
                                                activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar6 = this.f178150b.f42830c;
                                        Intent intentK6 = fVar6.K6(null, fVar6.f42838n.getF178171d());
                                        intentK6.putExtra("GCM_deviceName", fVar6.f42836l.getDisplayName());
                                        fVar6.startActivity(intentK6);
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                        Intent intentK7 = fVar7.K6(null, LteConnectionActivity.class.getName());
                                        intentK7.putExtra("GCM_deviceName", fVar7.f42836l.getDisplayName());
                                        intentK7.putExtra("GCM_deviceUnitID", fVar7.f42836l.getUnitID());
                                        fVar7.startActivity(intentK7);
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                        fVar8.startActivity(fVar8.K6(null, BikeAlarmSettingActivity.class.getName()));
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar9.getActivity()) && (fVar4 = fVar9.f42836l) != null) {
                                            if (!hk0.p.k(fVar4.getUnitID())) {
                                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar9.getActivity());
                                                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                                aVar2.create().show();
                                            } else {
                                                fVar9.startActivity(fVar9.K6(null, fVar9.f42838n.getF178168a()));
                                            }
                                            break;
                                        }
                                        break;
                                    case 5:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                        fVar10.startActivity(fVar10.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar10.f42838n.getF178181n()));
                                        break;
                                    case 6:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                        fVar11.startActivity(fVar11.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar11.f42838n.getF178181n()));
                                        break;
                                    case 7:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                        Intent intentK8 = fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar12.f42838n.getF178174g());
                                        intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar12.f42836l));
                                        fVar12.startActivity(intentK8);
                                        break;
                                    case 8:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                        fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar13.f42838n.getF178181n()));
                                        break;
                                    case 9:
                                        boolean zF = z10.d1.f();
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                        if (!zF) {
                                            fVar14.startActivity(fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar14.f42838n.getF178176i()));
                                        } else {
                                            Context contextRequireContext = fVar14.requireContext();
                                            contextRequireContext.getClass();
                                            z10.d1.o(contextRequireContext, new xk1.v(12));
                                        }
                                        break;
                                    case 10:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                        fVar15.startActivity(fVar15.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar15.f42838n.getF178181n()));
                                        break;
                                    case 11:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                        if (fVar16.getActivity() != null && (intentD = ar.a.d((activity = fVar16.getActivity()), fVar16.f42832i)) != null) {
                                            activity.startActivity(intentD);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                        fVar17.startActivity(fVar17.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                        break;
                                    case 13:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar18.getActivity()) && fVar18.f42836l != null) {
                                            MusicSetupActivity.ea(fVar18.getActivity(), fVar18.f42836l.getUnitID(), fVar18.f42836l.getProductDisplayName());
                                            break;
                                        }
                                        break;
                                    default:
                                        GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar19 = this.f178150b.f42830c;
                                        androidx.fragment.app.m activity3 = fVar19.getActivity();
                                        kj0.a.c cVar3 = new kj0.a.c(Long.valueOf(fVar19.f42836l.getUnitID()), fVar19.f42836l.getImageURL(), fVar19.f42836l.getProductDisplayName());
                                        aVar3.getClass();
                                        fVar19.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar3)));
                                        break;
                                }
                            }
                        });
                    }
                    if (fVar.f42838n.b()) {
                        u0 u0Var = fVar.f42837m;
                        z zVarD = n0.d(u0Var);
                        if (zVarD != null && zVarD.b()) {
                            switch (n0.a.f203583a[u0Var.ordinal()]) {
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                    TextView textView = fVar.f42845w.f178209b;
                                    if (textView != null) {
                                        textView.setText(R.string.device_alerts);
                                    }
                                    break;
                            }
                        }
                        fVar.f42845w.d();
                        final int i26 = 6;
                        fVar.f42845w.c(new View.OnClickListener(this) { // from class: vg1.r

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                            {
                                this.f178150b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                sd2.f fVar4;
                                androidx.fragment.app.m activity;
                                Intent intentD;
                                switch (i26) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar5 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar5.getActivity()) && fVar5.f42836l != null) {
                                            androidx.fragment.app.m activity2 = fVar5.getActivity();
                                            long unitID = fVar5.f42836l.getUnitID();
                                            SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                            if (activity2 == null) {
                                                aVar.getClass();
                                            } else {
                                                aVar.getClass();
                                                activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar6 = this.f178150b.f42830c;
                                        Intent intentK6 = fVar6.K6(null, fVar6.f42838n.getF178171d());
                                        intentK6.putExtra("GCM_deviceName", fVar6.f42836l.getDisplayName());
                                        fVar6.startActivity(intentK6);
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                        Intent intentK7 = fVar7.K6(null, LteConnectionActivity.class.getName());
                                        intentK7.putExtra("GCM_deviceName", fVar7.f42836l.getDisplayName());
                                        intentK7.putExtra("GCM_deviceUnitID", fVar7.f42836l.getUnitID());
                                        fVar7.startActivity(intentK7);
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                        fVar8.startActivity(fVar8.K6(null, BikeAlarmSettingActivity.class.getName()));
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar9.getActivity()) && (fVar4 = fVar9.f42836l) != null) {
                                            if (!hk0.p.k(fVar4.getUnitID())) {
                                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar9.getActivity());
                                                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                                aVar2.create().show();
                                            } else {
                                                fVar9.startActivity(fVar9.K6(null, fVar9.f42838n.getF178168a()));
                                            }
                                            break;
                                        }
                                        break;
                                    case 5:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                        fVar10.startActivity(fVar10.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar10.f42838n.getF178181n()));
                                        break;
                                    case 6:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                        fVar11.startActivity(fVar11.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar11.f42838n.getF178181n()));
                                        break;
                                    case 7:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                        Intent intentK8 = fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar12.f42838n.getF178174g());
                                        intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar12.f42836l));
                                        fVar12.startActivity(intentK8);
                                        break;
                                    case 8:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                        fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar13.f42838n.getF178181n()));
                                        break;
                                    case 9:
                                        boolean zF = z10.d1.f();
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                        if (!zF) {
                                            fVar14.startActivity(fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar14.f42838n.getF178176i()));
                                        } else {
                                            Context contextRequireContext = fVar14.requireContext();
                                            contextRequireContext.getClass();
                                            z10.d1.o(contextRequireContext, new xk1.v(12));
                                        }
                                        break;
                                    case 10:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                        fVar15.startActivity(fVar15.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar15.f42838n.getF178181n()));
                                        break;
                                    case 11:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                        if (fVar16.getActivity() != null && (intentD = ar.a.d((activity = fVar16.getActivity()), fVar16.f42832i)) != null) {
                                            activity.startActivity(intentD);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                        fVar17.startActivity(fVar17.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                        break;
                                    case 13:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar18.getActivity()) && fVar18.f42836l != null) {
                                            MusicSetupActivity.ea(fVar18.getActivity(), fVar18.f42836l.getUnitID(), fVar18.f42836l.getProductDisplayName());
                                            break;
                                        }
                                        break;
                                    default:
                                        GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar19 = this.f178150b.f42830c;
                                        androidx.fragment.app.m activity3 = fVar19.getActivity();
                                        kj0.a.c cVar3 = new kj0.a.c(Long.valueOf(fVar19.f42836l.getUnitID()), fVar19.f42836l.getImageURL(), fVar19.f42836l.getProductDisplayName());
                                        aVar3.getClass();
                                        fVar19.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar3)));
                                        break;
                                }
                            }
                        });
                    }
                    if (fVar.f42838n.f()) {
                        fVar.f42846x.d();
                        final int i27 = 7;
                        fVar.f42846x.c(new View.OnClickListener(this) { // from class: vg1.r

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                            {
                                this.f178150b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                sd2.f fVar4;
                                androidx.fragment.app.m activity;
                                Intent intentD;
                                switch (i27) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar5 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar5.getActivity()) && fVar5.f42836l != null) {
                                            androidx.fragment.app.m activity2 = fVar5.getActivity();
                                            long unitID = fVar5.f42836l.getUnitID();
                                            SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                            if (activity2 == null) {
                                                aVar.getClass();
                                            } else {
                                                aVar.getClass();
                                                activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar6 = this.f178150b.f42830c;
                                        Intent intentK6 = fVar6.K6(null, fVar6.f42838n.getF178171d());
                                        intentK6.putExtra("GCM_deviceName", fVar6.f42836l.getDisplayName());
                                        fVar6.startActivity(intentK6);
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                        Intent intentK7 = fVar7.K6(null, LteConnectionActivity.class.getName());
                                        intentK7.putExtra("GCM_deviceName", fVar7.f42836l.getDisplayName());
                                        intentK7.putExtra("GCM_deviceUnitID", fVar7.f42836l.getUnitID());
                                        fVar7.startActivity(intentK7);
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                        fVar8.startActivity(fVar8.K6(null, BikeAlarmSettingActivity.class.getName()));
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar9.getActivity()) && (fVar4 = fVar9.f42836l) != null) {
                                            if (!hk0.p.k(fVar4.getUnitID())) {
                                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar9.getActivity());
                                                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                                aVar2.create().show();
                                            } else {
                                                fVar9.startActivity(fVar9.K6(null, fVar9.f42838n.getF178168a()));
                                            }
                                            break;
                                        }
                                        break;
                                    case 5:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                        fVar10.startActivity(fVar10.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar10.f42838n.getF178181n()));
                                        break;
                                    case 6:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                        fVar11.startActivity(fVar11.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar11.f42838n.getF178181n()));
                                        break;
                                    case 7:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                        Intent intentK8 = fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar12.f42838n.getF178174g());
                                        intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar12.f42836l));
                                        fVar12.startActivity(intentK8);
                                        break;
                                    case 8:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                        fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar13.f42838n.getF178181n()));
                                        break;
                                    case 9:
                                        boolean zF = z10.d1.f();
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                        if (!zF) {
                                            fVar14.startActivity(fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar14.f42838n.getF178176i()));
                                        } else {
                                            Context contextRequireContext = fVar14.requireContext();
                                            contextRequireContext.getClass();
                                            z10.d1.o(contextRequireContext, new xk1.v(12));
                                        }
                                        break;
                                    case 10:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                        fVar15.startActivity(fVar15.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar15.f42838n.getF178181n()));
                                        break;
                                    case 11:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                        if (fVar16.getActivity() != null && (intentD = ar.a.d((activity = fVar16.getActivity()), fVar16.f42832i)) != null) {
                                            activity.startActivity(intentD);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                        fVar17.startActivity(fVar17.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                        break;
                                    case 13:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar18.getActivity()) && fVar18.f42836l != null) {
                                            MusicSetupActivity.ea(fVar18.getActivity(), fVar18.f42836l.getUnitID(), fVar18.f42836l.getProductDisplayName());
                                            break;
                                        }
                                        break;
                                    default:
                                        GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar19 = this.f178150b.f42830c;
                                        androidx.fragment.app.m activity3 = fVar19.getActivity();
                                        kj0.a.c cVar3 = new kj0.a.c(Long.valueOf(fVar19.f42836l.getUnitID()), fVar19.f42836l.getImageURL(), fVar19.f42836l.getProductDisplayName());
                                        aVar3.getClass();
                                        fVar19.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar3)));
                                        break;
                                }
                            }
                        });
                    }
                    final int i28 = 8;
                    if (fVar.f42838n.k()) {
                        fVar.f42847y.d();
                        fVar.f42847y.c(new View.OnClickListener(this) { // from class: vg1.r

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                            {
                                this.f178150b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                sd2.f fVar4;
                                androidx.fragment.app.m activity;
                                Intent intentD;
                                switch (i28) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar5 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar5.getActivity()) && fVar5.f42836l != null) {
                                            androidx.fragment.app.m activity2 = fVar5.getActivity();
                                            long unitID = fVar5.f42836l.getUnitID();
                                            SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                            if (activity2 == null) {
                                                aVar.getClass();
                                            } else {
                                                aVar.getClass();
                                                activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar6 = this.f178150b.f42830c;
                                        Intent intentK6 = fVar6.K6(null, fVar6.f42838n.getF178171d());
                                        intentK6.putExtra("GCM_deviceName", fVar6.f42836l.getDisplayName());
                                        fVar6.startActivity(intentK6);
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                        Intent intentK7 = fVar7.K6(null, LteConnectionActivity.class.getName());
                                        intentK7.putExtra("GCM_deviceName", fVar7.f42836l.getDisplayName());
                                        intentK7.putExtra("GCM_deviceUnitID", fVar7.f42836l.getUnitID());
                                        fVar7.startActivity(intentK7);
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                        fVar8.startActivity(fVar8.K6(null, BikeAlarmSettingActivity.class.getName()));
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar9.getActivity()) && (fVar4 = fVar9.f42836l) != null) {
                                            if (!hk0.p.k(fVar4.getUnitID())) {
                                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar9.getActivity());
                                                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                                aVar2.create().show();
                                            } else {
                                                fVar9.startActivity(fVar9.K6(null, fVar9.f42838n.getF178168a()));
                                            }
                                            break;
                                        }
                                        break;
                                    case 5:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                        fVar10.startActivity(fVar10.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar10.f42838n.getF178181n()));
                                        break;
                                    case 6:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                        fVar11.startActivity(fVar11.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar11.f42838n.getF178181n()));
                                        break;
                                    case 7:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                        Intent intentK8 = fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar12.f42838n.getF178174g());
                                        intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar12.f42836l));
                                        fVar12.startActivity(intentK8);
                                        break;
                                    case 8:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                        fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar13.f42838n.getF178181n()));
                                        break;
                                    case 9:
                                        boolean zF = z10.d1.f();
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                        if (!zF) {
                                            fVar14.startActivity(fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar14.f42838n.getF178176i()));
                                        } else {
                                            Context contextRequireContext = fVar14.requireContext();
                                            contextRequireContext.getClass();
                                            z10.d1.o(contextRequireContext, new xk1.v(12));
                                        }
                                        break;
                                    case 10:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                        fVar15.startActivity(fVar15.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar15.f42838n.getF178181n()));
                                        break;
                                    case 11:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                        if (fVar16.getActivity() != null && (intentD = ar.a.d((activity = fVar16.getActivity()), fVar16.f42832i)) != null) {
                                            activity.startActivity(intentD);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                        fVar17.startActivity(fVar17.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                        break;
                                    case 13:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar18.getActivity()) && fVar18.f42836l != null) {
                                            MusicSetupActivity.ea(fVar18.getActivity(), fVar18.f42836l.getUnitID(), fVar18.f42836l.getProductDisplayName());
                                            break;
                                        }
                                        break;
                                    default:
                                        GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar19 = this.f178150b.f42830c;
                                        androidx.fragment.app.m activity3 = fVar19.getActivity();
                                        kj0.a.c cVar3 = new kj0.a.c(Long.valueOf(fVar19.f42836l.getUnitID()), fVar19.f42836l.getImageURL(), fVar19.f42836l.getProductDisplayName());
                                        aVar3.getClass();
                                        fVar19.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar3)));
                                        break;
                                }
                            }
                        });
                    }
                    if (fVar.f42838n.hasUserSettings()) {
                        fVar.f42848z.d();
                        final int i29 = 9;
                        fVar.f42848z.c(new View.OnClickListener(this) { // from class: vg1.r

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                            {
                                this.f178150b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                sd2.f fVar4;
                                androidx.fragment.app.m activity;
                                Intent intentD;
                                switch (i29) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar5 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar5.getActivity()) && fVar5.f42836l != null) {
                                            androidx.fragment.app.m activity2 = fVar5.getActivity();
                                            long unitID = fVar5.f42836l.getUnitID();
                                            SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                            if (activity2 == null) {
                                                aVar.getClass();
                                            } else {
                                                aVar.getClass();
                                                activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar6 = this.f178150b.f42830c;
                                        Intent intentK6 = fVar6.K6(null, fVar6.f42838n.getF178171d());
                                        intentK6.putExtra("GCM_deviceName", fVar6.f42836l.getDisplayName());
                                        fVar6.startActivity(intentK6);
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                        Intent intentK7 = fVar7.K6(null, LteConnectionActivity.class.getName());
                                        intentK7.putExtra("GCM_deviceName", fVar7.f42836l.getDisplayName());
                                        intentK7.putExtra("GCM_deviceUnitID", fVar7.f42836l.getUnitID());
                                        fVar7.startActivity(intentK7);
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                        fVar8.startActivity(fVar8.K6(null, BikeAlarmSettingActivity.class.getName()));
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar9.getActivity()) && (fVar4 = fVar9.f42836l) != null) {
                                            if (!hk0.p.k(fVar4.getUnitID())) {
                                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar9.getActivity());
                                                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                                aVar2.create().show();
                                            } else {
                                                fVar9.startActivity(fVar9.K6(null, fVar9.f42838n.getF178168a()));
                                            }
                                            break;
                                        }
                                        break;
                                    case 5:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                        fVar10.startActivity(fVar10.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar10.f42838n.getF178181n()));
                                        break;
                                    case 6:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                        fVar11.startActivity(fVar11.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar11.f42838n.getF178181n()));
                                        break;
                                    case 7:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                        Intent intentK8 = fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar12.f42838n.getF178174g());
                                        intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar12.f42836l));
                                        fVar12.startActivity(intentK8);
                                        break;
                                    case 8:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                        fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar13.f42838n.getF178181n()));
                                        break;
                                    case 9:
                                        boolean zF = z10.d1.f();
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                        if (!zF) {
                                            fVar14.startActivity(fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar14.f42838n.getF178176i()));
                                        } else {
                                            Context contextRequireContext = fVar14.requireContext();
                                            contextRequireContext.getClass();
                                            z10.d1.o(contextRequireContext, new xk1.v(12));
                                        }
                                        break;
                                    case 10:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                        fVar15.startActivity(fVar15.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar15.f42838n.getF178181n()));
                                        break;
                                    case 11:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                        if (fVar16.getActivity() != null && (intentD = ar.a.d((activity = fVar16.getActivity()), fVar16.f42832i)) != null) {
                                            activity.startActivity(intentD);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                        fVar17.startActivity(fVar17.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                        break;
                                    case 13:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar18.getActivity()) && fVar18.f42836l != null) {
                                            MusicSetupActivity.ea(fVar18.getActivity(), fVar18.f42836l.getUnitID(), fVar18.f42836l.getProductDisplayName());
                                            break;
                                        }
                                        break;
                                    default:
                                        GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar19 = this.f178150b.f42830c;
                                        androidx.fragment.app.m activity3 = fVar19.getActivity();
                                        kj0.a.c cVar3 = new kj0.a.c(Long.valueOf(fVar19.f42836l.getUnitID()), fVar19.f42836l.getImageURL(), fVar19.f42836l.getProductDisplayName());
                                        aVar3.getClass();
                                        fVar19.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar3)));
                                        break;
                                }
                            }
                        });
                    }
                    boolean zI6 = f.I6(fVar, fVar.f42836l);
                    if (fVar.f42838n.z() && zI6) {
                        View view2 = fVar.A.f178080a;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                        c0 c0Var = fVar.A;
                        final int i30 = 10;
                        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: vg1.r

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                            {
                                this.f178150b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                sd2.f fVar4;
                                androidx.fragment.app.m activity;
                                Intent intentD;
                                switch (i30) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar5 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar5.getActivity()) && fVar5.f42836l != null) {
                                            androidx.fragment.app.m activity2 = fVar5.getActivity();
                                            long unitID = fVar5.f42836l.getUnitID();
                                            SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                            if (activity2 == null) {
                                                aVar.getClass();
                                            } else {
                                                aVar.getClass();
                                                activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar6 = this.f178150b.f42830c;
                                        Intent intentK6 = fVar6.K6(null, fVar6.f42838n.getF178171d());
                                        intentK6.putExtra("GCM_deviceName", fVar6.f42836l.getDisplayName());
                                        fVar6.startActivity(intentK6);
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                        Intent intentK7 = fVar7.K6(null, LteConnectionActivity.class.getName());
                                        intentK7.putExtra("GCM_deviceName", fVar7.f42836l.getDisplayName());
                                        intentK7.putExtra("GCM_deviceUnitID", fVar7.f42836l.getUnitID());
                                        fVar7.startActivity(intentK7);
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                        fVar8.startActivity(fVar8.K6(null, BikeAlarmSettingActivity.class.getName()));
                                        break;
                                    case 4:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar9.getActivity()) && (fVar4 = fVar9.f42836l) != null) {
                                            if (!hk0.p.k(fVar4.getUnitID())) {
                                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar9.getActivity());
                                                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                                aVar2.create().show();
                                            } else {
                                                fVar9.startActivity(fVar9.K6(null, fVar9.f42838n.getF178168a()));
                                            }
                                            break;
                                        }
                                        break;
                                    case 5:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                        fVar10.startActivity(fVar10.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar10.f42838n.getF178181n()));
                                        break;
                                    case 6:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                        fVar11.startActivity(fVar11.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar11.f42838n.getF178181n()));
                                        break;
                                    case 7:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                        Intent intentK8 = fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar12.f42838n.getF178174g());
                                        intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar12.f42836l));
                                        fVar12.startActivity(intentK8);
                                        break;
                                    case 8:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                        fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar13.f42838n.getF178181n()));
                                        break;
                                    case 9:
                                        boolean zF = z10.d1.f();
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                        if (!zF) {
                                            fVar14.startActivity(fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar14.f42838n.getF178176i()));
                                        } else {
                                            Context contextRequireContext = fVar14.requireContext();
                                            contextRequireContext.getClass();
                                            z10.d1.o(contextRequireContext, new xk1.v(12));
                                        }
                                        break;
                                    case 10:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                        fVar15.startActivity(fVar15.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar15.f42838n.getF178181n()));
                                        break;
                                    case 11:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                        if (fVar16.getActivity() != null && (intentD = ar.a.d((activity = fVar16.getActivity()), fVar16.f42832i)) != null) {
                                            activity.startActivity(intentD);
                                            break;
                                        }
                                        break;
                                    case 12:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                        fVar17.startActivity(fVar17.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                        break;
                                    case 13:
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                        if (hb2.i.a(fVar18.getActivity()) && fVar18.f42836l != null) {
                                            MusicSetupActivity.ea(fVar18.getActivity(), fVar18.f42836l.getUnitID(), fVar18.f42836l.getProductDisplayName());
                                            break;
                                        }
                                        break;
                                    default:
                                        GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar19 = this.f178150b.f42830c;
                                        androidx.fragment.app.m activity3 = fVar19.getActivity();
                                        kj0.a.c cVar3 = new kj0.a.c(Long.valueOf(fVar19.f42836l.getUnitID()), fVar19.f42836l.getImageURL(), fVar19.f42836l.getProductDisplayName());
                                        aVar3.getClass();
                                        fVar19.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar3)));
                                        break;
                                }
                            }
                        };
                        View view3 = c0Var.f178080a;
                        if (view3 != null) {
                            view3.setOnClickListener(onClickListener);
                        }
                        g gVar3 = fVar.f42831h;
                        if (gVar3 != null && gVar3.A4(fVar.f42837m, fVar.f42832i)) {
                            fVar.A.a(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                        }
                    }
                    boolean zI = km2.a.i(fVar.f42832i, null, SupportedCapability.FIND_MY_WATCH.ordinal());
                    TextView textView2 = fVar.T;
                    if (zI) {
                        textView2.setVisibility(0);
                        sd2.f fVar4 = fVar.f42836l;
                        if (fVar4 != null) {
                            if (!u0.v(fVar4.getProductNumber()) || fVar.getContext() == null) {
                                u0 u0Var2 = fVar.f42837m;
                                if (u0Var2 == u0.Z2) {
                                    fVar.T.setText(R.string.device_settings_find_my_enduro);
                                } else {
                                    String lowerCase = fVar.f42836l.getApplicationKey().toLowerCase(Locale.ENGLISH);
                                    u0 u0Var3 = u0.V2;
                                    if ((u0Var2 == u0Var3 && lowerCase.contains("tactixdelta")) || u0.f(fVar.f42837m, fVar.f42836l.getApplicationKey())) {
                                        fVar.T.setText(R.string.find_my_tactix_label);
                                    } else if (fVar.f42837m == u0.Y2) {
                                        fVar.T.setText(R.string.device_settings_find_my_instinct);
                                    } else {
                                        sd2.f fVar5 = fVar.f42836l;
                                        u0 u0Var4 = (u0) u0.f203782n6.get(fVar5.getProductNumber());
                                        if ((u0Var4 == u0.T2 || u0Var4 == u0.U2 || u0Var4 == u0Var3 || u0Var4 == u0.W2 || u0Var4 == u0.X2) && fVar5.getApplicationKey().toLowerCase().contains("fenix")) {
                                            fVar.T.setText(R.string.device_settings_find_my_fenix);
                                        }
                                    }
                                }
                            } else {
                                fVar.T.setText(R.string.find_my_edge_label);
                                fVar.X.setVisibility(0);
                                final int i34 = 11;
                                fVar.X.setOnClickListener(new View.OnClickListener(this) { // from class: vg1.r

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                                    {
                                        this.f178150b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view4) {
                                        sd2.f fVar6;
                                        androidx.fragment.app.m activity;
                                        Intent intentD;
                                        switch (i34) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                                if (hb2.i.a(fVar7.getActivity()) && fVar7.f42836l != null) {
                                                    androidx.fragment.app.m activity2 = fVar7.getActivity();
                                                    long unitID = fVar7.f42836l.getUnitID();
                                                    SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                                    if (activity2 == null) {
                                                        aVar.getClass();
                                                    } else {
                                                        aVar.getClass();
                                                        activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                                    }
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                                Intent intentK6 = fVar8.K6(null, fVar8.f42838n.getF178171d());
                                                intentK6.putExtra("GCM_deviceName", fVar8.f42836l.getDisplayName());
                                                fVar8.startActivity(intentK6);
                                                break;
                                            case 2:
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                                Intent intentK7 = fVar9.K6(null, LteConnectionActivity.class.getName());
                                                intentK7.putExtra("GCM_deviceName", fVar9.f42836l.getDisplayName());
                                                intentK7.putExtra("GCM_deviceUnitID", fVar9.f42836l.getUnitID());
                                                fVar9.startActivity(intentK7);
                                                break;
                                            case 3:
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                                fVar10.startActivity(fVar10.K6(null, BikeAlarmSettingActivity.class.getName()));
                                                break;
                                            case 4:
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                                if (hb2.i.a(fVar11.getActivity()) && (fVar6 = fVar11.f42836l) != null) {
                                                    if (!hk0.p.k(fVar6.getUnitID())) {
                                                        androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar11.getActivity());
                                                        aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                                        aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                                        aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                                        aVar2.create().show();
                                                    } else {
                                                        fVar11.startActivity(fVar11.K6(null, fVar11.f42838n.getF178168a()));
                                                    }
                                                    break;
                                                }
                                                break;
                                            case 5:
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                                fVar12.startActivity(fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar12.f42838n.getF178181n()));
                                                break;
                                            case 6:
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                                fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar13.f42838n.getF178181n()));
                                                break;
                                            case 7:
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                                Intent intentK8 = fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar14.f42838n.getF178174g());
                                                intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar14.f42836l));
                                                fVar14.startActivity(intentK8);
                                                break;
                                            case 8:
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                                fVar15.startActivity(fVar15.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar15.f42838n.getF178181n()));
                                                break;
                                            case 9:
                                                boolean zF = z10.d1.f();
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                                if (!zF) {
                                                    fVar16.startActivity(fVar16.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar16.f42838n.getF178176i()));
                                                } else {
                                                    Context contextRequireContext = fVar16.requireContext();
                                                    contextRequireContext.getClass();
                                                    z10.d1.o(contextRequireContext, new xk1.v(12));
                                                }
                                                break;
                                            case 10:
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                                fVar17.startActivity(fVar17.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar17.f42838n.getF178181n()));
                                                break;
                                            case 11:
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                                if (fVar18.getActivity() != null && (intentD = ar.a.d((activity = fVar18.getActivity()), fVar18.f42832i)) != null) {
                                                    activity.startActivity(intentD);
                                                    break;
                                                }
                                                break;
                                            case 12:
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar19 = this.f178150b.f42830c;
                                                fVar19.startActivity(fVar19.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                                break;
                                            case 13:
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar110 = this.f178150b.f42830c;
                                                if (hb2.i.a(fVar110.getActivity()) && fVar110.f42836l != null) {
                                                    MusicSetupActivity.ea(fVar110.getActivity(), fVar110.f42836l.getUnitID(), fVar110.f42836l.getProductDisplayName());
                                                    break;
                                                }
                                                break;
                                            default:
                                                GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                                com.garmin.android.apps.connectmobile.settings.devices.common.f fVar111 = this.f178150b.f42830c;
                                                androidx.fragment.app.m activity3 = fVar111.getActivity();
                                                kj0.a.c cVar3 = new kj0.a.c(Long.valueOf(fVar111.f42836l.getUnitID()), fVar111.f42836l.getImageURL(), fVar111.f42836l.getProductDisplayName());
                                                aVar3.getClass();
                                                fVar111.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar3)));
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    } else {
                        textView2.setVisibility(8);
                    }
                    fVar.w6();
                }
                boolean zI7 = f.I6(fVar, fVar.f42836l);
                z zVar = fVar.f42838n;
                if (zVar != null && zVar.u() && zI7) {
                    fVar.I.d();
                    final int i35 = 12;
                    fVar.I.c(new View.OnClickListener(this) { // from class: vg1.r

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.e f178150b;

                        {
                            this.f178150b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            sd2.f fVar6;
                            androidx.fragment.app.m activity;
                            Intent intentD;
                            switch (i35) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar7 = this.f178150b.f42830c;
                                    if (hb2.i.a(fVar7.getActivity()) && fVar7.f42836l != null) {
                                        androidx.fragment.app.m activity2 = fVar7.getActivity();
                                        long unitID = fVar7.f42836l.getUnitID();
                                        SolarIntensityActivity.a aVar = SolarIntensityActivity.f44787a;
                                        if (activity2 == null) {
                                            aVar.getClass();
                                        } else {
                                            aVar.getClass();
                                            activity2.startActivity(SolarIntensityActivity.a.a(activity2, unitID));
                                        }
                                        break;
                                    }
                                    break;
                                case 1:
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar8 = this.f178150b.f42830c;
                                    Intent intentK6 = fVar8.K6(null, fVar8.f42838n.getF178171d());
                                    intentK6.putExtra("GCM_deviceName", fVar8.f42836l.getDisplayName());
                                    fVar8.startActivity(intentK6);
                                    break;
                                case 2:
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar9 = this.f178150b.f42830c;
                                    Intent intentK7 = fVar9.K6(null, LteConnectionActivity.class.getName());
                                    intentK7.putExtra("GCM_deviceName", fVar9.f42836l.getDisplayName());
                                    intentK7.putExtra("GCM_deviceUnitID", fVar9.f42836l.getUnitID());
                                    fVar9.startActivity(intentK7);
                                    break;
                                case 3:
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar10 = this.f178150b.f42830c;
                                    fVar10.startActivity(fVar10.K6(null, BikeAlarmSettingActivity.class.getName()));
                                    break;
                                case 4:
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar11 = this.f178150b.f42830c;
                                    if (hb2.i.a(fVar11.getActivity()) && (fVar6 = fVar11.f42836l) != null) {
                                        if (!hk0.p.k(fVar6.getUnitID())) {
                                            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(fVar11.getActivity());
                                            aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                                            aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                                            aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                                            aVar2.create().show();
                                        } else {
                                            fVar11.startActivity(fVar11.K6(null, fVar11.f42838n.getF178168a()));
                                        }
                                        break;
                                    }
                                    break;
                                case 5:
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar12 = this.f178150b.f42830c;
                                    fVar12.startActivity(fVar12.K6(DeviceSettingsActivityTrackerSetupDefault.a.APPEARANCE, fVar12.f42838n.getF178181n()));
                                    break;
                                case 6:
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar13 = this.f178150b.f42830c;
                                    fVar13.startActivity(fVar13.K6(DeviceSettingsActivityTrackerSetupDefault.a.SOUND_AND_ALERT, fVar13.f42838n.getF178181n()));
                                    break;
                                case 7:
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar14 = this.f178150b.f42830c;
                                    Intent intentK8 = fVar14.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_OPTIONS, fVar14.f42838n.getF178174g());
                                    intentK8.putExtra("GCM_displayActivitiesMaxLimit", zb0.n0.f(fVar14.f42836l));
                                    fVar14.startActivity(intentK8);
                                    break;
                                case 8:
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar15 = this.f178150b.f42830c;
                                    fVar15.startActivity(fVar15.K6(DeviceSettingsActivityTrackerSetupDefault.a.ACTIVITY_TRACKING, fVar15.f42838n.getF178181n()));
                                    break;
                                case 9:
                                    boolean zF = z10.d1.f();
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar16 = this.f178150b.f42830c;
                                    if (!zF) {
                                        fVar16.startActivity(fVar16.K6(DeviceSettingsActivityTrackerSetupDefault.a.USER_SETTING, fVar16.f42838n.getF178176i()));
                                    } else {
                                        Context contextRequireContext = fVar16.requireContext();
                                        contextRequireContext.getClass();
                                        z10.d1.o(contextRequireContext, new xk1.v(12));
                                    }
                                    break;
                                case 10:
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar17 = this.f178150b.f42830c;
                                    fVar17.startActivity(fVar17.K6(DeviceSettingsActivityTrackerSetupDefault.a.GENERAL_SETTINGS, fVar17.f42838n.getF178181n()));
                                    break;
                                case 11:
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar18 = this.f178150b.f42830c;
                                    if (fVar18.getActivity() != null && (intentD = ar.a.d((activity = fVar18.getActivity()), fVar18.f42832i)) != null) {
                                        activity.startActivity(intentD);
                                        break;
                                    }
                                    break;
                                case 12:
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar19 = this.f178150b.f42830c;
                                    fVar19.startActivity(fVar19.K6(DeviceSettingsActivityTrackerSetupDefault.a.MANAGE_PEOPLE, ManagePeopleActivity.class.getName()));
                                    break;
                                case 13:
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar110 = this.f178150b.f42830c;
                                    if (hb2.i.a(fVar110.getActivity()) && fVar110.f42836l != null) {
                                        MusicSetupActivity.ea(fVar110.getActivity(), fVar110.f42836l.getUnitID(), fVar110.f42836l.getProductDisplayName());
                                        break;
                                    }
                                    break;
                                default:
                                    GarminPayLaunchScreenActivity.a aVar3 = GarminPayLaunchScreenActivity.f35305d;
                                    com.garmin.android.apps.connectmobile.settings.devices.common.f fVar111 = this.f178150b.f42830c;
                                    androidx.fragment.app.m activity3 = fVar111.getActivity();
                                    kj0.a.c cVar3 = new kj0.a.c(Long.valueOf(fVar111.f42836l.getUnitID()), fVar111.f42836l.getImageURL(), fVar111.f42836l.getProductDisplayName());
                                    aVar3.getClass();
                                    fVar111.startActivity(new Intent(GarminPayLaunchScreenActivity.a.a(activity3, cVar3)));
                                    break;
                            }
                        }
                    });
                }
                fVar.P.setVisibility(0);
            }
            if (fVar.H0 || fVar.getArguments() == null || !fVar.getArguments().getBoolean("GCM_extra_find_my_edge_notification", false)) {
                return;
            }
            Context contextRequireContext = fVar.requireContext();
            long j14 = fVar.f42832i;
            int i36 = FindMyWatchActivity.f42782c;
            Intent intent = new Intent(contextRequireContext, (Class<?>) FindMyWatchActivity.class);
            intent.putExtra("GCM_deviceUnitID", j14);
            contextRequireContext.startActivity(intent);
            fVar.H0 = true;
        }
    }
}
