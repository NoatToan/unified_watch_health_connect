package com.xiaomi.hm.health.bt.profile.nfc;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.huami.watch.companion.sync.ble.SyncNfcTradeHelper;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCProfile;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusBalanceResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusCardInfoResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusConsumerListResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.CardInfoEntity;
import com.xiaomi.hm.health.bt.profile.nfc.entity.CardTransEntity;
import com.xiaomi.hm.health.bt.profile.nfc.entity.NFCExtensionsKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes18.dex */
public class HMNFCProfile extends HMBaseProfile {
    private static final byte A = 22;
    public static final byte ATR_OVERTIME = 17;
    private static final byte B = -106;
    public static final byte BAD_CMD = 22;
    public static final byte BAD_PPSCMD = 19;
    public static final byte BAD_PPSREPLY = 20;
    private static final byte C = 0;
    private static final byte D = 1;
    private static final byte E = 3;
    private static final byte F = 2;
    private static final byte G = 0;
    private static final byte H = -107;
    private static final byte I = -108;
    private static final byte J = 24;
    private static final byte K = -104;
    private static final byte L = 5;
    private static final byte M = -128;
    private static final UUID N = GattUtils.uuid128(17);
    private static final byte O = 6;
    public static final byte PTS_OVERTIME = 23;
    public static final byte RECV_OVERTIME = 18;
    public static final byte UNSUPPORT_PROTOCOL = 16;
    public static final byte UNSUPPORT_PTS = 21;
    public static final int VERSION_3 = 3;
    public static final int VERSION_4 = 4;
    private static final int h = 60000;
    private static final int i = 10000;
    private static final int j = 30000;
    private static final byte k = 1;
    private static final byte l = 2;
    private static final byte m = 3;
    private static final byte n = 4;
    private static final byte o = 5;
    private static final byte p = 6;
    private static final byte q = 7;
    private static final byte r = 8;
    private static final byte s = 9;
    private static final byte t = 10;
    private static final byte u = 13;
    private static final byte v = 14;
    private static final byte w = 15;
    private static final byte x = 16;
    private static final byte y = 21;
    private static final byte z = 20;
    private BluetoothGattCharacteristic b;
    private volatile IGattCallback.INotifyCallback c;
    private IHMNFCStatusListener d;
    private NFCVersion e;
    private final short f;
    private final byte g;

    public class a implements IGattCallback.INotifyCallback {
        public final ArrayList<HMNFCBlockInfo> a = new ArrayList<>();
        public int b = -1;
        public final /* synthetic */ AtomicBoolean c;
        public final /* synthetic */ int d;
        public final /* synthetic */ AtomicReference e;
        public final /* synthetic */ CountDownLatch f;

        public a(final AtomicBoolean val$firstPackage, final int val$version, final AtomicReference val$cardInfoV, final CountDownLatch val$latch) {
            this.c = val$firstPackage;
            this.d = val$version;
            this.e = val$cardInfoV;
            this.f = val$latch;
        }

        @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
        public void notify(byte[] value) {
            Debug.fi(HMBaseProfile.TAG, "notify:" + GattUtils.bytesToHexString(value));
            if (this.c.get()) {
                this.c.set(false);
                HMNFCCardInfo hMNFCCardInfoO = HMNFCProfile.this.O(value, this.d);
                this.e.getAndSet(hMNFCCardInfoO);
                if (hMNFCCardInfoO == null || hMNFCCardInfoO.getBlockNum() == 0 || hMNFCCardInfoO.getResult() == 9 || hMNFCCardInfoO.getResult() == 3 || hMNFCCardInfoO.getResult() == 8 || hMNFCCardInfoO.getResult() == 40 || hMNFCCardInfoO.getResult() == 41) {
                    this.f.countDown();
                    return;
                }
                return;
            }
            HMNFCCardInfo hMNFCCardInfo = (HMNFCCardInfo) this.e.get();
            if (hMNFCCardInfo == null) {
                this.f.countDown();
                return;
            }
            HMNFCBlockInfo hMNFCBlockInfoN = HMNFCProfile.this.N(value);
            if (hMNFCBlockInfoN == null) {
                this.f.countDown();
                return;
            }
            int index = hMNFCBlockInfoN.getIndex();
            if (this.b + 1 != index) {
                this.f.countDown();
                return;
            }
            this.b = index;
            this.a.add(hMNFCBlockInfoN);
            if (index == hMNFCCardInfo.getBlockNum() - 1) {
                hMNFCCardInfo.setBlockInfos(this.a);
                this.f.countDown();
            }
        }
    }

    public class b implements IGattCallback.INotifyCallback {
        private HMNFCTradeInfo a;
        public int b = 0;
        public int c = 0;
        public StringBuilder d = new StringBuilder();
        public final /* synthetic */ ArrayList e;
        public final /* synthetic */ CountDownLatch f;

        public b(final ArrayList val$tradeInfos, final CountDownLatch val$latch) {
            this.e = val$tradeInfos;
            this.f = val$latch;
        }

        @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
        public void notify(byte[] value) {
            Debug.fi(HMBaseProfile.TAG, "notify:" + GattUtils.bytesToHexString(value));
            if (value != null) {
                if (value.length >= 2 || value[0] == -114) {
                    byte b = value[1];
                    if (b == 1) {
                        this.b = 0;
                        this.c = 0;
                        this.d = new StringBuilder();
                        this.a = new HMNFCTradeInfo();
                        StringBuilder sb = new StringBuilder();
                        for (int i = 3; i < value[2] + 3; i++) {
                            sb.append(String.format("%02x", Byte.valueOf(value[i])));
                        }
                        this.a.setAid(sb.toString());
                        return;
                    }
                    if (b == 2) {
                        if (this.a == null) {
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        for (int i2 = 3; i2 < value[2] + 3; i2++) {
                            sb2.append(String.format("%02x", Byte.valueOf(value[i2])));
                        }
                        this.a.setClientId(sb2.toString());
                        return;
                    }
                    if (b == 3) {
                        HMNFCTradeInfo hMNFCTradeInfo = this.a;
                        if (hMNFCTradeInfo == null) {
                            return;
                        }
                        hMNFCTradeInfo.setType(value[2]);
                        this.a.setConsumption((value[6] & 255) | ((value[5] & 255) << 8) | ((value[4] & 255) << 16) | ((value[3] & 255) << 24));
                        boolean z = (value[7] & 128) == 128;
                        int i3 = (value[10] & 255) | ((value[9] & 255) << 8) | ((value[8] & 255) << 16) | ((value[7] & 127) << 24);
                        if (z) {
                            i3 *= -1;
                        }
                        this.a.setBalance(i3);
                        this.a.setDate(String.format("%02x%02x-%02x-%02x %02x:%02x:%02x", Byte.valueOf(value[11]), Byte.valueOf(value[12]), Byte.valueOf(value[13]), Byte.valueOf(value[14]), Byte.valueOf(value[15]), Byte.valueOf(value[16]), Byte.valueOf(value[17])));
                        this.e.add(this.a);
                        return;
                    }
                    if (b == 4) {
                        byte b2 = value[2];
                        this.f.countDown();
                        return;
                    }
                    if (b == 5 && this.a != null) {
                        boolean z2 = (value[2] & 128) == 128;
                        int i4 = value[2] & 127;
                        if (!z2) {
                            int i5 = this.b;
                            if (i4 + i5 != 0 && i5 != i4 - 1) {
                                this.a = null;
                                return;
                            }
                        }
                        for (int i6 = i4 == 0 ? 5 : 3; i6 < value.length; i6++) {
                            this.d.append(String.format("%02x", Byte.valueOf(value[i6])));
                        }
                        this.b = i4;
                        if (z2) {
                            this.a.setHci(this.d.toString());
                        }
                    }
                }
            }
        }
    }

