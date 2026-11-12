package miuix.androidbasewidget.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.dyq;
import defpackage.hm1;
import defpackage.qki;
import defpackage.yhi;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;

/* JADX INFO: loaded from: classes3.dex */
public class CircleProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f26242b;
    public Path c;
    public Animator d;
    public int[] e;
    public Drawable[] f;
    public Drawable[] g;
    public Drawable[] h;
    public int i;
    public Bitmap j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Canvas f26243k;
    public Paint l;
    public int m;
    public int n;
    public int o;
    public Drawable p;

    public interface a {
    }

    public CircleProgressBar(Context context) {
        this(context, null);
    }

    private int getIntrinsicHeight() {
        Drawable drawableF = f(0);
        if (drawableF == null) {
            return 0;
        }
        int intrinsicHeight = drawableF.getIntrinsicHeight();
        Drawable[] drawableArr = this.h;
        if (drawableArr != null) {
            intrinsicHeight = Math.max(intrinsicHeight, drawableArr[0].getIntrinsicHeight());
        }
        Drawable[] drawableArr2 = this.f;
        return drawableArr2 != null ? Math.max(intrinsicHeight, drawableArr2[0].getIntrinsicHeight()) : intrinsicHeight;
    }

    private int getIntrinsicWidth() {
        Drawable drawableF = f(0);
        if (drawableF == null) {
            return 0;
        }
        int intrinsicWidth = drawableF.getIntrinsicWidth();
        Drawable[] drawableArr = this.h;
        if (drawableArr != null) {
            intrinsicWidth = Math.max(intrinsicWidth, drawableArr[0].getIntrinsicWidth());
        }
        Drawable[] drawableArr2 = this.f;
        return drawableArr2 != null ? Math.max(intrinsicWidth, drawableArr2[0].getIntrinsicWidth()) : intrinsicWidth;
    }

    private float getRate() {
        return getProgress() / getMax();
    }

    public final int b(int i) {
        return (i * 1000) / this.o;
    }

    public final void c(Canvas canvas, Drawable drawable, Drawable drawable2, Drawable drawable3, float f, int i) {
        if (drawable != null) {
            drawable.setAlpha(i);
            drawable.draw(canvas);
        }
        if (canvas.isHardwareAccelerated()) {
            canvas.saveLayer(drawable3.getBounds().left, drawable3.getBounds().top, drawable3.getBounds().right, drawable3.getBounds().bottom, null, 31);
            this.l.setStyle(Paint.Style.STROKE);
            this.l.setStrokeWidth(drawable3.getBounds().width());
            this.c.reset();
            this.c.addArc(this.f26242b, -90.0f, f * 360.0f);
            canvas.drawPath(this.c, this.l);
            this.l.setStyle(Paint.Style.FILL);
            this.l.setStrokeWidth(0.0f);
            drawable3.setAlpha(i);
            drawable3.draw(canvas);
            canvas.restore();
        } else {
            if (this.j == null) {
                this.j = Bitmap.createBitmap(drawable3.getBounds().width(), drawable3.getBounds().height(), Bitmap.Config.ARGB_8888);
                this.f26243k = new Canvas(this.j);
            }
            this.j.eraseColor(0);
            this.f26243k.save();
            this.f26243k.translate(-drawable3.getBounds().left, -drawable3.getBounds().top);
            this.f26243k.drawArc(this.f26242b, -90.0f, f * 360.0f, true, this.l);
            drawable3.setAlpha(i);
            drawable3.draw(this.f26243k);
            this.f26243k.restore();
            canvas.drawBitmap(this.j, drawable3.getBounds().left, drawable3.getBounds().top, (Paint) null);
        }
        Drawable drawable4 = this.p;
        if (drawable4 != null) {
            canvas.save();
            int width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 2;
            int height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2;
            int intrinsicWidth = drawable4.getIntrinsicWidth();
            int intrinsicHeight = drawable4.getIntrinsicHeight();
            canvas.rotate((getProgress() * 360.0f) / getMax(), width, height);
            int i2 = intrinsicWidth / 2;
            int i3 = intrinsicHeight / 2;
            drawable4.setBounds(width - i2, height - i3, width + i2, height + i3);
            drawable4.draw(canvas);
            canvas.restore();
        }
        if (drawable2 != null) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
        }
    }

    public final Drawable d(int i) {
        Drawable[] drawableArr = this.f;
        if (drawableArr == null) {
            return null;
        }
        return drawableArr[i];
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int progressLevelCount = getProgressLevelCount();
        for (int i = 0; i < progressLevelCount; i++) {
            Drawable[] drawableArr = this.f;
            if (drawableArr != null) {
                drawableArr[i].setState(getDrawableState());
            }
            Drawable[] drawableArr2 = this.g;
            if (drawableArr2 != null) {
                drawableArr2[i].setState(getDrawableState());
            }
            Drawable[] drawableArr3 = this.h;
            if (drawableArr3 != null) {
                drawableArr3[i].setState(getDrawableState());
            }
        }
        invalidate();
    }

    public final Drawable e(int i) {
        Drawable[] drawableArr = this.h;
        if (drawableArr == null) {
            return null;
        }
        return drawableArr[i];
    }

    public final Drawable f(int i) {
        Drawable[] drawableArr = this.g;
        if (drawableArr == null) {
            return null;
        }
        return drawableArr[i];
    }

    public void g(int i, Animator.AnimatorListener animatorListener) {
        h();
        int iAbs = Math.abs((int) (((i - getProgress()) / getMax()) * 360.0f));
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, BroadcastsKt.SILENT_PUSHING_PROGRESS, i);
        this.d = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(b(iAbs));
        this.d.setInterpolator(getInterpolator());
        if (animatorListener != null) {
            this.d.addListener(animatorListener);
        }
        this.d.start();
    }

    public int getPrevAlpha() {
        return this.n;
    }

    public int getProgressLevelCount() {
        int[] iArr = this.e;
        if (iArr == null) {
            return 1;
        }
        return 1 + iArr.length;
    }

    public void h() {
        Animator animator = this.d;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        this.d.cancel();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        c(canvas, d(this.i), e(this.i), f(this.i), getRate(), 255 - this.n);
        if (this.n >= 10) {
            c(canvas, d(this.m), e(this.m), f(this.m), getRate(), this.n);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(getIntrinsicWidth(), getIntrinsicHeight());
    }

    public void setOnProgressChangedListener(a aVar) {
    }

    public void setPrevAlpha(int i) {
        this.n = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        int length;
        try {
            super.setProgress(i);
            int[] iArr = this.e;
            if (iArr == null) {
                length = 0;
            } else {
                length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (i < this.e[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    length = i2;
                }
            }
            int i3 = this.i;
            if (length != i3) {
                this.m = i3;
                this.i = length;
                setPrevAlpha(255);
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "prevAlpha", 0);
                objectAnimatorOfInt.setDuration(300L);
                objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
                objectAnimatorOfInt.start();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setProgressByAnimator(int i) {
        g(i, null);
    }

    public void setProgressLevels(int[] iArr) {
        this.e = iArr;
    }

    public void setRotateVelocity(int i) {
        this.o = i;
    }

    public void setThumb(int i) {
        setThumb(getResources().getDrawable(i));
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setThumb(Drawable drawable) {
        this.p = drawable;
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Path();
        this.o = 300;
        setIndeterminate(false);
        int iF = hm1.f(context, yhi.f40186a, context.getResources().getColor(dyq.f(context) ? qki.f : qki.g));
        Paint paint = new Paint();
        this.l = paint;
        paint.setColor(iF);
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(this, new AnimConfig[0]);
    }
}
