package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp3/w1;", "Lp3/e;", "Lkotlin/Function0;", "", "action", "<init>", "(Le23/a;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w1 implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Unit> f135368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3.b f135369b = new z3.b(0);

    public w1(e23.a<Unit> aVar) {
        this.f135368a = aVar;
    }

    @Override // p3.e
    public final void cancel() {
        if (this.f135369b.compareAndSet(1, 1)) {
            return;
        }
        this.f135368a.invoke();
    }
}
