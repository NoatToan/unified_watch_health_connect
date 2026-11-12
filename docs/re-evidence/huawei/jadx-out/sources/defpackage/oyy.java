package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.AchieveLevelTotalInfo;
import com.huawei.pluginachievement.manager.model.AchieveUserLevelInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class oyy {
    public static ozv a(double d) {
        ozv ozvVar = new ozv();
        ozvVar.b(d(d));
        ArrayList<ozy> arrayList = new ArrayList<>(20);
        for (int i = 1; i <= 20; i++) {
            arrayList.add(e(i));
        }
        ozvVar.c(arrayList);
        return ozvVar;
    }

    private static ozy e(int i) {
        ozy ozyVar = new ozy();
        ozyVar.b(paq.c(i));
        ozyVar.c(i);
        ozyVar.a(0.0d);
        return ozyVar;
    }

    public static ozv a(ozx ozxVar) {
        if (ozxVar != null) {
            osf osfVarA = ozxVar.a();
            AchieveUserLevelInfo achieveUserLevelInfo = osfVarA instanceof AchieveUserLevelInfo ? (AchieveUserLevelInfo) osfVarA : null;
            List<osf> listE = ozxVar.e();
            if (listE != null) {
                ArrayList arrayList = new ArrayList(listE.size());
                for (osf osfVar : listE) {
                    if (osfVar instanceof AchieveLevelTotalInfo) {
                        arrayList.add((AchieveLevelTotalInfo) osfVar);
                    }
                }
                if (achieveUserLevelInfo != null) {
                    int size = arrayList.size();
                    int iAcquireUserLevel = achieveUserLevelInfo.acquireUserLevel();
                    ozv ozvVar = new ozv();
                    ArrayList<ozy> arrayList2 = new ArrayList<>(20);
                    int iAcquireUserNumber = 1;
                    int i = 0;
                    int iAcquireUserNumber2 = 0;
                    while (i < size) {
                        AchieveLevelTotalInfo achieveLevelTotalInfo = (AchieveLevelTotalInfo) arrayList.get(i);
                        iAcquireUserNumber2 += achieveLevelTotalInfo.acquireUserNumber();
                        i++;
                        if (i == iAcquireUserLevel) {
                            iAcquireUserNumber = achieveLevelTotalInfo.acquireUserNumber();
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(b((AchieveLevelTotalInfo) it.next(), iAcquireUserNumber2));
                    }
                    ozvVar.b(b(achieveUserLevelInfo, iAcquireUserNumber, iAcquireUserNumber2));
                    ozvVar.c(arrayList2);
                    LogUtil.a("levelLocationRelationShipData", ozvVar.toString());
                    ozvVar.e(achieveUserLevelInfo);
                    return ozvVar;
                }
            }
        }
        return null;
    }

    private static paa d(double d) {
        paa paaVar = new paa();
        int iE = paq.e(d);
        paaVar.b(iE);
        paaVar.a(0.0d);
        int iC = paq.c(iE + 1);
        int iC2 = paq.c(iE);
        int iD = paq.d(d);
        paaVar.d(iC - iC2);
        paaVar.e(iD - iC2);
        return paaVar;
    }

    private static paa b(AchieveUserLevelInfo achieveUserLevelInfo, int i, int i2) {
        paa paaVar = new paa();
        int iAcquireUserExperience = achieveUserLevelInfo.acquireUserExperience();
        int iA = paq.a(iAcquireUserExperience);
        paaVar.b(iA);
        paaVar.a(paq.e(i, i2));
        int iC = paq.c(iA + 1);
        int iC2 = paq.c(iA);
        paaVar.d(iC - iC2);
        paaVar.e(iAcquireUserExperience - iC2);
        return paaVar;
    }

    public static ozy b(AchieveLevelTotalInfo achieveLevelTotalInfo, int i) {
        ozy ozyVar = new ozy();
        int iAcquireLevel = achieveLevelTotalInfo.acquireLevel();
        double dE = paq.e(achieveLevelTotalInfo.acquireUserNumber(), i);
        ozyVar.b(paq.c(iAcquireLevel));
        ozyVar.c(iAcquireLevel);
        ozyVar.a(dE);
        ozyVar.e(achieveLevelTotalInfo.acquireUserNumber());
        return ozyVar;
    }
}
