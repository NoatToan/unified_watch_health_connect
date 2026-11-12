package ve;

import androidx.work.WorkerParameters;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lve/r0;", "Lve/q0;", "Lve/p;", "processor", "Lef/b;", "workTaskExecutor", "<init>", "(Lve/p;Lef/b;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f177594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ef.b f177595b;

    public r0(p pVar, ef.b bVar) {
        pVar.getClass();
        bVar.getClass();
        this.f177594a = pVar;
        this.f177595b = bVar;
    }

    @Override // ve.q0
    public final void b(u uVar, WorkerParameters.a aVar) {
        uVar.getClass();
        this.f177595b.b(new uj2.b(this, 7, uVar, aVar));
    }

    @Override // ve.q0
    public final void c(u uVar, int i14) {
        uVar.getClass();
        this.f177595b.b(new df.s(this.f177594a, uVar, false, i14));
    }
}
