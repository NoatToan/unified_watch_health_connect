package k53;

import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lk53/g;", "K", "V", "T", "", "Lk53/e;", "Lk53/f;", "builder", "", "Lk53/u;", "path", "<init>", "(Lk53/f;[Lk53/u;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class g<K, V, T> extends e<K, V, T> implements Iterator<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f<K, V> f102983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public K f102984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f102985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f102986g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f<K, V> fVar, u<K, V, T>[] uVarArr) {
        super(fVar.f102975c, uVarArr);
        fVar.getClass();
        uVarArr.getClass();
        this.f102983d = fVar;
        this.f102986g = fVar.f102977e;
    }

    public final void c(int i14, t<?, ?> tVar, K k14, int i15, int i16, boolean z14) {
        int i17;
        int i18 = i15 * 5;
        u<K, V, T>[] uVarArr = this.f102970a;
        if (i18 <= 30) {
            int iZ = 1 << gl1.y.z(i14, i18);
            if (!tVar.i(iZ)) {
                int iT = tVar.t(iZ);
                t<?, ?> tVarS = tVar.s(iT);
                u<K, V, T> uVar = uVarArr[i15];
                Object[] objArr = tVar.f102999d;
                int iBitCount = Integer.bitCount(tVar.f102996a) * 2;
                uVar.getClass();
                objArr.getClass();
                uVar.f103000a = objArr;
                uVar.f103001b = iBitCount;
                uVar.f103002c = iT;
                c(i14, tVarS, k14, i15 + 1, i16, z14);
                return;
            }
            int iF = tVar.f(iZ);
            if (iZ == (z14 ? 1 << gl1.y.z(i16, i18) : 0) && i15 < (i17 = this.f102971b)) {
                u<K, V, T> uVar2 = uVarArr[i17];
                Object[] objArr2 = tVar.f102999d;
                Object[] objArr3 = {objArr2[iF], objArr2[iF + 1]};
                uVar2.getClass();
                uVar2.f103000a = objArr3;
                uVar2.f103001b = 2;
                uVar2.f103002c = 0;
                return;
            }
            u<K, V, T> uVar3 = uVarArr[i15];
            Object[] objArr4 = tVar.f102999d;
            int iBitCount2 = Integer.bitCount(tVar.f102996a) * 2;
            uVar3.getClass();
            objArr4.getClass();
            uVar3.f103000a = objArr4;
            uVar3.f103001b = iBitCount2;
            uVar3.f103002c = iF;
            this.f102971b = i15;
            return;
        }
        u<K, V, T> uVar4 = uVarArr[i15];
        Object[] objArr5 = tVar.f102999d;
        int length = objArr5.length;
        uVar4.getClass();
        uVar4.f103000a = objArr5;
        uVar4.f103001b = length;
        uVar4.f103002c = 0;
        while (true) {
            u<K, V, T> uVar5 = uVarArr[i15];
            if (p005kotlin.jvm.internal.s.g(uVar5.f103000a[uVar5.f103002c], k14)) {
                this.f102971b = i15;
                return;
            } else {
                uVarArr[i15].f103002c += 2;
            }
        }
    }

    @Override // k53.e, java.util.Iterator
    public final T next() {
        if (this.f102983d.f102977e != this.f102986g) {
            org.apache.commons.lang3.e.h();
            return null;
        }
        if (!this.f102972c) {
            c22.t.g();
            return null;
        }
        u<K, V, T> uVar = this.f102970a[this.f102971b];
        this.f102984e = (K) uVar.f103000a[uVar.f103002c];
        this.f102985f = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k53.e, java.util.Iterator
    public final void remove() {
        g gVar;
        if (!this.f102985f) {
            j20.x.h();
            return;
        }
        boolean z14 = this.f102972c;
        f<K, V> fVar = this.f102983d;
        if (!z14) {
            g gVar2 = this;
            y0.c(fVar).remove(gVar2.f102984e);
            gVar = gVar2;
        } else {
            if (!z14) {
                c22.t.g();
                return;
            }
            u<K, V, T> uVar = this.f102970a[this.f102971b];
            Object obj = uVar.f103000a[uVar.f103002c];
            y0.c(fVar).remove(this.f102984e);
            int iHashCode = obj != null ? obj.hashCode() : 0;
            t<K, V> tVar = fVar.f102975c;
            K k14 = this.f102984e;
            g gVar3 = this;
            gVar3.c(iHashCode, tVar, obj, 0, k14 != null ? k14.hashCode() : 0, true);
            gVar = gVar3;
        }
        gVar.f102984e = null;
        gVar.f102985f = false;
        gVar.f102986g = fVar.f102977e;
    }
}
