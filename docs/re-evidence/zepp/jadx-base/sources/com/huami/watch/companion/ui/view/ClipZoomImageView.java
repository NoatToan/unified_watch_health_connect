package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes16.dex */
public class ClipZoomImageView extends ImageView implements ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {
    private int a;
    private int b;
    private float c;
    private boolean d;
    private final float[] e;
    private ScaleGestureDetector f;
    private final Matrix g;
    private GestureDetector h;
    private boolean i;
    private int j;
    private float k;
    private float l;
    private boolean m;
    private int n;
    private static final String o = ClipZoomImageView.class.getSimpleName();
    public static float SCALE_MAX = 4.0f;
    private static float p = 2.0f;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (ClipZoomImageView.this.i) {
                return true;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (ClipZoomImageView.this.getScale() < ClipZoomImageView.p) {
                ClipZoomImageView clipZoomImageView = ClipZoomImageView.this;
                clipZoomImageView.postDelayed(clipZoomImageView.new b(ClipZoomImageView.p, x, y), 16L);
                ClipZoomImageView.this.i = true;
            } else {
                ClipZoomImageView clipZoomImageView2 = ClipZoomImageView.this;
                clipZoomImageView2.postDelayed(clipZoomImageView2.new b(clipZoomImageView2.c, x, y), 16L);
                ClipZoomImageView.this.i = true;
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
            Matrix matrix = ClipZoomImageView.this.g;
            float f2 = this.b;
            matrix.postScale(f2, f2, this.c, this.d);
            ClipZoomImageView.this.g();
            ClipZoomImageView clipZoomImageView = ClipZoomImageView.this;
            clipZoomImageView.setImageMatrix(clipZoomImageView.g);
            float scale = ClipZoomImageView.this.getScale();
            float f3 = this.b;
            if ((f3 > 1.0f && scale < this.a) || (f3 < 1.0f && this.a < scale)) {
                ClipZoomImageView.this.postDelayed(this, 16L);
                return;
            }
            float f4 = this.a / scale;
            ClipZoomImageView.this.g.postScale(f4, f4, this.c, this.d);
            ClipZoomImageView.this.g();
            ClipZoomImageView clipZoomImageView2 = ClipZoomImageView.this;
            clipZoomImageView2.setImageMatrix(clipZoomImageView2.g);
            ClipZoomImageView.this.i = false;
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
        Log.e(o, "rect.width() =  " + matrixRectF.width() + " , width - 2 * mHorizontalPadding =" + (width - (this.a * 2)));
        double dWidth = ((double) matrixRectF.width()) + 0.01d;
        int i = this.a;
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
        int i2 = this.b;
        if (dHeight >= height - (i2 * 2)) {
            float f5 = matrixRectF.top;
            f2 = f5 > ((float) i2) ? (-f5) + i2 : 0.0f;
            float f6 = matrixRectF.bottom;
            if (f6 < height - i2) {
                f2 = (height - i2) - f6;
            }
        }
        this.g.postTranslate(f, f2);
    }

    private RectF getMatrixRectF() {
        Matrix matrix = this.g;
        RectF rectF = new RectF();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(rectF);
        }
        return rectF;
    }

    private boolean h(float f, float f2) {
        return Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.j);
    }

    public Bitmap clip() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        draw(new Canvas(bitmapCreateBitmap));
        return Bitmap.createBitmap(bitmapCreateBitmap, this.a, this.b, getWidth() - (this.a * 2), getWidth() - (this.a * 2));
    }

    public final float getScale() {
        this.g.getValues(this.e);
        return this.e[0];
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
        if (!this.d || (drawable = getDrawable()) == null) {
            return;
        }
        this.b = (getHeight() - (getWidth() - (this.a * 2))) / 2;
        int width = getWidth();
        int height = getHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float width2 = (intrinsicWidth >= getWidth() - (this.a * 2) || intrinsicHeight <= getHeight() - (this.b * 2)) ? 1.0f : ((getWidth() * 1.0f) - (this.a * 2)) / intrinsicWidth;
        if (intrinsicHeight < getHeight() - (this.b * 2) && intrinsicWidth > getWidth() - (this.a * 2)) {
            width2 = ((getHeight() * 1.0f) - (this.b * 2)) / intrinsicHeight;
        }
        if (intrinsicWidth < getWidth() - (this.a * 2) && intrinsicHeight < getHeight() - (this.b * 2)) {
            width2 = Math.max(((getWidth() * 1.0f) - (this.a * 2)) / intrinsicWidth, ((getHeight() * 1.0f) - (this.b * 2)) / intrinsicHeight);
        }
        this.c = width2;
        p = 2.0f * width2;
        SCALE_MAX = 4.0f * width2;
        this.g.postTranslate((width - intrinsicWidth) / 2, (height - intrinsicHeight) / 2);
        this.g.postScale(width2, width2, getWidth() / 2, getHeight() / 2);
        setImageMatrix(this.g);
        this.d = false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scale = getScale();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (getDrawable() == null) {
            return true;
        }
        float f = SCALE_MAX;
        if ((scale < f && scaleFactor > 1.0f) || (scale > this.c && scaleFactor < 1.0f)) {
            float f2 = scaleFactor * scale;
            float f3 = this.c;
            if (f2 < f3) {
                scaleFactor = f3 / scale;
            }
            if (scaleFactor * scale > f) {
                scaleFactor = f / scale;
            }
            this.g.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            g();
            setImageMatrix(this.g);
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
        if (this.h.onTouchEvent(motionEvent)) {
            return true;
        }
        this.f.onTouchEvent(motionEvent);
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
        if (pointerCount != this.n) {
            this.m = false;
            this.k = f2;
            this.l = f3;
        }
        this.n = pointerCount;
        int action = motionEvent.getAction();
        if (action == 1) {
            this.n = 0;
        } else if (action == 2) {
            float f4 = f2 - this.k;
            float f5 = f3 - this.l;
            if (!this.m) {
                this.m = h(f4, f5);
            }
            if (this.m && getDrawable() != null) {
                RectF matrixRectF = getMatrixRectF();
                if (matrixRectF.width() <= getWidth() - (this.a * 2)) {
                    f4 = 0.0f;
                }
                this.g.postTranslate(f4, matrixRectF.height() > ((float) (getHeight() - (this.b * 2))) ? f5 : 0.0f);
                g();
                setImageMatrix(this.g);
            }
            this.k = f2;
            this.l = f3;
        } else if (action == 3) {
            this.n = 0;
        }
        return true;
    }

    public void setHorizontalPadding(int i) {
        this.a = i;
    }

    public ClipZoomImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 1.0f;
        this.d = true;
        this.e = new float[9];
        this.f = null;
        this.g = new Matrix();
        setScaleType(ImageView.ScaleType.MATRIX);
        this.h = new GestureDetector(context, new a());
        this.f = new ScaleGestureDetector(context, this);
        setOnTouchListener(this);
    }
}
