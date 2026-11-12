package defpackage;

import com.huawei.health.device.api.DataBaseapiApi;
import com.huawei.hmf.annotation.ApiDefine;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = DataBaseapiApi.class)
public class fmt implements DataBaseapiApi {
    @Override // com.huawei.health.device.api.DataBaseapiApi
    public String getWiFiDeviceProductId(String str) {
        return ecf.g(str);
    }
}
