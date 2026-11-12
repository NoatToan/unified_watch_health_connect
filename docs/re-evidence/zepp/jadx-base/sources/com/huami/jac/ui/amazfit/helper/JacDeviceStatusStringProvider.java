package com.huami.jac.ui.amazfit.helper;

import android.content.Context;
import com.huami.components.devicestatus.DeviceStatusStringProvider;
import com.huami.jac.ui.amazfit.R;

/* JADX INFO: loaded from: classes10.dex */
public class JacDeviceStatusStringProvider implements DeviceStatusStringProvider {
    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getBluetoothOffText(Context context) {
        return context.getString(R.string.jac_car_s_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getConnectFailedText(Context context) {
        return context.getString(R.string.jac_car_s_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getConnectingText(Context context) {
        return context.getString(R.string.jac_car_s_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getHelpText(Context context) {
        return context.getString(R.string.jac_car_s_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getSyncAGPSFailedText(Context context) {
        return context.getString(R.string.jac_car_s_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getSyncFailedText(Context context) {
        return context.getString(R.string.jac_car_s_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getSynchronizingAGPSText(Context context, int i) {
        return context.getString(R.string.jac_car_s_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getSynchronizingDataText(Context context, int i) {
        return context.getString(R.string.jac_car_s_title);
    }

    @Override // com.huami.components.devicestatus.DeviceStatusStringProvider
    public String getUnboundTextForFunction(Context context) {
        return context.getString(R.string.jac_car_s_title);
    }
}
