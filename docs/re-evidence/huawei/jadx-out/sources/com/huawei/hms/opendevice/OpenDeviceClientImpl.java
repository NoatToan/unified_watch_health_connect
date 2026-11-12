package com.huawei.hms.opendevice;

import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.support.api.entity.opendevice.HuaweiOpendeviceNaming;
import com.huawei.hms.support.api.opendevice.OdidResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.utils.JsonUtil;

/* JADX INFO: loaded from: classes34.dex */
public class OpenDeviceClientImpl extends HuaweiApi<OpenDeviceOptions> implements OpenDeviceClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final OpenDeviceHmsClientBuilder f15800a = new OpenDeviceHmsClientBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Api<OpenDeviceOptions> f15801b = new Api<>(HuaweiApiAvailability.HMS_API_NAME_OD);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static OpenDeviceOptions f15802c = new OpenDeviceOptions();

    OpenDeviceClientImpl(Context context) {
        super(context, f15801b, f15802c, f15800a);
        super.setKitSdkVersion(61300301);
    }

    @Override // com.huawei.hms.opendevice.OpenDeviceClient
    public Task<OdidResult> getOdid() {
        return doWrite(new OpenDeviceTaskApiCall(HuaweiOpendeviceNaming.GET_ODID, JsonUtil.createJsonString(null), HiAnalyticsClient.reportEntry(getContext(), HuaweiOpendeviceNaming.GET_ODID, 61300301)));
    }
}
