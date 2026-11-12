package defpackage;

import com.huawei.health.hearratecontrol.HeartRateControlConfigApi;
import com.huawei.health.hearratecontrol.callback.ConfigCallBack;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.pluginfitnessadvice.FitWorkout;

/* JADX INFO: loaded from: classes27.dex */
@ApiDefine(uri = HeartRateControlConfigApi.class)
public class ehs implements HeartRateControlConfigApi {
    @Override // com.huawei.health.hearratecontrol.HeartRateControlConfigApi
    public void getCourseInfoByCourseId(int i, String str, ConfigCallBack<FitWorkout> configCallBack) {
        ehx.a(i, str, configCallBack);
    }

    @Override // com.huawei.health.hearratecontrol.HeartRateControlConfigApi
    public void requestGlobalConfigByType(int i, ConfigCallBack<fgf> configCallBack) {
        ehx.b(i, configCallBack);
    }
}
