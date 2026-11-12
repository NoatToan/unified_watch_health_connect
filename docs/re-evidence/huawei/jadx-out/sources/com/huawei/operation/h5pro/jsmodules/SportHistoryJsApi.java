package com.huawei.operation.h5pro.jsmodules;

import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSportType;
import defpackage.lsy;
import defpackage.qnj;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public class SportHistoryJsApi extends JsBaseModule {
    public static final float MAX_PROGRESS = 1.0f;
    private static final float PROGRESS_SHOW_TIME = 1000.0f;
    private static final long SLEEP_TIME = 10;
    private static final String TAG = "SportHistoryJsApi";

    @JavascriptInterface
    public void getMergeTrackSportType(long j) {
        LogUtil.a(TAG, "getMergeTrackSportType run");
        getCallback(j).onResponse(0, new int[]{FitnessSportType.HW_FITNESS_SPORT_ALL, 227, 258, 259, OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE, 264});
    }

    @JavascriptInterface
    public void cacheMergeTrackData(final long j, String str) {
        ReleaseLogUtil.c(TAG, "cacheMergeTrackData callbackId: ", Long.valueOf(j), ", tid: ", Long.valueOf(Thread.currentThread().getId()));
        final IBaseResponseCallback callback = getCallback(j);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final float[] fArr = {0.0f};
        lsy.a(new Runnable() { // from class: com.huawei.operation.h5pro.jsmodules.SportHistoryJsApi$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1583x47231f2b(jElapsedRealtime, fArr, callback, j);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$cacheMergeTrackData$0$com-huawei-operation-h5pro-jsmodules-SportHistoryJsApi, reason: not valid java name */
    /* synthetic */ void m1583x47231f2b(long j, float[] fArr, IBaseResponseCallback iBaseResponseCallback, long j2) {
        while (true) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            float f = jElapsedRealtime / 1000.0f;
            float fMin = Math.min(f, 1.0f);
            fArr[0] = fMin;
            iBaseResponseCallback.onResponse(0, Float.valueOf(fMin));
            if (qnj.a(fArr[0], 1.0f)) {
                onCompleteCallback(j2, "save success", 0);
                LogUtil.a(TAG, "saveMergeTrackProgress[0]: ", Float.valueOf(fArr[0]), ", progress: ", Float.valueOf(f), ", elapsedTime: ", Long.valueOf(jElapsedRealtime));
                return;
            }
            SystemClock.sleep(10L);
        }
    }

    private IBaseResponseCallback getCallback(final long j) {
        return new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.SportHistoryJsApi$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1584x3425732e(j, i, obj);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$getCallback$1$com-huawei-operation-h5pro-jsmodules-SportHistoryJsApi, reason: not valid java name */
    /* synthetic */ void m1584x3425732e(long j, int i, Object obj) {
        if (i == 0) {
            onSuccessCallback(j, obj);
        } else {
            onFailureCallback(j, "", i);
        }
    }
}
