package com.xiaomi.hm.health.bt.profile.gdsp.pai;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes18.dex */
public class HMSyncPaiProfile extends HMProSyncDataBaseProfile {
    private int n;

    public HMSyncPaiProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.n = -1;
    }

    public static HMPaiData parsePaiData(byte[] value) {
        if (value == null || value.length == 0) {
            Debug.fi(HMBaseProfile.TAG, "empty pai data");
            return null;
        }
        HMPaiData hMPaiData = new HMPaiData();
        int i = value[0] & 255;
        long j = (value[1] & 255) | ((value[2] & 255) << 8) | ((value[3] & 255) << 16) | ((value[4] & 255) << 24);
        long j2 = ((value[6] & 255) << 8) | (value[5] & 255) | ((value[7] & 255) << 16) | ((value[8] & 255) << 24);
        float[] fArr = {Float.intBitsToFloat(((value[10] & 255) << 8) | (value[9] & 255) | ((value[11] & 255) << 16) | ((value[12] & 255) << 24)), Float.intBitsToFloat(((value[14] & 255) << 8) | (value[13] & 255) | ((value[15] & 255) << 16) | ((value[16] & 255) << 24)), Float.intBitsToFloat(((value[18] & 255) << 8) | (value[17] & 255) | ((value[19] & 255) << 16) | ((value[20] & 255) << 24)), Float.intBitsToFloat(((value[24] & 255) << 24) | ((value[22] & 255) << 8) | (value[21] & 255) | ((value[23] & 255) << 16)), Float.intBitsToFloat(((value[26] & 255) << 8) | (value[25] & 255) | ((value[27] & 255) << 16) | ((value[28] & 255) << 24)), Float.intBitsToFloat(((value[30] & 255) << 8) | (value[29] & 255) | ((value[31] & 255) << 16) | ((value[32] & 255) << 24)), Float.intBitsToFloat(((value[34] & 255) << 8) | (value[33] & 255) | ((value[35] & 255) << 16) | ((value[36] & 255) << 24))};
        float fIntBitsToFloat = Float.intBitsToFloat(((value[38] & 255) << 8) | (value[37] & 255) | ((value[39] & 255) << 16) | ((value[40] & 255) << 24));
        float fIntBitsToFloat2 = Float.intBitsToFloat(((value[43] & 255) << 16) | ((value[42] & 255) << 8) | (value[41] & 255) | ((value[44] & 255) << 24));
        float fIntBitsToFloat3 = Float.intBitsToFloat(((value[47] & 255) << 16) | (value[45] & 255) | ((value[46] & 255) << 8) | ((value[48] & 255) << 24));
        int i2 = (value[49] & 255) | ((value[50] & 255) << 8);
        int i3 = (value[51] & 255) | ((value[52] & 255) << 8);
        int i4 = (value[53] & 255) | ((value[54] & 255) << 8);
        float fIntBitsToFloat4 = Float.intBitsToFloat((value[55] & 255) | ((value[56] & 255) << 8) | ((value[57] & 255) << 16) | ((value[58] & 255) << 24));
        float fIntBitsToFloat5 = Float.intBitsToFloat(((value[60] & 255) << 8) | (value[59] & 255) | ((value[61] & 255) << 16) | ((value[62] & 255) << 24));
        int i5 = ((value[64] & 255) << 8) | (value[63] & 255);
        int i6 = ((value[66] & 255) << 8) | (value[65] & 255);
        int i7 = value[67] & 255;
        int i8 = 69;
        int i9 = value[68] & 255;
        hMPaiData.setTime(j * 1000);
        hMPaiData.setTimezone(j2);
        hMPaiData.setActivityScores(fArr);
        hMPaiData.c(fIntBitsToFloat);
        hMPaiData.e(fIntBitsToFloat2);
        hMPaiData.b(fIntBitsToFloat3);
        hMPaiData.setLowZoneMinutes(i2);
        hMPaiData.setMediumZoneMinutes(i3);
        hMPaiData.setHighZoneMinutes(i4);
        hMPaiData.a(fIntBitsToFloat4);
        hMPaiData.h(fIntBitsToFloat5);
        hMPaiData.g(i5);
        hMPaiData.d(i6);
        hMPaiData.setIndex(i7);
        hMPaiData.setType(i9);
        hMPaiData.setVersion(i);
        if (i >= 2) {
            i8 = 97;
            hMPaiData.f(new float[]{Float.intBitsToFloat(((value[70] & 255) << 8) | (value[69] & 255) | ((value[71] & 255) << 16) | ((value[72] & 255) << 24)), Float.intBitsToFloat(((value[74] & 255) << 8) | (value[73] & 255) | ((value[75] & 255) << 16) | ((value[76] & 255) << 24)), Float.intBitsToFloat(((value[78] & 255) << 8) | (value[77] & 255) | ((value[79] & 255) << 16) | ((value[80] & 255) << 24)), Float.intBitsToFloat(((value[82] & 255) << 8) | (value[81] & 255) | ((value[83] & 255) << 16) | ((value[84] & 255) << 24)), Float.intBitsToFloat(((value[86] & 255) << 8) | (value[85] & 255) | ((value[87] & 255) << 16) | ((value[88] & 255) << 24)), Float.intBitsToFloat(((value[90] & 255) << 8) | (value[89] & 255) | ((value[91] & 255) << 16) | ((value[92] & 255) << 24)), Float.intBitsToFloat(((value[94] & 255) << 8) | (value[93] & 255) | ((value[95] & 255) << 16) | ((value[96] & 255) << 24))});
        }
        if (i >= 4) {
            int i10 = i8 + 1;
            hMPaiData.setGender(value[i8] & 255);
            i8 = i10 + 1;
            hMPaiData.setAge(value[i10] & 255);
        }
        if (i >= 5) {
            int i11 = i8 + 1;
            hMPaiData.setLowZoneLimit(value[i8] & 255);
            hMPaiData.setMediumZoneLimit(value[i11] & 255);
            hMPaiData.setHighZoneLimit(value[i11 + 1] & 255);
        }
        return hMPaiData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(AtomicBoolean atomicBoolean, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "data:" + GattUtils.bytesToHexString(bArr));
        int i = bArr[0] & 255;
        int i2 = this.n;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
            } catch (Exception e) {
                Debug.fi(HMBaseProfile.TAG, "exception:" + e.getMessage());
                atomicBoolean.getAndSet(true);
                waitingNotify();
            }
        } else {
            Debug.fi(HMBaseProfile.TAG, "missing package!!!");
            atomicBoolean.getAndSet(true);
            waitingNotify();
        }
        this.n = i;
        atomicBoolean.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "control:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        waitingNotify();
    }

    public HMPaiData fetchData() {
        this.n = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: wj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.q(atomicBoolean, byteArrayOutputStream, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: vj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.r(atomicBoolean, bArr);
            }
        });
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        try {
            return parsePaiData(byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            Debug.i(HMBaseProfile.TAG, "parsePaiData exception:" + e.getMessage());
            return null;
        }
    }

    public DataHeader getDataHeader(Calendar startTime) {
        return getDataHeader(startTime, (byte) 13);
    }
}
