package com.xiaomi.hm.health.di.koin.imp;

import com.xiaomi.hm.health.device.settings.alert.factory.AmazfitAlertConfigProvider;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/imp/AmazfitAlertConfigProviderImp;", "Lcom/xiaomi/hm/health/device/settings/alert/factory/AmazfitAlertConfigProvider;", "Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "get", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AmazfitAlertConfigProviderImp implements AmazfitAlertConfigProvider {
    @Override // com.xiaomi.hm.health.device.settings.alert.factory.AmazfitAlertConfigProvider
    @NotNull
    public HMMiliConfig get() {
        return HMPersonInfo.getInstance().getMiliConfig();
    }
}
