package a3;

import kotlin.m2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La3/p0;", "Lh5/x0;", "La3/r0;", "<init>", "()V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p0 extends h5.x0<r0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f777a = new p0();

    private p0() {
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new r0();
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // h5.x0
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "minimumInteractiveComponentSize";
        m2Var.f91343c.c("Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller", "README");
    }

    @Override // h5.x0
    public final /* bridge */ /* synthetic */ void update(h4.r.c cVar) {
    }
}
