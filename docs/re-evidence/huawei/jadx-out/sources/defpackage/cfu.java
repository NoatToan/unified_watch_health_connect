package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.reflect.TypeToken;
import com.huawei.basichealthmodel.bean.ChallengeConfigBean;
import com.huawei.basichealthmodel.bean.TaskConfigBean;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class cfu {
    public static List<Integer> a(SparseArray<TaskConfigBean> sparseArray) {
        if (sparseArray == null) {
            sparseArray = byu.c().b();
        }
        if (sparseArray.size() == 0) {
            LogUtil.j("HL_TaskHelper", "getTaskIdList is null.");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            if (iKeyAt != 1 && iKeyAt != 100001) {
                arrayList.add(Integer.valueOf(iKeyAt));
            }
        }
        return arrayList;
    }

    public static int c(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length < 2) {
            return 0;
        }
        String[] strArrSplit2 = strArrSplit[1].split(":");
        if (strArrSplit2.length < 2) {
            return 0;
        }
        return ((int) (lsl.a(DateFormatUtil.d(CommonUtil.n(BaseApplication.getContext(), strArrSplit[0])), CommonUtil.j(strArrSplit2[0]), CommonUtil.j(strArrSplit2[1])) - DateFormatUtil.d(i))) / 60000;
    }

    public static int a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length < 2) {
            return 0;
        }
        int iJ = CommonUtil.j(strArrSplit[0]);
        int iJ2 = CommonUtil.j(strArrSplit[1]);
        long jD = DateFormatUtil.d(i);
        return ((int) (lsl.a(jD, iJ, iJ2) - jD)) / 60000;
    }

    public static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length < 2) {
            return 0;
        }
        return (CommonUtil.j(strArrSplit[0]) * 60) + CommonUtil.j(strArrSplit[1]);
    }

    public static String e(int i, int i2) {
        Object objValueOf;
        Object objValueOf2;
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        if (i3 >= 24) {
            i = DateFormatUtil.a(lsl.w(DateFormatUtil.d(i)));
            i3 -= 24;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" ");
        if (i3 < 10) {
            objValueOf = "0" + i3;
        } else {
            objValueOf = Integer.valueOf(i3);
        }
        sb.append(objValueOf);
        sb.append(":");
        if (i4 < 10) {
            objValueOf2 = "0" + i4;
        } else {
            objValueOf2 = Integer.valueOf(i4);
        }
        sb.append(objValueOf2);
        return sb.toString();
    }

    public static List<HealthLifeBean> e(List<HealthLifeBean> list, SparseArray<TaskConfigBean> sparseArray) {
        if (njy.e(list)) {
            LogUtil.e("HL_TaskHelper", "jsonArrayToHealthTaskRecordDbBeanList records is null");
            return new ArrayList(16);
        }
        if (sparseArray == null) {
            LogUtil.e("HL_TaskHelper", "jsonArrayToHealthTaskRecordDbBeanList taskConfigSparseArray is null");
            return list;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null) {
                healthLifeBean.setHuid(accountInfo);
                healthLifeBean.setSyncStatus(1);
                TaskConfigBean taskConfigBean = sparseArray.get(healthLifeBean.getId());
                if (taskConfigBean != null) {
                    healthLifeBean.setType(taskConfigBean.getType());
                }
            }
        }
        return list;
    }

    public static List<HealthLifeBean> b(List<HealthLifeBean> list) {
        if (njy.e(list)) {
            return new ArrayList(16);
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null) {
                healthLifeBean.setHuid(accountInfo);
                healthLifeBean.setSyncStatus(1);
            }
        }
        return list;
    }

    public static HealthLifeBean a(String str, int i, int i2, int i3, String str2) {
        HealthLifeBean healthLifeBeanC = bxc.c(i3, i, str2);
        if (!cbg.h(healthLifeBeanC)) {
            healthLifeBeanC = new HealthLifeBean();
            healthLifeBeanC.setId(i3);
            healthLifeBeanC.setRecordDay(i);
            long jCurrentTimeMillis = System.currentTimeMillis();
            healthLifeBeanC.setTimestamp(jCurrentTimeMillis);
            healthLifeBeanC.setTimeZone(lsl.q(jCurrentTimeMillis));
            healthLifeBeanC.setResult("");
            if (i2 >= 1) {
                healthLifeBeanC.setSyncStatus(0);
            }
            healthLifeBeanC.setIsUpdated(true);
        } else if (healthLifeBeanC.getComplete() == 0 && i2 >= 1) {
            healthLifeBeanC.setComplete(i2);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            healthLifeBeanC.setTimestamp(jCurrentTimeMillis2);
            healthLifeBeanC.setTimeZone(lsl.q(jCurrentTimeMillis2));
            healthLifeBeanC.setIsUpdated(true);
            healthLifeBeanC.setSyncStatus(0);
        } else {
            LogUtil.d("HL_TaskHelper", "getCloverBean others.");
        }
        healthLifeBeanC.setTarget(str);
        return healthLifeBeanC;
    }

    public static void c(final String str) {
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelGetTaskList", new Runnable() { // from class: cft
                @Override // java.lang.Runnable
                public final void run() {
                    cfu.a(str);
                }
            });
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = DateFormatUtil.a(jCurrentTimeMillis);
        SparseArray<HealthLifeBean> sparseArrayC = byu.c().c(str, iA, true);
        if (sparseArrayC == null || sparseArrayC.size() == 0) {
            LogUtil.j("HL_TaskHelper", "refreshCurrentEffectiveTaskRecord currentRecord is empty");
        } else if (jCurrentTimeMillis > lsl.a(jCurrentTimeMillis, 1, 0) || cbg.r() >= iA) {
            b(sparseArrayC);
        } else {
            c(str, jCurrentTimeMillis, sparseArrayC);
        }
    }

    static /* synthetic */ void a(String str) {
        LogUtil.a("HL_TaskHelper", "refreshCurrentEffectiveTaskRecord is in MainLooper");
        c(str);
    }

    private static void c(String str, long j, SparseArray<HealthLifeBean> sparseArray) {
        SparseArray<HealthLifeBean> sparseArrayC = byu.c().c(str, DateFormatUtil.a(lsl.u(j)), true);
        if (sparseArrayC == null || sparseArrayC.size() == 0) {
            LogUtil.j("HL_TaskHelper", "getBeforeEffectiveTaskRecord lastRecord is empty");
            return;
        }
        HealthLifeBean healthLifeBean = sparseArrayC.get(1);
        if (healthLifeBean == null || TextUtils.isEmpty(healthLifeBean.getTarget())) {
            LogUtil.j("HL_TaskHelper", "getBeforeEffectiveTaskRecord effectiveRecord is Invalid");
            return;
        }
        if (!Arrays.asList(healthLifeBean.getTarget().split(",")).contains(String.valueOf(7))) {
            b(sparseArray);
            return;
        }
        HealthLifeBean healthLifeBean2 = sparseArray.get(7);
        HealthLifeBean healthLifeBean3 = sparseArrayC.get(7);
        if (healthLifeBean2 == null || healthLifeBean3 == null) {
            LogUtil.j("HL_TaskHelper", "getBeforeEffectiveTaskRecord currentSleepBean or lastSleepBean is null");
            return;
        }
        String target = healthLifeBean2.getTarget();
        String target2 = healthLifeBean3.getTarget();
        LogUtil.a("HL_TaskHelper", "getBeforeEffectiveTaskRecord currentSleepTarget=", target, ",lastSleepTarget=", target2);
        if (Objects.equals(target, target2)) {
            b(sparseArray);
        } else {
            b(sparseArrayC);
        }
    }

    private static void b(SparseArray<HealthLifeBean> sparseArray) {
        HealthLifeBean healthLifeBean;
        HealthLifeBean healthLifeBean2 = sparseArray.get(1);
        if (healthLifeBean2 == null || TextUtils.isEmpty(healthLifeBean2.getTarget())) {
            LogUtil.j("HL_TaskHelper", "saveEffectiveTaskRecord effectiveRecord is Invalid");
            return;
        }
        if (Arrays.asList(healthLifeBean2.getTarget().split(",")).contains(String.valueOf(7)) && (healthLifeBean = sparseArray.get(7)) != null) {
            healthLifeBean.setAddStatus(1);
        }
        HashMap map = new HashMap();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            map.put(Integer.valueOf(iKeyAt), sparseArray.get(iKeyAt));
        }
        ccy.d("health_model_task_subscription_detail", HiJsonUtil.e(map, new TypeToken<HashMap<Integer, HealthLifeBean>>() { // from class: com.huawei.basichealthmodel.util.TaskHelper$1
        }.getType()));
    }

    public static int c(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis > lsl.a(jCurrentTimeMillis, 1, 0) || cbg.r() == i) {
            LogUtil.a("HL_TaskHelper", "getSleepTaskRefreshDay currentTime > 1");
            return i;
        }
        HealthLifeBean healthLifeBeanE = e(7);
        if (healthLifeBeanE == null || healthLifeBeanE.getAddStatus() != 1) {
            LogUtil.j("HL_TaskHelper", "getSleepTaskRefreshDay sleep task is not subscription");
            return i;
        }
        String target = healthLifeBeanE.getTarget();
        if (e(i, 23, 0) < a(i, target)) {
            long jE = cbg.e(jCurrentTimeMillis < lsl.a(jCurrentTimeMillis, 1, 0) ? jCurrentTimeMillis - 86400000 : jCurrentTimeMillis, target, 60);
            if (jCurrentTimeMillis < jE) {
                i = DateFormatUtil.a(lsl.u(jCurrentTimeMillis));
            }
            LogUtil.a("HL_TaskHelper", "getSleepTaskRefreshDay resultDay ", Integer.valueOf(i), " endPunchInTime ", Long.valueOf(jE));
        }
        return i;
    }

    public static int e(int i, int i2, int i3) {
        long jD = DateFormatUtil.d(i);
        return ((int) (lsl.a(jD, i2, i3) - jD)) / 60000;
    }

    public static HealthLifeBean e(int i) {
        HashMap map;
        String strC = ccy.c("health_model_task_subscription_detail");
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("HL_TaskHelper", "getSleepTaskBean effectiveRecordJson is empty");
            return null;
        }
        try {
            map = (HashMap) HiJsonUtil.d(strC, new TypeToken<HashMap<Integer, HealthLifeBean>>() { // from class: com.huawei.basichealthmodel.util.TaskHelper$2
            }.getType());
        } catch (Exception e) {
            ReleaseLogUtil.b("R_HL_TaskHelper", "getSubscriptionTaskBean exception ", ExceptionUtils.c(e));
            map = null;
        }
        if (njy.e(map)) {
            ReleaseLogUtil.d("R_HL_TaskHelper", "getSubscriptionTaskBean hashMap ", map);
            return null;
        }
        return (HealthLifeBean) map.get(Integer.valueOf(i));
    }

    public static boolean c() {
        HealthLifeBean healthLifeBeanE = e(7);
        if (healthLifeBeanE != null) {
            return healthLifeBeanE.getAddStatus() == 1;
        }
        LogUtil.j("HL_TaskHelper", "getSleepTaskRefreshDay sleepBean is null");
        return false;
    }

    public static SparseArray<SparseArray<HealthLifeBean>> a(int i, int i2, String str) {
        SparseArray<SparseArray<HealthLifeBean>> sparseArray = new SparseArray<>();
        List<HealthLifeBean> listB = bxc.b(i, i2, str);
        if (njy.b(listB)) {
            for (HealthLifeBean healthLifeBean : listB) {
                if (healthLifeBean != null) {
                    int recordDay = healthLifeBean.getRecordDay();
                    SparseArray<HealthLifeBean> sparseArray2 = sparseArray.get(recordDay);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray<>();
                    }
                    sparseArray2.put(healthLifeBean.getId(), healthLifeBean);
                    sparseArray.put(recordDay, sparseArray2);
                }
            }
        }
        LogUtil.a("HL_TaskHelper", "getListSparseArrayFromDb taskList: ", Integer.valueOf(sparseArray.size()));
        return sparseArray;
    }

    public static SparseArray<HealthLifeBean> e(String str, bws bwsVar, SparseArray<TaskConfigBean> sparseArray) {
        LogUtil.a("HL_TaskHelper", "parseConfigJsonObject enter");
        SparseArray<HealthLifeBean> sparseArray2 = new SparseArray<>();
        if (bwsVar == null) {
            LogUtil.j("HL_TaskHelper", "parseConfigJsonObject result is null");
            return sparseArray2;
        }
        LogUtil.d("HL_TaskHelper", "parseConfigJsonObject result = ", bwsVar.toString());
        int iB = bwsVar.b();
        if (iB != 0) {
            LogUtil.j("HL_TaskHelper", "parseConfigJsonObject, resultCode = ", Integer.valueOf(iB));
            return sparseArray2;
        }
        List<HealthLifeBean> listB = b(bwsVar.d());
        bxd.a(listB, str);
        for (HealthLifeBean healthLifeBean : listB) {
            if (healthLifeBean != null) {
                int id = healthLifeBean.getId();
                if (sparseArray2.get(id) == null || healthLifeBean.getRecordDay() > sparseArray2.get(id).getRecordDay()) {
                    sparseArray2.put(id, healthLifeBean);
                }
            }
        }
        return c(sparseArray2, sparseArray);
    }

    private static SparseArray<HealthLifeBean> c(SparseArray<HealthLifeBean> sparseArray, SparseArray<TaskConfigBean> sparseArray2) {
        if (sparseArray == null) {
            return new SparseArray<>();
        }
        HealthLifeBean healthLifeBean = sparseArray.get(1);
        if (healthLifeBean == null) {
            LogUtil.j("HL_TaskHelper", "parseConfigJsonObject cloverBean is null");
            return new SparseArray<>();
        }
        ArrayList arrayList = new ArrayList(16);
        String target = healthLifeBean.getTarget();
        if (TextUtils.isEmpty(target)) {
            LogUtil.j("HL_TaskHelper", "parseConfigJsonObject idList is null");
            return new SparseArray<>();
        }
        arrayList.addAll(Arrays.asList(target.split(",")));
        if (TextUtils.isEmpty(target)) {
            LogUtil.j("HL_TaskHelper", "parseConfigJsonObject idList is null");
            return new SparseArray<>();
        }
        List<Integer> listA = a(sparseArray2);
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            HealthLifeBean healthLifeBean2 = sparseArray.get(iKeyAt);
            if (arrayList.contains(String.valueOf(iKeyAt))) {
                healthLifeBean2.setAddStatus(1);
            } else {
                healthLifeBean2.setAddStatus(0);
            }
            listA.remove(Integer.valueOf(iKeyAt));
            sparseArray.put(iKeyAt, healthLifeBean2);
        }
        if (sparseArray2 == null) {
            LogUtil.j("HL_TaskHelper", "taskConfigSparseArray is null");
            return sparseArray;
        }
        c(listA, sparseArray2, sparseArray);
        LogUtil.a("HL_TaskHelper", "getSubscription from configs allIdList:", listA.toString());
        return sparseArray;
    }

    private static void c(List<Integer> list, SparseArray<TaskConfigBean> sparseArray, SparseArray<HealthLifeBean> sparseArray2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = DateFormatUtil.a(jCurrentTimeMillis);
        String strQ = lsl.q(jCurrentTimeMillis);
        for (Integer num : list) {
            if (cbg.b(num.intValue())) {
                HealthLifeBean healthLifeBean = new HealthLifeBean();
                healthLifeBean.setTimeZone(strQ);
                healthLifeBean.setId(num.intValue());
                healthLifeBean.setRecordDay(iA);
                healthLifeBean.setTimestamp(jCurrentTimeMillis);
                healthLifeBean.setAddStatus(0);
                TaskConfigBean taskConfigBean = sparseArray.get(num.intValue());
                if (taskConfigBean == null || "false".equals(taskConfigBean.getSupportTask())) {
                    LogUtil.j("HL_TaskHelper", "getSubscriptionArray config is null, id=", num);
                } else {
                    if (num.intValue() != 11 && num.intValue() != 12) {
                        healthLifeBean.setTarget(taskConfigBean.getDefaultGoal());
                    }
                    sparseArray2.put(num.intValue(), healthLifeBean);
                }
            }
        }
    }

    public static SparseArray<HealthLifeBean> a(List<HealthLifeBean> list) {
        if (njy.e(list)) {
            LogUtil.j("HL_TaskHelper", "convertListToSparseArray healthTaskRecordDbBeans is empty.");
            return new SparseArray<>();
        }
        SparseArray<HealthLifeBean> sparseArray = new SparseArray<>(list.size());
        for (HealthLifeBean healthLifeBean : list) {
            sparseArray.put(healthLifeBean.getId(), healthLifeBean);
        }
        return sparseArray;
    }

    public static String e(SparseArray<TaskConfigBean> sparseArray) {
        if (sparseArray == null || sparseArray.size() < 3) {
            LogUtil.j("HL_TaskHelper", "getDefaultTask configs is null or invalid size");
            return "2,3,5,6,7";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < sparseArray.size()) {
            int iKeyAt = sparseArray.keyAt(i);
            TaskConfigBean taskConfigBean = sparseArray.get(iKeyAt);
            if (taskConfigBean != null && String.valueOf(true).equals(taskConfigBean.getDefaultTask()) && cbg.b(iKeyAt)) {
                i2++;
                sb.append(iKeyAt);
                sb.append(i == sparseArray.size() - 1 ? "" : ",");
            }
            i++;
        }
        String string = i2 >= 3 ? sb.toString() : "2,3,5,6,7";
        LogUtil.d("HL_TaskHelper", "getDefaultTask configs is ", string);
        return string;
    }

    private static List<Integer> a(int i, SparseArray<TaskConfigBean> sparseArray) {
        if (sparseArray == null || sparseArray.size() == 0) {
            LogUtil.j("HL_TaskHelper", "getDefaultAlarmTime configs is null or invalid size");
            return d(i);
        }
        TaskConfigBean taskConfigBean = sparseArray.get(i);
        if (taskConfigBean == null) {
            LogUtil.j("HL_TaskHelper", "getDefaultAlarmTime healthTaskConfig is null");
            return d(i);
        }
        List<Integer> listE = cbg.e(taskConfigBean.getDefaultAlarmTime());
        if (listE.size() > 0) {
            return listE;
        }
        LogUtil.j("HL_TaskHelper", "getDefaultAlarmTime failed");
        return d(i);
    }

    private static List<Integer> d(int i) {
        Integer numValueOf = Integer.valueOf(HwExerciseConstants.NINE_MINUTES_PACE);
        switch (i) {
            case 1:
                return Collections.singletonList(numValueOf);
            case 2:
                return Collections.singletonList(1170);
            case 3:
                return Collections.singletonList(1050);
            case 4:
            case 6:
            case 12:
            default:
                return Collections.singletonList(0);
            case 5:
                return Collections.singletonList(900);
            case 7:
                return Collections.singletonList(30);
            case 8:
                return Collections.singletonList(600);
            case 9:
                return Collections.singletonList(1320);
            case 10:
                return Arrays.asList(480, 1080);
            case 11:
                return Collections.singletonList(480);
            case 13:
                return Arrays.asList(Integer.valueOf(TypedValues.PositionType.TYPE_POSITION_TYPE), 720, Integer.valueOf(ExceptionCode.SERVER_EXCEPTION));
            case 14:
                return Collections.singletonList(numValueOf);
        }
    }

    public static List<Calendar> d(int i, String str, cao caoVar) {
        if (!cfb.i().contains(Integer.valueOf(i))) {
            LogUtil.j("HL_TaskHelper", "getConfigCalendar invalid id ", Integer.valueOf(i));
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Calendar calendarS = cbg.s();
        SparseArray<TaskConfigBean> sparseArrayB = byu.c().b();
        if (i == 1) {
            List<Integer> listA = a(i, sparseArrayB);
            if (njy.b(listA)) {
                calendarS.add(12, listA.get(0).intValue());
            }
            calendarS.add(5, 1);
            arrayList.add(calendarS);
            return arrayList;
        }
        if (i == 7 || i == 6) {
            return e(i, str);
        }
        if (caoVar == null || njy.e(caoVar.b())) {
            return b(i);
        }
        return cfb.e(caoVar.b());
    }

    public static List<Calendar> e(int i, String str) {
        if (i != 7 && i != 6) {
            return new ArrayList();
        }
        SparseArray<TaskConfigBean> sparseArrayB = byu.c().b();
        if (TextUtils.isEmpty(str)) {
            if (sparseArrayB == null || sparseArrayB.size() <= 0) {
                LogUtil.j("HL_TaskHelper", "getSlumberCalendars configArray ", sparseArrayB);
                return new ArrayList();
            }
            TaskConfigBean taskConfigBean = sparseArrayB.get(i);
            if (taskConfigBean == null) {
                LogUtil.j("HL_TaskHelper", "getSlumberCalendars healthTaskConfig is null");
                return new ArrayList();
            }
            str = taskConfigBean.getDefaultGoal();
        }
        Calendar calendarI = cbg.i(str);
        List<Integer> listA = a(i, sparseArrayB);
        if (njy.b(listA)) {
            calendarI.add(12, -listA.get(0).intValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(calendarI);
        return arrayList;
    }

    public static List<Calendar> b(int i) {
        LogUtil.d("HL_TaskHelper", "getConfigCalendar id", Integer.valueOf(i));
        if (!cfb.i().contains(Integer.valueOf(i))) {
            LogUtil.j("HL_TaskHelper", "getConfigCalendar invalid id ", Integer.valueOf(i));
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<TaskConfigBean> sparseArrayB = byu.c().b();
        if (i == 10) {
            List<Integer> listA = a(i, sparseArrayB);
            if (njy.b(listA)) {
                Iterator<Integer> it = listA.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    Calendar calendarS = cbg.s();
                    calendarS.add(12, iIntValue);
                    arrayList.add(calendarS);
                }
            }
            return arrayList;
        }
        if (i != 7 && i != 6) {
            if (i == 13) {
                return e(sparseArrayB, i, arrayList);
            }
            Calendar calendarS2 = cbg.s();
            List<Integer> listA2 = a(i, sparseArrayB);
            if (njy.b(listA2)) {
                calendarS2.add(12, listA2.get(0).intValue());
            }
            arrayList.add(calendarS2);
            return arrayList;
        }
        if (sparseArrayB == null || sparseArrayB.size() == 0 || sparseArrayB.get(i) == null) {
            LogUtil.j("HL_TaskHelper", "getConfigCalendar configs invalid");
            return arrayList;
        }
        Calendar calendarI = cbg.i(sparseArrayB.get(i).getDefaultGoal());
        List<Integer> listA3 = a(i, sparseArrayB);
        if (njy.b(listA3)) {
            calendarI.add(12, -listA3.get(0).intValue());
        }
        arrayList.add(calendarI);
        return arrayList;
    }

    private static List<Calendar> e(SparseArray<TaskConfigBean> sparseArray, int i, List<Calendar> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (sparseArray == null || sparseArray.size() == 0) {
            LogUtil.j("HL_TaskHelper", "getConfigCalendar diet configs is null or invalid size");
            c(true, list, d(i), arrayList2);
            return list;
        }
        TaskConfigBean taskConfigBean = sparseArray.get(i);
        if (taskConfigBean == null) {
            LogUtil.j("HL_TaskHelper", "getConfigCalendar diet healthTaskConfig is null");
            c(true, list, d(i), arrayList2);
            return list;
        }
        String defaultAlarmTime = taskConfigBean.getDefaultAlarmTime();
        List<Calendar> listC = cbg.c(defaultAlarmTime);
        String[] strArrSplit = defaultAlarmTime.split(",");
        if (strArrSplit.length < 3) {
            c(true, list, arrayList, listC);
            LogUtil.j("HL_TaskHelper", "getConfigCalendar diet dietTime < 3");
            return list;
        }
        for (String str : strArrSplit) {
            int iA = qrs.a(str);
            Calendar calendarS = cbg.s();
            calendarS.add(11, iA / 60);
            calendarS.add(12, iA % 60);
            list.add(calendarS);
        }
        return list;
    }

    private static void c(boolean z, List<Calendar> list, List<Integer> list2, List<Calendar> list3) {
        if (z) {
            if (njy.b(list2)) {
                Iterator<Integer> it = list2.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    Calendar calendarS = cbg.s();
                    calendarS.add(11, iIntValue / 60);
                    calendarS.add(12, iIntValue % 60);
                    list.add(calendarS);
                }
                return;
            }
            return;
        }
        if (njy.b(list3)) {
            list.addAll(list3);
        }
    }

    public static int a(String str, int i, String str2) {
        int iA = -1;
        for (Integer num : a(byu.c().b())) {
            if (!str2.contains(String.valueOf(num))) {
                iA = bxc.a(str, i, num.intValue());
            }
        }
        return iA;
    }

    public static int e() {
        String[] strArrA = a();
        if (strArrA == null || strArrA.length <= 1) {
            return 0;
        }
        return CommonUtil.j(strArrA[0]);
    }

    public static String[] a() {
        HiUserPreference hiUserPreferenceD = cbg.d("health_model_device_celebrating");
        if (hiUserPreferenceD == null) {
            return null;
        }
        String value = hiUserPreferenceD.getValue();
        LogUtil.a("HL_TaskHelper", "getCelebratingSaved is ", value);
        if (TextUtils.isEmpty(value)) {
            return null;
        }
        return value.split("_");
    }

    public static void e(final String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: cfr
                @Override // java.lang.Runnable
                public final void run() {
                    cfu.e(str);
                }
            });
            return;
        }
        LogUtil.a("HL_TaskHelper", "saveCelebratingFlag is ", str);
        if (str == null) {
            str = "";
        }
        HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference("health_model_device_celebrating", str));
    }

    public static List<ChallengeConfigBean> c(List<ChallengeConfigBean> list) {
        ArrayList arrayList = new ArrayList(10);
        if (!njy.e(list)) {
            for (ChallengeConfigBean challengeConfigBean : list) {
                if (challengeConfigBean != null) {
                    String versionRange = challengeConfigBean.getVersionRange();
                    String versionRangeBeta = challengeConfigBean.getVersionRangeBeta();
                    if (TextUtils.isEmpty(versionRange) || TextUtils.isEmpty(versionRangeBeta)) {
                        arrayList.add(challengeConfigBean);
                    } else {
                        int iE = CommonUtil.e(BaseApplication.getContext());
                        boolean zAp = CommonUtil.ap();
                        boolean zA = cbg.a(challengeConfigBean.getVersionRange(), iE);
                        boolean zA2 = cbg.a(challengeConfigBean.getVersionRangeBeta(), iE);
                        if (zAp && zA2) {
                            arrayList.add(challengeConfigBean);
                        } else if (zA) {
                            arrayList.add(challengeConfigBean);
                        } else {
                            LogUtil.a("HL_TaskHelper", "handleChallengeList other");
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
