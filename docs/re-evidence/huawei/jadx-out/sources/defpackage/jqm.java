package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import com.huawei.hwfoundationmodel.trackmodel.ValueSequence;
import com.huawei.pluginsport.ftp.PowerZoneConfigHelper;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jqm {
    public static <T extends TimeSequence & ValueSequence> void d(List<T> list, PowerZoneConfigHelper powerZoneConfigHelper, MotionPathSimplify motionPathSimplify, boolean z) {
        if (powerZoneConfigHelper == null || motionPathSimplify == null || njy.e(list)) {
            ReleaseLogUtil.e("Track_PowerZoneStatisticUtils", "requestPaceZoneDuration null");
            return;
        }
        int iE = xjm.e(list, motionPathSimplify.requestStartTime());
        Integer[] numArr = new Integer[7];
        Arrays.fill((Object[]) numArr, (Object) 0);
        a(list, numArr, iE, powerZoneConfigHelper);
        if (z) {
            motionPathSimplify.addExtendDataMap("recoveryTime", String.valueOf(numArr[0]));
            motionPathSimplify.addExtendDataMap("aerobicTime", String.valueOf(numArr[1]));
            motionPathSimplify.addExtendDataMap("rhythmTime", String.valueOf(numArr[2]));
            motionPathSimplify.addExtendDataMap("lactateTime", String.valueOf(numArr[3]));
            motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_MAX_OXYGEN_TIME, String.valueOf(numArr[4]));
            motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_ANAEROBIC_TIME, String.valueOf(numArr[5]));
            motionPathSimplify.addExtendDataMap("spurtTime", String.valueOf(numArr[6]));
            return;
        }
        motionPathSimplify.addExtendDataMap("analogRecoveryTime", String.valueOf(numArr[0]));
        motionPathSimplify.addExtendDataMap("analogAerobicTime", String.valueOf(numArr[1]));
        motionPathSimplify.addExtendDataMap("analogRhythmTime", String.valueOf(numArr[2]));
        motionPathSimplify.addExtendDataMap("analogLactateTime", String.valueOf(numArr[3]));
        motionPathSimplify.addExtendDataMap("analogMaxOxygenTime", String.valueOf(numArr[4]));
        motionPathSimplify.addExtendDataMap("analogAnaerobicTime", String.valueOf(numArr[5]));
        motionPathSimplify.addExtendDataMap("analogSpurtTime", String.valueOf(numArr[6]));
    }

    private static <T extends TimeSequence & ValueSequence> void a(List<T> list, Integer[] numArr, int i, PowerZoneConfigHelper powerZoneConfigHelper) {
        int iE;
        if (njy.e(list)) {
            ReleaseLogUtil.a("Track_PowerZoneStatisticUtils", "paceList is null");
            return;
        }
        if (powerZoneConfigHelper == null) {
            return;
        }
        for (T t : list) {
            if (t != null && (iE = powerZoneConfigHelper.e(t.acquireValue())) != -1 && njy.c(numArr, iE)) {
                numArr[iE] = Integer.valueOf(numArr[iE].intValue() + i);
            }
        }
    }
}
