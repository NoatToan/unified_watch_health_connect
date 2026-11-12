package defpackage;

import android.app.Activity;
import android.content.Context;
import com.huawei.health.device.api.VersionVerifyUtilApi;
import com.huawei.health.device.callback.VersionNoSupportCallback;
import com.huawei.hmf.annotation.ApiDefine;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = VersionVerifyUtilApi.class)
public class fni implements VersionVerifyUtilApi {
    @Override // com.huawei.health.device.api.VersionVerifyUtilApi
    public boolean isPublishVersion(String str, String str2) {
        return dzu.e(str, str2);
    }

    @Override // com.huawei.health.device.api.VersionVerifyUtilApi
    public void noSupportDevice(Context context, Activity activity) {
        dzu.e(context, activity);
    }

    @Override // com.huawei.health.device.api.VersionVerifyUtilApi
    public void noSupportDevice(Context context, Activity activity, VersionNoSupportCallback versionNoSupportCallback) {
        dzu.c(context, activity, versionNoSupportCallback);
    }
}
