package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class uip extends l8f implements u7p.b {
    public static final int P = k3j.N;
    public static final int Q = pii.i0;
    public final Paint.FontMetrics A;
    public final u7p B;
    public final View.OnLayoutChangeListener C;
    public final Rect D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public float K;
    public float L;
    public final float M;
    public float N;
    public float O;
    public CharSequence y;
    public final Context z;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            uip.this.E0(view);
        }
    }

    public uip(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A = new Paint.FontMetrics();
        u7p u7pVar = new u7p(this);
        this.B = u7pVar;
        this.C = new a();
        this.D = new Rect();
        this.K = 1.0f;
        this.L = 1.0f;
        this.M = 0.5f;
        this.N = 0.5f;
        this.O = 1.0f;
        this.z = context;
        u7pVar.e().density = context.getResources().getDisplayMetrics().density;
        u7pVar.e().setTextAlign(Paint.Align.CENTER);
    }

    private float s0() {
        this.B.e().getFontMetrics(this.A);
        Paint.FontMetrics fontMetrics = this.A;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public static uip u0(Context context, AttributeSet attributeSet, int i, int i2) {
        uip uipVar = new uip(context, attributeSet, i, i2);
        uipVar.z0(attributeSet, i, i2);
        return uipVar;
    }

    private float y0() {
        CharSequence charSequence = this.y;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.B.f(charSequence.toString());
    }

    private void z0(AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayH = c9p.h(this.z, attributeSet, b4j.Ja, i, i2, new int[0]);
        this.I = this.z.getResources().getDimensionPixelSize(pmi.E0);
        setShapeAppearanceModel(E().v().s(v0()).m());
        C0(typedArrayH.getText(b4j.Qa));
        j7p j7pVarG = k8f.g(this.z, typedArrayH, b4j.Ka);
        if (j7pVarG != null && typedArrayH.hasValue(b4j.La)) {
            j7pVarG.k(k8f.b(this.z, typedArrayH, b4j.La));
        }
        D0(j7pVarG);
        b0(ColorStateList.valueOf(typedArrayH.getColor(b4j.Ra, i8f.g(z44.p(i8f.c(this.z, R.attr.colorBackground, uip.class.getCanonicalName()), 229), z44.p(i8f.c(this.z, pii.o, uip.class.getCanonicalName()), 153)))));
        l0(ColorStateList.valueOf(i8f.c(this.z, pii.s, uip.class.getCanonicalName())));
        this.E = typedArrayH.getDimensionPixelSize(b4j.Ma, 0);
        this.F = typedArrayH.getDimensionPixelSize(b4j.Oa, 0);
        this.G = typedArrayH.getDimensionPixelSize(b4j.Pa, 0);
        this.H = typedArrayH.getDimensionPixelSize(b4j.Na, 0);
        typedArrayH.recycle();
    }

    public void A0(View view) {
        if (view == null) {
            return;
        }
        E0(view);
        view.addOnLayoutChangeListener(this.C);
    }

    public void B0(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.N = 1.2f;
        this.K = f;
        this.L = f;
        this.O = wc1.b(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    public void C0(CharSequence charSequence) {
        if (TextUtils.equals(this.y, charSequence)) {
            return;
        }
        this.y = charSequence;
        this.B.i(true);
        invalidateSelf();
    }

    public void D0(j7p j7pVar) {
        this.B.h(j7pVar, this.z);
    }

    public final void E0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.J = iArr[0];
        view.getWindowVisibleDisplayFrame(this.D);
    }

    @Override // u7p.b
    public void a() {
        invalidateSelf();
    }

    @Override // defpackage.l8f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float fR0 = r0();
        float f = (float) (-((((double) this.I) * Math.sqrt(2.0d)) - ((double) this.I)));
        canvas.scale(this.K, this.L, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.N));
        canvas.translate(fR0, f);
        super.draw(canvas);
        x0(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.B.e().getTextSize(), this.G);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.E * 2) + y0(), this.F);
    }

    @Override // defpackage.l8f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(E().v().s(v0()).m());
    }

    @Override // defpackage.l8f, android.graphics.drawable.Drawable, u7p.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final float r0() {
        int i;
        if (((this.D.right - getBounds().right) - this.J) - this.H < 0) {
            i = ((this.D.right - getBounds().right) - this.J) - this.H;
        } else {
            if (((this.D.left - getBounds().left) - this.J) + this.H <= 0) {
                return 0.0f;
            }
            i = ((this.D.left - getBounds().left) - this.J) + this.H;
        }
        return i;
    }

    public final float t0(Rect rect) {
        return rect.centerY() - s0();
    }

    public final s08 v0() {
        float f = -r0();
        float fWidth = ((float) (((double) getBounds().width()) - (((double) this.I) * Math.sqrt(2.0d)))) / 2.0f;
        return new x6h(new h5f(this.I), Math.min(Math.max(f, -fWidth), fWidth));
    }

    public void w0(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.C);
    }

    public final void x0(Canvas canvas) {
        if (this.y == null) {
            return;
        }
        Rect bounds = getBounds();
        int iT0 = (int) t0(bounds);
        if (this.B.d() != null) {
            this.B.e().drawableState = getState();
            this.B.j(this.z);
            this.B.e().setAlpha((int) (this.O * 255.0f));
        }
        CharSequence charSequence = this.y;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), iT0, this.B.e());
    }
}
