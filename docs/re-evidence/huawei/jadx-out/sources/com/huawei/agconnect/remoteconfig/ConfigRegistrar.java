package com.huawei.agconnect.remoteconfig;

import android.content.Context;
import com.huawei.agconnect.AGCInitFinishManager;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.core.Service;
import com.huawei.agconnect.core.ServiceRegistrar;
import com.huawei.agconnect.remoteconfig.internal.AGConnectConfigImpl;
import com.huawei.agconnect.remoteconfig.internal.ConfigHaManager;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ConfigRegistrar implements ServiceRegistrar {
    private static final String TAG = "ConfigRegistrar";

    @Override // com.huawei.agconnect.core.ServiceRegistrar
    public void initialize(Context context) {
        AGCInitFinishManager.getInstance().addAGCInitFinishCallback(new AGCInitFinishManager.AGCInitFinishCallback() { // from class: com.huawei.agconnect.remoteconfig.ConfigRegistrar.1
            @Override // com.huawei.agconnect.AGCInitFinishManager.AGCInitFinishCallback
            public void onFinish() {
                ConfigHaManager.a().b();
                Logger.i(ConfigRegistrar.TAG, "AGCInitFinishCallback");
            }
        });
    }

    @Override // com.huawei.agconnect.core.ServiceRegistrar
    public List<Service> getServices(Context context) {
        return Arrays.asList(Service.builder(AGConnectConfigImpl.class).build());
    }
}
