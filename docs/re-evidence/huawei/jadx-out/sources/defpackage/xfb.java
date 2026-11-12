package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes20.dex */
public class xfb extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52826c;
    private int d;
    private int e;
    private ColorStateList f;
    private Paint g;
    private float h;
    private Paint i;
    private RectF j;
    private ColorStateList o;

    public xfb() {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.i.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint(1);
        this.g = paint2;
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.j = new RectF();
    }

    private boolean e() {
        boolean z;
        int colorForState;
        int colorForState2;
        int[] state = getState();
        ColorStateList colorStateList = this.f;
        boolean z2 = true;
        if (colorStateList == null || (colorForState2 = colorStateList.getColorForState(state, this.f52826c)) == this.f52826c) {
            z = false;
        } else {
            this.f52826c = colorForState2;
            z = true;
        }
        ColorStateList colorStateList2 = this.o;
        if (colorStateList2 == null || (colorForState = colorStateList2.getColorForState(state, this.e)) == this.e) {
            z2 = z;
        } else {
            this.e = colorForState;
        }
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public void a(int i) {
        if (i != this.f52824a) {
            this.f52824a = i;
            this.i.setStrokeWidth(i);
            invalidateSelf();
        }
    }

    public void b(float f) {
        if (Float.floatToIntBits(f) != Float.floatToIntBits(this.h)) {
            this.h = f;
            invalidateSelf();
        }
    }

    public void b(int i) {
        if (i != this.d) {
            this.d = i;
            this.g.setStrokeWidth(i);
            invalidateSelf();
        }
    }

    public void c(int i) {
        if (i != this.f52825b) {
            this.f52825b = i;
            invalidateSelf();
        }
    }

    public void d(int i) {
        this.o = ColorStateList.valueOf(i);
        e();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.j == null) {
            return;
        }
        canvas.save();
        int i = this.f52825b;
        if (i == 1) {
            Paint paint = this.i;
            if (paint != null) {
                float f = this.h * 360.0f;
                paint.setColor(this.e);
                canvas.drawArc(this.j, f - 90.0f, 360.0f - f, false, this.i);
                this.i.setColor(this.f52826c);
                canvas.drawArc(this.j, -90.0f, f, false, this.i);
            }
        } else if (i == 2 && this.g != null) {
            int iRound = Math.round(this.h * 120.0f);
            RectF rectF = this.j;
            float f2 = (rectF.left + rectF.right) * 0.5f;
            float f3 = rectF.top;
            float f4 = rectF.bottom;
            for (int i2 = 0; i2 < 120; i2++) {
                if (i2 < iRound) {
                    this.g.setColor(this.f52826c);
                } else {
                    this.g.setColor(this.e);
                }
                float f5 = this.f52824a;
                float f6 = this.d * 0.5f;
                canvas.drawLine(f2, f5 + f6, f2, f6, this.g);
                canvas.rotate(3.0f, f2, (f3 + f4) * 0.5f);
            }
        }
        canvas.restore();
    }

    public void e(int i) {
        this.f = ColorStateList.valueOf(i);
        e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.j;
        float f = rect.left;
        float f2 = this.f52824a * 0.5f;
        rectF.left = f + f2;
        rectF.top = rect.top + f2;
        rectF.right = rect.right - f2;
        rectF.bottom = rect.bottom - f2;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        return e();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
