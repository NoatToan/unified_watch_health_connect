package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RadarView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f11273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f11274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11275c;
    private int d;
    private int e;
    private Paint f;
    private Paint g;
    private int h;
    private double[] i;
    private int j;
    private List<e> k;
    private Paint l;
    private TextPaint m;
    private Paint n;
    private float o;
    private String[] p;
    private int q;
    private int[] s;
    private TextPaint t;

    public RadarView(Context context) {
        this(context, null, 0);
    }

    public RadarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setAverageScore(int i) {
        this.e = i;
    }

    public void setPercentOfMap(int[] iArr) {
        if (iArr == null) {
            LogUtil.e("Track_RadarView", "input not allowed");
            return;
        }
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < iArr.length; i++) {
            dArr[i] = ((double) iArr[i]) / 100.0d;
        }
        this.s = (int[]) iArr.clone();
        this.i = dArr;
        this.h = length;
    }

    public void setColorList(List<Integer> list) {
        this.f11273a = list;
    }

    public RadarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 5;
        this.j = 4;
        this.i = new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d};
        this.p = new String[]{getContext().getString(R.string.IDS_aw_version2_jump), getContext().getString(R.string.IDS_aw_version2_burst), getContext().getString(R.string.IDS_aw_version2_breakthrough), getContext().getString(R.string.IDS_aw_version2_run), getContext().getString(R.string.IDS_aw_version2_sport_intensity)};
        this.s = new int[]{0, 0, 0, 0, 0};
        this.f11273a = new ArrayList(5);
        this.k = new ArrayList(5);
        this.q = 0;
        int i2 = this.h;
        if (i2 != 0) {
            this.f11274b = (float) (6.283185307179586d / ((double) i2));
        }
        Paint paint = new Paint();
        this.g = paint;
        paint.setColor(getResources().getColor(R.color.hw_show_color_text_white));
        this.g.setAntiAlias(true);
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setStrokeWidth(4.0f);
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setColor(-2631721);
        this.f.setAntiAlias(true);
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeWidth(qrs.d(context, 0.5f));
        this.f.setAlpha(getResources().getInteger(R.integer.basketball_line_opacity));
        TextPaint textPaint = new TextPaint();
        this.t = textPaint;
        textPaint.setColor(getResources().getColor(R.color.textColorPrimary));
        this.t.setAntiAlias(true);
        this.t.setStyle(Paint.Style.FILL);
        this.t.setTextSize(qrs.d(context, 10.0f));
        TextPaint textPaint2 = new TextPaint();
        this.m = textPaint2;
        textPaint2.setColor(getResources().getColor(R.color.common_colorAccent));
        this.m.setAntiAlias(true);
        this.m.setStyle(Paint.Style.FILL);
        this.m.setTextSize(qrs.d(context, 18.0f));
        this.m.setTypeface(Typeface.DEFAULT_BOLD);
        this.n = new Paint();
        this.n.setShader(new LinearGradient(0.0f, 0.0f, 300.0f, 300.0f, 0, getResources().getColor(R.color.common_colorAccent), Shader.TileMode.MIRROR));
        this.n.setAlpha(50);
        this.n.setStyle(Paint.Style.FILL_AND_STROKE);
        this.n.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.l = paint3;
        paint3.setColor(getResources().getColor(R.color.common_colorAccent));
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setStrokeWidth(qrs.d(getContext(), 3.0f));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.o = (Math.min(i2, i) / 2.0f) * 0.7f;
        this.d = i / 2;
        this.f11275c = i2 / 2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
        e(canvas);
        a(canvas);
        d(canvas);
        setCircle(canvas);
        b(canvas);
    }

    private void b(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.basketball_center_score_color));
        paint.setTextSize(qrs.d(getContext(), 30.0f));
        Rect rect = new Rect();
        String strValueOf = String.valueOf(UnitUtil.e(this.e, 1, 0));
        paint.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText(strValueOf, this.d - (paint.measureText(strValueOf) * 0.5f), this.f11275c + ((rect.bottom - rect.top) * 0.5f), paint);
    }

    private void c(Canvas canvas) {
        Path path = new Path();
        float f = this.o;
        int i = this.j;
        float f2 = f / i;
        while (i > 0) {
            float f3 = i * f2;
            for (int i2 = 0; i2 < this.h; i2++) {
                if (i2 == 0) {
                    path.moveTo(this.d, this.f11275c - f3);
                } else {
                    float f4 = i2;
                    double d = f3;
                    path.lineTo((float) (((double) this.d) + (Math.sin(this.f11274b * f4) * d)), (float) (((double) this.f11275c) - (Math.cos(this.f11274b * f4) * d)));
                }
            }
            path.lineTo(this.d, this.f11275c - f3);
            Paint paint = new Paint();
            Paint paint2 = new Paint();
            int i3 = i - 1;
            if (njy.c(this.f11273a, i3)) {
                paint.setColor(this.f11273a.get(i3).intValue());
            }
            paint.setStyle(Paint.Style.FILL);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setAntiAlias(true);
            paint2.setColor(getResources().getColor(R.color.basketball_radar_line_color));
            paint2.setStrokeWidth(qrs.d(getContext(), 0.5f));
            paint2.setAlpha(getResources().getInteger(R.integer.basketball_line_opacity));
            paint.setAntiAlias(true);
            paint.setAlpha(getResources().getInteger(R.integer.basketball_opacity));
            path.close();
            canvas.drawPath(path, paint);
            canvas.drawPath(path, paint2);
            path.reset();
            i--;
        }
    }

    private void e(Canvas canvas) {
        for (int i = 0; i < this.h; i++) {
            int i2 = this.d;
            float f = i;
            canvas.drawLine(i2, this.f11275c, (float) (((double) i2) + (Math.sin(this.f11274b * f) * ((double) this.o))), (float) (((double) this.f11275c) - (Math.cos(this.f11274b * f) * ((double) this.o))), this.f);
        }
    }

    private void a(Canvas canvas) {
        for (int i = 0; i < this.h; i++) {
            String str = this.p[i];
            Rect rect = new Rect();
            this.t.getTextBounds(str, 0, str.length(), rect);
            String strValueOf = String.valueOf(this.s[i]);
            Rect rect2 = new Rect();
            this.m.getTextBounds(strValueOf, 0, strValueOf.length(), rect2);
            e(canvas, i, str, rect, rect2);
        }
    }

    private void e(Canvas canvas, int i, String str, Rect rect, Rect rect2) {
        float f = rect.bottom - rect.top;
        float f2 = i;
        float fSin = (float) (((double) this.d) + (Math.sin(this.f11274b * f2) * ((double) (this.o + 12.0f))));
        float fCos = (float) (((double) this.f11275c) - (Math.cos(this.f11274b * f2) * ((double) (this.o + 12.0f))));
        if (this.f11274b * f2 == 0.0f) {
            this.t.setTextAlign(Paint.Align.CENTER);
            this.m.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(this.p[i], fSin, fCos - qrs.d(getContext(), 0.5f), this.t);
            canvas.drawText(UnitUtil.e(this.s[i], 1, 0), fSin, (fCos - f) - qrs.d(getContext(), 1.0f), this.m);
            this.t.setTextAlign(Paint.Align.LEFT);
            this.m.setTextAlign(Paint.Align.LEFT);
            return;
        }
        float fD = qrs.d(getContext(), 40.0f);
        float f3 = this.f11274b * f2;
        if (f3 > 0.0f && f3 < 1.5707963267948966d) {
            this.t.setTextAlign(Paint.Align.CENTER);
            this.m.setTextAlign(Paint.Align.CENTER);
            e(canvas, qrs.d(getContext(), 3.0f) + fSin, fCos, str, true);
            canvas.drawText(UnitUtil.e(this.s[i], 1, 0), fSin + qrs.d(getContext(), 3.0f) + (fD * 0.5f), fCos, this.m);
            this.t.setTextAlign(Paint.Align.LEFT);
            this.m.setTextAlign(Paint.Align.LEFT);
            return;
        }
        a(canvas, i, str, f, rect2.bottom - rect2.top);
    }

    private void a(Canvas canvas, int i, String str, float f, float f2) {
        float f3 = i;
        float fSin = (float) (((double) this.d) + (Math.sin(this.f11274b * f3) * ((double) (this.o + 12.0f))));
        float fCos = (float) (((double) this.f11275c) - (Math.cos(this.f11274b * f3) * ((double) (this.o + 12.0f))));
        double d = this.f11274b * f3;
        if (d >= 1.5707963267948966d && d < 3.141592653589793d) {
            this.t.setTextAlign(Paint.Align.CENTER);
            this.m.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(str, fSin, fCos + f + qrs.d(getContext(), 7.0f) + f2, this.t);
            canvas.drawText(UnitUtil.e(this.s[i], 1, 0), fSin, fCos + qrs.d(getContext(), 7.0f) + f, this.m);
            this.m.setTextAlign(Paint.Align.LEFT);
            return;
        }
        if (d >= 3.141592653589793d && d < 4.71238898038469d) {
            this.t.setTextAlign(Paint.Align.CENTER);
            this.m.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(str, fSin, fCos + f + qrs.d(getContext(), 7.0f) + f2, this.t);
            canvas.drawText(UnitUtil.e(this.s[i], 1, 0), fSin, fCos + qrs.d(getContext(), 7.0f) + f, this.m);
            return;
        }
        if (d < 4.71238898038469d || d >= 6.283185307179586d) {
            return;
        }
        this.t.setTextAlign(Paint.Align.CENTER);
        this.m.setTextAlign(Paint.Align.CENTER);
        e(canvas, fSin - qrs.d(getContext(), 3.0f), fCos, str, false);
        canvas.drawText(UnitUtil.e(this.s[i], 1, 0), (fSin - qrs.d(getContext(), 3.0f)) - (qrs.d(getContext(), 40.0f) * 0.5f), fCos, this.m);
    }

    private String d(String str) {
        return TextUtils.ellipsize(str, this.t, qrs.d(getContext(), 228.0f), TextUtils.TruncateAt.END).toString();
    }

    private void e(Canvas canvas, float f, float f2, String str, boolean z) {
        int iMin;
        TextPaint textPaint = new TextPaint();
        if (z) {
            textPaint.setTextAlign(Paint.Align.LEFT);
            iMin = Math.min(qrs.d(getContext(), 76.0f), Math.abs(this.q - ((int) f)));
        } else {
            textPaint.setTextAlign(Paint.Align.RIGHT);
            iMin = Math.min(qrs.d(getContext(), 76.0f), (int) f);
        }
        textPaint.setColor(getResources().getColor(R.color.textColorPrimary));
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(qrs.d(getContext(), 10.0f));
        textPaint.setStyle(Paint.Style.FILL);
        StaticLayout staticLayout = new StaticLayout(d(str), textPaint, iMin, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        canvas.save();
        canvas.translate(f, f2);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private void d(Canvas canvas) {
        this.k.clear();
        Path path = new Path();
        float f = this.o / this.j;
        for (int i = 0; i < this.h; i++) {
            if (i == 0) {
                path.moveTo(this.d, (float) (((double) (this.f11275c - f)) - (((double) (this.o - f)) * this.i[i])));
                this.k.add(new e(this.d, (float) (((double) (this.f11275c - f)) - (((double) (this.o - f)) * this.i[i]))));
            } else {
                float f2 = i;
                double d = f;
                float fSin = (float) (((double) this.d) + (Math.sin(this.f11274b * f2) * ((this.i[i] * ((double) (this.o - f))) + d)));
                float fCos = (float) (((double) this.f11275c) - (Math.cos(this.f11274b * f2) * ((this.i[i] * ((double) (this.o - f))) + d)));
                path.lineTo(fSin, fCos);
                this.k.add(new e(fSin, fCos));
            }
        }
        path.close();
        canvas.drawPath(path, this.n);
        canvas.drawPath(path, this.l);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.q = View.MeasureSpec.getSize(i);
    }

    private void setCircle(Canvas canvas) {
        for (int i = 0; i < this.k.size(); i++) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(getResources().getColor(R.color.common_colorAccent));
            paint.setAlpha(255);
            canvas.drawCircle(this.k.get(i).e, this.k.get(i).f11276a, qrs.d(getContext(), 4.5f), paint);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(getResources().getColor(R.color.basketball_radar_circle_color));
            canvas.drawCircle(this.k.get(i).e, this.k.get(i).f11276a, qrs.d(getContext(), 2.5f), paint);
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f11276a;
        private float e;

        private e(float f, float f2) {
            this.e = f;
            this.f11276a = f2;
        }
    }
}
