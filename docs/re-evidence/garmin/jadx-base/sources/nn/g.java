package nn;

import java.util.List;
import p005kotlin.Metadata;
import r53.o2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnn/g;", "T", "Lr53/o2;", "origin", "<init>", "(Lr53/o2;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class g<T> implements o2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2<T> f126674a;

    /* JADX WARN: Multi-variable type inference failed */
    public g(o2<? extends T> o2Var) {
        o2Var.getClass();
        this.f126674a = o2Var;
    }

    @Override // r53.d2
    public List<T> a() {
        return this.f126674a.a();
    }

    @Override // r53.i
    public Object collect(r53.j<? super T> jVar, t13.d<?> dVar) {
        return this.f126674a.collect(jVar, dVar);
    }

    @Override // r53.o2, r53.z1
    public T getValue() {
        return this.f126674a.getValue();
    }
}
