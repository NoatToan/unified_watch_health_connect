package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.util.Pair;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class jql {
    public static int b(float[] fArr) {
        if (fArr == null) {
            LogUtil.a("SkippingPerformanceUtils", "getPerformanceOfBestIndex, ranks is null");
            return -1;
        }
        float[] fArr2 = new float[5];
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        Arrays.sort(fArr2);
        LogUtil.a("SkippingPerformanceUtils", "ranks = ", Arrays.toString(fArr), ", tempRanks = ", Arrays.toString(fArr2));
        for (int i = 0; i < fArr.length; i++) {
            if (fArr[i] == fArr2[4]) {
                LogUtil.a("SkippingPerformanceUtils", "The index of the best performance score is ", Integer.valueOf(i));
                return i;
            }
        }
        return -1;
    }

    public static Pair<Integer, String> c(int i) {
        int i2;
        String string;
        int i3;
        String quantityString;
        Context context = BaseApplication.getContext();
        Resources resources = context.getResources();
        if (i != 0) {
            string = "";
            i2 = 0;
            if (i == 1) {
                i3 = R.string.IDS_rope_performance_endurance_best_rank;
                quantityString = resources.getQuantityString(R.plurals.IDS_hwh_motiontrack_start_track_sport_min, 0, "");
            } else if (i == 2) {
                i3 = R.string.IDS_rope_performance_continuity_best_rank;
                quantityString = resources.getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, 0, "");
            } else if (i == 3) {
                i3 = R.string.IDS_rope_performance_load_best_rank;
                quantityString = resources.getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, 0, "");
            } else if (i == 4) {
                i3 = R.string.IDS_rope_performance_speed_endurance_best_rank;
                quantityString = resources.getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, 0, "");
            }
            i2 = i3;
            string = quantityString;
        } else {
            i2 = R.string.IDS_rope_performance_speed_best_rank;
            string = context.getString(R.string.IDS_indoor_skipper_number_minute);
        }
        return new Pair<>(Integer.valueOf(i2), string);
    }

    public static String a(int i) {
        int i2;
        if (i == 0) {
            i2 = R.string.IDS_rope_performance_speed_best_des;
        } else if (i == 1) {
            i2 = R.string.IDS_rope_performance_endurance_best_des;
        } else if (i == 2) {
            i2 = R.string.IDS_rope_performance_description;
        } else if (i == 3) {
            i2 = R.string.IDS_rope_performance_load_best_des;
        } else {
            i2 = i != 4 ? 0 : R.string.IDS_rope_performance_speed_endurance_best_des;
        }
        if (i2 == 0) {
            return "";
        }
        return BaseApplication.getContext().getString(i2);
    }
}
