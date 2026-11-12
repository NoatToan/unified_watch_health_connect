package po;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lpo/w;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", FirebaseAnalytics.Param.INDEX, "", "isHighlighted", "<init>", "(Landroid/content/Context;IZ)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f138987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f138988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f138989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f138990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f138991e;

    static {
        new a(null);
    }

    public w(Context context, int i14, boolean z14) {
        int color;
        context.getClass();
        Paint paint = new Paint(1);
        this.f138987a = paint;
        Paint paint2 = new Paint(1);
        this.f138988b = paint2;
        Paint paint3 = new Paint();
        this.f138989c = paint3;
        Drawable drawableA = i14 == 0 ? j.a.a(context, R.drawable.ic_arrow_right_filled) : null;
        this.f138990d = drawableA;
        this.f138991e = i14 > 0 ? String.valueOf(i14) : null;
        int color2 = -1;
        if (z14) {
            color = a7.b.getColor(context, R.color.gray_45_static);
        } else {
            color = -1;
            color2 = a7.b.getColor(context, R.color.gray_45_static);
        }
        setBounds(0, 0, fb2.g.e(26, context), fb2.g.e(26, context));
        if (drawableA != null) {
            drawableA.setBounds(fb2.g.e(10, context), fb2.g.e(8, context), fb2.g.e(18, context), fb2.g.e(18, context));
        }
        if (drawableA != null) {
            drawableA.setTint(color2);
        }
        paint.setColor(color);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setColor(color2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.gcm3_divider_height));
        paint3.setColor(color2);
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTextSize(fb2.g.e(13, context));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        int iWidth = getBounds().width();
        float fHeight = getBounds().height();
        float f14 = fHeight / 2.0f;
        float f15 = iWidth;
        canvas.drawRoundRect(0.0f, 0.0f, f15, fHeight, f14, f14, this.f138987a);
        Paint paint = this.f138988b;
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f16 = f14 - strokeWidth;
        canvas.drawRoundRect(strokeWidth, strokeWidth, f15 - strokeWidth, fHeight - strokeWidth, f16, f16, paint);
        Drawable drawable = this.f138990d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        String str = this.f138991e;
        if (str != null) {
            Paint paint2 = this.f138989c;
            canvas.drawText(str, f15 * 0.5f, ((fHeight - paint2.descent()) - paint2.ascent()) / 2.0f, paint2);
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lpo/w$a;", "", "<init>", "()V", "", "DRAWABLE_SIZE_DP", "I", "START_ICON_LEFT_CORNER_DP", "START_ICON_TOP_CORNER_DP", "START_ICON_RIGHT_CORNER_DP", "START_ICON_BOTTOM_CORNER_DP", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ w(Context context, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, i14, (i15 & 4) != 0 ? false : z14);
    }
}
