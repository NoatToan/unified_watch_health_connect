package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.featuremarketing.db.MarketingDataDbManager;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
class eux {
    eux() {
    }

    static Map<Integer, ResourceResultInfo> d(List<Integer> list) {
        HashMap map = new HashMap();
        if (!njy.e(list)) {
            for (Integer num : list) {
                ResourceResultInfo resourceResultInfoE = e(num.intValue());
                if (resourceResultInfoE != null) {
                    map.put(num, resourceResultInfoE);
                }
            }
        }
        return map;
    }

    private static ResourceResultInfo e(int i) throws Throwable {
        String strE = MarketingDataDbManager.e(BaseApplication.b()).e(i);
        if (strE == null) {
            LogUtil.c("MarketingDBProvider", "No resource data in database. positionId: ", Integer.valueOf(i));
            return null;
        }
        try {
            return (ResourceResultInfo) new Gson().fromJson(strE, ResourceResultInfo.class);
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.b("MarketingDBProvider", "parse resource in db failed, exception: " + e);
            return null;
        }
    }

    public static void b(final Map<Integer, ResourceResultInfo> map) {
        LogUtil.b("MarketingDBProvider", "marketing enter saveResourceResultInfoData");
        if (map == null) {
            LogUtil.e("MarketingDBProvider", "marketing resourceResultInfo is Empty");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: eva
                @Override // java.lang.Runnable
                public final void run() {
                    eux.c(map);
                }
            });
        }
    }

    static /* synthetic */ void c(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int iIntValue = num.intValue();
            ResourceResultInfo resourceResultInfo = (ResourceResultInfo) entry.getValue();
            if (resourceResultInfo == null) {
                LogUtil.b("MarketingDBProvider", "resourceResultInfo is null. positionId = ", num);
            } else {
                long resourcesLatestModifyTime = resourceResultInfo.getResourcesLatestModifyTime();
                LogUtil.b("MarketingDBProvider", "marketing resourceResultInfo result: ", Long.valueOf(MarketingDataDbManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).a(iIntValue, new Gson().toJson(resourceResultInfo), resourcesLatestModifyTime)));
            }
        }
    }
}
