package defpackage;

import com.huawei.health.algorithm.api.BreathTrainApi;
import com.huawei.health.breathe.bean.BreatheBean;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes7.dex */
public class dfo {
    private static BreathTrainApi a() {
        return (BreathTrainApi) Services.d("BreathTrainService", BreathTrainApi.class);
    }

    public static void d(BreatheBean breatheBean) {
        BreathTrainApi breathTrainApiA = a();
        if (breathTrainApiA == null) {
            LogUtil.j("BreatheUtils", "insert breathTrainApi is null");
        } else {
            breathTrainApiA.insert(breatheBean);
        }
    }
}
