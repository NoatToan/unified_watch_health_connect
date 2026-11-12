package defpackage;

import android.widget.LinearLayout;
import com.huawei.health.configuredpage.api.ConfiguredPageApi;
import com.huawei.health.configuredpage.api.ConfiguredPageDataCallback;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = ConfiguredPageApi.class)
@Singleton
public class trf implements ConfiguredPageApi {
    @Override // com.huawei.health.configuredpage.api.ConfiguredPageApi
    public void refreshConfiguredPageUi(int i, LinearLayout linearLayout) {
        trd.b(i, linearLayout);
    }

    @Override // com.huawei.health.configuredpage.api.ConfiguredPageApi
    public void initOperationConfiguredPage(int i, LinearLayout linearLayout, ConfiguredPageDataCallback configuredPageDataCallback) {
        trd.a(i, linearLayout, configuredPageDataCallback);
    }
}
