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

/* JADX INFO: loaded from: classes32.dex */
public class inw extends Drawable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f37883c;
    private final Paint d;
    private float h;
    private final Paint j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f37882b = {-15104, -23689, -39155, -630930, -6120193, -16715777};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f37881a = {452962681, 452949798, 452944717, 452945012, 449018623, 449018623};
    private static final float[] e = {0.0f, 0.24f, 0.43f, 0.62f, 0.81f, 1.0f};

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public inw(int i, int i2) {
        Paint paint = new Paint(1);
        this.j = paint;
        this.d = new Paint(1);
        this.f37883c = qrs.d(BaseApplication.b(), i > 0 ? i : 48.0f);
        this.h = qrs.d(BaseApplication.b(), i2 > 0 ? i2 : 1.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = new RectF(getBounds());
        float f = this.h / 2.0f;
        rectF.inset(f, f);
        float f2 = this.f37883c;
        canvas.drawRoundRect(rectF, f2, f2, this.d);
        Path path = new Path();
        float f3 = this.f37883c;
        path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        canvas.drawPath(path, this.j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.j.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        int[] iArr = f37882b;
        float[] fArr = e;
        this.j.setShader(new LinearGradient(f, f2, f3, f4, iArr, fArr, Shader.TileMode.CLAMP));
        this.d.setShader(new LinearGradient(rect.left, rect.top, rect.right, rect.bottom, f37881a, fArr, Shader.TileMode.CLAMP));
    }
}
