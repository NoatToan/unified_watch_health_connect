package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class bjc {
    public String a(List<biw> list) {
        List<biw> listD = d(b(c(e(list))));
        String strD = "";
        if (listD.size() > 0) {
            int iH = 0;
            for (biw biwVar : listD) {
                if (biwVar.h() >= iH) {
                    iH = biwVar.h();
                    strD = biwVar.d();
                }
            }
        }
        return strD;
    }

    private List<biw> e(List<biw> list) {
        ArrayList arrayList = new ArrayList();
        for (biw biwVar : list) {
            if (biwVar.c() > -1) {
                arrayList.add(biwVar);
            }
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }

    private List<biw> c(List<biw> list) {
        ArrayList arrayList = new ArrayList();
        for (biw biwVar : list) {
            if (biwVar.a() == 1) {
                arrayList.add(biwVar);
            }
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }

    private List<biw> b(List<biw> list) {
        ArrayList arrayList = new ArrayList();
        for (biw biwVar : list) {
            if (biwVar.b() == 0) {
                arrayList.add(biwVar);
            }
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }

    private List<biw> d(List<biw> list) {
        ArrayList arrayList = new ArrayList();
        int iE = 0;
        for (biw biwVar : list) {
            if (biwVar.e() > iE) {
                arrayList.clear();
                iE = biwVar.e();
            } else if (biwVar.e() != iE) {
                bjf.e.c("OptimizationCenter", "condition Low level");
            }
            arrayList.add(biwVar);
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }
}
