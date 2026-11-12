package com.xiaomi.fitness.heartrate.ui;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.heartrate.camera.IPlayerEventListener;
import com.xiaomi.fitness.heartrate.camera.VideoPreviewView;
import com.xiaomi.fitness.heartrate.ui.view.TwinkleView;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.fri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0004J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u000fJ\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u000fJ\u0006\u0010\u001d\u001a\u00020\u000fJ\u0006\u0010\u001e\u001a\u00020\u000fJ\b\u0010\u001f\u001a\u00020\u000fH\u0016J\u0012\u0010 \u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010!\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\"\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010#\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010$\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010%\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010&\u001a\u00020\u000fH\u0002J\"\u0010'\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0016J\u001c\u0010+\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010,\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/FingerDetectingAnimViewHolder;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/xiaomi/fitness/heartrate/camera/IPlayerEventListener;", "Lcom/xiaomi/fitness/heartrate/ui/view/TwinkleView$OnLineAnimationListener;", "mView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "mFingerGuideView", "Lcom/xiaomi/fitness/heartrate/camera/VideoPreviewView;", "mPpgView", "Lcom/xiaomi/fitness/heartrate/ui/view/TwinkleView;", "mActivity", "Lcom/xiaomi/fitness/heartrate/ui/FingerDetectActivity;", "onCreate", "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "onLoadData", "setVideoDataSource", "fileName", "", "isLoop", "", "playVideo", "setPpgValue", "value", "", "stopPpgAnimation", "clearPpgLine", "ppgEndStage", "onLineAnimationFinished", "onInit", "onReset", "onStopped", "onPlayed", "onPaused", "onFinished", "onPostVideoPlayFinished", "onProgress", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", VibrateModeSetFragment.MAX, "onError", "msg", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FingerDetectingAnimViewHolder implements DefaultLifecycleObserver, IPlayerEventListener, TwinkleView.OnLineAnimationListener {

    @NotNull
    private static final String TAG = "FingerDetectingAnimView";

    @Nullable
    private FingerDetectActivity mActivity;

    @NotNull
    private VideoPreviewView mFingerGuideView;

    @NotNull
    private TwinkleView mPpgView;

    @NotNull
    private final View mView;

    public FingerDetectingAnimViewHolder(@NotNull View mView) {
        Intrinsics.checkNotNullParameter(mView, "mView");
        this.mView = mView;
        View viewFindViewById = mView.findViewById(fri.B);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        VideoPreviewView videoPreviewView = (VideoPreviewView) viewFindViewById;
        this.mFingerGuideView = videoPreviewView;
        videoPreviewView.setPLayerEventListener(this);
        this.mFingerGuideView.setZOrderOnTop(true);
        this.mFingerGuideView.setKeepScreenOn(false);
        TwinkleView twinkleView = (TwinkleView) mView.findViewById(fri.z);
        this.mPpgView = twinkleView;
        twinkleView.setOnLineAnimationListener(this);
    }

    private final void onPostVideoPlayFinished() {
        FingerDetectActivity fingerDetectActivity = this.mActivity;
        if (fingerDetectActivity != null) {
            Intrinsics.checkNotNull(fingerDetectActivity);
            if (fingerDetectActivity.isDestroyed()) {
                return;
            }
            FingerDetectActivity fingerDetectActivity2 = this.mActivity;
            Intrinsics.checkNotNull(fingerDetectActivity2);
            fingerDetectActivity2.jumpToReportFragment();
        }
    }

    public final void clearPpgLine() {
        this.mPpgView.clearCanvas();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        if (owner instanceof FingerDetectActivity) {
            this.mActivity = (FingerDetectActivity) owner;
        }
        onLoadData();
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onError(@Nullable String fileName, @Nullable String msg) {
        Logger.e(TAG, "onError: fileName = " + fileName + ", msg = " + msg);
        onPostVideoPlayFinished();
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onFinished(@Nullable String fileName) {
        if (TextUtils.equals(fileName, CameraDetectActivity.VIDEO_DETECT_PRE_PROGRESS)) {
            setVideoDataSource(CameraDetectActivity.VIDEO_DETECT_PAUSED, true);
            playVideo();
        } else if (TextUtils.equals(fileName, CameraDetectActivity.VIDEO_DETECT_POST_PROGRESS)) {
            onPostVideoPlayFinished();
        }
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onInit(@Nullable String fileName) {
    }

    @Override // com.xiaomi.fitness.heartrate.ui.view.TwinkleView.OnLineAnimationListener
    public void onLineAnimationFinished() {
        setVideoDataSource(CameraDetectActivity.VIDEO_DETECT_POST_PROGRESS, false);
        playVideo();
        FingerDetectActivity fingerDetectActivity = this.mActivity;
        if (fingerDetectActivity != null) {
            Intrinsics.checkNotNull(fingerDetectActivity);
            if (fingerDetectActivity.isDestroyed()) {
                return;
            }
            FingerDetectActivity fingerDetectActivity2 = this.mActivity;
            Intrinsics.checkNotNull(fingerDetectActivity2);
            fingerDetectActivity2.onLineDrawFinished();
        }
    }

    public final void onLoadData() {
        setVideoDataSource(CameraDetectActivity.VIDEO_DETECT_PRE_PROGRESS, false);
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onPaused(@Nullable String fileName) {
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onPlayed(@Nullable String fileName) {
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onProgress(@Nullable String fileName, long progress, long max) {
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onReset(@Nullable String fileName) {
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onStopped(@Nullable String fileName) {
    }

    public final void playVideo() {
        this.mFingerGuideView.play();
    }

    public final void ppgEndStage() {
        this.mPpgView.endStage();
    }

    public final void setPpgValue(int value) {
        this.mPpgView.setValue(value);
    }

    public final void setVideoDataSource(@NotNull String fileName, boolean isLoop) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            AssetManager assets = this.mView.getContext().getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            AssetFileDescriptor assetFileDescriptorOpenFd = assets.openFd(fileName);
            Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "openFd(...)");
            this.mFingerGuideView.setDataSource(assetFileDescriptorOpenFd, fileName);
            this.mFingerGuideView.setLoop(isLoop);
        } catch (Exception e) {
            Logger.e(TAG, "open video source error, " + e.getMessage());
        }
    }

    public final void stopPpgAnimation() {
        this.mPpgView.stop();
    }
}
