package df;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import cf.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import ue.h0;
import ue.j0;
import ve.c0;
import ve.t0;

/* JADX INFO: loaded from: classes7.dex */
public class f {
    static {
        ue.u.b("EnqueueRunnable");
    }

    private f() {
    }

    public static void a(c0 c0Var) {
        t0 t0Var = c0Var.f177551a;
        if (c0.b(c0Var, new HashSet())) {
            kg.f.o("WorkContinuation has cycles (", c0Var, ")");
            return;
        }
        WorkDatabase workDatabase = t0Var.f177606d;
        androidx.work.a aVar = t0Var.f177605c;
        workDatabase.beginTransaction();
        try {
            g.a(workDatabase, aVar, c0Var);
            boolean zB = b(c0Var);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (zB) {
                ve.t.b(aVar, t0Var.f177606d, t0Var.f177608f);
            }
        } catch (Throwable th3) {
            workDatabase.endTransaction();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:94:0x018f  */
    public static boolean b(c0 c0Var) {
        boolean zB;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        List<c0> list = c0Var.f177557g;
        if (list != null) {
            zB = false;
            for (c0 c0Var2 : list) {
                if (c0Var2.f177558h) {
                    ue.u uVarA = ue.u.a();
                    TextUtils.join(", ", c0Var2.f177555e);
                    uVarA.getClass();
                } else {
                    zB |= b(c0Var2);
                }
            }
        } else {
            zB = false;
        }
        HashSet hashSetC = c0.c(c0Var);
        t0 t0Var = c0Var.f177551a;
        List<? extends j0> list2 = c0Var.f177554d;
        String[] strArr = (String[]) hashSetC.toArray(new String[0]);
        String str = c0Var.f177552b;
        ue.l lVar = c0Var.f177553c;
        androidx.work.a aVar = t0Var.f177605c;
        WorkDatabase workDatabase = t0Var.f177606d;
        long jCurrentTimeMillis = aVar.f11438d.currentTimeMillis();
        boolean z25 = strArr != null && strArr.length > 0;
        if (z25) {
            int length = strArr.length;
            int i14 = 0;
            z15 = false;
            z16 = false;
            z14 = true;
            while (true) {
                if (i14 < length) {
                    cf.t tVarI = workDatabase.j().i(strArr[i14]);
                    if (tVarI == null) {
                        ue.u.a().getClass();
                    } else {
                        h0.c cVar = tVarI.f26942b;
                        z14 &= cVar == h0.c.SUCCEEDED;
                        if (cVar == h0.c.FAILED) {
                            z16 = true;
                        } else if (cVar == h0.c.CANCELLED) {
                            z15 = true;
                        }
                        i14++;
                    }
                }
                z18 = zB;
                z24 = true;
                z19 = false;
                c0Var.f177558h = z24;
                return z18 | z19;
            }
        }
        z14 = true;
        z15 = false;
        z16 = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z25) {
            z17 = zIsEmpty;
            z18 = zB;
            z19 = false;
        } else {
            List<cf.t.b> listZ = workDatabase.j().z(str);
            if (listZ.isEmpty()) {
                z17 = zIsEmpty;
                z18 = zB;
            } else if (lVar == ue.l.APPEND || lVar == ue.l.APPEND_OR_REPLACE) {
                cf.b bVarE = workDatabase.e();
                ArrayList arrayList = new ArrayList();
                for (cf.t.b bVar : listZ) {
                    boolean z26 = zIsEmpty;
                    if (!bVarE.d(bVar.f26966a)) {
                        h0.c cVar2 = bVar.f26967b;
                        boolean z27 = (cVar2 == h0.c.SUCCEEDED) & z14;
                        if (cVar2 == h0.c.FAILED) {
                            z16 = true;
                        } else if (cVar2 == h0.c.CANCELLED) {
                            z15 = true;
                        }
                        arrayList.add(bVar.f26966a);
                        z14 = z27;
                    }
                    zIsEmpty = z26;
                    zB = zB;
                }
                z17 = zIsEmpty;
                z18 = zB;
                List list3 = arrayList;
                list3 = arrayList;
                if (lVar == ue.l.APPEND_OR_REPLACE && (z15 || z16)) {
                    cf.u uVarJ = workDatabase.j();
                    Iterator<cf.t.b> it = uVarJ.z(str).iterator();
                    while (it.hasNext()) {
                        uVarJ.a(it.next().f26966a);
                    }
                    z15 = false;
                    z16 = false;
                    list3 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) list3.toArray(strArr);
                z25 = strArr.length > 0;
            } else {
                if (lVar == ue.l.KEEP) {
                    Iterator<cf.t.b> it3 = listZ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            h0.c cVar3 = it3.next().f26967b;
                            if (cVar3 == h0.c.ENQUEUED || cVar3 == h0.c.RUNNING) {
                                z18 = zB;
                                z24 = true;
                                z19 = false;
                                c0Var.f177558h = z24;
                                return z18 | z19;
                            }
                        }
                    }
                }
                workDatabase.getClass();
                workDatabase.runInTransaction(new b(workDatabase, str, t0Var, 0));
                cf.u uVarJ2 = workDatabase.j();
                Iterator<cf.t.b> it4 = listZ.iterator();
                while (it4.hasNext()) {
                    uVarJ2.a(it4.next().f26966a);
                }
                z17 = zIsEmpty;
                z18 = zB;
                z19 = true;
            }
            z19 = false;
        }
        for (j0 j0Var : list2) {
            cf.t tVar = j0Var.f170094b;
            UUID uuid = j0Var.f170093a;
            if (!z25 || z14) {
                tVar.f26954n = jCurrentTimeMillis;
            } else if (z16) {
                tVar.f26942b = h0.c.FAILED;
            } else if (z15) {
                tVar.f26942b = h0.c.CANCELLED;
            } else {
                tVar.f26942b = h0.c.BLOCKED;
            }
            if (tVar.f26942b == h0.c.ENQUEUED) {
                z19 = true;
            }
            workDatabase.j().f(g.b(t0Var.f177608f, tVar));
            if (z25) {
                int length2 = strArr.length;
                int i15 = 0;
                while (i15 < length2) {
                    String str2 = strArr[i15];
                    boolean z28 = z19;
                    String string = uuid.toString();
                    string.getClass();
                    workDatabase.e().c(new cf.a(string, str2));
                    i15++;
                    strArr = strArr;
                    z19 = z28;
                }
            }
            String[] strArr2 = strArr;
            boolean z29 = z19;
            d0 d0VarK = workDatabase.k();
            String string2 = uuid.toString();
            string2.getClass();
            d0VarK.b(string2, j0Var.f170095c);
            if (!z17) {
                cf.o oVarH = workDatabase.h();
                String string3 = uuid.toString();
                string3.getClass();
                oVarH.b(new cf.n(str, string3));
            }
            strArr = strArr2;
            z19 = z29;
        }
        z24 = true;
        c0Var.f177558h = z24;
        return z18 | z19;
    }
}
