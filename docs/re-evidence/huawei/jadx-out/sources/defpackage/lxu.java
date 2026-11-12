package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lxu {
    public static lyd b(ees eesVar) {
        lyd lydVar = new lyd();
        if (eesVar == null) {
            LogUtil.j("FitnessUnTlvData", "tlvFather is null");
            return lydVar;
        }
        ArrayList arrayList = new ArrayList(16);
        List<ees> listB = eesVar.b();
        for (int i = 0; i < listB.size(); i++) {
            List<eew> listE = listB.get(i).e();
            for (int i2 = 0; i2 < listE.size(); i2++) {
                String strB = listE.get(i2).b();
                String strE = listE.get(i2).e();
                if (!TextUtils.isEmpty(strB) && !TextUtils.isEmpty(strE)) {
                    int iV = CommonUtil.v(strE);
                    if (iV == 2) {
                        lydVar.b(CommonUtil.v(strB));
                    } else if (iV != 5) {
                        LogUtil.j("FitnessUnTlvData", "unTlvGetFrameCountByTime default");
                    } else {
                        arrayList.add(Integer.valueOf(CommonUtil.v(strB)));
                    }
                }
            }
        }
        lydVar.e(arrayList);
        return lydVar;
    }

    public static lxy e(ees eesVar) {
        return lxz.b(eesVar);
    }
}
