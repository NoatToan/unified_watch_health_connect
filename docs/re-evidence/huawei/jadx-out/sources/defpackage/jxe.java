package defpackage;

import android.content.Context;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginfitnessadvice.AIActionBundle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class jxe {
    public static void e(int i, AIActionBundle aIActionBundle, WorkoutRecord workoutRecord) {
        HashMap map = new HashMap(12);
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        if (aIActionBundle != null) {
            map.put("action_id", aIActionBundle.getActionId());
            map.put("action_name", aIActionBundle.getActionName());
            map.put("action_type", aIActionBundle.getBodyName());
            map.put(WorkoutRecord.Extend.COURSE_TARGET_TYPE, e(aIActionBundle.getTargetType()));
            map.put(WorkoutRecord.Extend.COURSE_TARGET_VALUE, Float.valueOf(aIActionBundle.getTargetValue()));
        }
        if (workoutRecord != null) {
            map.put("finishRate", Float.valueOf(workoutRecord.acquireFinishRate()));
            map.put("ranking", Integer.valueOf(workoutRecord.putCurRank()));
        }
        idy.b(AnalyticsValue.AI_ACTION_TRAIN_END_EVENT_VALUE.value(), map);
    }

    public static void a(int i, AIActionBundle aIActionBundle) {
        HashMap map = new HashMap(11);
        map.put("event", Integer.valueOf(i));
        if (aIActionBundle != null) {
            map.put("action_id", aIActionBundle.getActionId());
            map.put("action_name", aIActionBundle.getActionName());
            map.put("type", aIActionBundle.getBodyName());
            map.put(WorkoutRecord.Extend.COURSE_TARGET_TYPE, e(aIActionBundle.getTargetType()));
            map.put(WorkoutRecord.Extend.COURSE_TARGET_VALUE, Float.valueOf(aIActionBundle.getTargetValue()));
            map.put(WebViewHelp.BI_KEY_PULL_FROM, aIActionBundle.getPullFrom());
            map.put("resourceId", aIActionBundle.getResourceId());
            map.put("resourceName", aIActionBundle.getResourceName());
            map.put("pullOrder", aIActionBundle.getPullOrder());
        }
        idy.b(AnalyticsValue.HEALTH_FITNESS_ACTION_DETAIL_1130029.value(), map);
    }

    private static String e(int i) {
        if (i == -1) {
            return "free_model";
        }
        if (i == 1) {
            return "timed_mode";
        }
        if (i == 10) {
            return "fixed_number";
        }
        return "";
    }

    public static int c(int i) {
        Context context = BaseApplication.getContext();
        HashMap map = new HashMap(14);
        map.put(context.getString(R.string.IDS_posture_range_description_excellence), 1);
        map.put(context.getString(R.string.IDS_posture_range_description_excellent), 2);
        map.put(context.getString(R.string.IDS_posture_range_description_good), 3);
        map.put(context.getString(R.string.IDS_posture_range_description_normal), 4);
        map.put(context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_normal), 5);
        map.put(context.getString(R.string.IDS_posture_range_description_suboptimal), 6);
        map.put(context.getString(R.string.IDS_posture_range_description_not_ideal), 7);
        map.put(context.getString(R.string.IDS_posture_range_description_poor), 8);
        map.put(context.getString(R.string.IDS_bolt_balance_severely_long_right_side), 9);
        map.put(context.getString(R.string.IDS_bolt_balance_slightly_long_on_the_left), 10);
        map.put(context.getString(R.string.IDS_bolt_balance_slightly_long_on_the_right), 10);
        map.put(context.getString(R.string.IDS_bolt_balance_left_and_right), 11);
        map.put(context.getString(R.string.IDS_hwh_runningstyle_larger), 12);
        map.put(context.getString(R.string.IDS_hwh_runningstyle_smaller), 13);
        String string = context.getString(i);
        int iIntValue = map.containsKey(string) ? ((Integer) map.get(string)).intValue() : 0;
        LogUtil.a("Track_AiSportBiUtil", "shortTip ", string);
        map.clear();
        return iIntValue;
    }
}
