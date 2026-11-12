package s40;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ls40/a;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/courses/model/h;", "coursePointOfInterestType", "", "count", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/courses/model/h;I)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f157040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f157041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f157042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitmapDrawable f157043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f157044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f157045f;

    static {
        new C2960a(null);
    }

    public a(Context context, com.garmin.android.apps.connectmobile.courses.model.h hVar, int i14) {
        context.getClass();
        hVar.getClass();
        Paint paint = new Paint(1);
        this.f157040a = paint;
        Paint paint2 = new Paint(1);
        this.f157041b = paint2;
        Paint paint3 = new Paint(1);
        this.f157042c = paint3;
        String strValueOf = i14 > 99 ? "99+" : String.valueOf(i14);
        this.f157044e = strValueOf;
        int color = a7.b.getColor(context, R.color.purple_40_static);
        int iE = fb2.g.e(24, context);
        int iE2 = fb2.g.e(5, context);
        int iE3 = fb2.g.e(5, context);
        int iE4 = fb2.g.e(19, context);
        int iE5 = fb2.g.e(19, context);
        paint3.setColor(-1);
        paint3.setTextAlign(Paint.Align.LEFT);
        paint3.setTypeface(Typeface.DEFAULT_BOLD);
        paint3.setTextSize(fb2.g.e(12, context));
        float fE = fb2.g.e(1, context) + iE4;
        this.f157045f = fE;
        setBounds(0, 0, (int) (paint3.measureText(strValueOf) + fE + fb2.g.e(7, context)), iE);
        BitmapDrawable bitmapDrawableB = c.b(hVar.f32966b, context, iE4 - iE2, -1);
        this.f157043d = bitmapDrawableB;
        bitmapDrawableB.setBounds(iE2, iE3, iE4, iE5);
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.gcm3_divider_height));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        int iWidth = getBounds().width();
        float fHeight = getBounds().height();
        float f14 = fHeight / 2.0f;
        float f15 = iWidth;
        canvas.drawRoundRect(0.0f, 0.0f, f15, fHeight, f14, f14, this.f157040a);
        Paint paint = this.f157041b;
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f16 = f14 - strokeWidth;
        canvas.drawRoundRect(strokeWidth, strokeWidth, f15 - strokeWidth, fHeight - strokeWidth, f16, f16, paint);
        this.f157043d.draw(canvas);
        Paint paint2 = this.f157042c;
        canvas.drawText(this.f157044e, this.f157045f, f14 - ((paint2.ascent() + paint2.descent()) / 2.0f), paint2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
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

    /* JADX INFO: renamed from: s40.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Ls40/a$a;", "", "<init>", "()V", "", "DRAWABLE_SIZE_DP", "I", "ICON_LEFT_CORNER_DP", "ICON_TOP_CORNER_DP", "ICON_RIGHT_CORNER_DP", "ICON_BOTTOM_CORNER_DP", "ICON_TEXT_GAP_DP", "TEXT_END_PADDING_DP", "TEXT_SIZE_DP", "MAX_DISPLAYED_COUNT", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2960a {
        public /* synthetic */ C2960a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2960a() {
        }
    }
}
