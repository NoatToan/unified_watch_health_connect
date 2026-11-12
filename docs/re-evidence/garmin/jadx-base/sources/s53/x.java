package s53;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import s5.d0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ls53/x;", "T", "Lr53/j;", "Lv13/c;", "Lv13/d;", "collector", "Lt13/g;", "collectContext", "<init>", "(Lr53/j;Lt13/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x<T> extends v13.c implements r53.j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.j<T> f157601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t13.g f157602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f157603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t13.g f157604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t13.d<? super Unit> f157605e;

    /* JADX WARN: Multi-variable type inference failed */
    public x(r53.j<? super T> jVar, t13.g gVar) {
        super(u.f157595a, t13.h.f161748a);
        this.f157601a = jVar;
        this.f157602b = gVar;
        this.f157603c = ((Number) gVar.fold(0, new d0(27))).intValue();
    }

    public final Object a(t13.d<? super Unit> dVar, T t7) {
        t13.g f129302c = dVar.getF129302c();
        g8.i.v(f129302c);
        t13.g gVar = this.f157604d;
        if (gVar != f129302c) {
            if (gVar instanceof p) {
                throw new IllegalStateException(d53.n.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((p) gVar).f157589b + ", but then emission attempt of value '" + t7 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) f129302c.fold(0, new s5.a(this, 3))).intValue() != this.f157603c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f157602b + ",\n\t\tbut emission happened in " + f129302c + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f157604d = f129302c;
        }
        this.f157605e = dVar;
        e23.q<r53.j<Object>, Object, t13.d<? super Unit>, Object> qVar = y.f157606a;
        r53.j<T> jVar = this.f157601a;
        jVar.getClass();
        Object objInvoke = qVar.invoke(jVar, t7, this);
        if (!p005kotlin.jvm.internal.s.g(objInvoke, u13.a.COROUTINE_SUSPENDED)) {
            this.f157605e = null;
        }
        return objInvoke;
    }

    @Override // r53.j
    public final Object emit(T t7, t13.d<? super Unit> dVar) {
        try {
            Object objA = a(dVar, t7);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        } catch (Throwable th3) {
            this.f157604d = new p(th3, dVar.getF129302c());
            throw th3;
        }
    }

    @Override // v13.a, v13.d
    public final v13.d getCallerFrame() {
        t13.d<? super Unit> dVar = this.f157605e;
        if (dVar instanceof v13.d) {
            return (v13.d) dVar;
        }
        return null;
    }

    @Override // v13.c, t13.d
    /* JADX INFO: renamed from: getContext */
    public final t13.g getF129302c() {
        t13.g gVar = this.f157604d;
        return gVar == null ? t13.h.f161748a : gVar;
    }

    @Override // v13.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Throwable thB = o13.q.b(obj);
        if (thB != null) {
            this.f157604d = new p(thB, getF129302c());
        }
        t13.d<? super Unit> dVar = this.f157605e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return u13.a.COROUTINE_SUSPENDED;
    }
}
