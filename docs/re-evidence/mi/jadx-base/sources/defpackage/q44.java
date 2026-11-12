package defpackage;

import android.graphics.Color;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class q44 {
    public static final Comparator<b> g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f31068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f31069b;
    public final List<rjh.e> c;
    public final rjh.c[] e;
    public final float[] f = new float[3];
    public final TimingLogger d = null;

    public static class a implements Comparator<b> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f31071b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public b(int i, int i2) {
            this.f31070a = i;
            this.f31071b = i2;
            c();
        }

        public final boolean a() {
            return e() > 1;
        }

        public final int b() {
            int iF = f();
            q44 q44Var = q44.this;
            int[] iArr = q44Var.f31068a;
            int[] iArr2 = q44Var.f31069b;
            q44.e(iArr, iF, this.f31070a, this.f31071b);
            Arrays.sort(iArr, this.f31070a, this.f31071b + 1);
            q44.e(iArr, iF, this.f31070a, this.f31071b);
            int i = this.c / 2;
            int i2 = this.f31070a;
            int i3 = 0;
            while (true) {
                int i4 = this.f31071b;
                if (i2 > i4) {
                    return this.f31070a;
                }
                i3 += iArr2[iArr[i2]];
                if (i3 >= i) {
                    return Math.min(i4 - 1, i2);
                }
                i2++;
            }
        }

        public final void c() {
            q44 q44Var = q44.this;
            int[] iArr = q44Var.f31068a;
            int[] iArr2 = q44Var.f31069b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = this.f31070a; i8 <= this.f31071b; i8++) {
                int i9 = iArr[i8];
                i5 += iArr2[i9];
                int iK = q44.k(i9);
                int iJ = q44.j(i9);
                int i10 = q44.i(i9);
                if (iK > i2) {
                    i2 = iK;
                }
                if (iK < i) {
                    i = iK;
                }
                if (iJ > i3) {
                    i3 = iJ;
                }
                if (iJ < i6) {
                    i6 = iJ;
                }
                if (i10 > i4) {
                    i4 = i10;
                }
                if (i10 < i7) {
                    i7 = i10;
                }
            }
            this.d = i;
            this.e = i2;
            this.f = i6;
            this.g = i3;
            this.h = i7;
            this.i = i4;
            this.c = i5;
        }

        public final rjh.e d() {
            q44 q44Var = q44.this;
            int[] iArr = q44Var.f31068a;
            int[] iArr2 = q44Var.f31069b;
            int iK = 0;
            int i = 0;
            int iJ = 0;
            int i2 = 0;
            for (int i3 = this.f31070a; i3 <= this.f31071b; i3++) {
                int i4 = iArr[i3];
                int i5 = iArr2[i4];
                i += i5;
                iK += q44.k(i4) * i5;
                iJ += q44.j(i4) * i5;
                i2 += i5 * q44.i(i4);
            }
            float f = i;
            return new rjh.e(q44.b(Math.round(iK / f), Math.round(iJ / f), Math.round(i2 / f)), i);
        }

        public final int e() {
            return (this.f31071b + 1) - this.f31070a;
        }

        public final int f() {
            int i = this.e - this.d;
            int i2 = this.g - this.f;
            int i3 = this.i - this.h;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        public final int g() {
            return ((this.e - this.d) + 1) * ((this.g - this.f) + 1) * ((this.i - this.h) + 1);
        }

        public final b h() {
            if (!a()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iB = b();
            b bVar = q44.this.new b(iB + 1, this.f31071b);
            this.f31071b = iB;
            c();
            return bVar;
        }
    }

    public q44(int[] iArr, int i, rjh.c[] cVarArr) {
        this.e = cVarArr;
        int[] iArr2 = new int[32768];
        this.f31069b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int iG = g(iArr[i2]);
            iArr[i2] = iG;
            iArr2[iG] = iArr2[iG] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && l(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f31068a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 > i) {
            this.c = h(i);
            return;
        }
        this.c = new ArrayList();
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = iArr3[i7];
            this.c.add(new rjh.e(a(i8), iArr2[i8]));
        }
    }

    public static int a(int i) {
        return b(k(i), j(i), i(i));
    }

    public static int b(int i, int i2, int i3) {
        return Color.rgb(f(i, 5, 8), f(i2, 5, 8), f(i3, 5, 8));
    }

    public static void e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = i(i4) | (j(i4) << 10) | (k(i4) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = k(i5) | (i(i5) << 10) | (j(i5) << 5);
            i2++;
        }
    }

    public static int f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public static int g(int i) {
        return f(Color.blue(i), 8, 5) | (f(Color.red(i), 8, 5) << 10) | (f(Color.green(i), 8, 5) << 5);
    }

    public static int i(int i) {
        return i & 31;
    }

    public static int j(int i) {
        return (i >> 5) & 31;
    }

    public static int k(int i) {
        return (i >> 10) & 31;
    }

    public final List<rjh.e> c(Collection<b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<b> it = collection.iterator();
        while (it.hasNext()) {
            rjh.e eVarD = it.next().d();
            if (!n(eVarD)) {
                arrayList.add(eVarD);
            }
        }
        return arrayList;
    }

    public List<rjh.e> d() {
        return this.c;
    }

    public final List<rjh.e> h(int i) {
        PriorityQueue<b> priorityQueue = new PriorityQueue<>(i, g);
        priorityQueue.offer(new b(0, this.f31068a.length - 1));
        o(priorityQueue, i);
        return c(priorityQueue);
    }

    public final boolean l(int i) {
        int iA = a(i);
        z44.g(iA, this.f);
        return m(iA, this.f);
    }

    public final boolean m(int i, float[] fArr) {
        rjh.c[] cVarArr = this.e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.e[i2].a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean n(rjh.e eVar) {
        return m(eVar.e(), eVar.c());
    }

    public final void o(PriorityQueue<b> priorityQueue, int i) {
        b bVarPoll;
        while (priorityQueue.size() < i && (bVarPoll = priorityQueue.poll()) != null && bVarPoll.a()) {
            priorityQueue.offer(bVarPoll.h());
            priorityQueue.offer(bVarPoll);
        }
    }
}
