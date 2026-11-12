package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/j0;", "generationalHint", "", "emit", "(Lyc/j0;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class v1<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1<Object, Object> f196533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f196534b;

    public v1(s1<Object, Object> s1Var, c1 c1Var) {
        this.f196533a = s1Var;
        this.f196534b = c1Var;
    }

    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) throws Throwable {
        Object objB = s1.b(this.f196533a, this.f196534b, (j0) obj, dVar);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }
}
