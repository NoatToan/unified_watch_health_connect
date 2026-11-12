package com.huawei.basichealthmodel.cloud;

import android.content.Context;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import defpackage.lsl;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class HealthModelParamsFactory extends HealthDataCloudFactory {
    public HealthModelParamsFactory(Context context) {
        super(context);
    }

    @Override // com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory, com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> body = super.getBody(obj);
        if (!body.containsKey("timeZone")) {
            body.put("timeZone", lsl.q(System.currentTimeMillis()));
        }
        return body;
    }
}