    public HMNFCProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = (short) 28;
        this.g = (byte) 27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(ByteArrayOutputStream byteArrayOutputStream, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "HMNFCProfile notify:" + GattUtils.bytesToHexString(bArr));
        byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
        if (bArr[0] == -110) {
            return;
        }
        if (bArr[0] == -109) {
            countDownLatch.countDown();
        } else {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B(ByteArrayOutputStream byteArrayOutputStream, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "HMNFCProfile notify:" + GattUtils.bytesToHexString(bArr));
        byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
        if (bArr[0] == -110) {
            return;
        }
        if (bArr[0] == -109) {
            countDownLatch.countDown();
        } else {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(ByteArrayOutputStream byteArrayOutputStream, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "HMNFCProfile notify:" + GattUtils.bytesToHexString(bArr));
        byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
        if (bArr[0] == -110) {
            return;
        }
        if (bArr[0] == -109) {
            countDownLatch.countDown();
        } else {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(byte[] bArr) {
        Debug.i(HMBaseProfile.TAG, "APDU notify:" + GattUtils.bytesToHexString(bArr));
        IHMNFCStatusListener iHMNFCStatusListener = this.d;
        if (iHMNFCStatusListener != null && bArr != null && bArr.length == 2 && bArr[0] == -126 && bArr[1] != 0) {
            iHMNFCStatusListener.onStatusChanged(new HMNFCStatus(bArr[1] & 255));
        }
        if (this.c != null) {
            this.c.notify(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(ByteArrayOutputStream byteArrayOutputStream, AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "HMNFCProfile notify:" + GattUtils.bytesToHexString(bArr));
        byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
        if (bArr[0] == -110) {
            return;
        }
        if (bArr[0] != -109) {
            byteArrayOutputStream.reset();
            countDownLatch.countDown();
            return;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray[0] != 5) {
            atomicInteger.set(-100);
        } else if (byteArray[1] == 0) {
            atomicInteger.set(0);
        } else if (byteArray[1] == 1) {
            atomicInteger.set(-100);
        } else if (byteArray[1] == 2) {
            atomicInteger.set(-101);
        }
        if (byteArray.length >= 22) {
            atomicBoolean.set(byteArray[19] == 0);
        } else {
            atomicInteger.set(-100);
        }
        byteArrayOutputStream.reset();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(ByteArrayOutputStream byteArrayOutputStream, AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "HMNFCProfile notify:" + GattUtils.bytesToHexString(bArr));
        byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
        if (bArr[0] == -110) {
            return;
        }
        if (bArr[0] != -109) {
            byteArrayOutputStream.reset();
            countDownLatch.countDown();
            return;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray[0] != 7) {
            atomicInteger.set(-100);
        } else if (byteArray[1] == 0) {
            atomicInteger.set(0);
        } else if (byteArray[1] == 1) {
            atomicInteger.set(-100);
        }
        int i2 = byteArray[2] & 255;
        if (byteArray.length <= 22) {
            atomicBoolean.set(byteArray[i2 + 3] == 0);
        } else {
            atomicInteger.set(-100);
        }
        byteArrayOutputStream.reset();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(ByteArrayOutputStream byteArrayOutputStream, AtomicInteger atomicInteger, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "HMNFCProfile notify:" + GattUtils.bytesToHexString(bArr));
        byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
        if (bArr[0] == -103) {
            return;
        }
        if (bArr[0] != -102) {
            byteArrayOutputStream.reset();
            countDownLatch.countDown();
            return;
        }
        atomicInteger.set(byteArrayOutputStream.size());
        int size = byteArrayOutputStream.size();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Debug.i(HMBaseProfile.TAG, "responseLen:" + size + ",responseData:" + GattUtils.bytesToHexString(byteArray));
        int i2 = size - 3;
        byte[] bArr2 = new byte[i2];
        if (byteArray[0] == 0) {
            System.arraycopy(byteArray, 3, bArr2, 0, i2);
        }
        byteArrayOutputStream.reset();
        Debug.i(HMBaseProfile.TAG, "realData:" + GattUtils.bytesToHexString(bArr2));
        byteArrayOutputStream.write(bArr2, 0, i2);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(ByteArrayOutputStream byteArrayOutputStream, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "saveKey notify:" + GattUtils.bytesToHexString(bArr));
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I(HMNotifyResponse hMNotifyResponse, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "notify:" + GattUtils.bytesToHexString(bArr));
        hMNotifyResponse.from(bArr);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J(ByteArrayOutputStream byteArrayOutputStream, byte b2, byte b3, AtomicInteger atomicInteger, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "HMNFCProfile notify:" + GattUtils.bytesToHexString(bArr));
        byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
        if (bArr[0] == b2) {
            return;
        }
        if (bArr[0] != b3) {
            byteArrayOutputStream.reset();
            countDownLatch.countDown();
            return;
        }
        int size = byteArrayOutputStream.size();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Debug.i(HMBaseProfile.TAG, "responseLen:" + size + ",responseData:" + GattUtils.bytesToHexString(byteArray));
        if (size != 1 && size >= 4) {
            int i2 = (byteArray[size - 1] & 255) << 8;
            int i3 = size - 2;
            atomicInteger.set(i2 | (byteArray[i3] & 255));
            byte[] bArr2 = new byte[i3];
            System.arraycopy(byteArray, 0, bArr2, 0, i3);
            byteArrayOutputStream.reset();
            Debug.i(HMBaseProfile.TAG, "realLen:" + i3 + ",realData:" + GattUtils.bytesToHexString(bArr2));
            if (i3 >= atomicInteger.get()) {
                byteArrayOutputStream.write(bArr2, 0, i3);
            } else {
                Debug.i(HMBaseProfile.TAG, "wrong data length response data len:" + i3 + ",real data len:" + atomicInteger.get());
            }
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(AtomicReference atomicReference, CountDownLatch countDownLatch, byte[] bArr) {
        HMNFCCardStatus hMNFCCardStatus = new HMNFCCardStatus();
        byte b2 = bArr[1];
        HMNFCCardCtl hMNFCCardCtlFrom = HMNFCCardCtl.from((byte) (b2 & 15));
        hMNFCCardStatus.setCardCtl(hMNFCCardCtlFrom);
        byte b3 = (byte) ((b2 >> 4) & 15);
        hMNFCCardStatus.setStatus(b3);
        if (hMNFCCardCtlFrom == HMNFCCardCtl.READ && b3 == 0) {
            HMNFCCardIdent hMNFCCardIdent = new HMNFCCardIdent();
            hMNFCCardIdent.setType(HMNFCCardType.from(bArr[2]));
            byte b4 = bArr[3];
            hMNFCCardIdent.setAidLen(b4);
            StringBuilder sb = new StringBuilder();
            for (int i2 = 4; i2 < b4 + 4; i2++) {
                sb.append(String.format("%02x", Byte.valueOf(bArr[i2])));
            }
            hMNFCCardIdent.setAid(sb.toString());
            hMNFCCardStatus.setCardIdent(hMNFCCardIdent);
        }
        atomicReference.getAndSet(hMNFCCardStatus);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, byte[] bArr) {
        atomicBoolean.getAndSet(bArr != null && bArr.length >= 2 && (bArr[0] & 255) == 144 && (bArr[1] & 255) == 0);
        countDownLatch.countDown();
    }

    private byte[] M(byte[] data, int dataLen) {
        int length = data.length;
        byte[] bArr = new byte[length + 2];
        System.arraycopy(data, 0, bArr, 0, length);
        bArr[length] = (byte) (dataLen & 255);
        bArr[length + 1] = (byte) ((dataLen >> 8) & 255);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HMNFCBlockInfo N(byte[] value) {
        if (value == null || value.length <= 3) {
            return null;
        }
        HMNFCBlockInfo hMNFCBlockInfo = new HMNFCBlockInfo();
        hMNFCBlockInfo.setHeader(value[0] & 255);
        hMNFCBlockInfo.setFlag(value[1] & 255);
        hMNFCBlockInfo.setIndex(((value[3] & 255) << 8) | (value[2] & 255));
        byte[] bArr = new byte[value.length - 4];
        System.arraycopy(value, 4, bArr, 0, value.length - 4);
        hMNFCBlockInfo.setData(bArr);
        return hMNFCBlockInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HMNFCCardInfo O(byte[] datas, int version) {
        if (datas == null || datas.length < 2) {
            return null;
        }
        HMNFCCardInfo hMNFCCardInfo = new HMNFCCardInfo();
        hMNFCCardInfo.setVersion(version);
        if (datas.length == 2) {
            hMNFCCardInfo.setHeader(datas[0] & 255);
            hMNFCCardInfo.setResult(datas[1] & 255);
            return hMNFCCardInfo;
        }
        hMNFCCardInfo.setHeader(datas[0] & 255);
        hMNFCCardInfo.setResult(datas[1] & 255);
        hMNFCCardInfo.setAtqa(String.format("%02x%02x", Byte.valueOf(datas[2]), Byte.valueOf(datas[3])));
        hMNFCCardInfo.setSak(String.format("%02x", Byte.valueOf(datas[4])));
        int i2 = datas[5] & 255;
        hMNFCCardInfo.setUidLen(i2);
        int i3 = (6 + i2) - 1;
        int length = datas.length - 1;
        if (i2 > 0 && i3 <= length) {
            StringBuilder sb = new StringBuilder();
            for (int i4 = 6; i4 <= i3; i4++) {
                sb.append(String.format("%02x", Byte.valueOf(datas[i4])));
            }
            hMNFCCardInfo.setUid(sb.toString());
            if (version >= 3) {
                hMNFCCardInfo.setBlockNum(((datas[i3 + 2] & 255) << 8) | (datas[i3 + 1] & 255));
            }
        }
        return hMNFCCardInfo;
    }

    private NFCVersion S() {
        if (!w()) {
            HMNotifyResponse hMNotifyResponseSendCommandWithResponse = sendCommandWithResponse(new byte[]{112, 0, 1, 0});
            if (hMNotifyResponseSendCommandWithResponse.getOriginResponseData() == null || hMNotifyResponseSendCommandWithResponse.getOriginResponseData().length <= 0) {
                return null;
            }
            return NFCVersion.INSTANCE.parse(hMNotifyResponseSendCommandWithResponse.getOriginResponseData());
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.b;
        if (bluetoothGattCharacteristic == null) {
            return null;
        }
        byte[] bArr = read(bluetoothGattCharacteristic);
        Debug.i(HMBaseProfile.TAG, "versions:" + GattUtils.bytesToHexString(bArr));
        if (bArr == null) {
            return null;
        }
        return NFCVersion.INSTANCE.parse(bArr);
    }

    private HMNotifyResponse T(byte[] cmd, long timeout) {
        Debug.fi(HMBaseProfile.TAG, "cmd:" + GattUtils.bytesToHexString(cmd));
        final HMNotifyResponse hMNotifyResponse = new HMNotifyResponse();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        V(new IGattCallback.INotifyCallback() { // from class: ya3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMNFCProfile.I(hMNotifyResponse, countDownLatch, bArr);
            }
        });
        if (write(this.b, cmd)) {
            try {
                countDownLatch.await(timeout, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                Debug.fi(HMBaseProfile.TAG, "await exception:" + e.getMessage());
            }
        }
        Debug.fi(HMBaseProfile.TAG, "result:" + hMNotifyResponse);
        V(null);
        return hMNotifyResponse;
    }

    private ApduResponse U(byte[] data, int dataLen, byte commandContinue, byte commandEnd, final byte responseContinue, final byte responseEnd) {
        Debug.i(HMBaseProfile.TAG, "sendData in");
        if (data == null || data.length == 0) {
            return null;
        }
        Debug.i(HMBaseProfile.TAG, "sendData origin:" + GattUtils.bytesToHexString(data));
        byte[] bArrM = M(data, dataLen);
        Debug.i(HMBaseProfile.TAG, "sendData package:" + GattUtils.bytesToHexString(bArrM));
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        V(new IGattCallback.INotifyCallback() { // from class: fb3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMNFCProfile.J(byteArrayOutputStream, responseContinue, responseEnd, atomicInteger, countDownLatch, bArr);
            }
        });
        if (c0(bArrM, commandContinue, commandEnd)) {
            try {
                countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                Debug.fi(HMBaseProfile.TAG, "latch await exception:" + e.getMessage());
            }
        }
        V(null);
        if (byteArrayOutputStream.size() == 0) {
            return null;
        }
        return new ApduResponse(byteArrayOutputStream.toByteArray(), atomicInteger.get());
    }

    private void V(IGattCallback.INotifyCallback callback) {
        this.c = callback;
    }

    public static int bytesToIntBig(byte[] src, int offset) {
        if (src.length == 4) {
            return (src[offset + 3] & 255) | ((src[offset] & 255) << 24) | ((src[offset + 1] & 255) << 16) | ((src[offset + 2] & 255) << 8);
        }
        if (src.length == 3) {
            return (src[offset + 2] & 255) | ((src[offset] & 255) << 16) | ((src[offset + 1] & 255) << 8);
        }
        if (src.length != 2) {
            return src[0] & 255;
        }
        return (src[offset + 1] & 255) | ((src[offset] & 255) << 8);
    }

    private boolean c0(byte[] pieceData, byte cmdC, byte cmdX) {
        int length = pieceData.length;
        int i2 = 0;
        boolean zWrite = true;
        while (length > 19) {
            byte[] bArr = new byte[20];
            bArr[0] = cmdC;
            System.arraycopy(pieceData, i2 * 19, bArr, 1, 19);
            Debug.i(HMBaseProfile.TAG, "cmdC:" + GattUtils.bytesToHexString(bArr));
            zWrite = write(this.b, bArr);
            if (!zWrite) {
                break;
            }
            length -= 19;
            i2++;
        }
        if (!zWrite || length <= 0) {
            return zWrite;
        }
        byte[] bArr2 = new byte[length + 1];
        bArr2[0] = cmdX;
        System.arraycopy(pieceData, i2 * 19, bArr2, 1, length);
        Debug.i(HMBaseProfile.TAG, "cmdX:" + GattUtils.bytesToHexString(bArr2));
        return write(this.b, bArr2);
    }

    public static boolean isSupport(GattPeripheral gattPeripheral) {
        BluetoothGattService service;
        return (gattPeripheral == null || (service = gattPeripheral.getService(HMBaseProfile.UUID_SERVICE_MILI_SERVICE)) == null || service.getCharacteristic(N) == null) ? false : true;
    }

    private HMNotifyResponse sendCommandWithResponse(byte[] cmd) {
        return T(cmd, 10000L);
    }

    private int u() {
        NFCVersion nFCVersion = this.e;
        if (nFCVersion == null) {
            return -1;
        }
        return nFCVersion.getVersion();
    }

    private boolean w() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.b;
        return bluetoothGattCharacteristic != null && (bluetoothGattCharacteristic.getProperties() & 2) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(ByteArrayOutputStream byteArrayOutputStream, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "getAtr notify:" + GattUtils.bytesToHexString(bArr));
        int length = bArr.length;
        if (bArr[0] == -120) {
            byteArrayOutputStream.write(bArr, 1, length - 1);
            return;
        }
        if (bArr[0] != -121) {
            byteArrayOutputStream.reset();
            countDownLatch.countDown();
            return;
        }
        if (length >= 4) {
            byteArrayOutputStream.write(bArr, 1, length - 3);
        } else if (length != 3 && length == 2) {
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(bArr, 1, 1);
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(ByteArrayOutputStream byteArrayOutputStream, AtomicInteger atomicInteger, AtomicLong atomicLong, AtomicLong atomicLong2, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "HMNFCProfile notify:" + GattUtils.bytesToHexString(bArr));
        int i2 = 1;
        byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
        if (bArr[0] == -110) {
            return;
        }
        if (bArr[0] != -109) {
            byteArrayOutputStream.reset();
            countDownLatch.countDown();
            return;
        }
        int size = byteArrayOutputStream.size();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Debug.i(HMBaseProfile.TAG, "responseLen:" + size + ",responseData:" + GattUtils.bytesToHexString(byteArray));
        if (byteArray[0] != 1) {
            atomicInteger.set(-100);
        } else if (byteArray[1] == 0) {
            atomicInteger.set(0);
        } else if (byteArray[1] == 1) {
            atomicInteger.set(-100);
        } else if (byteArray[1] == 2) {
            atomicInteger.set(-101);
        } else if (byteArray[1] == 3) {
            atomicInteger.set(-102);
        } else if (byteArray[1] == 4) {
            atomicInteger.set(-103);
        }
        byte[] bArr2 = new byte[4];
        int i3 = (byteArray[2] & 255) + 3;
        System.arraycopy(byteArray, i3, bArr2, 0, 4);
        byte[] bArr3 = new byte[4];
        System.arraycopy(byteArray, i3 + 4, bArr3, 0, 4);
        if ((bArr2[0] & 128) == 128) {
            bArr2[0] = (byte) (bArr2[0] & 127);
            i2 = -1;
        }
        Debug.i(HMBaseProfile.TAG, "realData:" + GattUtils.bytesToHexString(bArr2));
        atomicLong.set((long) (bytesToIntBig(bArr2, 0) * i2));
        atomicLong2.set((long) bytesToIntBig(bArr3, 0));
        byteArrayOutputStream.reset();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(ByteArrayOutputStream byteArrayOutputStream, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "HMNFCProfile notify:" + GattUtils.bytesToHexString(bArr));
        byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
        if (bArr[0] == -110) {
            return;
        }
        if (bArr[0] == -109) {
            countDownLatch.countDown();
        } else {
            countDownLatch.countDown();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    public PasswordInteractionResponse P() {
        int i2 = 2;
        byte[] originResponseData = sendCommandWithResponse(new byte[]{24, 1}).getOriginResponseData();
        if (originResponseData.length < 2) {
            i2 = -1;
        } else {
            byte b2 = originResponseData[2];
            if (b2 == 0) {
                i2 = 0;
            } else if (b2 == 1) {
                i2 = 1;
            } else if (b2 != 2) {
                if (b2 == 3) {
                    i2 = 3;
                } else {
                    i2 = -1;
                }
            }
        }
        return new PasswordInteractionResponse(i2);
    }

    public boolean Q() {
        byte[] originResponseData = sendCommandWithResponse(new byte[]{24, 1}).getOriginResponseData();
        return originResponseData != null && originResponseData[0] == -104 && originResponseData[2] == 0;
    }

    public boolean R() {
        byte[] originResponseData;
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse = sendCommandWithResponse(new byte[]{22, 1, 3, 2, 0});
        return hMNotifyResponseSendCommandWithResponse != null && (originResponseData = hMNotifyResponseSendCommandWithResponse.getOriginResponseData()) != null && originResponseData.length == 20 && originResponseData[0] == -106 && originResponseData[2] == 3 && originResponseData[1] == 1;
    }

    public boolean W() {
        return sendCommandWithResponse(new byte[]{24, 4}).getOriginResponseData()[1] == 4;
    }

    public HMNFCCardStatus X(HMNFCCardConfig cardConfig) {
        if (cardConfig == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(15);
            byteArrayOutputStream.write(cardConfig.getBytes());
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicReference atomicReference = new AtomicReference();
            V(new IGattCallback.INotifyCallback() { // from class: db3
                @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
                public final void notify(byte[] bArr) {
                    HMNFCProfile.K(atomicReference, countDownLatch, bArr);
                }
            });
            if (write(this.b, byteArrayOutputStream.toByteArray())) {
                countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            }
            V(null);
            return (HMNFCCardStatus) atomicReference.get();
        } catch (Exception e) {
            Debug.fi(HMBaseProfile.TAG, "Exception:" + e.getMessage());
            return null;
        }
    }

    public boolean Y(List<? extends HMNFCCardIdent> cardIdents, HMNFCCardType type) {
        if (cardIdents == null || cardIdents.size() == 0) {
            boolean Z = Z(type);
            Debug.i(HMBaseProfile.TAG, "updateResult:" + Z);
            return Z;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write((byte) cardIdents.size());
            Iterator<? extends HMNFCCardIdent> it2 = cardIdents.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(it2.next().getBytes());
            }
            byteArrayOutputStream.write(GattUtils.shortToBytes((short) byteArrayOutputStream.toByteArray().length));
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            V(new IGattCallback.INotifyCallback() { // from class: cb3
                @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
                public final void notify(byte[] bArr) {
                    HMNFCProfile.L(atomicBoolean, countDownLatch, bArr);
                }
            });
            if (c0(byteArrayOutputStream.toByteArray(), (byte) 17, (byte) 16)) {
                countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
            }
            V(null);
            return atomicBoolean.get();
        } catch (Exception e) {
            Debug.fi(HMBaseProfile.TAG, "updateCardList exception:" + e.getMessage());
            return false;
        }
    }

    public boolean Z(HMNFCCardType type) {
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse;
        if (u() < 4 || (hMNotifyResponseSendCommandWithResponse = sendCommandWithResponse(new byte[]{16, 1, type.getValue(), 0, 3, 0})) == null) {
            return false;
        }
        byte[] originResponseData = hMNotifyResponseSendCommandWithResponse.getOriginResponseData();
        Debug.i(HMBaseProfile.TAG, "updateEmptyCardList data:" + GattUtils.bytesToHexString(originResponseData));
        return originResponseData != null && originResponseData.length >= 2 && (originResponseData[0] & 255) == 144 && (originResponseData[1] & 255) == 0;
    }

    public boolean a0(String password) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {24, 5, 0, 8, 0, 3};
        byte[] bArr2 = new byte[6];
        for (int i2 = 0; i2 < 6; i2++) {
            bArr2[i2] = (byte) password.charAt(i2);
        }
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(bArr2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sendCommandWithResponse(byteArrayOutputStream.toByteArray()).getOriginResponseData()[1] == 5;
    }

    public boolean b0() {
        byte[] originResponseData = T(new byte[]{24, 2}, 60000L).getOriginResponseData();
        return originResponseData != null && originResponseData[0] == -104 && originResponseData[2] == 0;
    }

    public int connectNfc() {
        byte[] originResponseData;
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse = sendCommandWithResponse(new byte[]{1});
        if (hMNotifyResponseSendCommandWithResponse != null && (originResponseData = hMNotifyResponseSendCommandWithResponse.getOriginResponseData()) != null && originResponseData.length == 2 && originResponseData[0] == -127) {
            return originResponseData[1] & 255;
        }
        return -1;
    }

    public boolean d0() {
        byte[] originResponseData;
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse = sendCommandWithResponse(new byte[]{22, 0, 3, 2, 0});
        return hMNotifyResponseSendCommandWithResponse != null && (originResponseData = hMNotifyResponseSendCommandWithResponse.getOriginResponseData()) != null && originResponseData[0] == -106 && originResponseData[1] == 0;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.b;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        unregisterNotification(bluetoothGattCharacteristic);
        return false;
    }

    public int disconnectNfc() {
        byte[] originResponseData;
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse = sendCommandWithResponse(new byte[]{2});
        if (hMNotifyResponseSendCommandWithResponse != null && (originResponseData = hMNotifyResponseSendCommandWithResponse.getOriginResponseData()) != null && originResponseData.length == 2 && originResponseData[0] == -126) {
            return originResponseData[1] & 255;
        }
        return -1;
    }

    public byte[] getATR() {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        V(new IGattCallback.INotifyCallback() { // from class: hb3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMNFCProfile.x(byteArrayOutputStream, countDownLatch, bArr);
            }
        });
        if (!write(this.b, new byte[]{7})) {
            Debug.fi(HMBaseProfile.TAG, "write apdu command failed!!!");
            return null;
        }
        try {
            countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            Debug.fi(HMBaseProfile.TAG, "latch await exception:" + e.getMessage());
        }
        V(null);
        if (byteArrayOutputStream.size() == 0) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public BusBalanceResponse getBalance(byte[] data) {
        if (data == null || data.length == 0) {
            return new BusBalanceResponse(-100, 0L, 0L);
        }
        Debug.i(HMBaseProfile.TAG, "sendData origin:" + GattUtils.bytesToHexString(data));
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicLong atomicLong = new AtomicLong(0L);
        final AtomicLong atomicLong2 = new AtomicLong(0L);
        V(new IGattCallback.INotifyCallback() { // from class: bb3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMNFCProfile.y(byteArrayOutputStream, atomicInteger, atomicLong, atomicLong2, countDownLatch, bArr);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream2.write(1);
            byteArrayOutputStream2.write(data.length);
            byteArrayOutputStream2.write(data);
        } catch (Exception e) {
            Debug.fi(HMBaseProfile.TAG, "send error exception:" + e.getMessage());
        }
        if (c0(M(byteArrayOutputStream2.toByteArray(), byteArrayOutputStream2.toByteArray().length), (byte) 18, (byte) 19)) {
            try {
                countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                Debug.fi(HMBaseProfile.TAG, "latch await exception:" + e2.getMessage());
            }
        }
        V(null);
        return new BusBalanceResponse(atomicInteger.get(), atomicLong.get(), atomicLong2.get());
    }

    public BusCardInfoResponse getCardInfo(byte[] data) {
        if (data == null || data.length == 0) {
            return new BusCardInfoResponse(-100, null);
        }
        Debug.i(HMBaseProfile.TAG, "sendData origin:" + GattUtils.bytesToHexString(data));
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = -1;
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        V(new IGattCallback.INotifyCallback() { // from class: lb3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMNFCProfile.z(byteArrayOutputStream, countDownLatch, bArr);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream2.write(3);
            byteArrayOutputStream2.write(data.length);
            byteArrayOutputStream2.write(data);
        } catch (Exception e) {
            Debug.fi(HMBaseProfile.TAG, "send error exception:" + e.getMessage());
        }
        if (c0(M(byteArrayOutputStream2.toByteArray(), byteArrayOutputStream2.toByteArray().length), (byte) 18, (byte) 19)) {
            try {
                countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                Debug.fi(HMBaseProfile.TAG, "latch await exception:" + e2.getMessage());
            }
        }
        V(null);
        int size = byteArrayOutputStream.size();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Debug.i(HMBaseProfile.TAG, "responseLen:" + size + ",responseData:" + GattUtils.bytesToHexString(byteArray));
        if (byteArray[0] != 3) {
            atomicInteger.set(-100);
        } else if (byteArray[1] == 0) {
            atomicInteger.set(0);
        } else if (byteArray[1] == 1) {
            atomicInteger.set(-100);
        } else if (byteArray[1] == 2) {
            atomicInteger.set(-101);
        } else if (byteArray[1] == 3) {
            atomicInteger.set(-102);
        } else if (byteArray[1] == 4) {
            atomicInteger.set(-103);
        }
        int i3 = (byteArray[2] & 255) + 3;
        boolean z2 = (byteArray[i3] & 128) == 128;
        int i4 = byteArray[i3] & 63;
        int i5 = (i4 + 1) / 2;
        byte[] bArr = new byte[i5];
        int i6 = i3 + 1;
        System.arraycopy(byteArray, i6, bArr, 0, i5);
        String strBytesTo16HexString = GattUtils.bytesTo16HexString(bArr);
        if (i4 % 2 != 0) {
            strBytesTo16HexString = strBytesTo16HexString.substring(1);
        }
        Debug.i(HMBaseProfile.TAG, "cardNoLen:" + i4);
        byte[] bArr2 = new byte[4];
        int i7 = i6 + i5;
        System.arraycopy(byteArray, i7, bArr2, 0, 4);
        if ((bArr2[0] & 128) == 128) {
            bArr2[0] = (byte) (bArr2[0] & 127);
        } else {
            i2 = 1;
        }
        Debug.i(HMBaseProfile.TAG, "balanceData:" + GattUtils.bytesToHexString(bArr));
        int iBytesToIntBig = bytesToIntBig(bArr2, 0) * i2;
        byte[] bArr3 = new byte[4];
        int i8 = i7 + 4;
        System.arraycopy(byteArray, i8, bArr3, 0, 4);
        int iBytesToIntBig2 = bytesToIntBig(bArr3, 0);
        byte[] bArr4 = new byte[4];
        int i9 = i8 + 4;
        System.arraycopy(byteArray, i9, bArr4, 0, 4);
        long yMDTimestamp = NFCExtensionsKt.toYMDTimestamp(GattUtils.bytesTo16HexString(bArr4));
        byte[] bArr5 = new byte[4];
        System.arraycopy(byteArray, i9 + 4, bArr5, 0, 4);
        return new BusCardInfoResponse(atomicInteger.get(), new CardInfoEntity(strBytesTo16HexString, yMDTimestamp, NFCExtensionsKt.toYMDTimestamp(GattUtils.bytesTo16HexString(bArr5)), z2, iBytesToIntBig, iBytesToIntBig2, (byteArray[i7 + 16] & 255) == 1));
    }

    public BusConsumerListResponse getConsumeList(byte[] data) {
        if (data == null || data.length == 0) {
            return new BusConsumerListResponse(-100, null);
        }
        Debug.i(HMBaseProfile.TAG, "sendData origin:" + GattUtils.bytesToHexString(data));
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        char c = 1;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new AtomicLong(0L);
        V(new IGattCallback.INotifyCallback() { // from class: ib3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMNFCProfile.A(byteArrayOutputStream, countDownLatch, bArr);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        int i2 = 2;
        try {
            byteArrayOutputStream2.write(2);
            byteArrayOutputStream2.write(data.length);
            byteArrayOutputStream2.write(data);
        } catch (Exception e) {
            Debug.fi(HMBaseProfile.TAG, "send error exception:" + e.getMessage());
        }
        if (c0(M(byteArrayOutputStream2.toByteArray(), byteArrayOutputStream2.toByteArray().length), (byte) 18, (byte) 19)) {
            try {
                countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                Debug.fi(HMBaseProfile.TAG, "latch await exception:" + e2.getMessage());
            }
        }
        V(null);
        int size = byteArrayOutputStream.size();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ArrayList arrayList = new ArrayList();
        ArrayList<byte[]> arrayList2 = new ArrayList();
        Debug.i(HMBaseProfile.TAG, "responseLen:" + size + ",responseData:" + GattUtils.bytesToHexString(byteArray));
        if (byteArray[0] != 2) {
            atomicInteger.set(-100);
        } else if (byteArray[1] == 0) {
            atomicInteger.set(0);
        } else if (byteArray[1] == 1) {
            atomicInteger.set(-100);
        } else if (byteArray[1] == 2) {
            atomicInteger.set(-101);
        }
        int i3 = 3;
        int i4 = (byteArray[2] & 255) + 3;
        int i5 = byteArray[i4] & 255;
        int i6 = size - (i4 + 2);
        byte[] bArr = new byte[i6];
        System.arraycopy(byteArray, i4 + 1, bArr, 0, i6);
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            byte[] bArr2 = new byte[2];
            bArr2[0] = bArr[i8];
            bArr2[c] = bArr[i8 + 1];
            int iBytesToIntBig = bytesToIntBig(bArr2, 0);
            int i9 = iBytesToIntBig - 2;
            byte[] bArr3 = new byte[i9];
            System.arraycopy(bArr, i8 + 2, bArr3, 0, i9);
            i8 += iBytesToIntBig;
            arrayList2.add(bArr3);
            i7++;
            c = 1;
        }
        for (byte[] bArr4 : arrayList2) {
            Debug.i(HMBaseProfile.TAG, "bytesEntity:" + GattUtils.bytesToHexString(bArr4) + "\n");
            byte[] bArr5 = new byte[i2];
            System.arraycopy(bArr4, 0, bArr5, 0, i2);
            byte[] bArr6 = new byte[i3];
            System.arraycopy(bArr4, i2, bArr6, 0, i3);
            byte[] bArr7 = new byte[4];
            System.arraycopy(bArr4, 5, bArr7, 0, 4);
            char c2 = bArr4[9];
            byte[] bArr8 = new byte[6];
            System.arraycopy(bArr4, 10, bArr8, 0, 6);
            byte[] bArr9 = new byte[7];
            System.arraycopy(bArr4, 16, bArr9, 0, 7);
            int i10 = bArr4[23];
            int i11 = bArr4[24];
            byte[] bArr10 = new byte[i11];
            System.arraycopy(bArr4, 25, bArr10, 0, i11);
            arrayList.add(new CardTransEntity(GattUtils.bytesTo16HexString(bArr5), NFCExtensionsKt.getRecordDate(GattUtils.bytesTo16HexString(bArr9)), bytesToIntBig(bArr7, 0), c2 & 255, GattUtils.bytesTo16HexString(bArr8), bytesToIntBig(bArr6, 0), i10, i11, GattUtils.bytesTo16HexString(bArr10)));
            i2 = 2;
            i3 = 3;
        }
        return new BusConsumerListResponse(atomicInteger.get(), arrayList);
    }

    public String getCplc() {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        V(new IGattCallback.INotifyCallback() { // from class: kb3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMNFCProfile.B(byteArrayOutputStream, countDownLatch, bArr);
            }
        });
        if (c0(new byte[]{4, 1, 0}, (byte) 18, (byte) 19)) {
            try {
                countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                Debug.fi(HMBaseProfile.TAG, "latch await exception:" + e.getMessage());
            }
        }
        V(null);
        int size = byteArrayOutputStream.size();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray[0] != 4) {
            atomicInteger.set(-100);
        } else if (byteArray[1] == 0) {
            atomicInteger.set(0);
        } else if (byteArray[1] == 1) {
            atomicInteger.set(-100);
        }
        int i2 = byteArray[2] & 255;
        if (size != i2 + 3 + 2) {
            atomicInteger.set(-100);
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(byteArray, 3, bArr, 0, i2);
        return GattUtils.bytesTo16HexString(bArr);
    }

    public String getLNTCode() {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        V(new IGattCallback.INotifyCallback() { // from class: jb3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMNFCProfile.C(byteArrayOutputStream, countDownLatch, bArr);
            }
        });
        if (c0(new byte[]{6, 1, 0}, (byte) 18, (byte) 19)) {
            try {
                countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                Debug.fi(HMBaseProfile.TAG, "latch await exception:" + e.getMessage());
            }
        }
        V(null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray[0] != 6) {
            atomicInteger.set(-100);
        } else if (byteArray[1] == 0) {
            atomicInteger.set(0);
        } else if (byteArray[1] == 1) {
            atomicInteger.set(-100);
        } else if (byteArray[1] == 2) {
            atomicInteger.set(-101);
        }
        if (byteArray.length >= 5) {
            return GattUtils.bytesTo16HexString(new byte[]{byteArray[2]});
        }
        atomicInteger.set(-100);
        return null;
    }

    @Nullable
    public NFCVersion getNfcVersion() {
        return this.e;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        BluetoothGattService service = getService(HMBaseProfile.UUID_SERVICE_MILI_SERVICE);
        if (service == null) {
            return false;
        }
        UUID uuid = N;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid);
        this.b = characteristic;
        if (characteristic != null) {
            boolean zRegisterNotification = registerNotification(characteristic, new IGattCallback.INotifyCallback() { // from class: eb3
                @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
                public final void notify(byte[] bArr) {
                    this.a.D(bArr);
                }
            });
            try {
                this.e = S();
            } catch (Exception unused) {
                Debug.fi(HMBaseProfile.TAG, "Parse nfc version failed");
            }
            return zRegisterNotification;
        }
        Debug.fi(HMBaseProfile.TAG, uuid + " is null!");
        return false;
    }

    public boolean isAlreadyPersonal(byte[] data) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        V(new IGattCallback.INotifyCallback() { // from class: ab3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMNFCProfile.E(byteArrayOutputStream, atomicInteger, atomicBoolean, countDownLatch, bArr);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream2.write(5);
            byteArrayOutputStream2.write(data.length);
            byteArrayOutputStream2.write(data);
        } catch (Exception e) {
            Debug.fi(HMBaseProfile.TAG, "send error exception:" + e.getMessage());
        }
        if (c0(M(byteArrayOutputStream2.toByteArray(), byteArrayOutputStream2.toByteArray().length), (byte) 18, (byte) 19)) {
            try {
                countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                Debug.fi(HMBaseProfile.TAG, "latch await exception:" + e2.getMessage());
            }
        }
        V(null);
        return atomicBoolean.get();
    }

    public boolean isSupportCity(byte[] data) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        V(new IGattCallback.INotifyCallback() { // from class: za3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMNFCProfile.F(byteArrayOutputStream, atomicInteger, atomicBoolean, countDownLatch, bArr);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream2.write(7);
            byteArrayOutputStream2.write(data.length);
            byteArrayOutputStream2.write(data);
        } catch (Exception e) {
            Debug.fi(HMBaseProfile.TAG, "send error exception:" + e.getMessage());
        }
        if (c0(M(byteArrayOutputStream2.toByteArray(), byteArrayOutputStream2.toByteArray().length), (byte) 18, (byte) 19)) {
            try {
                countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                Debug.fi(HMBaseProfile.TAG, "latch await exception:" + e2.getMessage());
            }
        }
        V(null);
        return atomicBoolean.get();
    }

    public ApduResponse nfcLoadService(byte[] data) {
        Debug.i(HMBaseProfile.TAG, "sendData origin:" + GattUtils.bytesToHexString(data));
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        V(new IGattCallback.INotifyCallback() { // from class: mb3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMNFCProfile.G(byteArrayOutputStream, atomicInteger, countDownLatch, bArr);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream2.write(data);
        } catch (Exception e) {
            Debug.fi(HMBaseProfile.TAG, "send error exception:" + e.getMessage());
        }
        if (c0(byteArrayOutputStream2.toByteArray(), (byte) 25, (byte) 26)) {
            try {
                countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                Debug.fi(HMBaseProfile.TAG, "latch await exception:" + e2.getMessage());
            }
        }
        V(null);
        if (byteArrayOutputStream.size() == 0) {
            return null;
        }
        return new ApduResponse(byteArrayOutputStream.toByteArray(), atomicInteger.get());
    }

    public boolean readWristAndPinState() {
        byte[] originResponseData = sendCommandWithResponse(new byte[]{27}).getOriginResponseData();
        Debug.i(HMBaseProfile.TAG, "readWristAndPinState:" + GattUtils.bytesToHexString(originResponseData));
        return originResponseData != null && originResponseData.length == 3 && originResponseData[2] == 0;
    }

    public boolean s() {
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse = sendCommandWithResponse(new byte[]{28});
        if (hMNotifyResponseSendCommandWithResponse == null) {
            return true;
        }
        byte[] originResponseData = hMNotifyResponseSendCommandWithResponse.getOriginResponseData();
        Debug.i(HMBaseProfile.TAG, "getCRSCode data:" + GattUtils.bytesToHexString(originResponseData));
        if (originResponseData == null || originResponseData.length < 2 || (originResponseData[0] & 255) != 156 || (originResponseData[1] & 255) != 0) {
            return true;
        }
        return true ^ Arrays.equals(new byte[]{originResponseData[originResponseData.length - 2], originResponseData[originResponseData.length - 1]}, new byte[]{-112, 0});
    }

    public boolean saveKey(byte[] key, int keyLen) {
        Debug.i(HMBaseProfile.TAG, "saveKey in");
        if (key == null || key.length == 0) {
            return false;
        }
        Debug.i(HMBaseProfile.TAG, "saveKey origin:" + GattUtils.bytesToHexString(key));
        byte[] bArrM = M(key, keyLen);
        Debug.i(HMBaseProfile.TAG, "saveKey package:" + GattUtils.bytesToHexString(bArrM));
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        V(new IGattCallback.INotifyCallback() { // from class: gb3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMNFCProfile.H(byteArrayOutputStream, countDownLatch, bArr);
            }
        });
        if (c0(bArrM, (byte) 10, (byte) 9)) {
            try {
                countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                Debug.fi(HMBaseProfile.TAG, "latch await exception:" + e.getMessage());
            }
        }
        V(null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return byteArray.length == 2 && byteArray[0] == -119 && byteArray[1] == 0;
    }

    public ApduResponse sendData(byte[] data, int dataLen, final boolean encrypt) {
        byte b2 = encrypt ? (byte) 6 : (byte) 4;
        byte b3 = encrypt ? (byte) 5 : (byte) 3;
        return U(data, dataLen, b2, b3, (byte) (b2 | (-128)), (byte) (b3 | (-128)));
    }

    public ApduResponse sendMasterCardData(byte[] data, int dataLen) {
        return U(data, dataLen, (byte) 21, (byte) 20, H, I);
    }

    public boolean setAccessInfo(HMAccessInfo info) {
        if (info == null) {
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int aidLen = info.getAidLen();
            byte[] aid = info.getAid();
            String name = info.getName();
            byteArrayOutputStream.write(27);
            byteArrayOutputStream.write(aidLen);
            if (aidLen > 0) {
                byteArrayOutputStream.write(aid);
            }
            if (!TextUtils.isEmpty(name)) {
                byteArrayOutputStream.write(name.getBytes());
            }
            byteArrayOutputStream.write(0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (isSupportPatchWrite()) {
                return patchWrite(byteArray, 2);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public boolean setAidInfo(HMAidInfo aidInfo) {
        if (aidInfo == null) {
            return false;
        }
        int aidLen = aidInfo.getAidLen();
        byte[] bArr = new byte[aidLen + 6];
        bArr[0] = 6;
        bArr[1] = 28;
        bArr[2] = 0;
        bArr[3] = (byte) aidInfo.getOp();
        bArr[4] = (byte) aidInfo.getType();
        bArr[5] = (byte) aidLen;
        if (aidLen > 0) {
            System.arraycopy(aidInfo.getAid(), 0, bArr, 6, aidLen);
        }
        return isSupportPatchWrite() && patchWrite(bArr, 2);
    }

    public void setListener(IHMNFCStatusListener listener) {
        this.d = listener;
    }

    public HMNFCCardInfo t() {
        byte[] bArr = {13};
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicReference atomicReference = new AtomicReference(null);
        V(new a(atomicBoolean, u(), atomicReference, countDownLatch));
        if (write(this.b, bArr)) {
            try {
                countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                Debug.fi(HMBaseProfile.TAG, "await exception:" + e.getMessage());
            }
        }
        V(null);
        return (HMNFCCardInfo) atomicReference.get();
    }

    public ArrayList<HMNFCTradeInfo> v() {
        byte[] bArr = {14};
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList<HMNFCTradeInfo> arrayList = new ArrayList<>();
        V(new b(arrayList, countDownLatch));
        if (write(this.b, bArr)) {
            try {
                countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                Debug.fi(HMBaseProfile.TAG, "await exception:" + e.getMessage());
            }
        }
        V(null);
        Log.d(SyncNfcTradeHelper.TAG, "return tradeInfos");
        return arrayList;
    }
}
