package com.huawei.agconnect.credential;

import android.content.Context;
import com.huawei.agconnect.AGCInitFinishManager;
import com.huawei.agconnect.common.api.HaConnector;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.common.platform.OkHttpManager;
import com.huawei.agconnect.core.Service;
import com.huawei.agconnect.core.ServiceRegistrar;
import com.huawei.agconnect.core.service.EndpointService;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.credential.internal.BaseContext;
import com.huawei.agconnect.credential.internal.CredentialsProviderImpl;
import com.huawei.agconnect.credential.internal.EndpointServiceImpl;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class CredentialServiceRegistrar implements ServiceRegistrar {
    private static final String TAG = "CredentialServiceRegistrar";

    @Override // com.huawei.agconnect.core.ServiceRegistrar
    public void initialize(final Context context) {
        Logger.d(TAG, "initialize");
        BaseContext.a(context);
        SharedPrefUtil.init(context);
        OkHttpManager.a(context);
        AGCInitFinishManager.getInstance().addAGCInitFinishCallback(new AGCInitFinishManager.AGCInitFinishCallback() { // from class: com.huawei.agconnect.credential.CredentialServiceRegistrar.1
            @Override // com.huawei.agconnect.AGCInitFinishManager.AGCInitFinishCallback
            public void onFinish() {
                HaConnector.getInstance().init(context);
                Logger.i(CredentialServiceRegistrar.TAG, "AGCInitFinishCallback");
            }
        });
    }

    @Override // com.huawei.agconnect.core.ServiceRegistrar
    public List<Service> getServices(Context context) {
        return Arrays.asList(Service.builder((Class<?>) CredentialsProvider.class, (Class<?>) CredentialsProviderImpl.class).build(), Service.builder((Class<?>) EndpointService.class, (Class<?>) EndpointServiceImpl.class).isSingleton(true).build());
    }
}
