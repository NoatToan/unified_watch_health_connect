package ze;

import p005kotlin.Metadata;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lze/b;", "T", "Lze/e;", "Laf/g;", "tracker", "<init>", "(Laf/g;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b<T> implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af.g<T> f204252a;

    public b(af.g<T> gVar) {
        gVar.getClass();
        this.f204252a = gVar;
    }

    @Override // ze.e
    public final r53.b b(ue.f fVar) {
        fVar.getClass();
        return s.f(new a(this, null));
    }

    public abstract int c();

    public boolean d(T t7) {
        return false;
    }
}
