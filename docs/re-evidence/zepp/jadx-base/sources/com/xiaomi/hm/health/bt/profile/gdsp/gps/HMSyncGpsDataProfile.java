package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes18.dex */
public class HMSyncGpsDataProfile extends HMProSyncDataBaseProfile {
    private int n;
    private final String o;
    private HMDeviceSource p;

    public HMSyncGpsDataProfile(GattPeripheral gattPeripheral, HMDeviceSource source) {
        super(gattPeripheral);
        this.n = -1;
        this.o = "HMSyncGpsDataProfile";
        this.p = source;
    }

    private boolean s() {
        return HMDeviceFeature.TIMEX_DEVICE.contains(this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(AtomicInteger atomicInteger, ISportDetailDataParser iSportDetailDataParser, SportDetail sportDetail, SportSummary sportSummary, AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi("HMSyncGpsDataProfile", "detail data:" + GattUtils.bytesToHexString(bArr));
        int i = bArr[0] & 255;
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        atomicInteger.getAndSet(atomicInteger.get() + length);
        iSportDetailDataParser.parser(sportDetail, bArr2, sportSummary.o);
        int i2 = this.n;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            atomicBoolean.getAndSet(false);
        } else {
            Debug.fi("HMSyncGpsDataProfile", "missing package!!!");
            atomicBoolean.getAndSet(true);
            waitingNotify();
        }
        this.n = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi("HMSyncGpsDataProfile", "detail control:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(AtomicBoolean atomicBoolean, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        Debug.fi("HMSyncGpsDataProfile", "summary data:" + GattUtils.bytesToHexString(bArr));
        int i = bArr[0] & 255;
        int i2 = this.n;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
            } catch (Exception e) {
                Debug.fi("HMSyncGpsDataProfile", "exception:" + e.getMessage());
                atomicBoolean.getAndSet(true);
                waitingNotify();
            }
        } else {
            Debug.fi("HMSyncGpsDataProfile", "missing package!!!");
            atomicBoolean.getAndSet(true);
            waitingNotify();
        }
        this.n = i;
        atomicBoolean.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi("HMSyncGpsDataProfile", "summary control:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        waitingNotify();
    }

    public SportDetail fetchDetailData(final SportSummary summary, int size) {
        this.n = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final SportDetail sportDetail = new SportDetail();
        final ISportDetailDataParser iSportDetailDataParserCreate = SportDetailParserFactory.INSTANCE.create(summary, s());
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: qj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.t(atomicInteger, iSportDetailDataParserCreate, sportDetail, summary, atomicBoolean, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: nj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.u(atomicBoolean, bArr);
            }
        });
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        if (atomicInteger.get() == size) {
            return sportDetail;
        }
        Debug.fi("HMSyncGpsDataProfile", "rSize:" + atomicInteger.get() + ",hSize:" + size);
        return null;
    }

    public SportSummary fetchSummaryData(int targetSize) {
        this.n = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: pj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.v(atomicBoolean, byteArrayOutputStream, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: oj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.w(atomicBoolean, bArr);
            }
        });
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        if (targetSize == byteArrayOutputStream.size()) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i = (byteArray[0] & 255) | ((byteArray[1] & 255) << 8);
            byte[] bArr = new byte[byteArray.length - 2];
            System.arraycopy(byteArray, 2, bArr, 0, byteArray.length - 2);
            return SportSummaryParserFactory.INSTANCE.createSummaryParser(s(), i).parser(bArr);
        }
        Debug.fi("HMSyncGpsDataProfile", "get size is not match target size<" + targetSize + "," + byteArrayOutputStream.size() + SearchCriteria.GT);
        return null;
    }

    public DataHeader getDetailHeader(Calendar startTime) {
        return getGpsHeader(startTime, (byte) 6);
    }

    public DataHeader getSummaryHeader(Calendar startTime) {
        return getGpsHeader(startTime, s() ? (byte) 14 : (byte) 5);
    }
}
