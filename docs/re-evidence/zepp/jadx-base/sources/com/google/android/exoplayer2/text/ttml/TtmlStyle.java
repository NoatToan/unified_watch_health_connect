package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
final class TtmlStyle {
    public static final int A = 2;
    public static final int B = 3;
    private static final int C = 0;
    private static final int D = 1;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int t = -1;
    public static final float u = Float.MAX_VALUE;
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    public static final int z = 1;

    @Nullable
    private String a;
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private float k;

    @Nullable
    private String l;

    @Nullable
    private Layout.Alignment o;

    @Nullable
    private Layout.Alignment p;

    @Nullable
    private TextEmphasis r;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private int m = -1;
    private int n = -1;
    private int q = -1;
    private float s = Float.MAX_VALUE;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RubyType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    private TtmlStyle s(@Nullable TtmlStyle ancestor, boolean chaining) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ancestor != null) {
            if (!this.c && ancestor.c) {
                x(ancestor.b);
            }
            if (this.h == -1) {
                this.h = ancestor.h;
            }
            if (this.i == -1) {
                this.i = ancestor.i;
            }
            if (this.a == null && (str = ancestor.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = ancestor.f;
            }
            if (this.g == -1) {
                this.g = ancestor.g;
            }
            if (this.n == -1) {
                this.n = ancestor.n;
            }
            if (this.o == null && (alignment2 = ancestor.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = ancestor.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = ancestor.q;
            }
            if (this.j == -1) {
                this.j = ancestor.j;
                this.k = ancestor.k;
            }
            if (this.r == null) {
                this.r = ancestor.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = ancestor.s;
            }
            if (chaining && !this.e && ancestor.e) {
                v(ancestor.d);
            }
            if (chaining && this.m == -1 && (i = ancestor.m) != -1) {
                this.m = i;
            }
        }
        return this;
    }

    public TtmlStyle A(int fontSizeUnit) {
        this.j = fontSizeUnit;
        return this;
    }

    public TtmlStyle B(@Nullable String id) {
        this.l = id;
        return this;
    }

    public TtmlStyle C(boolean z2) {
        this.i = z2 ? 1 : 0;
        return this;
    }

    public TtmlStyle D(boolean z2) {
        this.f = z2 ? 1 : 0;
        return this;
    }

    public TtmlStyle E(@Nullable Layout.Alignment multiRowAlign) {
        this.p = multiRowAlign;
        return this;
    }

    public TtmlStyle F(int position) {
        this.n = position;
        return this;
    }

    public TtmlStyle G(int rubyType) {
        this.m = rubyType;
        return this;
    }

    public TtmlStyle H(float shearPercentage) {
        this.s = shearPercentage;
        return this;
    }

    public TtmlStyle I(@Nullable Layout.Alignment textAlign) {
        this.o = textAlign;
        return this;
    }

    public TtmlStyle J(boolean z2) {
        this.q = z2 ? 1 : 0;
        return this;
    }

    public TtmlStyle K(@Nullable TextEmphasis textEmphasis) {
        this.r = textEmphasis;
        return this;
    }

    public TtmlStyle L(boolean z2) {
        this.g = z2 ? 1 : 0;
        return this;
    }

    public TtmlStyle a(@Nullable TtmlStyle ancestor) {
        return s(ancestor, true);
    }

    public int b() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.c) {
            return this.b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    @Nullable
    public String d() {
        return this.a;
    }

    public float e() {
        return this.k;
    }

    public int f() {
        return this.j;
    }

    @Nullable
    public String g() {
        return this.l;
    }

    @Nullable
    public Layout.Alignment h() {
        return this.p;
    }

    public int i() {
        return this.n;
    }

    public int j() {
        return this.m;
    }

    public float k() {
        return this.s;
    }

    public int l() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
    }

    @Nullable
    public Layout.Alignment m() {
        return this.o;
    }

    public boolean n() {
        return this.q == 1;
    }

    @Nullable
    public TextEmphasis o() {
        return this.r;
    }

    public boolean p() {
        return this.e;
    }

    public boolean q() {
        return this.c;
    }

    public TtmlStyle r(@Nullable TtmlStyle ancestor) {
        return s(ancestor, false);
    }

    public boolean t() {
        return this.f == 1;
    }

    public boolean u() {
        return this.g == 1;
    }

    public TtmlStyle v(int backgroundColor) {
        this.d = backgroundColor;
        this.e = true;
        return this;
    }

    public TtmlStyle w(boolean z2) {
        this.h = z2 ? 1 : 0;
        return this;
    }

    public TtmlStyle x(int fontColor) {
        this.b = fontColor;
        this.c = true;
        return this;
    }

    public TtmlStyle y(@Nullable String fontFamily) {
        this.a = fontFamily;
        return this;
    }

    public TtmlStyle z(float fontSize) {
        this.k = fontSize;
        return this;
    }
}
