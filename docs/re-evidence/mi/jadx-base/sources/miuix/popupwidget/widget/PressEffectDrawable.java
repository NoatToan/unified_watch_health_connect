package miuix.popupwidget.widget;

import android.R;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import defpackage.m5j;
import defpackage.pu6;
import java.io.IOException;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.utils.EaseManager;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class PressEffectDrawable extends Drawable {
    public static final boolean C;
    public static final AnimConfig D;
    public static final AnimConfig E;
    public static final AnimConfig F;
    public static final AnimConfig G;
    public static final AnimConfig H;
    public static final AnimConfig I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26800b;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26801k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public AnimState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AnimState f26802r;
    public AnimState s;
    public AnimState t;
    public AnimState u;
    public IStateStyle v;
    public static final int[] w = {R.attr.state_pressed};
    public static final int[] x = {R.attr.state_drag_hovered};
    public static final int[] y = {R.attr.state_selected};
    public static final int[] z = {R.attr.state_hovered, R.attr.state_activated};
    public static final int[] A = {R.attr.state_hovered};
    public static final int[] B = {R.attr.state_activated};
    public final RectF c = new RectF();
    public final Paint d = new Paint();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f26799a = new a();

    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26804b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;

        public a() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new PressEffectDrawable(new a(this), null);
        }

        public a(a aVar) {
            this.f26803a = aVar.f26803a;
            this.f26804b = aVar.f26804b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new PressEffectDrawable(new a(this), resources);
        }
    }

    static {
        boolean z2 = (pu6.E() || pu6.C() || pu6.F()) ? false : true;
        C = z2;
        if (!z2) {
            D = null;
            E = null;
            F = null;
            G = null;
            H = null;
            I = null;
            return;
        }
        D = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.6f));
        E = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.9f, 0.2f));
        AnimConfig ease = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.25f));
        F = ease;
        AnimConfig ease2 = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.35f));
        G = ease2;
        H = ease;
        I = ease2;
    }

    public PressEffectDrawable() {
    }

    public final void a() {
        this.d.setColor(this.f26800b);
        if (!C) {
            setAlphaF(this.l);
            return;
        }
        this.q = new AnimState().add("alphaF", this.l);
        this.s = new AnimState().add("alphaF", this.m);
        this.f26802r = new AnimState().add("alphaF", this.n);
        this.t = new AnimState().add("alphaF", this.o);
        this.u = new AnimState().add("alphaF", this.p);
        IStateStyle iStateStyleUseValue = Folme.useValue(this);
        this.v = iStateStyleUseValue;
        iStateStyleUseValue.setTo(this.q);
    }

    public final boolean b() {
        if (this.i) {
            this.i = false;
            this.j = false;
            this.f26801k = true;
            if (C) {
                this.v.to(this.t, G);
            } else {
                setAlphaF(this.o);
            }
            return true;
        }
        if (this.j) {
            this.j = false;
            this.f26801k = true;
            if (C) {
                this.v.to(this.t, E);
            } else {
                setAlphaF(this.o);
            }
            return true;
        }
        if (this.f26801k) {
            return false;
        }
        this.f26801k = true;
        if (C) {
            this.v.to(this.t, H);
        } else {
            setAlphaF(this.o);
        }
        return true;
    }

    public final boolean c() {
        if (this.i) {
            this.i = false;
            this.j = true;
            this.f26801k = true;
            if (C) {
                this.v.to(this.u, G);
            } else {
                setAlphaF(this.p);
            }
            return true;
        }
        boolean z2 = this.j;
        if (z2 && this.f26801k) {
            return false;
        }
        if (z2) {
            this.f26801k = true;
            if (C) {
                this.v.to(this.u, H);
            } else {
                setAlphaF(this.p);
            }
            return true;
        }
        if (this.f26801k) {
            this.j = true;
            if (C) {
                this.v.to(this.u, D);
            } else {
                setAlphaF(this.p);
            }
            return true;
        }
        this.f26801k = true;
        this.j = true;
        if (C) {
            this.v.to(this.u, D);
        } else {
            setAlphaF(this.p);
        }
        return true;
    }

    public final boolean d() {
        if (this.i) {
            this.i = false;
            this.j = true;
            this.f26801k = false;
            if (C) {
                this.v.to(this.f26802r, G);
            } else {
                setAlphaF(this.n);
            }
            return true;
        }
        if (this.j) {
            if (!this.f26801k) {
                return false;
            }
            if (C) {
                this.v.to(this.f26802r, E);
            } else {
                setAlphaF(this.n);
            }
            return true;
        }
        this.j = true;
        this.f26801k = false;
        if (C) {
            this.v.to(this.f26802r, D);
        } else {
            setAlphaF(this.n);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            canvas.drawRect(this.c, this.d);
        }
    }

    public final boolean e() {
        if (this.i) {
            this.i = false;
            this.j = false;
            this.f26801k = false;
            if (C) {
                this.v.to(this.q, G);
            } else {
                setAlphaF(this.l);
            }
            return true;
        }
        if (this.j) {
            this.j = false;
            this.f26801k = false;
            if (C) {
                this.v.to(this.q, E);
            } else {
                setAlphaF(this.l);
            }
            return true;
        }
        if (!this.f26801k) {
            return false;
        }
        this.f26801k = false;
        if (C) {
            this.v.to(this.q, I);
        } else {
            setAlphaF(this.l);
        }
        return true;
    }

    public final boolean f() {
        if (this.i) {
            return false;
        }
        if (C) {
            this.v.to(this.s, F);
        } else {
            setAlphaF(this.m);
        }
        this.i = true;
        this.j = false;
        this.f26801k = false;
        return true;
    }

    public final void g() {
        a aVar = this.f26799a;
        aVar.f26803a = this.f26800b;
        aVar.c = this.l;
        aVar.d = this.m;
        aVar.e = this.n;
        aVar.f = this.o;
        aVar.g = this.p;
    }

    public float getAlphaF() {
        return this.d.getAlpha() / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f26799a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, m5j.C0, 0, 0) : resources.obtainAttributes(attributeSet, m5j.C0);
        this.f26800b = typedArrayObtainStyledAttributes.getColor(m5j.I0, -16777216);
        this.l = typedArrayObtainStyledAttributes.getFloat(m5j.G0, 0.0f);
        this.m = typedArrayObtainStyledAttributes.getFloat(m5j.H0, 0.0f);
        this.n = typedArrayObtainStyledAttributes.getFloat(m5j.F0, 0.0f);
        this.o = typedArrayObtainStyledAttributes.getFloat(m5j.D0, 0.0f);
        this.p = typedArrayObtainStyledAttributes.getFloat(m5j.E0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        a();
        g();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        if (C) {
            IStateStyle iStateStyle = this.v;
            iStateStyle.setTo(iStateStyle.getCurrentState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.c.set(rect);
        RectF rectF = this.c;
        rectF.left += this.e;
        rectF.top += this.f;
        rectF.right -= this.g;
        rectF.bottom -= this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (StateSet.stateSetMatches(w, iArr) || StateSet.stateSetMatches(x, iArr) || StateSet.stateSetMatches(y, iArr)) {
            return f();
        }
        if (StateSet.stateSetMatches(z, iArr)) {
            return c();
        }
        if (StateSet.stateSetMatches(A, iArr)) {
            return d();
        }
        return StateSet.stateSetMatches(B, iArr) ? b() : e();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    public void setAlphaF(float f) {
        this.d.setAlpha((int) (f * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public PressEffectDrawable(a aVar, Resources resources) {
        this.f26800b = aVar.f26803a;
        this.l = aVar.c;
        this.m = aVar.d;
        this.n = aVar.e;
        this.o = aVar.f;
        this.p = aVar.g;
        g();
        a();
    }
}
