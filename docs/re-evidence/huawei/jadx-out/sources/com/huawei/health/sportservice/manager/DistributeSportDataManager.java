package com.huawei.health.sportservice.manager;

import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.datatype.IntermitentJumpData;
import com.huawei.health.device.datatype.SkippingTargetMode;
import com.huawei.health.sport.ITargetUpdateListener;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dmg;
import defpackage.gze;
import defpackage.hau;
import defpackage.hbv;
import defpackage.nxs;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.DISTRIBUTE_MANAGER)
public class DistributeSportDataManager implements ManagerComponent, ITargetUpdateListener {
    private static final String TAG = "SportService_DistributeSportDataManager";
    private hau mSportCallbackOption = new hau();

    @Override // com.huawei.health.sport.ITargetUpdateListener
    public void onTargetDataUpdate(gze gzeVar) {
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("HEART_RATE_DATA");
        arrayList.add("STEP_DATA");
        arrayList.add("TIME_ONE_SECOND_DURATION");
        final boolean zI = nxs.d().i();
        LogUtil.a(TAG, " instant calorie is  ", Boolean.valueOf(zI));
        if (zI) {
            arrayList.add("CALORIES_DATA");
        }
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, new SportDataNotify() { // from class: com.huawei.health.sportservice.manager.DistributeSportDataManager$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                DistributeSportDataManager.lambda$onPreSport$0(zI, list, map);
            }
        });
        if (BaseSportManager.getInstance().getSportType() == 283) {
            SportLaunchParams sportLaunchParams = (SportLaunchParams) BaseSportManager.getInstance().getParas(SportParamsType.SPORT_LAUNCH_PARAS);
            dmg.a().setSkippingTargetMode(new SkippingTargetMode(BaseSportManager.getInstance().getTargetType(), (int) BaseSportManager.getInstance().getTargetValue(), sportLaunchParams != null ? (IntermitentJumpData) sportLaunchParams.getExtra("type_intermittent_jump_mode_data", IntermitentJumpData.class) : null));
        }
    }

    static /* synthetic */ void lambda$onPreSport$0(boolean z, List list, Map map) {
        if (list.contains("TIME_ONE_SECOND_DURATION")) {
            BaseSportManager baseSportManager = BaseSportManager.getInstance();
            Integer num = (Integer) baseSportManager.getData("STEP_DATA");
            int iIntValue = num.intValue();
            Integer num2 = (Integer) baseSportManager.getData("HEART_RATE_DATA");
            int iIntValue2 = num2.intValue();
            HashMap map2 = new HashMap();
            LogUtil.a(TAG, " instant step is  ", num, "and heart rate is ", num2);
            if (hbv.b(iIntValue2)) {
                map2.put(IndoorEquipManagerApi.KEY_HEART_RATE, String.valueOf(iIntValue2));
            }
            if (iIntValue > 0) {
                map2.put(IndoorEquipManagerApi.KEY_STEP_COUNT, String.valueOf(iIntValue));
            }
            if (z) {
                Integer num3 = (Integer) baseSportManager.getData("CALORIES_DATA");
                int iIntValue3 = num3.intValue();
                LogUtil.a(TAG, " instant calorie is  ", num3);
                if (iIntValue3 > 0) {
                    map2.put(IndoorEquipManagerApi.KEY_TOTAL_ENERGY, String.valueOf(iIntValue3));
                }
            }
            if (map2.size() > 0) {
                ((IndoorEquipManagerApi) Services.b("PluginLinkIndoorEquip", IndoorEquipManagerApi.class)).sendExtensionCollectionControl(map2);
            }
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        LogUtil.a(TAG, "onStartSport");
        BaseSportManager.getInstance().subscribeTargetStatus(TAG, this);
    }

    private void notifyDataWhenTargetFinished() {
        if (nxs.d().i()) {
            Integer num = (Integer) BaseSportManager.getInstance().getData("CALORIES_DATA");
            int iIntValue = num.intValue();
            HashMap map = new HashMap();
            LogUtil.a(TAG, " notifyDataWhenTargetFinished calorie is  ", num);
            if (iIntValue > 0) {
                map.put(IndoorEquipManagerApi.KEY_TOTAL_ENERGY, String.valueOf(iIntValue));
                ((IndoorEquipManagerApi) Services.b("PluginLinkIndoorEquip", IndoorEquipManagerApi.class)).sendExtensionCollectionControl(map);
            }
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }

    @Override // com.huawei.health.sport.ITargetUpdateListener
    public void onStateUpdate(int i, String str) {
        LogUtil.a(TAG, "type is ", Integer.valueOf(i), " command is ", str);
        if (i == 200) {
            notifyDataWhenTargetFinished();
        }
    }
}
