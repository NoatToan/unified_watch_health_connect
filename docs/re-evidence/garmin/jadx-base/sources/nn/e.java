package nn;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnn/e;", "T", "Lr53/i;", "origin", "<init>", "(Lr53/i;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e<T> implements r53.i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<T> f126669a;

    /* JADX WARN: Multi-variable type inference failed */
    public e(r53.i<? extends T> iVar) {
        iVar.getClass();
        this.f126669a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super T> jVar, t13.d<? super Unit> dVar) {
        return this.f126669a.collect(jVar, dVar);
    }
}
