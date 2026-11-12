package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.VisibleForTesting;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class kza extends Drawable implements qza.b, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f24443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24444b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public boolean h;
    public Paint i;
    public Rect j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<cb1> f24445k;

    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @VisibleForTesting
        public final qza f24446a;

        public a(qza qzaVar) {
            this.f24446a = qzaVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new kza(this);
        }
    }

    public kza(Context context, jza jzaVar, lyp<Bitmap> lypVar, int i, int i2, Bitmap bitmap) {
        this(new a(new qza(com.bumptech.glide.a.d(context), jzaVar, i, i2, lypVar, bitmap)));
    }

    @Override // qza.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f++;
        }
        int i = this.g;
        if (i == -1 || this.f < i) {
            return;
        }
        j();
        stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    public ByteBuffer c() {
        return this.f24443a.f24446a.b();
    }

    public final Rect d() {
        if (this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.d) {
            return;
        }
        if (this.h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.h = false;
        }
        canvas.drawBitmap(this.f24443a.f24446a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f24443a.f24446a.e();
    }

    public int f() {
        return this.f24443a.f24446a.f();
    }

    public int g() {
        return this.f24443a.f24446a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f24443a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f24443a.f24446a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f24443a.f24446a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public final Paint h() {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    public int i() {
        return this.f24443a.f24446a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f24444b;
    }

    public final void j() {
        List<cb1> list = this.f24445k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f24445k.get(i).onAnimationEnd(this);
            }
        }
    }

    public void k() {
        this.d = true;
        this.f24443a.f24446a.a();
    }

    public final void l() {
        this.f = 0;
    }

    public void m(lyp<Bitmap> lypVar, Bitmap bitmap) {
        this.f24443a.f24446a.o(lypVar, bitmap);
    }

    public final void n() {
        a6i.a(!this.d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f24443a.f24446a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f24444b) {
                return;
            }
            this.f24444b = true;
            this.f24443a.f24446a.r(this);
            invalidateSelf();
        }
    }

    public final void o() {
        this.f24444b = false;
        this.f24443a.f24446a.s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        h().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        a6i.a(!this.d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.e = z;
        if (!z) {
            o();
        } else if (this.c) {
            n();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.c = true;
        l();
        if (this.e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.c = false;
        o();
    }

    public kza(a aVar) {
        this.e = true;
        this.g = -1;
        this.f24443a = (a) a6i.d(aVar);
    }
}
