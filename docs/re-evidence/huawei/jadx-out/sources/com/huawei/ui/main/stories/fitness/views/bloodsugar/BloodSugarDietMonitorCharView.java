package com.huawei.ui.main.stories.fitness.views.bloodsugar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import androidx.core.util.Pair;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ieg;
import defpackage.njy;
import defpackage.qqs;
import defpackage.umh;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarDietMonitorCharView extends BloodSugarNocturnalHypoglycemiaChartView {
    private final int aa;
    private final int ac;
    private float[] ad;
    private List<umh> af;
    private float[] ah;
    private List<Pair<Long, Float>> z;

    public BloodSugarDietMonitorCharView(Context context) {
        super(context);
        this.aa = Color.argb(127, 252, 49, 89);
        this.ac = Color.argb(0, 252, 49, 89);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarNocturnalHypoglycemiaChartView, android.view.View
    protected void onDraw(Canvas canvas) {
        this.e = canvas;
        e();
        d(canvas);
        b();
        b(canvas);
    }

    private void d(Canvas canvas) {
        if (this.ah == null) {
            return;
        }
        float width = getWidth() - this.j;
        Path path = new Path();
        float fB = b(this.ah[0]);
        float fB2 = b(this.ah[1]);
        path.moveTo(0.0f, fB);
        path.lineTo(width, fB);
        path.lineTo(width, fB2);
        path.lineTo(0.0f, fB2);
        Paint paint = this.q;
        if (qqs.e(BaseApplication.getContext())) {
            paint.setAlpha(30);
        } else {
            paint.setAlpha(15);
        }
        canvas.drawPath(path, paint);
        paint.setAlpha(255);
        String strValueOf = String.valueOf(UnitUtil.e(this.ah[0], 1, 1));
        float fMeasureText = paint.measureText(strValueOf);
        String strValueOf2 = String.valueOf(UnitUtil.e(this.ah[1], 1, 1));
        float fMeasureText2 = paint.measureText(strValueOf2);
        if (LanguageUtil.ba(getContext())) {
            canvas.drawText(strValueOf, getWidth() - width, fB, paint);
            canvas.drawText(strValueOf2, getWidth() - width, fB2, paint);
        } else {
            canvas.drawText(strValueOf, width - fMeasureText, fB, paint);
            canvas.drawText(strValueOf2, width - fMeasureText2, fB2, paint);
        }
        this.ad = new float[4];
        Rect rect = new Rect();
        paint.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
        this.ad[0] = fB - (rect.bottom - rect.top);
        float[] fArr = this.ad;
        fArr[1] = fB;
        fArr[2] = fB2 - (rect.bottom - rect.top);
        this.ad[3] = fB2;
    }

    public void setData(List<Pair<Long, Float>> list, float[] fArr) {
        if (njy.e(list)) {
            return;
        }
        this.z = new ArrayList(list.size());
        float fFloatValue = 0.0f;
        for (Pair<Long, Float> pair : list) {
            this.z.add(pair);
            if (pair.second.floatValue() > fFloatValue) {
                fFloatValue = pair.second.floatValue();
            }
        }
        if (fArr != null && fArr.length > 0) {
            this.ah = (float[]) fArr.clone();
        }
        float f = this.ah[0];
        if (f > fFloatValue) {
            fFloatValue = f;
        }
        this.d = fFloatValue;
    }

    private void b(Canvas canvas) {
        LogUtil.a("BloodSugarDietMonitorCharView", "drawData");
        if (njy.e(this.z)) {
            return;
        }
        if (LanguageUtil.ba(getContext())) {
            canvas.scale(-1.0f, 1.0f, getWidth() / 2, getHeight() / 2);
        }
        Path path = new Path();
        path.moveTo(e(this.z.get(0).first.longValue()), b(this.z.get(0).second.floatValue()));
        int i = 0;
        while (i < this.z.size() - 1) {
            i++;
            Pair<Long, Float> pair = this.z.get(i);
            path.lineTo(e(pair.first.longValue()), b(pair.second.floatValue()));
        }
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.i);
        canvas.drawPath(path, paint);
        float fB = b(0.0f);
        List<Pair<Long, Float>> list = this.z;
        path.lineTo(e(list.get(list.size() - 1).first.longValue()), fB);
        path.lineTo(e(this.z.get(0).first.longValue()), fB);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.aa, this.ac});
        gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
        int iSave = canvas.save();
        canvas.clipPath(path);
        gradientDrawable.draw(canvas);
        canvas.restoreToCount(iSave);
        LogUtil.a("BloodSugarDietMonitorCharView", "drawData finish");
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarNocturnalHypoglycemiaChartView
    protected void b() {
        float width = getWidth();
        for (umh umhVar : this.u) {
            if (LanguageUtil.ba(getContext())) {
                this.e.drawText(umhVar.b(), (width - umhVar.e()) - this.w.measureText(umhVar.b()), umhVar.d(), this.w);
            } else {
                this.e.drawText(umhVar.b(), umhVar.e(), umhVar.d(), this.w);
            }
        }
        for (umh umhVar2 : this.af) {
            Rect rect = new Rect();
            this.w.getTextBounds(umhVar2.b(), 0, umhVar2.b().length(), rect);
            float f = rect.bottom - rect.top;
            float fD = umhVar2.d();
            float f2 = fD - f;
            float[] fArr = this.ad;
            if (fArr != null) {
                float f3 = fArr[0];
                if (f2 < f3 || f2 > fArr[1]) {
                    float f4 = fArr[2];
                    if ((f2 < f4 || f2 > fArr[3]) && ((fD < f3 || fD > fArr[1]) && (fD < f4 || fD > fArr[3]))) {
                    }
                }
                LogUtil.a("BloodSugarDietMonitorCharView", "rect hide ", rect.toString());
            }
            this.e.drawText(umhVar2.b(), umhVar2.e(), umhVar2.d(), this.w);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarNocturnalHypoglycemiaChartView
    protected void e() {
        this.p = 50.0f;
        this.l = getHeight() - 50.0f;
        float f = (this.l - this.p) / 5.0f;
        this.d = (float) (Math.ceil((double) this.d) % 2.0d == 0.0d ? Math.ceil(this.d) : Math.ceil(this.d) + 1.0d);
        float fFloatValue = BigDecimal.valueOf(this.d).divide(BigDecimal.valueOf(5L), 1, RoundingMode.DOWN).floatValue();
        float width = getWidth();
        this.af = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            float f2 = i;
            float f3 = this.p + (f * f2);
            this.e.drawLine(this.j, f3, width - this.j, f3, this.h);
            String strValueOf = String.valueOf(UnitUtil.e(this.d - (f2 * fFloatValue), 1, 1));
            float fMeasureText = this.w.measureText(strValueOf);
            float f4 = f3 - this.r;
            if (LanguageUtil.ba(getContext())) {
                this.af.add(new umh(strValueOf, this.j, f4));
            } else {
                this.af.add(new umh(strValueOf, width - (this.j + fMeasureText), f4));
            }
        }
        this.ab = (width - (this.j * 2.0f)) - (this.x * 3.0f);
        d(this.l + Utils.convertDpToPixel(this.v));
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarNocturnalHypoglycemiaChartView
    protected void d(float f) {
        float fMeasureText = this.w.measureText(ieg.d(new Date(this.s), "HH:mm")) / 2.0f;
        this.m = this.j + fMeasureText;
        this.o = this.j + this.ab + fMeasureText;
        float f2 = this.ab / 4.0f;
        for (int i = 0; i < 5; i++) {
            this.u.add(new umh(ieg.d(new Date(this.s + (((long) i) * 1800000)), "HH:mm"), this.j + (i * f2), f));
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarNocturnalHypoglycemiaChartView
    protected float b(float f) {
        return this.l - ((this.l - this.p) * (f / this.d));
    }
}
