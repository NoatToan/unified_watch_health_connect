package bb2;

import android.R;
import android.os.Handler;
import android.view.View;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.powerguide.PowerGuideListActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.selectworkout.SelectWorkoutActivityActivity;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import g2.v;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Unit;
import ps.v1;
import r22.m0;
import sz0.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17327c;

    public /* synthetic */ b(long j8, Object obj, int i14) {
        this.f17325a = i14;
        this.f17326b = j8;
        this.f17327c = obj;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        ps.m mVar;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        int i14 = this.f17325a;
        int i15 = 2;
        gu0.b bVar = null;
        String strM1 = null;
        be2.g gVar = null;
        long j8 = this.f17326b;
        Object obj2 = this.f17327c;
        switch (i14) {
            case 0:
                c cVar = (c) obj2;
                ud.a aVar = (ud.a) obj;
                c.C0243c c0243c = c.f17328d;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0("SELECT * FROM activity_polyline WHERE activityId = ?");
                try {
                    cVarM0.h(1, j8);
                    int iB = ge1.b.B(cVarM0, "activityId");
                    int iB2 = ge1.b.B(cVarM0, "numberOfPoints");
                    int iB3 = ge1.b.B(cVarM0, "encodedSamples");
                    int iB4 = ge1.b.B(cVarM0, "encodedLevels");
                    int iB5 = ge1.b.B(cVarM0, "maxLat");
                    int iB6 = ge1.b.B(cVarM0, "maxLon");
                    int iB7 = ge1.b.B(cVarM0, "minLat");
                    int iB8 = ge1.b.B(cVarM0, "minLon");
                    int iB9 = ge1.b.B(cVarM0, "startLat");
                    int iB10 = ge1.b.B(cVarM0, "startLon");
                    int iB11 = ge1.b.B(cVarM0, "endLat");
                    int iB12 = ge1.b.B(cVarM0, "endLon");
                    int iB13 = ge1.b.B(cVarM0, "trackLog");
                    if (cVarM0.J0()) {
                        Long lValueOf = cVarM0.isNull(iB) ? null : Long.valueOf(cVarM0.getLong(iB));
                        Integer numValueOf = cVarM0.isNull(iB2) ? null : Integer.valueOf((int) cVarM0.getLong(iB2));
                        String strM2 = cVarM0.isNull(iB3) ? null : cVarM0.M1(iB3);
                        String strM3 = cVarM0.isNull(iB4) ? null : cVarM0.M1(iB4);
                        Double dValueOf = cVarM0.isNull(iB5) ? null : Double.valueOf(cVarM0.getDouble(iB5));
                        Double dValueOf2 = cVarM0.isNull(iB6) ? null : Double.valueOf(cVarM0.getDouble(iB6));
                        Double dValueOf3 = cVarM0.isNull(iB7) ? null : Double.valueOf(cVarM0.getDouble(iB7));
                        Double dValueOf4 = cVarM0.isNull(iB8) ? null : Double.valueOf(cVarM0.getDouble(iB8));
                        Double dValueOf5 = cVarM0.isNull(iB9) ? null : Double.valueOf(cVarM0.getDouble(iB9));
                        Double dValueOf6 = cVarM0.isNull(iB10) ? null : Double.valueOf(cVarM0.getDouble(iB10));
                        Double dValueOf7 = cVarM0.isNull(iB11) ? null : Double.valueOf(cVarM0.getDouble(iB11));
                        Double dValueOf8 = cVarM0.isNull(iB12) ? null : Double.valueOf(cVarM0.getDouble(iB12));
                        String strM4 = cVarM0.isNull(iB13) ? null : cVarM0.M1(iB13);
                        cVar.f17331c.getClass();
                        mVar = new ps.m(lValueOf, numValueOf, strM2, strM3, dValueOf, dValueOf2, dValueOf3, dValueOf4, dValueOf5, dValueOf6, dValueOf7, dValueOf8, (v1) new GsonBuilder().serializeSpecialFloatingPointValues().create().fromJson(strM4, v1.class));
                    } else {
                        mVar = null;
                    }
                    return mVar;
                } finally {
                    cVarM0.close();
                }
            case 1:
                com.garmin.android.apps.connectmobile.onboarding.data.local.a aVar2 = (com.garmin.android.apps.connectmobile.onboarding.data.local.a) obj2;
                ud.a aVar3 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.a.b bVar2 = com.garmin.android.apps.connectmobile.onboarding.data.local.a.f39662d;
                aVar3.getClass();
                ud.c cVarM1 = aVar3.M0("SELECT * FROM device_onboarding_items WHERE deviceId = ?");
                try {
                    cVarM1.h(1, j8);
                    int iB14 = ge1.b.B(cVarM1, "deviceId");
                    int iB15 = ge1.b.B(cVarM1, "deviceRegistrationSortOrder");
                    int iB16 = ge1.b.B(cVarM1, "deviceName");
                    int iB17 = ge1.b.B(cVarM1, "deviceProductNumber");
                    int iB18 = ge1.b.B(cVarM1, "sortOrder");
                    int iB19 = ge1.b.B(cVarM1, NotificationConstants.KEY_DATA_MIME_TYPE);
                    int iB20 = ge1.b.B(cVarM1, "associationType");
                    int iB21 = ge1.b.B(cVarM1, "status");
                    int iB22 = ge1.b.B(cVarM1, "coreItem");
                    int iB23 = ge1.b.B(cVarM1, "reminderDate");
                    int iB24 = ge1.b.B(cVarM1, "deviceImageUrl");
                    ArrayList arrayList = new ArrayList();
                    while (cVarM1.J0()) {
                        long j14 = cVarM1.getLong(iB14);
                        ArrayList arrayList2 = arrayList;
                        int i16 = (int) cVarM1.getLong(iB15);
                        String strM5 = cVarM1.isNull(iB16) ? null : cVarM1.M1(iB16);
                        String strM6 = cVarM1.isNull(iB17) ? null : cVarM1.M1(iB17);
                        int i17 = iB14;
                        int i18 = (int) cVarM1.getLong(iB18);
                        String strM7 = cVarM1.M1(iB19);
                        aVar2.f39665c.getClass();
                        arrayList2.add(new d31.a(j14, i16, strM5, strM6, i18, c31.a.d(strM7), c31.a.a(cVarM1.M1(iB20)), c31.a.c(cVarM1.M1(iB21)), ((int) cVarM1.getLong(iB22)) != 0, c31.a.b(cVarM1.isNull(iB23) ? null : cVarM1.M1(iB23)), cVarM1.isNull(iB24) ? null : cVarM1.M1(iB24)));
                        iB14 = i17;
                        arrayList = arrayList2;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarM1.close();
                }
            case 2:
                cc0.g gVar2 = (cc0.g) obj2;
                DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
                com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
                dc0.a aVar4 = (dc0.a) gVar2.f50097g.get(eVar);
                aVar4.f59106a = deviceSettingsDTO;
                gVar2.i(eVar, aVar4);
                GCMSettingManager.V(j8, deviceSettingsDTO);
                return Unit.INSTANCE;
            case 3:
                eu0.c cVar2 = ((fu0.d) obj2).f73500c;
                ud.a aVar5 = (ud.a) obj;
                fu0.d.b bVar3 = fu0.d.f73497d;
                aVar5.getClass();
                ud.c cVarM2 = aVar5.M0("SELECT * FROM live_event_settings WHERE device_id = ? LIMIT 1");
                try {
                    cVarM2.h(1, j8);
                    int iB25 = ge1.b.B(cVarM2, "device_id");
                    int iB26 = ge1.b.B(cVarM2, "live_event_sharing_on");
                    int iB27 = ge1.b.B(cVarM2, "live_event_end_time_stamp");
                    int iB28 = ge1.b.B(cVarM2, "livetrack_enabled");
                    int iB29 = ge1.b.B(cVarM2, "message_triggers");
                    int iB30 = ge1.b.B(cVarM2, "message_contents");
                    int iB31 = ge1.b.B(cVarM2, "est_target_distance");
                    int iB32 = ge1.b.B(cVarM2, "msg_trigger_distance");
                    int iB33 = ge1.b.B(cVarM2, "msg_trigger_time");
                    if (cVarM2.J0()) {
                        long j15 = cVarM2.getLong(iB25);
                        Integer numValueOf2 = cVarM2.isNull(iB26) ? null : Integer.valueOf((int) cVarM2.getLong(iB26));
                        if (numValueOf2 != null) {
                            boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        Long lValueOf2 = cVarM2.isNull(iB27) ? null : Long.valueOf(cVarM2.getLong(iB27));
                        Integer numValueOf3 = cVarM2.isNull(iB28) ? null : Integer.valueOf((int) cVarM2.getLong(iB28));
                        if (numValueOf3 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        String strM8 = cVarM2.isNull(iB29) ? null : cVarM2.M1(iB29);
                        cVar2.getClass();
                        ArrayList arrayListB = eu0.c.b(strM8);
                        String strM9 = cVarM2.isNull(iB30) ? null : cVarM2.M1(iB30);
                        cVar2.getClass();
                        bVar = new gu0.b(j15, boolValueOf, lValueOf2, boolValueOf2, arrayListB, eu0.c.a(strM9), cVarM2.isNull(iB31) ? null : Integer.valueOf((int) cVarM2.getLong(iB31)), cVarM2.isNull(iB32) ? null : Integer.valueOf((int) cVarM2.getLong(iB32)), cVarM2.isNull(iB33) ? null : Integer.valueOf((int) cVarM2.getLong(iB33)));
                    }
                    return bVar;
                } finally {
                    cVarM2.close();
                }
            case 4:
                v vVar = (v) obj2;
                long jD = g6.k.d(((g6.k) ((s1.b) obj).e()).f76005a, j8);
                v.a aVar6 = v.f75250s;
                vVar.g(jD);
                vVar.f75254c.invoke();
                return Unit.INSTANCE;
            case 5:
                ((Boolean) obj).getClass();
                ((gl1.a) obj2).invoke(Long.valueOf(j8));
                return Unit.INSTANCE;
            case 6:
                e53.j jVar = (e53.j) obj;
                gn1.a aVar7 = gn1.a.f78064a;
                jVar.getClass();
                e53.j jVarB = jVar.b(j8);
                if (jVarB.compareTo((e53.j) obj2) <= 0) {
                    return jVarB;
                }
                return null;
            case 7:
                DeviceSettingsActivity deviceSettingsActivity = (DeviceSettingsActivity) obj2;
                wr2.f fVar = (wr2.f) obj;
                DeviceSettingsActivity.a aVar8 = DeviceSettingsActivity.f51993w;
                if (fVar.getF186856b() == j8) {
                    wr2.g gVar3 = wr2.g.f186857a;
                    View viewFindViewById = deviceSettingsActivity.findViewById(R.id.content);
                    viewFindViewById.getClass();
                    gVar3.getClass();
                    wr2.g.b(viewFindViewById, fVar);
                }
                return Unit.INSTANCE;
            case 8:
                SelectWorkoutActivityActivity selectWorkoutActivityActivity = (SelectWorkoutActivityActivity) obj2;
                WorkoutDTO workoutDTO = (WorkoutDTO) obj;
                SelectWorkoutActivityActivity.a aVar9 = SelectWorkoutActivityActivity.f49549a;
                workoutDTO.getClass();
                WorkoutDetailsActivity.a aVar10 = WorkoutDetailsActivity.f48482f;
                long j16 = workoutDTO.f48040a;
                Long lValueOf3 = Long.valueOf(j8);
                aVar10.getClass();
                selectWorkoutActivityActivity.startActivity(WorkoutDetailsActivity.a.a(selectWorkoutActivityActivity, j16, lValueOf3));
                return Unit.INSTANCE;
            case 9:
                return qr2.e.D4((qr2.e) obj2, j8, (Throwable) obj);
            case 10:
                PowerGuideListActivity powerGuideListActivity = (PowerGuideListActivity) obj2;
                g3 g3Var = (g3) obj;
                int i19 = PowerGuideListActivity.f40349k;
                if (g3Var != null) {
                    int i24 = PowerGuideListActivity.b.f40356a[g3Var.f35300a.ordinal()];
                    if (i24 == 1) {
                        powerGuideListActivity.showProgressOverlay();
                    } else if (i24 == 2) {
                        powerGuideListActivity.hideProgressOverlay();
                        sa1.j jVar2 = powerGuideListActivity.f40353h;
                        String string = powerGuideListActivity.getString(com.garmin.android.apps.connectmobile.R.string.power_guide_send_to_device_msg, jVar2.b(j8));
                        string.getClass();
                        String string2 = powerGuideListActivity.getString(com.garmin.android.apps.connectmobile.R.string.power_guide_title);
                        string2.getClass();
                        m0 m0VarB = m0.a.b(m0.f149759e, string2, string, 256);
                        m0VarB.show(powerGuideListActivity.getSupportFragmentManager(), (String) null);
                        new Handler().postDelayed(new b50.e(m0VarB, i15), 1500L);
                        jVar2.j(powerGuideListActivity, j8, "PowerGuideListActivity");
                    } else {
                        if (i24 != 3) {
                            u0.r();
                            return null;
                        }
                        powerGuideListActivity.hideProgressOverlay();
                        u20.e.u6(-1, com.garmin.android.apps.connectmobile.R.string.power_guide_send_to_the_device_error).g(powerGuideListActivity.getSupportFragmentManager());
                    }
                }
                return Unit.INSTANCE;
            case 11:
                u uVar = (u) obj2;
                int i25 = u.E;
                int i26 = u.b.f161516a[((g3) obj).f35300a.ordinal()];
                if (i26 == 1) {
                    g22.e.f(uVar);
                    g22.e.a(uVar, null);
                } else if (i26 == 2) {
                    g22.e.l(uVar);
                } else {
                    if (i26 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(uVar);
                    uVar.d7().z4(j8, true);
                }
                return Unit.INSTANCE;
            case 12:
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float fS0 = fVar2.s0(j92.b.f97899b.f97918c);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fS0)) << 32) | (((long) Float.floatToRawIntBits(fS0)) & 4294967295L);
                n4.a.C2318a c2318a = n4.a.f123535b;
                q4.f.M0(fVar2, this.f17326b, 0L, 0L, jFloatToRawIntBits, (q4.k) obj2, 0, 230);
                return Unit.INSTANCE;
            case 13:
                wr.g.v("startHeartBeatTimer: ", j8, " sec timer started", ((to2.a) obj2).f165846b);
                return Unit.INSTANCE;
            case 14:
                EditPowerGuideStrategyActivity editPowerGuideStrategyActivity = (EditPowerGuideStrategyActivity) obj2;
                g3 g3Var2 = (g3) obj;
                EditPowerGuideStrategyActivity.a aVar11 = EditPowerGuideStrategyActivity.f40384t;
                if (g3Var2 != null) {
                    int i27 = EditPowerGuideStrategyActivity.b.f40403a[g3Var2.f35300a.ordinal()];
                    if (i27 == 1) {
                        editPowerGuideStrategyActivity.showProgressOverlay();
                    } else if (i27 == 2) {
                        editPowerGuideStrategyActivity.hideProgressOverlay();
                        sa1.j jVar3 = editPowerGuideStrategyActivity.f40397m;
                        String string3 = editPowerGuideStrategyActivity.getString(com.garmin.android.apps.connectmobile.R.string.power_guide_send_to_device_msg, jVar3.b(j8));
                        string3.getClass();
                        String string4 = editPowerGuideStrategyActivity.getString(com.garmin.android.apps.connectmobile.R.string.power_guide_title);
                        string4.getClass();
                        String string5 = editPowerGuideStrategyActivity.getString(com.garmin.android.apps.connectmobile.R.string.common_button_got_it);
                        string5.getClass();
                        androidx.appcompat.app.e eVarShow = new androidx.appcompat.app.e.a(editPowerGuideStrategyActivity).setView(new ya1.m(editPowerGuideStrategyActivity, string4, string3, string5, new wd.c(editPowerGuideStrategyActivity, 20)).a()).show();
                        eVarShow.getClass();
                        editPowerGuideStrategyActivity.f40401q = eVarShow;
                        jVar3.j(editPowerGuideStrategyActivity, j8, "EditPowerGuideStrategyActivity");
                    } else {
                        if (i27 != 3) {
                            u0.r();
                            return null;
                        }
                        editPowerGuideStrategyActivity.hideProgressOverlay();
                        u20.e.u6(-1, com.garmin.android.apps.connectmobile.R.string.power_guide_send_to_the_device_error).g(editPowerGuideStrategyActivity.getSupportFragmentManager());
                    }
                }
                return Unit.INSTANCE;
            default:
                zd2.h hVar = (zd2.h) obj2;
                ud.a aVar12 = (ud.a) obj;
                zd2.h.c cVar3 = zd2.h.f204240e;
                aVar12.getClass();
                ud.c cVarM3 = aVar12.M0("SELECT * FROM session_info where device_unit_id = ?");
                try {
                    cVarM3.h(1, j8);
                    int iB34 = ge1.b.B(cVarM3, "device_unit_id");
                    int iB35 = ge1.b.B(cVarM3, "name");
                    int iB36 = ge1.b.B(cVarM3, "publisher_id");
                    int iB37 = ge1.b.B(cVarM3, "publisher_type");
                    int iB38 = ge1.b.B(cVarM3, "device_driven");
                    int iB39 = ge1.b.B(cVarM3, "should_stop_on_device");
                    int iB40 = ge1.b.B(cVarM3, "group_track_session_id");
                    int iB41 = ge1.b.B(cVarM3, "activity_type");
                    int iB42 = ge1.b.B(cVarM3, "activity_created_time");
                    int iB43 = ge1.b.B(cVarM3, "sharing_errors");
                    if (cVarM3.J0()) {
                        long j17 = cVarM3.getLong(iB34);
                        String strM10 = cVarM3.M1(iB35);
                        String strM11 = cVarM3.M1(iB36);
                        String strM12 = cVarM3.M1(iB37);
                        boolean z14 = ((int) cVarM3.getLong(iB38)) != 0;
                        boolean z15 = ((int) cVarM3.getLong(iB39)) != 0;
                        String strM13 = cVarM3.isNull(iB40) ? null : cVarM3.M1(iB40);
                        String strM14 = cVarM3.isNull(iB41) ? null : cVarM3.M1(iB41);
                        Long lValueOf4 = cVarM3.isNull(iB42) ? null : Long.valueOf(cVarM3.getLong(iB42));
                        if (!cVarM3.isNull(iB43)) {
                            strM1 = cVarM3.M1(iB43);
                        }
                        hVar.f204243c.getClass();
                        gVar = new be2.g(j17, strM10, strM11, strM12, z14, z15, strM13, strM14, lValueOf4, (List) new Gson().fromJson(strM1, new be2.c().getType()));
                    }
                    return gVar;
                } finally {
                    cVarM3.close();
                }
        }
    }

    public /* synthetic */ b(Object obj, long j8, int i14) {
        this.f17325a = i14;
        this.f17327c = obj;
        this.f17326b = j8;
    }
}
