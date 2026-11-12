package com.huawei.ui.homehealth.functionsetcard.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.izn;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class SleepThumbnailView extends View {
    private static final int[] e = {R.color.color_deep_sleep, R.color.color_shallow_sleep, R.color.color_rem_sleep, R.color.color_fffdc221, R.color.color_ff008fff};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f25460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<e> f25462c;
    private Context d;
    private float i;

    public SleepThumbnailView(Context context) {
        super(context);
        this.f25462c = new ArrayList<>(5);
        d(context);
    }

    public SleepThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25462c = new ArrayList<>(5);
        d(context);
    }

    public void setSleepData(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean z;
        boolean z2;
        float[] fArr;
        int i8 = 0;
        this.f25461b = 0;
        int i9 = i + i2 + i3;
        int i10 = i9 + i4 + i5;
        if (i9 != 0 || i6 == 0) {
            z = false;
        } else {
            i10 = i6;
            z = true;
        }
        if (i10 <= 0) {
            LogUtil.e("FunctionSet_SleepThumbnailView", "sleep sum error");
            return;
        }
        float f = i;
        float f2 = i2;
        float f3 = i3;
        float f4 = i4;
        float f5 = i5;
        this.f25460a = new float[]{f, f2, f3, f4, f5};
        float f6 = i10;
        float[] fArr2 = {f / f6, f2 / f6, f3 / f6, f4 / f6, f5 / f6};
        if (!z) {
            z2 = false;
            fArr = fArr2;
        } else if (i7 == 0) {
            fArr = new float[]{i6 / f6};
            z2 = true;
        } else {
            float f7 = (i6 - i7) / 2;
            float f8 = i7;
            this.f25460a = new float[]{f7, f8, f7};
            float f9 = f7 / f6;
            fArr2 = new float[]{f9, f8 / f6, f9};
            z2 = false;
            fArr = fArr2;
        }
        if (z) {
            if (z2) {
                this.f25462c.get(0).c(this.d.getResources().getColor(R.color.manual_bed_time_chart_color));
                this.f25462c.get(0).c(fArr[0]);
            } else {
                this.f25462c.get(0).c(this.d.getResources().getColor(R.color.manual_bed_time_chart_color));
                this.f25462c.get(1).c(this.d.getResources().getColor(R.color.manual_sleep_time_chart_color));
                this.f25462c.get(2).c(this.d.getResources().getColor(R.color.manual_bed_time_chart_color));
            }
            while (i8 < fArr.length) {
                this.f25462c.get(i8).c(fArr[i8]);
                LogUtil.a("FunctionSet_SleepThumbnailView", "data width ", Integer.valueOf(i8), " is ", Float.valueOf(fArr[i8]));
                i8++;
            }
            return;
        }
        for (int i11 = 0; i11 < 5; i11++) {
            this.f25462c.get(i11).c(fArr[i11]);
            LogUtil.a("FunctionSet_SleepThumbnailView", "data width ", Integer.valueOf(i11), " is ", Float.valueOf(fArr[i11]));
        }
        while (true) {
            int[] iArr = e;
            if (i8 >= iArr.length) {
                return;
            }
            this.f25462c.get(i8).c(this.d.getResources().getColor(iArr[i8]));
            i8++;
        }
    }

    private float d(float f, float[] fArr) {
        int i = 0;
        for (float f2 : fArr) {
            if (f2 > 0.0f) {
                i++;
            }
        }
        float f3 = f - ((i - 1) * 1.0f);
        LogUtil.a("FunctionSet_SleepThumbnailView", "sleepViewWidth = ", Float.valueOf(f3));
        return f3;
    }

    private void d(Context context) {
        this.d = context;
        for (int i : e) {
            this.f25462c.add(new e(context.getResources().getColor(i)));
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (LanguageUtil.ba(this.d.getApplicationContext())) {
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight());
        }
        c();
        float f = 0.0f;
        for (e eVar : this.f25462c) {
            if (eVar.a() > 0.0f) {
                float fA = f + (eVar.a() * this.i);
                d(canvas, f, fA, eVar.e(), eVar.d());
                f = fA + 1.0f;
            }
        }
    }

    private void c() {
        int measuredWidth = getMeasuredWidth();
        if (this.f25461b != measuredWidth) {
            this.f25461b = measuredWidth;
            this.i = d(izn.e(this.d, measuredWidth), this.f25460a);
        }
        LogUtil.a("FunctionSet_SleepThumbnailView", "initSleepViewWidthWithDp currentMeasureWidth :", Integer.valueOf(measuredWidth), "initSleepViewWidthWithDp mSleepViewWidthWithDp :", Float.valueOf(this.i));
    }

    private void d(Canvas canvas, float f, float f2, int i, int i2) {
        Paint paint = new Paint();
        paint.setColor(i);
        canvas.drawRect(d(f), d(15.0f), d(f2), d(17.0f), paint);
        paint.setShader(new LinearGradient(0.0f, d(17.0f), 0.0f, d(45.0f), new int[]{i2, 0}, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawRect(d(f), d(17.0f), d(f2), d(45.0f), paint);
    }

    public float d(float f) {
        return qrs.d(this.d, f);
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f25463a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f25464c;
        private int e;

        private int b(int i) {
            return i + 1308622848;
        }

        private e(int i) {
            c(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float a() {
            return this.f25464c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(float f) {
            this.f25464c = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int e() {
            return this.f25463a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(int i) {
            this.f25463a = i;
            this.e = b(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int d() {
            return this.e;
        }
    }
}
