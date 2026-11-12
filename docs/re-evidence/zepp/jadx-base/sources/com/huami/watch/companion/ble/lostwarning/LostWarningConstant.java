package com.huami.watch.companion.ble.lostwarning;

import android.os.ParcelUuid;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public class LostWarningConstant {
    public static final int ACTION_REQUEST_PERFORM = 1;
    public static final String STATE_CLOSE = "0";
    public static final String STATE_OPEN = "1";
    public static UUID SERVICE = UUID.fromString("0000fed1-0000-3512-2118-0009af100700");
    public static UUID SOURCE = UUID.fromString("0000fed2-0000-3512-2118-0009af100700");
    public static UUID CHAC_CONFIG = UUID.fromString("00002902-0000-1000-8000-00805f9b34FB");
    public static UUID GENERIC_ATTRIBUTE = UUID.fromString("00001801-0000-1000-8000-00805f9b34fb");
    public static UUID CHAR_SERVICE_CHANGE = UUID.fromString("00002A05-0000-1000-8000-00805f9b34fb");
    public static byte[] ENABLE_VALUE = {16, 0};
    public static byte[] DISABLE_VALUE = {17, 0};
    public static ParcelUuid MI_SERVICE = ParcelUuid.fromString("0000fe95-0000-1000-8000-00805f9b34fb");

    public static byte[] GetPerformData(int i) {
        if (i != 1) {
            return null;
        }
        return ENABLE_VALUE;
    }
}
