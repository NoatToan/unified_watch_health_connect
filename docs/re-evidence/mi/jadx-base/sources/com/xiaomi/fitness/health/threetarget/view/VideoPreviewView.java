package com.xiaomi.fitness.health.threetarget.view;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.onetrack.OneTrack;
import defpackage.ez5;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B3\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0015J\u0010\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010\"\u001a\u00020\u001aJ\u0006\u0010#\u001a\u00020\u001aJ\u000e\u0010\"\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0013J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'H\u0016J(\u0010(\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0016J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'H\u0016J\u0018\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\bH\u0014J\u0018\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\bH\u0014J\u0018\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\bH\u0002J\b\u00107\u001a\u00020\u001aH\u0014R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/view/VideoPreviewView;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mDefaultSize", "mMaxSize", "mAssetFd", "Landroid/content/res/AssetFileDescriptor;", "mVideoPlayer", "Lcom/xiaomi/fitness/health/threetarget/view/VideoPlayer;", "mFileName", "", "mIsHolderCreated", "", "mIsTransparent", "mFormat", "mUri", "setDataSource", "", "afd", "fileName", "setLoop", "isLoop", "setPLayerEventListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/health/threetarget/view/IPlayerEventListener;", OneTrack.Event.PLAY, "pause", SportRecordBundleKey.BUNDLE_PARAM_URI, "surfaceCreated", "holder", "Landroid/view/SurfaceHolder;", "surfaceChanged", "format", "width", "height", "surfaceDestroyed", "onVisibilityChanged", "changedView", "Landroid/view/View;", "visibility", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "measureViewSize", "measureSpec", "defSize", "onDetachedFromWindow", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoPreviewView extends SurfaceView implements SurfaceHolder.Callback {

    @Nullable
    private AssetFileDescriptor mAssetFd;
    private final int mDefaultSize;

    @Nullable
    private String mFileName;
    private int mFormat;
    private boolean mIsHolderCreated;
    private boolean mIsTransparent;
    private final int mMaxSize;

    @Nullable
    private String mUri;

    @NotNull
    private final VideoPlayer mVideoPlayer;

    @JvmOverloads
    public VideoPreviewView(@Nullable Context context) {
        this(context, null, 0, 0, 14, null);
    }

    private final int measureViewSize(int measureSpec, int defSize) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode != Integer.MIN_VALUE) {
            return (mode == 0 || mode == 1073741824) ? size : defSize;
        }
        return RangesKt___RangesKt.coerceAtMost(defSize, size);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mVideoPlayer.release();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(RangesKt___RangesKt.coerceAtMost(measureViewSize(widthMeasureSpec, this.mDefaultSize), measureViewSize(heightMeasureSpec, this.mDefaultSize)), this.mMaxSize);
        setMeasuredDimension(iCoerceAtMost, iCoerceAtMost);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        String str;
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        if (visibility != 0) {
            this.mVideoPlayer.pause();
            this.mFormat = -3;
            getHolder().setFormat(this.mFormat);
            this.mIsTransparent = true;
            return;
        }
        if (this.mIsTransparent) {
            this.mFormat = 1;
            getHolder().setFormat(this.mFormat);
            this.mIsTransparent = false;
        }
        if (!this.mIsHolderCreated || (str = this.mUri) == null) {
            return;
        }
        Intrinsics.checkNotNull(str);
        play(str);
    }

    public final void pause() {
        this.mVideoPlayer.pause();
    }

    public final void play() {
        this.mVideoPlayer.play(getHolder(), this.mAssetFd, this.mFileName);
    }

    public final void setDataSource(@NotNull AssetFileDescriptor afd, @Nullable String fileName) {
        Intrinsics.checkNotNullParameter(afd, "afd");
        this.mAssetFd = afd;
        this.mFileName = fileName;
    }

    public final void setLoop(boolean isLoop) {
        this.mVideoPlayer.setLoop(isLoop);
    }

    public final void setPLayerEventListener(@Nullable IPlayerEventListener listener) {
        this.mVideoPlayer.setPlayerEventListener(listener);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NotNull SurfaceHolder holder, int format, int width, int height) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NotNull SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.mIsHolderCreated = true;
        if (getVisibility() != 0 || this.mFormat == -3) {
            return;
        }
        String str = this.mUri;
        Intrinsics.checkNotNull(str);
        play(str);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NotNull SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.mVideoPlayer.release();
        this.mIsHolderCreated = false;
    }

    @JvmOverloads
    public VideoPreviewView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void play(@NotNull String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.mUri = uri;
        this.mVideoPlayer.play(uri, getHolder());
    }

    @JvmOverloads
    public VideoPreviewView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ VideoPreviewView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @JvmOverloads
    public VideoPreviewView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mDefaultSize = ez5.a(SpatialRelationUtil.A_CIRCLE_DEGREE);
        this.mMaxSize = CommonConstants.Mgc.PAY_FEE_ERROR;
        this.mFormat = 1;
        getHolder().addCallback(this);
        this.mVideoPlayer = new VideoPlayer();
    }
}
