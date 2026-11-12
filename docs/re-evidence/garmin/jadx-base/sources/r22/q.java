package r22;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr22/q;", "Lr22/o1;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements o1 {
    @Override // r22.o1
    public final void a(Drawable drawable, Canvas canvas, CharSequence charSequence, int i14, int i15, float f14, int i16, int i17, int i18, Paint paint) {
        canvas.save();
        canvas.translate(f14, ((i18 - paint.getFontMetricsInt().descent) - (((paint.getFontMetricsInt().bottom - paint.getFontMetricsInt().descent) - (paint.getFontMetricsInt().top + paint.getFontMetricsInt().ascent)) / 2)) + drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        canvas.restore();
    }
}
