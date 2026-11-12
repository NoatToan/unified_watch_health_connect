package p3;

import kotlinx.coroutines.CoroutineExceptionHandler;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lp3/b1;", "Lp3/y2;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lt13/g;", "parentCoroutineContext", "Lkotlin/Function2;", "Lo53/b0;", "Lt13/d;", "", "", "task", "<init>", "(Lt13/g;Le23/p;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b1 implements y2, CoroutineExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.g f135043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<o53.b0, t13.d<? super Unit>, Object> f135044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u53.d f135045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o53.c2 f135046d;

    /* JADX WARN: Multi-variable type inference failed */
    public b1(t13.g gVar, e23.p<? super o53.b0, ? super t13.d<? super Unit>, ? extends Object> pVar) {
        this.f135043a = gVar;
        this.f135044b = pVar;
        t13.g gVarPlus = gVar.plus(this);
        int i14 = g4.f.f75739a;
        this.f135045c = o53.c0.a(gVarPlus);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void L(Throwable th3, t13.g gVar) throws Throwable {
        g4.i iVar = (g4.i) gVar.get(g4.i.f75740b);
        if (iVar != null) {
            iVar.g(this, th3);
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.f135043a.get(CoroutineExceptionHandler.f105965e0);
        if (coroutineExceptionHandler == null) {
            throw th3;
        }
        coroutineExceptionHandler.L(th3, gVar);
    }

    @Override // t13.g
    public final <R> R fold(R r14, e23.p<? super R, ? super t13.g.a, ? extends R> pVar) {
        return (R) t13.g.a.C3052a.a(this, r14, pVar);
    }

    @Override // t13.g
    public final <E extends t13.g.a> E get(t13.g.b<E> bVar) {
        return (E) t13.g.a.C3052a.b(this, bVar);
    }

    @Override // t13.g.a
    public final t13.g.b<?> getKey() {
        return CoroutineExceptionHandler.f105965e0;
    }

    @Override // t13.g
    public final t13.g minusKey(t13.g.b<?> bVar) {
        return t13.g.a.C3052a.c(this, bVar);
    }

    @Override // p3.y2
    public final void onAbandoned() {
        o53.c2 c2Var = this.f135046d;
        if (c2Var != null) {
            c2Var.H(new d1());
        }
        this.f135046d = null;
    }

    @Override // p3.y2
    public final void onForgotten() {
        o53.c2 c2Var = this.f135046d;
        if (c2Var != null) {
            c2Var.H(new d1());
        }
        this.f135046d = null;
    }

    @Override // p3.y2
    public final void onRemembered() {
        o53.c2 c2Var = this.f135046d;
        if (c2Var != null) {
            g8.i.q("Old job was still running!", c2Var);
        }
        this.f135046d = ge1.b.T(this.f135045c, null, null, this.f135044b, 3);
    }

    @Override // t13.g
    public final t13.g plus(t13.g gVar) {
        return t13.g.a.C3052a.d(gVar, this);
    }
}
