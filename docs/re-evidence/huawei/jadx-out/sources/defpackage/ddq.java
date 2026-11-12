package defpackage;

import android.content.Context;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.health.baseapi.pluginachievement.PluginAchievementApi;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ddq extends AppBundlePluginProxy<PluginAchievementApi> implements PluginAchievementApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ddq f31672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PluginAchievementApi f31673b;

    private ddq() {
        super("PluginAchievement_PluginAchievementProxy", "PluginAchievement", "com.huawei.pluginachievement.PluginAchieveImpl");
        this.f31673b = createPluginApi();
    }

    public static ddq d() {
        ddq ddqVar;
        if (f31672a == null) {
            synchronized (ddq.class) {
                if (f31672a == null) {
                    f31672a = new ddq();
                }
                ddqVar = f31672a;
            }
            return ddqVar;
        }
        return f31672a;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.f31673b != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void initialize(PluginAchievementApi pluginAchievementApi) {
        this.f31673b = pluginAchievementApi;
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Class<? extends JsModuleBase> getCommonJsModule(String str) {
        PluginAchievementApi pluginAchievementApi = this.f31673b;
        if (pluginAchievementApi != null) {
            return pluginAchievementApi.getCommonJsModule(str);
        }
        LogUtil.j("PluginAchievement_PluginAchievementProxy", "getCommonJsModule mPluginOperationApi is null");
        return JsModuleBase.class;
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Task<Integer> getTotalKakaValue(Context context) {
        PluginAchievementApi pluginAchievementApi = this.f31673b;
        if (pluginAchievementApi != null) {
            return pluginAchievementApi.getTotalKakaValue(context);
        }
        return null;
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Task<osd> updateKakaTasks(Context context, List<osj> list) {
        PluginAchievementApi pluginAchievementApi = this.f31673b;
        if (pluginAchievementApi != null) {
            return pluginAchievementApi.updateKakaTasks(context, list);
        }
        return null;
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Task<List<osg>> getTaskInfoList(Context context, int i) {
        PluginAchievementApi pluginAchievementApi = this.f31673b;
        if (pluginAchievementApi != null) {
            return pluginAchievementApi.getTaskInfoList(context, i);
        }
        return null;
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Task<List<osg>> getTaskInfoListByScenario(Context context, int i, int... iArr) {
        PluginAchievementApi pluginAchievementApi = this.f31673b;
        if (pluginAchievementApi != null) {
            return pluginAchievementApi.getTaskInfoListByScenario(context, i, iArr);
        }
        return null;
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Task<List<osg>> getTaskInfoListByRule(Context context, int... iArr) {
        PluginAchievementApi pluginAchievementApi = this.f31673b;
        if (pluginAchievementApi != null) {
            return pluginAchievementApi.getTaskInfoListByRule(context, iArr);
        }
        return null;
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Task<osd> claimKakaTasksByScenario(Context context, int i, String... strArr) {
        PluginAchievementApi pluginAchievementApi = this.f31673b;
        if (pluginAchievementApi != null) {
            return pluginAchievementApi.claimKakaTasksByScenario(context, i, strArr);
        }
        return null;
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public void finishKakaTask(Context context, int i, Map<String, Object> map) {
        PluginAchievementApi pluginAchievementApi = this.f31673b;
        if (pluginAchievementApi != null) {
            pluginAchievementApi.finishKakaTask(context, i, map);
        }
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public Task<Boolean> checkKakaTaskIsFinished(Context context, int... iArr) {
        PluginAchievementApi pluginAchievementApi = this.f31673b;
        if (pluginAchievementApi != null) {
            return pluginAchievementApi.checkKakaTaskIsFinished(context, iArr);
        }
        return null;
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public void doPost(String str, JSONObject jSONObject, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        PluginAchievementApi pluginAchievementApi = this.f31673b;
        if (pluginAchievementApi != null) {
            pluginAchievementApi.doPost(str, jSONObject, map, iBaseResponseCallback);
        } else if (iBaseResponseCallback != null) {
            iBaseResponseCallback.onResponse(-1, null);
        }
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public void doPostByKey(Context context, int i) {
        PluginAchievementApi pluginAchievementApi = this.f31673b;
        if (pluginAchievementApi != null) {
            pluginAchievementApi.doPostByKey(context, i);
        }
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public void goToTaskPage(Context context, osg osgVar) {
        PluginAchievementApi pluginAchievementApi = this.f31673b;
        if (pluginAchievementApi != null) {
            pluginAchievementApi.goToTaskPage(context, osgVar);
        }
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public int setEvent(Context context, String str, Map<String, Object> map) {
        PluginAchievementApi pluginAchievementApi = this.f31673b;
        if (pluginAchievementApi != null) {
            return pluginAchievementApi.setEvent(context, str, map);
        }
        return -1;
    }

    @Override // com.huawei.health.baseapi.pluginachievement.PluginAchievementApi
    public void showMedalDialog(Context context, int i) {
        PluginAchievementApi pluginAchievementApi = this.f31673b;
        if (pluginAchievementApi != null) {
            pluginAchievementApi.showMedalDialog(context, i);
        }
    }
}
