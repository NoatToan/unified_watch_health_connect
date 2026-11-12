package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li3/d8;", "Lh5/x0;", "Li3/e8;", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d8 extends h5.x0<e8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d8 f87832a = new d8();

    private d8() {
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new e8();
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
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "minimumInteractiveComponentSize";
        m2Var.f91343c.c("Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller", "README");
    }

    @Override // h5.x0
    public final /* bridge */ /* synthetic */ void update(h4.r.c cVar) {
    }
}
