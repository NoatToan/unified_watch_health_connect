package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import com.xiaomi.fitness.interfaces.IDraw;
import com.xiaomi.fitness.interfaces.ISetter;
import com.xiaomi.fitness.trail.widget.MonthPanelStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class up5 implements IDraw, ISetter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w7g f35989b;
    public Rect c;
    public MonthPanelStyle d;
    public int e;
    public int f;
    public float g;
    public float h;
    public Paint i;
    public Paint j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Paint f35990k;
    public Paint l;
    public int m;
    public Paint.FontMetrics n;
    public float o;
    public float p;
    public b8h q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Calendar f35991r;
    public Rect s;
    public final boolean t;

    public up5(Context context) {
        Typeface typefaceCreate = Typeface.create("mitype-semibold", 0);
        this.f35988a = context;
        this.f35991r = Calendar.getInstance();
        Paint paint = new Paint();
        this.l = paint;
        paint.setAntiAlias(true);
        this.l.setDither(true);
        this.l.setStrokeCap(Paint.Cap.ROUND);
        this.l.setTextAlign(Paint.Align.CENTER);
        this.l.setTypeface(typefaceCreate);
        Paint paint2 = new Paint(this.l);
        this.i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(this.l);
        this.j = paint3;
        Paint.Style style = Paint.Style.FILL;
        paint3.setStyle(style);
        Paint paint4 = new Paint(this.l);
        this.f35990k = paint4;
        paint4.setStyle(style);
        this.s = new Rect();
        this.t = Locale.getDefault() == Locale.CHINESE || Locale.getDefault() == Locale.SIMPLIFIED_CHINESE || Locale.getDefault() == Locale.TRADITIONAL_CHINESE;
    }

    public final void a() {
        int iWidth = this.c.width();
        float f = (this.g * 7.0f) + (this.o * 2.0f);
        float f2 = iWidth;
        if (f2 > f) {
            this.p = (f2 - f) / 6.0f;
        } else {
            this.p = 0.0f;
            this.o = 0.0f;
        }
    }

    public final void b(Canvas canvas, float f, float f2, tp5 tp5Var) {
        List<Integer> listE = tp5Var.e();
        if (listE == null || listE.isEmpty()) {
            return;
        }
        float decroRadius = this.d.getDecroRadius();
        float decroMarginToCenter = f2 + this.d.getDecroMarginToCenter();
        int size = listE.size();
        for (int i = 0; i < size; i++) {
            this.j.setColor(this.d.getDecorateColor(listE.get(i).intValue()));
            canvas.drawCircle(f - ((((i * 2) + 1) - size) * (2.0f + decroRadius)), decroMarginToCenter, decroRadius, this.j);
        }
    }

    public final void c(Canvas canvas, int i, int i2, tp5 tp5Var) {
        int i3;
        Paint paint;
        float f = f(i2);
        float fG = g(i);
        tp5Var.q(f);
        tp5Var.r(fG);
        if (tp5Var.d() != 2) {
            return;
        }
        boolean zK = tp5Var.k();
        String string = this.f35988a.getString(j1j.ma);
        if (!this.t) {
            Calendar calendar = this.f35991r;
            calendar.setTimeInMillis(System.currentTimeMillis());
            string = String.valueOf(calendar.get(5));
        }
        String strValueOf = String.valueOf(tp5Var.b());
        if (!zK) {
            string = strValueOf;
        }
        int iC = tp5Var.c();
        Paint paint2 = this.l;
        Paint paint3 = this.f35990k;
        Paint paint4 = this.i;
        int monthDateNumPropertyColor = this.d.getMonthDateNumPropertyColor(iC, 0);
        int monthDateNumPropertyColor2 = this.d.getMonthDateNumPropertyColor(iC, 4);
        int monthDateNumPropertyColor3 = this.d.getMonthDateNumPropertyColor(iC, 1);
        int monthDateNumPropertyColor4 = this.d.getMonthDateNumPropertyColor(iC, 2);
        int monthDateNumPropertyColor5 = this.d.getMonthDateNumPropertyColor(iC, 3);
        if (monthDateNumPropertyColor != Integer.MIN_VALUE) {
            paint2.setColor(monthDateNumPropertyColor);
        } else {
            paint2.setColor(this.d.getDateNumCommonColor());
        }
        if (monthDateNumPropertyColor3 == Integer.MIN_VALUE || monthDateNumPropertyColor4 == Integer.MIN_VALUE) {
            i3 = Integer.MIN_VALUE;
            if (monthDateNumPropertyColor3 != Integer.MIN_VALUE) {
                paint = null;
                paint3.setShader(null);
                paint3.setColor(monthDateNumPropertyColor3);
            } else {
                paint = null;
                paint3 = null;
            }
        } else {
            float dateNumWidth = this.d.getDateNumWidth() * 0.5f;
            float dateNumHeight = this.d.getDateNumHeight() * 0.5f;
            float f2 = f - dateNumWidth;
            paint3.setShader(new LinearGradient(f2, fG - dateNumHeight, f2, fG + dateNumHeight, monthDateNumPropertyColor3, monthDateNumPropertyColor4, Shader.TileMode.CLAMP));
            paint3.setColor(monthDateNumPropertyColor3);
            i3 = Integer.MIN_VALUE;
            paint = null;
        }
        if (monthDateNumPropertyColor5 != i3) {
            paint4.setColor(monthDateNumPropertyColor5);
        } else {
            paint4 = paint;
        }
        if (paint3 != null) {
            canvas.drawCircle(f, fG, this.d.getBgCircleRadius(), paint3);
        }
        if (tp5Var.j()) {
            if (paint4 == null) {
                paint4 = this.i;
                paint4.setColor(this.d.getSelectedCircleColor());
                paint2.setColor(this.d.getSelectedDateNumColor());
            }
            if (monthDateNumPropertyColor2 != Integer.MIN_VALUE) {
                paint2.setColor(monthDateNumPropertyColor2);
            }
            canvas.drawCircle(f, fG, this.d.getSelectedCircleRadius(), paint4);
        }
        if (paint2 != null) {
            if (zK && this.d.getTodayColor() != Integer.MIN_VALUE) {
                paint2.setColor(this.d.getTodayColor());
            }
            paint2.getTextBounds(string, 0, string.length(), this.s);
            float fHeight = (this.s.height() * 0.49f) + fG;
            if (zK && this.t) {
                fHeight = ((this.s.height() * 0.5f) + fG) - (this.n.descent * 0.5f);
            }
            canvas.drawText(string, f, fHeight, paint2);
        }
        b(canvas, f, fG, tp5Var);
    }

    public final float d(float f, float f2, float f3, float f4) {
        return (float) Math.sqrt(Math.pow(f - f3, 2.0d) + Math.pow(f2 - f4, 2.0d));
    }

    public int e(float f, float f2) {
        if (!this.c.contains((int) f, (int) f2)) {
            return -1;
        }
        float f3 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.e; i3++) {
            for (int i4 = 0; i4 < this.f; i4++) {
                tp5 tp5VarD = this.f35989b.d(i3, i4);
                if (tp5VarD != null && tp5VarD.d() == 2) {
                    float fD = d(f, f2, tp5VarD.f(), tp5VarD.g());
                    if (fD < this.d.getDateNumWidth() / 2.0f && f3 > fD) {
                        i = i3;
                        i2 = i4;
                        f3 = fD;
                    }
                }
            }
        }
        return (this.f35989b.b() * i) + i2;
    }

    public final float f(int i) {
        return this.o + ((((i * 2) + 1) * this.g) / 2.0f) + (i * this.p);
    }

    public final float g(int i) {
        return (((i * 2) + 1) * this.h) / 2.0f;
    }

    public Date h(float f, float f2) {
        Rect rect = this.c;
        Date dateA = null;
        if (rect == null) {
            return null;
        }
        int i = (int) f;
        int i2 = (int) f2;
        if (!rect.contains(i, i2)) {
            return null;
        }
        float f3 = Float.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        tp5 tp5Var = null;
        for (int i5 = 0; i5 < this.e; i5++) {
            for (int i6 = 0; i6 < this.f; i6++) {
                tp5 tp5VarD = this.f35989b.d(i5, i6);
                if (tp5VarD != null && tp5VarD.d() == 2) {
                    float fD = d(i, i2, tp5VarD.f(), tp5VarD.g());
                    if (fD < this.d.getDateNumWidth() / 2.0f && f3 > fD) {
                        i3 = i5;
                        i4 = i6;
                        tp5Var = tp5VarD;
                        f3 = fD;
                    }
                }
            }
        }
        if (tp5Var != null) {
            if (!tp5Var.h() && !tp5Var.i()) {
                return null;
            }
            this.f35989b.q(i3, i4);
            dateA = tp5Var.a();
        }
        b8h b8hVar = this.q;
        if (b8hVar != null) {
            b8hVar.q(dateA);
            if (tp5Var != null) {
                this.q.c(dateA, tp5Var.c());
            }
        }
        return dateA;
    }

    public void i(w7g w7gVar) {
        this.f35989b = w7gVar;
    }

    @Override // com.xiaomi.fitness.interfaces.IDraw
    public void inDraw(Canvas canvas) {
        for (int i = 0; i < this.e; i++) {
            for (int i2 = 0; i2 < this.f; i2++) {
                tp5 tp5VarD = this.f35989b.d(i, i2);
                if (tp5VarD != null) {
                    c(canvas, i, i2, tp5VarD);
                }
            }
        }
    }

    @Override // com.xiaomi.fitness.interfaces.IDraw
    public void postDraw(Canvas canvas) {
    }

    @Override // com.xiaomi.fitness.interfaces.IDraw
    public void preDraw(Canvas canvas) {
        int iWidth = this.c.width();
        this.e = this.f35989b.h();
        this.f = this.f35989b.b();
        this.h = this.d.getDateNumHeight();
        float f = iWidth;
        this.g = 0.13f * f;
        this.o = f * 0.019f;
        a();
        this.l.setTextSize(this.d.getDateNumTextSize());
        this.n = this.l.getFontMetrics();
        this.i.setColor(this.d.getSelectedCircleColor());
        this.i.setStrokeWidth(this.d.getSelectedCircleWidth());
        int selectBackground = this.d.getSelectBackground();
        this.m = selectBackground;
        this.f35990k.setColor(selectBackground);
    }

    @Override // com.xiaomi.fitness.interfaces.ISetter
    public void setMainArea(Rect rect) {
        this.c = rect;
    }

    @Override // com.xiaomi.fitness.interfaces.ISetter
    public void setMonthPanelStyle(MonthPanelStyle monthPanelStyle) {
        this.d = monthPanelStyle;
    }

    public void setOnDateSelectedListener(b8h b8hVar) {
        this.q = b8hVar;
    }
}
