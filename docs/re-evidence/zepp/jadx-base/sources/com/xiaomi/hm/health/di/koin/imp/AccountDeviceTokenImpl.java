package com.xiaomi.hm.health.di.koin.imp;

import com.huami.account.IDeviceTokenConfig;
import com.huami.passport.IAccount;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/imp/AccountDeviceTokenImpl;", "Lcom/huami/account/IDeviceTokenConfig;", "", "source", "", "getClientId", "getSecret", "getTpacProvider", "", "isSupportDeviceToken", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AccountDeviceTokenImpl implements IDeviceTokenConfig {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_KONGMING.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_KONGMING_L.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_KONGMING_PRO.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_PANGU.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_L66_NFC.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_L66_NFC_I.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.huami.account.IDeviceTokenConfig
    @NotNull
    public String getClientId(int source) {
        return "";
    }

    @Override // com.huami.account.IDeviceTokenConfig
    @NotNull
    public String getSecret(int source) {
        return "";
    }

    @Override // com.huami.account.IDeviceTokenConfig
    @Nullable
    public String getTpacProvider(int source) {
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(source);
        switch (hMDeviceSourceFromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hMDeviceSourceFromValue.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return IAccount.PROVIDER_DEVICE_KONGMING;
            default:
                return "";
        }
    }

    @Override // com.huami.account.IDeviceTokenConfig
    public boolean isSupportDeviceToken(int source) {
        return false;
    }
}
