package com.huawei.health.sportservice.manager.standflexion;

import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.manager.AchieveModule;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.manager.ManagerComponent;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.SportAchieveSubscribe;
import com.huawei.hwsportmodel.StandFlexionAchieveType;
import defpackage.hau;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.STAND_FLEXION_ACHIEVE_MANAGER)
public class StandFlexionAchieveManager implements ManagerComponent, AchieveModule {
    private static final String TAG = "SportService_StandFlexionAchieveManager";
    private int mHighScore;
    private int mLastScore;
    private Map<Integer, StandFlexionAchieveType> mAchieveVoiceMap = new HashMap();
    private Map<String, SportAchieveSubscribe> mSubscribeMap = new HashMap();
    private hau mSportCallbackOption = new hau();

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        SportDataNotify sportDataNotify = new SportDataNotify() { // from class: com.huawei.health.sportservice.manager.standflexion.StandFlexionAchieveManager$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1208xec52d47f(list, map);
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.add("STAND_FLEXION_HIGHEST_SCORE_TEMP");
        arrayList.add("STAND_FLEXION_HIGHEST_SCORE");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, sportDataNotify);
        for (StandFlexionAchieveType standFlexionAchieveType : StandFlexionAchieveType.values()) {
            this.mAchieveVoiceMap.put(Integer.valueOf(standFlexionAchieveType.getScore()), standFlexionAchieveType);
        }
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-manager-standflexion-StandFlexionAchieveManager, reason: not valid java name */
    /* synthetic */ void m1208xec52d47f(List list, Map map) {
        if (list == null || map == null) {
            LogUtil.j(TAG, "list == null || sportDataMap == null");
            return;
        }
        if (list.contains("STAND_FLEXION_HIGHEST_SCORE_TEMP")) {
            Integer num = (Integer) map.get("STAND_FLEXION_HIGHEST_SCORE_TEMP");
            int iIntValue = num.intValue();
            if (this.mLastScore != iIntValue && this.mAchieveVoiceMap.containsKey(num) && iIntValue > this.mHighScore) {
                notifyMap(this.mAchieveVoiceMap.get(num));
            } else if (this.mAchieveVoiceMap.containsKey(num)) {
                ReleaseLogUtil.d(TAG, "flexionScore:", num);
            } else {
                notifyMap(null);
            }
            this.mLastScore = iIntValue;
        }
        getHighScore(list, map);
    }

    private void getHighScore(List<String> list, Map<String, Object> map) {
        if (list == null || map == null || !list.contains("STAND_FLEXION_HIGHEST_SCORE")) {
            return;
        }
        Object obj = map.get("STAND_FLEXION_HIGHEST_SCORE");
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() > this.mHighScore) {
                int iIntValue = num.intValue();
                this.mHighScore = iIntValue;
                ReleaseLogUtil.d(TAG, "mHighScore:", Integer.valueOf(iIntValue));
            }
        }
    }

    private void notifyMap(StandFlexionAchieveType standFlexionAchieveType) {
        Iterator<SportAchieveSubscribe> it = this.mSubscribeMap.values().iterator();
        while (it.hasNext()) {
            it.next().onChange(standFlexionAchieveType);
        }
    }

    @Override // com.huawei.health.sportservice.manager.AchieveModule
    public void registerAchieveLevel(String str, SportAchieveSubscribe sportAchieveSubscribe) {
        if (str == null || sportAchieveSubscribe == null || this.mSubscribeMap.containsKey(str)) {
            return;
        }
        this.mSubscribeMap.put(str, sportAchieveSubscribe);
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }
}
