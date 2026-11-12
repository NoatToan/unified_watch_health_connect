package com.huawei.hianalytics;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends AbstractClientBuilder {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    public final AnyClient buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new o0(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
