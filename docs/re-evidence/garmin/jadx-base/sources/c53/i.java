package c53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc53/i;", "", "T", "Lc53/j;", "Lkotlin/Function0;", "getInitialValue", "Lkotlin/Function1;", "getNextValue", "<init>", "(Le23/a;Le23/l;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i<T> implements j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<T> f24562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<T, T> f24563b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"c53/i$a", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<T>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f24564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24565b = -2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i<T> f24566c;

        public a(i<T> iVar) {
            this.f24566c = iVar;
        }

        public final void a() {
            T tInvoke;
            int i14 = this.f24565b;
            i<T> iVar = this.f24566c;
            if (i14 == -2) {
                tInvoke = iVar.f24562a.invoke();
            } else {
                e23.l<T, T> lVar = iVar.f24563b;
                T t7 = this.f24564a;
                t7.getClass();
                tInvoke = lVar.invoke(t7);
            }
            this.f24564a = tInvoke;
            this.f24565b = tInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f24565b < 0) {
                a();
            }
            return this.f24565b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f24565b < 0) {
                a();
            }
            if (this.f24565b == 0) {
                c22.t.g();
                return null;
            }
            T t7 = this.f24564a;
            t7.getClass();
            this.f24565b = -1;
            return t7;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(e23.a<? extends T> aVar, e23.l<? super T, ? extends T> lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f24562a = aVar;
        this.f24563b = lVar;
    }

    @Override // c53.j
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
