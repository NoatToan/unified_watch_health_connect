package s53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Ls53/n;", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements r53.i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f157546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r53.i f157547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q f157548c;

    public n(r53.i iVar, r53.i iVar2, e23.q qVar) {
        this.f157546a = iVar;
        this.f157547b = iVar2;
        this.f157548c = qVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super Object> jVar, t13.d<? super Unit> dVar) {
        Object objE = o53.c0.e(new o(this.f157546a, this.f157547b, jVar, this.f157548c, null), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }
}
