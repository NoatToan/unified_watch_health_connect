package k53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk53/e;", "K", "V", "T", "", "Lk53/t;", "node", "", "Lk53/u;", "path", "<init>", "(Lk53/t;[Lk53/u;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e<K, V, T> implements Iterator<T>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u<K, V, T>[] f102970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f102971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f102972c;

    public e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        tVar.getClass();
        uVarArr.getClass();
        this.f102970a = uVarArr;
        this.f102972c = true;
        u<K, V, T> uVar = uVarArr[0];
        Object[] objArr = tVar.f102999d;
        int iBitCount = Integer.bitCount(tVar.f102996a) * 2;
        uVar.getClass();
        objArr.getClass();
        uVar.f103000a = objArr;
        uVar.f103001b = iBitCount;
        uVar.f103002c = 0;
        this.f102971b = 0;
        a();
    }

    public final void a() {
        int i14 = this.f102971b;
        u<K, V, T>[] uVarArr = this.f102970a;
        u<K, V, T> uVar = uVarArr[i14];
        if (uVar.f103002c < uVar.f103001b) {
            return;
        }
        while (-1 < i14) {
            int iB = b(i14);
            if (iB == -1) {
                u<K, V, T> uVar2 = uVarArr[i14];
                int i15 = uVar2.f103002c;
                Object[] objArr = uVar2.f103000a;
                if (i15 < objArr.length) {
                    int length = objArr.length;
                    uVar2.f103002c = i15 + 1;
                    iB = b(i14);
                }
            }
            if (iB != -1) {
                this.f102971b = iB;
                return;
            }
            if (i14 > 0) {
                u<K, V, T> uVar3 = uVarArr[i14 - 1];
                int i16 = uVar3.f103002c;
                int length2 = uVar3.f103000a.length;
                uVar3.f103002c = i16 + 1;
            }
            u<K, V, T> uVar4 = uVarArr[i14];
            t.f102994e.getClass();
            Object[] objArr2 = t.f102995f.f102999d;
            uVar4.getClass();
            objArr2.getClass();
            uVar4.f103000a = objArr2;
            uVar4.f103001b = 0;
            uVar4.f103002c = 0;
            i14--;
        }
        this.f102972c = false;
    }

    public final int b(int i14) {
        u<K, V, T>[] uVarArr = this.f102970a;
        u<K, V, T> uVar = uVarArr[i14];
        int i15 = uVar.f103002c;
        if (i15 < uVar.f103001b) {
            return i14;
        }
        Object[] objArr = uVar.f103000a;
        if (i15 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i15];
        obj.getClass();
        t tVar = (t) obj;
        if (i14 == 6) {
            u<K, V, T> uVar2 = uVarArr[i14 + 1];
            Object[] objArr2 = tVar.f102999d;
            int length2 = objArr2.length;
            uVar2.getClass();
            uVar2.f103000a = objArr2;
            uVar2.f103001b = length2;
            uVar2.f103002c = 0;
        } else {
            u<K, V, T> uVar3 = uVarArr[i14 + 1];
            Object[] objArr3 = tVar.f102999d;
            int iBitCount = Integer.bitCount(tVar.f102996a) * 2;
            uVar3.getClass();
            objArr3.getClass();
            uVar3.f103000a = objArr3;
            uVar3.f103001b = iBitCount;
            uVar3.f103002c = 0;
        }
        return b(i14 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f102972c;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.f102972c) {
            c22.t.g();
            return null;
        }
        T next = this.f102970a[this.f102971b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
