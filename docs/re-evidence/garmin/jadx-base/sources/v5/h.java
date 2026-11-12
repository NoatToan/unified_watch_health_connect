package v5;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv5/h;", "Landroid/text/style/LineHeightSpan;", "", "lineHeight", "", "startIndex", "endIndex", "", "trimFirstLineTop", "trimLastLineBottom", "topRatio", "Ld6/f$c;", "mode", "<init>", "(FIIZZFILkotlin/jvm/internal/j;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f175710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f175711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f175712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f175713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f175714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f175715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f175716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f175717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f175718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f175719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f175720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f175721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f175722m;

    private h(float f14, int i14, int i15, boolean z14, boolean z15, float f15, int i16) {
        this.f175710a = f14;
        this.f175711b = i14;
        this.f175712c = i15;
        this.f175713d = z14;
        this.f175714e = z15;
        this.f175715f = f15;
        this.f175716g = i16;
        this.f175717h = Integer.MIN_VALUE;
        this.f175718i = Integer.MIN_VALUE;
        this.f175719j = Integer.MIN_VALUE;
        this.f175720k = Integer.MIN_VALUE;
        if ((0.0f <= f15 && f15 <= 1.0f) || f15 == -1.0f) {
            return;
        }
        y5.a.c("topRatio should be in [0..1] range or -1");
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i14, int i15, int i16, int i17, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        boolean z14 = i14 == this.f175711b;
        boolean z15 = i15 == this.f175712c;
        int i18 = this.f175716g;
        boolean z16 = this.f175714e;
        boolean z17 = this.f175713d;
        if (z14 && z15 && z17 && z16) {
            d6.f.c.f57740b.getClass();
            if (i18 != d6.f.c.f57742d) {
                return;
            }
        }
        if (this.f175717h == Integer.MIN_VALUE) {
            int i19 = fontMetricsInt.descent - fontMetricsInt.ascent;
            int iCeil = (int) Math.ceil(this.f175710a);
            int i24 = iCeil - i19;
            d6.f.c.f57740b.getClass();
            if (i18 != d6.f.c.f57741c || i24 > 0) {
                float fAbs = this.f175715f;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i24 <= 0 ? Math.ceil(i24 * fAbs) : Math.ceil((1.0f - fAbs) * i24));
                int i25 = fontMetricsInt.descent;
                int i26 = iCeil2 + i25;
                this.f175719j = i26;
                int i27 = i26 - iCeil;
                this.f175718i = i27;
                if (i18 == 0 || i24 >= 0) {
                    if (z17) {
                        i27 = fontMetricsInt.ascent;
                    }
                    this.f175717h = i27;
                    if (z16) {
                        i26 = i25;
                    }
                    this.f175720k = i26;
                    this.f175721l = fontMetricsInt.ascent - i27;
                    this.f175722m = i26 - i25;
                } else if (i18 == d6.f.c.f57742d) {
                    int i28 = fontMetricsInt.ascent;
                    this.f175717h = z17 ? Math.max(i28, i27) : Math.min(i28, i27);
                    int i29 = fontMetricsInt.descent;
                    int i30 = this.f175719j;
                    this.f175720k = z16 ? Math.min(i29, i30) : Math.max(i29, i30);
                    this.f175721l = 0;
                    this.f175722m = 0;
                }
            } else {
                int i34 = fontMetricsInt.ascent;
                this.f175718i = i34;
                int i35 = fontMetricsInt.descent;
                this.f175719j = i35;
                this.f175717h = i34;
                this.f175720k = i35;
                this.f175721l = 0;
                this.f175722m = 0;
            }
        }
        fontMetricsInt.ascent = z14 ? this.f175717h : this.f175718i;
        fontMetricsInt.descent = z15 ? this.f175720k : this.f175719j;
    }

    public /* synthetic */ h(float f14, int i14, int i15, boolean z14, boolean z15, float f15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(f14, i14, i15, z14, z15, f15, i16);
    }
}
