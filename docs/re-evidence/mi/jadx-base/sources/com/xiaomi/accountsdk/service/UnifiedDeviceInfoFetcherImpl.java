package com.xiaomi.accountsdk.service;

import android.content.Context;
import android.os.Bundle;
import com.xiaomi.accountsdk.account.data.Constants;
import com.xiaomi.accountsdk.hasheddeviceidlib.IUnifiedDeviceIdFetcher;

/* JADX INFO: loaded from: classes6.dex */
public class UnifiedDeviceInfoFetcherImpl implements IUnifiedDeviceIdFetcher {
    @Override // com.xiaomi.accountsdk.hasheddeviceidlib.IUnifiedDeviceIdFetcher
    public String getHashedDeviceId(Context context) {
        Bundle bundle;
        DeviceInfoResult deviceInfoRpc = PassportCommonServiceClient.getDeviceInfoRpc(context, Constants.PASSPORT_SID, 1, 5000);
        if (deviceInfoRpc == null || (bundle = deviceInfoRpc.deviceInfo) == null) {
            return null;
        }
        return bundle.getString(DeviceInfoResult.BUNDLE_KEY_HASHED_DEVICE_ID);
    }
}
