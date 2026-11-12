package defpackage;

import androidx.annotation.VisibleForTesting;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public class a7g<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xve<b<A>, B> f713a;

    public class a extends xve<b<A>, B> {
        public a(long j) {
            super(j);
        }

        @Override // defpackage.xve
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void h(b<A> bVar, B b2) {
            bVar.c();
        }
    }

    @VisibleForTesting
    public static final class b<A> {
        public static final Queue<b<?>> d = ulq.g(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f715b;
        public A c;

        public static <A> b<A> a(A a2, int i, int i2) {
            b<A> bVar;
            Queue<b<?>> queue = d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a2, i, i2);
            return bVar;
        }

        public final void b(A a2, int i, int i2) {
            this.c = a2;
            this.f715b = i;
            this.f714a = i2;
        }

        public void c() {
            Queue<b<?>> queue = d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f715b == bVar.f715b && this.f714a == bVar.f714a && this.c.equals(bVar.c);
        }

        public int hashCode() {
            return (((this.f714a * 31) + this.f715b) * 31) + this.c.hashCode();
        }
    }

    public a7g(long j) {
        this.f713a = new a(j);
    }

    public B a(A a2, int i, int i2) {
        b<A> bVarA = b.a(a2, i, i2);
        B bE = this.f713a.e(bVarA);
        bVarA.c();
        return bE;
    }

    public void b(A a2, int i, int i2, B b2) {
        this.f713a.i(b.a(a2, i, i2), b2);
    }
}
