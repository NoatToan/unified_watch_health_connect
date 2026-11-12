package r53;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lr53/a2;", "T", "Lr53/d2;", "Lr53/c;", "Ls53/t;", "flow", "Lo53/l1;", "job", "<init>", "(Lr53/d2;Lo53/l1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a2<T> implements d2<T>, c<T>, s53.t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d2<T> f150526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.l1 f150527b;

    /* JADX WARN: Multi-variable type inference failed */
    public a2(d2<? extends T> d2Var, o53.l1 l1Var) {
        this.f150526a = d2Var;
        this.f150527b = l1Var;
    }

    @Override // r53.d2
    public final List<T> a() {
        return this.f150526a.a();
    }

    @Override // r53.i
    public final Object collect(j<? super T> jVar, t13.d<?> dVar) {
        return this.f150526a.collect(jVar, dVar);
    }

    @Override // s53.t
    public final i<T> e(t13.g gVar, int i14, q53.a aVar) {
        return g2.d(this, gVar, i14, aVar);
    }
}
