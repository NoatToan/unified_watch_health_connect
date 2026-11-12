package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.model.FitnessShareRecord;
import health.compact.a.UnitUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class hdq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gyd f36483b;
    private FitnessShareRecord d;
    private List<gyk> e = new ArrayList();

    public hdq(Context context, FitnessShareRecord fitnessShareRecord) {
        this.f36482a = context;
        this.d = fitnessShareRecord;
    }

    public void b() {
        this.f36483b = new gyd();
        HashMap map = new HashMap();
        b(map);
        d(map);
        c(map);
        a();
        c();
        a(map);
        e(map);
        e();
        this.f36483b.e(map);
        this.f36483b.d(this.e);
    }

    private void b(Map<String, String> map) {
        FitnessShareRecord fitnessShareRecord = this.d;
        if (fitnessShareRecord != null) {
            String strA = iec.a(fitnessShareRecord.getLevelCount());
            String exerciseName = this.d.getExerciseName();
            String str = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "Md")).format(Long.valueOf(this.d.getExerciseTime()));
            int deviceType = this.d.getDeviceType();
            Context context = this.f36482a;
            String strD = een.d(deviceType, context, context.getPackageName());
            map.put("fitness_course_level", strA);
            map.put("fitness_course_name", exerciseName);
            map.put("sport_date", str);
            map.put("sport_time", String.valueOf(this.d.getExerciseTime()));
            map.put("sport_source", strD);
            map.put("sport_type", exerciseName);
        }
    }

    private void a() {
        float activeCalorie = this.d.getActiveCalorie();
        if (Math.abs(activeCalorie) < 1.0E-6d) {
            return;
        }
        gyk gykVar = new gyk("ACTIVE_CALORIES", qre.f(R.string.IDS_track_active_calories), ped.f(ped.b(activeCalorie)), qre.f(R.string.sug_finess_kcal1), qre.f(R.string.IDS_track_active_calories_kcal));
        e(gykVar);
        this.e.add(gykVar);
    }

    private void e(gyk gykVar) {
        haj.a aVarC;
        if (gykVar == null || (aVarC = haj.c(gykVar.e())) == null) {
            return;
        }
        gykVar.a(aVarC.e());
        gykVar.a(aVarC.a());
    }

    private void c() {
        float percent = this.d.getPercent();
        if (percent > 100.0f) {
            percent = 100.0f;
        }
        String strE = UnitUtil.e(percent, 2, 0);
        String string = this.f36482a.getString(R.string.sug_coach_rate);
        gyk gykVar = new gyk("FINISH_PERCENT", string, strE, "", string);
        e(gykVar);
        this.e.add(gykVar);
    }

    private void e() {
        int heartRate = this.d.getHeartRate();
        if (heartRate <= 0) {
            return;
        }
        gyk gykVar = new gyk(ObserveLabels.HEART_RATE, qre.f(R.string.IDS_motiontrack_show_detail_avrageheartrate), UnitUtil.e(heartRate, 1, 0), qre.f(R.string.IDS_main_watch_heart_rate_unit_string), qre.f(R.string.IDS_track_average_heart_rate_with_unit));
        e(gykVar);
        this.e.add(gykVar);
    }

    private void c(Map<String, String> map) {
        FitnessShareRecord fitnessShareRecord = this.d;
        if (fitnessShareRecord != null) {
            String strF = ped.f(ped.b(fitnessShareRecord.getCalorie()));
            String strF2 = qre.f(R.string.sug_finess_kcal1);
            String strF3 = qre.f(R.string.IDS_track_total_calorie);
            String strF4 = qre.f(com.huawei.ui.commonui.R.string.IDS_track_total_calorie_kcal);
            map.put("calorie", strF);
            map.put("calorie_unit", strF2);
            map.put("calorie_title", strF3);
            map.put("calorie_title_with_unit", qre.f(R.string.IDS_track_total_calories_kcal));
            gyk gykVar = new gyk("CALORIES", strF3, strF, strF2, strF4);
            e(gykVar);
            this.e.add(gykVar);
        }
    }

    private void d(Map<String, String> map) {
        FitnessShareRecord fitnessShareRecord = this.d;
        if (fitnessShareRecord != null) {
            int duration = (int) fitnessShareRecord.getDuration();
            String strI = ped.i(duration);
            String string = this.f36482a.getString(com.huawei.health.basefitnessadvice.R.string.sug_coach_duration);
            String string2 = this.f36482a.getString(R.string.sug_unit_MIN);
            String string3 = this.f36482a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_motiontrack_history_sum_catetory_time_unit_min);
            map.put("duration", strI);
            map.put("duration_unit", string2);
            map.put("duration_title", string);
            map.put("duration_title_with_unit", string3);
            String strE = UnitUtil.e((int) TimeUnit.MILLISECONDS.toSeconds(duration));
            String strF = qre.f(R.string.IDS_motiontrack_show_detail_sporttime);
            gyk gykVar = new gyk("TIME", strF, strE, "", strF);
            e(gykVar);
            this.e.add(gykVar);
        }
    }

    private void a(Map<String, String> map) {
        FitnessShareRecord fitnessShareRecord = this.d;
        if (fitnessShareRecord != null) {
            int actionCount = fitnessShareRecord.getActionCount();
            String strE = e(actionCount);
            String string = this.f36482a.getString(R.string.sug_fitness_traind_act);
            String quantityString = this.f36482a.getResources().getQuantityString(R.plurals.sug_share_group, actionCount, "");
            String strF = qre.f(R.string.IDS_share_action_group);
            map.put("fitness_action_count", strE);
            map.put("fitness_action_count_title", string);
            map.put("fitness_action_count_unit", quantityString);
            map.put("fitness_action_count_title_with_unit", strF);
            gyk gykVar = new gyk("FINISHED_GROUPS", string, strE, quantityString, strF);
            e(gykVar);
            this.e.add(gykVar);
        }
    }

    private String e(int i) {
        if (i > 0) {
            return String.valueOf(i);
        }
        return this.f36482a.getString(com.huawei.ui.commonui.R.string.IDS_motiontrack_show_invalid_data);
    }

    private void e(Map<String, String> map) {
        FitnessShareRecord fitnessShareRecord = this.d;
        if (fitnessShareRecord != null) {
            int exerciseTimes = fitnessShareRecord.getExerciseTimes();
            String strE = e(exerciseTimes);
            String string = this.f36482a.getString(com.huawei.ui.commonui.R.string.IDS_hwh_motiontrack_sport_fitness_times);
            String quantityString = this.f36482a.getResources().getQuantityString(R.plurals.IDS_plugin_fitnessadvice_times, exerciseTimes, "");
            String string2 = this.f36482a.getResources().getString(R.string.IDS_share_train_time);
            map.put("training_times", strE);
            map.put("training_times_title", string);
            map.put("training_times_title_with_unit", string2);
            map.put("training_times_unit", quantityString);
            gyk gykVar = new gyk("TRAINING_ACTION_COUNT", string, strE, quantityString, string2);
            e(gykVar);
            this.e.add(gykVar);
        }
    }

    public gyd d() {
        return this.f36483b;
    }
}
