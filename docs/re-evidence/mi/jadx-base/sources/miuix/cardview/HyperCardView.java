package miuix.cardview;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import com.miui.support.drawable.CardStateDrawable;
import defpackage.a43;
import defpackage.b43;
import defpackage.d4j;
import defpackage.e67;
import defpackage.ebk;
import defpackage.h67;
import defpackage.hm1;
import defpackage.lxk;
import defpackage.m5g;
import defpackage.n5g;
import defpackage.pu6;
import defpackage.thi;
import defpackage.x33;
import defpackage.y33;
import defpackage.z33;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public class HyperCardView extends CardView implements b43 {
    public final h67 A;
    public int[] B;
    public int[] C;
    public int[] D;
    public int[] E;
    public int[] F;
    public boolean G;
    public float H;
    public float I;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26616k;
    public int[] l;
    public float[] m;
    public boolean n;
    public boolean o;
    public final m5g p;
    public Drawable q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f26617r;
    public boolean s;
    public float t;
    public float u;
    public float v;
    public int w;
    public float x;
    public int y;
    public int z;

    public class a implements m5g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f26618a;

        public a(boolean z) {
            this.f26618a = z;
        }

        @Override // m5g.a
        public void a(m5g m5gVar) {
            if (HyperCardView.this.D == null || HyperCardView.this.E == null) {
                m5gVar.l(m5g.c(HyperCardView.this.getContext(), HyperCardView.this.getCardBackgroundColor().getDefaultColor(), this.f26618a ? y33.f39742a : x33.f38631a), this.f26618a ? a43.f594a : z33.f40830a, HyperCardView.this.z);
                return;
            }
            if (!HyperCardView.this.G || HyperCardView.this.B == null) {
                m5gVar.l(HyperCardView.this.D, HyperCardView.this.E, HyperCardView.this.z);
                return;
            }
            float f = 1.0f - HyperCardView.this.H;
            float f2 = HyperCardView.this.H;
            int[] iArr = new int[HyperCardView.this.B.length + HyperCardView.this.D.length];
            int length = HyperCardView.this.B.length;
            for (int i = 0; i < HyperCardView.this.B.length; i++) {
                iArr[i] = (((int) ((HyperCardView.this.B[i] >>> 24) * f)) << 24) | (16777215 & HyperCardView.this.B[i]);
            }
            for (int i2 = 0; i2 < HyperCardView.this.D.length; i2++) {
                iArr[length + i2] = (((int) ((HyperCardView.this.D[i2] >>> 24) * f2)) << 24) | (HyperCardView.this.D[i2] & 16777215);
            }
            m5gVar.l(iArr, HyperCardView.this.F, HyperCardView.this.z);
        }

        @Override // m5g.a
        public void b(boolean z) {
        }

        @Override // m5g.a
        public void c(boolean z) {
            HyperCardView.this.o = z;
        }
    }

    public HyperCardView(Context context) {
        this(context, null);
    }

    private lxk getHyperBackground() {
        Drawable drawable = this.q;
        if (drawable instanceof lxk) {
            return (lxk) drawable;
        }
        return null;
    }

    private void setSmoothCornerEnable(boolean z) {
        try {
            ebk.m(View.class, this, "setSmoothCornerEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("setSmoothCornerEnabled failed:");
            sb.append(e.getMessage());
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        Drawable drawable = this.q;
        return drawable instanceof lxk ? ((lxk) drawable).c() : super.getCardBackgroundColor();
    }

    public int getShadowColor() {
        return this.w;
    }

    public int getStrokeColor() {
        return this.f26616k;
    }

    public int getStrokeWidth() {
        return this.j;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m5g m5gVar = this.p;
        if (m5gVar != null) {
            m5gVar.i();
            if (this.q != null) {
                if (!n5g.e(getContext())) {
                    this.p.e(false);
                    this.q.setAlpha(255);
                } else if (this.z > 0) {
                    this.p.e(true);
                    this.q.setAlpha(0);
                } else {
                    this.p.e(false);
                    this.q.setAlpha(255);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h67 h67Var = this.A;
        if (h67Var != null) {
            h67Var.i(i, i2, i3, i4);
            if (this.t > 0.0f) {
                this.A.b(this, true, 2);
            } else {
                this.A.b(this, false, 2);
            }
        }
    }

    public final boolean p() {
        return !r() && this.n;
    }

    public boolean q() {
        return this.p.f();
    }

    public final boolean r() {
        return pu6.E() || pu6.C();
    }

    public final void s() {
        lxk lxkVar = new lxk(getCardBackgroundColor(), getRadius(), getStrokeWidth(), getStrokeColor());
        lxkVar.i(this.l);
        lxkVar.h(this.m);
        setBackground(lxkVar);
        Drawable foreground = getForeground();
        if (foreground instanceof CardStateDrawable) {
            ((CardStateDrawable) foreground).e((int) getRadius());
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.I = f;
        h67 h67Var = this.A;
        if (h67Var == null || h67Var.d() || getCardElevation() <= 0.0f || getCardBackgroundColor().isOpaque() || this.I <= 0.99f) {
            super.setAlpha(f);
        } else {
            super.setAlpha(0.99f);
        }
    }

    public void setBlurRadius(int i) {
        if (this.y != i) {
            this.y = i;
            this.z = i == 0 ? 0 : (int) ((i / getContext().getResources().getDisplayMetrics().density) + 0.5f);
            m5g m5gVar = this.p;
            if (m5gVar != null) {
                m5gVar.k();
                if (q() && i == 0) {
                    this.p.e(false);
                } else {
                    this.p.j();
                }
            }
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        setCardBackgroundColor(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        h67 h67Var = this.A;
        if (h67Var != null && h67Var.d()) {
            setShadowRadius(f);
            super.setCardElevation(0.0f);
            return;
        }
        if (f <= 0.0f || getCardBackgroundColor().isOpaque() || this.I <= 0.99f) {
            super.setAlpha(this.I);
        } else {
            super.setAlpha(0.99f);
        }
        super.setCardElevation(f);
    }

    public void setEnableBlur(boolean z) {
        this.p.m(z);
    }

    @Override // android.view.View
    public void setOutlineSpotShadowColor(int i) {
        if (!this.A.d()) {
            super.setOutlineSpotShadowColor(i);
        } else {
            setShadowColor(i);
            super.setOutlineSpotShadowColor(0);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        lxk hyperBackground = getHyperBackground();
        if (hyperBackground != null) {
            hyperBackground.f(f);
        } else {
            super.setRadius(f);
        }
        Drawable foreground = getForeground();
        if (foreground instanceof CardStateDrawable) {
            ((CardStateDrawable) foreground).e((int) f);
        }
    }

    public void setShadowColor(int i) {
        if (this.w != i) {
            this.w = i;
            e67.a aVarE = new e67.a(this.t).d((int) this.u).e((int) this.v);
            int i2 = this.w;
            this.A.h(this, aVarE.b(i2, i2).a());
            if (!this.A.d()) {
                setOutlineSpotShadowColor(i);
            } else if (Build.VERSION.SDK_INT >= 28) {
                super.setOutlineSpotShadowColor(0);
            }
        }
    }

    public void setShadowDx(float f) {
        if (this.u != f) {
            this.u = f;
            e67.a aVarE = new e67.a(this.t).d((int) this.u).e((int) this.v);
            int i = this.w;
            this.A.h(this, aVarE.b(i, i).a());
        }
    }

    public void setShadowDy(float f) {
        if (this.v != f) {
            this.v = f;
            e67.a aVarE = new e67.a(this.t).d((int) this.u).e((int) this.v);
            int i = this.w;
            this.A.h(this, aVarE.b(i, i).a());
        }
    }

    public void setShadowRadius(float f) {
        setShadowRadiusDp((f / getResources().getDisplayMetrics().density) + 0.5f);
        if (this.A.d()) {
            super.setCardElevation(0.0f);
        } else {
            super.setCardElevation(f);
        }
    }

    public void setShadowRadiusDp(float f) {
        if (this.t != f) {
            this.t = f;
            e67.a aVarE = new e67.a(f).d((int) this.u).e((int) this.v);
            int i = this.w;
            this.A.h(this, aVarE.b(i, i).a());
        }
    }

    public void setStrokeColor(int i) {
        if (this.f26616k != i) {
            this.f26616k = i;
            lxk hyperBackground = getHyperBackground();
            if (hyperBackground != null) {
                hyperBackground.g(i);
            }
        }
    }

    public void setStrokeWidth(int i) {
        if (this.j != i) {
            this.j = i;
            lxk hyperBackground = getHyperBackground();
            if (hyperBackground != null) {
                hyperBackground.j(i);
            }
        }
    }

    public void setSupportBlur(boolean z) {
        this.p.o(z);
    }

    @RequiresApi(api = 21)
    public final void t(Context context, String str, int i) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(ViewOutlineProvider.class);
            try {
                try {
                    setOutlineProvider((ViewOutlineProvider) clsAsSubclass.getConstructor(Context.class, Integer.TYPE).newInstance(context, Integer.valueOf(i)));
                } catch (IllegalAccessException | NoSuchMethodException unused) {
                    setOutlineProvider((ViewOutlineProvider) clsAsSubclass.getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (InstantiationException e) {
                    e = e;
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (ClassNotFoundException unused2) {
            throw new NoClassDefFoundError(str);
        }
    }

    public HyperCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, thi.f34707a);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        lxk hyperBackground = getHyperBackground();
        if (hyperBackground != null) {
            hyperBackground.e(colorStateList);
        } else {
            super.setCardBackgroundColor(colorStateList);
        }
        m5g m5gVar = this.p;
        if (m5gVar != null) {
            m5gVar.k();
            this.p.j();
        }
    }

    @SuppressLint({"CustomViewStyleable"})
    public HyperCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = false;
        this.q = null;
        this.f26617r = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = false;
        this.H = 0.0f;
        this.I = 1.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4j.z, i, 0);
        Resources resources = context.getResources();
        float f = resources.getDisplayMetrics().density;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(d4j.P, -1);
        if (resourceId != -1) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, d4j.f0);
            String string = typedArrayObtainStyledAttributes2.getString(d4j.g0);
            if (!TextUtils.isEmpty(string)) {
                t(context, string, resourceId);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.s = typedArrayObtainStyledAttributes.getBoolean(d4j.N, false);
        this.x = typedArrayObtainStyledAttributes.getFloat(d4j.I, 1.0f);
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(d4j.D, (int) ((24.0f * f) + 0.5f));
        this.t = (dimensionPixelSize / f) + 0.5f;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(d4j.B, 0);
        this.u = dimensionPixelSize2 == 0 ? 0.0f : (dimensionPixelSize2 / f) + 0.5f;
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(d4j.C, (int) ((12.0f * f) + 0.5f));
        this.v = dimensionPixelSize3 != 0 ? (dimensionPixelSize3 / f) + 0.5f : 0.0f;
        this.w = typedArrayObtainStyledAttributes.getColor(d4j.A, 0);
        this.n = typedArrayObtainStyledAttributes.getBoolean(d4j.O, true);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(d4j.G, (int) ((66.0f * f) + 0.5f));
        this.y = dimensionPixelSize4;
        this.z = dimensionPixelSize4 == 0 ? 0 : (int) ((dimensionPixelSize4 / f) + 0.5f);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(d4j.H, false);
        if (p()) {
            setSmoothCornerEnable(true);
        }
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(d4j.M, 0);
        this.f26616k = typedArrayObtainStyledAttributes.getColor(d4j.J, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(d4j.K, 0);
        if (resourceId2 > 0) {
            this.l = resources.getIntArray(resourceId2);
        }
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(d4j.L, 0);
        if (resourceId3 > 0) {
            TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(resourceId3);
            this.m = new float[typedArrayObtainTypedArray.length()];
            for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                this.m[i2] = resources.getFraction(typedArrayObtainTypedArray.getResourceId(i2, 0), 1, 1);
            }
        }
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(d4j.F, 0);
        if (resourceId4 > 0) {
            this.D = resources.getIntArray(resourceId4);
        }
        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(d4j.E, 0);
        if (resourceId5 > 0) {
            this.E = resources.getIntArray(resourceId5);
        }
        typedArrayObtainStyledAttributes.recycle();
        s();
        this.q = getBackground();
        boolean zD = hm1.d(getContext(), thi.f34708b, true);
        m5g m5gVar = new m5g(context, this, false, new a(zD));
        this.p = m5gVar;
        m5gVar.b(z);
        e67.a aVarE = new e67.a(this.t).d((int) this.u).e((int) this.v);
        int i3 = this.w;
        h67 h67Var = new h67(context, aVarE.b(i3, i3).c(this.x).a(), zD);
        this.A = h67Var;
        if (this.s) {
            h67Var.g(false);
        }
        if (!h67Var.d()) {
            setCardElevation(dimensionPixelSize);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(-16777216);
            }
            setOutlineSpotShadowColor(this.w);
        }
        if (getAlpha() == 1.0f) {
            setAlpha(1.0f);
        }
        if (n5g.f()) {
            setSupportBlur(true);
            setEnableBlur(true);
            if (n5g.e(getContext()) && this.y > 0) {
                m5gVar.e(true);
                Drawable drawable = this.q;
                if (drawable != null) {
                    drawable.setAlpha(0);
                    return;
                }
                return;
            }
            m5gVar.e(false);
            Drawable drawable2 = this.q;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
                return;
            }
            return;
        }
        setSupportBlur(false);
        setEnableBlur(false);
        m5gVar.e(false);
        Drawable drawable3 = this.q;
        if (drawable3 != null) {
            drawable3.setAlpha(255);
        }
    }
}
