package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes4.dex */
public class e8p extends ReplacementSpan implements xej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16393b;
    public int c;

    public e8p(int i, int i2, int i3) {
        this.f16392a = i;
        this.f16393b = i2;
        this.c = i3;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.f16392a;
    }

    public int c() {
        return this.f16393b;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i3 = -this.c;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return this.f16393b;
    }
}
