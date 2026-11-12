package defpackage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.featuremarketing.db.MarketingEventDbMgr;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.tasks.Task;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
@ApiDefine(uri = MarketingApi.class)
public class ety implements MarketingApi {
    @Override // com.huawei.health.marketing.api.MarketingApi
    public void requestMarketingResource(MarketingOption marketingOption) {
        if (!VersionControlUtil.isSupportOperationAccount() || Utils.k()) {
            LogUtil.b("MarketingImpl", "requestMarketingResource isKidAccount or isOverseaNoCloudVersion. return.");
        } else {
            euz.b(marketingOption);
        }
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public void triggerMarketingResourceEvent(final MarketingOption marketingOption) {
        ThreadPoolManager.c().b("MarketingImpl", new Runnable() { // from class: ety.5
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.b("MarketingImpl", "triggerMarketingResourceEvent... triggerEventType:" + marketingOption.getTriggerEventType());
                if (!VersionControlUtil.isSupportOperationAccount() || Utils.k()) {
                    LogUtil.b("MarketingImpl", "triggerMarketingResourceEvent isKidAccount or isOverseaNoCloudVersion. return.");
                    return;
                }
                if (Utils.o() && !((OperationUtilsApi) Services.b("PluginOperation", OperationUtilsApi.class)).isOperation(LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1010))) {
                    LogUtil.b("MarketingImpl", "triggerMarketingResourceEvent isOperation false. return.");
                    return;
                }
                if (Utils.o() && !ddv.b().switchToMarketingTwo()) {
                    LogUtil.e("MarketingImpl", "triggerMarketingResourceEvent not using marketing 2.0");
                } else {
                    if (marketingOption.getContext() == null) {
                        LogUtil.c("MarketingImpl", "caller is dead, no need to triggerEvent");
                        return;
                    }
                    evj.b().e(marketingOption, marketingOption.getPageId(), marketingOption.getTriggerEventType());
                }
            }
        });
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public Map<Integer, ResourceResultInfo> parseMarketingResource(JSONObject jSONObject, List<Integer> list) {
        return euz.a(jSONObject, list);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public Task<Map<Integer, ResourceResultInfo>> getResourceResultInfo(int i) {
        return getResourceResultInfo(i, (String) null);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public Task<Map<Integer, ResourceResultInfo>> getResourceResultInfo(int i, String str) {
        return getResourceResultInfo(Collections.singletonList(Integer.valueOf(i)), str);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public Task<Map<Integer, ResourceResultInfo>> getResourceResultInfoByGateway(int i, String str) {
        return getResourceResultInfoByGateway(Collections.singletonList(Integer.valueOf(i)), str);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public Task<Map<Integer, ResourceResultInfo>> getResourceResultInfo(List<Integer> list) {
        return getResourceResultInfo(list, (String) null);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public Task<Map<Integer, ResourceResultInfo>> getResourceResultInfo(List<Integer> list, String str) {
        return euz.d(list, str, false);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public Task<Map<Integer, ResourceResultInfo>> getResourceResultInfoByGateway(List<Integer> list, String str) {
        return euz.d(list, str, true);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public Map<Integer, ResourceResultInfo> acquireResourceInfoFromDb(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        return euz.a(arrayList);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public Map<Integer, ResourceResultInfo> filterMarketingRules(MarketingOption marketingOption) {
        return evc.a(marketingOption.getResultInfoMap(), marketingOption.getTriggerEventParams(), marketingOption.getTriggerEventType());
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public Map<Integer, ResourceResultInfo> filterMarketingRules(Map<Integer, ResourceResultInfo> map) {
        return evc.a(map, null, 1);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public List<View> getMarketingViewList(Context context, Map<Integer, ResourceResultInfo> map) {
        return getMarketingViewList(context, map, null);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public List<View> getMarketingViewList(Context context, Map<Integer, ResourceResultInfo> map, FragmentManager fragmentManager) {
        return evh.b(context, map, fragmentManager);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public void recordResourcePresent(int i, int i2, ResourceBriefInfo resourceBriefInfo) {
        evh.c(i, i2, resourceBriefInfo);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public boolean isValidUserLabels(String str) {
        return new evz().e(str);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public void showStandardDialog(Context context, int i, ResourceBriefInfo resourceBriefInfo) {
        evh.d(context, i, resourceBriefInfo);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public boolean isResourceValid(int i, ResourceBriefInfo resourceBriefInfo) {
        return evc.e(i, resourceBriefInfo);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public void setViewBiEvent(int i, ResourceBriefInfo resourceBriefInfo) {
        evh.b(i, resourceBriefInfo);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public void setDisplayLimit(Map<String, Boolean> map) {
        ewa.a(map);
    }

    @Override // com.huawei.health.marketing.api.MarketingApi
    public void preCreateMarketingEventDbMgr() {
        MarketingEventDbMgr.b(BaseApplication.b());
    }
}
