package com.huawei.indoorequip.viewmodel;

import android.os.Bundle;
import com.huawei.health.sportservice.SportBleStatus;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.gze;
import defpackage.hcd;
import defpackage.nwa;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes40.dex */
public class BackgroundSportViewModel extends IndoorConnectViewModel implements SportBleStatus, SportDataNotify {
    private int l;

    @Override // com.huawei.indoorequip.viewmodel.IndoorConnectViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initFragment() {
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onStateChanged(String str) {
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sport.ITargetUpdateListener
    public void onTargetDataUpdate(gze gzeVar) {
    }

    public void e(SportLaunchParams sportLaunchParams) {
        Bundle bundle = new Bundle();
        if (sportLaunchParams != null) {
            bundle.putInt("deviceType", sportLaunchParams.getSportType());
            this.l = sportLaunchParams.getSportType();
            bundle.putInt("sport_target_type_sportting", sportLaunchParams.getSportTarget());
            bundle.putInt("origintarget", sportLaunchParams.getTrackType());
            bundle.putFloat("sport_target_value_sportting", sportLaunchParams.getTargetValue());
            bundle.putInt("sport_data_source_sportting", 5);
            sportLaunchParams.setDataSource(5);
            sportLaunchParams.addExtra("origintarget", Integer.valueOf(sportLaunchParams.getSportTarget()));
            sportLaunchParams.setNeedRestart(true);
            bundle.putParcelable("bundle_key_sport_launch_paras", sportLaunchParams);
        }
        this.e = nwa.n();
        super.init(bundle);
        this.mSportDataOutputApi.registerSportBleStatus(getTag(), this);
        if (hcd.f36390a.contains(Integer.valueOf(this.l))) {
            this.mSportDataOutputApi.registerDeviceDataCallback(this.e.q());
        } else {
            this.mSportDataOutputApi.registerDeviceDataCallback(this.e.o());
        }
        observeSportLifeCycle(getTag(), this);
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void requestLocalData() {
        super.requestLocalData();
    }

    @Override // com.huawei.indoorequip.viewmodel.IndoorConnectViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public List<String> getSubscribeTagList() {
        return o();
    }

    private List<String> o() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("TIME_ONE_SECOND_DURATION");
        arrayList.add("CALORIES_DATA");
        arrayList.add("HEART_RATE_DATA");
        if (getTargetValue() != 6.0f) {
            arrayList.add("PROGRESS_DATA");
        }
        int sportType = getSportType();
        if (sportType == 264) {
            j(arrayList);
            return arrayList;
        }
        if (sportType == 265) {
            c(arrayList);
            return arrayList;
        }
        if (sportType == 273) {
            d(arrayList);
            return arrayList;
        }
        if (sportType == 274) {
            e(arrayList);
            return arrayList;
        }
        if (sportType == 281) {
            b(arrayList);
            return arrayList;
        }
        if (sportType != 283) {
            return arrayList;
        }
        a(arrayList);
        return arrayList;
    }

    private void e(List<String> list) {
        list.add("DISTANCE_DATA");
        list.add("SPEED_DATA");
        list.add("PACE_DATA");
        list.add("TEMPO_DATA");
        list.add("POWER_DATA");
        list.add("PADDLE_DATA");
        list.add("RESISTANCE_LEVEL_DATA");
    }

    private void d(List<String> list) {
        list.add("DISTANCE_DATA");
        list.add("SPEED_DATA");
        list.add("CADENCE_DATA");
        list.add("PACE_DATA");
        list.add("POWER_DATA");
        list.add("RESISTANCE_LEVEL_DATA");
        list.add("STEP_DATA");
        list.add("STEP_RATE_DATA");
    }

    private void c(List<String> list) {
        list.add("DISTANCE_DATA");
        list.add("SPEED_DATA");
        list.add("CADENCE_DATA");
        list.add("PACE_DATA");
        list.add("POWER_DATA");
        list.add("RESISTANCE_LEVEL_DATA");
    }

    private void b(List<String> list) {
        list.add("DISTANCE_DATA");
        list.add("SPEED_DATA");
        list.add("STEP_DATA");
        list.add("STEP_RATE_DATA");
    }

    private void j(List<String> list) {
        list.add("DISTANCE_DATA");
        list.add("SPEED_DATA");
        list.add("RUNNING_POSTURE_DATA");
        list.add("STEP_DATA");
        list.add("STEP_RATE_DATA");
    }

    private void a(List<String> list) {
        list.add("SKIP_NUM_DATA");
        list.add("SKIP_SPEED_DATA");
        list.add("STUMBLING_ROPE_DATA");
        list.add("CONTINUOUS_SKIPPING_JUMP_DATA");
        list.add("SKIPPING_AVG_SPEED_DATA");
    }

    @Override // com.huawei.indoorequip.viewmodel.IndoorConnectViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public String getTag() {
        return "Track_BackgroundSportViewModel";
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onConnecting() {
        LogUtil.a("Track_BackgroundSportViewModel", "onConnecting");
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onConnected() {
        LogUtil.a("Track_BackgroundSportViewModel", "onConnected");
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onReconnecting() {
        LogUtil.a("Track_BackgroundSportViewModel", "onReconnecting");
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onRechecking() {
        LogUtil.a("Track_BackgroundSportViewModel", "onRechecking");
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onInterrupted() {
        LogUtil.a("Track_BackgroundSportViewModel", "onInterrupted");
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        super.onStartSport();
        LogUtil.a("Track_BackgroundSportViewModel", "onStartSport()");
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        super.m825x32b3e3a1();
        LogUtil.a("Track_BackgroundSportViewModel", "onStopSport()");
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        super.onPauseSport();
        LogUtil.a("Track_BackgroundSportViewModel", "onPauseSport()");
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public int getSportStatus() {
        return this.mSportDataOutputApi.getStatus();
    }
}
