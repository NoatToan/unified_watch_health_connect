package com.huawei.pluginmessagecenter;

import com.huawei.hmf.services.ModuleProvider;
import com.huawei.pluginmessagecenter.receiver.AccountMigratePushReceiver;
import com.huawei.pluginmessagecenter.receiver.MemberPushReceiver;
import com.huawei.pluginmessagecenter.receiver.TradePushReceiver;
import com.huawei.pluginmessagecenter.receiver.WifiSyncMsgReceiver;
import com.huawei.pluginmessagecenter.service.HuaweiHealthHmsPushService;
import defpackage.phc;
import defpackage.phh;
import defpackage.phj;
import defpackage.phk;

/* JADX INFO: loaded from: classes42.dex */
public class MessageCenterModule extends ModuleProvider {
    @Override // com.huawei.hmf.services.ModuleProvider
    public void initialize() {
        super.initialize();
        HuaweiHealthHmsPushService.registerMessageHandler(new AccountMigratePushReceiver());
        HuaweiHealthHmsPushService.registerMessageHandler(new WifiSyncMsgReceiver());
        HuaweiHealthHmsPushService.registerMessageHandler(new phk());
        HuaweiHealthHmsPushService.registerMessageHandler(new TradePushReceiver());
        HuaweiHealthHmsPushService.registerMessageHandler(new MemberPushReceiver());
        HuaweiHealthHmsPushService.registerMessageHandler(new phj());
        HuaweiHealthHmsPushService.registerMessageHandler(new phc());
        HuaweiHealthHmsPushService.registerMessageHandler(new phh());
    }
}
