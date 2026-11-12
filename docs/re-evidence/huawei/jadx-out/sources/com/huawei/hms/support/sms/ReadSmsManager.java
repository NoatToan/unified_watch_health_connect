package com.huawei.hms.support.sms;

import android.app.Activity;
import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.hwid.ah;
import com.huawei.hms.hwid.aj;

/* JADX INFO: loaded from: classes34.dex */
public class ReadSmsManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Api<Api.ApiOptions.NoOptions> f16677a = new Api<>(HuaweiApiAvailability.HMS_API_NAME_ID);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ah f16678b = new ah();

    public static Task<Void> start(Activity activity) {
        return new aj(activity, f16677a, (Api.ApiOptions.NoOptions) null, (AbstractClientBuilder) f16678b).a();
    }

    public static Task<Void> start(Context context) {
        return new aj(context, f16677a, (Api.ApiOptions.NoOptions) null, f16678b).a();
    }

    public static Task<Void> startConsent(Activity activity, String str) {
        return new aj(activity, f16677a, (Api.ApiOptions.NoOptions) null, (AbstractClientBuilder) f16678b).a(str);
    }
}
