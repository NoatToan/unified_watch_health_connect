package defpackage;

import com.huawei.health.device.api.WeightDataUtilsApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hmf.annotation.ApiDefine;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = WeightDataUtilsApi.class)
public class fnh implements WeightDataUtilsApi {
    @Override // com.huawei.health.device.api.WeightDataUtilsApi
    public HiAggregateOption buildHiAggregateOption() {
        return dne.a();
    }

    @Override // com.huawei.health.device.api.WeightDataUtilsApi
    public int getFractionDigitForWeight(double d, int i) {
        return dne.c(d, i);
    }
}
