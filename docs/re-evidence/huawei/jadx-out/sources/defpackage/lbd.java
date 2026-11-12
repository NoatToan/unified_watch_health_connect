package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealthservice.HiHealthKitApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HuaweiHealth;

/* JADX INFO: loaded from: classes33.dex */
@ApiDefine(uri = HiHealthKitApi.class)
@Singleton
public class lbd implements HiHealthKitApi {
    @Override // com.huawei.hihealthservice.HiHealthKitApi
    public boolean hasUnSyncSportData() {
        int iC = kxi.c(BaseApplication.b(), kwi.b().b(HuaweiHealth.c()));
        if (iC <= 0) {
            LogUtil.j("HiHealthKitImpl", "userId <= 0");
        }
        return njy.b(kws.e(BaseApplication.b()).d(kyj.c().c(iC), 30001, 0, 1));
    }
}
