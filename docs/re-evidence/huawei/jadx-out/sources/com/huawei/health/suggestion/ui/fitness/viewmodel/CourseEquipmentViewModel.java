package com.huawei.health.suggestion.ui.fitness.viewmodel;

import android.os.Bundle;
import android.os.Message;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.huawei.health.basesport.viewmodel.BaseSportingViewModel;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.sportservice.SportBleStatus;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.suggestion.ui.fitness.activity.LongCoachActivity;
import com.huawei.health.suggestion.ui.fitness.viewmodel.CourseEquipmentViewModel;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dmg;
import defpackage.njy;
import defpackage.peh;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class CourseEquipmentViewModel extends BaseSportingViewModel implements SportBleStatus, SportDataNotify {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MutableLiveData<Bundle> f9517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SportBleStatus f9518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9519c;
    private Bundle d;

    public static /* synthetic */ void c(int i, Object obj) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initFragment() {
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initReceivedDataHandlers() {
    }

    public void d(int i, String str, String str2) {
        if (i == 0) {
            LogUtil.j("Suggestion_CourseEquipmentViewModel", "equipmentType is no match", Integer.valueOf(i));
            return;
        }
        Bundle bundle = new Bundle();
        SportLaunchParams sportLaunchParams = new SportLaunchParams();
        sportLaunchParams.setDataSource(5);
        bundle.putInt("sport_data_source_sportting", 5);
        this.f9519c = i;
        if (i == 1) {
            sportLaunchParams.setSportType(264);
            bundle.putInt("map_tracking_sport_type_sportting", 264);
        } else if (i == 2) {
            sportLaunchParams.setSportType(OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE);
            bundle.putInt("map_tracking_sport_type_sportting", OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE);
        } else if (i != 3) {
            LogUtil.j("Suggestion_CourseEquipmentViewModel", "equipmentType is no match", Integer.valueOf(i));
        } else {
            sportLaunchParams.setSportType(283);
            bundle.putInt("map_tracking_sport_type_sportting", 283);
            EcologyDeviceApi ecologyDeviceApi = (EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class);
            if (ecologyDeviceApi.isSupportPerformanceByProductId(dmg.a().getProductId())) {
                ecologyDeviceApi.requestPerformanceRank(new IBaseResponseCallback() { // from class: hnq
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i2, Object obj) {
                        CourseEquipmentViewModel.c(i2, obj);
                    }
                });
            }
        }
        sportLaunchParams.setLaunchActivity(LongCoachActivity.class.getName());
        sportLaunchParams.setNeedRestart(true);
        sportLaunchParams.addExtra("workoutid", str);
        sportLaunchParams.addExtra("coach_detail_name", str2);
        sportLaunchParams.addExtra("equipment_course", true);
        bundle.putParcelable("bundle_key_sport_launch_paras", sportLaunchParams);
        super.init(bundle);
        this.mSportDataOutputApi.registerSportBleStatus("Suggestion_CourseEquipmentViewModel", this);
        onPreSport();
        requestData();
        MutableLiveData<Bundle> mutableLiveData = new MutableLiveData<>();
        this.f9517a = mutableLiveData;
        this.d = mutableLiveData.getValue();
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        super.m825x32b3e3a1();
        ReleaseLogUtil.d("Suggestion_CourseEquipmentViewModel", "stopSport,", Integer.valueOf(this.f9519c));
        IndoorEquipManagerApi indoorEquipManagerApi = (IndoorEquipManagerApi) Services.b("PluginLinkIndoorEquip", IndoorEquipManagerApi.class);
        if (this.f9519c == 2) {
            indoorEquipManagerApi.stopSport();
            indoorEquipManagerApi.setHasExperiencedStateOfStartForFtmp(false);
        }
    }

    public void a(Observer<Bundle> observer) {
        if (observer != null) {
            this.f9517a.observeForever(observer);
        }
    }

    public void b(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != null) {
            this.f9517a.removeObservers(lifecycleOwner);
        }
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.SportDataNotify
    public void onChange(List<String> list, Map<String, Object> map) {
        if (njy.e(list) || map == null) {
            LogUtil.j("Suggestion_CourseEquipmentViewModel", "onChange receive change error with wrong paras.");
            return;
        }
        if (!list.contains("TIME_ONE_SECOND_DURATION") && !d(list)) {
            LogUtil.j("Suggestion_CourseEquipmentViewModel", "onChange tagList unContains time or no calories or shipNum");
            return;
        }
        if (this.d == null) {
            this.d = new Bundle();
        }
        LogUtil.d("Suggestion_CourseEquipmentViewModel", "sportDataList:", peh.c(map));
        a(map);
        int i = this.f9519c;
        if (i == 1) {
            c(map);
        } else if (i == 2) {
            e(map);
        } else if (i == 3) {
            b(map);
        } else {
            LogUtil.j("Suggestion_CourseEquipmentViewModel", "onChange mEquipmentType", Integer.valueOf(i));
        }
        this.f9517a.postValue(this.d);
    }

    private boolean d(List<String> list) {
        if (this.f9519c == 3) {
            return list.contains("CALORIES_DATA") || list.contains("SKIP_NUM_DATA");
        }
        return false;
    }

    private void a(Map<String, Object> map) {
        if (this.d == null) {
            LogUtil.j("Suggestion_CourseEquipmentViewModel", "commonData mBundle is null");
            return;
        }
        Object obj = map.get("CALORIES_DATA");
        if (obj instanceof Integer) {
            this.d.putInt("fitnessCalories", ((Integer) obj).intValue());
        }
        Object obj2 = map.get("HEART_RATE_DATA");
        if (obj2 instanceof Integer) {
            this.d.putInt("fitnessHeart", ((Integer) obj2).intValue());
        }
        Object obj3 = map.get("DISTANCE_DATA");
        if (obj3 instanceof Integer) {
            Integer num = (Integer) obj3;
            if (num.intValue() > 0) {
                this.d.putInt("fitnessDistance", num.intValue());
            }
        }
        this.d.putFloat("fitnessSpeed", CommonUtil.f(String.valueOf(map.get("SPEED_DATA"))) / 100.0f);
        Object obj4 = map.get("TIME_ONE_SECOND_DURATION");
        this.d.putInt("fitnessTime", Math.round(((obj4 instanceof Integer ? 0L : ((Long) obj4).longValue()) * 1.0f) / 1000.0f));
    }

    private void b(Map<String, Object> map) {
        if (this.d == null) {
            LogUtil.j("Suggestion_CourseEquipmentViewModel", "ropeData mBundle is null");
            return;
        }
        Object obj = map.get("SKIP_SPEED_DATA");
        if (obj instanceof Integer) {
            this.d.putInt("fitnessRopeSpeed", ((Integer) obj).intValue());
        }
        Object obj2 = map.get("STUMBLING_ROPE_DATA");
        if (obj2 instanceof Integer) {
            this.d.putInt("fitnessStumbling", ((Integer) obj2).intValue());
        }
        Object obj3 = map.get("CONTINUOUS_SKIPPING_JUMP_DATA");
        if (obj3 instanceof Integer) {
            this.d.putInt("fitnessContinuousSkippingJump", ((Integer) obj3).intValue());
        }
        Object obj4 = map.get("SKIP_NUM_DATA");
        if (obj4 instanceof Integer) {
            this.d.putInt("fitnessRopeTotalNumber", ((Integer) obj4).intValue());
        }
    }

    private void c(Map<String, Object> map) {
        if (this.d == null) {
            LogUtil.j("Suggestion_CourseEquipmentViewModel", "treadmillData mBundle is null");
            return;
        }
        this.d.putString("fitnessSlope", UnitUtil.c(CommonUtil.a(String.valueOf(map.get("INCLINATION_DATA"))), 1, 1, false));
        double dA = CommonUtil.a(String.valueOf(map.get("STEP_DATA")));
        if (dA < 0.0d) {
            dA = 0.0d;
        }
        this.d.putString("fitnessSteps", UnitUtil.c(dA, 1, 0, false));
        double dA2 = CommonUtil.a(String.valueOf(map.get("STEP_RATE_DATA")));
        this.d.putString("fitnessStepFrequency", UnitUtil.c(dA2 >= 0.0d ? dA2 : 0.0d, 1, 0, false));
    }

    private void e(Map<String, Object> map) {
        String strC;
        if (this.d == null) {
            LogUtil.j("Suggestion_CourseEquipmentViewModel", "bicycleData mBundle is null");
            return;
        }
        this.d.putString("fitnessResistance", UnitUtil.c(CommonUtil.a(String.valueOf(map.get("RESISTANCE_LEVEL_DATA"))), 1, 0, false));
        this.d.putInt("fitnessTreadFrequancy", CommonUtil.j(String.valueOf(map.get("CADENCE_DATA"))));
        double dA = CommonUtil.a(String.valueOf(map.get("POWER_DATA")));
        if (dA > 0.0d) {
            strC = UnitUtil.c(dA, 1, 0, false);
        } else {
            strC = "";
        }
        this.d.putString("fitnessPower", strC);
    }

    public void b(SportBleStatus sportBleStatus) {
        if (sportBleStatus != null) {
            this.f9518b = sportBleStatus;
        }
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onInterrupted() {
        SportBleStatus sportBleStatus = this.f9518b;
        if (sportBleStatus != null) {
            sportBleStatus.onInterrupted();
        } else {
            LogUtil.j("Suggestion_CourseEquipmentViewModel", "onInterrupted mSportBleStatus is null");
        }
    }

    @Override // com.huawei.health.sportservice.SportBleStatus
    public void onConnected() {
        SportBleStatus sportBleStatus = this.f9518b;
        if (sportBleStatus != null) {
            sportBleStatus.onConnected();
        } else {
            LogUtil.j("Suggestion_CourseEquipmentViewModel", "onConnected mSportBleStatus is null");
        }
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public List<String> getSubscribeTagList() {
        ArrayList arrayList = new ArrayList(16);
        arrayList.add("HEART_RATE_DATA");
        arrayList.add("CALORIES_DATA");
        arrayList.add("DISTANCE_DATA");
        arrayList.add("SPEED_DATA");
        arrayList.add("TIME_ONE_SECOND_DURATION");
        int i = this.f9519c;
        if (i == 1) {
            arrayList.add("INCLINATION_DATA");
            arrayList.add("STEP_DATA");
            arrayList.add("STEP_RATE_DATA");
            return arrayList;
        }
        if (i == 2) {
            arrayList.add("CADENCE_DATA");
            arrayList.add("RESISTANCE_LEVEL_DATA");
            arrayList.add("POWER_DATA");
            return arrayList;
        }
        if (i == 3) {
            arrayList.add("SKIP_SPEED_DATA");
            arrayList.add("CONTINUOUS_SKIPPING_JUMP_DATA");
            arrayList.add("STUMBLING_ROPE_DATA");
            arrayList.add("SKIP_NUM_DATA");
            return arrayList;
        }
        LogUtil.a("Suggestion_CourseEquipmentViewModel", "getSubscribeTagList equipmentType", Integer.valueOf(i));
        return arrayList;
    }
}
