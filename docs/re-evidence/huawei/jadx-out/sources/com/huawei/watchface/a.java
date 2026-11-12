package com.huawei.watchface;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.support.hwid.HuaweiIdAuthAPIManager;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper;
import com.huawei.watchface.utils.HwLog;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes20.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HuaweiApiClient f30042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExecutorService f30043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f30044c;

    public a(Activity activity) {
        this.f30044c = activity;
    }

    public void a(Context context, HuaweiApiClient.ConnectionCallbacks connectionCallbacks, HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        HuaweiIdAuthParams huaweiIdAuthParamsCreateParams = new HuaweiIdAuthParamsHelper(HuaweiIdAuthParams.DEFAULT_AUTH_REQUEST_PARAM).createParams();
        if (context == null) {
            HwLog.i("Login_AccessTokenManager", "hmsConnect context == null");
            return;
        }
        HuaweiApiClient huaweiApiClientBuild = new HuaweiApiClient.Builder(context.getApplicationContext()).addApi(HuaweiIdAuthAPIManager.HUAWEI_OAUTH_API, huaweiIdAuthParamsCreateParams).addScope(HuaweiIdAuthAPIManager.HUAWEIID_BASE_SCOPE).addConnectionCallbacks(connectionCallbacks).addOnConnectionFailedListener(onConnectionFailedListener).build();
        this.f30042a = huaweiApiClientBuild;
        huaweiApiClientBuild.connect(this.f30044c);
    }

    public void a() {
        ExecutorService executorService = this.f30043b;
        if (executorService != null) {
            executorService.shutdown();
        }
        HuaweiApiClient huaweiApiClient = this.f30042a;
        if (huaweiApiClient != null) {
            huaweiApiClient.disconnect();
            this.f30042a = null;
        }
        this.f30044c = null;
    }
}
