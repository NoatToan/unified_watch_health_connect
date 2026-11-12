package com.huawei.ui.commonui.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.njy;
import defpackage.qlj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class IndicatorCircle extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<qlj> f23563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<qlj> f23564c;
    private float d;
    private float e;
    private Drawable f;
    private float g;
    private float[] h;
    private float i;
    private float j;
    private boolean k;
    private boolean l;
    private int[] m;
    private Runnable n;
    private Paint o;
    private PorterDuffXfermode p;
    private RectF r;
    private HealthLevelIndicator t;

    public IndicatorCircle(Context context) {
        super(context);
        this.r = new RectF();
        this.f23564c = new ArrayList();
        this.f23563b = new ArrayList();
        this.m = null;
        this.h = null;
        this.j = 0.0f;
        this.k = false;
        this.g = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.n = null;
        this.l = true;
        e();
    }

    public IndicatorCircle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = new RectF();
        this.f23564c = new ArrayList();
        this.f23563b = new ArrayList();
        this.m = null;
        this.h = null;
        this.j = 0.0f;
        this.k = false;
        this.g = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.n = null;
        this.l = true;
        e();
    }

    public IndicatorCircle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = new RectF();
        this.f23564c = new ArrayList();
        this.f23563b = new ArrayList();
        this.m = null;
        this.h = null;
        this.j = 0.0f;
        this.k = false;
        this.g = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.n = null;
        this.l = true;
        e();
    }

    private void e() {
        setLayerType(2, null);
        final float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.health_level_indicator_circle_width);
        post(new Runnable() { // from class: com.huawei.ui.commonui.indicator.IndicatorCircle.2
            @Override // java.lang.Runnable
            public void run() {
                int iMax = Math.max(IndicatorCircle.this.getMeasuredWidth(), IndicatorCircle.this.getMeasuredHeight());
                float f = dimensionPixelSize / 2.0f;
                float f2 = iMax;
                float f3 = f2 - f;
                IndicatorCircle.this.r = new RectF(f, f, f3, f3);
                IndicatorCircle.this.f23562a = f2 / 2.0f;
                IndicatorCircle indicatorCircle = IndicatorCircle.this;
                indicatorCircle.g = (f * 180.0f) / ((float) (((double) indicatorCircle.f23562a) * 3.141592653589793d));
                IndicatorCircle indicatorCircle2 = IndicatorCircle.this;
                indicatorCircle2.d = indicatorCircle2.g + 2.0f;
                IndicatorCircle indicatorCircle3 = IndicatorCircle.this;
                indicatorCircle3.e = indicatorCircle3.g;
                if (IndicatorCircle.this.n != null) {
                    LogUtil.a("IndicatorCircle", "getIndicatorAngleByEndPoints, execute pending indicate task!");
                    IndicatorCircle.this.n.run();
                    IndicatorCircle.this.n = null;
                }
                IndicatorCircle.this.l = true;
                IndicatorCircle.this.invalidate();
            }
        });
        Paint paint = new Paint();
        this.o = paint;
        paint.setStrokeWidth(dimensionPixelSize);
        this.o.setStyle(Paint.Style.STROKE);
        this.o.setStrokeCap(Paint.Cap.ROUND);
        this.o.setAntiAlias(true);
        this.p = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        this.f = ContextCompat.getDrawable(getContext(), R.drawable.indicator_circle_array_img);
        this.j = getContext().getResources().getDimensionPixelSize(R.dimen.health_level_indicator_translate_offset);
        this.f.setBounds(0, 0, getContext().getResources().getDimensionPixelSize(R.dimen.health_level_indicator_triangle_width), getContext().getResources().getDimensionPixelSize(R.dimen.health_level_indicator_triangle_height));
    }

    private void e(List<qlj> list) {
        if (njy.e(list)) {
            LogUtil.e("IndicatorCircle", "extractEndPoints failed, cause levelsData is empty");
            return;
        }
        int size = list.size();
        this.h = new float[size + 1];
        for (int i = 0; i < size; i++) {
            qlj qljVar = list.get(i);
            if (qljVar != null) {
                this.h[i] = qljVar.b();
            }
        }
        qlj qljVar2 = list.get(size - 1);
        if (qljVar2 == null) {
            return;
        }
        this.h[size] = qljVar2.e();
    }

    public void setData(List<qlj> list, int[] iArr) throws CloneNotSupportedException {
        if (iArr != null) {
            int length = iArr.length;
            int[] iArr2 = new int[length];
            this.m = iArr2;
            System.arraycopy(iArr, 0, iArr2, 0, length);
        }
        e(list);
        this.f23563b.clear();
        this.f23563b.addAll(list);
        this.f23564c.clear();
        Iterator<qlj> it = this.f23563b.iterator();
        while (it.hasNext()) {
            this.f23564c.add(it.next().clone());
        }
        a();
        invalidate();
    }

    private qlj d(float f) {
        for (qlj qljVar : this.f23563b) {
            if (f >= qljVar.b() && f < qljVar.e()) {
                return qljVar;
            }
        }
        if (f < this.f23563b.get(0).b()) {
            return this.f23563b.get(0);
        }
        List<qlj> list = this.f23563b;
        return list.get(list.size() - 1);
    }

    public void setLevel(float f) {
        boolean zEquals = Float.valueOf(f).equals(Float.valueOf(Float.NaN));
        this.k = zEquals;
        if (this.t != null) {
            qlj qljVarD = !zEquals ? d(f) : null;
            this.t.e(qljVarD != null ? qljVarD.d() : null, qljVarD != null ? qljVarD.a() : 0);
        }
        if (this.k) {
            invalidate();
            return;
        }
        if (this.h == null) {
            b(f);
        } else {
            e(f);
        }
        invalidate();
    }

    private void b(float f) {
        for (int i = 0; i < this.f23563b.size(); i++) {
            qlj qljVar = this.f23563b.get(i);
            float fB = qljVar.b();
            float fE = qljVar.e();
            if (f >= fB && f < fE) {
                qlj qljVar2 = this.f23564c.get(i);
                this.i = ((qljVar2.b() + qljVar2.e()) / 2.0f) + 90.0f;
                return;
            }
        }
        qlj qljVar3 = this.f23563b.get(0);
        qlj qljVar4 = this.f23564c.get(0);
        List<qlj> list = this.f23564c;
        qlj qljVar5 = list.get(list.size() - 1);
        this.i = (((f < qljVar3.b() ? qljVar4.b() : qljVar5.b()) + (f < qljVar3.e() ? qljVar4.e() : qljVar5.e())) / 2.0f) + 90.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final float f) {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            LogUtil.j("IndicatorCircle", "getIndicatorAngleByEndPoints, not measured yet!");
            this.n = new Runnable() { // from class: com.huawei.ui.commonui.indicator.IndicatorCircle.1
                @Override // java.lang.Runnable
                public void run() {
                    IndicatorCircle.this.e(f);
                }
            };
            return;
        }
        LogUtil.g("IndicatorCircle", "getIndicatorAngleByEndPoints, mEndPoints = ", Arrays.toString(this.h), ", level data list = ", this.f23563b);
        int i = 0;
        while (true) {
            float[] fArr = this.h;
            if (i < fArr.length - 1) {
                float f2 = fArr[i];
                int i2 = i + 1;
                float f3 = fArr[i2];
                if (f >= f2 && f < f3) {
                    LogUtil.a("IndicatorCircle", "getIndicatorAngleByEndPoints find a levelData, level = ", Float.valueOf(f), ", ep1 = ", Float.valueOf(f2), ", ep2 = ", Float.valueOf(f3));
                    qlj qljVar = this.f23564c.get(i);
                    float fB = qljVar.b();
                    float fE = qljVar.e();
                    float f4 = this.e;
                    float f5 = fE + this.d;
                    this.i = 90.0f + f5 + (((f - f2) / (f3 - f2)) * ((fB + f4) - f5));
                    return;
                }
                i = i2;
            } else {
                qlj qljVar2 = this.f23564c.get(0);
                qlj qljVar3 = this.f23564c.get(this.f23563b.size() - 1);
                LogUtil.a("IndicatorCircle", "getIndicatorAngleByEndPoints not in range, level = ", Float.valueOf(f));
                this.i = (f < this.h[0] ? qljVar2.e() - this.g : qljVar3.b() + this.g) + 90.0f;
                return;
            }
        }
    }

    private void a() {
        List<qlj> list = this.f23564c;
        if (list == null) {
            return;
        }
        int size = list.size();
        float f = 270.0f / size;
        int i = size - 1;
        int i2 = i;
        while (i2 >= 0) {
            qlj qljVar = this.f23564c.get(i2);
            qljVar.d(i2 == i ? 45.0f : this.f23564c.get(i2 + 1).e());
            int[] iArr = this.m;
            qljVar.e(qljVar.b() - (iArr == null ? f : iArr[i2]));
            i2--;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List<qlj> list = this.f23564c;
        if (list == null) {
            return;
        }
        int size = list.size() - 1;
        for (int i = size; i >= 0; i--) {
            qlj qljVar = this.f23564c.get(i);
            if (i < size) {
                b(canvas, qljVar, this.p, 2.0f);
            }
            b(canvas, qljVar, null, 0.0f);
        }
        if (!this.k && this.l) {
            a(canvas);
        }
    }

    private void b(Canvas canvas, qlj qljVar, Xfermode xfermode, float f) {
        this.o.setXfermode(xfermode);
        this.o.setColor(qljVar.a());
        canvas.drawArc(this.r, qljVar.b() + f, qljVar.e() - qljVar.b(), false, this.o);
    }

    private void a(Canvas canvas) {
        canvas.save();
        float f = this.f23562a;
        float intrinsicWidth = this.f.getIntrinsicWidth();
        float intrinsicHeight = this.f.getIntrinsicHeight();
        float f2 = intrinsicWidth / 2.0f;
        float f3 = intrinsicHeight / 2.0f;
        canvas.translate(f - f2, f - f3);
        canvas.rotate(this.i, f2, f3);
        canvas.translate(0.0f, (-(this.f23562a - intrinsicHeight)) - this.j);
        this.f.draw(canvas);
        canvas.restore();
    }

    void b(HealthLevelIndicator healthLevelIndicator, boolean z) {
        this.t = healthLevelIndicator;
        this.l = z;
    }
}
