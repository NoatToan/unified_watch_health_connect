package com.huami.ecg.chart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.ecg.chart.model.EcgLostData;
import com.huami.ecg.chart.utils.UIUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public class LineChartView extends View {
    private boolean A;
    private boolean B;
    private boolean C;
    private float D;
    private List<Float> E;
    private Paint F;
    private Paint G;
    private Paint H;
    private int I;
    private RectF J;
    private int K;
    private int L;
    private Path M;
    private ArrayList<PointF> N;
    private ArrayList<ArrayList<PointF>> O;
    private List<EcgLostData> P;
    private ScaleCallback Q;
    private final int a;
    private int b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private int h;
    private float i;
    private float j;
    private float k;
    private Paint l;
    private Paint m;
    private Paint n;
    private Paint o;
    private Paint p;
    private int q;
    private float r;
    private String s;
    private String t;
    private int u;
    private int v;
    private int w;
    private List<Float> x;
    private Context y;
    private boolean z;

    public interface ScaleCallback {
        void onScale(float f);
    }

    public LineChartView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(ContextCompat.getColor(getContext(), R.color.s36));
        canvas.drawRect(0.0f, 0.0f, getContentWidth(), getContentHeight(), paint);
        if (!this.A) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 <= this.q; i2++) {
            if (i2 % 5 == 0) {
                this.l.setStrokeWidth(this.b * 2);
            } else {
                this.l.setStrokeWidth(this.b);
            }
            float f = i2;
            canvas.drawLine(0.0f, this.r * f, Math.round(this.D), this.r * f, this.l);
        }
        if (this.x.size() != 0) {
            return;
        }
        while (true) {
            float f2 = i;
            if (f2 >= (this.D / this.r) + 1.0f) {
                return;
            }
            if (i % 5 == 0) {
                this.l.setStrokeWidth(this.b * 2);
            } else {
                this.l.setStrokeWidth(this.b);
            }
            float f3 = this.r;
            canvas.drawLine(f3 * f2, 0.0f, f3 * f2, getContentHeight(), this.l);
            i++;
        }
    }

    private void b(Canvas canvas) {
        int size = this.P.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            EcgLostData ecgLostData = this.P.get(i2);
            int start = ecgLostData.getStart();
            int lostLen = ecgLostData.getLostLen();
            int i3 = start + i;
            float f = this.r;
            int i4 = this.h;
            float f2 = (i3 + lostLen) * (f / i4);
            canvas.drawRect(i3 * (f / i4), 0.0f, f2, this.i - this.k, this.H);
            if (ecgLostData.getType() != 0) {
                i += lostLen;
            }
            if (i2 == size - 1 || (this.P.get(i2 + 1).getStart() - start) / this.h >= 8) {
                String str = this.s;
                if (str == null) {
                    str = "";
                }
                canvas.drawText(str, f2 + UIUtils.dip2Pix(this.y, 8.0f), UIUtils.dip2Pix(this.y, 20.0f), this.n);
            }
        }
    }

    private void c(Canvas canvas) {
        int size = this.O.size();
        int lostLen = 0;
        for (int i = 0; i < size; i++) {
            ArrayList<PointF> arrayList = this.O.get(i);
            this.M.reset();
            float f = (lostLen * this.r) / this.h;
            this.M.moveTo(arrayList.get(0).x + f, arrayList.get(0).y);
            for (int i2 = 1; i2 < arrayList.size(); i2++) {
                PointF pointF = arrayList.get(i2);
                float f2 = pointF.y;
                if (f2 < 0.0f) {
                    pointF.y = 0.0f;
                } else {
                    float f3 = this.i;
                    float f4 = this.k;
                    if (f2 > f3 - f4) {
                        pointF.y = f3 - f4;
                    }
                }
                this.M.lineTo(pointF.x + f, pointF.y);
                if (i2 % 1000 == 0) {
                    canvas.drawPath(this.M, this.m);
                    this.M.reset();
                    this.M.moveTo(pointF.x + f, pointF.y);
                }
            }
            canvas.drawPath(this.M, this.m);
            List<EcgLostData> list = this.P;
            if (list != null && list.size() > i) {
                EcgLostData ecgLostData = this.P.get(i);
                if (ecgLostData.getType() != 0) {
                    lostLen += ecgLostData.getLostLen();
                }
            }
        }
    }

    private void d(Canvas canvas) {
        if (this.z) {
            float f = this.r;
            float f2 = 10.0f * f;
            float f3 = f * 3.0f;
            Path path = new Path();
            path.moveTo(f3, this.r + f2);
            float f4 = this.r;
            path.lineTo((f4 * 2.0f) + f3, f4 + f2);
            float f5 = this.r;
            path.lineTo((2.0f * f5) + f3, f5);
            float f6 = this.r;
            path.lineTo((f6 * 6.0f) + f3, f6);
            float f7 = this.r;
            path.lineTo((6.0f * f7) + f3, f7 + f2);
            float f8 = this.r;
            path.lineTo(f3 + (8.0f * f8), f2 + f8);
            canvas.drawPath(path, this.o);
        }
    }

    private void e(Canvas canvas) {
        int size = this.N.size() + getBreakPointLength();
        for (int i = 1; i < size; i++) {
            if (this.A) {
                int i2 = this.h;
                if (i % i2 == 0) {
                    if (i % (i2 * 5) == 0) {
                        this.l.setStrokeWidth(this.b * 2);
                    } else {
                        this.l.setStrokeWidth(this.b);
                    }
                    float f = this.r;
                    float f2 = i;
                    int i3 = this.h;
                    canvas.drawLine((f * f2) / i3, 0.0f, (f * f2) / i3, this.j, this.l);
                }
            }
            if (this.B && i % 250 == 0 && this.x.size() - i > this.h * 10) {
                int i4 = i / 250;
                String str = String.format(Locale.US, "%02d:%02d", Integer.valueOf(i4 / 60), Integer.valueOf(i4 % 60));
                Paint.FontMetrics fontMetrics = this.p.getFontMetrics();
                float f3 = this.i - (this.k / 2.0f);
                float f4 = fontMetrics.bottom;
                canvas.drawText(str, this.N.get(i).x, (f3 + ((f4 - fontMetrics.top) / 2.0f)) - f4, this.p);
            }
        }
    }

    private void f(TypedArray typedArray) {
        setHeightPointSize(typedArray.getInteger(R.styleable.LineChartView_heightSize, 5) * 5);
        int i = R.styleable.LineChartView_lineColor;
        Context context = getContext();
        int i2 = R.color.ecg_chart_black;
        setLineColor(typedArray.getColor(i, ContextCompat.getColor(context, i2)));
        setGridColor(typedArray.getColor(R.styleable.LineChartView_gridColor, ContextCompat.getColor(getContext(), i2)));
        setIsShowStandard(typedArray.getBoolean(R.styleable.LineChartView_isShowStandard, true));
        setIsShowGrid(typedArray.getBoolean(R.styleable.LineChartView_isShowGrid, true));
        setMaxCount(typedArray.getFloat(R.styleable.LineChartView_maxCount, 2.5f));
        setMinCount(typedArray.getFloat(R.styleable.LineChartView_minxCount, -2.5f));
        setIsShowTime(typedArray.getBoolean(R.styleable.LineChartView_showTime, false));
        setShowAbnormalOverlay(typedArray.getBoolean(R.styleable.LineChartView_showAbnormalOverlay, false));
        this.s = typedArray.getString(R.styleable.LineChartView_lodText);
        this.t = typedArray.getString(R.styleable.LineChartView_problemText);
        typedArray.recycle();
    }

    private void g() {
        this.N.clear();
        this.O.clear();
        float f = this.j / 2.0f;
        ArrayList<PointF> arrayList = new ArrayList<>();
        List<EcgLostData> list = this.P;
        int i = 0;
        if (list == null || list.size() <= 0) {
            while (i < this.x.size() - 1) {
                PointF pointF = new PointF();
                if (this.x.get(i).floatValue() > 0.0f) {
                    pointF.set(i * (this.r / this.h), f - ((this.x.get(i).floatValue() / this.e) * f));
                } else {
                    pointF.set(i * (this.r / this.h), ((this.x.get(i).floatValue() / this.f) * f) + f);
                }
                arrayList.add(pointF);
                this.N.add(pointF);
                i++;
            }
            this.O.add(arrayList);
            return;
        }
        int start = this.P.get(0).getStart();
        int i2 = 0;
        while (i < this.x.size() - 1) {
            PointF pointF2 = new PointF();
            if (this.x.get(i).floatValue() > 0.0f) {
                pointF2.set(i * (this.r / this.h), f - ((this.x.get(i).floatValue() / this.e) * f));
            } else {
                pointF2.set(i * (this.r / this.h), ((this.x.get(i).floatValue() / this.f) * f) + f);
            }
            arrayList.add(pointF2);
            this.N.add(pointF2);
            if (i == start) {
                this.O.add(arrayList);
                arrayList = new ArrayList<>();
                if (i2 < this.P.size() - 1) {
                    i2++;
                    start = this.P.get(i2).getStart();
                }
            }
            i++;
        }
        this.O.add(arrayList);
    }

    private int getBreakPointLength() {
        List<EcgLostData> list = this.P;
        int lostLen = 0;
        if (list != null && !list.isEmpty()) {
            for (EcgLostData ecgLostData : this.P) {
                if (ecgLostData != null && ecgLostData.getType() != 0) {
                    lostLen += ecgLostData.getLostLen();
                }
            }
        }
        return lostLen;
    }

    private float getContentHeight() {
        return this.j;
    }

    private int getContentWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h() {
        Paint paint = new Paint();
        this.l = paint;
        paint.setAntiAlias(true);
        this.l.setStrokeWidth(this.b);
        this.l.setColor(this.v);
        Paint paint2 = new Paint();
        this.m = paint2;
        paint2.setAntiAlias(true);
        this.m.setStrokeJoin(Paint.Join.ROUND);
        this.m.setStrokeWidth(UIUtils.dip2pix(this.y, this.g));
        this.m.setColor(this.u);
        this.m.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.n = paint3;
        paint3.setAntiAlias(true);
        this.n.setColor(ContextCompat.getColor(this.y, R.color.ecg_chart_red_d6));
        this.n.setTextSize(UIUtils.sp2pix(this.y, 12.0f));
        Paint paint4 = new Paint();
        this.o = paint4;
        paint4.setStrokeWidth(3.0f);
        this.o.setColor(ContextCompat.getColor(getContext(), R.color.ecg_chart_black));
        this.o.setStyle(Paint.Style.STROKE);
        Paint paint5 = new Paint();
        this.p = paint5;
        paint5.setTextSize(UIUtils.sp2pix(this.y, 10.0f));
        this.p.setAntiAlias(true);
        this.p.setColor(ContextCompat.getColor(getContext(), R.color.ecg_chart_default_color));
        this.N = new ArrayList<>();
        this.O = new ArrayList<>();
        this.M = new Path();
        this.k = this.B ? UIUtils.dip2Pix(this.y, this.k) : 0.0f;
        Paint paint6 = new Paint();
        this.F = paint6;
        paint6.setColor(this.I);
        this.F.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint7 = new Paint();
        this.G = paint7;
        paint7.setAntiAlias(true);
        this.G.setColor(this.K);
        this.G.setTextSize(UIUtils.sp2pix(this.y, 12.0f));
        Paint paint8 = new Paint();
        this.H = paint8;
        paint8.setAntiAlias(true);
        this.H.setColor(this.L);
    }

    private void i() {
        float measuredHeight = getMeasuredHeight();
        this.i = measuredHeight;
        float f = measuredHeight - this.k;
        this.j = f;
        this.r = f / this.q;
        if (this.x.size() == 0) {
            this.D = getMeasuredWidth();
        } else {
            this.D = (this.x.size() / this.h) * (getContentHeight() / this.q);
        }
        ScaleCallback scaleCallback = this.Q;
        if (scaleCallback != null) {
            scaleCallback.onScale(this.r);
        }
    }

    public List<EcgLostData> getBreakpointList() {
        return this.P;
    }

    public int getGridColor() {
        return this.v;
    }

    public int getHeightPointSize() {
        return this.q;
    }

    public int getItemSize() {
        return this.w;
    }

    public int getLineColor() {
        return this.u;
    }

    public boolean getShowTime() {
        return this.B;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a(canvas);
        if (this.x.size() == 0) {
            return;
        }
        e(canvas);
        c(canvas);
        List<EcgLostData> list = this.P;
        if (list == null || list.size() <= 0) {
            return;
        }
        b(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (View.MeasureSpec.getSize(i) == -2 || mode == 0) {
            float f = this.D;
            int iRound = (f >= 1.0f ? Math.round(f) : 1) + getPaddingLeft() + getPaddingRight();
            if (mode == 0) {
                mode = 1073741824;
            }
            i = View.MeasureSpec.makeMeasureSpec(iRound, mode);
        }
        super.onMeasure(i, i2);
        invalidate();
    }

    public void setAbnormalOverlayColor(int i) {
        this.I = i;
    }

    public void setAbnormalTimeRange(List<Float> list) {
        this.E = list;
        HMLog.v("abnormalTimeRange", "setAbnormalTimeRange: " + this.E.toString(), new Object[0]);
    }

    public void setBreakpoint(List<EcgLostData> list) {
        this.P = list;
    }

    public void setDataSource(List<Float> list) {
        this.E.clear();
        this.x.clear();
        this.N.clear();
        this.O.clear();
        if (list != null) {
            this.x.addAll(list);
        }
        this.w = this.x.size();
        i();
        requestLayout();
        invalidate();
        g();
    }

    public void setGain(float f) {
        float f2 = 10.0f / f;
        this.e = this.c * f2;
        this.f = this.d * f2;
        g();
        invalidate();
    }

    public void setGridColor(int i) {
        this.v = i;
    }

    public void setHeightPointSize(int i) {
        this.q = i;
    }

    public void setIsShowGrid(boolean z) {
        this.A = z;
    }

    public void setIsShowStandard(boolean z) {
        this.z = z;
    }

    public void setIsShowTime(boolean z) {
        this.B = z;
    }

    public void setLineColor(int i) {
        this.u = i;
    }

    public void setMaxCount(float f) {
        this.c = f;
        this.e = f;
    }

    public void setMinCount(float f) {
        this.d = f;
        this.f = f;
    }

    public void setScaleCallback(ScaleCallback scaleCallback) {
        this.Q = scaleCallback;
    }

    public void setShowAbnormalOverlay(boolean z) {
        this.C = z;
    }

    public void setSpeed(float f) {
        this.h = (int) ((25.0f / f) * 10.0f);
        g();
        i();
        requestLayout();
        invalidate();
    }

    public LineChartView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LineChartView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 250;
        this.b = 1;
        this.c = 2.5f;
        this.d = -2.5f;
        this.e = 2.5f;
        this.f = -2.5f;
        this.g = 1.5f;
        this.h = 10;
        this.k = 12.0f;
        this.s = "";
        this.t = "";
        this.x = new ArrayList();
        this.z = true;
        this.A = true;
        this.B = false;
        this.E = new ArrayList();
        this.I = Color.parseColor("#14FF0000");
        this.J = new RectF();
        this.K = Color.parseColor("#df5156");
        this.L = Color.parseColor("#40ff0000");
        this.y = context;
        setWillNotDraw(false);
        f(context.obtainStyledAttributes(attributeSet, R.styleable.LineChartView, i, 0));
        h();
        i();
    }
}
