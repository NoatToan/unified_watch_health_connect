package com.huawei.ui.main.stories.fitness.views.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.utils.FitnessUtils;
import defpackage.lmf;
import defpackage.ltb;
import defpackage.ukg;
import defpackage.ukj;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class BarChartView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27116a;
    private float aa;
    private double ab;
    private float ac;
    private float ad;
    private RectF ae;
    private float af;
    private float ag;
    private float ah;
    private ArrayList<ukg> ai;
    private int aj;
    private float ak;
    private float al;
    private float am;
    private float an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f27117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27118c;
    private boolean d;
    private boolean e;
    private LinearGradient f;
    private float g;
    private float h;
    private ArrayList<ukg> i;
    private int j;
    private int k;
    private int l;
    private int m;
    private Paint n;
    private int o;
    private RectF p;
    private float q;
    private Paint r;
    private List<Double> s;
    private List<Double> t;
    private ArrayList<Double> u;
    private String v;
    private List<String> w;
    private int x;
    private Context y;
    private float z;

    public BarChartView(Context context) {
        super(context);
        this.aj = 0;
        this.f27118c = true;
        this.f = null;
        this.aa = 50.0f;
        this.ag = 50.0f;
        this.z = 0.0f;
        this.ab = 200.0d;
        this.t = new ArrayList();
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.r = new Paint();
        this.ai = new ArrayList<>();
        this.i = new ArrayList<>();
        this.u = new ArrayList<>();
        this.v = "";
        this.x = 1000;
        this.e = true;
        this.d = true;
        this.f27116a = false;
        this.n = new Paint();
        this.j = 0;
        this.h = 15.0f;
        this.g = 5.0f;
        this.ae = new RectF();
        this.ah = 0.0f;
        this.af = 0.0f;
        this.an = 50.0f;
        this.al = 50.0f;
        this.y = context;
    }

    public BarChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aj = 0;
        this.f27118c = true;
        this.f = null;
        this.aa = 50.0f;
        this.ag = 50.0f;
        this.z = 0.0f;
        this.ab = 200.0d;
        this.t = new ArrayList();
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.r = new Paint();
        this.ai = new ArrayList<>();
        this.i = new ArrayList<>();
        this.u = new ArrayList<>();
        this.v = "";
        this.x = 1000;
        this.e = true;
        this.d = true;
        this.f27116a = false;
        this.n = new Paint();
        this.j = 0;
        this.h = 15.0f;
        this.g = 5.0f;
        this.ae = new RectF();
        this.ah = 0.0f;
        this.af = 0.0f;
        this.an = 50.0f;
        this.al = 50.0f;
        this.y = context;
    }

    public void setIsDrawMaxDashLineLable(boolean z) {
        this.d = z;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.ak = getDefaultSize(getSuggestedMinimumWidth(), i);
        this.am = getDefaultSize(getSuggestedMinimumHeight(), i2);
        Paint paint = new Paint();
        paint.setTextSize(ukj.b(1, 12.0f));
        Calendar calendar = Calendar.getInstance();
        calendar.set(ltb.e(), ltb.c(), 1, 20, 0);
        String strA = UnitUtil.a(calendar.getTime(), 1);
        float fMeasureText = (paint.measureText(strA, 0, strA.length()) / 2.0f) + 5.0f;
        this.aa = fMeasureText;
        this.ag = fMeasureText;
        this.z = ukj.b(1, 20.0f);
        this.ac = ((this.ak - this.aa) - this.ag) - ukj.e().e(paint, "00000");
        this.ad = this.am - this.z;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        a(canvas);
        c(canvas);
        b(canvas);
        e(canvas);
        if (this.f27116a) {
            return;
        }
        b(canvas, this.i);
    }

    public void setPadding(float f, float f2) {
        this.aa = f;
        this.ag = f2;
    }

    public void setBarColor(int i, int i2) {
        this.k = i;
        this.o = i2;
    }

    public void setBarTwoColor(int i, int i2) {
        this.m = i;
        this.l = i2;
    }

    public void setDiagramAnchorType(int i) {
        this.x = i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0091  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:26:0x012f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0139  */
    /* JADX WARN: Code duplicated, block: B:30:0x0152  */
    /* JADX WARN: Code duplicated, block: B:31:0x019e  */
    private void b(Canvas canvas) {
        Path path;
        double dDoubleValue;
        boolean z;
        float fB;
        double d;
        float f;
        float f2;
        float fD;
        double d2;
        int i;
        int i2;
        Path path2;
        boolean z2;
        char c2;
        int size = this.t.size();
        this.f27117b = this.ac / (size - 1);
        this.ai.clear();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.m);
        Path path3 = new Path();
        float f3 = this.q / 2.0f;
        boolean z3 = false;
        float[] fArr = {f3, f3, f3, f3, 0.0f, 0.0f, 0.0f, 0.0f};
        double d3 = 0.0d;
        int i3 = 0;
        double d4 = 0.0d;
        while (i3 < size) {
            double dDoubleValue2 = this.t.get(i3).doubleValue();
            if (this.s.size() > i3) {
                path = path3;
                dDoubleValue = this.s.get(i3).doubleValue();
                if (dDoubleValue > d3) {
                    fB = b(dDoubleValue);
                    z = true;
                }
                d = dDoubleValue2 + dDoubleValue;
                if (d <= d3) {
                    d2 = d3;
                } else {
                    f = i3;
                    f2 = this.aa + (this.f27117b * f);
                    if (LanguageUtil.ba(BaseApplication.getContext())) {
                        f2 = (this.ag + this.ac) - (this.f27117b * f);
                    }
                    fD = d(d);
                    d2 = 0.0d;
                    if (dDoubleValue > 0.0d) {
                        d(dDoubleValue);
                    }
                    if (fD >= this.ad) {
                        if (dDoubleValue2 > 0.0d) {
                            this.r.setAntiAlias(false);
                            float f4 = this.q / 2.0f;
                            i = size;
                            this.p = new RectF(f2 - f4, fD, f4 + f2, (this.am - this.z) - fB);
                            i2 = i3;
                            LinearGradient linearGradient = new LinearGradient(this.p.right, this.p.bottom, this.p.right, this.p.top, this.o, this.k, Shader.TileMode.CLAMP);
                            this.f = linearGradient;
                            this.r.setShader(linearGradient);
                            path2 = path;
                            fArr = fArr;
                            path2.addRoundRect(this.p, fArr, Path.Direction.CW);
                            canvas.drawPath(path2, this.r);
                        } else {
                            i = size;
                            i2 = i3;
                            path2 = path;
                            fArr = fArr;
                            if (z) {
                                float f5 = this.q;
                                float f6 = f5 / 2.0f;
                                path2.addRoundRect(new RectF(f2 - f6, fD, f6 + f2, f5 + fD), fArr, Path.Direction.CW);
                                canvas.drawPath(path2, paint);
                            }
                        }
                        if (z) {
                            this.r.setAntiAlias(false);
                            float f7 = this.q / 2.0f;
                            RectF rectF = new RectF(f2 - f7, f7 + fD, f7 + f2, this.am - this.z);
                            this.r.setShader(new LinearGradient(rectF.right, rectF.bottom, rectF.right, rectF.top, this.l, this.m, Shader.TileMode.CLAMP));
                            canvas.drawRect(rectF, this.r);
                        }
                        ukg ukgVar = new ukg();
                        z2 = true;
                        ukgVar.f50291c = 1;
                        ukgVar.f50290b = new PointF(f2, (fD - (this.q / 2.0f)) + 3.0f);
                        ukgVar.j = Integer.toString((int) d);
                        ukgVar.f50289a = d;
                        float f8 = this.q;
                        c2 = Ascii.MIN;
                        float f9 = f8 / 2.0f;
                        ukgVar.e = new RectF(f2 - f9, fD, f2 + f9, this.am - this.z);
                        this.ai.add(ukgVar);
                        if (!this.e && d > d4) {
                            this.i.clear();
                            this.i.add(ukgVar);
                            d4 = d;
                        }
                    }
                    paint = paint;
                    path3 = path2;
                    fArr = fArr;
                    d3 = d2;
                    z3 = false;
                    i3 = i2 + 1;
                    size = i;
                }
                i = size;
                i2 = i3;
                path2 = path;
                c2 = Ascii.MIN;
                paint = paint;
                z2 = true;
                paint = paint;
                path3 = path2;
                fArr = fArr;
                d3 = d2;
                z3 = false;
                i3 = i2 + 1;
                size = i;
            } else {
                path = path3;
                dDoubleValue = d3;
            }
            z = z3;
            fB = 0.0f;
            d = dDoubleValue2 + dDoubleValue;
            if (d <= d3) {
                d2 = d3;
            } else {
                f = i3;
                f2 = this.aa + (this.f27117b * f);
                if (LanguageUtil.ba(BaseApplication.getContext())) {
                    f2 = (this.ag + this.ac) - (this.f27117b * f);
                }
                fD = d(d);
                d2 = 0.0d;
                if (dDoubleValue > 0.0d) {
                    d(dDoubleValue);
                }
                if (fD >= this.ad) {
                    if (dDoubleValue2 > 0.0d) {
                        this.r.setAntiAlias(false);
                        float f10 = this.q / 2.0f;
                        i = size;
                        this.p = new RectF(f2 - f10, fD, f10 + f2, (this.am - this.z) - fB);
                        i2 = i3;
                        LinearGradient linearGradient2 = new LinearGradient(this.p.right, this.p.bottom, this.p.right, this.p.top, this.o, this.k, Shader.TileMode.CLAMP);
                        this.f = linearGradient2;
                        this.r.setShader(linearGradient2);
                        path2 = path;
                        fArr = fArr;
                        path2.addRoundRect(this.p, fArr, Path.Direction.CW);
                        canvas.drawPath(path2, this.r);
                    } else {
                        i = size;
                        i2 = i3;
                        path2 = path;
                        fArr = fArr;
                        if (z) {
                            float f11 = this.q;
                            float f12 = f11 / 2.0f;
                            path2.addRoundRect(new RectF(f2 - f12, fD, f12 + f2, f11 + fD), fArr, Path.Direction.CW);
                            canvas.drawPath(path2, paint);
                        }
                    }
                    if (z) {
                        this.r.setAntiAlias(false);
                        float f13 = this.q / 2.0f;
                        RectF rectF2 = new RectF(f2 - f13, f13 + fD, f13 + f2, this.am - this.z);
                        this.r.setShader(new LinearGradient(rectF2.right, rectF2.bottom, rectF2.right, rectF2.top, this.l, this.m, Shader.TileMode.CLAMP));
                        canvas.drawRect(rectF2, this.r);
                    }
                    ukg ukgVar2 = new ukg();
                    z2 = true;
                    ukgVar2.f50291c = 1;
                    ukgVar2.f50290b = new PointF(f2, (fD - (this.q / 2.0f)) + 3.0f);
                    ukgVar2.j = Integer.toString((int) d);
                    ukgVar2.f50289a = d;
                    float f14 = this.q;
                    c2 = Ascii.MIN;
                    float f15 = f14 / 2.0f;
                    ukgVar2.e = new RectF(f2 - f15, fD, f2 + f15, this.am - this.z);
                    this.ai.add(ukgVar2);
                    if (!this.e) {
                    }
                }
                paint = paint;
                path3 = path2;
                fArr = fArr;
                d3 = d2;
                z3 = false;
                i3 = i2 + 1;
                size = i;
            }
            i = size;
            i2 = i3;
            path2 = path;
            c2 = Ascii.MIN;
            paint = paint;
            z2 = true;
            paint = paint;
            path3 = path2;
            fArr = fArr;
            d3 = d2;
            z3 = false;
            i3 = i2 + 1;
            size = i;
        }
        this.e = z3;
    }

    private float d(double d) {
        return (this.ad - this.q) - b(d);
    }

    private float b(double d) {
        return (float) ((((double) (this.ad - this.q)) * d) / this.ab);
    }

    private void e(Canvas canvas) {
        float f;
        int i;
        double d;
        int i2;
        String strD;
        Paint paint = new Paint();
        Path path = new Path();
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 2.0f, 4.0f, 2.0f}, 1.0f);
        int i3 = 0;
        int i4 = 0;
        while (i4 < this.u.size()) {
            paint.setStrokeWidth(ukj.b(1, 0.5f));
            paint.setStyle(Paint.Style.STROKE);
            if (this.f27116a) {
                paint.setColor(ViewCompat.MEASURED_SIZE_MASK);
            } else {
                paint.setColor(i3);
            }
            paint.setAlpha(78);
            double dDoubleValue = this.u.get(i4).doubleValue();
            if (dDoubleValue <= 0.0d) {
                i2 = i3;
            } else {
                float fD = d(dDoubleValue);
                if (i4 == 0) {
                    paint.setStrokeWidth(ukj.b(1, 0.5f));
                    f = 0.0f;
                    i = 127;
                    canvas.drawLine(0.0f, fD, this.ak, fD, paint);
                } else {
                    f = 0.0f;
                    i = 127;
                    paint.setPathEffect(dashPathEffect);
                    paint.setAlpha(127);
                    path.moveTo(0.0f, fD);
                    path.lineTo(this.ak, fD);
                    canvas.drawPath(path, paint);
                    path.reset();
                }
                if (this.d) {
                    d = dDoubleValue;
                } else {
                    d = dDoubleValue;
                    if (d == this.ab) {
                        i2 = 0;
                    }
                }
                if (this.f27116a) {
                    paint.setColor(ViewCompat.MEASURED_SIZE_MASK);
                } else {
                    paint.setColor(0);
                }
                paint.setAlpha(i);
                paint.setPathEffect(dashPathEffect);
                paint.setStyle(Paint.Style.FILL);
                paint.setTextSize(ukj.b(1, 11.0f));
                int i5 = this.x;
                if (i5 == 1001) {
                    i2 = 0;
                    strD = d((int) d);
                } else if (i5 == 1003) {
                    i2 = 0;
                    strD = UnitUtil.e(CommonUtil.e(d, 2), 1, 2);
                } else if (i5 == 1004) {
                    i2 = 0;
                    strD = UnitUtil.f() ? String.valueOf(UnitUtil.e(UnitUtil.e(d, 1), 1, 2)) : UnitUtil.e(d, 1, 1);
                } else {
                    i2 = 0;
                    strD = UnitUtil.e(d, 1, 0);
                }
                canvas.drawText(strD, LanguageUtil.ba(BaseApplication.getContext()) ? f : this.ak - ukj.e().e(paint, strD), fD + ukj.e().b(paint), paint);
            }
            i4++;
            i3 = i2;
        }
    }

    private void a(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setAlpha(25);
        paint.setStrokeWidth(1.0f);
        float f = this.ad;
        canvas.drawLine(0.0f, f, this.ak, f, paint);
    }

    private void c(Canvas canvas) {
        Paint paint = new Paint();
        if (this.f27116a) {
            paint.setColor(-1);
        } else {
            paint.setColor(Integer.MIN_VALUE);
        }
        paint.setTextSize(ukj.b(1, 11.0f));
        paint.setAntiAlias(true);
        for (int i = 0; i < this.w.size(); i++) {
            String str = this.w.get(i);
            float fMeasureText = (int) paint.measureText(str, 0, str.length());
            float f = i;
            float f2 = fMeasureText / 2.0f;
            float size = (this.aa + ((this.ac / (this.w.size() - 1)) * f)) - f2;
            if (size < 0.0f) {
                size = 0.0f;
            }
            float f3 = this.ak;
            if (size + fMeasureText > f3) {
                size = f3 - fMeasureText;
            }
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                size = ((this.ak - this.aa) - ((this.ac / (this.w.size() - 1)) * f)) - f2;
            }
            canvas.drawText(str, size, this.am - (this.z / 3.0f), paint);
        }
    }

    private void b(Canvas canvas, ArrayList<ukg> arrayList) {
        String strD;
        float fWidth;
        float f;
        Path path;
        int i = 1;
        this.n.setAntiAlias(true);
        this.n.setTextSize(ukj.b(1, 12.0f));
        int i2 = 0;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            ukg ukgVar = arrayList.get(i3);
            int i4 = this.x;
            if (1001 == i4) {
                strD = d((int) ukgVar.f50289a);
            } else if (1002 == i4) {
                if (ukgVar.f50289a > 0.0d && ukgVar.f50289a < 0.5d) {
                    strD = "<1" + this.v;
                } else {
                    strD = UnitUtil.e(ukgVar.f50289a, i, i2) + " " + this.v;
                }
            } else if (1003 == i4) {
                strD = UnitUtil.e(ukgVar.f50289a, i, 2) + " " + this.v;
            } else if (1004 == i4) {
                strD = UnitUtil.e(ukgVar.f50289a, i, i) + " " + this.v;
                if (UnitUtil.f() && this.y != null) {
                    strD = String.valueOf(UnitUtil.e(UnitUtil.e(ukgVar.f50289a, i), i, 2)) + " " + this.y.getString(R.string.IDS_ft);
                }
            } else {
                strD = UnitUtil.e(ukgVar.f50289a, i, i2) + " " + this.v;
            }
            String str = strD;
            int i5 = ukgVar.f50291c;
            float f2 = ukgVar.f50290b.x;
            float f3 = ukgVar.f50290b.y;
            float fB = ukj.e().b(this.n);
            float fE = ukj.e().e(this.n, str) + (this.h * 2.0f);
            this.ah = fE;
            this.af = (this.g * 2.0f) + fB;
            float f4 = fE / 2.0f;
            float fB2 = ukj.b(i, 4.0f);
            if (i5 == i) {
                this.ae.left = f2 - f4;
                this.ae.right = f2 + f4;
                this.ae.top = (f3 - this.af) - fB2;
                this.ae.bottom = f3;
                float f5 = 1.5f * fB2;
                this.ae.top -= f5;
                this.ae.bottom -= f5;
                fWidth = (this.ae.width() * 0.5f) + this.ae.left;
                float f6 = this.ae.bottom;
                Path path2 = new Path();
                path2.moveTo(fWidth + fB2, f6);
                path2.lineTo(fWidth, f6 + f5);
                path2.lineTo(fWidth - fB2, f6);
                path2.close();
                f = f6;
                path = path2;
            } else if (i5 != 2) {
                path = null;
                fWidth = 0.0f;
                f = 0.0f;
            } else {
                this.ae.left = f2 - f4;
                this.ae.right = f4 + f2;
                this.ae.top = f3;
                this.ae.bottom = this.af + f3 + fB2;
                float f7 = 1.5f * fB2;
                this.ae.top += f7;
                this.ae.bottom += f7;
                fWidth = this.ae.left + (this.ae.width() * 0.5f);
                float f8 = this.ae.top;
                Path path3 = new Path();
                path3.moveTo(f2, f3);
                path3.lineTo(fWidth + fB2, f8);
                path3.lineTo(fWidth - fB2, f8);
                path3.close();
                path = path3;
                f = f8;
            }
            if (this.ae.right > this.ak) {
                this.ae.left -= this.ae.right - this.ak;
                this.ae.right = this.ak;
            }
            if (this.ae.left < 0.0f) {
                this.ae.right -= this.ae.left;
                this.ae.left = 0.0f;
            }
            this.n.setColor(this.j);
            canvas.drawRoundRect(this.ae, this.an, this.al, this.n);
            if (path != null) {
                canvas.drawPath(path, this.n);
                path.reset();
            }
            this.n.setStrokeWidth(2.0f);
            canvas.drawLine(fWidth - fB2, f, fWidth + fB2, f, this.n);
            float f9 = this.ae.left;
            float f10 = this.h;
            float f11 = this.ae.top;
            float f12 = this.g;
            this.n.setColor(-1);
            canvas.drawText(str, f9 + f10, ((f11 + f12) + fB) - 2.0f, this.n);
            i3++;
            i = 1;
            i2 = 0;
        }
    }

    public void setAnchorBackground(int i) {
        this.j = i;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 || motionEvent.getAction() == 0) {
            d(motionEvent);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f27118c = true;
        }
        return true;
    }

    private void d(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.i.clear();
        for (int i = 0; i < this.ai.size(); i++) {
            ukg ukgVar = this.ai.get(i);
            if (e(x, y, ukgVar.e)) {
                this.i.add(ukgVar);
                if (!this.f27118c) {
                    break;
                }
                String strB = FitnessUtils.b(this.y.getClass().getSimpleName());
                if ("Step".equals(strB) || "Calorie".equals(strB) || "Distance".equals(strB) || "Climb".equals(strB)) {
                    HashMap map = new HashMap();
                    map.put("click", "1");
                    map.put("activityName", strB);
                    map.put("barSize", Integer.valueOf(this.aj));
                    lmf.d().c(this.y, AnalyticsValue.HEALTH_DETAIL_ANCHOR_CLICK_21300009.value(), map, 0);
                }
                this.f27118c = false;
                break;
            }
        }
        invalidate();
    }

    private boolean e(float f, float f2, RectF rectF) {
        return f >= rectF.left && f <= rectF.right && f2 >= rectF.top && f2 <= rectF.bottom;
    }

    private String d(int i) {
        int i2 = i / 60;
        int i3 = i % 60;
        String string = this.y.getString(R.string.IDS_messagecenter_time_hour_value);
        String string2 = this.y.getString(R.string.IDS_band_data_sleep_unit_m);
        String str = "";
        if (i2 > 0) {
            str = "" + UnitUtil.e(i2, 1, 0) + string;
        }
        if (i3 <= 0) {
            return str;
        }
        return str + UnitUtil.e(i3, 1, 0) + string2;
    }
}
