package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class j7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f22502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f22503b;
    public final ColorStateList c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final float h;
    public final float i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f22504k;
    public final float l;
    public ColorStateList m;
    public float n;
    public final int o;
    public boolean p = false;
    public Typeface q;

    public class a extends jrk.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l7p f22505a;

        public a(l7p l7pVar) {
            this.f22505a = l7pVar;
        }

        @Override // jrk.e
        /* JADX INFO: renamed from: h */
        public void f(int i) {
            j7p.this.p = true;
            this.f22505a.a(i);
        }

        @Override // jrk.e
        /* JADX INFO: renamed from: i */
        public void g(Typeface typeface) {
            j7p j7pVar = j7p.this;
            j7pVar.q = Typeface.create(typeface, j7pVar.e);
            j7p.this.p = true;
            this.f22505a.b(j7p.this.q, false);
        }
    }

    public class b extends l7p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f22507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextPaint f22508b;
        public final /* synthetic */ l7p c;

        public b(Context context, TextPaint textPaint, l7p l7pVar) {
            this.f22507a = context;
            this.f22508b = textPaint;
            this.c = l7pVar;
        }

        @Override // defpackage.l7p
        public void a(int i) {
            this.c.a(i);
        }

        @Override // defpackage.l7p
        public void b(Typeface typeface, boolean z) {
            j7p.this.p(this.f22507a, this.f22508b, typeface);
            this.c.b(typeface, z);
        }
    }

    public j7p(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, b4j.a9);
        l(typedArrayObtainStyledAttributes.getDimension(b4j.b9, 0.0f));
        k(k8f.b(context, typedArrayObtainStyledAttributes, b4j.e9));
        this.f22502a = k8f.b(context, typedArrayObtainStyledAttributes, b4j.f9);
        this.f22503b = k8f.b(context, typedArrayObtainStyledAttributes, b4j.g9);
        this.e = typedArrayObtainStyledAttributes.getInt(b4j.d9, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(b4j.c9, 1);
        int iF = k8f.f(typedArrayObtainStyledAttributes, b4j.m9, b4j.l9);
        this.o = typedArrayObtainStyledAttributes.getResourceId(iF, 0);
        this.d = typedArrayObtainStyledAttributes.getString(iF);
        this.g = typedArrayObtainStyledAttributes.getBoolean(b4j.n9, false);
        this.c = k8f.b(context, typedArrayObtainStyledAttributes, b4j.h9);
        this.h = typedArrayObtainStyledAttributes.getFloat(b4j.i9, 0.0f);
        this.i = typedArrayObtainStyledAttributes.getFloat(b4j.j9, 0.0f);
        this.j = typedArrayObtainStyledAttributes.getFloat(b4j.k9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, b4j.m5);
        this.f22504k = typedArrayObtainStyledAttributes2.hasValue(b4j.n5);
        this.l = typedArrayObtainStyledAttributes2.getFloat(b4j.n5, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.q == null && (str = this.d) != null) {
            this.q = Typeface.create(str, this.e);
        }
        if (this.q == null) {
            int i = this.f;
            if (i == 1) {
                this.q = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.q = Typeface.SERIF;
            } else if (i != 3) {
                this.q = Typeface.DEFAULT;
            } else {
                this.q = Typeface.MONOSPACE;
            }
            this.q = Typeface.create(this.q, this.e);
        }
    }

    public Typeface e() {
        d();
        return this.q;
    }

    @VisibleForTesting
    public Typeface f(Context context) {
        if (this.p) {
            return this.q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = jrk.h(context, this.o);
                this.q = typefaceH;
                if (typefaceH != null) {
                    this.q = Typeface.create(typefaceH, this.e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.d);
            }
        }
        d();
        this.p = true;
        return this.q;
    }

    public void g(Context context, l7p l7pVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i = this.o;
        if (i == 0) {
            this.p = true;
        }
        if (this.p) {
            l7pVar.b(this.q, true);
            return;
        }
        try {
            jrk.j(context, i, new a(l7pVar), null);
        } catch (Resources.NotFoundException unused) {
            this.p = true;
            l7pVar.a(1);
        } catch (Exception unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.d);
            this.p = true;
            l7pVar.a(-3);
        }
    }

    public void h(Context context, TextPaint textPaint, l7p l7pVar) {
        p(context, textPaint, e());
        g(context, new b(context, textPaint, l7pVar));
    }

    public ColorStateList i() {
        return this.m;
    }

    public float j() {
        return this.n;
    }

    public void k(ColorStateList colorStateList) {
        this.m = colorStateList;
    }

    public void l(float f) {
        this.n = f;
    }

    public final boolean m(Context context) {
        if (k7p.a()) {
            return true;
        }
        int i = this.o;
        return (i != 0 ? jrk.c(context, i) : null) != null;
    }

    public void n(Context context, TextPaint textPaint, l7p l7pVar) {
        o(context, textPaint, l7pVar);
        ColorStateList colorStateList = this.m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.j;
        float f2 = this.h;
        float f3 = this.i;
        ColorStateList colorStateList2 = this.c;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, l7p l7pVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            h(context, textPaint, l7pVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = a6q.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i = this.e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.n);
        if (this.f22504k) {
            textPaint.setLetterSpacing(this.l);
        }
    }
}
