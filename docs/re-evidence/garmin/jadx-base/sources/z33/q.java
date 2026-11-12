package z33;

import i3.e5;
import j20.x;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public class q extends z33.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f202216h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f202217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z33.c f202218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z33.c f202219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f202220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f202221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f202222g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Stack<z33.c> f202223a;

        private b() {
            this.f202223a = new Stack<>();
        }

        public final void a(z33.c cVar) {
            if (!cVar.f()) {
                if (!(cVar instanceof q)) {
                    String strValueOf = String.valueOf(cVar.getClass());
                    vb.h.s(am.j.o("Has a new type of ByteString been created? Found ", strValueOf, new StringBuilder(strValueOf.length() + 49)));
                    return;
                } else {
                    q qVar = (q) cVar;
                    a(qVar.f202218c);
                    a(qVar.f202219d);
                    return;
                }
            }
            int size = cVar.size();
            int[] iArr = q.f202216h;
            int iBinarySearch = Arrays.binarySearch(iArr, size);
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int i14 = iArr[iBinarySearch + 1];
            Stack<z33.c> stack = this.f202223a;
            if (stack.isEmpty() || stack.peek().size() >= i14) {
                stack.push(cVar);
                return;
            }
            int i15 = iArr[iBinarySearch];
            z33.c cVarPop = stack.pop();
            while (true) {
                if (stack.isEmpty() || stack.peek().size() >= i15) {
                    break;
                } else {
                    cVarPop = new q(stack.pop(), cVarPop);
                }
            }
            q qVar2 = new q(cVarPop, cVar);
            while (!stack.isEmpty()) {
                int[] iArr2 = q.f202216h;
                int iBinarySearch2 = Arrays.binarySearch(iArr2, qVar2.f202217b);
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                }
                if (stack.peek().size() >= iArr2[iBinarySearch2 + 1]) {
                    break;
                } else {
                    qVar2 = new q(stack.pop(), qVar2);
                }
            }
            stack.push(qVar2);
        }
    }

    public static class c implements Iterator<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Stack<q> f202224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public m f202225b;

        private c(z33.c cVar) {
            this.f202224a = new Stack<>();
            while (cVar instanceof q) {
                q qVar = (q) cVar;
                this.f202224a.push(qVar);
                cVar = qVar.f202218c;
            }
            this.f202225b = (m) cVar;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m next() {
            m mVar;
            m mVar2 = this.f202225b;
            if (mVar2 == null) {
                c22.t.g();
                return null;
            }
            do {
                Stack<q> stack = this.f202224a;
                if (stack.isEmpty()) {
                    mVar = null;
                    break;
                }
                z33.c cVar = stack.pop().f202219d;
                while (cVar instanceof q) {
                    q qVar = (q) cVar;
                    stack.push(qVar);
                    cVar = qVar.f202218c;
                }
                mVar = (m) cVar;
            } while (mVar.size() == 0);
            this.f202225b = mVar;
            return mVar2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f202225b != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class d implements z33.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f202226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public z33.c.a f202227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f202228c;

        private d(q qVar) {
            c cVar = new c(qVar);
            this.f202226a = cVar;
            this.f202227b = cVar.next().iterator();
            this.f202228c = qVar.f202217b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f202228c > 0;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // z33.c.a
        public final byte nextByte() {
            if (!this.f202227b.hasNext()) {
                this.f202227b = this.f202226a.next().iterator();
            }
            this.f202228c--;
            return this.f202227b.nextByte();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i14 = 1;
        int i15 = 1;
        while (i14 > 0) {
            int iD = e5.d(i14, i15, arrayList, i14);
            i15 = i14;
            i14 = iD;
        }
        arrayList.add(Integer.MAX_VALUE);
        f202216h = new int[arrayList.size()];
        int i16 = 0;
        while (true) {
            int[] iArr = f202216h;
            if (i16 >= iArr.length) {
                return;
            }
            iArr[i16] = ((Integer) arrayList.get(i16)).intValue();
            i16++;
        }
    }

    private q(z33.c cVar, z33.c cVar2) {
        this.f202222g = 0;
        this.f202218c = cVar;
        this.f202219d = cVar2;
        int size = cVar.size();
        this.f202220e = size;
        this.f202217b = cVar2.size() + size;
        this.f202221f = Math.max(cVar.e(), cVar2.e()) + 1;
    }

    public static z33.c q(z33.c cVar, z33.c cVar2) {
        q qVar = cVar instanceof q ? (q) cVar : null;
        if (cVar2.size() == 0) {
            return cVar;
        }
        if (cVar.size() == 0) {
            return cVar2;
        }
        int size = cVar2.size() + cVar.size();
        if (size < 128) {
            int size2 = cVar.size();
            int size3 = cVar2.size();
            byte[] bArr = new byte[size2 + size3];
            cVar.c(bArr, 0, 0, size2);
            cVar2.c(bArr, 0, size2, size3);
            return new m(bArr);
        }
        if (qVar != null) {
            z33.c cVar3 = qVar.f202219d;
            if (cVar2.size() + cVar3.size() < 128) {
                int size4 = cVar3.size();
                int size5 = cVar2.size();
                byte[] bArr2 = new byte[size4 + size5];
                cVar3.c(bArr2, 0, 0, size4);
                cVar2.c(bArr2, 0, size4, size5);
                return new q(qVar.f202218c, new m(bArr2));
            }
        }
        if (qVar != null) {
            z33.c cVar4 = qVar.f202219d;
            z33.c cVar5 = qVar.f202218c;
            if (cVar5.e() > cVar4.e() && qVar.f202221f > cVar2.e()) {
                return new q(cVar5, new q(cVar4, cVar2));
            }
        }
        if (size >= f202216h[Math.max(cVar.e(), cVar2.e()) + 1]) {
            return new q(cVar, cVar2);
        }
        b bVar = new b();
        bVar.a(cVar);
        bVar.a(cVar2);
        Stack<z33.c> stack = bVar.f202223a;
        z33.c cVarPop = stack.pop();
        while (!stack.isEmpty()) {
            cVarPop = new q(stack.pop(), cVarPop);
        }
        return cVarPop;
    }

    @Override // z33.c
    public final void d(byte[] bArr, int i14, int i15, int i16) {
        int i17 = i14 + i16;
        z33.c cVar = this.f202218c;
        int i18 = this.f202220e;
        if (i17 <= i18) {
            cVar.d(bArr, i14, i15, i16);
            return;
        }
        z33.c cVar2 = this.f202219d;
        if (i14 >= i18) {
            cVar2.d(bArr, i14 - i18, i15, i16);
            return;
        }
        int i19 = i18 - i14;
        cVar.d(bArr, i14, i15, i19);
        cVar2.d(bArr, 0, i15 + i19, i16 - i19);
    }

    @Override // z33.c
    public final int e() {
        return this.f202221f;
    }

    public final boolean equals(Object obj) {
        int iM;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z33.c) {
            z33.c cVar = (z33.c) obj;
            int size = cVar.size();
            int i14 = this.f202217b;
            if (i14 == size) {
                if (i14 == 0) {
                    return true;
                }
                if (this.f202222g == 0 || (iM = cVar.m()) == 0 || this.f202222g == iM) {
                    c cVar2 = new c(this);
                    m next = cVar2.next();
                    c cVar3 = new c(cVar);
                    m next2 = cVar3.next();
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        int size2 = next.size() - i15;
                        int size3 = next2.size() - i16;
                        int iMin = Math.min(size2, size3);
                        if (!(i15 == 0 ? next.q(next2, i16, iMin) : next2.q(next, i15, iMin))) {
                            break;
                        }
                        i17 += iMin;
                        if (i17 >= i14) {
                            if (i17 == i14) {
                                return true;
                            }
                            x.h();
                            return false;
                        }
                        if (iMin == size2) {
                            next = cVar2.next();
                            i15 = 0;
                        } else {
                            i15 += iMin;
                        }
                        if (iMin == size3) {
                            next2 = cVar3.next();
                            i16 = 0;
                        } else {
                            i16 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // z33.c
    public final boolean f() {
        return this.f202217b >= f202216h[this.f202221f];
    }

    @Override // z33.c
    public final boolean g() {
        int iL = this.f202218c.l(0, 0, this.f202220e);
        z33.c cVar = this.f202219d;
        return cVar.l(iL, 0, cVar.size()) == 0;
    }

    @Override // z33.c, java.lang.Iterable
    /* JADX INFO: renamed from: h */
    public final z33.c.a iterator() {
        return new d();
    }

    public final int hashCode() {
        int iJ = this.f202222g;
        if (iJ == 0) {
            int i14 = this.f202217b;
            iJ = j(i14, 0, i14);
            if (iJ == 0) {
                iJ = 1;
            }
            this.f202222g = iJ;
        }
        return iJ;
    }

    @Override // z33.c
    public final int j(int i14, int i15, int i16) {
        int i17 = i15 + i16;
        z33.c cVar = this.f202218c;
        int i18 = this.f202220e;
        if (i17 <= i18) {
            return cVar.j(i14, i15, i16);
        }
        z33.c cVar2 = this.f202219d;
        if (i15 >= i18) {
            return cVar2.j(i14, i15 - i18, i16);
        }
        int i19 = i18 - i15;
        return cVar2.j(cVar.j(i14, i15, i19), 0, i16 - i19);
    }

    @Override // z33.c
    public final int l(int i14, int i15, int i16) {
        int i17 = i15 + i16;
        z33.c cVar = this.f202218c;
        int i18 = this.f202220e;
        if (i17 <= i18) {
            return cVar.l(i14, i15, i16);
        }
        z33.c cVar2 = this.f202219d;
        if (i15 >= i18) {
            return cVar2.l(i14, i15 - i18, i16);
        }
        int i19 = i18 - i15;
        return cVar2.l(cVar.l(i14, i15, i19), 0, i16 - i19);
    }

    @Override // z33.c
    public final int m() {
        return this.f202222g;
    }

    @Override // z33.c
    public final String n() {
        byte[] bArr;
        int i14 = this.f202217b;
        if (i14 == 0) {
            bArr = h.f202205a;
        } else {
            byte[] bArr2 = new byte[i14];
            d(bArr2, 0, 0, i14);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // z33.c
    public final void p(OutputStream outputStream, int i14, int i15) {
        int i16 = i14 + i15;
        z33.c cVar = this.f202218c;
        int i17 = this.f202220e;
        if (i16 <= i17) {
            cVar.p(outputStream, i14, i15);
            return;
        }
        z33.c cVar2 = this.f202219d;
        if (i14 >= i17) {
            cVar2.p(outputStream, i14 - i17, i15);
            return;
        }
        int i18 = i17 - i14;
        cVar.p(outputStream, i14, i18);
        cVar2.p(outputStream, 0, i15 - i18);
    }

    @Override // z33.c
    public final int size() {
        return this.f202217b;
    }
}
