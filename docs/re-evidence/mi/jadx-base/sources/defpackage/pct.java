package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.nfc.ApduResponse;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCBlockInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardConfig;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardCtl;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardStatus;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardType;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCStatus;
import com.xiaomi.hm.health.bt.profile.nfc.PasswordInteractionResponse;
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
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class pct extends a6t {
    public static final UUID h = tet.C(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BluetoothGattCharacteristic f30273b;
    public volatile zh.b c;
    public w1t d;
    public mm e;
    public final short f;
    public final byte g;

    public class a implements zh.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<HMNFCBlockInfo> f30274a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30275b = -1;
        public final /* synthetic */ AtomicBoolean c;
        public final /* synthetic */ int d;
        public final /* synthetic */ AtomicReference e;
        public final /* synthetic */ CountDownLatch f;

        public a(AtomicBoolean atomicBoolean, int i, AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.c = atomicBoolean;
            this.d = i;
            this.e = atomicReference;
            this.f = countDownLatch;
        }

        @Override // zh.b
        public void e(byte[] bArr) {
            t5t.d(a6t.TAG, "notify:" + tet.x(bArr));
            if (this.c.get()) {
                this.c.set(false);
                HMNFCCardInfo hMNFCCardInfoW = pct.this.w(bArr, this.d);
                this.e.getAndSet(hMNFCCardInfoW);
                if (hMNFCCardInfoW == null || hMNFCCardInfoW.getBlockNum() == 0 || hMNFCCardInfoW.getResult() == 9 || hMNFCCardInfoW.getResult() == 3 || hMNFCCardInfoW.getResult() == 8 || hMNFCCardInfoW.getResult() == 40 || hMNFCCardInfoW.getResult() == 41) {
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
            HMNFCBlockInfo hMNFCBlockInfoZ = pct.this.z(bArr);
            if (hMNFCBlockInfoZ == null) {
                this.f.countDown();
                return;
            }
            int index = hMNFCBlockInfoZ.getIndex();
            if (this.f30275b + 1 != index) {
                this.f.countDown();
                return;
            }
            this.f30275b = index;
            this.f30274a.add(hMNFCBlockInfoZ);
            if (index == hMNFCCardInfo.getBlockNum() - 1) {
                hMNFCCardInfo.setBlockInfos(this.f30274a);
                this.f.countDown();
            }
        }
    }

    public pct(jet jetVar) {
        super(jetVar);
        this.f30273b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = (short) 28;
        this.g = (byte) 27;
    }

    public static /* synthetic */ void i(ByteArrayOutputStream byteArrayOutputStream, byte b2, byte b3, AtomicInteger atomicInteger, CountDownLatch countDownLatch, byte[] bArr) {
        t5t.d(a6t.TAG, "HMNFCProfile notify:" + tet.x(bArr));
        byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
        byte b4 = bArr[0];
        if (b4 == b2) {
            return;
        }
        if (b4 != b3) {
            byteArrayOutputStream.reset();
            countDownLatch.countDown();
            return;
        }
        int size = byteArrayOutputStream.size();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        t5t.m(a6t.TAG, "responseLen:" + size + ",responseData:" + tet.x(byteArray));
        if (size != 1 && size >= 4) {
            int i = (byteArray[size - 1] & 255) << 8;
            int i2 = size - 2;
            atomicInteger.set(i | (byteArray[i2] & 255));
            byte[] bArr2 = new byte[i2];
            System.arraycopy(byteArray, 0, bArr2, 0, i2);
            byteArrayOutputStream.reset();
            t5t.m(a6t.TAG, "realLen:" + i2 + ",realData:" + tet.x(bArr2));
            if (i2 >= atomicInteger.get()) {
                byteArrayOutputStream.write(bArr2, 0, i2);
            } else {
                t5t.m(a6t.TAG, "wrong data length response data len:" + i2 + ",real data len:" + atomicInteger.get());
            }
        }
        countDownLatch.countDown();
    }

    public static /* synthetic */ void j(ByteArrayOutputStream byteArrayOutputStream, AtomicInteger atomicInteger, CountDownLatch countDownLatch, byte[] bArr) {
        t5t.d(a6t.TAG, "HMNFCProfile notify:" + tet.x(bArr));
        byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
        byte b2 = bArr[0];
        if (b2 == -103) {
            return;
        }
        if (b2 != -102) {
            byteArrayOutputStream.reset();
            countDownLatch.countDown();
            return;
        }
        atomicInteger.set(byteArrayOutputStream.size());
        int size = byteArrayOutputStream.size();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        t5t.m(a6t.TAG, "responseLen:" + size + ",responseData:" + tet.x(byteArray));
        int i = size - 3;
        byte[] bArr2 = new byte[i];
        if (byteArray[0] == 0) {
            System.arraycopy(byteArray, 3, bArr2, 0, i);
        }
        byteArrayOutputStream.reset();
        t5t.m(a6t.TAG, "realData:" + tet.x(bArr2));
        byteArrayOutputStream.write(bArr2, 0, i);
        countDownLatch.countDown();
    }

    public static /* synthetic */ void k(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, byte[] bArr) {
        boolean z = false;
        if (bArr != null && bArr.length >= 2 && (bArr[0] & 255) == 144 && (bArr[1] & 255) == 0) {
            z = true;
        }
        atomicBoolean.getAndSet(z);
        countDownLatch.countDown();
    }

    public static /* synthetic */ void l(AtomicReference atomicReference, CountDownLatch countDownLatch, byte[] bArr) {
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
            for (int i = 4; i < b4 + 4; i++) {
                sb.append(String.format("%02x", Byte.valueOf(bArr[i])));
            }
            hMNFCCardIdent.setAid(sb.toString());
            hMNFCCardStatus.setCardIdent(hMNFCCardIdent);
        }
        atomicReference.getAndSet(hMNFCCardStatus);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(byte[] bArr) {
        byte b2;
        t5t.m(a6t.TAG, "APDU notify:" + tet.x(bArr));
        w1t w1tVar = this.d;
        if (w1tVar != null && bArr != null && bArr.length == 2 && bArr[0] == -126 && (b2 = bArr[1]) != 0) {
            w1tVar.a(new HMNFCStatus(b2 & 255));
        }
        if (this.c != null) {
            this.c.e(bArr);
        }
    }

    public static /* synthetic */ void n(qe qeVar, CountDownLatch countDownLatch, byte[] bArr) {
        t5t.d(a6t.TAG, "notify:" + tet.x(bArr));
        qeVar.b(bArr);
        countDownLatch.countDown();
    }

    public int A() {
        byte[] bArrJ;
        qe qeVarC = c(new byte[]{1});
        if (qeVarC != null && (bArrJ = qeVarC.j()) != null && bArrJ.length == 2 && bArrJ[0] == -127) {
            return bArrJ[1] & 255;
        }
        return -1;
    }

    public int B() {
        byte[] bArrJ;
        qe qeVarC = c(new byte[]{2});
        if (qeVarC != null && (bArrJ = qeVarC.j()) != null && bArrJ.length == 2 && bArrJ[0] == -126) {
            return bArrJ[1] & 255;
        }
        return -1;
    }

    public boolean C() {
        qe qeVarC = c(new byte[]{28});
        if (qeVarC == null) {
            return true;
        }
        byte[] bArrJ = qeVarC.j();
        t5t.m(a6t.TAG, "getCRSCode data:" + tet.x(bArrJ));
        if (bArrJ == null || bArrJ.length < 2 || (bArrJ[0] & 255) != 156 || (bArrJ[1] & 255) != 0) {
            return true;
        }
        return !Arrays.equals(new byte[]{bArrJ[bArrJ.length - 2], bArrJ[bArrJ.length - 1]}, new byte[]{-112, 0});
    }

    public HMNFCCardInfo D() {
        byte[] bArr = {HMProSyncDataBaseProfile.DATA_TYPE_PAI};
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicReference atomicReference = new AtomicReference(null);
        o(new a(atomicBoolean, E(), atomicReference, countDownLatch));
        if (write(this.f30273b, bArr)) {
            try {
                countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                t5t.d(a6t.TAG, "await exception:" + e.getMessage());
            }
        }
        o(null);
        return (HMNFCCardInfo) atomicReference.get();
    }

    public final int E() {
        mm mmVar = this.e;
        if (mmVar == null) {
            return -1;
        }
        return mmVar.getF26991a();
    }

    public final boolean F() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f30273b;
        return bluetoothGattCharacteristic != null && (bluetoothGattCharacteristic.getProperties() & 2) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    public PasswordInteractionResponse G() {
        int i = 1;
        byte[] bArrJ = c(new byte[]{24, 1}).j();
        if (bArrJ.length < 2) {
            i = -1;
        } else {
            byte b2 = bArrJ[2];
            if (b2 == 0) {
                i = 0;
            } else if (b2 != 1) {
                if (b2 == 2) {
                    i = 2;
                } else {
                    i = 3;
                    if (b2 != 3) {
                        i = -1;
                    }
                }
            }
        }
        return new PasswordInteractionResponse(i);
    }

    public final mm H() {
        if (!F()) {
            qe qeVarC = c(new byte[]{112, 0, 1, 0});
            if (qeVarC.j() == null || qeVarC.j().length <= 0) {
                return null;
            }
            return mm.c.a(qeVarC.j());
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f30273b;
        if (bluetoothGattCharacteristic == null) {
            return null;
        }
        byte[] bArr = read(bluetoothGattCharacteristic);
        t5t.m(a6t.TAG, "versions:" + tet.x(bArr));
        if (bArr == null) {
            return null;
        }
        return mm.c.a(bArr);
    }

    public boolean I() {
        byte[] bArrJ = c(new byte[]{27}).j();
        t5t.m(a6t.TAG, "readWristAndPinState:" + tet.x(bArrJ));
        return bArrJ != null && bArrJ.length == 3 && bArrJ[2] == 0;
    }

    public boolean J() {
        return c(new byte[]{24, 4}).j()[1] == 4;
    }

    public final ApduResponse b(byte[] bArr, int i, byte b2, byte b3, final byte b4, final byte b5) {
        t5t.m(a6t.TAG, "sendData in");
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        t5t.m(a6t.TAG, "sendData origin:" + tet.x(bArr));
        byte[] bArrV = v(bArr, i);
        t5t.m(a6t.TAG, "sendData package:" + tet.x(bArrV));
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        o(new zh.b() { // from class: lct
            @Override // zh.b
            public final void e(byte[] bArr2) {
                pct.i(byteArrayOutputStream, b4, b5, atomicInteger, countDownLatch, bArr2);
            }
        });
        if (u(bArrV, b2, b3)) {
            try {
                countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                t5t.d(a6t.TAG, "latch await exception:" + e.getMessage());
            }
        }
        o(null);
        if (byteArrayOutputStream.size() == 0) {
            return null;
        }
        return new ApduResponse(byteArrayOutputStream.toByteArray(), atomicInteger.get());
    }

    public final qe c(byte[] bArr) {
        return h(bArr, 10000L);
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f30273b;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        unregisterNotification(bluetoothGattCharacteristic);
        return false;
    }

    public HMNFCCardStatus g(HMNFCCardConfig hMNFCCardConfig) {
        if (hMNFCCardConfig == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(15);
            byteArrayOutputStream.write(hMNFCCardConfig.getBytes());
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicReference atomicReference = new AtomicReference();
            o(new zh.b() { // from class: jct
                @Override // zh.b
                public final void e(byte[] bArr) {
                    pct.l(atomicReference, countDownLatch, bArr);
                }
            });
            if (write(this.f30273b, byteArrayOutputStream.toByteArray())) {
                countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            }
            o(null);
            return (HMNFCCardStatus) atomicReference.get();
        } catch (Exception e) {
            t5t.d(a6t.TAG, "Exception:" + e.getMessage());
            return null;
        }
    }

    public final qe h(byte[] bArr, long j) {
        t5t.d(a6t.TAG, "cmd:" + tet.x(bArr));
        final qe qeVar = new qe();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        o(new zh.b() { // from class: kct
            @Override // zh.b
            public final void e(byte[] bArr2) {
                pct.n(qeVar, countDownLatch, bArr2);
            }
        });
        if (write(this.f30273b, bArr)) {
            try {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                t5t.d(a6t.TAG, "await exception:" + e.getMessage());
            }
        }
        t5t.d(a6t.TAG, "result:" + qeVar);
        o(null);
        return qeVar;
    }

    @Override // defpackage.a6t
    public boolean init() {
        BluetoothGattService service = getService(a6t.UUID_SERVICE_MILI_SERVICE);
        if (service == null) {
            return false;
        }
        UUID uuid = h;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid);
        this.f30273b = characteristic;
        if (characteristic != null) {
            boolean zRegisterNotification = registerNotification(characteristic, new zh.b() { // from class: nct
                @Override // zh.b
                public final void e(byte[] bArr) {
                    this.f27799a.lambda$init$0(bArr);
                }
            });
            try {
                this.e = H();
            } catch (Exception unused) {
                t5t.d(a6t.TAG, "Parse nfc version failed");
            }
            return zRegisterNotification;
        }
        t5t.d(a6t.TAG, uuid + " is null!");
        return false;
    }

    public void m(w1t w1tVar) {
        this.d = w1tVar;
    }

    public final void o(zh.b bVar) {
        this.c = bVar;
    }

    public boolean p(HMAccessInfo hMAccessInfo) {
        if (hMAccessInfo == null) {
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int aidLen = hMAccessInfo.getAidLen();
            byte[] aid = hMAccessInfo.getAid();
            String name = hMAccessInfo.getName();
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

    public boolean q(HMAidInfo hMAidInfo) {
        if (hMAidInfo == null) {
            return false;
        }
        int aidLen = hMAidInfo.getAidLen();
        byte[] bArr = new byte[aidLen + 6];
        bArr[0] = 6;
        bArr[1] = 28;
        bArr[2] = 0;
        bArr[3] = (byte) hMAidInfo.getOp();
        bArr[4] = (byte) hMAidInfo.getType();
        bArr[5] = (byte) aidLen;
        if (aidLen > 0) {
            System.arraycopy(hMAidInfo.getAid(), 0, bArr, 6, aidLen);
        }
        return isSupportPatchWrite() && patchWrite(bArr, 2);
    }

    public boolean r(HMNFCCardType hMNFCCardType) {
        qe qeVarC;
        if (E() < 4 || (qeVarC = c(new byte[]{16, 1, hMNFCCardType.getValue(), 0, 3, 0})) == null) {
            return false;
        }
        byte[] bArrJ = qeVarC.j();
        t5t.m(a6t.TAG, "updateEmptyCardList data:" + tet.x(bArrJ));
        return bArrJ != null && bArrJ.length >= 2 && (bArrJ[0] & 255) == 144 && (bArrJ[1] & 255) == 0;
    }

    public boolean s(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {24, 5, 0, 8, 0, 3};
        byte[] bArr2 = new byte[6];
        for (int i = 0; i < 6; i++) {
            bArr2[i] = (byte) str.charAt(i);
        }
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(bArr2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return c(byteArrayOutputStream.toByteArray()).j()[1] == 5;
    }

    public boolean t(List<? extends HMNFCCardIdent> list, HMNFCCardType hMNFCCardType) {
        if (list == null || list.size() == 0) {
            boolean zR = r(hMNFCCardType);
            t5t.m(a6t.TAG, "updateResult:" + zR);
            return zR;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write((byte) list.size());
            Iterator<? extends HMNFCCardIdent> it = list.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(it.next().getBytes());
            }
            byteArrayOutputStream.write(tet.s((short) byteArrayOutputStream.toByteArray().length));
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            o(new zh.b() { // from class: oct
                @Override // zh.b
                public final void e(byte[] bArr) {
                    pct.k(atomicBoolean, countDownLatch, bArr);
                }
            });
            if (u(byteArrayOutputStream.toByteArray(), (byte) 17, (byte) 16)) {
                countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
            }
            o(null);
            return atomicBoolean.get();
        } catch (Exception e) {
            t5t.d(a6t.TAG, "updateCardList exception:" + e.getMessage());
            return false;
        }
    }

    public final boolean u(byte[] bArr, byte b2, byte b3) {
        int length = bArr.length;
        boolean zWrite = true;
        int i = 0;
        while (length > 19) {
            byte[] bArr2 = new byte[20];
            bArr2[0] = b2;
            System.arraycopy(bArr, i * 19, bArr2, 1, 19);
            t5t.m(a6t.TAG, "cmdC:" + tet.x(bArr2));
            zWrite = write(this.f30273b, bArr2);
            if (!zWrite) {
                break;
            }
            length -= 19;
            i++;
        }
        if (!zWrite || length <= 0) {
            return zWrite;
        }
        byte[] bArr3 = new byte[length + 1];
        bArr3[0] = b3;
        System.arraycopy(bArr, i * 19, bArr3, 1, length);
        t5t.m(a6t.TAG, "cmdX:" + tet.x(bArr3));
        return write(this.f30273b, bArr3);
    }

    public final byte[] v(byte[] bArr, int i) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 2];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        bArr2[length] = (byte) (i & 255);
        bArr2[length + 1] = (byte) ((i >> 8) & 255);
        return bArr2;
    }

    public final HMNFCCardInfo w(byte[] bArr, int i) {
        if (bArr == null || bArr.length < 2) {
            return null;
        }
        HMNFCCardInfo hMNFCCardInfo = new HMNFCCardInfo();
        hMNFCCardInfo.setVersion(i);
        if (bArr.length == 2) {
            hMNFCCardInfo.setHeader(bArr[0] & 255);
            hMNFCCardInfo.setResult(bArr[1] & 255);
            return hMNFCCardInfo;
        }
        hMNFCCardInfo.setHeader(bArr[0] & 255);
        hMNFCCardInfo.setResult(bArr[1] & 255);
        hMNFCCardInfo.setAtqa(String.format("%02x%02x", Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3])));
        hMNFCCardInfo.setSak(String.format("%02x", Byte.valueOf(bArr[4])));
        int i2 = bArr[5] & 255;
        hMNFCCardInfo.setUidLen(i2);
        int i3 = i2 + 5;
        int length = bArr.length - 1;
        if (i2 > 0 && i3 <= length) {
            StringBuilder sb = new StringBuilder();
            for (int i4 = 6; i4 <= i3; i4++) {
                sb.append(String.format("%02x", Byte.valueOf(bArr[i4])));
            }
            hMNFCCardInfo.setUid(sb.toString());
            if (i >= 3) {
                hMNFCCardInfo.setBlockNum(((bArr[i2 + 7] & 255) << 8) | (bArr[i2 + 6] & 255));
            }
        }
        return hMNFCCardInfo;
    }

    public ApduResponse x(byte[] bArr, int i) {
        return b(bArr, i, (byte) 21, (byte) 20, (byte) -107, (byte) -108);
    }

    public ApduResponse y(byte[] bArr) {
        t5t.m(a6t.TAG, "sendData origin:" + tet.x(bArr));
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        o(new zh.b() { // from class: mct
            @Override // zh.b
            public final void e(byte[] bArr2) {
                pct.j(byteArrayOutputStream, atomicInteger, countDownLatch, bArr2);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream2.write(bArr);
        } catch (Exception e) {
            t5t.d(a6t.TAG, "send error exception:" + e.getMessage());
        }
        if (u(byteArrayOutputStream2.toByteArray(), (byte) 25, (byte) 26)) {
            try {
                countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                t5t.d(a6t.TAG, "latch await exception:" + e2.getMessage());
            }
        }
        o(null);
        if (byteArrayOutputStream.size() == 0) {
            return null;
        }
        return new ApduResponse(byteArrayOutputStream.toByteArray(), atomicInteger.get());
    }

    public final HMNFCBlockInfo z(byte[] bArr) {
        if (bArr == null || bArr.length <= 3) {
            return null;
        }
        HMNFCBlockInfo hMNFCBlockInfo = new HMNFCBlockInfo();
        hMNFCBlockInfo.setHeader(bArr[0] & 255);
        hMNFCBlockInfo.setFlag(bArr[1] & 255);
        hMNFCBlockInfo.setIndex(((bArr[3] & 255) << 8) | (bArr[2] & 255));
        byte[] bArr2 = new byte[bArr.length - 4];
        System.arraycopy(bArr, 4, bArr2, 0, bArr.length - 4);
        hMNFCBlockInfo.setData(bArr2);
        return hMNFCBlockInfo;
    }

    public ApduResponse c(byte[] bArr, int i, boolean z) {
        byte b2 = z ? (byte) 6 : (byte) 4;
        byte b3 = z ? (byte) 5 : (byte) 3;
        return b(bArr, i, b2, b3, (byte) (b2 | (-128)), (byte) (b3 | (-128)));
    }
}
