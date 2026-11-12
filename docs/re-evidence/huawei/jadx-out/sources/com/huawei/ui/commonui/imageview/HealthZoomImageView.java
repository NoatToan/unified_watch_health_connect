package com.huawei.ui.commonui.imageview;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
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
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes43.dex */
public class HealthZoomImageView extends AppCompatImageView implements ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GestureDetector f23544a;
    private int ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f23545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f23546c;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;
    private boolean i;
    private boolean j;
    private float k;
    private float l;
    private int m;
    private Matrix n;
    private int o;
    private float p;
    private float q;
    private Path r;
    private float s;
    private float t;
    private float u;
    private int v;
    private int w;
    private ScaleGestureDetector x;
    private int y;

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public HealthZoomImageView(Context context) {
        this(context, null);
    }

    public HealthZoomImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HealthZoomImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = false;
        this.r = new Path();
        this.f23546c = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthZoomImageView);
        try {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.HealthZoomImageView_radius, 0);
            this.m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.HealthZoomImageView_lefTopRadius, 0);
            this.y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.HealthZoomImageView_rightTopRadius, 0);
            this.o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.HealthZoomImageView_leftBottomRadius, 0);
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.HealthZoomImageView_rightBottomRadius, 0);
            this.v = dimensionPixelOffset2;
            if (this.m == 0) {
                this.m = dimensionPixelOffset;
            }
            if (this.y == 0) {
                this.y = dimensionPixelOffset;
            }
            if (this.o == 0) {
                this.o = dimensionPixelOffset;
            }
            if (dimensionPixelOffset2 == 0) {
                this.v = dimensionPixelOffset;
            }
            this.w = typedArrayObtainStyledAttributes.getInt(R.styleable.HealthZoomImageView_customerScaleType, 0);
            this.k = typedArrayObtainStyledAttributes.getFloat(R.styleable.HealthZoomImageView_maxScale, 8.0f);
            this.s = typedArrayObtainStyledAttributes.getFloat(R.styleable.HealthZoomImageView_minScale, 0.5f);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("HealthZoomImageView", "HealthZoomImageView Resources NotFoundException");
        }
        typedArrayObtainStyledAttributes.recycle();
        d();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.ad = getWidth();
        this.f = getHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        int iMax = Math.max(this.m, this.o);
        int iMax2 = Math.max(this.y, this.v);
        int iMax3 = Math.max(this.m, this.y);
        int iMax4 = Math.max(this.o, this.v);
        if (this.ad >= iMax + iMax2 && this.f > iMax3 + iMax4) {
            this.r.moveTo(this.m, 0.0f);
            this.r.lineTo(this.ad - this.y, 0.0f);
            Path path = this.r;
            float f = this.ad;
            path.quadTo(f, 0.0f, f, this.y);
            this.r.lineTo(this.ad, this.f - this.v);
            Path path2 = this.r;
            int i = this.ad;
            float f2 = this.f;
            path2.quadTo(i, f2, i - this.v, f2);
            this.r.lineTo(this.o, this.f);
            Path path3 = this.r;
            int i2 = this.f;
            path3.quadTo(0.0f, i2, 0.0f, i2 - this.o);
            this.r.lineTo(0.0f, this.m);
            this.r.quadTo(0.0f, 0.0f, this.m, 0.0f);
            canvas.clipPath(this.r);
        }
        try {
            super.onDraw(canvas);
        } catch (Exception unused) {
            LogUtil.e("HealthZoomImageView", "onDraw:ondraw failed");
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    private void d() {
        setOnTouchListener(this);
        this.x = new ScaleGestureDetector(this.f23546c, this);
        this.f23544a = new GestureDetector(this.f23546c, new GestureDetector.SimpleOnGestureListener() { // from class: com.huawei.ui.commonui.imageview.HealthZoomImageView.5
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (HealthZoomImageView.this.j) {
                    return true;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (HealthZoomImageView.this.getScale() > HealthZoomImageView.this.u) {
                    HealthZoomImageView healthZoomImageView = HealthZoomImageView.this;
                    healthZoomImageView.postDelayed(healthZoomImageView.new e(healthZoomImageView.u, x, y), 10L);
                    HealthZoomImageView.this.j = true;
                } else {
                    HealthZoomImageView healthZoomImageView2 = HealthZoomImageView.this;
                    healthZoomImageView2.postDelayed(healthZoomImageView2.new e(healthZoomImageView2.l, x, y), 10L);
                    HealthZoomImageView.this.j = true;
                }
                return true;
            }
        });
        setScaleType(ImageView.ScaleType.MATRIX);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.commonui.imageview.HealthZoomImageView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                HealthZoomImageView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HealthZoomImageView healthZoomImageView = HealthZoomImageView.this;
                healthZoomImageView.ad = healthZoomImageView.getWidth();
                HealthZoomImageView healthZoomImageView2 = HealthZoomImageView.this;
                healthZoomImageView2.f = healthZoomImageView2.getHeight();
                HealthZoomImageView healthZoomImageView3 = HealthZoomImageView.this;
                healthZoomImageView3.f23545b = healthZoomImageView3.getDrawable();
                if (HealthZoomImageView.this.f23545b == null) {
                    return;
                }
                HealthZoomImageView healthZoomImageView4 = HealthZoomImageView.this;
                healthZoomImageView4.e = healthZoomImageView4.f23545b.getIntrinsicWidth();
                HealthZoomImageView healthZoomImageView5 = HealthZoomImageView.this;
                healthZoomImageView5.d = healthZoomImageView5.f23545b.getIntrinsicHeight();
                HealthZoomImageView.this.c();
                HealthZoomImageView.this.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f23545b == null) {
            return;
        }
        int i = this.e;
        int i2 = this.ad;
        if (i > i2 && this.d < this.f) {
            this.u = (i2 * 1.0f) / i;
        } else {
            int i3 = this.d;
            int i4 = this.f;
            if (i3 > i4 && i < i2) {
                this.u = (i4 * 1.0f) / i3;
            } else if (i3 > i4 && i > i2) {
                this.u = Math.min((i4 * 1.0f) / i3, (i2 * 1.0f) / i);
            } else if (i3 < i4 && i < i2) {
                this.u = Math.min((i4 * 1.0f) / i3, (i2 * 1.0f) / i);
            } else {
                this.u = 1.0f;
            }
        }
        if (this.w == 0) {
            float f = this.u;
            this.l = this.k * f;
            this.t = f * this.s;
        } else {
            this.l = this.k;
            this.t = this.s;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Matrix matrix = new Matrix();
        this.n = matrix;
        matrix.postTranslate((this.ad / 2.0f) - (this.e / 2.0f), (this.f / 2.0f) - (this.d / 2.0f));
        Matrix matrix2 = this.n;
        float f = this.u;
        matrix2.postScale(f, f, this.ad / 2.0f, this.f / 2.0f);
        setImageMatrix(this.n);
    }

    public float getScale() {
        float[] fArr = new float[9];
        this.n.getValues(fArr);
        return fArr[0];
    }

    private RectF a(Matrix matrix) {
        RectF rectF = new RectF();
        if (this.f23545b == null) {
            return null;
        }
        rectF.set(0.0f, 0.0f, this.e, this.d);
        matrix.mapRect(rectF);
        return rectF;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.f23545b == null) {
            return true;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float scale = getScale();
        float f = scale * scaleFactor;
        float f2 = this.l;
        if (f >= f2 && scaleFactor > 1.0f) {
            scaleFactor = f2 / scale;
        }
        float f3 = this.t;
        if (f <= f3 && scaleFactor < 1.0f) {
            scaleFactor = f3 / scale;
        }
        this.n.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        e();
        setImageMatrix(this.n);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        float scale = getScale();
        float f = this.u;
        if (scale < f) {
            float f2 = f / scale;
            this.n.postScale(f2, f2, this.ad / 2.0f, this.f / 2.0f);
            setImageMatrix(this.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        float fHeight;
        RectF rectFA = a(this.n);
        if (rectFA == null) {
            LogUtil.j("HealthZoomImageView", "checkBorderAndCenterWhenScale RectF is null");
            return;
        }
        float fWidth = 0.0f;
        if (rectFA.height() >= this.f) {
            fHeight = rectFA.top > 0.0f ? -rectFA.top : 0.0f;
            float f = rectFA.bottom;
            float f2 = this.f;
            if (f < f2) {
                fHeight = f2 - rectFA.bottom;
            }
        } else {
            fHeight = 0.0f;
        }
        if (rectFA.width() >= this.ad) {
            fWidth = rectFA.left > 0.0f ? -rectFA.left : 0.0f;
            float f3 = rectFA.right;
            float f4 = this.ad;
            if (f3 < f4) {
                fWidth = f4 - rectFA.right;
            }
        }
        float fWidth2 = rectFA.width();
        float f5 = this.ad;
        if (fWidth2 < f5) {
            fWidth = (rectFA.width() / 2.0f) + ((f5 / 2.0f) - rectFA.right);
        }
        float fHeight2 = rectFA.height();
        float f6 = this.f;
        if (fHeight2 < f6) {
            fHeight = ((f6 / 2.0f) - rectFA.bottom) + (rectFA.height() / 2.0f);
        }
        this.n.postTranslate(fWidth, fHeight);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        if (this.f23544a.onTouchEvent(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.i = false;
        } else if (action == 2) {
            this.q = motionEvent.getX();
            float y = motionEvent.getY();
            this.p = y;
            if (!this.i) {
                this.i = true;
                this.g = this.q;
                this.h = y;
            }
            RectF rectFA = a(this.n);
            float f2 = 0.0f;
            if (rectFA != null) {
                f = (rectFA.height() <= ((float) this.f) || !a()) ? 0.0f : this.p - this.h;
                if (rectFA.width() > this.ad && b()) {
                    f2 = this.q - this.g;
                }
            } else {
                f = 0.0f;
            }
            this.n.postTranslate(f2, f);
            c(f2, f);
            this.g = this.q;
            this.h = this.p;
        } else if (action == 5 || action == 6) {
            this.i = false;
        } else {
            LogUtil.j("HealthZoomImageView", "onTouch default");
        }
        return this.x.onTouchEvent(motionEvent);
    }

    private boolean b() {
        RectF rectFA = a(this.n);
        return rectFA != null && rectFA.left <= 0.0f && rectFA.right >= ((float) getWidth());
    }

    private boolean a() {
        RectF rectFA = a(this.n);
        return rectFA != null && rectFA.top <= 0.0f && rectFA.bottom >= ((float) getHeight());
    }

    private void c(float f, float f2) {
        if (!b()) {
            this.n.postTranslate(-f, 0.0f);
        }
        if (!a()) {
            this.n.postTranslate(0.0f, -f2);
        }
        setImageMatrix(this.n);
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f23549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f23550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f23551c;
        private float d;

        e(float f, float f2, float f3) {
            this.f23550b = f;
            this.d = f2;
            this.f23549a = f3;
            if (HealthZoomImageView.this.getScale() < this.f23550b) {
                this.f23551c = 1.1f;
            } else {
                this.f23551c = 0.9f;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Matrix matrix = HealthZoomImageView.this.n;
            float f = this.f23551c;
            matrix.postScale(f, f, this.d, this.f23549a);
            HealthZoomImageView.this.e();
            HealthZoomImageView healthZoomImageView = HealthZoomImageView.this;
            healthZoomImageView.setImageMatrix(healthZoomImageView.n);
            float scale = HealthZoomImageView.this.getScale();
            float f2 = this.f23551c;
            if ((f2 > 1.0f && scale < this.f23550b) || (f2 < 1.0f && this.f23550b < scale)) {
                HealthZoomImageView.this.postDelayed(this, 10L);
                return;
            }
            float f3 = this.f23550b / scale;
            HealthZoomImageView.this.n.postScale(f3, f3, this.d, this.f23549a);
            HealthZoomImageView.this.e();
            HealthZoomImageView healthZoomImageView2 = HealthZoomImageView.this;
            healthZoomImageView2.setImageMatrix(healthZoomImageView2.n);
            HealthZoomImageView.this.j = false;
        }
    }
}
