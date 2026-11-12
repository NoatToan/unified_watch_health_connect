package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.l4h;
import defpackage.l5i;
import defpackage.m5i;
import defpackage.y5i;

/* JADX INFO: loaded from: classes.dex */
public class PrecomputedTextCompat implements Spannable {
    public static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spannable f2079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Params f2080b;
    public final PrecomputedText c;

    public Params a() {
        return this.f2080b;
    }

    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PrecomputedText b() {
        if (l5i.a(this.f2079a)) {
            return m5i.a(this.f2079a);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f2079a.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f2079a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f2079a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f2079a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.c.getSpans(i, i2, cls) : (T[]) this.f2079a.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f2079a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2079a.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.c.removeSpan(obj);
        } else {
            this.f2079a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.c.setSpan(obj, i, i2, i3);
        } else {
            this.f2079a.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f2079a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f2079a.toString();
    }

    public static final class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f2081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f2082b;
        public final int c;
        public final int d;
        public final PrecomputedText.Params e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextPaint f2083a;
            public int c = 1;
            public int d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public TextDirectionHeuristic f2084b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public a(TextPaint textPaint) {
                this.f2083a = textPaint;
            }

            public Params a() {
                return new Params(this.f2083a, this.f2084b, this.c, this.d);
            }

            @RequiresApi(23)
            public a b(int i) {
                this.c = i;
                return this;
            }

            @RequiresApi(23)
            public a c(int i) {
                this.d = i;
                return this;
            }

            public a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2084b = textDirectionHeuristic;
                return this;
            }
        }

        public Params(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.e = y5i.a(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.e = null;
            }
            this.f2081a = textPaint;
            this.f2082b = textDirectionHeuristic;
            this.c = i;
            this.d = i2;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean a(Params params) {
            if (this.c != params.b() || this.d != params.c() || this.f2081a.getTextSize() != params.e().getTextSize() || this.f2081a.getTextScaleX() != params.e().getTextScaleX() || this.f2081a.getTextSkewX() != params.e().getTextSkewX() || this.f2081a.getLetterSpacing() != params.e().getLetterSpacing() || !TextUtils.equals(this.f2081a.getFontFeatureSettings(), params.e().getFontFeatureSettings()) || this.f2081a.getFlags() != params.e().getFlags() || !this.f2081a.getTextLocales().equals(params.e().getTextLocales())) {
                return false;
            }
            if (this.f2081a.getTypeface() == null) {
                return params.e().getTypeface() == null;
            }
            return this.f2081a.getTypeface().equals(params.e().getTypeface());
        }

        @RequiresApi(23)
        public int b() {
            return this.c;
        }

        @RequiresApi(23)
        public int c() {
            return this.d;
        }

        public TextDirectionHeuristic d() {
            return this.f2082b;
        }

        public TextPaint e() {
            return this.f2081a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return a(params) && this.f2082b == params.d();
        }

        public int hashCode() {
            return l4h.b(Float.valueOf(this.f2081a.getTextSize()), Float.valueOf(this.f2081a.getTextScaleX()), Float.valueOf(this.f2081a.getTextSkewX()), Float.valueOf(this.f2081a.getLetterSpacing()), Integer.valueOf(this.f2081a.getFlags()), this.f2081a.getTextLocales(), this.f2081a.getTypeface(), Boolean.valueOf(this.f2081a.isElegantTextHeight()), this.f2082b, Integer.valueOf(this.c), Integer.valueOf(this.d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f2081a.getTextSize());
            sb.append(", textScaleX=" + this.f2081a.getTextScaleX());
            sb.append(", textSkewX=" + this.f2081a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f2081a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f2081a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f2081a.getTextLocales());
            sb.append(", typeface=" + this.f2081a.getTypeface());
            sb.append(", variationSettings=" + this.f2081a.getFontVariationSettings());
            sb.append(", textDir=" + this.f2082b);
            sb.append(", breakStrategy=" + this.c);
            sb.append(", hyphenationFrequency=" + this.d);
            sb.append("}");
            return sb.toString();
        }

        @RequiresApi(28)
        public Params(PrecomputedText.Params params) {
            this.f2081a = params.getTextPaint();
            this.f2082b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
            this.e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
