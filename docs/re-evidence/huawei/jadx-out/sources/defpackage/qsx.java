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
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class qsx extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f46775a = {qre.e(R.color.train_plan_rounded_gradient_bg1), qre.e(R.color.train_plan_rounded_gradient_bg2), qre.e(R.color.train_plan_rounded_gradient_bg3), qre.e(R.color.train_plan_rounded_gradient_bg4), qre.e(R.color.train_plan_rounded_gradient_bg5)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f46776c = {0.0f, 0.3f, 0.6f, 0.7f, 1.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f46777b = new Paint(1);
    private final Paint d = new Paint(1);
    private float e = qrs.d(BaseApplication.b(), 20.0f);
    private float j = qrs.d(BaseApplication.b(), 1.0f);

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public qsx() {
        this.f46777b.setStyle(Paint.Style.STROKE);
        this.f46777b.setStrokeWidth(this.j);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = new RectF(getBounds());
        float f = this.j / 2.0f;
        rectF.inset(f, f);
        float f2 = this.e;
        canvas.drawRoundRect(rectF, f2, f2, this.d);
        Path path = new Path();
        float f3 = this.e;
        path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        canvas.drawPath(path, this.f46777b);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f46777b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f46777b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f46777b.setShader(new LinearGradient(rect.right, rect.centerY(), rect.left, rect.centerY(), f46775a, f46776c, Shader.TileMode.MIRROR));
        this.d.setColor(qre.e(R.color.common_white_10alpha));
    }
}
