package fp2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfp2/f;", "Landroid/text/style/ReplacementSpan;", "", "mPadding", "<init>", "(I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73204a;

    public f(int i14) {
        this.f73204a = i14;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f14, int i16, int i17, int i18, Paint paint) {
        canvas.getClass();
        charSequence.getClass();
        paint.getClass();
        canvas.drawText(charSequence, i14, i15, f14, i17, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i14, int i15, Paint.FontMetricsInt fontMetricsInt) {
        paint.getClass();
        charSequence.getClass();
        int i16 = i15 - i14;
        float[] fArr = new float[i16];
        paint.getTextWidths(charSequence, i14, i15, fArr);
        int i17 = this.f73204a;
        for (int i18 = 0; i18 < i16; i18++) {
            i17 += (int) fArr[i18];
        }
        return i17;
    }
}
