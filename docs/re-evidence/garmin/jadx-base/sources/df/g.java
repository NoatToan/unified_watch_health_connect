package df;

import androidx.work.impl.WorkDatabase;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.d0;
import ue.j0;
import ve.c0;

/* JADX INFO: loaded from: classes7.dex */
public final class g {
    public static final void a(WorkDatabase workDatabase, androidx.work.a aVar, c0 c0Var) {
        int i14;
        workDatabase.getClass();
        aVar.getClass();
        ArrayList arrayListM = p13.x.m(c0Var);
        int i15 = 0;
        while (!arrayListM.isEmpty()) {
            c0 c0Var2 = (c0) d0.F(arrayListM);
            List<? extends j0> list = c0Var2.f177554d;
            list.getClass();
            if (list.isEmpty()) {
                i14 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i14 = 0;
                while (it.hasNext()) {
                    if (!((j0) it.next()).f170094b.f26950j.f170051i.isEmpty() && (i14 = i14 + 1) < 0) {
                        p13.x.p();
                        throw null;
                    }
                }
            }
            i15 += i14;
            List<c0> list2 = c0Var2.f177557g;
            if (list2 != null) {
                arrayListM.addAll(list2);
            }
        }
        if (i15 == 0) {
            return;
        }
        int iS = workDatabase.j().s();
        int i16 = aVar.f11445k;
        if (iS + i15 <= i16) {
            return;
        }
        vb.h.s(am.j.q(e5.j(i16, iS, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: "), i15, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }

    public static final cf.t b(List<? extends ve.r> list, cf.t tVar) {
        list.getClass();
        boolean zF = tVar.f26945e.f("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean zF2 = tVar.f26945e.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean zF3 = tVar.f26945e.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (zF || !zF2 || !zF3) {
            return tVar;
        }
        String str = tVar.f26943c;
        androidx.work.c.a aVar = new androidx.work.c.a();
        androidx.work.c cVar = tVar.f26945e;
        cVar.getClass();
        aVar.c(cVar.f11466a);
        aVar.f11467a.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        return cf.t.b(tVar, null, null, aVar.a(), 0, 0L, 0, 0, 0L, 0, 33554411);
    }
}
