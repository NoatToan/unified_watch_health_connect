package com.huawei.ui.main.stories.fitness.views.bloodsugar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.ui.main.R;
import defpackage.ieg;
import defpackage.qqp;
import defpackage.umh;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarNocturnalHypoglycemiaChartView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected float f27224a;
    private int aa;
    protected float ab;
    private Paint ac;
    private Map<Long, Float> ad;
    private long ae;
    private int af;
    private Paint ag;
    private Paint ah;
    private int ai;
    private int aj;
    private List<umh> ak;
    private Paint al;
    private boolean am;
    private LoadingListener an;
    private float ao;
    private Paint ap;
    private List<umh> aq;
    private int ar;
    private int as;
    private int at;
    private int aw;
    private int ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f27225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected float f27226c;
    protected float d;
    protected Canvas e;
    protected float f;
    protected long g;
    protected Paint h;
    protected int i;
    protected float j;
    protected float k;
    protected float l;
    protected float m;
    protected float n;
    protected float o;
    protected float p;
    protected Paint q;
    protected float r;
    protected long s;
    protected float t;
    protected List<umh> u;
    protected float v;
    protected Paint w;
    protected float x;
    protected float y;
    private int z;

    public interface LoadingListener {
        void onCompleted();
    }

    public BloodSugarNocturnalHypoglycemiaChartView(Context context) {
        this(context, null);
    }

    public BloodSugarNocturnalHypoglycemiaChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0.0f;
        this.f27224a = 0.0f;
        this.f27226c = 0.0f;
        this.i = -249511;
        this.j = 0.0f;
        this.r = 8.0f;
        this.x = 15.0f;
        this.k = 52.0f;
        this.n = 16.0f;
        this.y = 10.0f;
        this.ab = 0.0f;
        this.v = 10.0f;
        this.l = 0.0f;
        this.p = 0.0f;
        this.u = new ArrayList();
        this.t = 0.0f;
        this.f = 0.0f;
        this.m = 0.0f;
        this.o = 0.0f;
        this.s = 0L;
        this.g = 0L;
        this.z = -2566442;
        this.ar = -12728884;
        this.at = -12728884;
        this.as = 1711276032;
        this.aw = 1711276032;
        this.aa = -504465;
        this.ax = 16527705;
        this.ao = 0.0f;
        this.ai = 5;
        this.ae = -1L;
        this.aj = 0;
        this.af = 0;
        this.am = true;
        this.ak = new ArrayList();
        this.aq = new ArrayList();
        this.ad = new LinkedHashMap(16);
        this.f27225b = context;
        h();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a();
        this.e = canvas;
        canvas.save();
        if (LanguageUtil.ba(getContext())) {
            this.e.scale(-1.0f, 1.0f, getWidth() / 2, getHeight() / 2);
        }
        e();
        c();
        d();
        c();
        this.e.restore();
        b();
        LoadingListener loadingListener = this.an;
        if (loadingListener != null) {
            loadingListener.onCompleted();
        }
    }

    private void a() {
        this.af = 0;
        this.aj = 0;
        this.u.clear();
        this.ak.clear();
        this.aq.clear();
    }

    protected void b() {
        float width = getWidth();
        for (umh umhVar : this.u) {
            if (LanguageUtil.ba(getContext())) {
                this.e.drawText(umhVar.b(), (width - umhVar.e()) - this.x, umhVar.d(), this.w);
            } else {
                this.e.drawText(umhVar.b(), umhVar.e(), umhVar.d(), this.w);
            }
        }
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, this.aq.size(), 2);
        for (int i = 0; i < this.aq.size(); i++) {
            umh umhVar2 = this.aq.get(i);
            String strE = UnitUtil.e(CommonUtil.a(umhVar2.b()), 1, 1);
            Rect rect = new Rect();
            this.q.getTextBounds(strE, 0, strE.length(), rect);
            fArr[i][0] = umhVar2.d() - (rect.bottom - rect.top);
            fArr[i][1] = umhVar2.d();
            if (LanguageUtil.ba(getContext())) {
                this.e.drawText(strE, (width - umhVar2.e()) - this.j, umhVar2.d(), this.q);
            } else {
                this.e.drawText(strE, umhVar2.e() - this.j, umhVar2.d(), this.q);
            }
        }
        c(fArr, width);
    }

    protected void c(float[][] fArr, float f) {
        int i = 0;
        for (umh umhVar : this.ak) {
            if (i != 1 || this.am) {
                i++;
                Rect rect = new Rect();
                this.w.getTextBounds(umhVar.b(), 0, umhVar.b().length(), rect);
                float f2 = rect.bottom - rect.top;
                float fD = umhVar.d();
                float f3 = fD - f2;
                int length = fArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        float[] fArr2 = fArr[i2];
                        float f4 = fArr2[0];
                        if ((f3 >= f4 && f3 <= fArr2[1]) || (fD >= f4 && fD <= fArr2[1])) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        String strE = UnitUtil.e(CommonUtil.a(umhVar.b()), 1, 1);
                        if (LanguageUtil.ba(getContext())) {
                            this.e.drawText(strE, (f - umhVar.e()) - this.j, umhVar.d(), this.w);
                            break;
                        } else {
                            this.e.drawText(strE, umhVar.e() - this.j, umhVar.d(), this.w);
                            break;
                        }
                    }
                }
            } else {
                i++;
            }
        }
    }

    private void h() {
        this.aw = ContextCompat.getColor(this.f27225b, R.color.textColorTertiary);
        this.z = ContextCompat.getColor(this.f27225b, R.color.textColorTertiary);
        this.as = ContextCompat.getColor(this.f27225b, R.color.textColorTertiary);
        this.x = qqp.a(this.f27225b, this.x);
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setAntiAlias(true);
        this.h.setStyle(Paint.Style.STROKE);
        this.h.setStrokeWidth(1.0f);
        this.h.setColor(this.z);
        this.h.setPathEffect(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f));
        Paint paint2 = new Paint();
        this.ap = paint2;
        paint2.setColor(this.ar);
        this.ap.setStyle(Paint.Style.FILL);
        this.ap.setAntiAlias(true);
        this.ap.setStrokeCap(Paint.Cap.ROUND);
        this.ap.setStrokeWidth(1.0f);
        Paint paint3 = new Paint();
        this.q = paint3;
        paint3.setStrokeWidth(4.0f);
        this.q.setTextSize(Utils.convertDpToPixel(this.v));
        this.q.setFlags(1);
        this.q.setColor(this.at);
        this.q.setStyle(Paint.Style.FILL);
        Paint paint4 = new Paint();
        this.al = paint4;
        paint4.setStrokeWidth(4.0f);
        this.al.setTextSize(Utils.convertDpToPixel(this.v));
        this.al.setFlags(1);
        this.al.setColor(this.as);
        this.al.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.w = paint5;
        paint5.setStrokeWidth(2.0f);
        this.w.setTextSize(Utils.convertDpToPixel(this.v));
        this.w.setFlags(1);
        this.w.setColor(this.aw);
        this.w.setStyle(Paint.Style.FILL);
        Paint paint6 = new Paint(1);
        this.ah = paint6;
        paint6.setAntiAlias(true);
        this.ah.setStyle(Paint.Style.FILL);
        this.ah.setColor(this.i);
        Paint paint7 = new Paint();
        this.ac = paint7;
        paint7.setAntiAlias(true);
        this.ac.setStyle(Paint.Style.FILL);
        this.ac.setColor(this.aa);
        Paint paint8 = new Paint(1);
        this.ag = paint8;
        paint8.setAntiAlias(true);
        this.ag.setStyle(Paint.Style.STROKE);
        this.ag.setStrokeWidth(2.0f);
        this.ag.setColor(this.aa);
        this.ag.setPathEffect(new DashPathEffect(new float[]{10.0f, 0.0f}, 0.0f));
    }

    protected void e() {
        this.t = ((getHeight() - this.n) - this.k) / 6.0f;
        float fCeil = (float) (Math.ceil((double) this.f27226c) % 2.0d == 0.0d ? Math.ceil(this.f27226c) : Math.ceil(this.f27226c) + 1.0d);
        this.d = fCeil;
        int i = (int) this.f27224a;
        if (i % 2 != 0) {
            i--;
        }
        float f = i;
        this.f27224a = f;
        this.f = (fCeil - f) / 5.0f;
        Path path = new Path();
        float width = getWidth();
        float f2 = 0.0f;
        for (int i2 = 1; i2 <= 6; i2++) {
            if (i2 == 6) {
                Canvas canvas = this.e;
                float f3 = this.j;
                f2 = this.t * i2;
                canvas.drawLine(f3, f2, width - f3, f2, this.h);
            } else {
                float f4 = i2;
                path.moveTo(this.j, this.t * f4);
                path.lineTo(width - this.j, this.t * f4);
            }
            if (i2 == 1) {
                this.p = this.t * i2;
            }
            if (i2 == 6) {
                this.l = this.t * i2;
            }
            this.ak.add(new umh(String.valueOf(this.d - (this.f * (i2 - 1))), (this.j + width) - this.x, (this.t * i2) - this.r));
        }
        this.e.drawPath(path, this.h);
        this.ab = (width - (this.j * 2.0f)) - (this.x * 3.0f);
        d(f2 + this.v + qqp.a(this.f27225b, this.y));
    }

    protected void d(float f) {
        this.m = this.j + (this.x / 2.0f);
        this.u.add(new umh(ieg.d(new Date(this.s), "HH:mm"), this.j, f));
        this.o = this.j + this.ab + (this.x / 2.0f);
        this.u.add(new umh(ieg.d(new Date(this.g), "HH:mm"), this.j + this.ab, f));
        long j = this.s;
        if (j % 3600000 != 0) {
            j = ((j / 3600000) + 1) * 3600000;
        }
        long j2 = this.g;
        if (j2 % 3600000 != 0) {
            j2 = (j2 / 3600000) * 3600000;
        }
        long j3 = j2 - j;
        int i = (int) (j3 / 1800000);
        int i2 = 5;
        while (true) {
            if (i2 < 2) {
                i2 = 1;
                break;
            } else if (i % i2 == 0) {
                break;
            } else {
                i2--;
            }
        }
        long j4 = j3 / ((long) i2);
        long j5 = this.g;
        long j6 = this.s;
        if (j5 <= j6) {
            LogUtil.d("BloodSugarNocturnalHypoglycemiaChartView", "drawX mEndTime <= mStartTime, time interval error!");
            return;
        }
        float fD = (float) UnitUtil.d(this.ab / ((float) UnitUtil.d((j5 - j6) / 60000.0d, 2)), 2);
        float fD2 = (float) UnitUtil.d((j - this.s) / 60000.0d, 2);
        float fD3 = (float) UnitUtil.d(j3 / 60000.0d, 2);
        float fD4 = (float) UnitUtil.d(fD / i2, 2);
        int i3 = 1;
        while (i3 < i2) {
            this.u.add(new umh(ieg.d(new Date((((long) i3) * j4) + j), "HH:mm"), this.j + (fD2 * fD) + (i3 * fD3 * fD4), f));
            i3++;
            j = j;
        }
    }

    private void c() {
        float f;
        float f2 = this.d;
        float f3 = this.f27224a;
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            LogUtil.d("BloodSugarNocturnalHypoglycemiaChartView", "drawStandardLine error!");
            return;
        }
        float f5 = this.l;
        float f6 = f5 - ((this.f27226c - f3) * ((f5 - this.p) / f4));
        this.ao = f6;
        this.e.drawLine(this.j, f6, getWidth() - this.j, this.ao, this.ap);
        float f7 = this.d;
        if (f7 != 0.0f) {
            float f8 = this.t;
            if (f8 != 0.0f) {
                float f9 = this.f;
                if (f9 != 0.0f) {
                    float f10 = this.f27226c;
                    if (f9 > (f7 - f10) * 2.0f) {
                        float f11 = this.ao;
                        float f12 = this.v;
                        f = f11 + f12;
                        if (f8 - (f11 - this.p) > f12 * 2.0f) {
                            this.am = true;
                        } else {
                            this.am = false;
                        }
                    } else {
                        float f13 = this.ao;
                        float f14 = this.r;
                        f = f13 - f14;
                        if (f8 - (f13 - this.p) > f14 + this.v) {
                            this.am = true;
                        } else {
                            this.am = false;
                        }
                    }
                    this.aq.add(new umh(String.valueOf(f10), (this.j + getWidth()) - this.x, f));
                    return;
                }
            }
        }
        LogUtil.d("BloodSugarNocturnalHypoglycemiaChartView", "drawStandardLine error!");
    }

    private void d() {
        if (this.ad.isEmpty()) {
            LogUtil.d("BloodSugarNocturnalHypoglycemiaChartView", "drawData data is empty!");
            return;
        }
        long j = this.ae;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        for (Map.Entry<Long, Float> entry : this.ad.entrySet()) {
            Float value = entry.getValue();
            float fFloatValue = value.floatValue();
            Long key = entry.getKey();
            long jLongValue = key.longValue();
            if (j != this.ae && jLongValue - j > 2100000) {
                if (linkedHashMap.size() > 0) {
                    c(linkedHashMap);
                }
                linkedHashMap.clear();
            }
            if (fFloatValue <= this.f27226c) {
                linkedHashMap.put(key, value);
            } else {
                if (linkedHashMap.size() > 0) {
                    c(linkedHashMap);
                }
                linkedHashMap.clear();
            }
            j = jLongValue;
        }
        if (linkedHashMap.size() > 0) {
            if (linkedHashMap.size() > 0) {
                c(linkedHashMap);
            }
            linkedHashMap.clear();
        }
    }

    private void c(Map<Long, Float> map) {
        if (map.isEmpty()) {
            LogUtil.d("BloodSugarNocturnalHypoglycemiaChartView", "drawClosedSection hypoglycemia data is empty!");
            return;
        }
        this.aj++;
        long jC = this.ae;
        float f = this.d;
        int i = 0;
        long j = jC;
        float f2 = f;
        for (Map.Entry<Long, Float> entry : map.entrySet()) {
            float fFloatValue = entry.getValue().floatValue();
            long jLongValue = entry.getKey().longValue();
            if (i == 0) {
                j = jLongValue;
            }
            if (i == map.size() - 1) {
                jC = jLongValue;
            }
            if (fFloatValue < f2) {
                f2 = fFloatValue;
            }
            i++;
        }
        long jC2 = c(j);
        long jA = a(jC);
        if (jC2 == this.ae) {
            jC2 = j;
        }
        long jC3 = jC2 == j ? j : c(Long.valueOf(jC2), j);
        if (jA == this.ae) {
            jA = jC;
        }
        if (jA != jC) {
            jC = c(Long.valueOf(jC), jA);
        }
        long j2 = jC;
        this.af += (int) (j2 - jC3);
        d(jC3, j2, j, map, f2);
    }

    private void d(long j, long j2, long j3, Map<Long, Float> map, float f) {
        float fB = b(f);
        float f2 = this.ao;
        this.ah.setShader(new LinearGradient(0.0f, f2, 0.0f, fB + f2, new int[]{this.ax, this.i}, (float[]) null, Shader.TileMode.REPEAT));
        Path path = new Path();
        path.moveTo(e(j), this.ao);
        path.lineTo(e(j3), b(this.ad.get(Long.valueOf(j3)).floatValue()));
        Path path2 = new Path();
        path2.moveTo(e(j), this.ao);
        if (j != j3) {
            path2.lineTo(e(j3), b(this.ad.get(Long.valueOf(j3)).floatValue()));
        } else {
            path2.moveTo(e(j), b(this.ad.get(Long.valueOf(j3)).floatValue()));
        }
        long j4 = this.ae;
        for (Long l : map.keySet()) {
            long jLongValue = l.longValue();
            if (j4 != this.ae) {
                path.lineTo(e(jLongValue), b(this.ad.get(l).floatValue()));
                if (j4 != jLongValue) {
                    path2.lineTo(e(jLongValue), b(this.ad.get(l).floatValue()));
                }
            }
            j4 = jLongValue;
        }
        path.lineTo(e(j2), this.ao);
        path.lineTo(e(j), this.ao);
        path.close();
        if (j4 != j2) {
            path2.lineTo(e(j2), this.ao);
        }
        this.e.drawPath(path, this.ah);
        if (map.size() == 1 && j == j2) {
            path.moveTo(e(j3) - this.ai, this.ao);
            path.lineTo(e(j3) - this.ai, b(this.ad.get(Long.valueOf(j3)).floatValue()));
            path.lineTo(e(j3) + this.ai, b(this.ad.get(Long.valueOf(j3)).floatValue()));
            path.lineTo(e(j3) + this.ai, this.ao);
            path.close();
            this.e.drawPath(path, this.ah);
            this.e.drawCircle(e(j3), b(this.ad.get(Long.valueOf(j3)).floatValue()), this.ai, this.ac);
            return;
        }
        this.e.drawPath(path2, this.ag);
    }

    protected float e(long j) {
        long j2 = this.g;
        long j3 = this.s;
        if (j2 <= j3) {
            LogUtil.d("BloodSugarNocturnalHypoglycemiaChartView", "timeToCoordinate mEndTime <= mStartTime, time interval error!");
            return this.ae;
        }
        float f = this.o;
        float f2 = this.m;
        return (((f - f2) * (j - j3)) / (j2 - j3)) + f2;
    }

    protected float b(float f) {
        float f2 = this.d;
        float f3 = this.f27224a;
        if (f2 <= f3) {
            LogUtil.d("BloodSugarNocturnalHypoglycemiaChartView", "valueToCoordinate mBloodSugarMaxValueChart <= mBloodSugarMinValue, error!");
            return this.ae;
        }
        float f4 = this.l;
        return f4 - (((f4 - this.p) * (f - f3)) / (f2 - f3));
    }

    private long c(Long l, long j) {
        long jLongValue = l.longValue();
        long j2 = this.ae;
        if (jLongValue == j2 || j == j2) {
            return j2;
        }
        float fFloatValue = this.ad.get(l).floatValue();
        float fFloatValue2 = this.ad.get(Long.valueOf(j)).floatValue();
        if (fFloatValue == fFloatValue2) {
            return this.ae;
        }
        return ((long) (((fFloatValue - this.f27226c) * (j - l.longValue())) / (fFloatValue - fFloatValue2))) + l.longValue();
    }

    private long c(long j) {
        long j2 = this.ae;
        Iterator<Long> it = this.ad.keySet().iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (jLongValue == j) {
                break;
            }
            j2 = jLongValue;
        }
        return j - j2 < 2100000 ? j2 : this.ae;
    }

    private long a(long j) {
        long jLongValue = this.ae;
        long jLongValue2 = jLongValue;
        for (Long l : this.ad.keySet()) {
            if (l.longValue() != j) {
                if (jLongValue2 != this.ae) {
                    if (l.longValue() - jLongValue2 >= 2100000) {
                        break;
                    }
                    jLongValue = l.longValue();
                    break;
                }
            } else {
                jLongValue2 = l.longValue();
            }
        }
        return jLongValue - j < 2100000 ? jLongValue : this.ae;
    }

    public void setStartTime(long j) {
        this.s = j;
    }

    public void setEndTime(long j) {
        this.g = j;
    }

    public long getStartTime() {
        return this.s;
    }

    public long getEndTime() {
        return this.g;
    }

    public void setData(Map<Long, Float> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.d("BloodSugarNocturnalHypoglycemiaChartView", "setData data is empty");
            return;
        }
        if (this.g <= this.s) {
            LogUtil.d("BloodSugarNocturnalHypoglycemiaChartView", "setData mEndTime <= mStartTime, time interval error!");
            return;
        }
        this.ad.clear();
        if (map.size() > 0) {
            this.ad.putAll(map);
        }
        this.f27224a = b(this.ad);
        invalidate();
    }

    public void setBloodSugarStandardValue(float f) {
        this.f27226c = f;
    }

    private float b(Map<Long, Float> map) {
        Iterator<Map.Entry<Long, Float>> it = map.entrySet().iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            float fFloatValue = it.next().getValue().floatValue();
            if (f > fFloatValue) {
                f = fFloatValue;
            }
        }
        return f;
    }

    public void setLoadingListener(LoadingListener loadingListener) {
        this.an = loadingListener;
    }

    public int getHypoglycemiaNum() {
        return this.aj;
    }

    public int getHypoglycemiaAverageDuration() {
        if (this.aj == 0) {
            return 0;
        }
        LogUtil.a("BloodSugarNocturnalHypoglycemiaChartView", "setStatisticsData mHypoglycemiaDuration:", Integer.valueOf(this.af));
        return Math.round(((this.af / 1000.0f) / 60.0f) / this.aj);
    }
}
