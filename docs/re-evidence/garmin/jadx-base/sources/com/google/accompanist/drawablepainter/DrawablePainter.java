package com.google.accompanist.drawablepainter;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import c32.k;
import g6.o;
import j23.t;
import lc.u0;
import n4.g;
import o13.l;
import o13.m;
import o4.c;
import o4.e0;
import o4.y;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p3.p0;
import p3.p1;
import p3.y2;
import q4.f;
import t4.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0007*\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR+\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010.\u001a\u00020(2\u0006\u0010 \u001a\u00020(8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010+¨\u00067"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Lt4/d;", "Lp3/y2;", "Landroid/graphics/drawable/Drawable;", "drawable", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "", "onRemembered", "()V", "onAbandoned", "onForgotten", "", "alpha", "", "applyAlpha", "(F)Z", "Lo4/e0;", "colorFilter", "applyColorFilter", "(Lo4/e0;)Z", "Lg6/o;", "layoutDirection", "applyLayoutDirection", "(Lg6/o;)Z", "Lq4/f;", "onDraw", "(Lq4/f;)V", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "", "<set-?>", "drawInvalidateTick$delegate", "Lp3/p1;", "getDrawInvalidateTick", "()I", "setDrawInvalidateTick", "(I)V", "drawInvalidateTick", "Ln4/g;", "drawableIntrinsicSize$delegate", "getDrawableIntrinsicSize-NH-jbRc", "()J", "setDrawableIntrinsicSize-uvyYCjk", "(J)V", "drawableIntrinsicSize", "Landroid/graphics/drawable/Drawable$Callback;", "callback$delegate", "Lo13/l;", "getCallback", "()Landroid/graphics/drawable/Drawable$Callback;", "callback", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "drawablepainter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DrawablePainter extends d implements y2 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: callback$delegate, reason: from kotlin metadata */
    private final l callback;

    /* JADX INFO: renamed from: drawInvalidateTick$delegate, reason: from kotlin metadata */
    private final p1 drawInvalidateTick;
    private final Drawable drawable;

    /* JADX INFO: renamed from: drawableIntrinsicSize$delegate, reason: from kotlin metadata */
    private final p1 drawableIntrinsicSize;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DrawablePainter(Drawable drawable) {
        drawable.getClass();
        this.drawable = drawable;
        this.drawInvalidateTick = p0.n(0);
        this.drawableIntrinsicSize = p0.n(g.a(DrawablePainterKt.getIntrinsicSize(drawable)));
        this.callback = m.b(new k(this, 24));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1] */
    public static final DrawablePainter$callback$2$1 callback_delegate$lambda$0(final DrawablePainter drawablePainter) {
        return new Drawable.Callback() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable d14) {
                d14.getClass();
                this.this$0.setDrawInvalidateTick(this.this$0.getDrawInvalidateTick() + 1);
                DrawablePainter drawablePainter2 = this.this$0;
                drawablePainter2.m60setDrawableIntrinsicSizeuvyYCjk(DrawablePainterKt.getIntrinsicSize(drawablePainter2.getDrawable()));
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable d14, Runnable what, long time) {
                d14.getClass();
                what.getClass();
                DrawablePainterKt.getMAIN_HANDLER().postAtTime(what, time);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable d14, Runnable what) {
                d14.getClass();
                what.getClass();
                DrawablePainterKt.getMAIN_HANDLER().removeCallbacks(what);
            }
        };
    }

    private final Drawable.Callback getCallback() {
        return (Drawable.Callback) this.callback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getDrawInvalidateTick() {
        return ((Number) this.drawInvalidateTick.getF182175a()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDrawableIntrinsicSize-NH-jbRc, reason: not valid java name */
    private final long m59getDrawableIntrinsicSizeNHjbRc() {
        return ((g) this.drawableIntrinsicSize.getF182175a()).f123561a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDrawInvalidateTick(int i14) {
        this.drawInvalidateTick.setValue(Integer.valueOf(i14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setDrawableIntrinsicSize-uvyYCjk, reason: not valid java name */
    public final void m60setDrawableIntrinsicSizeuvyYCjk(long j8) {
        this.drawableIntrinsicSize.setValue(g.a(j8));
    }

    @Override // t4.d
    public boolean applyAlpha(float alpha) {
        this.drawable.setAlpha(t.e(MathKt.c(alpha * 255), 0, 255));
        return true;
    }

    @Override // t4.d
    public boolean applyColorFilter(e0 colorFilter) {
        this.drawable.setColorFilter(colorFilter != null ? colorFilter.f128844a : null);
        return true;
    }

    @Override // t4.d
    public boolean applyLayoutDirection(o layoutDirection) {
        layoutDirection.getClass();
        Drawable drawable = this.drawable;
        int i14 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i15 = 1;
        if (i14 == 1) {
            i15 = 0;
        } else if (i14 != 2) {
            u0.r();
            return false;
        }
        return drawable.setLayoutDirection(i15);
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    @Override // t4.d
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long getF98674l() {
        return m59getDrawableIntrinsicSizeNHjbRc();
    }

    @Override // p3.y2
    public void onAbandoned() {
        onForgotten();
    }

    @Override // t4.d
    public void onDraw(f fVar) {
        fVar.getClass();
        y yVarA = fVar.getF142543b().a();
        getDrawInvalidateTick();
        try {
            yVarA.l();
            if (Build.VERSION.SDK_INT >= 31 || !(this.drawable instanceof AnimatedImageDrawable)) {
                this.drawable.setBounds(0, 0, MathKt.c(g.g(fVar.b())), MathKt.c(g.d(fVar.b())));
            } else {
                yVarA.g(g.g(fVar.b()) / g.g(getF98674l()), g.d(fVar.b()) / g.d(getF98674l()));
            }
            Drawable drawable = this.drawable;
            Canvas canvas = o4.d.f128822a;
            drawable.draw(((c) yVarA).f128816a);
        } finally {
            yVarA.i();
        }
    }

    @Override // p3.y2
    public void onForgotten() {
        Object obj = this.drawable;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.drawable.setVisible(false, false);
        this.drawable.setCallback(null);
    }

    @Override // p3.y2
    public void onRemembered() {
        this.drawable.setCallback(getCallback());
        this.drawable.setVisible(true, true);
        Object obj = this.drawable;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }
}
