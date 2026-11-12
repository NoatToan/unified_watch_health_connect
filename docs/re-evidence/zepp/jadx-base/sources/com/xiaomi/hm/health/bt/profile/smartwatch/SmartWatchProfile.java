package com.xiaomi.hm.health.bt.profile.smartwatch;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.text.TextUtils;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericCommand;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericResponse;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import com.xiaomi.hm.health.bt.utils.ArraysUtil;
import com.xiaomi.hm.health.bt.utils.BytesUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.text.Typography;
import org.threeten.bp.a;

/* JADX INFO: loaded from: classes18.dex */
public class SmartWatchProfile extends MiLiProProfile {
    private static final String H1 = "SmartWatchProfile";
    private static final int I1 = 10;
    private static final byte J1 = -2;
    private static final short K1 = 3;
    private static final short L1 = 1;
    private static final short M1 = 257;
    private static final short N1 = 6;
    private static final short O1 = 262;
    private static final short P1 = 2;
    private static final short Q1 = 258;
    private static final int R1 = 12;
    private static final int S1 = 62;
    private static final int T1 = 61;
    private static final short U1 = 66;
    private static final UUID V1 = GattUtils.uuid16("1811");
    private static final UUID W1 = GattUtils.uuid16("2A44");
    private BluetoothGattCharacteristic G1;

    public static class BlePBInfo {
        public byte name;
        public int timestamp;
        public int trackId;
        public byte type;
        public int value;

        public String toString() {
            return "<TrackId: " + this.trackId + ", Value: " + this.value + ", Type: " + ((int) this.type) + ", Timestamp: " + this.timestamp + ", Name: " + ((int) this.name) + Typography.greater;
        }
    }

    public static class BleWidget {
        public boolean enabled;
        public int index;
        public int type;

        public String toString() {
            return "<Index: " + this.index + ", Enabled: " + this.enabled + ", Type: " + this.type + Typography.greater;
        }
    }

    public SmartWatchProfile(Context context, BluetoothDevice device, IGattCallback.IConnectionStateChangeCallback connCB) {
        super(context, device, connCB);
    }

