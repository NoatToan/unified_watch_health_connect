package defpackage;

import com.huawei.health.device.wifi.interfaces.WiFiDevicePushReceiver;
import com.huawei.health.device.wifi.interfaces.WiFiMultiUserPushReceiver;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.hmf.services.ModuleProvider;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes29.dex */
public class fnf extends ModuleProvider {
    @Override // com.huawei.hmf.services.ModuleProvider
    public void initialize() {
        super.initialize();
        MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        messageCenterApi.registerMessageHandler(new WiFiDevicePushReceiver());
        messageCenterApi.registerMessageHandler(new WiFiMultiUserPushReceiver());
    }
}
