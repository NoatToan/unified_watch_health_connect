package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/u1;", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u1 implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f150887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f150888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q f150889c;

    public u1(i iVar, i iVar2, e23.q qVar) {
        this.f150887a = iVar;
        this.f150888b = iVar2;
        this.f150889c = qVar;
    }

    @Override // r53.i
    public final Object collect(j<? super Object> jVar, t13.d<? super Unit> dVar) {
        Object objA = s53.m.a(new i[]{this.f150887a, this.f150888b}, x1.f150941a, new v1(this.f150889c, null), jVar, dVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }
}
