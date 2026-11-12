package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f2878b = new a();
    public final List<View> c = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f2879a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f2880b;

        public void a(int i) {
            if (i < 64) {
                this.f2879a &= ~(1 << i);
                return;
            }
            a aVar = this.f2880b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        public int b(int i) {
            a aVar = this.f2880b;
            if (aVar == null) {
                return i >= 64 ? Long.bitCount(this.f2879a) : Long.bitCount(this.f2879a & ((1 << i) - 1));
            }
            return i < 64 ? Long.bitCount(this.f2879a & ((1 << i) - 1)) : aVar.b(i - 64) + Long.bitCount(this.f2879a);
        }

        public final void c() {
            if (this.f2880b == null) {
                this.f2880b = new a();
            }
        }

        public boolean d(int i) {
            if (i < 64) {
                return (this.f2879a & (1 << i)) != 0;
            }
            c();
            return this.f2880b.d(i - 64);
        }

        public void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.f2880b.e(i - 64, z);
                return;
            }
            long j = this.f2879a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f2879a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.f2880b != null) {
                c();
                this.f2880b.e(0, z2);
            }
        }

        public boolean f(int i) {
            if (i >= 64) {
                c();
                return this.f2880b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f2879a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f2879a = j3;
            long j4 = j - 1;
            this.f2879a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.f2880b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f2880b.f(0);
            }
            return z;
        }

        public void g() {
            this.f2879a = 0L;
            a aVar = this.f2880b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i) {
            if (i < 64) {
                this.f2879a |= 1 << i;
            } else {
                c();
                this.f2880b.h(i - 64);
            }
        }

        public String toString() {
            if (this.f2880b == null) {
                return Long.toBinaryString(this.f2879a);
            }
            return this.f2880b.toString() + "xx" + Long.toBinaryString(this.f2879a);
        }
    }

    public interface b {
        void a(View view);

        RecyclerView.d0 b(View view);

        void c(View view, int i);

        void d();

        void e(View view, int i, ViewGroup.LayoutParams layoutParams);

        void f(int i);

        int g(View view);

        View getChildAt(int i);

        int getChildCount();

        void h(View view);

        void i(int i);
    }

    public e(b bVar) {
        this.f2877a = bVar;
    }

    public void a(View view, int i, boolean z) {
        int childCount = i < 0 ? this.f2877a.getChildCount() : h(i);
        this.f2878b.e(childCount, z);
        if (z) {
            l(view);
        }
        this.f2877a.c(view, childCount);
    }

    public void b(View view, boolean z) {
        a(view, -1, z);
    }

    public void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int childCount = i < 0 ? this.f2877a.getChildCount() : h(i);
        this.f2878b.e(childCount, z);
        if (z) {
            l(view);
        }
        this.f2877a.e(view, childCount, layoutParams);
    }

    public void d(int i) {
        int iH = h(i);
        this.f2878b.f(iH);
        this.f2877a.f(iH);
    }

    public View e(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.c.get(i2);
            RecyclerView.d0 d0VarB = this.f2877a.b(view);
            if (d0VarB.getLayoutPosition() == i && !d0VarB.isInvalid() && !d0VarB.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i) {
        return this.f2877a.getChildAt(h(i));
    }

    public int g() {
        return this.f2877a.getChildCount() - this.c.size();
    }

    public final int h(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f2877a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iB = i - (i2 - this.f2878b.b(i2));
            if (iB == 0) {
                while (this.f2878b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iB;
        }
        return -1;
    }

    public View i(int i) {
        return this.f2877a.getChildAt(i);
    }

    public int j() {
        return this.f2877a.getChildCount();
    }

    public void k(View view) {
        int iG = this.f2877a.g(view);
        if (iG >= 0) {
            this.f2878b.h(iG);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void l(View view) {
        this.c.add(view);
        this.f2877a.a(view);
    }

    public int m(View view) {
        int iG = this.f2877a.g(view);
        if (iG == -1 || this.f2878b.d(iG)) {
            return -1;
        }
        return iG - this.f2878b.b(iG);
    }

    public boolean n(View view) {
        return this.c.contains(view);
    }

    public void o() {
        this.f2878b.g();
        for (int size = this.c.size() - 1; size >= 0; size--) {
            this.f2877a.h(this.c.get(size));
            this.c.remove(size);
        }
        this.f2877a.d();
    }

    public void p(View view) {
        int iG = this.f2877a.g(view);
        if (iG < 0) {
            return;
        }
        if (this.f2878b.f(iG)) {
            t(view);
        }
        this.f2877a.i(iG);
    }

    public void q(int i) {
        int iH = h(i);
        View childAt = this.f2877a.getChildAt(iH);
        if (childAt == null) {
            return;
        }
        if (this.f2878b.f(iH)) {
            t(childAt);
        }
        this.f2877a.i(iH);
    }

    public boolean r(View view) {
        int iG = this.f2877a.g(view);
        if (iG == -1) {
            t(view);
            return true;
        }
        if (!this.f2878b.d(iG)) {
            return false;
        }
        this.f2878b.f(iG);
        t(view);
        this.f2877a.i(iG);
        return true;
    }

    public void s(View view) {
        int iG = this.f2877a.g(view);
        if (iG < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f2878b.d(iG)) {
            this.f2878b.a(iG);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.f2877a.h(view);
        return true;
    }

    public String toString() {
        return this.f2878b.toString() + ", hidden list:" + this.c.size();
    }
}
