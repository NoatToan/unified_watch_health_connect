package bi;

import p005kotlin.Metadata;
import vh.g0;
import vh.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB>\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012(\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lbi/p;", "Lvh/g0$b;", "Lvh/s0$a;", "data", "Lkotlin/Function3;", "", "", "Lt13/d;", "", "", "retryWhen", "<init>", "(Lvh/s0$a;Le23/q;)V", "a", "apollo-normalized-cache"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class p implements g0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f18006d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0.a f18007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.q<Throwable, Long, t13.d<? super Boolean>, Object> f18008c;

    /* JADX WARN: Multi-variable type inference failed */
    public p(s0.a aVar, e23.q<? super Throwable, ? super Long, ? super t13.d<? super Boolean>, ? extends Object> qVar) {
        qVar.getClass();
        this.f18007b = aVar;
        this.f18008c = qVar;
    }

    @Override // vh.g0
    public final g0 a(g0.c<?> cVar) {
        return g0.b.a.c(this, cVar);
    }

    @Override // vh.g0
    public final <E extends g0.b> E b(g0.c<E> cVar) {
        return (E) g0.b.a.b(this, cVar);
    }

    @Override // vh.g0
    public final g0 c(g0 g0Var) {
        return g0.b.a.d(g0Var, this);
    }

    @Override // vh.g0
    public final <R> R fold(R r14, e23.p<? super R, ? super g0.b, ? extends R> pVar) {
        return (R) g0.b.a.a(this, r14, pVar);
    }

    @Override // vh.g0.b
    public final g0.c<?> getKey() {
        return f18006d;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbi/p$a;", "Lvh/g0$c;", "Lbi/p;", "<init>", "()V", "apollo-normalized-cache"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements g0.c<p> {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
