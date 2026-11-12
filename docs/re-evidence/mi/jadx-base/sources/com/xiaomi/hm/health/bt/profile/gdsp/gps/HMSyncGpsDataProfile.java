package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.f4s;
import defpackage.jet;
import defpackage.qd;
import defpackage.t5t;
import defpackage.tet;
import defpackage.zh;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class HMSyncGpsDataProfile extends HMProSyncDataBaseProfile {
    private final String TAG;
    private int mLastIndex;
    private qd source;

    public HMSyncGpsDataProfile(jet jetVar, qd qdVar) {
        super(jetVar);
        this.mLastIndex = -1;
        this.TAG = "HMSyncGpsDataProfile";
        this.source = qdVar;
    }

    private boolean isTimexDevice() {
        return HMDeviceFeature.TIMEX_DEVICE.contains(this.source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchDetailData$2(AtomicInteger atomicInteger, ISportDetailDataParser iSportDetailDataParser, SportDetail sportDetail, SportSummary sportSummary, AtomicBoolean atomicBoolean, byte[] bArr) {
        t5t.d("HMSyncGpsDataProfile", "detail data:" + tet.x(bArr));
        int i = bArr[0] & 255;
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        atomicInteger.getAndSet(atomicInteger.get() + length);
        iSportDetailDataParser.parser(sportDetail, bArr2, sportSummary.startTime);
        int i2 = this.mLastIndex;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            atomicBoolean.getAndSet(false);
        } else {
            t5t.d("HMSyncGpsDataProfile", "missing package!!!");
            atomicBoolean.getAndSet(true);
            waitingNotify();
        }
        this.mLastIndex = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchDetailData$3(AtomicBoolean atomicBoolean, byte[] bArr) {
        t5t.d("HMSyncGpsDataProfile", "detail control:" + tet.x(bArr));
        atomicBoolean.set(true);
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchSummaryData$0(AtomicBoolean atomicBoolean, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        t5t.d("HMSyncGpsDataProfile", "summary data:" + tet.x(bArr));
        int i = bArr[0] & 255;
        int i2 = this.mLastIndex;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
            } catch (Exception e) {
                t5t.d("HMSyncGpsDataProfile", "exception:" + e.getMessage());
                atomicBoolean.getAndSet(true);
                waitingNotify();
            }
        } else {
            t5t.d("HMSyncGpsDataProfile", "missing package!!!");
            atomicBoolean.getAndSet(true);
            waitingNotify();
        }
        this.mLastIndex = i;
        atomicBoolean.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchSummaryData$1(AtomicBoolean atomicBoolean, byte[] bArr) {
        t5t.d("HMSyncGpsDataProfile", "summary control:" + tet.x(bArr));
        atomicBoolean.set(true);
        waitingNotify();
    }

    public SportDetail fetchDetailData(final SportSummary sportSummary, int i) {
        this.mLastIndex = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final SportDetail sportDetail = new SportDetail();
        final ISportDetailDataParser iSportDetailDataParserCreate = SportDetailParserFactory.INSTANCE.create(sportSummary, isTimexDevice());
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        setDataCallback(new zh.b() { // from class: kdb
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f23749a.lambda$fetchDetailData$2(atomicInteger, iSportDetailDataParserCreate, sportDetail, sportSummary, atomicBoolean, bArr);
            }
        });
        setControlCallback(new zh.b() { // from class: ldb
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f24934a.lambda$fetchDetailData$3(atomicBoolean, bArr);
            }
        });
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(ErrorCode.ERROR_CODE_INVALID_PARAM);
            }
        }
        if (atomicInteger.get() == i) {
            return sportDetail;
        }
        t5t.d("HMSyncGpsDataProfile", "rSize:" + atomicInteger.get() + ",hSize:" + i);
        return null;
    }

    public SportSummary fetchSummaryData(int i) {
        this.mLastIndex = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new zh.b() { // from class: idb
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f21020a.lambda$fetchSummaryData$0(atomicBoolean, byteArrayOutputStream, bArr);
            }
        });
        setControlCallback(new zh.b() { // from class: jdb
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f22666a.lambda$fetchSummaryData$1(atomicBoolean, bArr);
            }
        });
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(ErrorCode.ERROR_CODE_INVALID_PARAM);
            }
        }
        if (i == byteArrayOutputStream.size()) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i2 = (byteArray[0] & 255) | ((byteArray[1] & 255) << 8);
            byte[] bArr = new byte[byteArray.length - 2];
            System.arraycopy(byteArray, 2, bArr, 0, byteArray.length - 2);
            return SportSummaryParserFactory.INSTANCE.createSummaryParser(isTimexDevice(), i2).parser(bArr);
        }
        t5t.d("HMSyncGpsDataProfile", "get size is not match target size<" + i + "," + byteArrayOutputStream.size() + ">");
        return null;
    }

    public f4s getDetailHeader(Calendar calendar) {
        return getGpsHeader(calendar, (byte) 6);
    }

    public f4s getSummaryHeader(Calendar calendar) {
        return getGpsHeader(calendar, isTimexDevice() ? HMProSyncDataBaseProfile.DATA_TYPE_COACHING : (byte) 5);
    }
}
