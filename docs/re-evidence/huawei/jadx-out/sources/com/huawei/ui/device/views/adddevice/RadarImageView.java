package com.huawei.ui.device.views.adddevice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.qrs;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes16.dex */
public class RadarImageView extends View {
    private Paint e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private float[][] j;
    private Runnable k;
    private int l;
    private Shader m;
    private Paint n;
    private Matrix o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f24976a = {1.0f, 0.7f, 0.4f, 0.1f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f24978c = {0.0f, 0.96f, 0.96f, 1.0f};
    private static final float[][] d = {new float[]{10.0f, 10.0f}, new float[]{15.0f, 10.0f}, new float[]{20.0f, 15.0f}, new float[]{25.0f, 20.0f}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[][] f24977b = {new float[]{20.0f, 20.0f}, new float[]{30.0f, 20.0f}, new float[]{40.0f, 30.0f}, new float[]{50.0f, 40.0f}};

    public RadarImageView(Context context) {
        super(context);
        this.j = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 2);
        this.l = 0;
        this.o = new Matrix();
        this.h = 0;
        this.f = 126;
        this.k = new Runnable() { // from class: com.huawei.ui.device.views.adddevice.RadarImageView.3
            @Override // java.lang.Runnable
            public void run() {
                RadarImageView.this.j();
                RadarImageView.this.invalidate();
                RadarImageView.this.i();
            }
        };
        b();
    }

    public RadarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 2);
        this.l = 0;
        this.o = new Matrix();
        this.h = 0;
        this.f = 126;
        this.k = new Runnable() { // from class: com.huawei.ui.device.views.adddevice.RadarImageView.3
            @Override // java.lang.Runnable
            public void run() {
                RadarImageView.this.j();
                RadarImageView.this.invalidate();
                RadarImageView.this.i();
            }
        };
        b();
    }

    private void b() {
        c();
        f();
        d();
    }

    private void c() {
        if (getContext() == null) {
            this.j = d;
        } else if (qrs.x(BaseApplication.getContext())) {
            this.j = f24977b;
        } else {
            this.j = d;
        }
    }

    private void f() {
        Paint paint = new Paint();
        this.n = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.n.setAntiAlias(true);
    }

    private void d() {
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        this.e.setStyle(Paint.Style.FILL_AND_STROKE);
        if (getContext() == null) {
            this.e.setColor(-16777216);
        } else if (qrs.x(BaseApplication.getContext())) {
            this.e.setColor(352321535);
        } else {
            this.e.setColor(-16777216);
        }
    }

    public void a() {
        this.i = false;
        this.o.reset();
        Matrix matrix = this.o;
        float f = this.g;
        matrix.postRotate(-90.0f, f, f);
        invalidate();
        removeCallbacks(this.k);
    }

    public void e() {
        if (qrs.ah(BaseApplication.getContext())) {
            this.f = TsExtractor.TS_STREAM_TYPE_DTS_HD;
        }
        d(this.f);
    }

    public void d(int i) {
        this.f = i;
        if (this.i) {
            return;
        }
        this.i = true;
        this.h = 0;
        e(i);
        post(this.k);
    }

    private void e(int i) {
        Context context;
        if (this.m == null && (context = getContext()) != null) {
            int iD = qrs.d(context, i);
            this.g = iD;
            float f = iD;
            this.m = new SweepGradient(f, f, new int[]{0, 0, 16475426, 872113442}, f24978c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.l = (this.l + 2) % 360;
        Matrix matrix = this.o;
        float f = this.g;
        matrix.postRotate(2.0f, f, f);
    }

    private void g() {
        int i = this.h + 1;
        this.h = i;
        this.h = i % 200;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        postDelayed(this.k, 20L);
    }

    private void d(Canvas canvas) {
        float f = this.g;
        float f2 = f24976a[0];
        this.n.setShader(this.m);
        canvas.concat(this.o);
        float f3 = this.g;
        canvas.drawCircle(f3, f3, f * f2, this.n);
    }

    private void a(Canvas canvas, int i) {
        int length = f24976a.length;
        Path path = new Path();
        int i2 = length - 1;
        for (int i3 = i2; i3 >= 0; i3--) {
            this.e.setAlpha((int) c(i3, i));
            canvas.save();
            if (i3 != i2) {
                float f = this.g;
                path.addCircle(f, f, e(i3 + 1, i), Path.Direction.CW);
                canvas.clipOutPath(path);
            }
            float f2 = this.g;
            canvas.drawCircle(f2, f2, e(i3, i), this.e);
            canvas.restore();
        }
    }

    private float e(int i, int i2) {
        float f = this.g;
        float[] fArr = f24976a;
        float f2 = fArr[i] * f;
        return f2 + (i >= 1 ? (((f * fArr[i - 1]) - f2) / 200.0f) * i2 : 0.0f);
    }

    private float c(int i, int i2) {
        if (i >= 1) {
            float[][] fArr = this.j;
            if (i < fArr.length) {
                float[] fArr2 = fArr[i];
                float f = fArr2[0];
                return f - (((f - fArr2[1]) / 200.0f) * i2);
            }
        }
        return this.j[i][0];
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.onDraw(canvas);
        g();
        a(canvas, this.h);
        canvas.save();
        d(canvas);
        canvas.restore();
    }

    public void b(int i) {
        a();
        this.i = true;
        this.m = null;
        this.o.reset();
        e(i);
        post(this.k);
    }
}
