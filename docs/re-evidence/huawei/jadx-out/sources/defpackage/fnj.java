package defpackage;

import com.huawei.health.device.api.WiFiWeightSaveHandlerApi;
import com.huawei.health.device.callback.WeightInsertStatusCallback;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = WiFiWeightSaveHandlerApi.class)
public class fnj implements WiFiWeightSaveHandlerApi {
    @Override // com.huawei.health.device.api.WiFiWeightSaveHandlerApi
    public void setMainUserHeartRate(List<HiHealthData> list) {
        eaw eawVar = new eaw(MultiUsersManager.INSTANCE.getCurrentUser(), new WeightInsertStatusCallback() { // from class: fnn
            @Override // com.huawei.health.device.callback.WeightInsertStatusCallback
            public final void isSuccess(boolean z) {
                fnj.d(z);
            }
        });
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            eawVar.e(it.next());
        }
    }

    static /* synthetic */ void d(boolean z) {
        if (z) {
            LogUtil.a("WiFiWeightSaveHandlerImpl", "setMainUserHeartRate success");
        }
    }
}
