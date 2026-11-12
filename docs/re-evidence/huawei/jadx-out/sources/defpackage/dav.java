package defpackage;

import com.huawei.basefitnessadvice.api.BaseSportModelApi;
import com.huawei.basefitnessadvice.callback.DeviceCallback;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;

/* JADX INFO: loaded from: classes23.dex */
@ApiDefine(uri = BaseSportModelApi.class)
@Singleton
public class dav implements BaseSportModelApi {
    @Override // com.huawei.basefitnessadvice.api.BaseSportModelApi
    public void sendCommandToDevice(String str, DeviceCallback deviceCallback) {
        gur.d().b(str, deviceCallback);
    }

    @Override // com.huawei.basefitnessadvice.api.BaseSportModelApi
    public void sendCommandToDevice(byte[] bArr, int i, DeviceCallback deviceCallback) {
        gur.d().e(bArr, i, deviceCallback);
    }
}
