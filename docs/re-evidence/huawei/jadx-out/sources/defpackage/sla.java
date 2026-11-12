package defpackage;

import com.huawei.health.main.api.UtilApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.ui.homehealth.h5pro.UtilJsApi;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = UtilApi.class)
@Singleton
public class sla implements UtilApi {
    @Override // com.huawei.health.main.api.UtilApi
    public Class<?> getUtilJsApi() {
        return UtilJsApi.class;
    }
}
