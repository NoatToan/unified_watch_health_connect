package defpackage;

import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class sus {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f48713b = new HashMap<String, String>() { // from class: sus.2
        {
            put("entryRun", "start_running");
            put("entryWalk", "start_walking");
            put("entryRide", "start_cycling");
            put("entryWarmUpStretch", "warmup_stretch_course");
            put("entryFitnessCourse", "fitness_course");
            put("entryHealthHeadline", "health_headlines");
            put("entryMonitoringSleep", "monitoring_sleep");
            put("entryDietLog", "diet_records");
            put("entrySleepMusic", "sleep_music");
            put("entryMindfulnessMeditation", "mindfulness_meditation");
            put("entryBreath", "breathing_training");
            put("entryDietaryAnalysis", "dietary_analysis");
            put("entryCustomizedRecipes", "customized_recipes");
            put("entryHealthCourses", "health_courses");
            put("entryFamilyDoctor", "family_doctor");
            put("entrySmartFatLoss", "smart_fat_loss");
            put("entrySmartTraining", "smart_training");
            put("entryHealthAssessment", "health_assessment");
        }
    };

    public static void e(int i, String str, ezg ezgVar) {
        lmn lmnVar = new lmn();
        HashMap map = new HashMap();
        map.put("event", Integer.valueOf(i));
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        if (("valid_set".equals(str) || "f2".equals(str) || "f3".equals(str)) && ezgVar != null) {
            map.put("value", f48713b.getOrDefault(ezgVar.d(), ""));
        } else {
            map.put("value", "");
        }
        map.put("moduleName", "fast_entry");
        lmnVar.e(map);
        ArrayList arrayList = new ArrayList(1);
        HashMap map2 = new HashMap();
        map2.put("action", 0);
        map2.put("moduleName", "fast_entry");
        map2.put(FunctionSetBeanReader.BI_HAS_DATA, Boolean.valueOf(ezgVar != null && ezgVar.h()));
        map2.put("position", Integer.valueOf(ezgVar != null ? ezgVar.g() : 0));
        arrayList.add(map2);
        lmnVar.d(arrayList);
        HashMap map3 = new HashMap(1);
        map3.put("pageId", "Today_0001");
        lmnVar.d(map3);
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.QUICK_ENTRY_H1000002.value(), lmnVar, 0);
    }
}
