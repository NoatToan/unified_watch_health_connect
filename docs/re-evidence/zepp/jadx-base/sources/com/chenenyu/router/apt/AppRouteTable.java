package com.chenenyu.router.apt;

import com.chenenyu.router.template.RouteTable;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.activity.StartUpActivity;
import com.xiaomi.hm.health.healthdata.ui.base.DataDetailBaseNewActivity;
import com.xiaomi.hm.health.manager.nightmode.NightModeSettingActivity;
import com.xiaomi.hm.health.running.calori.CaloriActivity;
import com.xiaomi.hm.health.speech.speech.ui.AlexaLanguageSettingActivity;
import com.xiaomi.hm.health.ui.AllDataCategoriesActivity;
import com.xiaomi.hm.health.ui.FemaleHealthActivity;
import com.xiaomi.hm.health.ui.sportfitness.ExerciseHistoryActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AppRouteTable implements RouteTable {
    @Override // com.chenenyu.router.template.RouteTable
    public void handle(Map<String, Class<?>> map) {
        map.put(RouterHelper.ALL_DATA_PATH, AllDataCategoriesActivity.class);
        map.put(RouterHelper.EXERCISE_HISTORY, ExerciseHistoryActivity.class);
        map.put("detail/DataDetailBaseNewActivity", DataDetailBaseNewActivity.class);
        map.put("launch/StartUpActivity", StartUpActivity.class);
        map.put("AlexaLanguageSettingActivity", AlexaLanguageSettingActivity.class);
        map.put(RouterHelper.FEMALE_HEALTH_PATH, FemaleHealthActivity.class);
        map.put(RouterHelper.CALORIES_PATH, CaloriActivity.class);
        map.put("main/MainTabActivity", MainTabActivity.class);
        map.put("setting/NightModeSettingActivity", NightModeSettingActivity.class);
    }
}
