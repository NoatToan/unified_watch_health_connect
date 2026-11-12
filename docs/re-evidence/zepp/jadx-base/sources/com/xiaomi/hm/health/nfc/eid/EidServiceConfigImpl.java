package com.xiaomi.hm.health.nfc.eid;

import cn.eid.service.EidServiceConfig;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.watch.companion.eid.EidDeviceUtil;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/nfc/eid/EidServiceConfigImpl;", "Lcn/eid/service/EidServiceConfig;", "", "isSupportEid", "isConnect", "", "getVersion", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EidServiceConfigImpl implements EidServiceConfig {
    @Override // cn.eid.service.EidServiceConfig
    @NotNull
    public String getVersion() {
        return HMAppConfig.getVersionName() + AESEncryptionHelper.SEPARATOR + HMAppConfig.getVersionCode();
    }

    @Override // cn.eid.service.EidServiceConfig
    public boolean isConnect() {
        return HMDeviceManager.getInstance().isConnected(HMDeviceType.WATCH);
    }

    @Override // cn.eid.service.EidServiceConfig
    public boolean isSupportEid() {
        return EidDeviceUtil.isSupportEid(BraceletApp.getContext());
    }
}
