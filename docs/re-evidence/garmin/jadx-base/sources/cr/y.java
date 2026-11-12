package cr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcr/y;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f55309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f55310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f55312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f55313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearGradient f55314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f55315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f55316i;

    public y(Context context) {
        context.getClass();
        this.f55308a = context;
        Paint paint = new Paint(1);
        this.f55309b = paint;
        this.f55310c = new Paint(1);
        this.f55311d = a7.b.getColor(context, R.color.gcm_progress_indicator_empty);
        this.f55312e = new int[]{a7.b.getColor(context, R.color.gcm_workout_metrics_blue_color), a7.b.getColor(context, R.color.gcm_workout_metrics_blue_color), a7.b.getColor(context, R.color.gcm_workout_metrics_green_color), a7.b.getColor(context, R.color.gcm_workout_metrics_light_green_color), a7.b.getColor(context, R.color.gcm_workout_metrics_yellow_color), a7.b.getColor(context, R.color.gcm_workout_metrics_yellow_color), a7.b.getColor(context, R.color.gcm_workout_metrics_orange_color), a7.b.getColor(context, R.color.gcm_workout_metrics_orange_color), a7.b.getColor(context, R.color.gcm_workout_metrics_light_red_color), a7.b.getColor(context, R.color.gcm_workout_metrics_red_color)};
        this.f55313f = new float[]{0.0f, 0.2f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 1.0f};
        this.f55316i = context.getResources().getDimensionPixelSize(R.dimen.spacing_micro);
        paint.setColor(a7.b.getColor(context, R.color.gcm_rpe_seek_bar_dot_color_unselected));
        paint.setAlpha(125);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        float f14 = this.f55316i / 2.0f;
        int iCenterY = getBounds().centerY();
        float f15 = getBounds().left;
        float f16 = iCenterY;
        float f17 = f16 - f14;
        float f18 = f16 + f14;
        canvas.drawRoundRect(f15, f17, getBounds().right, f18, f14, f14, this.f55310c);
        float f19 = 2 * f14;
        float fWidth = (getBounds().width() - f19) / 10.0f;
        float f22 = f15;
        for (int i14 = 0; i14 < 11; i14++) {
            canvas.drawOval(f22, f17, f22 + f19, f18, this.f55309b);
            f22 += fWidth;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.getClass();
        super.onBoundsChange(rect);
        LinearGradient linearGradient = new LinearGradient(rect.left, rect.top, rect.right, rect.bottom, this.f55312e, this.f55313f, Shader.TileMode.CLAMP);
        this.f55314g = linearGradient;
        boolean z14 = this.f55315h;
        Paint paint = this.f55310c;
        if (z14) {
            paint.setShader(linearGradient);
        } else {
            paint.setShader(null);
            paint.setColor(this.f55311d);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i14) {
        this.f55310c.setAlpha(i14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55310c.setColorFilter(colorFilter);
    }
}
