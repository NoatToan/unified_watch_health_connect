package defpackage;

import com.huawei.hihealth.data.listener.HealthTrendListener;
import com.huawei.hihealthservice.healthtrend.HealthTrendApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
@ApiDefine(uri = HealthTrendApi.class)
@Singleton
public class kxy implements HealthTrendApi {
    @Override // com.huawei.hihealthservice.healthtrend.HealthTrendApi
    public void getHealthTrend(List<String> list, int[] iArr, int i, HealthTrendListener healthTrendListener) {
        kyd.e(list, iArr, i, healthTrendListener, false);
    }
}
