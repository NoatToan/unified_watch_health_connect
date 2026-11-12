package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.taskplatform.TaskEnum;
import health.compact.a.CommonUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class jzh {
    private static final Map<String, String> e = new HashMap<String, String>() { // from class: jzh.3
        {
            put(TaskEnum.STEPS.getTaskId(), MedalConstants.EVENT_STEPS);
            put(TaskEnum.ACTIVITY_CALORIES.getTaskId(), "exercise_calories");
            put(TaskEnum.EXERCISE_DURATION.getTaskId(), "exercise_time");
            put(TaskEnum.ACTIVITY_HOURS.getTaskId(), "standup_exercise");
            put(TaskEnum.WAKEUP_TIME.getTaskId(), "regular_getup");
            put(TaskEnum.BEDTIME.getTaskId(), "go_to_bed");
            put(TaskEnum.SLEEP_DURATION.getTaskId(), "sleep_duration");
            put(TaskEnum.DRINK_WATER.getTaskId(), "drink_water");
            put(TaskEnum.DECOMP_AND_RELAX.getTaskId(), "relaxation");
            put(TaskEnum.CALORIES_INTAKE.getTaskId(), "calories_intake");
            put(TaskEnum.AVG_DAILY_PRESSURE.getTaskId(), "average_stress");
            put(TaskEnum.BLOOD_PRESS_MEASURE.getTaskId(), "blood_pressure_check");
            put(TaskEnum.TAKE_MEDICINE.getTaskId(), "take_pills");
            put(TaskEnum.WEIGHT_MEASURE.getTaskId(), "weight_check");
        }
    };

    public static void e(qfj qfjVar) {
        if (qfjVar == null) {
            LogUtil.j("HealthLifeBiUtil", "reportTaskBi querySchedulesResp is null");
            return;
        }
        List<String> listH = qfjVar.h();
        if (CollectionUtils.a(listH)) {
            LogUtil.j("HealthLifeBiUtil", "reportTaskBi taskIdList is empty");
            return;
        }
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        for (String str : listH) {
            if (e.containsKey(str)) {
                if (ccy.d("task_bi_report_date_" + str) != iA) {
                    if (qfjVar.c(str) == 1) {
                        a(str);
                        ccy.b("task_bi_report_date_" + str, iA);
                    }
                    if (TaskEnum.BLOOD_PRESS_MEASURE.getTaskId().equals(str) && b(qfjVar.j(str)) >= 100) {
                        a(str);
                        ccy.b("task_bi_report_date_" + str, iA);
                    }
                    if (TaskEnum.TAKE_MEDICINE.getTaskId().equals(str) && c(qfjVar.j(str)) >= 100) {
                        a(str);
                        ccy.b("task_bi_report_date_" + str, iA);
                    }
                }
            }
        }
    }

    private static void a(String str) {
        lmn lmnVar = new lmn();
        HashMap map = new HashMap();
        map.put("pageId", "basic_framework_0001");
        lmnVar.d(map);
        HashMap map2 = new HashMap();
        map2.put("event", 1);
        map2.put(FunctionSetBeanReader.BI_ELEMENT, e.get(str));
        map2.put("moduleName", "cloverLife");
        lmnVar.e(map2);
        lmf.d().a(BaseApplication.b(), AnalyticsValue.Health_Management_Plan_Tasks_2040166.value(), lmnVar, 0);
    }

    public static void c() {
        qfj qfjVarA = ffv.a((List<String>) Collections.EMPTY_LIST, (ResponseCallback<qfj>) null);
        if (qfjVarA == null || CollectionUtils.a(qfjVarA.h())) {
            return;
        }
        a(qfjVarA);
        d(qfjVarA);
    }

    private static void a(qfj qfjVar) {
        lmn lmnVar = new lmn();
        HashMap map = new HashMap();
        map.put("pageId", "basic_framework_0001");
        lmnVar.d(map);
        HashMap map2 = new HashMap();
        map2.put("event", -1);
        map2.put(FunctionSetBeanReader.BI_ELEMENT, "t0");
        map2.put("moduleName", "task_card");
        lmnVar.e(map2);
        lmnVar.d(b(qfjVar));
        lmf.d().a(BaseApplication.b(), AnalyticsValue.HEALTH_MODEL_DATA_EXIT_APP_2119091.value(), lmnVar, 0);
    }

    private static void d(qfj qfjVar) {
        if (qfjVar != null && qfjVar.d() != null) {
            Map<String, Integer> mapD = qfjVar.d();
            if (mapD.containsKey("sport")) {
                b("mvpa", mapD.get("sport"));
            }
            if (mapD.containsKey("sleep")) {
                b("sleep", mapD.get("sleep"));
            }
            if (mapD.containsKey("emotion")) {
                b("moods", mapD.get("emotion"));
            }
            if (mapD.containsKey("diet")) {
                b("diet", mapD.get("diet"));
                return;
            }
            return;
        }
        b("disabled", (Object) "disabled");
    }

    private static void b(String str, Object obj) {
        lmn lmnVar = new lmn();
        HashMap map = new HashMap();
        map.put("pageId", "basic_framework_0001");
        lmnVar.d(map);
        HashMap map2 = new HashMap();
        map2.put("event", 0);
        map2.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map2.put("value", obj);
        map2.put("moduleName", "FOURLEAFCARD");
        lmnVar.e(map2);
        lmf.d().a(BaseApplication.b(), AnalyticsValue.HEALTH_LIFE_DATA_EXIT_APP_2040166002.value(), lmnVar, 0);
    }

    private static Map<String, Object> e(String str, int i, boolean z) {
        HashMap map = new HashMap();
        map.put("action", 0);
        map.put("moduleName", str);
        map.put(FunctionSetBeanReader.BI_HAS_DATA, Integer.valueOf(i));
        map.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, Boolean.valueOf(z));
        return map;
    }

    private static List<Map<String, Object>> b(qfj qfjVar) {
        TaskEnum taskEnumFromTaskId;
        ArrayList arrayList = new ArrayList();
        for (String str : qfjVar.h()) {
            if (!TextUtils.isEmpty(str) && (taskEnumFromTaskId = TaskEnum.fromTaskId(str)) != null) {
                String strE = qfjVar.e(str);
                String strG = qfjVar.g(str);
                int iB = qfjVar.b(str);
                switch (AnonymousClass4.f39249b[taskEnumFromTaskId.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        arrayList.add(e(e.get(str), b(strG, strE), iB == 1));
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        arrayList.add(e(e.get(str), iB * 100, iB == 1));
                        break;
                    case 13:
                        int iB2 = b(qfjVar.j(str));
                        arrayList.add(e(e.get(str), iB2, iB2 >= 100));
                        break;
                    case 14:
                        int iC = c(qfjVar.j(str));
                        arrayList.add(e(e.get(str), iC, iC >= 100));
                        break;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: jzh$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f39249b;

        static {
            int[] iArr = new int[TaskEnum.values().length];
            f39249b = iArr;
            try {
                iArr[TaskEnum.ACTIVITY_CALORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39249b[TaskEnum.ACTIVITY_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39249b[TaskEnum.EXERCISE_DURATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39249b[TaskEnum.STEPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39249b[TaskEnum.DECOMP_AND_RELAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39249b[TaskEnum.DRINK_WATER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39249b[TaskEnum.WEIGHT_MEASURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39249b[TaskEnum.SLEEP_DURATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39249b[TaskEnum.BEDTIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39249b[TaskEnum.WAKEUP_TIME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39249b[TaskEnum.AVG_DAILY_PRESSURE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f39249b[TaskEnum.CALORIES_INTAKE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f39249b[TaskEnum.BLOOD_PRESS_MEASURE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f39249b[TaskEnum.TAKE_MEDICINE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private static int b(qfz qfzVar) {
        List<qfq> listF;
        int size;
        qfk qfkVar;
        if (qfzVar == null || CollectionUtils.a(qfzVar.f()) || (size = (listF = qfzVar.f()).size()) == 0) {
            return 0;
        }
        int i = 0;
        for (qfq qfqVar : listF) {
            if (qfqVar != null) {
                List<qfk> listG = qfqVar.g();
                if (!CollectionUtils.a(listG) && (qfkVar = listG.get(0)) != null && qfkVar.z() == 1) {
                    i++;
                }
            }
        }
        return (int) ((i * 100.0f) / size);
    }

    private static int c(qfz qfzVar) {
        qfg qfgVarB;
        int iOptInt;
        int iOptInt2;
        int i = 0;
        if (qfzVar == null || CollectionUtils.a(qfzVar.f())) {
            return 0;
        }
        List<qfq> listF = qfzVar.f();
        int iO = lsl.o(System.currentTimeMillis());
        HashMap map = new HashMap();
        for (qfq qfqVar : listF) {
            if (qfqVar != null && (qfgVarB = qfqVar.b()) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(qfgVarB.d());
                    iOptInt = jSONObject.optInt("medicinePeriod");
                    try {
                        iOptInt2 = jSONObject.optInt("medicationRuleExpectedTime");
                    } catch (JSONException unused) {
                        LogUtil.e("HealthLifeBiUtil", "JSONException medicinePeriod");
                        iOptInt2 = 0;
                    }
                } catch (JSONException unused2) {
                    iOptInt = 0;
                }
                if ((iOptInt & (1 << (iO - 1))) != 0) {
                    ((List) map.computeIfAbsent(Integer.valueOf(iOptInt2), new Function() { // from class: jzk
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return jzh.d((Integer) obj);
                        }
                    })).add(qfqVar);
                }
            }
        }
        int size = map.size();
        if (size == 0) {
            return 0;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (c((List<qfq>) ((Map.Entry) it.next()).getValue())) {
                i++;
            }
        }
        return (int) ((i * 100.0f) / size);
    }

    static /* synthetic */ List d(Integer num) {
        return new ArrayList();
    }

    private static boolean c(List<qfq> list) {
        if (CollectionUtils.a(list)) {
            return false;
        }
        for (qfq qfqVar : list) {
            if (qfqVar != null) {
                for (qfk qfkVar : qfqVar.g()) {
                    if (qfkVar == null || qfkVar.z() != 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static int b(String str, String str2) {
        int iJ = CommonUtils.j(str);
        int iJ2 = CommonUtils.j(str2);
        if (iJ2 == 0) {
            return 0;
        }
        return (int) ((iJ * 100.0f) / iJ2);
    }
}
