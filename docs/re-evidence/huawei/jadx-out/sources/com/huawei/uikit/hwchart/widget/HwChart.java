package com.huawei.uikit.hwchart.widget;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.core.content.ContextCompat;
import com.huawei.uikit.hwchart.R;
import defpackage.crd;
import defpackage.xfs;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class HwChart extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AnimationListener f29326a;
    private int[] aa;
    private float ab;
    private ArgbEvaluator ac;
    private RectF ad;
    private int ae;
    private float af;
    private boolean ag;
    private int ah;
    private int ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f29327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f29328c;
    private int d;
    private RectF e;
    private float f;
    private float g;
    private float h;
    private int i;
    private float j;
    private int k;
    private int l;
    private float m;
    private List<b> n;
    private float o;
    private RectF p;
    private crd q;
    private long r;
    private boolean s;
    private RectF t;
    private int u;
    private boolean v;
    private int w;
    private int x;
    private int[] y;
    private int z;

    public interface AnimationListener {
        void onAnimationEnd();
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f29329a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f29331c;
        private float d;
        private RectF f;
        private float[] h;
        private int[] i;
        private int j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f29330b = 0.0f;
        private Paint g = new Paint();

        b(float f, int i, int i2, RectF rectF, int i3) {
            this.f29329a = f;
            this.f29331c = i;
            this.j = i2;
            this.f = rectF;
            e(i3);
        }

        private void f() {
            int iA = HwChart.this.a(this.d, 225.0f, this.f29331c, this.j);
            int[] iArr = this.i;
            if (iArr == null || iArr.length != 3) {
                int i = this.f29331c;
                this.i = new int[]{i, iA, i};
            } else {
                iArr[1] = iA;
            }
            float[] fArr = this.h;
            if (fArr == null || fArr.length != 3) {
                this.h = new float[]{0.0f, 0.625f, 1.0f};
            } else {
                fArr[1] = 0.625f;
            }
            g();
        }

        private void g() {
            if (this.f == null) {
                return;
            }
            this.g.setShader(new SweepGradient(this.f.centerX(), this.f.centerY(), this.i, this.h));
        }

        private void h() {
            int iA = HwChart.this.a(this.d, 135.0f, this.f29331c, this.j);
            int iA2 = HwChart.this.a(this.d, 225.0f, this.f29331c, this.j);
            int[] iArr = this.i;
            if (iArr == null || iArr.length != 4) {
                int i = this.j;
                this.i = new int[]{iA, iA2, i, i};
            } else {
                iArr[0] = iA;
                iArr[1] = iA2;
            }
            float f = ((this.d - 225.0f) / 360.0f) + 0.25f;
            float[] fArr = this.h;
            if (fArr == null || fArr.length != 4) {
                this.h = new float[]{0.0f, 0.25f, f, 1.0f};
            } else {
                fArr[2] = f;
            }
            g();
        }

        private int i() {
            return Float.compare(this.d, 36.0f) <= 0 ? HwChart.this.a(45.0f, this.d + 9.0f, this.f29331c, this.j) : this.j;
        }

        private void j() {
            int i = i();
            int[] iArr = this.i;
            if (iArr == null || iArr.length != 3) {
                int i2 = this.f29331c;
                this.i = new int[]{i2, i, i2};
            } else {
                iArr[1] = i;
            }
            float[] fArr = this.h;
            if (fArr == null || fArr.length != 3) {
                this.h = new float[]{0.0f, this.d / 360.0f, 1.0f};
            } else {
                fArr[1] = (this.d - HwChart.this.f) / 360.0f;
            }
            g();
        }

        public float a() {
            return this.d;
        }

        public float b() {
            return this.f29329a;
        }

        public int c() {
            return this.f29331c;
        }

        public float d() {
            return this.f29330b;
        }

        public int e() {
            return i();
        }

        public void b(float f) {
            this.d = f;
        }

        public void d(float f) {
            this.f29330b = f;
        }

        public void b(Canvas canvas) {
            if (canvas == null || this.f == null) {
                return;
            }
            j();
            canvas.save();
            canvas.rotate(this.f29330b, this.f.centerX(), this.f.centerY());
            canvas.drawArc(this.f, HwChart.this.j, this.d - HwChart.this.j, false, this.g);
            canvas.restore();
        }

        public void c(int i) {
            Paint paint = this.g;
            if (paint != null) {
                paint.setStrokeWidth(i);
            }
        }

        public void d(Canvas canvas) {
            if (canvas == null || this.f == null) {
                return;
            }
            f();
            canvas.save();
            canvas.rotate(HwChart.this.w, this.f.centerX(), this.f.centerY());
            canvas.drawArc(this.f, 0.0f, 225.0f, false, this.g);
            canvas.rotate(135.0f, this.f.centerX(), this.f.centerY());
            h();
            canvas.drawArc(this.f, 90.0f, this.d - 225.0f, false, this.g);
            canvas.restore();
        }

        private void e(int i) {
            this.g.setAntiAlias(true);
            this.g.setStrokeWidth(i);
            this.g.setStrokeCap(Paint.Cap.ROUND);
            this.g.setStyle(Paint.Style.STROKE);
        }
    }

    public HwChart(Context context) {
        this(context, null);
    }

    private void a(Resources resources) {
        int i = this.i;
        if (i == 2) {
            this.k = resources.getDimensionPixelSize(R.dimen.hwchart_small_height);
            this.l = resources.getDimensionPixelSize(R.dimen.hwchart_small_width);
        } else if (i == 1) {
            this.k = resources.getDimensionPixelSize(R.dimen.hwchart_middle_height);
            this.l = resources.getDimensionPixelSize(R.dimen.hwchart_middle_width);
        } else {
            this.k = resources.getDimensionPixelSize(R.dimen.hwchart_large_height);
            this.l = resources.getDimensionPixelSize(R.dimen.hwchart_large_width);
        }
    }

    private void b(Resources resources) {
        int iD = d(resources);
        if (iD == 0) {
            return;
        }
        int iC = (int) ((this.u * c(resources)) / iD);
        setPadding(iC, iC, iC, iC);
    }

    private void f() {
        float f = 0.0f;
        for (b bVar : this.n) {
            float fB = bVar.b();
            bVar.d(this.w + f);
            bVar.b(fB);
            f += fB;
        }
    }

    private void g() {
        Iterator<b> it = this.n.iterator();
        while (it.hasNext()) {
            it.next().c(this.u);
        }
    }

    private float getAnimationProgress() {
        return (AnimationUtils.currentAnimationTimeMillis() - this.r) / 1200.0f;
    }

    private int[] getDefaultBeginColors() {
        return this.y;
    }

    private int[] getDefaultEndColors() {
        return this.aa;
    }

    private int getSectionIndex() {
        float fA = 0.0f;
        int i = 0;
        while (Float.compare(fA, 225.0f) < 0 && i < this.n.size()) {
            fA += this.n.get(i).a();
            i++;
        }
        return Math.max(0, i - 1);
    }

    private int getSplitIndex() {
        for (int i = 0; i < this.n.size(); i++) {
            if (e(i)) {
                return i;
            }
        }
        return this.n.size() - 1;
    }

    private void i(Resources resources) {
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.hwchart_large_bar_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.hwchart_large_blur_width);
        int i = this.u;
        if ((i != dimensionPixelSize || this.z != dimensionPixelSize2) && dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            this.z = (int) ((i * dimensionPixelSize2) / f);
            this.ah = (int) ((this.u * resources.getDimensionPixelSize(R.dimen.hwchart_large_blur_radius)) / f);
            this.ae = (int) ((this.u * resources.getDimensionPixelSize(R.dimen.hwchart_blur_offset_x)) / f);
            this.ai = (int) ((this.u * resources.getDimensionPixelSize(R.dimen.hwchart_blur_offset_y)) / f);
            return;
        }
        if (this.z == -1) {
            this.z = dimensionPixelSize2;
        }
        if (this.ah <= 0) {
            this.ah = resources.getDimensionPixelSize(R.dimen.hwchart_large_blur_radius);
        }
        if (this.ae == -1) {
            this.ae = resources.getDimensionPixelSize(R.dimen.hwchart_blur_offset_x);
        }
        if (this.ai == -1) {
            this.ai = resources.getDimensionPixelSize(R.dimen.hwchart_blur_offset_y);
        }
    }

    public boolean c() {
        return this.s;
    }

    public boolean e() {
        return this.ag;
    }

    public AnimationListener getAnimationListener() {
        return this.f29326a;
    }

    public int getBackGroundColor() {
        return this.d;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.onDraw(canvas);
        canvas.rotate(-90.0f, this.ad.centerX(), this.ad.centerY());
        float fA = this.m;
        if (c() && a()) {
            fA = a(this.m);
            h();
        } else {
            f();
        }
        a(canvas, fA);
        b(canvas, fA);
        c(canvas, fA);
        if (c()) {
            if (a()) {
                invalidate();
                return;
            }
            AnimationListener animationListener = this.f29326a;
            if (animationListener != null) {
                animationListener.onAnimationEnd();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSizeAndState(this.l, i, 0), View.resolveSizeAndState(this.k, i2, 0));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int iE;
        Resources resources = getResources();
        if (resources == null || (iE = e(resources)) == 0) {
            return;
        }
        int iD = d(resources);
        if (this.v) {
            this.u = (int) ((iD * Math.min(i, i2)) / iE);
            this.u = Math.min(this.u, (int) (resources.getDisplayMetrics().density * 32.0f));
        }
        g(resources);
    }

    public void setAnimationEnabled(boolean z) {
        this.s = z;
        if (z) {
            i();
        }
        invalidate();
    }

    public void setAnimationListener(AnimationListener animationListener) {
        this.f29326a = animationListener;
    }

    public void setBackGroundColor(int i) {
        this.d = i;
        Paint paint = this.f29327b;
        if (paint != null) {
            paint.setColor(i);
        }
        invalidate();
    }

    public void setBlurEnabled(boolean z) {
        if (this.i != 0) {
            Log.w("HwChart", "setBlurEnabled: blur is supported only in large mode.");
        } else {
            this.ag = z;
            invalidate();
        }
    }

    public void setChartData(long j, int[] iArr) {
        setChartData(j, iArr, getDefaultBeginColors(), getDefaultEndColors());
    }

    public HwChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwChartStyle);
    }

    private int e(Resources resources) {
        int i = this.i;
        if (i != 1) {
            return i != 2 ? resources.getDimensionPixelSize(R.dimen.hwchart_large_width) : resources.getDimensionPixelSize(R.dimen.hwchart_small_width);
        }
        return resources.getDimensionPixelSize(R.dimen.hwchart_middle_width);
    }

    private void e(TypedArray typedArray) {
        this.y = new int[]{typedArray.getColor(R.styleable.HwChart_hwChartBeginColor1, ContextCompat.getColor(getContext(), R.color.hwchart_begin_color1)), typedArray.getColor(R.styleable.HwChart_hwChartBeginColor2, ContextCompat.getColor(getContext(), R.color.hwchart_begin_color2)), typedArray.getColor(R.styleable.HwChart_hwChartBeginColor3, ContextCompat.getColor(getContext(), R.color.hwchart_begin_color3)), typedArray.getColor(R.styleable.HwChart_hwChartBeginColor4, ContextCompat.getColor(getContext(), R.color.hwchart_begin_color4)), typedArray.getColor(R.styleable.HwChart_hwChartBeginColor5, ContextCompat.getColor(getContext(), R.color.hwchart_begin_color5)), typedArray.getColor(R.styleable.HwChart_hwChartBeginColor6, ContextCompat.getColor(getContext(), R.color.hwchart_begin_color6)), typedArray.getColor(R.styleable.HwChart_hwChartBeginColor7, ContextCompat.getColor(getContext(), R.color.hwchart_begin_color7)), typedArray.getColor(R.styleable.HwChart_hwChartBeginColor8, ContextCompat.getColor(getContext(), R.color.hwchart_begin_color8)), typedArray.getColor(R.styleable.HwChart_hwChartBeginColor9, ContextCompat.getColor(getContext(), R.color.hwchart_begin_color9))};
        this.aa = new int[]{typedArray.getColor(R.styleable.HwChart_hwChartEndColor1, ContextCompat.getColor(getContext(), R.color.hwchart_end_color1)), typedArray.getColor(R.styleable.HwChart_hwChartEndColor2, ContextCompat.getColor(getContext(), R.color.hwchart_end_color2)), typedArray.getColor(R.styleable.HwChart_hwChartEndColor3, ContextCompat.getColor(getContext(), R.color.hwchart_end_color3)), typedArray.getColor(R.styleable.HwChart_hwChartEndColor4, ContextCompat.getColor(getContext(), R.color.hwchart_end_color4)), typedArray.getColor(R.styleable.HwChart_hwChartEndColor5, ContextCompat.getColor(getContext(), R.color.hwchart_end_color5)), typedArray.getColor(R.styleable.HwChart_hwChartEndColor6, ContextCompat.getColor(getContext(), R.color.hwchart_end_color6)), typedArray.getColor(R.styleable.HwChart_hwChartEndColor7, ContextCompat.getColor(getContext(), R.color.hwchart_end_color7)), typedArray.getColor(R.styleable.HwChart_hwChartEndColor8, ContextCompat.getColor(getContext(), R.color.hwchart_end_color8)), typedArray.getColor(R.styleable.HwChart_hwChartEndColor9, ContextCompat.getColor(getContext(), R.color.hwchart_end_color9))};
    }

    public void setChartData(long j, int[] iArr, int[] iArr2, int[] iArr3) {
        if (iArr == null || iArr2 == null || iArr3 == null) {
            Log.e("HwChart", "setChartData: data or color is null.");
            return;
        }
        if (iArr.length == 0) {
            Log.w("HwChart", "setChartData: data is empty.");
            return;
        }
        if (iArr2.length != iArr3.length || iArr2.length == 0) {
            iArr2 = getDefaultBeginColors();
            iArr3 = getDefaultEndColors();
            Log.w("HwChart", "setChartData: number of colors is invalid.");
        }
        b(j, iArr, iArr2, iArr3);
        if (c()) {
            i();
        }
        invalidate();
    }

    public HwChart(Context context, AttributeSet attributeSet, int i) {
        super(c(context, i), attributeSet, i);
        this.o = 360.0f;
        this.m = 0.0f;
        this.n = new ArrayList();
        this.l = -1;
        this.k = -1;
        this.t = new RectF();
        this.p = new RectF();
        this.q = null;
        this.w = 0;
        this.x = 360;
        this.ab = 0.0f;
        this.ad = new RectF();
        this.ac = null;
        this.ag = false;
        this.e = new RectF();
        this.f29327b = new Paint();
        e(super.getContext(), attributeSet, i);
    }

    private static Context c(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwChart);
    }

    private void e(Context context, AttributeSet attributeSet, int i) {
        Resources resources = getResources();
        if (resources == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            setLayerType(1, null);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwChart, i, R.style.Widget_Emui_HwChart);
        this.i = typedArrayObtainStyledAttributes.getInt(R.styleable.HwChart_hwSizeMode, 0);
        this.w = typedArrayObtainStyledAttributes.getInt(R.styleable.HwChart_hwChartBeginAngle, 0);
        this.x = typedArrayObtainStyledAttributes.getInt(R.styleable.HwChart_hwChartEndAngle, 360);
        this.w = Math.min(360, Math.max(0, this.w));
        int iMin = Math.min(360, Math.max(0, this.x));
        this.x = iMin;
        int i2 = this.w;
        this.o = i2 < iMin ? iMin - i2 : 360 - (i2 - iMin);
        this.s = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwChart_hwChartAnimationEnable, true);
        e(typedArrayObtainStyledAttributes);
        a(resources);
        b(typedArrayObtainStyledAttributes, resources);
        e(typedArrayObtainStyledAttributes, resources);
        d(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private void g(Resources resources) {
        b(resources);
        j();
        g();
        this.f29327b.setStrokeWidth(this.u);
        if (this.i != 0) {
            return;
        }
        i(resources);
        b();
    }

    private void i() {
        if (this.q == null) {
            this.q = new crd(110.0f, 17.0f);
        }
        this.r = AnimationUtils.currentAnimationTimeMillis();
    }

    private void j() {
        int height = getHeight();
        int width = getWidth();
        int iMin = Math.min((height - getPaddingBottom()) - getPaddingTop(), (width - getPaddingLeft()) - getPaddingRight());
        int i = (width - iMin) / 2;
        int i2 = (height - iMin) / 2;
        if (iMin % 2 != 0) {
            iMin++;
        }
        this.ad.set(i, i2, i + iMin, i2 + iMin);
        this.t.set(this.ad);
        RectF rectF = this.t;
        float f = -this.u;
        rectF.inset(f, f);
        this.ab = this.ad.width() != 0.0f ? (this.u * 360) / (this.ad.width() * 3.1415927f) : 0.0f;
    }

    private boolean d(int i, int i2) {
        return i > i2 || i < 0 || i2 >= this.n.size();
    }

    private void b() {
        this.f29328c.setMaskFilter(null);
        if (this.ah <= 0) {
            return;
        }
        try {
            this.f29328c.setMaskFilter(new BlurMaskFilter(this.ah, BlurMaskFilter.Blur.NORMAL));
            this.f29328c.setStrokeWidth(this.z);
        } catch (IllegalArgumentException unused) {
            Log.w("HwChart", "IllegalArgumentException");
        }
    }

    private float a(int i) {
        float fA = 0.0f;
        for (int i2 = 0; i2 <= i; i2++) {
            fA += this.n.get(i2).a();
        }
        return fA;
    }

    private boolean d(float f) {
        return Float.compare(f, 5.0f) <= 0;
    }

    private float[] a(int i, int i2) {
        int i3 = 0;
        if (d(i, i2)) {
            return new float[0];
        }
        int i4 = ((i2 - i) + 1) * 2;
        float[] fArr = new float[i4 + 1];
        float f = 0.0f;
        while (i3 < i4 - 1 && i <= i2) {
            float fB = this.n.get(i).b();
            float fA = this.n.get(i).a() / 360.0f;
            while (d(fB) && i < i2) {
                i++;
                fA += this.n.get(i).a() / 360.0f;
                fB = this.n.get(i).b();
            }
            float fMin = Math.min(0.4f * fA, 0.04f);
            fArr[i3] = f;
            f += fA;
            fArr[i3 + 1] = f - fMin;
            i++;
            i3 += 2;
        }
        fArr[i3] = 1.0f;
        return Arrays.copyOf(fArr, i3 + 1);
    }

    private void h() {
        float fB = 0.0f;
        float f = 0.0f;
        for (b bVar : this.n) {
            fB += bVar.b();
            float fE = e(a(fB) - f);
            bVar.d(this.w + f);
            bVar.b(d() + fE);
            f += fE;
        }
    }

    private int b(int i, int i2) {
        if (d(i, i2)) {
            return 0;
        }
        float fB = this.n.get(i).b();
        int i3 = i;
        while (d(fB) && i3 < i2) {
            i3++;
            fB = this.n.get(i3).b();
        }
        return (i3 - i) + 1;
    }

    private void b(TypedArray typedArray, Resources resources) {
        this.u = typedArray.getDimensionPixelSize(R.styleable.HwChart_hwBarWidth, -1);
        this.v = typedArray.getBoolean(R.styleable.HwChart_hwBarAutoWidth, true);
        if (this.u == -1) {
            this.u = d(resources);
        }
    }

    private void d(TypedArray typedArray) {
        int color = typedArray.getColor(R.styleable.HwChart_hwBgColor, -1);
        this.d = color;
        if (color == -1) {
            this.d = ContextCompat.getColor(getContext(), R.color.hwchart_background_color);
        }
        this.f29327b.setAntiAlias(true);
        this.f29327b.setStyle(Paint.Style.STROKE);
        this.f29327b.setStrokeWidth(this.u);
        this.f29327b.setStrokeCap(Paint.Cap.ROUND);
        this.f29327b.setColor(this.d);
    }

    private int d(Resources resources) {
        int i = this.i;
        if (i == 1) {
            return resources.getDimensionPixelSize(R.dimen.hwchart_middle_bar_width);
        }
        if (i != 2) {
            return resources.getDimensionPixelSize(R.dimen.hwchart_large_bar_width);
        }
        return resources.getDimensionPixelSize(R.dimen.hwchart_small_bar_width);
    }

    private void c(Canvas canvas, float f) {
        List<b> list = this.n;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.n.size();
        if (size == 1 && Float.compare(this.n.get(0).a(), 225.0f) > 0) {
            this.n.get(0).d(canvas);
            return;
        }
        if (Float.compare(f, 330.0f) >= 0) {
            b(canvas);
            return;
        }
        a(0.0f, 0.0f, 0.0f);
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.n.get(size).b(canvas);
            }
        }
    }

    private void b(long j, int[] iArr, int[] iArr2, int[] iArr3) {
        long jC = c(iArr);
        long jMax = Math.max(jC, j);
        if (jMax <= 0) {
            Log.w("HwChart", "onDataChanged: chartTotalData is less than or equals to 0. " + jMax);
            return;
        }
        float f = jMax;
        this.m = (this.o * jC) / f;
        this.h = 0.0f;
        this.n.clear();
        float f2 = 0.0f;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 <= 0) {
                Log.w("HwChart", "onDataChanged: data " + i + " is invalid. " + iArr[i]);
            } else {
                float fE = i == iArr.length + (-1) ? e(this.m - f2) : e((this.o * i2) / f);
                b bVar = new b(fE, iArr2[i % iArr2.length], iArr3[i % iArr3.length], this.ad, this.u);
                f2 += fE;
                if (i < iArr.length - 1) {
                    this.h += fE;
                }
                this.n.add(bVar);
            }
            i++;
        }
    }

    private void e(TypedArray typedArray, Resources resources) {
        if (this.i != 0) {
            return;
        }
        this.ag = true;
        this.z = typedArray.getDimensionPixelSize(R.styleable.HwChart_hwBlurWidth, -1);
        this.ah = typedArray.getDimensionPixelSize(R.styleable.HwChart_hwBlurRadius, -1);
        this.ae = typedArray.getDimensionPixelSize(R.styleable.HwChart_hwBlurOffsetX, -1);
        this.ai = typedArray.getDimensionPixelSize(R.styleable.HwChart_hwBlurOffsetY, -1);
        this.af = typedArray.getFloat(R.styleable.HwChart_hwBlurAlpha, R.dimen.hwchart_blur_alpha);
        i(resources);
        Paint paint = new Paint();
        this.f29328c = paint;
        paint.setAntiAlias(true);
        this.f29328c.setMaskFilter(new BlurMaskFilter(this.ah, BlurMaskFilter.Blur.NORMAL));
        this.f29328c.setStrokeWidth(this.z);
        this.f29328c.setStrokeCap(Paint.Cap.ROUND);
        this.f29328c.setStyle(Paint.Style.STROKE);
        this.f29328c.setAlpha((int) (this.af * 255.0f));
    }

    private float a(float f) {
        if (this.q == null) {
            return f;
        }
        return this.q.getInterpolation(getAnimationProgress()) * f;
    }

    private long c(int[] iArr) {
        long j = 0;
        for (int i : iArr) {
            if (i > 0) {
                j += (long) i;
            }
        }
        return j;
    }

    private void a(Canvas canvas, float f) {
        if (Float.compare(f, this.o) == 0) {
            return;
        }
        canvas.save();
        canvas.rotate(this.w, this.ad.centerX(), this.ad.centerY());
        canvas.drawArc(this.ad, f, this.o - f, false, this.f29327b);
        canvas.restore();
    }

    private float b(int i) {
        float fA = a(i - 1);
        float fA2 = a(i);
        if (Float.compare(225.0f - fA, this.ab) <= 0) {
            return fA + (this.n.get(i).a() / 2.0f);
        }
        if (Float.compare(fA2 - 225.0f, this.ab) <= 0) {
            return fA2 - (this.n.get(i).a() / 2.0f);
        }
        return 225.0f;
    }

    private int c(Resources resources) {
        int i = this.i;
        if (i == 1) {
            return resources.getDimensionPixelSize(R.dimen.hwchart_middle_padding);
        }
        if (i != 2) {
            return resources.getDimensionPixelSize(R.dimen.hwchart_large_padding);
        }
        return resources.getDimensionPixelSize(R.dimen.hwchart_small_padding);
    }

    private void c(Canvas canvas, int i, float f) {
        b bVar = this.n.get(i);
        int[] iArrC = c(0, i);
        if (iArrC.length <= 2) {
            return;
        }
        float fA = f - a(i - 1);
        iArrC[iArrC.length - 2] = a(bVar.a(), fA, bVar.c(), bVar.e());
        float[] fArrA = a(0, i);
        if (fArrA.length <= 2) {
            return;
        }
        fArrA[fArrA.length - 2] = (fA / 360.0f) + fArrA[fArrA.length - 3];
        d(iArrC, fArrA);
        canvas.save();
        canvas.rotate(this.w, this.e.centerX(), this.e.centerY());
        Path path = new Path();
        path.moveTo(this.p.centerX(), this.p.centerY());
        RectF rectF = this.p;
        float f2 = this.ab;
        path.arcTo(rectF, -f2, f2 + f);
        path.close();
        canvas.clipPath(path);
        canvas.drawArc(this.e, 0.0f, f, false, this.f29328c);
        canvas.restore();
    }

    private boolean a() {
        return Float.compare(getAnimationProgress(), 1.0f) <= 0;
    }

    private float e(float f) {
        try {
            return Float.parseFloat(new DecimalFormat("#.00").format(f));
        } catch (NumberFormatException unused) {
            Log.e("HwChart", "formatAngle fail, angle: " + f);
            return f;
        }
    }

    private void b(Canvas canvas, float f) {
        List<b> list;
        if (!e() || (list = this.n) == null || list.isEmpty()) {
            return;
        }
        this.e.set(this.ad);
        this.e.offset(-this.ai, this.ae);
        this.p.set(this.e);
        RectF rectF = this.p;
        float f2 = -this.z;
        rectF.inset(f2, f2);
        if (Float.compare(f, 225.0f) <= 0) {
            d(c(0, this.n.size() - 1), a(0, this.n.size() - 1));
            canvas.save();
            canvas.rotate(this.w, this.e.centerX(), this.e.centerY());
            canvas.drawArc(this.e, 0.0f, f, false, this.f29328c);
            canvas.restore();
            return;
        }
        int sectionIndex = getSectionIndex();
        float fB = b(sectionIndex);
        b(canvas, sectionIndex, fB, f);
        c(canvas, sectionIndex, fB);
    }

    private void d(int[] iArr, float[] fArr) {
        if (iArr != null && fArr != null && iArr.length == fArr.length) {
            this.f29328c.setShader(new SweepGradient(this.e.centerX(), this.e.centerY(), iArr, fArr));
        } else {
            Log.e("HwChart", "updateBlurPaint: length of colors and positions is not match.");
        }
    }

    private void a(int i, int i2, int i3, int[] iArr, int i4) {
        if (!d(i, i2) && iArr != null && i3 >= 0 && i3 < iArr.length) {
            b bVar = this.n.get(i);
            int[] iArrE = e(i, i2);
            if (iArrE.length != 2) {
                iArrE = new int[]{bVar.c(), bVar.e()};
            }
            if (i == 0) {
                iArr[i3] = bVar.c();
                int i5 = i + i4;
                iArr[i3 + 1] = i5 == this.n.size() ? this.n.get(i5 - 1).e() : iArrE[1];
            } else {
                iArr[i3] = iArrE[0];
                int i6 = (i4 + i) - 1;
                if (i6 < this.n.size()) {
                    i = i6;
                }
                iArr[i3 + 1] = this.n.get(i).e();
            }
        }
    }

    private void b(Canvas canvas, int i, float f, float f2) {
        b bVar = this.n.get(i);
        float fA = f - a(i - 1);
        int iA = a(bVar.a(), fA, bVar.c(), bVar.e());
        int[] iArrC = c(i, this.n.size() - 1);
        if (iArrC.length == 0) {
            return;
        }
        iArrC[0] = iA;
        d(iArrC, b(i, this.n.size() - 1, (bVar.a() - fA) / 360.0f));
        canvas.save();
        canvas.rotate(this.w + f, this.e.centerX(), this.e.centerY());
        Path path = new Path();
        path.moveTo(this.p.centerX(), this.p.centerY());
        float f3 = f2 - f;
        path.arcTo(this.p, 0.0f, this.ab + f3);
        path.close();
        canvas.clipPath(path);
        canvas.drawArc(this.e, 0.0f, f3, false, this.f29328c);
        canvas.restore();
    }

    private int[] e(int i, int i2) {
        if (d(i, i2)) {
            return new int[0];
        }
        b bVar = this.n.get(i);
        float fB = bVar.b();
        float fA = bVar.a();
        int iC = bVar.c();
        int iC2 = bVar.c();
        while (d(fB) && i < i2) {
            i++;
            b bVar2 = this.n.get(i);
            iC = a(bVar2.a() + fA, fA, iC, bVar2.e());
            iC2 = a(bVar2.a() + fA, bVar2.a(), iC2, bVar2.e());
            fA += bVar2.a();
            fB = bVar2.b();
        }
        return new int[]{iC, iC2};
    }

    private int[] c(int i, int i2) {
        int i3 = 0;
        if (d(i, i2)) {
            return new int[0];
        }
        int i4 = ((i2 - i) + 1) * 2;
        int[] iArr = new int[i4 + 1];
        int i5 = i;
        while (i5 <= i2 && i3 < i4 - 1) {
            b bVar = this.n.get(i5);
            int iB = b(i5, i2);
            if (iB > 1) {
                a(i5, i2, i3, iArr, iB);
                i3 += 2;
                i5 += iB;
            } else {
                iArr[i3] = bVar.c();
                iArr[i3 + 1] = bVar.e();
                i5++;
                i3 += 2;
            }
        }
        iArr[i3] = this.n.get(i).c();
        return Arrays.copyOf(iArr, i3 + 1);
    }

    private float[] b(int i, int i2, float f) {
        if (d(i, i2)) {
            return new float[0];
        }
        int i3 = 2;
        int i4 = ((i2 - i) + 1) * 2;
        float[] fArr = new float[i4 + 1];
        fArr[0] = 0.0f;
        fArr[1] = f - Math.min(f * 0.4f, 0.04f);
        int i5 = i + 1;
        while (i3 < i4 - 1 && i5 <= i2) {
            float fB = this.n.get(i5).b();
            float fA = this.n.get(i5).a() / 360.0f;
            while (d(fB) && i5 < i2) {
                i5++;
                fA += this.n.get(i5).a() / 360.0f;
                fB = this.n.get(i5).b();
            }
            float fMin = Math.min(fA * 0.4f, 0.04f);
            fArr[i3] = f;
            f += fA;
            fArr[i3 + 1] = f - fMin;
            i5++;
            i3 += 2;
        }
        fArr[i3] = 1.0f;
        return Arrays.copyOf(fArr, i3 + 1);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    private boolean e(int i) {
        boolean z;
        if (i >= 0 && i < this.n.size()) {
            b bVar = this.n.get(i);
            boolean z2 = Float.compare(bVar.a(), this.ab) > 0;
            if (c()) {
                if (Float.compare(a(i - 1) + (bVar.a() / 2.0f), (a(this.m) - 360.0f) + this.ab) > 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z2 && z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(float f, float f2, int i, int i2) {
        if (this.ac == null) {
            this.ac = new ArgbEvaluator();
        }
        return Float.compare(f, 0.0f) <= 0 ? i : ((Integer) this.ac.evaluate(f2 / f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    private float d() {
        float fWidth = this.ad.width() / 2.0f;
        if (Float.compare(fWidth, 0.0f) <= 0) {
            return 0.0f;
        }
        return 57.29578f / fWidth;
    }

    private void a(float f, float f2, float f3) {
        this.g = f;
        this.f = f2;
        this.j = f3;
    }

    private void b(Canvas canvas) {
        int splitIndex = getSplitIndex();
        float fD = this.n.get(splitIndex).d() + (this.n.get(splitIndex).b() / 2.0f);
        a(0.0f, 0.0f, 0.0f);
        d(canvas, splitIndex, fD, -180.0f);
        for (int i = splitIndex - 1; i >= 0; i--) {
            this.n.get(i).b(canvas);
        }
        for (int size = this.n.size() - 1; size > splitIndex; size--) {
            this.n.get(size).b(canvas);
        }
        if (splitIndex < 6 && this.h < 18.1f) {
            a(8.0f, 45.0f, 35.0f);
        } else {
            a(0.0f, 0.0f, 0.0f);
        }
        d(canvas, splitIndex, fD - d(), 180.0f);
    }

    private void d(Canvas canvas, int i, float f, float f2) {
        Path path = new Path();
        canvas.save();
        path.moveTo(this.t.centerX(), this.t.centerY());
        path.arcTo(this.t, f, f2 + this.g);
        path.close();
        canvas.clipPath(path);
        if (i < this.n.size()) {
            this.n.get(i).b(canvas);
        }
        canvas.restore();
    }
}
