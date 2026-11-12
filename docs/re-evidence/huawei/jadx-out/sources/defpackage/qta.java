package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class qta extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f46783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f46784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f46785c;
    private final float d;
    private final int[] e;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public qta() {
        Paint paint = new Paint(1);
        this.f46784b = paint;
        this.e = new int[]{qre.e(R.color.train_plan_rounded_gradient_bg1), qre.e(R.color.train_plan_rounded_gradient_bg2), qre.e(R.color.train_plan_rounded_gradient_bg3), qre.e(R.color.train_plan_rounded_gradient_bg4), qre.e(R.color.train_plan_rounded_gradient_bg5)};
        this.f46783a = new float[]{0.0f, 0.3f, 0.6f, 0.7f, 1.0f};
        this.f46785c = qre.b(R.dimen.health_common_20dp);
        float fB = qre.b(R.dimen.health_common_1dp);
        this.d = fB;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fB);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = new RectF(getBounds());
        float f = this.d / 2.0f;
        rectF.inset(f, f);
        Path path = new Path();
        float f2 = this.f46785c;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        canvas.drawPath(path, this.f46784b);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f46784b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f46784b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float f = this.d / 2.0f;
        this.f46784b.setShader(new LinearGradient(rect.right - f, rect.bottom - f, rect.left + f, rect.top + f, this.e, this.f46783a, Shader.TileMode.MIRROR));
    }
}
