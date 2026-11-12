package q53;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ds.e0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o53.n2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"Lq53/n;", "E", "Lu53/u;", "", TtmlNode.ATTR_ID, "prev", "Lq53/b;", "channel", "", "pointers", "<init>", "(JLq53/n;Lq53/b;I)V", "", "data", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n<E> extends u53.u<n<E>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b<E> f143002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f143003f;

    public n(long j8, n<E> nVar, b<E> bVar, int i14) {
        super(j8, nVar, i14);
        this.f143002e = bVar;
        this.f143003f = new AtomicReferenceArray(h.f142976b * 2);
    }

    @Override // u53.u
    public final int g() {
        return h.f142976b;
    }

    @Override // u53.u
    public final void h(t13.g gVar, int i14) {
        b<E> bVar;
        int i15 = h.f142976b;
        boolean z14 = i14 >= i15;
        if (z14) {
            i14 -= i15;
        }
        Object obj = this.f143003f.get(i14 * 2);
        while (true) {
            Object objL = l(i14);
            boolean z15 = objL instanceof n2;
            bVar = this.f143002e;
            if (z15 || (objL instanceof x)) {
                if (k(i14, objL, z14 ? h.f142984j : h.f142985k)) {
                    n(i14, null);
                    m(i14, !z14);
                    if (z14) {
                        bVar.getClass();
                        e23.l<E, Unit> lVar = bVar.f142959b;
                        if (lVar != null) {
                            og.a.t(lVar, obj, gVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (objL == h.f142984j || objL == h.f142985k) {
                    break;
                }
                if (objL != h.f142981g && objL != h.f142980f) {
                    if (objL == h.f142983i || objL == h.f142978d || objL == h.f142986l) {
                        return;
                    }
                    e0.t(objL, "unexpected state: ");
                    return;
                }
            }
        }
        n(i14, null);
        if (z14) {
            bVar.getClass();
            e23.l<E, Unit> lVar2 = bVar.f142959b;
            if (lVar2 != null) {
                og.a.t(lVar2, obj, gVar);
            }
        }
    }

    public final boolean k(int i14, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i15 = (i14 * 2) + 1;
        do {
            atomicReferenceArray = this.f143003f;
            if (atomicReferenceArray.compareAndSet(i15, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i15) == obj);
        return false;
    }

    public final Object l(int i14) {
        return this.f143003f.get((i14 * 2) + 1);
    }

    public final void m(int i14, boolean z14) {
        if (z14) {
            b<E> bVar = this.f143002e;
            bVar.getClass();
            bVar.L((this.f168771c * ((long) h.f142976b)) + ((long) i14));
        }
        i();
    }

    public final void n(int i14, Object obj) {
        this.f143003f.set(i14 * 2, obj);
    }

    public final void o(int i14, Object obj) {
        this.f143003f.set((i14 * 2) + 1, obj);
    }
}
