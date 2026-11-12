package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mxl {
    public static int c(byte[] bArr) throws eeu {
        String strE = eeq.e(bArr);
        if (strE == null) {
            LogUtil.j("RriServiceUnPackage", "getErrorCode: fitnessInfo is null");
            return -1;
        }
        try {
            int[] iArrD = mix.d(new eet().b(strE.substring(4, strE.length())));
            if (iArrD != null && iArrD.length > 0) {
                LogUtil.a("RriServiceUnPackage", "getErrorCode: Error Code: ", Integer.valueOf(iArrD[0]));
                int i = iArrD[0];
                if (i == 100000) {
                    return 0;
                }
                return i;
            }
            LogUtil.j("RriServiceUnPackage", "getErrorCode: Error Code incorrect, fitnessErrorCodes length error");
            return -1;
        } catch (StringIndexOutOfBoundsException unused) {
            LogUtil.e("RriServiceUnPackage", "getErrorCode: StringIndexOutOfBoundsException");
            return -1;
        }
    }

    public static int a(byte[] bArr) throws eeu {
        String strE = eeq.e(bArr);
        if (strE == null) {
            LogUtil.j("RriServiceUnPackage", "unGetEcgFrameCount: hexResultInfo is null");
            return 0;
        }
        try {
            return e(new eet().b(strE.substring(4, strE.length())));
        } catch (StringIndexOutOfBoundsException unused) {
            LogUtil.e("RriServiceUnPackage", "unGetEcgFrameCount: StringIndexOutOfBoundsException");
            return 0;
        }
    }

    public static String d(byte[] bArr) throws eeu {
        String strE = eeq.e(bArr);
        String strD = "";
        if (strE == null) {
            LogUtil.j("RriServiceUnPackage", "unGetEcgAuthor: hexResultInfo is null");
            return "";
        }
        try {
            for (eew eewVar : new eet().b(strE.substring(4, strE.length())).e()) {
                if (eewVar == null) {
                    LogUtil.j("RriServiceUnPackage", "unGetEcgAuthor: tlvItem is null, continue.");
                } else if (CommonUtil.b(eewVar.e(), 16) != 1) {
                    LogUtil.j("RriServiceUnPackage", "unGetEcgAuthor: error command");
                } else {
                    strD = eeq.d(eewVar.b());
                }
            }
            return strD;
        } catch (StringIndexOutOfBoundsException unused) {
            LogUtil.e("RriServiceUnPackage", "unGetEcgAuthor: StringIndexOutOfBoundsException");
            return strD;
        }
    }

    private static int e(ees eesVar) {
        int iB = 0;
        for (eew eewVar : eesVar.e()) {
            if (eewVar == null) {
                LogUtil.j("RriServiceUnPackage", "unTlvGetEcgFrameCount tlvItem is null, continue.");
            } else {
                String strB = eewVar.b();
                if (CommonUtil.b(eewVar.e(), 16) != 1) {
                    LogUtil.j("RriServiceUnPackage", "unTlvGetEcgFrameCount error command");
                } else {
                    iB = CommonUtil.b(strB, 16);
                }
            }
        }
        return iB;
    }
}
