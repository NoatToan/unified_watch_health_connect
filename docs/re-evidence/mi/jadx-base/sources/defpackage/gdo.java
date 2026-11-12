package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class gdo {
    public static final int n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f18861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f18862b;
    public final int c;
    public int e;
    public boolean l;
    public int d = 0;
    public Layout.Alignment f = Layout.Alignment.ALIGN_NORMAL;
    public int g = Integer.MAX_VALUE;
    public float h = 0.0f;
    public float i = 1.0f;
    public int j = n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18863k = true;
    public TextUtils.TruncateAt m = null;

    public static class a extends Exception {
    }

    public gdo(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f18861a = charSequence;
        this.f18862b = textPaint;
        this.c = i;
        this.e = charSequence.length();
    }

    public static gdo b(CharSequence charSequence, TextPaint textPaint, @IntRange(from = 0) int i) {
        return new gdo(charSequence, textPaint, i);
    }

    public StaticLayout a() throws a {
        if (this.f18861a == null) {
            this.f18861a = "";
        }
        int iMax = Math.max(0, this.c);
        CharSequence charSequenceEllipsize = this.f18861a;
        if (this.g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f18862b, iMax, this.m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.e);
        this.e = iMin;
        if (this.l && this.g == 1) {
            this.f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.d, iMin, this.f18862b, iMax);
        builderObtain.setAlignment(this.f);
        builderObtain.setIncludePad(this.f18863k);
        builderObtain.setTextDirection(this.l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.g);
        float f = this.h;
        if (f != 0.0f || this.i != 1.0f) {
            builderObtain.setLineSpacing(f, this.i);
        }
        if (this.g > 1) {
            builderObtain.setHyphenationFrequency(this.j);
        }
        return builderObtain.build();
    }

    public gdo c(Layout.Alignment alignment) {
        this.f = alignment;
        return this;
    }

    public gdo d(TextUtils.TruncateAt truncateAt) {
        this.m = truncateAt;
        return this;
    }

    public gdo e(int i) {
        this.j = i;
        return this;
    }

    public gdo f(boolean z) {
        this.f18863k = z;
        return this;
    }

    public gdo g(boolean z) {
        this.l = z;
        return this;
    }

    public gdo h(float f, float f2) {
        this.h = f;
        this.i = f2;
        return this;
    }

    public gdo i(@IntRange(from = 0) int i) {
        this.g = i;
        return this;
    }
}
