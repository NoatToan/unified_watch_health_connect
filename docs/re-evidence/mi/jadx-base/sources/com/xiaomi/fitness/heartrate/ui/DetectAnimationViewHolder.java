package com.xiaomi.fitness.heartrate.ui;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.heartrate.camera.IPlayerEventListener;
import com.xiaomi.fitness.heartrate.camera.VideoPreviewView;
import com.xiaomi.fitness.heartrate.ui.DetectAnimationViewHolder;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.d0j;
import defpackage.fri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 J\u0012\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010%\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010&\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010'\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010(\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0018\u0010)\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010#2\u0006\u0010+\u001a\u00020 J\"\u0010,\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001a\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020-H\u0016J\u001c\u0010.\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010/\u001a\u0004\u0018\u00010#H\u0016J\u0006\u00100\u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/DetectAnimationViewHolder;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/xiaomi/fitness/heartrate/camera/IPlayerEventListener;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "mPreviewDetectView", "Lcom/xiaomi/fitness/heartrate/camera/VideoPreviewView;", "mSkBarProgress", "Landroid/widget/SeekBar;", "mAssetManager", "Landroid/content/res/AssetManager;", "mActivity", "Lcom/xiaomi/fitness/heartrate/ui/CameraDetectActivity;", "mTvProgressText", "Landroid/widget/TextView;", "mProgressLayout", "onCreate", "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "initPreviewView", "setProgress", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "setSeekBarMax", VibrateModeSetFragment.MAX, "shouldShow", "isShow", "", "onInit", "fileName", "", "onReset", "onStopped", "onPlayed", "onPaused", "onFinished", "playVideo", "assetsName", "isLoop", "onProgress", "", "onError", "msg", "onDetectFinished", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DetectAnimationViewHolder implements DefaultLifecycleObserver, IPlayerEventListener {

    @NotNull
    private static final String TAG = "DetectImageAnimationViewHolder";

    @Nullable
    private CameraDetectActivity mActivity;

    @Nullable
    private AssetManager mAssetManager;

    @Nullable
    private VideoPreviewView mPreviewDetectView;

    @Nullable
    private View mProgressLayout;

    @Nullable
    private SeekBar mSkBarProgress;

    @Nullable
    private TextView mTvProgressText;

    @NotNull
    private final View view;

    public DetectAnimationViewHolder(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.mPreviewDetectView = (VideoPreviewView) view.findViewById(fri.B);
        this.mSkBarProgress = (SeekBar) view.findViewById(fri.q);
        this.mProgressLayout = view.findViewById(fri.p);
        SeekBar seekBar = this.mSkBarProgress;
        Intrinsics.checkNotNull(seekBar);
        seekBar.setOnTouchListener(new View.OnTouchListener() { // from class: sz5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return DetectAnimationViewHolder._init_$lambda$0(view2, motionEvent);
            }
        });
        VideoPreviewView videoPreviewView = this.mPreviewDetectView;
        Intrinsics.checkNotNull(videoPreviewView);
        videoPreviewView.setPLayerEventListener(this);
        VideoPreviewView videoPreviewView2 = this.mPreviewDetectView;
        Intrinsics.checkNotNull(videoPreviewView2);
        videoPreviewView2.setZOrderOnTop(true);
        this.mTvProgressText = (TextView) view.findViewById(fri.f18133r);
        this.mAssetManager = view.getContext().getAssets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(View view, MotionEvent motionEvent) {
        return true;
    }

    private final void initPreviewView() {
        try {
            AssetManager assetManager = this.mAssetManager;
            Intrinsics.checkNotNull(assetManager);
            AssetFileDescriptor assetFileDescriptorOpenFd = assetManager.openFd(CameraDetectActivity.VIDEO_DETECT_PRE_PROGRESS);
            Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "openFd(...)");
            VideoPreviewView videoPreviewView = this.mPreviewDetectView;
            Intrinsics.checkNotNull(videoPreviewView);
            videoPreviewView.setLoop(false);
            VideoPreviewView videoPreviewView2 = this.mPreviewDetectView;
            Intrinsics.checkNotNull(videoPreviewView2);
            videoPreviewView2.setDataSource(assetFileDescriptorOpenFd, CameraDetectActivity.VIDEO_DETECT_PRE_PROGRESS);
        } catch (Exception e) {
            Logger.e(TAG, "open video data source error, " + e.getMessage(), e);
        }
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        if (owner instanceof CameraDetectActivity) {
            this.mActivity = (CameraDetectActivity) owner;
        }
    }

    public final void onDetectFinished() {
        playVideo(CameraDetectActivity.VIDEO_DETECT_POST_PROGRESS, false);
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onError(@Nullable String fileName, @Nullable String msg) {
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onFinished(@Nullable String fileName) {
        if (TextUtils.equals(fileName, CameraDetectActivity.VIDEO_DETECT_PRE_PROGRESS)) {
            playVideo(CameraDetectActivity.VIDEO_DETECT_IN_PROGRESS, true);
            return;
        }
        if (TextUtils.equals(fileName, CameraDetectActivity.VIDEO_DETECT_POST_PROGRESS)) {
            CameraDetectActivity cameraDetectActivity = this.mActivity;
            if (cameraDetectActivity != null) {
                cameraDetectActivity.onDetectFinished();
            }
            VideoPreviewView videoPreviewView = this.mPreviewDetectView;
            Intrinsics.checkNotNull(videoPreviewView);
            videoPreviewView.setVisibility(8);
        }
    }

    @Override // com.xiaomi.fitness.heartrate.camera.IPlayerEventListener
    public void onInit(@Nullable String fileName) {
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

    public final void playVideo(@Nullable String assetsName, boolean isLoop) {
        try {
            AssetManager assetManager = this.mAssetManager;
            Intrinsics.checkNotNull(assetManager);
            Intrinsics.checkNotNull(assetsName);
            AssetFileDescriptor assetFileDescriptorOpenFd = assetManager.openFd(assetsName);
            Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "openFd(...)");
            VideoPreviewView videoPreviewView = this.mPreviewDetectView;
            Intrinsics.checkNotNull(videoPreviewView);
            videoPreviewView.setLoop(isLoop);
            VideoPreviewView videoPreviewView2 = this.mPreviewDetectView;
            Intrinsics.checkNotNull(videoPreviewView2);
            videoPreviewView2.setDataSource(assetFileDescriptorOpenFd, assetsName);
            VideoPreviewView videoPreviewView3 = this.mPreviewDetectView;
            Intrinsics.checkNotNull(videoPreviewView3);
            videoPreviewView3.play();
        } catch (Exception e) {
            Logger.e(TAG, "playVideo has error " + assetsName + ", " + e.getMessage(), e);
        }
    }

    public final void setProgress(int progress) {
        SeekBar seekBar = this.mSkBarProgress;
        Intrinsics.checkNotNull(seekBar);
        seekBar.setProgress(progress);
        SeekBar seekBar2 = this.mSkBarProgress;
        Intrinsics.checkNotNull(seekBar2);
        int iMin = Math.min((progress * 100) / seekBar2.getMax(), 100);
        TextView textView = this.mTvProgressText;
        Intrinsics.checkNotNull(textView);
        textView.setText(ResourceExtKt.getString(d0j.h, Integer.valueOf(iMin)));
    }

    public final void setSeekBarMax(int max) {
        SeekBar seekBar = this.mSkBarProgress;
        Intrinsics.checkNotNull(seekBar);
        seekBar.setMax(max);
    }

    public final void shouldShow(boolean isShow) {
        if (isShow) {
            initPreviewView();
        }
        VideoPreviewView videoPreviewView = this.mPreviewDetectView;
        Intrinsics.checkNotNull(videoPreviewView);
        videoPreviewView.setVisibility(isShow ? 0 : 8);
        View view = this.mProgressLayout;
        Intrinsics.checkNotNull(view);
        view.setVisibility(isShow ? 0 : 8);
    }
}
