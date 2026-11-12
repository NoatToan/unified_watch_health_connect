package defpackage;

import android.util.Pair;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes28.dex */
public class fgc {
    public static Pair<Integer, Integer> d(int i, int i2, Pair<Float, Float> pair, String str) {
        Pair<Integer, Integer> pair2;
        if (pair == null) {
            LogUtil.j("HRControl_BaseHeartRateControl", "getCourseZoneHeartRateScope courseZoneScope is null");
            return new Pair<>(0, 0);
        }
        LogUtil.a("HRControl_BaseHeartRateControl", "getCourseZoneHeartRateScope restHeartRate = ", Integer.valueOf(i), ", maxHeartRate = ", Integer.valueOf(i2), ", courseZoneScope = ", pair.toString(), ", courseZoneScopeType = ", str);
        float f = i;
        float f2 = i2 - i;
        int iFloatValue = (int) ((((Float) pair.first).floatValue() * f2) + f);
        int iFloatValue2 = (int) (f + (f2 * ((Float) pair.second).floatValue()));
        int i3 = iFloatValue2 - iFloatValue;
        if (i3 > 25 || i3 < 10) {
            int i4 = (iFloatValue2 + iFloatValue) / 2;
            pair2 = new Pair<>(Integer.valueOf(i4 - 10), Integer.valueOf(i4 + 10));
        } else {
            pair2 = new Pair<>(Integer.valueOf(iFloatValue), Integer.valueOf(iFloatValue2));
        }
        LogUtil.a("HRControl_BaseHeartRateControl", "getCourseZoneHeartRateScope courseZoneHeartRateScope = ", pair2.toString());
        return pair2;
    }

    public static int a(Pair<Integer, Integer> pair) {
        if (pair == null) {
            LogUtil.j("HRControl_BaseHeartRateControl", "getCourseZoneTargetHeartRate courseZoneHeartRateScope is null");
            return 0;
        }
        LogUtil.a("HRControl_BaseHeartRateControl", "getCourseZoneTargetHeartRate courseZoneHeartRateScope = ", pair.toString());
        return (((Integer) pair.first).intValue() + ((Integer) pair.second).intValue()) / 2;
    }
}
