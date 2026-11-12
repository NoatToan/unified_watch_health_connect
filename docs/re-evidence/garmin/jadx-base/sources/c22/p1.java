package c22;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc22/p1;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "text", "", "bgColor", "<init>", "(Landroid/content/Context;Ljava/lang/String;I)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p1 extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f23189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f23190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f23191d;

    public p1(Context context, String str, int i14) {
        context.getClass();
        str.getClass();
        this.f23188a = str;
        Paint paint = new Paint();
        this.f23189b = paint;
        Paint paint2 = new Paint();
        this.f23190c = paint2;
        this.f23191d = new RectF();
        Typeface typefaceA = h22.a.a("font/roboto_light.ttf", context);
        paint.setColor(i14);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-16777216);
        paint2.setAntiAlias(true);
        paint2.setFakeBoldText(true);
        paint2.setStyle(style);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(typefaceA);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Rect bounds = getBounds();
        RectF rectF = this.f23191d;
        rectF.set(bounds);
        canvas.drawOval(rectF, this.f23189b);
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        float fMin = Math.min(iWidth, iHeight) / 2.0f;
        Paint paint = this.f23190c;
        paint.setTextSize(fMin);
        canvas.drawText(this.f23188a, iWidth / 2.0f, ((iHeight - paint.descent()) - paint.ascent()) / 2.0f, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i14) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
