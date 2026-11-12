package com.huawei.health.suggestion.ui.fitness.module;

import android.content.Context;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.route.SlopeInfo;
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
import defpackage.njs;
import defpackage.nju;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class HeartRateLineChartHolderImpl extends TrackLineChartHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<HeartRateData> f9376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f9377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9378c;
    private ArrayList<HeartRateData> d;
    private ArrayList<HeartRateData> e;
    private float f;

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireAnalogCadenceDataSumTime() {
        return 0.0f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireAnalogCadenceInterval() {
        return 0;
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
    public int acquirePowerDataInterval() {
        return 0;
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
    public int acquireRunningPostureDataInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireRunningPostureDataSumTime() {
        return 0.0f;
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
    public int acquireStepRateDataInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireStepRateSumTime() {
        return 0.0f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireSwolfDataInterval() {
        return 0;
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
    public int acquireTrackRealTimeSpeedDataInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireWeightDataInterval() {
        return 0;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public boolean isSlopeInfoDisplayEnabled() {
        return false;
    }

    public HeartRateLineChartHolderImpl(Context context) {
        super(context);
        this.f9377b = -1.0f;
        this.f = -1.0f;
    }

    public void b(ArrayList<HeartRateData> arrayList) {
        this.e = arrayList;
    }

    public void c(ArrayList<HeartRateData> arrayList) {
        this.f9376a = arrayList;
    }

    public void e(ArrayList<HeartRateData> arrayList) {
        this.d = arrayList;
    }

    public void b(int i) {
        this.f9378c = i;
    }

    public void b() {
        this.f9377b = -1.0f;
    }

    public void a(float f) {
        this.f9377b = f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<HeartRateData> acquireHeartRateData() {
        return this.e;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public int acquireHeartRateDataInterval() {
        return this.f9378c;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireHeartRateDataSumTime() {
        return this.f9377b;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public float acquireRecoverHeartRateDataSumTime() {
        return this.f;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<HeartRateData> acquireInvalidHeartRateData() {
        return this.f9376a;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<HeartRateData> acquireInvalidUnixHeartRateData() {
        return this.d;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<StepRateData> acquireStepRateData() {
        return new ArrayList<>(0);
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<nji> acquirePaddleFrequencyData() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<gzr> acquireRidePostureData() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njh> acquirePoweData() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njb> acquireAnalogPowerData() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njc> acquireAnalogCadenceData() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njs> acquireWeightData() {
        return new ArrayList();
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njg> acquireSkippingSpeedData() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<njm> acquireTrackAltitudeData() {
        return new ArrayList<>(0);
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<lmb> acquireTrackJumpData() {
        return new ArrayList<>(0);
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<SlopeInfo> acquireSlopeInfoList() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public ArrayList<njr> acquireTrackRealTimeSpeedData() {
        return new ArrayList<>(0);
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<HeartRateData> acquireTrackHeartRateData() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njq> acquireSwolfData() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njp> acquirePullFreqData() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<njl> acquireTrackRealTimePaceData() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<gzv> acquireRunningPostureData() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<nju> acquireTrackSpo2Data() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.ui.commonui.view.trackview.TrackLineChartHolder
    public List<nje> getHeartRateAreaList() {
        return Collections.EMPTY_LIST;
    }
}
