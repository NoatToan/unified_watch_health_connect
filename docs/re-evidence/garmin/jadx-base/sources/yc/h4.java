package yc;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyc/h4;", "T", "Lyc/e4;", "Lo53/b0;", "Lq53/w;", Action.SCOPE_ATTRIBUTE, "channel", "<init>", "(Lo53/b0;Lq53/w;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h4<T> implements e4<T>, o53.b0, q53.w<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q53.w<T> f196022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f196023b;

    /* JADX WARN: Multi-variable type inference failed */
    public h4(o53.b0 b0Var, q53.w<? super T> wVar) {
        b0Var.getClass();
        wVar.getClass();
        this.f196022a = wVar;
        this.f196023b = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yc.e4
    public final Object b9(r1.b.c cVar, v13.c cVar2) {
        f4 f4Var;
        if (cVar2 instanceof f4) {
            f4Var = (f4) cVar2;
            int i14 = f4Var.f195962e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f4Var.f195962e = i14 - Integer.MIN_VALUE;
            } else {
                f4Var = new f4(this, cVar2);
            }
        } else {
            f4Var = new f4(this, cVar2);
        }
        Object obj = f4Var.f195960c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f4Var.f195962e;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                t13.g.a aVar2 = this.f196023b.getF136462d().get(o53.l1.f129368i0);
                if (aVar2 == null) {
                    throw new IllegalStateException("Internal error, context should have a job.");
                }
                o53.l1 l1Var = (o53.l1) aVar2;
                f4Var.f195958a = cVar;
                f4Var.f195959b = l1Var;
                f4Var.f195962e = 1;
                o53.k kVar = new o53.k(u13.f.b(f4Var), 1);
                kVar.q();
                l1Var.J(new g4(kVar));
                if (kVar.p() == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = f4Var.f195958a;
                o13.r.b(obj);
            }
            cVar.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            cVar.invoke();
            throw th3;
        }
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF136462d() {
        return this.f196023b.getF136462d();
    }

    @Override // q53.w
    public final Object h(T t7, t13.d<? super Unit> dVar) {
        return this.f196022a.h(t7, dVar);
    }

    @Override // q53.w
    public final Object i(T t7) {
        return this.f196022a.i(t7);
    }

    @Override // q53.w
    public final void m(e23.l<? super Throwable, Unit> lVar) {
        this.f196022a.m(lVar);
    }

    @Override // q53.w
    public final boolean q(Throwable th3) {
        return this.f196022a.q(null);
    }
}
