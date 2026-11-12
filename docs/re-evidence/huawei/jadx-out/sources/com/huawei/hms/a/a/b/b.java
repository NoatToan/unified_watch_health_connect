package com.huawei.hms.a.a.b;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.support.picker.request.AccountPickerParams;

/* JADX INFO: loaded from: classes10.dex */
public class b extends AbstractClientBuilder<a, AccountPickerParams> {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new a(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
