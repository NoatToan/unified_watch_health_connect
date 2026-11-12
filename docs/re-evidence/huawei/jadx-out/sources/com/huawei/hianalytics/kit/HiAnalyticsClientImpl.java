package com.huawei.hianalytics.kit;

import android.content.Context;
import com.huawei.hianalytics.c0;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.i0;
import com.huawei.hianalytics.s0;
import com.huawei.hianalytics.t0;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.HuaweiApi;

/* JADX INFO: loaded from: classes3.dex */
public class HiAnalyticsClientImpl extends HuaweiApi<s0> implements HiAnalyticsClient {
    private static final String TAG = "HAClientImpl";
    private static final Api<s0> HI_ANALYTICS_OPTIONS_API = new Api<>("HuaweiHASDK.API");
    private static final c0 CLIENT_BUILDER = new c0();

    public HiAnalyticsClientImpl(Context context, s0 s0Var) {
        super(context, HI_ANALYTICS_OPTIONS_API, s0Var, CLIENT_BUILDER);
    }

    @Override // com.huawei.hianalytics.kit.HiAnalyticsClient
    public Task<t0> getHaConfig(i0 i0Var) {
        try {
            StringBuilder sb = new StringBuilder("{\"type\" : \"get_ha_config\", \"source\" : \"");
            i0Var.getClass();
            sb.append(i0Var.f11550a);
            sb.append("\"}");
            return doWrite(new HiAnalyticsTaskApiCall("qoes.getHaConfig", sb.toString()));
        } catch (Throwable th) {
            HiLog.e(TAG, "getHaConfig error: ".concat(th.getClass().getSimpleName()));
            return null;
        }
    }
}
