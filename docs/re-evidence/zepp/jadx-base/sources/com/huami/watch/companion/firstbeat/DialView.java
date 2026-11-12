package com.huami.watch.companion.firstbeat;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class DialView extends View {
    public static final int DEFAULT_CIRCLE_RADIUS_DP = 90;
    public static final int DEFAULT_STROKE_WIDTH_DP = 14;
    private final float a;
    private final float b;
    private final int c;
    private final int d;
    private Context e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Paint j;
    private Paint k;
    private Paint l;
    private Paint m;
    private RectF n;
    private int o;
    private int[] p;
    private Bitmap q;
    private float r;

    public DialView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        int length = this.p.length;
        for (int i = 0; i < length; i++) {
            this.j.setColor(this.p[i]);
            if (i == 0) {
                this.j.setStrokeCap(Paint.Cap.ROUND);
                this.j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            } else if (i == length - 1) {
                this.j.setStrokeCap(Paint.Cap.ROUND);
                this.j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
            } else {
                this.j.setStrokeCap(Paint.Cap.BUTT);
            }
            float f = 180.0f / length;
            canvas.drawArc(this.n, (i * f) + 180.0f, f, false, this.j);
        }
    }

    private void b(Canvas canvas) {
        RectF rectF = this.n;
        float f = this.r;
        canvas.drawArc(rectF, (f * 180.0f) + 180.0f, 180.0f - (f * 180.0f), false, this.l);
    }

    private void c(Canvas canvas) {
        canvas.save();
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.rotate(this.r * 180.0f, 0.0f, 0.0f);
        canvas.drawBitmap(this.q, (-this.f) / 2, (-this.q.getHeight()) / 2, (Paint) null);
        canvas.restore();
    }

    private void d(Canvas canvas) {
        this.m.setMaskFilter(new BlurMaskFilter(15.0f, BlurMaskFilter.Blur.SOLID));
        RectF rectF = this.n;
        float f = this.r;
        canvas.drawArc(rectF, (f * 180.0f) + 180.0f, 180.0f - (f * 180.0f), false, this.m);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void e() {
        disableHardwareAccelerated();
        Paint paint = new Paint();
        this.j = paint;
        paint.setAntiAlias(true);
        this.j.setStyle(Paint.Style.STROKE);
        this.j.setStrokeWidth(this.o);
        Paint paint2 = new Paint();
        this.k = paint2;
        paint2.setAntiAlias(true);
        this.k.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.l = paint3;
        paint3.setAntiAlias(true);
        this.l.setColor(DefaultTimeBar.DEFAULT_BUFFERED_COLOR);
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setStrokeWidth(this.o + 0.5f);
        this.l.setStrokeCap(Paint.Cap.ROUND);
        Paint paint4 = new Paint();
        this.m = paint4;
        paint4.setAntiAlias(true);
        this.m.setColor(838860800);
        this.m.setStyle(Paint.Style.STROKE);
        this.m.setStrokeWidth(this.o);
        this.m.setStrokeCap(Paint.Cap.ROUND);
        this.q = f(R.drawable.ic_vo2max_pointer_arrow);
        this.h = dip2px(this.e, 12.0f);
    }

    private Bitmap f(int i) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.e.getResources(), i);
        Matrix matrix = new Matrix();
        matrix.postRotate(-90.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, true);
        if (!bitmapDecodeResource.isRecycled()) {
            bitmapDecodeResource.recycle();
        }
        return bitmapCreateBitmap;
    }

    public void disableHardwareAccelerated() {
        if (!supportHardwareAccelerated() || isHardwareAccelerated()) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f;
        canvas.translate(i / 2, i / 2);
        a(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            this.f = size;
        } else {
            this.f = (this.i * 2) + this.o + (this.h * 2);
        }
        if (mode2 == 1073741824) {
            this.g = size2;
        } else {
            this.g = this.i + this.o + (this.h * 2);
        }
        setMeasuredDimension(this.f, this.g);
        if (this.n == null) {
            this.h = this.q.getWidth() + dip2px(this.e, 5.0f);
            this.i = ((Math.max(this.f, this.g) - this.o) - (this.h * 2)) / 2;
            int i3 = this.i;
            this.n = new RectF(-i3, -i3, i3, i3);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setColor(int[] iArr) {
        if (iArr == null) {
            return;
        }
        this.p = iArr;
        postInvalidate();
    }

    public void setPercent(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        this.r = f;
        postInvalidate();
    }

    public boolean supportHardwareAccelerated() {
        return Build.VERSION.SDK_INT >= 11;
    }

    public DialView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DialView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 180.0f;
        this.b = 180.0f;
        this.c = 838860800;
        this.d = DefaultTimeBar.DEFAULT_BUFFERED_COLOR;
        this.p = new int[]{-603904, -14366898, -2080723};
        this.r = 0.0f;
        this.e = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DialView, i, 0);
        this.o = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.DialView_dv_stroke_width, 14.0f);
        typedArrayObtainStyledAttributes.recycle();
        e();
    }
}
