package v3;

import f4.r;
import java.util.Arrays;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p13.s;
import p3.j2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lv3/e;", "E", "Lu3/c;", "Lv3/b;", "", "", "root", "tail", "", "size", "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<E> extends b<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f175359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f175360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f175361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f175362f;

    public e(Object[] objArr, Object[] objArr2, int i14, int i15) {
        this.f175359c = objArr;
        this.f175360d = objArr2;
        this.f175361e = i14;
        this.f175362f = i15;
        if (!(getF134973e() > 32)) {
            j2.a("Trie-based persistent vector should have at least 33 elements, got " + getF134973e());
        }
        int length = objArr2.length;
    }

    public static Object[] c(Object[] objArr, int i14, int i15, Object obj, d dVar) {
        int iA = l.a(i15, i14);
        if (i14 == 0) {
            Object[] objArrCopyOf = iA == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            s.h(objArr, objArrCopyOf, iA + 1, iA, 31);
            dVar.f175358a = objArr[31];
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i16 = i14 - 5;
        Object obj2 = objArr[iA];
        obj2.getClass();
        objArrCopyOf2[iA] = c((Object[]) obj2, i16, i15, obj, dVar);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            Object obj3 = objArr[iA];
            obj3.getClass();
            objArrCopyOf2[iA] = c((Object[]) obj3, i16, 0, dVar.f175358a, dVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] e(Object[] objArr, int i14, int i15, d dVar) {
        Object[] objArrE;
        int iA = l.a(i15, i14);
        if (i14 == 5) {
            dVar.f175358a = objArr[iA];
            objArrE = null;
        } else {
            Object obj = objArr[iA];
            obj.getClass();
            objArrE = e((Object[]) obj, i14 - 5, i15, dVar);
        }
        if (objArrE == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iA] = objArrE;
        return objArrCopyOf;
    }

    public static Object[] n(int i14, int i15, Object obj, Object[] objArr) {
        int iA = l.a(i15, i14);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i14 == 0) {
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iA];
        obj2.getClass();
        objArrCopyOf[iA] = n(i14 - 5, i15, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // u3.c
    public final u3.c Z(r rVar) {
        f<E> fVarBuilder = builder();
        fVarBuilder.E(rVar);
        return fVarBuilder.c();
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF134973e() {
        return this.f175361e;
    }

    @Override // java.util.List, u3.c
    public final u3.c<E> add(int i14, E e4) {
        int i15 = this.f175361e;
        y3.c.b(i14, i15);
        if (i14 == i15) {
            return add((Object) e4);
        }
        int iM = m();
        Object[] objArr = this.f175359c;
        if (i14 >= iM) {
            return d(objArr, i14 - iM, e4);
        }
        d dVar = new d(null);
        return d(c(objArr, this.f175362f, i14, e4, dVar), 0, dVar.f175358a);
    }

    @Override // u3.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f<E> builder() {
        return new f<>(this, this.f175359c, this.f175360d, this.f175362f);
    }

    public final e<E> d(Object[] objArr, int i14, Object obj) {
        int iM = m();
        int i15 = this.f175361e;
        int i16 = i15 - iM;
        Object[] objArr2 = this.f175360d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i16 < 32) {
            s.h(objArr2, objArrCopyOf, i14 + 1, i14, i16);
            objArrCopyOf[i14] = obj;
            return new e<>(objArr, objArrCopyOf, i15 + 1, this.f175362f);
        }
        Object obj2 = objArr2[31];
        s.h(objArr2, objArrCopyOf, i14 + 1, i14, i16 - 1);
        objArrCopyOf[i14] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return g(objArr, objArrCopyOf, objArr3);
    }

    public final e<E> g(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i14 = this.f175361e;
        int i15 = i14 >> 5;
        int i16 = this.f175362f;
        if (i15 <= (1 << i16)) {
            return new e<>(h(i16, objArr, objArr2), objArr3, i14 + 1, i16);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i17 = i16 + 5;
        return new e<>(h(i17, objArr4, objArr2), objArr3, i14 + 1, i17);
    }

    @Override // java.util.List
    public final E get(int i14) {
        Object[] objArr;
        y3.c.a(i14, getF134973e());
        if (m() <= i14) {
            objArr = this.f175360d;
        } else {
            objArr = this.f175359c;
            for (int i15 = this.f175362f; i15 > 0; i15 -= 5) {
                Object obj = objArr[l.a(i14, i15)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i14 & 31];
    }

    public final Object[] h(int i14, Object[] objArr, Object[] objArr2) {
        int iA = l.a(getF134973e() - 1, i14);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i14 == 5) {
            objArrCopyOf[iA] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iA] = h(i14 - 5, (Object[]) objArrCopyOf[iA], objArr2);
        return objArrCopyOf;
    }

    public final Object[] i(Object[] objArr, int i14, int i15, d dVar) {
        int iA = l.a(i15, i14);
        if (i14 == 0) {
            Object[] objArrCopyOf = iA == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            s.h(objArr, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = dVar.f175358a;
            dVar.f175358a = objArr[iA];
            return objArrCopyOf;
        }
        int iA2 = objArr[31] == null ? l.a(m() - 1, i14) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i16 = i14 - 5;
        int i17 = iA + 1;
        if (i17 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                obj.getClass();
                objArrCopyOf2[iA2] = i((Object[]) obj, i16, 0, dVar);
                if (iA2 == i17) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        obj2.getClass();
        objArrCopyOf2[iA] = i((Object[]) obj2, i16, i15, dVar);
        return objArrCopyOf2;
    }

    public final b l(Object[] objArr, int i14, int i15, int i16) {
        int i17 = this.f175361e - i14;
        if (i17 != 1) {
            Object[] objArr2 = this.f175360d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i18 = i17 - 1;
            if (i16 < i18) {
                s.h(objArr2, objArrCopyOf, i16, i16 + 1, i17);
            }
            objArrCopyOf[i18] = null;
            return new e(objArr, objArrCopyOf, (i14 + i17) - 1, i15);
        }
        if (i15 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new j(objArr);
        }
        d dVar = new d(null);
        Object[] objArrE = e(objArr, i15, i14 - 1, dVar);
        objArrE.getClass();
        Object obj = dVar.f175358a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrE[1] != null) {
            return new e(objArrE, objArr3, i14, i15);
        }
        Object obj2 = objArrE[0];
        obj2.getClass();
        return new e((Object[]) obj2, objArr3, i14, i15 - 5);
    }

    @Override // p13.c, java.util.List
    public final ListIterator<E> listIterator(int i14) {
        y3.c.b(i14, this.f175361e);
        return new g(this.f175359c, this.f175360d, i14, this.f175361e, (this.f175362f / 5) + 1);
    }

    public final int m() {
        return (this.f175361e - 1) & (-32);
    }

    @Override // u3.c
    public final u3.c<E> r3(int i14) {
        y3.c.a(i14, this.f175361e);
        int iM = m();
        int i15 = this.f175362f;
        Object[] objArr = this.f175359c;
        return i14 >= iM ? l(objArr, iM, i15, i14 - iM) : l(i(objArr, i15, i14, new d(this.f175360d[0])), iM, i15, 0);
    }

    @Override // p13.c, java.util.List
    public final u3.c<E> set(int i14, E e4) {
        int i15 = this.f175361e;
        y3.c.a(i14, i15);
        int iM = m();
        Object[] objArr = this.f175359c;
        Object[] objArr2 = this.f175360d;
        int i16 = this.f175362f;
        if (iM > i14) {
            return new e(n(i16, i14, e4, objArr), objArr2, i15, i16);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i14 & 31] = e4;
        return new e(objArr, objArrCopyOf, i15, i16);
    }

    @Override // java.util.Collection, java.util.List, u3.c
    public final u3.c<E> add(E e4) {
        int iM = m();
        int i14 = this.f175361e;
        int i15 = i14 - iM;
        Object[] objArr = this.f175359c;
        Object[] objArr2 = this.f175360d;
        if (i15 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i15] = e4;
            return new e(objArr, objArrCopyOf, i14 + 1, this.f175362f);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = e4;
        return g(objArr, objArr2, objArr3);
    }
}
