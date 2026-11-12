package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes28.dex */
public class fkq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<String> f34140c = Collections.unmodifiableSet(new HashSet<String>() { // from class: fkq.5
        private static final long serialVersionUID = -4982539112710710368L;

        {
            add("exercise_duration");
            add("distance");
            add("calorie");
            add("speed");
            add("pace");
            add("hr");
            add("avg_speed");
            add("avg_pace");
            add("total_rise");
            add("total_descend");
            add("altitude");
            add("aerobic_te");
            add("anaerobic_te");
            add("performance_condition");
            add("operator_type");
            add("running_course_number");
            add("running_course_action_count");
            add("running_course_action_id");
            add("running_course_left_type");
            add("running_course_content");
            add("step_cadence");
            add("step");
            add("linkage_cadence");
            add("linkage_pulp_frequency");
            add("linkage_slurry");
            add("linkage_power");
            add("linkage_resistance_level");
            add("linkage_resistance_level_max");
            add("linkage_resistance_level_min");
            add(HwExerciseConstants.JSON_NAME_ACTIVECALORIE);
            add("linkage_slope");
            add("linkage_analog_power");
            add("linkage_real_avg_power");
            add("linkage_real_avg_analog_power");
            add("linkage_analog_cadence");
            add("linkage_avg_cadence");
            add("linkage_avg_analog_cadence");
            add("linkage_three_sec_power");
            add("linkage_three_sec_analog_power");
            add("linkage_max_speed");
        }
    });
    public static final Map<String, Integer> e = Collections.unmodifiableMap(new HashMap<String, Integer>() { // from class: fkq.2
        {
            put("exercise_duration", 50004396);
            put("distance", 50004765);
            put("calorie", 50004829);
            put("speed", 50004799);
            put("pace", 50004979);
            put("hr", 50004838);
            put("avg_speed", 50004858);
            put("avg_pace", 50004872);
            put("total_rise", 50004395);
            put("total_descend", 50004774);
            put("altitude", 50004286);
            put("aerobic_te", 50004172);
            put("anaerobic_te", 50004881);
            put("performance_condition", 50004011);
            put("operator_type", 50004770);
            put("running_course_number", 50004632);
            put("running_course_action_count", 50004251);
            put("running_course_action_id", 50004561);
            put("running_course_left_type", 50004992);
            put("running_course_content", 50004187);
            put("step_cadence", 50004721);
            put("step", 50004684);
            put("linkage_cadence", 50004254);
            put("linkage_pulp_frequency", 50004184);
            put("linkage_slurry", 50004232);
            put("linkage_power", 50004757);
            put("linkage_resistance_level", 50004861);
            put("linkage_resistance_level_max", 50004961);
            put("linkage_resistance_level_min", 50004199);
            put(HwExerciseConstants.JSON_NAME_ACTIVECALORIE, 50004617);
            put("linkage_slope", 50004934);
            put("linkage_analog_power", 50004749);
            put("linkage_real_avg_power", 50004559);
            put("linkage_real_avg_analog_power", 50004567);
            put("linkage_analog_cadence", 50004151);
            put("linkage_avg_cadence", 50004439);
            put("linkage_avg_analog_cadence", 50004929);
            put("linkage_three_sec_power", 50004086);
            put("linkage_three_sec_analog_power", 50004826);
            put("linkage_max_speed", 50004579);
        }
    });

    private static boolean d(int i) {
        return i != Integer.MIN_VALUE;
    }

    public static njw c(String str, oax oaxVar) {
        njw njwVar = new njw();
        njwVar.c(str + "#ANDROID21");
        njwVar.a(((long) oaxVar.s()) * 1000);
        if (d(oaxVar.y())) {
            njwVar.ab(oaxVar.y());
        }
        if (d(oaxVar.ae())) {
            njwVar.p(oaxVar.ae());
        }
        if (d(oaxVar.m())) {
            njwVar.k(oaxVar.m());
        }
        if (d(oaxVar.u())) {
            njwVar.o(oaxVar.u());
        }
        njwVar.n(oaxVar.w());
        njwVar.w(oaxVar.an());
        njwVar.f(oaxVar.o());
        if (d(oaxVar.af())) {
            njwVar.b(oaxVar.af());
        }
        njwVar.e(oaxVar.l());
        njwVar.l(oaxVar.k());
        if (d(oaxVar.av())) {
            njwVar.ad(oaxVar.av());
        }
        if (d(oaxVar.ar())) {
            njwVar.x(oaxVar.ar());
        }
        if (d(oaxVar.aq())) {
            njwVar.v(oaxVar.aq());
        }
        njwVar.c(oaxVar.d());
        njwVar.d(oaxVar.e());
        njwVar.s(oaxVar.ag());
        njwVar.c(((long) oaxVar.ap()) * 1000);
        njwVar.q(oaxVar.ai());
        njwVar.d(oaxVar.aj());
        njwVar.b(oaxVar.ab());
        njwVar.a(oaxVar.a());
        if (d(oaxVar.c())) {
            njwVar.b(oaxVar.c());
        }
        if (d(oaxVar.h())) {
            njwVar.g(oaxVar.h());
        }
        if (d(oaxVar.am())) {
            njwVar.t(oaxVar.am());
        }
        if (d(oaxVar.ah())) {
            njwVar.r(oaxVar.ah());
        }
        if (d(oaxVar.f())) {
            njwVar.e(oaxVar.f());
        }
        if (d(oaxVar.n())) {
            njwVar.j(oaxVar.n());
        }
        if (d(oaxVar.j())) {
            njwVar.h(oaxVar.j());
        }
        if (d(oaxVar.as())) {
            njwVar.u(oaxVar.as());
        }
        if (d(oaxVar.ao())) {
            njwVar.y(oaxVar.ao());
        }
        if (d(oaxVar.i())) {
            njwVar.i(oaxVar.i());
        }
        if (d(oaxVar.z())) {
            njwVar.m(oaxVar.z());
        }
        return njwVar;
    }
}
