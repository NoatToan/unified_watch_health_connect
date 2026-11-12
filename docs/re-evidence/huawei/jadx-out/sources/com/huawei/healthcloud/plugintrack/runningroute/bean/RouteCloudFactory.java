package com.huawei.healthcloud.plugintrack.runningroute.bean;

import android.content.Context;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import defpackage.chf;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class RouteCloudFactory extends HealthDataCloudFactory {
    public RouteCloudFactory(Context context) {
        super(context);
    }

    @Override // com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory, com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map<String, Object> body = super.getBody(obj);
        body.put("language", chf.a());
        return body;
    }
}
