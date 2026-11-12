package com.huami.mifit.sportlib.observer;

import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface IServiceDataObserver {
    void onAltitudeChanged(float f);

    void onAvgPaceChanged(float f);

    void onCalorieChanged(float f);

    void onClimbAscendChanged(float f);

    void onDistanceChanged(float f);

    void onFinish();

    void onGPSLineInfoChanged(List<GPSPoint> list, RouteLineInfo routeLineInfo);

    void onHrChanged(int i, int i2);

    void onLocationChanged(GPSPoint gPSPoint);

    void onPaceChanged(float f);

    void onSportControl(int i, int i2);

    void onSportTimeChanged(long j);

    void onStepChanged(int i);

    void onStepFreqChanged(float f);

    void onTestLocationChanged(GPSPoint gPSPoint);
}
