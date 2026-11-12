package v3;

import f4.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p13.s;
import p13.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tB\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lv3/j;", "E", "Lu3/a;", "Lv3/b;", "", "", "buffer", "<init>", "([Ljava/lang/Object;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j<E> extends b<E> implements u3.a<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f175379d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f175380e = new j(new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f175381c;

    public j(Object[] objArr) {
        this.f175381c = objArr;
        int length = objArr.length;
    }

    @Override // u3.c
    public final u3.c Z(r rVar) {
        Object[] objArr = this.f175381c;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z14 = false;
        for (int i14 = 0; i14 < length2; i14++) {
            Object obj = objArr[i14];
            if (((Boolean) rVar.invoke(obj)).booleanValue()) {
                if (!z14) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z14 = true;
                    length = i14;
                }
            } else if (z14) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f175380e : new j(s.l(0, length, objArrCopyOf));
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF134973e() {
        return this.f175381c.length;
    }

    @Override // java.util.List, u3.c
    public final u3.c<E> add(int i14, E e4) {
        Object[] objArr = this.f175381c;
        y3.c.b(i14, objArr.length);
        if (i14 == objArr.length) {
            return add((Object) e4);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            s.j(objArr, objArr2, 0, i14, 6);
            s.h(objArr, objArr2, i14 + 1, i14, objArr.length);
            objArr2[i14] = e4;
            return new j(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        s.h(objArr, objArrCopyOf, i14 + 1, i14, objArr.length - 1);
        objArrCopyOf[i14] = e4;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // v3.b, java.util.Collection, java.util.List, u3.c
    public final u3.c<E> addAll(Collection<? extends E> collection) {
        Object[] objArr = this.f175381c;
        if (collection.size() + objArr.length > 32) {
            f fVarBuilder = builder();
            fVarBuilder.addAll(collection);
            return fVarBuilder.c();
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

    @Override // u3.c
    public final f builder() {
        return new f(this, null, this.f175381c, 0);
    }

    @Override // java.util.List
    public final E get(int i14) {
        y3.c.a(i14, getF134973e());
        return (E) this.f175381c[i14];
    }

    @Override // p13.c, java.util.List
    public final int indexOf(Object obj) {
        return u.M(this.f175381c, obj);
    }

    @Override // p13.c, java.util.List
    public final int lastIndexOf(Object obj) {
        return u.R(this.f175381c, obj);
    }

    @Override // p13.c, java.util.List
    public final ListIterator<E> listIterator(int i14) {
        Object[] objArr = this.f175381c;
        y3.c.b(i14, objArr.length);
        return new c(objArr, i14, objArr.length);
    }

    @Override // u3.c
    public final u3.c<E> r3(int i14) {
        Object[] objArr = this.f175381c;
        y3.c.a(i14, objArr.length);
        if (objArr.length == 1) {
            return f175380e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        s.h(objArr, objArrCopyOf, i14, i14 + 1, objArr.length);
        return new j(objArrCopyOf);
    }

    @Override // p13.c, java.util.List
    public final u3.c<E> set(int i14, E e4) {
        y3.c.a(i14, getF134973e());
        Object[] objArr = this.f175381c;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i14] = e4;
        return new j(objArrCopyOf);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv3/j$a;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Override // java.util.Collection, java.util.List, u3.c
    public final u3.c<E> add(E e4) {
        Object[] objArr = this.f175381c;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = e4;
            return new j(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e4;
        return new e(objArr, objArr2, objArr.length + 1, 0);
    }
}
