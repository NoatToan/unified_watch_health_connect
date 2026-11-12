package s5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u0000¨\u0006\u0001"}, d2 = {"Ls5/g0;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0 implements d4.k<Object, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<d4.n, Object, Object> f157196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<Object, Object> f157197b;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(e23.p<? super d4.n, Object, Object> pVar, e23.l<Object, Object> lVar) {
        this.f157196a = pVar;
        this.f157197b = lVar;
    }

    @Override // d4.k
    public final Object a(Object obj) {
        return this.f157197b.invoke(obj);
    }

    @Override // d4.k
    public final Object b(d4.n nVar, Object obj) {
        return this.f157196a.invoke(nVar, obj);
    }
}
