package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jxi {
    public static boolean c(MotionPathSimplify motionPathSimplify) {
        boolean z = false;
        if (motionPathSimplify == null) {
            LogUtil.a("Track_SportWeatherUtils", "motionPathSimplify is null");
            return false;
        }
        Map<String, String> mapRequestExtendDataMap = motionPathSimplify.requestExtendDataMap();
        if (mapRequestExtendDataMap != null && mapRequestExtendDataMap.containsKey(HwExerciseConstants.JSON_NAME_WORKOUT_WEATHER) && mapRequestExtendDataMap.containsKey(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE) && mapRequestExtendDataMap.containsKey("relativeHumidity") && mapRequestExtendDataMap.containsKey("windDirection") && mapRequestExtendDataMap.containsKey("windSpeed")) {
            z = true;
        }
        LogUtil.a("Track_SportWeatherUtils", "hashWeatherData:", Boolean.valueOf(z));
        return z;
    }
}
