package com.huawei.healthcloud.plugintrack.runningroute.view;

import android.content.Context;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.ui.commonui.view.trackview.TrackLineChartHolder;
import defpackage.gzr;
import defpackage.gzv;
import defpackage.lmb;
import defpackage.njb;
import defpackage.njc;
import defpackage.nje;
import defpackage.njg;
import defpackage.njh;
import defpackage.nji;
import defpackage.njl;
import defpackage.njm;
import defpackage.njp;
import defpackage.njq;
import defpackage.njr;
import defpackage.nju;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class RouteAltitudeChartHolderAdapter extends TrackLineChartHolder {
    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njc> acquireAnalogCadenceData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireAnalogCadenceDataSumTime() {
        return 0.0f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireAnalogCadenceInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njb> acquireAnalogPowerData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireAnalogPowerInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireCadenceInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireCadenceSumTime() {
        return 0.0f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<HeartRateData> acquireHeartRateData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireHeartRateDataInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireHeartRateDataSumTime() {
        return 0.0f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<HeartRateData> acquireInvalidHeartRateData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<HeartRateData> acquireInvalidUnixHeartRateData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireJumpDataInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireJumpTotalTime() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquirePaddleFreqInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<nji> acquirePaddleFrequencyData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njh> acquirePoweData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquirePowerDataInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njp> acquirePullFreqData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquirePullFreqDataInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireRealTimePaceDataSumTime() {
        return 0.0f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireRecoverHeartRateDataSumTime() {
        return 0.0f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<gzr> acquireRidePostureData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<gzv> acquireRunningPostureData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireRunningPostureDataInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireRunningPostureDataSumTime() {
        return 0.0f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njg> acquireSkippingSpeedData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireSkippingSpeedInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireSpo2SumTime() {
        return 0.0f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<StepRateData> acquireStepRateData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireStepRateDataInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireStepRateSumTime() {
        return 0.0f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njq> acquireSwolfData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireSwolfDataInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<njm> acquireTrackAltitudeData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireTrackAltitudeDataInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireTrackAltitudeShowType() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<HeartRateData> acquireTrackHeartRateData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<lmb> acquireTrackJumpData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njl> acquireTrackRealTimePaceData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<njr> acquireTrackRealTimeSpeedData() {
        return null;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireTrackRealTimeSpeedDataInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<nju> acquireTrackSpo2Data() {
        return null;
    }

    public RouteAltitudeChartHolderAdapter(Context context) {
        super(context);
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<nje> getHeartRateAreaList() {
        return Collections.EMPTY_LIST;
    }
}
