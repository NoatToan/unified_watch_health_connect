package v30;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import fb2.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lv30/a;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "noOfClimbsAtStart", "", "isHighlighted", "<init>", "(Landroid/content/Context;IZ)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f175385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f175386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f175387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f175388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f175389e;

    static {
        new C3265a(null);
    }

    public a(Context context, int i14, boolean z14) {
        int color;
        context.getClass();
        Paint paint = new Paint(1);
        this.f175385a = paint;
        Paint paint2 = new Paint(1);
        this.f175386b = paint2;
        Paint paint3 = new Paint();
        this.f175387c = paint3;
        Drawable drawableA = j.a.a(context, R.drawable.ic_climb_system_start);
        this.f175388d = drawableA;
        this.f175389e = i14 > 1 ? String.valueOf(i14) : null;
        int color2 = -1;
        if (z14) {
            color2 = a7.b.getColor(context, R.color.gcm_tool_hint);
            color = -1;
        } else {
            color = a7.b.getColor(context, R.color.gcm_tool_hint);
        }
        setBounds(0, 0, g.e(i14 > 1 ? 40 : 22, context), g.e(22, context));
        if (drawableA != null) {
            drawableA.setBounds(g.e(5, context), g.e(7, context), g.e(17, context), g.e(15, context));
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
        paint3.setTextSize(g.e(11, context));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        int iWidth = getBounds().width();
        float fHeight = getBounds().height();
        float f14 = fHeight / 2.0f;
        float f15 = iWidth;
        canvas.drawRoundRect(0.0f, 0.0f, f15, fHeight, f14, f14, this.f175385a);
        Paint paint = this.f175386b;
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f16 = f14 - strokeWidth;
        canvas.drawRoundRect(strokeWidth, strokeWidth, f15 - strokeWidth, fHeight - strokeWidth, f16, f16, paint);
        Drawable drawable = this.f175388d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        String str = this.f175389e;
        if (str != null) {
            Paint paint2 = this.f175387c;
            canvas.drawText(str, f15 * 0.75f, ((fHeight - paint2.descent()) - paint2.ascent()) / 2.0f, paint2);
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

    /* JADX INFO: renamed from: v30.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lv30/a$a;", "", "<init>", "()V", "", "DRAWABLE_WIDTH_DP", "I", "DRAWABLE_HEIGHT_DP", "CLIMB_ICON_LEFT_CORNER_DP", "CLIMB_ICON_TOP_CORNER_DP", "CLIMB_ICON_RIGHT_CORNER_DP", "CLIMB_ICON_BOTTOM_CORNER_DP", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3265a {
        public /* synthetic */ C3265a(j jVar) {
            this();
        }

        private C3265a() {
        }
    }

    public /* synthetic */ a(Context context, int i14, boolean z14, int i15, j jVar) {
        this(context, i14, (i15 & 4) != 0 ? false : z14);
    }
}
