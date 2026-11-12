package i53;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface c<E> extends List<E>, b<E>, f23.a {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li53/c$a;", "E", "Li53/c;", "Lp13/c;", "source", "", "fromIndex", "toIndex", "<init>", "(Li53/c;II)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<E> extends p13.c<E> implements c<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c<E> f91798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f91799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f91800d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(c<? extends E> cVar, int i14, int i15) {
            cVar.getClass();
            this.f91798b = cVar;
            this.f91799c = i14;
            n53.c.c(i14, i15, cVar.size());
            this.f91800d = i15 - i14;
        }

        @Override // p13.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF91800d() {
            return this.f91800d;
        }

        @Override // java.util.List
        public final E get(int i14) {
            n53.c.a(i14, this.f91800d);
            return this.f91798b.get(this.f91799c + i14);
        }

        @Override // p13.c, java.util.List, i53.c
        public final a subList(int i14, int i15) {
            n53.c.c(i14, i15, this.f91800d);
            int i16 = this.f91799c;
            return new a(this.f91798b, i14 + i16, i16 + i15);
        }
    }

    @Override // java.util.List
    a subList(int i14, int i15);
}
