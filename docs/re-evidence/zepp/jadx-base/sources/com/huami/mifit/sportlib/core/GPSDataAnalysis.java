package com.huami.mifit.sportlib.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.hm.sport.algorithm.AlignData;
import com.hm.sport.algorithm.AutoPauseCallback;
import com.hm.sport.algorithm.BarCallback;
import com.hm.sport.algorithm.GpsCallback;
import com.hm.sport.algorithm.GpsData;
import com.hm.sport.algorithm.HRCallback;
import com.hm.sport.algorithm.IndoorLearningArgCallback;
import com.hm.sport.algorithm.LogCallback;
import com.hm.sport.algorithm.RunDataProvider;
import com.hm.sport.algorithm.StatisticCallback;
import com.hm.sport.algorithm.StatisticsData;
import com.hm.sport.algorithm.StepCallback;
import com.hm.sport.algorithm.TimestampData;
import com.huami.firstbeat.ete.EteDataManager;
import com.huami.firstbeat.ete.EteRealTimeInput;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.utils.ConfigUtils;
import com.huami.mifit.sportlib.utils.FunctionSwitcher;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class GPSDataAnalysis implements StatisticCallback, StepCallback, HRCallback, GpsCallback, BarCallback, IndoorLearningArgCallback, AutoPauseCallback, LogCallback {
    private static final String i = "GPSDataAnalysis";
    private static final int j = 1000;
    private static final int k = 3;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 3;
    private long c;
    private RunDataProvider d;
    private Handler e;
    private EteDataManager g;
    private boolean h;
    private long a = 0;
    private long b = 0;
    private b f = null;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                sendEmptyMessageDelayed(2, 1000L);
                return;
            }
            if (i == 2) {
                GPSDataAnalysis.this.d.setTicker(System.currentTimeMillis());
                sendEmptyMessageDelayed(2, 1000L);
            } else {
                if (i != 3) {
                    return;
                }
                removeMessages(2);
            }
        }
    }

    public GPSDataAnalysis() {
        this.c = 0L;
        this.d = null;
        this.e = null;
        this.d = new RunDataProvider();
        this.c = System.currentTimeMillis();
        this.e = new a(Looper.getMainLooper());
    }

    public void b(boolean z) {
        this.d.setAutoPauseEnable(z ? 1 : 0);
    }

    public void deInit() {
        Handler handler = this.e;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
        b(false);
        if (isAlgoRunning()) {
            this.d.stop(System.currentTimeMillis());
            this.h = false;
        }
        this.d.destroy();
        EteDataManager eteDataManager = this.g;
        if (eteDataManager != null) {
            eteDataManager.finishEte();
        }
    }

    public void in(long j2, int i2) {
        LogKit.w2f(i, "receiveHr");
        this.f.a0(j2, i2);
        this.d.receiveHr(j2, i2);
    }

    public void init(long j2, int i2) {
        RunnerData runner = RunnerData.getRunner();
        this.d.init(i2, runner.getGender(), runner.getAge(), runner.getHeight(), runner.getWeight());
        this.d.registerStatisticCallback(this);
        this.d.registerStepCallback(this);
        this.d.registerHrDataCallback(this);
        this.d.registerGpsCallback(this);
        this.d.registerBarCallback(this);
        this.d.registerAutoPauseCallback(this);
        this.d.registerLogCallback(this);
        if (i2 == 8) {
            this.d.registerIndoorLearningArgCallback(this);
            b(false);
        } else {
            b(ConfigUtils.getConfig(i2).getAutoPauseEnable().booleanValue());
        }
        this.a = System.currentTimeMillis();
        if (FunctionSwitcher.isSupportFirstBeat) {
            EteDataManager eteDataManager = new EteDataManager();
            this.g = eteDataManager;
            eteDataManager.initEte(j2, i2);
            if (this.g.setFbtParameters(runner.getAge(), runner.getHeight(), (int) runner.getWeight(), runner.getGender(), 220 - runner.getAge(), 40)) {
                return;
            }
            this.g = null;
        }
    }

    public boolean isAlgoRunning() {
        return this.h;
    }

    @Override // com.hm.sport.algorithm.StepCallback
    public void onAccSensorStepReported(TimestampData timestampData) {
    }

    @Override // com.hm.sport.algorithm.StepCallback
    public void onBandStepReported(TimestampData timestampData) {
        this.d.fusionStep(-1L, -1, timestampData.getTime(), timestampData.getIntValue(), -1L, -1, -1L, -1, -1L, -1);
    }

    @Override // com.hm.sport.algorithm.BarCallback
    public void onBarReported(TimestampData timestampData) {
        this.d.alignBar(timestampData.getTime(), timestampData.getValue());
    }

    @Override // com.hm.sport.algorithm.StepCallback
    public void onBlueMonkeyStepReported(TimestampData timestampData) {
        this.d.fusionStep(-1L, -1, -1L, -1, -1L, -1, -1L, -1, timestampData.getTime(), timestampData.getIntValue());
    }

    @Override // com.hm.sport.algorithm.StatisticCallback
    public void onDataAligned(AlignData[] alignDataArr) {
        for (AlignData alignData : alignDataArr) {
            if (FunctionSwitcher.isSupportRecordKeyData) {
                LogKit.w2f(i, "Algo output AlignData>:" + alignData);
            } else {
                LogKit.w2f(i, "AlignData time:" + alignData.getTime() + ",hr:" + alignData.getHr() + ",bar:" + alignData.getBar() + ",step:" + alignData.getStep() + ",status:" + alignData.getStatus());
            }
            this.f.Y(alignData);
        }
        this.d.statisticData(alignDataArr);
    }

    @Override // com.hm.sport.algorithm.StatisticCallback
    public void onDataStatisticed(StatisticsData[] statisticsDataArr) {
        for (StatisticsData statisticsData : statisticsDataArr) {
            LogKit.w2f(i, "Algo output StatisticsData>:" + statisticsData);
            this.f.i0(statisticsData);
        }
    }

    @Override // com.hm.sport.algorithm.StepCallback
    public void onFusionStepReported(TimestampData timestampData) {
        LogKit.w2f(i, "onFusionStepReported:" + timestampData);
        this.d.alignStep(timestampData.getTime(), timestampData.getIntValue());
    }

    @Override // com.hm.sport.algorithm.GpsCallback
    public void onGpsReported(int i2, GpsData[] gpsDataArr) {
        int length = gpsDataArr != null ? gpsDataArr.length : 0;
        StringBuilder sb = new StringBuilder();
        sb.append("onGpsReported>: from data's timestamp:");
        sb.append(length > 0 ? gpsDataArr[length - 1].getTime() : 0L);
        LogKit.w2f(i, sb.toString());
        this.f.g0(i2, gpsDataArr);
        for (GpsData gpsData : gpsDataArr) {
            this.d.alignGps(gpsData.getTime(), gpsData.getLatitude(), gpsData.getLongitude(), gpsData.getAltitude(), gpsData.getAccuracy(), gpsData.getStatus());
        }
    }

    @Override // com.hm.sport.algorithm.HRCallback
    public void onHrReported(TimestampData timestampData) {
        LogKit.w2f(i, "onHrReported:" + timestampData);
        EteRealTimeInput.getInstance().setHeartRate(timestampData.getIntValue());
        this.d.alignHr(timestampData.getTime(), timestampData.getIntValue());
    }

    @Override // com.hm.sport.algorithm.IndoorLearningArgCallback
    public void onLearningResult(float[] fArr, int i2, int[] iArr, int i3) {
        LogKit.w2f(i, "indoor:floats" + Arrays.toString(fArr) + "  i" + i2 + " ints:" + Arrays.toString(iArr) + "  i1" + i3);
        this.f.c0(fArr, iArr);
    }

    @Override // com.hm.sport.algorithm.LogCallback
    public void onLogOutputted(int i2, String str) {
        if (i2 >= 3) {
            LogKit.w2f("Sport_Algo_Log", str);
        } else {
            LogKit.i("Sport_Algo_Log", str);
        }
    }

    @Override // com.hm.sport.algorithm.AutoPauseCallback
    public void onPausedState(int i2) {
        LogKit.w2f(i, "onPausedState:" + i2);
        this.f.h0(i2 == 1 ? 3 : 2, 19);
    }

    @Override // com.hm.sport.algorithm.StepCallback
    public void onPhoneHubStepReported(TimestampData timestampData) {
        this.d.fusionStep(-1L, -1, -1L, -1, timestampData.getTime(), timestampData.getIntValue(), -1L, -1, -1L, -1);
    }

    @Override // com.hm.sport.algorithm.StepCallback
    public void onShoeStepReported(TimestampData timestampData) {
        this.d.fusionStep(timestampData.getTime(), timestampData.getIntValue(), -1L, -1, -1L, -1, -1L, -1, -1L, -1);
    }

    public void start(b bVar) {
        this.f = bVar;
        this.d.start(System.currentTimeMillis());
        Handler handler = this.e;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
        EteDataManager eteDataManager = this.g;
        if (eteDataManager != null) {
            eteDataManager.sendEteInput();
        }
        this.h = true;
    }

    public void stop() {
        this.d.stop(System.currentTimeMillis());
        Handler handler = this.e;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
        this.h = false;
    }

    public void in(long j2, short[] sArr, short[] sArr2, short[] sArr3) {
        LogKit.w2f(i, "receiveAccSensor");
        this.d.receiveAccSensor(j2, sArr, sArr2, sArr3);
    }

    public void in(int i2, int i3, int i4) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i3 < 0) {
            LogKit.w2f(i, "step is invalid !!! from type:" + i2 + ",step:" + i3);
        }
        if (i2 == 43) {
            this.d.receivePhoneHubStep(jCurrentTimeMillis, i3);
        } else if (i2 == 42) {
            this.d.receiveBrandStep(jCurrentTimeMillis, i3);
        } else if (i2 == 44) {
            this.d.receiveShoeStep(jCurrentTimeMillis, i3);
        } else if (i2 == 45) {
            this.d.receiveBlueMonkeyStep(jCurrentTimeMillis, i3);
        }
        if (FunctionSwitcher.isSupportRecordKeyData && System.currentTimeMillis() - this.b > 2000) {
            this.b = System.currentTimeMillis();
            LogKit.privacyLog(this.c + "_step", (this.b / 1000) + "," + i2 + "," + i3 + "," + jCurrentTimeMillis);
        }
        this.f.j0(i2, i3, i4);
    }

    public void in(long j2, double d, double d2, float f, int i2, float f2) {
        if (FunctionSwitcher.isSupportRecordKeyData) {
            LogKit.w2f(i, " Algo receiveGps> milisecond:" + j2 + ",lat:" + d + ",lon:" + d2 + ",altitude:" + f + ",speed:" + f2);
        } else {
            LogKit.w2f(i, "Algo receiveGps> milisecond:" + j2 + ",altitude:" + f + ",accuracy=" + i2 + ",speed:" + f2);
        }
        this.d.receiveGps(j2, d, d2, f, i2, f2);
    }

    public void in(float f) {
        float f2 = f * 100.0f;
        if (FunctionSwitcher.isSupportRecordKeyData && System.currentTimeMillis() - this.a > 1000) {
            this.a = System.currentTimeMillis();
            LogKit.privacyLog(this.c + "_baro", (this.a / 1000) + "," + f2);
        }
        this.d.receiveBar(System.currentTimeMillis(), f2);
    }

    public void in(long[] jArr, short[] sArr, float[] fArr, int i2) {
        LogKit.w2f(i, "indoor: millisecondArray:" + Arrays.toString(jArr) + "   stepfreqArray:" + Arrays.toString(sArr) + "   learningMatrix:" + Arrays.toString(fArr) + "   userInputDis:" + i2);
        this.d.receiveIndoorResultToLearn(jArr, sArr, sArr.length, fArr, fArr.length, i2);
    }

    public void in(int[] iArr) {
        LogKit.w2f(i, "indoor:stepLArray" + Arrays.toString(iArr));
        this.d.receiveLearningStepLMatrix(iArr, iArr.length);
    }
}
