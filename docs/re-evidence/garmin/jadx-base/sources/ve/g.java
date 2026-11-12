package ve;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lve/g;", "Lkd/a;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends kd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f177567a = new g();

    private g() {
        super(12, 13);
    }

    @Override // kd.a
    public final void migrate(vd.c cVar) {
        cVar.getClass();
        cVar.k3("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        cVar.k3("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
