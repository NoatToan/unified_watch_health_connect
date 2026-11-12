package ve;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lve/o;", "Lkd/a;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o extends kd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f177577a = new o();

    private o() {
        super(8, 9);
    }

    @Override // kd.a
    public final void migrate(vd.c cVar) {
        cVar.getClass();
        cVar.k3("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
