package defpackage;

import com.huawei.ui.device.declaration.xmlparser.DeclarationConstants;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class rbf {
    public rbg e(rbq rbqVar) {
        if (rbqVar == null) {
            LogUtil.d("DeclarationConverter", "declaration is null");
            return new rbg();
        }
        rbg rbgVar = new rbg();
        rbo rboVarC = rbqVar.c();
        if (rboVarC == null) {
            LogUtil.d("DeclarationConverter", "content is null");
        } else {
            rbgVar.d(rboVarC.c());
        }
        rbr rbrVarO = rbqVar.o();
        if (rbrVarO == null) {
            LogUtil.d("DeclarationConverter", "title is null");
        } else {
            DeclarationConstants.Position positionD = rbrVarO.d();
            rbgVar.b(DeclarationConstants.Position.END.compareTo(positionD) == 0);
            rbgVar.e(DeclarationConstants.Position.START.compareTo(positionD) == 0);
            rbgVar.a(rbrVarO.e());
            rbgVar.h(rbrVarO.b());
        }
        rbgVar.c(rbqVar.f());
        rbgVar.b(rbqVar.a());
        rbgVar.a(1);
        rbgVar.j(rbqVar.e());
        rbgVar.d(rbqVar.d());
        rbgVar.c(rbqVar.i());
        rbgVar.e(rbqVar.b());
        rbgVar.a(rbqVar.j());
        return rbgVar;
    }

    public List<rbg> e(List<rbq> list) {
        if (list == null || list.size() < 1) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (rbq rbqVar : list) {
            if (rbqVar != null) {
                arrayList.add(e(rbqVar));
            }
        }
        qug.d(arrayList);
        return arrayList;
    }
}
