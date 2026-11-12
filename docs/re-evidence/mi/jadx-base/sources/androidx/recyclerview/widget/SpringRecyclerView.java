package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.annotation.Keep;
import defpackage.alb;
import defpackage.b63;
import defpackage.ejg;
import defpackage.nii;
import defpackage.z7o;
import defpackage.zkb;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import miuix.spring.view.SpringHelper;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class SpringRecyclerView extends RemixRecyclerView {
    public static final Field p;
    public static final Field q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final RecyclerView.k f2832r;
    public c g;
    public d h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2833k;
    public List<z7o> l;
    public float m;
    private SpringHelper mSpringHelper;
    public float n;
    public int o;

    public static class a extends EdgeEffect {
        public a(Context context) {
            super(context);
        }

        @Override // android.widget.EdgeEffect
        public boolean draw(Canvas canvas) {
            return false;
        }

        @Override // android.widget.EdgeEffect
        public void finish() {
        }

        @Override // android.widget.EdgeEffect
        public BlendMode getBlendMode() {
            return null;
        }

        @Override // android.widget.EdgeEffect
        public int getColor() {
            return 0;
        }

        @Override // android.widget.EdgeEffect
        public int getMaxHeight() {
            return 0;
        }

        @Override // android.widget.EdgeEffect
        public boolean isFinished() {
            return true;
        }

        @Override // android.widget.EdgeEffect
        public void onAbsorb(int i) {
        }

        @Override // android.widget.EdgeEffect
        public void onPull(float f) {
        }

        @Override // android.widget.EdgeEffect
        public void onRelease() {
        }

        @Override // android.widget.EdgeEffect
        public void setBlendMode(BlendMode blendMode) {
        }

        @Override // android.widget.EdgeEffect
        public void setColor(int i) {
        }

        @Override // android.widget.EdgeEffect
        public void setSize(int i, int i2) {
        }

        @Override // android.widget.EdgeEffect
        public void onPull(float f, float f2) {
        }
    }

    public static class b extends RecyclerView.k {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new a(recyclerView.getContext());
        }
    }

    public class c extends RemixRecyclerView.a {
        public c() {
            super();
        }

        @Override // androidx.recyclerview.widget.RemixRecyclerView.a, androidx.recyclerview.widget.RecyclerView.c0
        public void b(int i, int i2) {
            int iG = SpringRecyclerView.this.mSpringHelper.g();
            int iH = SpringRecyclerView.this.mSpringHelper.h();
            if (SpringRecyclerView.this.y() && (iG != 0 || iH != 0)) {
                n(i, i2, iG, iH);
                return;
            }
            if (SpringRecyclerView.this.getOverScrollMode() == 1) {
                SpringRecyclerView.this.i = false;
                SpringRecyclerView.this.j = false;
            }
            super.b(i, i2);
        }

        @Override // androidx.recyclerview.widget.RemixRecyclerView.a
        public void g() {
            super.g();
            int iG = SpringRecyclerView.this.mSpringHelper.g();
            int iH = SpringRecyclerView.this.mSpringHelper.h();
            if (iG == 0 && iH == 0) {
                return;
            }
            o(iG, iH);
        }

        public void l(int i) {
            SpringRecyclerView.this.i = true;
            SpringRecyclerView.this.setScrollState(2);
            k();
            this.j.q(0, -i, SpringRecyclerView.this.getWidth());
        }

        public void m(int i) {
            SpringRecyclerView.this.j = true;
            SpringRecyclerView.this.setScrollState(2);
            k();
            this.j.r(0, -i, SpringRecyclerView.this.getHeight());
        }

        public void n(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            SpringRecyclerView.this.i = i3 != 0;
            SpringRecyclerView.this.j = i4 != 0;
            SpringRecyclerView.this.setScrollState(2);
            k();
            int i9 = Integer.MAX_VALUE;
            int i10 = Integer.MIN_VALUE;
            if (Integer.signum(i) * i3 > 0) {
                i5 = -i3;
                i6 = i5;
            } else if (i < 0) {
                i6 = -i3;
                i5 = Integer.MIN_VALUE;
            } else {
                i5 = -i3;
                i6 = Integer.MAX_VALUE;
            }
            if (Integer.signum(i2) * i4 > 0) {
                i8 = -i4;
                i7 = i8;
            } else {
                if (i2 < 0) {
                    i9 = -i4;
                } else {
                    i10 = -i4;
                }
                i7 = i9;
                i8 = i10;
            }
            this.j.d(0, 0, i, i2, i5, i6, i8, i7, SpringRecyclerView.this.getWidth(), SpringRecyclerView.this.getHeight());
            d();
        }

        public void o(int i, int i2) {
            if (i != 0) {
                SpringRecyclerView.this.i = true;
            }
            if (i2 != 0) {
                SpringRecyclerView.this.j = true;
            }
            SpringRecyclerView.this.setScrollState(2);
            k();
            int i3 = -i;
            int i4 = -i2;
            this.j.u(0, 0, i3, i3, i4, i4);
            d();
        }
    }

    public class d extends ejg {
        public d(View view) {
            super(view);
        }

        @Override // defpackage.ejg
        public boolean d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
            return SpringRecyclerView.this.mSpringHelper.j(i, i2, iArr, iArr2, i3);
        }

        @Override // defpackage.ejg
        public void e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
            SpringRecyclerView.this.mSpringHelper.k(i, i2, i3, i4, iArr, i5, iArr2);
        }

        public boolean t(int i, int i2, int[] iArr, int[] iArr2, int i3) {
            if (SpringRecyclerView.this.i || SpringRecyclerView.this.j) {
                return false;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            return super.d(i, i2, iArr, iArr2, i3);
        }

        public void u(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
            if (SpringRecyclerView.this.i || SpringRecyclerView.this.j) {
                return;
            }
            super.e(i, i2, i3, i4, iArr, i5, iArr2);
        }
    }

    static {
        try {
            Field declaredField = RecyclerView.class.getDeclaredField("mViewFlinger");
            p = declaredField;
            declaredField.setAccessible(true);
            try {
                Field declaredField2 = RecyclerView.class.getDeclaredField("mScrollingChildHelper");
                q = declaredField2;
                declaredField2.setAccessible(true);
                f2832r = new b();
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    public SpringRecyclerView(Context context) {
        this(context, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        int iG = this.mSpringHelper.g();
        int iH = this.mSpringHelper.h();
        if (iG == 0 && iH == 0) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.translate(-iG, -iH);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // androidx.recyclerview.widget.RemixRecyclerView
    public boolean g() {
        return this.i || this.j;
    }

    public int getDragFlingVelocityX() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.q;
        }
        return 0;
    }

    public int getDragFlingVelocityY() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.f2831r;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RemixRecyclerView
    public /* bridge */ /* synthetic */ boolean getSpringEnabled() {
        return super.getSpringEnabled();
    }

    public float getSpringX() {
        return this.m;
    }

    public float getSpringY() {
        return this.n;
    }

    @Override // androidx.recyclerview.widget.RemixRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public /* bridge */ /* synthetic */ boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RemixRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        this.o = i;
        if (y()) {
            boolean zG = g();
            if (i != 2 && zG) {
                z();
                this.i = false;
                this.j = false;
            }
            if (i == 0 && zG) {
                this.mSpringHelper.l();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RemixRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        super.setNestedScrollingEnabled(z);
        d dVar = this.h;
        if (dVar != null) {
            dVar.n(z);
        }
    }

    @Override // androidx.recyclerview.widget.RemixRecyclerView, android.view.View
    public /* bridge */ /* synthetic */ void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollState(int i) {
        if (this.o == 1 && i == 0) {
            int iG = this.mSpringHelper.g();
            int iH = this.mSpringHelper.h();
            c cVar = this.g;
            if (cVar != null && (iG != 0 || iH != 0)) {
                cVar.o(iG, iH);
                return;
            }
        }
        super.setScrollState(i);
    }

    @Override // androidx.recyclerview.widget.RemixRecyclerView
    public void setSpringEnabled(boolean z) {
        if (this.f2833k && z) {
            return;
        }
        super.setSpringEnabled(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void stopScroll() {
        z();
        super.stopScroll();
    }

    public final void w(ejg ejgVar) {
        try {
            q.set(this, ejgVar);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public final void x(RemixRecyclerView.a aVar) {
        try {
            p.set(this, aVar);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean y() {
        return getOverScrollMode() != 2 && getSpringEnabled();
    }

    public void z() {
        c cVar = this.g;
        if (cVar != null) {
            cVar.f();
        }
    }

    public SpringRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nii.f27963a);
    }

    public SpringRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new ArrayList();
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.mSpringHelper = new SpringHelper() { // from class: androidx.recyclerview.widget.SpringRecyclerView.1
            public zkb c;

            @Override // defpackage.z7o
            public void a(float f, float f2) {
                SpringRecyclerView.this.m = f;
                SpringRecyclerView.this.n = f2;
                for (int i2 = 0; i2 < SpringRecyclerView.this.l.size(); i2++) {
                    ((z7o) SpringRecyclerView.this.l.get(0)).a(f, f2);
                }
            }

            @Override // miuix.spring.view.SpringHelper
            public boolean b() {
                RecyclerView.o oVar = SpringRecyclerView.this.mLayout;
                return oVar != null && oVar.canScrollHorizontally();
            }

            @Override // miuix.spring.view.SpringHelper
            public boolean c() {
                RecyclerView.o oVar = SpringRecyclerView.this.mLayout;
                return oVar != null && oVar.canScrollVertically();
            }

            @Override // miuix.spring.view.SpringHelper
            public boolean d(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
                if (SpringRecyclerView.this.i && g() == 0) {
                    SpringRecyclerView.this.i = false;
                }
                if (SpringRecyclerView.this.j && h() == 0) {
                    SpringRecyclerView.this.j = false;
                }
                return SpringRecyclerView.this.h.t(i2, i3, iArr, iArr2, i4);
            }

            @Override // miuix.spring.view.SpringHelper
            public void e(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
                SpringRecyclerView.this.h.u(i2, i3, i4, i5, iArr, i6, iArr2);
                if (m() && SpringRecyclerView.this.o == 2) {
                    if (!SpringRecyclerView.this.i && b() && i4 != 0) {
                        SpringRecyclerView.this.g.l(i4);
                    }
                    if (SpringRecyclerView.this.j || !c() || i5 == 0) {
                        return;
                    }
                    SpringRecyclerView.this.g.m(i5);
                }
            }

            @Override // miuix.spring.view.SpringHelper
            public int f() {
                return SpringRecyclerView.this.getHeight();
            }

            @Override // miuix.spring.view.SpringHelper
            public int i() {
                return SpringRecyclerView.this.getWidth();
            }

            @Override // miuix.spring.view.SpringHelper
            public boolean m() {
                return SpringRecyclerView.this.y();
            }

            public final zkb n() {
                if (this.c == null) {
                    this.c = new zkb(SpringRecyclerView.this.getContext());
                }
                return this.c;
            }

            @Override // miuix.spring.view.SpringHelper
            @Keep
            public void vibrate() {
                if (!HapticCompat.c("2.0")) {
                    HapticCompat.performHapticFeedbackAsync(SpringRecyclerView.this, alb.q);
                } else if (SpringRecyclerView.this.isHapticFeedbackEnabled()) {
                    n().e(201);
                }
            }
        };
        this.f2833k = b63.f3842a;
        this.g = new c();
        d dVar = new d(this);
        this.h = dVar;
        dVar.n(isNestedScrollingEnabled());
        x(this.g);
        w(this.h);
        if (this.f2833k) {
            setSpringEnabled(false);
        } else {
            super.setEdgeEffectFactory(f2832r);
        }
    }
}
