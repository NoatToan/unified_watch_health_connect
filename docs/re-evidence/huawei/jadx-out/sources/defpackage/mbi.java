package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.outofprocess.datatype.DataOtaParametersV2;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mbi {
    public static String e(DeviceInfo deviceInfo, String str) {
        String str2 = new String(str);
        if (deviceInfo == null || TextUtils.isEmpty(str2)) {
            LogUtil.j("OtaUtil", "getSwitchByDevice() identify or userPreference is empty");
            return "";
        }
        if ("true".equals(str2) || "false".equals(str2) || "1".equals(str2) || "2".equals(str2)) {
            return str2;
        }
        if (str2.length() < 3) {
            xjt.ap("getSwitchByDevice, userPreference = ".concat(str2));
            return "";
        }
        String deviceUdid = deviceInfo.getDeviceUdid();
        String strC = nio.c(deviceUdid);
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        String strC2 = nio.c(deviceIdentify);
        for (String str3 : str2.substring(1, str2.length() - 1).split(",")) {
            String[] strArrSplit = str3.split("=");
            if (strArrSplit.length >= 2) {
                String strTrim = strArrSplit[0].trim();
                if (strTrim.equals(strC) || strTrim.equals(deviceUdid) || strTrim.equals(deviceIdentify) || strTrim.equals(strC2)) {
                    return strArrSplit[1];
                }
            }
        }
        return "";
    }

    public static long e(String str, String str2) throws Throwable {
        byte[] bArrC = c(str2);
        if (bArrC != null) {
            return d(str, bArrC);
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.FileInputStream] */
    private static byte[] c(String str) throws Throwable {
        ?? fileInputStream;
        byte[] bArr;
        ?? r3 = 0;
        ?? r4 = 0;
        ?? r5 = 0;
        if (((int) new File(str).length()) == 0) {
            return null;
        }
        byte[] bArr2 = new byte[8];
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    byte[] bArr3 = fileInputStream.read(bArr2) >= 8 ? bArr2 : null;
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                        LogUtil.e("OtaUtil", "filePraseByte finally IOException");
                    }
                    bArr = bArr3;
                    r3 = bArr3;
                } catch (FileNotFoundException unused2) {
                    r4 = fileInputStream;
                    LogUtil.e("OtaUtil", "filePraseByte FileNotFoundException");
                    r3 = r4;
                    bArr = bArr2;
                    if (r4 != 0) {
                        try {
                            r4.close();
                            r3 = r4;
                            bArr = bArr2;
                        } catch (IOException unused3) {
                            LogUtil.e("OtaUtil", "filePraseByte finally IOException");
                            r3 = r4;
                            bArr = bArr2;
                        }
                    }
                } catch (IOException unused4) {
                    r5 = fileInputStream;
                    LogUtil.e("OtaUtil", "filePraseByte IOException");
                    r3 = r5;
                    bArr = bArr2;
                    if (r5 != 0) {
                        try {
                            r5.close();
                            r3 = r5;
                            bArr = bArr2;
                        } catch (IOException unused5) {
                            LogUtil.e("OtaUtil", "filePraseByte finally IOException");
                            r3 = r5;
                            bArr = bArr2;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != 0) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused6) {
                            LogUtil.e("OtaUtil", "filePraseByte finally IOException");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = r3;
            }
        } catch (FileNotFoundException unused7) {
        } catch (IOException unused8) {
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0059  */
    private static long d(String str, byte[] bArr) {
        int deviceOtaSignatureLength;
        String str2 = eeq.d((int) bArr[7]) + eeq.d((int) bArr[6]) + eeq.d((int) bArr[5]) + eeq.d((int) bArr[4]);
        DeviceInfo deviceInfoE = maq.b().e(str);
        if (!eey.d(deviceInfoE, 144) || deviceInfoE == null) {
            deviceOtaSignatureLength = 256;
        } else {
            deviceOtaSignatureLength = deviceInfoE.getDeviceOtaSignatureLength();
            LogUtil.a("OtaUtil", "getOtaInfoComponentSize signatureLength:", Integer.valueOf(deviceOtaSignatureLength));
            if (deviceOtaSignatureLength <= 0) {
                deviceOtaSignatureLength = 256;
            }
        }
        LogUtil.a("OtaUtil", "getOtaInfoComponentSize defaultSignatureLength:", Integer.valueOf(deviceOtaSignatureLength));
        return CommonUtil.x(str2) + ((long) deviceOtaSignatureLength);
    }

    public static int[] e(byte[] bArr) throws eeu {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 6) {
            return new int[]{100001};
        }
        int[] iArrC = c(new eet().b(strE.substring(6, strE.length())));
        LogUtil.a("OtaUtil", "Error getErrorCode Code:", Integer.valueOf(iArrC[0]));
        return iArrC;
    }

    private static int[] c(ees eesVar) {
        if (eesVar == null) {
            return new int[]{100001};
        }
        List<eew> listE = eesVar.e();
        if (listE == null || listE.size() == 0) {
            return new int[]{100001};
        }
        int size = listE.size();
        int[] iArr = new int[size];
        for (eew eewVar : listE) {
            if (eewVar != null) {
                String strB = eewVar.b();
                int iB = CommonUtil.b(eewVar.e(), 16);
                if (iB != 19) {
                    if (iB != 127) {
                        LogUtil.j("OtaUtil", "unTlvGetErrorCode: unknow case");
                    } else if (size > 0) {
                        iArr[0] = CommonUtil.b(strB, 16);
                    }
                } else if (size > 1) {
                    iArr[1] = CommonUtil.b(strB, 16);
                }
            }
        }
        return iArr;
    }

    public static mbb j(byte[] bArr) throws eeu {
        LogUtil.a("OtaUtil", "5.9.1 Enter unQueryAllow");
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 4) {
            return new mbb();
        }
        return d(new eet().b(strE.substring(4, strE.length())));
    }

    private static mbb d(ees eesVar) {
        List<eew> listE;
        LogUtil.a("OtaUtil", "5.9.1 unQueryAllow enter");
        mbb mbbVar = new mbb();
        if (eesVar != null && (listE = eesVar.e()) != null && listE.size() > 0) {
            for (eew eewVar : listE) {
                if (eewVar != null) {
                    int iB = CommonUtil.b(eewVar.e(), 16);
                    String strB = eewVar.b();
                    if (iB == 4) {
                        mbbVar.c(CommonUtil.b(strB, 16));
                        LogUtil.a("OtaUtil", "dataOtaQueryAllow.setBatteryThreshold:", Integer.valueOf(CommonUtil.b(strB, 16)));
                    } else if (iB == 127) {
                        mbbVar.b(CommonUtil.b(strB, 16));
                        LogUtil.a("OtaUtil", "dataOtaQueryAllow.setErrorCode:", Integer.valueOf(CommonUtil.b(strB, 16)));
                    } else {
                        LogUtil.j("OtaUtil", "unQueryAllow: no such case");
                    }
                }
            }
        }
        return mbbVar;
    }

    public static DataOtaParametersV2 c(byte[] bArr) throws eeu {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 4) {
            return new DataOtaParametersV2();
        }
        return a(new eet().b(strE.substring(4, strE.length())));
    }

    public static int b(byte[] bArr) throws eeu {
        LogUtil.a("OtaUtil", "5.9.7 Enter dataInfos: ", eeq.e(bArr));
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 4) {
            return 0;
        }
        return b(new eet().b(strE.substring(4, strE.length())));
    }

    private static int b(ees eesVar) {
        eew eewVar;
        if (eesVar != null) {
            try {
                List<eew> listE = eesVar.e();
                if (listE != null && listE.size() != 0 && (eewVar = listE.get(0)) != null) {
                    return Integer.parseInt(eewVar.b(), 16);
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("OtaUtil", "unOtaStatus: NumberFormatException");
            }
        }
        return 0;
    }

    public static int d(byte[] bArr) throws eeu {
        eew eewVarB = b(bArr, "5.9.19");
        if (eewVarB == null) {
            LogUtil.j("OtaUtil", "parseDeviceTransMode tlv is null");
            return 255;
        }
        if (CommonUtil.b(eewVarB.e(), 16) != 1) {
            LogUtil.j("OtaUtil", "parseDeviceTransMode type not equals 1");
            return 255;
        }
        int iB = CommonUtil.b(eewVarB.b(), 16);
        LogUtil.a("OtaUtil", "parseDeviceTransMode value:", Integer.valueOf(iB));
        return iB;
    }

    private static eew b(byte[] bArr, String str) throws eeu {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 4) {
            LogUtil.j("OtaUtil", "parseTlvByDataInfos resultDataHex is null ", str);
            return null;
        }
        List<eew> listE = new eet().b(strE.substring(4, strE.length())).e();
        if (listE == null || listE.isEmpty()) {
            LogUtil.j("OtaUtil", "parseTlvByDataInfos tlvList is empty ", str);
            return null;
        }
        return listE.get(0);
    }

    public static mav a(byte[] bArr) throws eeu {
        List<eew> listD = d(bArr, "5.9.21");
        mav mavVar = new mav();
        if (listD == null || listD.isEmpty()) {
            LogUtil.j("OtaUtil", "parseDeviceChangeLogMessage tlv is null");
            return mavVar;
        }
        for (eew eewVar : listD) {
            int iB = CommonUtil.b(eewVar.e(), 16);
            LogUtil.d("OtaUtil", "parseDeviceChangeLogMessage itemType=", Integer.valueOf(iB));
            if (iB == 3) {
                int iB2 = CommonUtil.b(eewVar.b(), 16);
                LogUtil.d("OtaUtil", "parseDeviceChangeLogMessage result=", Integer.valueOf(iB2));
                mavVar.a(iB2);
            }
            if (iB == 4) {
                String strD = eeq.d(eewVar.b());
                LogUtil.d("OtaUtil", "parseDeviceChangeLogMessage url=", strD);
                mavVar.c(strD);
            }
        }
        return mavVar;
    }

    private static List<eew> d(byte[] bArr, String str) throws eeu {
        String strE = eeq.e(bArr);
        ArrayList arrayList = new ArrayList();
        if (strE == null || strE.length() <= 4) {
            LogUtil.j("OtaUtil", "parseTlvByDataInfos resultDataHex is null ", str);
            return arrayList;
        }
        return new eet().b(strE.substring(4, strE.length())).e();
    }

    private static DataOtaParametersV2 a(ees eesVar) {
        if (eesVar == null) {
            LogUtil.j("OtaUtil", "dealOtaParametersV2 tlvFather is null");
            return null;
        }
        DataOtaParametersV2 dataOtaParametersV2 = new DataOtaParametersV2();
        List<eew> listE = eesVar.e();
        if (listE != null && !listE.isEmpty()) {
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                String strB = eewVar.b();
                switch (iV) {
                    case 1:
                        dataOtaParametersV2.setAppWaitTimeout(CommonUtil.v(strB));
                        LogUtil.a("OtaUtil", "dataOtaParametersV2.setAppWaitTimeout:", Integer.valueOf(CommonUtil.v(strB)));
                        break;
                    case 2:
                        dataOtaParametersV2.setDeviceRestartTimeout(CommonUtil.v(strB));
                        LogUtil.a("OtaUtil", "dataOtaParametersV2.setDeviceRestartTimeout:", Integer.valueOf(CommonUtil.v(strB)));
                        break;
                    case 3:
                        dataOtaParametersV2.setOtaUnitSize(CommonUtil.v(strB));
                        LogUtil.a("OtaUtil", "dataOtaParametersV2.setOtaUnitSize:", Integer.valueOf(CommonUtil.v(strB)));
                        break;
                    case 4:
                        dataOtaParametersV2.setOtaInterval(CommonUtil.x(strB));
                        LogUtil.a("OtaUtil", "dataOtaParametersV2.setOtaInterval:", Long.valueOf(CommonUtil.x(strB)));
                        break;
                    case 5:
                        dataOtaParametersV2.setAckEnable(CommonUtil.x(strB));
                        LogUtil.a("OtaUtil", "dataOtaParametersV2.setAckEnable:", Long.valueOf(CommonUtil.x(strB)));
                        break;
                    case 6:
                        dataOtaParametersV2.setOffsetEnable(CommonUtil.v(strB) == 1);
                        LogUtil.a("OtaUtil", "dataOtaParametersV2.setOffsetEnable:", Integer.valueOf(CommonUtil.v(strB)));
                        break;
                    default:
                        LogUtil.e("OtaUtil", "dealOtaParametersV2 default");
                        break;
                }
            }
        }
        return dataOtaParametersV2;
    }
}
