package defpackage;

import android.text.TextUtils;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class gzy {
    private Map<String, Integer> d = new HashMap(16);

    public gzy() {
        d();
    }

    private void d() {
        this.d.put("C001B", Integer.valueOf(R.string.IDS_fitness_class_C001B));
        this.d.put("L001B", Integer.valueOf(R.string.IDS_fitness_class_L001B));
        this.d.put("L002B", Integer.valueOf(R.string.IDS_fitness_class_L002B));
        this.d.put("S001B", Integer.valueOf(R.string.IDS_fitness_class_S001B));
        this.d.put("S002B", Integer.valueOf(R.string.IDS_fitness_class_S002B));
        this.d.put("S003B", Integer.valueOf(R.string.IDS_fitness_class_S003B));
        this.d.put("S004B", Integer.valueOf(R.string.IDS_fitness_class_S004B));
        this.d.put("S005B", Integer.valueOf(R.string.IDS_fitness_class_S005B));
        this.d.put("W001B", Integer.valueOf(R.string.IDS_fitness_class_W001B));
        this.d.put("W002B", Integer.valueOf(R.string.IDS_fitness_class_W002B));
        this.d.put("W003B", Integer.valueOf(R.string.IDS_fitness_class_W003B));
        this.d.put("W004B", Integer.valueOf(R.string.IDS_fitness_class_W004B));
        this.d.put("W9001", Integer.valueOf(R.string.IDS_fitness_class_W9001));
        this.d.put("W9002", Integer.valueOf(R.string.IDS_fitness_class_W9002));
        this.d.put("W9003", Integer.valueOf(R.string.IDS_fitness_class_W9003));
        this.d.put("W9004", Integer.valueOf(R.string.IDS_fitness_class_W9004));
        this.d.put("W9005", Integer.valueOf(R.string.IDS_fitness_class_W9005));
        this.d.put("W9006", Integer.valueOf(R.string.IDS_fitness_class_W9006));
        this.d.put("W9007", Integer.valueOf(R.string.IDS_fitness_class_W9007));
        this.d.put("W9008", Integer.valueOf(R.string.IDS_fitness_class_W9008));
        this.d.put("W9009", Integer.valueOf(R.string.IDS_fitness_class_W9009));
        this.d.put("W9010", Integer.valueOf(R.string.IDS_fitness_class_W9010));
        c();
    }

    private void c() {
        b();
        a();
        e();
    }

    private void e() {
        this.d.put("032B", Integer.valueOf(R.string.IDS_fitness_action_032B));
        this.d.put("035B", Integer.valueOf(R.string.IDS_fitness_action_035B));
        this.d.put("051B", Integer.valueOf(R.string.IDS_fitness_action_051B));
        this.d.put("052B", Integer.valueOf(R.string.IDS_fitness_action_052B));
        this.d.put("053B", Integer.valueOf(R.string.IDS_fitness_action_053B));
        this.d.put("054B", Integer.valueOf(R.string.IDS_fitness_action_054B));
        this.d.put("030B", Integer.valueOf(R.string.IDS_fitness_action_030B));
        this.d.put("038B", Integer.valueOf(R.string.IDS_fitness_action_038B));
        this.d.put("046B", Integer.valueOf(R.string.IDS_fitness_action_046B));
        this.d.put("047B", Integer.valueOf(R.string.IDS_fitness_action_047B));
        this.d.put("042B", Integer.valueOf(R.string.IDS_fitness_action_042B));
        this.d.put("043B", Integer.valueOf(R.string.IDS_fitness_action_043B));
        this.d.put("119B", Integer.valueOf(R.string.IDS_fitness_action_119B));
        this.d.put("120B", Integer.valueOf(R.string.IDS_fitness_action_120B));
        this.d.put("112B", Integer.valueOf(R.string.IDS_fitness_action_112B));
        this.d.put("113B", Integer.valueOf(R.string.IDS_fitness_action_113B));
        this.d.put("320B", Integer.valueOf(R.string.IDS_fitness_action_320B));
        this.d.put("321B", Integer.valueOf(R.string.IDS_fitness_action_321B));
        this.d.put("033B", Integer.valueOf(R.string.IDS_fitness_action_033B));
        this.d.put("322B", Integer.valueOf(R.string.IDS_fitness_action_322B));
        this.d.put("323B", Integer.valueOf(R.string.IDS_fitness_action_323B));
        this.d.put("324B", Integer.valueOf(R.string.IDS_fitness_action_324B));
        this.d.put("316B", Integer.valueOf(R.string.IDS_fitness_action_316B));
        this.d.put("317B", Integer.valueOf(R.string.IDS_fitness_action_317B));
        this.d.put("330B", Integer.valueOf(R.string.IDS_fitness_action_330B));
        this.d.put("331B", Integer.valueOf(R.string.IDS_fitness_action_331B));
        this.d.put("059B", Integer.valueOf(R.string.IDS_fitness_action_059B));
        this.d.put("060B", Integer.valueOf(R.string.IDS_fitness_action_060B));
        this.d.put("318B", Integer.valueOf(R.string.IDS_fitness_action_318B));
        this.d.put("319B", Integer.valueOf(R.string.IDS_fitness_action_319B));
        this.d.put("031B", Integer.valueOf(R.string.IDS_fitness_action_031B));
        this.d.put("022B", Integer.valueOf(R.string.IDS_fitness_action_022B));
        this.d.put("048B", Integer.valueOf(R.string.IDS_fitness_action_048B));
        this.d.put("062B", Integer.valueOf(R.string.IDS_fitness_action_062B));
        this.d.put("061B", Integer.valueOf(R.string.IDS_fitness_action_061B));
        this.d.put("039B", Integer.valueOf(R.string.IDS_fitness_action_039B));
        this.d.put("049B", Integer.valueOf(R.string.IDS_fitness_action_049B));
        this.d.put("050B", Integer.valueOf(R.string.IDS_fitness_action_050B));
        this.d.put("057B", Integer.valueOf(R.string.IDS_fitness_action_057B));
        this.d.put("058B", Integer.valueOf(R.string.IDS_fitness_action_058B));
    }

    private void a() {
        this.d.put("RD001", Integer.valueOf(R.string.IDS_rate_zone_warmup_threshold));
        this.d.put("RD002", Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id5));
        this.d.put("RD003", Integer.valueOf(R.string.IDS_sug_ai_run_plan_walk));
        this.d.put("RD004", Integer.valueOf(R.string.IDS_sug_ai_run_plan_rest));
        this.d.put("RD005", Integer.valueOf(R.string.IDS_sug_ai_run_plan_relax));
        this.d.put("RD006", Integer.valueOf(R.string.IDS_sug_ai_run_plan_walk_slowly));
        this.d.put("RD007", Integer.valueOf(R.string.IDS_sug_ai_run_plan_quick_walk));
        this.d.put("RD008", Integer.valueOf(R.string.IDS_sug_ai_run_plan_jogging));
        this.d.put("RD009", Integer.valueOf(R.string.IDS_sug_ai_run_plan_medium_run));
        this.d.put("RD010", Integer.valueOf(R.string.IDS_sug_ai_run_plan_quick_run));
        this.d.put("RD011", Integer.valueOf(R.string.IDS_sug_ai_run_plan_easy_walk));
        this.d.put("RD012", Integer.valueOf(R.string.IDS_sug_ai_run_plan_sprint_run));
        this.d.put("RD013", Integer.valueOf(R.string.IDS_sug_cardio_basic_run));
        this.d.put("RD014", Integer.valueOf(R.string.IDS_sug_aerobic_adveanced_run));
        this.d.put("RD015", Integer.valueOf(R.string.IDS_sug_lactate_threshold_run));
        this.d.put("RD016", Integer.valueOf(R.string.IDS_sug_anaerobic_endurance_run));
        this.d.put("RD017", Integer.valueOf(R.string.IDS_sug_high_intensity_run));
        this.d.put("RD018", Integer.valueOf(R.string.IDS_sug_trot_run));
    }

    private void b() {
        this.d.put("001B", Integer.valueOf(R.string.IDS_fitness_action_001B));
        this.d.put("003B", Integer.valueOf(R.string.IDS_fitness_action_003B));
        this.d.put("007B", Integer.valueOf(R.string.IDS_fitness_action_007B));
        this.d.put("012B", Integer.valueOf(R.string.IDS_fitness_action_012B));
        this.d.put("015B", Integer.valueOf(R.string.IDS_fitness_action_015B));
        this.d.put("018B", Integer.valueOf(R.string.IDS_fitness_action_018B));
        this.d.put("023B", Integer.valueOf(R.string.IDS_fitness_action_023B));
        this.d.put("026B", Integer.valueOf(R.string.IDS_fitness_action_026B));
        this.d.put("028B", Integer.valueOf(R.string.IDS_fitness_action_028B));
        this.d.put("034B", Integer.valueOf(R.string.IDS_fitness_action_034B));
        this.d.put("040B", Integer.valueOf(R.string.IDS_fitness_action_040B));
        this.d.put("231B", Integer.valueOf(R.string.IDS_fitness_action_231B));
        this.d.put("234B", Integer.valueOf(R.string.IDS_fitness_action_234B));
        this.d.put("217B", Integer.valueOf(R.string.IDS_fitness_action_217B));
        this.d.put("198B", Integer.valueOf(R.string.IDS_fitness_action_198B));
        this.d.put("201B", Integer.valueOf(R.string.IDS_fitness_action_201B));
        this.d.put("199B", Integer.valueOf(R.string.IDS_fitness_action_199B));
        this.d.put("207B", Integer.valueOf(R.string.IDS_fitness_action_207B));
        this.d.put("213B", Integer.valueOf(R.string.IDS_fitness_action_213B));
        this.d.put("171B", Integer.valueOf(R.string.IDS_fitness_action_171B));
        this.d.put("172B", Integer.valueOf(R.string.IDS_fitness_action_172B));
        this.d.put("175B", Integer.valueOf(R.string.IDS_fitness_action_175B));
        this.d.put("193B", Integer.valueOf(R.string.IDS_fitness_action_193B));
        this.d.put("176B", Integer.valueOf(R.string.IDS_fitness_action_176B));
        this.d.put("190B", Integer.valueOf(R.string.IDS_fitness_action_190B));
        this.d.put("197B", Integer.valueOf(R.string.IDS_fitness_action_197B));
        this.d.put("146B", Integer.valueOf(R.string.IDS_fitness_action_146B));
        this.d.put("152B", Integer.valueOf(R.string.IDS_fitness_action_152B));
        this.d.put("153B", Integer.valueOf(R.string.IDS_fitness_action_153B));
        this.d.put("140B", Integer.valueOf(R.string.IDS_fitness_action_140B));
        this.d.put("141B", Integer.valueOf(R.string.IDS_fitness_action_141B));
        this.d.put("137B", Integer.valueOf(R.string.IDS_fitness_action_137B));
        this.d.put("136B", Integer.valueOf(R.string.IDS_fitness_action_136B));
        this.d.put("129B", Integer.valueOf(R.string.IDS_fitness_action_129B));
        this.d.put("288B", Integer.valueOf(R.string.IDS_fitness_action_288B));
        this.d.put("289B", Integer.valueOf(R.string.IDS_fitness_action_289B));
        this.d.put("290B", Integer.valueOf(R.string.IDS_fitness_action_290B));
        this.d.put("291B", Integer.valueOf(R.string.IDS_fitness_action_291B));
        this.d.put("292B", Integer.valueOf(R.string.IDS_fitness_action_292B));
        this.d.put("055B", Integer.valueOf(R.string.IDS_fitness_action_055B));
        this.d.put("056B", Integer.valueOf(R.string.IDS_fitness_action_056B));
        this.d.put("041B", Integer.valueOf(R.string.IDS_fitness_action_041B));
        this.d.put("226B", Integer.valueOf(R.string.IDS_fitness_action_226B));
        this.d.put("013B", Integer.valueOf(R.string.IDS_fitness_action_013B));
    }

    public int b(String str) {
        if (TextUtils.isEmpty(str) || !this.d.containsKey(str)) {
            LogUtil.j("ClassAndActionName", "getName id is empty");
            return 0;
        }
        return this.d.get(str).intValue();
    }
}
