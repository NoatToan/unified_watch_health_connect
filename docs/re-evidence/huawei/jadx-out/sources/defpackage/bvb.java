package defpackage;

import com.huawei.basichealthmodel.receiver.HealthModelPushReceiver;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.hmf.services.ModuleProvider;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes23.dex */
public class bvb extends ModuleProvider {
    @Override // com.huawei.hmf.services.ModuleProvider
    public void initialize() {
        super.initialize();
        ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).registerMessageHandler(new HealthModelPushReceiver());
    }
}
