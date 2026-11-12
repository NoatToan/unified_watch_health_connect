package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mup {
    private static mup d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private eet f42445c = new eet();

    private mup() {
    }

    public static mup b() {
        if (d == null) {
            d = new mup();
        }
        return d;
    }

    public int[] e(byte[] bArr) throws eeu {
        LogUtil.g("CommandUnpackage", "Enter getErrorCode()");
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() <= 6) {
            return null;
        }
        int[] iArrA = a(this.f42445c.b(strE.substring(6, strE.length())));
        LogUtil.g("CommandUnpackage", "Error Code:", Integer.valueOf(iArrA[0]));
        return iArrA;
    }

    public static int[] a(ees eesVar) {
        List<eew> listE = eesVar.e();
        int size = listE.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            String strB = listE.get(i).b();
            int iV = CommonUtil.v(listE.get(i).e());
            if (iV != 19) {
                if (iV != 127) {
                    LogUtil.a("CommandUnpackage", "unTlvGetErrorCode default ");
                } else if (size > 0) {
                    iArr[0] = CommonUtil.v(strB);
                }
            } else if (size > 1) {
                iArr[1] = CommonUtil.v(strB);
            }
        }
        return iArr;
    }

    public static int[] d(ees eesVar) {
        List<eew> listE = eesVar.e();
        int size = listE.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            String strB = listE.get(i).b();
            int iV = CommonUtil.v(listE.get(i).e());
            if (iV != 2) {
                if (iV != 127) {
                    LogUtil.a("CommandUnpackage", "unTlvGetRequestFileResponse default");
                } else if (size > 0) {
                    iArr[0] = CommonUtil.v(strB);
                }
            } else if (size > 1) {
                iArr[1] = CommonUtil.v(strB);
            }
        }
        return iArr;
    }

    public ArrayList b(byte[] bArr) throws eeu {
        ArrayList arrayList = new ArrayList(16);
        LogUtil.g("CommandUnpackage", "unGetFileName enter...");
        String strE = eeq.e(bArr);
        String[] strArrC = (TextUtils.isEmpty(strE) || strE.length() <= 4) ? null : c(this.f42445c.b(strE.substring(4, strE.length())));
        if (strArrC != null) {
            for (String str : strArrC) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static String[] c(ees eesVar) {
        List<eew> listE = eesVar.e();
        String[] strArrSplit = null;
        for (int i = 0; i < listE.size(); i++) {
            String strB = listE.get(i).b();
            if (strB != null) {
                String strD = eeq.d(strB);
                if (!TextUtils.isEmpty(strD)) {
                    strArrSplit = strD.split(";");
                }
            }
        }
        return strArrSplit;
    }

    public List<mnw> g(byte[] bArr) throws eeu {
        String strE = eeq.e(bArr);
        LogUtil.a("CommandUnpackage", "unGetGPSFileName info ", strE);
        if (TextUtils.isEmpty(strE) || strE.length() <= 4) {
            return null;
        }
        String strSubstring = strE.substring(4, strE.length());
        ees eesVarB = this.f42445c.b(strSubstring);
        LogUtil.a("CommandUnpackage", "unGetGPSFileName substring:", strSubstring, "unGetGPSFileName tlvFather:", Integer.valueOf(eesVarB.b().size()), " unGetGPSFileName tlv: ", Integer.valueOf(eesVarB.e().size()));
        return j(eesVarB);
    }

    public static List<mnw> j(ees eesVar) {
        ArrayList arrayList = new ArrayList(16);
        List<ees> listB = eesVar.b();
        LogUtil.a("CommandUnpackage", "unGetGPSFileName tlvFathers: ", Integer.valueOf(listB.size()));
        Iterator<ees> it = listB.iterator();
        while (it.hasNext()) {
            List<ees> listB2 = it.next().b();
            LogUtil.a("CommandUnpackage", "unGetGPSFileName tlvFatherss: ", Integer.valueOf(listB2.size()));
            Iterator<ees> it2 = listB2.iterator();
            while (it2.hasNext()) {
                List<eew> listE = it2.next().e();
                mnw mnwVar = new mnw();
                Iterator<eew> it3 = listE.iterator();
                while (it3.hasNext()) {
                    b(arrayList, mnwVar, it3.next());
                }
            }
        }
        return arrayList;
    }

    private static void b(List<mnw> list, mnw mnwVar, eew eewVar) {
        String strB = eewVar.b();
        LogUtil.a("CommandUnpackage", "unTLVGPSFileName() TAG ", Integer.valueOf(CommonUtil.v(eewVar.e())));
        int iV = CommonUtil.v(eewVar.e());
        if (iV == 9) {
            mnwVar.c(CommonUtil.v(strB));
            return;
        }
        if (iV == 10) {
            mnwVar.c(CommonUtil.v(strB));
            return;
        }
        if (iV != 13) {
            if (iV == 14) {
                mnwVar.b(CommonUtil.v(strB));
                return;
            } else {
                LogUtil.a("CommandUnpackage", "unTlvGpsFileName default ");
                return;
            }
        }
        if (strB != null) {
            String strD = eeq.d(strB);
            LogUtil.a("CommandUnpackage", "unTLVGPSFileName() nameListsStr ", strD);
            if (strD == null) {
                return;
            }
            if (new mof().c()) {
                String[] strArrSplit = strD.split(";");
                mnwVar.c(strArrSplit[0]);
                if (strArrSplit.length == 2) {
                    mnwVar.d(strArrSplit[1]);
                }
            } else {
                mnwVar.c(strD);
            }
            list.add(mnwVar);
        }
    }

    public mus h(byte[] bArr) throws eeu {
        LogUtil.g("CommandUnpackage", "unGetMaintenanceParameters enter...");
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() <= 4) {
            return null;
        }
        return b(this.f42445c.b(strE.substring(4, strE.length())));
    }

    public static mus b(ees eesVar) {
        mus musVar = new mus();
        List<eew> listE = eesVar.e();
        if (listE != null && listE.size() > 0) {
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                String strB = eewVar.b();
                if (iV == 1) {
                    musVar.c(eeq.d(strB));
                } else if (iV == 2) {
                    musVar.d(CommonUtil.v(strB) == 1);
                } else if (iV == 3) {
                    musVar.b(CommonUtil.v(strB));
                } else if (iV == 4) {
                    musVar.e(CommonUtil.v(strB));
                } else if (iV == 5) {
                    musVar.c(CommonUtil.v(strB));
                } else {
                    LogUtil.a("CommandUnpackage", "unGetMaintParameters default ");
                }
            }
        }
        return musVar;
    }

    public mut f(byte[] bArr) throws eeu {
        mut mutVarE;
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() <= 4) {
            mutVarE = null;
        } else {
            try {
                mutVarE = e(this.f42445c.b(strE.substring(4, strE.length())));
            } catch (NumberFormatException unused) {
                LogUtil.e("CommandUnpackage", "unQueryFileInformation NumberFormatException.");
                mutVarE = null;
            }
        }
        LogUtil.g("CommandUnpackage", "unQueryFileInformation support_response ");
        return mutVarE;
    }

    public static mut e(ees eesVar) {
        mut mutVar = new mut();
        List<eew> listE = eesVar.e();
        if (listE != null && listE.size() > 0) {
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                String strB = eewVar.b();
                if (iV == 2) {
                    mutVar.b(Long.parseLong(strB, 16));
                } else if (iV == 3) {
                    mutVar.c(Long.parseLong(strB, 16));
                } else if (iV == 4) {
                    mutVar.a(CommonUtil.v(strB));
                } else if (iV == 5) {
                    mutVar.e(Long.parseLong(strB, 16));
                } else if (iV == 6) {
                    mutVar.b(CommonUtil.v(strB));
                } else {
                    LogUtil.a("CommandUnpackage", "unQueryFileInformation default ");
                }
            }
        }
        return mutVar;
    }

    public int[] a(byte[] bArr) throws eeu {
        LogUtil.g("CommandUnpackage", "Enter getAckCode()");
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() <= 4) {
            return null;
        }
        int[] iArrA = a(this.f42445c.b(strE.substring(4, strE.length())));
        LogUtil.g("CommandUnpackage", "Error Code:", Integer.valueOf(iArrA[0]));
        return iArrA;
    }

    public int[] d(byte[] bArr) throws eeu {
        LogUtil.g("CommandUnpackage", "Enter getAckCodeExt()");
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() <= 4) {
            return null;
        }
        int[] iArrD = d(this.f42445c.b(strE.substring(4, strE.length())));
        if (iArrD != null && iArrD.length > 1) {
            LogUtil.g("CommandUnpackage", "getAckCodeExt Error Code:", Integer.valueOf(iArrD[0]), "  apply offset ", Integer.valueOf(iArrD[1]));
        }
        return iArrD;
    }

    public muq i(byte[] bArr) throws eeu {
        LogUtil.g("CommandUnpackage", "unGPSApplyDataFromDevice enter... data.length ", Integer.valueOf(bArr.length));
        muq muqVar = new muq();
        String strE = eeq.e(bArr);
        return (TextUtils.isEmpty(strE) || bArr.length < 4) ? muqVar : d(strE.substring(4, strE.length()));
    }

    private muq d(String str) {
        LogUtil.g("CommandUnpackage", "unGPSApplyData ,hexString.length() =  " + str.length());
        muq muqVar = new muq();
        if (str.length() > 2) {
            int iV = CommonUtil.v(str.substring(0, 2));
            String strSubstring = str.substring(2, str.length());
            LogUtil.g("CommandUnpackage", "unGPSApplyData ,index =", Integer.valueOf(iV), " unGPSApplyData ,value =", strSubstring);
            muqVar.c(iV);
            muqVar.e(eeq.c(strSubstring));
        }
        return muqVar;
    }

    public mur c(byte[] bArr) throws eeu {
        if (bArr == null) {
            return new mur();
        }
        return bArr.length >= 4 ? j(bArr) : new mur();
    }

    private mur j(byte[] bArr) {
        mur murVar = new mur();
        if (bArr.length > 3) {
            byte b2 = bArr[2];
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 3, bArr.length);
            murVar.a(b2);
            murVar.a(bArrCopyOfRange);
        }
        return murVar;
    }
}
