package com.huawei.hms.findnetwork.sdk;

import android.content.Context;
import android.util.Pair;
import androidx.core.content.ContextCompat;
import com.huawei.hiar.ARCamera;
import com.huawei.hiar.ARConfigBase;
import com.huawei.hiar.AREnginesApk;
import com.huawei.hiar.ARFrame;
import com.huawei.hiar.ARSession;
import com.huawei.hiar.ARTrackable;
import com.huawei.hiar.ARWorldTrackingConfig;
import com.huawei.hms.findnetwork.comm.util.ErrorCode;
import com.huawei.hms.findnetwork.threadpool.ThreadExec;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0423a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ARSession f13225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ARTrackable.TrackingState f13226b;

    /* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.a$a, reason: collision with other inner class name */
    public static final abstract class AbstractC0112a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0423a f13227a = new C0423a();
    }

    public static C0423a c() {
        return AbstractC0112a.f13227a;
    }

    public final int a(Context context) {
        if (context == null) {
            HmsFindSDKLog.e("ArEngineHelper", "context is null.");
            return ErrorCode.CODE_PARAMETER_INVALID;
        }
        if (ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") != 0) {
            HmsFindSDKLog.e("ArEngineHelper", "android.permission.CAMERA not granted.");
            return ErrorCode.CODE_NO_CAMERA_PERMISSION;
        }
        if (AREnginesApk.isAREngineApkReady(context)) {
            return 0;
        }
        HmsFindSDKLog.e("ArEngineHelper", "AR Engine app not installed.");
        return ErrorCode.CODE_AR_ENGINE_APP_NOT_INSTALLED;
    }

    public Pair b() {
        ARFrame aRFrameUpdate;
        synchronized (this) {
            ARSession aRSession = this.f13225a;
            int i = ErrorCode.CODE_UNKNOWN_ERROR;
            if (aRSession == null) {
                HmsFindSDKLog.i("ArEngineHelper", "ArSession is null.");
                return new Pair(Integer.valueOf(ErrorCode.CODE_UNKNOWN_ERROR), null);
            }
            try {
                aRFrameUpdate = aRSession.update();
            } catch (Throwable th) {
                HmsFindSDKLog.e("ArEngineHelper", "ArSession.update exception:" + th.getMessage());
                aRFrameUpdate = null;
            }
            if (aRFrameUpdate == null) {
                HmsFindSDKLog.e("ArEngineHelper", "ARFrame is null.");
                return new Pair(Integer.valueOf(ErrorCode.CODE_UNKNOWN_ERROR), null);
            }
            ARCamera camera = aRFrameUpdate.getCamera();
            if (camera == null) {
                HmsFindSDKLog.e("ArEngineHelper", "ARCamera is null.");
                return new Pair(Integer.valueOf(ErrorCode.CODE_UNKNOWN_ERROR), null);
            }
            ARTrackable.TrackingState trackingState = camera.getTrackingState();
            this.f13226b = trackingState;
            if (trackingState == ARTrackable.TrackingState.TRACKING) {
                HmsFindSDKLog.i("ArEngineHelper", "TrackingState.TRACKING");
                i = 0;
            } else if (trackingState == ARTrackable.TrackingState.PAUSED) {
                HmsFindSDKLog.w("ArEngineHelper", "TrackingState.PAUSED");
                i = ErrorCode.CODE_AR_ENVIRONMENT_NOT_SATISFIED;
            } else {
                HmsFindSDKLog.w("ArEngineHelper", trackingState == ARTrackable.TrackingState.STOPPED ? "TrackingState.STOPPED" : "TrackingState.UNKNOWN_STATE.");
            }
            return new Pair(Integer.valueOf(i), camera.getPose());
        }
    }

    public ARTrackable.TrackingState d() {
        return this.f13226b;
    }

    public void a() {
        synchronized (this) {
            if (this.f13225a == null) {
                return;
            }
            HmsFindSDKLog.i("ArEngineHelper", "deInitArEngine");
            this.f13225a.pause();
            this.f13225a.stop();
            HmsFindSDKLog.i("ArEngineHelper", "deInitArEngine end.");
            this.f13225a = null;
        }
    }

    public int b(Context context) {
        synchronized (this) {
            HmsFindSDKLog.i("ArEngineHelper", "initArEngine");
            int iA = a(context);
            if (iA != 0) {
                HmsFindSDKLog.e("ArEngineHelper", "checkCondition failed: " + iA);
                return iA;
            }
            if (this.f13225a == null) {
                try {
                    this.f13225a = new ARSession(context);
                    final ARWorldTrackingConfig aRWorldTrackingConfig = new ARWorldTrackingConfig(this.f13225a);
                    aRWorldTrackingConfig.setPlaneFindingMode(ARConfigBase.PlaneFindingMode.DISABLED);
                    aRWorldTrackingConfig.setUpdateMode(ARConfigBase.UpdateMode.LATEST_CAMERA_IMAGE);
                    aRWorldTrackingConfig.setPowerMode(ARConfigBase.PowerMode.ULTRA_POWER_SAVING);
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    ThreadExec.execNormalTask("ArEngineHelper", new Runnable() { // from class: com.huawei.hms.findnetwork.sdk.a$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a(aRWorldTrackingConfig, countDownLatch);
                        }
                    });
                    if (!countDownLatch.await(5L, TimeUnit.SECONDS)) {
                        HmsFindSDKLog.e("ArEngineHelper", "arSession configure await timeout.");
                        return ErrorCode.CODE_UNKNOWN_ERROR;
                    }
                } catch (Exception e) {
                    HmsFindSDKLog.e("ArEngineHelper", "initArEngine error, " + e);
                    return ErrorCode.CODE_UNKNOWN_ERROR;
                }
            }
            HmsFindSDKLog.i("ArEngineHelper", "arSession resume");
            this.f13225a.resume();
            return 0;
        }
    }

    public boolean c(Context context) {
        return AREnginesApk.isAREngineApkReady(context);
    }

    public final /* synthetic */ void a(ARWorldTrackingConfig aRWorldTrackingConfig, CountDownLatch countDownLatch) {
        HmsFindSDKLog.i("ArEngineHelper", "arSession configure start.");
        this.f13225a.configure(aRWorldTrackingConfig);
        countDownLatch.countDown();
    }
}
