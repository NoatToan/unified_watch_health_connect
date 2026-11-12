package com.xiaomi.fitness.watch.face.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.watch.face.edit.photo.crop.OnPortraitScaleListener;
import com.xiaomi.fitness.watch.face.edit.utils.DialFileUtils;
import com.xiaomi.fitness.watch.face.edit.video.crop.OnVideoLoadListener;
import com.xiaomi.fitness.watch.face.export.exportview.RectView;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.ujp;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 r2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001rB'\b\u0007\u0012\u0006\u0010l\u001a\u00020k\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u00010m\u0012\b\b\u0002\u0010o\u001a\u00020\u0016¢\u0006\u0004\bp\u0010qJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0005¢\u0006\u0004\b%\u0010\u0007J\u0017\u0010(\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0005¢\u0006\u0004\b2\u0010\u0007J\r\u00103\u001a\u00020\u0005¢\u0006\u0004\b3\u0010\u0007J\u0017\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00052\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b8\u00107J\r\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020\u00052\u0006\u0010+\u001a\u00020<¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\u00052\u0006\u0010+\u001a\u00020?¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u001b¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0005¢\u0006\u0004\bD\u0010\u0007J\u000f\u0010E\u001a\u00020\u0005H\u0014¢\u0006\u0004\bE\u0010\u0007R\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR\u0016\u0010Q\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010GR\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010GR\u0018\u0010b\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010GR\u0016\u0010e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010RR\u0018\u0010f\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0011\u0010j\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bj\u0010C¨\u0006s"}, d2 = {"Lcom/xiaomi/fitness/watch/face/view/XmsTextureView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/media/MediaPlayer$OnPreparedListener;", "", "getDefaultMatrix", "()V", "", "getScale", "()F", "validateSide", "Landroid/graphics/Matrix;", "matrix", "Landroid/graphics/RectF;", "getMatrixRectF", "(Landroid/graphics/Matrix;)Landroid/graphics/RectF;", "prepare", "getUseMatrix", "()Landroid/graphics/Matrix;", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "", "width", "height", "onSurfaceTextureAvailable", "(Landroid/graphics/SurfaceTexture;II)V", "", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "enableInternalTouch", "Lujp;", "touchActionCallback", "setTouchActionCallback", "(Lujp;)V", "Lcom/xiaomi/fitness/watch/face/edit/photo/crop/OnPortraitScaleListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnPortraitScaleListener", "(Lcom/xiaomi/fitness/watch/face/edit/photo/crop/OnPortraitScaleListener;)V", "", "path", "setVideoPath", "(Ljava/lang/String;)V", OneTrack.Event.PLAY, BroadcastsKt.SILENT_PUSHING_STOP, "Landroid/media/MediaPlayer;", "mp", "onCompletion", "(Landroid/media/MediaPlayer;)V", "onPrepared", "Lcom/xiaomi/fitness/watch/face/view/CropData;", "getCropData", "()Lcom/xiaomi/fitness/watch/face/view/CropData;", "Lcom/xiaomi/fitness/watch/face/edit/video/crop/OnVideoLoadListener;", "setOnLoadListener", "(Lcom/xiaomi/fitness/watch/face/edit/video/crop/OnVideoLoadListener;)V", "Lcom/xiaomi/fitness/watch/face/view/OnVideoCompleteListener;", "setOnPlayCompleteListener", "(Lcom/xiaomi/fitness/watch/face/view/OnVideoCompleteListener;)V", "isConfigChange", "()Z", "pause", "onDetachedFromWindow", "mSideMargin", "F", "Landroid/view/GestureDetector;", "mGestureDetector", "Landroid/view/GestureDetector;", "Landroid/view/ScaleGestureDetector;", "mScaleGesture", "Landroid/view/ScaleGestureDetector;", "surfaceWidth", "I", "surfaceHeight", "lastMatrix", "Landroid/graphics/Matrix;", "Landroid/view/Surface;", "surface", "Landroid/view/Surface;", "useMatrix", "mVideoPath", "Ljava/lang/String;", "mediaPlayer", "Landroid/media/MediaPlayer;", "rect", "Landroid/graphics/RectF;", "mScale", "", "mValues", "[F", "mMarginTop", "onVideoLoadListener", "Lcom/xiaomi/fitness/watch/face/edit/video/crop/OnVideoLoadListener;", "videoAspectRatio", "initialMatrix", "onPortraitScaleListener", "Lcom/xiaomi/fitness/watch/face/edit/photo/crop/OnPortraitScaleListener;", "onVideoCompleteListener", "Lcom/xiaomi/fitness/watch/face/view/OnVideoCompleteListener;", "isPlaying", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class XmsTextureView extends TextureView implements TextureView.SurfaceTextureListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener {

    @NotNull
    private static final String TAG = "XmsTextureView";

    @NotNull
    private Matrix initialMatrix;

    @NotNull
    private Matrix lastMatrix;

    @NotNull
    private GestureDetector mGestureDetector;
    private float mMarginTop;
    private float mScale;

    @NotNull
    private ScaleGestureDetector mScaleGesture;
    private float mSideMargin;

    @NotNull
    private final float[] mValues;

    @Nullable
    private String mVideoPath;

    @Nullable
    private MediaPlayer mediaPlayer;

    @Nullable
    private OnPortraitScaleListener onPortraitScaleListener;

    @Nullable
    private OnVideoCompleteListener onVideoCompleteListener;

    @Nullable
    private OnVideoLoadListener onVideoLoadListener;

    @NotNull
    private RectF rect;

    @Nullable
    private Surface surface;
    private int surfaceHeight;
    private int surfaceWidth;

    @NotNull
    private Matrix useMatrix;
    private float videoAspectRatio;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public XmsTextureView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void getDefaultMatrix() {
        float f;
        float f2;
        float f3;
        String str = this.mVideoPath;
        if (str == null) {
            return;
        }
        int i = (int) RectView.f13382b;
        int i2 = (int) RectView.c;
        DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
        Intrinsics.checkNotNull(str);
        Pair<Integer, Integer> mediaSize = dialFileUtils.getMediaSize(str);
        float f4 = 1.0f;
        this.videoAspectRatio = (mediaSize.getFirst().floatValue() * 1.0f) / mediaSize.getSecond().floatValue();
        Logger.i(TAG, "video size " + mediaSize);
        if (this.videoAspectRatio > 1.0f) {
            float fIntValue = mediaSize.getFirst().intValue() * this.surfaceHeight * 1.0f;
            int iIntValue = mediaSize.getSecond().intValue();
            int i3 = this.surfaceWidth;
            float f5 = fIntValue / (iIntValue * i3);
            float f6 = i2;
            int i4 = this.surfaceHeight;
            float f7 = (f6 * 1.0f) / i4;
            this.mScale = f7;
            f = (i3 / 2.0f) - (((i3 * f7) * f5) / 2.0f);
            f2 = (i4 / 2.0f) - (f6 / 2.0f);
            f3 = 1.0f;
            f4 = f5;
        } else {
            float fIntValue2 = mediaSize.getSecond().intValue() * this.surfaceWidth * 1.0f;
            int iIntValue2 = mediaSize.getFirst().intValue();
            int i5 = this.surfaceHeight;
            float f8 = fIntValue2 / (iIntValue2 * i5);
            float f9 = i;
            int i6 = this.surfaceWidth;
            float f10 = (f9 * 1.0f) / i6;
            this.mScale = f10;
            f = (i6 / 2.0f) - (f9 / 2.0f);
            f2 = (i5 / 2.0f) - (((i5 * f10) * f8) / 2.0f);
            f3 = f8;
        }
        Matrix matrix = this.useMatrix;
        float f11 = this.mScale;
        matrix.postScale(f4 * f11, f11 * f3);
        this.useMatrix.postTranslate(f, f2);
        setTransform(this.useMatrix);
        this.initialMatrix = new Matrix(this.useMatrix);
        postInvalidate();
    }

    private final RectF getMatrixRectF(Matrix matrix) {
        this.rect.set(0.0f, 0.0f, this.surfaceWidth, this.surfaceHeight);
        matrix.mapRect(this.rect);
        return this.rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getScale() {
        this.useMatrix.getValues(this.mValues);
        return this.videoAspectRatio > 1.0f ? this.mValues[4] : this.mValues[0];
    }

    private final void prepare() {
        if (this.mVideoPath == null || !new File(this.mVideoPath).exists()) {
            return;
        }
        Logger.d(TAG, "prepare " + isAttachedToWindow());
        try {
            if (this.mediaPlayer == null) {
                this.mediaPlayer = new MediaPlayer();
            }
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setSurface(this.surface);
            }
            MediaPlayer mediaPlayer3 = this.mediaPlayer;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setDataSource(this.mVideoPath);
            }
            MediaPlayer mediaPlayer4 = this.mediaPlayer;
            if (mediaPlayer4 != null) {
                mediaPlayer4.setOnPreparedListener(this);
            }
            MediaPlayer mediaPlayer5 = this.mediaPlayer;
            if (mediaPlayer5 != null) {
                mediaPlayer5.setOnCompletionListener(this);
            }
            MediaPlayer mediaPlayer6 = this.mediaPlayer;
            if (mediaPlayer6 != null) {
                mediaPlayer6.prepareAsync();
            }
            getDefaultMatrix();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateSide() {
        float f;
        RectF matrixRectF = getMatrixRectF(this.useMatrix);
        int i = this.surfaceWidth;
        float f2 = matrixRectF.left;
        float f3 = this.mSideMargin;
        float f4 = 0.0f;
        if (f2 > f3) {
            f = (-f2) + f3;
        } else {
            float f5 = matrixRectF.right;
            float f6 = i;
            f = f5 < f6 - f3 ? (f6 - f3) - f5 : 0.0f;
        }
        float f7 = matrixRectF.top;
        float f8 = this.mMarginTop;
        if (f7 > f8) {
            f4 = (-f7) + f8;
        } else {
            float f9 = matrixRectF.bottom;
            float f10 = RectView.c;
            if (f9 < f8 + f10) {
                f4 = (f8 + f10) - f9;
            }
        }
        this.useMatrix.postTranslate(f, f4);
        OnPortraitScaleListener onPortraitScaleListener = this.onPortraitScaleListener;
        if (onPortraitScaleListener != null) {
            Intrinsics.checkNotNull(onPortraitScaleListener);
            onPortraitScaleListener.onMove(f, f4);
        }
    }

    public final void enableInternalTouch() {
    }

    @NotNull
    public final CropData getCropData() {
        RectF matrixRectF = getMatrixRectF(this.useMatrix);
        float f = (this.surfaceWidth / 2) - matrixRectF.left;
        float f2 = (this.surfaceHeight / 2) - matrixRectF.top;
        Logger.i(TAG, "view size " + getWidth() + " " + getHeight());
        Logger.i(TAG, "center " + matrixRectF + " " + f + " " + f2);
        float f3 = (float) 2;
        float f4 = f - (RectView.f13382b / f3);
        float f5 = f2 - (RectView.c / f3);
        float f6 = RectView.f13382b;
        float f7 = RectView.f13382b;
        DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
        String str = this.mVideoPath;
        Intrinsics.checkNotNull(str);
        float fFloatValue = dialFileUtils.getMediaSize(str).getFirst().floatValue() / matrixRectF.width();
        Logger.i(TAG, "center " + matrixRectF + " " + (f * fFloatValue) + " " + (f2 * fFloatValue));
        float f8 = f4 * fFloatValue;
        float f9 = f5 * fFloatValue;
        float f10 = RectView.f13382b * fFloatValue;
        Logger.i(TAG, "start: " + f8 + " " + f9 + " width: " + f10);
        return new CropData(f8, f9, f10);
    }

    @NotNull
    public final Matrix getUseMatrix() {
        return this.useMatrix;
    }

    public final boolean isConfigChange() {
        return !this.initialMatrix.equals(this.useMatrix);
    }

    public final boolean isPlaying() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(@NotNull MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(0);
        }
        OnVideoCompleteListener onVideoCompleteListener = this.onVideoCompleteListener;
        if (onVideoCompleteListener != null) {
            onVideoCompleteListener.onComplete();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(@NotNull MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(0);
        }
        OnVideoLoadListener onVideoLoadListener = this.onVideoLoadListener;
        if (onVideoLoadListener != null) {
            onVideoLoadListener.onLoadDone();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, int width, int height) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        StringBuilder sb = new StringBuilder();
        sb.append("onSurfaceTextureAvailable width ");
        sb.append(width);
        sb.append(" height");
        sb.append(height);
        this.surface = new Surface(surfaceTexture);
        this.surfaceWidth = width;
        this.surfaceHeight = height;
        this.mMarginTop = (height - RectView.c) / 2;
        prepare();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surfaceTexture, int width, int height) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        StringBuilder sb = new StringBuilder();
        sb.append("onSurfaceTextureSizeChanged width ");
        sb.append(width);
        sb.append(" height");
        sb.append(height);
        this.surfaceWidth = width;
        this.surfaceHeight = height;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        if (this.onPortraitScaleListener != null) {
            Intrinsics.checkNotNull(event);
            if (event.getActionMasked() == 1) {
                OnPortraitScaleListener onPortraitScaleListener = this.onPortraitScaleListener;
                Intrinsics.checkNotNull(onPortraitScaleListener);
                onPortraitScaleListener.onchangeEnd();
            }
        }
        GestureDetector gestureDetector = this.mGestureDetector;
        Intrinsics.checkNotNull(event);
        gestureDetector.onTouchEvent(event);
        return this.mScaleGesture.onTouchEvent(event);
    }

    public final void pause() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2 = this.mediaPlayer;
        if (mediaPlayer2 == null || !mediaPlayer2.isPlaying() || (mediaPlayer = this.mediaPlayer) == null) {
            return;
        }
        mediaPlayer.pause();
    }

    public final void play() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    public final void setOnLoadListener(@NotNull OnVideoLoadListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onVideoLoadListener = listener;
    }

    public final void setOnPlayCompleteListener(@NotNull OnVideoCompleteListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onVideoCompleteListener = listener;
    }

    public final void setOnPortraitScaleListener(@NotNull OnPortraitScaleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPortraitScaleListener = listener;
    }

    public final void setTouchActionCallback(@Nullable ujp touchActionCallback) {
    }

    public final void setVideoPath(@Nullable String path) {
        this.mVideoPath = path;
        if (this.surface != null) {
            prepare();
        }
    }

    public final void stop() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public XmsTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ XmsTextureView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public XmsTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mScale = 1.0f;
        this.mValues = new float[9];
        this.videoAspectRatio = 1.0f;
        this.initialMatrix = new Matrix();
        setSurfaceTextureListener(this);
        this.lastMatrix = new Matrix();
        this.useMatrix = new Matrix();
        this.rect = new RectF();
        this.mSideMargin = (DisplayUtil.getScreenWidth() - RectView.f13382b) / 2;
        this.mScaleGesture = new ScaleGestureDetector(context, new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: com.xiaomi.fitness.watch.face.view.XmsTextureView.1
            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector detector) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                float scaleFactor = detector.getScaleFactor();
                float scale = XmsTextureView.this.getScale();
                Logger.d(XmsTextureView.TAG, "onScale2222: " + scale + "  " + scaleFactor + "  " + XmsTextureView.this.mScale);
                if (scaleFactor * scale < XmsTextureView.this.mScale) {
                    scaleFactor = XmsTextureView.this.mScale / scale;
                }
                XmsTextureView.this.useMatrix.postScale(scaleFactor, scaleFactor, detector.getFocusX(), detector.getFocusY());
                if (XmsTextureView.this.onPortraitScaleListener != null) {
                    OnPortraitScaleListener onPortraitScaleListener = XmsTextureView.this.onPortraitScaleListener;
                    Intrinsics.checkNotNull(onPortraitScaleListener);
                    onPortraitScaleListener.onScale(scaleFactor, detector);
                }
                XmsTextureView xmsTextureView = XmsTextureView.this;
                xmsTextureView.setTransform(xmsTextureView.useMatrix);
                XmsTextureView.this.postInvalidate();
                return true;
            }
        });
        this.mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.xiaomi.fitness.watch.face.view.XmsTextureView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                Intrinsics.checkNotNullParameter(e2, "e2");
                float f = -distanceX;
                float f2 = -distanceY;
                XmsTextureView.this.useMatrix.postTranslate(f, f2);
                XmsTextureView.this.validateSide();
                if (XmsTextureView.this.onPortraitScaleListener != null) {
                    OnPortraitScaleListener onPortraitScaleListener = XmsTextureView.this.onPortraitScaleListener;
                    Intrinsics.checkNotNull(onPortraitScaleListener);
                    onPortraitScaleListener.onMove(f, f2);
                }
                XmsTextureView xmsTextureView = XmsTextureView.this;
                xmsTextureView.setTransform(xmsTextureView.useMatrix);
                Logger.d(XmsTextureView.TAG, "onScroll: " + distanceX + "  " + distanceY);
                XmsTextureView.this.postInvalidate();
                return true;
            }
        });
    }
}
