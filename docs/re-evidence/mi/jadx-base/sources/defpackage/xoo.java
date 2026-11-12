package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: loaded from: classes4.dex */
public final class xoo {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f39318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39319b;
    public final float c;
    public final float d;
    public final float e;
    public final TextPaint f;
    public final Paint g;
    public final Paint h;
    public CharSequence i;
    public Layout.Alignment j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bitmap f39320k;
    public float l;
    public int m;
    public int n;
    public float o;
    public int p;
    public float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f39321r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public float z;

    public xoo(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f39318a = fRound;
        this.f39319b = fRound;
        this.c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    public void b(h55 h55Var, gj3 gj3Var, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = h55Var.d == null;
        if (!z) {
            i5 = -16777216;
        } else if (TextUtils.isEmpty(h55Var.f19701a)) {
            return;
        } else {
            i5 = h55Var.l ? h55Var.m : gj3Var.c;
        }
        if (a(this.i, h55Var.f19701a) && wlq.c(this.j, h55Var.f19702b) && this.f39320k == h55Var.d && this.l == h55Var.e && this.m == h55Var.f && wlq.c(Integer.valueOf(this.n), Integer.valueOf(h55Var.g)) && this.o == h55Var.h && wlq.c(Integer.valueOf(this.p), Integer.valueOf(h55Var.i)) && this.q == h55Var.j && this.f39321r == h55Var.f19703k && this.s == gj3Var.f19045a && this.t == gj3Var.f19046b && this.u == i5 && this.w == gj3Var.d && this.v == gj3Var.e && wlq.c(this.f.getTypeface(), gj3Var.f) && this.x == f && this.y == f2 && this.z == f3 && this.A == i && this.B == i2 && this.C == i3 && this.D == i4) {
            d(canvas, z);
            return;
        }
        this.i = h55Var.f19701a;
        this.j = h55Var.f19702b;
        this.f39320k = h55Var.d;
        this.l = h55Var.e;
        this.m = h55Var.f;
        this.n = h55Var.g;
        this.o = h55Var.h;
        this.p = h55Var.i;
        this.q = h55Var.j;
        this.f39321r = h55Var.f19703k;
        this.s = gj3Var.f19045a;
        this.t = gj3Var.f19046b;
        this.u = i5;
        this.w = gj3Var.d;
        this.v = gj3Var.e;
        this.f.setTypeface(gj3Var.f);
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = i;
        this.B = i2;
        this.C = i3;
        this.D = i4;
        if (z) {
            rk1.e(this.i);
            g();
        } else {
            rk1.e(this.f39320k);
            f();
        }
        d(canvas, z);
    }

    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.f39320k, (Rect) null, this.J, this.h);
    }

    public final void d(Canvas canvas, boolean z) {
        if (z) {
            e(canvas);
            return;
        }
        rk1.e(this.J);
        rk1.e(this.f39320k);
        c(canvas);
    }

    public final void e(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.u) > 0) {
            this.g.setColor(this.u);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.g);
        }
        int i = this.w;
        if (i == 1) {
            this.f.setStrokeJoin(Paint.Join.ROUND);
            this.f.setStrokeWidth(this.f39318a);
            this.f.setColor(this.v);
            this.f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i == 2) {
            TextPaint textPaint = this.f;
            float f = this.f39319b;
            float f2 = this.c;
            textPaint.setShadowLayer(f, f2, f2, this.v);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i2 = z ? -1 : this.v;
            int i3 = z ? this.v : -1;
            float f3 = this.f39319b / 2.0f;
            this.f.setColor(this.s);
            this.f.setStyle(Paint.Style.FILL);
            float f4 = -f3;
            this.f.setShadowLayer(this.f39319b, f4, f4, i2);
            staticLayout2.draw(canvas);
            this.f.setShadowLayer(this.f39319b, f3, f3, i3);
        }
        this.f.setColor(this.s);
        this.f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    public final void f() {
        float f;
        int i;
        float f2;
        Bitmap bitmap = this.f39320k;
        int i2 = this.C;
        int i3 = this.A;
        int i4 = this.D;
        int i5 = this.B;
        float f3 = i2 - i3;
        float f4 = i3 + (this.o * f3);
        float f5 = i4 - i5;
        float f6 = i5 + (this.l * f5);
        int iRound = Math.round(f3 * this.q);
        float f7 = this.f39321r;
        int iRound2 = f7 != -3.4028235E38f ? Math.round(f5 * f7) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i6 = this.p;
        if (i6 != 2) {
            if (i6 == 1) {
                f = iRound / 2;
            }
            int iRound3 = Math.round(f4);
            i = this.n;
            if (i == 2) {
                if (i == 1) {
                    f2 = iRound2 / 2;
                }
                int iRound4 = Math.round(f6);
                this.J = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f2 = iRound2;
            f6 -= f2;
            int iRound5 = Math.round(f6);
            this.J = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f = iRound;
        f4 -= f;
        int iRound6 = Math.round(f4);
        i = this.n;
        if (i == 2) {
            if (i == 1) {
                f2 = iRound2 / 2;
            }
            int iRound7 = Math.round(f6);
            this.J = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f2 = iRound2;
        f6 -= f2;
        int iRound8 = Math.round(f6);
        this.J = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    public final void g() {
        int i;
        int i2;
        int iMax;
        int iMin;
        int iRound;
        int i3;
        CharSequence charSequence = this.i;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.i);
        int i4 = this.C - this.A;
        int i5 = this.D - this.B;
        this.f.setTextSize(this.x);
        int i6 = (int) ((this.x * 0.125f) + 0.5f);
        int i7 = i6 * 2;
        int i8 = i4 - i7;
        float f = this.q;
        if (f != -3.4028235E38f) {
            i8 = (int) (i8 * f);
        }
        int i9 = i8;
        if (i9 <= 0) {
            toe.h("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.y > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.y), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.w == 1) {
            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class)) {
                spannableStringBuilder2.removeSpan(foregroundColorSpan);
            }
        }
        if (Color.alpha(this.t) > 0) {
            int i10 = this.w;
            if (i10 == 0 || i10 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.j;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.f, i9, alignment2, this.d, this.e, true);
        this.E = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.E.getLineCount();
        int iMax2 = 0;
        for (int i11 = 0; i11 < lineCount; i11++) {
            iMax2 = Math.max((int) Math.ceil(this.E.getLineWidth(i11)), iMax2);
        }
        if (this.q == -3.4028235E38f || iMax2 >= i9) {
            i9 = iMax2;
        }
        int i12 = i9 + i7;
        float f2 = this.o;
        if (f2 != -3.4028235E38f) {
            int iRound2 = Math.round(i4 * f2);
            int i13 = this.A;
            int i14 = iRound2 + i13;
            int i15 = this.p;
            i = 1;
            if (i15 != 1) {
                i2 = 2;
                if (i15 == 2) {
                    i14 -= i12;
                }
            } else {
                i2 = 2;
                i14 = ((i14 * 2) - i12) / 2;
            }
            iMax = Math.max(i14, i13);
            iMin = Math.min(i12 + iMax, this.C);
        } else {
            i = 1;
            i2 = 2;
            iMax = ((i4 - i12) / 2) + this.A;
            iMin = iMax + i12;
        }
        int i16 = iMin - iMax;
        if (i16 <= 0) {
            toe.h("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f3 = this.l;
        if (f3 != -3.4028235E38f) {
            if (this.m == 0) {
                iRound = Math.round(i5 * f3) + this.B;
                int i17 = this.n;
                if (i17 == i2) {
                    iRound -= height;
                } else if (i17 == i) {
                    iRound = ((iRound * 2) - height) / i2;
                }
            } else {
                int lineBottom = this.E.getLineBottom(0) - this.E.getLineTop(0);
                float f4 = this.l;
                if (f4 >= 0.0f) {
                    iRound = Math.round(f4 * lineBottom) + this.B;
                } else {
                    iRound = Math.round((f4 + 1.0f) * lineBottom) + this.D;
                    iRound -= height;
                }
            }
            int i18 = iRound + height;
            int i19 = this.D;
            if (i18 <= i19) {
                int i20 = this.B;
                if (iRound < i20) {
                    i3 = i20;
                }
                this.E = new StaticLayout(spannableStringBuilder, this.f, i16, alignment2, this.d, this.e, true);
                this.F = new StaticLayout(spannableStringBuilder2, this.f, i16, alignment2, this.d, this.e, true);
                this.G = iMax;
                this.H = i3;
                this.I = i6;
            }
            iRound = i19 - height;
        } else {
            iRound = (this.D - height) - ((int) (i5 * this.z));
        }
        i3 = iRound;
        this.E = new StaticLayout(spannableStringBuilder, this.f, i16, alignment2, this.d, this.e, true);
        this.F = new StaticLayout(spannableStringBuilder2, this.f, i16, alignment2, this.d, this.e, true);
        this.G = iMax;
        this.H = i3;
        this.I = i6;
    }
}
