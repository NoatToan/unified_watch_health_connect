package u3;

import java.util.Collection;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface a<E> extends List<E>, Collection, f23.a {

    /* JADX INFO: renamed from: u3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu3/a$a;", "E", "Lu3/a;", "Lp13/c;", "source", "", "fromIndex", "toIndex", "<init>", "(Lu3/a;II)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3154a<E> extends p13.c<E> implements a<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a<E> f168270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f168271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f168272d;

        /* JADX WARN: Multi-variable type inference failed */
        public C3154a(a<? extends E> aVar, int i14, int i15) {
            this.f168270b = aVar;
            this.f168271c = i14;
            y3.c.c(i14, i15, aVar.size());
            this.f168272d = i15 - i14;
        }

        @Override // p13.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF168272d() {
            return this.f168272d;
        }

        @Override // java.util.List
        public final E get(int i14) {
            y3.c.a(i14, this.f168272d);
            return this.f168270b.get(this.f168271c + i14);
        }

        @Override // p13.c, java.util.List, i53.c
        public final List subList(int i14, int i15) {
            y3.c.c(i14, i15, this.f168272d);
            int i16 = this.f168271c;
            return new C3154a(this.f168270b, i14 + i16, i16 + i15);
        }
    }
}
