package ve;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lve/c;", "Landroidx/room/b0$b;", "Lue/b;", "clock", "<init>", "(Lue/b;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends androidx.room.b0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue.b f177549a;

    public c(ue.b bVar) {
        bVar.getClass();
        this.f177549a = bVar;
    }

    @Override // androidx.room.b0.b
    public final void a(vd.c cVar) {
        cVar.getClass();
        cVar.F();
        try {
            cVar.k3("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (this.f177549a.currentTimeMillis() - 86400000) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            cVar.t3();
        } finally {
            cVar.y3();
        }
    }
}
