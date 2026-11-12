package com.xiaomi.hm.health.bt.classic;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.smartwatch.FTMSFeature;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.hm.health.bt.profile.user.GenderExt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes19.dex */
public class BoltClassicProfile {
    private static final String h = "BoltClassicProfile";
    private static final int i = 5000;
    private static final byte j = -1;
    private static final int k = 5;
    private static final byte l = 42;
    private static final int m = 60;
    private final byte a = 6;
    private final byte b = 19;
    private final short c = 11;
    private final short d = 45;
    private final short e = 46;
    private final byte f = 47;
    private ITransport g;

    public BoltClassicProfile(ITransport transport) {
        this.g = null;
        this.g = transport;
    }

    private int a() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseB = b(new byte[]{19});
        if (hMNotifyResponseB == null || !hMNotifyResponseB.isSuccess((byte) 19) || (data = hMNotifyResponseB.getData()) == null || data.length != 2) {
            return -1;
        }
        return ((data[1] & 255) << 8) | (data[0] & 255);
    }

    private HMNotifyResponse b(byte[] cmd) {
        return c(cmd, 1);
    }

    private HMNotifyResponse c(byte[] cmd, int cmdLen) {
        return d(cmd, cmdLen, 5000);
    }

    private synchronized HMNotifyResponse d(byte[] cmd, int cmdLen, int timeout) {
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse;
        Debug.fi(h, "sendECFCommand:" + GattUtils.bytesToHexString(cmd) + ",cmdLen:" + cmdLen + ",timeout:" + timeout);
        hMNotifyResponseSendCommandWithResponse = this.g.sendCommandWithResponse(Protocol.ECF, cmd, timeout);
        return hMNotifyResponseSendCommandWithResponse != null ? HMNotifyResponse.parse(hMNotifyResponseSendCommandWithResponse.getOriginResponseData(), cmdLen) : null;
    }

    public boolean disableNotify() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(47);
        byteArrayOutputStream.write(0);
        HMNotifyResponse hMNotifyResponseC = c(byteArrayOutputStream.toByteArray(), 3);
        return hMNotifyResponseC != null && hMNotifyResponseC.isSuccess((byte) 6);
    }

    public EqEntity getEQ() {
        try {
            HMNotifyResponse hMNotifyResponseSendCommandWithResponse = this.g.sendCommandWithResponse(Protocol.ECF, new byte[]{-1, 5, 0, 0, 0}, 5000);
            StringBuilder sb = new StringBuilder();
            sb.append("eq origin: ");
            sb.append(hMNotifyResponseSendCommandWithResponse == null ? "null" : GattUtils.bytesToHexString(hMNotifyResponseSendCommandWithResponse.getOriginResponseData()));
            Debug.fi(h, sb.toString());
            if (hMNotifyResponseSendCommandWithResponse == null) {
                Debug.fi(h, "get eq response null");
                return null;
            }
            byte[] originResponseData = hMNotifyResponseSendCommandWithResponse.getOriginResponseData();
            if (originResponseData.length < 60) {
                Debug.fi(h, "originData size wrong!");
                return null;
            }
            int length = originResponseData.length - 9;
            byte[] bArr = new byte[length];
            System.arraycopy(originResponseData, 9, bArr, 0, length);
            Debug.fi(h, "data: " + GattUtils.bytesToHexString(bArr));
            EqEntity eqEntity = new EqEntity(new ArrayList(), (byte) 1);
            eqEntity.setType(originResponseData[9]);
            for (int i2 = 0; i2 < 10; i2++) {
                byte[] bArr2 = new byte[4];
                int i3 = i2 * 5;
                System.arraycopy(bArr, i3 + 1, bArr2, 0, 4);
                eqEntity.getEqUnits().add(new EqUnit(GattUtils.bytesToInt(bArr2, 0), bArr[i3 + 5]));
            }
            return eqEntity;
        } catch (Exception e) {
            Debug.fi(h, "getEQ exception: " + e.getMessage());
            return null;
        }
    }

    public FTMSFeature getFtmsFeature() {
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse = this.g.sendCommandWithResponse(Protocol.FTMS_FEATURE, null, 5000);
        if (hMNotifyResponseSendCommandWithResponse == null) {
            return null;
        }
        byte[] originResponseData = hMNotifyResponseSendCommandWithResponse.getOriginResponseData();
        Debug.fi(h, "ftms feature: " + GattUtils.bytesToHexString(originResponseData));
        if (originResponseData == null) {
            return null;
        }
        return new FTMSFeature(originResponseData);
    }

    public boolean reset() {
        HMNotifyResponse hMNotifyResponseC = c(new byte[]{6, 11, 0, 1}, 3);
        return hMNotifyResponseC != null && hMNotifyResponseC.isSuccess((byte) 6);
    }

    public boolean setEq(EqEntity entity) {
        Debug.fi(h, "setEq: " + entity.toString());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(42);
            byteArrayOutputStream.write(entity.getType());
            if (entity.getEqUnits().size() > 0) {
                for (EqUnit eqUnit : entity.getEqUnits()) {
                    byteArrayOutputStream.write(GattUtils.intToBytes(eqUnit.getFrequency()));
                    byteArrayOutputStream.write(eqUnit.getGain());
                }
            }
            HMNotifyResponse hMNotifyResponseB = b(byteArrayOutputStream.toByteArray());
            return hMNotifyResponseB != null && hMNotifyResponseB.isSuccess((byte) 42);
        } catch (IOException e) {
            Debug.fi(h, "setEq exception: " + e.getMessage());
            return false;
        }
    }

    public boolean setUserInfo(UserInfo userInfo) {
        boolean zSendCommandNoResponse = this.g.sendCommandNoResponse(Protocol.USER, ProfileUtils.bytesOfUserInfo(new UserInfoExt(userInfo.uid, userInfo.height, userInfo.weight, GenderExt.fromValue(userInfo.gender), new BirthDateExt((short) (Calendar.getInstance().get(1) - userInfo.age), (byte) 1, (byte) 1))));
        Debug.fi(h, "UserInfo ret:" + zSendCommandNoResponse);
        return zSendCommandNoResponse;
    }

    public boolean syncHr(int hr) {
        HMNotifyResponse hMNotifyResponseC = c(new byte[]{6, 45, 0, (byte) hr}, 3);
        return hMNotifyResponseC != null && hMNotifyResponseC.isSuccess((byte) 6);
    }

    public boolean syncMacAddress(String mac, int source) {
        byte[] bArrBytesOfBluetoothAddress = ProfileUtils.bytesOfBluetoothAddress(mac);
        if (bArrBytesOfBluetoothAddress == null || bArrBytesOfBluetoothAddress.length == 0) {
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(46);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(bArrBytesOfBluetoothAddress, 0, bArrBytesOfBluetoothAddress.length);
        byte[] bArrIntToBytes = GattUtils.intToBytes(source);
        byteArrayOutputStream.write(bArrIntToBytes, 0, bArrIntToBytes.length);
        HMNotifyResponse hMNotifyResponseC = c(byteArrayOutputStream.toByteArray(), 3);
        return hMNotifyResponseC != null && hMNotifyResponseC.isSuccess((byte) 6);
    }
}
