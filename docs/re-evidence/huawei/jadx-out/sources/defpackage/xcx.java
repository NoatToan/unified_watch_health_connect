package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.util.Log;

/* JADX INFO: loaded from: classes20.dex */
public class xcx extends BitmapDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f52715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f52716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f52717c;
    private int d;
    private int e;
    private Paint f;
    private float g;
    private float h;
    private Handler i;
    private float j;
    private Runnable l;

    class c implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f52718c = 0.0f;

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float f = this.f52718c + 0.125f;
            this.f52718c = f;
            if (f > 1.0f) {
                this.f52718c = f - 1.0f;
            }
            xcx.this.b(this.f52718c);
            xcx.this.i.postDelayed(this, xcx.this.e);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (canvas == null) {
            Log.e("HwLowFrameLoadingDrawable", "draw error: canvas is null.");
            return;
        }
        this.f.setColor(this.d);
        d(canvas);
        if (this.f52716b > 1.0f) {
            this.f52716b = 0.0f;
        }
        canvas.save();
        for (int i = 0; i < 8; i++) {
            int i2 = (int) (this.f52716b / 0.125f);
            int i3 = i2 + 3;
            if (i3 > 8) {
                if (i >= i2 || i < i2 - 5) {
                    this.f.setColor(-13421773);
                } else {
                    this.f.setColor(-7697782);
                }
            } else if (i < i2 || i >= i3) {
                this.f.setColor(-7697782);
            } else {
                this.f.setColor(-13421773);
            }
            canvas.drawCircle(this.g, this.j, this.f52717c, this.f);
            canvas.rotate(45.0f, this.f52715a, this.h);
        }
        canvas.restore();
    }

    public xcx(Resources resources, int i, int i2) {
        super(resources, Bitmap.createBitmap(Math.min(i, 250), Math.min(i, 250), Bitmap.Config.ARGB_8888));
        this.f52716b = 0.0f;
        this.i = new Handler();
        this.l = new c();
        this.e = i2;
        c();
    }

    private void d(Canvas canvas) {
        float fB = b(canvas);
        this.f52717c = 0.125f * fB;
        this.g = this.f52715a;
        this.j = this.h - (fB * 0.85f);
    }

    private void c() {
        Paint paint = new Paint();
        this.f = paint;
        this.f52715a = 0.0f;
        this.h = 0.0f;
        this.d = -7697782;
        paint.setColor(-7697782);
        this.f.setAntiAlias(true);
        b(0.0f);
        this.i.postDelayed(this.l, this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f) {
        this.f52716b = f;
        invalidateSelf();
    }

    private float b(Canvas canvas) {
        this.f52715a = canvas.getWidth() * 0.5f;
        float height = canvas.getHeight() * 0.5f;
        this.h = height;
        return Math.min(this.f52715a, height);
    }
}
