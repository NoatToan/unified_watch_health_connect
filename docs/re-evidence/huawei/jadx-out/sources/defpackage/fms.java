package defpackage;

import android.content.ContentValues;
import com.huawei.health.device.api.DeviceDataBaseHelperApi;
import com.huawei.hmf.annotation.ApiDefine;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = DeviceDataBaseHelperApi.class)
public class fms implements DeviceDataBaseHelperApi {
    @Override // com.huawei.health.device.api.DeviceDataBaseHelperApi
    public long insert(ContentValues contentValues) {
        return dmk.d().e("device", contentValues);
    }

    @Override // com.huawei.health.device.api.DeviceDataBaseHelperApi
    public long update(ContentValues contentValues, String str, String[] strArr) {
        return dmk.d().d("device", contentValues, str, strArr);
    }
}
