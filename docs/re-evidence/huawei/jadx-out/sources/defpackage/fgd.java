package defpackage;

import android.util.Pair;
import com.huawei.basefitnessadvice.api.HeartRateControlApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.ResponseCallback;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes28.dex */
@ApiDefine(uri = HeartRateControlApi.class)
@Singleton
public class fgd implements HeartRateControlApi {
    @Override // com.huawei.basefitnessadvice.api.HeartRateControlApi
    public void initPersonalParam(int i, ResponseCallback responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.e("R_HRControl_HeartRateControlImpl", "initPersonalParam callback is null");
        } else {
            ReleaseLogUtil.d("R_HRControl_HeartRateControlImpl", "initPersonalParam sportType = ", Integer.valueOf(i));
            fgp.d().d(i, responseCallback);
        }
    }

    @Override // com.huawei.basefitnessadvice.api.HeartRateControlApi
    public Pair<Integer, Integer> getCourseZoneHeartRateScope(Pair<Float, Float> pair, String str) {
        Pair<Float, Float> pair2;
        if (pair == null) {
            ReleaseLogUtil.e("R_HRControl_HeartRateControlImpl", "getCourseZoneHeartRateScope courseZoneScope is null");
            pair2 = new Pair<>(Float.valueOf(0.3f), Float.valueOf(0.7f));
        } else {
            pair2 = pair;
        }
        ReleaseLogUtil.d("R_HRControl_HeartRateControlImpl", "getCourseZoneHeartRateScope courseZoneScope = ", pair.toString(), ", courseZoneScopeType = ", str);
        fgp fgpVarD = fgp.d();
        return fgc.d(fgpVarD.e(), fgpVarD.b(), pair2, str);
    }

    @Override // com.huawei.basefitnessadvice.api.HeartRateControlApi
    public int getCourseZoneTargetHeartRate(Pair<Integer, Integer> pair) {
        if (pair == null) {
            ReleaseLogUtil.e("R_HRControl_HeartRateControlImpl", "getCourseZoneTargetHeartRate courseZoneHeartRateScope is null");
            return 0;
        }
        ReleaseLogUtil.d("R_HRControl_HeartRateControlImpl", "getCourseZoneTargetHeartRate courseZoneHeartRateScope = ", pair.toString());
        return fgc.a(pair);
    }

    @Override // com.huawei.basefitnessadvice.api.HeartRateControlApi
    public float getCourseZoneTargetSpeed(int i) {
        ReleaseLogUtil.d("R_HRControl_HeartRateControlImpl", "getCourseZoneTargetSpeed courseZoneTargetHeartRate = ", Integer.valueOf(i));
        fgp fgpVarD = fgp.d();
        return fgn.d(i, fgpVarD.a(), fgpVarD.c());
    }

    @Override // com.huawei.basefitnessadvice.api.HeartRateControlApi
    public Pair<Float, Float> getCourseZoneSpeedScope(Pair<Integer, Integer> pair, float f) {
        ReleaseLogUtil.d("R_HRControl_HeartRateControlImpl", "getCourseZoneSpeedScope courseZoneHeartRateScope = ", pair, ", machineSpeedLimit = ", Float.valueOf(f));
        fgp fgpVarD = fgp.d();
        return fgn.d(pair, fgpVarD.b(), fgpVarD.a(), fgpVarD.c(), f);
    }
}
