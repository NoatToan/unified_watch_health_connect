package w3;

import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lw3/g;", "K", "V", "T", "", "Lw3/e;", "Lw3/f;", "builder", "", "Lw3/u;", "path", "<init>", "(Lw3/f;[Lw3/u;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class g<K, V, T> extends e<K, V, T> implements Iterator<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f<K, V> f181798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public K f181799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f181800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f181801g;

    public g(f<K, V> fVar, u<K, V, T>[] uVarArr) {
        super(fVar.f181794c, uVarArr);
        this.f181798d = fVar;
        this.f181801g = fVar.f181796e;
    }

    public final void c(int i14, t<?, ?> tVar, K k14, int i15) {
        int i16 = i15 * 5;
        u<K, V, T>[] uVarArr = this.f181789a;
        if (i16 <= 30) {
            int iP = 1 << x.p(i14, i16);
            if (tVar.h(iP)) {
                uVarArr[i15].a(Integer.bitCount(tVar.f181811a) * 2, tVar.f(iP), tVar.f181814d);
                this.f181790b = i15;
                return;
            }
            int iT = tVar.t(iP);
            t<?, ?> tVarS = tVar.s(iT);
            uVarArr[i15].a(Integer.bitCount(tVar.f181811a) * 2, iT, tVar.f181814d);
            c(i14, tVarS, k14, i15 + 1);
            return;
        }
        u<K, V, T> uVar = uVarArr[i15];
        Object[] objArr = tVar.f181814d;
        uVar.a(objArr.length, 0, objArr);
        while (true) {
            u<K, V, T> uVar2 = uVarArr[i15];
            if (p005kotlin.jvm.internal.s.g(uVar2.f181817a[uVar2.f181819c], k14)) {
                this.f181790b = i15;
                return;
            } else {
                uVarArr[i15].f181819c += 2;
            }
        }
    }

    @Override // w3.e, java.util.Iterator
    public final T next() {
        if (this.f181798d.f181796e != this.f181801g) {
            org.apache.commons.lang3.e.h();
            return null;
        }
        if (!this.f181791c) {
            c22.t.g();
            return null;
        }
        u<K, V, T> uVar = this.f181789a[this.f181790b];
        this.f181799e = (K) uVar.f181817a[uVar.f181819c];
        this.f181800f = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w3.e, java.util.Iterator
    public final void remove() {
        if (!this.f181800f) {
            j20.x.h();
            return;
        }
        boolean z14 = this.f181791c;
        f<K, V> fVar = this.f181798d;
        if (!z14) {
            y0.c(fVar).remove(this.f181799e);
        } else {
            if (!z14) {
                c22.t.g();
                return;
            }
            u<K, V, T> uVar = this.f181789a[this.f181790b];
            Object obj = uVar.f181817a[uVar.f181819c];
            y0.c(fVar).remove(this.f181799e);
            c(obj != null ? obj.hashCode() : 0, fVar.f181794c, obj, 0);
        }
        this.f181799e = null;
        this.f181800f = false;
        this.f181801g = fVar.f181796e;
    }
}
