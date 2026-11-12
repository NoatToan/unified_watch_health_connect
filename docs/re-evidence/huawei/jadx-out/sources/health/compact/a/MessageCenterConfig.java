package health.compact.a;

import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.receiver.EcgPushReceiver;
import com.huawei.health.suggestion.receiver.FitnessHistoryPushReceiver;
import com.huawei.healthcloud.plugintrack.wearengine.rqmanager.RqDataPushReceiver;
import com.huawei.hihealthservice.sync.util.HiSyncMsgReceiver;
import com.huawei.hihealthservice.sync.util.HiWiFiSyncMsgReceiver;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import defpackage.gsq;
import defpackage.gsy;
import defpackage.unj;

/* JADX INFO: loaded from: classes.dex */
public class MessageCenterConfig {
    public static void d() {
        e();
    }

    private static void e() {
        com.huawei.hwlogsmodel.LogUtil.a("MessageCenterConfig", "registerHmsMsgHandlers enter");
        MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        messageCenterApi.registerMessageHandler(new EcgPushReceiver());
        messageCenterApi.registerMessageHandler(new FitnessHistoryPushReceiver());
        messageCenterApi.registerMessageHandler(new gsq());
        messageCenterApi.registerMessageHandler(new unj());
        messageCenterApi.registerMessageHandler(new HealthZonePushReceiver());
        messageCenterApi.registerMessageHandler(new HiSyncMsgReceiver());
        messageCenterApi.registerMessageHandler(new HiWiFiSyncMsgReceiver());
        messageCenterApi.registerMessageHandler(new RqDataPushReceiver());
        messageCenterApi.registerMessageHandler(new gsy());
    }
}
