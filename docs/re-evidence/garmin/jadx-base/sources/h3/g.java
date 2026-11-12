package h3;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import ch.qos.logback.core.CoreConstants;
import fe2.z;
import o4.d0;
import o4.f0;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lh3/g;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "pressed", "", "setRippleState", "(Z)V", "a", "material-ripple"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f81238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f81239g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f81240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f81241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f81242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public eh2.b f81243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f81244e;

    static {
        new a(null);
        f81238f = new int[]{R.attr.state_pressed, R.attr.state_enabled};
        f81239g = new int[0];
    }

    public g(Context context) {
        super(context);
    }

    private final void setRippleState(boolean pressed) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f81243d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l14 = this.f81242c;
        long jLongValue = jCurrentAnimationTimeMillis - (l14 != null ? l14.longValue() : 0L);
        if (pressed || jLongValue >= 5) {
            int[] iArr = pressed ? f81238f : f81239g;
            m mVar = this.f81240a;
            if (mVar != null) {
                mVar.setState(iArr);
            }
        } else {
            eh2.b bVar = new eh2.b(this, 16);
            this.f81243d = bVar;
            postDelayed(bVar, 50L);
        }
        this.f81242c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(g gVar) {
        m mVar = gVar.f81240a;
        if (mVar != null) {
            mVar.setState(f81239g);
        }
        gVar.f81243d = null;
    }

    public final void b(a2.l.b bVar, boolean z14, long j8, int i14, long j14, float f14, z zVar) {
        if (this.f81240a == null || !Boolean.valueOf(z14).equals(this.f81241b)) {
            m mVar = new m(z14);
            setBackground(mVar);
            this.f81240a = mVar;
            this.f81241b = Boolean.valueOf(z14);
        }
        m mVar2 = this.f81240a;
        mVar2.getClass();
        this.f81244e = zVar;
        e(i14, j8, f14, j14);
        if (z14) {
            mVar2.setHotspot(n4.c.g(bVar.f497a), n4.c.h(bVar.f497a));
        } else {
            mVar2.setHotspot(mVar2.getBounds().centerX(), mVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f81244e = null;
        eh2.b bVar = this.f81243d;
        if (bVar != null) {
            removeCallbacks(bVar);
            eh2.b bVar2 = this.f81243d;
            bVar2.getClass();
            bVar2.run();
        } else {
            m mVar = this.f81240a;
            if (mVar != null) {
                mVar.setState(f81239g);
            }
        }
        m mVar2 = this.f81240a;
        if (mVar2 == null) {
            return;
        }
        mVar2.setVisible(false, false);
        unscheduleDrawable(mVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(int i14, long j8, float f14, long j14) {
        m mVar = this.f81240a;
        if (mVar == null) {
            return;
        }
        Integer num = mVar.f81275c;
        if (num == null || num.intValue() != i14) {
            mVar.f81275c = Integer.valueOf(i14);
            m.b.f81277a.getClass();
            mVar.setRadius(i14);
        }
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        long jC = d0.c(f14, j14, 14);
        d0 d0Var = mVar.f81274b;
        if (!(d0Var == null ? false : d0.d(d0Var.f128833a, jC))) {
            mVar.f81274b = d0.a(jC);
            mVar.setColor(ColorStateList.valueOf(f0.j(jC)));
        }
        Rect rect = new Rect(0, 0, MathKt.c(n4.g.g(j8)), MathKt.c(n4.g.d(j8)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        mVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        z zVar = this.f81244e;
        if (zVar != null) {
            zVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lh3/g$a;", "", "<init>", "()V", "", "MinimumRippleStateChangeTime", "J", "ResetRippleDelayDuration", "", "PressedState", "[I", "RestingState", "material-ripple"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
