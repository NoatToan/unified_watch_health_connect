package com.huawei.health.provider;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwhealthdatamgr.sportrecordingstrategy.SportsRecordingBean;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import defpackage.nkb;
import defpackage.nkx;
import defpackage.nle;
import defpackage.nln;
import defpackage.ntx;
import health.compact.a.Services;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes8.dex */
public final class HealthFaSportTrackHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HealthFaSportTrackHelper f8637c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ISportTrackCallback f8638a;
    private SportsRecordingBean f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f8636b = new Object();
    private static ReadWriteLock d = new ReentrantReadWriteLock();
    private CountDownLatch e = null;
    private WorkoutRecord i = null;
    private MotionPathSimplify j = null;
    private volatile boolean h = false;
    private IBaseResponseCallback o = new IBaseResponseCallback() { // from class: com.huawei.health.provider.HealthFaSportTrackHelper.1
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            MotionPathSimplify motionPathSimplify;
            HealthFaSportTrackHelper.this.c();
            if (i != 0) {
                HealthFaSportTrackHelper.this.c();
                return;
            }
            if (i != 0) {
                LogUtil.j("HealthFaSportTrackHelper", "mSportTrackCallback errorCode :", Integer.valueOf(i));
                return;
            }
            if (obj instanceof MotionPathSimplify) {
                motionPathSimplify = (MotionPathSimplify) obj;
                LogUtil.a("HealthFaSportTrackHelper", "mSportTrackCallback simplifyData :", HiJsonUtil.d(motionPathSimplify));
            } else {
                motionPathSimplify = null;
            }
            if (motionPathSimplify == null) {
                LogUtil.e("HealthFaSportTrackHelper", "mSportTrackCallback trackData is null");
                HealthFaSportTrackHelper.this.c();
                return;
            }
            RelativeSportData relativeSportDataRequestFatherSportItem = motionPathSimplify.requestFatherSportItem();
            if (relativeSportDataRequestFatherSportItem == null) {
                LogUtil.e("HealthFaSportTrackHelper", "Father data is null ");
                HealthFaSportTrackHelper.this.c(motionPathSimplify);
                HealthFaSportTrackHelper.this.c();
            } else {
                LogUtil.a("HealthFaSportTrackHelper", "StartTime = ", Long.valueOf(relativeSportDataRequestFatherSportItem.getStartTime()), " EndTime = ", Long.valueOf(relativeSportDataRequestFatherSportItem.getEndTime()));
                nkx.e().b(relativeSportDataRequestFatherSportItem.getStartTime(), relativeSportDataRequestFatherSportItem.getEndTime(), HealthFaSportTrackHelper.this.m);
            }
        }
    };
    private IBaseResponseCallback m = new IBaseResponseCallback() { // from class: com.huawei.health.provider.HealthFaSportTrackHelper.2
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, final Object obj) {
            if (i != 0) {
                LogUtil.j("HealthFaSportTrackHelper", "mTrackForTriathlonCallback callback fail and errCode is ", Integer.valueOf(i));
                HealthFaSportTrackHelper.this.c();
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.provider.HealthFaSportTrackHelper.2.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Object obj2 = obj;
                        MotionPathSimplify motionPathSimplify = obj2 instanceof MotionPathSimplify ? (MotionPathSimplify) obj2 : null;
                        if (motionPathSimplify != null) {
                            HealthFaSportTrackHelper.this.c(motionPathSimplify);
                            HealthFaSportTrackHelper.this.c();
                        } else {
                            LogUtil.e("HealthFaSportTrackHelper", "mTrackForTriathlonCallback trackData is null");
                            HealthFaSportTrackHelper.this.c();
                        }
                    }
                });
            }
        }
    };
    private IBaseResponseCallback g = new IBaseResponseCallback() { // from class: com.huawei.health.provider.HealthFaSportTrackHelper.3
        /* JADX WARN: Code duplicated, block: B:10:0x001e  */
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            WorkoutRecord workoutRecord;
            if (i != 0 || obj == null) {
                LogUtil.j("HealthFaSportTrackHelper", "mFitnessCallback failed objData may be none.");
                HealthFaSportTrackHelper.this.c();
                return;
            }
            if (njy.b(obj, WorkoutRecord.class)) {
                List list = (List) obj;
                if (njy.b(list)) {
                    workoutRecord = (WorkoutRecord) list.get(0);
                } else {
                    workoutRecord = null;
                }
            } else {
                workoutRecord = null;
            }
            if (obj instanceof WorkoutRecord) {
                workoutRecord = (WorkoutRecord) obj;
            }
            HealthFaSportTrackHelper.d.writeLock().lock();
            HealthFaSportTrackHelper.this.i = workoutRecord;
            HealthFaSportTrackHelper.d.writeLock().unlock();
            HealthFaSportTrackHelper.this.c();
        }
    };

    public interface ISportTrackCallback {
        void onResponse(Object obj);
    }

    private HealthFaSportTrackHelper() {
    }

    public static HealthFaSportTrackHelper a() {
        HealthFaSportTrackHelper healthFaSportTrackHelper;
        synchronized (f8636b) {
            if (f8637c == null) {
                f8637c = new HealthFaSportTrackHelper();
            }
            healthFaSportTrackHelper = f8637c;
        }
        return healthFaSportTrackHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            LogUtil.a("HealthFaSportTrackHelper", "mCountDownLatch count = ", Long.valueOf(this.e.getCount()));
            if (this.e.getCount() <= 0) {
                b();
            }
        }
    }

    private void b() {
        if (this.f8638a == null) {
            LogUtil.j("HealthFaSportTrackHelper", "dealRefreshSportCardData mCallback is null.");
            return;
        }
        WorkoutRecord workoutRecord = this.i;
        boolean z = (workoutRecord == null || workoutRecord.acquireExerciseTime() == 0) ? false : true;
        if (!this.h && !z) {
            this.f8638a.onResponse(null);
            return;
        }
        if (!z) {
            this.f8638a.onResponse(this.f);
        } else if (!this.h) {
            this.f8638a.onResponse(d());
        } else {
            this.f8638a.onResponse(this.j.requestStartTime() > this.i.startTime() ? this.f : d());
        }
    }

    private SportsRecordingBean d() {
        LogUtil.a("HealthFaSportTrackHelper", "getFitnessResult enter");
        WorkoutRecord workoutRecord = this.i;
        if (workoutRecord == null) {
            LogUtil.j("HealthFaSportTrackHelper", "getFitnessResult mLastWorkoutRecord is null.");
            return null;
        }
        if (workoutRecord.acquireExerciseTime() == 0) {
            LogUtil.j("HealthFaSportTrackHelper", "getFitnessResult acquireExerciseTime == 0");
            return null;
        }
        if (!this.i.isLinkWear()) {
            LogUtil.j("HealthFaSportTrackHelper", "getFitnessResult isLinkWear is false");
            return null;
        }
        return new nle().c(this.i);
    }

    public void e(ISportTrackCallback iSportTrackCallback) {
        LogUtil.a("HealthFaSportTrackHelper", "queryLastSportData enter");
        if (iSportTrackCallback == null) {
            LogUtil.j("HealthFaSportTrackHelper", "queryLastSportData mCallback is null.");
            return;
        }
        this.f8638a = iSportTrackCallback;
        this.h = false;
        this.e = new CountDownLatch(3);
        nkb.d().c(this.o);
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j("HealthFaSportTrackHelper", "queryLastSportData recordApi is null.");
        } else {
            recordApi.acquireDetailFitnessRecords(new ntx.d().b(0L).d(System.currentTimeMillis()).a(1).a(), this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.j("HealthFaSportTrackHelper", "sportTrackQueryEnd trackData is null.");
            return;
        }
        if (motionPathSimplify.requestTrackType() != 4 && motionPathSimplify.requestTrackType() != 5) {
            LogUtil.j("HealthFaSportTrackHelper", "sportTrackQueryEnd invalid trackData.");
            return;
        }
        d.writeLock().lock();
        this.j = motionPathSimplify;
        this.f = new nln().a(motionPathSimplify.requestChiefSportDataType(), motionPathSimplify.requestSportType()).e(motionPathSimplify);
        this.h = true;
        d.writeLock().unlock();
    }
}
