package com.xiaomi.hm.health.bt.profile.collect;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.util.Calendar;

/* JADX INFO: loaded from: classes11.dex */
public class HMSyncDataCollectProfile extends HMProSyncDataBaseProfile {
    private static final byte n = 28;

    public HMSyncDataCollectProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
    }

    private DataCollect o(HMNotifyResponse response) {
        if (response == null || !response.isSuccess((byte) 1)) {
            return null;
        }
        byte[] data = response.getData();
        if (data == null || data.length != 10) {
            Debug.fi(HMBaseProfile.TAG, "DataCollect getDataSummary data null or length failed");
            return null;
        }
        byte[] bArr = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            bArr[i] = data[i];
        }
        return new DataCollect(bArr);
    }

    public DataCollect getDataCollect(Calendar time) {
        short s = (short) time.get(1);
        byte b = (byte) (time.get(2) + 1);
        byte b2 = (byte) time.get(5);
        byte b3 = (byte) time.get(11);
        byte b4 = (byte) time.get(12);
        byte b5 = (byte) time.get(13);
        byte timezoneKey = (byte) ProfileUtils.getTimezoneKey(time.getTimeZone());
        Debug.fi(HMBaseProfile.TAG, "type:28,year:" + ((int) s) + ",month:" + ((int) b) + ",day:" + ((int) b2) + ",hours:" + ((int) b3) + ",minutes:" + ((int) b4) + ",seconds:" + ((int) b5) + ",tz:" + ((int) timezoneKey));
        byte[] bArr = {1, 28, (byte) (s & 255), (byte) ((s >> 8) & 255), b, b2, b3, b4, b5, timezoneKey};
        StringBuilder sb = new StringBuilder();
        sb.append("cmd:");
        sb.append(GattUtils.bytesToHexString(bArr));
        Debug.i(HMBaseProfile.TAG, sb.toString());
        return o(sendControlCommandResponse(bArr));
    }
}
