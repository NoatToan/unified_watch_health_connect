package com.huawei.uikit.hwbubblelayout.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.huawei.uikit.hwbubblelayout.R;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;
import defpackage.xet;
import defpackage.xfs;

/* JADX INFO: loaded from: classes20.dex */
public class HwBubbleLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29295a;
    private ArrowDirection aa;
    private Path ab;
    private boolean ac;
    private Paint ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private boolean ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private boolean ao;
    private int ap;
    private boolean aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private boolean av;
    private HwColumnSystem aw;
    private boolean ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29297c;
    private boolean d;
    private float e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private Context u;
    private xet v;
    private int w;
    private Paint x;
    private int y;
    private int z;

    public enum ArrowDirection {
        TOP(2),
        BOTTOM(4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29299a;

        ArrowDirection(int i) {
            this.f29299a = i;
        }

        public static ArrowDirection getDirection(int i) {
            return i != 2 ? BOTTOM : TOP;
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (outline != null) {
                outline.setRoundRect(HwBubbleLayout.this.al, HwBubbleLayout.this.aj, HwBubbleLayout.this.ak, HwBubbleLayout.this.an, HwBubbleLayout.this.ap);
            }
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ArrowDirection.values().length];
            d = iArr;
            try {
                iArr[ArrowDirection.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[ArrowDirection.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public HwBubbleLayout(Context context) {
        this(context, null);
    }

    private void getAxisOffset() {
        this.f29295a = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_x2);
        this.g = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_y2);
        this.f = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_x3);
        this.j = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_y3);
        this.i = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_x4);
        this.h = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_y4);
        this.o = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_x5);
        this.n = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_y5);
        this.k = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_x6);
        this.m = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_y6);
        this.l = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_x7);
        this.t = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_y7);
        this.r = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_x8);
        this.s = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_y8);
        this.q = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_x9);
        this.p = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_bezier_offset_y9);
    }

    public ArrowDirection getArrowDirection() {
        return this.aa;
    }

    public int getArrowPosition() {
        return this.z;
    }

    public int getBubbleColor() {
        return this.ar;
    }

    public int getBubbleRadius() {
        return this.ap;
    }

    public int getBubbleWidth() {
        return ((this.ag - this.ae) - (this.ap * 2)) + (this.y * 2);
    }

    public int getShadowSize() {
        if (this.v == null) {
            return -1;
        }
        return this.f29296b;
    }

    public int getShadowStyle() {
        if (this.v == null) {
            return -1;
        }
        return this.f29297c;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.av) {
            this.aw.d(4);
            this.aw.d(this.u, this.au, this.at, this.e);
        } else {
            this.aw.d(4);
            this.aw.b(this.u);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.onDraw(canvas);
        canvas.drawPath(this.ab, this.x);
        if (this.ao) {
            canvas.drawPath(this.ab, this.ad);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.aq) {
            b(getContext());
            int size = View.MeasureSpec.getSize(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(b(size), View.MeasureSpec.getMode(i)), i2);
        } else {
            super.onMeasure(i, i2);
        }
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        int iE = e(this.u);
        if (iE > measuredWidth) {
            setMeasuredDimension(iE, measuredHeight);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        try {
            if (bundle.containsKey("arrow_position")) {
                this.z = bundle.getInt("arrow_position", 0);
            }
            Parcelable parcelable2 = bundle.getParcelable("instanceState");
            if (parcelable2 != null) {
                super.onRestoreInstanceState(parcelable2);
            }
        } catch (BadParcelableException unused) {
            Log.e("HwBubbleLayout", "Parcelable, onRestoreInstanceState error.");
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        try {
            bundle.putParcelable("instanceState", super.onSaveInstanceState());
            bundle.putInt("arrow_position", this.z);
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("HwBubbleLayout", "Parcelable, HwBubbleLayout onSaveInstanceState error");
            return bundle;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.ag = i;
        this.am = i2;
        a();
    }

    public void setArrowDirection(ArrowDirection arrowDirection) {
        this.aa = arrowDirection;
        c();
        a();
    }

    public void setArrowPosition(int i) {
        this.z = i;
        a();
        invalidate();
    }

    public void setArrowPositionCenter(boolean z) {
        this.ac = z;
        a();
    }

    public void setArrowStartLocation(int i) {
        if (this.ah == i) {
            return;
        }
        this.ah = i;
        a();
        invalidate();
    }

    public void setBubbleColor(int i) {
        this.ar = i;
        a();
    }

    public void setInsideShadowClip(boolean z) {
        xet xetVar = this.v;
        if (xetVar != null) {
            xetVar.d(z);
        }
    }

    public void setShadowEnabled(boolean z) {
        this.d = z;
        if (this.v == null) {
            this.v = new xet(this.u, this, this.f29296b, this.f29297c);
        }
        this.v.c(this.d);
    }

    public void setShadowSize(int i) {
        if (this.f29296b == i) {
            return;
        }
        this.f29296b = i;
        xet xetVar = this.v;
        if (xetVar != null) {
            xetVar.e(i);
            if (this.d) {
                this.v.c();
            }
        }
    }

    public void setShadowStyle(int i) {
        if (this.f29297c == i) {
            return;
        }
        this.f29297c = i;
        xet xetVar = this.v;
        if (xetVar != null) {
            xetVar.c(i);
            if (this.d) {
                this.v.c();
            }
        }
    }

    public HwBubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwBubbleLayoutStyle);
    }

    private void b(Context context) {
        if (this.av) {
            a(context);
        } else {
            d(context);
        }
    }

    private void c() {
        if (d.d[this.aa.ordinal()] != 1) {
            setPadding(0, this.af, 0, 0);
        } else {
            setPadding(0, 0, 0, this.af);
        }
    }

    private static Context d(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwBubbleLayout);
    }

    private void d(Context context) {
        this.aw.d(4);
        this.aw.b(context);
    }

    public HwBubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(d(context, i), attributeSet, i);
        this.ah = 1;
        this.ai = false;
        this.ao = false;
        this.aq = false;
        this.av = false;
        Context context2 = getContext();
        this.u = context2;
        HwColumnSystem hwColumnSystem = new HwColumnSystem(context2);
        this.aw = hwColumnSystem;
        hwColumnSystem.d(4);
        this.av = false;
        this.aw.b(this.u);
        setWillNotDraw(false);
        c(this.u.obtainStyledAttributes(attributeSet, R.styleable.HwBubbleLayout, i, R.style.Widget_Emui_HwBubbleLayout));
        Paint paint = new Paint(5);
        this.x = paint;
        paint.setStyle(Paint.Style.FILL);
        this.ab = new Path();
        c();
        if (this.ax) {
            setMinimumWidth(this.aw.i());
        }
    }

    private void c(TypedArray typedArray) {
        this.aa = ArrowDirection.getDirection(typedArray.getInt(R.styleable.HwBubbleLayout_hwArrowDirection, ArrowDirection.BOTTOM.f29299a));
        this.z = typedArray.getDimensionPixelSize(R.styleable.HwBubbleLayout_hwArrowPosition, -1);
        this.ac = typedArray.getBoolean(R.styleable.HwBubbleLayout_hwArrowPositionCenter, false);
        if (this.z < 0) {
            this.ac = true;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.emui_corner_radius_large);
        this.as = dimensionPixelSize;
        this.ap = typedArray.getDimensionPixelSize(R.styleable.HwBubbleLayout_hwBubbleRadius, dimensionPixelSize);
        this.ah = typedArray.getInt(R.styleable.HwBubbleLayout_hwArrowStartLocation, 1);
        this.ar = typedArray.getColor(R.styleable.HwBubbleLayout_hwBubbleColor, getResources().getColor(R.color.emui_color_tooltips_bg));
        this.aq = typedArray.getBoolean(R.styleable.HwBubbleLayout_hwColumnEnabled, false);
        this.d = typedArray.getBoolean(R.styleable.HwBubbleLayout_hwShadowEnabled, false);
        this.ax = typedArray.getBoolean(R.styleable.HwBubbleLayout_hwBubbleIsSpaciousStyle, false);
        this.f29297c = typedArray.getInt(R.styleable.HwBubbleLayout_hwWidgetStyle, 0);
        this.f29296b = typedArray.getInt(R.styleable.HwBubbleLayout_hwShadowSize, 2);
        typedArray.recycle();
        xet xetVar = new xet(this.u, this, this.f29296b, this.f29297c);
        this.v = xetVar;
        xetVar.c(this.d);
        double dSqrt = Math.sqrt(2.0d);
        int i = this.ap;
        int i2 = (int) ((2.0d - dSqrt) * 2.0d * ((double) i));
        this.w = i2;
        this.y -= i2 - i;
        this.ae = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_default_arrow_width);
        this.af = getResources().getDimensionPixelSize(R.dimen.hwbubblelayout_default_arrow_height);
        getAxisOffset();
        boolean z = this.u.getResources().getBoolean(R.bool.emui_stroke_enable);
        this.ao = z;
        if (z) {
            int dimensionPixelSize2 = this.u.getResources().getDimensionPixelSize(R.dimen.emui_popup_type_stroke_width);
            if (dimensionPixelSize2 > 0) {
                Paint paint = new Paint(5);
                this.ad = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.ad.setColor(getContext().getResources().getColor(R.color.emui_stroke_color));
                this.ad.setStrokeWidth(dimensionPixelSize2);
                return;
            }
            this.ao = false;
        }
    }

    private boolean e() {
        return getLayoutDirection() == 1;
    }

    private void a() {
        Path pathA;
        if (this.v == null) {
            xet xetVar = new xet(this.u, this, this.f29296b, this.f29297c);
            this.v = xetVar;
            xetVar.c(this.d);
        }
        this.al = 0;
        ArrowDirection arrowDirection = this.aa;
        this.aj = arrowDirection == ArrowDirection.TOP ? this.af : 0;
        this.ak = this.ag;
        this.an = this.am - (arrowDirection == ArrowDirection.BOTTOM ? this.af : 0);
        this.x.setColor(this.ar);
        this.ab.reset();
        if (this.ai) {
            int i = this.ak;
            int i2 = this.al;
            int i3 = this.ap;
            int i4 = ((i - i2) - i3) - i3;
            if (this.ae > i4) {
                this.ae = i4;
                this.ac = true;
            }
        }
        int i5 = d.d[this.aa.ordinal()];
        if (i5 == 1) {
            pathA = a(d());
        } else if (i5 != 2) {
            pathA = new Path();
        } else {
            pathA = e(d());
        }
        RectF rectF = new RectF(this.al, this.aj, this.ak, this.an);
        Path path = this.ab;
        float f = this.ap;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.ab.op(pathA, Path.Op.UNION);
        this.ab.close();
        pathA.close();
        setOutlineProvider(new b());
        setClipToOutline(false);
    }

    private void a(Context context) {
        this.aw.d(4);
        this.aw.d(context, this.au, this.at, this.e);
    }

    private int b(int i) {
        if (this.ax) {
            return Math.min(this.aw.e(), i);
        }
        return Math.min(this.aw.g(), i);
    }

    private Path e(int i) {
        Path path = new Path();
        if (e()) {
            int i2 = (this.ak - i) + this.al;
            path.moveTo(i2, this.aj);
            float f = i2 - this.k;
            int i3 = this.aj;
            path.quadTo(f, i3, i2 - this.f29295a, i3 - this.g);
            float f2 = i2 - this.l;
            int i4 = this.aj;
            path.quadTo(f2, i4 - this.t, i2 - this.f, i4 - this.j);
            float f3 = i2 - this.r;
            int i5 = this.aj;
            path.quadTo(f3, i5 - this.s, i2 - this.i, i5 - this.h);
            float f4 = i2 - this.q;
            float f5 = this.aj;
            path.quadTo(f4, f5, i2 - this.o, f5);
            return path;
        }
        path.moveTo(i, this.aj);
        float f6 = this.k + i;
        int i6 = this.aj;
        path.quadTo(f6, i6, this.f29295a + i, i6 - this.g);
        float f7 = this.l + i;
        int i7 = this.aj;
        path.quadTo(f7, i7 - this.t, this.f + i, i7 - this.j);
        float f8 = this.r + i;
        int i8 = this.aj;
        path.quadTo(f8, i8 - this.s, this.i + i, i8 - this.h);
        float f9 = this.q + i;
        float f10 = this.aj;
        path.quadTo(f9, f10, i + this.o, f10);
        return path;
    }

    private int d() {
        int i = this.z;
        int i2 = this.al;
        int i3 = this.ap;
        int i4 = this.y;
        int i5 = ((i + i2) + i3) - i4;
        if (this.ac) {
            return (((this.ak - i2) / 2) - (this.ae / 2)) + i2;
        }
        if (this.ah == 1) {
            int i6 = this.ae;
            int i7 = this.ak;
            return i5 + i6 > (i7 - i3) + i4 ? ((i7 - i6) - i3) + i4 : i5;
        }
        int i8 = (((this.ak - i3) - this.ae) - i) + i4;
        int i9 = (i2 + i3) - i4;
        return i8 < i9 ? i9 : i8;
    }

    private Path a(int i) {
        Path path = new Path();
        if (e()) {
            int i2 = (this.ak - i) + this.al;
            path.moveTo(i2, this.an);
            float f = i2 - this.k;
            int i3 = this.an;
            path.quadTo(f, i3, i2 - this.f29295a, i3 + this.g);
            float f2 = i2 - this.l;
            int i4 = this.an;
            path.quadTo(f2, this.t + i4, i2 - this.f, i4 + this.j);
            float f3 = i2 - this.r;
            int i5 = this.an;
            path.quadTo(f3, this.s + i5, i2 - this.i, i5 + this.h);
            float f4 = i2 - this.q;
            float f5 = this.an;
            path.quadTo(f4, f5, i2 - this.o, f5);
            return path;
        }
        path.moveTo(i, this.an);
        float f6 = this.k + i;
        int i6 = this.an;
        path.quadTo(f6, i6, this.f29295a + i, i6 + this.g);
        float f7 = this.l + i;
        int i7 = this.an;
        path.quadTo(f7, this.t + i7, this.f + i, i7 + this.j);
        float f8 = this.r + i;
        int i8 = this.an;
        path.quadTo(f8, this.s + i8, this.i + i, i8 + this.h);
        float f9 = this.q + i;
        float f10 = this.an;
        path.quadTo(f9, f10, i + this.o, f10);
        return path;
    }

    private int e(Context context) {
        if (context == null) {
            return 0;
        }
        int iG = ((this.aw.g() - (this.ap * 2)) - this.ae) + (this.y * 2);
        if (!this.aq || iG < 0) {
            int i = context.getResources().getDisplayMetrics().widthPixels;
            int i2 = this.ap;
            iG = (this.y * 2) + ((i - (i2 * 2)) - this.ae);
        }
        if (this.z > iG) {
            this.z = iG;
        }
        return (((this.ap * 2) + this.ae) + this.z) - (this.y * 2);
    }
}
