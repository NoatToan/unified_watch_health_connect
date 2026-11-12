package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public abstract class a98 extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z88 f795b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f794a = new Paint.FontMetricsInt();
    public short c = -1;
    public short d = -1;
    public float e = 1.0f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public a98(z88 z88Var) {
        g6i.h(z88Var, "metadata cannot be null");
        this.f795b = z88Var;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final z88 a() {
        return this.f795b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final int b() {
        return this.c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f794a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f794a;
        this.e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f795b.e();
        this.d = (short) (this.f795b.e() * this.e);
        short sI = (short) (this.f795b.i() * this.e);
        this.c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f794a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
