package com.huawei.pluginachievement;

import android.content.Context;
import com.huawei.health.baseapi.pluginachievement.PluginAchievementApi;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.connectivity.https.HttpResCallBack;
import com.huawei.pluginachievement.jsmodule.AchieveUtil;
import com.huawei.pluginachievement.jsmodule.CloudUtil;
import com.huawei.pluginachievement.manager.service.AchieveServiceObserver;
import defpackage.oru;
import defpackage.osd;
import defpackage.osg;
import defpackage.osj;
import defpackage.otl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class PluginAchieveImpl implements PluginAchievementApi {
    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Class<? extends JsModuleBase> getCommonJsModule(String str) {
        if ("achievement".equals(str)) {
            return AchieveUtil.class;
        }
        if ("CloudUtil".equals(str)) {
            return CloudUtil.class;
        }
        LogUtil.j("PluginAchievement_PluginAchieveImpl", "unknow JsModule:", str);
        return JsModuleBase.class;
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Task<Integer> getTotalKakaValue(Context context) {
        return oru.a(context).n();
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Task<osd> updateKakaTasks(Context context, List<osj> list) {
        return oru.a(context).b(list);
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Task<List<osg>> getTaskInfoList(Context context, int i) {
        return oru.a(context).b(i, 2, (int[]) null);
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Task<List<osg>> getTaskInfoListByScenario(Context context, int i, int... iArr) {
        return oru.a(context).b(0, i, iArr);
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Task<List<osg>> getTaskInfoListByRule(Context context, int... iArr) {
        return getTaskInfoListByScenario(context, -1, iArr);
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Task<osd> claimKakaTasksByScenario(Context context, int i, String... strArr) {
        return oru.a(context).c(i, strArr);
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public void finishKakaTask(Context context, int i, Map<String, Object> map) {
        oru oruVarA = oru.a(context);
        if (map == null) {
            map = new HashMap<>(2);
        }
        oruVarA.c(context, String.valueOf(i), map);
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Task<Boolean> checkKakaTaskIsFinished(Context context, int... iArr) {
        return oru.a(context).b(iArr);
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public void doPost(String str, JSONObject jSONObject, HashMap<String, String> map, final IBaseResponseCallback iBaseResponseCallback) {
        oru.a(BaseApplication.getContext()).e(str, jSONObject, map, new HttpResCallBack() { // from class: com.huawei.pluginachievement.PluginAchieveImpl.3
            @Override // com.huawei.pluginachievement.connectivity.https.HttpResCallBack
            public void onFinished(int i, String str2) {
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(i, str2);
                }
            }
        });
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public void doPostByKey(Context context, int i) {
        if (i == 4) {
            otl.b(context).j();
        }
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public void goToTaskPage(Context context, osg osgVar) {
        oru.a(BaseApplication.getContext()).d(context, osgVar);
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public int setEvent(Context context, String str, Map<String, Object> map) {
        return oru.a(context).c(context, str, map);
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public void showMedalDialog(Context context, int i) {
        LogUtil.a("PluginAchievement_PluginAchieveImpl", "showMedalDialog: subScenario -> " + i);
        doPostByKey(context, 4);
        AchieveServiceObserver.c(i);
    }
}
