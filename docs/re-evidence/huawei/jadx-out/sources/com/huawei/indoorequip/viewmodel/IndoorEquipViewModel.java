package com.huawei.indoorequip.viewmodel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.device.datatype.IntermitentJumpData;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.health.sportservice.SportBleStatus;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.indoorequip.datastruct.QrCodeOrNfcInfo;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.viewmodel.IndoorEquipViewModel;
import com.huawei.openalliance.ad.constant.ErrorCode;
import defpackage.dmg;
import defpackage.dsm;
import defpackage.gze;
import defpackage.gzv;
import defpackage.jah;
import defpackage.mgi;
import defpackage.nwa;
import defpackage.nwc;
import defpackage.nxs;
import defpackage.nzc;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class IndoorEquipViewModel extends IndoorConnectViewModel implements SportBleStatus, SportDataNotify, Handler.Callback {
    protected boolean l;
    protected boolean o;
    private int y;
    private boolean r = false;
    private boolean x = false;
    private boolean p = false;
    private int k = 0;
    private boolean s = true;
    private boolean q = true;
    private boolean v = false;
    private HashMap<String, Object> t = new HashMap<>();

    public static /* synthetic */ void c(int i, Object obj) {
    }

    @Override // com.huawei.indoorequip.viewmodel.IndoorConnectViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initFragment() {
    }

    public void b(SportLaunchParams sportLaunchParams, boolean z, Handler handler) {
        Bundle bundle = new Bundle();
        if (sportLaunchParams != null) {
            bundle.putInt("deviceType", sportLaunchParams.getSportType());
            bundle.putInt("sport_target_type_sportting", sportLaunchParams.getSportTarget());
            bundle.putInt("origintarget", sportLaunchParams.getTrackType());
            bundle.putFloat("sport_target_value_sportting", sportLaunchParams.getTargetValue());
            bundle.putInt("sport_data_source_sportting", 5);
            this.e = nwa.n();
            sportLaunchParams.setDataSource(5);
            sportLaunchParams.addExtra("origintarget", Integer.valueOf(sportLaunchParams.getSportTarget()));
            sportLaunchParams.setNeedRestart(true);
            bundle.putParcelable("bundle_key_sport_launch_paras", sportLaunchParams);
        }
        bundle.putBoolean("ExitApp", z);
        super.c(bundle, handler);
        addSportDataMap("showSportTime");
        addSportDataMap("sportTotalDistance");
        this.mSportDataOutputApi.registerSportBleStatus(getTag(), this);
        observeSportLifeCycle(getTag(), this);
        b(sportLaunchParams);
        if (sportLaunchParams != null) {
            this.l = mgi.d("Track_IndoorEquipViewModel") != null;
            this.r = d(sportLaunchParams.getSportType());
            boolean zE = jah.e();
            this.x = zE;
            this.o = this.l || this.r || zE;
            this.k = b(sportLaunchParams.getSportType());
            this.p = (this.r || this.l || !this.x) ? false : true;
            if (sportLaunchParams.getSportType() != 283) {
                return;
            }
            EcologyDeviceApi ecologyDeviceApi = (EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class);
            if (ecologyDeviceApi.isSupportPerformanceByProductId(dmg.a().getProductId())) {
                ecologyDeviceApi.requestPerformanceRank(new IBaseResponseCallback() { // from class: nzt
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        IndoorEquipViewModel.c(i, obj);
                    }
                });
            }
        }
    }

    private void b(SportLaunchParams sportLaunchParams) {
        if (this.n == null || sportLaunchParams == null || this.mSportDataOutputApi == null || sportLaunchParams.isRestart()) {
            return;
        }
        if (((Boolean) sportLaunchParams.getExtra("KEY_IS_SWITCH_TO_HORIZONTAL_SCREEN", Boolean.class, false)).booleanValue()) {
            this.y = ((Integer) sportLaunchParams.getExtra("key_progress", Integer.class, 0)).intValue();
            return;
        }
        if (c()) {
            nzc.a(BaseApplication.b(), "rope_launch", l());
        }
        this.mSportDataOutputApi.addDeviceStatusCallback(getTag(), new nwc(this.n));
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void requestLocalData() {
        super.requestLocalData();
        postValue("sportTotalDistance", 0);
        postValue("showSportTime", UnitUtil.b(0));
    }

    @Override // com.huawei.indoorequip.viewmodel.IndoorConnectViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public List<String> getSubscribeTagList() {
        return x();
    }

    private List<String> x() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("TIME_ONE_SECOND_DURATION");
        arrayList.add("UPDATE_VIEW_SIGNAL");
        arrayList.add("CALORIES_DATA");
        arrayList.add("HEART_RATE_DATA");
        arrayList.add("INDOOR_DEVICE_INFO_DATA");
        if (getTargetValue() != 6.0f) {
            arrayList.add("PROGRESS_DATA");
        }
        int sportType = getSportType();
        if (sportType == 264) {
            d(arrayList);
            return arrayList;
        }
        if (sportType == 265) {
            c(arrayList);
            return arrayList;
        }
        if (sportType == 273) {
            c(arrayList);
            arrayList.add("STEP_DATA");
            arrayList.add("STEP_RATE_DATA");
            return arrayList;
        }
        if (sportType == 274) {
            a(arrayList);
            return arrayList;
        }
        if (sportType == 281) {
            e(arrayList);
            return arrayList;
        }
        if (sportType != 283) {
            return arrayList;
        }
        b(arrayList);
        return arrayList;
    }

    private void a(List<String> list) {
        if (y()) {
            list.add("WEIGHT_DATA");
            list.add("ACTION_GROUP_DATA");
            list.add("GROUP_COUNT_DATA");
        } else {
            list.add("DISTANCE_DATA");
            list.add("SPEED_DATA");
            list.add("PACE_DATA");
            list.add("RESISTANCE_LEVEL_DATA");
        }
        list.add("TEMPO_DATA");
        list.add("POWER_DATA");
        list.add("PADDLE_DATA");
    }

    private void c(List<String> list) {
        list.add("DISTANCE_DATA");
        list.add("SPEED_DATA");
        list.add("CADENCE_DATA");
        list.add("PACE_DATA");
        list.add("POWER_DATA");
        list.add("RESISTANCE_LEVEL_DATA");
    }

    private void e(List<String> list) {
        list.add("DISTANCE_DATA");
        list.add("SPEED_DATA");
        list.add("STEP_DATA");
        list.add("STEP_RATE_DATA");
        list.add("PACE_DATA");
    }

    private void d(List<String> list) {
        list.add("DISTANCE_DATA");
        list.add("SPEED_DATA");
        list.add("RUNNING_POSTURE_DATA");
        list.add("STEP_DATA");
        list.add("STEP_RATE_DATA");
        list.add("PACE_DATA");
    }

    private void b(List<String> list) {
        list.add("SKIP_NUM_DATA");
        list.add("SKIP_SPEED_DATA");
        list.add("STUMBLING_ROPE_DATA");
        list.add("CONTINUOUS_SKIPPING_JUMP_DATA");
        list.add("SKIPPING_AVG_SPEED_DATA");
        list.add("ROPE_SKIPPING_MODE_DATA");
        list.add("ROPE_INTERMITTENT_GROUP_NO_DATA");
        list.add("ROPE_SKIPPING_TRICK_DATA");
        list.add("ROPE_MACHINE_STATUS_DATA");
        list.add("SKIPPING_INTERMITTENT_SPORT_TIME_DATA");
        list.add("SKIPPING_INTERMITTENT_REST_TIME_DATA");
        list.add("SKIPPING_ACCUMULATED_COUNT_DATA");
        list.add("SKIPPING_ACCUMULATED_DURATION_DATA");
        list.add("ROPE_INTERMITTENT_JUMP_ENERGY_DATA");
        list.add("ROPE_INTERMITTENT_JUMP_SPEED_DATA");
        list.add("ROPE_ACCUMULATED_ENERGY_DATA");
    }

    @Override // com.huawei.indoorequip.viewmodel.IndoorConnectViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initReceivedDataHandlers() {
        b("UPDATE_VIEW_SIGNAL", "showSportTime", Integer.class, new IndoorConnectViewModel.DataChangeHandle() { // from class: nzo
            @Override // com.huawei.indoorequip.viewmodel.IndoorConnectViewModel.DataChangeHandle
            public final void changeHandle(Object obj, Map map) {
                this.d.e((Integer) obj, map);
            }
        });
        b("TIME_ONE_SECOND_DURATION", "showSportTime", Long.class, new IndoorConnectViewModel.DataChangeHandle() { // from class: nzs
            @Override // com.huawei.indoorequip.viewmodel.IndoorConnectViewModel.DataChangeHandle
            public final void changeHandle(Object obj, Map map) {
                this.f44008b.a((Long) obj, map);
            }
        });
        b("SKIP_NUM_DATA", "sportSkipNum", Integer.class, new IndoorConnectViewModel.DataChangeHandle() { // from class: nzr
            @Override // com.huawei.indoorequip.viewmodel.IndoorConnectViewModel.DataChangeHandle
            public final void changeHandle(Object obj, Map map) {
                this.f44007a.a((Integer) obj, map);
            }
        });
        c("SPEED_DATA", "sportSpeed", Integer.class);
        c("RESISTANCE_LEVEL_DATA", "sportResistanceLevel", Integer.class);
    }

    public /* synthetic */ void e(Integer num, Map map) {
        LogUtil.a("Track_IndoorEquipViewModel", "addUpdateViewSignalDataHandler ", num);
        a((Map<String, Object>) map, 0L);
        e(num);
    }

    public /* synthetic */ void a(Long l, Map map) {
        int iRound = Math.round((l.longValue() * 1.0f) / 1000.0f);
        LogUtil.a("Track_IndoorEquipViewModel", "sportTime=", Integer.valueOf(iRound), " allData.size ", Integer.valueOf(map.size()), map.toString());
        if (this.e != null) {
            int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.e.l()) / 1000);
            if (iCurrentTimeMillis <= 1) {
                a(iRound);
            }
            if (iCurrentTimeMillis <= 1 && b() && getTargetSportStatus() == 2) {
                v();
            }
        }
        Object obj = map.get("SKIP_NUM_DATA");
        if (obj != null) {
            this.f = ((Integer) obj).intValue();
        }
        a((Map<String, Object>) map, 0L);
    }

    public /* synthetic */ void a(Integer num, Map map) {
        Object obj = map.get("SKIP_NUM_DATA");
        if (obj != null) {
            this.f = ((Integer) obj).intValue();
        }
        if ((getSportTarget() == 5 && this.f == getTargetValue()) || u()) {
            a((Map<String, Object>) map, 0L);
        }
    }

    private boolean u() {
        IntermitentJumpData intermitentJumpData = (IntermitentJumpData) getExtraValue("type_intermittent_jump_mode_data", IntermitentJumpData.class);
        return intermitentJumpData != null && getSportTarget() == 8 && intermitentJumpData.getIntermittentJumpMode() == 0 && intermitentJumpData.getIntermittentJumpExerciseNum() == this.f;
    }

    private <T> void c(String str, String str2, Class<T> cls) {
        b(str, str2, cls, new IndoorConnectViewModel.DataChangeHandle() { // from class: nzp
            @Override // com.huawei.indoorequip.viewmodel.IndoorConnectViewModel.DataChangeHandle
            public final void changeHandle(Object obj, Map map) {
                this.e.d(obj, map);
            }
        });
    }

    public /* synthetic */ void d(Object obj, Map map) {
        if (this.mSportDataOutputApi == null || this.mSportDataOutputApi.getStatus() != 2) {
            return;
        }
        a((Map<String, Object>) map, 0L);
    }

    private void e(Integer num) {
        if (num.intValue() == 27) {
            LogUtil.a("Track_IndoorEquipViewModel", "handleRefreshView");
            if (this.n != null) {
                Message messageObtainMessage = this.n.obtainMessage();
                messageObtainMessage.what = 1017;
                this.n.sendMessage(messageObtainMessage);
            }
        }
    }

    private void a(Map<String, Object> map, long j) {
        HashMap map2 = new HashMap();
        map2.put(2, Integer.valueOf(Math.round(((map.get("TIME_ONE_SECOND_DURATION") instanceof Integer ? 0L : ((Long) map.get("TIME_ONE_SECOND_DURATION")).longValue()) * 1.0f) / 1000.0f)));
        map2.put(1, map.get("DISTANCE_DATA"));
        map2.put(20004, map.get("HEART_RATE_DATA"));
        map2.put(6, map.get("CALORIES_DATA"));
        map2.put(8, map.get("STEP_DATA"));
        map2.put(4, map.get("STEP_RATE_DATA"));
        map2.put(3, map.get("SPEED_DATA"));
        Object obj = map.get("INDOOR_DEVICE_INFO_DATA");
        if (obj instanceof DeviceInformation) {
            this.f17833a = (DeviceInformation) obj;
        }
        Object obj2 = map.get("RUNNING_POSTURE_DATA");
        if (obj2 instanceof gzv) {
            map2.put(20002, obj2);
        }
        e(map, map2);
        map2.put(26, map.get("TEMPO_DATA"));
        map2.put(31, map.get("CADENCE_DATA"));
        map2.put(7, map.get("POWER_DATA"));
        b(map, map2);
        map2.put(22, map.get("RESISTANCE_LEVEL_DATA"));
        map2.put(10003, Integer.valueOf(this.y));
        c(map, map2);
        a(map);
        if (this.n != null) {
            Message messageObtainMessage = this.n.obtainMessage();
            messageObtainMessage.obj = map2;
            messageObtainMessage.what = 1014;
            this.n.sendMessageDelayed(messageObtainMessage, j);
        }
    }

    private void e(Map<String, Object> map, Map<Integer, Object> map2) {
        int iIntValue;
        if (getSportType() == 264 || getSportType() == 275) {
            Integer num = (Integer) map.get("SPEED_DATA");
            int iIntValue2 = num.intValue();
            float f = iIntValue2;
            if (iIntValue2 != 0) {
                iIntValue = new BigDecimal(3600).divide(new BigDecimal(f).divide(new BigDecimal(100), 2, 4), 2, 4).multiply(new BigDecimal(100)).intValue();
            } else {
                iIntValue = 0;
            }
            LogUtil.a("Track_IndoorEquipViewModel", "mpace is ", Integer.valueOf(iIntValue), "and speed  :", num);
            map2.put(14, Integer.valueOf(iIntValue));
            return;
        }
        map2.put(14, map.get("PACE_DATA"));
    }

    private void c(Map<String, Object> map, Map<Integer, Object> map2) {
        map2.put(40001, map.get("SKIP_NUM_DATA"));
        map2.put(40004, map.get("SKIP_SPEED_DATA"));
        map2.put(40002, map.get("STUMBLING_ROPE_DATA"));
        map2.put(40003, map.get("CONTINUOUS_SKIPPING_JUMP_DATA"));
        map2.put(Integer.valueOf(SmartMsgConstant.MSG_TYPE_BLOOD_SUGAR_USER), map.get("SKIPPING_AVG_SPEED_DATA"));
        map2.put(40009, map.get("ROPE_SKIPPING_MODE_DATA"));
        map2.put(40012, map.get("ROPE_SKIPPING_TRICK_DATA"));
        map2.put(10003, Integer.valueOf(this.y));
        a(map, map2);
        d(map, map2);
    }

    private void a(Map<String, Object> map, Map<Integer, Object> map2) {
        Object obj = map.get("ROPE_SKIPPING_TRICK_DATA");
        if (obj instanceof dsm) {
            dsm dsmVar = (dsm) obj;
            map2.put(40063, Integer.valueOf(dsmVar.e()));
            map2.put(40064, Integer.valueOf(dsmVar.d()));
            map2.put(40065, Integer.valueOf(dsmVar.c()));
        }
    }

    private void d(Map<String, Object> map, Map<Integer, Object> map2) {
        if (map == null || map2 == null || getSportType() != 283 || getSportTarget() != 8) {
            return;
        }
        Integer num = (Integer) map.get("ROPE_MACHINE_STATUS_DATA");
        int iIntValue = num.intValue();
        this.s = iIntValue != 2;
        map2.put(40015, Boolean.valueOf(this.s));
        Integer num2 = (Integer) map.get("ROPE_INTERMITTENT_GROUP_NO_DATA");
        num2.intValue();
        map2.put(40011, num2);
        Integer num3 = (Integer) map.get("ROPE_INTERMITTENT_JUMP_SPEED_DATA");
        num3.intValue();
        map2.put(40059, num3);
        Integer num4 = (Integer) map.get("ROPE_INTERMITTENT_JUMP_ENERGY_DATA");
        num4.intValue();
        map2.put(40057, num4);
        Integer num5 = (Integer) map.get("SKIP_NUM_DATA");
        int iIntValue2 = num5.intValue();
        map2.put(40016, num5);
        if (iIntValue == 2) {
            Integer num6 = (Integer) map.get("SKIPPING_ACCUMULATED_COUNT_DATA");
            num6.intValue();
            map2.put(40013, num6);
            Integer num7 = (Integer) map.get("SKIPPING_ACCUMULATED_DURATION_DATA");
            num7.intValue();
            map2.put(40014, num7);
            Integer num8 = (Integer) map.get("ROPE_ACCUMULATED_ENERGY_DATA");
            num8.intValue();
            map2.put(40058, num8);
        }
        Integer num9 = (Integer) map.get("SKIPPING_INTERMITTENT_SPORT_TIME_DATA");
        int iIntValue3 = num9.intValue();
        map2.put(40051, num9);
        Integer num10 = (Integer) map.get("SKIPPING_INTERMITTENT_REST_TIME_DATA");
        int iIntValue4 = num10.intValue();
        map2.put(40052, num10);
        e(map2, iIntValue2, iIntValue3, iIntValue4);
        LogUtil.a("Track_IndoorEquipViewModel", "putRopeIntermittentData no=", num2, " ropeStatus:", num, " sportTime:", num9, " restTime:", num10);
    }

    private void e(Map<Integer, Object> map, int i, int i2, int i3) {
        float f;
        int intermittentJumpBreakTime;
        IntermitentJumpData intermitentJumpData = (IntermitentJumpData) getExtraValue("type_intermittent_jump_mode_data", IntermitentJumpData.class);
        if (this.s) {
            if (intermitentJumpData.getIntermittentJumpMode() == 0) {
                f = i * 1.0f;
                intermittentJumpBreakTime = intermitentJumpData.getIntermittentJumpExerciseNum();
            } else {
                f = i2 * 1.0f;
                intermittentJumpBreakTime = intermitentJumpData.getIntermittentJumpExerciseTime();
            }
        } else {
            f = i3 * 1.0f;
            intermittentJumpBreakTime = intermitentJumpData.getIntermittentJumpBreakTime();
        }
        this.y = (int) ((f / intermittentJumpBreakTime) * 100.0f);
        map.put(10003, Integer.valueOf(this.y));
        LogUtil.a("Track_IndoorEquipViewModel", "updataProgress mProgress = ", Integer.valueOf(this.y), " skippingNum = ", Integer.valueOf(i), " sportTime = ", Integer.valueOf(i2), " restTime = ", Integer.valueOf(i3));
    }

    private void b(Map<String, Object> map, Map<Integer, Object> map2) {
        if (y()) {
            map2.put(38, map.get("PADDLE_DATA"));
            Object obj = map.get("WEIGHT_DATA");
            int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
            if (UnitUtil.f()) {
                iIntValue = (int) Math.round(UnitUtil.h(iIntValue));
            }
            map2.put(37, Integer.valueOf(iIntValue));
            map2.put(40, map.get("GROUP_COUNT_DATA"));
            map2.put(39, map.get("ACTION_GROUP_DATA"));
            return;
        }
        map2.put(27, map.get("PADDLE_DATA"));
    }

    private void a(Map<String, Object> map) {
        Integer num = (Integer) map.get("HEART_RATE_DATA");
        if (num.intValue() > 0 && !this.v) {
            nzc.d(BaseApplication.b(), l());
            this.v = true;
            LogUtil.a("Track_IndoorEquipViewModel", "tickRopeHearRate heartRate =", num);
        }
    }

    public void w() {
        if (this.mSportDataOutputApi == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : x()) {
            linkedHashMap.put(str, this.mSportDataOutputApi.getData(str));
        }
        a(linkedHashMap, 100L);
        d(this.y, 100);
    }

    private boolean d(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(554);
        return i == 264 && this.mSportDataOutputApi != null && this.mSportDataOutputApi.connectSubDeviceStatus(arrayList).get(0).intValue() > 0;
    }

    private int b(int i) {
        if (i != 264 || this.mSportDataOutputApi == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(554);
        return this.mSportDataOutputApi.connectSubDeviceStatus(arrayList).get(0).intValue();
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sport.ITargetUpdateListener
    public void onTargetDataUpdate(gze gzeVar) {
        if (gzeVar != null) {
            this.y = (int) (gzeVar.b() * 100.0f);
        }
        d(this.y, 0);
    }

    private void d(int i, int i2) {
        if (this.n != null) {
            Message messageObtainMessage = this.n.obtainMessage();
            messageObtainMessage.obj = Integer.valueOf(i);
            messageObtainMessage.what = 1016;
            this.n.sendMessageDelayed(messageObtainMessage, i2);
        }
    }

    public int n() {
        return this.y;
    }

    private void a(int i) {
        if (this.n == null || i < 15 || c()) {
            return;
        }
        LogUtil.j("Track_IndoorEquipViewModel", "not start from zero, will show dialog (if allowed)", Integer.valueOf(i));
        this.n.sendEmptyMessageDelayed(TypedValues.PositionType.TYPE_PERCENT_Y, 2000L);
    }

    private void v() {
        LogUtil.a("Track_IndoorEquipViewModel", "sendStartOverTargetMessage");
        this.n.sendEmptyMessageDelayed(515, 2500L);
    }

    public boolean t() {
        return this.l;
    }

    public boolean r() {
        return this.o;
    }

    public boolean p() {
        return this.r;
    }

    public boolean q() {
        return this.p;
    }

    public int o() {
        return this.k;
    }

    @Override // com.huawei.indoorequip.viewmodel.IndoorConnectViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        if (c()) {
            dmg.a().requestDeviceInfoAndState("SportService_EcologyManager");
        }
        super.onPreSport();
    }

    @Override // com.huawei.indoorequip.viewmodel.IndoorConnectViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public String getTag() {
        return "Track_IndoorEquipViewModel";
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onStateChanged(String str) {
        a(str);
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onConnecting() {
        if (this.n != null) {
            this.n.sendEmptyMessage(301);
        }
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onConnected() {
        if (this.n != null) {
            this.n.sendEmptyMessage(305);
        }
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onReconnecting() {
        if (this.n != null) {
            this.n.sendEmptyMessage(307);
        }
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onRechecking() {
        if (this.n != null) {
            this.n.sendEmptyMessage(309);
        }
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onInterrupted() {
        if (this.n != null) {
            this.n.sendEmptyMessage(304);
        }
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        super.m825x32b3e3a1();
        if (!this.f17835c) {
            a(true, true);
        }
        this.e.c(false);
        LogUtil.a("Track_IndoorEquipViewModel", "onStopSport()");
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        super.onPauseSport();
        if (c()) {
            w();
        }
        LogUtil.a("Track_IndoorEquipViewModel", "onPauseSport()");
    }

    @Override // com.huawei.indoorequip.viewmodel.IndoorConnectViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        e(this.q);
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.IHeartRateControlCallback
    public void onStatusUpdate(int i) {
        if (this.n != null) {
            Message messageObtainMessage = this.n.obtainMessage();
            messageObtainMessage.obj = Integer.valueOf(i);
            messageObtainMessage.what = ErrorCode.ERROR_PLACEMENT_EMPTY_AD_IDS;
            this.n.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.IHeartRateControlCallback
    public void onDataUpdate(Object obj) {
        if (obj == null) {
            LogUtil.j("Track_IndoorEquipViewModel", "onDataUpdate data is null");
            return;
        }
        if (this.n != null) {
            Message messageObtainMessage = this.n.obtainMessage();
            messageObtainMessage.obj = obj;
            messageObtainMessage.what = 801;
            this.n.sendMessage(messageObtainMessage);
            HashMap map = (HashMap) obj;
            if (map.containsKey("COURSE_NAME_LIST")) {
                this.t.putAll(map);
            }
            if (map.containsKey("CURRENT_STAGE_NUMBER")) {
                this.t.putAll(map);
            }
        }
    }

    public HashMap<String, Object> m() {
        return this.t;
    }

    public void b(SportParamsType sportParamsType, int i) {
        this.mSportDataOutputApi.setParas(sportParamsType, Integer.valueOf(i));
    }

    public void a(boolean z) {
        this.q = z;
    }

    public void b(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            boolean z = extras.getBoolean("KEY_TO_GET_HAS_NOT_DISCONNECTED", false);
            boolean z2 = extras.getBoolean("KEY_TO_GET_ALLOW_TO_SHOW_UI", false);
            this.i = extras.getBoolean("KEY_TO_GET_STOP_SIGNAL_FROM_WEARABLE", false);
            LogUtil.a("Track_IndoorEquipViewModel", "is it stop from wearable?", Boolean.valueOf(this.i));
            a(z, z2);
        }
    }

    public void d(String str, String str2) {
        if (this.h == null) {
            this.h = new QrCodeOrNfcInfo();
        }
        this.h.setBtMac(str);
        this.h.setBtName(str2);
    }

    public boolean y() {
        return s().equals("291");
    }

    public String s() {
        SportLaunchParams sportLaunchParams;
        if (this.mSportDataOutputApi == null || (sportLaunchParams = (SportLaunchParams) this.mSportDataOutputApi.getParas(SportParamsType.SPORT_LAUNCH_PARAS)) == null) {
            return "";
        }
        String str = (String) sportLaunchParams.getExtra("sportMode", String.class);
        LogUtil.a("Track_IndoorEquipViewModel", "getSportMode() sportMode = ", str);
        return str == null ? "" : str;
    }

    public void b(SupportDataRange supportDataRange) {
        this.g = supportDataRange;
        LogUtil.a("Track_IndoorEquipViewModel", "mSupportDataRange max ", Integer.valueOf(this.g.getMaxLevel()), Integer.valueOf(this.g.getMinLevel()));
    }

    public String l() {
        if (TextUtils.isEmpty(this.j)) {
            this.j = c() ? dmg.a().getCurrentMacAddress() : nxs.d().c();
        }
        return this.j;
    }
}
