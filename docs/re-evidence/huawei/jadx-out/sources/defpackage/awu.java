package defpackage;

import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.UploadSmartLifeApi;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes22.dex */
@ApiDefine(uri = UploadSmartLifeApi.class)
public class awu implements UploadSmartLifeApi {
    @Override // com.huawei.plugindevice.UploadSmartLifeApi
    public void upload(String str, String str2, MeasurableDevice measurableDevice) {
        LogUtil.a("UploadSmartLifeApiImpl", "enter uploadDeviceToCloud");
        dmp.d().b(str, str2, measurableDevice);
    }

    @Override // com.huawei.plugindevice.UploadSmartLifeApi
    public void upload(String str, String str2, String str3, MeasurableDevice measurableDevice) {
        LogUtil.a("UploadSmartLifeApiImpl", "enter uploadDeviceToCloud:", CommonUtil.n(str3));
        dmp.d().e(str, str2, str3, measurableDevice);
    }

    @Override // com.huawei.plugindevice.UploadSmartLifeApi
    public void delete(String str, String str2) {
        enm.d(str, str2);
    }
}
