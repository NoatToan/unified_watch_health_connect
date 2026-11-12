package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.m80;
import defpackage.psq;
import defpackage.q80;

/* JADX INFO: loaded from: classes5.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public psq f8546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f8547b;
    public boolean c;
    public boolean e;
    public float d = 0.0f;
    public int f = 2;
    public float g = 0.5f;
    public float h = 0.0f;
    public float i = 0.5f;
    public final psq.c j = new a();

    public class a extends psq.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8549b = -1;

        public a() {
        }

        public final boolean a(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.f8548a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.g);
            }
            boolean z = androidx.core.view.c.A(view) == 1;
            int i = SwipeDismissBehavior.this.f;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (f <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i != 1) {
                return false;
            }
            if (z) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (f >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // psq.c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = androidx.core.view.c.A(view) == 1;
            int i3 = SwipeDismissBehavior.this.f;
            if (i3 == 0) {
                if (z) {
                    width = this.f8548a - view.getWidth();
                    width2 = this.f8548a;
                } else {
                    width = this.f8548a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.f8548a - view.getWidth();
                width2 = view.getWidth() + this.f8548a;
            } else if (z) {
                width = this.f8548a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f8548a - view.getWidth();
                width2 = this.f8548a;
            }
            return SwipeDismissBehavior.c(width, i, width2);
        }

        @Override // psq.c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // psq.c
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // psq.c
        public void onViewCaptured(View view, int i) {
            this.f8549b = i;
            this.f8548a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // psq.c
        public void onViewDragStateChanged(int i) {
            c cVar = SwipeDismissBehavior.this.f8547b;
            if (cVar != null) {
                cVar.b(i);
            }
        }

        @Override // psq.c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = this.f8548a + (view.getWidth() * SwipeDismissBehavior.this.h);
            float width2 = this.f8548a + (view.getWidth() * SwipeDismissBehavior.this.i);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.b(0.0f, 1.0f - SwipeDismissBehavior.e(width, width2, f), 1.0f));
            }
        }

        @Override // psq.c
        public void onViewReleased(View view, float f, float f2) {
            int i;
            boolean z;
            c cVar;
            this.f8549b = -1;
            int width = view.getWidth();
            if (a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f8548a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f8548a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f8546a.P(i, view.getTop())) {
                androidx.core.view.c.i0(view, new d(view, z));
            } else {
                if (!z || (cVar = SwipeDismissBehavior.this.f8547b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // psq.c
        public boolean tryCaptureView(View view, int i) {
            int i2 = this.f8549b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.a(view);
        }
    }

    public class b implements q80 {
        public b() {
        }

        @Override // defpackage.q80
        public boolean a(View view, q80.a aVar) {
            if (!SwipeDismissBehavior.this.a(view)) {
                return false;
            }
            boolean z = androidx.core.view.c.A(view) == 1;
            int i = SwipeDismissBehavior.this.f;
            androidx.core.view.c.a0(view, (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f8547b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i);
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f8551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8552b;

        public d(View view, boolean z) {
            this.f8551a = view;
            this.f8552b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            psq psqVar = SwipeDismissBehavior.this.f8546a;
            if (psqVar != null && psqVar.n(true)) {
                androidx.core.view.c.i0(this.f8551a, this);
            } else {
                if (!this.f8552b || (cVar = SwipeDismissBehavior.this.f8547b) == null) {
                    return;
                }
                cVar.a(this.f8551a);
            }
        }
    }

    public static float b(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int c(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static float e(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public boolean a(View view) {
        return true;
    }

    public final void d(ViewGroup viewGroup) {
        if (this.f8546a == null) {
            this.f8546a = this.e ? psq.o(viewGroup, this.d, this.j) : psq.p(viewGroup, this.j);
        }
    }

    public void f(float f) {
        this.i = b(0.0f, f, 1.0f);
    }

    public void g(float f) {
        this.h = b(0.0f, f, 1.0f);
    }

    public void h(int i) {
        this.f = i;
    }

    public final void i(View view) {
        androidx.core.view.c.k0(view, EventRecurrence.TH);
        if (a(view)) {
            androidx.core.view.c.m0(view, m80.a.y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.z(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!z) {
            return false;
        }
        d(coordinatorLayout);
        return this.f8546a.Q(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (androidx.core.view.c.y(v) == 0) {
            androidx.core.view.c.C0(v, 1);
            i(v);
        }
        return zOnLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        psq psqVar = this.f8546a;
        if (psqVar == null) {
            return false;
        }
        psqVar.G(motionEvent);
        return true;
    }

    public void setListener(c cVar) {
        this.f8547b = cVar;
    }
}
