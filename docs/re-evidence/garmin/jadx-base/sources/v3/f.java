package v3;

import f4.r;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p13.s;
import p3.j2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lv3/f;", "E", "Lp13/f;", "", "Lu3/c;", "vector", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(Lu3/c;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f<E> extends p13.f<E> implements List, Collection, f23.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f175363i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u3.c<? extends E> f175364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f175365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f175366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f175367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y3.d f175368e = new y3.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f175369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f175370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f175371h;

    public f(u3.c<? extends E> cVar, Object[] objArr, Object[] objArr2, int i14) {
        this.f175364a = cVar;
        this.f175365b = objArr;
        this.f175366c = objArr2;
        this.f175367d = i14;
        this.f175369f = this.f175365b;
        this.f175370g = this.f175366c;
        this.f175371h = this.f175364a.size();
    }

    public static void d(Object[] objArr, int i14, Iterator it) {
        while (i14 < 32 && it.hasNext()) {
            objArr[i14] = it.next();
            i14++;
        }
    }

    public final int A(e23.l lVar, Object[] objArr, int i14, int i15, d dVar, ArrayList arrayList, ArrayList arrayList2) {
        if (l(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = dVar.f175358a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrP = objArr2;
        for (int i16 = 0; i16 < i14; i16++) {
            Object obj2 = objArr[i16];
            if (!((Boolean) lVar.invoke(obj2)).booleanValue()) {
                if (i15 == 32) {
                    objArrP = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : p();
                    i15 = 0;
                }
                objArrP[i15] = obj2;
                i15++;
            }
        }
        dVar.f175358a = objArrP;
        if (objArr2 != objArrP) {
            arrayList2.add(objArr2);
        }
        return i15;
    }

    public final int B(e23.l<? super E, Boolean> lVar, Object[] objArr, int i14, d dVar) {
        Object[] objArrN = objArr;
        int i15 = i14;
        boolean z14 = false;
        for (int i16 = 0; i16 < i14; i16++) {
            Object obj = objArr[i16];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z14) {
                    objArrN = n(objArr);
                    z14 = true;
                    i15 = i16;
                }
            } else if (z14) {
                objArrN[i15] = obj;
                i15++;
            }
        }
        dVar.f175358a = objArrN;
        return i15;
    }

    public final int D(e23.l<? super E, Boolean> lVar, int i14, d dVar) {
        int iB = B(lVar, this.f175370g, i14, dVar);
        Object obj = dVar.f175358a;
        if (iB == i14) {
            return i14;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iB, i14, (Object) null);
        this.f175370g = objArr;
        this.f175371h -= i14 - iB;
        return iB;
    }

    public final boolean E(e23.l<? super E, Boolean> lVar) {
        int i14;
        e23.l<? super E, Boolean> lVar2 = lVar;
        int iL = L();
        Object[] objArrR = null;
        d dVar = new d(null);
        boolean z14 = false;
        if (this.f175369f != null) {
            a aVarM = m(0);
            int iB = 32;
            while (iB == 32 && aVarM.hasNext()) {
                iB = B(lVar2, (Object[]) aVarM.next(), 32, dVar);
            }
            if (iB == 32) {
                aVarM.hasNext();
                int iD = D(lVar2, iL, dVar);
                if (iD == 0) {
                    u(this.f175371h, this.f175367d, this.f175369f);
                }
                if (iD != iL) {
                }
            } else {
                int iPreviousIndex = aVarM.previousIndex() << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iA = iB;
                while (aVarM.hasNext()) {
                    iA = A(lVar2, (Object[]) aVarM.next(), 32, iA, dVar, arrayList2, arrayList);
                    lVar2 = lVar;
                }
                int iA2 = A(lVar, this.f175370g, iL, iA, dVar, arrayList2, arrayList);
                Object obj = dVar.f175358a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iA2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrV = this.f175369f;
                if (zIsEmpty) {
                    objArrV.getClass();
                } else {
                    objArrV = v(objArrV, iPreviousIndex, this.f175367d, arrayList.iterator());
                }
                int size = iPreviousIndex + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    j2.a("invalid size");
                }
                if (size == 0) {
                    this.f175367d = 0;
                } else {
                    int i15 = size - 1;
                    while (true) {
                        i14 = this.f175367d;
                        if ((i15 >> i14) != 0) {
                            break;
                        }
                        this.f175367d = i14 - 5;
                        Object[] objArr2 = objArrV[0];
                        objArr2.getClass();
                        objArrV = objArr2;
                    }
                    objArrR = r(i15, i14, objArrV);
                }
                this.f175369f = objArrR;
                this.f175370g = objArr;
                this.f175371h = size + iA2;
            }
            z14 = true;
        } else if (D(lVar2, iL, dVar) != iL) {
            z14 = true;
        }
        if (z14) {
            ((AbstractList) this).modCount++;
        }
        return z14;
    }

    public final Object[] F(Object[] objArr, int i14, int i15, d dVar) {
        int iA = l.a(i15, i14);
        if (i14 == 0) {
            Object obj = objArr[iA];
            Object[] objArrN = n(objArr);
            s.h(objArr, objArrN, iA, iA + 1, 32);
            objArrN[31] = dVar.f175358a;
            dVar.f175358a = obj;
            return objArrN;
        }
        int iA2 = objArr[31] == null ? l.a(I() - 1, i14) : 31;
        Object[] objArrN2 = n(objArr);
        int i16 = i14 - 5;
        int i17 = iA + 1;
        if (i17 <= iA2) {
            while (true) {
                Object obj2 = objArrN2[iA2];
                obj2.getClass();
                objArrN2[iA2] = F((Object[]) obj2, i16, 0, dVar);
                if (iA2 == i17) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrN2[iA];
        obj3.getClass();
        objArrN2[iA] = F((Object[]) obj3, i16, i15, dVar);
        return objArrN2;
    }

    public final Object G(Object[] objArr, int i14, int i15, int i16) {
        int i17 = this.f175371h - i14;
        Object[] objArr2 = this.f175370g;
        if (i17 == 1) {
            Object obj = objArr2[0];
            u(i14, i15, objArr);
            return obj;
        }
        Object obj2 = objArr2[i16];
        Object[] objArrN = n(objArr2);
        s.h(objArr2, objArrN, i16, i16 + 1, i17);
        objArrN[i17 - 1] = null;
        this.f175369f = objArr;
        this.f175370g = objArrN;
        this.f175371h = (i14 + i17) - 1;
        this.f175367d = i15;
        return obj2;
    }

    public final int I() {
        int i14 = this.f175371h;
        if (i14 <= 32) {
            return 0;
        }
        return (i14 - 1) & (-32);
    }

    public final Object[] J(Object[] objArr, int i14, int i15, E e4, d dVar) {
        int iA = l.a(i15, i14);
        Object[] objArrN = n(objArr);
        if (i14 != 0) {
            Object obj = objArrN[iA];
            obj.getClass();
            objArrN[iA] = J((Object[]) obj, i14 - 5, i15, e4, dVar);
            return objArrN;
        }
        if (objArrN != objArr) {
            ((AbstractList) this).modCount++;
        }
        dVar.f175358a = objArrN[iA];
        objArrN[iA] = e4;
        return objArrN;
    }

    public final void K(Collection<? extends E> collection, int i14, Object[] objArr, int i15, Object[][] objArr2, int i16, Object[] objArr3) {
        Object[] objArrP;
        if (i16 < 1) {
            j2.a("requires at least one nullBuffer");
        }
        Object[] objArrN = n(objArr);
        objArr2[0] = objArrN;
        int i17 = i14 & 31;
        int size = ((collection.size() + i14) - 1) & 31;
        int i18 = (i15 - i17) + size;
        if (i18 < 32) {
            s.h(objArrN, objArr3, size + 1, i17, i15);
        } else {
            int i19 = i18 - 31;
            if (i16 == 1) {
                objArrP = objArrN;
            } else {
                objArrP = p();
                i16--;
                objArr2[i16] = objArrP;
            }
            int i24 = i15 - i19;
            s.h(objArrN, objArr3, 0, i24, i15);
            s.h(objArrN, objArrP, size + 1, i17, i24);
            objArr3 = objArrP;
        }
        Iterator<? extends E> it = collection.iterator();
        d(objArrN, i17, it);
        for (int i25 = 1; i25 < i16; i25++) {
            Object[] objArrP2 = p();
            d(objArrP2, 0, it);
            objArr2[i25] = objArrP2;
        }
        d(objArr3, 0, it);
    }

    public final int L() {
        int i14 = this.f175371h;
        return i14 <= 32 ? i14 : i14 - ((i14 - 1) & (-32));
    }

    @Override // p13.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF175371h() {
        return this.f175371h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i14, E e4) {
        y3.c.b(i14, getF175371h());
        if (i14 == getF175371h()) {
            add(e4);
            return;
        }
        ((AbstractList) this).modCount++;
        int I = I();
        if (i14 >= I) {
            i(this.f175369f, i14 - I, e4);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.f175369f;
        objArr.getClass();
        i(h(objArr, this.f175367d, i14, e4, dVar), 0, dVar.f175358a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i14, Collection<? extends E> collection) {
        Collection<? extends E> collection2;
        f<E> fVar;
        Object[] objArrP;
        y3.c.b(i14, this.f175371h);
        if (i14 == this.f175371h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i15 = (i14 >> 5) << 5;
        int size = ((collection.size() + (this.f175371h - i15)) - 1) / 32;
        if (size == 0) {
            int i16 = i14 & 31;
            int size2 = ((collection.size() + i14) - 1) & 31;
            Object[] objArr = this.f175370g;
            Object[] objArrN = n(objArr);
            s.h(objArr, objArrN, size2 + 1, i16, L());
            d(objArrN, i16, collection.iterator());
            this.f175370g = objArrN;
            this.f175371h = collection.size() + this.f175371h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iL = L();
        int size3 = collection.size() + this.f175371h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i14 >= I()) {
            objArrP = p();
            collection2 = collection;
            K(collection2, i14, this.f175370g, iL, objArr2, size, objArrP);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            Object[] objArr3 = fVar.f175370g;
            if (size3 > iL) {
                int i17 = size3 - iL;
                Object[] objArrO = o(i17, objArr3);
                fVar.g(collection2, i14, i17, objArr2, size, objArrO);
                objArr2 = objArr2;
                objArrP = objArrO;
            } else {
                objArrP = p();
                int i18 = iL - size3;
                s.h(objArr3, objArrP, 0, i18, iL);
                int i19 = 32 - i18;
                Object[] objArrO2 = o(i19, fVar.f175370g);
                int i24 = size - 1;
                objArr2[i24] = objArrO2;
                fVar.g(collection2, i14, i19, objArr2, i24, objArrO2);
                collection2 = collection2;
            }
        }
        fVar.f175369f = w(fVar.f175369f, i15, objArr2);
        fVar.f175370g = objArrP;
        fVar.f175371h = collection2.size() + fVar.f175371h;
        return true;
    }

    @Override // p13.f
    public final E b(int i14) {
        y3.c.a(i14, getF175371h());
        ((AbstractList) this).modCount++;
        int I = I();
        if (i14 >= I) {
            return (E) G(this.f175369f, I, this.f175367d, i14 - I);
        }
        d dVar = new d(this.f175370g[0]);
        Object[] objArr = this.f175369f;
        objArr.getClass();
        G(F(objArr, this.f175367d, i14, dVar), I, this.f175367d, 0);
        return (E) dVar.f175358a;
    }

    public final u3.c<E> c() {
        e eVar;
        if (this.f175369f == this.f175365b && this.f175370g == this.f175366c) {
            eVar = this.f175364a;
        } else {
            this.f175368e = new y3.d();
            Object[] objArr = this.f175369f;
            this.f175365b = objArr;
            Object[] objArr2 = this.f175370g;
            this.f175366c = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f175369f;
                objArr3.getClass();
                eVar = new e(objArr3, this.f175370g, this.f175371h, this.f175367d);
            } else if (objArr2.length == 0) {
                j.f175379d.getClass();
                eVar = j.f175380e;
            } else {
                eVar = new j(Arrays.copyOf(this.f175370g, this.f175371h));
            }
        }
        this.f175364a = eVar;
        return (u3.c<E>) eVar;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection<? extends E> collection, int i14, int i15, Object[][] objArr, int i16, Object[] objArr2) {
        if (this.f175369f == null) {
            vb.h.z("root is null");
            return;
        }
        int i17 = i14 >> 5;
        a aVarM = m(I() >> 5);
        int i18 = i16;
        Object[] objArrO = objArr2;
        while (aVarM.previousIndex() != i17) {
            Object[] objArr3 = (Object[]) aVarM.previous();
            s.h(objArr3, objArrO, 0, 32 - i15, 32);
            objArrO = o(i15, objArr3);
            i18--;
            objArr[i18] = objArrO;
        }
        Object[] objArr4 = (Object[]) aVarM.previous();
        int I = i16 - (((I() >> 5) - 1) - i17);
        if (I < i16) {
            objArr2 = objArr[I];
            objArr2.getClass();
        }
        K(collection, i14, objArr4, 32, objArr, I, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i14) {
        Object[] objArr;
        y3.c.a(i14, getF175371h());
        if (I() <= i14) {
            objArr = this.f175370g;
        } else {
            objArr = this.f175369f;
            objArr.getClass();
            for (int i15 = this.f175367d; i15 > 0; i15 -= 5) {
                Object obj = objArr[l.a(i14, i15)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i14 & 31];
    }

    public final Object[] h(Object[] objArr, int i14, int i15, Object obj, d dVar) {
        Object obj2;
        int iA = l.a(i15, i14);
        if (i14 == 0) {
            dVar.f175358a = objArr[31];
            Object[] objArrN = n(objArr);
            s.h(objArr, objArrN, iA + 1, iA, 31);
            objArrN[iA] = obj;
            return objArrN;
        }
        Object[] objArrN2 = n(objArr);
        int i16 = i14 - 5;
        Object obj3 = objArrN2[iA];
        obj3.getClass();
        objArrN2[iA] = h((Object[]) obj3, i16, i15, obj, dVar);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrN2[iA]) == null) {
                break;
            }
            objArrN2[iA] = h((Object[]) obj2, i16, 0, dVar.f175358a, dVar);
        }
        return objArrN2;
    }

    public final void i(Object[] objArr, int i14, E e4) {
        int iL = L();
        Object[] objArrN = n(this.f175370g);
        Object[] objArr2 = this.f175370g;
        if (iL >= 32) {
            Object obj = objArr2[31];
            s.h(objArr2, objArrN, i14 + 1, i14, 31);
            objArrN[i14] = e4;
            x(objArr, objArrN, q(obj));
            return;
        }
        s.h(objArr2, objArrN, i14 + 1, i14, iL);
        objArrN[i14] = e4;
        this.f175369f = objArr;
        this.f175370g = objArrN;
        this.f175371h++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final boolean l(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f175368e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i14) {
        y3.c.b(i14, this.f175371h);
        return new h(this, i14);
    }

    public final a m(int i14) {
        Object[] objArr = this.f175369f;
        if (objArr == null) {
            vb.h.z("Invalid root");
            return null;
        }
        int I = I() >> 5;
        y3.c.b(i14, I);
        int i15 = this.f175367d;
        return i15 == 0 ? new i(objArr, i14) : new k(objArr, i14, I, i15 / 5);
    }

    public final Object[] n(Object[] objArr) {
        if (objArr == null) {
            return p();
        }
        if (l(objArr)) {
            return objArr;
        }
        Object[] objArrP = p();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        s.j(objArr, objArrP, 0, length, 6);
        return objArrP;
    }

    public final Object[] o(int i14, Object[] objArr) {
        if (l(objArr)) {
            s.h(objArr, objArr, i14, 0, 32 - i14);
            return objArr;
        }
        Object[] objArrP = p();
        s.h(objArr, objArrP, i14, 0, 32 - i14);
        return objArrP;
    }

    public final Object[] p() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f175368e;
        return objArr;
    }

    public final Object[] q(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f175368e;
        return objArr;
    }

    public final Object[] r(int i14, int i15, Object[] objArr) {
        if (i15 < 0) {
            j2.a("shift should be positive");
        }
        if (i15 == 0) {
            return objArr;
        }
        int iA = l.a(i14, i15);
        Object obj = objArr[iA];
        obj.getClass();
        Object objR = r(i14, i15 - 5, (Object[]) obj);
        if (iA < 31) {
            int i16 = iA + 1;
            if (objArr[i16] != null) {
                if (l(objArr)) {
                    Arrays.fill(objArr, i16, 32, (Object) null);
                }
                Object[] objArrP = p();
                s.h(objArr, objArrP, 0, 0, i16);
                objArr = objArrP;
            }
        }
        if (objR == objArr[iA]) {
            return objArr;
        }
        Object[] objArrN = n(objArr);
        objArrN[iA] = objR;
        return objArrN;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        return E(new r(collection, 3));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i14, E e4) {
        y3.c.a(i14, getF175371h());
        if (I() > i14) {
            d dVar = new d(null);
            Object[] objArr = this.f175369f;
            objArr.getClass();
            this.f175369f = J(objArr, this.f175367d, i14, e4, dVar);
            return (E) dVar.f175358a;
        }
        Object[] objArrN = n(this.f175370g);
        if (objArrN != this.f175370g) {
            ((AbstractList) this).modCount++;
        }
        int i15 = i14 & 31;
        E e14 = (E) objArrN[i15];
        objArrN[i15] = e4;
        this.f175370g = objArrN;
        return e14;
    }

    public final Object[] t(Object[] objArr, int i14, int i15, d dVar) {
        Object[] objArrT;
        int iA = l.a(i15 - 1, i14);
        if (i14 == 5) {
            dVar.f175358a = objArr[iA];
            objArrT = null;
        } else {
            Object obj = objArr[iA];
            obj.getClass();
            objArrT = t((Object[]) obj, i14 - 5, i15, dVar);
        }
        if (objArrT == null && iA == 0) {
            return null;
        }
        Object[] objArrN = n(objArr);
        objArrN[iA] = objArrT;
        return objArrN;
    }

    public final void u(int i14, int i15, Object[] objArr) {
        if (i15 == 0) {
            this.f175369f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f175370g = objArr;
            this.f175371h = i14;
            this.f175367d = i15;
            return;
        }
        d dVar = new d(null);
        objArr.getClass();
        Object[] objArrT = t(objArr, i15, i14, dVar);
        objArrT.getClass();
        Object obj = dVar.f175358a;
        obj.getClass();
        this.f175370g = (Object[]) obj;
        this.f175371h = i14;
        if (objArrT[1] == null) {
            this.f175369f = (Object[]) objArrT[0];
            this.f175367d = i15 - 5;
        } else {
            this.f175369f = objArrT;
            this.f175367d = i15;
        }
    }

    public final Object[] v(Object[] objArr, int i14, int i15, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            j2.a("invalid buffersIterator");
        }
        if (!(i15 >= 0)) {
            j2.a("negative shift");
        }
        if (i15 == 0) {
            return it.next();
        }
        Object[] objArrN = n(objArr);
        int iA = l.a(i14, i15);
        int i16 = i15 - 5;
        objArrN[iA] = v((Object[]) objArrN[iA], i14, i16, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrN[iA] = v((Object[]) objArrN[iA], 0, i16, it);
        }
        return objArrN;
    }

    public final Object[] w(Object[] objArr, int i14, Object[][] objArr2) {
        p005kotlin.jvm.internal.b bVar = new p005kotlin.jvm.internal.b(objArr2);
        int i15 = i14 >> 5;
        int i16 = this.f175367d;
        Object[] objArrV = i15 < (1 << i16) ? v(objArr, i14, i16, bVar) : n(objArr);
        while (bVar.hasNext()) {
            this.f175367d += 5;
            objArrV = q(objArrV);
            int i17 = this.f175367d;
            v(objArrV, 1 << i17, i17, bVar);
        }
        return objArrV;
    }

    public final void x(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i14 = this.f175371h;
        int i15 = i14 >> 5;
        int i16 = this.f175367d;
        if (i15 > (1 << i16)) {
            this.f175369f = y(this.f175367d + 5, q(objArr), objArr2);
            this.f175370g = objArr3;
            this.f175367d += 5;
            this.f175371h++;
            return;
        }
        if (objArr == null) {
            this.f175369f = objArr2;
            this.f175370g = objArr3;
            this.f175371h = i14 + 1;
        } else {
            this.f175369f = y(i16, objArr, objArr2);
            this.f175370g = objArr3;
            this.f175371h++;
        }
    }

    public final Object[] y(int i14, Object[] objArr, Object[] objArr2) {
        int iA = l.a(getF175371h() - 1, i14);
        Object[] objArrN = n(objArr);
        if (i14 == 5) {
            objArrN[iA] = objArr2;
            return objArrN;
        }
        objArrN[iA] = y(i14 - 5, (Object[]) objArrN[iA], objArr2);
        return objArrN;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e4) {
        ((AbstractList) this).modCount++;
        int iL = L();
        if (iL < 32) {
            Object[] objArrN = n(this.f175370g);
            objArrN[iL] = e4;
            this.f175370g = objArrN;
            this.f175371h = getF175371h() + 1;
        } else {
            x(this.f175369f, this.f175370g, q(e4));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iL = L();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iL >= collection.size()) {
            Object[] objArrN = n(this.f175370g);
            d(objArrN, iL, it);
            this.f175370g = objArrN;
            this.f175371h = collection.size() + this.f175371h;
            return true;
        }
        int size = ((collection.size() + iL) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrN2 = n(this.f175370g);
        d(objArrN2, iL, it);
        objArr[0] = objArrN2;
        for (int i14 = 1; i14 < size; i14++) {
            Object[] objArrP = p();
            d(objArrP, 0, it);
            objArr[i14] = objArrP;
        }
        this.f175369f = w(this.f175369f, I(), objArr);
        Object[] objArrP2 = p();
        d(objArrP2, 0, it);
        this.f175370g = objArrP2;
        this.f175371h = collection.size() + this.f175371h;
        return true;
    }
}
