package j53;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p13.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tB\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lj53/j;", "E", "Li53/c;", "Lj53/b;", "", "", "buffer", "<init>", "([Ljava/lang/Object;)V", "a", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j<E> extends b<E> implements i53.c<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f97132c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f97133d = new j(new Object[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f97134b;

    public j(Object[] objArr) {
        objArr.getClass();
        this.f97134b = objArr;
    }

    @Override // i53.f
    public final i53.f Y1(j82.d dVar) {
        Object[] objArr = this.f97134b;
        int length = objArr.length;
        int length2 = objArr.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length2; i15++) {
            if (((Boolean) dVar.invoke(objArr[i15])).booleanValue()) {
                length--;
                i14 |= 1 << i15;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return f97133d;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i14);
        int length3 = objArr.length;
        for (int i16 = iNumberOfTrailingZeros + 1; i16 < length3; i16++) {
            if (((i14 >>> i16) & 1) == 0) {
                objArrCopyOf[iNumberOfTrailingZeros] = objArr[i16];
                iNumberOfTrailingZeros++;
            }
        }
        return new j(objArrCopyOf);
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF97116d() {
        return this.f97134b.length;
    }

    @Override // java.util.Collection, java.util.List, i53.f
    public final i53.f<E> add(E e4) {
        Object[] objArr = this.f97134b;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = e4;
            return new j(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e4;
        return new e(objArr, objArr2, objArr.length + 1, 0);
    }

    public final i53.f<E> b(Collection<? extends E> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return this;
        }
        Object[] objArr = this.f97134b;
        if (collection.size() + objArr.length > 32) {
            f fVarC = c();
            fVarC.addAll(collection);
            return fVarC.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new j(objArrCopyOf);
    }

    public final f c() {
        return new f(this, null, this.f97134b, 0);
    }

    @Override // java.util.List
    public final E get(int i14) {
        n53.c.a(i14, getF97116d());
        return (E) this.f97134b[i14];
    }

    @Override // p13.c, java.util.List
    public final int indexOf(Object obj) {
        return u.M(this.f97134b, obj);
    }

    @Override // p13.c, java.util.List
    public final int lastIndexOf(Object obj) {
        return u.R(this.f97134b, obj);
    }

    @Override // p13.c, java.util.List
    public final ListIterator<E> listIterator(int i14) {
        n53.c.b(i14, getF97116d());
        return new c(this.f97134b, i14, getF97116d());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj53/j$a;", "", "<init>", "()V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
