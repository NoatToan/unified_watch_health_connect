package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mpx {
    public static mqc b(ees eesVar) {
        mqc mqcVar = new mqc();
        if (eesVar == null) {
            LogUtil.j("BasicUnTlvData", "tlvFather is null");
            return mqcVar;
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
                        mqcVar.a(CommonUtil.v(strB));
                    } else if (iV != 5) {
                        LogUtil.j("BasicUnTlvData", "unTlvGetFrameCountByTime default");
                    } else {
                        arrayList.add(Integer.valueOf(CommonUtil.v(strB)));
                    }
                }
            }
        }
        mqcVar.d(arrayList);
        return mqcVar;
    }

    public static mqe e(ees eesVar) {
        return mqb.c(eesVar);
    }
}
