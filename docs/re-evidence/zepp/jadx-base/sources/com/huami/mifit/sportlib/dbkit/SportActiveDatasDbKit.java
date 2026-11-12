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
public class SportActiveDatasDbKit implements ISportActiveDatasDbCallback {
    private static volatile SportActiveDatasDbKit b;
    private ISportActiveDatasDbCallback a;

    private SportActiveDatasDbKit() {
    }

    public static SportActiveDatasDbKit getInstance() {
        if (b == null) {
            synchronized (SportActiveDatasDbKit.class) {
                if (b == null) {
                    b = new SportActiveDatasDbKit();
                }
            }
        }
        return b;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void deleteActiveBaros(DataCondition dataCondition) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.deleteActiveBaros(dataCondition);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void deleteActiveDistances(DataCondition dataCondition) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.deleteActiveDistances(dataCondition);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void deleteActiveHrs(DataCondition dataCondition) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.deleteActiveHrs(dataCondition);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void deleteActiveMiPlusShoeSteps(DataCondition dataCondition) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.deleteActiveMiPlusShoeSteps(dataCondition);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void deleteActiveSteps(DataCondition dataCondition) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.deleteActiveSteps(dataCondition);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void deleteActiveTracks(DataCondition dataCondition) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.deleteActiveTracks(dataCondition);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public List<GPSActiveBar> getActiveBaros(DataCondition dataCondition) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            return iSportActiveDatasDbCallback.getActiveBaros(dataCondition);
        }
        return null;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public List<GPSActiveDistance> getActiveDistances(DataCondition dataCondition) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            return iSportActiveDatasDbCallback.getActiveDistances(dataCondition);
        }
        return null;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public List<GPSActiveHr> getActiveHrs(DataCondition dataCondition) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            return iSportActiveDatasDbCallback.getActiveHrs(dataCondition);
        }
        return null;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public List<GPSActiveMiPlusStep> getActiveMiPlusShoeSteps(DataCondition dataCondition) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            return iSportActiveDatasDbCallback.getActiveMiPlusShoeSteps(dataCondition);
        }
        return null;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public List<GPSActiveStep> getActiveSteps(DataCondition dataCondition) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            return iSportActiveDatasDbCallback.getActiveSteps(dataCondition);
        }
        return null;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public List<GPSActiveTrack> getActiveTracks(DataCondition dataCondition) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            return iSportActiveDatasDbCallback.getActiveTracks(dataCondition);
        }
        return null;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertActiveBaro(GPSActiveBar gPSActiveBar) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.insertActiveBaro(gPSActiveBar);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertActiveDistance(GPSActiveDistance gPSActiveDistance) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.insertActiveDistance(gPSActiveDistance);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertActiveHr(GPSActiveHr gPSActiveHr) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.insertActiveHr(gPSActiveHr);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertActiveMiPlusShoeStep(GPSActiveMiPlusStep gPSActiveMiPlusStep) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.insertActiveMiPlusShoeStep(gPSActiveMiPlusStep);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertActiveStep(GPSActiveStep gPSActiveStep) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.insertActiveStep(gPSActiveStep);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertActiveTrack(GPSActiveTrack gPSActiveTrack) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.insertActiveTrack(gPSActiveTrack);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertActiveTrackList(List<GPSActiveTrack> list) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.insertActiveTrackList(list);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertOrReplaceActiveTrack(GPSActiveTrack gPSActiveTrack) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.insertOrReplaceActiveTrack(gPSActiveTrack);
        }
    }

    public void setActiveDbClient(ISportActiveDatasDbCallback iSportActiveDatasDbCallback) {
        this.a = iSportActiveDatasDbCallback;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void updateActiveTrack(GPSActiveTrack gPSActiveTrack) {
        ISportActiveDatasDbCallback iSportActiveDatasDbCallback = this.a;
        if (iSportActiveDatasDbCallback != null) {
            iSportActiveDatasDbCallback.updateActiveTrack(gPSActiveTrack);
        }
    }
}
