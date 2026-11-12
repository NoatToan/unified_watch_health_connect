package com.xiaomi.hm.health.bt.classic;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes19.dex */
public class HMDfuProfile {
    public static final byte TYPE_CREATE = 1;
    public static final byte TYPE_RESUME = 0;
    private static final String c = "HMDfuProfile";
    private static final int d = 5000;
    private static final byte e = 0;
    private static final byte f = 1;
    private static final byte g = 3;
    private static final byte h = 4;
    private static final byte i = 5;
    private static final byte j = 32;
    private volatile int a = 1;
    private ITransport b;

    public HMDfuProfile(ITransport transport) {
        this.b = transport;
    }

    private HMNotifyResponse a(byte[] cmd) {
        return b(cmd, 5000);
    }

    private HMNotifyResponse b(byte[] cmd, int timeout) {
        return this.b.sendCommandWithResponse(Protocol.DFU_CP, cmd, timeout);
    }

    public boolean activate() {
        HMNotifyResponse hMNotifyResponseA = a(new byte[]{5});
        return hMNotifyResponseA != null && hMNotifyResponseA.isSuccess((byte) 5);
    }

    public boolean dummy() {
        HMNotifyResponse hMNotifyResponseA = a(new byte[]{0});
        return hMNotifyResponseA != null && hMNotifyResponseA.isSuccess((byte) 0);
    }

    public int getDfuState() {
        return this.a;
    }

    public long[] getFwInfo(byte type, int size, long crc, short syncSize) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(type);
        byteArrayOutputStream.write(GattUtils.intToBytes(size));
        byteArrayOutputStream.write(GattUtils.intToBytes((int) crc));
        if (syncSize > 0) {
            byteArrayOutputStream.write(GattUtils.shortToBytes(syncSize));
        }
        HMNotifyResponse hMNotifyResponseA = a(byteArrayOutputStream.toByteArray());
        if (hMNotifyResponseA == null || !hMNotifyResponseA.isSuccess((byte) 1)) {
            return null;
        }
        byte[] data = hMNotifyResponseA.getData();
        return new long[]{((data[2] & 255) << 16) | (data[0] & 255) | ((data[1] & 255) << 8) | ((data[3] & 255) << 24), ((long) (((data[7] & 255) << 24) | ((data[5] & 255) << 8) | (data[4] & 255) | ((data[6] & 255) << 16))) & 4294967295L};
    }

    public int getState() {
        HMNotifyResponse hMNotifyResponseA = a(new byte[]{1, HMFirmwareType.FIRMWARE_QUERY.getValue()});
        if (hMNotifyResponseA == null) {
            return 0;
        }
        Debug.i(c, "response:" + hMNotifyResponseA);
        return hMNotifyResponseA.getCode();
    }

    public boolean sendData(byte[] data) {
        return this.b.sendCommandNoResponse(Protocol.DFU_PACKET, data);
    }

    public boolean start(byte type) {
        HMNotifyResponse hMNotifyResponseA = a(new byte[]{3, type});
        return hMNotifyResponseA != null && hMNotifyResponseA.isSuccess((byte) 3);
    }

    public boolean stop(int timeout) {
        HMNotifyResponse hMNotifyResponseB = b(new byte[]{4}, timeout);
        return hMNotifyResponseB != null && hMNotifyResponseB.isSuccess((byte) 4);
    }
}
