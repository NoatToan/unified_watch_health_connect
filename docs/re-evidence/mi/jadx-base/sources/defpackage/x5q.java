package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.c;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class x5q extends a98 {
    public static Paint f;

    public x5q(z88 z88Var) {
        super(z88Var);
    }

    public static Paint c() {
        if (f == null) {
            TextPaint textPaint = new TextPaint();
            f = textPaint;
            textPaint.setColor(c.b().c());
            f.setStyle(Paint.Style.FILL);
        }
        return f;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, float f2, int i3, int i4, int i5, Paint paint) {
        if (c.b().i()) {
            canvas.drawRect(f2, i3, f2 + b(), i5, c());
        }
        a().a(canvas, f2, i4, paint);
    }
}
