package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.github.mikephil.charting.data.BarEntry;
import com.xiaomi.fitness.chart.entrys.CurseEntry;
import com.xiaomi.fitness.chart.entrys.EcgOriginalEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.entrys.SleepEntry;
import com.xiaomi.fitness.chart.entrys.VO2MaxEntry;
import com.xiaomi.fitness.chart.mpchart.barchart.CustomBarChart;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class jd5 extends u02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CustomBarChart f22664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public id5 f22665b;

    public jd5(x02 x02Var, cu3 cu3Var, hwq hwqVar) {
        super(x02Var, cu3Var, hwqVar);
        CustomBarChart customBarChart = (CustomBarChart) x02Var;
        this.f22664a = customBarChart;
        this.f22665b = customBarChart.getAttribute();
    }

    public final void a() {
        if (this.f22665b == null) {
            this.f22665b = this.f22664a.getAttribute();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(gpc gpcVar) {
        int iO0 = gpcVar.O0();
        int size = 0;
        for (int i = 0; i < iO0; i++) {
            BarEntry barEntry = (BarEntry) gpcVar.i(i);
            if (barEntry instanceof SegmentBarEntry) {
                size += ((SegmentBarEntry) barEntry).rectValueModelList.size();
            }
        }
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Canvas canvas, p02 p02Var, gpc gpcVar, id5 id5Var) {
        if (gpcVar.i0().size() == 1) {
            this.mRenderPaint.setColor(gpcVar.n0());
        }
        int iO0 = gpcVar.O0();
        int i = 0;
        for (int i2 = 0; i < p02Var.c() && i2 < iO0; i2++) {
            int i3 = i + 2;
            if (this.mViewPortHandler.B(p02Var.f16108b[i3])) {
                if (!this.mViewPortHandler.C(p02Var.f16108b[i])) {
                    return;
                }
                float fI = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i] : p02Var.f16108b[i];
                float fI2 = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i3] : p02Var.f16108b[i3];
                RectF rectF = new RectF(fI, 0.0f, fI2, this.mViewPortHandler.f());
                BarEntry barEntry = (BarEntry) gpcVar.i(i2);
                if (barEntry != null && (barEntry instanceof RecyclerBarEntry)) {
                    this.mRenderPaint.setColor(x44.a(aji.f1102r));
                    float f = id5Var.m;
                    canvas.drawRoundRect(rectF, f, f, this.mRenderPaint);
                    if (barEntry.getY() > 0.0f) {
                        this.mRenderPaint.setColor(x44.a(aji.s));
                        RectF rectF2 = new RectF(fI, 0.0f, fI2, DisplayUtil.dip2px(1.7f));
                        float f2 = id5Var.m;
                        canvas.drawRoundRect(rectF2, f2, f2, this.mRenderPaint);
                    }
                }
            }
            i += 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Canvas canvas, p02 p02Var, gpc gpcVar, id5 id5Var) {
        if (gpcVar.i0().size() == 1) {
            this.mRenderPaint.setColor(gpcVar.n0());
        }
        int iO0 = gpcVar.O0();
        int i = 0;
        for (int i2 = 0; i < p02Var.c() && i2 < iO0; i2++) {
            int i3 = i + 2;
            if (this.mViewPortHandler.B(p02Var.f16108b[i3])) {
                if (!this.mViewPortHandler.C(p02Var.f16108b[i])) {
                    return;
                }
                float fI = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i] : p02Var.f16108b[i];
                float fI2 = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i3] : p02Var.f16108b[i3];
                RectF rectF = new RectF(fI, 0.0f, fI2, this.mViewPortHandler.f());
                BarEntry barEntry = (BarEntry) gpcVar.i(i2);
                if (barEntry != null && (barEntry instanceof RecyclerBarEntry)) {
                    this.mRenderPaint.setColor(x44.a(aji.f1102r));
                    float f = id5Var.m;
                    canvas.drawRoundRect(rectF, f, f, this.mRenderPaint);
                    if (barEntry.getY() > 0.0f) {
                        this.mRenderPaint.setColor(x44.a(aji.s));
                        RectF rectF2 = new RectF(fI, 0.0f, fI2, DisplayUtil.dip2px(1.7f));
                        float f2 = id5Var.m;
                        canvas.drawRoundRect(rectF2, f2, f2, this.mRenderPaint);
                    }
                }
            }
            i += 4;
        }
    }

    @Override // defpackage.u02, defpackage.dn5
    public void drawData(Canvas canvas) {
        w02 barData = this.mChart.getBarData();
        for (int i = 0; i < barData.j(); i++) {
            gpc gpcVar = (gpc) barData.i(i);
            if (gpcVar.isVisible()) {
                drawDataSet(canvas, gpcVar, i);
            }
        }
    }

    @Override // defpackage.u02
    public void drawDataSet(Canvas canvas, gpc gpcVar, int i) {
        a();
        ryp transformer = this.mChart.getTransformer(gpcVar.m0());
        float fH = this.mAnimator.h();
        float fI = this.mAnimator.i();
        p02 p02Var = this.mBarBuffers[i];
        p02Var.b(fH, fI);
        p02Var.g(i);
        p02Var.h(this.mChart.isInverted(gpcVar.m0()));
        p02Var.f(this.mChart.getBarData().y());
        p02Var.e(gpcVar);
        transformer.k(p02Var.f16108b);
        id5 id5Var = this.f22665b;
        if (id5Var.h != 0) {
            i(canvas, p02Var, gpcVar, id5Var);
            return;
        }
        int i2 = id5Var.t;
        if (i2 == 0) {
            e(canvas, p02Var, gpcVar, id5Var);
            return;
        }
        if (i2 == 1) {
            l(canvas, p02Var, gpcVar, id5Var);
            return;
        }
        if (i2 == 2) {
            q(canvas, p02Var, gpcVar, id5Var);
            return;
        }
        if (i2 == 3) {
            f(canvas, p02Var, gpcVar, id5Var);
            return;
        }
        if (i2 == 4) {
            h(canvas, p02Var, gpcVar, id5Var);
            return;
        }
        if (i2 == 5) {
            o(canvas, p02Var, gpcVar, id5Var);
            return;
        }
        if (i2 == 6) {
            n(canvas, p02Var, gpcVar, id5Var);
            return;
        }
        if (i2 == 7) {
            p(canvas, p02Var, gpcVar, id5Var);
            return;
        }
        if (i2 == 8) {
            m(canvas, p02Var, gpcVar, id5Var);
            return;
        }
        if (i2 == 10) {
            r(canvas, p02Var, gpcVar, id5Var);
            return;
        }
        if (i2 == 9) {
            d(canvas, p02Var, gpcVar, id5Var);
            return;
        }
        if (i2 == 11) {
            c(canvas, p02Var, gpcVar, id5Var);
        } else if (i2 == 12) {
            p(canvas, p02Var, gpcVar, id5Var);
        } else {
            super.drawDataSet(canvas, gpcVar, i);
        }
    }

    @Override // defpackage.u02, defpackage.dn5
    public void drawValues(Canvas canvas) {
        if (this.f22665b.t != 6) {
            super.drawValues(canvas);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Canvas canvas, p02 p02Var, gpc gpcVar, id5 id5Var) {
        int i = 0;
        boolean z = gpcVar.i0().size() == 1;
        if (z) {
            this.mRenderPaint.setColor(gpcVar.n0());
        }
        int iO0 = gpcVar.O0();
        for (int i2 = 0; i < p02Var.c() && i2 < iO0; i2++) {
            int i3 = i + 2;
            if (this.mViewPortHandler.B(p02Var.f16108b[i3])) {
                if (!this.mViewPortHandler.C(p02Var.f16108b[i])) {
                    return;
                }
                float fI = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i] : p02Var.f16108b[i];
                float fI2 = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i3] : p02Var.f16108b[i3];
                int i4 = i + 3;
                new RectF(fI, 0.0f, fI2, p02Var.f16108b[i4]);
                this.mRenderPaint.setColor(id5Var.q);
                this.mRenderPaint.setAlpha((int) (id5Var.f21017r * 255.0f));
                float[] fArr = p02Var.f16108b;
                RectF rectF = new RectF(fI, fArr[i + 1], fI2, fArr[i4]);
                if (z) {
                    BarEntry barEntry = (BarEntry) gpcVar.i(i2);
                    if (barEntry instanceof RecyclerBarEntry) {
                        if (((RecyclerBarEntry) barEntry).validType == 1) {
                            this.mRenderPaint.setColor(id5Var.q);
                        } else {
                            this.mRenderPaint.setColor(id5Var.o);
                            this.mRenderPaint.setAlpha(((int) id5Var.p) * 255);
                        }
                    }
                } else {
                    this.mRenderPaint.setColor(gpcVar.E0(i / 4));
                }
                float f = id5Var.m;
                canvas.drawRoundRect(rectF, f, f, this.mRenderPaint);
            }
            i += 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Canvas canvas, p02 p02Var, gpc gpcVar, id5 id5Var) {
        if (gpcVar.i0().size() == 1) {
            this.mRenderPaint.setColor(gpcVar.n0());
        }
        int iO0 = gpcVar.O0();
        int i = 0;
        for (int i2 = 0; i < p02Var.c() && i2 < iO0; i2++) {
            if (this.mViewPortHandler.B(p02Var.f16108b[i + 2])) {
                if (!this.mViewPortHandler.C(p02Var.f16108b[i])) {
                    return;
                }
                BarEntry barEntry = (BarEntry) gpcVar.i(i2);
                if (barEntry != null && (barEntry instanceof CurseEntry)) {
                    g(canvas, p02Var, id5Var, i, (CurseEntry) barEntry);
                }
            }
            i += 4;
        }
    }

    public final void g(Canvas canvas, p02 p02Var, id5 id5Var, int i, CurseEntry curseEntry) {
        float fI = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i] : p02Var.f16108b[i];
        float fI2 = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i + 2] : p02Var.f16108b[i + 2];
        int i2 = curseEntry.f11748a;
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            int iC = CurseEntry.c(i2);
            RectF rectF = new RectF(Math.min(fI, fI2), 0.0f, Math.max(fI, fI2), this.mViewPortHandler.f());
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(AppUtil.getApp().getResources(), iC);
            canvas.drawBitmap(bitmapDecodeResource, new Rect(0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight()), rectF, (Paint) null);
        }
        int i3 = curseEntry.f11748a;
        if (i3 == 1 || i3 == 0) {
            RectF rectF2 = new RectF(fI, 0.0f, fI2, this.mViewPortHandler.f());
            this.mRenderPaint.setColor(curseEntry.f11749b);
            this.mRenderPaint.setAlpha(curseEntry.d);
            float f = id5Var.m;
            canvas.drawRoundRect(rectF2, f, f, this.mRenderPaint);
        }
        int i4 = curseEntry.f11748a;
        if (i4 == 2 || i4 == 1) {
            RectF rectF3 = new RectF(fI, 0.0f, fI2, DisplayUtil.dip2px(1.7f));
            this.mRenderPaint.setColor(curseEntry.c);
            this.mRenderPaint.setAlpha(255);
            float f2 = id5Var.m;
            canvas.drawRoundRect(rectF3, f2, f2, this.mRenderPaint);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Canvas canvas, p02 p02Var, gpc gpcVar, id5 id5Var) {
        if (gpcVar.i0().size() == 1) {
            this.mRenderPaint.setColor(gpcVar.n0());
        }
        int iO0 = gpcVar.O0();
        int i = 0;
        for (int i2 = 0; i < p02Var.c() && i2 < iO0; i2++) {
            int i3 = i + 2;
            if (this.mViewPortHandler.B(p02Var.f16108b[i3])) {
                if (!this.mViewPortHandler.C(p02Var.f16108b[i])) {
                    return;
                }
                BarEntry barEntry = (BarEntry) gpcVar.i(i2);
                if (barEntry != null && (barEntry instanceof EcgOriginalEntry)) {
                    EcgOriginalEntry ecgOriginalEntry = (EcgOriginalEntry) barEntry;
                    RectF rectF = new RectF((AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i] : p02Var.f16108b[i], 0.0f, (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i3] : p02Var.f16108b[i3], this.mViewPortHandler.f());
                    if (ecgOriginalEntry.getY() > 0.0f) {
                        this.mRenderPaint.setColor(ecgOriginalEntry.f11752a);
                        this.mRenderPaint.setAlpha((int) (ecgOriginalEntry.f11753b * 255.0f));
                    } else {
                        this.mRenderPaint.setColor(x44.a(aji.u));
                    }
                    float f = id5Var.m;
                    canvas.drawRoundRect(rectF, f, f, this.mRenderPaint);
                }
            }
            i += 4;
        }
    }

    public void i(Canvas canvas, p02 p02Var, gpc gpcVar, id5 id5Var) {
        int i = id5Var.h;
        if (i == 1) {
            k(canvas);
        } else if (i == 2) {
            j(canvas, p02Var, gpcVar, id5Var);
        }
    }

    @Override // defpackage.u02, defpackage.dn5
    public void initBuffers() {
        a();
        w02 barData = this.mChart.getBarData();
        this.mBarBuffers = new p02[barData.j()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            gpc gpcVar = (gpc) barData.i(i);
            if (this.f22665b.t == 6) {
                this.mBarBuffers[i] = new frl(b(gpcVar) * 4, barData.j(), gpcVar.N());
            } else {
                this.mBarBuffers[i] = new p02(gpcVar.O0() * 4 * (gpcVar.N() ? gpcVar.o() : 1), barData.j(), gpcVar.N());
            }
        }
    }

    public final void j(Canvas canvas, p02 p02Var, gpc gpcVar, id5 id5Var) {
        this.mRenderPaint.setColor(x44.a(aji.u));
        int iO0 = gpcVar.O0();
        int i = 0;
        for (int i2 = 0; i < p02Var.c() && i2 < iO0; i2++) {
            int i3 = i + 2;
            if (this.mViewPortHandler.B(p02Var.f16108b[i3])) {
                if (!this.mViewPortHandler.C(p02Var.f16108b[i])) {
                    return;
                }
                RectF rectF = new RectF(p02Var.f16108b[i], this.mViewPortHandler.j(), p02Var.f16108b[i3], this.mViewPortHandler.f());
                float f = id5Var.m;
                canvas.drawRoundRect(rectF, f, f, this.mRenderPaint);
            }
            i += 4;
        }
    }

    public void k(Canvas canvas) {
        this.mRenderPaint.setColor(x44.a(aji.u));
        canvas.drawRoundRect(new RectF(this.mViewPortHandler.h(), this.mViewPortHandler.j(), this.mViewPortHandler.i(), this.mViewPortHandler.f()), DisplayUtil.dip2px(1.0f), DisplayUtil.dip2px(1.0f), this.mRenderPaint);
    }

    public final void l(Canvas canvas, p02 p02Var, gpc gpcVar, id5 id5Var) {
        if (gpcVar.i0().size() == 1) {
            this.mRenderPaint.setColor(gpcVar.n0());
        }
        for (int i = 0; i < p02Var.c(); i += 4) {
            int i2 = i + 2;
            if (this.mViewPortHandler.B(p02Var.f16108b[i2])) {
                if (!this.mViewPortHandler.C(p02Var.f16108b[i])) {
                    return;
                }
                Path pathC = zi3.c(new RectF((AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i] : p02Var.f16108b[i], p02Var.f16108b[i + 1], (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i2] : p02Var.f16108b[i2], this.mViewPortHandler.f()), id5Var.m, 1);
                this.mRenderPaint.setColor(id5Var.o);
                canvas.drawPath(pathC, this.mRenderPaint);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(Canvas canvas, p02 p02Var, gpc gpcVar, id5 id5Var) {
        if (gpcVar.i0().size() == 1) {
            this.mRenderPaint.setColor(gpcVar.n0());
        }
        int iO0 = gpcVar.O0();
        int i = 0;
        for (int i2 = 0; i < p02Var.c() && i2 < iO0; i2++) {
            int i3 = i + 2;
            if (this.mViewPortHandler.B(p02Var.f16108b[i3])) {
                if (!this.mViewPortHandler.C(p02Var.f16108b[i])) {
                    return;
                }
                float fI = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i] : p02Var.f16108b[i];
                float fI2 = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i3] : p02Var.f16108b[i3];
                RectF rectF = new RectF(fI, 0.0f, fI2, this.mViewPortHandler.f());
                BarEntry barEntry = (BarEntry) gpcVar.i(i2);
                if (barEntry instanceof RecyclerBarEntry) {
                    this.mRenderPaint.setColor(x44.a(aji.N));
                    float f = id5Var.m;
                    canvas.drawRoundRect(rectF, f, f, this.mRenderPaint);
                    if (barEntry.getY() > 0.0f) {
                        this.mRenderPaint.setColor(x44.a(aji.D));
                        RectF rectF2 = new RectF(fI, 0.0f, fI2, DisplayUtil.dip2px(1.7f));
                        float f2 = id5Var.m;
                        canvas.drawRoundRect(rectF2, f2, f2, this.mRenderPaint);
                    }
                }
            }
            i += 4;
        }
    }

    public final void n(Canvas canvas, p02 p02Var, gpc gpcVar, id5 id5Var) {
        if (gpcVar.i0().size() == 1) {
            this.mRenderPaint.setColor(gpcVar.n0());
        }
        List<hrl> listS = s(gpcVar);
        int iC = p02Var.c();
        int size = listS.size();
        int i = 0;
        for (int i2 = 0; i < iC && i2 < size; i2++) {
            int i3 = i + 2;
            if (this.mViewPortHandler.B(p02Var.f16108b[i3])) {
                if (!this.mViewPortHandler.C(p02Var.f16108b[i])) {
                    return;
                }
                float fI = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i] : p02Var.f16108b[i];
                float fI2 = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i3] : p02Var.f16108b[i3];
                float[] fArr = p02Var.f16108b;
                int i4 = i + 1;
                int i5 = i + 3;
                RectF rectF = new RectF(fI, fArr[i4], fI2, fArr[i5]);
                float[] fArr2 = p02Var.f16108b;
                float f = fArr2[i5];
                float f2 = fArr2[i4];
                float f3 = fI2 - fI;
                if (f - f2 < f3) {
                    float f4 = f3 / 2.0f;
                    rectF.top = Math.max(f2 - f4, this.mViewPortHandler.j());
                    rectF.bottom = Math.min(p02Var.f16108b[i5] + f4, this.mViewPortHandler.f());
                }
                hrl hrlVar = listS.get(i2);
                int i6 = hrlVar.e;
                if (i6 > 0 && hrlVar.d != -1) {
                    this.mBarBorderPaint.setStrokeWidth(i6);
                    this.mBarBorderPaint.setColor(hrlVar.d);
                    float f5 = id5Var.m;
                    canvas.drawRoundRect(rectF, f5, f5, this.mBarBorderPaint);
                }
                int i7 = hrlVar.c;
                if (i7 != -1) {
                    this.mRenderPaint.setColor(i7);
                }
                float f6 = id5Var.m;
                canvas.drawRoundRect(rectF, f6, f6, this.mRenderPaint);
            }
            i += 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(Canvas canvas, p02 p02Var, gpc gpcVar, id5 id5Var) {
        if (gpcVar.i0().size() == 1) {
            this.mRenderPaint.setColor(gpcVar.n0());
        }
        int iO0 = gpcVar.O0();
        int i = 0;
        for (int i2 = 0; i < p02Var.c() && i2 < iO0; i2++) {
            int i3 = i + 2;
            if (this.mViewPortHandler.B(p02Var.f16108b[i3])) {
                if (!this.mViewPortHandler.C(p02Var.f16108b[i])) {
                    return;
                }
                float fI = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i] : p02Var.f16108b[i];
                float fI2 = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i3] : p02Var.f16108b[i3];
                RectF rectF = new RectF(fI, 0.0f, fI2, this.mViewPortHandler.f());
                BarEntry barEntry = (BarEntry) gpcVar.i(i2);
                if (barEntry != null && (barEntry instanceof SleepEntry)) {
                    SleepEntry sleepEntry = (SleepEntry) barEntry;
                    this.mRenderPaint.setColor(sleepEntry.c);
                    float f = id5Var.m;
                    canvas.drawRoundRect(rectF, f, f, this.mRenderPaint);
                    if (sleepEntry.getY() > 0.0f) {
                        this.mRenderPaint.setColor(sleepEntry.f11763b);
                        RectF rectF2 = new RectF(fI, 0.0f, fI2, DisplayUtil.dip2px(1.7f));
                        float f2 = id5Var.m;
                        canvas.drawRoundRect(rectF2, f2, f2, this.mRenderPaint);
                    }
                }
            }
            i += 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(Canvas canvas, p02 p02Var, gpc gpcVar, id5 id5Var) {
        if (gpcVar.i0().size() == 1) {
            this.mRenderPaint.setColor(gpcVar.n0());
        }
        int iO0 = gpcVar.O0();
        int i = 0;
        for (int i2 = 0; i < p02Var.c() && i2 < iO0; i2++) {
            int i3 = i + 2;
            if (this.mViewPortHandler.B(p02Var.f16108b[i3])) {
                if (!this.mViewPortHandler.C(p02Var.f16108b[i])) {
                    return;
                }
                float fI = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i] : p02Var.f16108b[i];
                float fI2 = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i3] : p02Var.f16108b[i3];
                RectF rectF = new RectF(fI, 0.0f, fI2, this.mViewPortHandler.f());
                BarEntry barEntry = (BarEntry) gpcVar.i(i2);
                if (barEntry != null && (barEntry instanceof RecyclerBarEntry)) {
                    this.mRenderPaint.setColor(x44.a(aji.y));
                    float f = id5Var.m;
                    canvas.drawRoundRect(rectF, f, f, this.mRenderPaint);
                    if (barEntry.getY() > 0.0f) {
                        this.mRenderPaint.setColor(x44.a(aji.z));
                        RectF rectF2 = new RectF(fI, 0.0f, fI2, DisplayUtil.dip2px(1.7f));
                        float f2 = id5Var.m;
                        canvas.drawRoundRect(rectF2, f2, f2, this.mRenderPaint);
                    }
                }
            }
            i += 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(Canvas canvas, p02 p02Var, gpc gpcVar, id5 id5Var) {
        if (gpcVar.i0().size() == 1) {
            this.mRenderPaint.setColor(gpcVar.n0());
        }
        int iO0 = gpcVar.O0();
        int i = 0;
        for (int i2 = 0; i < p02Var.c() && i2 < iO0; i2++) {
            int i3 = i + 2;
            if (this.mViewPortHandler.B(p02Var.f16108b[i3])) {
                if (!this.mViewPortHandler.C(p02Var.f16108b[i])) {
                    return;
                }
                BarEntry barEntry = (BarEntry) gpcVar.i(i2);
                if (barEntry != null) {
                    float fI = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i] : p02Var.f16108b[i];
                    float fI2 = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i3] : p02Var.f16108b[i3];
                    if (barEntry instanceof VO2MaxEntry) {
                        VO2MaxEntry vO2MaxEntry = (VO2MaxEntry) barEntry;
                        RectF rectF = new RectF(fI, 0.0f, fI2, this.mViewPortHandler.f());
                        this.mRenderPaint.setColor(vO2MaxEntry.f11769b);
                        float f = id5Var.m;
                        canvas.drawRoundRect(rectF, f, f, this.mRenderPaint);
                        if (vO2MaxEntry.getY() > 0.0f) {
                            RectF rectF2 = new RectF(fI, 0.0f, fI2, DisplayUtil.dip2px(1.7f));
                            this.mRenderPaint.setColor(vO2MaxEntry.c);
                            float f2 = id5Var.m;
                            canvas.drawRoundRect(rectF2, f2, f2, this.mRenderPaint);
                        }
                    } else {
                        RectF rectF3 = new RectF(fI, 0.0f, fI2, this.mViewPortHandler.f());
                        this.mRenderPaint.setColor(x44.a(aji.u));
                        float f3 = id5Var.m;
                        canvas.drawRoundRect(rectF3, f3, f3, this.mRenderPaint);
                    }
                }
            }
            i += 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(Canvas canvas, p02 p02Var, gpc gpcVar, id5 id5Var) {
        if (gpcVar.i0().size() == 1) {
            this.mRenderPaint.setColor(gpcVar.n0());
        }
        gpcVar.O0();
        float fI = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[0] : p02Var.f16108b[0];
        float fI2 = ((AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[2] : p02Var.f16108b[2]) - fI;
        BarEntry barEntry = (BarEntry) gpcVar.i(0);
        if (barEntry.getY() > 0.0f) {
            float y = ((barEntry.getY() / 50.0f) * fI2) + fI;
            if (barEntry.getY() >= 100.0f) {
                y = (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[6] : p02Var.f16108b[6];
            } else {
                RectF rectF = new RectF(((AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[4] : p02Var.f16108b[4]) + (((barEntry.getY() / 50.0f) * fI2) - fI2), 0.0f, (AppUtil.isRTLDirection() && id5Var.v) ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[6] : p02Var.f16108b[6], this.mViewPortHandler.f());
                this.mRenderPaint.setColor(x44.a(aji.u));
                float f = id5Var.m;
                canvas.drawRoundRect(rectF, f, f, this.mRenderPaint);
            }
            RectF rectF2 = new RectF(fI, 0.0f, y, this.mViewPortHandler.f());
            this.mRenderPaint.setColor(x44.a(aji.l0));
            float f2 = id5Var.m;
            canvas.drawRoundRect(rectF2, f2, f2, this.mRenderPaint);
            this.mRenderPaint.setColor(x44.a(aji.k0));
            RectF rectF3 = new RectF(fI, 0.0f, y, DisplayUtil.dip2px(1.7f));
            float f3 = id5Var.m;
            canvas.drawRoundRect(rectF3, f3, f3, this.mRenderPaint);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<hrl> s(gpc gpcVar) {
        int iO0 = gpcVar.O0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iO0; i++) {
            BarEntry barEntry = (BarEntry) gpcVar.i(i);
            if (barEntry instanceof SegmentBarEntry) {
                arrayList.addAll(((SegmentBarEntry) barEntry).rectValueModelList);
            }
        }
        return arrayList;
    }
}
