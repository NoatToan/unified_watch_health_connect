package x3;

import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.i;
import w3.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\fB/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lx3/b;", "E", "Lp13/i;", "Lu3/e;", "", "firstElement", "lastElement", "Lw3/d;", "Lx3/a;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lw3/d;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<E> extends i<E> implements u3.e<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f188546e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f188547f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f188548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f188549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w3.d<E, x3.a> f188550d;

    static {
        y3.b bVar = y3.b.f194361a;
        w3.d.f181785d.getClass();
        w3.d dVar = w3.d.f181786e;
        dVar.getClass();
        f188547f = new b(bVar, bVar, dVar);
    }

    public b(Object obj, Object obj2, w3.d<E, x3.a> dVar) {
        this.f188548b = obj;
        this.f188549c = obj2;
        this.f188550d = dVar;
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF134922d() {
        return this.f188550d.getF102965c();
    }

    @Override // java.util.Collection, java.util.Set, u3.e
    public final b add(Object obj) {
        w3.d<E, x3.a> dVar = this.f188550d;
        if (dVar.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new b(obj, obj, dVar.i(obj, new x3.a()));
        }
        Object obj2 = this.f188549c;
        x3.a aVar = dVar.get(obj2);
        aVar.getClass();
        return new b(this.f188548b, obj, dVar.i(obj2, new x3.a(aVar.f188544a, obj)).i(obj, new x3.a(obj2)));
    }

    @Override // java.util.Collection, java.util.Set, u3.e
    public final u3.e<E> addAll(Collection<? extends E> collection) {
        c cVar = new c(this);
        cVar.addAll(collection);
        return cVar.b();
    }

    @Override // u3.e
    public final c builder() {
        return new c(this);
    }

    @Override // p13.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f188550d.containsKey(obj);
    }

    @Override // p13.i, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new d(this.f188548b, this.f188550d);
    }

    @Override // java.util.Collection, java.util.Set, u3.e
    public final b remove(Object obj) {
        w3.d<E, x3.a> dVarI = this.f188550d;
        x3.a aVar = dVarI.get(obj);
        if (aVar == null) {
            return this;
        }
        Object obj2 = aVar.f188544a;
        Object obj3 = aVar.f188545b;
        t<E, x3.a> tVar = dVarI.f181787b;
        t<E, x3.a> tVarV = tVar.v(obj != null ? obj.hashCode() : 0, 0, obj);
        if (tVar != tVarV) {
            if (tVarV == null) {
                w3.d.f181785d.getClass();
                dVarI = w3.d.f181786e;
                dVarI.getClass();
            } else {
                dVarI = new w3.d<>(tVarV, dVarI.f181788c - 1);
            }
        }
        y3.b bVar = y3.b.f194361a;
        if (obj2 != bVar) {
            x3.a aVar2 = dVarI.get(obj2);
            aVar2.getClass();
            dVarI = dVarI.i(obj2, new x3.a(aVar2.f188544a, obj3));
        }
        if (obj3 != bVar) {
            x3.a aVar3 = dVarI.get(obj3);
            aVar3.getClass();
            dVarI = dVarI.i(obj3, new x3.a(obj2, aVar3.f188545b));
        }
        Object obj4 = obj2 != bVar ? this.f188548b : obj3;
        if (obj3 != bVar) {
            obj2 = this.f188549c;
        }
        return new b(obj4, obj2, dVarI);
    }

    @Override // java.util.Collection, java.util.Set, u3.e
    public final u3.e<E> removeAll(Collection<? extends E> collection) {
        c cVar = new c(this);
        cVar.removeAll(collection);
        return cVar.b();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lx3/b$a;", "", "<init>", "()V", "Lx3/b;", "", "EMPTY", "Lx3/b;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
