package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import cf.d0;
import cf.j;
import cf.o;
import cf.t;
import cf.u;
import ch.qos.logback.core.CoreConstants;
import ff.a;
import java.util.List;
import p005kotlin.Metadata;
import ve.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final d.a c() {
        t0 t0VarG = t0.g(this.f11469a);
        t0VarG.getClass();
        WorkDatabase workDatabase = t0VarG.f177606d;
        workDatabase.getClass();
        u uVarJ = workDatabase.j();
        o oVarH = workDatabase.h();
        d0 d0VarK = workDatabase.k();
        j jVarG = workDatabase.g();
        List<t> listV = uVarJ.v(t0VarG.f177605c.f11438d.currentTimeMillis() - 86400000);
        List<t> listM = uVarJ.m();
        List listY = uVarJ.y();
        if (!listV.isEmpty()) {
            ue.u uVarA = ue.u.a();
            int i14 = a.f71029a;
            uVarA.getClass();
            ue.u uVarA2 = ue.u.a();
            a.a(oVarH, d0VarK, jVarG, listV);
            uVarA2.getClass();
        }
        if (!listM.isEmpty()) {
            ue.u uVarA3 = ue.u.a();
            int i15 = a.f71029a;
            uVarA3.getClass();
            ue.u uVarA4 = ue.u.a();
            a.a(oVarH, d0VarK, jVarG, listM);
            uVarA4.getClass();
        }
        if (!listY.isEmpty()) {
            ue.u uVarA5 = ue.u.a();
            int i16 = a.f71029a;
            uVarA5.getClass();
            ue.u uVarA6 = ue.u.a();
            a.a(oVarH, d0VarK, jVarG, listY);
            uVarA6.getClass();
        }
        return new d.a.c();
    }
}
