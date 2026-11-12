package com.huawei.ui.commonui.view.trackview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.route.SlopeInfo;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthTrackCombinedChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import defpackage.frp;
import defpackage.gzr;
import defpackage.gzv;
import defpackage.gzz;
import defpackage.hah;
import defpackage.hcc;
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
import defpackage.njy;
import defpackage.qlt;
import defpackage.qmc;
import defpackage.qmf;
import defpackage.qpe;
import defpackage.qpf;
import defpackage.qph;
import defpackage.qpi;
import defpackage.qpk;
import defpackage.qqg;
import defpackage.qtf;
import defpackage.qtj;
import defpackage.qtm;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class TrackLineChartHolder {
    private static final String TAG = "Track_TrackLineChartHolder";
    public static final float VALID_CHART_DATA = -10000.0f;
    private static TrackLineChartHolder mTrackLineChartHolder;
    protected Context mContext;
    private List<Mode> mModes;
    private int mSportType = 0;
    private String mSportMode = "";
    private c mDefaultShowMode = new c();

    public enum Mode {
        MODE_FIRST_AXIS,
        MODE_SECOND_AXIS,
        MODE_THIRD_PARTY_AXIS,
        MODE_NONE
    }

    protected abstract List<njc> acquireAnalogCadenceData();

    protected abstract float acquireAnalogCadenceDataSumTime();

    protected abstract int acquireAnalogCadenceInterval();

    protected abstract List<njb> acquireAnalogPowerData();

    protected abstract int acquireAnalogPowerInterval();

    protected abstract int acquireCadenceInterval();

    protected abstract float acquireCadenceSumTime();

    protected abstract ArrayList<HeartRateData> acquireHeartRateData();

    protected abstract int acquireHeartRateDataInterval();

    protected abstract float acquireHeartRateDataSumTime();

    protected abstract ArrayList<HeartRateData> acquireInvalidHeartRateData();

    protected abstract ArrayList<HeartRateData> acquireInvalidUnixHeartRateData();

    protected abstract int acquireJumpDataInterval();

    protected abstract int acquireJumpTotalTime();

    protected abstract int acquirePaddleFreqInterval();

    protected abstract List<nji> acquirePaddleFrequencyData();

    protected abstract List<njh> acquirePoweData();

    protected abstract int acquirePowerDataInterval();

    protected abstract List<njp> acquirePullFreqData();

    protected abstract int acquirePullFreqDataInterval();

    protected abstract float acquireRealTimePaceDataSumTime();

    protected abstract float acquireRecoverHeartRateDataSumTime();

    protected abstract List<gzr> acquireRidePostureData();

    protected abstract List<gzv> acquireRunningPostureData();

    protected abstract int acquireRunningPostureDataInterval();

    protected abstract float acquireRunningPostureDataSumTime();

    protected abstract List<njg> acquireSkippingSpeedData();

    protected abstract int acquireSkippingSpeedInterval();

    protected abstract List<SlopeInfo> acquireSlopeInfoList();

    protected abstract float acquireSpo2SumTime();

    protected abstract ArrayList<StepRateData> acquireStepRateData();

    protected abstract int acquireStepRateDataInterval();

    protected abstract float acquireStepRateSumTime();

    protected abstract List<njq> acquireSwolfData();

    protected abstract int acquireSwolfDataInterval();

    protected abstract ArrayList<njm> acquireTrackAltitudeData();

    protected abstract int acquireTrackAltitudeDataInterval();

    protected abstract int acquireTrackAltitudeShowType();

    protected abstract List<HeartRateData> acquireTrackHeartRateData();

    protected abstract ArrayList<lmb> acquireTrackJumpData();

    protected abstract List<njl> acquireTrackRealTimePaceData();

    protected abstract ArrayList<njr> acquireTrackRealTimeSpeedData();

    protected abstract int acquireTrackRealTimeSpeedDataInterval();

    protected abstract List<nju> acquireTrackSpo2Data();

    protected abstract List<njs> acquireWeightData();

    protected abstract int acquireWeightDataInterval();

    protected abstract List<nje> getHeartRateAreaList();

    protected abstract boolean isSlopeInfoDisplayEnabled();

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f24022a = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24024c = false;
        public boolean e = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f24023b = false;

        public c e(boolean z) {
            this.f24022a = z;
            return this;
        }

        public c c(boolean z) {
            this.f24023b = z;
            return this;
        }

        public c b(boolean z) {
            this.f24024c = z;
            return this;
        }

        public c d(boolean z) {
            this.e = z;
            return this;
        }
    }

    public TrackLineChartHolder(Context context) {
        ArrayList arrayList = new ArrayList(16);
        this.mModes = arrayList;
        if (context != null) {
            this.mContext = context;
            qtm.a(arrayList);
        }
    }

    public void setSportType(int i) {
        this.mSportType = i;
    }

    public void setSportMode(String str) {
        this.mSportMode = str;
    }

    public static TrackLineChartHolder getInstance() {
        return mTrackLineChartHolder;
    }

    public static void setInstance(TrackLineChartHolder trackLineChartHolder) {
        mTrackLineChartHolder = trackLineChartHolder;
    }

    public HwHealthLineDataSet addHeartRateDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, float f) {
        return addHeartRateDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode, f);
    }

    public HwHealthLineDataSet addHeartRateDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, float f) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addHeartRateDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar, f);
    }

    private HwHealthLineDataSet addHeartRateDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar, float f) {
        int i;
        LogUtil.a(TAG, "addHeartRateDataLayer mode:", mode);
        ArrayList arrayList = new ArrayList(16);
        ArrayList<HeartRateData> arrayListAcquireHeartRateData = acquireHeartRateData();
        if (njy.e(arrayListAcquireHeartRateData)) {
            LogUtil.j(TAG, "initHeartRate heartRateList empty,return");
            return null;
        }
        int iAcquireHeartRate = Integer.MIN_VALUE;
        int iAcquireHeartRate2 = Integer.MAX_VALUE;
        double dAcquireHeartRate = 0.0d;
        int i2 = 0;
        for (HeartRateData heartRateData : arrayListAcquireHeartRateData) {
            if (heartRateData != null) {
                HwHealthBaseEntry hwHealthBaseEntry = new HwHealthBaseEntry(heartRateData.acquireTime(), heartRateData.acquireHeartRate());
                if (heartRateData.acquireHeartRate() > 0) {
                    arrayList.add(hwHealthBaseEntry);
                    if (heartRateData.acquireHeartRate() > iAcquireHeartRate) {
                        iAcquireHeartRate = heartRateData.acquireHeartRate();
                    }
                    if (heartRateData.acquireHeartRate() < iAcquireHeartRate2) {
                        iAcquireHeartRate2 = heartRateData.acquireHeartRate();
                    }
                    dAcquireHeartRate += (double) heartRateData.acquireHeartRate();
                    i2++;
                }
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, this.mContext.getResources().getString(R.string.IDS_main_watch_heart_rate_string), this.mContext.getResources().getString(R.string.IDS_main_watch_heart_rate_string), this.mContext.getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string), acquireHeartRateDataInterval());
        if (acquireHeartRateDataSumTime() > 0.0f) {
            LogUtil.d(TAG, "acquireHeartRateDataSumTime:", Float.valueOf(acquireHeartRateDataSumTime()));
            hwHealthLineDataSet.setXMaxForcedValue(acquireHeartRateDataSumTime());
        }
        List<nje> heartRateAreaList = getHeartRateAreaList();
        if (!cVar.f24024c && njy.b(heartRateAreaList)) {
            hwHealthBaseCombinedChart.setYRenderFillArea(gzz.a(heartRateAreaList));
        } else {
            setHeartRateFillDrawableDefaultGradient(hwHealthLineDataSet, true);
        }
        hwHealthLineDataSet.setColor(Color.argb(255, 252, 49, 89));
        hwHealthLineDataSet.d(Color.argb(229, com.huawei.hms.kit.awareness.barrier.internal.e.a.L, 70, 94));
        LogUtil.a(TAG, "addHeartRateDataLayer customAxisByDataBoard mode=", mode);
        if (mode != Mode.MODE_NONE) {
            i = 49;
            qtm.e(new d(hwHealthBaseCombinedChart, hwHealthLineDataSet, mode, iAcquireHeartRate, i2 > 0 ? (float) (dAcquireHeartRate / ((double) i2)) : 0.0f, iAcquireHeartRate2, cVar.f24022a, false, false));
        } else {
            i = 49;
        }
        qtm.d(hwHealthBaseCombinedChart, cVar, f, Color.argb(255, 252, i, 89));
        handleHeartRateDataSet(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSet);
        return hwHealthLineDataSet;
    }

    public List<HeartRateData> insertHeartRatePoint(List<HeartRateData> list, int i) {
        if (njy.e(list)) {
            LogUtil.j(TAG, "insertHeartRatePoint heartRateDataList is null");
            return null;
        }
        int size = list.size();
        ArrayList<HeartRateData> arrayListAcquireInvalidUnixHeartRateData = acquireInvalidUnixHeartRateData();
        for (int i2 = 1; i2 < size; i2++) {
            int i3 = i2 - 1;
            long jAcquireTime = (list.get(i2).acquireTime() - list.get(i3).acquireTime()) / 1000;
            boolean zE = qtm.e((int) list.get(i3).acquireTime(), (int) list.get(i2).acquireTime(), arrayListAcquireInvalidUnixHeartRateData);
            if (jAcquireTime > i && zE && i != 0) {
                qtm.c(list, ((int) jAcquireTime) / i, list.get(i3), i);
            }
        }
        return list;
    }

    private void handleHeartRateDataSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, HwHealthLineDataSet hwHealthLineDataSet) {
        if (cVar.f24022a) {
            setHeartRateFillDrawableDefaultGradient(hwHealthLineDataSet, false);
        }
        qtm.b(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSet);
        qtm.b(hwHealthLineDataSet);
        new qpf().initStyle(hwHealthBaseCombinedChart, hwHealthLineDataSet);
        addHeartRateDataSet(hwHealthBaseCombinedChart, hwHealthLineDataSet);
    }

    private void setHeartRateFillDrawableDefaultGradient(HwHealthLineDataSet hwHealthLineDataSet, boolean z) {
        hwHealthLineDataSet.a(Color.argb(127, 252, 49, 89), Color.argb(0, 252, 49, 89), z);
    }

    public void removeDataSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        if (hwHealthBaseCombinedChart == null || hwHealthBaseBarLineDataSet == null) {
            LogUtil.j(TAG, "chart or set is null");
        } else {
            ((qmc) hwHealthBaseCombinedChart.getData()).removeDataSet((HwHealthBaseBarLineDataSet<HwHealthBaseEntry>) hwHealthBaseBarLineDataSet);
            qtm.b(hwHealthBaseCombinedChart, this.mModes);
        }
    }

    public HwHealthLineDataSet addStepRateDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, float f) {
        return addStepRateDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode, f);
    }

    public HwHealthLineDataSet addStepRateDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, float f) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addStepRateDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar, f);
    }

    private HwHealthLineDataSet addStepRateDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar, float f) {
        int i;
        LogUtil.a(TAG, "addStepRateDataLayer mode:", mode);
        ArrayList<HwHealthBaseEntry> arrayList = new ArrayList<>(16);
        ArrayList<StepRateData> arrayListAcquireStepRateData = acquireStepRateData();
        if (njy.e(arrayListAcquireStepRateData)) {
            LogUtil.j(TAG, "initStepRate stepRateList empty,return");
            return null;
        }
        int iAcquireStepRate = Integer.MIN_VALUE;
        int iAcquireStepRate2 = Integer.MAX_VALUE;
        double dAcquireStepRate = 0.0d;
        int i2 = 0;
        for (StepRateData stepRateData : arrayListAcquireStepRateData) {
            if (stepRateData != null) {
                arrayList.add(new HwHealthBaseEntry(stepRateData.acquireTime(), stepRateData.acquireStepRate()));
                if (stepRateData.acquireStepRate() > iAcquireStepRate) {
                    iAcquireStepRate = stepRateData.acquireStepRate();
                }
                if (stepRateData.acquireStepRate() < iAcquireStepRate2) {
                    iAcquireStepRate2 = stepRateData.acquireStepRate();
                }
                dAcquireStepRate += (double) stepRateData.acquireStepRate();
                i2++;
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthLineDataSet charSet = getCharSet(arrayList);
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addStepRateDataLayer customAxisByDataBoard mode=", mode);
            qtm.e(new d(hwHealthBaseCombinedChart, charSet, mode, iAcquireStepRate, i2 > 0 ? (float) (dAcquireStepRate / ((double) i2)) : 0.0f, iAcquireStepRate2, cVar.f24022a, false, false));
        }
        float fAcquireStepRateSumTime = acquireStepRateSumTime();
        if (fAcquireStepRateSumTime > 0.0f) {
            LogUtil.d(TAG, "addStepRateDataLayer acquireStepRateSumTime:", Float.valueOf(fAcquireStepRateSumTime));
            charSet.setXMaxForcedValue(fAcquireStepRateSumTime);
        }
        if (cVar.f24022a) {
            i = 0;
            setStepRateFillDrawableDefaultGradient(charSet, false);
        } else {
            i = 0;
        }
        handleStepRateDataSet(hwHealthBaseCombinedChart, cVar, charSet);
        qtm.d(hwHealthBaseCombinedChart, cVar, f, Color.argb(255, 255, 176, i));
        return charSet;
    }

    private void handleStepRateDataSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, HwHealthLineDataSet hwHealthLineDataSet) {
        qtm.b(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSet);
        qtm.b(hwHealthLineDataSet);
        new qpf().initStyle(hwHealthBaseCombinedChart, hwHealthLineDataSet);
        addDataSet(hwHealthBaseCombinedChart, hwHealthLineDataSet);
    }

    private void setStepRateFillDrawableDefaultGradient(HwHealthLineDataSet hwHealthLineDataSet, boolean z) {
        hwHealthLineDataSet.a(Color.argb(127, 255, 176, 0), Color.argb(0, 255, 176, 0), z);
    }

    public HwHealthLineDataSet addPaddleFreqDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        return addPaddleFreqDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public HwHealthLineDataSet addPaddleFreqDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addPaddleFreqDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    private HwHealthLineDataSet addPaddleFreqDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        LogUtil.a(TAG, "addPaddleFreqDataLayer mode:", mode);
        ArrayList<HwHealthBaseEntry> arrayList = new ArrayList<>(16);
        List<nji> listAcquirePaddleFrequencyData = acquirePaddleFrequencyData();
        if (njy.e(listAcquirePaddleFrequencyData)) {
            LogUtil.j(TAG, "initPaddleFrequency paddleFrequencyList empty,return");
            return null;
        }
        float fC = Float.MIN_VALUE;
        double dC = 0.0d;
        float fC2 = Float.MAX_VALUE;
        int i = 0;
        for (nji njiVar : listAcquirePaddleFrequencyData) {
            if (njiVar != null) {
                arrayList.add(new HwHealthBaseEntry(njiVar.acquireTime(), njiVar.c()));
                if (njiVar.c() > fC) {
                    fC = njiVar.c();
                }
                if (njiVar.c() < fC2) {
                    fC2 = njiVar.c();
                }
                dC += (double) njiVar.c();
                i++;
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthLineDataSet hwHealthLinePaddleDataSet = getHwHealthLinePaddleDataSet(arrayList);
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addPaddleFreqDataLayer customAxisByDataBoard mode=", mode);
            qtm.e(new d(hwHealthBaseCombinedChart, hwHealthLinePaddleDataSet, mode, fC, i > 0 ? (float) (dC / ((double) i)) : 0.0f, fC2, cVar.f24022a, false, false));
        }
        if (cVar.f24022a) {
            setPaddleFreqFillDrawableDefaultGradient(hwHealthLinePaddleDataSet, false);
        }
        handlePaddleFreqDataSet(hwHealthBaseCombinedChart, cVar, hwHealthLinePaddleDataSet);
        return hwHealthLinePaddleDataSet;
    }

    private HwHealthLineDataSet getCharSet(ArrayList<HwHealthBaseEntry> arrayList) {
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, this.mContext.getResources().getString(R.string.IDS_motiontrack_detail_fm_heart_bupin), this.mContext.getResources().getString(R.string.IDS_motiontrack_detail_fm_heart_bupin), this.mContext.getResources().getQuantityString(R.plurals.IDS_motiontrack_show_chart_stepsmin, 0), acquireStepRateDataInterval());
        hwHealthLineDataSet.setColor(Color.argb(255, 253, 191, 54));
        setStepRateFillDrawableDefaultGradient(hwHealthLineDataSet, true);
        return hwHealthLineDataSet;
    }

    private HwHealthLineDataSet getHwHealthLinePaddleDataSet(ArrayList<HwHealthBaseEntry> arrayList) {
        String string = this.mContext.getResources().getString("291".equals(this.mSportMode) ? R.string.IDS_rowing_machine_action_frequency : R.string.IDS_indoor_equip_paddle_frequency);
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, string, string, this.mContext.getResources().getString(R.string.IDS_indoor_equip_paddle_unit_times_minute), acquirePaddleFreqInterval());
        hwHealthLineDataSet.setColor(Color.argb(255, 253, 191, 54));
        setPaddleFreqFillDrawableDefaultGradient(hwHealthLineDataSet, true);
        return hwHealthLineDataSet;
    }

    private void handlePaddleFreqDataSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, HwHealthLineDataSet hwHealthLineDataSet) {
        qtm.b(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSet);
        qtm.b(hwHealthLineDataSet);
        new qpf().initStyle(hwHealthBaseCombinedChart, hwHealthLineDataSet);
        addDataSet(hwHealthBaseCombinedChart, hwHealthLineDataSet);
    }

    private void setPaddleFreqFillDrawableDefaultGradient(HwHealthLineDataSet hwHealthLineDataSet, boolean z) {
        hwHealthLineDataSet.a(Color.argb(127, 255, 176, 0), Color.argb(0, 255, 176, 0), z);
    }

    public HwHealthLineDataSet addCadenceRateDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        return addCadenceRateDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public HwHealthLineDataSet addCadenceRateDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addCadenceRateDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    private HwHealthLineDataSet addCadenceRateDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        boolean z;
        LogUtil.a(TAG, "addCadenceRateDataLayer mode:", mode);
        ArrayList<HwHealthBaseEntry> arrayList = new ArrayList<>(16);
        List<gzr> listAcquireRidePostureData = acquireRidePostureData();
        if (njy.e(listAcquireRidePostureData)) {
            LogUtil.j(TAG, "initCadenceRate ridePostureDataList empty,return");
            return null;
        }
        int iC = Integer.MIN_VALUE;
        int iC2 = Integer.MAX_VALUE;
        double dC = 0.0d;
        int i = 0;
        for (gzr gzrVar : listAcquireRidePostureData) {
            if (gzrVar != null) {
                arrayList.add(new HwHealthBaseEntry(gzrVar.acquireTime(), gzrVar.c()));
                if (gzrVar.c() > iC) {
                    iC = gzrVar.c();
                }
                if (gzrVar.c() < iC2) {
                    iC2 = gzrVar.c();
                }
                dC += (double) gzrVar.c();
                i++;
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthLineDataSet hwHealthLineCadenceDataSet = getHwHealthLineCadenceDataSet(arrayList);
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addCadenceRateDataLayer customAxisByDataBoard mode=", mode);
            qtm.e(new d(hwHealthBaseCombinedChart, hwHealthLineCadenceDataSet, mode, iC, i > 0 ? (float) (dC / ((double) i)) : 0.0f, iC2, cVar.f24022a, false, false));
        }
        float fAcquireCadenceSumTime = acquireCadenceSumTime();
        if (fAcquireCadenceSumTime > 0.0f) {
            LogUtil.d(TAG, "addCadenceRateDataLayer acquireRunningPostureDataSumTime:", LogAnonymous.a((long) fAcquireCadenceSumTime));
            hwHealthLineCadenceDataSet.setXMaxForcedValue(fAcquireCadenceSumTime);
        }
        if (cVar.f24022a) {
            z = false;
            setCadenceRateFillDrawableDefaultGradient(hwHealthLineCadenceDataSet, false);
        } else {
            z = false;
        }
        handleCadenceRateDataSet(hwHealthBaseCombinedChart, cVar, hwHealthLineCadenceDataSet);
        setSupportSampling(hwHealthBaseCombinedChart, z);
        return hwHealthLineCadenceDataSet;
    }

    private HwHealthLineDataSet getHwHealthLineCadenceDataSet(ArrayList<HwHealthBaseEntry> arrayList) {
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, this.mContext.getResources().getString(R.string.IDS_indoor_equip_cadence), this.mContext.getResources().getString(R.string.IDS_indoor_equip_cadence), this.mContext.getResources().getString(R.string.IDS_indoor_equip_cadence_unit_times_minute), acquireCadenceInterval());
        hwHealthLineDataSet.setColor(Color.argb(255, FitnessSleepType.HW_FITNESS_NOON, 111, 33));
        setCadenceRateFillDrawableDefaultGradient(hwHealthLineDataSet, true);
        return hwHealthLineDataSet;
    }

    private void handleCadenceRateDataSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, HwHealthLineDataSet hwHealthLineDataSet) {
        qtm.b(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSet);
        qtm.b(hwHealthLineDataSet);
        new qpf().initStyle(hwHealthBaseCombinedChart, hwHealthLineDataSet);
        addDataSet(hwHealthBaseCombinedChart, hwHealthLineDataSet);
    }

    private void setCadenceRateFillDrawableDefaultGradient(HwHealthLineDataSet hwHealthLineDataSet, boolean z) {
        hwHealthLineDataSet.a(Color.argb(127, FitnessSleepType.HW_FITNESS_NOON, 111, 33), Color.argb(0, FitnessSleepType.HW_FITNESS_NOON, 111, 33), z);
    }

    public HwHealthLineDataSet addPowerDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        return addPowerDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public HwHealthLineDataSet addAnalogPowerDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        return addAnalogPowerDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public HwHealthLineDataSet addAnalogCadenceDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        return addAnalogCadenceDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public HwHealthLineDataSet addWeightDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        return addWeightDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public HwHealthLineDataSet addWeightDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addWeightDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    public HwHealthLineDataSet addSkippingSpeedDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        return addSkippingSpeedDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public HwHealthLineDataSet addPowerDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addPowerDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    public HwHealthLineDataSet addAnalogPowerDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addAnalogPowerDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    private HwHealthLineDataSet addAnalogPowerDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        boolean z;
        LogUtil.a(TAG, "addPowerDataLayer mode:", mode);
        ArrayList<HwHealthBaseEntry> arrayList = new ArrayList<>(16);
        List<njb> listAcquireAnalogPowerData = acquireAnalogPowerData();
        if (njy.e(listAcquireAnalogPowerData)) {
            LogUtil.j(TAG, "addAnalogPowerDataLayer powerDataList empty,return");
            return null;
        }
        int iA = Integer.MIN_VALUE;
        int iA2 = Integer.MAX_VALUE;
        double dA = 0.0d;
        int i = 0;
        for (njb njbVar : listAcquireAnalogPowerData) {
            if (njbVar != null) {
                arrayList.add(new HwHealthBaseEntry(njbVar.acquireTime(), njbVar.a()));
                if (njbVar.a() > iA) {
                    iA = njbVar.a();
                }
                if (njbVar.a() < iA2) {
                    iA2 = njbVar.a();
                }
                dA += (double) njbVar.a();
                i++;
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthLineDataSet hwHealthLineAnalogPowerDataSet = getHwHealthLineAnalogPowerDataSet(arrayList);
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addAnalogPowerDataLayer customAxisByDataBoard mode=", mode);
            qtm.e(new d(hwHealthBaseCombinedChart, hwHealthLineAnalogPowerDataSet, mode, iA, i > 0 ? (float) (dA / ((double) i)) : 0.0f, iA2, cVar.f24022a, false, false));
        }
        if (cVar.f24022a) {
            z = false;
            setPowerDataFillDrawableDefaultGradient(hwHealthLineAnalogPowerDataSet, false);
        } else {
            z = false;
        }
        handlePowerDataSet(hwHealthBaseCombinedChart, cVar, hwHealthLineAnalogPowerDataSet);
        setSupportSampling(hwHealthBaseCombinedChart, z);
        return hwHealthLineAnalogPowerDataSet;
    }

    private HwHealthLineDataSet getHwHealthLineAnalogPowerDataSet(ArrayList<HwHealthBaseEntry> arrayList) {
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, this.mContext.getResources().getString(R.string.IDS_track_analog_power), this.mContext.getResources().getString(R.string.IDS_track_analog_power), this.mContext.getResources().getString(R.string.IDS_indoor_equip_power_unit_watt), acquireAnalogPowerInterval());
        hwHealthLineDataSet.setColor(Color.argb(255, 0, 124, 255));
        setPowerDataFillDrawableDefaultGradient(hwHealthLineDataSet, true);
        return hwHealthLineDataSet;
    }

    public HwHealthLineDataSet addAnalogCadenceDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addAnalogCadenceDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    private HwHealthLineDataSet addAnalogCadenceDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        boolean z;
        LogUtil.a(TAG, "addPowerDataLayer mode:", mode);
        ArrayList arrayList = new ArrayList(16);
        List<njc> listAcquireAnalogCadenceData = acquireAnalogCadenceData();
        if (njy.e(listAcquireAnalogCadenceData)) {
            LogUtil.j(TAG, "addAnalogPowerDataLayer powerDataList empty,return");
            return null;
        }
        int iA = Integer.MIN_VALUE;
        int iA2 = Integer.MAX_VALUE;
        double dA = 0.0d;
        int i = 0;
        for (njc njcVar : listAcquireAnalogCadenceData) {
            if (njcVar != null) {
                arrayList.add(new HwHealthBaseEntry(njcVar.acquireTime(), njcVar.a()));
                if (njcVar.a() > iA) {
                    iA = njcVar.a();
                }
                if (njcVar.a() < iA2) {
                    iA2 = njcVar.a();
                }
                dA += (double) njcVar.a();
                i++;
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthLineDataSet hwHealthLineDataSetE = qtm.e(acquireAnalogCadenceInterval(), (ArrayList<HwHealthBaseEntry>) arrayList);
        if (acquireAnalogCadenceDataSumTime() > 0.0f) {
            hwHealthLineDataSetE.setXMaxForcedValue(acquireAnalogCadenceDataSumTime());
        }
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addAnalogPowerDataLayer customAxisByDataBoard mode=", mode);
            qtm.e(new d(hwHealthBaseCombinedChart, hwHealthLineDataSetE, mode, iA, i > 0 ? (float) (dA / ((double) i)) : 0.0f, iA2, cVar.f24022a, false, false));
        }
        if (cVar.f24022a) {
            z = false;
            qtm.c(hwHealthLineDataSetE, false);
        } else {
            z = false;
        }
        handlePowerDataSet(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSetE);
        setSupportSampling(hwHealthBaseCombinedChart, z);
        return hwHealthLineDataSetE;
    }

    private HwHealthLineDataSet addWeightDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        LogUtil.a(TAG, "addWeightDataLayer mode:", mode);
        ArrayList<HwHealthBaseEntry> arrayList = new ArrayList<>(16);
        List<njs> listAcquireWeightData = acquireWeightData();
        if (njy.e(listAcquireWeightData)) {
            LogUtil.j(TAG, "initWeightData weightDataList empty,return");
            return null;
        }
        int iE = Integer.MIN_VALUE;
        int iE2 = Integer.MAX_VALUE;
        double dE = 0.0d;
        int i = 0;
        for (njs njsVar : listAcquireWeightData) {
            if (njsVar != null) {
                arrayList.add(new HwHealthBaseEntry(njsVar.acquireTime(), njsVar.e()));
                if (njsVar.e() > iE) {
                    iE = njsVar.e();
                }
                if (njsVar.e() < iE2) {
                    iE2 = njsVar.e();
                }
                dE += (double) njsVar.e();
                i++;
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthLineDataSet hwHealthLineWeightDataSet = getHwHealthLineWeightDataSet(arrayList);
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addWeightDataLayer customAxisByDataBoard mode=", mode);
            qtm.e(new d(hwHealthBaseCombinedChart, hwHealthLineWeightDataSet, mode, iE, i > 0 ? (float) (dE / ((double) i)) : 0.0f, iE2, cVar.f24022a, false, false));
        }
        if (cVar.f24022a) {
            hwHealthLineWeightDataSet.a(Color.argb(128, 0, com.huawei.hms.kit.awareness.barrier.internal.e.a.A, 38), Color.argb(0, 0, com.huawei.hms.kit.awareness.barrier.internal.e.a.A, 38), false);
        }
        handlePowerDataSet(hwHealthBaseCombinedChart, cVar, hwHealthLineWeightDataSet);
        return hwHealthLineWeightDataSet;
    }

    private HwHealthLineDataSet getHwHealthLineWeightDataSet(ArrayList<HwHealthBaseEntry> arrayList) {
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, this.mContext.getResources().getString(R.string.IDS_rowing_machine_weight), this.mContext.getResources().getString(R.string.IDS_rowing_machine_weight), this.mContext.getResources().getString(UnitUtil.f() ? R.string.IDS_lbs : R.string.IDS_rowing_machine_unit_kg), acquireWeightDataInterval());
        hwHealthLineDataSet.setColor(Color.argb(255, 0, com.huawei.hms.kit.awareness.barrier.internal.e.a.A, 38));
        hwHealthLineDataSet.a(Color.argb(128, 0, com.huawei.hms.kit.awareness.barrier.internal.e.a.A, 38), Color.argb(0, 0, com.huawei.hms.kit.awareness.barrier.internal.e.a.A, 38), true);
        return hwHealthLineDataSet;
    }

    private HwHealthLineDataSet addPowerDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        boolean z;
        LogUtil.a(TAG, "addPowerDataLayer mode:", mode);
        ArrayList<HwHealthBaseEntry> arrayList = new ArrayList<>(16);
        List<njh> listAcquirePoweData = acquirePoweData();
        if (njy.e(listAcquirePoweData)) {
            LogUtil.j(TAG, "initPowerData powerDataList empty,return");
            return null;
        }
        int iE = Integer.MIN_VALUE;
        int iE2 = Integer.MAX_VALUE;
        double dE = 0.0d;
        int i = 0;
        for (njh njhVar : listAcquirePoweData) {
            if (njhVar != null) {
                arrayList.add(new HwHealthBaseEntry(njhVar.acquireTime(), njhVar.e()));
                if (njhVar.e() > iE) {
                    iE = njhVar.e();
                }
                if (njhVar.e() < iE2) {
                    iE2 = njhVar.e();
                }
                dE += (double) njhVar.e();
                i++;
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthLineDataSet hwHealthLinePowerDataSet = getHwHealthLinePowerDataSet(arrayList);
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addPowerDataLayer customAxisByDataBoard mode=", mode);
            qtm.e(new d(hwHealthBaseCombinedChart, hwHealthLinePowerDataSet, mode, iE, i > 0 ? (float) (dE / ((double) i)) : 0.0f, iE2, cVar.f24022a, false, false));
        }
        if (cVar.f24022a) {
            z = false;
            setPowerDataFillDrawableDefaultGradient(hwHealthLinePowerDataSet, false);
        } else {
            z = false;
        }
        handlePowerDataSet(hwHealthBaseCombinedChart, cVar, hwHealthLinePowerDataSet);
        setSupportSampling(hwHealthBaseCombinedChart, z);
        return hwHealthLinePowerDataSet;
    }

    private HwHealthLineDataSet getHwHealthLinePowerDataSet(ArrayList<HwHealthBaseEntry> arrayList) {
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, this.mContext.getResources().getString(R.string.IDS_indoor_equip_power), this.mContext.getResources().getString(R.string.IDS_indoor_equip_power), this.mContext.getResources().getString(R.string.IDS_indoor_equip_power_unit_watt), acquirePowerDataInterval());
        hwHealthLineDataSet.setColor(Color.argb(255, 0, 124, 255));
        setPowerDataFillDrawableDefaultGradient(hwHealthLineDataSet, true);
        return hwHealthLineDataSet;
    }

    private void handlePowerDataSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, HwHealthLineDataSet hwHealthLineDataSet) {
        qtm.b(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSet);
        qtm.b(hwHealthLineDataSet);
        new qpf().initStyle(hwHealthBaseCombinedChart, hwHealthLineDataSet);
        addDataSet(hwHealthBaseCombinedChart, hwHealthLineDataSet);
    }

    private void setPowerDataFillDrawableDefaultGradient(HwHealthLineDataSet hwHealthLineDataSet, boolean z) {
        hwHealthLineDataSet.a(Color.argb(127, 0, 124, 255), Color.argb(0, 0, 124, 255), z);
    }

    public HwHealthLineDataSet addSkippingSpeedDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addSkippingSpeedLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    private HwHealthLineDataSet addSkippingSpeedLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        LogUtil.a(TAG, "addSkippingSpeedLayer mode:", mode);
        ArrayList<HwHealthBaseEntry> arrayList = new ArrayList<>(16);
        List<njg> listAcquireSkippingSpeedData = acquireSkippingSpeedData();
        if (njy.e(listAcquireSkippingSpeedData)) {
            LogUtil.j(TAG, "initPowerData skippingSpeedList empty,return");
            return null;
        }
        int iC = Integer.MIN_VALUE;
        int iC2 = Integer.MAX_VALUE;
        double dC = 0.0d;
        int i = 0;
        for (njg njgVar : listAcquireSkippingSpeedData) {
            if (njgVar != null) {
                arrayList.add(new HwHealthBaseEntry(njgVar.acquireTime(), njgVar.c()));
                if (njgVar.c() > iC) {
                    iC = njgVar.c();
                }
                if (njgVar.c() < iC2) {
                    iC2 = njgVar.c();
                }
                dC += (double) njgVar.c();
                i++;
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthLineDataSet hwHealthLineSkippingSpeedSet = getHwHealthLineSkippingSpeedSet(arrayList);
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addPowerDataLayer customAxisByDataBoard mode=", mode);
            qtm.e(new d(hwHealthBaseCombinedChart, hwHealthLineSkippingSpeedSet, mode, iC, i > 0 ? (float) (dC / ((double) i)) : 0.0f, iC2, cVar.f24022a, false, false));
        }
        if (cVar.f24022a) {
            setSpeedFillDrawableDefaultGradient(hwHealthLineSkippingSpeedSet, false);
        }
        handleSkippingSpeedSet(hwHealthBaseCombinedChart, cVar, hwHealthLineSkippingSpeedSet);
        return hwHealthLineSkippingSpeedSet;
    }

    private HwHealthLineDataSet getHwHealthLineSkippingSpeedSet(ArrayList<HwHealthBaseEntry> arrayList) {
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, this.mContext.getResources().getString(R.string.IDS_motiontrack_show_sport_tip_icon_text_pace), this.mContext.getResources().getString(R.string.IDS_motiontrack_show_sport_tip_icon_text_pace), this.mContext.getResources().getString(R.string.IDS_indoor_skipper_number_minute), acquireSkippingSpeedInterval());
        hwHealthLineDataSet.setColor(Color.argb(255, 0, com.huawei.hms.kit.awareness.barrier.internal.e.a.A, 38));
        setSpeedFillDrawableDefaultGradient(hwHealthLineDataSet, true);
        return hwHealthLineDataSet;
    }

    private void handleSkippingSpeedSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, HwHealthLineDataSet hwHealthLineDataSet) {
        qtm.b(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSet);
        qtm.b(hwHealthLineDataSet);
        new qpf().initStyle(hwHealthBaseCombinedChart, hwHealthLineDataSet);
        addDataSet(hwHealthBaseCombinedChart, hwHealthLineDataSet);
    }

    public void addRecoverHeartRateLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        addRecoverHeartRateLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public void addRecoverHeartRateLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null) {
            return;
        }
        addRecoverHeartRateLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    private void addRecoverHeartRateLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        ArrayList arrayList = new ArrayList(16);
        List<HeartRateData> listAcquireTrackHeartRateData = acquireTrackHeartRateData();
        if (njy.e(listAcquireTrackHeartRateData)) {
            LogUtil.j(TAG, "initHeartRate heartRateList empty,return");
            return;
        }
        int iAcquireHeartRate = Integer.MAX_VALUE;
        int iAcquireHeartRate2 = Integer.MIN_VALUE;
        double dAcquireHeartRate = 0.0d;
        int i = 0;
        for (HeartRateData heartRateData : listAcquireTrackHeartRateData) {
            if (heartRateData != null) {
                arrayList.add(new HwHealthBaseEntry(acquireHeartRateDataInterval() * i, heartRateData.acquireHeartRate()));
                if (heartRateData.acquireHeartRate() > iAcquireHeartRate2) {
                    iAcquireHeartRate2 = heartRateData.acquireHeartRate();
                }
                if (heartRateData.acquireHeartRate() < iAcquireHeartRate) {
                    iAcquireHeartRate = heartRateData.acquireHeartRate();
                }
                dAcquireHeartRate += (double) heartRateData.acquireHeartRate();
                i++;
            }
        }
        hwHealthBaseCombinedChart.refresh();
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, this.mContext.getResources().getString(R.string.IDS_main_watch_heart_rate_string), this.mContext.getResources().getString(R.string.IDS_main_watch_heart_rate_string), this.mContext.getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string), acquireHeartRateDataInterval());
        if (acquireRecoverHeartRateDataSumTime() > 0.0f) {
            hwHealthLineDataSet.setXMaxForcedValue(acquireRecoverHeartRateDataSumTime());
        }
        hwHealthLineDataSet.setDrawStartEndNode(true);
        hwHealthLineDataSet.setDrawStartEndValue(true);
        hwHealthLineDataSet.setDrawCircles(true);
        hwHealthLineDataSet.setValueFormatter(new qlt());
        hwHealthLineDataSet.setColor(Color.argb(255, 252, 49, 89));
        hwHealthLineDataSet.d(Color.argb(229, com.huawei.hms.kit.awareness.barrier.internal.e.a.L, 70, 94));
        setHeartRateFillDrawableDefaultGradient(hwHealthLineDataSet, true);
        LogUtil.a(TAG, "addHeartRateDataLayer customAxisByDataBoard mode=", mode);
        if (mode != Mode.MODE_NONE) {
            qtm.e(new d(hwHealthBaseCombinedChart, hwHealthLineDataSet, mode, iAcquireHeartRate2, i > 0 ? (float) (dAcquireHeartRate / ((double) i)) : 0.0f, iAcquireHeartRate, cVar.f24022a, false, false));
        }
        handleHeartRateDataSet(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSet);
    }

    public HwHealthBarDataSet addJumpTimeDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        return addJumpTimeDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public HwHealthBarDataSet addJumpTimeDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null) {
            return null;
        }
        return addJumpTimeDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    private HwHealthBarDataSet addJumpTimeDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        LogUtil.a(TAG, "addJumpTimeDataLayer mode:", mode);
        ArrayList arrayList = new ArrayList(16);
        ArrayList<lmb> arrayListAcquireTrackJumpData = acquireTrackJumpData();
        if (njy.e(arrayListAcquireTrackJumpData)) {
            LogUtil.j(TAG, "init trackJumpData empty,return");
            return null;
        }
        int i = 0;
        int iD = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        double d2 = 0.0d;
        for (lmb lmbVar : arrayListAcquireTrackJumpData) {
            if (lmbVar != null) {
                arrayList.add(new HwHealthBarEntry(lmbVar.b(), new qmf(lmbVar.d())));
                if (lmbVar.d() > iD) {
                    iD = lmbVar.d();
                }
                d2 += (double) lmbVar.d();
                i++;
                i2 = 0;
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthBarDataSet hwHealthBarDataSetD = qtm.d(arrayList, this.mContext);
        float fAcquireJumpTotalTime = acquireJumpTotalTime();
        if (fAcquireJumpTotalTime > 0.0f) {
            LogUtil.d(TAG, "addSpo2DataLayer acquire total SumTime:", Float.valueOf(fAcquireJumpTotalTime));
            hwHealthBarDataSetD.setXMaxForcedValue(fAcquireJumpTotalTime);
        }
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addJumpTimeDataLayer customAxisByDataBoard mode=", mode, " max=", Integer.valueOf(iD), " min=", Integer.valueOf(i2));
            qtm.e(new d(hwHealthBaseCombinedChart, hwHealthBarDataSetD, mode, iD, i > 0 ? (float) (d2 / ((double) i)) : 0.0f, i2, cVar.f24022a, false, false));
        }
        qtm.e(hwHealthBaseCombinedChart, cVar, hwHealthBarDataSetD, 255, 0.2f, 255, 9.0f, this.mModes);
        return hwHealthBarDataSetD;
    }

    public HwHealthBarDataSet addJumpHeightDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        return addJumpHeightDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public HwHealthBarDataSet addJumpHeightDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null) {
            return null;
        }
        return addJumpHeightDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    private HwHealthBarDataSet addJumpHeightDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        HwHealthBarEntry hwHealthBarEntry;
        int iA;
        LogUtil.a(TAG, "addJumpHeightDataLayer mode:", mode);
        ArrayList arrayList = new ArrayList(16);
        ArrayList<lmb> arrayListAcquireTrackJumpData = acquireTrackJumpData();
        if (njy.e(arrayListAcquireTrackJumpData)) {
            LogUtil.j(TAG, "init trackJumpData empty,return");
            return null;
        }
        int i = 0;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        double d2 = 0.0d;
        for (lmb lmbVar : arrayListAcquireTrackJumpData) {
            if (lmbVar != null) {
                if (UnitUtil.f()) {
                    hwHealthBarEntry = new HwHealthBarEntry(lmbVar.b(), new qmf((int) UnitUtil.e(lmbVar.a(), 0)));
                } else {
                    hwHealthBarEntry = new HwHealthBarEntry(lmbVar.b(), new qmf(lmbVar.a()));
                }
                arrayList.add(hwHealthBarEntry);
                if (UnitUtil.f()) {
                    iA = (int) UnitUtil.e(lmbVar.a(), 0);
                } else {
                    iA = lmbVar.a();
                }
                if (iA > i2) {
                    i2 = iA;
                }
                d2 += (double) iA;
                i++;
                i3 = 0;
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthBarDataSet hwHealthBarDataSetHandleJumpHeightUnit = handleJumpHeightUnit(arrayList);
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addJumpTimeDataLayer customAxisByDataBoard mode=", mode, " max=", Integer.valueOf(i2), " min=", Integer.valueOf(i3));
            qtm.e(new d(hwHealthBaseCombinedChart, hwHealthBarDataSetHandleJumpHeightUnit, mode, i2, i > 0 ? (float) (d2 / ((double) i)) : 0.0f, i3, cVar.f24022a, false, false));
        }
        qtm.e(hwHealthBaseCombinedChart, cVar, hwHealthBarDataSetHandleJumpHeightUnit, 255, 0.2f, 255, 9.0f, this.mModes);
        return hwHealthBarDataSetHandleJumpHeightUnit;
    }

    private HwHealthBarDataSet handleJumpHeightUnit(List<HwHealthBarEntry> list) {
        String strB = qtm.b(this.mContext);
        String string = this.mContext.getResources().getString(R.string.IDS_aw_version2_jump_height);
        return qtm.e(acquireJumpTotalTime(), new HwHealthBarDataSet(list, string, string, strB));
    }

    protected ArrayList<njm> acquireTrackAltitudeDataFilter() {
        return qtm.b(acquireTrackAltitudeData());
    }

    protected ArrayList<njr> acquireTrackSpeedDataFilter() {
        return qtm.c(acquireTrackRealTimeSpeedData());
    }

    public HwHealthLineDataSet addTrackAltitudeDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        return addTrackAltitudeDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public HwHealthLineDataSet addTrackSpeedDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        return addTrackSpeedDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public HwHealthLineDataSet addTrackAltitudeDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addTrackAltitudeDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    public HwHealthLineDataSet addTrackSpeedDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addTrackSpeedDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    private HwHealthLineDataSet addTrackAltitudeDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        LogUtil.a(TAG, "addTrackAltitudeDataLayer mode:", mode);
        ArrayList<HwHealthBaseEntry> arrayList = new ArrayList<>(16);
        ArrayList<njm> arrayListAcquireTrackAltitudeDataFilter = acquireTrackAltitudeDataFilter();
        if (njy.e(arrayListAcquireTrackAltitudeDataFilter)) {
            LogUtil.j(TAG, "initTrackAltitude trackAltitudeList empty,return");
            return null;
        }
        if (acquireTrackAltitudeShowType() == 0) {
            arrayListAcquireTrackAltitudeDataFilter = qtm.d(arrayListAcquireTrackAltitudeDataFilter);
        }
        ArrayList<njm> arrayList2 = arrayListAcquireTrackAltitudeDataFilter;
        List<SlopeInfo> listAcquireSlopeInfoList = acquireSlopeInfoList();
        boolean zB = njy.b(listAcquireSlopeInfoList);
        int i = 0;
        double dA = 0.0d;
        float fA = Float.MIN_VALUE;
        float fA2 = Float.MAX_VALUE;
        for (njm njmVar : arrayList2) {
            if (njmVar != null) {
                arrayList.add(new HwHealthBaseEntry(njmVar.acquireTime(), (float) njmVar.a()));
                if (njmVar.a() > fA) {
                    fA = (float) njmVar.a();
                }
                if (njmVar.a() < fA2) {
                    fA2 = (float) njmVar.a();
                }
                dA += njmVar.a();
                i++;
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        if (cVar.f24024c) {
            return getSlopeHwHealthLineDataSetHorizon(hwHealthBaseCombinedChart, mode, cVar, arrayList, arrayList2, listAcquireSlopeInfoList, fA, fA2, i, dA);
        }
        return getSlopeHwHealthLineDataSet(hwHealthBaseCombinedChart, mode, cVar, arrayList, zB, arrayList2, listAcquireSlopeInfoList, fA, fA2, i, dA);
    }

    private qtj getSlopeHwHealthLineDataSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar, ArrayList<HwHealthBaseEntry> arrayList, boolean z, ArrayList<njm> arrayList2, List<SlopeInfo> list, float f, float f2, int i, double d2) {
        boolean z2;
        int i2;
        qtj qtjVarHandleAltitudeUnit = handleAltitudeUnit(arrayList);
        if (z) {
            qtjVarHandleAltitudeUnit.setColors(buildAltitudeSegmentColors(arrayList2, list));
            qtjVarHandleAltitudeUnit.a(buildAltitudeSegmentStartGradientColors(arrayList2, list), buildAltitudeSegmentEndGradientColors(arrayList2, list), true);
            z2 = true;
        } else {
            qtjVarHandleAltitudeUnit.setColor(Color.argb(255, 29, 204, 205));
            setAltitudeFillDrawableDefaultGradient(qtjVarHandleAltitudeUnit, true);
            z2 = false;
        }
        if (cVar.f24022a) {
            setAltitudeFillDrawableDefaultGradient(qtjVarHandleAltitudeUnit, false);
        }
        boolean z3 = acquireTrackAltitudeShowType() == 1;
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addTrackAltitudeDataLayer customAxisByDataBoard mode=", mode, " max=", LogAnonymous.d((int) f), " min=", LogAnonymous.d((int) f2));
            qtm.b(new d(hwHealthBaseCombinedChart, qtjVarHandleAltitudeUnit, mode, f, i > 0 ? (float) (d2 / ((double) i)) : 0.0f, f2, cVar.f24022a, z3, false), z2);
            i2 = 29;
        } else {
            i2 = 29;
        }
        handleAltitudeDataSet(hwHealthBaseCombinedChart, cVar, qtjVarHandleAltitudeUnit, arrayList2, list);
        qtm.d(hwHealthBaseCombinedChart, cVar, i == 0 ? (float) d2 : (float) (d2 / ((double) i)), Color.argb(255, i2, 204, 205));
        return qtjVarHandleAltitudeUnit;
    }

    private HwHealthLineDataSet getSlopeHwHealthLineDataSetHorizon(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar, ArrayList<HwHealthBaseEntry> arrayList, ArrayList<njm> arrayList2, List<SlopeInfo> list, float f, float f2, int i, double d2) {
        qtj qtjVarHandleAltitudeUnit = handleAltitudeUnit(arrayList);
        qtjVarHandleAltitudeUnit.setColor(Color.argb(255, 29, 204, 205));
        setAltitudeFillDrawableDefaultGradient(qtjVarHandleAltitudeUnit, true);
        boolean z = acquireTrackAltitudeShowType() == 1;
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addTrackAltitudeDataLayer customAxisByDataBoard mode=", mode, " max=", LogAnonymous.d((int) f), " min=", LogAnonymous.d((int) f2));
            qtm.e(new d(hwHealthBaseCombinedChart, qtjVarHandleAltitudeUnit, mode, f, i > 0 ? (float) (d2 / ((double) i)) : 0.0f, f2, cVar.f24022a, z, false));
        }
        handleAltitudeDataSet(hwHealthBaseCombinedChart, cVar, qtjVarHandleAltitudeUnit, arrayList2, list);
        qtm.d(hwHealthBaseCombinedChart, cVar, i == 0 ? (float) d2 : (float) (d2 / ((double) i)), Color.argb(255, 29, 204, 205));
        return qtjVarHandleAltitudeUnit;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f24030c;
        public final float d;
        public final float e;

        public e(int i, int i2, float f, float f2, int i3) {
            this.f24029b = i;
            this.f24030c = i2;
            this.d = f;
            this.e = f2;
            this.f24028a = i3;
        }
    }

    private void handleAltitudeDataSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, HwHealthLineDataSet hwHealthLineDataSet, ArrayList<njm> arrayList, List<SlopeInfo> list) {
        qtm.b(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSet);
        qtm.b(hwHealthLineDataSet);
        new qpf().initStyle(hwHealthBaseCombinedChart, hwHealthLineDataSet);
        addDataSet(hwHealthBaseCombinedChart, hwHealthLineDataSet);
        if (!njy.b(list) || cVar.f24024c) {
            return;
        }
        List<e> listBuildSlopeMarkers = buildSlopeMarkers(arrayList, list);
        frp frpVar = new frp(hwHealthBaseCombinedChart, hwHealthBaseCombinedChart.getAnimator(), hwHealthBaseCombinedChart.getViewPortHandler(), this.mContext);
        frpVar.a(listBuildSlopeMarkers);
        hwHealthBaseCombinedChart.setRenderer(frpVar);
    }

    private List<e> buildSlopeMarkers(ArrayList<njm> arrayList, List<SlopeInfo> list) {
        int endAltIndex;
        njm njmVar;
        ArrayList arrayList2 = new ArrayList();
        if (!njy.e(list) && !njy.e(arrayList)) {
            for (SlopeInfo slopeInfo : list) {
                if (slopeInfo != null && (endAltIndex = slopeInfo.getEndAltIndex()) >= 0 && endAltIndex < arrayList.size() && (njmVar = arrayList.get(endAltIndex)) != null) {
                    arrayList2.add(new e(slopeInfo.getNumber(), endAltIndex, njmVar.acquireTime(), (float) njmVar.a(), Color.argb(102.0f, 0.0f, 0.0f, 0.0f)));
                }
            }
        }
        return arrayList2;
    }

    private qtj handleAltitudeUnit(ArrayList<HwHealthBaseEntry> arrayList) {
        String string;
        if (acquireTrackAltitudeShowType() == 0) {
            string = this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_climbed_withot_unit);
        } else {
            string = this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_alti);
        }
        String str = string;
        qtj qtjVar = new qtj(BaseApplication.getContext(), arrayList, str, str, qtm.c(this.mContext), acquireTrackAltitudeDataInterval());
        qtm.a(qtjVar);
        return qtjVar;
    }

    private int[] buildAltitudeSegmentColors(ArrayList<njm> arrayList, List<SlopeInfo> list) {
        int size = arrayList.size();
        int[] iArr = new int[size];
        Arrays.fill(iArr, Color.argb(255, 29, 204, 205));
        for (SlopeInfo slopeInfo : list) {
            if (slopeInfo != null) {
                int startAltIndex = slopeInfo.getStartAltIndex();
                int endAltIndex = slopeInfo.getEndAltIndex();
                int level = slopeInfo.getLevel();
                if (startAltIndex >= 0 && endAltIndex < size && startAltIndex <= endAltIndex) {
                    int iD = qtm.d(level);
                    while (startAltIndex <= endAltIndex) {
                        iArr[startAltIndex] = iD;
                        startAltIndex++;
                    }
                }
            }
        }
        return iArr;
    }

    private int[] buildAltitudeSegmentStartGradientColors(ArrayList<njm> arrayList, List<SlopeInfo> list) {
        int size = arrayList.size();
        int[] iArr = new int[size];
        Arrays.fill(iArr, Color.argb(76, 29, 204, 205));
        for (SlopeInfo slopeInfo : list) {
            if (slopeInfo != null) {
                int startAltIndex = slopeInfo.getStartAltIndex();
                int endAltIndex = slopeInfo.getEndAltIndex();
                int level = slopeInfo.getLevel();
                if (startAltIndex >= 0 && endAltIndex < size && startAltIndex <= endAltIndex) {
                    int iA = qtm.a(level);
                    while (startAltIndex <= endAltIndex) {
                        iArr[startAltIndex] = iA;
                        startAltIndex++;
                    }
                }
            }
        }
        return iArr;
    }

    private int[] buildAltitudeSegmentEndGradientColors(ArrayList<njm> arrayList, List<SlopeInfo> list) {
        int size = arrayList.size();
        int[] iArr = new int[size];
        Arrays.fill(iArr, Color.argb(0, 29, 204, 205));
        for (SlopeInfo slopeInfo : list) {
            if (slopeInfo != null) {
                int startAltIndex = slopeInfo.getStartAltIndex();
                int endAltIndex = slopeInfo.getEndAltIndex();
                int level = slopeInfo.getLevel();
                if (startAltIndex >= 0 && endAltIndex < size && startAltIndex <= endAltIndex) {
                    int iA = qtm.a(level);
                    int iArgb = Color.argb(0, Color.red(iA), Color.green(iA), Color.blue(iA));
                    while (startAltIndex <= endAltIndex) {
                        iArr[startAltIndex] = iArgb;
                        startAltIndex++;
                    }
                }
            }
        }
        return iArr;
    }

    private void setAltitudeFillDrawableDefaultGradient(HwHealthLineDataSet hwHealthLineDataSet, boolean z) {
        hwHealthLineDataSet.a(Color.argb(127, 29, 204, 205), Color.argb(0, 29, 204, 205), z);
    }

    private HwHealthLineDataSet addTrackSpeedDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        String str = TAG;
        LogUtil.a(TAG, "addTrackSpeedDataLayer mode:", mode);
        ArrayList<HwHealthBaseEntry> arrayList = new ArrayList<>(16);
        ArrayList<njr> arrayListAcquireTrackSpeedDataFilter = acquireTrackSpeedDataFilter();
        if (njy.e(arrayListAcquireTrackSpeedDataFilter)) {
            LogUtil.j(TAG, "initTrackSpeed trackSpeedList empty,return");
            return null;
        }
        Iterator<njr> it = arrayListAcquireTrackSpeedDataFilter.iterator();
        float fC = Float.MIN_VALUE;
        float fC2 = Float.MAX_VALUE;
        int i = 0;
        double dC = 0.0d;
        while (it.hasNext()) {
            njr next = it.next();
            if (next != null) {
                String str2 = str;
                Iterator<njr> it2 = it;
                arrayList.add(new HwHealthBaseEntry(next.acquireTime(), (float) next.c()));
                if (next.c() > fC) {
                    fC = (float) next.c();
                }
                if (next.c() < fC2) {
                    fC2 = (float) next.c();
                }
                dC += next.c();
                i++;
                str = str2;
                it = it2;
            }
        }
        String str3 = str;
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthLineDataSet hwHealthLineDataSet = getHwHealthLineDataSet(arrayList);
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(str3, "addTrackSpeedDataLayer customAxisByDataBoard mode=", mode);
            qtm.e(new d(hwHealthBaseCombinedChart, hwHealthLineDataSet, mode, fC, i > 0 ? (float) (dC / ((double) i)) : 0.0f, fC2, cVar.f24022a, false, false));
        }
        handleSpeedDataSet(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSet);
        return hwHealthLineDataSet;
    }

    private void handleSpeedDataSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, HwHealthLineDataSet hwHealthLineDataSet) {
        if (cVar.f24022a) {
            setSpeedFillDrawableDefaultGradient(hwHealthLineDataSet, false);
        }
        qtm.b(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSet);
        qtm.b(hwHealthLineDataSet);
        new qpf().initStyle(hwHealthBaseCombinedChart, hwHealthLineDataSet);
        addDataSet(hwHealthBaseCombinedChart, hwHealthLineDataSet);
    }

    private void setSpeedFillDrawableDefaultGradient(HwHealthLineDataSet hwHealthLineDataSet, boolean z) {
        hwHealthLineDataSet.a(Color.argb(128, 0, com.huawei.hms.kit.awareness.barrier.internal.e.a.A, 38), Color.argb(0, 0, com.huawei.hms.kit.awareness.barrier.internal.e.a.A, 38), z);
    }

    private HwHealthLineDataSet getHwHealthLineDataSet(ArrayList<HwHealthBaseEntry> arrayList) {
        HwHealthLineDataSet hwHealthLineDataSet;
        if (!UnitUtil.f()) {
            hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, this.mContext.getResources().getString(R.string.IDS_motiontrack_show_sport_tip_icon_text_pace), this.mContext.getResources().getString(R.string.IDS_motiontrack_show_sport_tip_icon_text_pace), this.mContext.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed), acquireTrackRealTimeSpeedDataInterval());
        } else {
            hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, this.mContext.getResources().getString(R.string.IDS_motiontrack_show_sport_tip_icon_text_pace), this.mContext.getResources().getString(R.string.IDS_motiontrack_show_sport_tip_icon_text_pace), this.mContext.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp), acquireTrackRealTimeSpeedDataInterval());
        }
        hwHealthLineDataSet.e(2);
        hwHealthLineDataSet.setColor(Color.argb(255, 0, com.huawei.hms.kit.awareness.barrier.internal.e.a.A, 38));
        setSpeedFillDrawableDefaultGradient(hwHealthLineDataSet, true);
        return hwHealthLineDataSet;
    }

    public boolean isExistHeartRateData() {
        if (njy.e(acquireHeartRateData())) {
            return false;
        }
        for (HeartRateData heartRateData : acquireHeartRateData()) {
            if (heartRateData != null && heartRateData.acquireHeartRate() != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistStepRateData() {
        if (njy.e(acquireStepRateData())) {
            return false;
        }
        for (StepRateData stepRateData : acquireStepRateData()) {
            if (stepRateData != null && stepRateData.acquireStepRate() != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistCadenceRateData() {
        if (njy.e(acquireRidePostureData())) {
            return false;
        }
        for (gzr gzrVar : acquireRidePostureData()) {
            if (gzrVar != null && gzrVar.c() != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistPaddleFreqData() {
        if (njy.e(acquirePaddleFrequencyData())) {
            return false;
        }
        for (nji njiVar : acquirePaddleFrequencyData()) {
            if (njiVar != null && njiVar.c() != 0.0f) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistWeightFreqData() {
        if (njy.e(acquireWeightData())) {
            return false;
        }
        for (njs njsVar : acquireWeightData()) {
            if (njsVar != null && njsVar.acquireTime() != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistAnalogCadenceData() {
        return qtm.e(acquireAnalogCadenceData());
    }

    public boolean isExistPowerData() {
        return qtm.c(acquirePoweData());
    }

    public boolean isExistAnalogPowerData() {
        return qtm.d(acquireAnalogPowerData());
    }

    public boolean isExistSkippingSpeedData() {
        if (njy.e(acquireSkippingSpeedData())) {
            return false;
        }
        for (njg njgVar : acquireSkippingSpeedData()) {
            if (njgVar != null && njgVar.c() != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistAltitudeData() {
        if (njy.e(acquireTrackAltitudeData())) {
            return false;
        }
        for (njm njmVar : acquireTrackAltitudeData()) {
            if (njmVar != null && !CommonUtil.b(njmVar.a())) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistSpeedData() {
        if (njy.e(acquireTrackRealTimeSpeedData())) {
            return false;
        }
        for (njr njrVar : acquireTrackRealTimeSpeedData()) {
            if (njrVar != null && !CommonUtil.b(njrVar.c())) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistSwolfData() {
        if (njy.e(acquireSwolfData())) {
            return false;
        }
        for (njq njqVar : acquireSwolfData()) {
            if (njqVar != null && njqVar.c() != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistPullFreqData() {
        if (njy.e(acquirePullFreqData())) {
            return false;
        }
        for (njp njpVar : acquirePullFreqData()) {
            if (njpVar != null && njpVar.e() != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistRealTimePaceData() {
        if (njy.e(acquireTrackRealTimePaceData())) {
            return false;
        }
        for (njl njlVar : acquireTrackRealTimePaceData()) {
            if (njlVar != null && njlVar.e() != 0) {
                return true;
            }
        }
        return njy.b(acquireTrackRealTimePaceData());
    }

    public boolean isExistSpo2Data() {
        if (njy.e(acquireTrackSpo2Data())) {
            return false;
        }
        for (nju njuVar : acquireTrackSpo2Data()) {
            if (njuVar != null && njuVar.b() != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistRunningPostureData() {
        if (njy.e(acquireRunningPostureData())) {
            return false;
        }
        for (gzv gzvVar : acquireRunningPostureData()) {
            if (gzvVar != null && !qtm.b(gzvVar)) {
                return true;
            }
        }
        return false;
    }

    public boolean isGcBalanceValid() {
        return hah.c(acquireRunningPostureData());
    }

    public boolean isActivePeakValid() {
        return hah.a(acquireRunningPostureData());
    }

    public boolean isVerticalRatioValid() {
        return hah.i(acquireRunningPostureData());
    }

    public boolean isContractTimeValid() {
        return hah.b(acquireRunningPostureData());
    }

    public boolean isImpactHangRateValid() {
        return hah.g(acquireRunningPostureData());
    }

    public boolean isHangTimeValid() {
        return hah.h(acquireRunningPostureData());
    }

    public boolean isVerticalOscillationValid() {
        return hah.f(acquireRunningPostureData());
    }

    public boolean isGroundImpactAccelerationValid() {
        return hah.e(acquireRunningPostureData());
    }

    public boolean isExistNewRunningPostureData() {
        if (njy.e(acquireRunningPostureData())) {
            return false;
        }
        for (gzv gzvVar : acquireRunningPostureData()) {
            if (gzvVar != null && !qtm.a(gzvVar)) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistBoltData() {
        if (njy.e(acquireRunningPostureData())) {
            return false;
        }
        for (gzv gzvVar : acquireRunningPostureData()) {
            if (gzvVar != null && qtm.c(gzvVar)) {
                return true;
            }
        }
        return false;
    }

    public static class a {
        public int d;
        public int e;

        public a(int i, int i2) {
            this.e = i;
            this.d = i2;
        }
    }

    public HwHealthLineDataSet addTrackSwolfDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        return addTrackSwolfDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public HwHealthLineDataSet addTrackSwolfDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addTrackSwolfDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    private HwHealthLineDataSet addTrackSwolfDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        LogUtil.a(TAG, "addTrackSwolfDataLayer mode:", mode);
        ArrayList arrayList = new ArrayList(16);
        List<njq> listAcquireSwolfData = acquireSwolfData();
        if (njy.e(listAcquireSwolfData)) {
            LogUtil.j(TAG, "inittrackSwolfList trackSwolfList empty,return");
            return null;
        }
        double dC = 0.0d;
        float fC = Float.MAX_VALUE;
        float fC2 = Float.MIN_VALUE;
        int i = 0;
        for (njq njqVar : listAcquireSwolfData) {
            if (njqVar != null) {
                arrayList.add(new HwHealthBaseEntry(njqVar.acquireTime(), njqVar.c()));
                if (njqVar.c() > fC2) {
                    fC2 = njqVar.c();
                }
                if (njqVar.c() < fC) {
                    fC = njqVar.c();
                }
                dC += (double) njqVar.c();
                i++;
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_swim_SWOLF), this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_swim_SWOLF), "", acquireSwolfDataInterval());
        hwHealthLineDataSet.setColor(Color.argb(255, 69, 154, 255));
        hwHealthLineDataSet.a(Color.argb(128, 69, 154, 255), Color.argb(0, 69, 154, 255), true);
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addTrackSwolfDataLayer customAxisByDataBoard mode=", mode);
            qtm.e(new d(hwHealthBaseCombinedChart, hwHealthLineDataSet, mode, fC2, i > 0 ? (float) (dC / ((double) i)) : 0.0f, fC, cVar.f24022a, false, false));
        }
        if (cVar.f24022a) {
            hwHealthLineDataSet.a(Color.argb(216, 69, 154, 255), Color.argb(38, 69, 154, 255), false);
        }
        handleSwolfDataSet(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSet);
        return hwHealthLineDataSet;
    }

    private void handleSwolfDataSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, HwHealthLineDataSet hwHealthLineDataSet) {
        qtm.b(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSet);
        new qpk().initStyle(hwHealthBaseCombinedChart, hwHealthLineDataSet);
        addDataSet(hwHealthBaseCombinedChart, hwHealthLineDataSet);
    }

    public HwHealthLineDataSet addTrackPullFreqDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        return addTrackPullFreqDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public HwHealthLineDataSet addTrackPullFreqDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addTrackPullFreqDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    private HwHealthLineDataSet addTrackPullFreqDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        LogUtil.a(TAG, "addTrackPullFreqDataLayer mode:", mode);
        ArrayList<HwHealthBaseEntry> arrayList = new ArrayList<>(16);
        List<njp> listAcquirePullFreqData = acquirePullFreqData();
        if (njy.e(listAcquirePullFreqData)) {
            LogUtil.j(TAG, "trackPullFreqDataList empty,return");
            return null;
        }
        float fE = Float.MIN_VALUE;
        double dE = 0.0d;
        float fE2 = Float.MAX_VALUE;
        int i = 0;
        for (njp njpVar : listAcquirePullFreqData) {
            if (njpVar != null) {
                arrayList.add(new HwHealthBaseEntry(njpVar.acquireTime(), njpVar.e()));
                if (njpVar.e() > fE) {
                    fE = njpVar.e();
                }
                if (njpVar.e() < fE2) {
                    fE2 = njpVar.e();
                }
                dE += (double) njpVar.e();
                i++;
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthLineDataSet pullFreqDataSet = getPullFreqDataSet(arrayList);
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addTrackPullFreqDataLayer customAxisByDataBoard mode=", mode);
            qtm.e(new d(hwHealthBaseCombinedChart, pullFreqDataSet, mode, fE, i > 0 ? (float) (dE / ((double) i)) : 0.0f, fE2, cVar.f24022a, false, false));
        }
        if (cVar.f24022a) {
            pullFreqDataSet.a(Color.argb(216, 255, 176, 0), Color.argb(38, 255, 176, 0), false);
        }
        handlePullFreqDataSet(hwHealthBaseCombinedChart, cVar, pullFreqDataSet);
        return pullFreqDataSet;
    }

    private void handlePullFreqDataSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, HwHealthLineDataSet hwHealthLineDataSet) {
        qtm.b(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSet);
        new qpf().initStyle(hwHealthBaseCombinedChart, hwHealthLineDataSet);
        addDataSet(hwHealthBaseCombinedChart, hwHealthLineDataSet);
    }

    private HwHealthLineDataSet getPullFreqDataSet(ArrayList<HwHealthBaseEntry> arrayList) {
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_pull_frequence), this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_pull_frequence), this.mContext.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_stroke_rate_unit, 10), acquirePullFreqDataInterval());
        hwHealthLineDataSet.setColor(Color.argb(255, 255, 176, 0));
        hwHealthLineDataSet.a(Color.argb(217, 255, 176, 0), Color.argb(38, 255, 176, 0), true);
        return hwHealthLineDataSet;
    }

    public HwHealthLineDataSet addTrackRealTimePaceDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, float f) {
        return addTrackRealTimePaceDataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode, f);
    }

    public HwHealthLineDataSet addTrackRealTimePaceDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, float f) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addTrackRealTimePaceDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar, f);
    }

    private HwHealthLineDataSet addTrackRealTimePaceDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar, float f) {
        int i;
        LogUtil.a(TAG, "addTrackRealTimePaceDataLayer mode:", mode);
        ArrayList<HwHealthBaseEntry> arrayList = new ArrayList<>(16);
        List<njl> listAcquireTrackRealTimePaceData = acquireTrackRealTimePaceData();
        if (njy.e(listAcquireTrackRealTimePaceData)) {
            LogUtil.j(TAG, "addTrackRealTimePaceDataLayer trackSwolfList empty,return");
            return null;
        }
        Iterator<njl> it = listAcquireTrackRealTimePaceData.iterator();
        float fE = Float.MIN_VALUE;
        double dE = 0.0d;
        float fE2 = Float.MAX_VALUE;
        int i2 = 0;
        while (it.hasNext()) {
            njl next = it.next();
            if (next != null) {
                Iterator<njl> it2 = it;
                arrayList.add(new HwHealthBaseEntry(next.acquireTime(), next.e()));
                if (next.e() > fE) {
                    fE = next.e();
                }
                if (next.e() < fE2) {
                    fE2 = next.e();
                }
                dE += (double) next.e();
                i2++;
                it = it2;
            }
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthLineDataSet hwHealthLineDataSetHandleRealTimePaceDataSet = handleRealTimePaceDataSet(arrayList);
        int iArgb = Color.argb(255, 0, com.huawei.hms.kit.awareness.barrier.internal.e.a.A, 38);
        hwHealthLineDataSetHandleRealTimePaceDataSet.setColor(iArgb);
        hwHealthLineDataSetHandleRealTimePaceDataSet.a(Color.argb(128, 0, com.huawei.hms.kit.awareness.barrier.internal.e.a.A, 38), Color.argb(0, 0, com.huawei.hms.kit.awareness.barrier.internal.e.a.A, 38), true);
        if (mode != Mode.MODE_NONE) {
            LogUtil.a(TAG, "addTrackRealTimePaceDataLayer customAxisByDataBoard mode=", mode);
            i = iArgb;
            qtm.e(new d(hwHealthBaseCombinedChart, hwHealthLineDataSetHandleRealTimePaceDataSet, mode, fE, i2 > 0 ? (float) (dE / ((double) i2)) : 0.0f, fE2, cVar.f24022a, false, true));
        } else {
            i = iArgb;
        }
        if (cVar.f24022a) {
            hwHealthLineDataSetHandleRealTimePaceDataSet.a(Color.argb(128, 0, com.huawei.hms.kit.awareness.barrier.internal.e.a.A, 38), Color.argb(0, 0, com.huawei.hms.kit.awareness.barrier.internal.e.a.A, 38), false);
        }
        qtm.b(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSetHandleRealTimePaceDataSet);
        qtm.b(hwHealthLineDataSetHandleRealTimePaceDataSet);
        new qpe().initStyle(hwHealthBaseCombinedChart, hwHealthLineDataSetHandleRealTimePaceDataSet);
        qtm.e(hwHealthBaseCombinedChart, cVar, f, i, hcc.d(this.mContext, f));
        addDataSet(hwHealthBaseCombinedChart, hwHealthLineDataSetHandleRealTimePaceDataSet);
        return hwHealthLineDataSetHandleRealTimePaceDataSet;
    }

    private HwHealthLineDataSet handleRealTimePaceDataSet(ArrayList<HwHealthBaseEntry> arrayList) {
        Resources resources = this.mContext.getResources();
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, this.mContext.getResources().getString(R.string.IDS_motiontrack_show_map_sport_peisu_1), this.mContext.getResources().getString(R.string.IDS_motiontrack_show_map_sport_peisu_1), resources != null ? qtm.e(resources, this.mSportType, "", this.mContext) : "");
        if (acquireRealTimePaceDataSumTime() > 0.0f) {
            LogUtil.d(TAG, "acquireRealTimePaceDataSumTime:", LogAnonymous.a((long) acquireRealTimePaceDataSumTime()));
            hwHealthLineDataSet.setXMaxForcedValue(acquireRealTimePaceDataSumTime());
        }
        return hwHealthLineDataSet;
    }

    public HwHealthLineDataSet addRunningPostureDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, int i) {
        c cVar = new c();
        if (i != 8) {
            cVar.c(true);
        }
        return addRunningPostureDataLayer(hwHealthBaseCombinedChart, cVar, i);
    }

    public HwHealthLineDataSet addRunningPostureDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, int i, float f) {
        c cVar = new c();
        if (i != 8) {
            cVar.c(true);
        }
        if (hwHealthBaseCombinedChart == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addRunningPostureDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar, i, f);
    }

    public HwHealthLineDataSet addRunningPostureDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, int i, float f) {
        if (hwHealthBaseCombinedChart == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addRunningPostureDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar, i, f);
    }

    public HwHealthLineDataSet addRunningPostureDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar, int i) {
        if (hwHealthBaseCombinedChart == null || cVar == null || this.mContext == null) {
            LogUtil.j(TAG, "chart or showMode ,mContext is null");
            return null;
        }
        return addRunningPostureDataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar, i, Float.MAX_VALUE);
    }

    private HwHealthLineDataSet addRunningPostureDataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar, int i, float f) {
        LogUtil.a(TAG, "addRunningPostureDataLayer mode:", mode);
        ArrayList<HwHealthBaseEntry> arrayList = new ArrayList<>(16);
        List<gzv> listAcquireRunningPostureData = acquireRunningPostureData();
        if (njy.e(listAcquireRunningPostureData)) {
            LogUtil.j(TAG, "addRunningPostureDataLayer runningPostureList empty,return");
            return null;
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MIN_VALUE;
        int i2 = 0;
        double d2 = 0.0d;
        for (gzv gzvVar : listAcquireRunningPostureData) {
            if (gzvVar != null) {
                float fA = qtm.a(gzvVar, i);
                if (Math.abs(10000.0f + fA) >= 1.0E-7d) {
                    arrayList.add(new HwHealthBaseEntry(gzvVar.h(), fA));
                    if (fA > f3) {
                        f3 = fA;
                    }
                    if (fA < f2) {
                        f2 = fA;
                    }
                    d2 += (double) fA;
                    i2++;
                }
            }
        }
        HwHealthLineDataSet hwHealthLineDataSetHandleRunningPostureDataSet = handleRunningPostureDataSet(cVar, i, arrayList);
        float f4 = f2 >= f ? f - 1.0f : f2;
        if (mode != Mode.MODE_NONE) {
            if (i == 19) {
                qtm.b(new d(hwHealthBaseCombinedChart, hwHealthLineDataSetHandleRunningPostureDataSet, mode, f3, i2 > 0 ? (float) (d2 / ((double) i2)) : 0.0f, f4, cVar.f24022a, false, false));
            } else {
                qtm.e(new d(hwHealthBaseCombinedChart, hwHealthLineDataSetHandleRunningPostureDataSet, mode, f3, i2 > 0 ? (float) (d2 / ((double) i2)) : 0.0f, f4, cVar.f24022a, false, false));
            }
        }
        qtm.b(hwHealthBaseCombinedChart, cVar, getAvgLine(f, i), qtf.b(i), (String) null, getRunningPostureDataParser());
        qtm.b(hwHealthBaseCombinedChart, cVar, hwHealthLineDataSetHandleRunningPostureDataSet);
        qtf.e(hwHealthLineDataSetHandleRunningPostureDataSet);
        new qpi().initStyle(hwHealthBaseCombinedChart, hwHealthLineDataSetHandleRunningPostureDataSet);
        if (cVar.f24023b) {
            addDotGraphDataSet(hwHealthBaseCombinedChart, hwHealthLineDataSetHandleRunningPostureDataSet);
            return hwHealthLineDataSetHandleRunningPostureDataSet;
        }
        addDataSet(hwHealthBaseCombinedChart, hwHealthLineDataSetHandleRunningPostureDataSet);
        return hwHealthLineDataSetHandleRunningPostureDataSet;
    }

    private static HwHealthBaseCombinedChart.DataParser getRunningPostureDataParser() {
        return new HwHealthBaseCombinedChart.DataParser() { // from class: com.huawei.ui.commonui.view.trackview.TrackLineChartHolder.4
            @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.DataParser
            public boolean isSupportOverlaying() {
                return false;
            }

            @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.DataParser
            public boolean isSupportSampling() {
                return false;
            }

            @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.DataParser
            public void onOverlaying(List<HwHealthBaseEntry> list, HwHealthLineDataSet hwHealthLineDataSet) {
            }

            @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.DataParser
            public int onSampling(List<HwHealthBaseEntry> list, int i, HwHealthLineDataSet hwHealthLineDataSet) {
                return 0;
            }
        };
    }

    private float getAvgLine(float f, int i) {
        return (i == 18 && UnitUtil.f()) ? (float) UnitUtil.e(f, 0) : f;
    }

    private HwHealthLineDataSet handleRunningPostureDataSet(c cVar, int i, ArrayList<HwHealthBaseEntry> arrayList) {
        HwHealthLineDataSet hwHealthLineDataSetC;
        int i2;
        int i3;
        HwHealthLineDataSet hwHealthLineDataSetB;
        HwHealthLineDataSet hwHealthLineDataSet;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        if (i == 7) {
            hwHealthLineDataSetC = qtf.e(arrayList, this.mContext, cVar);
            i2 = com.huawei.hms.kit.awareness.barrier.internal.e.a.z;
            i3 = 148;
        } else {
            if (i == 8) {
                hwHealthLineDataSet = new HwHealthLineDataSet(BaseApplication.getContext(), arrayList, this.mContext.getResources().getString(R.string.IDS_running_posture_ground_impact_acceleration), this.mContext.getResources().getString(R.string.IDS_running_posture_ground_impact_acceleration), this.mContext.getResources().getString(R.string.IDS_gravity_unit), acquireRunningPostureDataInterval());
                i5 = 124;
                i4 = 255;
            } else {
                if (i == 16) {
                    hwHealthLineDataSetB = qtf.d(arrayList, this.mContext, cVar);
                } else if (i == 19) {
                    hwHealthLineDataSetB = qtf.a(arrayList, this.mContext, cVar);
                    hwHealthLineDataSetB.e(1);
                } else if (i == 20) {
                    hwHealthLineDataSetB = qtf.f(arrayList, this.mContext, cVar);
                    hwHealthLineDataSetB.e(1);
                } else if (i == 18) {
                    hwHealthLineDataSetB = qtf.i(arrayList, this.mContext, cVar);
                    hwHealthLineDataSetB.e(1);
                } else if (i == 21) {
                    hwHealthLineDataSetB = qtf.b(arrayList, this.mContext, cVar);
                    hwHealthLineDataSetB.e(1);
                } else {
                    hwHealthLineDataSetC = qtf.c(arrayList, this.mContext, cVar);
                    hwHealthLineDataSetC.e(1);
                    i9 = 150;
                    i2 = com.huawei.hms.kit.awareness.barrier.internal.e.a.A;
                    i3 = 115;
                }
                hwHealthLineDataSet = hwHealthLineDataSetB;
                i4 = 219;
                i5 = 177;
                i9 = 69;
            }
            i6 = i5;
            i7 = i4;
            i8 = i9;
            qtm.d(acquireRunningPostureDataSumTime(), TAG, hwHealthLineDataSet, 255, i8, i6, i7, cVar, 0.5f, 0.15f);
            return hwHealthLineDataSet;
        }
        i6 = i2;
        i7 = i3;
        i8 = i9;
        hwHealthLineDataSet = hwHealthLineDataSetC;
        qtm.d(acquireRunningPostureDataSumTime(), TAG, hwHealthLineDataSet, 255, i8, i6, i7, cVar, 0.5f, 0.15f);
        return hwHealthLineDataSet;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f24025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f24026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f24027c;
        private final HwHealthBaseCombinedChart d;
        private final boolean e;
        private final float f;
        private final HwHealthBaseBarLineDataSet g;
        private final float i;
        private final Mode j;

        public d(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, Mode mode, float f, float f2, float f3, boolean z, boolean z2, boolean z3) {
            this.d = hwHealthBaseCombinedChart;
            this.g = hwHealthBaseBarLineDataSet;
            this.j = mode;
            this.f = f;
            this.f24025a = f2;
            this.i = f3;
            this.e = z;
            this.f24027c = z2;
            this.f24026b = z3;
        }

        public HwHealthBaseCombinedChart b() {
            return this.d;
        }

        public HwHealthBaseBarLineDataSet g() {
            return this.g;
        }

        public Mode a() {
            return this.j;
        }

        public float c() {
            return this.f;
        }

        public float e() {
            return this.i;
        }

        public float d() {
            return this.f24025a;
        }

        public boolean i() {
            return this.e;
        }
    }

    public HwHealthBarDataSet addSpo2DataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        return addSpo2DataLayer(hwHealthBaseCombinedChart, this.mDefaultShowMode);
    }

    public HwHealthBarDataSet addSpo2DataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, c cVar) {
        if (hwHealthBaseCombinedChart == null || cVar == null) {
            return null;
        }
        return addSpo2DataLayer(hwHealthBaseCombinedChart, qtm.c(hwHealthBaseCombinedChart), cVar);
    }

    private HwHealthBarDataSet addSpo2DataLayer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, Mode mode, c cVar) {
        LogUtil.a(TAG, "addSpo2DataLayer mode:", mode);
        List<HwHealthBarEntry> listBuildSpo2ChartValues = buildSpo2ChartValues(cVar.f24024c);
        if (njy.e(listBuildSpo2ChartValues)) {
            LogUtil.j(TAG, "initStepRate stepRateList empty,return");
            return null;
        }
        if (!hwHealthBaseCombinedChart.containsMarkViewShow()) {
            hwHealthBaseCombinedChart.highlightDefValue(-1, true);
        }
        HwHealthBarDataSet hwHealthBarDataSet = new HwHealthBarDataSet(listBuildSpo2ChartValues, this.mContext.getResources().getString(R.string.IDS_hw_health_blood_oxygen), this.mContext.getResources().getString(R.string.IDS_hw_health_blood_oxygen), "");
        hwHealthBarDataSet.setColors(qqg.a(this.mContext, 100, cVar.f24024c));
        hwHealthBarDataSet.e(HwHealthBarDataSet.DrawColorMode.DATA_COLOR);
        hwHealthBarDataSet.e(Color.argb(255, 141, com.huawei.hms.kit.awareness.barrier.internal.e.a.M, 141));
        float fAcquireSpo2SumTime = acquireSpo2SumTime();
        if (fAcquireSpo2SumTime > 0.0f) {
            LogUtil.d(TAG, "addSpo2DataLayer acquireSpo2SumTime:", Float.valueOf(fAcquireSpo2SumTime));
            hwHealthBarDataSet.setXMaxForcedValue(fAcquireSpo2SumTime);
        }
        hwHealthBarDataSet.setBarDrawWidthDp(1.5f);
        hwHealthBarDataSet.setSearchByBarWidth(true);
        if (mode != Mode.MODE_NONE) {
            int i = 70;
            LogUtil.a(TAG, "addSpo2DataLayer customAxisByDataBoard mode=", mode, " max=", 100, " min=", 70);
            if (cVar.f24022a) {
                hwHealthBarDataSet.setLabelCount(qtm.e(100, 70, cVar.f24022a).d, true);
            } else {
                hwHealthBarDataSet.setForcedLabels(qqg.d(cVar.f24024c));
                i = 68;
            }
            qtm.e(hwHealthBaseCombinedChart, hwHealthBarDataSet, mode, 100, i);
        }
        qtm.b(hwHealthBaseCombinedChart, cVar, hwHealthBarDataSet);
        new qph().initStyle(hwHealthBaseCombinedChart, hwHealthBarDataSet);
        qtm.a(hwHealthBaseCombinedChart, hwHealthBarDataSet, this.mModes);
        return hwHealthBarDataSet;
    }

    private List<HwHealthBarEntry> buildSpo2ChartValues(boolean z) {
        List<nju> listAcquireTrackSpo2Data = acquireTrackSpo2Data();
        if (njy.e(listAcquireTrackSpo2Data)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(listAcquireTrackSpo2Data.size());
        qtm.e(z, listAcquireTrackSpo2Data, this.mContext, arrayList, TAG);
        return arrayList;
    }

    private void addHeartRateDataSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, HwHealthLineDataSet hwHealthLineDataSet) {
        if (hwHealthBaseCombinedChart == null) {
            return;
        }
        qtm.d(hwHealthLineDataSet, acquireInvalidHeartRateData());
        qtm.a(hwHealthBaseCombinedChart, hwHealthLineDataSet, this.mModes);
    }

    private void addDotGraphDataSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, HwHealthLineDataSet hwHealthLineDataSet) {
        if (hwHealthBaseCombinedChart == null) {
            return;
        }
        qtm.a(hwHealthBaseCombinedChart, hwHealthLineDataSet);
        qtm.b(hwHealthBaseCombinedChart, this.mModes);
    }

    private void addDataSet(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, HwHealthLineDataSet hwHealthLineDataSet) {
        if (hwHealthBaseCombinedChart == null) {
            return;
        }
        qtm.d(hwHealthLineDataSet);
        qtm.a(hwHealthBaseCombinedChart, hwHealthLineDataSet, this.mModes);
    }

    private void setSupportSampling(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, boolean z) {
        if (hwHealthBaseCombinedChart instanceof HwHealthTrackCombinedChart) {
            ((HwHealthTrackCombinedChart) hwHealthBaseCombinedChart).setIsSupportSampling(z);
        }
    }
}
