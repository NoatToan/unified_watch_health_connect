package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hidatamanager.util.LogUtils;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jql;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SkippingPerformanceRadarView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f11302a;
    private String aa;
    private float ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f11303b;
    private Paint f;
    private int g;
    private int h;
    private float[] i;
    private final Context j;
    private Paint k;
    private Paint l;
    private final List<PointF> m;
    private float n;
    private String[] o;
    private float p;
    private Paint q;
    private Paint r;
    private float[] s;
    private Paint t;
    private TextPaint u;
    private TextPaint v;
    private float w;
    private String x;
    private String[] y;
    private static final int e = qrs.d(BaseApplication.b(), 0.5f);
    private static final int d = qrs.d(BaseApplication.b(), 2.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f11301c = {R.string.IDS_indoor_skipper_speed_number_minute, R.string.IDS_rope_performance_indicator_endurance, R.string.IDS_rope_performance_indicator_continuity, R.string.IDS_rope_performance_indicator_load, R.string.IDS_rope_performance_indicator_speed_endurance};

    public SkippingPerformanceRadarView(Context context) {
        this(context, null, 0);
    }

    public SkippingPerformanceRadarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkippingPerformanceRadarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new ArrayList(5);
        this.w = 0.0f;
        this.n = 0.0f;
        this.j = BaseApplication.b();
        i();
        j();
    }

    private void i() {
        Paint paint = new Paint();
        this.r = paint;
        paint.setColor(ContextCompat.getColor(this.j, R.color.common_white_5alpha));
        this.r.setAntiAlias(true);
        this.r.setStyle(Paint.Style.FILL);
        this.r.setStrokeWidth(qrs.d(this.j, 4.0f));
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{20.0f, 20.0f}, 0.0f);
        this.r.setPathEffect(dashPathEffect);
        Paint paint2 = new Paint();
        this.k = paint2;
        paint2.setColor(ContextCompat.getColor(this.j, R.color.basketball_radar_line_color));
        this.k.setAntiAlias(true);
        this.k.setStyle(Paint.Style.STROKE);
        this.k.setStrokeWidth(e);
        this.k.setPathEffect(dashPathEffect);
        this.k.setAlpha(getResources().getInteger(R.integer.basketball_line_opacity));
        this.v = c(R.color.textColorSecondary, 12.0f, false);
        this.u = c(R.color.textColorPrimaryInverse, 18.0f, true);
        this.q = e(R.color.common_colorAccent);
        this.t = c(R.color.common_colorAccent);
        this.f = e(R.color.weight_light_diet_circle_end_color);
        this.l = c(R.color.weight_light_diet_circle_end_color);
    }

    private TextPaint c(int i, float f, boolean z) {
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(ContextCompat.getColor(this.j, i));
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(qrs.d(this.j, f));
        if (z) {
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        }
        return textPaint;
    }

    private Paint e(int i) {
        Paint paint = new Paint();
        paint.setColor(ContextCompat.getColor(this.j, i));
        paint.setAlpha(50);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    private Paint c(int i) {
        Paint paint = new Paint();
        paint.setColor(ContextCompat.getColor(this.j, i));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(qrs.d(this.j, 4.0f));
        paint.setAntiAlias(true);
        return paint;
    }

    private void j() {
        this.f11303b = 1.2566371f;
    }

    public void setData(String[] strArr, float[] fArr, boolean z) {
        if (strArr == null || fArr == null || strArr.length != fArr.length) {
            LogUtil.e("PerformanceRadarView", "input not allowed");
        } else if (z) {
            this.o = (String[]) strArr.clone();
            this.i = (float[]) fArr.clone();
        } else {
            this.y = (String[]) strArr.clone();
            this.s = (float[]) fArr.clone();
        }
    }

    public void setTextSize(float f) {
        this.w = f;
    }

    public void setNumberSize(float f) {
        this.n = f;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float fMin = (Math.min(i2, i) / 2.0f) * 0.7f;
        this.p = fMin;
        int i5 = i / 2;
        float fD = (i5 - fMin) - qrs.d(this.j, 12.0f);
        this.ad = fD;
        if (fD <= 0.0f) {
            fD = qrs.d(this.j, 56.0f);
        }
        this.ad = fD;
        this.h = i5;
        this.g = i2 / 2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f11302a = canvas;
        b();
        a();
        f();
        c();
    }

    private void b() {
        float fSin;
        float f;
        float fCos;
        int i;
        int i2;
        this.f11302a.save();
        Path path = new Path();
        Path path2 = new Path();
        float f2 = this.p / 4.0f;
        this.m.clear();
        int i3 = 0;
        while (true) {
            int i4 = 4;
            if (i3 <= 4) {
                float f3 = i3 * f2;
                int i5 = 0;
                while (i5 < 5) {
                    if (i5 == 0) {
                        fSin = this.h;
                        fCos = this.g - f3;
                        float f4 = e;
                        path.moveTo(fSin, fCos);
                        path2.moveTo(fSin, f4 + fCos);
                        i = i3;
                        i2 = i4;
                        f = f3;
                    } else {
                        float f5 = i5;
                        double d2 = f3;
                        fSin = (float) (((double) this.h) + (Math.sin(this.f11303b * f5) * d2));
                        f = f3;
                        fCos = (float) (((double) this.g) - (Math.cos(this.f11303b * f5) * d2));
                        double d3 = this.h;
                        double dSin = Math.sin(this.f11303b * f5);
                        double d4 = f - e;
                        path2.lineTo((float) (d3 + (dSin * d4)), (float) (((double) this.g) - (Math.cos(this.f11303b * f5) * d4)));
                        path.lineTo(fSin, fCos);
                        i = i3;
                        i2 = 4;
                    }
                    if (i == i2) {
                        this.m.add(new PointF(fSin, fCos));
                    }
                    i5++;
                    i4 = i2;
                    f3 = f;
                    i3 = i;
                }
                path.close();
                this.f11302a.clipOutPath(path2);
                this.f11302a.drawPath(path, this.k);
                path.reset();
                i3++;
            } else {
                this.f11302a.restore();
                return;
            }
        }
    }

    private void a() {
        for (int i = 0; i < 5; i++) {
            this.f11302a.drawLine(this.m.get(i).x, this.m.get(i).y, this.h, this.g, this.k);
        }
    }

    private void f() {
        float f = this.w;
        if (f != 0.0f) {
            this.v.setTextSize(f);
        }
        float f2 = this.n;
        if (f2 != 0.0f) {
            this.u.setTextSize(f2);
        }
        int iB = d() ? jql.b(this.i) : -1;
        if (e()) {
            iB = jql.b(this.s);
        }
        for (int i = 0; i < 5; i++) {
            String string = this.j.getString(f11301c[i]);
            this.aa = string;
            Rect rectC = c(string, this.v);
            if (d()) {
                this.x = this.o[i];
            } else if (e()) {
                this.x = this.y[i];
            } else {
                this.x = "0";
            }
            Rect rectC2 = c(this.x, this.u);
            if (iB == i) {
                this.u.setColor(ContextCompat.getColor(getContext(), R.color.colorAccent));
            } else {
                this.u.setColor(ContextCompat.getColor(getContext(), R.color.textColorPrimary));
            }
            c(i, rectC.width(), rectC.height(), rectC2.width(), rectC2.height());
        }
    }

    private void c(int i, int i2, int i3, int i4, int i5) {
        float f = i;
        float fSin = (float) (((double) this.h) + (Math.sin(this.f11303b * f) * ((double) (this.p + qrs.d(this.j, 12.0f)))));
        float fCos = (float) (((double) this.g) - (Math.cos(this.f11303b * f) * ((double) (this.p + qrs.d(this.j, 12.0f)))));
        float f2 = this.f11303b * f;
        if (f2 == 0.0f) {
            this.v.setTextAlign(Paint.Align.CENTER);
            this.u.setTextAlign(Paint.Align.CENTER);
            float f3 = d;
            this.f11302a.drawText(this.aa, fSin, fCos, this.v);
            this.f11302a.drawText(this.x, fSin, (fCos - i3) - f3, this.u);
            return;
        }
        if (f2 > 0.0f && f2 < 1.5707963267948966d) {
            this.v.setTextAlign(Paint.Align.LEFT);
            this.u.setTextAlign(Paint.Align.LEFT);
            if (this.u.measureText(this.x) > this.ad) {
                setAutoScoreTextSize(18);
            }
            TextPaint textPaint = this.u;
            int iD = qrs.d(this.j, 70.0f);
            int i6 = d;
            b(textPaint, iD, fSin, (fCos - i5) - (i6 * 3), this.x);
            this.u.setTextSize(qrs.d(this.j, 18.0f));
            b(this.v, (int) this.ad, fSin, i6 + fCos, this.aa);
            return;
        }
        e(i, fSin, fCos, i3, i5);
    }

    private void setAutoScoreTextSize(int i) {
        do {
            i--;
            if (i <= 0) {
                return;
            } else {
                this.u.setTextSize(qrs.d(this.j, i));
            }
        } while (this.u.measureText(this.x) > this.ad);
    }

    private void e(int i, float f, float f2, int i2, int i3) {
        double d2 = this.f11303b * i;
        if (d2 >= 1.5707963267948966d && d2 < 3.141592653589793d) {
            this.v.setTextAlign(Paint.Align.CENTER);
            this.u.setTextAlign(Paint.Align.CENTER);
            float f3 = i3 + f2;
            this.f11302a.drawText(this.x, f, f3, this.u);
            this.f11302a.drawText(this.aa, f, f3 + i2 + (d * 2), this.v);
            return;
        }
        if (d2 >= 3.141592653589793d && d2 < 4.71238898038469d) {
            this.v.setTextAlign(Paint.Align.CENTER);
            this.u.setTextAlign(Paint.Align.CENTER);
            float f4 = i3 + f2;
            this.f11302a.drawText(this.x, f, f4, this.u);
            this.f11302a.drawText(this.aa, f, f4 + i2 + (d * 2), this.v);
            return;
        }
        if (d2 >= 4.71238898038469d && d2 < 6.283185307179586d) {
            this.v.setTextAlign(Paint.Align.RIGHT);
            this.u.setTextAlign(Paint.Align.RIGHT);
            if (this.u.measureText(this.x) > this.ad) {
                setAutoScoreTextSize(18);
            }
            TextPaint textPaint = this.u;
            int iD = qrs.d(this.j, 70.0f);
            int i4 = d;
            float f5 = i4;
            b(textPaint, iD, f - f5, (f2 - i3) - (i4 * 3), this.x);
            this.u.setTextSize(qrs.d(this.j, 18.0f));
            b(this.v, (int) this.ad, f, f2 + f5, this.aa);
            return;
        }
        LogUtils.e("PerformanceRadarView", "wrong angle branch");
    }

    private void b(TextPaint textPaint, int i, float f, float f2, String str) {
        Layout.Alignment alignment;
        if (LanguageUtil.ba(this.j) && !qrs.d(str)) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        this.f11302a.save();
        StaticLayout staticLayout = new StaticLayout(str, textPaint, i, alignment, 1.0f, 0.0f, true);
        this.f11302a.translate(f, f2);
        staticLayout.draw(this.f11302a);
        this.f11302a.restore();
    }

    public boolean d() {
        float[] fArr = this.i;
        if (fArr == null || fArr.length <= 0) {
            return false;
        }
        float[] fArr2 = this.s;
        return fArr2 == null || fArr2.length == 0;
    }

    public boolean e() {
        float[] fArr;
        float[] fArr2 = this.i;
        return fArr2 != null && fArr2.length > 0 && (fArr = this.s) != null && fArr.length > 0;
    }

    public Pair<String[], float[]> getHistoryData() {
        return new Pair<>(this.o, this.i);
    }

    public Pair<String[], float[]> getData() {
        return new Pair<>(this.y, this.s);
    }

    private void c() {
        if (d()) {
            d(this.i, this.f, this.l);
        } else {
            if (e()) {
                this.l.setStrokeWidth(d);
                d(this.i, null, this.l);
                d(this.s, this.q, this.t);
                return;
            }
            LogUtil.j("PerformanceRadarView", "Do not draw region.");
        }
    }

    private void d(float[] fArr, Paint paint, Paint paint2) {
        Path path = new Path();
        float f = this.p / 4.0f;
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                path.moveTo(this.h, (this.g - f) - ((this.p - f) * fArr[i]));
            } else {
                float f2 = i;
                path.lineTo((float) (((double) this.h) + (Math.sin(this.f11303b * f2) * ((double) ((fArr[i] * (this.p - f)) + f)))), (float) (((double) this.g) - (Math.cos(this.f11303b * f2) * ((double) ((fArr[i] * (this.p - f)) + f)))));
            }
        }
        path.close();
        if (paint != null) {
            this.f11302a.drawPath(path, paint);
        }
        if (paint2 != null) {
            this.f11302a.drawPath(path, paint2);
        }
    }

    private Rect c(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect;
    }
}
