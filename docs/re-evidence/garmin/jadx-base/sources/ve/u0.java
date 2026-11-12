package ve;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class u0 extends p005kotlin.jvm.internal.q implements e23.t<Context, androidx.work.a, ef.b, WorkDatabase, af.m, p, List<? extends r>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f177615a = new u0();

    public u0() {
        super(6, androidx.work.impl.a.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // e23.t
    public final List<? extends r> invoke(Context context, androidx.work.a aVar, ef.b bVar, WorkDatabase workDatabase, af.m mVar, p pVar) {
        Context context2 = context;
        androidx.work.a aVar2 = aVar;
        ef.b bVar2 = bVar;
        WorkDatabase workDatabase2 = workDatabase;
        af.m mVar2 = mVar;
        p pVar2 = pVar;
        context2.getClass();
        aVar2.getClass();
        bVar2.getClass();
        workDatabase2.getClass();
        mVar2.getClass();
        pVar2.getClass();
        int i14 = t.f177600a;
        xe.e eVar = new xe.e(context2, workDatabase2, aVar2);
        df.o.a(context2, SystemJobService.class, true);
        ue.u.a().getClass();
        return p13.x.k(eVar, new we.c(context2, aVar2, mVar2, pVar2, new r0(pVar2, bVar2), bVar2));
    }
}
