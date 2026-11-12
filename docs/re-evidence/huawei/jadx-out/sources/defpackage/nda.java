package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nda {
    public static ncw b(byte[] bArr) throws eeu {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 4) {
            return new ncw();
        }
        return e(new eet().b(strE.substring(4, strE.length())));
    }

    private static ncw e(ees eesVar) {
        if (eesVar == null) {
            LogUtil.j("OtaCommandUnPackageUtil", "dealDeviceApply tlvFather is null");
            return null;
        }
        ncw ncwVar = new ncw();
        List<eew> listE = eesVar.e();
        if (listE != null && !listE.isEmpty()) {
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                String strB = eewVar.b();
                if (iV == 1) {
                    ncwVar.b(CommonUtil.x(strB));
                } else if (iV == 2) {
                    ncwVar.c(CommonUtil.x(strB));
                } else if (iV == 3) {
                    ncwVar.c(c(strB));
                } else if (iV != 4) {
                    LogUtil.j("OtaCommandUnPackageUtil", "dealDeviceApply dataOtaApplyReport default");
                } else {
                    ncwVar.e(CommonUtil.x(strB));
                }
            }
        }
        return ncwVar;
    }

    public static List<Integer> c(String str) {
        ArrayList arrayList = new ArrayList(10);
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("OtaCommandUnPackageUtil", "parseAck , bitmapHex is empty");
            return arrayList;
        }
        byte[] bArrC = eeq.c(str);
        StringBuilder sb = new StringBuilder(16);
        for (byte b2 : bArrC) {
            sb.append(new StringBuffer(a(b2)).reverse().toString());
        }
        String string = sb.toString();
        LogUtil.a("OtaCommandUnPackageUtil", "parseAck, bufferStr = ", string);
        for (int i = 0; i < string.length(); i++) {
            if ("0".equalsIgnoreCase(string.charAt(i) + "")) {
                arrayList.add(0);
                LogUtil.a("OtaCommandUnPackageUtil", "errorPackages, error package index = ", Integer.valueOf(i));
            } else {
                arrayList.add(1);
            }
        }
        return arrayList;
    }

    private static String a(byte b2) {
        return "" + ((int) ((byte) ((b2 >> 7) & 1))) + ((int) ((byte) ((b2 >> 6) & 1))) + ((int) ((byte) ((b2 >> 5) & 1))) + ((int) ((byte) ((b2 >> 4) & 1))) + ((int) ((byte) ((b2 >> 3) & 1))) + ((int) ((byte) ((b2 >> 2) & 1))) + ((int) ((byte) ((b2 >> 1) & 1))) + ((int) ((byte) (b2 & 1)));
    }

    public static ncv e(byte[] bArr) throws eeu {
        cpl.d("OtaCommandUnPackageUtil", bArr, "5.9.5 Enter dataInfos: ");
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 4) {
            return new ncv();
        }
        return d(new eet().b(strE.substring(4, strE.length())));
    }

    private static ncv d(ees eesVar) {
        List<eew> listE;
        LogUtil.a("OtaCommandUnPackageUtil", "5.9.5 unPackassgeSizeReport enter");
        ncv ncvVar = new ncv();
        if (eesVar != null && (listE = eesVar.e()) != null && listE.size() > 0) {
            for (eew eewVar : listE) {
                if (eewVar != null) {
                    int iB = CommonUtil.b(eewVar.e(), 16);
                    String strB = eewVar.b();
                    if (iB == 1) {
                        ncvVar.e(CommonUtil.x(strB));
                    } else if (iB == 2) {
                        ncvVar.d(CommonUtil.x(strB));
                    } else {
                        LogUtil.d("OtaCommandUnPackageUtil", "unPackassgeSizeReport: no such case");
                    }
                }
            }
        }
        return ncvVar;
    }

    public static ncs a(byte[] bArr) throws eeu {
        cpl.d("OtaCommandUnPackageUtil", bArr, "5.9.6 Enter dataInfos: ");
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 4) {
            return new ncs();
        }
        return c(new eet().b(strE.substring(4, strE.length())));
    }

    private static ncs c(ees eesVar) {
        ncs ncsVar = new ncs();
        ncsVar.b(0);
        if (eesVar != null) {
            try {
                List<eew> listE = eesVar.e();
                if (listE != null && listE.size() != 0) {
                    for (eew eewVar : listE) {
                        if (eewVar != null) {
                            int iB = CommonUtil.b(eewVar.e(), 16);
                            String strB = eewVar.b();
                            if (iB == 1) {
                                ncsVar.b(CommonUtil.v(strB));
                            } else if (iB != 4) {
                                LogUtil.d("OtaCommandUnPackageUtil", "unPackassgeSizeReport: no such case");
                            } else {
                                ncsVar.d(CommonUtil.x(strB));
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("OtaCommandUnPackageUtil", "unCheckResultsReport: NumberFormatException");
            }
        }
        return ncsVar;
    }

    public static ncu c(DeviceInfo deviceInfo, byte[] bArr) throws eeu {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 4) {
            return new ncu();
        }
        return a(deviceInfo, new eet().b(strE.substring(4, strE.length())));
    }

    private static ncu a(DeviceInfo deviceInfo, ees eesVar) {
        ncu ncuVar = new ncu();
        if (eesVar != null) {
            try {
                List<eew> listE = eesVar.e();
                if (listE != null && listE.size() != 0) {
                    for (eew eewVar : listE) {
                        if (eewVar != null) {
                            int iB = CommonUtil.b(eewVar.e(), 16);
                            String strB = eewVar.b();
                            if (iB == 1) {
                                ncuVar.d(CommonUtil.v(strB));
                            } else if (iB != 2) {
                                LogUtil.d("OtaCommandUnPackageUtil", "dealOtaOperate: no such case");
                            } else {
                                ncuVar.a(CommonUtil.v(strB));
                            }
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("0x01", ncuVar.e());
                    mio.c(deviceInfo, "050915", "0", "", jSONObject.toString());
                    return ncuVar;
                }
            } catch (NumberFormatException | JSONException unused) {
                LogUtil.e("OtaCommandUnPackageUtil", "dealOtaOperate: NumberFormatException or JSONException");
            }
        }
        return ncuVar;
    }

    private static eew d(byte[] bArr, String str) throws eeu {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 4) {
            LogUtil.j("OtaCommandUnPackageUtil", "parseTlvByDataInfos resultDataHex is null ", str);
            return null;
        }
        List<eew> listE = new eet().b(strE.substring(4, strE.length())).e();
        if (listE == null || listE.isEmpty()) {
            LogUtil.j("OtaCommandUnPackageUtil", "parseTlvByDataInfos tlvList is empty ", str);
            return null;
        }
        return listE.get(0);
    }

    public static int d(DeviceInfo deviceInfo, byte[] bArr) throws eeu {
        eew eewVarD = d(bArr, "5.9.16");
        if (eewVarD == null) {
            LogUtil.j("OtaCommandUnPackageUtil", "deviceRequestDownloadOta tlv is null");
            return 255;
        }
        if (CommonUtil.b(eewVarD.e(), 16) != 1) {
            LogUtil.j("OtaCommandUnPackageUtil", "deviceRequestDownloadOta type not equals 1");
            return 255;
        }
        int iB = CommonUtil.b(eewVarD.b(), 16);
        LogUtil.a("OtaCommandUnPackageUtil", "isRequestNewVersionCheck value:", Integer.valueOf(iB));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0x01", iB);
        } catch (JSONException unused) {
            LogUtil.e("OtaCommandUnPackageUtil", "deviceRequestDownloadOta JSONException");
        }
        mio.c(deviceInfo, "050916", "0", "", jSONObject.toString());
        return iB;
    }

    public static boolean b(DeviceInfo deviceInfo, byte[] bArr) throws eeu {
        eew eewVarD = d(bArr, "5.9.17");
        if (eewVarD == null) {
            LogUtil.j("OtaCommandUnPackageUtil", "isUserAgreeDownload tlv is null");
            return false;
        }
        if (CommonUtil.b(eewVarD.e(), 16) != 1) {
            LogUtil.j("OtaCommandUnPackageUtil", "isUserAgreeDownload type not equals 1");
            return false;
        }
        int iB = CommonUtil.b(eewVarD.b(), 16);
        LogUtil.a("OtaCommandUnPackageUtil", "isUserAgreeDownload value:", Integer.valueOf(iB));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0x01", iB);
        } catch (JSONException unused) {
            LogUtil.e("OtaCommandUnPackageUtil", "isUserAgreeDownload JSONException");
        }
        mio.c(deviceInfo, "050917", "0", "", jSONObject.toString());
        return iB == 1;
    }
}
