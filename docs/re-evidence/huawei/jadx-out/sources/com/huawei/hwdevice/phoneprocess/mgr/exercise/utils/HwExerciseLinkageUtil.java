package com.huawei.hwdevice.phoneprocess.mgr.exercise.utils;

import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ees;
import defpackage.eew;
import defpackage.gzs;
import defpackage.gzt;
import defpackage.nfo;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class HwExerciseLinkageUtil {
    private static final int CADENCE = 3;
    private static final int CIRCLE_CADENCE = 15;
    private static final int EVERSION_EXCURSION = 11;
    private static final int FOREFOOT_STRIKE_PATTERN = 8;
    private static final int GROUND_CONTACT_TIME = 5;
    private static final int GROUND_IMPACT_ACCERLERATION = 6;
    private static final int HANG_TIME = 13;
    private static final int HIND_PAW_STRIKE_PATTERN = 10;
    private static final int IMPACT_HANG_RATE = 14;
    private static final int SPORT_TYPE_CYCLE = 3;
    private static final int STEP_LENGTH = 4;
    private static final int SWING_ANGLE = 7;
    private static final String TAG = "HwExerciseLinkageUtil";
    private static final int TIME_INFO = 12;
    private static final int WHOLE_FOOT_STRIKE_PATTERN = 9;

    private HwExerciseLinkageUtil() {
    }

    public static Map<String, Object> parseLinkageData(List<ees> list, int i) {
        if (list == null) {
            LogUtil.j(TAG, "handleRunPostureData tlvFatherList is null");
            return null;
        }
        LogUtil.a(TAG, "parseLinkageData sportType : ", Integer.valueOf(i));
        if (i == 3) {
            return parseCycle(list);
        }
        return parsePosture(list);
    }

    private static Map<String, Object> parseCycle(List<ees> list) {
        ArrayList arrayList = new ArrayList(16);
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            Iterator<ees> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                List<eew> listE = it2.next().e();
                gzs gzsVar = new gzs();
                Iterator<eew> it3 = listE.iterator();
                while (it3.hasNext()) {
                    parseCycleTlv(gzsVar, it3.next());
                }
                arrayList.add(gzsVar);
            }
        }
        return nfo.a(arrayList, "notificationAw70LinkInfo");
    }

    private static void parseCycleTlv(gzs gzsVar, eew eewVar) {
        int iV = CommonUtil.v(eewVar.e());
        if (iV == 12) {
            gzsVar.a(CommonUtil.v(eewVar.b()));
        } else if (iV == 15) {
            gzsVar.e(CommonUtil.v(eewVar.b()));
        } else {
            LogUtil.j(TAG, "parseCycleTlv default :", Integer.valueOf(CommonUtil.v(eewVar.e())));
        }
    }

    private static Map<String, Object> parsePosture(List<ees> list) {
        ArrayList arrayList = new ArrayList(16);
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            Iterator<ees> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                List<eew> listE = it2.next().e();
                gzt gztVar = new gzt();
                Iterator<eew> it3 = listE.iterator();
                while (it3.hasNext()) {
                    configRunPostureInfoParams(gztVar, it3.next());
                }
                arrayList.add(gztVar);
            }
        }
        return nfo.a(arrayList, "notificationAw70LinkInfo");
    }

    private static void configRunPostureInfoParams(gzt gztVar, eew eewVar) {
        if (gztVar == null || eewVar == null) {
            LogUtil.j(TAG, "configRunPostureInfoParams params is null");
            return;
        }
        switch (CommonUtil.v(eewVar.e())) {
            case 3:
                gztVar.b(CommonUtil.v(eewVar.b()));
                break;
            case 4:
                gztVar.j(CommonUtil.v(eewVar.b()));
                break;
            case 5:
                gztVar.a(CommonUtil.v(eewVar.b()));
                break;
            case 6:
                gztVar.c(CommonUtil.v(eewVar.b()));
                break;
            case 7:
                gztVar.k(CommonUtil.v(eewVar.b()));
                break;
            case 8:
                gztVar.e(CommonUtil.v(eewVar.b()));
                break;
            case 9:
                gztVar.o(CommonUtil.v(eewVar.b()));
                break;
            case 10:
                gztVar.f(CommonUtil.v(eewVar.b()));
                break;
            case 11:
                gztVar.d(CommonUtil.v(eewVar.b()));
                break;
            case 12:
                gztVar.a(CommonUtil.v(eewVar.b()));
                break;
            case 13:
                gztVar.h(CommonUtil.v(eewVar.b()));
                break;
            case 14:
                gztVar.g(CommonUtil.v(eewVar.b()));
                break;
            default:
                LogUtil.j(TAG, "default :", Integer.valueOf(CommonUtil.v(eewVar.e())));
                break;
        }
    }
}
