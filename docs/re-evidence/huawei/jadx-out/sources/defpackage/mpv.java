package defpackage;

import com.huawei.hwcommonmodel.fitnessdatatype.DataTotalMotion;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateDetect;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mpv {
    private static ees g(byte[] bArr) throws eeu {
        String strE = eeq.e(bArr);
        return new eet().b((strE == null || strE.length() <= 4) ? null : strE.substring(4, strE.length()));
    }

    public static mqj b(byte[] bArr) throws eeu {
        return d(g(bArr));
    }

    public static mqj d(ees eesVar) {
        mqj mqjVar = new mqj();
        if (eesVar != null) {
            List<ees> listB = eesVar.b();
            for (int i = 0; i < listB.size(); i++) {
                ees eesVar2 = listB.get(i);
                List<eew> listE = eesVar2.e();
                for (int i2 = 0; i2 < listE.size(); i2++) {
                    int iV = CommonUtil.v(listE.get(i2).e());
                    if (iV == 2) {
                        mqjVar.b(CommonUtil.v(listE.get(i2).b()));
                    } else if (iV == 9) {
                        HeartRateDetect heartRateDetect = new HeartRateDetect();
                        String strB = listE.get(i2).b();
                        LogUtil.a("BasicUnPackage", "unTlv HeartRateDetect value:", strB);
                        c(heartRateDetect, strB);
                        mqjVar.a(heartRateDetect);
                    } else {
                        LogUtil.j("BasicUnPackage", "unTlvGetHealthDataCurrentDay default");
                    }
                }
                Iterator<ees> it = eesVar2.b().iterator();
                while (it.hasNext()) {
                    mqjVar.e().add(e(it.next().e()));
                }
            }
        }
        return mqjVar;
    }

    public static mqc e(byte[] bArr) throws eeu {
        return mpx.b(g(bArr));
    }

    public static mqe c(byte[] bArr) throws eeu {
        return mpx.e(g(bArr));
    }

    public static int f(byte[] bArr) throws eeu {
        return mpw.d(g(bArr));
    }

    public static mqh j(byte[] bArr) throws eeu {
        return mpw.b(g(bArr));
    }

    public static int i(byte[] bArr) throws eeu {
        return mpy.d(g(bArr));
    }

    public static mqm h(byte[] bArr) throws eeu {
        return mpy.a(g(bArr));
    }

    public static int a(byte[] bArr) throws eeu {
        return mpw.a(g(bArr));
    }

    public static mqi d(byte[] bArr) throws eeu {
        return mpw.e(g(bArr));
    }

    private static void c(HeartRateDetect heartRateDetect, String str) {
        if (str.length() == 10) {
            heartRateDetect.setTimestamp(CommonUtil.v(str.substring(0, 8)));
            heartRateDetect.setHeartRate(CommonUtil.v(str.substring(8, 10)));
        }
    }

    private static DataTotalMotion e(List<eew> list) {
        DataTotalMotion dataTotalMotion = new DataTotalMotion();
        if (list != null) {
            for (eew eewVar : list) {
                switch (CommonUtil.v(eewVar.e())) {
                    case 4:
                        dataTotalMotion.setMotion_type(CommonUtil.v(eewVar.b()));
                        break;
                    case 5:
                        dataTotalMotion.setStep(CommonUtil.v(eewVar.b()));
                        break;
                    case 6:
                        dataTotalMotion.setCalorie(CommonUtil.v(eewVar.b()));
                        break;
                    case 7:
                        dataTotalMotion.setDistance(CommonUtil.v(eewVar.b()));
                        break;
                    case 8:
                        dataTotalMotion.setSleep_time(CommonUtil.v(eewVar.b()));
                        break;
                    case 9:
                    default:
                        LogUtil.j("BasicUnPackage", "unPackMotion default");
                        break;
                    case 10:
                        dataTotalMotion.setHeight(CommonUtil.v(eewVar.b()));
                        break;
                    case 11:
                        dataTotalMotion.setPushes(CommonUtil.v(eewVar.b()));
                        break;
                }
            }
        }
        return dataTotalMotion;
    }
}
