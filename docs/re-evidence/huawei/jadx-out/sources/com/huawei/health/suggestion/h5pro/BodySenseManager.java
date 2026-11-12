package com.huawei.health.suggestion.h5pro;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.protobuf.CourseStateProto;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.IReportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.hcg;
import defpackage.hdo;
import defpackage.hkt;
import defpackage.iem;
import defpackage.ifz;
import defpackage.nsp;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class BodySenseManager {
    private static final String TAG = "BodySenseManager";
    private int mCurrentHeartRate;
    private ScheduledExecutorService mExecutor;
    private hdo mHeartRateHandler;
    private boolean mIsConnectFitnessLinkDevice;
    private IReportDataCallback mReportDataCallback;
    private long mReportTime;
    private IBaseResponseCallback mResponseCallback;

    private BodySenseManager() {
        this.mReportDataCallback = new IReportDataCallback() { // from class: com.huawei.health.suggestion.h5pro.BodySenseManager.1
            @Override // com.huawei.hwfoundationmodel.trackmodel.IReportDataCallback
            public void onChange(nsp nspVar) {
                if (nspVar == null) {
                    LogUtil.e(BodySenseManager.TAG, "report data null.");
                    return;
                }
                CoachController.c().c(nspVar);
                if (BodySenseManager.this.mResponseCallback != null) {
                    BodySenseManager.this.mResponseCallback.a(0, nspVar);
                }
                if (BodySenseManager.this.mHeartRateHandler != null) {
                    BodySenseManager.this.mHeartRateHandler.pushHeartRate(nspVar.j(), nspVar.m());
                }
                BodySenseManager.this.mCurrentHeartRate = nspVar.j();
                BodySenseManager.this.mReportTime = nspVar.m();
            }

            @Override // com.huawei.hwfoundationmodel.trackmodel.IReportDataCallback
            public void onResult() {
                LogUtil.a(BodySenseManager.TAG, "report data onResult.");
            }
        };
    }

    /* JADX INFO: loaded from: classes31.dex */
    static class SingletonHolder {
        private static final BodySenseManager INSTANCE = new BodySenseManager();

        private SingletonHolder() {
        }
    }

    public static final BodySenseManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void setResponseCallback(IBaseResponseCallback iBaseResponseCallback) {
        this.mResponseCallback = iBaseResponseCallback;
    }

    public void startFitnessLink() {
        boolean zE = iem.e(BaseApplication.b().getApplicationContext(), ifz.a());
        boolean zB = hkt.b();
        LogUtil.a(TAG, "startFitnessLink connect wear device:", Boolean.valueOf(zE), Boolean.valueOf(zB));
        boolean z = zE && zB;
        this.mIsConnectFitnessLinkDevice = z;
        if (!z) {
            LogUtil.a(TAG, "no need fitness link.");
            return;
        }
        this.mHeartRateHandler = new hdo();
        CoachController.c().d(hkt.b());
        CoachController.c().a(hkt.c());
        CoachController.c().e(OldToNewMotionPath.SPORT_TYPE_OTHER_SPORT);
        CoachController.c().e();
        hcg.e().a(this.mReportDataCallback);
        CoachController.c().a(0L);
        initInteractorSchedule();
        CoachController.c().d(CoachController.StatusSource.APP, 1);
    }

    public void pauseFitnessLink() {
        if (!this.mIsConnectFitnessLinkDevice) {
            LogUtil.a(TAG, "no need fitness link.");
        } else {
            CoachController.c().d(CoachController.StatusSource.APP, 2);
        }
    }

    public void resumeFitnessLink() {
        if (!this.mIsConnectFitnessLinkDevice) {
            LogUtil.a(TAG, "no need fitness link.");
        } else {
            CoachController.c().d(CoachController.StatusSource.APP, 1);
        }
    }

    public void stopFitnessLink() {
        if (!this.mIsConnectFitnessLinkDevice) {
            LogUtil.a(TAG, "no need fitness link.");
            return;
        }
        CoachController.c().d(CoachController.StatusSource.APP, 3);
        hcg.e().c();
        CoachController.c().c(CoachController.StatusSource.NEW_LINK_WEAR);
        this.mResponseCallback = null;
        this.mCurrentHeartRate = 0;
        this.mReportTime = 0L;
        ScheduledExecutorService scheduledExecutorService = this.mExecutor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.mExecutor = null;
        }
    }

    public boolean isConnectFitnessLinkDevice() {
        return this.mIsConnectFitnessLinkDevice;
    }

    public void chapterForward(int i) {
        CoachController.c().c(CoachController.StatusSource.APP, i);
    }

    public void chapterBackward(int i) {
        CoachController.c().e(CoachController.StatusSource.APP, i);
    }

    public void interChapterBreak(int i, int i2, int i3) {
        CourseStateProto.CourseState.Builder builderNewBuilder = CourseStateProto.CourseState.newBuilder();
        builderNewBuilder.setCourseIndex(i);
        builderNewBuilder.setCourseSleepTotalTime(i2);
        builderNewBuilder.setCourseSleepTime(i3);
        CoachController.c().c(CoachController.StatusSource.APP, builderNewBuilder.build());
    }

    protected void initInteractorSchedule() {
        if (this.mExecutor == null) {
            this.mExecutor = Executors.newSingleThreadScheduledExecutor();
        }
        this.mExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.BodySenseManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1220xded85d25();
            }
        }, 500L, 1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: lambda$initInteractorSchedule$0$com-huawei-health-suggestion-h5pro-BodySenseManager, reason: not valid java name */
    /* synthetic */ void m1220xded85d25() {
        int iB = CoachController.c().b();
        if (iB == 1) {
            CoachController.c().d(CoachController.c().d() + 1);
            hdo hdoVar = this.mHeartRateHandler;
            if (hdoVar != null) {
                hdoVar.saveHeartRate();
            }
            CoachController.c().a(CoachController.c().b(iB));
        }
        if (iB == 2) {
            this.mHeartRateHandler.e(true);
        }
    }

    public List<HeartRateData> getHeartRateList() {
        hdo hdoVar = this.mHeartRateHandler;
        if (hdoVar != null) {
            return hdoVar.getHeartRateList();
        }
        return Collections.EMPTY_LIST;
    }

    public List<HeartRateData> getInvalidHeartRateList() {
        hdo hdoVar = this.mHeartRateHandler;
        if (hdoVar != null) {
            return hdoVar.getInvalidHeartRateList();
        }
        return Collections.EMPTY_LIST;
    }

    public int getCurrentHeartRate() {
        return this.mCurrentHeartRate;
    }

    public long getReportTime() {
        return this.mReportTime;
    }

    public void updateCalories(float f) {
        CoachController.c().a(f);
    }

    public void updateActiveCalories(float f) {
        CoachController.c().d(f);
    }
}
