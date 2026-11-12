package ii;

import d53.n;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lii/a;", "Lb03/d;", "Lhi/a;", "Ld03/d;", "driver", "<init>", "(Ld03/d;)V", "a", "apollo-normalized-cache-sqlite_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a extends b03.d implements hi.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f93520c;

    /* JADX INFO: renamed from: ii.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lii/a$a;", "Ld03/d$a;", "<init>", "()V", "apollo-normalized-cache-sqlite_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class C1789a implements d03.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1789a f93521a = new C1789a();

        private C1789a() {
        }

        @Override // d03.d.a
        public final void a(c03.d dVar) {
            dVar.Z2(null, n.d("\n          |CREATE TABLE records (\n          |  _id INTEGER PRIMARY KEY AUTOINCREMENT,\n          |  key TEXT NOT NULL,\n          |  record TEXT NOT NULL\n          |)\n          "), null);
            dVar.Z2(null, "CREATE INDEX idx_records_key ON records(key)", null);
        }

        @Override // d03.d.a
        public final void b(c03.d dVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d03.d dVar) {
        super(dVar);
        dVar.getClass();
        this.f93520c = new b(this, dVar);
    }
}
