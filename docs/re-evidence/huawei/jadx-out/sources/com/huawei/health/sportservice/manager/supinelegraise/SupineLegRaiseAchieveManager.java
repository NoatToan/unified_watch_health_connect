package com.huawei.health.sportservice.manager.supinelegraise;

import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.manager.AchieveModule;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.manager.ManagerComponent;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.SportAchieveSubscribe;
import com.huawei.hwsportmodel.SupineLegAchieveType;
import defpackage.hau;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.SUPINE_LEG_ACHIEVE_MANAGER)
public class SupineLegRaiseAchieveManager implements ManagerComponent, AchieveModule {
    private static final String TAG = "SportService_SupineLegRaiseAchieveManager";
    private Map<Integer, SupineLegAchieveType> mAchieveVoiceMap = new HashMap();
    private Map<String, SportAchieveSubscribe> mSubscribeMap = new HashMap();
    private hau mSportCallbackOption = new hau();

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        SportDataNotify sportDataNotify = new SportDataNotify() { // from class: com.huawei.health.sportservice.manager.supinelegraise.SupineLegRaiseAchieveManager$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1211x149dbfbf(list, map);
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.add("SPORT_EXAM_SCORE");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, sportDataNotify);
        for (SupineLegAchieveType supineLegAchieveType : SupineLegAchieveType.values()) {
            if (supineLegAchieveType != null) {
                this.mAchieveVoiceMap.put(Integer.valueOf(supineLegAchieveType.getLegRaiseTimes()), supineLegAchieveType);
            }
        }
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-manager-supinelegraise-SupineLegRaiseAchieveManager, reason: not valid java name */
    /* synthetic */ void m1211x149dbfbf(List list, Map map) {
        if (list == null || map == null) {
            LogUtil.j(TAG, "tagList == null || sportDataMap == null");
            return;
        }
        if (list.contains("SPORT_EXAM_SCORE")) {
            Integer num = (Integer) map.get("SPORT_EXAM_SCORE");
            num.intValue();
            if (this.mAchieveVoiceMap.containsKey(num)) {
                notifyMap(this.mAchieveVoiceMap.get(num));
            }
        }
    }

    private void notifyMap(SupineLegAchieveType supineLegAchieveType) {
        Iterator<SportAchieveSubscribe> it = this.mSubscribeMap.values().iterator();
        while (it.hasNext()) {
            it.next().onChange(supineLegAchieveType);
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
