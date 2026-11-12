package t5;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt5/o;", "", "", "charSequence", "Landroid/text/TextPaint;", "textPaint", "", "textDirectionHeuristic", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f162447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f162448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f162449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f162450d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f162451e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f162452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f162453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f162454h;

    public o(CharSequence charSequence, TextPaint textPaint, int i14) {
        this.f162447a = charSequence;
        this.f162448b = textPaint;
        this.f162449c = i14;
    }

    public final BoringLayout.Metrics a() {
        BoringLayout.Metrics metricsIsBoring;
        if (!this.f162453g) {
            TextDirectionHeuristic textDirectionHeuristicB = d0.b(this.f162449c);
            d.f162421a.getClass();
            int i14 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f162447a;
            TextPaint textPaint = this.f162448b;
            if (i14 >= 33) {
                int i15 = c.f162420a;
                metricsIsBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicB, true, null);
            } else {
                int i16 = e.f162424a;
                metricsIsBoring = !textDirectionHeuristicB.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            }
            this.f162452f = metricsIsBoring;
            this.f162453g = true;
        }
        return this.f162452f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.f162454h;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        CharSequence charSequence2 = this.f162447a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (p.b(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f162454h = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    public final float c() {
        if (!Float.isNaN(this.f162450d)) {
            return this.f162450d;
        }
        BoringLayout.Metrics metricsA = a();
        float fCeil = metricsA != null ? metricsA.width : -1;
        TextPaint textPaint = this.f162448b;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.f162447a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (p.b(spanned, v5.f.class) || p.b(spanned, v5.e.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.f162450d = fCeil;
        return fCeil;
    }
}
