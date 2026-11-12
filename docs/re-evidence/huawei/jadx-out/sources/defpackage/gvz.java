package defpackage;

import com.huawei.health.huaweihealth.HuaweiHealthApi;
import com.huawei.health.interactor.MainInteractors;
import com.huawei.health.utils.SyncCloudUtils;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;

/* JADX INFO: loaded from: classes31.dex */
@ApiDefine(uri = HuaweiHealthApi.class)
@Singleton
public class gvz implements HuaweiHealthApi {
    @Override // com.huawei.health.huaweihealth.HuaweiHealthApi
    public boolean isHealthLoginInit() {
        return MainInteractors.e();
    }

    @Override // com.huawei.health.huaweihealth.HuaweiHealthApi
    public void updateSyncFinishTime(long j) {
        SyncCloudUtils.c(j);
    }

    @Override // com.huawei.health.huaweihealth.HuaweiHealthApi
    public boolean isPrivacyStatementAgreed() {
        return fns.b();
    }
}
