package defpackage;

import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.CloudApi;
import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback;
import java.io.File;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class ugl implements CloudApi {
    @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.CloudApi
    public void downloadFile(String str, String str2, DataCallback dataCallback) {
        if (!new File(str2).exists()) {
            ugj.a(str, str2, dataCallback);
        } else {
            dataCallback.onSuccess(new JSONObject());
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.CloudApi
    public void getDoctorBasicInfo(DataCallback dataCallback) {
        ugm.c().b((Object) null, ugr.b(), false, dataCallback);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.CloudApi
    public void getDoctorImInfo(DataCallback dataCallback) {
        ugm.c().b((Object) null, ugr.c(), false, dataCallback);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.CloudApi
    public void queryExclusiveGuardianStatus(Map<String, Integer> map, DataCallback dataCallback) {
        ugm.c().b((Object) map, ugr.e(), false, dataCallback);
    }
}
