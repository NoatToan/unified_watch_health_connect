package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import defpackage.ah2;
import defpackage.ghe;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<d> f2907a = new a();

    public class a implements Comparator<d> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f2910a - dVar2.f2910a;
        }
    }

    public static abstract class b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f2908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2909b;

        public c(int i) {
            int[] iArr = new int[i];
            this.f2908a = iArr;
            this.f2909b = iArr.length / 2;
        }

        public int[] a() {
            return this.f2908a;
        }

        public int b(int i) {
            return this.f2908a[i + this.f2909b];
        }

        public void c(int i, int i2) {
            this.f2908a[i + this.f2909b] = i2;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2911b;
        public final int c;

        public d(int i, int i2, int i3) {
            this.f2910a = i;
            this.f2911b = i2;
            this.c = i3;
        }

        public int a() {
            return this.f2910a + this.c;
        }

        public int b() {
            return this.f2911b + this.c;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d> f2912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f2913b;
        public final int[] c;
        public final b d;
        public final int e;
        public final int f;
        public final boolean g;

        public e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z) {
            this.f2912a = list;
            this.f2913b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.d = bVar;
            this.e = bVar.getOldListSize();
            this.f = bVar.getNewListSize();
            this.g = z;
            a();
            f();
        }

        public static g h(Collection<g> collection, int i, boolean z) {
            g next;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f2914a == i && next.c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g next2 = it.next();
                if (z) {
                    next2.f2915b--;
                } else {
                    next2.f2915b++;
                }
            }
            return next;
        }

        public final void a() {
            d dVar = this.f2912a.isEmpty() ? null : this.f2912a.get(0);
            if (dVar == null || dVar.f2910a != 0 || dVar.f2911b != 0) {
                this.f2912a.add(0, new d(0, 0, 0));
            }
            this.f2912a.add(new d(this.e, this.f, 0));
        }

        public int b(@IntRange(from = 0) int i) {
            if (i >= 0 && i < this.e) {
                int i2 = this.f2913b[i];
                if ((i2 & 15) == 0) {
                    return -1;
                }
                return i2 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.e);
        }

        public void c(ghe gheVar) {
            int i;
            ah2 ah2Var = gheVar instanceof ah2 ? (ah2) gheVar : new ah2(gheVar);
            int i2 = this.e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.e;
            int i4 = this.f;
            for (int size = this.f2912a.size() - 1; size >= 0; size--) {
                d dVar = this.f2912a.get(size);
                int iA = dVar.a();
                int iB = dVar.b();
                while (true) {
                    if (i3 <= iA) {
                        break;
                    }
                    i3--;
                    int i5 = this.f2913b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        g gVarH = h(arrayDeque, i6, false);
                        if (gVarH != null) {
                            int i7 = (i2 - gVarH.f2915b) - 1;
                            ah2Var.onMoved(i3, i7);
                            if ((i5 & 4) != 0) {
                                ah2Var.onChanged(i7, 1, this.d.getChangePayload(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new g(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        ah2Var.onRemoved(i3, 1);
                        i2--;
                    }
                }
                while (i4 > iB) {
                    i4--;
                    int i8 = this.c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        g gVarH2 = h(arrayDeque, i9, true);
                        if (gVarH2 == null) {
                            arrayDeque.add(new g(i4, i2 - i3, false));
                        } else {
                            ah2Var.onMoved((i2 - gVarH2.f2915b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                ah2Var.onChanged(i3, 1, this.d.getChangePayload(i9, i4));
                            }
                        }
                    } else {
                        ah2Var.onInserted(i3, 1);
                        i2++;
                    }
                }
                int i10 = dVar.f2910a;
                int i11 = dVar.f2911b;
                for (i = 0; i < dVar.c; i++) {
                    if ((this.f2913b[i10] & 15) == 2) {
                        ah2Var.onChanged(i10, 1, this.d.getChangePayload(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = dVar.f2910a;
                i4 = dVar.f2911b;
            }
            ah2Var.a();
        }

        public void d(RecyclerView.Adapter adapter) {
            c(new androidx.recyclerview.widget.b(adapter));
        }

        public final void e(int i) {
            int size = this.f2912a.size();
            int iB = 0;
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = this.f2912a.get(i2);
                while (iB < dVar.f2911b) {
                    if (this.c[iB] == 0 && this.d.areItemsTheSame(i, iB)) {
                        int i3 = this.d.areContentsTheSame(i, iB) ? 8 : 4;
                        this.f2913b[i] = (iB << 4) | i3;
                        this.c[iB] = (i << 4) | i3;
                        return;
                    }
                    iB++;
                }
                iB = dVar.b();
            }
        }

        public final void f() {
            for (d dVar : this.f2912a) {
                for (int i = 0; i < dVar.c; i++) {
                    int i2 = dVar.f2910a + i;
                    int i3 = dVar.f2911b + i;
                    int i4 = this.d.areContentsTheSame(i2, i3) ? 1 : 2;
                    this.f2913b[i2] = (i3 << 4) | i4;
                    this.c[i3] = (i2 << 4) | i4;
                }
            }
            if (this.g) {
                g();
            }
        }

        public final void g() {
            int iA = 0;
            for (d dVar : this.f2912a) {
                while (iA < dVar.f2910a) {
                    if (this.f2913b[iA] == 0) {
                        e(iA);
                    }
                    iA++;
                }
                iA = dVar.a();
            }
        }
    }

    public static abstract class f<T> {
        public abstract boolean areContentsTheSame(T t, T t2);

        public abstract boolean areItemsTheSame(T t, T t2);

        public Object getChangePayload(T t, T t2) {
            return null;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2915b;
        public boolean c;

        public g(int i, int i2, boolean z) {
            this.f2914a = i;
            this.f2915b = i2;
            this.c = z;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$h, reason: collision with other inner class name */
    public static class C0070h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2917b;
        public int c;
        public int d;

        public C0070h() {
        }

        public int a() {
            return this.d - this.c;
        }

        public int b() {
            return this.f2917b - this.f2916a;
        }

        public C0070h(int i, int i2, int i3, int i4) {
            this.f2916a = i;
            this.f2917b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2919b;
        public int c;
        public int d;
        public boolean e;

        public int a() {
            return Math.min(this.c - this.f2918a, this.d - this.f2919b);
        }

        public boolean b() {
            return this.d - this.f2919b != this.c - this.f2918a;
        }

        public boolean c() {
            return this.d - this.f2919b > this.c - this.f2918a;
        }

        public d d() {
            if (!b()) {
                int i = this.f2918a;
                return new d(i, this.f2919b, this.c - i);
            }
            if (this.e) {
                return new d(this.f2918a, this.f2919b, a());
            }
            return c() ? new d(this.f2918a, this.f2919b + 1, a()) : new d(this.f2918a + 1, this.f2919b, a());
        }
    }

    public static i a(C0070h c0070h, b bVar, c cVar, c cVar2, int i2) {
        int iB;
        int i3;
        int i4;
        boolean z = (c0070h.b() - c0070h.a()) % 2 == 0;
        int iB2 = c0070h.b() - c0070h.a();
        int i5 = -i2;
        for (int i6 = i5; i6 <= i2; i6 += 2) {
            if (i6 == i5 || (i6 != i2 && cVar2.b(i6 + 1) < cVar2.b(i6 - 1))) {
                iB = cVar2.b(i6 + 1);
                i3 = iB;
            } else {
                iB = cVar2.b(i6 - 1);
                i3 = iB - 1;
            }
            int i7 = c0070h.d - ((c0070h.f2917b - i3) - i6);
            int i8 = (i2 == 0 || i3 != iB) ? i7 : i7 + 1;
            while (i3 > c0070h.f2916a && i7 > c0070h.c && bVar.areItemsTheSame(i3 - 1, i7 - 1)) {
                i3--;
                i7--;
            }
            cVar2.c(i6, i3);
            if (z && (i4 = iB2 - i6) >= i5 && i4 <= i2 && cVar.b(i4) >= i3) {
                i iVar = new i();
                iVar.f2918a = i3;
                iVar.f2919b = i7;
                iVar.c = iB;
                iVar.d = i8;
                iVar.e = true;
                return iVar;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z) {
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0070h(0, oldListSize, 0, newListSize));
        int i2 = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        c cVar = new c(i2);
        c cVar2 = new c(i2);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0070h c0070h = (C0070h) arrayList2.remove(arrayList2.size() - 1);
            i iVarE = e(c0070h, bVar, cVar, cVar2);
            if (iVarE != null) {
                if (iVarE.a() > 0) {
                    arrayList.add(iVarE.d());
                }
                C0070h c0070h2 = arrayList3.isEmpty() ? new C0070h() : (C0070h) arrayList3.remove(arrayList3.size() - 1);
                c0070h2.f2916a = c0070h.f2916a;
                c0070h2.c = c0070h.c;
                c0070h2.f2917b = iVarE.f2918a;
                c0070h2.d = iVarE.f2919b;
                arrayList2.add(c0070h2);
                c0070h.f2917b = c0070h.f2917b;
                c0070h.d = c0070h.d;
                c0070h.f2916a = iVarE.c;
                c0070h.c = iVarE.d;
                arrayList2.add(c0070h);
            } else {
                arrayList3.add(c0070h);
            }
        }
        Collections.sort(arrayList, f2907a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z);
    }

    public static i d(C0070h c0070h, b bVar, c cVar, c cVar2, int i2) {
        int iB;
        int i3;
        int i4;
        boolean z = Math.abs(c0070h.b() - c0070h.a()) % 2 == 1;
        int iB2 = c0070h.b() - c0070h.a();
        int i5 = -i2;
        for (int i6 = i5; i6 <= i2; i6 += 2) {
            if (i6 == i5 || (i6 != i2 && cVar.b(i6 + 1) > cVar.b(i6 - 1))) {
                iB = cVar.b(i6 + 1);
                i3 = iB;
            } else {
                iB = cVar.b(i6 - 1);
                i3 = iB + 1;
            }
            int i7 = (c0070h.c + (i3 - c0070h.f2916a)) - i6;
            int i8 = (i2 == 0 || i3 != iB) ? i7 : i7 - 1;
            while (i3 < c0070h.f2917b && i7 < c0070h.d && bVar.areItemsTheSame(i3, i7)) {
                i3++;
                i7++;
            }
            cVar.c(i6, i3);
            if (z && (i4 = iB2 - i6) >= i5 + 1 && i4 <= i2 - 1 && cVar2.b(i4) <= i3) {
                i iVar = new i();
                iVar.f2918a = iB;
                iVar.f2919b = i8;
                iVar.c = i3;
                iVar.d = i7;
                iVar.e = false;
                return iVar;
            }
        }
        return null;
    }

    public static i e(C0070h c0070h, b bVar, c cVar, c cVar2) {
        if (c0070h.b() >= 1 && c0070h.a() >= 1) {
            int iB = ((c0070h.b() + c0070h.a()) + 1) / 2;
            cVar.c(1, c0070h.f2916a);
            cVar2.c(1, c0070h.f2917b);
            for (int i2 = 0; i2 < iB; i2++) {
                i iVarD = d(c0070h, bVar, cVar, cVar2, i2);
                if (iVarD != null) {
                    return iVarD;
                }
                i iVarA = a(c0070h, bVar, cVar, cVar2, i2);
                if (iVarA != null) {
                    return iVarA;
                }
            }
        }
        return null;
    }
}
