package j53;

import java.util.Arrays;
import java.util.ListIterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lj53/e;", "E", "Li53/f;", "Lj53/b;", "", "", "root", "tail", "", "size", "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<E> extends b<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f97114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f97115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f97116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f97117e;

    public e(Object[] objArr, Object[] objArr2, int i14, int i15) {
        objArr.getClass();
        objArr2.getClass();
        this.f97114b = objArr;
        this.f97115c = objArr2;
        this.f97116d = i14;
        this.f97117e = i15;
        if (getF134973e() > 32) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + getF134973e()).toString());
    }

    @Override // i53.f
    public final i53.f Y1(j82.d dVar) {
        f fVar = new f(this, this.f97114b, this.f97115c, this.f97117e);
        fVar.D(dVar);
        return fVar.build();
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF134973e() {
        return this.f97116d;
    }

    @Override // java.util.Collection, java.util.List, i53.f
    public final i53.f<E> add(E e4) {
        int i14 = this.f97116d;
        int i15 = i14 - ((i14 - 1) & (-32));
        int i16 = this.f97117e;
        Object[] objArr = this.f97114b;
        Object[] objArr2 = this.f97115c;
        if (i15 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i15] = e4;
            return new e(objArr, objArrCopyOf, i14 + 1, i16);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = e4;
        if ((i14 >> 5) <= (1 << i16)) {
            return new e(b(i16, objArr, objArr2), objArr3, i14 + 1, i16);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i17 = i16 + 5;
        return new e(b(i17, objArr4, objArr2), objArr3, i14 + 1, i17);
    }

    public final Object[] b(int i14, Object[] objArr, Object[] objArr2) {
        int iA = l.a(getF134973e() - 1, i14);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i14 == 5) {
            objArrCopyOf[iA] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iA] = b(i14 - 5, (Object[]) objArrCopyOf[iA], objArr2);
        return objArrCopyOf;
    }

    @Override // java.util.List
    public final E get(int i14) {
        Object[] objArr;
        int i15 = this.f97116d;
        n53.c.a(i14, i15);
        if (((i15 - 1) & (-32)) <= i14) {
            objArr = this.f97115c;
        } else {
            objArr = this.f97114b;
            for (int i16 = this.f97117e; i16 > 0; i16 -= 5) {
                Object obj = objArr[l.a(i14, i16)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i14 & 31];
    }

    @Override // p13.c, java.util.List
    public final ListIterator<E> listIterator(int i14) {
        n53.c.b(i14, getF134973e());
        return new g(this.f97114b, this.f97115c, i14, getF134973e(), (this.f97117e / 5) + 1);
    }
}
