package com.xiaomi.hm.health.bt.classic;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityHrData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes19.dex */
public class HMProSyncDataBaseProfile {
    public static final byte CMD_START_TRANSFER = 2;
    public static final byte DATA_TYPE_ECG = 3;
    public static final byte DATA_TYPE_GPS_DETAIL = 6;
    public static final byte DATA_TYPE_GPS_SUMMARY = 5;
    public static final byte DATA_TYPE_HEARTRATE = 2;
    public static final byte DATA_TYPE_LOG = 7;
    public static final byte DATA_TYPE_PAI = 13;
    public static final byte DATA_TYPE_PPG_RR = 8;
    public static final byte DATA_TYPE_TEMPERATURE = 4;
    public static final byte DATA_TYPE_WRISTLET = 1;
    public static final int GDSP_BUSY = 7;
    public static final int GDSP_INVALID_LEN = 3;
    public static final int GDSP_INVALID_STATE = 5;
    public static final int GDSP_MUSIC_ALIVE = 48;
    public static final int GDSP_OPERATION_FAILED = 4;
    public static final int GDSP_SPEECH_ALIVE = 49;
    public static final int GDSP_STATE_UNKNOWN = 0;
    public static final int GDSP_SUCCESS = 1;
    public static final int GDSP_UNEXPECTED_INDEX = 6;
    public static final int GDSP_UNKNOW_CMD = 2;
    public static final String TAG = "HMProSyncDataBaseProfile";
    private static final byte b = 1;
    private static final byte c = 3;
    private ITransport a;

    public HMProSyncDataBaseProfile(ITransport transport) {
        this.a = null;
        this.a = transport;
    }

    public boolean a(IGattCallback.INotifyCallback callback) {
        return this.a.registerNotification(Protocol.GDSP_CP, callback);
    }

    public boolean b(IGattCallback.INotifyCallback callback) {
        return this.a.registerNotification(Protocol.GDSP_DATA, callback);
    }

    public boolean c(IGattCallback.INotifyCallback callback) {
        return this.a.unregisterNotification(Protocol.GDSP_CP);
    }

    public boolean d(IGattCallback.INotifyCallback callback) {
        return this.a.unregisterNotification(Protocol.GDSP_DATA);
    }

    public boolean deInit() {
        return true;
    }

    public DataHeader getDataHeader(Calendar startTime, byte type) {
        return getDataHeader(type, (short) startTime.get(1), (byte) (startTime.get(2) + 1), (byte) startTime.get(5), (byte) startTime.get(11), (byte) startTime.get(12), (byte) startTime.get(13), (byte) ProfileUtils.getTimezoneKey(startTime.getTimeZone()));
    }

    public boolean init() {
        return true;
    }

    public synchronized ArrayList<ActivityData> parseData(byte[] value, HMDeviceSource source) {
        ArrayList<ActivityData> arrayList = new ArrayList<>();
        if (value != null) {
            if (value.length >= 1) {
                int i = (source == HMDeviceSource.SHOES_MARS || source == HMDeviceSource.MILI_NFC) ? 3 : 4;
                for (int i2 = 1; i2 < value.length; i2 += i) {
                    arrayList.add(source == HMDeviceSource.SHOES_MARS ? new ActivityData(value[i2], value[i2 + 1], value[i2 + 2]) : source == HMDeviceSource.MILI_NFC ? new ActivityData(value[i2 + 1], value[i2 + 2], value[i2]) : new ActivityHrData(value[i2 + 1], value[i2 + 2], value[i2], value[i2 + 3]));
                }
                return arrayList;
            }
        }
        return arrayList;
    }

    public synchronized DataHeader parseDataHeader(byte[] data) {
        if (data != null) {
            if (data.length == 12) {
                DataHeader dataHeader = new DataHeader();
                dataHeader.size = (data[0] & 255) | ((data[1] & 255) << 8) | ((data[2] & 255) << 16) | ((data[3] & 255) << 24);
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.set(1, (data[4] & 255) | ((data[5] & 255) << 8));
                gregorianCalendar.set(2, (data[6] & 255) - 1);
                gregorianCalendar.set(5, data[7] & 255);
                gregorianCalendar.set(11, data[8] & 255);
                gregorianCalendar.set(12, data[9] & 255);
                gregorianCalendar.set(13, data[10] & 255);
                gregorianCalendar.setTimeZone(ProfileUtils.getTimezone(data[11]));
                dataHeader.calendar = gregorianCalendar;
                return dataHeader;
            }
        }
        Debug.fi(TAG, "parseDataHeader return as wrong value:" + GattUtils.bytesToHexString(data));
        return null;
    }

    public boolean sendControlCommandNoResponse(byte[] cmd) {
        return this.a.sendCommandNoResponse(Protocol.GDSP_CP, cmd);
    }

    public HMNotifyResponse sendControlCommandResponse(byte[] cmd) {
        return this.a.sendCommandWithResponse(Protocol.GDSP_CP, cmd, 5000);
    }

    public boolean startTransfer() {
        return sendControlCommandNoResponse(new byte[]{2});
    }

    public boolean stopTransfer() {
        HMNotifyResponse hMNotifyResponseSendControlCommandResponse = sendControlCommandResponse(new byte[]{3});
        return hMNotifyResponseSendControlCommandResponse != null && hMNotifyResponseSendControlCommandResponse.isSuccess((byte) 3);
    }

    public DataHeader getDataHeader(byte type, short year, byte month, byte day, byte hours, byte minutes, byte seconds, byte tz) {
        Debug.fi(TAG, "type:" + ((int) type) + ",year:" + ((int) year) + ",month:" + ((int) month) + ",day:" + ((int) day) + ",hours:" + ((int) hours) + ",minutes:" + ((int) minutes) + ",seconds:" + ((int) seconds) + ",tz:" + ((int) tz));
        byte[] bArr = {1, type, (byte) (year & 255), (byte) ((year >> 8) & 255), month, day, hours, minutes, seconds, tz};
        StringBuilder sb = new StringBuilder();
        sb.append("cmd:");
        sb.append(GattUtils.bytesToHexString(bArr));
        Debug.i(TAG, sb.toString());
        HMNotifyResponse hMNotifyResponseSendControlCommandResponse = sendControlCommandResponse(bArr);
        if (hMNotifyResponseSendControlCommandResponse == null) {
            return null;
        }
        if (!hMNotifyResponseSendControlCommandResponse.isSuccess((byte) 1)) {
            return new DataHeader(hMNotifyResponseSendControlCommandResponse.getCode());
        }
        DataHeader dataHeader = parseDataHeader(hMNotifyResponseSendControlCommandResponse.getData());
        Debug.fi(TAG, "type:" + ((int) type) + " data header:" + dataHeader);
        return dataHeader;
    }
}
