package com.huami.watchfacesstore.view.clip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.TransportUri;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.loc.z;
import com.xiaomi.hm.health.speech.utils.JsonParseUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.c;
import kotlin.ranges.e;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 g2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001gB\u001f\b\u0007\u0012\b\u0010b\u001a\u0004\u0018\u00010a\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010c¢\u0006\u0004\be\u0010fJ(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0002J7\u0010\u0018\u001a\u00020\f2/\u0010\u0017\u001a+\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\fH\u0014J\b\u0010$\u001a\u00020\fH\u0014J\b\u0010%\u001a\u00020\fH\u0016J\b\u0010'\u001a\u0004\u0018\u00010&J\u001a\u0010)\u001a\u00020\f2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013J\u000e\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0005R\u0016\u0010-\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010,R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010,R\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010,R\u0016\u0010F\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00101R\u0016\u0010H\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010?R\u0016\u0010J\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010?R\u0016\u0010L\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010?R\u0016\u0010N\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010?R\u0016\u0010P\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010?R\u0016\u0010R\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010?R\u0016\u0010T\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010?R\u0016\u0010V\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010?R?\u0010Y\u001a+\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010]\u001a\u00020Z8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0016\u0010`\u001a\u00020\b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006h"}, d2 = {"Lcom/huami/watchfacesstore/view/clip/ClipZoomImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "Landroid/view/View$OnTouchListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "dw", "dh", "", "calW", "calH", "b", "", "a", "dx", "dy", "", "c", "Lkotlin/Function1;", "Lkotlin/Pair;", "Lkotlin/ParameterName;", "name", "size", TransportUri.ACTION_BLOCK, "setOnSizeChangeListener", "Landroid/view/ScaleGestureDetector;", "detector", "onScale", "onScaleBegin", "onScaleEnd", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "event", "onTouch", "onAttachedToWindow", "onDetachedFromWindow", "onGlobalLayout", "Landroid/graphics/Bitmap;", "clip", "pair", "setClipWidthAndHeight", "horizontalPadding", "setHorizontalPadding", "F", "originScale", "scaleMin", "scaleMax", GoogleApiAvailabilityLight.a, "Z", JsonParseUtils.CIRCLE_ONCE, "", "e", "[F", "matrixValues", "f", "Landroid/view/ScaleGestureDetector;", "mScaleGestureDetector", "Landroid/graphics/Matrix;", "g", "Landroid/graphics/Matrix;", "mScaleMatrix", "h", LogUtil.I, "mTouchSlop", "i", "mLastX", z.j, "mLastY", hl.k, "isCanDrag", "l", "lastPointerCount", "m", "mCropMode", GoogleApiAvailabilityLight.b, "mHorizontalPadding", "o", "mHorizontalScalePadding", b.r, "mVerticalPadding", DTransferConstants.SEARCH_KEY, "mVerticalScalePadding", "r", "clipWidth", SOAP.XMLNS, "clipHeight", "t", "Lkotlin/jvm/functions/Function1;", "onSizeChangeListener", "Landroid/graphics/RectF;", "getMatrixRectF", "()Landroid/graphics/RectF;", "matrixRectF", "getScale", "()F", AnimatorViewWrapper.SCALE, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ClipZoomImageView extends AppCompatImageView implements ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {
    private static final String u = ClipZoomImageView.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float originScale;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float scaleMin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float scaleMax;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean once;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final float[] matrixValues;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private ScaleGestureDetector mScaleGestureDetector;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Matrix mScaleMatrix;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int mTouchSlop;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float mLastX;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float mLastY;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isCanDrag;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int lastPointerCount;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int mCropMode;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int mHorizontalPadding;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int mHorizontalScalePadding;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int mVerticalPadding;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int mVerticalScalePadding;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int clipWidth;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int clipHeight;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Pair<Integer, Integer>, Unit> onSizeChangeListener;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ClipZoomImageView(@Nullable Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ClipZoomImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void a() {
        float f;
        RectF matrixRectF = getMatrixRectF();
        int width = getWidth();
        int height = getHeight();
        double dWidth = ((double) matrixRectF.width()) + 0.01d;
        int i = this.mHorizontalScalePadding;
        float f2 = 0.0f;
        if (dWidth >= width - (i * 2)) {
            float f3 = matrixRectF.left;
            f = f3 > ((float) i) ? (-f3) + i : 0.0f;
            float f4 = matrixRectF.right;
            if (f4 < width - i) {
                f = (width - i) - f4;
            }
        } else {
            f = 0.0f;
        }
        double dHeight = ((double) matrixRectF.height()) + 0.01d;
        int i2 = this.mVerticalScalePadding;
        if (dHeight >= height - (i2 * 2)) {
            float f5 = matrixRectF.top;
            f2 = f5 > ((float) i2) ? (-f5) + i2 : 0.0f;
            float f6 = matrixRectF.bottom;
            if (f6 < height - i2) {
                f2 = (height - i2) - f6;
            }
        }
        this.mScaleMatrix.postTranslate(f, f2);
    }

    private final float b(int dw, int dh, float calW, float calH) {
        float f = dw;
        float f2 = (f >= calW || ((float) dh) <= calH) ? 1.0f : calW / f;
        float f3 = dh;
        if (f3 < calH && f > calW) {
            f2 = calH / f3;
        }
        return (f >= calW || f3 >= calH) ? f2 : e.coerceAtLeast(calW / f, calH / f3);
    }

    private final boolean c(float dx, float dy) {
        return Math.sqrt(((double) (dx * dx)) + ((double) (dy * dy))) >= ((double) this.mTouchSlop);
    }

    private final RectF getMatrixRectF() {
        Matrix matrix = this.mScaleMatrix;
        RectF rectF = new RectF();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(rectF);
        }
        return rectF;
    }

    private final float getScale() {
        this.mScaleMatrix.getValues(this.matrixValues);
        return this.matrixValues[0];
    }

    @Nullable
    public final Bitmap clip() {
        Bitmap bitmapCreateBitmap;
        setDrawingCacheEnabled(true);
        setDrawingCacheQuality(1048576);
        Bitmap drawingCache = getDrawingCache();
        int width = getWidth() - (this.mHorizontalScalePadding * 2);
        int height = getHeight();
        int i = this.mVerticalScalePadding;
        int i2 = height - (i * 2);
        if (drawingCache != null) {
            bitmapCreateBitmap = (width <= 0 || i2 <= 0) ? Bitmap.createBitmap(drawingCache) : Bitmap.createBitmap(drawingCache, this.mHorizontalScalePadding, i, width, i2);
            drawingCache.recycle();
            destroyDrawingCache();
        } else {
            bitmapCreateBitmap = null;
        }
        setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Drawable drawable;
        if (!this.once || (drawable = getDrawable()) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i = this.clipHeight;
        int i2 = this.clipWidth;
        float f = (i * 1.0f) / i2;
        if (i2 > width) {
            int dp = width - ExtensionsKt.getDp(20);
            this.clipWidth = dp;
            this.clipHeight = c.roundToInt(dp * f);
        } else if (i > height) {
            int dp2 = height - ExtensionsKt.getDp(60);
            this.clipHeight = dp2;
            this.clipWidth = c.roundToInt(dp2 / f);
        }
        Function1<? super Pair<Integer, Integer>, Unit> function1 = this.onSizeChangeListener;
        if (function1 != null) {
            function1.invoke(TuplesKt.to(Integer.valueOf(this.clipWidth), Integer.valueOf(this.clipHeight)));
        }
        int i3 = (width - this.clipWidth) / 2;
        this.mHorizontalScalePadding = i3;
        int i4 = (height - this.clipHeight) / 2;
        this.mVerticalScalePadding = i4;
        int i5 = this.mHorizontalPadding;
        int i6 = (height - (width - (i5 * 2))) / 2;
        this.mVerticalPadding = i6;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.originScale = b(intrinsicWidth, intrinsicHeight, width - (i5 * 2), height - (i6 * 2));
        float fB = b(intrinsicWidth, intrinsicHeight, width - (i3 * 2), height - (i4 * 2));
        this.scaleMin = fB;
        this.scaleMax = fB * 4;
        this.mScaleMatrix.postTranslate((width - intrinsicWidth) / 2.0f, (height - intrinsicHeight) / 2.0f);
        int i7 = this.mCropMode;
        if (i7 == 0) {
            Matrix matrix = this.mScaleMatrix;
            float f2 = this.originScale;
            matrix.postScale(f2, f2, width / 2.0f, height / 2.0f);
        } else if (i7 == 1) {
            Matrix matrix2 = this.mScaleMatrix;
            float f3 = this.originScale;
            matrix2.postScale(f3, f3, width / 2.0f, height / 2.0f);
        }
        setImageMatrix(this.mScaleMatrix);
        this.once = false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(@NotNull ScaleGestureDetector detector) {
        float scale = getScale();
        float scaleFactor = detector.getScaleFactor();
        if (getDrawable() == null) {
            return true;
        }
        float f = this.scaleMax;
        if ((scale < f && scaleFactor > 1.0f) || (scale > this.scaleMin && scaleFactor < 1.0f)) {
            float f2 = scaleFactor * scale;
            float f3 = this.scaleMin;
            if (f2 < f3) {
                scaleFactor = f3 / scale;
            }
            if (scaleFactor * scale > f) {
                scaleFactor = f / scale;
            }
            this.mScaleMatrix.postScale(scaleFactor, scaleFactor, detector.getFocusX(), detector.getFocusY());
            a();
            setImageMatrix(this.mScaleMatrix);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(@NotNull ScaleGestureDetector detector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(@NotNull ScaleGestureDetector detector) {
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View v, @NotNull MotionEvent event) {
        float x;
        float y;
        this.mScaleGestureDetector.onTouchEvent(event);
        int pointerCount = event.getPointerCount();
        if (pointerCount > 0) {
            int i = 0;
            x = 0.0f;
            y = 0.0f;
            while (true) {
                int i2 = i + 1;
                x += event.getX(i);
                y += event.getY(i);
                if (i2 >= pointerCount) {
                    break;
                }
                i = i2;
            }
        } else {
            x = 0.0f;
            y = 0.0f;
        }
        float f = pointerCount;
        float f2 = x / f;
        float f3 = y / f;
        if (pointerCount != this.lastPointerCount) {
            this.isCanDrag = false;
            this.mLastX = f2;
            this.mLastY = f3;
        }
        this.lastPointerCount = pointerCount;
        int action = event.getAction();
        if (action == 1) {
            this.lastPointerCount = 0;
        } else if (action == 2) {
            float f4 = f2 - this.mLastX;
            float f5 = f3 - this.mLastY;
            if (!this.isCanDrag) {
                this.isCanDrag = c(f4, f5);
            }
            if (this.isCanDrag && getDrawable() != null) {
                RectF matrixRectF = getMatrixRectF();
                if (matrixRectF.width() <= getWidth() - (this.mHorizontalScalePadding * 2)) {
                    f4 = 0.0f;
                }
                this.mScaleMatrix.postTranslate(f4, matrixRectF.height() > ((float) (getHeight() - (this.mVerticalScalePadding * 2))) ? f5 : 0.0f);
                a();
                setImageMatrix(this.mScaleMatrix);
            }
            this.mLastX = f2;
            this.mLastY = f3;
        } else if (action == 3) {
            this.lastPointerCount = 0;
        }
        return true;
    }

    public final void setClipWidthAndHeight(@NotNull Pair<Integer, Integer> pair) {
        this.clipWidth = pair.getFirst().intValue();
        this.clipHeight = pair.getSecond().intValue();
    }

    public final void setHorizontalPadding(int horizontalPadding) {
        this.mHorizontalPadding = horizontalPadding;
    }

    public final void setOnSizeChangeListener(@Nullable Function1<? super Pair<Integer, Integer>, Unit> block) {
        this.onSizeChangeListener = block;
    }

    @JvmOverloads
    public ClipZoomImageView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.originScale = 1.0f;
        this.scaleMin = 1.0f;
        this.scaleMax = 4.0f;
        this.once = true;
        this.matrixValues = new float[9];
        this.mScaleMatrix = new Matrix();
        setScaleType(ImageView.ScaleType.MATRIX);
        this.mScaleGestureDetector = new ScaleGestureDetector(context, this);
        setOnTouchListener(this);
    }
}
