package uh;

import e23.p;
import o53.b0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vh.g0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Luh/c;", "Lvh/g0$b;", "Lo53/z;", "dispatcher", "Lo53/b0;", "coroutineScope", "<init>", "(Lo53/z;Lo53/b0;)V", "a", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements g0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f171122d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f171123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f171124c;

    public c(z zVar, b0 b0Var) {
        zVar.getClass();
        b0Var.getClass();
        this.f171123b = zVar;
        this.f171124c = b0Var;
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
    public final <R> R fold(R r14, p<? super R, ? super g0.b, ? extends R> pVar) {
        return (R) g0.b.a.a(this, r14, pVar);
    }

    @Override // vh.g0.b
    public final g0.c<?> getKey() {
        return f171122d;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Luh/c$a;", "Lvh/g0$c;", "Luh/c;", "<init>", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements g0.c<c> {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
