package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.huawei.uikit.animations.drawable.HwEclipseClipDrawable;

/* JADX INFO: loaded from: classes20.dex */
public class xcy extends HwEclipseClipDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f52719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RectF f52720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RectF f52721c;
    private float d;
    private Path e;
    private float g;
    private Rect i;

    public xcy(Drawable drawable, int i, int i2) {
        super(drawable, i, i2);
        this.e = new Path();
        this.f52721c = new RectF();
        this.f52720b = new RectF();
        d();
    }

    private void a(float f) {
        this.e.reset();
        this.e.addArc(this.f52721c, 90.0f, 180.0f);
        float fB = Float.compare(b(), 0.0f) != 0 ? (f / b()) * this.g : 0.0f;
        Rect rect = this.i;
        float fHeight = rect.left + rect.height();
        RectF rectF = this.f52720b;
        Rect rect2 = this.i;
        rectF.set(rect2.left + fB, rect2.top, fHeight - fB, rect2.bottom);
        this.e.addArc(this.f52720b, 270.0f, -180.0f);
    }

    private float b(float f) {
        return f / 2.0f;
    }

    private void c(float f) {
        this.e.reset();
        this.e.addArc(this.f52721c, 90.0f, 180.0f);
        Rect rect = this.i;
        float f2 = rect.left;
        float f3 = this.g;
        float fWidth = rect.width();
        Rect rect2 = this.i;
        this.e.addRect(f2 + f3, rect2.top, (fWidth * f) + rect2.left, rect2.bottom, Path.Direction.CCW);
    }

    private void d() {
        Rect bounds = getBounds();
        this.i = bounds;
        int i = bounds.left;
        d(i, bounds.top, i + bounds.height(), this.i.bottom);
        this.g = b(this.i.height());
    }

    private void e(float f) {
        this.f52719a = f;
    }

    private void j(float f) {
        this.e.reset();
        this.e.addArc(this.f52721c, 90.0f, 180.0f);
        float f2 = this.i.right - this.g;
        if (Float.compare(b(), a()) != 0) {
            Path path = this.e;
            Rect rect = this.i;
            path.addRect(this.g + rect.left, rect.top, f2, rect.bottom, Path.Direction.CCW);
        }
        float fA = Float.compare(b(), 0.0f) != 0 ? ((f - a()) / b()) * this.g : 0.0f;
        RectF rectF = this.f52720b;
        Rect rect2 = this.i;
        rectF.set(f2 - fA, rect2.top, f2 + fA, rect2.bottom);
        this.e.addArc(this.f52720b, 270.0f, 180.0f);
    }

    protected float a() {
        return this.d;
    }

    protected float b() {
        return this.f52719a;
    }

    void d(float f, float f2, float f3, float f4) {
        this.f52721c.set(f, f2, f3, f4);
    }

    @Override // com.huawei.uikit.animations.drawable.HwEclipseClipDrawable
    public Path getClipPath(int i) {
        float f = i / 10000.0f;
        if (Float.compare(f, b()) < 0) {
            a(f);
        } else if (Float.compare(f, a()) < 0) {
            c(f);
        } else {
            j(f);
        }
        return this.e;
    }

    @Override // com.huawei.uikit.animations.drawable.HwEclipseClipDrawable, android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        c(i, i2, i3, i4);
        int i5 = i3 - i;
        if (i5 != 0) {
            e(this.g / i5);
            d(1.0f - b());
        }
    }

    void c(int i, int i2, int i3, int i4) {
        this.i.set(i, i2, i3, i4);
        int i5 = i4 - i2;
        d(i, i2, i + i5, i4);
        this.g = b(i5);
    }

    private void d(float f) {
        this.d = f;
    }
}
