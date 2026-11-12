package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lyc {
    public static int a(byte[] bArr) throws cpy {
        cqk cqkVarC;
        if (bArr == null || bArr.length <= 2 || (cqkVarC = new cql().c(bArr, 2)) == null) {
            return 0;
        }
        List<cqk> listC = cqkVarC.c();
        int iA = 0;
        for (int i = 0; i < listC.size(); i++) {
            List<cqi> listD = listC.get(i).d();
            for (int i2 = 0; i2 < listD.size(); i2++) {
                byte[] bArrD = listD.get(i2).d();
                if (listD.get(i2).c() == 2) {
                    iA = eeq.a(bArrD, -1);
                } else {
                    LogUtil.j("FitnessUnTlvStatus", "unTlvGetStatusFrameCount is default");
                }
            }
        }
        return iA;
    }

    public static lyj c(lyj lyjVar, String str) {
        if (str == null) {
            LogUtil.j("FitnessUnTlvStatus", "parseStatusDuration value is null");
            return lyjVar;
        }
        if (str.length() != 12) {
            LogUtil.j("FitnessUnTlvStatus", "parseStatusDuration invalid duration", str);
            return lyjVar;
        }
        String strSubstring = str.substring(0, 8);
        String strSubstring2 = str.substring(8, 12);
        try {
            long j = Integer.parseInt(strSubstring, 16);
            int i = Integer.parseInt(strSubstring2, 16);
            lyjVar.d(j);
            lyjVar.b(i * 60);
            return lyjVar;
        } catch (NumberFormatException unused) {
            LogUtil.e("FitnessUnTlvStatus", "parseStatusDuration NumberFormatException");
            return lyjVar;
        }
    }

    public static lyi d(byte[] bArr) throws cpy {
        cqk cqkVarC;
        lyi lyiVar = new lyi();
        if (bArr != null && bArr.length > 2 && (cqkVarC = new cql().c(bArr, 2)) != null) {
            ArrayList arrayList = new ArrayList(16);
            List<cqk> listC = cqkVarC.c();
            for (int i = 0; i < listC.size(); i++) {
                List<cqi> listD = listC.get(i).d();
                for (int i2 = 0; i2 < listD.size(); i2++) {
                    byte[] bArrD = listD.get(i2).d();
                    if (listD.get(i2).c() == 3) {
                        lyiVar.e(eeq.a(bArrD, -1));
                    } else {
                        LogUtil.j("FitnessUnTlvStatus", "subDoMainTag is default");
                    }
                }
                e(listC.get(i).c(), arrayList);
            }
            lyiVar.e(arrayList);
        }
        return lyiVar;
    }

    private static void e(List<cqk> list, List<lyj> list2) {
        Iterator<cqk> it = list.iterator();
        while (it.hasNext()) {
            List<cqi> listD = it.next().d();
            lyj lyjVar = new lyj();
            for (cqi cqiVar : listD) {
                byte[] bArrD = cqiVar.d();
                byte bC = cqiVar.c();
                if (bC == 4) {
                    lyjVar.c(eeq.a(bArrD, -1));
                } else if (bC == 5) {
                    lyjVar = c(lyjVar, eeq.e(bArrD));
                } else if (bC == 6) {
                    lyjVar.d(eeq.a(bArrD, -1));
                } else {
                    LogUtil.j("FitnessUnTlvStatus", "unTlvPackStatus is default");
                }
            }
            LogUtil.a("FitnessUnTlvStatus", "get status:", lyjVar);
            list2.add(lyjVar);
        }
    }
}
