package c53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc53/g;", "T", "Lc53/j;", "sequence", "", "sendWhen", "Lkotlin/Function1;", "predicate", "<init>", "(Lc53/j;ZLe23/l;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g<T> implements j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<T> f24539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<T, Boolean> f24541c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"c53/g$a", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<T>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f24542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24543b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f24544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g<T> f24545d;

        public a(g<T> gVar) {
            this.f24545d = gVar;
            this.f24542a = gVar.f24539a.iterator();
        }

        public final void a() {
            T next;
            g<T> gVar;
            do {
                Iterator<T> it = this.f24542a;
                if (!it.hasNext()) {
                    this.f24543b = 0;
                    return;
                } else {
                    next = it.next();
                    gVar = this.f24545d;
                }
            } while (gVar.f24541c.invoke(next).booleanValue() != gVar.f24540b);
            this.f24544c = next;
            this.f24543b = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f24543b == -1) {
                a();
            }
            return this.f24543b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f24543b == -1) {
                a();
            }
            if (this.f24543b == 0) {
                c22.t.g();
                return null;
            }
            T t7 = this.f24544c;
            this.f24544c = null;
            this.f24543b = -1;
            return t7;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(j<? extends T> jVar, boolean z14, e23.l<? super T, Boolean> lVar) {
        jVar.getClass();
        lVar.getClass();
        this.f24539a = jVar;
        this.f24540b = z14;
        this.f24541c = lVar;
    }

    @Override // c53.j
    public final Iterator<T> iterator() {
        return new a(this);
    }

    public /* synthetic */ g(j jVar, boolean z14, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(jVar, (i14 & 2) != 0 ? true : z14, lVar);
    }
}
