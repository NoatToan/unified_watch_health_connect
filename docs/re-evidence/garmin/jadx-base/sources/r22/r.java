package r22;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import ch.qos.logback.core.CoreConstants;
import java.lang.ref.WeakReference;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lr22/r;", "Landroid/text/style/ImageSpan;", "Lr22/o1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "drawable", "spanDrawer", "<init>", "(Landroid/content/Context;ILr22/o1;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends ImageSpan implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f149823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<Drawable> f149824b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i14, o1 o1Var) {
        super(context, i14);
        context.getClass();
        o1Var.getClass();
        this.f149823a = o1Var;
    }

    @Override // r22.o1
    public final void a(Drawable drawable, Canvas canvas, CharSequence charSequence, int i14, int i15, float f14, int i16, int i17, int i18, Paint paint) {
        this.f149823a.a(drawable, canvas, charSequence, i14, i15, f14, i16, i17, i18, paint);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f14, int i16, int i17, int i18, Paint paint) {
        Drawable drawable;
        canvas.getClass();
        charSequence.getClass();
        paint.getClass();
        WeakReference<Drawable> weakReference = this.f149824b;
        if (weakReference == null || (drawable = weakReference.get()) == null) {
            drawable = getDrawable();
        }
        Drawable drawable2 = drawable;
        if (this.f149824b == null) {
            this.f149824b = new WeakReference<>(drawable2);
        }
        if (drawable2 != null) {
            this.f149823a.a(drawable2, canvas, charSequence, i14, i15, f14, i16, i17, i18, paint);
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i14, int i15, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable;
        paint.getClass();
        charSequence.getClass();
        WeakReference<Drawable> weakReference = this.f149824b;
        if (weakReference == null || (drawable = weakReference.get()) == null) {
            drawable = getDrawable();
        }
        if (this.f149824b == null) {
            this.f149824b = new WeakReference<>(drawable);
        }
        Rect bounds = drawable != null ? drawable.getBounds() : null;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        if (bounds != null) {
            return bounds.right;
        }
        return 0;
    }
}
