package w3;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lw3/e;", "K", "V", "T", "", "Lw3/t;", "node", "", "Lw3/u;", "path", "<init>", "(Lw3/t;[Lw3/u;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e<K, V, T> implements Iterator<T>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u<K, V, T>[] f181789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f181790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f181791c = true;

    public e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        this.f181789a = uVarArr;
        uVarArr[0].a(Integer.bitCount(tVar.f181811a) * 2, 0, tVar.f181814d);
        this.f181790b = 0;
        a();
    }

    public final void a() {
        int i14 = this.f181790b;
        u<K, V, T>[] uVarArr = this.f181789a;
        u<K, V, T> uVar = uVarArr[i14];
        if (uVar.f181819c < uVar.f181818b) {
            return;
        }
        while (-1 < i14) {
            int iB = b(i14);
            if (iB == -1) {
                u<K, V, T> uVar2 = uVarArr[i14];
                int i15 = uVar2.f181819c;
                Object[] objArr = uVar2.f181817a;
                if (i15 < objArr.length) {
                    int length = objArr.length;
                    uVar2.f181819c = i15 + 1;
                    iB = b(i14);
                }
            }
            if (iB != -1) {
                this.f181790b = iB;
                return;
            }
            if (i14 > 0) {
                u<K, V, T> uVar3 = uVarArr[i14 - 1];
                int i16 = uVar3.f181819c;
                int length2 = uVar3.f181817a.length;
                uVar3.f181819c = i16 + 1;
            }
            u<K, V, T> uVar4 = uVarArr[i14];
            t.f181809e.getClass();
            uVar4.a(0, 0, t.f181810f.f181814d);
            i14--;
        }
        this.f181791c = false;
    }

    public final int b(int i14) {
        u<K, V, T>[] uVarArr = this.f181789a;
        u<K, V, T> uVar = uVarArr[i14];
        int i15 = uVar.f181819c;
        if (i15 < uVar.f181818b) {
            return i14;
        }
        Object[] objArr = uVar.f181817a;
        if (i15 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i15];
        obj.getClass();
        t tVar = (t) obj;
        if (i14 == 6) {
            u<K, V, T> uVar2 = uVarArr[i14 + 1];
            Object[] objArr2 = tVar.f181814d;
            uVar2.a(objArr2.length, 0, objArr2);
        } else {
            uVarArr[i14 + 1].a(Integer.bitCount(tVar.f181811a) * 2, 0, tVar.f181814d);
        }
        return b(i14 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f181791c;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.f181791c) {
            c22.t.g();
            return null;
        }
        T next = this.f181789a[this.f181790b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
