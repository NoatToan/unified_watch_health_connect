package com.huawei.hms.health;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* JADX INFO: loaded from: classes10.dex */
public class aabi extends AbstractClientBuilder<aabh, aabl> {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    public AnyClient buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        aabz.aabb("ClientBuilder", "HealthHmsClientBluilder : buildClient");
        return new aabh(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
