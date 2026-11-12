package a8;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1911b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f1910a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f1912c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1913d = 1.0f;

    public g(j jVar) {
        k7.h.e(jVar, "rasterizer cannot be null");
        this.f1911b = jVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i14, int i15, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1910a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        j jVar = this.f1911b;
        b8.a aVarB = jVar.b();
        int iA = aVarB.a(14);
        this.f1913d = fAbs / (iA != 0 ? aVarB.f16373b.getShort(iA + aVarB.f16372a) : (short) 0);
        b8.a aVarB2 = jVar.b();
        int iA2 = aVarB2.a(14);
        if (iA2 != 0) {
            aVarB2.f16373b.getShort(iA2 + aVarB2.f16372a);
        }
        b8.a aVarB3 = jVar.b();
        int iA3 = aVarB3.a(12);
        short s8 = (short) ((iA3 != 0 ? aVarB3.f16373b.getShort(iA3 + aVarB3.f16372a) : (short) 0) * this.f1913d);
        this.f1912c = s8;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s8;
    }
}
