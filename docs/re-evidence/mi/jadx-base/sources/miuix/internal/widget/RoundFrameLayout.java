package miuix.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.dmi;
import defpackage.e3n;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class RoundFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f26640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Path f26641b;
    public Paint c;
    public Region d;
    public RectF e;
    public float f;
    public float g;
    public int h;
    public boolean i;

    public RoundFrameLayout(Context context) {
        this(context, null);
    }

    public final void a() {
        float dimensionPixelSize = getContext().getResources().getDimensionPixelSize(dmi.i0);
        this.f = dimensionPixelSize;
        this.f26640a = new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize};
        this.e = new RectF();
        this.i = true;
        e3n.e(this, true);
        this.f26641b = new Path();
        this.d = new Region();
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(-1);
        this.c.setAntiAlias(true);
    }

    public final void b(Canvas canvas) {
        if (this.f26640a == null || this.g == 0.0f || Color.alpha(this.h) == 0) {
            return;
        }
        int iWidth = (int) this.e.width();
        int iHeight = (int) this.e.height();
        RectF rectF = new RectF();
        float f = this.g / 2.0f;
        rectF.left = getPaddingLeft() + f;
        rectF.top = getPaddingTop() + f;
        rectF.right = (iWidth - getPaddingRight()) - f;
        rectF.bottom = (iHeight - getPaddingBottom()) - f;
        this.c.reset();
        this.c.setAntiAlias(true);
        this.c.setColor(this.h);
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setStrokeWidth(this.g);
        float f2 = this.f - (f * 2.0f);
        canvas.drawRoundRect(rectF, f2, f2, this.c);
    }

    public void c(Canvas canvas) {
        if (this.f26640a == null) {
            return;
        }
        canvas.clipPath(this.f26641b);
    }

    public final void d() {
        if (this.f26640a == null) {
            return;
        }
        int iWidth = (int) this.e.width();
        int iHeight = (int) this.e.height();
        RectF rectF = new RectF();
        rectF.left = getPaddingLeft();
        rectF.top = getPaddingTop();
        rectF.right = iWidth - getPaddingRight();
        rectF.bottom = iHeight - getPaddingBottom();
        this.f26641b.reset();
        this.f26641b.addRoundRect(rectF, this.f26640a, Path.Direction.CW);
        this.d.setPath(this.f26641b, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
        b(canvas);
    }

    public void e(float f, int i) {
        this.g = f;
        this.h = i;
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.e.set(0.0f, 0.0f, i, i2);
        d();
    }

    public void setRadius(float f) {
        this.f = f;
        setRadius(new float[]{f, f, f, f, f, f, f, f});
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public void setRadius(float[] fArr) {
        if (Arrays.equals(this.f26640a, fArr)) {
            return;
        }
        this.f26640a = fArr;
        d();
        invalidate();
    }
}
