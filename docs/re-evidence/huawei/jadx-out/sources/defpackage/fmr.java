package defpackage;

import com.huawei.health.device.api.ConverResisToWeightDataUtilApi;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = ConverResisToWeightDataUtilApi.class)
public class fmr implements ConverResisToWeightDataUtilApi {
    @Override // com.huawei.health.device.api.ConverResisToWeightDataUtilApi
    public void convertWeightAndFatRateData(HiHealthData hiHealthData, dso dsoVar, dnj dnjVar) {
        LogUtil.a("ConverResisToWeightDataUtilImpl", "convertWeightAndFatRateData");
        dsq.b(hiHealthData, dsoVar, dnjVar);
    }
}
