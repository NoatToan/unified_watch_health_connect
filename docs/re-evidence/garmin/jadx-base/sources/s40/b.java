package s40;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ls40/b;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/courses/model/h;", "coursePointOfInterestType", "", "isHighlighted", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/courses/model/h;Z)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f157046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f157047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BitmapDrawable f157048c;

    static {
        new a(null);
    }

    public b(Context context, com.garmin.android.apps.connectmobile.courses.model.h hVar, boolean z14) {
        int color;
        context.getClass();
        hVar.getClass();
        Paint paint = new Paint(1);
        this.f157046a = paint;
        Paint paint2 = new Paint(1);
        this.f157047b = paint2;
        int color2 = -1;
        if (z14) {
            color2 = a7.b.getColor(context, R.color.purple_40_static);
            color = -1;
        } else {
            color = a7.b.getColor(context, R.color.purple_40_static);
        }
        int iE = fb2.g.e(24, context);
        setBounds(0, 0, iE, iE);
        BitmapDrawable bitmapDrawableB = c.b(hVar.f32966b, context, fb2.g.e(14, context), color2);
        this.f157048c = bitmapDrawableB;
        bitmapDrawableB.setBounds(fb2.g.e(5, context), fb2.g.e(5, context), fb2.g.e(19, context), fb2.g.e(19, context));
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        paint2.setColor(color2);
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
        canvas.drawRoundRect(0.0f, 0.0f, f15, fHeight, f14, f14, this.f157046a);
        Paint paint = this.f157047b;
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f16 = f14 - strokeWidth;
        canvas.drawRoundRect(strokeWidth, strokeWidth, f15 - strokeWidth, fHeight - strokeWidth, f16, f16, paint);
        this.f157048c.draw(canvas);
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Ls40/b$a;", "", "<init>", "()V", "", "DRAWABLE_SIZE_DP", "I", "ICON_LEFT_CORNER_DP", "ICON_TOP_CORNER_DP", "ICON_RIGHT_CORNER_DP", "ICON_BOTTOM_CORNER_DP", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(Context context, com.garmin.android.apps.connectmobile.courses.model.h hVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, hVar, (i14 & 4) != 0 ? false : z14);
    }
}
