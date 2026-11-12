package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.marketing.request.RecommendResourceReq;
import com.huawei.health.marketing.request.RecommendResourceRsp;
import com.huawei.health.marketing.request.RecommendResourcesApi;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class fxy {
    private RecommendResourcesApi e = (RecommendResourcesApi) oet.d().e(RecommendResourcesApi.class);

    public void e(List<String> list, int i, IBaseResponseCallback iBaseResponseCallback) {
        RecommendResourceReq recommendResourceReq = new RecommendResourceReq();
        try {
            recommendResourceReq.setScenarioIds(list);
            recommendResourceReq.setItemNum(i);
            HashMap<String, String> mapE = qso.e();
            for (String str : mapE.keySet()) {
                if (mapE.get(str) == null) {
                    mapE.put(str, "");
                }
            }
            mapE.put("x-version", CommonUtil.c(BaseApplication.b()));
            Response<RecommendResourceRsp> responseExecute = this.e.getRecommendResourceInfos(recommendResourceReq.getUrl(), mapE).execute();
            if (responseExecute == null) {
                LogUtil.j("RecommendResourceInfoManager", "response is null");
                iBaseResponseCallback.a(-1, null);
            } else if (responseExecute.isOK()) {
                LogUtil.a("RecommendResourceInfoManager", "response is OK.");
                iBaseResponseCallback.a(0, responseExecute.getBody().getResultInfo());
            } else {
                LogUtil.j("RecommendResourceInfoManager", "response result == ", Integer.valueOf(responseExecute.getCode()));
                iBaseResponseCallback.a(-1, null);
            }
        } catch (Exception e) {
            LogUtil.e("RecommendResourceInfoManager", "getVipInfo fail, ", e.getMessage());
        }
    }
}
