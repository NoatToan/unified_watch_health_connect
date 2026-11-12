package hj;

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
import java.util.ArrayList;
import ui.l;

/* JADX INFO: loaded from: classes7.dex */
public class c extends Drawable implements g.b, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f83923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f83924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f83925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f83926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f83927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f83929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f83930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f83931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f83932j;

    public c(Context context, si.a aVar, l<Bitmap> lVar, int i14, int i15, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.b(context), aVar, i14, i15, lVar, bitmap)));
    }

    @Override // hj.g.b
    public final void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        g gVar = this.f83923a.f83933a;
        g.a aVar = gVar.f83943i;
        if ((aVar != null ? aVar.f83953e : -1) == gVar.f83935a.c() - 1) {
            this.f83928f++;
        }
        int i14 = this.f83929g;
        if (i14 == -1 || this.f83928f < i14) {
            return;
        }
        stop();
    }

    public final void b() {
        qj.l.a(!this.f83926d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        a aVar = this.f83923a;
        if (aVar.f83933a.f83935a.c() == 1) {
            invalidateSelf();
            return;
        }
        if (this.f83924b) {
            return;
        }
        this.f83924b = true;
        g gVar = aVar.f83933a;
        ArrayList arrayList = gVar.f83937c;
        if (gVar.f83944j) {
            vb.h.z("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            vb.h.z("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !gVar.f83940f) {
            gVar.f83940f = true;
            gVar.f83944j = false;
            gVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f83926d) {
            return;
        }
        if (this.f83930h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f83932j == null) {
                this.f83932j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f83932j);
            this.f83930h = false;
        }
        g gVar = this.f83923a.f83933a;
        g.a aVar = gVar.f83943i;
        Bitmap bitmap = aVar != null ? aVar.f83955g : gVar.f83946l;
        if (this.f83932j == null) {
            this.f83932j = new Rect();
        }
        Rect rect = this.f83932j;
        if (this.f83931i == null) {
            this.f83931i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f83931i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f83923a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f83923a.f83933a.f83951q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f83923a.f83933a.f83950p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f83924b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f83930h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i14) {
        if (this.f83931i == null) {
            this.f83931i = new Paint(2);
        }
        this.f83931i.setAlpha(i14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f83931i == null) {
            this.f83931i = new Paint(2);
        }
        this.f83931i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z14, boolean z15) {
        qj.l.a(!this.f83926d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f83927e = z14;
        if (!z14) {
            this.f83924b = false;
            g gVar = this.f83923a.f83933a;
            ArrayList arrayList = gVar.f83937c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                gVar.f83940f = false;
            }
        } else if (this.f83925c) {
            b();
        }
        return super.setVisible(z14, z15);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f83925c = true;
        this.f83928f = 0;
        if (this.f83927e) {
            b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f83925c = false;
        this.f83924b = false;
        g gVar = this.f83923a.f83933a;
        ArrayList arrayList = gVar.f83937c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            gVar.f83940f = false;
        }
    }

    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f83933a;

        public a(g gVar) {
            this.f83933a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    @Deprecated
    public c(Context context, si.a aVar, xi.d dVar, l<Bitmap> lVar, int i14, int i15, Bitmap bitmap) {
        this(context, aVar, lVar, i14, i15, bitmap);
    }

    public c(a aVar) {
        this.f83927e = true;
        this.f83929g = -1;
        qj.l.c(aVar, "Argument must not be null");
        this.f83923a = aVar;
    }

    public c(g gVar, Paint paint) {
        this(new a(gVar));
        this.f83931i = paint;
    }
}
