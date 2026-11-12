package u40;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lu40/d;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "", "isHighlighted", "", "name", "", "alphaValue", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/courses/model/f;ZLjava/lang/String;F)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.f f168550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f168552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f168553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f168554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f168555f;

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f A[PHI: r10
      0x005f: PHI (r10v6 float) = (r10v1 float), (r10v2 float) binds: [B:14:0x005d, B:17:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    public d(Context context, com.garmin.android.apps.connectmobile.courses.model.f fVar, boolean z14, String str, float f14) {
        context.getClass();
        fVar.getClass();
        this.f168550a = fVar;
        this.f168551b = str;
        Paint paint = new Paint(1);
        this.f168552c = paint;
        Paint paint2 = new Paint(1);
        this.f168553d = paint2;
        Paint paint3 = new Paint(1);
        this.f168554e = paint3;
        int color = z14 ? -1 : a7.b.getColor(context, R.color.violet_60_static);
        int color2 = z14 ? a7.b.getColor(context, R.color.violet_60_static) : -1;
        Drawable drawableA = f.a(fVar, context, fb2.g.e(24, context), color2);
        this.f168555f = drawableA;
        int iE = fb2.g.e(24, context);
        if (fVar != com.garmin.android.apps.connectmobile.courses.model.f.MARKER_HALF_MARATHON || str == null) {
            setBounds(0, 0, iE, iE);
        } else {
            setBounds(0, 0, fb2.g.e(32, context), iE);
        }
        float f15 = 1.0f;
        if (f14 <= 1.0f) {
            f15 = 0.0f;
            f14 = f14 < 0.0f ? f15 : f14;
        }
        int i14 = (int) (f14 * 255);
        if (drawableA != null) {
            drawableA.setAlpha(i14);
        }
        paint.setColor(color);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAlpha(i14);
        paint2.setColor(color2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.gcm3_divider_height));
        paint2.setAlpha(i14);
        paint3.setColor(color2);
        paint3.setStyle(style);
        paint3.setTextSize(30.0f);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setAlpha(i14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.getClass();
        int iWidth = getBounds().width();
        float fHeight = getBounds().height();
        float f14 = fHeight / 2.0f;
        float f15 = iWidth;
        float f16 = f15 / 2.0f;
        Paint paint = this.f168554e;
        float fAscent = f14 - ((paint.ascent() + paint.descent()) / 2.0f);
        com.garmin.android.apps.connectmobile.courses.model.f fVar = com.garmin.android.apps.connectmobile.courses.model.f.MARKER_HALF_MARATHON;
        Paint paint2 = this.f168552c;
        String str = this.f168551b;
        com.garmin.android.apps.connectmobile.courses.model.f fVar2 = this.f168550a;
        if (fVar2 != fVar || str == null) {
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, f15, fHeight, f14, f14, paint2);
        } else {
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, f15, fHeight, f14, f14, paint2);
        }
        if (x.k(com.garmin.android.apps.connectmobile.courses.model.f.MARKER_MILE, com.garmin.android.apps.connectmobile.courses.model.f.MARKER_KILOMETER, fVar).contains(fVar2) && str != null) {
            canvas2.drawText(str, f16, fAscent, paint);
        } else if (fVar2 == fVar && str != null) {
            canvas2.drawText(str, f16, fAscent, paint);
        }
        Paint paint3 = this.f168553d;
        float strokeWidth = paint3.getStrokeWidth() / 2.0f;
        float f17 = f14 - strokeWidth;
        canvas2.drawRoundRect(strokeWidth, strokeWidth, f15 - strokeWidth, fHeight - strokeWidth, f17, f17, paint3);
        Drawable drawable = this.f168555f;
        if (drawable != null) {
            drawable.draw(canvas2);
        }
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lu40/d$a;", "", "<init>", "()V", "", "DRAWABLE_SIZE_DP", "I", "DRAWABLE_SIZE_DP_WIDTH_ROUNDED_RECT", "", "LAP_POINT_X", "F", "LAP_POINT_Y", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(Context context, com.garmin.android.apps.connectmobile.courses.model.f fVar, boolean z14, String str, float f14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, fVar, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? 1.0f : f14);
    }
}
