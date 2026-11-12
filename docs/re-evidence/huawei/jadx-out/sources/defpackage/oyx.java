package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class oyx {
    public static ArrayList<ozs> b(List<osg> list) {
        if (list == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaInitLayoutManager", "kakaTaskInfos is null");
            return new ArrayList<>();
        }
        ArrayList<ozs> arrayList = new ArrayList<>(8);
        Collections.sort(list);
        a(list, arrayList);
        return arrayList;
    }

    private static ozu e(osg osgVar) {
        ozu ozuVar = new ozu();
        if (osgVar == null) {
            return ozuVar;
        }
        ozuVar.d(osgVar.e());
        ozuVar.c(osgVar.h());
        ozuVar.c(1);
        ozuVar.b(osgVar.i());
        ozuVar.j(a(osgVar));
        ozuVar.d(osgVar.p());
        ozuVar.b(osgVar.m());
        ozuVar.a(osgVar.c());
        ozuVar.i(osgVar.ai());
        ozuVar.a(osgVar.v());
        ozuVar.e(osgVar.ad());
        ozuVar.f(osgVar.ab());
        ozuVar.g(osgVar.aa());
        ozuVar.e(osgVar.d());
        ozuVar.h(osgVar.ac());
        ozuVar.f(osgVar.ah());
        return ozuVar;
    }

    private static String a(osg osgVar) {
        long jA = pap.a(osa.e(BaseApplication.getContext(), "kakaSyncDate"));
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jA2 = osgVar.a();
        if (osgVar.s() == 1 && pap.e(jA, jCurrentTimeMillis) && pap.e(jA2, jCurrentTimeMillis)) {
            LogUtil.a("PLGACHIEVE_AchieveKakaInitLayoutManager", "getTaskRecord is ", osgVar.h(), " lastSyncDate ", Long.valueOf(jA), " taskLastTimestamp ", Long.valueOf(jA2), " currentTime ", Long.valueOf(jCurrentTimeMillis));
            return String.valueOf(0);
        }
        return osgVar.t();
    }

    private static boolean e(int i, osg osgVar) {
        if (i == 0) {
            return pap.e(osgVar.ai());
        }
        if (i != 1) {
            return false;
        }
        return !pap.e(osgVar.ai());
    }

    private static ArrayList<ozs> a(List<osg> list, int i) {
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        ArrayList arrayList3 = new ArrayList(2);
        boolean z = true;
        for (osg osgVar : list) {
            if (osgVar == null || !e(i, osgVar) || !pap.l(String.valueOf(osgVar.ai()))) {
                LogUtil.j("PLGACHIEVE_AchieveKakaInitLayoutManager", "getDataListByType kakaTaskInfo is null or invalid");
            } else {
                if (pap.d(osgVar.ai()) && osgVar.g() > 0) {
                    LogUtil.a("PLGACHIEVE_AchieveKakaInitLayoutManager", "acquireTaskFrequency()=", Integer.valueOf(osgVar.g()));
                    osgVar.h(String.valueOf(1));
                }
                ozs ozsVar = new ozs();
                ozsVar.c(1);
                ozsVar.b(osgVar.h());
                ozu ozuVarE = e(osgVar);
                ozuVarE.i(String.valueOf(i));
                ozsVar.a(ozuVarE);
                int iA = qrs.a(ozuVarE.j());
                if (i == 0) {
                    if (!b(iA, osgVar)) {
                        c(iA, arrayList, arrayList3, ozsVar);
                        z = false;
                    }
                } else if (iA > 1) {
                    arrayList2.add(ozsVar);
                } else if (iA == 1) {
                    arrayList.add(ozsVar);
                } else {
                    arrayList3.add(ozsVar);
                }
            }
        }
        ArrayList<ozs> arrayList4 = new ArrayList<>(list.size());
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList3);
        arrayList4.addAll(arrayList2);
        if (i == 0 && z) {
            arrayList4.clear();
        }
        return arrayList4;
    }

    private static void c(int i, List<ozs> list, List<ozs> list2, ozs ozsVar) {
        if (i == 1) {
            list.add(ozsVar);
        } else {
            list2.add(ozsVar);
        }
    }

    private static boolean b(int i, osg osgVar) {
        if (i > 1) {
            return true;
        }
        if (osgVar.ai() == 10005) {
            return !pap.e(osgVar);
        }
        return false;
    }

    private static void a(ArrayList<String> arrayList) {
        arrayList.add(d(R.string.IDS_plugin_achievement_kaka_newbie));
        arrayList.add(d(R.string.IDS_plugin_achievement_kaka_daily));
    }

    private static String d(int i) {
        return BaseApplication.getContext().getResources().getString(i);
    }

    private static void a(List<osg> list, ArrayList<ozs> arrayList) {
        LogUtil.a("PLGACHIEVE_AchieveKakaInitLayoutManager", "initLayoutData kakaTaskInfos size = ", Integer.valueOf(list.size()));
        ArrayList arrayList2 = new ArrayList(8);
        a((ArrayList<String>) arrayList2);
        for (int i = 0; i < arrayList2.size(); i++) {
            ArrayList<ozs> arrayListA = a(list, i);
            int size = arrayListA.size();
            if (size != 0) {
                arrayList.add(d((String) arrayList2.get(i)));
                for (int i2 = 0; i2 < size; i2++) {
                    ozs ozsVar = arrayListA.get(i2);
                    if (i2 == size - 1) {
                        ozsVar.c(true);
                    }
                    if (i2 == 0) {
                        ozsVar.e(true);
                    }
                    arrayList.add(ozsVar);
                }
            }
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaInitLayoutManager", "initLayoutData relationShipDataList size = ", Integer.valueOf(arrayList.size()));
    }

    private static ozs d(String str) {
        ozs ozsVar = new ozs();
        ozsVar.c(0);
        ozsVar.a(str);
        ozsVar.b("");
        ozsVar.a((ozu) null);
        return ozsVar;
    }

    public static ozu c(osg osgVar) {
        return e(osgVar);
    }
}
