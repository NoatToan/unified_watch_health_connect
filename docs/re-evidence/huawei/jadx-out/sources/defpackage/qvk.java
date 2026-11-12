package defpackage;

import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.heartrate.HeartRateApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.ui.device.activity.heartrate.HeartRateManager;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = HeartRateApi.class)
@Singleton
public class qvk implements HeartRateApi {
    @Override // com.huawei.health.heartrate.HeartRateApi
    public Class<? extends JsBaseModule> getHeartRateJsApi() {
        return HeartRateManager.class;
    }
}
