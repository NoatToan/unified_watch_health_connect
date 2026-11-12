package com.huawei.hms.hwid;

import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* JADX INFO: loaded from: classes34.dex */
public class ah extends AbstractClientBuilder<ai, Api.ApiOptions.NoOptions> {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ai buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new ai(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
