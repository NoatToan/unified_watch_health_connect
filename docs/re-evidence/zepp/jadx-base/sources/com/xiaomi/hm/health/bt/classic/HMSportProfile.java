package com.xiaomi.hm.health.bt.classic;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportInfo;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes19.dex */
public class HMSportProfile implements IGattCallback.INotifyCallback {
    private static final String e = "HMSportProfile";
    private static final byte f = 1;
    private static final byte g = 2;
    private byte[] a = null;
    private CountDownLatch b = null;
    private IHMSportListener c = null;
    private ITransport d;

    public HMSportProfile(ITransport transport) {
        this.d = null;
        this.d = transport;
        transport.registerNotification(Protocol.SPORT_SHOW, this);
    }

    public boolean deInit() {
        return true;
    }

    public synchronized boolean doSportCommand(SportCommand command, SportInfo info) {
        boolean z = false;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(command.getCommand());
            if (info == null || info.getBytes() == null || info.getBytes().length <= 0) {
                byteArrayOutputStream.write(SportInfo.nullValue());
            } else {
                byteArrayOutputStream.write(info.getBytes());
            }
            if (command != SportCommand.SHOW && command != SportCommand.NOTIFY && command != SportCommand.HEART) {
                HMNotifyResponse hMNotifyResponseSendCommandWithResponse = this.d.sendCommandWithResponse(Protocol.SPORT_SHOW, byteArrayOutputStream.toByteArray(), 5000);
                if (hMNotifyResponseSendCommandWithResponse != null && hMNotifyResponseSendCommandWithResponse.isSuccess()) {
                    z = true;
                }
                return z;
            }
            return this.d.sendCommandNoResponse(Protocol.SPORT_SHOW, byteArrayOutputStream.toByteArray());
        } catch (Exception e2) {
            Debug.i(e, "doSportCommand exception:" + e2.getMessage());
            return false;
        }
    }

    public synchronized boolean doSportCommandPiece(SportCommand command, SportInfo info) {
        boolean z;
        z = false;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(command.getCommand());
            if (info == null || info.getBytes() == null || info.getBytes().length <= 0) {
                byteArrayOutputStream.write(SportInfo.nullValue());
            } else {
                byteArrayOutputStream.write(info.getBytes());
            }
            HMNotifyResponse hMNotifyResponseSendCommandWithResponse = this.d.sendCommandWithResponse(Protocol.SPORT_SHOW, byteArrayOutputStream.toByteArray(), 5000);
            if (hMNotifyResponseSendCommandWithResponse != null && hMNotifyResponseSendCommandWithResponse.isSuccess()) {
                z = true;
            }
        } catch (Exception e2) {
            Debug.i(e, "doSportCommand exception:" + e2.getMessage());
            return false;
        }
        return z;
    }

    public synchronized boolean doSportConfig(SportConfig config) {
        ByteArrayOutputStream byteArrayOutputStream;
        byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(SportCommand.CONFIG.getCommand());
        byteArrayOutputStream.write(config.getVersion());
        byteArrayOutputStream.write(config.getSportKind().getKind());
        return this.d.sendCommandWithResponse(Protocol.SPORT_SHOW, byteArrayOutputStream.toByteArray(), 5000) != null;
    }

    public boolean init() {
        return true;
    }

    public boolean isSupportPiece() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
    public void notify(byte[] value) {
        Debug.i(e, "notify:" + GattUtils.bytesToHexString(value));
        if (value != null && value.length == 2 && value[0] == 17) {
            SportCommand sportCommandFromValue = SportCommand.fromValue(value[1]);
            IHMSportListener iHMSportListener = this.c;
            if (iHMSportListener != null) {
                iHMSportListener.onSportCommand(sportCommandFromValue);
                return;
            }
            return;
        }
        this.a = value;
        CountDownLatch countDownLatch = this.b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void setListener(IHMSportListener listener) {
        this.c = listener;
    }
}
