package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f10448a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f10452e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10451d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f10449b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f10450c = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f10453a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f10454b;

        public final void a(int i14) {
            if (i14 < 64) {
                this.f10453a &= ~(1 << i14);
                return;
            }
            a aVar = this.f10454b;
            if (aVar != null) {
                aVar.a(i14 - 64);
            }
        }

        public final int b(int i14) {
            a aVar = this.f10454b;
            if (aVar == null) {
                long j8 = this.f10453a;
                return i14 >= 64 ? Long.bitCount(j8) : Long.bitCount(((1 << i14) - 1) & j8);
            }
            if (i14 < 64) {
                return Long.bitCount(this.f10453a & ((1 << i14) - 1));
            }
            return Long.bitCount(this.f10453a) + aVar.b(i14 - 64);
        }

        public final void c() {
            if (this.f10454b == null) {
                this.f10454b = new a();
            }
        }

        public final boolean d(int i14) {
            if (i14 < 64) {
                return (this.f10453a & (1 << i14)) != 0;
            }
            c();
            return this.f10454b.d(i14 - 64);
        }

        public final void e(int i14, boolean z14) {
            if (i14 >= 64) {
                c();
                this.f10454b.e(i14 - 64, z14);
                return;
            }
            long j8 = this.f10453a;
            boolean z15 = (Long.MIN_VALUE & j8) != 0;
            long j14 = (1 << i14) - 1;
            this.f10453a = ((j8 & (~j14)) << 1) | (j8 & j14);
            if (z14) {
                h(i14);
            } else {
                a(i14);
            }
            if (z15 || this.f10454b != null) {
                c();
                this.f10454b.e(0, z15);
            }
        }

        public final boolean f(int i14) {
            if (i14 >= 64) {
                c();
                return this.f10454b.f(i14 - 64);
            }
            long j8 = 1 << i14;
            long j14 = this.f10453a;
            boolean z14 = (j14 & j8) != 0;
            long j15 = j14 & (~j8);
            this.f10453a = j15;
            long j16 = j8 - 1;
            this.f10453a = (j15 & j16) | Long.rotateRight((~j16) & j15, 1);
            a aVar = this.f10454b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f10454b.f(0);
            }
            return z14;
        }

        public final void g() {
            this.f10453a = 0L;
            a aVar = this.f10454b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i14) {
            if (i14 < 64) {
                this.f10453a |= 1 << i14;
            } else {
                c();
                this.f10454b.h(i14 - 64);
            }
        }

        public final String toString() {
            if (this.f10454b == null) {
                return Long.toBinaryString(this.f10453a);
            }
            return this.f10454b.toString() + "xx" + Long.toBinaryString(this.f10453a);
        }
    }

    public interface b {
    }

    public f(b bVar) {
        this.f10448a = bVar;
    }

    public final void a(View view2, int i14, boolean z14) {
        b bVar = this.f10448a;
        int childCount = i14 < 0 ? RecyclerView.this.getChildCount() : f(i14);
        this.f10449b.e(childCount, z14);
        if (z14) {
            i(view2);
        }
        RecyclerView recyclerView = RecyclerView.this;
        recyclerView.addView(view2, childCount);
        recyclerView.dispatchChildAttached(view2);
    }

    public final void b(View view2, int i14, ViewGroup.LayoutParams layoutParams, boolean z14) {
        b bVar = this.f10448a;
        int childCount = i14 < 0 ? RecyclerView.this.getChildCount() : f(i14);
        this.f10449b.e(childCount, z14);
        if (z14) {
            i(view2);
        }
        RecyclerView recyclerView = RecyclerView.this;
        RecyclerView.f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb3 = new StringBuilder("Called attach on a child which is not detached: ");
                sb3.append(childViewHolderInt);
                vb.h.s(androidx.core.view.j.g(recyclerView, sb3));
                return;
            } else {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb4 = new StringBuilder("No ViewHolder found for child: ");
            sb4.append(view2);
            sb4.append(", index: ");
            sb4.append(childCount);
            vb.h.s(androidx.core.view.j.g(recyclerView, sb4));
            return;
        }
        recyclerView.attachViewToParent(view2, childCount, layoutParams);
    }

    public final void c(int i14) {
        int iF = f(i14);
        this.f10449b.f(iF);
        RecyclerView recyclerView = RecyclerView.this;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            RecyclerView.f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb3 = new StringBuilder("called detach on an already detached child ");
                    sb3.append(childViewHolderInt);
                    vb.h.s(androidx.core.view.j.g(recyclerView, sb3));
                    return;
                } else {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.addFlags(256);
                }
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb4 = new StringBuilder("No view at offset ");
            sb4.append(iF);
            vb.h.s(androidx.core.view.j.g(recyclerView, sb4));
            return;
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i14) {
        return RecyclerView.this.getChildAt(f(i14));
    }

    public final int e() {
        return RecyclerView.this.getChildCount() - this.f10450c.size();
    }

    public final int f(int i14) {
        if (i14 < 0) {
            return -1;
        }
        int childCount = RecyclerView.this.getChildCount();
        int i15 = i14;
        while (i15 < childCount) {
            a aVar = this.f10449b;
            int iB = i14 - (i15 - aVar.b(i15));
            if (iB == 0) {
                while (aVar.d(i15)) {
                    i15++;
                }
                return i15;
            }
            i15 += iB;
        }
        return -1;
    }

    public final View g(int i14) {
        return RecyclerView.this.getChildAt(i14);
    }

    public final int h() {
        return RecyclerView.this.getChildCount();
    }

    public final void i(View view2) {
        this.f10450c.add(view2);
        RecyclerView.e eVar = (RecyclerView.e) this.f10448a;
        eVar.getClass();
        RecyclerView.f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
        }
    }

    public final int j(View view2) {
        int iIndexOfChild = RecyclerView.this.indexOfChild(view2);
        if (iIndexOfChild == -1) {
            return -1;
        }
        a aVar = this.f10449b;
        if (aVar.d(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - aVar.b(iIndexOfChild);
    }

    public final void k(int i14) {
        b bVar = this.f10448a;
        int i15 = this.f10451d;
        if (i15 == 1) {
            vb.h.z("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i15 == 2) {
            vb.h.z("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int iF = f(i14);
            View childAt = RecyclerView.this.getChildAt(iF);
            if (childAt == null) {
                return;
            }
            this.f10451d = 1;
            this.f10452e = childAt;
            if (this.f10449b.f(iF)) {
                l(childAt);
            }
            ((RecyclerView.e) bVar).a(iF);
        } finally {
            this.f10451d = 0;
            this.f10452e = null;
        }
    }

    public final void l(View view2) {
        if (this.f10450c.remove(view2)) {
            RecyclerView.e eVar = (RecyclerView.e) this.f10448a;
            eVar.getClass();
            RecyclerView.f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }
    }

    public final String toString() {
        return this.f10449b.toString() + ", hidden list:" + this.f10450c.size();
    }
}
