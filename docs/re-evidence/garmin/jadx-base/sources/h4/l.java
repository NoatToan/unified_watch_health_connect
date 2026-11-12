package h4;

import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh4/l;", "Lh5/x0;", "Lh4/m;", "Lp3/w;", "map", "<init>", "(Lp3/w;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends x0<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3.w f81570a;

    public l(p3.w wVar) {
        this.f81570a = wVar;
    }

    @Override // h5.x0
    public final r.c create() {
        return new m(this.f81570a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        return (obj instanceof l) && p005kotlin.jvm.internal.s.g(((l) obj).f81570a, this.f81570a);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f81570a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "<Injected CompositionLocalMap>";
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        m mVar = (m) cVar;
        p3.w wVar = this.f81570a;
        mVar.f81571a = wVar;
        h5.k.g(mVar).c(wVar);
    }
}
