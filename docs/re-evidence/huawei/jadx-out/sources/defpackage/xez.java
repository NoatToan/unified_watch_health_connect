package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes20.dex */
public class xez extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f52816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f52817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f52818c;
    private float d;
    private float e;
    private int i;
    private LinearGradient m;
    private long n;
    private int f = 1728053247;
    private boolean h = true;
    private float j = 0.0f;
    private boolean g = false;
    private Runnable l = new c();

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xez.this.invalidateSelf();
        }
    }

    public xez() {
        Paint paint = new Paint();
        this.f52817b = paint;
        paint.setAntiAlias(true);
        this.f52817b.setStyle(Paint.Style.FILL);
        this.f52816a = 0.0f;
        this.e = 0.0f;
        a(2);
    }

    private void a(long j) {
        this.n = j;
    }

    private boolean f() {
        return this.g && this.h;
    }

    private void g() {
        this.f52818c = -this.e;
    }

    private void h() {
        int i = this.f;
        int i2 = 16777215 & i;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.e, 0.0f, new int[]{i2, i, i2}, new float[]{0.0f, 0.93f, 1.0f}, Shader.TileMode.CLAMP);
        this.m = linearGradient;
        this.f52817b.setShader(linearGradient);
    }

    private boolean i() {
        return this.i == 2;
    }

    private void j() {
        this.j = (this.e + this.d) / 2000.0f;
        if (this.h) {
            this.h = false;
        }
    }

    public void a() {
        if (this.i == 0) {
            return;
        }
        this.g = false;
        a(System.currentTimeMillis());
        scheduleSelf(this.l, 0L);
        a(0);
    }

    public void c() {
        g();
        a(2);
    }

    public void d() {
        if (this.i == 1) {
            return;
        }
        this.g = true;
        a(1);
    }

    public void d(int i) {
        if (this.f != i) {
            this.f = i;
            h();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (i()) {
            this.g = false;
            return;
        }
        j();
        float fB = this.f52818c + (this.j * b());
        if (Float.compare(fB, this.d) > 0) {
            int i = (int) this.d;
            if (i != 0) {
                fB = (fB % i) - this.e;
            }
            this.h = true;
        }
        this.f52818c = fB;
        canvas.save();
        canvas.translate(fB, 0.0f);
        Rect bounds = getBounds();
        float f = Float.compare(this.e + fB, this.d) > 0 ? this.d - fB : this.e;
        if (Float.compare(fB, 0.0f) < 0) {
            float f2 = bounds.left - fB;
            canvas.clipRect(f2, bounds.top, f2 + f, bounds.bottom);
        }
        float f3 = bounds.left;
        canvas.drawRect(f3, bounds.top, f3 + f, bounds.bottom, this.f52817b);
        canvas.restore();
        scheduleSelf(this.l, 0L);
        if (f()) {
            this.g = false;
            c();
        }
    }

    public boolean e() {
        return this.i != 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        this.d = (this.f52816a * i) / 10000.0f;
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        b(rect.left, rect.right);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    private long b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.n;
        a(jCurrentTimeMillis);
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        b(i, i3);
    }

    private void a(int i) {
        this.i = i;
    }

    private void b(float f, float f2) {
        float f3 = f2 - f;
        this.f52816a = f3;
        float level = (f3 * getLevel()) / 10000.0f;
        this.d = level;
        float f4 = this.f52816a * 0.3f;
        this.e = f4;
        this.j = (f4 + level) / 2000.0f;
        g();
        h();
    }
}
