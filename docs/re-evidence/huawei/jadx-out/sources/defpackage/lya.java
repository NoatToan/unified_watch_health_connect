package defpackage;

import com.huawei.datatype.FitnessUserInfo;
import com.huawei.hwcommonmodel.fitnessdatatype.DataTotalMotion;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateDetect;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lya {
    public static UserInfomation b(ees eesVar) {
        UserInfomation userInfomation = new UserInfomation(0);
        if (eesVar == null) {
            LogUtil.j("FitnessUnTlvUtil", "unTlvGetStudentInfo tlvFather is null.");
            return userInfomation;
        }
        for (eew eewVar : eesVar.e()) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 1) {
                userInfomation.setHeight(CommonUtil.v(eewVar.b()));
            } else if (iV == 2) {
                userInfomation.setWeight(CommonUtil.v(eewVar.b()));
            } else if (iV == 4) {
                b(eewVar, userInfomation);
            } else if (iV != 5) {
                LogUtil.j("FitnessUnTlvUtil", "unTlvGetStudentInfo unknown");
            } else {
                int iV2 = CommonUtil.v(eewVar.b());
                if (iV2 == 1) {
                    userInfomation.setGender(0);
                } else if (iV2 == 2) {
                    userInfomation.setGender(1);
                } else {
                    userInfomation.setGender(-1);
                }
            }
        }
        return userInfomation;
    }

    private static void b(eew eewVar, UserInfomation userInfomation) {
        String strB = eewVar.b();
        if (strB.length() == 8 && !"00000000".equals(strB)) {
            int iV = CommonUtil.v(strB.substring(0, 4));
            String strValueOf = String.valueOf(CommonUtil.v(strB.substring(4, 6)));
            String strValueOf2 = String.valueOf(CommonUtil.v(strB.substring(6)));
            if (strValueOf.length() == 1) {
                strValueOf = "0" + strValueOf;
            }
            if (strValueOf2.length() == 1) {
                strValueOf2 = "0" + strValueOf2;
            }
            userInfomation.setBirthday(String.valueOf(iV) + strValueOf + strValueOf2);
            return;
        }
        LogUtil.j("FitnessUnTlvUtil", "unTlvGetStudentBirthday birthdayResult is error.");
        userInfomation.setBirthday("");
    }

    public static lyf e(ees eesVar) {
        lyf lyfVar = new lyf();
        if (eesVar != null) {
            List<ees> listB = eesVar.b();
            for (int i = 0; i < listB.size(); i++) {
                ees eesVar2 = listB.get(i);
                List<eew> listE = eesVar2.e();
                for (int i2 = 0; i2 < listE.size(); i2++) {
                    int iV = CommonUtil.v(listE.get(i2).e());
                    if (iV == 2) {
                        lyfVar.e(CommonUtil.v(listE.get(i2).b()));
                    } else if (iV == 9) {
                        HeartRateDetect heartRateDetect = new HeartRateDetect();
                        String strB = listE.get(i2).b();
                        LogUtil.a("FitnessUnTlvUtil", "unTlv HeartRateDetect value:", strB);
                        b(heartRateDetect, strB);
                        lyfVar.e(heartRateDetect);
                    } else {
                        LogUtil.j("FitnessUnTlvUtil", "unTlvGetHealthDataCurrentDay default");
                    }
                }
                Iterator<ees> it = eesVar2.b().iterator();
                while (it.hasNext()) {
                    lyfVar.a().add(e(it.next().e()));
                }
            }
        }
        return lyfVar;
    }

    private static void b(HeartRateDetect heartRateDetect, String str) {
        if (str.length() == 10) {
            heartRateDetect.setTimestamp(CommonUtil.v(str.substring(0, 8)));
            heartRateDetect.setHeartRate(CommonUtil.v(str.substring(8, 10)));
        }
    }

    public static FitnessUserInfo a(ees eesVar) {
        FitnessUserInfo fitnessUserInfo = new FitnessUserInfo();
        if (eesVar != null) {
            Iterator<ees> it = eesVar.b().iterator();
            while (it.hasNext()) {
                List<eew> listE = it.next().e();
                for (int i = 0; i < listE.size(); i++) {
                    String strB = listE.get(i).b();
                    int iV = CommonUtil.v(listE.get(i).e());
                    if (iV == 2) {
                        fitnessUserInfo.setTime(CommonUtil.x(strB));
                    } else if (iV == 3) {
                        fitnessUserInfo.setHeight(CommonUtil.v(strB));
                    } else if (iV == 4) {
                        fitnessUserInfo.setWeight(CommonUtil.v(strB));
                    } else {
                        LogUtil.j("FitnessUnTlvUtil", "unPackGetUserInfo default");
                    }
                }
            }
        }
        return fitnessUserInfo;
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
                        LogUtil.j("FitnessUnTlvUtil", "unPackMotion default");
                        break;
                    case 10:
                        dataTotalMotion.setHeight(CommonUtil.v(eewVar.b()));
                        break;
                }
            }
        }
        return dataTotalMotion;
    }
}
