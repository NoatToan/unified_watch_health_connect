package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class suw {
    private static final Map<String, ezg> d = new HashMap();

    static {
        t();
    }

    private static void t() {
        Map<String, ezg> map = d;
        map.put("entryRun", m());
        map.put("entryWalk", q());
        map.put("entryRide", n());
        map.put("entryWarmUpStretch", r());
        map.put("entryFitnessCourse", g());
        map.put("entryHealthHeadline", f());
        map.put("entryMonitoringSleep", l());
        map.put("entryDietLog", a());
        map.put("entrySleepMusic", k());
        map.put("entryMindfulnessMeditation", j());
        map.put("entryBreath", c());
        map.put("entryDietaryAnalysis", d());
        map.put("entryCustomizedRecipes", e());
        map.put("entryHealthCourses", h());
        map.put("entryFamilyDoctor", b());
        map.put("entrySmartFatLoss", o());
        map.put("entrySmartTraining", p());
        map.put("entryHealthAssessment", i());
        LogUtil.a("QuickEntryConfig", "initializeEntries done, size: " + map.size());
    }

    public static ezg d(String str) {
        return d.get(str);
    }

    private static ezg m() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryRun");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_start_run));
        ezgVar.a(R.drawable.quick_entry_run);
        return ezgVar;
    }

    private static ezg q() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryWalk");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_start_walk));
        ezgVar.a(R.drawable.quick_entry_walk);
        return ezgVar;
    }

    private static ezg n() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryRide");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_start_ride));
        ezgVar.a(R.drawable.quick_entry_bike);
        return ezgVar;
    }

    private static ezg r() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryWarmUpStretch");
        ezgVar.c("huaweischeme://healthapp/fitnesspage?skip_type=all_fitness_run&id=10581&urlType=4&pName=com.huawei.health");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_warm_up_stretch));
        ezgVar.a(R.drawable.quick_entry_warm_up_stretch);
        return ezgVar;
    }

    private static ezg f() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryHealthHeadline");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_health_headline));
        ezgVar.a(R.drawable.quick_entry_health_headline);
        return ezgVar;
    }

    private static ezg l() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryMonitoringSleep");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_monitor_sleep));
        ezgVar.a(R.drawable.quick_entry_monitor_sleep);
        return ezgVar;
    }

    private static ezg a() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryDietLog");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_record_diet));
        ezgVar.a(R.drawable.quick_entry_record_diet);
        return ezgVar;
    }

    private static ezg b() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryFamilyDoctor");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_family_doctor));
        ezgVar.a(R.drawable.quick_entry_family_doctor);
        return ezgVar;
    }

    private static ezg g() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryFitnessCourse");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_fitness_course));
        ezgVar.a(R.drawable.quick_entry_fitness_course);
        return ezgVar;
    }

    private static ezg h() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryHealthCourses");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_health_courses));
        ezgVar.a(R.drawable.quick_entry_health_courses);
        return ezgVar;
    }

    private static ezg k() {
        ezg ezgVar = new ezg();
        ezgVar.b("entrySleepMusic");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_sleep_aiding_music));
        ezgVar.a(R.drawable.quick_entry_sleep_aiding_music);
        return ezgVar;
    }

    private static ezg j() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryMindfulnessMeditation");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_mindfulness_meditation));
        ezgVar.a(R.drawable.quick_entry_mindfulness_meditation);
        return ezgVar;
    }

    private static ezg c() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryBreath");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_breathing_training));
        ezgVar.a(R.drawable.quick_entry_breathing_training);
        return ezgVar;
    }

    private static ezg o() {
        ezg ezgVar = new ezg();
        ezgVar.b("entrySmartFatLoss");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_smart_fat_loss));
        ezgVar.a(R.drawable.quick_entry_smart_fat_loss);
        ezgVar.c("huaweischeme://healthapp/fitnesspage?skip_type=goto_plan&id=1&planTempId=JZ001&urlType=4&pName=com.huawei.health");
        return ezgVar;
    }

    private static ezg p() {
        ezg ezgVar = new ezg();
        ezgVar.b("entrySmartTraining");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_smart_training));
        ezgVar.a(R.drawable.quick_entry_smart_training);
        ezgVar.c("huaweischeme://healthapp/router/trainingPlanEntry?urlType=4&pName=com.huawei.health");
        return ezgVar;
    }

    private static ezg d() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryDietaryAnalysis");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_dietary_analysis));
        ezgVar.c("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.diet-diary?h5pro=true&urlType=4&pName=com.huawei.health&path=DietAnalysis");
        ezgVar.a(R.drawable.quick_entry_dietary_analysis);
        return ezgVar;
    }

    private static ezg e() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryCustomizedRecipes");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_customized_recipes));
        ezgVar.a(R.drawable.quick_entry_customized_recipes);
        ezgVar.c("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.custom-recipe?h5pro=true&isNeedLogin=true&urlType=4&pName=com.huawei.health&pullfrom=weight&from=3");
        return ezgVar;
    }

    private static ezg i() {
        ezg ezgVar = new ezg();
        ezgVar.b("entryHealthAssessment");
        ezgVar.d(qre.f(R.string.IDS_quick_entry_health_assessment));
        ezgVar.a(R.drawable.quick_entry_health_assessment);
        return ezgVar;
    }
}
