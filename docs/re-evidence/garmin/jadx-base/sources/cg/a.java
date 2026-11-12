package cg;

import am.j;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import j23.t;
import java.util.ArrayList;
import lf.g;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import vb.h;
import xf.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000fBE\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcg/a;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "", TtmlNode.START, TtmlNode.END, "Lxf/f;", "scale", "", "durationMillis", "", "fadeStart", "preferExactIntrinsicSize", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lxf/f;IZZ)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f27095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f27099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f27102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f27105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Drawable f27106l;

    static {
        new C0415a(null);
    }

    public a(Drawable drawable, Drawable drawable2, f fVar, int i14, boolean z14, boolean z15) {
        this.f27095a = fVar;
        this.f27096b = i14;
        this.f27097c = z14;
        this.f27098d = z15;
        this.f27099e = new ArrayList();
        this.f27100f = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f27101g = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f27103i = 255;
        this.f27105k = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.f27106l = drawableMutate;
        if (i14 <= 0) {
            h.s("durationMillis must be > 0.");
            throw null;
        }
        Drawable drawable3 = this.f27105k;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate != null) {
            drawableMutate.setCallback(this);
        }
    }

    public final int a(Integer num, Integer num2) {
        if (this.f27098d || ((num == null || num.intValue() != -1) && (num2 == null || num2.intValue() != -1))) {
            return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        }
        return -1;
    }

    public final void b() {
        this.f27104j = 2;
        this.f27105k = null;
        ArrayList arrayList = this.f27099e;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i14)).onAnimationEnd(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dB = g.b(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f27095a);
        double d14 = 2;
        int iB = MathKt.b((((double) iWidth) - (((double) intrinsicWidth) * dB)) / d14);
        int iB2 = MathKt.b((((double) iHeight) - (dB * ((double) intrinsicHeight))) / d14);
        drawable.setBounds(rect.left + iB, rect.top + iB2, rect.right - iB, rect.bottom - iB2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        int i14 = this.f27104j;
        if (i14 == 0) {
            Drawable drawable2 = this.f27105k;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f27103i);
                int iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        Drawable drawable3 = this.f27106l;
        if (i14 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f27103i);
                int iSave2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave2);
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f27102h) / ((double) this.f27096b);
        double dC = t.c(dUptimeMillis, 0.0d, 1.0d);
        int i15 = this.f27103i;
        int i16 = (int) (dC * ((double) i15));
        if (this.f27097c) {
            i15 -= i16;
        }
        boolean z14 = dUptimeMillis >= 1.0d;
        if (!z14 && (drawable = this.f27105k) != null) {
            drawable.setAlpha(i15);
            int iSave3 = canvas.save();
            try {
                drawable.draw(canvas);
                canvas.restoreToCount(iSave3);
            } catch (Throwable th3) {
                canvas.restoreToCount(iSave3);
                throw th3;
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i16);
            int iSave4 = canvas.save();
            try {
                drawable3.draw(canvas);
                canvas.restoreToCount(iSave4);
            } catch (Throwable th4) {
                canvas.restoreToCount(iSave4);
                throw th4;
            }
        }
        if (z14) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f27103i;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i14 = this.f27104j;
        if (i14 == 0) {
            Drawable drawable = this.f27105k;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f27106l;
        if (i14 != 1) {
            if (i14 == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f27105k;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f27101g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f27100f;
    }

    @Override // android.graphics.drawable.Drawable
    @o13.e
    public final int getOpacity() {
        Drawable drawable = this.f27105k;
        int i14 = this.f27104j;
        if (i14 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f27106l;
        if (i14 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f27104j == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f27105k;
        if (drawable != null ? drawable.isStateful() : false) {
            return true;
        }
        Drawable drawable2 = this.f27106l;
        return drawable2 != null ? drawable2.isStateful() : false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f27105k;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.f27106l;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i14) {
        Drawable drawable = this.f27105k;
        boolean level = drawable != null ? drawable.setLevel(i14) : false;
        Drawable drawable2 = this.f27106l;
        return level || (drawable2 != null ? drawable2.setLevel(i14) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f27105k;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f27106l;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        scheduleSelf(runnable, j8);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i14) {
        if (i14 < 0 || i14 >= 256) {
            h.x(j.h(i14, "Invalid alpha: "));
        } else {
            this.f27103i = i14;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f27105k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f27106l;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i14) {
        Drawable drawable = this.f27105k;
        if (drawable != null) {
            drawable.setTint(i14);
        }
        Drawable drawable2 = this.f27106l;
        if (drawable2 != null) {
            drawable2.setTint(i14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f27105k;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f27106l;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f27105k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f27106l;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f27105k;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f27106l;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f27105k;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f27106l;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f27104j != 0) {
            return;
        }
        this.f27104j = 1;
        this.f27102h = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f27099e;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i14)).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f27105k;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f27106l;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f27104j != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* JADX INFO: renamed from: cg.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcg/a$a;", "", "<init>", "()V", "", "STATE_START", "I", "STATE_RUNNING", "STATE_DONE", "DEFAULT_DURATION", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0415a {
        public /* synthetic */ C0415a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0415a() {
        }
    }

    public a(Drawable drawable, Drawable drawable2, f fVar) {
        this(drawable, drawable2, fVar, 0, false, false, 56, null);
    }

    public a(Drawable drawable, Drawable drawable2, f fVar, int i14) {
        this(drawable, drawable2, fVar, i14, false, false, 48, null);
    }

    public a(Drawable drawable, Drawable drawable2, f fVar, int i14, boolean z14) {
        this(drawable, drawable2, fVar, i14, z14, false, 32, null);
    }

    public /* synthetic */ a(Drawable drawable, Drawable drawable2, f fVar, int i14, boolean z14, boolean z15, int i15, p005kotlin.jvm.internal.j jVar) {
        this(drawable, drawable2, (i15 & 4) != 0 ? f.FIT : fVar, (i15 & 8) != 0 ? 200 : i14, (i15 & 16) != 0 ? true : z14, (i15 & 32) != 0 ? false : z15);
    }

    public a(Drawable drawable, Drawable drawable2) {
        this(drawable, drawable2, null, 0, false, false, 60, null);
    }
}
