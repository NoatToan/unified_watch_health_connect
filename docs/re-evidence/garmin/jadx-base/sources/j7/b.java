package j7;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;
import org.apache.commons.text.StringSubstitutor;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class b implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spannable f97446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f97447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PrecomputedText f97448c;

    private b(PrecomputedText precomputedText, a aVar) {
        this.f97446a = precomputedText;
        this.f97447b = aVar;
        this.f97448c = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i14) {
        return this.f97446a.charAt(i14);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f97446a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f97446a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f97446a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i14, int i15, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f97448c.getSpans(i14, i15, cls) : (T[]) this.f97446a.getSpans(i14, i15, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f97446a.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i14, int i15, Class cls) {
        return this.f97446a.nextSpanTransition(i14, i15, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            h.s("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f97448c.removeSpan(obj);
        } else {
            this.f97446a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i14, int i15, int i16) {
        if (obj instanceof MetricAffectingSpan) {
            h.s("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f97448c.setSpan(obj, i14, i15, i16);
        } else {
            this.f97446a.setSpan(obj, i14, i15, i16);
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i14, int i15) {
        return this.f97446a.subSequence(i14, i15);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f97446a.toString();
    }

    private b(CharSequence charSequence, a aVar, int[] iArr) {
        this.f97446a = new SpannableString(charSequence);
        this.f97447b = aVar;
        this.f97448c = null;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f97449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f97450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f97451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f97452d;

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i14, int i15) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i14).setHyphenationFrequency(i15).setTextDirection(textDirectionHeuristic).build();
            }
            this.f97449a = textPaint;
            this.f97450b = textDirectionHeuristic;
            this.f97451c = i14;
            this.f97452d = i15;
        }

        public final boolean a(a aVar) {
            int i14 = aVar.f97451c;
            TextPaint textPaint = aVar.f97449a;
            if (this.f97451c != i14 || this.f97452d != aVar.f97452d) {
                return false;
            }
            TextPaint textPaint2 = this.f97449a;
            if (textPaint2.getTextSize() != textPaint.getTextSize() || textPaint2.getTextScaleX() != textPaint.getTextScaleX() || textPaint2.getTextSkewX() != textPaint.getTextSkewX() || textPaint2.getLetterSpacing() != textPaint.getLetterSpacing() || !TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) || textPaint2.getFlags() != textPaint.getFlags() || !textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
                return false;
            }
            if (textPaint2.getTypeface() == null) {
                return textPaint.getTypeface() == null;
            }
            return textPaint2.getTypeface().equals(textPaint.getTypeface());
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f97450b == aVar.f97450b;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f97449a;
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f97450b, Integer.valueOf(this.f97451c), Integer.valueOf(this.f97452d));
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("{");
            StringBuilder sb4 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f97449a;
            sb4.append(textPaint.getTextSize());
            sb3.append(sb4.toString());
            sb3.append(", textScaleX=" + textPaint.getTextScaleX());
            sb3.append(", textSkewX=" + textPaint.getTextSkewX());
            sb3.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb3.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb3.append(", textLocale=" + textPaint.getTextLocales());
            sb3.append(", typeface=" + textPaint.getTypeface());
            sb3.append(", variationSettings=" + textPaint.getFontVariationSettings());
            sb3.append(", textDir=" + this.f97450b);
            sb3.append(", breakStrategy=" + this.f97451c);
            sb3.append(", hyphenationFrequency=" + this.f97452d);
            sb3.append(StringSubstitutor.DEFAULT_VAR_END);
            return sb3.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f97449a = params.getTextPaint();
            this.f97450b = params.getTextDirection();
            this.f97451c = params.getBreakStrategy();
            this.f97452d = params.getHyphenationFrequency();
        }
    }
}
