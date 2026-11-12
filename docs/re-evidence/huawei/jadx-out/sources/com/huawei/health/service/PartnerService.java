package com.huawei.health.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.clockwork.companion.partnerapi.PartnerHostedApi;
import com.google.android.clockwork.companion.partnerapi.SmartWatchInfo;
import com.huawei.datatype.GoogleDeviceCache;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes31.dex */
public class PartnerService extends Service {
    private static final String TAG = "PartnerService";
    private final PartnerHostedApi.Stub mBinder = new PartnerHostedApi.Stub() { // from class: com.huawei.health.service.PartnerService.5
        @Override // com.google.android.clockwork.companion.partnerapi.PartnerHostedApi
        public SmartWatchInfo getPendingPairingSmartWatchInfo() {
            GoogleDeviceCache.QrBleCache cache = GoogleDeviceCache.getInstance().getCache();
            if (cache == null) {
                LogUtil.j(PartnerService.TAG, "getPendingPairingSmartWatchInfo deviceCache null");
                return null;
            }
            try {
                if (cache.getBluetoothDevice() != null) {
                    LogUtil.a(PartnerService.TAG, "getPendingPairingSmartWatchInfo cache :", cache.getBluetoothDevice().getName());
                }
            } catch (SecurityException e) {
                LogUtil.e(PartnerService.TAG, "PartnerHostedApi SecurityException:", ExceptionUtils.c(e));
            }
            SmartWatchInfo smartWatchInfo = new SmartWatchInfo();
            smartWatchInfo.setBluetoothDevice(cache.getBluetoothDevice());
            smartWatchInfo.setRssiValue(cache.getRssi());
            smartWatchInfo.setTimeStampMs(cache.getTime());
            smartWatchInfo.setDeviceModelImageResId(R.mipmap.img_huawei_watch_w2_pic1);
            LogUtil.a(PartnerService.TAG, "getPendingPairingSmartWatchInfo");
            return smartWatchInfo;
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        LogUtil.a(TAG, "onBind");
        return this.mBinder;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        boolean zOnUnbind = super.onUnbind(intent);
        LogUtil.a(TAG, "onUnbind status :", Boolean.valueOf(zOnUnbind));
        return zOnUnbind;
    }
}
