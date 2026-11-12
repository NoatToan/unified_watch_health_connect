package df;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class x implements ue.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f59435d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ef.b f59436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bf.a f59437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cf.u f59438c;

    static {
        ue.u.b("WMFgUpdater");
    }

    @SuppressLint({"LambdaLast"})
    public x(WorkDatabase workDatabase, bf.a aVar, ef.b bVar) {
        this.f59437b = aVar;
        this.f59436a = bVar;
        this.f59438c = workDatabase.j();
    }

    @Override // ue.n
    public final androidx.concurrent.futures.b.d a(Context context, UUID uuid, ue.m mVar) {
        r rVarD = this.f59436a.d();
        af0.e eVar = new af0.e(17, context, this, uuid, mVar);
        rVarD.getClass();
        androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
        aVar.f6080b = dVar;
        aVar.f6079a = v.h.class;
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            aVar.a(new ue.r(atomicBoolean, 0), ue.j.INSTANCE);
            rVarD.execute(new fh2.a(atomicBoolean, 28, aVar, eVar));
            aVar.f6079a = "setForegroundAsync";
            return dVar;
        } catch (Exception e4) {
            dVar.a(e4);
            return dVar;
        }
    }
}
