package defpackage;

import android.os.Message;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.utils.Utils;
import com.huawei.syncmgr.SyncOption;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mpe {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42112c = 0;
    private mpg f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42111b = new Object();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42110a = new Object();
    private static final Object e = new Object();

    public mpe(mpg mpgVar) {
        this.f = mpgVar;
    }

    public void a(byte[] bArr, DeviceInfo deviceInfo) {
        if (bArr.length < 3) {
            LogUtil.j("HwBasicSyncHelper", "dataInfos length is less than 3.");
        } else {
            cpl.d("HwBasicSyncHelper", bArr, "getResult(): ");
            b(bArr, deviceInfo);
        }
    }

    private void b(byte[] bArr, DeviceInfo deviceInfo) {
        byte b2 = bArr[1];
        if (b2 == 3) {
            mik.b("HwBasicSyncHelper", bArr[0], b2);
            l(bArr, deviceInfo);
            return;
        }
        if (b2 == 4) {
            h(bArr, deviceInfo);
            return;
        }
        if (b2 == 5) {
            f(bArr, deviceInfo);
            return;
        }
        if (b2 == 31) {
            c(bArr, deviceInfo);
            return;
        }
        if (b2 != 32) {
            switch (b2) {
                case 10:
                    j(bArr, deviceInfo);
                    break;
                case 11:
                    i(bArr, deviceInfo);
                    break;
                case 12:
                    n(bArr, deviceInfo);
                    break;
                case 13:
                    g(bArr, deviceInfo);
                    break;
                case 14:
                    a(bArr, 14);
                    break;
                case 15:
                    e(bArr, deviceInfo);
                    break;
                default:
                    cpl.d("HwBasicSyncHelper", bArr, "command id is other value", Byte.valueOf(b2), "; dataInfos is ");
                    break;
            }
            return;
        }
        d(bArr, deviceInfo);
    }

    public void e(Message message) {
        if (this.f == null) {
            return;
        }
        if (message == null) {
            LogUtil.j("HwBasicSyncHelper", "processFitnessManagerHandler message is null");
            return;
        }
        DeviceInfo deviceInfo = message.obj instanceof DeviceInfo ? (DeviceInfo) message.obj : null;
        LogUtil.a("HwBasicSyncHelper", "handleMessage message ", Integer.valueOf(message.what));
        a(message.what, deviceInfo);
    }

    private void a(int i, DeviceInfo deviceInfo) {
        if (i == 0) {
            LogUtil.e("HwBasicSyncHelper", "sync detail timeout");
            this.f.a(300001, deviceInfo);
            this.f.c(0, deviceInfo);
        } else if (i == 1003) {
            LogUtil.a("HwBasicSyncHelper", "syncFitnessDetailData");
            this.f.a(false, deviceInfo, (IBaseResponseCallback) null);
        } else if (i == 4) {
            LogUtil.a("HwBasicSyncHelper", "Sync today timeout message");
            d(300001, deviceInfo);
            this.f.c(4, deviceInfo);
        } else if (i != 5) {
            LogUtil.j("HwBasicSyncHelper", "unknown message type");
        } else {
            LogUtil.a("HwBasicSyncHelper", "Save fitness data timeout message");
            this.f.b(300001, deviceInfo);
        }
    }

    public void e(byte[] bArr, DeviceInfo deviceInfo) {
        int iA;
        LogUtil.a("HwBasicSyncHelper", "onResponse receive bluetooth data", eeq.e(bArr));
        try {
            iA = mjb.a(bArr);
        } catch (eeu e2) {
            LogUtil.e("HwBasicSyncHelper", "processDeviceDataReport Exception ", ExceptionUtils.c(e2));
            iA = 0;
        }
        LogUtil.a("HwBasicSyncHelper", "processDeviceDataReport action :", Integer.valueOf(iA));
        if (mpz.d()) {
            if (this.f42112c != 6) {
                mpz.c(deviceInfo.getDeviceIdentify(), 6);
                this.f42112c = 6;
            }
        } else if (this.f42112c != 1) {
            mpz.c(deviceInfo.getDeviceIdentify(), 1);
            this.f42112c = 1;
        }
        if (iA == 1) {
            a(deviceInfo);
            return;
        }
        if (iA == 2) {
            mpr.c();
            if (CommonUtil.ap() || CommonUtil.ao()) {
                this.f.a(false, deviceInfo, new IBaseResponseCallback() { // from class: mph
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        mpe.a(i, obj);
                    }
                });
                return;
            } else {
                this.f.a(false, deviceInfo, (IBaseResponseCallback) null);
                return;
            }
        }
        if (iA == 3) {
            if (CommonUtil.ap() || CommonUtil.ao()) {
                this.f.a(false, deviceInfo, new IBaseResponseCallback() { // from class: mpk
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        mpe.c(i, obj);
                    }
                });
                return;
            } else {
                this.f.a(false, deviceInfo, (IBaseResponseCallback) null);
                return;
            }
        }
        LogUtil.a("HwBasicSyncHelper", "processDeviceDataReport dataInfos is other action");
        c(iA, deviceInfo, bArr);
    }

    static /* synthetic */ void a(int i, Object obj) {
        LogUtil.a("HwBasicSyncHelper", "ACTION_SYNC_DETAIL_MASK syncDeviceWorkoutRecordInfo");
        HwExerciseAdviceManager.getInstance().syncDeviceWorkoutRecordInfo();
    }

    static /* synthetic */ void c(int i, Object obj) {
        LogUtil.a("HwBasicSyncHelper", "ACTION_SYNC_DETAIL_MASK|ACTION_SYNC_TOTAL_MASK syncDeviceWorkoutRecordInfo");
        HwExerciseAdviceManager.getInstance().syncDeviceWorkoutRecordInfo();
    }

    private void c(int i, final DeviceInfo deviceInfo, byte[] bArr) {
        if (i == 4) {
            LogUtil.a("HwBasicSyncHelper", "5.7.15 normal trigger, action is DeviceReportThreshold.ACTION_SYNC_CORE_SLEEP_MASK");
            SyncOption syncOptionE = mhu.e(bArr);
            if (syncOptionE == null) {
                ReleaseLogUtil.e("R_HwBasicSyncHelper", "5.7.15 not sync sleep");
                return;
            } else {
                ltm.c(myl.b()).d(syncOptionE, new IBaseResponseCallback() { // from class: mpe.2
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        LogUtil.a("HwBasicSyncHelper", "processDeviceDataReportOther sync core sleep onResponse errorCode :", Integer.valueOf(i2));
                        if (i2 == 0) {
                            mpe.this.f.a(false, deviceInfo, new IBaseResponseCallback() { // from class: mpe.2.5
                                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                                /* JADX INFO: renamed from: onResponse */
                                public void a(int i3, Object obj2) {
                                    LogUtil.a("HwBasicSyncHelper", "phoneService to syncFitnessDetailData, errorCode=", Integer.valueOf(i3));
                                    if (i3 == 0) {
                                        Utils.syncCloudAfterInsert();
                                    }
                                }
                            });
                        }
                    }
                });
                return;
            }
        }
        if (i == 8) {
            LogUtil.a("HwBasicSyncHelper", "action is DeviceReportThreshold.ACTION_SYNC_WORKOUT_MASK");
            if (deviceInfo != null) {
                LogUtil.a("HwBasicSyncHelper", "5.7.15 notify to sync workout data.");
                a(deviceInfo);
                HwExerciseAdviceManager.getInstance().syncDeviceWorkoutRecordInfo();
                return;
            }
            return;
        }
        LogUtil.j("HwBasicSyncHelper", "unknown action");
    }

    private void a(DeviceInfo deviceInfo) {
        this.f.d(new IBaseResponseCallback() { // from class: mpe.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("R_HwBasicSyncHelper", "syncFitnessTodayData onResponse errorCode:", Integer.valueOf(i));
            }
        }, deviceInfo);
    }

    public void e(IBaseResponseCallback iBaseResponseCallback, boolean z, DeviceInfo deviceInfo) {
        synchronized (f42111b) {
            LogUtil.a("HwBasicSyncHelper", "syncFitnessDetailDataRun enter thread isNeedSyncWork:", Boolean.valueOf(z));
            if (deviceInfo != null && deviceInfo.getDeviceConnectState() == 2) {
                Boolean bool = false;
                if (this.f.p.containsKey(deviceInfo.getDeviceIdentify())) {
                    bool = this.f.p.get(deviceInfo.getDeviceIdentify());
                }
                if (bool != null && bool.booleanValue()) {
                    LogUtil.a("HwBasicSyncHelper", "syncFitnessDetailData data syncing");
                    iBaseResponseCallback.a(300002, null);
                    this.f.c(10009, iBaseResponseCallback);
                    if (this.f.c()) {
                        mpz.g("com.huawei.health.fitness_detail_sync_success");
                    }
                    return;
                }
                this.f.p.put(deviceInfo.getDeviceIdentify(), true);
                this.f.ad.c(1);
                a(0, 240000L, deviceInfo);
                this.f.c(10009, iBaseResponseCallback);
                this.f.a();
                mpg mpgVar = this.f;
                mpgVar.ac = mpz.a(mpgVar);
                this.f.j = (int) (System.currentTimeMillis() / 1000);
                long jC = mpz.c(this.f.j);
                if (this.f.ad.a(this.f) == -1) {
                    mpd mpdVar = this.f.ad;
                    mpg mpgVar2 = this.f;
                    mpdVar.c(mpgVar2, mpz.c(mpgVar2.ac));
                }
                if (mpz.d(deviceInfo) != 3) {
                    c(deviceInfo);
                } else {
                    d(jC);
                }
                return;
            }
            LogUtil.j("HwBasicSyncHelper", "syncFitnessDetailDataRun get device info error");
            iBaseResponseCallback.a(300004, null);
        }
    }

    private void l(byte[] bArr, DeviceInfo deviceInfo) {
        int i;
        ReleaseLogUtil.d("R_HwBasicSyncHelper", "processGetTodayFitnessData Complete");
        LogUtil.a("HwBasicSyncHelper", "onResponse receive bluetooth data", eeq.e(bArr));
        d(4);
        int iD = 201000;
        try {
            i = 0;
            if (bArr[2] == 127) {
                iD = mix.d(bArr);
                lng.c(iD);
                ReleaseLogUtil.e("R_HwBasicSyncHelper", "processGetTodayFitnessData return errorCode:", Integer.valueOf(iD));
                this.f.c(iD, deviceInfo);
                i = iD;
            } else {
                this.f.f42117b.a(mpv.b(bArr), deviceInfo);
            }
        } catch (eeu unused) {
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            ReleaseLogUtil.a("R_HwBasicSyncHelper", "processGetTodayFitnessData Exception.");
            this.f.c(-1, deviceInfo);
        }
        d(i, deviceInfo);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    private void h(byte[] bArr, DeviceInfo deviceInfo) {
        eeu e2;
        LogUtil.a("HwBasicSyncHelper", "processGetRealTimeFrameCount");
        int i = 201000;
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                try {
                    LogUtil.a("HwBasicSyncHelper", "procGetRealTimeFrameCount return errorCode:", Integer.valueOf(iD));
                    this.f.b(300007, deviceInfo);
                    this.f.c(iD, deviceInfo);
                    return;
                } catch (eeu e3) {
                    e2 = e3;
                    i = iD;
                    LogUtil.e("HwBasicSyncHelper", "processGetRealTimeFrameCount Exception ", ExceptionUtils.c(e2));
                    this.f.c(-1, deviceInfo);
                    if (this.f.y != null) {
                        LogUtil.a("HwBasicSyncHelper", "processGetRealTimeFrameCount RealTimeFramePageList is not null");
                        mpg mpgVar = this.f;
                        mpgVar.b(mpgVar.y, deviceInfo);
                        return;
                    }
                    this.f.a(i, deviceInfo);
                }
            }
            this.f.y = mpv.e(bArr);
            if (this.f.y != null) {
                LogUtil.a("HwBasicSyncHelper", "processGetRealTimeFrameCount RealTimeFramePageList is not null");
                mpg mpgVar2 = this.f;
                mpgVar2.b(mpgVar2.y, deviceInfo);
                return;
            }
            this.f.a(i, deviceInfo);
        } catch (eeu e4) {
            e2 = e4;
        }
    }

    private void f(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicSyncHelper", "processGetRealTimeCompressedData");
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                LogUtil.e("HwBasicSyncHelper", "processGetRealTimeCompressedData return errorCode:", Integer.valueOf(iD));
                this.f.b(300007, deviceInfo);
                this.f.c(iD, deviceInfo);
            } else {
                this.f.e(mpv.c(bArr));
            }
        } catch (eeu e2) {
            LogUtil.e("HwBasicSyncHelper", "processGetRealTimeCompressedData Exception ", ExceptionUtils.c(e2));
            this.f.c(-1, deviceInfo);
        }
        this.f.k++;
        if (this.f.k < this.f.l) {
            mpr.c(this.f.w.get(this.f.k).intValue(), deviceInfo);
        } else {
            this.f.a(0, deviceInfo);
        }
    }

    private void j(byte[] bArr, DeviceInfo deviceInfo) {
        this.f.v = 0;
        this.f.i = 0;
        LogUtil.a("HwBasicSyncHelper", "processGetSamplePointFrameCount");
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                LogUtil.e("HwBasicSyncHelper", "processGetSamplePointFrameCount return errorCode:", Integer.valueOf(iD));
                lng.c(iD);
                this.f.b(300007, deviceInfo);
                this.f.c(iD, deviceInfo);
                return;
            }
            this.f.v = mpv.f(bArr);
            ReleaseLogUtil.d("R_HwBasicSyncHelper", "7-10 count : ", Integer.valueOf(this.f.v));
            if (this.f.v > 0) {
                LogUtil.a("HwBasicSyncHelper", "processGetSamplePointFrameCount get sample frame index :", Integer.valueOf(this.f.i));
                mpr.a(this.f.i, deviceInfo);
                this.f.i++;
                return;
            }
            b(deviceInfo);
        } catch (eeu e2) {
            LogUtil.e("HwBasicSyncHelper", "processGetSamplePointFrameCount Exception ", ExceptionUtils.c(e2));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            this.f.c(-1, deviceInfo);
        }
    }

    private void d(long j) {
        if (this.f.ac < this.f.j) {
            if (this.f.ac < j) {
                this.f.ac = j;
            }
        } else if (this.f.ac >= this.f.j && this.f.ac - this.f.j <= 300) {
            LogUtil.a("HwBasicSyncHelper", "syncFitnessDetailData lastSync time is not correct.");
            mpg mpgVar = this.f;
            mpgVar.ac = mpgVar.j - 61;
        } else if (this.f.ac - this.f.j > 300) {
            LogUtil.a("HwBasicSyncHelper", "syncFitnessDetailData lastSync time is not correct and need write back.");
            mpg mpgVar2 = this.f;
            mpgVar2.ac = mpgVar2.j - 61;
            mpz.a(this.f.ac, this.f);
        } else {
            LogUtil.j("HwBasicSyncHelper", "processFitnessDetailOtherDataFormat unknown");
        }
        mpr.c(this.f.ac, this.f.j);
    }

    private void c(DeviceInfo deviceInfo) {
        if (this.f.j - this.f.ac > k.b.l || this.f.ac == 0) {
            mpg mpgVar = this.f;
            mpgVar.ac = mpz.c(mpgVar.j - k.b.l);
            mpz.a(this.f.ac, this.f);
        } else if (this.f.ac >= this.f.j && this.f.ac - this.f.j <= 300) {
            LogUtil.a("HwBasicSyncHelper", "processFitnessDetailSpecialDataFormat lastSync time is not correct.");
            mpg mpgVar2 = this.f;
            mpgVar2.ac = mpgVar2.j - 61;
        } else if (this.f.ac - this.f.j > 300) {
            LogUtil.a("HwBasicSyncHelper", "processFitnessDetailSpecialDataFormat lastSync time is not correct and need write back.");
            mpg mpgVar3 = this.f;
            mpgVar3.ac = mpgVar3.j - 61;
            mpz.a(this.f.ac, this.f);
        } else {
            LogUtil.j("HwBasicSyncHelper", "processFitnessDetailSpecialDataFormat unknown");
        }
        mpr.c(this.f.ac, this.f.j, deviceInfo);
    }

    private void i(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicSyncHelper", "processGetSamplePointFrame");
        synchronized (d) {
            try {
                if (bArr[2] == 127) {
                    int iD = mix.d(bArr);
                    lng.c(iD);
                    LogUtil.e("HwBasicSyncHelper", "processGetSamplePointFrame return errorCode:", Integer.valueOf(iD));
                    this.f.b(300007, deviceInfo);
                    this.f.c(iD, deviceInfo);
                    return;
                }
                this.f.u.add(mpv.j(bArr));
                if (this.f.i < this.f.v) {
                    mpr.a(this.f.i, deviceInfo);
                    this.f.i++;
                } else {
                    if (this.f.ad.b() == 2) {
                        mpd mpdVar = this.f.ad;
                        mpg mpgVar = this.f;
                        mpdVar.c(mpgVar, mpgVar.x);
                    }
                    b(deviceInfo);
                }
            } catch (eeu e2) {
                LogUtil.e("HwBasicSyncHelper", "processGetSamplePointFrame Exception ", ExceptionUtils.c(e2));
                lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
                this.f.c(-1, deviceInfo);
            }
        }
    }

    private void n(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicSyncHelper", "processGetSamplePointFrameCount");
        this.f.ab = 0;
        this.f.h = 0;
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                lng.c(iD);
                LogUtil.e("HwBasicSyncHelper", "processGetStatusFrameCount return errorCode:", Integer.valueOf(iD));
                this.f.b(300007, deviceInfo);
                this.f.c(iD, deviceInfo);
                return;
            }
            this.f.ab = mpv.i(bArr);
            ReleaseLogUtil.d("R_HwBasicSyncHelper", "7-12 count : ", Integer.valueOf(this.f.ab));
            if (this.f.ab > 0) {
                LogUtil.a("HwBasicSyncHelper", "processGetStatusFrameCount get status frame index :", Integer.valueOf(this.f.h));
                mpr.d(this.f.h, deviceInfo);
                this.f.h++;
                return;
            }
            this.f.a(0, deviceInfo);
        } catch (eeu e2) {
            LogUtil.e("HwBasicSyncHelper", "processGetStatusFrameCount Exception ", ExceptionUtils.c(e2));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            this.f.c(-1, deviceInfo);
        }
    }

    private void g(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicSyncHelper", "processGetStatusFrame Complete");
        synchronized (f42110a) {
            int i = 0;
            try {
                if (bArr[2] == 127) {
                    int iD = mix.d(bArr);
                    lng.c(iD);
                    LogUtil.e("HwBasicSyncHelper", "processGetStatusFrame return errorCode:", Integer.valueOf(iD));
                    this.f.b(300007, deviceInfo);
                    this.f.c(iD, deviceInfo);
                    return;
                }
                this.f.z.add(mpv.h(bArr));
                if (this.f.h < this.f.ab) {
                    mpr.d(this.f.h, deviceInfo);
                    this.f.h++;
                } else {
                    this.f.a(i, deviceInfo);
                    if (this.f.ad.b() == 2) {
                        this.f.ad.a(this.f, mpz.c(System.currentTimeMillis() / 1000));
                    }
                }
            } catch (eeu e2) {
                LogUtil.e("HwBasicSyncHelper", "processGetStatusFrame Exception ", ExceptionUtils.c(e2));
                lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
                this.f.c(-1, deviceInfo);
                i = 201000;
            }
        }
    }

    private void c(byte[] bArr, DeviceInfo deviceInfo) {
        this.f.g = 0;
        this.f.d = 0;
        LogUtil.a("HwBasicSyncHelper", "processGetDesFrameCount enter processGetDesFrameCount");
        try {
            if (bArr[2] == 127) {
                LogUtil.e("HwBasicSyncHelper", "processGetDesFrameCount return errorCode:", Integer.valueOf(mix.d(bArr)));
                this.f.e(300007, deviceInfo);
                return;
            }
            this.f.g = mpv.a(bArr);
            ReleaseLogUtil.d("R_HwBasicSyncHelper", "7-31 count : ", Integer.valueOf(this.f.g));
            if (this.f.g > 0) {
                LogUtil.a("HwBasicSyncHelper", "processGetDesFrameCount get sample frame index :", Integer.valueOf(this.f.i), "desFrameCount Greater than zero :", Integer.valueOf(this.f.g));
                mpr.e(this.f.d, deviceInfo);
                this.f.d++;
                return;
            }
            LogUtil.j("HwBasicSyncHelper", "desFrameCount Less than zero :", Integer.valueOf(this.f.g));
            this.f.e(0, deviceInfo);
        } catch (eeu e2) {
            LogUtil.e("HwBasicSyncHelper", "processGetDesFrameCount Exception ", ExceptionUtils.c(e2));
        }
    }

    private void d(byte[] bArr, DeviceInfo deviceInfo) {
        synchronized (e) {
            try {
                if (bArr[2] == 127) {
                    this.f.e(300007, deviceInfo);
                    return;
                }
                this.f.f.add(mpv.d(bArr));
                if (this.f.d < this.f.g) {
                    mpr.e(this.f.d, deviceInfo);
                    this.f.d++;
                } else {
                    this.f.t = true;
                    this.f.f42117b.b(this.f.f, deviceInfo);
                }
            } catch (eeu e2) {
                LogUtil.e("HwBasicSyncHelper", "processGetDesFrame Exception ", ExceptionUtils.c(e2));
                xjt.x("processGetDesFrame Exception");
            }
        }
    }

    public void b(int i, DeviceInfo deviceInfo) {
        if (i == 1) {
            synchronized (mpg.e) {
                this.f.r = 1;
                this.f.ad.c(1);
                if ((deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) && this.f.q) {
                    if (CommonUtil.bu()) {
                        LogUtil.a("HwBasicSyncHelper", "syncFitnessDetailData data syncing");
                        mpj.e();
                    }
                    return;
                } else if (this.f.s && this.f.q) {
                    if (CommonUtil.bu()) {
                        LogUtil.a("HwBasicSyncHelper", "syncFitnessDetailData data syncing");
                        mpj.e();
                    }
                    return;
                } else {
                    this.f.s = true;
                    a(0, 240000L, deviceInfo);
                    e();
                    a();
                    return;
                }
            }
        }
        d();
    }

    private void a() {
        long jC = mpf.c(this.f);
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        long j = iCurrentTimeMillis;
        long jC2 = mpz.c(j);
        if (mpf.b(this.f) == -1) {
            mpf.b(this.f, mpz.c(jC));
        }
        if (jC < j) {
            if (jC < jC2) {
                jC = jC2;
            }
        } else if (jC >= j && jC - j <= 300) {
            LogUtil.a("HwBasicSyncHelper", "syncFitnessDetailData lastSync time is not correct.");
            jC = iCurrentTimeMillis - 61;
        } else if (jC - j > 300) {
            LogUtil.a("HwBasicSyncHelper", "syncFitnessDetailData lastSync time is not correct and need write back.");
            jC = iCurrentTimeMillis - 61;
            mpf.c(this.f, jC);
        } else {
            LogUtil.j("HwBasicSyncHelper", "syncIntensiveOneDayOldSolutionData unknown");
        }
        LogUtil.a("HwBasicSyncHelper", "mIntensiveStartTime2:", Long.valueOf(jC), ",mIntensiveEndTime", Integer.valueOf(iCurrentTimeMillis));
        mpr.d(jC, j, 0);
    }

    private void d() {
        synchronized (mpg.e) {
            this.f.r = 7;
            this.f.ad.c(2);
            long jB = mpf.b(this.f);
            long jCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (jB > mpz.c(jCurrentTimeMillis) - 14400) {
                LogUtil.a("HwBasicSyncHelper", "status stage two already ok");
                this.f.s = false;
                return;
            }
            if (jCurrentTimeMillis - jB > k.b.l) {
                jB = mpz.c(jCurrentTimeMillis - k.b.l);
            }
            this.f.x = jCurrentTimeMillis;
            LogUtil.a("HwBasicSyncHelper", "syncIntensiveData2 enter lastStatusTime:", Long.valueOf(jB), "endTime", Long.valueOf(jCurrentTimeMillis));
            mpr.d(jB, jCurrentTimeMillis, 0);
        }
    }

    public void b(DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicSyncHelper", "syncStatusPoint current stage is ", Integer.valueOf(this.f.ad.b()));
        if (deviceInfo != null && this.f.ad.b() == 2) {
            d(deviceInfo);
            return;
        }
        long jE = mpf.e(this.f);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        LogUtil.a("HwBasicSyncHelper", "syncStatusPoint");
        long jC = mpz.c(jCurrentTimeMillis) - 14400;
        if (this.f.ad.c(this.f) == -1) {
            this.f.ad.a(this.f, mpz.c(jE));
        }
        if (jE < jCurrentTimeMillis) {
            if (jE < jC) {
                jE = jC;
            }
        } else if (jE >= jCurrentTimeMillis && jE - jCurrentTimeMillis <= 300) {
            LogUtil.e("HwBasicSyncHelper", "syncStatusPoint lastStatusTime is not correct.");
            jE = jCurrentTimeMillis - 61;
        } else if (jE - jCurrentTimeMillis > 300) {
            LogUtil.e("HwBasicSyncHelper", "syncStatusPoint lastStatusTime is not correct and need write back.");
            jE = jCurrentTimeMillis - 61;
            mpf.a(this.f, jE);
        } else {
            LogUtil.j("HwBasicSyncHelper", "syncStatusPoint unknown");
            xjt.x("syncStatusPoint unknown");
        }
        mpr.b(jE, jCurrentTimeMillis);
    }

    private void d(DeviceInfo deviceInfo) {
        long jC;
        this.f.ad.c(2);
        long jC2 = this.f.ad.c(this.f);
        long jCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        LogUtil.a("HwBasicSyncHelper", "lastStageSecondTime :", Long.valueOf(jC2));
        if (jC2 > mpz.c(jCurrentTimeMillis) - 14400 && jC2 <= mpz.c(jCurrentTimeMillis)) {
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("HwBasicSyncHelper", "lastStageSecondTime is between 20:00 in 24:00");
        }
        if (CommonUtil.ap()) {
            jC = mpz.c(jCurrentTimeMillis);
        } else {
            jC = mpz.c(jCurrentTimeMillis) - 14400;
        }
        if (jC2 > jC) {
            LogUtil.a("HwBasicSyncHelper", "status stage two already ok");
            this.f.p.remove(deviceInfo.getDeviceIdentify());
        } else {
            if (jCurrentTimeMillis - jC2 > k.b.l) {
                jC2 = mpz.c(jCurrentTimeMillis - k.b.l);
            }
            mpr.b(jC2, jCurrentTimeMillis);
        }
    }

    private void a(byte[] bArr, int i) {
        LogUtil.a("HwBasicSyncHelper", "processSetCmdResult Complete command :", Integer.valueOf(i));
        int iD = 201000;
        try {
            if (bArr[2] == 127) {
                iD = mix.d(bArr);
                LogUtil.e("HwBasicSyncHelper", "processSetCmdResult return errorCode:", Integer.valueOf(iD));
            }
        } catch (eeu e2) {
            LogUtil.e("HwBasicSyncHelper", "processSetCmdResult Exception ", ExceptionUtils.c(e2));
        }
        d(i, iD);
    }

    private void d(int i, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwBasicSyncHelper", "doSyncTodayComplete deviceInfo is null");
            return;
        }
        LogUtil.a("HwBasicSyncHelper", "doSyncTodayComplete errorCode", Integer.valueOf(i));
        this.f.p.remove(deviceInfo.getDeviceIdentify());
        d(10008, i);
        mpz.g("com.huawei.bone.action.FITNESS_DATA_TODAY_SYNC");
    }

    private void d(int i, int i2) {
        LogUtil.a("HwBasicSyncHelper", "processCallback callback command:", Integer.valueOf(i), "errorCode:", Integer.valueOf(i2));
        synchronized (mpg.f42115c) {
            b(i, i2);
        }
    }

    private void b(int i, int i2) {
        List<IBaseResponseCallback> list = this.f.f42116a.get(Integer.valueOf(i));
        if (list != null) {
            int i3 = 0;
            while (list.size() > 0) {
                IBaseResponseCallback iBaseResponseCallback = list.get(i3);
                if (iBaseResponseCallback != null) {
                    iBaseResponseCallback.a(i2, null);
                    list.remove(i3);
                    return;
                } else {
                    list.remove(i3);
                    i3++;
                }
            }
        }
    }

    private void d(int i) {
        if (this.f.m != null) {
            if (this.f.m.hasMessages(i)) {
                this.f.m.removeMessages(i);
                return;
            }
            return;
        }
        LogUtil.j("HwBasicSyncHelper", "fitnessManagerRemoveMessage mHwBasicSyncManagerHandler is null");
    }

    public void a(int i, long j, DeviceInfo deviceInfo) {
        if (this.f.m != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.obj = deviceInfo;
            this.f.m.sendMessageDelayed(messageObtain, j);
            return;
        }
        LogUtil.j("HwBasicSyncHelper", "fitnessManagerSendMessageDelay mHwBasicSyncManagerHandler is null");
    }

    private void e() {
        this.f.f.clear();
    }
}
