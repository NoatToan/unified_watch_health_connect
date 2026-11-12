package com.huami.mifit.sportlib.core;

import android.util.Pair;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.mifit.sportlib.core.model.GPSActiveStep;
import com.huami.mifit.sportlib.core.model.GPSActiveTrack;
import com.huami.mifit.sportlib.dbkit.SportActiveDatasDbKit;
import com.huami.mifit.sportlib.dbkit.SportDetailDbKit;
import com.huami.mifit.sportlib.dbkit.SportRecordDbKit;
import com.huami.mifit.sportlib.dbkit.tool.DataCondition;
import com.huami.mifit.sportlib.model.SportRecord;
import com.huami.moving.ui.utils.SportAnalytics;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GPSDataRecover {
    public static List<GPSActiveTrack> a(long j) {
        DataCondition dataCondition = new DataCondition(j);
        dataCondition.setOrder(new Pair<>("Time", Boolean.TRUE));
        return SportActiveDatasDbKit.getInstance().getActiveTracks(dataCondition);
    }

    public static int b(long j) {
        DataCondition dataCondition = new DataCondition(j);
        dataCondition.setOrder(new Pair<>(SportAnalytics.ParamValue.DataName.STEPS, Boolean.FALSE));
        List<GPSActiveStep> activeSteps = SportActiveDatasDbKit.getInstance().getActiveSteps(dataCondition);
        if (activeSteps == null || activeSteps.size() == 0) {
            return 0;
        }
        return activeSteps.get(0).getStep();
    }

    public static SportRecord c(long j) {
        DataCondition dataCondition = new DataCondition(j, DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue(), SyncedState.SYNC_STATE_DEFAULT.getValue(), null);
        dataCondition.setOrder(new Pair<>("TrackId", Boolean.FALSE));
        List<SportRecord> sportRecords = SportRecordDbKit.getInstance().getSportRecords(dataCondition);
        if (sportRecords == null || sportRecords.size() != 1 || sportRecords.get(0) == null) {
            return null;
        }
        return sportRecords.get(0);
    }

    public static void cancelRun(long j) {
        DataCondition dataCondition = new DataCondition(j, DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue(), (int[]) null);
        SportRecordDbKit.getInstance().deleteSportRecords(dataCondition);
        SportDetailDbKit.getInstance().deleteSportDetailDatas(dataCondition);
        c.a(j);
        c.k();
    }

    public static void saveRun(long j) {
        SportRecord sportRecordC = c(j);
        if (sportRecordC == null) {
            return;
        }
        if (b.n0()) {
            c.E(sportRecordC, 12, sportRecordC.getStatistics(), true);
            sportRecordC.setState(Integer.valueOf(SyncedState.STATE_UNSYNCED.getValue()));
            SportRecordDbKit.getInstance().updateSportRecord(sportRecordC);
            c.A(j);
            c.a(j);
            return;
        }
        int[] iArrF = c.F(j, 12, sportRecordC.getStatistics());
        sportRecordC.setTotalStep(Integer.valueOf(iArrF[0]));
        sportRecordC.setAvgStrideLength(Integer.valueOf(iArrF[1]));
        sportRecordC.setAltitudeAscend(Integer.valueOf(iArrF[2]));
        sportRecordC.setAltitudeDescend(Integer.valueOf(iArrF[3]));
        sportRecordC.setState(Integer.valueOf(SyncedState.STATE_UNSYNCED.getValue()));
        SportRecordDbKit.getInstance().updateSportRecord(sportRecordC);
    }
}
