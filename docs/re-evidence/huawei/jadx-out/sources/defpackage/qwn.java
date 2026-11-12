package defpackage;

import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.pluginhealthalgorithm.MenstrualPredictApi;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = MenstrualPredictApi.class)
@Singleton
public class qwn implements MenstrualPredictApi {
    @Override // com.huawei.pluginhealthalgorithm.MenstrualPredictApi
    public void getSwitchState(String str, IBaseResponseCallback iBaseResponseCallback) {
        qwm.a(str, iBaseResponseCallback);
    }

    @Override // com.huawei.pluginhealthalgorithm.MenstrualPredictApi
    public void updateSwitchState(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        qwm.c(str, str2, iBaseResponseCallback);
        qwm.e(str2);
    }
}
