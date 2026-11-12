package com.huawei.ui.commonui.view;

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
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class RadarView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f23996c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private Paint h;
    private boolean i;
    private int j;
    private Paint k;
    private int l;
    private double[] m;
    private float n;
    private List<d> o;
    private int[] p;
    private Paint q;
    private float r;
    private Paint s;
    private TextPaint t;
    private String[] u;
    private TextPaint v;
    private int w;
    private float y;

    public RadarView(Context context) {
        this(context, null, 0);
    }

    public RadarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = 5;
        this.i = false;
        this.j = 4;
        this.m = new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d};
        this.u = new String[]{getContext().getString(R.string.IDS_aw_version2_jump), getContext().getString(R.string.IDS_aw_version2_burst), getContext().getString(R.string.IDS_aw_version2_breakthrough), getContext().getString(R.string.IDS_aw_version2_run), getContext().getString(R.string.IDS_aw_version2_sport_intensity)};
        this.p = new int[]{0, 0, 0, 0, 0};
        this.f23996c = new ArrayList(5);
        this.w = getResources().getColor(R.color.textColorPrimary);
        this.y = 0.0f;
        this.l = getResources().getColor(R.color.common_colorAccent);
        this.n = 0.0f;
        this.g = false;
        this.o = new ArrayList(5);
        int i2 = this.f;
        if (i2 != 0) {
            this.f23995b = (float) (6.283185307179586d / ((double) i2));
        }
        Paint paint = new Paint();
        this.k = paint;
        paint.setColor(getResources().getColor(R.color.common_color_white));
        this.k.setAntiAlias(true);
        this.k.setStyle(Paint.Style.STROKE);
        this.k.setStrokeWidth(4.0f);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-2631721);
        this.h.setAntiAlias(true);
        this.h.setStyle(Paint.Style.STROKE);
        this.h.setStrokeWidth(qrs.d(context, 0.5f));
        this.h.setAlpha(getResources().getInteger(R.integer.basketball_line_opacity));
        TextPaint textPaint = new TextPaint();
        this.v = textPaint;
        textPaint.setColor(this.w);
        this.v.setAntiAlias(true);
        this.v.setStyle(Paint.Style.FILL);
        this.v.setTextSize(qrs.d(context, 10.0f));
        TextPaint textPaint2 = new TextPaint();
        this.t = textPaint2;
        textPaint2.setColor(this.l);
        this.t.setAntiAlias(true);
        this.t.setStyle(Paint.Style.FILL);
        this.t.setTextSize(qrs.d(context, 18.0f));
        this.t.setTypeface(Typeface.DEFAULT_BOLD);
        this.q = new Paint();
        this.q.setShader(new LinearGradient(0.0f, 0.0f, 300.0f, 300.0f, 0, getResources().getColor(R.color.common_colorAccent), Shader.TileMode.MIRROR));
        this.q.setAlpha(50);
        this.q.setStyle(Paint.Style.FILL_AND_STROKE);
        this.q.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.s = paint3;
        paint3.setColor(getResources().getColor(R.color.common_colorAccent));
        this.s.setStyle(Paint.Style.STROKE);
        this.s.setStrokeWidth(qrs.d(getContext(), 3.0f));
    }

    public void setCount(int i) {
        this.f = i;
        this.f23995b = (float) (6.283185307179586d / ((double) i));
        if (i % 2 == 0) {
            this.i = true;
        }
        invalidate();
    }

    public void setPercentOfMap(double[] dArr, String[] strArr) {
        if (dArr == null || strArr == null || dArr.length != strArr.length) {
            LogUtil.e("Track_RadarView", "input not allowed");
            return;
        }
        int length = dArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = (int) (dArr[i] * 100.0d);
        }
        this.u = (String[]) strArr.clone();
        this.m = (double[]) dArr.clone();
        this.p = (int[]) iArr.clone();
    }

    public void setAverageScore(int i) {
        this.d = i;
    }

    public void setColorList(List<Integer> list) {
        this.f23996c = list;
    }

    public void setTextColorAndSize(int i, float f) {
        this.w = i;
        this.y = f;
    }

    public void setNumberColorAndSize(int i, float f) {
        this.l = i;
        this.n = f;
    }

    public void setIsActionRadar(boolean z) {
        this.g = z;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.r = (Math.min(i2, i) / 2.0f) * 0.7f;
        this.f23994a = i / 2;
        this.e = i2 / 2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
        a(canvas);
        e(canvas);
        b(canvas);
        setCircle(canvas);
        d(canvas);
    }

    private void d(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.basketball_center_score_color));
        paint.setTextSize(qrs.d(getContext(), 30.0f));
        Rect rect = new Rect();
        String strValueOf = String.valueOf(UnitUtil.e(this.d, 1, 0));
        paint.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText(strValueOf, this.f23994a - (paint.measureText(strValueOf) * 0.5f), this.e + ((rect.bottom - rect.top) * 0.5f), paint);
    }

    private void c(Canvas canvas) {
        float f;
        int i;
        Path path = new Path();
        float f2 = this.r;
        int i2 = this.j;
        float f3 = f2 / i2;
        while (i2 > 0) {
            float f4 = i2 * f3;
            int i3 = 0;
            if (this.i) {
                while (i3 < this.f) {
                    double d2 = this.f23994a;
                    float f5 = this.f23995b;
                    float f6 = i3;
                    double dSin = Math.sin((f5 * f6) + (f5 / 2.0f));
                    float f7 = f3;
                    int i4 = i2;
                    double d3 = f4;
                    float f8 = (float) (d2 + (dSin * d3));
                    double d4 = this.e;
                    float f9 = this.f23995b;
                    float fCos = (float) (d4 - (Math.cos((f6 * f9) + (f9 / 2.0f)) * d3));
                    if (i3 == 0) {
                        path.moveTo(f8, fCos);
                    } else {
                        path.lineTo(f8, fCos);
                    }
                    i3++;
                    f3 = f7;
                    i2 = i4;
                }
                f = f3;
                i = i2;
            } else {
                f = f3;
                i = i2;
                while (i3 < this.f) {
                    if (i3 == 0) {
                        path.moveTo(this.f23994a, this.e - f4);
                    } else {
                        float f10 = i3;
                        double d5 = f4;
                        path.lineTo((float) (((double) this.f23994a) + (Math.sin(this.f23995b * f10) * d5)), (float) (((double) this.e) - (Math.cos(this.f23995b * f10) * d5)));
                    }
                    i3++;
                }
            }
            Paint paint = new Paint();
            Paint paint2 = new Paint();
            int i5 = i - 1;
            if (njy.c(this.f23996c, i5)) {
                paint.setColor(this.f23996c.get(i5).intValue());
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
            i2 = i - 1;
            f3 = f;
        }
    }

    private void a(Canvas canvas) {
        int i = 0;
        if (this.i) {
            while (i < this.f) {
                int i2 = this.f23994a;
                float f = i2;
                float f2 = this.e;
                double d2 = i2;
                float f3 = this.f23995b;
                float f4 = i;
                float fSin = (float) (d2 + (Math.sin((f3 * f4) + (f3 / 2.0f)) * ((double) this.r)));
                double d3 = this.e;
                float f5 = this.f23995b;
                canvas.drawLine(f, f2, fSin, (float) (d3 - (Math.cos((f4 * f5) + (f5 / 2.0f)) * ((double) this.r))), this.h);
                i++;
            }
            return;
        }
        while (i < this.f) {
            int i3 = this.f23994a;
            float f6 = i;
            canvas.drawLine(i3, this.e, (float) (((double) i3) + (Math.sin(this.f23995b * f6) * ((double) this.r))), (float) (((double) this.e) - (Math.cos(this.f23995b * f6) * ((double) this.r))), this.h);
            i++;
        }
    }

    private void e(Canvas canvas) {
        this.v.setColor(this.w);
        float f = this.y;
        if (f != 0.0f) {
            this.v.setTextSize(f);
        }
        this.t.setColor(this.l);
        float f2 = this.n;
        if (f2 != 0.0f) {
            this.t.setTextSize(f2);
        }
        for (int i = 0; i < this.f; i++) {
            String str = this.u[i];
            Rect rect = new Rect();
            this.v.getTextBounds(str, 0, str.length(), rect);
            float f3 = rect.bottom - rect.top;
            float fD = qrs.d(getContext(), 40.0f);
            String strValueOf = String.valueOf(this.p[i]);
            Rect rect2 = new Rect();
            this.t.getTextBounds(strValueOf, 0, strValueOf.length(), rect2);
            float f4 = rect2.bottom - rect2.top;
            if (this.i) {
                d(canvas, i, f3, f4);
            } else {
                b(canvas, i, f3, fD, f4);
            }
        }
    }

    private void d(Canvas canvas, int i, float f, float f2) {
        if (this.f < 4) {
            return;
        }
        String str = this.u[i];
        Rect rect = new Rect();
        this.v.getTextBounds(str, 0, str.length(), rect);
        float f3 = rect.right - rect.left;
        float fMeasureText = this.t.measureText(str);
        float f4 = (f3 - f2) / 2.0f;
        double d2 = this.f23994a;
        float f5 = this.f23995b;
        float f6 = i;
        float fSin = (float) (d2 + (Math.sin((f5 * f6) + (f5 / 2.0f)) * ((double) (this.r + 12.0f))));
        double d3 = this.e;
        float f7 = this.f23995b;
        float fCos = (float) (d3 - (Math.cos((f6 * f7) + (f7 / 2.0f)) * ((double) (this.r + 12.0f))));
        if (i != 0) {
            int i2 = this.f;
            if (i != i2 - 1) {
                int i3 = i2 / 2;
                int i4 = i3 - 1;
                if (i < i4) {
                    d(fSin, fCos, f3, fMeasureText, canvas, i, f4);
                    return;
                }
                if (i != i4 && i != i3) {
                    if (i > i3) {
                        b(fSin, fCos, f3, fMeasureText, canvas, i, f4);
                        return;
                    } else {
                        LogUtil.e("Track_RadarView", "wrong mCount index");
                        return;
                    }
                }
                this.v.setTextAlign(Paint.Align.CENTER);
                this.t.setTextAlign(Paint.Align.CENTER);
                float f8 = fCos + f;
                canvas.drawText(this.u[i], fSin, qrs.d(getContext(), 6.0f) + f8 + f2, this.v);
                canvas.drawText(UnitUtil.e(this.p[i], 1, 0), fSin, f8 + qrs.d(getContext(), 4.0f), this.t);
                return;
            }
        }
        this.v.setTextAlign(Paint.Align.CENTER);
        this.t.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(this.u[i], fSin, fCos - qrs.d(getContext(), 4.0f), this.v);
        canvas.drawText(UnitUtil.e(this.p[i], 1, 0), fSin, (fCos - f) - qrs.d(getContext(), 6.0f), this.t);
    }

    private void b(Canvas canvas, int i, float f, float f2, float f3) {
        String str = this.u[i];
        float f4 = i;
        float fSin = (float) (((double) this.f23994a) + (Math.sin(this.f23995b * f4) * ((double) (this.r + 12.0f))));
        float fCos = (float) (((double) this.e) - (Math.cos(this.f23995b * f4) * ((double) (this.r + 12.0f))));
        float f5 = this.f23995b * f4;
        if (f5 == 0.0f) {
            this.v.setTextAlign(Paint.Align.CENTER);
            this.t.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(this.u[i], fSin, fCos - qrs.d(getContext(), 0.5f), this.v);
            canvas.drawText(UnitUtil.e(this.p[i], 1, 0), fSin, (fCos - f) - qrs.d(getContext(), 1.0f), this.t);
            this.v.setTextAlign(Paint.Align.LEFT);
            this.t.setTextAlign(Paint.Align.LEFT);
            return;
        }
        if (f5 > 0.0f && f5 < 1.5707963267948966d) {
            this.v.setTextAlign(Paint.Align.CENTER);
            this.t.setTextAlign(Paint.Align.CENTER);
            d(canvas, qrs.d(getContext(), 3.0f) + fSin, fCos, str, true);
            canvas.drawText(UnitUtil.e(this.p[i], 1, 0), fSin + qrs.d(getContext(), 3.0f) + (0.5f * f2), fCos, this.t);
            this.v.setTextAlign(Paint.Align.LEFT);
            this.t.setTextAlign(Paint.Align.LEFT);
            return;
        }
        double d2 = f5;
        if (d2 >= 1.5707963267948966d && d2 < 3.141592653589793d) {
            this.v.setTextAlign(Paint.Align.CENTER);
            this.t.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(str, fSin, fCos + f + qrs.d(getContext(), 7.0f) + f3, this.v);
            canvas.drawText(UnitUtil.e(this.p[i], 1, 0), fSin, fCos + qrs.d(getContext(), 7.0f) + f, this.t);
            this.t.setTextAlign(Paint.Align.LEFT);
            return;
        }
        if (d2 >= 3.141592653589793d && d2 < 4.71238898038469d) {
            this.v.setTextAlign(Paint.Align.CENTER);
            this.t.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(str, fSin, fCos + f + qrs.d(getContext(), 7.0f) + f3, this.v);
            canvas.drawText(UnitUtil.e(this.p[i], 1, 0), fSin, fCos + qrs.d(getContext(), 7.0f) + f, this.t);
            return;
        }
        if (d2 >= 4.71238898038469d && d2 < 6.283185307179586d) {
            this.v.setTextAlign(Paint.Align.CENTER);
            this.t.setTextAlign(Paint.Align.CENTER);
            d(canvas, fSin - qrs.d(getContext(), 3.0f), fCos, str, false);
            canvas.drawText(UnitUtil.e(this.p[i], 1, 0), (fSin - qrs.d(getContext(), 3.0f)) - (0.5f * f2), fCos, this.t);
            return;
        }
        LogUtil.e("Track_RadarView", "wrong angle branch");
    }

    private String d(String str) {
        return TextUtils.ellipsize(str, this.v, qrs.d(getContext(), 76.0f), TextUtils.TruncateAt.END).toString();
    }

    private void d(Canvas canvas, float f, float f2, String str, boolean z) {
        canvas.save();
        TextPaint textPaint = new TextPaint();
        if (z) {
            textPaint.setTextAlign(Paint.Align.LEFT);
        } else {
            textPaint.setTextAlign(Paint.Align.RIGHT);
        }
        textPaint.setColor(getResources().getColor(R.color.textColorPrimary));
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(qrs.d(getContext(), 10.0f));
        textPaint.setStyle(Paint.Style.FILL);
        StaticLayout staticLayout = new StaticLayout(d(str), textPaint, qrs.d(getContext(), 76.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        canvas.translate(f, f2);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private void b(Canvas canvas) {
        float f;
        float fCos;
        float fSin;
        float f2 = 2.0f;
        if (this.g) {
            this.q.setShader(new LinearGradient(0.0f, 0.0f, 300.0f, 300.0f, getResources().getColor(R.color.action_radar_cover_color), getResources().getColor(R.color.action_radar_cover_color_deep), Shader.TileMode.MIRROR));
            this.q.setAlpha(255);
            this.s.setStrokeWidth(qrs.d(getContext(), 2.0f));
        }
        this.o.clear();
        Path path = new Path();
        float f3 = this.r / this.j;
        int i = 0;
        while (i < this.f) {
            if (i == 0) {
                int i2 = this.f23994a;
                float fSin2 = i2;
                float fCos2 = (float) (((double) (this.e - f3)) - (((double) (this.r - f3)) * this.m[i]));
                if (this.i) {
                    double d2 = f3;
                    fSin2 = (float) (((double) i2) + (Math.sin(this.f23995b / f2) * ((this.m[i] * ((double) (this.r - f3))) + d2)));
                    fCos2 = (float) (((double) this.e) - (Math.cos(this.f23995b / f2) * ((this.m[i] * ((double) (this.r - f3))) + d2)));
                }
                path.moveTo(fSin2, fCos2);
                this.o.add(new d(fSin2, fCos2));
                f = f3;
            } else {
                float f4 = f3;
                float f5 = i;
                f = f4;
                double d3 = f;
                float fSin3 = (float) (((double) this.f23994a) + (Math.sin(this.f23995b * f5) * ((this.m[i] * ((double) (this.r - f4))) + d3)));
                float fCos3 = (float) (((double) this.e) - (Math.cos(this.f23995b * f5) * ((this.m[i] * ((double) (this.r - f))) + d3)));
                if (this.i) {
                    double d4 = this.f23994a;
                    float f6 = this.f23995b;
                    fSin = (float) (d4 + (Math.sin((f6 * f5) + (f6 / 2.0f)) * ((this.m[i] * ((double) (this.r - f))) + d3)));
                    double d5 = this.e;
                    float f7 = this.f23995b;
                    fCos = (float) (d5 - (Math.cos((f5 * f7) + (f7 / 2.0f)) * ((this.m[i] * ((double) (this.r - f))) + d3)));
                    path = path;
                } else {
                    fCos = fCos3;
                    fSin = fSin3;
                }
                path.lineTo(fSin, fCos);
                this.o.add(new d(fSin, fCos));
            }
            i++;
            f3 = f;
            f2 = 2.0f;
        }
        path.close();
        canvas.drawPath(path, this.q);
        canvas.drawPath(path, this.s);
    }

    private void setCircle(Canvas canvas) {
        if (this.g) {
            return;
        }
        for (int i = 0; i < this.o.size(); i++) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(getResources().getColor(R.color.common_colorAccent));
            paint.setAlpha(255);
            canvas.drawCircle(this.o.get(i).e, this.o.get(i).f23997a, qrs.d(getContext(), 4.5f), paint);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(getResources().getColor(R.color.basketball_radar_circle_color));
            canvas.drawCircle(this.o.get(i).e, this.o.get(i).f23997a, qrs.d(getContext(), 2.5f), paint);
        }
    }

    private void d(float f, float f2, float f3, float f4, Canvas canvas, int i, float f5) {
        this.v.setTextAlign(Paint.Align.CENTER);
        this.t.setTextAlign(Paint.Align.CENTER);
        float fD = f + (0.5f * f3) + qrs.d(getContext(), 2.0f);
        canvas.drawText(this.u[i], fD, qrs.d(getContext(), 14.0f) + f2, this.v);
        if (f3 > f4) {
            canvas.drawText(UnitUtil.e(this.p[i], 1, 0), fD + f5, f2, this.t);
        } else {
            canvas.drawText(UnitUtil.e(this.p[i], 1, 0), fD, f2, this.t);
        }
    }

    private void b(float f, float f2, float f3, float f4, Canvas canvas, int i, float f5) {
        this.v.setTextAlign(Paint.Align.CENTER);
        this.t.setTextAlign(Paint.Align.CENTER);
        float fD = (f - (0.5f * f3)) - qrs.d(getContext(), 2.0f);
        canvas.drawText(this.u[i], fD, qrs.d(getContext(), 14.0f) + f2, this.v);
        if (f3 > f4) {
            canvas.drawText(UnitUtil.e(this.p[i], 1, 0), fD - f5, f2, this.t);
        } else {
            canvas.drawText(UnitUtil.e(this.p[i], 1, 0), fD, f2, this.t);
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f23997a;
        private float e;

        private d(float f, float f2) {
            this.e = f;
            this.f23997a = f2;
        }
    }
}
