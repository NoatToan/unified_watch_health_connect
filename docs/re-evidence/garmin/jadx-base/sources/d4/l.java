package d4;

import e23.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"Ld4/l;", "Ld4/k;", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements k<Object, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p<n, Object, Object> f57453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<Object, Object> f57454b;

    /* JADX WARN: Multi-variable type inference failed */
    public l(p<? super n, Object, Object> pVar, e23.l<Object, Object> lVar) {
        this.f57453a = pVar;
        this.f57454b = lVar;
    }

    @Override // d4.k
    public final Object a(Object obj) {
        return this.f57454b.invoke(obj);
    }

    @Override // d4.k
    public final Object b(n nVar, Object obj) {
        return this.f57453a.invoke(nVar, obj);
    }
}
