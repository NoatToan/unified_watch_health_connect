package com.garmin.android.golfswing;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import java.lang.reflect.Array;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public class GolfSwingViewManager {
    private Context mContext;
    private GolfSwingViewListener mGolfSwingViewListener;
    private int mHeight;
    private boolean mIsInit;
    private ViewGestureDetector mPanDetector;
    private ScaleGestureDetector mScaleDetector;
    private int mWidth;

    public interface GolfSwingViewListener {
        void onGolfSwingViewChanged();

        void onInitComplete();

        void onPlayProgressUpdated(float f14);
    }

    public static class LazyHolder {
        private static final GolfSwingViewManager INSTANCE = new GolfSwingViewManager();

        private LazyHolder() {
        }
    }

    public class PanListener extends GestureDetector.SimpleOnGestureListener {
        private PanListener() {
        }

        public boolean onLiftFinger() {
            GolfSwingViewManager.nativeHandleSnap();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f14, float f15) {
            GolfSwingViewManager.nativeHandlePanGesture((-f14) / GolfSwingViewManager.this.mWidth, (-f15) / GolfSwingViewManager.this.mHeight);
            return true;
        }
    }

    public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private ScaleListener() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GolfSwingViewManager.nativeHandlePinchGesture(scaleGestureDetector.getScaleFactor());
            return true;
        }
    }

    public class ViewGestureDetector extends GestureDetector {
        PanListener mListener;

        public ViewGestureDetector(Context context, PanListener panListener) {
            super(context, panListener);
            this.mListener = panListener;
        }

        @Override // android.view.GestureDetector
        public boolean onTouchEvent(MotionEvent motionEvent) {
            PanListener panListener;
            if (motionEvent.getActionMasked() == 1 && (panListener = this.mListener) != null) {
                panListener.onLiftFinger();
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    private GolfSwingViewManager() {
        System.loadLibrary("golf-swing");
    }

    public static GolfSwingViewManager getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static native void nativeClose();

    private static native void nativeDraw();

    private static native void nativeGetAllMarkings(float[] fArr, float[] fArr2);

    private static native void nativeGetFileSwingData(GolfSwingsInfo golfSwingsInfo);

    private static native void nativeGetSwingMarkings(double d14, boolean z14, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeHandlePanGesture(float f14, float f15);

    private static native void nativeHandlePausePlay();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeHandlePinchGesture(float f14);

    private static native void nativeHandleResumePlay();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeHandleSnap();

    private static native void nativeHandleStartPlay();

    private static native void nativeHandleStopPlay();

    private static native void nativeHandleSwingProgress(float f14);

    private static native void nativeInit();

    private static native void nativeLoadCompareApproach(double d14);

    private static native void nativeLoadCompareSwing(double d14);

    private static native void nativeLoadCurrentApproach(double d14);

    private static native void nativeLoadCurrentSwing(double d14);

    private static native void nativeLoadSwingFile(String str);

    private static native void nativeMoveSceneCenter(float f14);

    private static native void nativeSetCompareApproachData(GolfSwingsInfo golfSwingsInfo);

    private static native void nativeSetCompareMode(boolean z14);

    private static native void nativeSetCompareSwingData(GolfSwingsInfo golfSwingsInfo);

    private static native void nativeSetCurrentApproachData(GolfSwingsInfo golfSwingsInfo);

    private static native void nativeSetCurrentSwingData(GolfSwingsInfo golfSwingsInfo);

    private static native void nativeSetGolfClubModel(int i14);

    private static native void nativeSetGolferModel(int i14);

    private static native void nativeSetLeftHanded(boolean z14);

    private static native void nativeSetSlowMotion(boolean z14);

    private static native void nativeShowApproach(boolean z14);

    private static native void nativeSurfaceChanged(Surface surface);

    private static native void nativeSurfaceDestroyed(Surface surface);

    private static native void nativeZoomOnGolfer(boolean z14);

    private void validateProgress(float f14) {
        if (f14 < 0.0f || f14 > 1.0f) {
            h.s("Value of progress should be between 0.0f and 1.0f");
        }
    }

    public void clearSwingData() {
        setClubSwingData(1.0d, null);
        drawScene();
    }

    public void close() {
        if (this.mIsInit) {
            nativeClose();
            this.mGolfSwingViewListener = null;
            this.mIsInit = false;
        }
    }

    public void drawScene() {
        nativeDraw();
    }

    public float[][] getAllMarkings() {
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        nativeGetAllMarkings(fArr, fArr2);
        float[][] fArr3 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2, 4);
        fArr3[0] = fArr;
        fArr3[1] = fArr2;
        return fArr3;
    }

    public GolfSwingsInfo getSwingDataFromFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        nativeLoadSwingFile(str);
        GolfSwingsInfo golfSwingsInfo = new GolfSwingsInfo();
        nativeGetFileSwingData(golfSwingsInfo);
        return golfSwingsInfo;
    }

    public float[] getSwingMarkings(double d14, boolean z14) {
        float[] fArr = new float[4];
        nativeGetSwingMarkings(d14, z14, fArr);
        return fArr;
    }

    public void init(Context context) {
        if (this.mIsInit) {
            close();
            this.mIsInit = false;
        }
        this.mContext = context;
        ContentManager.initialize(context);
        nativeInit();
        this.mIsInit = true;
        this.mScaleDetector = new ScaleGestureDetector(context, new ScaleListener());
        this.mPanDetector = new ViewGestureDetector(context, new PanListener());
    }

    public void initComplete() {
        if (this.mContext != null) {
            new Handler(this.mContext.getMainLooper()).post(new Runnable() { // from class: com.garmin.android.golfswing.GolfSwingViewManager.1
                @Override // java.lang.Runnable
                public void run() {
                    if (GolfSwingViewManager.this.mGolfSwingViewListener != null) {
                        GolfSwingViewManager.this.mGolfSwingViewListener.onInitComplete();
                    }
                }
            });
        }
    }

    public void moveSceneCenter(float f14) {
        nativeMoveSceneCenter(f14);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.mScaleDetector.onTouchEvent(motionEvent);
        this.mPanDetector.onTouchEvent(motionEvent);
        return true;
    }

    public void pausePlay() {
        nativeHandlePausePlay();
    }

    public void resumePlay() {
        nativeHandleResumePlay();
    }

    public void setClubSwingCompareData(double d14, GolfSwingsInfo golfSwingsInfo) {
        nativeSetCompareSwingData(golfSwingsInfo);
        nativeLoadCompareSwing(d14);
        nativeSetCompareMode(true);
    }

    public void setClubSwingData(double d14, GolfSwingsInfo golfSwingsInfo) {
        nativeSetCurrentSwingData(golfSwingsInfo);
        nativeLoadCurrentSwing(d14);
        nativeSetCompareMode(false);
        nativeShowApproach(false);
    }

    public void setCompareMode(boolean z14) {
        nativeSetCompareMode(z14);
    }

    public void setGolfClubModel(int i14) {
        nativeSetGolfClubModel(i14);
    }

    public void setGolfSwingViewListener(GolfSwingViewListener golfSwingViewListener) {
        this.mGolfSwingViewListener = golfSwingViewListener;
    }

    public void setGolferModel(int i14) {
        nativeSetGolferModel(i14);
    }

    public void setLeftHanded(boolean z14) {
        nativeSetLeftHanded(z14);
    }

    public void setSlowMotion(boolean z14) {
        nativeSetSlowMotion(z14);
    }

    public void setSwingCompareData(double d14, GolfSwingsInfo golfSwingsInfo, GolfSwingsInfo golfSwingsInfo2) {
        setClubSwingCompareData(d14, golfSwingsInfo);
        if (golfSwingsInfo2 != null) {
            setWristSwingCompareData(d14, golfSwingsInfo2);
        }
    }

    public void setSwingData(double d14, GolfSwingsInfo golfSwingsInfo, GolfSwingsInfo golfSwingsInfo2) {
        setClubSwingData(d14, golfSwingsInfo);
        if (golfSwingsInfo2 != null) {
            setWristSwingData(d14, golfSwingsInfo2);
        }
    }

    public void setSwingProgress(float f14) {
        validateProgress(f14);
        nativeHandleSwingProgress(f14);
    }

    public void setWristSwingCompareData(double d14, GolfSwingsInfo golfSwingsInfo) {
        nativeSetCompareApproachData(golfSwingsInfo);
        nativeLoadCompareApproach(d14);
        nativeShowApproach(true);
    }

    public void setWristSwingData(double d14, GolfSwingsInfo golfSwingsInfo) {
        nativeSetCurrentApproachData(golfSwingsInfo);
        nativeLoadCurrentApproach(d14);
        nativeShowApproach(true);
    }

    public void showApproach(boolean z14) {
        nativeShowApproach(z14);
    }

    public void startPlay() {
        nativeHandleStartPlay();
    }

    public void stopPlay() {
        nativeHandleStopPlay();
    }

    public void surfaceChanged(Surface surface, int i14, int i15) {
        this.mWidth = i14;
        this.mHeight = i15;
        nativeSurfaceChanged(surface);
        GolfSwingViewListener golfSwingViewListener = this.mGolfSwingViewListener;
        if (golfSwingViewListener != null) {
            golfSwingViewListener.onGolfSwingViewChanged();
        }
    }

    public void updatePlayProgress(float f14) {
        validateProgress(f14);
        GolfSwingViewListener golfSwingViewListener = this.mGolfSwingViewListener;
        if (golfSwingViewListener != null) {
            golfSwingViewListener.onPlayProgressUpdated(f14);
        }
    }

    public void zoomOnGolfer(boolean z14) {
        nativeZoomOnGolfer(z14);
    }
}
