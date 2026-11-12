package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class dnu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private eet f32091a = new eet();

    public dnw a(byte[] bArr) {
        int i;
        String strE = eeq.e(bArr);
        LogUtil.a("WspFileDataParser", "5.44.2 parseFileCheckData:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("WspFileDataParser", "parseFileCheckData dataBytes is error");
            return null;
        }
        try {
            List<eew> listE = this.f32091a.b(strE.substring(4)).e();
            if (listE != null && listE.size() > 0) {
                String str = "";
                int iB = 0;
                for (eew eewVar : listE) {
                    try {
                        i = Integer.parseInt(eewVar.e(), 16);
                    } catch (NumberFormatException unused) {
                        LogUtil.e("WspFileDataParser", "handleParamTlv exception");
                        i = 0;
                    }
                    String strB = eewVar.b();
                    if (i == 1) {
                        iB = CommonUtil.b(strB, 16);
                        LogUtil.a("WspFileDataParser", "parseFileCheckData file id:", Integer.valueOf(iB));
                    } else if (i != 3) {
                        LogUtil.a("WspFileDataParser", "parseFileCheckData default");
                    } else {
                        str = strB;
                    }
                }
                dnw dnwVar = new dnw();
                dnwVar.a(iB);
                dnwVar.c(str);
                return dnwVar;
            }
            LogUtil.j("WspFileDataParser", "parseFileCheckData tlv list error");
            return null;
        } catch (eeu unused2) {
            LogUtil.e("WspFileDataParser", "parseFileCheckData error");
        }
    }

    public dob e(byte[] bArr) {
        int i;
        String strE = eeq.e(bArr);
        LogUtil.a("WspFileDataParser", "5.44.3 parseFileTransferParameter:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("WspFileDataParser", "parseFileTransferParameter dataBytes is error");
            return null;
        }
        String strSubstring = strE.substring(4);
        dob dobVar = new dob();
        try {
            List<eew> listE = this.f32091a.b(strSubstring).e();
            if (listE != null && listE.size() > 0) {
                for (eew eewVar : listE) {
                    c(dobVar, Integer.valueOf(eewVar.e(), 16).intValue(), eewVar.b());
                }
                LogUtil.a("WspFileDataParser", "5.44.3 parseFileTransferParameter fileId:", Integer.valueOf(dobVar.c()));
                int iA = dobVar.a();
                int iD = dobVar.d();
                if (iD <= 0) {
                    i = 0;
                } else if (iA % iD == 0) {
                    i = (iA / iD) - 1;
                } else {
                    i = iA / iD;
                }
                dobVar.e(i);
                LogUtil.a("WspFileDataParser", "5.44.3 parseFileTransferParameter psnMax:", Integer.valueOf(i));
                return dobVar;
            }
            LogUtil.j("WspFileDataParser", "parseFileTransferParameter tlv list error");
            return null;
        } catch (eeu unused) {
            LogUtil.e("WspFileDataParser", "parseFileTransferParameter error");
        }
    }

    private void c(dob dobVar, int i, String str) {
        if (i == 1) {
            dobVar.b(CommonUtil.b(str, 16));
            LogUtil.a("WspFileDataParser", "handleParamTlv file id:", Integer.valueOf(dobVar.c()));
            return;
        }
        if (i == 2) {
            dobVar.c(CommonUtil.b(str, 16));
            LogUtil.a("WspFileDataParser", "handleParamTlv device wait timeout:", Integer.valueOf(dobVar.e()));
            return;
        }
        int i2 = 0;
        if (i == 3) {
            try {
                i2 = Integer.parseInt(str, 16);
            } catch (NumberFormatException unused) {
                LogUtil.e("WspFileDataParser", "handleParamTlv exception");
            }
            dobVar.d(i2);
            LogUtil.a("WspFileDataParser", "handleParamTlv unit size:", Integer.valueOf(dobVar.d()));
            return;
        }
        if (i == 4) {
            dobVar.a(CommonUtil.b(str, 16));
            LogUtil.a("WspFileDataParser", "handleParamTlv max apply:", Integer.valueOf(dobVar.a()));
        } else if (i != 5) {
            LogUtil.a("WspFileDataParser", "handleParamTlv default");
        } else {
            dobVar.e(CommonUtil.v(str) == 1);
            LogUtil.a("WspFileDataParser", "handleParamTlv not need encrypt:", Boolean.valueOf(dobVar.b()));
        }
    }

    public doc a(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 16) {
            LogUtil.e("WspFileDataParser", "send info is null");
            return null;
        }
        String strSubstring = str.substring(4);
        int iB = CommonUtil.b(strSubstring.substring(0, 2), 16);
        int iB2 = CommonUtil.b(strSubstring.substring(2, 10), 16);
        int iB3 = CommonUtil.b(strSubstring.substring(10, 12), 16);
        ReleaseLogUtil.d("R_Weight_WspFileDataParser", "5.44.5 parseFileReceivedData fileID:", Integer.valueOf(iB), ", offset:", Integer.valueOf(iB2), ", psn:", Integer.valueOf(iB3));
        doc docVar = new doc();
        docVar.a(iB);
        docVar.h(iB2);
        docVar.f(iB3);
        docVar.a(strSubstring.substring(12));
        return docVar;
    }

    public Optional<dny> b(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            return Optional.empty();
        }
        try {
            List<eew> listE = this.f32091a.b(strE.substring(4)).e();
            if (listE == null || listE.size() <= 0) {
                LogUtil.j("WspFileDataParser", "parseFileResultNotifyData tlv list error");
                return Optional.empty();
            }
            int iB = 0;
            int iB2 = 0;
            for (eew eewVar : listE) {
                int iIntValue = Integer.valueOf(eewVar.e(), 16).intValue();
                String strB = eewVar.b();
                if (iIntValue == 1) {
                    iB = CommonUtil.b(strB, 16);
                    LogUtil.a("WspFileDataParser", "parseFileResultNotifyData file_id:", Integer.valueOf(iB));
                } else if (iIntValue != 127) {
                    LogUtil.a("WspFileDataParser", "parseFileResultNotifyData default");
                } else {
                    iB2 = CommonUtil.b(strB, 16);
                    LogUtil.a("WspFileDataParser", "parseFileResultNotifyData status:", Integer.valueOf(iB2));
                }
            }
            dny dnyVar = new dny();
            dnyVar.a(iB);
            dnyVar.c(iB2);
            return Optional.ofNullable(dnyVar);
        } catch (eeu unused) {
            LogUtil.e("WspFileDataParser", "parseFileResultNotifyData error");
        }
    }

    public dnv d(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("WspFileDataParser", "5.44.7 parseFileInfoData:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("WspFileDataParser", "parseFileInfoData dataBytes is error");
            return null;
        }
        try {
            List<eew> listE = this.f32091a.b(strE.substring(4)).e();
            if (listE != null && listE.size() > 0) {
                dnv dnvVar = new dnv();
                Iterator<eew> it = listE.iterator();
                while (it.hasNext()) {
                    c(it.next(), dnvVar);
                }
                return dnvVar;
            }
            LogUtil.j("WspFileDataParser", "parseFileInfoData tlv list error");
            return null;
        } catch (eeu unused) {
            LogUtil.e("WspFileDataParser", "parseFileInfoData error");
        }
    }

    private void c(eew eewVar, dnv dnvVar) {
        Integer numValueOf = Integer.valueOf(eewVar.e(), 16);
        int iIntValue = numValueOf.intValue();
        String strB = eewVar.b();
        LogUtil.a("WspFileDataParser", "this code:", numValueOf);
        if (dnvVar == null) {
            dnvVar = new dnv();
        }
        if (iIntValue == 1) {
            String strD = eeq.d(strB);
            dnvVar.c(strD);
            LogUtil.a("WspFileDataParser", "parseFileInfoData fileName:", strD);
            return;
        }
        if (iIntValue == 2) {
            int iV = CommonUtil.v(strB);
            dnvVar.f(iV);
            LogUtil.a("WspFileDataParser", "parseFileInfoData fileType:", Integer.valueOf(iV));
            return;
        }
        if (iIntValue == 3) {
            int iV2 = CommonUtil.v(strB);
            dnvVar.a(iV2);
            LogUtil.a("WspFileDataParser", "parseFileInfoData fileId:", Integer.valueOf(iV2));
        } else if (iIntValue == 4) {
            int iV3 = CommonUtil.v(strB);
            dnvVar.h(iV3);
            LogUtil.a("WspFileDataParser", "parseFileInfoData fileSize:", Integer.valueOf(iV3));
        } else {
            if (iIntValue == 127) {
                int iV4 = CommonUtil.v(strB);
                dnvVar.c(iV4);
                LogUtil.a("WspFileDataParser", "parseFileInfoData error code:", Integer.valueOf(iV4));
                return;
            }
            LogUtil.a("WspFileDataParser", "parseFileInfoData default");
        }
    }

    public dnx c(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("WspFileDataParser", "5.44.8 parseFileInfoRequestData:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("WspFileDataParser", "parseFileInfoRequestData dataBytes is error");
            return null;
        }
        String strSubstring = strE.substring(4);
        dnx dnxVar = new dnx();
        try {
            List<eew> listE = this.f32091a.b(strSubstring).e();
            if (listE != null && listE.size() > 0) {
                Iterator<eew> it = listE.iterator();
                while (it.hasNext()) {
                    e(dnxVar, it.next());
                }
            }
        } catch (eeu unused) {
            LogUtil.e("WspFileDataParser", "parseFileInfoRequestData error");
        }
        return dnxVar;
    }

    private void e(dnx dnxVar, eew eewVar) {
        String strB = eewVar.b();
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        int iIntValue = Integer.valueOf(eewVar.e(), 16).intValue();
        if (iIntValue != 5) {
            if (iIntValue != 127) {
                LogUtil.j("WspFileDataParser", "file id not find");
                return;
            } else {
                dnxVar.c(CommonUtil.b(strB, 16));
                return;
            }
        }
        try {
            strB = new String(eeq.c(strB), "utf-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("WspFileDataParser", "byte to string exception");
        }
        if (strB.contains(",")) {
            for (String str : strB.split(",")) {
                LogUtil.d("WspFileDataParser", "log file name is:", str);
                dnxVar.i().add(str);
            }
            return;
        }
        dnxVar.i().add(strB);
    }
}
