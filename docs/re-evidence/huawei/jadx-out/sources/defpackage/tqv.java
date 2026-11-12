package defpackage;

import android.content.Context;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.health.vip.api.EquityApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = EquityApi.class)
@Singleton
public class tqv implements EquityApi {
    @Override // com.huawei.health.vip.api.EquityApi
    public void getDoctorBasicInfo(final DataCallback dataCallback) {
        ugs.e().getDoctorBasicInfo(new com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback() { // from class: tqv.5
            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onFailure(int i, String str) {
                dataCallback.onFailure(i, str);
            }

            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                dataCallback.onSuccess(jSONObject);
            }
        });
    }

    @Override // com.huawei.health.vip.api.EquityApi
    public void showDeviceEquityDialog(Object obj, Context context, int i, long j, int i2) {
        vct.b(obj, context, i, j, i2);
    }
}
