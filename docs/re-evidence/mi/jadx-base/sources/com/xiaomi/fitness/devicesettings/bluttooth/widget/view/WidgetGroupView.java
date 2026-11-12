package com.xiaomi.fitness.devicesettings.bluttooth.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetBean;
import defpackage.cji;
import defpackage.i4j;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class WidgetGroupView extends View {
    public float A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RectF f11989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f11990b;
    public Paint c;
    public int d;
    public List<Rect> e;
    public List<Rect> f;
    public Map<Integer, Boolean> g;
    public Map<Integer, Integer> h;
    public RectF i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11991k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f11992r;
    public List<a> s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public float z;

    public static class a implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11994b;
        public int c;
        public String d = "";
        public Drawable e;
        public int f;
        public int g;

        public a(int i, int i2) {
            this.f11993a = i;
            this.f11994b = i2;
        }

        public void a() {
            this.c = 0;
            this.d = "";
            this.f = 0;
            this.g = 0;
            this.e = null;
        }

        public a b() {
            try {
                return (a) clone();
            } catch (CloneNotSupportedException unused) {
                return new a(this.f11993a, this.f11994b);
            }
        }

        public Drawable c() {
            return this.e;
        }

        public void d(Context context, Bitmap bitmap) {
            Objects.requireNonNull(context);
            this.e = new BitmapDrawable(context.getResources(), bitmap);
        }

        public void e(WidgetBean widgetBean) {
            if (widgetBean == null) {
                a();
                return;
            }
            this.f11994b = widgetBean.getStyle();
            this.c = widgetBean.getFunction();
            this.d = widgetBean.getAppId();
            this.f = widgetBean.getSubType();
            this.g = widgetBean.getSportType();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11993a == aVar.f11993a && this.f11994b == aVar.f11994b && this.c == aVar.c && this.f == aVar.f && this.g == aVar.g && Objects.equals(this.d, aVar.d);
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f11993a), Integer.valueOf(this.f11994b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.f), Integer.valueOf(this.g));
        }

        public String toString() {
            return "ItemInfo{index=" + this.f11993a + ", style=" + this.f11994b + ", function=" + this.c + ", appId='" + this.d + "', subType=" + this.f + ", sportType=" + this.g + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public interface b {
        void onWidgetItemSelected(int i, int i2, int i3);
    }

    public WidgetGroupView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas) {
        float strokeWidth = this.f11990b.getStrokeWidth();
        this.f11990b.setStrokeWidth(this.p);
        for (int i = 0; i < this.f.size(); i++) {
            Boolean bool = this.g.get(Integer.valueOf(i));
            if (bool == null || !bool.booleanValue()) {
                Rect rect = this.f.get(i);
                if (this.x) {
                    this.f11990b.setColor(this.l);
                    int i2 = this.t;
                    if (i2 != 128) {
                        if (i2 != 512) {
                            this.i.set(rect.left, rect.top, rect.right, rect.bottom);
                            RectF rectF = this.i;
                            int i3 = this.f11991k;
                            canvas.drawRoundRect(rectF, i3, i3, this.f11990b);
                        } else {
                            this.i.set(rect.left, rect.top, rect.right, rect.bottom);
                            RectF rectF2 = this.i;
                            int i4 = this.d;
                            canvas.drawRoundRect(rectF2, i4, i4, this.f11990b);
                        }
                    } else if (this.A == 0.5d) {
                        float width = getWidth() / 2;
                        canvas.drawCircle(width, width, (width - (this.j * 2)) - ExtUtilsKt.getDp(3), this.f11990b);
                    } else {
                        this.i.set(rect.left, rect.top, rect.right, rect.bottom);
                        RectF rectF3 = this.i;
                        int i5 = this.f11991k;
                        canvas.drawRoundRect(rectF3, i5, i5, this.f11990b);
                    }
                }
                if (this.u) {
                    float fCenterX = rect.centerX();
                    float fCenterY = rect.centerY();
                    int i6 = this.o;
                    float f = i6 * 0.5f;
                    float f2 = fCenterX - f;
                    this.f11990b.setColor(-16777216);
                    canvas.drawLine(f2, fCenterY, f2 + i6, fCenterY, this.f11990b);
                    float f3 = fCenterY - f;
                    canvas.drawLine(fCenterX, f3, fCenterX, f3 + this.o, this.f11990b);
                }
            }
        }
        this.f11990b.setStrokeWidth(strokeWidth);
    }

    public final void b(Canvas canvas) {
        a aVar;
        for (int i = 0; i < this.f.size(); i++) {
            Boolean bool = this.g.get(Integer.valueOf(i));
            if (bool != null && bool.booleanValue() && (aVar = this.s.get(i)) != null && aVar.c > 0) {
                Drawable drawableC = aVar.c();
                Rect rect = this.f.get(i);
                if (this.t != 128) {
                    if (drawableC != null && rect != null) {
                        drawableC.setBounds(rect);
                        drawableC.draw(canvas);
                    }
                } else if (this.A == 0.5d) {
                    int dp = (this.j * 2) - ExtUtilsKt.getDp(3);
                    Rect rect2 = new Rect(dp, dp, getWidth() - dp, getWidth() - dp);
                    if (drawableC != null) {
                        drawableC.setBounds(rect2);
                        drawableC.draw(canvas);
                    }
                } else if (drawableC != null && rect != null) {
                    drawableC.setBounds(rect);
                    drawableC.draw(canvas);
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        int i = this.q;
        if (i == -1 || !this.v) {
            return;
        }
        Rect rect = this.f.get(i);
        RectF rectF = this.i;
        int i2 = rect.left;
        int i3 = this.n;
        rectF.set(i2 - i3, rect.top - i3, rect.right + i3, rect.bottom + i3);
        float width = getWidth() / 2;
        int i4 = this.t;
        if (i4 != 128) {
            if (i4 == 512) {
                canvas.drawRoundRect(this.i, width, width, this.c);
                return;
            }
            RectF rectF2 = this.i;
            int i5 = this.f11991k;
            canvas.drawRoundRect(rectF2, i5, i5, this.c);
            return;
        }
        if (this.A == 0.5d) {
            canvas.drawCircle(width, width, width - ExtUtilsKt.getDp(3), this.c);
            return;
        }
        RectF rectF3 = this.i;
        int i6 = this.f11991k;
        canvas.drawRoundRect(rectF3, i6, i6, this.c);
    }

    public final boolean d(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int i = -1;
        boolean z = false;
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            if (this.f.get(i2).contains(x, y)) {
                z = true;
                i = i2;
            }
        }
        if (i != this.q && i >= 0) {
            postInvalidate();
            f(i);
        }
        this.q = i;
        return z;
    }

    public final void e() {
        Paint paint = new Paint(1);
        this.f11990b = paint;
        paint.setDither(true);
        this.f11990b.setColor(-16777216);
        this.f11990b.setStrokeJoin(Paint.Join.ROUND);
        this.f11990b.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint(this.f11990b);
        this.c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.c.setColor(this.m);
        this.c.setStrokeWidth(this.n);
        this.f11989a = new RectF();
        this.i = new RectF();
        this.e = new LinkedList();
        this.f = new LinkedList();
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
    }

    public final void f(int i) {
        if (this.f11992r != null) {
            int iIntValue = i >= 0 ? this.h.get(Integer.valueOf(i)).intValue() : -1;
            List<a> list = this.s;
            this.f11992r.onWidgetItemSelected(i, iIntValue, (list == null || list.size() <= i) ? 0 : this.s.get(i).c);
        }
    }

    public void g(int i, int i2, int i3) {
        float f = i;
        this.z = (f * 1.0f) / i2;
        this.A = (i3 * 1.0f) / f;
    }

    public final void h(boolean z) {
        if (z || this.e.isEmpty()) {
            this.e.clear();
            int iWidth = (int) this.f11989a.width();
            int iHeight = (int) this.f11989a.height();
            int i = this.t;
            if (i <= 128) {
                j(iWidth, iHeight);
            } else if (i <= 512) {
                l(iWidth, iHeight);
            } else {
                k(iWidth, iHeight);
            }
            i();
        }
    }

    public final void i() {
        this.f.clear();
        this.h.clear();
        int i = this.t;
        List<Rect> list = this.e;
        List<Rect> list2 = this.f;
        if (i == 1) {
            list2.addAll(list);
            this.h.put(0, 1);
            this.h.put(1, 1);
            this.h.put(2, 1);
            this.h.put(3, 1);
        }
        if (i == 2) {
            Rect rect = list.get(0);
            Rect rect2 = list.get(1);
            list2.add(new Rect(rect.left, rect.top, rect2.right, rect2.bottom));
            list2.add(list.get(2));
            list2.add(list.get(3));
            this.h.put(0, 2);
            this.h.put(1, 1);
            this.h.put(2, 1);
            return;
        }
        switch (i) {
            case 4:
                list2.add(list.get(0));
                list2.add(list.get(1));
                Rect rect3 = list.get(2);
                Rect rect4 = list.get(3);
                list2.add(new Rect(rect3.left, rect3.top, rect4.right, rect4.bottom));
                this.h.put(0, 1);
                this.h.put(1, 1);
                this.h.put(2, 2);
                break;
            case 8:
                Rect rect5 = list.get(0);
                Rect rect6 = list.get(2);
                list2.add(new Rect(rect5.left, rect5.top, rect6.right, rect6.bottom));
                list2.add(list.get(1));
                list2.add(list.get(3));
                this.h.put(0, 3);
                this.h.put(1, 1);
                this.h.put(2, 1);
                break;
            case 16:
                list2.add(list.get(0));
                Rect rect7 = list.get(1);
                Rect rect8 = list.get(3);
                list2.add(new Rect(rect7.left, rect7.top, rect8.right, rect8.bottom));
                list2.add(list.get(2));
                this.h.put(0, 1);
                this.h.put(1, 3);
                this.h.put(2, 1);
                break;
            case 32:
                Rect rect9 = list.get(0);
                Rect rect10 = list.get(1);
                list2.add(new Rect(rect9.left, rect9.top, rect10.right, rect10.bottom));
                Rect rect11 = list.get(2);
                Rect rect12 = list.get(3);
                list2.add(new Rect(rect11.left, rect11.top, rect12.right, rect12.bottom));
                this.h.put(0, 2);
                this.h.put(1, 2);
                break;
            case 64:
                Rect rect13 = list.get(0);
                Rect rect14 = list.get(2);
                list2.add(new Rect(rect13.left, rect13.top, rect14.right, rect14.bottom));
                Rect rect15 = list.get(1);
                Rect rect16 = list.get(3);
                list2.add(new Rect(rect15.left, rect15.top, rect16.right, rect16.bottom));
                this.h.put(0, 3);
                this.h.put(1, 3);
                break;
            case 128:
                if (this.A != 0.5d) {
                    Rect rect17 = list.get(0);
                    Rect rect18 = list.get(3);
                    list2.add(new Rect(rect17.left, rect17.top, rect18.right, rect18.bottom));
                    this.h.put(0, 4);
                } else {
                    int dp = (this.j * 2) - ExtUtilsKt.getDp(3);
                    list2.add(new Rect(dp, dp, getWidth() - dp, getWidth() - dp));
                    this.h.put(0, 4);
                }
                break;
            case 256:
                list2.add(list.get(0));
                this.f.add(this.e.get(1));
                this.h.put(0, 1);
                this.h.put(1, 1);
                break;
            case 512:
                list2.add(list.get(0));
                this.h.put(0, 3);
                break;
            case 1024:
                Rect rect19 = list.get(0);
                Rect rect20 = this.e.get(1);
                Rect rect21 = this.e.get(2);
                Rect rect22 = this.e.get(5);
                this.f.add(rect19);
                this.f.add(rect20);
                this.f.add(new Rect(rect21.left, rect21.top, rect22.right, rect22.bottom));
                this.h.put(0, 1);
                this.h.put(1, 1);
                this.h.put(2, 4);
                break;
            case 2048:
                Rect rect23 = list.get(0);
                Rect rect24 = this.e.get(3);
                Rect rect25 = this.e.get(4);
                Rect rect26 = this.e.get(5);
                this.f.add(new Rect(rect23.left, rect23.top, rect24.right, rect24.bottom));
                this.f.add(rect25);
                this.f.add(rect26);
                this.h.put(0, 4);
                this.h.put(1, 1);
                this.h.put(2, 1);
                break;
            case 4096:
                Rect rect27 = list.get(0);
                Rect rect28 = this.e.get(1);
                Rect rect29 = this.e.get(2);
                Rect rect30 = this.e.get(5);
                this.f.add(new Rect(rect27.left, rect27.top, rect28.right, rect28.bottom));
                this.f.add(new Rect(rect29.left, rect29.top, rect30.right, rect30.bottom));
                this.h.put(0, 2);
                this.h.put(1, 4);
                break;
            case 8192:
                Rect rect31 = list.get(0);
                Rect rect32 = this.e.get(3);
                Rect rect33 = this.e.get(4);
                Rect rect34 = this.e.get(5);
                this.f.add(new Rect(rect31.left, rect31.top, rect32.right, rect32.bottom));
                this.f.add(new Rect(rect33.left, rect33.top, rect34.right, rect34.bottom));
                this.h.put(0, 4);
                this.h.put(1, 2);
                break;
            case 16384:
                Rect rect35 = list.get(0);
                Rect rect36 = this.e.get(5);
                this.f.add(new Rect(rect35.left, rect35.top, rect36.right, rect36.bottom));
                this.h.put(0, 5);
                break;
        }
    }

    public final void j(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.A == 0.5d) {
            double d = i;
            double dSqrt = d / Math.sqrt(2.0d);
            i5 = (int) ((d - dSqrt) / 2.0d);
            i4 = (int) ((dSqrt - ((double) (this.j * 2))) / 2.0d);
            i3 = i5;
        } else {
            int i6 = this.j;
            int i7 = i6 * 2;
            i3 = ((i2 - i) / 2) + (i6 * 2);
            i4 = (i - (i6 * 6)) / 2;
            i5 = i7;
        }
        int i8 = i5 + i4;
        int i9 = i3 + i4;
        this.e.add(new Rect(i5, i3, i8, i9));
        int i10 = (this.j * 2) + i8;
        this.e.add(new Rect(i10, i3, i10 + i4, i9));
        int i11 = i9 + (this.j * 2);
        int i12 = i11 + i4;
        this.e.add(new Rect(i5, i11, i8, i12));
        int i13 = i8 + (this.j * 2);
        this.e.add(new Rect(i13, i11, i4 + i13, i12));
    }

    public final void k(int i, int i2) {
        int i3 = this.n;
        int iMin = Math.min((i - (i3 * 6)) / 2, (i2 - (i3 * 8)) / 3);
        int i4 = this.n;
        int i5 = ((i - (iMin * 2)) - (i4 * 2)) / 2;
        int i6 = ((i2 - (iMin * 3)) - (i4 * 4)) / 2;
        int i7 = i5 + iMin;
        int i8 = i6 + iMin;
        this.e.add(new Rect(i5, i6, i7, i8));
        int i9 = (this.n * 2) + i7;
        this.e.add(new Rect(i9, i6, i9 + iMin, i8));
        int i10 = i8 + (this.n * 2);
        int i11 = i10 + iMin;
        this.e.add(new Rect(i5, i10, i7, i11));
        int i12 = (this.n * 2) + i7;
        this.e.add(new Rect(i12, i10, i12 + iMin, i11));
        int i13 = i11 + (this.n * 2);
        int i14 = i13 + iMin;
        this.e.add(new Rect(i5, i13, i7, i14));
        int i15 = i7 + (this.n * 2);
        this.e.add(new Rect(i15, i13, iMin + i15, i14));
    }

    public final void l(int i, int i2) {
        int i3 = this.t;
        if (i3 == 512) {
            List<Rect> list = this.e;
            int i4 = this.j;
            list.add(new Rect(i4, i4, i - i4, i2 - i4));
        } else if (i3 == 256) {
            int i5 = this.j;
            int i6 = i - (i5 * 2);
            int i7 = ((i2 - (i6 * 2)) - (i5 * 4)) / 2;
            int i8 = i5 + i6;
            Rect rect = new Rect(i5, i7, i8, i7 + i6);
            this.e.add(rect);
            int i9 = rect.bottom + (this.j * 2);
            this.e.add(new Rect(i5, i9, i8, i6 + i9));
        }
    }

    public void m(List<a> list) {
        setItemList(list);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f11989a.set(getPaddingStart(), getPaddingTop(), getWidth() - getPaddingEnd(), getHeight() - getPaddingBottom());
        this.d = (int) (this.f11989a.width() * this.A);
        this.f11990b.setColor(getResources().getColor(cji.v));
        RectF rectF = this.f11989a;
        int i = this.d;
        canvas.drawRoundRect(rectF, i, i, this.f11990b);
        h(this.y);
        a(canvas);
        b(canvas);
        c(canvas);
        if (this.w) {
            return;
        }
        this.w = true;
        f(0);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = (int) (size * this.z);
        if (this.t == 512) {
            i3 += this.j * 2;
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f11989a.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.v && motionEvent.getActionMasked() == 0) {
            return d(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setItemList(List<a> list) {
        this.s = list;
        this.g.clear();
        if (list != null && !list.isEmpty()) {
            for (a aVar : list) {
                this.g.put(Integer.valueOf(aVar.f11993a), Boolean.valueOf(aVar.c > 0));
            }
        }
        postInvalidate();
    }

    public void setOnItemSelectedListener(b bVar) {
        this.f11992r = bVar;
    }

    public void setWidgetGroupStyle(int i) {
        this.t = i;
        this.y = true;
        postInvalidate();
    }

    public WidgetGroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WidgetGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = ExtUtilsKt.getDp(3);
        this.f11991k = 40;
        this.l = Color.parseColor("#33FFFFFF");
        this.m = Color.parseColor("#FF612E");
        this.n = 6;
        this.o = 60;
        this.p = 12;
        this.q = 0;
        this.y = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i4j.B5);
        this.u = typedArrayObtainStyledAttributes.getBoolean(i4j.E5, true);
        this.t = 1 << (typedArrayObtainStyledAttributes.getInt(i4j.G5, 1) - 1);
        this.v = typedArrayObtainStyledAttributes.getBoolean(i4j.D5, true);
        this.f11991k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i4j.C5, this.f11991k);
        this.x = typedArrayObtainStyledAttributes.getBoolean(i4j.F5, true);
        typedArrayObtainStyledAttributes.recycle();
        setLayerType(2, null);
        e();
    }
}
