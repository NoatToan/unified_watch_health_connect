package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mpy {
    public static int d(ees eesVar) {
        if (eesVar == null) {
            return 0;
        }
        List<ees> listB = eesVar.b();
        int iV = 0;
        for (int i = 0; i < listB.size(); i++) {
            List<eew> listE = listB.get(i).e();
            for (int i2 = 0; i2 < listE.size(); i2++) {
                String strB = listE.get(i2).b();
                if (CommonUtil.v(listE.get(i2).e()) == 2) {
                    iV = CommonUtil.v(strB);
                } else {
                    LogUtil.j("BasicUnTlvStatus", "unTlvGetStatusFrameCount is default");
                }
            }
        }
        return iV;
    }

    public static mqk a(mqk mqkVar, String str) {
        if (str == null) {
            LogUtil.j("BasicUnTlvStatus", "parseStatusDuration value is null");
            return mqkVar;
        }
        if (str.length() != 12) {
            LogUtil.j("BasicUnTlvStatus", "parseStatusDuration invalid duration", str);
            return mqkVar;
        }
        String strSubstring = str.substring(0, 8);
        String strSubstring2 = str.substring(8, 12);
        try {
            long j = Integer.parseInt(strSubstring, 16);
            int i = Integer.parseInt(strSubstring2, 16);
            mqkVar.e(j);
            mqkVar.a(i * 60);
            return mqkVar;
        } catch (NumberFormatException unused) {
            LogUtil.e("BasicUnTlvStatus", "parseStatusDuration NumberFormatException");
            return mqkVar;
        }
    }

    public static mqm a(ees eesVar) {
        mqm mqmVar = new mqm();
        if (eesVar == null) {
            return mqmVar;
        }
        ArrayList arrayList = new ArrayList(16);
        List<ees> listB = eesVar.b();
        for (int i = 0; i < listB.size(); i++) {
            List<eew> listE = listB.get(i).e();
            for (int i2 = 0; i2 < listE.size(); i2++) {
                String strB = listE.get(i2).b();
                try {
                    if (Integer.parseInt(listE.get(i2).e(), 16) != 3) {
                        LogUtil.j("BasicUnTlvStatus", "subDoMainTag is default");
                    } else {
                        mqmVar.a(CommonUtil.v(strB));
                    }
                } catch (NumberFormatException unused) {
                    LogUtil.e("BasicUnTlvStatus", "tlv.getTag() NumberFormatException");
                }
            }
            d(listB.get(i).b(), arrayList);
        }
        mqmVar.a(arrayList);
        return mqmVar;
    }

    private static void d(List<ees> list, List<mqk> list2) {
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            List<eew> listE = it.next().e();
            mqk mqkVar = new mqk();
            for (eew eewVar : listE) {
                String strB = eewVar.b();
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 4) {
                    mqkVar.d(CommonUtil.v(strB));
                } else if (iV == 5) {
                    mqkVar = a(mqkVar, strB);
                } else if (iV == 6) {
                    mqkVar.b(CommonUtil.v(strB));
                } else {
                    LogUtil.j("BasicUnTlvStatus", "unTlvPackStatus is default");
                }
            }
            if (mqkVar.b() == 0) {
                LogUtil.a("BasicUnTlvStatus", "statusPoint startTime is 0");
            } else {
                LogUtil.a("BasicUnTlvStatus", "get status:", mqkVar);
                list2.add(mqkVar);
            }
        }
    }
}
