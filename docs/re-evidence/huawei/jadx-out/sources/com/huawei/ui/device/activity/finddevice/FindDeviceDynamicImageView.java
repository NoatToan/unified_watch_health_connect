package com.huawei.ui.device.activity.finddevice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.qrs;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes16.dex */
public class FindDeviceDynamicImageView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f24376a;
    private Paint e;
    private Runnable f;
    private int g;
    private int h;
    private float[][] i;
    private boolean j;
    private int k;
    private static final float[] d = {1.0f, 0.73f, 0.47f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[][] f24375c = {new float[]{10.0f, 0.0f}, new float[]{6.0f, 0.0f}, new float[]{0.0f, 10.0f}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[][] f24374b = {new float[]{15.2f, 0.0f}, new float[]{20.4f, 10.2f}, new float[]{5.2f, 10.2f}};

    public FindDeviceDynamicImageView(Context context) {
        super(context);
        this.i = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 2);
        this.k = 0;
        this.g = 120;
        this.f = new Runnable() { // from class: com.huawei.ui.device.activity.finddevice.FindDeviceDynamicImageView.2
            @Override // java.lang.Runnable
            public void run() {
                FindDeviceDynamicImageView.this.invalidate();
                FindDeviceDynamicImageView.this.c();
            }
        };
        a();
    }

    public FindDeviceDynamicImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 2);
        this.k = 0;
        this.g = 120;
        this.f = new Runnable() { // from class: com.huawei.ui.device.activity.finddevice.FindDeviceDynamicImageView.2
            @Override // java.lang.Runnable
            public void run() {
                FindDeviceDynamicImageView.this.invalidate();
                FindDeviceDynamicImageView.this.c();
            }
        };
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.f24376a = paint;
        paint.setAntiAlias(true);
        this.f24376a.setStyle(Paint.Style.FILL_AND_STROKE);
        e();
        b();
    }

    private void e() {
        if (getContext() == null) {
            this.i = f24375c;
        } else if (qrs.x(BaseApplication.getContext())) {
            this.i = f24374b;
        } else {
            this.i = f24375c;
        }
    }

    private void b() {
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        this.e.setStyle(Paint.Style.FILL_AND_STROKE);
        if (getContext() == null) {
            this.e.setColor(-301790);
        } else if (qrs.x(BaseApplication.getContext())) {
            this.e.setColor(-1);
        } else {
            this.e.setColor(-301790);
        }
    }

    public void d() {
        b(this.g);
    }

    public void b(int i) {
        this.g = i;
        if (this.j) {
            return;
        }
        this.j = true;
        this.k = 0;
        e(i);
        post(this.f);
    }

    private void e(int i) {
        Context context = getContext();
        if (context != null) {
            this.h = d(context, i);
        }
    }

    private static int d(Context context, float f) {
        if (context == null) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void h() {
        int i = this.k + 1;
        this.k = i;
        this.k = i % 200;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        postDelayed(this.f, 10L);
    }

    private void c(Canvas canvas, int i) {
        int length = d.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.e.setAlpha((int) c(i2, i));
            float f = this.h;
            canvas.drawCircle(f, f, b(i2, i), this.e);
        }
    }

    private float b(int i, int i2) {
        float f = this.h;
        float[] fArr = d;
        float f2 = fArr[i] * f;
        return f2 + (i >= 1 ? (((f * fArr[i - 1]) - f2) / 200.0f) * i2 : 0.0f);
    }

    private float c(int i, int i2) {
        if (i < 0) {
            return 0.0f;
        }
        float[][] fArr = this.i;
        if (i >= fArr.length) {
            return 0.0f;
        }
        float[] fArr2 = fArr[i];
        float f = fArr2[0];
        return f + (((fArr2[1] - f) / 200.0f) * i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.onDraw(canvas);
        h();
        c(canvas, this.k);
        canvas.save();
        canvas.restore();
    }
}
