package com.huawei.hms.hwid;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;

/* JADX INFO: loaded from: classes10.dex */
public class v extends AbstractClientBuilder<u, HuaweiIdAuthParams> {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new u(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
