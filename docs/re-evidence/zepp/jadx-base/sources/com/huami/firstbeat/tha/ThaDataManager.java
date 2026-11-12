package com.huami.firstbeat.tha;

import com.huami.firstbeat.FbtParameterHelper;
import com.huami.firstbeat.FbtTimeUtil;
import com.huami.firstbeat.dbproxy.EteResultProxy;
import com.huami.firstbeat.dbproxy.ThaResultProxy;
import com.huami.firstbeat.ete.EteResultWrapper;
import com.huami.firstbeat.logproxy.FbtLogger;
import fi.firstbeat.common.FbtException;
import fi.firstbeat.common.FbtFixedMath;
import fi.firstbeat.common.FbtParameters;
import fi.firstbeat.ete.EteResults;
import fi.firstbeat.tha.Tha;
import fi.firstbeat.tha.ThaExercise;
import fi.firstbeat.tha.ThaResults;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ThaDataManager {
    private static final String c = "ThaDataManager";
    private Tha a;
    private FbtParameters b;

    public static class b {
        private static final ThaDataManager a = new ThaDataManager();

        private b() {
        }
    }

    private ThaResults a(List<EteResultWrapper> list) {
        Calendar calendar = Calendar.getInstance();
        try {
            for (EteResultWrapper eteResultWrapper : list) {
                FbtLogger.i(c, "sub>>>> sport ete id:" + eteResultWrapper.getTrackId());
                if (eteResultWrapper.getEteResults() == null) {
                    FbtLogger.w2f(c, "sub ete data null:" + eteResultWrapper.getTrackId());
                } else if (FbtFixedMath.fxtoi(eteResultWrapper.getEteResults().trainingLoadPeak) <= 0) {
                    FbtLogger.w2f(c, "sub ete trainingLoadPeak invalid:" + eteResultWrapper.getEteResults().trainingLoadPeak);
                } else {
                    calendar.setTimeInMillis(eteResultWrapper.getTrackId() * 1000);
                    long datetimeId = Tha.getDatetimeId(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.get(11), calendar.get(12));
                    EteResults eteResults = eteResultWrapper.getEteResults();
                    this.a.addExercise(new ThaExercise(datetimeId, eteResults.recoveryTime, eteResults.maximalMet, eteResults.trainingLoadPeak, eteResultWrapper.getExerciseType() != 0 ? ThaExercise.ExerciseType.CYCLING : ThaExercise.ExerciseType.RUNNING));
                }
            }
            return this.a.getResults();
        } catch (FbtException e) {
            e.printStackTrace();
            FbtLogger.w2f(c, e.getMessage());
            return null;
        }
    }

    private void b(List<EteResultWrapper> list, EteResultWrapper eteResultWrapper, long j, boolean z) {
        int iDifferentDays = FbtTimeUtil.differentDays(eteResultWrapper.getTrackId() * 1000, 1000 * j);
        int i = 1;
        while (true) {
            if (z) {
                if (i > iDifferentDays) {
                    return;
                }
            } else if (i >= iDifferentDays) {
                return;
            }
            if (i == iDifferentDays) {
                list.add(c(eteResultWrapper, j));
            } else {
                list.add(c(eteResultWrapper, eteResultWrapper.getTrackId() + ((long) (86400 * i))));
            }
            i++;
        }
    }

    private EteResultWrapper c(EteResultWrapper eteResultWrapper, long j) {
        EteResultWrapper eteResultWrapper2 = new EteResultWrapper();
        eteResultWrapper2.setExerciseType(eteResultWrapper.getExerciseType());
        eteResultWrapper2.setTrackId(j);
        return eteResultWrapper2;
    }

    private List<EteResultWrapper> d() {
        EteResultWrapper eteResultWrapper;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ThaDataWrapper latestThaResult = ThaResultProxy.getInstance().getLatestThaResult();
        long jF = f(latestThaResult);
        boolean z = latestThaResult != null;
        List<EteResultWrapper> eteResultsByTime = EteResultProxy.getInstance().getEteResultsByTime(z ? 1 + jF : jF, jCurrentTimeMillis, false);
        ArrayList arrayList = new ArrayList();
        String str = c;
        if (!z && eteResultsByTime.isEmpty()) {
            FbtLogger.w2f(c, "un need to cal tha!");
            return arrayList;
        }
        int i = 0;
        EteResultWrapper eteResultWrapper2 = null;
        while (i < eteResultsByTime.size()) {
            EteResultWrapper eteResultWrapper3 = eteResultsByTime.get(i);
            if (i == eteResultsByTime.size() - 1) {
                arrayList.add(eteResultWrapper3);
                eteResultWrapper2 = eteResultWrapper3;
            } else {
                arrayList.add(eteResultWrapper3);
                b(arrayList, eteResultWrapper3, eteResultsByTime.get(i + 1).getTrackId(), false);
            }
            i++;
            str = str;
        }
        String str2 = str;
        if (eteResultWrapper2 == null) {
            List<EteResultWrapper> eteResultsByTime2 = EteResultProxy.getInstance().getEteResultsByTime(jF, jF, false);
            eteResultWrapper = eteResultsByTime2.isEmpty() ? null : eteResultsByTime2.get(0);
        } else {
            eteResultWrapper = eteResultWrapper2;
        }
        if (eteResultWrapper != null) {
            b(arrayList, eteResultWrapper, jCurrentTimeMillis, true);
        } else {
            FbtLogger.w2f(str2, "can't find tail ete");
        }
        if (arrayList.isEmpty()) {
            FbtLogger.w2f(str2, "empty additionList");
        }
        return arrayList;
    }

    private List<EteResultWrapper> e(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -38);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return EteResultProxy.getInstance().getEteResultsByTime(calendar.getTimeInMillis() / 1000, j, false);
    }

    private long f(ThaDataWrapper thaDataWrapper) {
        Calendar calendar = Calendar.getInstance();
        if (thaDataWrapper == null) {
            FbtLogger.w2f(c, "tha is null");
            calendar.setTimeInMillis(0L);
        } else {
            calendar.setTimeInMillis(thaDataWrapper.getTimeStamp() * 1000);
        }
        return calendar.getTimeInMillis() / 1000;
    }

    private boolean g(EteResultWrapper eteResultWrapper) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(eteResultWrapper.getTrackId() * 1000);
        long datetimeId = Tha.getDatetimeId(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.get(11), calendar.get(12));
        EteResults eteResults = eteResultWrapper.getEteResults();
        FbtParameters fbtParameters = this.b;
        fbtParameters.maximalMet = eteResults == null ? 0 : eteResults.maximalMet;
        try {
            this.a.setParameters(fbtParameters, datetimeId);
            return true;
        } catch (FbtException e) {
            e.printStackTrace();
            FbtLogger.w2f(c, e.getMessage());
            return false;
        }
    }

    public static ThaDataManager getInstance() {
        return b.a;
    }

    private ThaDataWrapper h(ThaResults thaResults, long j) {
        ThaDataWrapper thaDataWrapper = new ThaDataWrapper();
        thaDataWrapper.setThaResults(thaResults);
        thaDataWrapper.setTimeStamp(j);
        return thaDataWrapper;
    }

    public void handleTrainingHistoryAnalysis() {
        List<EteResultWrapper> listE;
        ThaResults thaResultsA;
        List<EteResultWrapper> listD = d();
        ArrayList arrayList = new ArrayList();
        if (listD != null) {
            for (EteResultWrapper eteResultWrapper : listD) {
                if (g(eteResultWrapper) && (listE = e(eteResultWrapper.getTrackId())) != null && (thaResultsA = a(listE)) != null) {
                    arrayList.add(h(thaResultsA, eteResultWrapper.getTrackId()));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ThaResultProxy.getInstance().saveThaResultList(arrayList, false);
        }
    }

    public boolean initThaParameters(int i, int i2, int i3, int i4, int i5, int i6) {
        FbtParameters fbtParametersInitFbtParameters = FbtParameterHelper.getInstance().initFbtParameters(i, i2, i3, i4, i5, i6, false);
        this.b = fbtParametersInitFbtParameters;
        return fbtParametersInitFbtParameters != null;
    }

    private ThaDataManager() {
        this.a = Tha.getInstance();
    }
}
