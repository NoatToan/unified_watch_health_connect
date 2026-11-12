package com.huami.components.devicestatus;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public interface DeviceStatusStringProvider {
    String getBluetoothOffText(Context context);

    String getConnectFailedText(Context context);

    String getConnectingText(Context context);

    String getHelpText(Context context);

    String getSyncAGPSFailedText(Context context);

    String getSyncFailedText(Context context);

    String getSynchronizingAGPSText(Context context, int i);

    String getSynchronizingDataText(Context context, int i);

    String getUnboundTextForFunction(Context context);
}
