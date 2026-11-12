package com.huami.account.userinfo.ui.baseui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes4.dex */
public class ClipZoomImageView extends AppCompatImageView implements ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {
    private static final String q = ClipZoomImageView.class.getSimpleName();
    public float SCALE_MAX;
    private float a;
    private float b;
    private boolean c;
    private final float[] d;
    private ScaleGestureDetector e;
    private final Matrix f;
    private GestureDetector g;
    private boolean h;
    private int i;
    private float j;
    private float k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private int p;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (ClipZoomImageView.this.h) {
                return true;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (ClipZoomImageView.this.getScale() < ClipZoomImageView.this.a) {
                ClipZoomImageView clipZoomImageView = ClipZoomImageView.this;
                clipZoomImageView.postDelayed(clipZoomImageView.new b(clipZoomImageView.a, x, y), 16L);
                ClipZoomImageView.this.h = true;
            } else {
                ClipZoomImageView clipZoomImageView2 = ClipZoomImageView.this;
                clipZoomImageView2.postDelayed(clipZoomImageView2.new b(clipZoomImageView2.b, x, y), 16L);
                ClipZoomImageView.this.h = true;
            }
            return true;
        }
    }

    public class b implements Runnable {
        public static final float f = 1.07f;
        public static final float g = 0.93f;
        private float a;
        private float b;
        private float c;
        private float d;

        public b(float f2, float f3, float f4) {
            this.a = f2;
            this.c = f3;
            this.d = f4;
            if (ClipZoomImageView.this.getScale() < this.a) {
                this.b = 1.07f;
            } else {
                this.b = 0.93f;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Matrix matrix = ClipZoomImageView.this.f;
            float f2 = this.b;
            matrix.postScale(f2, f2, this.c, this.d);
            ClipZoomImageView.this.g();
            ClipZoomImageView clipZoomImageView = ClipZoomImageView.this;
            clipZoomImageView.setImageMatrix(clipZoomImageView.f);
            float scale = ClipZoomImageView.this.getScale();
            float f3 = this.b;
            if ((f3 > 1.0f && scale < this.a) || (f3 < 1.0f && this.a < scale)) {
                ClipZoomImageView.this.postDelayed(this, 16L);
                return;
            }
            float f4 = this.a / scale;
            ClipZoomImageView.this.f.postScale(f4, f4, this.c, this.d);
            ClipZoomImageView.this.g();
            ClipZoomImageView clipZoomImageView2 = ClipZoomImageView.this;
            clipZoomImageView2.setImageMatrix(clipZoomImageView2.f);
            ClipZoomImageView.this.h = false;
        }
    }

    public ClipZoomImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        float f;
        RectF matrixRectF = getMatrixRectF();
        int width = getWidth();
        int height = getHeight();
        double dWidth = ((double) matrixRectF.width()) + 0.01d;
        int i = this.o;
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
        int i2 = this.p;
        if (dHeight >= height - (i2 * 2)) {
            float f5 = matrixRectF.top;
            f2 = f5 > ((float) i2) ? (-f5) + i2 : 0.0f;
            float f6 = matrixRectF.bottom;
            if (f6 < height - i2) {
                f2 = (height - i2) - f6;
            }
        }
        this.f.postTranslate(f, f2);
    }

    private RectF getMatrixRectF() {
        Matrix matrix = this.f;
        RectF rectF = new RectF();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(rectF);
        }
        return rectF;
    }

    private boolean h(float f, float f2) {
        return Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.i);
    }

    public Bitmap clip() {
        Bitmap bitmapCreateBitmap;
        setDrawingCacheEnabled(true);
        setDrawingCacheQuality(1048576);
        Bitmap drawingCache = getDrawingCache();
        int width = getWidth() - (this.o * 2);
        int height = getHeight();
        int i = this.p;
        int i2 = height - (i * 2);
        if (drawingCache != null) {
            if (width <= 0 || i2 <= 0) {
                bitmapCreateBitmap = Bitmap.createBitmap(drawingCache);
            } else {
                if (this.o < 0) {
                    this.o = 0;
                }
                if (i < 0) {
                    this.o = 0;
                }
                bitmapCreateBitmap = Bitmap.createBitmap(drawingCache, this.o, i, width, i2);
            }
            drawingCache.recycle();
            destroyDrawingCache();
        } else {
            bitmapCreateBitmap = null;
        }
        setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    public final float getScale() {
        this.f.getValues(this.d);
        return this.d[0];
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Drawable drawable;
        if (!this.c || (drawable = getDrawable()) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.p = (height - (width - (this.o * 2))) / 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i = this.o;
        float fMax = (intrinsicWidth >= width - (i * 2) || intrinsicHeight <= height - (this.p * 2)) ? 1.0f : ((width * 1.0f) - (i * 2)) / intrinsicWidth;
        int i2 = this.p;
        if (intrinsicHeight < height - (i2 * 2) && intrinsicWidth > width - (i * 2)) {
            fMax = ((height * 1.0f) - (i2 * 2)) / intrinsicHeight;
        }
        if (intrinsicWidth < width - (i * 2) && intrinsicHeight < height - (i2 * 2)) {
            fMax = Math.max(((width * 1.0f) - (i * 2)) / intrinsicWidth, ((height * 1.0f) - (i2 * 2)) / intrinsicHeight);
        }
        this.b = fMax;
        this.a = fMax * 2.0f;
        this.SCALE_MAX = 4.0f * fMax;
        this.f.postTranslate((width - intrinsicWidth) / 2.0f, (height - intrinsicHeight) / 2.0f);
        int i3 = this.n;
        if (i3 == 0) {
            this.f.postScale(fMax, fMax, width / 2.0f, height / 2.0f);
        } else if (i3 == 1) {
            float f = width;
            float f2 = (1.0f * f) / intrinsicWidth;
            this.f.postScale(f2, f2, f / 2.0f, height / 2.0f);
        }
        setImageMatrix(this.f);
        this.c = false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scale = getScale();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (getDrawable() == null) {
            return true;
        }
        float f = this.SCALE_MAX;
        if ((scale < f && scaleFactor > 1.0f) || (scale > this.b && scaleFactor < 1.0f)) {
            float f2 = scaleFactor * scale;
            float f3 = this.b;
            if (f2 < f3) {
                scaleFactor = f3 / scale;
            }
            if (scaleFactor * scale > f) {
                scaleFactor = f / scale;
            }
            this.f.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            g();
            setImageMatrix(this.f);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.g.onTouchEvent(motionEvent)) {
            return true;
        }
        this.e.onTouchEvent(motionEvent);
        int pointerCount = motionEvent.getPointerCount();
        float x = 0.0f;
        float y = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            x += motionEvent.getX(i);
            y += motionEvent.getY(i);
        }
        float f = pointerCount;
        float f2 = x / f;
        float f3 = y / f;
        if (pointerCount != this.m) {
            this.l = false;
            this.j = f2;
            this.k = f3;
        }
        this.m = pointerCount;
        int action = motionEvent.getAction();
        if (action == 1) {
            this.m = 0;
        } else if (action == 2) {
            float f4 = f2 - this.j;
            float f5 = f3 - this.k;
            if (!this.l) {
                this.l = h(f4, f5);
            }
            if (this.l && getDrawable() != null) {
                RectF matrixRectF = getMatrixRectF();
                if (matrixRectF.width() <= getWidth() - (this.o * 2)) {
                    f4 = 0.0f;
                }
                this.f.postTranslate(f4, matrixRectF.height() > ((float) (getHeight() - (this.p * 2))) ? f5 : 0.0f);
                g();
                setImageMatrix(this.f);
            }
            this.j = f2;
            this.k = f3;
        } else if (action == 3) {
            this.m = 0;
        }
        return true;
    }

    public void setCropMode(int i) {
        this.n = i;
    }

    public void setHorizontalPadding(int i) {
        this.o = i;
    }

    public ClipZoomImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.SCALE_MAX = 4.0f;
        this.a = 2.0f;
        this.b = 1.0f;
        this.c = true;
        this.d = new float[9];
        this.e = null;
        this.f = new Matrix();
        setScaleType(ImageView.ScaleType.MATRIX);
        this.g = new GestureDetector(context, new a());
        this.e = new ScaleGestureDetector(context, this);
        setOnTouchListener(this);
    }
}
