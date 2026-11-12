package defpackage;

import androidx.fragment.app.Fragment;
import com.huawei.health.device.api.DeviceFragmentFactoryApi;
import com.huawei.hmf.annotation.ApiDefine;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = DeviceFragmentFactoryApi.class)
public class fmp implements DeviceFragmentFactoryApi {
    @Override // com.huawei.health.device.api.DeviceFragmentFactoryApi
    public Fragment getMeasureFragment(String str) {
        return dst.a(str);
    }

    @Override // com.huawei.health.device.api.DeviceFragmentFactoryApi
    public Fragment getResultFragment(String str) {
        return dst.e(str);
    }
}
