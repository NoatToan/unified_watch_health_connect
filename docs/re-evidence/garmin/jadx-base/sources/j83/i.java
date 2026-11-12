package j83;

/* JADX INFO: loaded from: classes11.dex */
public class i extends m<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n83.b f97748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n83.b f97749c;

    public i(l lVar, n83.b bVar, n83.b bVar2) {
        this.f97748b = bVar;
        this.f97749c = bVar2;
    }

    @Override // j83.m
    public final void b(Throwable th3) {
        try {
            this.f97748b.call(th3);
        } finally {
            f();
        }
    }

    @Override // j83.m
    public final void c(Object obj) {
        try {
            this.f97749c.call(obj);
        } finally {
            f();
        }
    }
}
