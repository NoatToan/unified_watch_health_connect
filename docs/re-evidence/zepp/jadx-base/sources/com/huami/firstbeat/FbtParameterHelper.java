package com.huami.firstbeat;

import com.huami.firstbeat.dbproxy.EteResultProxy;
import com.huami.firstbeat.ete.EteResultWrapper;
import com.huami.firstbeat.logproxy.FbtLogger;
import fi.firstbeat.common.FbtFixedMath;
import fi.firstbeat.common.FbtParameters;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class FbtParameterHelper {

    public static class b {
        private static final FbtParameterHelper a = new FbtParameterHelper();

        private b() {
        }
    }

    private int[] a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -28);
        List<EteResultWrapper> eteResultsByTime = EteResultProxy.getInstance().getEteResultsByTime(calendar.getTimeInMillis() / 1000, jCurrentTimeMillis, true);
        if (eteResultsByTime == null || eteResultsByTime.isEmpty()) {
            return new int[]{0, 0, 0};
        }
        int i = eteResultsByTime.get(0).getEteResults().maximalMet;
        long endTime = (eteResultsByTime.get(0).getEndTime() + ((long) (eteResultsByTime.get(0).getEteResults().recoveryTime * 60))) - jCurrentTimeMillis;
        int i2 = endTime > 0 ? (int) (endTime / 60) : 0;
        String str = "";
        int i3 = 0;
        int i4 = 0;
        for (EteResultWrapper eteResultWrapper : eteResultsByTime) {
            String str2 = simpleDateFormat.format(new Date(eteResultWrapper.getTrackId() * 1000));
            if (!str2.equals(str)) {
                i3++;
                str = str2;
            }
            i4 += eteResultWrapper.getEteResults().trainingLoadPeak;
        }
        return new int[]{i, i3 <= 6 ? i4 * 4 : (i4 * 28) / (i3 + 1), i2};
    }

    public static FbtParameterHelper getInstance() {
        return b.a;
    }

    public FbtParameters initFbtParameters(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        if (i < 8 || i > 110) {
            FbtLogger.w2f("FbtParameter", "INVALID_AGE:" + i);
            return null;
        }
        if (i2 < 100 || i2 > 250) {
            FbtLogger.w2f("FbtParameter", "INVALID_HEIGHT:" + i2);
            return null;
        }
        if (i3 < 35 || i3 > 250) {
            FbtLogger.w2f("FbtParameter", "INVALID_WEIGHT:" + i3);
            return null;
        }
        if (i5 < 100 || i5 > 240) {
            FbtLogger.w2f("FbtParameter", "INVALID_MAX_HR:" + i5);
            return null;
        }
        if (i6 < 30 || i6 > 80) {
            FbtLogger.w2f("FbtParameter", "INVALID_MIN_HR:" + i6);
            return null;
        }
        FbtParameters fbtParameters = new FbtParameters();
        fbtParameters.activityClass = 50;
        fbtParameters.age = i;
        fbtParameters.height = i2;
        fbtParameters.weight = i3;
        fbtParameters.gender = i4 == 0 ? FbtParameters.Gender.FEMALE : FbtParameters.Gender.MALE;
        fbtParameters.maximalHr = i5;
        fbtParameters.minimalHr = i6;
        if (z) {
            int[] iArrA = a();
            fbtParameters.maximalMet = iArrA[0];
            fbtParameters.recoveryTime = iArrA[2];
            fbtParameters.monthlyLoad = FbtFixedMath.fxtoi(iArrA[1]);
        }
        FbtLogger.w2f("FbtParameter", "ActivityClass:" + fbtParameters.activityClass + ",age:" + fbtParameters.age + ",height:" + fbtParameters.height + ",weight:" + fbtParameters.weight + ",gender:" + fbtParameters.gender.name() + ",maximalHr:" + fbtParameters.maximalHr + ", minimalHr:" + fbtParameters.minimalHr + ", maximalMet:" + fbtParameters.maximalMet + ", recoveryTime:" + fbtParameters.recoveryTime + ", monthlyLoad:" + fbtParameters.monthlyLoad);
        return fbtParameters;
    }

    private FbtParameterHelper() {
    }
}
