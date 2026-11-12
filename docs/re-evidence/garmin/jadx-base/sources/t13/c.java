package t13;

import androidx.room.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.p;
import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt13/c;", "Lt13/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", TtmlNode.LEFT, "Lt13/g$a;", "element", "<init>", "(Lt13/g;Lt13/g$a;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f161744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.a f161745b;

    public c(g gVar, g.a aVar) {
        gVar.getClass();
        aVar.getClass();
        this.f161744a = gVar;
        this.f161745b = aVar;
    }

    public final boolean equals(Object obj) {
        boolean zG;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i14 = 2;
            c cVar2 = cVar;
            int i15 = 2;
            while (true) {
                g gVar = cVar2.f161744a;
                cVar2 = gVar instanceof c ? (c) gVar : null;
                if (cVar2 == null) {
                    break;
                }
                i15++;
            }
            c cVar3 = this;
            while (true) {
                g gVar2 = cVar3.f161744a;
                cVar3 = gVar2 instanceof c ? (c) gVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i14++;
            }
            if (i15 == i14) {
                c cVar4 = this;
                while (true) {
                    g.a aVar = cVar4.f161745b;
                    if (!s.g(cVar.get(aVar.getKey()), aVar)) {
                        zG = false;
                        break;
                    }
                    g gVar3 = cVar4.f161744a;
                    if (!(gVar3 instanceof c)) {
                        g.a aVar2 = (g.a) gVar3;
                        zG = s.g(cVar.get(aVar2.getKey()), aVar2);
                        break;
                    }
                    cVar4 = (c) gVar3;
                }
                if (zG) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t13.g
    public final <R> R fold(R r14, p<? super R, ? super g.a, ? extends R> pVar) {
        pVar.getClass();
        return pVar.invoke((Object) this.f161744a.fold(r14, pVar), this.f161745b);
    }

    @Override // t13.g
    public final <E extends g.a> E get(g.b<E> bVar) {
        bVar.getClass();
        c cVar = this;
        while (true) {
            E e4 = (E) cVar.f161745b.get(bVar);
            if (e4 != null) {
                return e4;
            }
            g gVar = cVar.f161744a;
            if (!(gVar instanceof c)) {
                return (E) gVar.get(bVar);
            }
            cVar = (c) gVar;
        }
    }

    public final int hashCode() {
        return this.f161745b.hashCode() + this.f161744a.hashCode();
    }

    @Override // t13.g
    public final g minusKey(g.b<?> bVar) {
        bVar.getClass();
        g.a aVar = this.f161745b;
        g.a aVar2 = aVar.get(bVar);
        g gVar = this.f161744a;
        if (aVar2 != null) {
            return gVar;
        }
        g gVarMinusKey = gVar.minusKey(bVar);
        if (gVarMinusKey == gVar) {
            return this;
        }
        return gVarMinusKey == h.f161748a ? aVar : new c(gVarMinusKey, aVar);
    }

    @Override // t13.g
    public final g plus(g gVar) {
        gVar.getClass();
        return gVar == h.f161748a ? this : (g) gVar.fold(this, new sv0.b(29));
    }

    public final String toString() {
        return a0.m(new StringBuilder("["), (String) fold("", new sv0.b(28)), ']');
    }
}
