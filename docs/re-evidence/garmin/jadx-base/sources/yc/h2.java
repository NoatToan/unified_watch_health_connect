package yc;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0004\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lyc/h2;", "", "Key", "Value", "Lyc/x;", "<init>", "()V", "a", "b", "c", "d", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class h2<Key, Value> extends x<Key, Value> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyc/h2$a;", "Key", "Value", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a<Key, Value> {
        public abstract void a(Object obj, List list);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyc/h2$b;", "Key", "Value", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b<Key, Value> {
        public abstract void a(Object obj, List list);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyc/h2$c;", "", "Key", "", "requestedLoadSize", "", "placeholdersEnabled", "<init>", "(IZ)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class c<Key> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f196002a;

        public c(int i14, boolean z14) {
            this.f196002a = i14;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyc/h2$d;", "", "Key", Action.KEY_ATTRIBUTE, "", "requestedLoadSize", "<init>", "(Ljava/lang/Object;I)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d<Key> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Key f196003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f196004b;

        public d(Key key, int i14) {
            key.getClass();
            this.f196003a = key;
            this.f196004b = i14;
        }
    }

    public h2() {
        super(x.e.PAGE_KEYED);
    }

    @Override // yc.x
    public final Key a(Value value) {
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // yc.x
    public final Object c(x.f fVar, w0 w0Var) throws Throwable {
        c1 c1Var = fVar.f196585a;
        int i14 = fVar.f196589e;
        if (c1Var == c1.REFRESH) {
            c<Key> cVar = new c<>(fVar.f196587c, fVar.f196588d);
            o53.k kVar = new o53.k(u13.f.b(w0Var), 1);
            kVar.q();
            f(cVar, new j2(kVar));
            Object objP = kVar.p();
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            return objP;
        }
        K k14 = fVar.f196586b;
        if (k14 == 0) {
            x.a.f196575f.getClass();
            return new x.a(p13.j0.f134944a, null, null, 0, 0);
        }
        if (c1Var == c1.PREPEND) {
            d dVar = new d(k14, i14);
            o53.k kVar2 = new o53.k(u13.f.b(w0Var), 1);
            kVar2.q();
            e(dVar, new i2(kVar2, false));
            Object objP2 = kVar2.p();
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            return objP2;
        }
        if (c1Var != c1.APPEND) {
            n23.j.A(fVar.f196585a, "Unsupported type ");
            return null;
        }
        d<Key> dVar2 = new d<>(k14, i14);
        o53.k kVar3 = new o53.k(u13.f.b(w0Var), 1);
        kVar3.q();
        d(dVar2, new i2(kVar3, true));
        Object objP3 = kVar3.p();
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        return objP3;
    }

    public abstract void d(d<Key> dVar, a<Key, Value> aVar);

    public abstract void e(d dVar, i2 i2Var);

    public abstract void f(c<Key> cVar, b<Key, Value> bVar);
}
