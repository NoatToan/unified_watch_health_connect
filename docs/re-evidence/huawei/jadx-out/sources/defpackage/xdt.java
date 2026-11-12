package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.Log;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.uikit.hwbottomnavigationview.R;
import com.huawei.uikit.hwcommon.anim.HwCubicBezierInterpolator;

/* JADX INFO: loaded from: classes20.dex */
public class xdt extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f52755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f52756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Rect f52757c;
    protected int d;
    private Context e;
    private int f;
    private int g;
    private ValueAnimator h;
    private int i;
    private ValueAnimator j;
    private Path m;
    private ValueAnimator.AnimatorUpdateListener n;
    private int o;

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.w("ComplexDrawable", "onAnimationUpdate: Param valueAnimator is null");
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null || !(animatedValue instanceof Integer)) {
                return;
            }
            xdt.this.e(((Integer) animatedValue).intValue());
        }
    }

    public xdt(Context context, Drawable drawable) {
        this(context, drawable, 0);
    }

    private void e(Drawable drawable, int i) {
        this.g = this.e.getResources().getInteger(R.integer.hwbottomnavigationview_icon_anim_duration);
        if (i == 0) {
            this.d = this.e.getResources().getDimensionPixelSize(R.dimen.hwbottomnavigationview_item_icon_size);
        } else {
            this.d = i;
        }
        d();
        a(drawable);
        this.n = new d();
        this.m = new Path();
        e();
    }

    public void a(int i) {
        Drawable drawable = this.f52756b;
        if (drawable == null) {
            return;
        }
        this.o = i;
        drawable.setTint(i);
        invalidateSelf();
    }

    public Drawable b() {
        return this.f52756b;
    }

    public void c(int i) {
        Drawable drawable = this.f52755a;
        if (drawable == null) {
            return;
        }
        this.f = i;
        drawable.setTint(i);
        invalidateSelf();
    }

    public void c(Drawable drawable) {
        a(drawable);
    }

    public void c(boolean z, boolean z2) {
        if (z2) {
            e(z);
        } else {
            e(z ? (int) (this.d * 1.42f) : 0);
        }
    }

    protected void d() {
        int i = this.d;
        this.f52757c = new Rect(0, 0, i, i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (canvas == null) {
            Log.w("ComplexDrawable", "draw: Param canvas is null");
            return;
        }
        this.m.reset();
        this.m.addCircle(c() ? this.f52757c.right : this.f52757c.left, this.f52757c.bottom, this.i, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(this.m, Region.Op.DIFFERENCE);
        if (this.f52756b.isAutoMirrored() && c()) {
            Rect rect = this.f52757c;
            canvas.translate(rect.right + rect.left, 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f52756b.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipPath(this.m);
        if (this.f52756b.isAutoMirrored() && c()) {
            Rect rect2 = this.f52757c;
            canvas.translate(rect2.right + rect2.left, 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f52755a.draw(canvas);
        canvas.restore();
    }

    public void e(int i) {
        this.i = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f52756b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f52756b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        Drawable drawable2 = this.f52755a;
        if (drawable2 != null) {
            drawable2.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f52756b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f52755a;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    public xdt(Context context, Drawable drawable, int i) {
        this.i = 0;
        this.e = context;
        e(drawable, i);
    }

    private boolean c() {
        return getLayoutDirection() == 1;
    }

    private void e() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) (this.d * 1.42f));
        this.j = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(this.g);
        this.j.addUpdateListener(this.n);
        this.j.setInterpolator(new HwCubicBezierInterpolator(0.2f, 0.0f, 0.2f, 1.0f));
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt((int) (this.d * 1.42f), 0);
        this.h = valueAnimatorOfInt2;
        valueAnimatorOfInt2.setDuration(this.g);
        this.h.addUpdateListener(this.n);
        this.h.setInterpolator(new HwCubicBezierInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
    }

    public void b(int i) {
        this.d = i;
        this.f52757c.set(0, 0, i, i);
        this.j.setIntValues(0, (int) (this.d * 1.42f));
        this.h.setIntValues((int) (this.d * 1.42f), 0);
        Drawable drawable = this.f52756b;
        if (drawable != null) {
            drawable.setBounds(this.f52757c);
        }
        Drawable drawable2 = this.f52755a;
        if (drawable2 != null) {
            drawable2.setBounds(this.f52757c);
        }
        invalidateSelf();
    }

    private void a(Drawable drawable) {
        Drawable drawableE;
        if (!(drawable instanceof StateListDrawable)) {
            if (drawable != null) {
                a(drawable, drawable.getConstantState().newDrawable().mutate());
                return;
            }
            return;
        }
        StateListDrawable stateListDrawable = (StateListDrawable) drawable;
        int identifier = this.e.getResources().getIdentifier("state_selected", "attr", OsType.ANDROID);
        int[] iArr = new int[0];
        int[] iArr2 = {identifier};
        int[] iArr3 = {~identifier};
        Drawable drawableE2 = null;
        if (Build.VERSION.SDK_INT >= 29) {
            int iFindStateDrawableIndex = stateListDrawable.findStateDrawableIndex(iArr3);
            drawableE = iFindStateDrawableIndex != -1 ? stateListDrawable.getStateDrawable(iFindStateDrawableIndex) : null;
            int iFindStateDrawableIndex2 = stateListDrawable.findStateDrawableIndex(iArr2);
            if (iFindStateDrawableIndex2 != -1) {
                drawableE2 = stateListDrawable.getStateDrawable(iFindStateDrawableIndex2);
            }
        } else {
            int iB = b(stateListDrawable, iArr3);
            drawableE = iB != -1 ? e(stateListDrawable, iB) : null;
            int iB2 = b(stateListDrawable, iArr2);
            if (iB2 != -1) {
                drawableE2 = e(stateListDrawable, iB2);
            }
        }
        if (drawableE == null && drawableE2 == null) {
            a(drawable, drawable.getConstantState().newDrawable().mutate());
            return;
        }
        if (drawableE != null && drawableE2 != null) {
            a(drawableE, drawableE2);
            return;
        }
        if (b(stateListDrawable, iArr) != -1) {
            int iB3 = b(stateListDrawable, iArr);
            if (drawableE == null) {
                drawableE = e(stateListDrawable, iB3);
            }
            if (drawableE2 == null) {
                drawableE2 = e(stateListDrawable, iB3);
            }
            a(drawableE, drawableE2);
            return;
        }
        throw new IllegalArgumentException("no resource available to provide");
    }

    private Drawable e(StateListDrawable stateListDrawable, int i) {
        Object objB = xeh.b(stateListDrawable, "getStateDrawable", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i)}, StateListDrawable.class);
        if (objB != null) {
            return (Drawable) objB;
        }
        return null;
    }

    private int b(StateListDrawable stateListDrawable, int[] iArr) {
        Object objB = xeh.b(stateListDrawable, "getStateDrawableIndex", new Class[]{iArr.getClass()}, new Object[]{iArr}, StateListDrawable.class);
        if (objB != null) {
            return ((Integer) objB).intValue();
        }
        return -1;
    }

    private void a(Drawable drawable, Drawable drawable2) {
        if (drawable == null || drawable2 == null) {
            return;
        }
        this.f52756b = drawable;
        drawable.setBounds(this.f52757c);
        this.f52755a = drawable2;
        drawable2.setBounds(this.f52757c);
        invalidateSelf();
    }

    private void e(boolean z) {
        ValueAnimator valueAnimator = z ? this.h : this.j;
        ValueAnimator valueAnimator2 = z ? this.j : this.h;
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator2.start();
        }
    }
}
