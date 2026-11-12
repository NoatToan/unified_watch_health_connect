package com.huami.xiaopeng.ui.amazfit.helper;

import android.content.Context;
import com.huami.components.devicestatus.DeviceStatusStringProvider;
import com.huami.xiaopeng.ui.amazfit.R;

/* JADX INFO: loaded from: classes18.dex */
public class WalletDeviceStatusStringProvider implements DeviceStatusStringProvider {
    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getBluetoothOffText(Context context) {
        return context.getString(R.string.car_s_xiaopeng_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getConnectFailedText(Context context) {
        return context.getString(R.string.car_s_xiaopeng_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getConnectingText(Context context) {
        return context.getString(R.string.car_s_xiaopeng_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getHelpText(Context context) {
        return context.getString(R.string.car_s_xiaopeng_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getSyncAGPSFailedText(Context context) {
        return context.getString(R.string.car_s_xiaopeng_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getSyncFailedText(Context context) {
        return context.getString(R.string.car_s_xiaopeng_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getSynchronizingAGPSText(Context context, int i) {
        return context.getString(R.string.car_s_xiaopeng_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getSynchronizingDataText(Context context, int i) {
        return context.getString(R.string.car_s_xiaopeng_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getUnboundTextForFunction(Context context) {
        return context.getString(R.string.car_s_xiaopeng_title);
    }
}
