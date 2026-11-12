package c53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc53/d0;", "T", "Lc53/j;", "Lc53/e;", "sequence", "", "startIndex", "endIndex", "<init>", "(Lc53/j;II)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0<T> implements j<T>, e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<T> f24522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24524c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"c53/d0$a", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<T>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<T> f24525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0<T> f24527c;

        public a(d0<T> d0Var) {
            this.f24527c = d0Var;
            this.f24525a = d0Var.f24522a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            d0<T> d0Var;
            Iterator<T> it;
            while (true) {
                int i14 = this.f24526b;
                d0Var = this.f24527c;
                int i15 = d0Var.f24523b;
                it = this.f24525a;
                if (i14 >= i15 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f24526b++;
            }
            return this.f24526b < d0Var.f24524c && it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            d0<T> d0Var;
            Iterator<T> it;
            while (true) {
                int i14 = this.f24526b;
                d0Var = this.f24527c;
                int i15 = d0Var.f24523b;
                it = this.f24525a;
                if (i14 >= i15 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f24526b++;
            }
            int i16 = this.f24526b;
            if (i16 < d0Var.f24524c) {
                this.f24526b = i16 + 1;
                return it.next();
            }
            c22.t.g();
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(j<? extends T> jVar, int i14, int i15) {
        jVar.getClass();
        this.f24522a = jVar;
        this.f24523b = i14;
        this.f24524c = i15;
        if (i14 < 0) {
            vb.h.x(am.j.h(i14, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i15 < 0) {
            vb.h.x(am.j.h(i15, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i15 >= i14) {
            return;
        }
        vb.h.x(tn.k.e(i15, i14, "endIndex should be not less than startIndex, but was ", " < "));
        throw null;
    }

    @Override // c53.e
    public final j<T> a(int i14) {
        int i15 = this.f24524c;
        int i16 = this.f24523b;
        return i14 >= i15 - i16 ? this : new d0(this.f24522a, i16, i14 + i16);
    }

    @Override // c53.e
    public final j<T> b(int i14) {
        int i15 = this.f24524c;
        int i16 = this.f24523b;
        return i14 >= i15 - i16 ? f.f24532a : new d0(this.f24522a, i16 + i14, i15);
    }

    @Override // c53.j
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
