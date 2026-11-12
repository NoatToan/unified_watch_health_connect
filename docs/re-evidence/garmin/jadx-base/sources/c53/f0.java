package c53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc53/f0;", "T", "Lc53/j;", "sequence", "Lkotlin/Function1;", "", "predicate", "<init>", "(Lc53/j;Le23/l;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0<T> implements j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<T> f24533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<T, Boolean> f24534b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"c53/f0$a", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<T>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f24535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24536b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f24537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f0<T> f24538d;

        public a(f0<T> f0Var) {
            this.f24538d = f0Var;
            this.f24535a = f0Var.f24533a.iterator();
        }

        public final void a() {
            Iterator<T> it = this.f24535a;
            if (it.hasNext()) {
                T next = it.next();
                if (this.f24538d.f24534b.invoke(next).booleanValue()) {
                    this.f24536b = 1;
                    this.f24537c = next;
                    return;
                }
            }
            this.f24536b = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f24536b == -1) {
                a();
            }
            return this.f24536b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f24536b == -1) {
                a();
            }
            if (this.f24536b == 0) {
                c22.t.g();
                return null;
            }
            T t7 = this.f24537c;
            this.f24537c = null;
            this.f24536b = -1;
            return t7;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0(j<? extends T> jVar, e23.l<? super T, Boolean> lVar) {
        jVar.getClass();
        lVar.getClass();
        this.f24533a = jVar;
        this.f24534b = lVar;
    }

    @Override // c53.j
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
