package t5;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lt5/y;", "", "", "text", "", TtmlNode.START, TtmlNode.END, "Landroid/text/TextPaint;", "paint", "width", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "alignment", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "", "lineSpacingMultiplier", "lineSpacingExtra", "justificationMode", "", "includePadding", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f162463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f162464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f162465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextPaint f162466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f162467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextDirectionHeuristic f162468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f162469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f162470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextUtils.TruncateAt f162471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f162472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f162473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f162474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f162475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f162476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f162477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f162478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f162479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f162480r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f162481s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f162482t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f162483u;

    public y(CharSequence charSequence, int i14, int i15, TextPaint textPaint, int i16, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i17, TextUtils.TruncateAt truncateAt, int i18, float f14, float f15, int i19, boolean z14, boolean z15, int i24, int i25, int i26, int i27, int[] iArr, int[] iArr2) {
        this.f162463a = charSequence;
        this.f162464b = i14;
        this.f162465c = i15;
        this.f162466d = textPaint;
        this.f162467e = i16;
        this.f162468f = textDirectionHeuristic;
        this.f162469g = alignment;
        this.f162470h = i17;
        this.f162471i = truncateAt;
        this.f162472j = i18;
        this.f162473k = f14;
        this.f162474l = f15;
        this.f162475m = i19;
        this.f162476n = z14;
        this.f162477o = z15;
        this.f162478p = i24;
        this.f162479q = i25;
        this.f162480r = i26;
        this.f162481s = i27;
        this.f162482t = iArr;
        this.f162483u = iArr2;
        if (!(i14 >= 0 && i14 <= i15)) {
            y5.a.a("invalid start value");
        }
        if (!(i15 >= 0 && i15 <= charSequence.length())) {
            y5.a.a("invalid end value");
        }
        if (!(i17 >= 0)) {
            y5.a.a("invalid maxLines value");
        }
        if (!(i16 >= 0)) {
            y5.a.a("invalid width value");
        }
        if (!(i18 >= 0)) {
            y5.a.a("invalid ellipsizedWidth value");
        }
        if (f14 >= 0.0f) {
            return;
        }
        y5.a.a("invalid lineSpacingMultiplier value");
    }

    public /* synthetic */ y(CharSequence charSequence, int i14, int i15, TextPaint textPaint, int i16, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i17, TextUtils.TruncateAt truncateAt, int i18, float f14, float f15, int i19, boolean z14, boolean z15, int i24, int i25, int i26, int i27, int[] iArr, int[] iArr2, int i28, p005kotlin.jvm.internal.j jVar) {
        this(charSequence, (i28 & 2) != 0 ? 0 : i14, i15, textPaint, i16, textDirectionHeuristic, alignment, i17, truncateAt, i18, f14, f15, i19, z14, z15, i24, i25, i26, i27, iArr, iArr2);
    }
}
