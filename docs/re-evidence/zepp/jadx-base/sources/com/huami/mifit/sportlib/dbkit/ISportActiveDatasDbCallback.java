package com.huami.mifit.sportlib.dbkit;

import com.huami.mifit.sportlib.core.model.GPSActiveBar;
import com.huami.mifit.sportlib.core.model.GPSActiveDistance;
import com.huami.mifit.sportlib.core.model.GPSActiveHr;
import com.huami.mifit.sportlib.core.model.GPSActiveMiPlusStep;
import com.huami.mifit.sportlib.core.model.GPSActiveStep;
import com.huami.mifit.sportlib.core.model.GPSActiveTrack;
import com.huami.mifit.sportlib.dbkit.tool.DataCondition;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface ISportActiveDatasDbCallback {
    void deleteActiveBaros(DataCondition dataCondition);

    void deleteActiveDistances(DataCondition dataCondition);

    void deleteActiveHrs(DataCondition dataCondition);

    void deleteActiveMiPlusShoeSteps(DataCondition dataCondition);

    void deleteActiveSteps(DataCondition dataCondition);

    void deleteActiveTracks(DataCondition dataCondition);

    List<GPSActiveBar> getActiveBaros(DataCondition dataCondition);

    List<GPSActiveDistance> getActiveDistances(DataCondition dataCondition);

    List<GPSActiveHr> getActiveHrs(DataCondition dataCondition);

    List<GPSActiveMiPlusStep> getActiveMiPlusShoeSteps(DataCondition dataCondition);

    List<GPSActiveStep> getActiveSteps(DataCondition dataCondition);

    List<GPSActiveTrack> getActiveTracks(DataCondition dataCondition);

    void insertActiveBaro(GPSActiveBar gPSActiveBar);

    void insertActiveDistance(GPSActiveDistance gPSActiveDistance);

    void insertActiveHr(GPSActiveHr gPSActiveHr);

    void insertActiveMiPlusShoeStep(GPSActiveMiPlusStep gPSActiveMiPlusStep);

    void insertActiveStep(GPSActiveStep gPSActiveStep);

    void insertActiveTrack(GPSActiveTrack gPSActiveTrack);

    void insertActiveTrackList(List<GPSActiveTrack> list);

    void insertOrReplaceActiveTrack(GPSActiveTrack gPSActiveTrack);

    void updateActiveTrack(GPSActiveTrack gPSActiveTrack);
}