    public boolean enableAllDayPressure(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{-2, 6, 0, z ? (byte) 1 : (byte) 0}, 3);
        boolean z2 = hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) -2);
        StringBuilder sb = new StringBuilder();
        sb.append("Set AllDayPressure [");
        sb.append(z ? Constant.ON : Constant.OFF);
        sb.append("], Success: ");
        sb.append(z2);
        Log.d(H1, sb.toString(), new Object[0]);
        return z2;
    }

    public boolean enableHRAllDay(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{-2, 1, 0, z ? (byte) 1 : (byte) 0}, 3);
        boolean z2 = hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) -2);
        StringBuilder sb = new StringBuilder();
        sb.append("Set HeartRate AllDay [");
        sb.append(z ? Constant.ON : Constant.OFF);
        sb.append("], Success: ");
        sb.append(z2);
        Log.d(H1, sb.toString(), new Object[0]);
        return z2;
    }

    public boolean enableMusicControl(boolean z) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.G1;
        boolean z2 = bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{-125, z ? (byte) 1 : (byte) 0});
        Log.d(H1, "Enable[" + z + "] MusicControl, Success: " + z2, new Object[0]);
        return z2;
    }

    public boolean enableWeatherDailyNotify(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{-2, a.l, 0, z ? (byte) 1 : (byte) 0}, 3);
        boolean z2 = hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) -2);
        StringBuilder sb = new StringBuilder();
        sb.append("Set Weather DailyNotify [");
        sb.append(z ? Constant.ON : Constant.OFF);
        sb.append("], Success: ");
        sb.append(z2);
        Log.d(H1, sb.toString(), new Object[0]);
        return z2;
    }

    public Map<String, String> getSmartWatchDeviceInfo() {
        HashMap map = new HashMap();
        HMGenericResponse hMGenericResponseSendGenericCommand = sendGenericCommand(new HMGenericCommand(10));
        if (hMGenericResponseSendGenericCommand == null || !hMGenericResponseSendGenericCommand.isCommandSuccess()) {
            return null;
        }
        byte[] bArrCommandResponseData = hMGenericResponseSendGenericCommand.commandResponseData();
        String str = new String(bArrCommandResponseData);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iIndexOf = str.indexOf(0, i);
            if (iIndexOf == -1) {
                break;
            }
            int i4 = i2 + 1;
            if (i2 >= 50) {
                break;
            }
            int i5 = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(0, i5);
            String strSubstring = str.substring(i3, iIndexOf);
            String strSubstring2 = str.substring(i5, iIndexOf2);
            Log.v(H1, "Parse DeviceInfo, Index: " + i3 + ", NulIndex: " + iIndexOf + ", NextNullIndex: " + iIndexOf2 + ", Key: " + strSubstring + ", Value: " + strSubstring2, new Object[0]);
            i3 = iIndexOf2 + 1;
            map.put(strSubstring, strSubstring2);
            i = i3;
            i2 = i4;
        }
        Log.d(H1, "Get SmartWatch DeviceInfo: " + BytesUtil.log(bArrCommandResponseData) + "\n" + map, new Object[0]);
        return map;
    }

    public List<BleWidget> getWidgetsAll() {
        byte[] bArrCommandResponseData;
        int i;
        ArrayList arrayList = new ArrayList();
        HMGenericResponse hMGenericResponseSendGenericCommand = sendGenericCommand(new HMGenericCommand(12));
        if (hMGenericResponseSendGenericCommand != null && hMGenericResponseSendGenericCommand.isCommandSuccess() && (bArrCommandResponseData = hMGenericResponseSendGenericCommand.commandResponseData()) != null && bArrCommandResponseData.length > 1) {
            int length = bArrCommandResponseData.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(bArrCommandResponseData, 1, bArr, 0, length);
            int i2 = 0;
            int i3 = 0;
            while (i2 < length / 2 && (i = i3 + 2) <= length) {
                BleWidget bleWidget = new BleWidget();
                bleWidget.index = (bArr[i3] >> 1) & 255;
                bleWidget.enabled = (bArr[i3] & 1) == 1;
                bleWidget.type = bArr[i3 + 1] & 255;
                arrayList.add(bleWidget);
                i2++;
                i3 = i;
            }
            Log.d(H1, "Get Widgets All, ResponseData: " + BytesUtil.log(bArrCommandResponseData) + "\nWidgets: " + ArraysUtil.toString(arrayList), new Object[0]);
        }
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public boolean init() {
        boolean zInit = super.init();
        UUID uuid = V1;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Log.w(H1, uuid + " is Null!!", new Object[0]);
        } else {
            this.G1 = service.getCharacteristic(W1);
        }
        return zInit;
    }

    public Object isAllDayPressureEnabled() {
        Boolean boolValueOf;
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{-2, 6, 1}, 3);
        if (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) -2)) {
            boolValueOf = null;
        } else {
            byte[] data = hMNotifyResponseSendECFCommand.getData();
            boolValueOf = Boolean.valueOf(data != null && data[0] == 1);
        }
        Log.d(H1, "Get AllDayPressure Enabled: " + boolValueOf, new Object[0]);
        return boolValueOf;
    }

    public Object isHRAllDayEnabled() {
        Boolean boolValueOf;
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{-2, 1, 1}, 3);
        if (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) -2)) {
            boolValueOf = null;
        } else {
            byte[] data = hMNotifyResponseSendECFCommand.getData();
            boolValueOf = Boolean.valueOf(data != null && data[0] == 1);
        }
        Log.d(H1, "Get HeartRate AllDay Enabled: " + boolValueOf, new Object[0]);
        return boolValueOf;
    }

    public Object isSedentaryReminderEnabled() {
        Boolean boolValueOf;
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{-2, 2, 1}, 3);
        if (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) -2)) {
            boolValueOf = null;
        } else {
            byte[] data = hMNotifyResponseSendECFCommand.getData();
            boolValueOf = Boolean.valueOf(data != null && data[0] == 1);
        }
        Log.d(H1, "Get Sedentary Reminder Enabled: " + boolValueOf, new Object[0]);
        return boolValueOf;
    }

    @Override // com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile
    public boolean setSedentary(HMSedentaryConfig config) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{-2, 2, 0, config.isEnable(), (byte) (config.getInterval() & 255), (byte) ((config.getInterval() >> 8) & 255), config.getStartHour(), config.getStartMinutes(), config.getStopHour(), config.getStopMinutes(), config.getStartHour2(), config.getStartMinutes2(), config.getStopHour2(), config.getStopMinutes2()}, 3);
        boolean z = hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) -2);
        Log.d(H1, "Set Sedentary Reminder [" + config + "], Success: " + z, new Object[0]);
        return z;
    }

    public boolean setWidgets(List<BleWidget> list) {
        byte[] bArr = new byte[(list.size() * 2) + 1];
        bArr[0] = 0;
        for (int i = 0; i < list.size(); i++) {
            BleWidget bleWidget = list.get(i);
            int i2 = i * 2;
            bArr[i2 + 1] = ((bleWidget.index << 1) | (bleWidget.enabled ? 1 : 0)) == true ? (byte) 1 : (byte) 0;
            bArr[i2 + 2] = (byte) bleWidget.type;
        }
        boolean zPatchWrite = patchWrite(bArr, 62);
        Log.d(H1, "Set Widget: " + ArraysUtil.toString(list) + ", Data: " + BytesUtil.log(bArr) + ", Success: " + zPatchWrite, new Object[0]);
        return zPatchWrite;
    }

    public boolean syncLoginToken(String tokenJson) {
        byte[] bytes = TextUtils.isEmpty(tokenJson) ? null : tokenJson.getBytes();
        boolean zPatchWrite = bytes != null ? patchWrite(bytes, 61) : false;
        Log.d(H1, "sync LoginToken  " + tokenJson + ", Data: " + BytesUtil.log(bytes) + ", Success: " + zPatchWrite, new Object[0]);
        return zPatchWrite;
    }
}
