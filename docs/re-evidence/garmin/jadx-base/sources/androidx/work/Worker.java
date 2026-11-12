package androidx.work;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ty1.f1;
import u1.p1;
import ue.j;
import ue.r;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "Landroidx/work/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Worker extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.d
    public final androidx.concurrent.futures.b.d a() {
        Executor executor = this.f11470b.f11429d;
        executor.getClass();
        p1 p1Var = new p1(this);
        androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
        aVar.f6080b = dVar;
        aVar.f6079a = h.class;
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            aVar.a(new r(atomicBoolean, 1), j.INSTANCE);
            executor.execute(new fh2.a(atomicBoolean, 29, aVar, p1Var));
            Unit unit = Unit.INSTANCE;
            if (unit == null) {
                return dVar;
            }
            aVar.f6079a = unit;
            return dVar;
        } catch (Exception e4) {
            dVar.a(e4);
            return dVar;
        }
    }

    @Override // androidx.work.d
    public final androidx.concurrent.futures.b.d b() {
        Executor executor = this.f11470b.f11429d;
        executor.getClass();
        f1 f1Var = new f1(this, 11);
        androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
        aVar.f6080b = dVar;
        aVar.f6079a = h.class;
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            aVar.a(new r(atomicBoolean, 1), j.INSTANCE);
            executor.execute(new fh2.a(atomicBoolean, 29, aVar, f1Var));
            Unit unit = Unit.INSTANCE;
            if (unit == null) {
                return dVar;
            }
            aVar.f6079a = unit;
            return dVar;
        } catch (Exception e4) {
            dVar.a(e4);
            return dVar;
        }
    }

    public abstract d.a c();
}
