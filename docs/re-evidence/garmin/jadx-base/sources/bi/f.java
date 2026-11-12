package bi;

import p005kotlin.Metadata;
import vh.g0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbi/f;", "Lvh/g0$b;", "", "value", "<init>", "(Z)V", "a", "apollo-normalized-cache"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class f implements g0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f17941c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17942b;

    public f(boolean z14) {
        this.f17942b = z14;
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
        return f17941c;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbi/f$a;", "Lvh/g0$c;", "Lbi/f;", "<init>", "()V", "apollo-normalized-cache"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements g0.c<f> {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
