package defpackage;

import com.huawei.health.heartratesetting.HeartRateSettingApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.ui.main.stories.settings.js.CustomDataService;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = HeartRateSettingApi.class)
@Singleton
public class wlu implements HeartRateSettingApi {
    @Override // com.huawei.health.heartratesetting.HeartRateSettingApi
    public Class<?> getCustomDataApi() {
        return CustomDataService.class;
    }
}
