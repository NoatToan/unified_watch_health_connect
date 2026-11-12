package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mix {
    public static int d(byte[] bArr) throws eeu {
        int[] iArrD = d(c(bArr));
        if (iArrD.length == 0) {
            LogUtil.j("TlvGeneralUtil", "fitnessIs length is 0");
            return -1;
        }
        LogUtil.a("TlvGeneralUtil", "Error Code:", Integer.valueOf(iArrD[0]));
        int i = iArrD[0];
        if (i == 100000) {
            return 0;
        }
        return i;
    }

    public static ees c(byte[] bArr) throws eeu {
        String strE = eeq.e(bArr);
        return new eet().b((strE == null || strE.length() <= 4) ? null : strE.substring(4, strE.length()));
    }

    public static int[] d(ees eesVar) {
        if (eesVar == null) {
            return new int[]{-1};
        }
        List<eew> listE = eesVar.e();
        int size = listE.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            String strB = listE.get(i).b();
            if (CommonUtil.v(listE.get(i).e()) != 127) {
                LogUtil.j("TlvGeneralUtil", "unTlvGetErrorCode default");
            } else if (size > 0) {
                iArr[0] = CommonUtil.v(strB);
            }
        }
        return iArr;
    }
}
