package com.huawei.watchface.mvp.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.huawei.watchface.R;
import com.huawei.watchface.l2;
import com.huawei.watchface.mvp.model.datatype.ClipOptions;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class ClipImageView extends ImageView implements ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f30488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30489c;
    public final Paint d;
    public Paint e;
    public Paint f;
    public float g;
    public ScaleGestureDetector h;
    public final Matrix i;
    public final float[] j;
    public GestureDetector k;
    public boolean l;
    public float m;
    public float n;
    public int o;
    public boolean p;
    public ClipOptions q;
    public Rect r;
    public Rect s;
    public boolean t;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0037  */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (ClipImageView.this.l) {
                return true;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float scale = ClipImageView.this.getScale();
            ClipImageView clipImageView = ClipImageView.this;
            if (scale < clipImageView.f30488b) {
                float scale2 = clipImageView.getScale();
                ClipImageView clipImageView2 = ClipImageView.this;
                if (scale2 >= clipImageView2.g) {
                    clipImageView2.postDelayed(clipImageView2.new b(clipImageView2.f30488b, x, y), 16L);
                } else {
                    ClipImageView clipImageView3 = ClipImageView.this;
                    clipImageView3.postDelayed(clipImageView3.new b(clipImageView3.g, x, y), 16L);
                }
            } else {
                ClipImageView clipImageView4 = ClipImageView.this;
                clipImageView4.postDelayed(clipImageView4.new b(clipImageView4.g, x, y), 16L);
            }
            ClipImageView.this.l = true;
            return true;
        }
    }

    /* JADX INFO: loaded from: classes45.dex */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f30491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f30492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f30493c;
        public float d;

        public b(float f, float f2, float f3) {
            this.f30491a = f;
            this.f30493c = f2;
            this.d = f3;
            if (ClipImageView.this.getScale() < this.f30491a) {
                this.f30492b = 1.07f;
            } else {
                this.f30492b = 0.93f;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Matrix matrix = ClipImageView.this.i;
            float f = this.f30492b;
            matrix.postScale(f, f, this.f30493c, this.d);
            ClipImageView.this.a();
            ClipImageView clipImageView = ClipImageView.this;
            clipImageView.setImageMatrix(clipImageView.i);
            float scale = ClipImageView.this.getScale();
            float f2 = this.f30492b;
            if ((f2 > 1.0f && scale < this.f30491a) || (f2 < 1.0f && this.f30491a < scale)) {
                ClipImageView.this.postDelayed(this, 16L);
                return;
            }
            float f3 = this.f30491a / scale;
            ClipImageView.this.i.postScale(f3, f3, this.f30493c, this.d);
            ClipImageView.this.a();
            ClipImageView clipImageView2 = ClipImageView.this;
            clipImageView2.setImageMatrix(clipImageView2.i);
            ClipImageView.this.l = false;
        }
    }

    public ClipImageView(Context context) {
        this(context, null);
    }

    private RectF getMatrixRectF() {
        Matrix matrix = this.i;
        RectF rectF = new RectF();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(rectF);
        }
        return rectF;
    }

    public final void a(Rect rect) {
        HwLog.i("ClipImageView", "SmartRectSource:" + rect.toString());
        this.s = rect;
    }

    public final void b() {
        int intrinsicWidth = getDrawable().getIntrinsicWidth();
        int intrinsicHeight = getDrawable().getIntrinsicHeight();
        HwLog.i("ClipImageView", "common drawableSize:" + intrinsicWidth + ", " + intrinsicHeight + "; common clipSize:" + this.r.width() + ", " + this.r.height() + "; common viewSize:" + getWidth() + ", " + getHeight());
        if (intrinsicWidth >= getWidth() && intrinsicHeight >= getHeight()) {
            HwLog.i("ClipImageView", "OrgBitmap bigger");
            float f = intrinsicWidth;
            float f2 = intrinsicHeight;
            this.g = Math.max(getWidth() / f, getHeight() / f2);
            this.f30489c = Math.max(this.r.width() / f, this.r.height() / f2);
            this.f30488b = Math.min(f / this.r.width(), f2 / this.r.height());
            HwLog.i("ClipImageView", "BigInitScale = " + this.g);
        } else if (intrinsicWidth <= this.r.width() || intrinsicHeight <= this.r.height()) {
            HwLog.i("ClipImageView", "OrgBitmap smaller than clip");
            float f3 = intrinsicWidth;
            float f4 = intrinsicHeight;
            float fMax = Math.max(this.r.width() / f3, this.r.height() / f4);
            this.g = fMax;
            this.f30489c = fMax;
            this.f30488b = Math.min(f3 / this.q.getOutputWidth(), f4 / this.q.getOutputHeight());
        } else {
            HwLog.i("ClipImageView", "OrgBitmap bigger than clip");
            this.g = 1.0f;
            float f5 = intrinsicWidth;
            float f6 = intrinsicHeight;
            this.f30489c = Math.max(this.r.width() / f5, this.r.height() / f6);
            this.f30488b = Math.min(f5 / this.q.getOutputWidth(), f6 / this.q.getOutputHeight());
        }
        float f7 = this.g;
        float f8 = this.f30489c;
        if (f7 < f8) {
            this.g = f8;
        } else if (f7 > this.f30488b) {
            this.f30488b = f7;
        } else {
            HwLog.i("ClipImageView", "right calculated initScale");
        }
        double width = (getWidth() - (intrinsicWidth * this.g)) / 2.0f;
        double height = (getHeight() - (intrinsicHeight * this.g)) / 2.0f;
        HwLog.i("ClipImageView", "InitScale:" + this.g + "; MinScale:" + this.f30489c + "; MaxScale:" + this.f30488b + "; Translate:{" + width + ", " + height + "}");
        Matrix matrix = this.i;
        float f9 = this.g;
        matrix.setScale(f9, f9);
        this.i.postTranslate((float) ((int) Math.ceil(width)), (float) ((int) Math.ceil(height)));
        StringBuilder sb = new StringBuilder("MScaleMatrix:");
        sb.append(this.i.toString());
        HwLog.i("ClipImageView", sb.toString());
    }

    public void c() {
        if (this.q == null) {
            HwLog.i("ClipImageView", "resetImageMatrix option is null");
            return;
        }
        if (getDrawable() == null) {
            return;
        }
        f();
        if (this.s.width() <= 0 || this.s.height() <= 0) {
            b();
        } else {
            d();
        }
        if (this.q.isSecondEdit() && this.q.getScaleX() != 0.0f && this.q.getScaleY() != 0.0f) {
            this.i.setScale(this.q.getScaleX(), this.q.getScaleY());
            this.i.postTranslate(this.q.getTransX(), this.q.getTransY());
            HwLog.d("ClipImageView", "resetImageMatrix is secondEdit");
        }
        setImageMatrix(this.i);
    }

    public final void d() {
        double d;
        double d2;
        Drawable drawable = getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        HwLog.i("ClipImageView", "drawableSize:" + intrinsicWidth + ", " + intrinsicHeight);
        int iWidth = this.r.width();
        int iHeight = this.r.height();
        HwLog.i("ClipImageView", "clipSize:" + iWidth + ", " + iHeight);
        HwLog.i("ClipImageView", "viewSize:" + getWidth() + ", " + getHeight());
        float f = (float) iWidth;
        float f2 = (float) iHeight;
        this.g = Math.min(f / ((float) this.s.width()), f2 / ((float) this.s.height()));
        HwLog.i("ClipImageView", "SmartInitScale = " + this.g);
        float f3 = (float) intrinsicWidth;
        float f4 = f / f3;
        float f5 = intrinsicHeight;
        float f6 = f2 / f5;
        if (intrinsicWidth <= iWidth || intrinsicHeight <= iHeight) {
            float fMax = Math.max(f4, f6);
            this.g = fMax;
            this.f30489c = fMax;
            this.f30488b = Math.max(f3 / this.q.getOutputWidth(), f5 / this.q.getOutputHeight());
        } else {
            this.f30489c = Math.max(f4, f6);
            this.f30488b = Math.min(f3 / this.q.getOutputWidth(), f5 / this.q.getOutputHeight());
        }
        if (this.s.width() == this.q.getOutputWidth() && this.s.height() == this.q.getOutputHeight()) {
            HwLog.i("ClipImageView", "mSmartRect.width == mClipOptions.getOutputWidth()");
            Rect rect = this.r;
            d2 = rect.left;
            d = rect.top;
            this.g = this.f30489c;
        } else {
            Rect rect2 = this.r;
            float f7 = rect2.left;
            Rect rect3 = this.s;
            float f8 = rect3.left;
            float f9 = this.g;
            double d3 = f7 - (f8 * f9);
            d = rect2.top - (rect3.top * f9);
            d2 = d3;
        }
        if (d < 0.0d) {
            d = this.r.top;
        }
        HwLog.i("ClipImageView", "InitDealtX:" + d2 + "; InitDealtY:" + d + "; InitScale:" + this.g + "; MinScale:" + this.f30489c + "; MaxScale:" + this.f30488b + "; Translate:" + d2 + ", " + d);
        Matrix matrix = this.i;
        float f10 = this.g;
        matrix.setScale(f10, f10);
        this.i.postTranslate((float) ((int) Math.ceil(d2)), (float) ((int) Math.ceil(d)));
        StringBuilder sb = new StringBuilder("MScaleMatrix = ");
        sb.append(this.i.toString());
        HwLog.i("ClipImageView", sb.toString());
    }

    public final void e() {
        try {
            if (getWidth() > 0) {
                c();
            } else {
                post(new Runnable() { // from class: com.huawei.watchface.mvp.ui.widget.ClipImageView$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c();
                    }
                });
            }
        } catch (Exception e) {
            HwLog.e("ClipImageView", "restoreDefaultMatrix Exception:" + HwLog.printException(e));
        }
    }

    public final void f() {
        if (this.q == null) {
            HwLog.i("ClipImageView", "UpdateBorder option is null");
            return;
        }
        HwLog.i("ClipImageView", "UpdateBorder begin");
        int width = getWidth();
        int height = getHeight();
        HwLog.i("ClipImageView", "width:" + width + "height:" + height);
        if (this.q == null) {
            this.q = new ClipOptions(getContext());
        }
        int i = 150;
        if (this.q.getOutputHeight() > this.q.getOutputWidth()) {
            int outputHeight = (this.q.getOutputHeight() * 150) / this.q.getOutputWidth();
            this.r.top = outputHeight;
            int outputWidth = (width - ((this.q.getOutputWidth() * (height - (outputHeight * 2))) / this.q.getOutputHeight())) / 2;
            if (outputWidth < 150) {
                this.r.top = (height - (((width - 300) * this.q.getOutputHeight()) / this.q.getOutputWidth())) / 2;
            } else {
                i = outputWidth;
            }
            Rect rect = this.r;
            rect.left = i;
            rect.right = width - i;
            rect.bottom = height - rect.top;
        } else {
            Rect rect2 = this.r;
            rect2.left = 150;
            rect2.right = width - 150;
            int outputHeight2 = ((width - 300) * this.q.getOutputHeight()) / this.q.getOutputWidth();
            Rect rect3 = this.r;
            int i2 = (height - outputHeight2) / 2;
            rect3.top = i2;
            rect3.bottom = i2 + outputHeight2;
        }
        HwLog.i("ClipImageView", "Init ClipFrame:" + this.r.toString());
    }

    public ClipOptions getResultClipOptions() {
        if (this.q == null) {
            return null;
        }
        Drawable drawable = getDrawable();
        Bitmap bitmap = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
        if (bitmap == null) {
            return this.q;
        }
        float[] fArr = new float[9];
        this.i.getValues(fArr);
        float intrinsicWidth = (fArr[0] * drawable.getIntrinsicWidth()) / bitmap.getWidth();
        float intrinsicHeight = (fArr[4] * drawable.getIntrinsicHeight()) / bitmap.getHeight();
        float f = fArr[2];
        float f2 = fArr[5];
        HwLog.i("ClipImageView", "Original:{" + bitmap.getWidth() + ", " + bitmap.getHeight() + "; Matrix.scaleX:" + intrinsicWidth + "; Matrix.scaleY:" + intrinsicHeight + "; Matrix.X:" + f + "; Matrix.Y:" + f2);
        this.q.setScaleX(l2.a(intrinsicWidth));
        this.q.setScaleY(l2.a(intrinsicHeight));
        this.q.setTransX(l2.a(f));
        this.q.setTransY(l2.a(f2));
        Rect rect = this.r;
        float f3 = ((-f) + ((float) rect.left)) / intrinsicWidth;
        float f4 = ((-f2) + ((float) rect.top)) / intrinsicHeight;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        float fWidth = rect.width() / intrinsicWidth;
        float fHeight = this.r.height() / intrinsicHeight;
        if (f3 + fWidth > bitmap.getWidth()) {
            fWidth = bitmap.getWidth() - f3;
        }
        if (f4 + fHeight > bitmap.getHeight()) {
            fHeight = bitmap.getHeight() - f4;
        }
        int i = (int) f3;
        int i2 = (int) f4;
        this.q.setClipRect(new Rect(i, i2, ((int) fWidth) + i, ((int) fHeight) + i2));
        HwLog.i("ClipImageView", "ResultRect:" + this.q.toString());
        return this.q;
    }

    public final float getScale() {
        this.i.getValues(this.j);
        return this.j[0];
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.q == null) {
            HwLog.i("ClipImageView", "OnDraw options is null");
            return;
        }
        this.d.setColor(-1577058304);
        this.d.setStyle(Paint.Style.FILL);
        this.d.setStrokeWidth(1.0f);
        a(canvas);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        HwLog.i("ClipImageView", "onScale");
        float scale = getScale();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        HwLog.i("ClipImageView", "scale:" + scale + "; factor:" + scaleFactor);
        if (getDrawable() == null) {
            HwLog.i("ClipImageView", "drawable is null");
            return true;
        }
        if ((scale < this.f30488b && scaleFactor > 1.0f) || (scale > this.f30489c && scaleFactor < 1.0f)) {
            HwLog.i("ClipImageView", "Limit scale");
            float f = this.f30489c;
            if (scaleFactor * scale < f) {
                scaleFactor = f / scale;
            }
            float f2 = this.f30488b;
            if (scaleFactor * scale > f2) {
                scaleFactor = f2 / scale;
            }
            this.i.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            a();
            setImageMatrix(this.i);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        HwLog.i("ClipImageView", "onScaleBegin");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        HwLog.i("ClipImageView", "onScaleEnd");
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.q == null) {
            return false;
        }
        if (this.k.onTouchEvent(motionEvent)) {
            return true;
        }
        HwLog.i("ClipImageView", "ScaleGestureDetector onTouchEvent");
        this.h.onTouchEvent(motionEvent);
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
        if (pointerCount != this.o) {
            this.p = false;
            this.m = f2;
            this.n = f3;
        }
        this.o = pointerCount;
        a(motionEvent, f2, f3);
        return true;
    }

    public void setClipOptions(ClipOptions clipOptions) {
        this.q = clipOptions;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        e();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        e();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        e();
    }

    public void setSmartClipRect(Rect rect) {
        a(rect);
    }

    public ClipImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30488b = 4.0f;
        this.f30489c = 0.5f;
        this.g = 1.0f;
        this.i = new Matrix();
        this.j = new float[9];
        this.r = new Rect();
        this.s = new Rect();
        this.t = true;
        setScaleType(ImageView.ScaleType.MATRIX);
        this.k = new GestureDetector(context, new a());
        this.h = new ScaleGestureDetector(context, this);
        setOnTouchListener(this);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(-1);
        paint.setDither(true);
        if (this.t) {
            Paint paint2 = new Paint();
            this.e = paint2;
            paint2.setColor(-1);
            this.e.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.dp_1));
            Paint paint3 = this.e;
            Paint.Style style = Paint.Style.STROKE;
            paint3.setStyle(style);
            this.e.setAlpha(76);
            Paint paint4 = new Paint();
            this.f = paint4;
            paint4.setColor(-1);
            this.f.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.dp_2));
            this.f.setStyle(style);
            this.f30487a = getResources().getDimensionPixelSize(R.dimen.dp_32);
        }
    }

    public final boolean a(float f, float f2) {
        return Math.sqrt((double) ((f * f) + (f2 * f2))) >= 0.0d;
    }

    public final void a(Canvas canvas) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        paint.setColor(0);
        canvas2.drawRect(0.0f, 0.0f, canvas2.getWidth(), canvas2.getHeight(), this.d);
        paint.setXfermode(porterDuffXfermode);
        HwLog.i("ClipImageView", "draw:" + this.r.toString());
        if (this.q.getOutputWidth() == this.q.getOutputHeight() && !this.q.isClipRectangleAnyway()) {
            Rect rect = this.r;
            float fWidth = rect.left + (rect.width() / 2.0f);
            Rect rect2 = this.r;
            float fHeight = rect2.top + (rect2.height() / 2.0f);
            float fHeight2 = this.r.height() / 2.0f;
            canvas2.drawCircle(fWidth, fHeight, fHeight2, paint);
            if (this.t) {
                canvas2.drawCircle(fWidth, fHeight, fHeight2, this.e);
            }
        } else {
            Rect rect3 = this.r;
            canvas2.drawRect(new RectF(rect3.left, rect3.top, rect3.right, rect3.bottom), paint);
            if (this.t) {
                Path path = new Path();
                Rect rect4 = this.r;
                path.moveTo(rect4.left, rect4.top + this.f30487a);
                Rect rect5 = this.r;
                path.lineTo(rect5.left, rect5.top);
                Rect rect6 = this.r;
                path.lineTo(rect6.left + this.f30487a, rect6.top);
                Rect rect7 = this.r;
                path.moveTo(rect7.right - this.f30487a, rect7.top);
                Rect rect8 = this.r;
                path.lineTo(rect8.right, rect8.top);
                Rect rect9 = this.r;
                path.lineTo(rect9.right, rect9.top + this.f30487a);
                Rect rect10 = this.r;
                path.moveTo(rect10.left + this.f30487a, rect10.bottom);
                Rect rect11 = this.r;
                path.lineTo(rect11.left, rect11.bottom);
                Rect rect12 = this.r;
                path.lineTo(rect12.left, rect12.bottom - this.f30487a);
                Rect rect13 = this.r;
                path.moveTo(rect13.right - this.f30487a, rect13.bottom);
                Rect rect14 = this.r;
                path.lineTo(rect14.right, rect14.bottom);
                Rect rect15 = this.r;
                path.lineTo(rect15.right, rect15.bottom - this.f30487a);
                canvas2.drawPath(path, this.f);
            }
        }
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
    }

    public final void a() {
        float f;
        if (this.q == null) {
            return;
        }
        RectF matrixRectF = getMatrixRectF();
        HwLog.iBetaLog("ClipImageView", "CheckBorderCurrent:" + matrixRectF.toString() + "; CheckBorderClipRect:" + this.q.toString());
        float f2 = 0.0f;
        if (matrixRectF.width() >= this.r.width()) {
            float f3 = matrixRectF.left;
            Rect rect = this.r;
            float f4 = rect.left;
            f = f3 > f4 ? (-f3) + f4 : 0.0f;
            float f5 = matrixRectF.right;
            float f6 = rect.right;
            if (f5 < f6) {
                f = f6 - f5;
            }
        } else {
            f = 0.0f;
        }
        if (matrixRectF.height() >= this.r.height()) {
            float f7 = matrixRectF.top;
            Rect rect2 = this.r;
            float f8 = rect2.top;
            f2 = f7 > f8 ? (-f7) + f8 : 0.0f;
            float f9 = matrixRectF.bottom;
            float f10 = rect2.bottom;
            if (f9 < f10) {
                f2 = f10 - f9;
            }
        }
        this.i.postTranslate(f, f2);
    }

    public final void a(MotionEvent motionEvent, float f, float f2) {
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                float f3 = f - this.m;
                float f4 = f2 - this.n;
                if (!this.p) {
                    this.p = a(f3, f4);
                }
                if (this.p && getDrawable() != null) {
                    RectF matrixRectF = getMatrixRectF();
                    if (matrixRectF.width() <= this.r.width()) {
                        f3 = 0.0f;
                    }
                    if (matrixRectF.height() <= this.r.height()) {
                        f4 = 0.0f;
                    }
                    this.i.postTranslate(f3, f4);
                    a();
                    setImageMatrix(this.i);
                }
                this.m = f;
                this.n = f2;
                return;
            }
            if (action != 3) {
                HwLog.i("ClipImageView", "do no handle event");
                return;
            }
        }
        this.o = 0;
    }
}
