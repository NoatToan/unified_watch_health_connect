package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class qsw extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f46773a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f46774c;
    private float d;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public qsw() {
        Paint paint = new Paint(1);
        this.f46774c = paint;
        this.d = qrs.d(BaseApplication.b(), 20.0f);
        this.f46773a = qrs.d(BaseApplication.b(), 1.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f46773a);
        paint.setColor(qre.e(R.color.emui_fab_shadow_start));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = new RectF(getBounds());
        float f = this.f46773a / 2.0f;
        rectF.inset(f, f);
        Path path = new Path();
        float f2 = this.d;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        canvas.drawPath(path, this.f46774c);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f46774c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f46774c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
    }
}
