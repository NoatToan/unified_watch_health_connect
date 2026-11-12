package com.xiaomi.hm.health.nfc.channel;

import androidx.annotation.NonNull;
import com.huami.nfc.applet.Hex;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.base.NfcChannelException;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.nfc.ApduRequest;
import com.xiaomi.hm.health.bt.profile.nfc.ApduResponse;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCStatus;
import com.xiaomi.hm.health.bt.profile.nfc.IHMNFCStatusListener;
import com.xiaomi.hm.health.device.NfcDeviceConfigKt;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.nfc.INfcStatusListener;
import com.xiaomi.hm.health.nfc.door.BandSupportBleDeviceKt;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes21.dex */
public class BandNfcChannel implements INfcChannel, IHMNFCStatusListener {
    private static final String c = "BandNfcChannel";
    private INfcStatusListener a;
    private int b = 3;

    public BandNfcChannel(INfcStatusListener listener) {
        this.a = listener;
        EventBus.getDefault().register(this);
    }

    private static String a(byte[] data) {
        return Hex.bytesToHexString(data).toUpperCase();
    }

    @Override // com.huami.nfc.base.INfcChannel
    public void closeNfcChannel() {
        this.b = 3;
        HMLog.i(c, "closeNfcChannel Start.", new Object[0]);
        if (!NfcDeviceConfigKt.hasFeatureNfc()) {
            HMLog.e(c, "this device is not support NFC.", new Object[0]);
            return;
        }
        HMBaseDevice hMBaseBleDevice = BandSupportBleDeviceKt.getHMBaseBleDevice();
        if (hMBaseBleDevice == null || !hMBaseBleDevice.isConnected()) {
            HMLog.e(c, "设备未连接", new Object[0]);
            return;
        }
        HMNFCStatus hMNFCStatusDisconnectNfcSync = ((HMMiLiProDevice) hMBaseBleDevice).disconnectNfcSync();
        if (hMNFCStatusDisconnectNfcSync == null) {
            HMLog.e(c, "HMNFCStatus is null, 设备连接状态：" + hMBaseBleDevice.isConnected(), new Object[0]);
            return;
        }
        if (hMNFCStatusDisconnectNfcSync.isSuccess()) {
            HMLog.i(c, "closeNfcChannel Success.", new Object[0]);
            return;
        }
        HMLog.e(c, "关闭通道失败。HMNFCStatus: " + hMNFCStatusDisconnectNfcSync.getStatus(), new Object[0]);
        this.a.onStatus(hMNFCStatusDisconnectNfcSync);
    }

    public void onEvent(HMDeviceConnectionEvent event) throws NfcChannelException {
        if (event.getDeviceType() == HMDeviceType.MILI && NfcDeviceConfigKt.hasFeatureNfc() && !event.isConnected() && this.b != 3) {
            throw new NfcChannelException(this.b, "设备已断开连接");
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.IHMNFCStatusListener
    public void onStatusChanged(HMNFCStatus status) {
        this.a.onStatus(status);
    }

    @Override // com.huami.nfc.base.INfcChannel
    public void openNfcChannel() throws NfcChannelException {
        this.b = 1;
        HMLog.i(c, "openNfcChannel Start", new Object[0]);
        if (!NfcDeviceConfigKt.hasFeatureNfc()) {
            HMLog.e(c, "this device is not support NFC.", new Object[0]);
            throw new NfcChannelException(1, "设备不支持NFC功能");
        }
        HMBaseDevice hMBaseBleDevice = BandSupportBleDeviceKt.getHMBaseBleDevice();
        if (hMBaseBleDevice == null || !hMBaseBleDevice.isConnected()) {
            HMLog.e(c, "device not connected.", new Object[0]);
            throw new NfcChannelException(1, "设备未连接");
        }
        HMNFCStatus hMNFCStatusConnectNfcSync = ((HMMiLiProDevice) hMBaseBleDevice).connectNfcSync(this);
        if (hMNFCStatusConnectNfcSync == null) {
            HMLog.e(c, "HMNFCStatus is null, device not connected.", new Object[0]);
            throw new NfcChannelException(1, "HMNFCStatus is null, 设备是否为已连接状态：" + hMBaseBleDevice.isConnected());
        }
        if (hMNFCStatusConnectNfcSync.isSuccess()) {
            HMLog.i(c, "openNfcChannel Success.", new Object[0]);
            return;
        }
        HMLog.e(c, "open NFC channel failed.", new Object[0]);
        this.a.onStatus(hMNFCStatusConnectNfcSync);
        throw new NfcChannelException(1, "固件返回错误码为：" + hMNFCStatusConnectNfcSync.getStatus());
    }

    @Override // com.huami.nfc.base.INfcChannel
    @NonNull
    public byte[] transmit(@NonNull byte[] bytes) throws NfcChannelException {
        this.b = 2;
        HMLog.i(c, "transmit --> " + a(bytes), new Object[0]);
        HMBaseDevice hMBaseBleDevice = BandSupportBleDeviceKt.getHMBaseBleDevice();
        if (hMBaseBleDevice == null || !hMBaseBleDevice.isConnected()) {
            HMLog.e(c, "device not connected", new Object[0]);
            throw new NfcChannelException(2, "设备未连接");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ApduResponse apduResponseSendNfcDataSync = ((HMMiLiProDevice) hMBaseBleDevice).sendNfcDataSync(new ApduRequest(bytes));
        if (apduResponseSendNfcDataSync == null) {
            String str = "ApduResponse is null, 本次APDU传输耗时：" + ((System.currentTimeMillis() - jCurrentTimeMillis) / 1000) + "s, 设备连接状态：" + hMBaseBleDevice.isConnected();
            HMLog.e(c, "transmit <-- " + str, new Object[0]);
            throw new NfcChannelException(2, str);
        }
        if (apduResponseSendNfcDataSync.isValid()) {
            HMLog.i(c, "transmit <-- " + a(apduResponseSendNfcDataSync.data), new Object[0]);
            return apduResponseSendNfcDataSync.data;
        }
        String str2 = "APDU传输协议(固件)返回数据不合法(数据为空或长度小于0), 本次APDU传输耗时：" + ((System.currentTimeMillis() - jCurrentTimeMillis) / 1000) + "s 设备连接状态：" + hMBaseBleDevice.isConnected();
        HMLog.e(c, "transmit <-- " + str2, new Object[0]);
        throw new NfcChannelException(2, str2);
    }
}
