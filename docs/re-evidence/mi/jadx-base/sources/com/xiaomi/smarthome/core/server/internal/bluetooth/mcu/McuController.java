package com.xiaomi.smarthome.core.server.internal.bluetooth.mcu;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.xiaomi.smarthome.cache.SmartConfigCache;
import com.xiaomi.smarthome.core.entity.bluetooth.BleDeviceInfo;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.core.server.internal.util.VersionUtils;
import com.xiaomi.smarthome.device.api.BleMeshFirmwareUpdateInfo;
import com.xiaomi.smarthome.device.api.McuUpdateInfo;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes10.dex */
public class McuController {
    private static final int MSG_SEND_MCU_EVENT_TIMEOUT = 876;
    private static final String TAG = "MCU-bluetooth";
    private String mMac;
    private byte[] mSupportOpCode = null;
    private String mMcuVersion = null;
    private String mDevSN = null;
    private String mHardware = null;
    private String mLatitude = null;
    private String mLongitude = null;
    private boolean mIsFinish = false;
    private List<Integer> localSupportOpCodes = new ArrayList();
    protected final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mcu.McuController.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == McuController.MSG_SEND_MCU_EVENT_TIMEOUT) {
                McuController.this.finish();
            }
        }
    };
    private McuResultCallback mResultCallback = null;
    private byte snOffset = 0;
    private byte[] mSnData = new byte[0];

    public interface McuResultCallback {
        void onFinish();
    }

    public McuController(String str) {
        this.localSupportOpCodes.clear();
        this.localSupportOpCodes.add(1);
        this.localSupportOpCodes.add(8);
        this.localSupportOpCodes.add(2);
        this.localSupportOpCodes.add(3);
        this.localSupportOpCodes.add(4);
        this.localSupportOpCodes.add(5);
        this.mMac = str;
    }

    private boolean checkSupportOpcode(byte[] bArr, int i) {
        if (bArr != null && bArr.length > 0) {
            for (int i2 : bArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean doNextOpcode() {
        byte[] bArr = this.mSupportOpCode;
        if (bArr != null && bArr.length != 0) {
            while (this.localSupportOpCodes.size() > 0) {
                int iIntValue = this.localSupportOpCodes.remove(0).intValue();
                if (checkSupportOpcode(this.mSupportOpCode, iIntValue)) {
                    if (iIntValue == 8) {
                        this.localSupportOpCodes.remove((Object) 2);
                    }
                    writeOpCode(iIntValue);
                    return true;
                }
                MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, TAG, "device support opcode array not contain local opcode=" + iIntValue);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finish() {
        MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, TAG, "finish mcu process ,isFinish:" + this.mIsFinish);
        this.mHandler.removeMessages(MSG_SEND_MCU_EVENT_TIMEOUT);
        this.snOffset = (byte) 0;
        if (this.mIsFinish) {
            return;
        }
        this.mIsFinish = true;
        McuResultCallback mcuResultCallback = this.mResultCallback;
        if (mcuResultCallback != null) {
            mcuResultCallback.onFinish();
        }
    }

    private void handleMcuEvent(McuEvent mcuEvent) {
        LogType logType = LogType.BLUETOOTH;
        MiJiaLog.writeLogOnAll(logType, TAG, String.format(" receive mcu event resultCode=%d, opcode=%d,params=%s", Integer.valueOf(mcuEvent.getResultCode()), Integer.valueOf(mcuEvent.getOpCode()), ByteUtils.byteToString(mcuEvent.getParamsValue())));
        if (!this.mHandler.hasMessages(MSG_SEND_MCU_EVENT_TIMEOUT)) {
            MiJiaLog.writeLogOnAll(logType, TAG, "just receive mcu event,but not my expect response");
            return;
        }
        this.mHandler.removeMessages(MSG_SEND_MCU_EVENT_TIMEOUT);
        if (mcuEvent.getResultCode() != 0) {
            if (mcuEvent.getOpCode() != 8) {
                finish();
                return;
            } else {
                if (doNextOpcode()) {
                    return;
                }
                finish();
                return;
            }
        }
        int opCode = mcuEvent.getOpCode();
        if (opCode == 0) {
            this.mSupportOpCode = mcuEvent.getParamsValue();
            if (doNextOpcode()) {
                return;
            }
            finish();
            return;
        }
        if (opCode == 1) {
            String value = mcuEvent.getValue();
            MiJiaLog.writeLogOnAll(logType, TAG, "=========> receive mcu version=" + value);
            if (!TextUtils.isEmpty(value)) {
                SmartConfigCache.getInstance().setMcuVersion(this.mMac, value);
                this.mMcuVersion = value;
            }
            if (doNextOpcode()) {
                return;
            }
            finish();
            return;
        }
        if (opCode == 2) {
            String value2 = mcuEvent.getValue();
            MiJiaLog.writeLogOnAll(logType, TAG, "=========> receive dev SN=" + value2);
            if (!TextUtils.isEmpty(value2)) {
                this.mDevSN = value2;
            }
            if (doNextOpcode()) {
                return;
            }
            finish();
            return;
        }
        if (opCode == 3) {
            String value3 = mcuEvent.getValue();
            MiJiaLog.writeLogOnAll(logType, TAG, "=========> receive hardware=" + value3);
            if (!TextUtils.isEmpty(value3)) {
                this.mHardware = value3;
            }
            if (doNextOpcode()) {
                return;
            }
            finish();
            return;
        }
        if (opCode == 4) {
            String value4 = mcuEvent.getValue();
            MiJiaLog.writeLogOnAll(logType, TAG, "=========> receive latitude=" + value4);
            if (!TextUtils.isEmpty(value4)) {
                this.mLatitude = value4;
            }
            if (doNextOpcode()) {
                return;
            }
            finish();
            return;
        }
        if (opCode == 5) {
            String value5 = mcuEvent.getValue();
            MiJiaLog.writeLogOnAll(logType, TAG, "=========> receive longitude=" + value5);
            if (!TextUtils.isEmpty(value5)) {
                this.mLongitude = value5;
            }
            if (doNextOpcode()) {
                return;
            }
            finish();
            return;
        }
        if (opCode != 8) {
            finish();
            return;
        }
        byte[] paramsValue = mcuEvent.getParamsValue();
        MiJiaLog.writeLogOnAll(logType, TAG, "=========> receive dev newSN，original data=" + ByteUtils.byteToString(paramsValue));
        this.snOffset = (byte) ((this.snOffset + paramsValue.length) - 1);
        byte[] bArr = this.mSnData;
        if (bArr.length > 0) {
            byte[] bArr2 = new byte[(bArr.length + paramsValue.length) - 1];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(paramsValue, 1, bArr2, this.mSnData.length, paramsValue.length - 1);
            this.mSnData = bArr2;
        } else {
            byte[] bArr3 = new byte[paramsValue.length - 1];
            this.mSnData = bArr3;
            System.arraycopy(paramsValue, 1, bArr3, 0, paramsValue.length - 1);
        }
        if (paramsValue.length >= 18) {
            MiJiaLog.writeLogOnAll(logType, TAG, "=========> receive dev newSN, then continue read New SN,next offset=" + ((int) this.snOffset));
            writeOpCodeWithParams(8);
            return;
        }
        MiJiaLog.writeLogOnAll(logType, TAG, "=========> receive dev newSN complete,newSN=" + new String(this.mSnData));
        if (doNextOpcode()) {
            return;
        }
        finish();
    }

    private void openMcuNotify() {
        BleConnectManager.getInstance().notify(this.mMac, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MCU_VERSION, new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mcu.McuController.5
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                if (i == 0) {
                    MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, McuController.TAG, " open mcu notify success");
                    McuController.this.writeOpCode(0);
                } else {
                    MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, McuController.TAG, " open mcu notify fail");
                    McuController.this.finish();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeOpCode(final int i) {
        if (i == 8) {
            writeOpCodeWithParams(8);
            return;
        }
        MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, TAG, "start write mcu opcode:" + i);
        BleConnectManager.getInstance().write(this.mMac, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MCU_VERSION, new byte[]{(byte) i}, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mcu.McuController.3
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i2, Void r4) {
                if (i2 == 0) {
                    MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, McuController.TAG, "write mcu opcode:" + i + " success, waiting 2.5s");
                    McuController.this.mHandler.sendEmptyMessageDelayed(McuController.MSG_SEND_MCU_EVENT_TIMEOUT, 2500L);
                    return;
                }
                MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, McuController.TAG, " write mcu opcode " + i + " fail");
                McuController.this.finish();
            }
        });
    }

    private void writeOpCodeWithParams(final int i) {
        byte[] bArr = {(byte) i, 1, this.snOffset};
        MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, TAG, "start write mcu opcode:" + i);
        BleConnectManager.getInstance().write(this.mMac, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MCU_VERSION, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mcu.McuController.4
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i2, Void r4) {
                if (i2 == 0) {
                    MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, McuController.TAG, "write mcu opcode:" + i + " success, waiting 2.5s");
                    McuController.this.mHandler.sendEmptyMessageDelayed(McuController.MSG_SEND_MCU_EVENT_TIMEOUT, 2500L);
                    return;
                }
                MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, McuController.TAG, " write mcu opcode " + i + " fail");
                McuController.this.finish();
            }
        });
    }

    public void broadcastHasNewMcuVersion() {
        LogType logType = LogType.BLUETOOTH;
        MiJiaLog.writeLogOnAll(logType, TAG, "broadcastHasNewMcuVersion");
        if (TextUtils.isEmpty(this.mMcuVersion)) {
            MiJiaLog.writeLogOnAll(logType, TAG, "mMcuVersion is empty,then return!");
            return;
        }
        String firmwareVersion = BluetoothCache.getFirmwareVersion(this.mMac);
        BleMeshFirmwareUpdateInfo bleFirmwareUpdateInfo = BluetoothCache.getBleFirmwareUpdateInfo(this.mMac);
        if (bleFirmwareUpdateInfo == null || TextUtils.isEmpty(firmwareVersion)) {
            MiJiaLog.writeLogOnAll(logType, TAG, "updateInfo is null or current Firmware Version is empty,then return!");
            return;
        }
        String str = bleFirmwareUpdateInfo.version;
        if (TextUtils.isEmpty(str)) {
            MiJiaLog.writeLogOnAll(logType, TAG, "Latest Firmware Version is empty,then return!");
            return;
        }
        if (VersionUtils.compareFirmwareVersion(str, firmwareVersion) > 0) {
            MiJiaLog.writeLogOnAll(logType, TAG, "device firmware version no upgrade,then return!");
            return;
        }
        McuUpdateInfo mcuUpdateInfo = bleFirmwareUpdateInfo.mcuUpdateInfo;
        if (mcuUpdateInfo == null || TextUtils.isEmpty(mcuUpdateInfo.version)) {
            MiJiaLog.writeLogOnAll(logType, TAG, "mcuUpdateInfo is null or latest mcu Version is empty,then return!");
            return;
        }
        String str2 = bleFirmwareUpdateInfo.mcuUpdateInfo.version;
        String propDid = BluetoothCache.getPropDid(this.mMac);
        MiJiaLog.writeLogOnAll(logType, TAG, "latest mcu version =" + str2 + ",current mcu version =" + this.mMcuVersion);
        if (VersionUtils.compareFirmwareVersion(str2, this.mMcuVersion) > 0) {
            Intent intent = new Intent(BluetoothConstants.ACTION_FIRMWARE_HAS_NEW_VERSION);
            intent.putExtra("current_version", firmwareVersion);
            intent.putExtra("latest_version", str);
            intent.putExtra("did", propDid);
            intent.putExtra("mcu_version", bleFirmwareUpdateInfo.mcuUpdateInfo.version);
            MiJiaLog.writeLogOnAll(logType, TAG, "has new mcu version ,then send broadcast");
            BluetoothUtils.sendBroadcast(intent);
        }
    }

    public void receiveMcuEvent(byte[] bArr) {
        MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, TAG, "receiveMcuEvent ,original data=" + ByteUtils.byteToString(bArr));
        handleMcuEvent(McuEvent.parseValue(bArr));
    }

    public void reportMcuVersion() {
        if (TextUtils.isEmpty(this.mDevSN)) {
            byte[] bArr = this.mSnData;
            if (bArr.length > 0) {
                this.mDevSN = new String(bArr);
            }
        }
        if (TextUtils.isEmpty(this.mDevSN) && TextUtils.isEmpty(this.mMcuVersion) && TextUtils.isEmpty(this.mHardware)) {
            return;
        }
        new Timer().schedule(new TimerTask() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mcu.McuController.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Pair<Boolean, String> pairIsMeshDevice = BluetoothService.getBleCoreProvider().isMeshDevice(McuController.this.mMac);
                String propDid = ((Boolean) pairIsMeshDevice.first).booleanValue() ? (String) pairIsMeshDevice.second : BluetoothCache.getPropDid(McuController.this.mMac);
                if (TextUtils.isEmpty(propDid)) {
                    MiJiaLog.onlyLogcat(McuController.TAG, " report mcu version,but did is empty ,so mac is null =" + TextUtils.isEmpty(McuController.this.mMac));
                } else {
                    MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, McuController.TAG, String.format("start report mcu version=%s, dev sn=%s,hardware=%s,latitude=%s,longitude=%s", McuController.this.mMcuVersion, McuController.this.mDevSN, McuController.this.mHardware, McuController.this.mLatitude, McuController.this.mLongitude));
                    DeviceApi.reportBleDeviceInfo(new BleDeviceInfo(propDid, McuController.this.mMcuVersion, McuController.this.mDevSN, McuController.this.mHardware, McuController.this.mLatitude, McuController.this.mLongitude), null);
                }
                McuController.this.broadcastHasNewMcuVersion();
            }
        }, 1200L);
    }

    public void startMcuProcess(McuResultCallback mcuResultCallback) {
        this.mResultCallback = mcuResultCallback;
        openMcuNotify();
    }
}
