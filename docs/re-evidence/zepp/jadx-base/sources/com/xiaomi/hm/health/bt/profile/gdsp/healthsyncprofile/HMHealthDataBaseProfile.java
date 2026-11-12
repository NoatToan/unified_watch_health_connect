package com.xiaomi.hm.health.bt.profile.gdsp.healthsyncprofile;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataProfile;

/* JADX INFO: loaded from: classes18.dex */
public class HMHealthDataBaseProfile extends HMProSyncDataProfile {
    public HMHealthDataBaseProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile
    public DataHeader getDataHeader(byte type, short year, byte month, byte day, byte hours, byte minutes, byte seconds, byte tz) {
        Debug.fi(HMBaseProfile.TAG, "type:" + ((int) type) + ",year:" + ((int) year) + ",month:" + ((int) month) + ",day:" + ((int) day) + ",hours:" + ((int) hours) + ",minutes:" + ((int) minutes) + ",seconds:" + ((int) seconds) + ",tz:" + ((int) tz));
        byte[] bArr = {1, type, (byte) (year & 255), (byte) ((year >> 8) & 255), month, day, hours, minutes, seconds, tz};
        StringBuilder sb = new StringBuilder();
        sb.append("cmd:");
        sb.append(GattUtils.bytesToHexString(bArr));
        Debug.i(HMBaseProfile.TAG, sb.toString());
        HMNotifyResponse hMNotifyResponseSendControlCommandResponse = sendControlCommandResponse(bArr);
        if (hMNotifyResponseSendControlCommandResponse == null) {
            return null;
        }
        if (!hMNotifyResponseSendControlCommandResponse.isSuccess((byte) 1)) {
            DataHeader dataHeader = new DataHeader(hMNotifyResponseSendControlCommandResponse.getCode());
            dataHeader.size = -1;
            return dataHeader;
        }
        DataHeader dataHeader2 = parseDataHeader(hMNotifyResponseSendControlCommandResponse.getData());
        Debug.fi(HMBaseProfile.TAG, "type:" + ((int) type) + " data header:" + dataHeader2);
        return dataHeader2;
    }
}
