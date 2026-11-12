package com.xiaomi.fitness.heartrate.ui.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Process;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Range;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 T2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003RSTB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0010J\u0010\u00101\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0004J\u0010\u00104\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00105\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0002J\u001a\u00106\u001a\u00020/2\u0006\u00102\u001a\u0002032\b\u00107\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u00108\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u0010H\u0002J\b\u0010:\u001a\u00020/H\u0002J\u000e\u0010;\u001a\u00020/2\u0006\u00100\u001a\u00020\tJ\b\u0010<\u001a\u00020/H\u0014J\u0006\u0010=\u001a\u00020/J\b\u0010>\u001a\u00020/H\u0002J\b\u0010?\u001a\u00020/H\u0002J\u0010\u0010@\u001a\u00020/2\b\u0010A\u001a\u0004\u0018\u00010*J\u0010\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020\rH\u0016J(\u0010D\u001a\u00020/2\u0006\u0010C\u001a\u00020\r2\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\tH\u0016J\u0010\u0010H\u001a\u00020/2\u0006\u0010C\u001a\u00020\rH\u0016J\u0006\u0010I\u001a\u00020/J\b\u0010J\u001a\u00020/H\u0016J\u0006\u0010K\u001a\u00020/J,\u0010L\u001a\u00020/2!\u0010M\u001a\u001d\u0012\u0013\u0012\u001103¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/0NH\u0082\bJ\b\u0010Q\u001a\u00020/H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010(\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/view/TwinkleView;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "Ljava/lang/Runnable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mHolder", "Landroid/view/SurfaceHolder;", "mPointCount", "mStartPosition", "", "mRedSmallPaint", "Landroid/graphics/Paint;", "mRedBigPaint", "mWhiteBlurPaint", "mWhitePaint", "mMinArea", "Landroid/graphics/Rect;", "mPath", "Landroid/graphics/Path;", "mPointList", "Ljava/util/LinkedList;", "Lcom/xiaomi/fitness/heartrate/ui/view/LinePoint;", "mBrokenLinePointList", "Landroid/graphics/PointF;", "mDynamicPoint", "mFirstLineRange", "Landroid/util/Range;", "mPxPerVal", "mIsRun", "", "mXOffset", "mAlphaScale", "mScreenWidth", "mLineListenerRef", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/heartrate/ui/view/TwinkleView$OnLineAnimationListener;", "mTargetPointIndex", "mPercentValue", "Lcom/xiaomi/fitness/heartrate/ui/view/TwinkleView$AnimatorValue;", "valueUpdate", "", "value", "onDrawView", "canvas", "Landroid/graphics/Canvas;", "doDraw", "postDraw", "drawLineColorFill", "paint", "calculate", "x", "trimPointList", "setValue", "onDetachedFromWindow", BroadcastsKt.SILENT_PUSHING_STOP, "reset", "startCanvasDraw", "setOnLineAnimationListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "surfaceCreated", "holder", "surfaceChanged", "format", "width", "height", "surfaceDestroyed", "endStage", "run", "clearCanvas", "draw", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "drawBackground", "OnLineAnimationListener", "AnimatorValue", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTwinkleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwinkleView.kt\ncom/xiaomi/fitness/heartrate/ui/view/TwinkleView\n*L\n1#1,379:1\n308#1,14:380\n308#1,14:394\n308#1,14:408\n308#1,14:422\n*S KotlinDebug\n*F\n+ 1 TwinkleView.kt\ncom/xiaomi/fitness/heartrate/ui/view/TwinkleView\n*L\n276#1:380,14\n287#1:394,14\n302#1:408,14\n324#1:422,14\n*E\n"})
public final class TwinkleView extends SurfaceView implements SurfaceHolder.Callback, Runnable {
    private static final int MAX_DETECT_TIME = 15;
    private static final int MAX_POINT_NUM = 155;
    private static final int MAX_VALUE = 255;
    private static final int MIN_VALUE = -255;

    @NotNull
    public static final String TAG = "TwinkleView";
    private static final int TOTAL_PPG_NUM = 165;
    private float mAlphaScale;

    @NotNull
    private final LinkedList<PointF> mBrokenLinePointList;

    @Nullable
    private PointF mDynamicPoint;

    @Nullable
    private Range<Float> mFirstLineRange;
    private SurfaceHolder mHolder;
    private volatile boolean mIsRun;

    @Nullable
    private WeakReference<OnLineAnimationListener> mLineListenerRef;

    @Nullable
    private Rect mMinArea;

    @Nullable
    private Path mPath;

    @Nullable
    private AnimatorValue mPercentValue;
    private int mPointCount;

    @NotNull
    private final LinkedList<LinePoint> mPointList;
    private float mPxPerVal;

    @Nullable
    private Paint mRedBigPaint;

    @Nullable
    private Paint mRedSmallPaint;
    private int mScreenWidth;
    private float mStartPosition;
    private int mTargetPointIndex;

    @Nullable
    private Paint mWhiteBlurPaint;

    @Nullable
    private Paint mWhitePaint;
    private final float mXOffset;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u00020\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/view/TwinkleView$AnimatorValue;", "", "<init>", "()V", "startValue", "", "getStartValue", "()F", "setStartValue", "(F)V", "endValue", "getEndValue", "setEndValue", "curValue", "getCurValue", "setCurValue", "valueStep", "getValueStep", "setValueStep", "animatorType", "", "getAnimatorType", "()I", "setAnimatorType", "(I)V", "reset", "", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnimatorValue {
        public static final int INFINITE = -1;
        public static final int ONCE = 1;
        private float curValue;
        private float startValue;
        private float endValue = 1.0f;
        private float valueStep = 0.5f;
        private int animatorType = -1;

        public AnimatorValue() {
            reset();
        }

        public final int getAnimatorType() {
            return this.animatorType;
        }

        public final float getCurValue() {
            float f = this.curValue;
            float f2 = this.endValue;
            if (f >= f2) {
                this.curValue = this.startValue;
                return f2;
            }
            this.curValue = this.valueStep + f;
            return f;
        }

        public final float getEndValue() {
            return this.endValue;
        }

        public final float getStartValue() {
            return this.startValue;
        }

        public final float getValueStep() {
            return this.valueStep;
        }

        public final void reset() {
            this.curValue = this.startValue;
        }

        public final void setAnimatorType(int i) {
            this.animatorType = i;
        }

        public final void setCurValue(float f) {
            this.curValue = f;
        }

        public final void setEndValue(float f) {
            this.endValue = f;
        }

        public final void setStartValue(float f) {
            this.startValue = f;
        }

        public final void setValueStep(float f) {
            this.valueStep = f;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/view/TwinkleView$OnLineAnimationListener;", "", "onLineAnimationFinished", "", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnLineAnimationListener {
        void onLineAnimationFinished();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TwinkleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final float calculate(float x) {
        return (float) (Math.pow(Math.sin(x), 0.5d) * ((double) 0.8f));
    }

    private final void doDraw(Canvas canvas) {
        if (this.mPointList.isEmpty()) {
            return;
        }
        trimPointList();
        drawLineColorFill(canvas, this.mRedSmallPaint);
        drawLineColorFill(canvas, this.mRedBigPaint);
        drawLineColorFill(canvas, this.mWhitePaint);
        drawLineColorFill(canvas, this.mWhiteBlurPaint);
        int size = this.mBrokenLinePointList.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = this.mBrokenLinePointList.get(i);
            Intrinsics.checkNotNullExpressionValue(pointF, "get(...)");
            pointF.x += this.mXOffset;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    private final void draw(Function1<? super Canvas, Unit> block) throws Throwable {
        Canvas canvasLockCanvas;
        SurfaceHolder surfaceHolder;
        SurfaceHolder surfaceHolder2 = null;
        try {
            SurfaceHolder surfaceHolder3 = this.mHolder;
            if (surfaceHolder3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                surfaceHolder3 = null;
            }
            canvasLockCanvas = surfaceHolder3.lockCanvas();
            if (canvasLockCanvas != null) {
                try {
                    try {
                        block.invoke2(canvasLockCanvas);
                    } catch (Exception e) {
                        e = e;
                        Logger.e("Canvas draw exception, " + e, new Object[0]);
                        InlineMarker.finallyStart(1);
                        if (canvasLockCanvas != null) {
                            SurfaceHolder surfaceHolder4 = this.mHolder;
                            if (surfaceHolder4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                            } else {
                                surfaceHolder2 = surfaceHolder4;
                            }
                        }
                        InlineMarker.finallyEnd(1);
                    }
                } catch (Throwable th) {
                    th = th;
                    InlineMarker.finallyStart(1);
                    if (canvasLockCanvas != null) {
                        surfaceHolder = this.mHolder;
                        if (surfaceHolder == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                        } else {
                            surfaceHolder2 = surfaceHolder;
                        }
                        surfaceHolder2.unlockCanvasAndPost(canvasLockCanvas);
                    }
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyStart(1);
            if (canvasLockCanvas != null) {
                SurfaceHolder surfaceHolder5 = this.mHolder;
                if (surfaceHolder5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                } else {
                    surfaceHolder2 = surfaceHolder5;
                }
                surfaceHolder2.unlockCanvasAndPost(canvasLockCanvas);
            }
        } catch (Exception e2) {
            e = e2;
            canvasLockCanvas = null;
        } catch (Throwable th2) {
            th = th2;
            canvasLockCanvas = null;
            InlineMarker.finallyStart(1);
            if (canvasLockCanvas != null) {
                surfaceHolder = this.mHolder;
                if (surfaceHolder == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                } else {
                    surfaceHolder2 = surfaceHolder;
                }
                surfaceHolder2.unlockCanvasAndPost(canvasLockCanvas);
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
        InlineMarker.finallyEnd(1);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    private final void drawBackground() throws Throwable {
        Canvas canvasLockCanvas;
        Canvas canvas;
        SurfaceHolder surfaceHolder;
        SurfaceHolder surfaceHolder2 = null;
        try {
            SurfaceHolder surfaceHolder3 = this.mHolder;
            if (surfaceHolder3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                surfaceHolder3 = null;
            }
            canvasLockCanvas = surfaceHolder3.lockCanvas();
            if (canvasLockCanvas != null) {
                try {
                    canvasLockCanvas.drawColor(0);
                } catch (Exception e) {
                    canvas = canvasLockCanvas;
                    e = e;
                    try {
                        Logger.e("Canvas draw exception, " + e, new Object[0]);
                        if (canvas != null) {
                            SurfaceHolder surfaceHolder4 = this.mHolder;
                            if (surfaceHolder4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                            } else {
                                surfaceHolder2 = surfaceHolder4;
                            }
                            surfaceHolder2.unlockCanvasAndPost(canvas);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        canvasLockCanvas = canvas;
                        if (canvasLockCanvas != null) {
                            surfaceHolder = this.mHolder;
                            if (surfaceHolder == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                            } else {
                                surfaceHolder2 = surfaceHolder;
                            }
                            surfaceHolder2.unlockCanvasAndPost(canvasLockCanvas);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (canvasLockCanvas != null) {
                        surfaceHolder = this.mHolder;
                        if (surfaceHolder == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                        } else {
                            surfaceHolder2 = surfaceHolder;
                        }
                        surfaceHolder2.unlockCanvasAndPost(canvasLockCanvas);
                    }
                    throw th;
                }
            }
            if (canvasLockCanvas != null) {
                SurfaceHolder surfaceHolder5 = this.mHolder;
                if (surfaceHolder5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                } else {
                    surfaceHolder2 = surfaceHolder5;
                }
                surfaceHolder2.unlockCanvasAndPost(canvasLockCanvas);
            }
        } catch (Exception e2) {
            e = e2;
            canvas = null;
        } catch (Throwable th3) {
            th = th3;
            canvasLockCanvas = null;
        }
    }

    private final void drawLineColorFill(Canvas canvas, Paint paint) {
        int size = this.mBrokenLinePointList.size();
        int i = size - 1;
        int i2 = 0;
        while (i2 < i) {
            PointF pointF = this.mBrokenLinePointList.get(i2);
            Intrinsics.checkNotNullExpressionValue(pointF, "get(...)");
            PointF pointF2 = pointF;
            int i3 = i2 + 1;
            PointF pointF3 = this.mBrokenLinePointList.get(i3);
            if (pointF3 != null) {
                float f = pointF2.x;
                float f2 = pointF2.y;
                float f3 = pointF3.x;
                float f4 = pointF3.y;
                float fCalculate = calculate((i2 * 1.0f) / size) * 20;
                Intrinsics.checkNotNull(paint);
                paint.setStrokeWidth(fCalculate);
                canvas.drawLine(f, f2, f3, f4, paint);
            }
            i2 = i3;
        }
    }

    private final void postDraw(Canvas canvas) {
        trimPointList();
        Path path = this.mPath;
        Intrinsics.checkNotNull(path);
        path.reset();
        int size = this.mBrokenLinePointList.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = this.mBrokenLinePointList.get(i);
            if (pointF != null) {
                Path path2 = this.mPath;
                Intrinsics.checkNotNull(path2);
                if (path2.isEmpty()) {
                    Path path3 = this.mPath;
                    Intrinsics.checkNotNull(path3);
                    path3.moveTo(pointF.x, pointF.y);
                } else {
                    Path path4 = this.mPath;
                    Intrinsics.checkNotNull(path4);
                    path4.lineTo(pointF.x, pointF.y);
                }
            }
        }
        float f = 10 * this.mAlphaScale;
        Paint paint = this.mRedSmallPaint;
        Intrinsics.checkNotNull(paint);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.mRedSmallPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setStrokeWidth(f);
        Path path5 = this.mPath;
        Intrinsics.checkNotNull(path5);
        Paint paint3 = this.mRedSmallPaint;
        Intrinsics.checkNotNull(paint3);
        canvas.drawPath(path5, paint3);
        Paint paint4 = this.mRedBigPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setStyle(style);
        Paint paint5 = this.mRedBigPaint;
        Intrinsics.checkNotNull(paint5);
        paint5.setStrokeWidth(f);
        Path path6 = this.mPath;
        Intrinsics.checkNotNull(path6);
        Paint paint6 = this.mRedBigPaint;
        Intrinsics.checkNotNull(paint6);
        canvas.drawPath(path6, paint6);
        Paint paint7 = this.mWhitePaint;
        Intrinsics.checkNotNull(paint7);
        paint7.setStyle(style);
        Paint paint8 = this.mWhitePaint;
        Intrinsics.checkNotNull(paint8);
        paint8.setStrokeWidth(f);
        Path path7 = this.mPath;
        Intrinsics.checkNotNull(path7);
        Paint paint9 = this.mWhitePaint;
        Intrinsics.checkNotNull(paint9);
        canvas.drawPath(path7, paint9);
        Paint paint10 = this.mWhiteBlurPaint;
        Intrinsics.checkNotNull(paint10);
        paint10.setStyle(style);
        Paint paint11 = this.mWhiteBlurPaint;
        Intrinsics.checkNotNull(paint11);
        paint11.setStrokeWidth(f);
        Path path8 = this.mPath;
        Intrinsics.checkNotNull(path8);
        Paint paint12 = this.mWhiteBlurPaint;
        Intrinsics.checkNotNull(paint12);
        canvas.drawPath(path8, paint12);
        int size2 = this.mBrokenLinePointList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            PointF pointF2 = this.mBrokenLinePointList.get(i2);
            Intrinsics.checkNotNullExpressionValue(pointF2, "get(...)");
            pointF2.x += this.mXOffset;
        }
    }

    private final void reset() {
        this.mTargetPointIndex = 0;
        this.mPointCount = 0;
        this.mPointList.clear();
        this.mBrokenLinePointList.clear();
        PointF pointF = this.mDynamicPoint;
        if (pointF != null) {
            Intrinsics.checkNotNull(pointF);
            pointF.x = this.mStartPosition;
            PointF pointF2 = this.mDynamicPoint;
            Intrinsics.checkNotNull(pointF2);
            Rect rect = this.mMinArea;
            Intrinsics.checkNotNull(rect);
            pointF2.y = rect.centerY();
        }
    }

    private final void startCanvasDraw() {
        this.mIsRun = true;
        new Thread(this).start();
    }

    private final void trimPointList() {
        Iterator<PointF> it = this.mBrokenLinePointList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            PointF next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            if (next.x >= this.mScreenWidth * 0.25f) {
                return;
            } else {
                it.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    public final void clearCanvas() throws Throwable {
        Canvas canvas;
        SurfaceHolder surfaceHolder;
        SurfaceHolder surfaceHolder2 = null;
        try {
            SurfaceHolder surfaceHolder3 = this.mHolder;
            if (surfaceHolder3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                surfaceHolder3 = null;
            }
            Canvas canvasLockCanvas = surfaceHolder3.lockCanvas();
            if (canvasLockCanvas != null) {
                try {
                    canvasLockCanvas.drawColor(-1, PorterDuff.Mode.CLEAR);
                } catch (Exception e) {
                    canvas = canvasLockCanvas;
                    e = e;
                    try {
                        Logger.e("Canvas draw exception, " + e, new Object[0]);
                        if (canvas != null) {
                            SurfaceHolder surfaceHolder4 = this.mHolder;
                            if (surfaceHolder4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                            } else {
                                surfaceHolder2 = surfaceHolder4;
                            }
                            surfaceHolder2.unlockCanvasAndPost(canvas);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (canvas != null) {
                            surfaceHolder = this.mHolder;
                            if (surfaceHolder == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                            } else {
                                surfaceHolder2 = surfaceHolder;
                            }
                            surfaceHolder2.unlockCanvasAndPost(canvas);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    canvas = canvasLockCanvas;
                    th = th2;
                    if (canvas != null) {
                        surfaceHolder = this.mHolder;
                        if (surfaceHolder == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                        } else {
                            surfaceHolder2 = surfaceHolder;
                        }
                        surfaceHolder2.unlockCanvasAndPost(canvas);
                    }
                    throw th;
                }
            }
            if (canvasLockCanvas != null) {
                SurfaceHolder surfaceHolder5 = this.mHolder;
                if (surfaceHolder5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                } else {
                    surfaceHolder2 = surfaceHolder5;
                }
                surfaceHolder2.unlockCanvasAndPost(canvasLockCanvas);
            }
        } catch (Exception e2) {
            e = e2;
            canvas = null;
        } catch (Throwable th3) {
            th = th3;
            canvas = null;
        }
    }

    public final void endStage() {
        this.mTargetPointIndex = 155;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    public final void onDrawView(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = (int) (-this.mXOffset);
        Rect rect = this.mMinArea;
        Intrinsics.checkNotNull(rect);
        rect.set(getPaddingLeft() + i, getPaddingTop() + 40, (getWidth() - getPaddingEnd()) + i, (getHeight() - getPaddingBottom()) - 40);
        Rect rect2 = this.mMinArea;
        Intrinsics.checkNotNull(rect2);
        this.mPxPerVal = (rect2.height() * 1.0f) / 510;
        Rect rect3 = this.mMinArea;
        Intrinsics.checkNotNull(rect3);
        float f = rect3.left;
        Rect rect4 = this.mMinArea;
        Intrinsics.checkNotNull(rect4);
        float fWidth = f + (rect4.width() * 0.1f);
        Rect rect5 = this.mMinArea;
        Intrinsics.checkNotNull(rect5);
        float f2 = rect5.left;
        Rect rect6 = this.mMinArea;
        Intrinsics.checkNotNull(rect6);
        float fWidth2 = f2 + (rect6.width() * 0.66f);
        if (this.mFirstLineRange == null) {
            this.mFirstLineRange = Range.create(Float.valueOf(fWidth), Float.valueOf(fWidth2));
        }
        doDraw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0121  */
    /* JADX WARN: Code duplicated, block: B:84:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x0129  */
    @Override // java.lang.Runnable
    public void run() throws Throwable {
        Canvas canvasLockCanvas;
        Canvas canvas;
        SurfaceHolder surfaceHolder;
        Canvas canvasLockCanvas2;
        Canvas canvas2;
        SurfaceHolder surfaceHolder2;
        Process.setThreadPriority(-1);
        while (this.mIsRun) {
            int size = this.mPointList.size();
            int i = this.mTargetPointIndex;
            SurfaceHolder surfaceHolder3 = null;
            if (size > i) {
                try {
                    SurfaceHolder surfaceHolder4 = this.mHolder;
                    if (surfaceHolder4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                        surfaceHolder4 = null;
                    }
                    canvasLockCanvas2 = surfaceHolder4.lockCanvas();
                    if (canvasLockCanvas2 != null) {
                        try {
                            canvasLockCanvas2.drawColor(-1, PorterDuff.Mode.CLEAR);
                            onDrawView(canvasLockCanvas2);
                            AnimatorValue animatorValue = this.mPercentValue;
                            Intrinsics.checkNotNull(animatorValue);
                            valueUpdate(animatorValue.getCurValue());
                            Thread.sleep(18L);
                        } catch (Exception e) {
                            canvas2 = canvasLockCanvas2;
                            e = e;
                            try {
                                Logger.e("Canvas draw exception, " + e, new Object[0]);
                                if (canvas2 != null) {
                                    SurfaceHolder surfaceHolder5 = this.mHolder;
                                    if (surfaceHolder5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                                    } else {
                                        surfaceHolder3 = surfaceHolder5;
                                    }
                                    surfaceHolder3.unlockCanvasAndPost(canvas2);
                                }
                            } catch (Throwable th) {
                                th = th;
                                canvasLockCanvas2 = canvas2;
                                if (canvasLockCanvas2 != null) {
                                    surfaceHolder2 = this.mHolder;
                                    if (surfaceHolder2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                                    } else {
                                        surfaceHolder3 = surfaceHolder2;
                                    }
                                    surfaceHolder3.unlockCanvasAndPost(canvasLockCanvas2);
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (canvasLockCanvas2 != null) {
                                surfaceHolder2 = this.mHolder;
                                if (surfaceHolder2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                                } else {
                                    surfaceHolder3 = surfaceHolder2;
                                }
                                surfaceHolder3.unlockCanvasAndPost(canvasLockCanvas2);
                            }
                            throw th;
                        }
                    }
                    if (canvasLockCanvas2 != null) {
                        SurfaceHolder surfaceHolder6 = this.mHolder;
                        if (surfaceHolder6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                        } else {
                            surfaceHolder3 = surfaceHolder6;
                        }
                        surfaceHolder3.unlockCanvasAndPost(canvasLockCanvas2);
                    }
                } catch (Exception e2) {
                    e = e2;
                    canvas2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    canvasLockCanvas2 = null;
                }
            } else if (i < 155) {
                continue;
            } else {
                WeakReference<OnLineAnimationListener> weakReference = this.mLineListenerRef;
                if (weakReference != null) {
                    Intrinsics.checkNotNull(weakReference);
                    if (weakReference.get() != null) {
                        WeakReference<OnLineAnimationListener> weakReference2 = this.mLineListenerRef;
                        Intrinsics.checkNotNull(weakReference2);
                        OnLineAnimationListener onLineAnimationListener = weakReference2.get();
                        Intrinsics.checkNotNull(onLineAnimationListener);
                        onLineAnimationListener.onLineAnimationFinished();
                    }
                }
                while (this.mAlphaScale >= 0.0f) {
                    try {
                        SurfaceHolder surfaceHolder7 = this.mHolder;
                        if (surfaceHolder7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                            surfaceHolder7 = null;
                        }
                        canvasLockCanvas = surfaceHolder7.lockCanvas();
                        if (canvasLockCanvas != null) {
                            try {
                                canvasLockCanvas.drawColor(-1, PorterDuff.Mode.CLEAR);
                                postDraw(canvasLockCanvas);
                                Thread.sleep(15L);
                                this.mAlphaScale -= 0.04f;
                            } catch (Exception e3) {
                                canvas = canvasLockCanvas;
                                e = e3;
                                try {
                                    Logger.e("Canvas draw exception, " + e, new Object[0]);
                                    if (canvas != null) {
                                        SurfaceHolder surfaceHolder8 = this.mHolder;
                                        if (surfaceHolder8 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                                            surfaceHolder8 = null;
                                        }
                                        surfaceHolder8.unlockCanvasAndPost(canvas);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    canvasLockCanvas = canvas;
                                    if (canvasLockCanvas != null) {
                                        surfaceHolder = this.mHolder;
                                        if (surfaceHolder == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                                        } else {
                                            surfaceHolder3 = surfaceHolder;
                                        }
                                        surfaceHolder3.unlockCanvasAndPost(canvasLockCanvas);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                if (canvasLockCanvas != null) {
                                    surfaceHolder = this.mHolder;
                                    if (surfaceHolder == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                                    } else {
                                        surfaceHolder3 = surfaceHolder;
                                    }
                                    surfaceHolder3.unlockCanvasAndPost(canvasLockCanvas);
                                }
                                throw th;
                            }
                        }
                        if (canvasLockCanvas != null) {
                            SurfaceHolder surfaceHolder9 = this.mHolder;
                            if (surfaceHolder9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mHolder");
                                surfaceHolder9 = null;
                            }
                            surfaceHolder9.unlockCanvasAndPost(canvasLockCanvas);
                        }
                    } catch (Exception e4) {
                        e = e4;
                        canvas = null;
                    } catch (Throwable th6) {
                        th = th6;
                        canvasLockCanvas = null;
                    }
                }
                this.mIsRun = false;
            }
        }
        reset();
        clearCanvas();
    }

    public final void setOnLineAnimationListener(@Nullable OnLineAnimationListener listener) {
        this.mLineListenerRef = new WeakReference<>(listener);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0004 A[PHI: r0
      0x0004: PHI (r0v4 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0002, B:6:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    public final void setValue(int value) {
        int i = -255;
        if (value < -255) {
            value = i;
        } else {
            i = 255;
            if (value > 255) {
                value = i;
            }
        }
        float f = this.mStartPosition;
        Rect rect = this.mMinArea;
        Intrinsics.checkNotNull(rect);
        float f2 = rect.bottom - ((value + 255) * this.mPxPerVal);
        int i2 = this.mPointCount;
        this.mPointCount = i2 + 1;
        LinePoint linePoint = new LinePoint(value, i2);
        linePoint.setX(f);
        linePoint.setY(f2);
        this.mPointList.addLast(linePoint);
        if (this.mPointList.size() == 1) {
            startCanvasDraw();
        }
    }

    public final void stop() {
        this.mIsRun = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NotNull SurfaceHolder holder, int format, int width, int height) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Rect rect = this.mMinArea;
        Intrinsics.checkNotNull(rect);
        rect.set(getPaddingLeft(), getPaddingTop() + 40, getWidth() - getPaddingEnd(), (getHeight() - getPaddingBottom()) - 40);
        Rect rect2 = this.mMinArea;
        Intrinsics.checkNotNull(rect2);
        this.mPxPerVal = (rect2.height() * 1.0f) / 510;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NotNull SurfaceHolder holder) throws Throwable {
        Intrinsics.checkNotNullParameter(holder, "holder");
        drawBackground();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NotNull SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        stop();
    }

    public final void valueUpdate(float value) {
        if (this.mDynamicPoint == null) {
            float f = this.mStartPosition;
            Rect rect = this.mMinArea;
            Intrinsics.checkNotNull(rect);
            this.mDynamicPoint = new PointF(f, rect.centerY());
            LinkedList<PointF> linkedList = this.mBrokenLinePointList;
            PointF pointF = this.mDynamicPoint;
            Intrinsics.checkNotNull(pointF);
            float f2 = pointF.x;
            PointF pointF2 = this.mDynamicPoint;
            Intrinsics.checkNotNull(pointF2);
            linkedList.add(new PointF(f2, pointF2.y));
        }
        if (this.mTargetPointIndex < 165) {
            int size = this.mPointList.size();
            int i = this.mTargetPointIndex;
            if (size > i) {
                LinePoint linePoint = this.mPointList.get(i);
                Intrinsics.checkNotNullExpressionValue(linePoint, "get(...)");
                PointF pointF3 = this.mDynamicPoint;
                Intrinsics.checkNotNull(pointF3);
                PointF pointF4 = this.mDynamicPoint;
                Intrinsics.checkNotNull(pointF4);
                float f3 = pointF4.y;
                float y = linePoint.getY();
                PointF pointF5 = this.mDynamicPoint;
                Intrinsics.checkNotNull(pointF5);
                pointF3.y = f3 + ((y - pointF5.y) * value);
                LinkedList<PointF> linkedList2 = this.mBrokenLinePointList;
                PointF pointF6 = this.mDynamicPoint;
                Intrinsics.checkNotNull(pointF6);
                float f4 = pointF6.x;
                PointF pointF7 = this.mDynamicPoint;
                Intrinsics.checkNotNull(pointF7);
                linkedList2.add(new PointF(f4, pointF7.y));
            }
        }
        if (value >= 1.0f) {
            this.mTargetPointIndex++;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TwinkleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TwinkleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TwinkleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mStartPosition = 400.0f;
        this.mPointList = new LinkedList<>();
        this.mBrokenLinePointList = new LinkedList<>();
        this.mXOffset = -18.0f;
        this.mAlphaScale = 1.0f;
        SurfaceHolder surfaceHolder = null;
        setLayerType(1, null);
        SurfaceHolder holder = getHolder();
        this.mHolder = holder;
        if (holder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHolder");
            holder = null;
        }
        holder.setFormat(-3);
        SurfaceHolder surfaceHolder2 = this.mHolder;
        if (surfaceHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHolder");
        } else {
            surfaceHolder = surfaceHolder2;
        }
        surfaceHolder.addCallback(this);
        setZOrderOnTop(true);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        this.mScreenWidth = i2;
        this.mStartPosition = i2 - (i2 * 0.28f);
        Paint paint = new Paint(1);
        this.mRedSmallPaint = paint;
        Intrinsics.checkNotNull(paint);
        paint.setColor(MenuBuilder.CATEGORY_MASK);
        Paint paint2 = this.mRedSmallPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setDither(true);
        Paint paint3 = this.mRedSmallPaint;
        Intrinsics.checkNotNull(paint3);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = this.mRedSmallPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setStrokeWidth(30.0f);
        Paint paint5 = this.mRedSmallPaint;
        Intrinsics.checkNotNull(paint5);
        Paint.Join join = Paint.Join.MITER;
        paint5.setStrokeJoin(join);
        Paint paint6 = this.mRedSmallPaint;
        Intrinsics.checkNotNull(paint6);
        paint6.setStyle(Paint.Style.STROKE);
        Paint paint7 = this.mRedSmallPaint;
        Intrinsics.checkNotNull(paint7);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint7.setMaskFilter(new BlurMaskFilter(40.0f, blur));
        Paint paint8 = new Paint(this.mRedSmallPaint);
        this.mRedBigPaint = paint8;
        Intrinsics.checkNotNull(paint8);
        paint8.setStrokeWidth(40.0f);
        Paint paint9 = this.mRedBigPaint;
        Intrinsics.checkNotNull(paint9);
        paint9.setMaskFilter(new BlurMaskFilter(60.0f, blur));
        Paint paint10 = new Paint(1);
        this.mWhiteBlurPaint = paint10;
        Intrinsics.checkNotNull(paint10);
        paint10.setColor(-1);
        Paint paint11 = this.mWhiteBlurPaint;
        Intrinsics.checkNotNull(paint11);
        paint11.setStrokeWidth(20.0f);
        Paint paint12 = this.mWhiteBlurPaint;
        Intrinsics.checkNotNull(paint12);
        paint12.setDither(true);
        Paint paint13 = this.mWhiteBlurPaint;
        Intrinsics.checkNotNull(paint13);
        paint13.setStrokeJoin(join);
        Paint paint14 = this.mWhiteBlurPaint;
        Intrinsics.checkNotNull(paint14);
        paint14.setStyle(Paint.Style.FILL);
        Paint paint15 = this.mWhiteBlurPaint;
        Intrinsics.checkNotNull(paint15);
        paint15.setStrokeCap(cap);
        Paint paint16 = this.mWhiteBlurPaint;
        Intrinsics.checkNotNull(paint16);
        paint16.setMaskFilter(new BlurMaskFilter(20.0f, blur));
        this.mWhitePaint = new Paint(this.mWhiteBlurPaint);
        Paint paint17 = this.mWhiteBlurPaint;
        Intrinsics.checkNotNull(paint17);
        paint17.setColor(Color.parseColor("#ffffffff"));
        Paint paint18 = this.mWhitePaint;
        Intrinsics.checkNotNull(paint18);
        paint18.setMaskFilter(new BlurMaskFilter(2.0f, blur));
        this.mMinArea = new Rect(0, 0, 1024, 100);
        this.mPath = new Path();
        this.mPercentValue = new AnimatorValue();
    }
}
