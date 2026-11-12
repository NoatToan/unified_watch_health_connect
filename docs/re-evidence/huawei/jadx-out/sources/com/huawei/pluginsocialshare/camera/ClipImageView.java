package com.huawei.pluginsocialshare.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.IoUtils;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes15.dex */
public class ClipImageView extends ImageView implements ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GestureDetector f22549c;
    private int d;
    private Context e;
    private ScaleGestureDetector f;
    private boolean g;
    private int h;
    private boolean i;
    private boolean j;
    private float k;
    private int l;
    private final float[] m;
    private float n;
    private float o;
    private int q;
    private float r;
    private final Matrix s;
    private float t;

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public ClipImageView(Context context) {
        this(context, null);
    }

    public ClipImageView(b bVar) {
        this(bVar.f22551a);
        this.e = bVar.f22551a;
        this.k = bVar.d;
        this.r = bVar.f22552b;
        this.q = bVar.g;
        this.d = bVar.f22553c;
        this.t = bVar.j;
        this.h = bVar.e;
        c();
    }

    public ClipImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new float[9];
        this.s = new Matrix();
        this.k = 4.0f;
        this.r = 2.0f;
        this.t = 1.0f;
        this.i = true;
        this.f = null;
    }

    private void c() {
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f22549c = new GestureDetector(this.e, new GestureDetector.SimpleOnGestureListener() { // from class: com.huawei.pluginsocialshare.camera.ClipImageView.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (ClipImageView.this.g) {
                    return true;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (ClipImageView.this.getScale() < ClipImageView.this.r) {
                    ClipImageView clipImageView = ClipImageView.this;
                    clipImageView.postDelayed(clipImageView.new d(clipImageView.r, x, y), 16L);
                    ClipImageView.this.g = true;
                } else {
                    ClipImageView clipImageView2 = ClipImageView.this;
                    clipImageView2.postDelayed(clipImageView2.new d(clipImageView2.t, x, y), 16L);
                    ClipImageView.this.g = true;
                }
                return true;
            }
        });
        this.f = new ScaleGestureDetector(this.e, this);
        setOnTouchListener(this);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f22551a;
        private int e;
        private float d = 4.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f22552b = 2.0f;
        private float j = 1.0f;
        private int g = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f22553c = 1;

        public b(Context context, int i) {
            this.e = i;
            this.f22551a = context;
        }

        public b c(float f) {
            if (f < 0.0f) {
                return this;
            }
            this.d = f;
            return this;
        }

        public b b(float f) {
            if (f < 0.0f) {
                return this;
            }
            this.f22552b = f;
            return this;
        }

        public b d(float f) {
            if (f < 0.0f) {
                return this;
            }
            this.j = f;
            return this;
        }

        public b a(int i) {
            if (i < 0) {
                return this;
            }
            this.g = i;
            return this;
        }

        public b e(int i) {
            if (i < 0) {
                return this;
            }
            this.f22553c = i;
            return this;
        }

        public b b(int i) {
            if (i < 0) {
                return this;
            }
            this.e = i;
            return this;
        }

        public b e(Context context) {
            if (context == null) {
                return this;
            }
            this.f22551a = context;
            return this;
        }

        public ClipImageView c() {
            return new ClipImageView(this);
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scale = getScale();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (getDrawable() == null) {
            return true;
        }
        float f = this.k;
        boolean z = false;
        boolean z2 = scale < f && scaleFactor > 1.0f;
        float f2 = this.t;
        if (scale > f2 && scaleFactor < 1.0f) {
            z = true;
        }
        if (z2 || z) {
            if (scaleFactor * scale < f2) {
                scaleFactor = f2 / scale;
            }
            if (scaleFactor * scale > f) {
                scaleFactor = f / scale;
            }
            this.s.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            if (e()) {
                setImageMatrix(this.s);
            }
        }
        return true;
    }

    private RectF getMatrixRectF() {
        RectF rectF = new RectF();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.s.mapRect(rectF);
        }
        return rectF;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f22549c.onTouchEvent(motionEvent)) {
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
        if (pointerCount != this.l) {
            this.j = false;
            this.n = f2;
            this.o = f3;
        }
        this.l = pointerCount;
        int action = motionEvent.getAction();
        if (action == 1) {
            this.l = 0;
        } else if (action == 2) {
            d(f2, f3);
        } else if (action == 3) {
            this.l = 0;
        }
        return true;
    }

    private void d(float f, float f2) {
        float f3 = f - this.n;
        float f4 = f2 - this.o;
        if (!this.j) {
            this.j = b(f3, f4);
        } else if (getDrawable() != null) {
            RectF matrixRectF = getMatrixRectF();
            if (matrixRectF.left + f3 >= this.h || matrixRectF.right + f3 <= getWidth() - this.h) {
                f3 = 0.0f;
            }
            if (matrixRectF.top + f4 >= getVerticalPadding() || matrixRectF.bottom + f4 <= getHeight() - getVerticalPadding()) {
                f4 = 0.0f;
            }
            this.s.postTranslate(f3, f4);
            setImageMatrix(this.s);
        }
        this.n = f;
        this.o = f2;
    }

    public final float getScale() {
        this.s.getValues(this.m);
        return this.m[0];
    }

    private float getTransX() {
        this.s.getValues(this.m);
        return this.m[2];
    }

    private float getTransY() {
        this.s.getValues(this.m);
        return this.m[5];
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Drawable drawable;
        if (!this.i || (drawable = getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int width = getWidth() - (this.h * 2);
        this.f22548b = width;
        int i = (this.d * width) / this.q;
        this.f22547a = i;
        float fMax = Math.max((width * 1.0f) / intrinsicWidth, (i * 1.0f) / intrinsicHeight);
        this.t = fMax;
        this.r = fMax * 2.0f;
        this.k = fMax * 4.0f;
        this.s.postTranslate((getWidth() - intrinsicWidth) / 2.0f, (getHeight() - intrinsicHeight) / 2.0f);
        Matrix matrix = this.s;
        float f = this.t;
        matrix.postScale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
        setImageMatrix(this.s);
        this.i = false;
    }

    public Bitmap b() {
        try {
            return d();
        } catch (IllegalArgumentException unused) {
            LogUtil.j("Share_ClipImageView", "clip:IllegalArgumentException");
            return null;
        } catch (IllegalStateException unused2) {
            LogUtil.j("Share_ClipImageView", "clip:IllegalStateException");
            return null;
        } catch (OutOfMemoryError unused3) {
            LogUtil.j("Share_ClipImageView", "clip:OutOfMemoryError");
            return null;
        }
    }

    private Bitmap d() {
        if (!(getDrawable() instanceof BitmapDrawable) || !(getDrawable() instanceof BitmapDrawable)) {
            return null;
        }
        Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
        int transX = (int) ((this.h - getTransX()) / getScale());
        int verticalPadding = (int) ((getVerticalPadding() - getTransY()) / getScale());
        int scale = (int) (this.f22548b / getScale());
        int scale2 = (int) (this.f22547a / getScale());
        if (transX < 0) {
            transX = 0;
        }
        if (verticalPadding < 0) {
            verticalPadding = 0;
        }
        if (transX + scale > bitmap.getWidth()) {
            transX = bitmap.getWidth() - scale;
        }
        if (verticalPadding + scale2 > bitmap.getHeight()) {
            verticalPadding = bitmap.getHeight() - scale2;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, transX, verticalPadding, (int) (this.f22548b / getScale()), (int) (this.f22547a / getScale()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            LogUtil.a("Share_ClipImageView", "after rawClip bitmap size:", Double.valueOf((((double) byteArrayOutputStream.toByteArray().length) / 1024.0d) / 1024.0d), "M");
            return bitmapCreateBitmap;
        } finally {
            IoUtils.c(byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        RectF matrixRectF = getMatrixRectF();
        int width = getWidth();
        int height = getHeight();
        if (matrixRectF.width() < this.f22548b) {
            return false;
        }
        float verticalPadding = 0.0f;
        float f = matrixRectF.left > ((float) this.h) ? (-matrixRectF.left) + this.h : 0.0f;
        float f2 = matrixRectF.right;
        float f3 = width - this.h;
        if (f2 < f3) {
            f = f3 - matrixRectF.right;
        }
        if (matrixRectF.height() < this.f22547a) {
            return false;
        }
        if (matrixRectF.top > getVerticalPadding()) {
            verticalPadding = getVerticalPadding() + (-matrixRectF.top);
        }
        if (matrixRectF.bottom < height - getVerticalPadding()) {
            verticalPadding = (height - getVerticalPadding()) - matrixRectF.bottom;
        }
        this.s.postTranslate(f, verticalPadding);
        return true;
    }

    private boolean b(float f, float f2) {
        return Math.sqrt((double) ((f * f) + (f2 * f2))) >= 0.0d;
    }

    private int getVerticalPadding() {
        return (getHeight() - this.f22547a) / 2;
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f22554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f22555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f22556c;
        private float d;

        d(float f, float f2, float f3) {
            this.f22554a = f;
            this.f22555b = f2;
            this.f22556c = f3;
            if (ClipImageView.this.getScale() < this.f22554a) {
                this.d = 1.07f;
            } else {
                this.d = 0.93f;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Matrix matrix = ClipImageView.this.s;
            float f = this.d;
            matrix.postScale(f, f, this.f22555b, this.f22556c);
            if (ClipImageView.this.e()) {
                ClipImageView clipImageView = ClipImageView.this;
                clipImageView.setImageMatrix(clipImageView.s);
            }
            float scale = ClipImageView.this.getScale();
            float f2 = this.d;
            boolean z = f2 > 1.0f && scale < this.f22554a;
            boolean z2 = f2 < 1.0f && this.f22554a < scale;
            if (z || z2) {
                ClipImageView.this.postDelayed(this, 16L);
                return;
            }
            float f3 = this.f22554a / scale;
            ClipImageView.this.s.postScale(f3, f3, this.f22555b, this.f22556c);
            if (ClipImageView.this.e()) {
                ClipImageView clipImageView2 = ClipImageView.this;
                clipImageView2.setImageMatrix(clipImageView2.s);
                ClipImageView.this.g = false;
            }
        }
    }
}
