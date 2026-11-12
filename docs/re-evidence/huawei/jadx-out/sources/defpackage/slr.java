package defpackage;

import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.health.healthheadlines.HealthHeadLinesJsApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = HealthHeadLinesJsApi.class)
@Singleton
public class slr implements HealthHeadLinesJsApi {
    @Override // com.huawei.health.healthheadlines.HealthHeadLinesJsApi
    public Class<? extends JsModuleBase> getCommonJsModule(String str) {
        if ("healthHeadlines".equals(str)) {
            LogUtil.a("HealthHeadLinesImpl", "getCommonJsModule success");
            return sma.class;
        }
        LogUtil.j("HealthHeadLinesImpl", "unknown JsModule:", str);
        return JsModuleBase.class;
    }
}
