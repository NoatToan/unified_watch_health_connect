package m63;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm63/g1;", "K", "V", "Lm63/o0;", "Lo13/p;", "Li63/c;", "keySerializer", "valueSerializer", "<init>", "(Li63/c;Li63/c;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g1<K, V> extends o0<K, V, o13.p<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k63.f f116951c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i63.c<K> cVar, i63.c<V> cVar2) {
        super(cVar, cVar2, null);
        cVar.getClass();
        cVar2.getClass();
        k63.e[] eVarArr = new k63.e[0];
        if (d53.w.J("kotlin.Pair")) {
            vb.h.s("Blank serial names are prohibited");
            throw null;
        }
        k63.a aVar = new k63.a("kotlin.Pair");
        k63.a.b(aVar, "first", cVar.getF158591b());
        k63.a.b(aVar, "second", cVar2.getF158591b());
        Unit unit = Unit.INSTANCE;
        this.f116951c = new k63.f("kotlin.Pair", k63.m.a.f103253a, aVar.f103214c.size(), p13.u.i0(eVarArr), aVar);
    }

    @Override // m63.o0
    public final Object a(Object obj) {
        o13.p pVar = (o13.p) obj;
        pVar.getClass();
        return pVar.f128594a;
    }

    @Override // m63.o0
    public final Object b(Object obj) {
        o13.p pVar = (o13.p) obj;
        pVar.getClass();
        return pVar.f128595b;
    }

    @Override // m63.o0
    public final Object c(Object obj, Object obj2) {
        return new o13.p(obj, obj2);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return this.f116951c;
    }
}
