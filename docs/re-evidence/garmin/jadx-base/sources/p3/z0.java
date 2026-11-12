package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class z0 implements e23.l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f135392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.j<Unit> f135393b;

    /* JADX WARN: Multi-variable type inference failed */
    public z0(a1 a1Var, o53.j<? super Unit> jVar) {
        this.f135392a = a1Var;
        this.f135393b = jVar;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        a1 a1Var = this.f135392a;
        Object obj = a1Var.f135030a;
        o53.j<Unit> jVar = this.f135393b;
        synchronized (obj) {
            a1Var.f135031b.remove(jVar);
        }
        return Unit.INSTANCE;
    }
}
