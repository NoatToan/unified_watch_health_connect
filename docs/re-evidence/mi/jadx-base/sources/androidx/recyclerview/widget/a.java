package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements r.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Pools.Pool<b> f2849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f2850b;
    public final ArrayList<b> c;
    public final InterfaceC0066a d;
    public Runnable e;
    public final boolean f;
    public final r g;
    public int h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0066a {
        void a(int i, int i2);

        void b(b bVar);

        void c(b bVar);

        RecyclerView.d0 d(int i);

        void e(int i, int i2);

        void f(int i, int i2);

        void g(int i, int i2);

        void h(int i, int i2, Object obj);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2852b;
        public Object c;
        public int d;

        public b(int i, int i2, int i3, Object obj) {
            this.f2851a = i;
            this.f2852b = i2;
            this.d = i3;
            this.c = obj;
        }

        public String a() {
            int i = this.f2851a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f2851a;
            if (i != bVar.f2851a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.f2852b) == 1 && this.d == bVar.f2852b && this.f2852b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.f2852b != bVar.f2852b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.c)) {
                    return false;
                }
            } else if (bVar.c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2851a * 31) + this.f2852b) * 31) + this.d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f2852b + "c:" + this.d + ",p:" + this.c + "]";
        }
    }

    public a(InterfaceC0066a interfaceC0066a) {
        this(interfaceC0066a, false);
    }

    @Override // androidx.recyclerview.widget.r.a
    public b a(int i, int i2, int i3, Object obj) {
        b bVarAcquire = this.f2849a.acquire();
        if (bVarAcquire == null) {
            return new b(i, i2, i3, obj);
        }
        bVarAcquire.f2851a = i;
        bVarAcquire.f2852b = i2;
        bVarAcquire.d = i3;
        bVarAcquire.c = obj;
        return bVarAcquire;
    }

    @Override // androidx.recyclerview.widget.r.a
    public void b(b bVar) {
        if (this.f) {
            return;
        }
        bVar.c = null;
        this.f2849a.release(bVar);
    }

    public final void c(b bVar) {
        v(bVar);
    }

    public final void d(b bVar) {
        v(bVar);
    }

    public int e(int i) {
        int size = this.f2850b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2850b.get(i2);
            int i3 = bVar.f2851a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f2852b;
                    if (i4 <= i) {
                        int i5 = bVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f2852b;
                    if (i6 == i) {
                        i = bVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f2852b <= i) {
                i += bVar.d;
            }
        }
        return i;
    }

    public final void f(b bVar) {
        boolean z;
        byte b2;
        int i = bVar.f2852b;
        int i2 = bVar.d + i;
        byte b3 = -1;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.d.d(i3) != null || h(i3)) {
                if (b3 == 0) {
                    k(a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b2 = 1;
            } else {
                if (b3 == 1) {
                    v(a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b2 = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            b3 = b2;
        }
        if (i4 != bVar.d) {
            b(bVar);
            bVar = a(2, i, i4, null);
        }
        if (b3 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    public final void g(b bVar) {
        int i = bVar.f2852b;
        int i2 = bVar.d + i;
        int i3 = 0;
        byte b2 = -1;
        int i4 = i;
        while (i < i2) {
            if (this.d.d(i) != null || h(i)) {
                if (b2 == 0) {
                    k(a(4, i4, i3, bVar.c));
                    i4 = i;
                    i3 = 0;
                }
                b2 = 1;
            } else {
                if (b2 == 1) {
                    v(a(4, i4, i3, bVar.c));
                    i4 = i;
                    i3 = 0;
                }
                b2 = 0;
            }
            i3++;
            i++;
        }
        if (i3 != bVar.d) {
            Object obj = bVar.c;
            b(bVar);
            bVar = a(4, i4, i3, obj);
        }
        if (b2 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    public final boolean h(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.c.get(i2);
            int i3 = bVar.f2851a;
            if (i3 == 8) {
                if (n(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f2852b;
                int i5 = bVar.d + i4;
                while (i4 < i5) {
                    if (n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void i() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.d.c(this.c.get(i));
        }
        x(this.c);
        this.h = 0;
    }

    public void j() {
        i();
        int size = this.f2850b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f2850b.get(i);
            int i2 = bVar.f2851a;
            if (i2 == 1) {
                this.d.c(bVar);
                this.d.e(bVar.f2852b, bVar.d);
            } else if (i2 == 2) {
                this.d.c(bVar);
                this.d.f(bVar.f2852b, bVar.d);
            } else if (i2 == 4) {
                this.d.c(bVar);
                this.d.h(bVar.f2852b, bVar.d, bVar.c);
            } else if (i2 == 8) {
                this.d.c(bVar);
                this.d.a(bVar.f2852b, bVar.d);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f2850b);
        this.h = 0;
    }

    public final void k(b bVar) {
        int i;
        int i2 = bVar.f2851a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(bVar.f2852b, i2);
        int i3 = bVar.f2852b;
        int i4 = bVar.f2851a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.d; i6++) {
            int iZ2 = z(bVar.f2852b + (i * i6), bVar.f2851a);
            int i7 = bVar.f2851a;
            if (i7 == 2 ? iZ2 != iZ : !(i7 == 4 && iZ2 == iZ + 1)) {
                b bVarA = a(i7, iZ, i5, bVar.c);
                l(bVarA, i3);
                b(bVarA);
                if (bVar.f2851a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iZ = iZ2;
            } else {
                i5++;
            }
        }
        Object obj = bVar.c;
        b(bVar);
        if (i5 > 0) {
            b bVarA2 = a(bVar.f2851a, iZ, i5, obj);
            l(bVarA2, i3);
            b(bVarA2);
        }
    }

    public void l(b bVar, int i) {
        this.d.b(bVar);
        int i2 = bVar.f2851a;
        if (i2 == 2) {
            this.d.f(i, bVar.d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.d.h(i, bVar.d, bVar.c);
        }
    }

    public int m(int i) {
        return n(i, 0);
    }

    public int n(int i, int i2) {
        int size = this.c.size();
        while (i2 < size) {
            b bVar = this.c.get(i2);
            int i3 = bVar.f2851a;
            if (i3 == 8) {
                int i4 = bVar.f2852b;
                if (i4 == i) {
                    i = bVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f2852b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean o(int i) {
        return (i & this.h) != 0;
    }

    public boolean p() {
        return this.f2850b.size() > 0;
    }

    public boolean q() {
        return (this.c.isEmpty() || this.f2850b.isEmpty()) ? false : true;
    }

    public boolean r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f2850b.add(a(4, i, i2, obj));
        this.h |= 4;
        return this.f2850b.size() == 1;
    }

    public boolean s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f2850b.add(a(1, i, i2, null));
        this.h |= 1;
        return this.f2850b.size() == 1;
    }

    public boolean t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f2850b.add(a(8, i, i2, null));
        this.h |= 8;
        return this.f2850b.size() == 1;
    }

    public boolean u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f2850b.add(a(2, i, i2, null));
        this.h |= 2;
        return this.f2850b.size() == 1;
    }

    public final void v(b bVar) {
        this.c.add(bVar);
        int i = bVar.f2851a;
        if (i == 1) {
            this.d.e(bVar.f2852b, bVar.d);
            return;
        }
        if (i == 2) {
            this.d.g(bVar.f2852b, bVar.d);
            return;
        }
        if (i == 4) {
            this.d.h(bVar.f2852b, bVar.d, bVar.c);
        } else {
            if (i == 8) {
                this.d.a(bVar.f2852b, bVar.d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void w() {
        this.g.b(this.f2850b);
        int size = this.f2850b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f2850b.get(i);
            int i2 = bVar.f2851a;
            if (i2 == 1) {
                c(bVar);
            } else if (i2 == 2) {
                f(bVar);
            } else if (i2 == 4) {
                g(bVar);
            } else if (i2 == 8) {
                d(bVar);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f2850b.clear();
    }

    public void x(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b(list.get(i));
        }
        list.clear();
    }

    public void y() {
        x(this.f2850b);
        x(this.c);
        this.h = 0;
    }

    public final int z(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b bVar = this.c.get(size);
            int i5 = bVar.f2851a;
            if (i5 == 8) {
                int i6 = bVar.f2852b;
                int i7 = bVar.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f2852b = i6 + 1;
                            bVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f2852b = i6 - 1;
                            bVar.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f2852b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f2852b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.f2852b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.d;
                    } else if (i5 == 2) {
                        i += bVar.d;
                    }
                } else if (i2 == 1) {
                    bVar.f2852b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.f2852b = i8 - 1;
                }
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.c.get(size2);
            if (bVar2.f2851a == 8) {
                int i9 = bVar2.d;
                if (i9 == bVar2.f2852b || i9 < 0) {
                    this.c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.d <= 0) {
                this.c.remove(size2);
                b(bVar2);
            }
        }
        return i;
    }

    public a(InterfaceC0066a interfaceC0066a, boolean z) {
        this.f2849a = new Pools.SimplePool(30);
        this.f2850b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.h = 0;
        this.d = interfaceC0066a;
        this.f = z;
        this.g = new r(this);
    }
}
