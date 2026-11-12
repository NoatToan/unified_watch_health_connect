package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealthservice.store.merge.HiDataPointMerge;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lgg {
    public static kuk a(Context context, int i, int i2, int i3) {
        if (context == null) {
            return null;
        }
        return kww.c(context).b(i2, i3, kwt.b().g(i));
    }

    public static int e(kuk kukVar, double d, int i) {
        if (kukVar == null || 1 != i || 1 != kukVar.h() || d <= kukVar.l()) {
            return i;
        }
        LogUtil.d("Debug_HiSportStat", " getSyncStatus is SYNC_NONE! type = ", Integer.valueOf(kukVar.g()));
        return 0;
    }

    public static void b(HiDataInsertOption hiDataInsertOption, List<HiHealthData> list, int i) {
        if (list == null || list.size() <= 0) {
            return;
        }
        double dB = liq.b(BaseApplication.getContext(), kud.a().e(), HiDateUtil.d(list.get(0).getStartTime()), i);
        double value = list.get(0).getValue();
        LogUtil.d("Debug_HiSportStat", "insertHiHealthData() fitness exercise added");
        list.get(0).setValue(dB + value);
        list.get(0).setSyncStatus(0);
        list.get(0).setUserId(kud.a().e());
        hiDataInsertOption.setDatas(list);
        hiDataInsertOption.setWriteStatType(0);
        b(hiDataInsertOption, value);
    }

    private static void b(HiDataInsertOption hiDataInsertOption, double d) {
        int iE = kud.a().e();
        int iG = kwt.b().g(iE);
        kuk kukVarB = kww.c(BaseApplication.getContext()).b(HiDateUtil.d(hiDataInsertOption.getDatas().get(0).getStartTime()), 40003, iG);
        LogUtil.d("Debug_HiSportStat", "insertHiHealthData() ExerciseCalorieAddToSummary fitness exercise statTable = ", kukVarB, " statClient is ", Integer.valueOf(iG));
        if (kukVarB != null) {
            double dL = kukVarB.l();
            kukVarB.a(iG);
            kukVarB.e(20001);
            kukVarB.d(40003);
            kukVarB.h(iE);
            kukVarB.c(d + dL);
            LogUtil.d("Debug_HiSportStat", "insertHiHealthData() ExerciseCalorieAddToSummary fitness exercise update statTable = ", kukVarB);
            LogUtil.d("Debug_HiSportStat", "insertHiHealthData() ExerciseCalorieAddToSummary fitness exercise fitnessCalories isSuccess is ", Boolean.valueOf(kww.c(BaseApplication.getContext()).b(kukVarB)));
        }
    }

    public static void d(long j) {
        List<Integer> listF = kwt.b().f(kud.a().e());
        LogUtil.d("Debug_HiSportStat", "calculateStepSumByClient clients is ", listF);
        if (listF == null || listF.isEmpty()) {
            LogUtil.j("Debug_HiSportStat", "calculateStepSumByClient clients is empty");
            return;
        }
        Iterator<Integer> it = listF.iterator();
        while (it.hasNext()) {
            c(j, it.next().intValue(), 2);
        }
    }

    public static void b(HiHealthData hiHealthData) {
        c(hiHealthData.getStartTime(), hiHealthData.getClientId(), 2);
    }

    public static void d(HiHealthData hiHealthData) {
        c(hiHealthData.getStartTime(), hiHealthData.getClientId(), 8);
    }

    private static void c(long j, int i, int i2) {
        List<HiHealthData> listC = kwq.e(BaseApplication.getContext()).c(i, HiDateUtil.p(j), HiDateUtil.g(j), i2);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("Debug_HiSportStat", "clientStepsSync hihealthDatas is null or empty");
            return;
        }
        Iterator<HiHealthData> it = listC.iterator();
        double value = 0.0d;
        while (it.hasNext()) {
            value += it.next().getValue();
        }
        HiHealthData hiHealthData = listC.get(0);
        LogUtil.d("Debug_HiSportStat", "clientStepsSync client is ", Integer.valueOf(i), " value is ", Double.valueOf(value));
        hiHealthData.setValue(value);
        hiHealthData.setStartTime(HiDateUtil.p(j));
        hiHealthData.setEndTime(HiDateUtil.g(j));
        hiHealthData.setSyncStatus(0);
        hiHealthData.setType(e(i2));
        kym kymVarD = kyn.d(BaseApplication.getContext()).d(kud.a().c(), kud.a().e(), kwt.b().c(i));
        if (kymVarD == null) {
            LogUtil.j("Debug_HiSportStat", "clientStepsSync hihealthContext is null");
            return;
        }
        int iC = kymVarD.c();
        hiHealthData.setClientId(iC);
        new HiDataPointMerge(BaseApplication.getContext()).b(hiHealthData, iC, 0);
        kymVarD.c(1);
        kwt.b().c(kymVarD);
    }

    private static int e(int i) {
        if (2 == i) {
            return 901;
        }
        if (8 == i) {
            return 907;
        }
        ReleaseLogUtil.a("Debug_HiSportStat", "Failed to getStatType: Invalid type=", Integer.valueOf(i));
        return 0;
    }
}
