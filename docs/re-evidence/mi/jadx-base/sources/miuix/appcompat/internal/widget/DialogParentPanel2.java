package miuix.appcompat.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.dmi;
import defpackage.e3n;
import defpackage.g5j;
import defpackage.hm1;
import defpackage.rvc;
import defpackage.tc8;
import defpackage.vjh;
import defpackage.zhi;
import defpackage.zlr;
import miuix.appcompat.app.d;

/* JADX INFO: loaded from: classes3.dex */
public class DialogParentPanel2 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FloatingABOLayoutSpec f26556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f26557b;
    public final Path c;
    public float d;
    public int e;

    public static class FloatingABOLayoutSpec {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f26558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Point f26559b = new Point();
        public int c;
        public boolean d;
        public int e;
        public rvc f;
        public TypedValue g;
        public TypedValue h;
        public TypedValue i;
        public TypedValue j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public TypedValue f26560k;
        public TypedValue l;
        public TypedValue m;
        public TypedValue n;
        public TypedValue o;
        public boolean p;
        public boolean q;

        public FloatingABOLayoutSpec(Context context, AttributeSet attributeSet) {
            this.f26558a = context;
            k(context, attributeSet);
            this.c = g();
            this.d = tc8.n(context);
        }

        public void e(int i) {
            if (this.c != i) {
                this.g = hm1.k(this.f26558a, zhi.k0);
                this.h = hm1.k(this.f26558a, zhi.h0);
                this.i = hm1.k(this.f26558a, zhi.j0);
                this.j = hm1.k(this.f26558a, zhi.i0);
                this.f26560k = hm1.k(this.f26558a, zhi.p0);
                this.l = hm1.k(this.f26558a, zhi.o0);
                this.m = hm1.k(this.f26558a, zhi.n0);
                this.o = hm1.k(this.f26558a, zhi.l0);
                this.n = hm1.k(this.f26558a, zhi.m0);
                this.c = i;
            }
            this.d = tc8.n(this.f26558a);
        }

        public int f(int i) {
            boolean z = this.p || this.d;
            int[] iArrH = h(this.j, this.h, this.m, this.n, this.o, false);
            int iB = this.f.b(i, iArrH[0], iArrH[1], this.e, z);
            if (this.q) {
                int size = View.MeasureSpec.getSize(i);
                StringBuilder sb = new StringBuilder();
                sb.append("getHeightMeasureSpecForDialog: measuredValue = ");
                sb.append(iB);
                sb.append(", size = ");
                sb.append(size);
                sb.append(", fixedValue = ");
                sb.append(iArrH[0]);
                sb.append(", maxValue = ");
                sb.append(iArrH[1]);
                sb.append(", useMaxLimit = ");
                sb.append(z);
                sb.append(", mPanelMaxLimitHeight = ");
                sb.append(this.e);
                sb.append(", mIsFlipTinyScreen = ");
                sb.append(this.p);
                sb.append(", mIsFreeWindowMode = ");
                sb.append(this.d);
            }
            return iB;
        }

        public int g() {
            zlr.c(this.f26558a, this.f26559b);
            return (int) (this.f26559b.y / this.f26558a.getResources().getDisplayMetrics().density);
        }

        public final int[] h(TypedValue typedValue, TypedValue typedValue2, TypedValue typedValue3, TypedValue typedValue4, TypedValue typedValue5, boolean z) {
            boolean z2 = this.p || this.d;
            return new int[]{l(this.f.a(z2, j(), this.c, new d.f(typedValue, typedValue2, typedValue5)), z), l(this.f.a(z2, j(), this.c, new d.f(typedValue3, typedValue4, typedValue5)), z)};
        }

        public int i(int i) {
            int[] iArrH = h(this.g, this.i, this.f26560k, this.l, this.o, true);
            int iC = this.f.c(i, iArrH[0], iArrH[1]);
            if (this.q) {
                int size = View.MeasureSpec.getSize(i);
                StringBuilder sb = new StringBuilder();
                sb.append("getWidthMeasureSpecForDialog: measuredValue = ");
                sb.append(iC);
                sb.append(", size = ");
                sb.append(size);
                sb.append(", fixedValue = ");
                sb.append(iArrH[0]);
                sb.append(", maxValue = ");
                sb.append(iArrH[1]);
            }
            return iC;
        }

        public final boolean j() {
            return zlr.n(this.f26558a);
        }

        public final void k(Context context, AttributeSet attributeSet) {
            if (attributeSet == null) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5j.m3);
            if (typedArrayObtainStyledAttributes.hasValue(g5j.B3)) {
                TypedValue typedValue = new TypedValue();
                this.g = typedValue;
                typedArrayObtainStyledAttributes.getValue(g5j.B3, typedValue);
            }
            if (typedArrayObtainStyledAttributes.hasValue(g5j.y3)) {
                TypedValue typedValue2 = new TypedValue();
                this.h = typedValue2;
                typedArrayObtainStyledAttributes.getValue(g5j.y3, typedValue2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(g5j.A3)) {
                TypedValue typedValue3 = new TypedValue();
                this.i = typedValue3;
                typedArrayObtainStyledAttributes.getValue(g5j.A3, typedValue3);
            }
            if (typedArrayObtainStyledAttributes.hasValue(g5j.z3)) {
                TypedValue typedValue4 = new TypedValue();
                this.j = typedValue4;
                typedArrayObtainStyledAttributes.getValue(g5j.z3, typedValue4);
            }
            if (typedArrayObtainStyledAttributes.hasValue(g5j.I3)) {
                TypedValue typedValue5 = new TypedValue();
                this.f26560k = typedValue5;
                typedArrayObtainStyledAttributes.getValue(g5j.I3, typedValue5);
            }
            if (typedArrayObtainStyledAttributes.hasValue(g5j.H3)) {
                TypedValue typedValue6 = new TypedValue();
                this.l = typedValue6;
                typedArrayObtainStyledAttributes.getValue(g5j.H3, typedValue6);
            }
            if (typedArrayObtainStyledAttributes.hasValue(g5j.F3)) {
                TypedValue typedValue7 = new TypedValue();
                this.n = typedValue7;
                typedArrayObtainStyledAttributes.getValue(g5j.F3, typedValue7);
            }
            if (typedArrayObtainStyledAttributes.hasValue(g5j.G3)) {
                TypedValue typedValue8 = new TypedValue();
                this.m = typedValue8;
                typedArrayObtainStyledAttributes.getValue(g5j.G3, typedValue8);
            }
            if (typedArrayObtainStyledAttributes.hasValue(g5j.D3)) {
                TypedValue typedValue9 = new TypedValue();
                this.o = typedValue9;
                typedArrayObtainStyledAttributes.getValue(g5j.D3, typedValue9);
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final int l(TypedValue typedValue, boolean z) {
            int i;
            float fraction;
            if (typedValue != null && (i = typedValue.type) != 0) {
                if (i == 5) {
                    fraction = typedValue.getDimension(this.f26558a.getResources().getDisplayMetrics());
                } else if (i == 6) {
                    float f = z ? this.f26559b.x : this.f26559b.y;
                    fraction = typedValue.getFraction(f, f);
                }
                return (int) fraction;
            }
            return 0;
        }

        public void m(boolean z) {
            this.p = z;
        }
    }

    public DialogParentPanel2(Context context) {
        this(context, null);
    }

    private void setCornerRadius(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.d = f;
        c();
    }

    private void setSmoothCornerEnable(boolean z) {
        e3n.e(this, z);
    }

    public final void a(Canvas canvas) {
        this.c.reset();
        Path path = this.c;
        RectF rectF = this.f26557b;
        float f = this.d;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(this.c);
    }

    public void b() {
        this.f26556a.e(this.f26556a.g());
    }

    public final void c() {
        invalidateOutline();
        invalidate();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        a(canvas);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public int getPanelMaxLimitHeight() {
        return this.f26556a.e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.densityDpi;
        if (i != this.e) {
            this.e = i;
            setCornerRadius(getResources().getDimension(dmi.H));
        }
        b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        b();
        super.onMeasure(this.f26556a.i(i), this.f26556a.f(i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f26557b.set(0.0f, 0.0f, i, i2);
    }

    public void setIsDebugEnabled(boolean z) {
        this.f26556a.q = z;
    }

    public void setIsInTinyScreen(boolean z) {
        FloatingABOLayoutSpec floatingABOLayoutSpec = this.f26556a;
        if (floatingABOLayoutSpec != null) {
            floatingABOLayoutSpec.m(z);
        }
    }

    public void setPanelMaxLimitHeight(int i) {
        this.f26556a.e = i;
    }

    public DialogParentPanel2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DialogParentPanel2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26557b = new RectF();
        this.c = new Path();
        setSmoothCornerEnable(true);
        Resources resources = getResources();
        setCornerRadius(resources.getDimension(dmi.H));
        this.e = resources.getDisplayMetrics().densityDpi;
        FloatingABOLayoutSpec floatingABOLayoutSpec = new FloatingABOLayoutSpec(context, attributeSet);
        this.f26556a = floatingABOLayoutSpec;
        floatingABOLayoutSpec.f = new vjh();
    }
}
