package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mjb {
    public static int a(byte[] bArr) throws eeu {
        return a(mix.c(bArr));
    }

    private static int a(ees eesVar) {
        if (eesVar == null) {
            return 0;
        }
        List<eew> listE = eesVar.e();
        int size = listE.size();
        int iV = 0;
        for (int i = 0; i < size; i++) {
            String strB = listE.get(i).b();
            if (CommonUtil.v(listE.get(i).e()) == 1) {
                iV = CommonUtil.v(strB);
            } else {
                LogUtil.j("TlvFitnessUtil", "unTlvPackDeviceSyncReport default");
            }
        }
        return iV;
    }

    public static long c(byte[] bArr) throws eeu {
        List<eew> listE = mix.c(bArr).e();
        if (njy.e(listE, 1)) {
            LogUtil.j("TlvFitnessUtil", "getCoreSleepTimeStamps tlvs is error");
            return 0L;
        }
        return CommonUtil.v(listE.get(1).b());
    }
}
