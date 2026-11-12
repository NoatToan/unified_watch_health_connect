package j53;

import f4.r;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p13.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lj53/f;", "E", "Lp13/f;", "Li53/f$a;", "Li53/f;", "vector", "", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(Li53/f;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f<E> extends p13.f<E> implements i53.f.a<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f97118g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f97119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i53.f<? extends E> f97120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n53.e f97121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f97122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f97123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f97124f;

    public f(i53.f<? extends E> fVar, Object[] objArr, Object[] objArr2, int i14) {
        fVar.getClass();
        objArr2.getClass();
        this.f97119a = i14;
        this.f97120b = fVar;
        this.f97121c = new n53.e();
        this.f97122d = objArr;
        this.f97123e = objArr2;
        this.f97124f = fVar.size();
    }

    public static void c(Object[] objArr, int i14, Iterator it) {
        while (i14 < 32 && it.hasNext()) {
            objArr[i14] = it.next();
            i14++;
        }
    }

    public final int A(e23.l<? super E, Boolean> lVar, Object[] objArr, int i14, d dVar) {
        Object[] objArrM = objArr;
        int i15 = i14;
        boolean z14 = false;
        for (int i16 = 0; i16 < i14; i16++) {
            Object obj = objArr[i16];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z14) {
                    objArrM = m(objArr);
                    z14 = true;
                    i15 = i16;
                }
            } else if (z14) {
                objArrM[i15] = obj;
                i15++;
            }
        }
        dVar.f97113a = objArrM;
        return i15;
    }

    public final int B(e23.l<? super E, Boolean> lVar, int i14, d dVar) {
        int iA = A(lVar, this.f97123e, i14, dVar);
        Object obj = dVar.f97113a;
        if (iA == i14) {
            return i14;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iA, i14, (Object) null);
        K(objArr);
        this.f97124f -= i14 - iA;
        return iA;
    }

    public final boolean D(e23.l<? super E, Boolean> lVar) {
        int i14;
        e23.l<? super E, Boolean> lVar2 = lVar;
        int iM = M();
        Object[] objArrQ = null;
        d dVar = new d(null);
        boolean z14 = false;
        if (this.f97122d != null) {
            a aVarL = l(0);
            int iA = 32;
            while (iA == 32 && aVarL.hasNext()) {
                iA = A(lVar2, (Object[]) aVarL.next(), 32, dVar);
            }
            if (iA == 32) {
                aVarL.hasNext();
                int iB = B(lVar2, iM, dVar);
                if (iB == 0) {
                    t(this.f97124f, this.f97119a, this.f97122d);
                }
                if (iB != iM) {
                }
            } else {
                int iPreviousIndex = aVarL.previousIndex() << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iY = iA;
                while (aVarL.hasNext()) {
                    iY = y(lVar2, (Object[]) aVarL.next(), 32, iY, dVar, arrayList2, arrayList);
                    lVar2 = lVar;
                }
                int iY2 = y(lVar, this.f97123e, iM, iY, dVar, arrayList2, arrayList);
                Object obj = dVar.f97113a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iY2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrU = this.f97122d;
                if (zIsEmpty) {
                    objArrU.getClass();
                } else {
                    objArrU = u(objArrU, iPreviousIndex, this.f97119a, arrayList.iterator());
                }
                int size = iPreviousIndex + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    vb.h.z("Check failed.");
                    return false;
                }
                if (size == 0) {
                    this.f97119a = 0;
                } else {
                    int i15 = size - 1;
                    while (true) {
                        i14 = this.f97119a;
                        if ((i15 >> i14) != 0) {
                            break;
                        }
                        this.f97119a = i14 - 5;
                        Object[] objArr2 = objArrU[0];
                        objArr2.getClass();
                        objArrU = objArr2;
                    }
                    objArrQ = q(i15, i14, objArrU);
                }
                J(objArrQ);
                K(objArr);
                this.f97124f = size + iY2;
            }
            z14 = true;
        } else if (B(lVar2, iM, dVar) != iM) {
            z14 = true;
        }
        if (z14) {
            ((AbstractList) this).modCount++;
        }
        return z14;
    }

    public final Object[] E(Object[] objArr, int i14, int i15, d dVar) {
        int iA = l.a(i15, i14);
        if (i14 == 0) {
            Object obj = objArr[iA];
            Object[] objArrM = m(objArr);
            s.h(objArr, objArrM, iA, iA + 1, 32);
            objArrM[31] = dVar.f97113a;
            dVar.f97113a = obj;
            return objArrM;
        }
        int iA2 = objArr[31] == null ? l.a(G() - 1, i14) : 31;
        Object[] objArrM2 = m(objArr);
        int i16 = i14 - 5;
        int i17 = iA + 1;
        if (i17 <= iA2) {
            while (true) {
                Object obj2 = objArrM2[iA2];
                obj2.getClass();
                objArrM2[iA2] = E((Object[]) obj2, i16, 0, dVar);
                if (iA2 == i17) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrM2[iA];
        obj3.getClass();
        objArrM2[iA] = E((Object[]) obj3, i16, i15, dVar);
        return objArrM2;
    }

    public final Object F(Object[] objArr, int i14, int i15, int i16) {
        int i17 = this.f97124f - i14;
        Object[] objArr2 = this.f97123e;
        if (i17 == 1) {
            Object obj = objArr2[0];
            t(i14, i15, objArr);
            return obj;
        }
        Object obj2 = objArr2[i16];
        Object[] objArrM = m(objArr2);
        s.h(objArr2, objArrM, i16, i16 + 1, i17);
        objArrM[i17 - 1] = null;
        J(objArr);
        K(objArrM);
        this.f97124f = (i14 + i17) - 1;
        this.f97119a = i15;
        return obj2;
    }

    public final int G() {
        int i14 = this.f97124f;
        if (i14 <= 32) {
            return 0;
        }
        return (i14 - 1) & (-32);
    }

    public final Object[] I(Object[] objArr, int i14, int i15, E e4, d dVar) {
        int iA = l.a(i15, i14);
        Object[] objArrM = m(objArr);
        if (i14 != 0) {
            Object obj = objArrM[iA];
            obj.getClass();
            objArrM[iA] = I((Object[]) obj, i14 - 5, i15, e4, dVar);
            return objArrM;
        }
        if (objArrM != objArr) {
            ((AbstractList) this).modCount++;
        }
        dVar.f97113a = objArrM[iA];
        objArrM[iA] = e4;
        return objArrM;
    }

    public final void J(Object[] objArr) {
        if (objArr != this.f97122d) {
            this.f97120b = null;
            this.f97122d = objArr;
        }
    }

    public final void K(Object[] objArr) {
        if (objArr != this.f97123e) {
            this.f97120b = null;
            this.f97123e = objArr;
        }
    }

    public final void L(Collection<? extends E> collection, int i14, Object[] objArr, int i15, Object[][] objArr2, int i16, Object[] objArr3) {
        Object[] objArrO;
        if (i16 < 1) {
            vb.h.z("Check failed.");
            return;
        }
        Object[] objArrM = m(objArr);
        objArr2[0] = objArrM;
        int i17 = i14 & 31;
        int size = ((collection.size() + i14) - 1) & 31;
        int i18 = (i15 - i17) + size;
        if (i18 < 32) {
            s.h(objArrM, objArr3, size + 1, i17, i15);
        } else {
            int i19 = i18 - 31;
            if (i16 == 1) {
                objArrO = objArrM;
            } else {
                objArrO = o();
                i16--;
                objArr2[i16] = objArrO;
            }
            int i24 = i15 - i19;
            s.h(objArrM, objArr3, 0, i24, i15);
            s.h(objArrM, objArrO, size + 1, i17, i24);
            objArr3 = objArrO;
        }
        Iterator<? extends E> it = collection.iterator();
        c(objArrM, i17, it);
        for (int i25 = 1; i25 < i16; i25++) {
            Object[] objArrO2 = o();
            c(objArrO2, 0, it);
            objArr2[i25] = objArrO2;
        }
        c(objArr3, 0, it);
    }

    public final int M() {
        int i14 = this.f97124f;
        return i14 <= 32 ? i14 : i14 - ((i14 - 1) & (-32));
    }

    @Override // p13.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF142104b() {
        return this.f97124f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i14, E e4) {
        n53.c.b(i14, getF142104b());
        if (i14 == getF142104b()) {
            add(e4);
            return;
        }
        ((AbstractList) this).modCount++;
        int iG = G();
        if (i14 >= iG) {
            h(this.f97122d, i14 - iG, e4);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.f97122d;
        objArr.getClass();
        h(e(objArr, this.f97119a, i14, e4, dVar), 0, dVar.f97113a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i14, Collection<? extends E> collection) {
        Collection<? extends E> collection2;
        f<E> fVar;
        Object[] objArrO;
        collection.getClass();
        n53.c.b(i14, this.f97124f);
        if (i14 == this.f97124f) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i15 = (i14 >> 5) << 5;
        int size = ((collection.size() + (this.f97124f - i15)) - 1) / 32;
        if (size == 0) {
            int i16 = i14 & 31;
            int size2 = ((collection.size() + i14) - 1) & 31;
            Object[] objArr = this.f97123e;
            Object[] objArrM = m(objArr);
            s.h(objArr, objArrM, size2 + 1, i16, M());
            c(objArrM, i16, collection.iterator());
            K(objArrM);
            this.f97124f = collection.size() + this.f97124f;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM = M();
        int size3 = collection.size() + this.f97124f;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i14 >= G()) {
            objArrO = o();
            collection2 = collection;
            L(collection2, i14, this.f97123e, iM, objArr2, size, objArrO);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            Object[] objArr3 = fVar.f97123e;
            if (size3 > iM) {
                int i17 = size3 - iM;
                Object[] objArrN = n(i17, objArr3);
                fVar.g(collection2, i14, i17, objArr2, size, objArrN);
                objArr2 = objArr2;
                objArrO = objArrN;
            } else {
                objArrO = o();
                int i18 = iM - size3;
                s.h(objArr3, objArrO, 0, i18, iM);
                int i19 = 32 - i18;
                Object[] objArrN2 = n(i19, fVar.f97123e);
                int i24 = size - 1;
                objArr2[i24] = objArrN2;
                fVar.g(collection2, i14, i19, objArr2, i24, objArrN2);
                collection2 = collection2;
            }
        }
        J(v(fVar.f97122d, i15, objArr2));
        K(objArrO);
        fVar.f97124f = collection2.size() + fVar.f97124f;
        return true;
    }

    @Override // p13.f
    public final E b(int i14) {
        n53.c.a(i14, getF142104b());
        ((AbstractList) this).modCount++;
        int iG = G();
        if (i14 >= iG) {
            return (E) F(this.f97122d, iG, this.f97119a, i14 - iG);
        }
        d dVar = new d(this.f97123e[0]);
        Object[] objArr = this.f97122d;
        objArr.getClass();
        F(E(objArr, this.f97119a, i14, dVar), iG, this.f97119a, 0);
        return (E) dVar.f97113a;
    }

    @Override // i53.f.a
    public final i53.f<E> build() {
        e eVar = this.f97120b;
        if (eVar == null) {
            Object[] objArr = this.f97122d;
            Object[] objArr2 = this.f97123e;
            this.f97121c = new n53.e();
            if (objArr == null) {
                eVar = objArr2.length == 0 ? l.b() : new j(Arrays.copyOf(objArr2, this.f97124f));
            } else {
                eVar = new e(objArr, objArr2, this.f97124f, this.f97119a);
            }
            this.f97120b = (i53.f<? extends E>) eVar;
        }
        return eVar;
    }

    public final int d() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] e(Object[] objArr, int i14, int i15, Object obj, d dVar) {
        Object obj2;
        int iA = l.a(i15, i14);
        if (i14 == 0) {
            dVar.f97113a = objArr[31];
            Object[] objArrM = m(objArr);
            s.h(objArr, objArrM, iA + 1, iA, 31);
            objArrM[iA] = obj;
            return objArrM;
        }
        Object[] objArrM2 = m(objArr);
        int i16 = i14 - 5;
        Object obj3 = objArrM2[iA];
        obj3.getClass();
        objArrM2[iA] = e((Object[]) obj3, i16, i15, obj, dVar);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrM2[iA]) == null) {
                break;
            }
            objArrM2[iA] = e((Object[]) obj2, i16, 0, dVar.f97113a, dVar);
        }
        return objArrM2;
    }

    public final void g(Collection<? extends E> collection, int i14, int i15, Object[][] objArr, int i16, Object[] objArr2) {
        if (this.f97122d == null) {
            vb.h.z("Required value was null.");
            return;
        }
        int i17 = i14 >> 5;
        a aVarL = l(G() >> 5);
        int i18 = i16;
        Object[] objArrN = objArr2;
        while (aVarL.previousIndex() != i17) {
            Object[] objArr3 = (Object[]) aVarL.previous();
            s.h(objArr3, objArrN, 0, 32 - i15, 32);
            objArrN = n(i15, objArr3);
            i18--;
            objArr[i18] = objArrN;
        }
        Object[] objArr4 = (Object[]) aVarL.previous();
        int iG = i16 - (((G() >> 5) - 1) - i17);
        if (iG < i16) {
            objArr2 = objArr[iG];
            objArr2.getClass();
        }
        L(collection, i14, objArr4, 32, objArr, iG, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i14) {
        Object[] objArr;
        n53.c.a(i14, getF142104b());
        if (G() <= i14) {
            objArr = this.f97123e;
        } else {
            objArr = this.f97122d;
            objArr.getClass();
            for (int i15 = this.f97119a; i15 > 0; i15 -= 5) {
                Object obj = objArr[l.a(i14, i15)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i14 & 31];
    }

    public final void h(Object[] objArr, int i14, E e4) {
        int iM = M();
        Object[] objArrM = m(this.f97123e);
        Object[] objArr2 = this.f97123e;
        if (iM >= 32) {
            Object obj = objArr2[31];
            s.h(objArr2, objArrM, i14 + 1, i14, 31);
            objArrM[i14] = e4;
            w(objArr, objArrM, p(obj));
            return;
        }
        s.h(objArr2, objArrM, i14 + 1, i14, iM);
        objArrM[i14] = e4;
        J(objArr);
        K(objArrM);
        this.f97124f++;
    }

    public final boolean i(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f97121c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final a l(int i14) {
        if (this.f97122d == null) {
            vb.h.z("Required value was null.");
            return null;
        }
        int iG = G() >> 5;
        n53.c.b(i14, iG);
        int i15 = this.f97119a;
        Object[] objArr = this.f97122d;
        if (i15 == 0) {
            objArr.getClass();
            return new i(objArr, i14);
        }
        objArr.getClass();
        return new k(objArr, i14, iG, i15 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i14) {
        n53.c.b(i14, getF142104b());
        return new h(this, i14);
    }

    public final Object[] m(Object[] objArr) {
        if (objArr == null) {
            return o();
        }
        if (i(objArr)) {
            return objArr;
        }
        Object[] objArrO = o();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        s.j(objArr, objArrO, 0, length, 6);
        return objArrO;
    }

    public final Object[] n(int i14, Object[] objArr) {
        if (i(objArr)) {
            s.h(objArr, objArr, i14, 0, 32 - i14);
            return objArr;
        }
        Object[] objArrO = o();
        s.h(objArr, objArrO, i14, 0, 32 - i14);
        return objArrO;
    }

    public final Object[] o() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f97121c;
        return objArr;
    }

    public final Object[] p(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f97121c;
        return objArr;
    }

    public final Object[] q(int i14, int i15, Object[] objArr) {
        if (i15 < 0) {
            vb.h.z("Check failed.");
            return null;
        }
        if (i15 == 0) {
            return objArr;
        }
        int iA = l.a(i14, i15);
        Object obj = objArr[iA];
        obj.getClass();
        Object objQ = q(i14, i15 - 5, (Object[]) obj);
        if (iA < 31) {
            int i16 = iA + 1;
            if (objArr[i16] != null) {
                if (i(objArr)) {
                    Arrays.fill(objArr, i16, 32, (Object) null);
                }
                Object[] objArrO = o();
                s.h(objArr, objArrO, 0, 0, i16);
                objArr = objArrO;
            }
        }
        if (objQ == objArr[iA]) {
            return objArr;
        }
        Object[] objArrM = m(objArr);
        objArrM[iA] = objQ;
        return objArrM;
    }

    public final Object[] r(Object[] objArr, int i14, int i15, d dVar) {
        Object[] objArrR;
        int iA = l.a(i15 - 1, i14);
        if (i14 == 5) {
            dVar.f97113a = objArr[iA];
            objArrR = null;
        } else {
            Object obj = objArr[iA];
            obj.getClass();
            objArrR = r((Object[]) obj, i14 - 5, i15, dVar);
        }
        if (objArrR == null && iA == 0) {
            return null;
        }
        Object[] objArrM = m(objArr);
        objArrM[iA] = objArrR;
        return objArrM;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        return D(new r(collection, 1));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i14, E e4) {
        n53.c.a(i14, getF142104b());
        if (G() > i14) {
            d dVar = new d(null);
            Object[] objArr = this.f97122d;
            objArr.getClass();
            J(I(objArr, this.f97119a, i14, e4, dVar));
            return (E) dVar.f97113a;
        }
        Object[] objArrM = m(this.f97123e);
        if (objArrM != this.f97123e) {
            ((AbstractList) this).modCount++;
        }
        int i15 = i14 & 31;
        E e14 = (E) objArrM[i15];
        objArrM[i15] = e4;
        K(objArrM);
        return e14;
    }

    public final void t(int i14, int i15, Object[] objArr) {
        if (i15 == 0) {
            J(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            K(objArr);
            this.f97124f = i14;
            this.f97119a = i15;
            return;
        }
        d dVar = new d(null);
        objArr.getClass();
        Object[] objArrR = r(objArr, i15, i14, dVar);
        objArrR.getClass();
        Object obj = dVar.f97113a;
        obj.getClass();
        K((Object[]) obj);
        this.f97124f = i14;
        if (objArrR[1] == null) {
            J((Object[]) objArrR[0]);
            this.f97119a = i15 - 5;
        } else {
            J(objArrR);
            this.f97119a = i15;
        }
    }

    public final Object[] u(Object[] objArr, int i14, int i15, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            vb.h.z("Check failed.");
            return null;
        }
        if (i15 < 0) {
            vb.h.z("Check failed.");
            return null;
        }
        if (i15 == 0) {
            return it.next();
        }
        Object[] objArrM = m(objArr);
        int iA = l.a(i14, i15);
        int i16 = i15 - 5;
        objArrM[iA] = u((Object[]) objArrM[iA], i14, i16, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrM[iA] = u((Object[]) objArrM[iA], 0, i16, it);
        }
        return objArrM;
    }

    public final Object[] v(Object[] objArr, int i14, Object[][] objArr2) {
        p005kotlin.jvm.internal.b bVar = new p005kotlin.jvm.internal.b(objArr2);
        int i15 = i14 >> 5;
        int i16 = this.f97119a;
        Object[] objArrU = i15 < (1 << i16) ? u(objArr, i14, i16, bVar) : m(objArr);
        while (bVar.hasNext()) {
            this.f97119a += 5;
            objArrU = p(objArrU);
            int i17 = this.f97119a;
            u(objArrU, 1 << i17, i17, bVar);
        }
        return objArrU;
    }

    public final void w(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i14 = this.f97124f >> 5;
        int i15 = this.f97119a;
        if (i14 > (1 << i15)) {
            J(x(this.f97119a + 5, p(objArr), objArr2));
            K(objArr3);
            this.f97119a += 5;
            this.f97124f++;
            return;
        }
        if (objArr == null) {
            J(objArr2);
            K(objArr3);
            this.f97124f++;
        } else {
            J(x(i15, objArr, objArr2));
            K(objArr3);
            this.f97124f++;
        }
    }

    public final Object[] x(int i14, Object[] objArr, Object[] objArr2) {
        int iA = l.a(getF142104b() - 1, i14);
        Object[] objArrM = m(objArr);
        if (i14 == 5) {
            objArrM[iA] = objArr2;
            return objArrM;
        }
        objArrM[iA] = x(i14 - 5, (Object[]) objArrM[iA], objArr2);
        return objArrM;
    }

    public final int y(e23.l lVar, Object[] objArr, int i14, int i15, d dVar, ArrayList arrayList, ArrayList arrayList2) {
        if (i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = dVar.f97113a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrO = objArr2;
        for (int i16 = 0; i16 < i14; i16++) {
            Object obj2 = objArr[i16];
            if (!((Boolean) lVar.invoke(obj2)).booleanValue()) {
                if (i15 == 32) {
                    objArrO = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : o();
                    i15 = 0;
                }
                objArrO[i15] = obj2;
                i15++;
            }
        }
        dVar.f97113a = objArrO;
        if (objArr2 != objArrO) {
            arrayList2.add(objArr2);
        }
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e4) {
        ((AbstractList) this).modCount++;
        int iM = M();
        if (iM < 32) {
            Object[] objArrM = m(this.f97123e);
            objArrM[iM] = e4;
            K(objArrM);
            this.f97124f = getF142104b() + 1;
        } else {
            w(this.f97122d, this.f97123e, p(e4));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM = M();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iM >= collection.size()) {
            Object[] objArrM = m(this.f97123e);
            c(objArrM, iM, it);
            K(objArrM);
            this.f97124f = collection.size() + this.f97124f;
            return true;
        }
        int size = ((collection.size() + iM) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM2 = m(this.f97123e);
        c(objArrM2, iM, it);
        objArr[0] = objArrM2;
        for (int i14 = 1; i14 < size; i14++) {
            Object[] objArrO = o();
            c(objArrO, 0, it);
            objArr[i14] = objArrO;
        }
        J(v(this.f97122d, G(), objArr));
        Object[] objArrO2 = o();
        c(objArrO2, 0, it);
        K(objArrO2);
        this.f97124f = collection.size() + this.f97124f;
        return true;
    }
}
