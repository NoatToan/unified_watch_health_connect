package com.xiaomi.fitness.widget.button.gesture;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import defpackage.em8;
import defpackage.hm8;

/* JADX INFO: loaded from: classes10.dex */
public class FGestureManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f13453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hm8 f13454b;
    public final f c;
    public final em8 d;
    public e f;
    public VelocityTracker h;
    public boolean i;
    public final c j;
    public State e = State.Idle;
    public final d g = new d();

    public enum State {
        Idle,
        Consume,
        Fling
    }

    public class a extends f {
        public a() {
            super();
        }

        @Override // com.xiaomi.fitness.widget.button.gesture.FGestureManager.f
        public void c(boolean z) {
            if (z) {
                FGestureManager.this.t(State.Consume);
            }
            super.c(z);
        }
    }

    public class b extends em8 {
        public b(Context context) {
            super(context);
        }

        @Override // defpackage.em8
        public void e(int i, int i2, int i3, int i4) {
            FGestureManager.this.j.e(i, i2, i3, i4);
            super.e(i, i2, i3, i4);
        }

        @Override // defpackage.em8
        public void f(boolean z) {
            if (FGestureManager.this.i) {
                StringBuilder sb = new StringBuilder();
                sb.append("onScrollerFinish isAbort:");
                sb.append(z);
            }
            if (FGestureManager.this.c.a()) {
                FGestureManager.this.t(State.Consume);
            } else {
                FGestureManager.this.g.b();
            }
            super.f(z);
        }

        @Override // defpackage.em8
        public void g() {
            FGestureManager.this.t(State.Fling);
            super.g();
        }
    }

    public static abstract class c {
        public void a() {
        }

        public boolean b(MotionEvent motionEvent) {
            return true;
        }

        public abstract void c(MotionEvent motionEvent);

        public abstract void d(VelocityTracker velocityTracker, MotionEvent motionEvent);

        public abstract void e(int i, int i2, int i3, int i4);

        public abstract void f(State state, State state2);

        public abstract boolean g(MotionEvent motionEvent);

        public abstract boolean h(MotionEvent motionEvent);
    }

    public final class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13455a;

        public void a() {
            boolean unused = FGestureManager.this.i;
            FGestureManager.this.f13453a.removeCallbacks(this);
            this.f13455a = false;
        }

        public void b() {
            boolean unused = FGestureManager.this.i;
            FGestureManager.this.f13453a.post(this);
            this.f13455a = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean unused = FGestureManager.this.i;
            this.f13455a = false;
            FGestureManager.this.t(State.Idle);
        }

        public d() {
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13458b;

        public boolean a() {
            return this.f13457a;
        }

        public boolean b() {
            return this.f13458b;
        }

        public void c() {
            this.f13457a = false;
            this.f13458b = false;
        }

        public void d(boolean z) {
            this.f13458b = z;
        }

        public void e(boolean z) {
            this.f13457a = z;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13460b;
        public a c;

        public interface a {
            void a(boolean z);

            void b(boolean z);
        }

        public boolean a() {
            return this.f13460b;
        }

        public boolean b() {
            return this.f13459a;
        }

        public void c(boolean z) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.b(z);
            }
        }

        public void d(boolean z) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(z);
            }
        }

        public void e() {
            h(false);
            g(false);
        }

        public void f(a aVar) {
            this.c = aVar;
        }

        public void g(boolean z) {
            if (this.f13460b != z) {
                this.f13460b = z;
                c(z);
            }
        }

        public void h(boolean z) {
            if (this.f13459a != z) {
                this.f13459a = z;
                d(z);
            }
        }

        public f() {
            this.f13459a = false;
            this.f13460b = false;
        }
    }

    public FGestureManager(ViewGroup viewGroup, c cVar) {
        if (viewGroup == null || cVar == null) {
            throw null;
        }
        this.f13453a = viewGroup;
        this.j = cVar;
        this.c = new a();
        this.d = new b(viewGroup.getContext());
    }

    public void g() {
        if (this.c.a()) {
            h().d(true);
            if (i().d()) {
                this.g.b();
            }
            this.c.e();
            this.j.a();
        }
    }

    public e h() {
        if (this.f == null) {
            this.f = new e();
        }
        return this.f;
    }

    public em8 i() {
        return this.d;
    }

    public State j() {
        return this.e;
    }

    public f k() {
        return this.c;
    }

    public hm8 l() {
        if (this.f13454b == null) {
            this.f13454b = new hm8();
        }
        return this.f13454b;
    }

    public final VelocityTracker m() {
        if (this.h == null) {
            this.h = VelocityTracker.obtain();
        }
        return this.h;
    }

    public final void n(MotionEvent motionEvent) {
        this.c.e();
        this.j.d(m(), motionEvent);
        r();
        h().c();
        if (this.e == State.Consume) {
            t(State.Idle);
        }
    }

    public final void o(MotionEvent motionEvent) {
    }

    public boolean p(MotionEvent motionEvent) {
        l().h(motionEvent);
        m().addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            n(motionEvent);
        } else {
            if (action == 0) {
                o(motionEvent);
            }
            if (!this.c.b()) {
                this.c.h(this.j.h(motionEvent));
            }
        }
        return this.c.b();
    }

    public boolean q(MotionEvent motionEvent) {
        l().h(motionEvent);
        m().addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            n(motionEvent);
        } else {
            if (action == 0) {
                o(motionEvent);
                return this.j.b(motionEvent);
            }
            if (!h().b()) {
                if (this.c.a()) {
                    this.j.c(motionEvent);
                    h().e(true);
                } else {
                    this.c.g(this.j.g(motionEvent));
                }
            }
        }
        return this.c.a();
    }

    public final void r() {
        VelocityTracker velocityTracker = this.h;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.h = null;
        }
    }

    public void s(boolean z) {
        this.i = z;
    }

    public final void t(State state) {
        state.getClass();
        if (this.i) {
            StringBuilder sb = new StringBuilder();
            sb.append("setState:");
            sb.append(this.e);
            sb.append(" -> ");
            sb.append(state);
        }
        this.g.a();
        State state2 = this.e;
        if (state2 != state) {
            this.e = state;
            this.j.f(state2, state);
        }
    }
}
