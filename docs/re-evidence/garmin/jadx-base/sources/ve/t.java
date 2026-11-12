package ve;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f177600a = 0;

    static {
        ue.u.b("Schedulers");
    }

    private t() {
    }

    public static void a(cf.u uVar, ue.b bVar, List<cf.t> list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = bVar.currentTimeMillis();
            Iterator<cf.t> it = list.iterator();
            while (it.hasNext()) {
                uVar.u(jCurrentTimeMillis, it.next().f26941a);
            }
        }
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List<r> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        cf.u uVarJ = workDatabase.j();
        workDatabase.beginTransaction();
        try {
            List<cf.t> listQ = uVarJ.q();
            a(uVarJ, aVar.f11438d, listQ);
            List<cf.t> listB = uVarJ.B(aVar.f11446l);
            a(uVarJ, aVar.f11438d, listB);
            listB.addAll(listQ);
            List listY = uVarJ.y();
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (listB.size() > 0) {
                cf.t[] tVarArr = (cf.t[]) listB.toArray(new cf.t[listB.size()]);
                for (r rVar : list) {
                    if (rVar.a()) {
                        rVar.e(tVarArr);
                    }
                }
            }
            if (listY.size() > 0) {
                cf.t[] tVarArr2 = (cf.t[]) listY.toArray(new cf.t[listY.size()]);
                for (r rVar2 : list) {
                    if (!rVar2.a()) {
                        rVar2.e(tVarArr2);
                    }
                }
            }
        } catch (Throwable th3) {
            workDatabase.endTransaction();
            throw th3;
        }
    }
}
