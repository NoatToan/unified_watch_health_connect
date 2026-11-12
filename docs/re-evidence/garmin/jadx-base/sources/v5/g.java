package v5;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv5/g;", "Landroid/text/style/LineHeightSpan;", "", "lineHeight", "<init>", "(F)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f175709a;

    public g(float f14) {
        this.f175709a = f14;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i14, int i15, int i16, int i17, Paint.FontMetricsInt fontMetricsInt) {
        int i18 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i18 <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f175709a);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / i18)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
