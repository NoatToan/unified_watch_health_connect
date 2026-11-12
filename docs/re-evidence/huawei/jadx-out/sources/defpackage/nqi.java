package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.multisimservice.model.MultiSimDeviceInfo;
import com.huawei.multisimservice.model.SimInfo;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nqi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f43450c;

    private static int d(String str, int i) {
        try {
            return Integer.parseInt(str, i);
        } catch (NumberFormatException unused) {
            LogUtil.e("MultiSimUnPackage", "NumberFormatException");
            return 0;
        }
    }

    private static int[] a(ees eesVar) {
        List<eew> listE = eesVar.e();
        int size = listE.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            String strB = listE.get(i).b();
            if (d(listE.get(i).e(), 16) == 127) {
                iArr[0] = d(strB, 16);
            } else {
                LogUtil.j("MultiSimUnPackage", "dealErrorCode default");
            }
        }
        return iArr;
    }

    public static int c(byte[] bArr) throws Exception {
        if (bArr == null) {
            return -1;
        }
        int[] iArrA = a(new eet().b(eeq.e(bArr).substring(4)));
        LogUtil.a("MultiSimUnPackage", "Error Code:", Integer.valueOf(iArrA[0]));
        int i = iArrA[0];
        if (i == 100000) {
            return 0;
        }
        return i;
    }

    private static MultiSimDeviceInfo e(ees eesVar) {
        MultiSimDeviceInfo multiSimDeviceInfo = new MultiSimDeviceInfo();
        List<ees> listB = eesVar.b();
        for (int i = 0; i < listB.size(); i++) {
            List<eew> listE = listB.get(i).e();
            for (int i2 = 0; i2 < listE.size(); i2++) {
                String strB = listE.get(i2).b();
                int iD = d(listE.get(i2).e(), 16);
                if (iD == 2) {
                    multiSimDeviceInfo.setDeviceType(d(strB, 16));
                } else if (iD == 3) {
                    multiSimDeviceInfo.setDeviceIMEI(eeq.d(strB));
                } else if (iD == 4) {
                    multiSimDeviceInfo.setDeviceSerialNumber(eeq.d(strB));
                } else if (iD == 5) {
                    multiSimDeviceInfo.setProductName(eeq.d(strB));
                } else if (iD == 6) {
                    multiSimDeviceInfo.setEID(eeq.d(strB));
                } else if (iD != 12) {
                    LogUtil.j("MultiSimUnPackage", "dealMultiSimDeviceInfo default:", Integer.valueOf(iD));
                } else {
                    boolean z = d(strB, 16) == 0;
                    f43450c = z;
                    LogUtil.a("MultiSimUnPackage", "mIsEsimPowerDownStatus:", Boolean.valueOf(z));
                }
            }
            multiSimDeviceInfo.setSimInfoList(b(listB, i));
        }
        return multiSimDeviceInfo;
    }

    private static ArrayList<SimInfo> b(List<ees> list, int i) {
        ArrayList<SimInfo> arrayList = new ArrayList<>(10);
        if (list == null || i < 0 || i >= list.size()) {
            LogUtil.j("MultiSimUnPackage", "getSimInfoArrayList tlvFather or flag is not valid");
            return arrayList;
        }
        List<ees> listB = list.get(i).b();
        for (int i2 = 0; i2 < listB.size(); i2++) {
            List<ees> listB2 = listB.get(i2).b();
            for (int i3 = 0; i3 < listB2.size(); i3++) {
                List<eew> listE = listB2.get(i3).e();
                SimInfo simInfo = new SimInfo();
                for (int i4 = 0; i4 < listE.size(); i4++) {
                    d(simInfo, listE.get(i4).b(), d(listE.get(i4).e(), 16));
                }
                LogUtil.a("MultiSimUnPackage", " profileInfo:", simInfo);
                arrayList.add(simInfo);
            }
        }
        return arrayList;
    }

    private static void d(SimInfo simInfo, String str, int i) {
        switch (i) {
            case 9:
                simInfo.setIMSI(eeq.d(str));
                break;
            case 10:
                simInfo.setICCID(eeq.d(str));
                break;
            case 11:
                simInfo.setActive(d(str, 16) != 1);
                break;
            default:
                LogUtil.j("MultiSimUnPackage", "setSimInfoValue unkown type:", Integer.valueOf(i));
                break;
        }
    }

    public static MultiSimDeviceInfo j(byte[] bArr) throws Exception {
        if (bArr == null) {
            return null;
        }
        f43450c = false;
        return e(new eet().b(eeq.e(bArr).substring(4)));
    }

    public static int e(byte[] bArr) throws Exception {
        if (bArr == null) {
            return -1;
        }
        List<eew> listE = new eet().b(eeq.e(bArr).substring(4)).e();
        int size = listE.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            String strB = listE.get(i).b();
            if (d(listE.get(i).e(), 16) != 1) {
                LogUtil.j("MultiSimUnPackage", "parseRemoveStatus default");
            } else {
                iArr[0] = d(strB, 16);
            }
        }
        LogUtil.a("MultiSimUnPackage", "Error Code:", Integer.valueOf(iArr[0]));
        return iArr[0];
    }

    public static int b(byte[] bArr) {
        ees eesVarB;
        if (bArr == null || bArr.length < 4) {
            LogUtil.j("MultiSimUnPackage", "parseBatteryThreshold dataInfos is null");
            return -1;
        }
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.j("MultiSimUnPackage", "parseBatteryThreshold() tlvHex is null or error");
            return -1;
        }
        try {
            eesVarB = new eet().b(strE.substring(4));
        } catch (eeu unused) {
            LogUtil.j("MultiSimUnPackage", "parseBatteryThreshold TlvException");
            eesVarB = null;
        }
        if (eesVarB == null) {
            LogUtil.j("MultiSimUnPackage", "parseBatteryThreshold tlvFather is null");
            return -1;
        }
        List<eew> listE = eesVarB.e();
        if (listE == null || listE.isEmpty()) {
            LogUtil.j("MultiSimUnPackage", "parseBatteryThreshold tlvs is null or empty");
            return -1;
        }
        for (eew eewVar : listE) {
            if (d(eewVar.e(), 16) != 1) {
                LogUtil.j("MultiSimUnPackage", "parseBatteryThreshold Tlv element type is not power result");
            } else {
                return d(eewVar.b(), 16);
            }
        }
        return -1;
    }

    public static int a(byte[] bArr) throws Exception {
        if (bArr == null) {
            return -1;
        }
        List<eew> listE = new eet().b(eeq.e(bArr).substring(4)).e();
        if (listE == null || listE.size() <= 0) {
            return -1;
        }
        return d(listE.get(0).b(), 16);
    }

    public static lsd d(byte[] bArr) throws Exception {
        LogUtil.a("MultiSimUnPackage", "parseEsimMateData");
        if (bArr == null) {
            return null;
        }
        ees eesVarB = new eet().b(eeq.e(bArr).substring(4));
        List<ees> listB = eesVarB.b();
        List<eew> listE = eesVarB.e();
        lsd lsdVar = new lsd();
        if (listE != null && listE.size() > 0) {
            for (eew eewVar : listE) {
                LogUtil.a("MultiSimUnPackage", "parseEsimMateData deal with tlvs element");
                int iD = d(eewVar.e(), 16);
                if (iD == 1) {
                    LogUtil.d("MultiSimUnPackage", "authResult", Integer.valueOf(d(eewVar.b(), 16)));
                    lsdVar.c(d(eewVar.b(), 16));
                } else if (iD == 2) {
                    LogUtil.d("MultiSimUnPackage", "SPN", Integer.valueOf(d(eewVar.b(), 16)));
                    lsdVar.b(d(eewVar.b(), 16));
                } else {
                    LogUtil.j("MultiSimUnPackage", "parseEsimMateData default");
                }
            }
        }
        lrx lrxVar = new lrx();
        if (listB != null && listB.size() > 0) {
            d(listB, lsdVar, lrxVar);
        }
        return lsdVar;
    }

    private static void d(List<ees> list, lsd lsdVar, lrx lrxVar) {
        LogUtil.a("MultiSimUnPackage", "parseEsimMateData deal with fathertlvList");
        for (eew eewVar : list.get(0).e()) {
            LogUtil.a("MultiSimUnPackage", "parseEsimMateData deal with tlvs element");
            switch (d(eewVar.e(), 16)) {
                case 4:
                    LogUtil.d("MultiSimUnPackage", "ICCID:", eeq.d(eewVar.b()));
                    lrxVar.d(eeq.d(eewVar.b()));
                    break;
                case 5:
                    LogUtil.d("MultiSimUnPackage", "SPN:", eeq.d(eewVar.b()));
                    lrxVar.h(eeq.d(eewVar.b()));
                    break;
                case 6:
                    LogUtil.d("MultiSimUnPackage", "profile name:", eeq.d(eewVar.b()));
                    lrxVar.e(eeq.d(eewVar.b()));
                    break;
                case 7:
                    LogUtil.d("MultiSimUnPackage", "profile class:", eeq.d(eewVar.b()));
                    lrxVar.b(eeq.d(eewVar.b()));
                    break;
                case 8:
                    LogUtil.d("MultiSimUnPackage", "ICON TYPE:", Integer.valueOf(CommonUtil.j(eewVar.b())));
                    lrxVar.d(CommonUtil.j(eewVar.b()));
                    break;
                case 9:
                    LogUtil.a("MultiSimUnPackage", "ICON:", eewVar.b());
                    lrxVar.e(eeq.c(eewVar.b()));
                    break;
                case 10:
                    LogUtil.d("MultiSimUnPackage", "CONFINFO:", eeq.d(eewVar.b()));
                    lrxVar.a(eeq.d(eewVar.b()));
                    break;
                case 11:
                    LogUtil.d("MultiSimUnPackage", "PO:", eeq.d(eewVar.b()));
                    lrxVar.c(eeq.d(eewVar.b()));
                    break;
                case 12:
                    LogUtil.d("MultiSimUnPackage", "PPR:", eeq.d(eewVar.b()));
                    lrxVar.b(eeq.c(eewVar.b()));
                    break;
                default:
                    LogUtil.j("MultiSimUnPackage", "setEsimProfile default");
                    break;
            }
        }
        lsdVar.c(lrxVar);
    }

    public static boolean d() {
        return f43450c;
    }
}
