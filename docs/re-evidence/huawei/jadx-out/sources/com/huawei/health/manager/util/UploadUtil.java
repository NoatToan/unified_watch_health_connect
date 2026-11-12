package com.huawei.health.manager.util;

import android.content.Context;
import android.os.Handler;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import defpackage.lsl;
import defpackage.npt;
import health.compact.a.LogAnonymous;
import health.compact.a.StepsRecord;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.security.SecureRandom;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class UploadUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f8154a;
    private Context d;
    private String i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StepsRecord f8156c = null;
    private WriteDbRecord e = new WriteDbRecord();
    private int h = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8155b = 0;

    public static class UploadStepData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8160c;
        int d;
        int e;
    }

    public UploadUtil(Context context, String str, Handler handler) {
        this.d = null;
        this.i = null;
        this.f8154a = null;
        if (context == null || handler == null) {
            LogUtil.a("Step_UploadUtil", "context or handler is null");
            return;
        }
        if (str == null || "".equals(str)) {
            LogUtil.a("Step_UploadUtil", "uuid is null");
            return;
        }
        synchronized (this) {
            this.i = str;
        }
        this.d = context;
        this.f8154a = handler;
    }

    public boolean b(int i) {
        int i2 = this.h;
        if (i2 == -1) {
            this.h = i;
            return true;
        }
        if (i - i2 <= 200) {
            return false;
        }
        this.h = i;
        return true;
    }

    public boolean c(int i) {
        int i2 = this.f8155b + i;
        this.f8155b = i2;
        if (i2 <= 200) {
            return false;
        }
        this.f8155b = 0;
        return true;
    }

    public void b(int i, int i2, int i3, int i4, int i5) {
        UploadStepData uploadStepData = new UploadStepData();
        uploadStepData.d = i;
        uploadStepData.e = i2;
        uploadStepData.f8160c = i3;
        uploadStepData.f8159b = i4;
        uploadStepData.f8158a = i5;
        a(uploadStepData, System.currentTimeMillis());
    }

    public void a(UploadStepData uploadStepData, long j) {
        if (uploadStepData == null) {
            LogUtil.j("Step_UploadUtil", "uploadStepData is null.");
            return;
        }
        ReleaseLogUtil.d("Step_UploadUtil", npt.d("uploadStaticsToDB totalSteps = ", Integer.valueOf(uploadStepData.d), "deviceStep = ", Integer.valueOf(uploadStepData.e), " Floor = ", Integer.valueOf(uploadStepData.f8159b), " Distance = ", Integer.valueOf(uploadStepData.f8158a), " startTime = ", Long.valueOf(j)));
        StepsRecord stepsRecord = new StepsRecord();
        stepsRecord.f = uploadStepData.d;
        stepsRecord.f36649c = uploadStepData.f8160c;
        stepsRecord.e = uploadStepData.f8159b;
        stepsRecord.f36647a = uploadStepData.f8158a;
        if (!this.e.b(j, stepsRecord)) {
            LogUtil.j("Step_UploadUtil", "uploadStaticsToDB the same");
            return;
        }
        this.e.c(j, uploadStepData.d, uploadStepData.f8160c, uploadStepData.f8159b, uploadStepData.f8158a);
        ArrayList arrayList = new ArrayList(16);
        if (uploadStepData.d > 0) {
            arrayList.add(d(uploadStepData.d, 40002, j));
        }
        if (uploadStepData.e > 0) {
            arrayList.add(d(uploadStepData.e, 901, j));
        }
        if (uploadStepData.f8160c > 0) {
            arrayList.add(d(uploadStepData.f8160c, 40003, j));
        }
        if (uploadStepData.f8159b > 0) {
            arrayList.add(d(uploadStepData.f8159b, SmartMsgConstant.MSG_TYPE_RIDE_USER, j));
        }
        if (uploadStepData.f8158a > 0) {
            arrayList.add(d(uploadStepData.f8158a, 40004, j));
        }
        if (arrayList.size() > 0) {
            HiHealthManager.d(this.d).insertHiHealthData(HiHealthHelper.b(arrayList), new MyStaticsInsertCallback());
        }
    }

    private HiHealthData d(int i, int i2, long j) {
        synchronized (this) {
            HiHealthData hiHealthDataB = HiHealthHelper.b(i, i2, this.i);
            if (hiHealthDataB == null) {
                LogUtil.j("Step_UploadUtil", "addUploadData hiHealthData is null.");
                return null;
            }
            if (i2 == 901) {
                hiHealthDataB.setStartTime(lsl.r(j));
                hiHealthDataB.setEndTime(lsl.c(j));
            } else {
                hiHealthDataB.setStartTime(j);
            }
            return hiHealthDataB;
        }
    }

    static class MyStaticsInsertCallback implements HiDataOperateListener {
        private MyStaticsInsertCallback() {
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            ReleaseLogUtil.d("Step_UploadUtil", "uploadStaticsToDb() onResult type = ", Integer.valueOf(i));
            if (i == 0) {
                LogUtil.a("Step_UploadUtil", "uploadStaticsToDb no error.");
            } else {
                LogUtil.a("Step_UploadUtil", "uploadStaticsToDb have error.");
            }
        }
    }

    public void b(String str) {
        synchronized (this) {
            this.i = str;
        }
    }

    public void a(StepsRecord stepsRecord) {
        this.f8156c = stepsRecord;
    }

    public void d(long j) {
        ReleaseLogUtil.d("Step_UploadUtil", "recognized next day,oldDayTimestamp:", Long.valueOf(j));
        a(j, this.f8156c);
    }

    private void a(final long j, StepsRecord stepsRecord) {
        if (j == -1 || j == 0) {
            LogUtil.j("Step_UploadUtil", "oldDayTimestamp equal -1 or 0");
            return;
        }
        if (stepsRecord == null) {
            LogUtil.j("Step_UploadUtil", "oldDayStepsRecord is null");
            return;
        }
        StepsRecord stepsRecord2 = new StepsRecord();
        stepsRecord2.a(stepsRecord);
        if (!this.e.b(j, stepsRecord2)) {
            ReleaseLogUtil.d("Step_UploadUtil", "Upload nextDay refused for same,step:", LogAnonymous.d(stepsRecord2.f), " floor:", Integer.valueOf(stepsRecord2.e), " distance:", LogAnonymous.d(stepsRecord2.f36647a), " startTime:", Long.valueOf(j));
            return;
        }
        if (lsl.c(j, System.currentTimeMillis())) {
            LogUtil.j("Step_UploadUtil", "mTimestamp:", Long.valueOf(j), " isSameDay as:", Long.valueOf(System.currentTimeMillis()), " nextDay call error,pls check!!!");
            return;
        }
        int iNextInt = new SecureRandom().nextInt(300) * 1000;
        ReleaseLogUtil.d("Step_UploadUtil", "Upload nextDay machine delay mills:", Integer.valueOf(iNextInt), " step:", LogAnonymous.d(stepsRecord2.f), "deviceStep:", LogAnonymous.d(stepsRecord2.f36648b), " floor:", Integer.valueOf(stepsRecord2.e), " distance:", LogAnonymous.d(stepsRecord2.f36647a), " startTime:", Long.valueOf(j));
        final UploadStepData uploadStepData = new UploadStepData();
        uploadStepData.d = stepsRecord2.f;
        uploadStepData.e = stepsRecord2.f36648b;
        uploadStepData.f8160c = stepsRecord2.f36649c;
        uploadStepData.f8159b = stepsRecord2.e;
        uploadStepData.f8158a = stepsRecord2.f36647a;
        Handler handler = this.f8154a;
        if (handler == null) {
            LogUtil.j("Step_UploadUtil", "mHandler is null");
        } else {
            handler.postDelayed(new Runnable() { // from class: com.huawei.health.manager.util.UploadUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    UploadUtil.this.a(uploadStepData, j);
                }
            }, iNextInt);
        }
    }

    static class WriteDbRecord {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f8161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private StepsRecord f8162c;

        private WriteDbRecord() {
        }

        public void c(long j, int i, int i2, int i3, int i4) {
            this.f8161b = j;
            if (this.f8162c == null) {
                this.f8162c = new StepsRecord();
            }
            this.f8162c.f = i;
            this.f8162c.f36649c = i2;
            this.f8162c.e = i3;
            this.f8162c.f36647a = i4;
        }

        public boolean b(long j, StepsRecord stepsRecord) {
            long j2 = this.f8161b;
            if (j2 == 0 || this.f8162c == null || !lsl.c(j2, j)) {
                return true;
            }
            return !this.f8162c.d(stepsRecord);
        }
    }
}
