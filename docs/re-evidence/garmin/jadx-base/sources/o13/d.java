package o13;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004BE\u00124\u0010\u0007\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo13/d;", "T", "R", "Lo13/c;", "Lt13/d;", "Lkotlin/Function3;", "", "block", "value", "<init>", "(Le23/q;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d<T, R> extends c<T, R> implements t13.d<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.q<? super c<?, ?>, Object, ? super t13.d<Object>, ? extends Object> f128569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f128570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t13.d<Object> f128571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f128572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(e23.q<? super c<T, R>, ? super T, ? super t13.d<? super R>, ? extends Object> qVar, T t7) {
        super(null);
        qVar.getClass();
        this.f128569a = qVar;
        this.f128570b = t7;
        this.f128571c = this;
        this.f128572d = b.f128565a;
    }

    @Override // o13.c
    public final u13.a a(Unit unit, o63.x xVar) {
        this.f128571c = xVar;
        this.f128570b = unit;
        return u13.a.COROUTINE_SUSPENDED;
    }

    @Override // t13.d
    /* JADX INFO: renamed from: getContext */
    public final t13.g getF129302c() {
        return t13.h.f161748a;
    }

    @Override // t13.d
    public final void resumeWith(Object obj) {
        this.f128571c = null;
        this.f128572d = obj;
    }
}
