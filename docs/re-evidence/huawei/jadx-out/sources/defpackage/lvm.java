package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lvm {
    public static void c(edl edlVar, edn ednVar, HashMap<String, Integer> map, Map<Integer, ArrayList<String>> map2) {
        LogUtil.a("PluginDeviceInfoManager", "enter loadPluginDeviceInfo");
        b(edlVar, ednVar);
        e(edlVar, ednVar);
        edz edzVarI = edlVar.i();
        if (edzVarI == null) {
            return;
        }
        e(edzVarI, ednVar);
        a(edlVar, edzVarI, map, map2);
    }

    private static void b(edl edlVar, edn ednVar) {
        if (edlVar.c() != null) {
            ednVar.i(edlVar.c());
        }
        if (edlVar.i() == null) {
            return;
        }
        String strAh = edlVar.i().ah();
        if ("".equals(strAh)) {
            return;
        }
        ednVar.a(strAh);
        LogUtil.a("PluginDeviceInfoManager", " deviceName : ", ednVar.i());
    }

    private static void e(edl edlVar, edn ednVar) {
        if (edlVar.i() == null) {
            return;
        }
        String strH = edlVar.i().h();
        if (!"".equals(strH)) {
            ednVar.c(strH);
            LogUtil.a("PluginDeviceInfoManager", " briefDescription : ", ednVar.i());
        }
        ArrayList<String> arrayListAc = edlVar.i().ac();
        if (arrayListAc.size() > 0) {
            ednVar.e(arrayListAc);
            LogUtil.a("PluginDeviceInfoManager", " deviceIntro : ", ednVar.j().toString());
        }
    }

    private static void e(edz edzVar, edn ednVar) {
        d(edzVar, ednVar);
        a(edzVar, ednVar);
        c(edzVar, ednVar);
        b(edzVar, ednVar);
    }

    private static void b(edz edzVar, edn ednVar) {
        ednVar.b(edzVar.cb());
        ednVar.a(edzVar.bz());
        ednVar.d(edzVar.by());
    }

    private static void d(edz edzVar, edn ednVar) {
        LogUtil.a("PluginDeviceInfoManager", "enter loadWearDeviceInfoOne");
        String strJ = edzVar.j();
        if (!TextUtils.isEmpty(strJ)) {
            try {
                ednVar.j(Integer.parseInt(strJ));
                LogUtil.a("PluginDeviceInfoManager", " manu type : ", Integer.valueOf(ednVar.p()));
            } catch (NumberFormatException e) {
                LogUtil.e("PluginDeviceInfoManager", e.getMessage());
            }
        }
        String strBe = edzVar.be();
        if (!"".equals(strBe)) {
            ednVar.h(strBe);
            LogUtil.a("PluginDeviceInfoManager", " pairGuideList : ", ednVar.v());
        }
        int iAt = edzVar.at();
        if (iAt != -1) {
            ednVar.g(iAt);
            LogUtil.a("PluginDeviceInfoManager", " hiType : ", Integer.valueOf(ednVar.k()));
        }
        int iAg = edzVar.ag();
        if (iAg != -1) {
            ednVar.a(iAg);
            LogUtil.a("PluginDeviceInfoManager", " deviceType : ", Integer.valueOf(ednVar.l()));
        }
        int i = edzVar.i();
        if (i != -1) {
            ednVar.c(i);
            LogUtil.a("PluginDeviceInfoManager", " bluetoothType : ", Integer.valueOf(ednVar.b()));
        }
        int iAf = edzVar.af();
        if (iAf != -1 && iAf != 1) {
            ednVar.b((Boolean) false);
            LogUtil.a("PluginDeviceInfoManager", "isBand : ", Boolean.valueOf(ednVar.r()));
        }
        int iAi = edzVar.ai();
        if (iAi != -1) {
            ednVar.b(iAi);
            LogUtil.a("PluginDeviceInfoManager", " deviceShapes : ", Integer.valueOf(ednVar.m()));
        }
    }

    private static void a(edz edzVar, edn ednVar) {
        int iAf = edzVar.af();
        if (iAf != -1) {
            ednVar.e(iAf);
            LogUtil.a("PluginDeviceInfoManager", " deviceType : ", Integer.valueOf(ednVar.l()));
        }
        Map<String, String> mapAv = edzVar.av();
        if (mapAv != null) {
            ednVar.a(mapAv);
            LogUtil.a("PluginDeviceInfoManager", " helpUrl : ", ednVar.o());
        }
        Map<String, String> mapBa = edzVar.ba();
        if (mapBa != null) {
            ednVar.b(mapBa);
            LogUtil.a("PluginDeviceInfoManager", " honorHelpUrl : ", ednVar.q());
        }
        Map<String, String> mapBr = edzVar.br();
        if (mapBr != null) {
            ednVar.c(mapBr);
            LogUtil.a("PluginDeviceInfoManager", " upgradeCycle : ", ednVar.x());
        }
        String strK = edzVar.k();
        if (strK != null) {
            ednVar.e(strK);
            LogUtil.a("PluginDeviceInfoManager", " clubUrl : ", ednVar.g());
        }
        String strBc = edzVar.bc();
        if (strBc != null) {
            ednVar.d(strBc);
            LogUtil.a("PluginDeviceInfoManager", " honorClubUrl : ", ednVar.t());
        }
        String strBu = edzVar.bu();
        if (!"".equals(strBu)) {
            ednVar.g(strBu);
            LogUtil.a("PluginDeviceInfoManager", " wearType : ", ednVar.ac());
        }
        Map<String, Integer> mapA = edzVar.a();
        if (mapA != null) {
            ednVar.d(mapA);
            LogUtil.a("PluginDeviceInfoManager", " appVersion : ", ednVar.a());
        }
    }

    private static void c(edz edzVar, edn ednVar) {
        if (edzVar.bw()) {
            ednVar.c(true);
            LogUtil.a("PluginDeviceInfoManager", " brAndBle : ", Boolean.valueOf(ednVar.ad()));
        }
        if (edzVar.cg()) {
            ednVar.i(true);
            LogUtil.a("PluginDeviceInfoManager", " supportMidWare : ", Boolean.valueOf(ednVar.ag()));
        }
        if (edzVar.bx()) {
            ednVar.e(true);
            LogUtil.a("PluginDeviceInfoManager", " isSupportEarMuffGuide is true");
        }
        String strBh = edzVar.bh();
        if (!"".equals(strBh)) {
            ednVar.f(strBh);
            LogUtil.a("PluginDeviceInfoManager", " npsName : ", ednVar.s());
        }
        String strD = edzVar.d();
        if (!"".equals(strD)) {
            ednVar.b(strD);
            LogUtil.a("PluginDeviceInfoManager", " biName : ", ednVar.d());
        }
        int iBj = edzVar.bj();
        if (iBj != -1) {
            ednVar.h(iBj);
            LogUtil.a("PluginDeviceInfoManager", " isSupportWlanAnto : ", Integer.valueOf(ednVar.w()));
        }
    }

    private static void a(edl edlVar, edz edzVar, HashMap<String, Integer> map, Map<Integer, ArrayList<String>> map2) {
        int iAg;
        if (map.containsKey(edlVar.c())) {
            iAg = map.get(edlVar.c()).intValue();
        } else {
            iAg = edlVar.i().ag();
        }
        if (-1 != iAg) {
            ArrayList<String> arrayListG = edzVar.g();
            if (arrayListG == null || arrayListG.size() <= 0) {
                LogUtil.j("PluginDeviceInfoManager", " bluetooth Names is null or size is 0");
                return;
            }
            ArrayList<String> arrayList = new ArrayList<>(16);
            Iterator<String> it = arrayListG.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
            }
            if (map2 != null) {
                map2.put(Integer.valueOf(iAg), arrayList);
                LogUtil.a("PluginDeviceInfoManager", " bluetooth Names : ", map2.get(Integer.valueOf(iAg)));
            }
        }
    }
}
