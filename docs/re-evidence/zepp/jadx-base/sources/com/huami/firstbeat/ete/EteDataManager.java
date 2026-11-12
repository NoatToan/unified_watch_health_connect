package com.huami.firstbeat.ete;

import com.huami.firstbeat.FbtParameterHelper;
import com.huami.firstbeat.dbproxy.EteResultProxy;
import com.huami.firstbeat.logproxy.FbtLogger;
import com.huami.firstbeat.tha.ThaDataManager;
import fi.firstbeat.common.FbtException;
import fi.firstbeat.common.FbtFixedMath;
import fi.firstbeat.common.FbtParameters;
import fi.firstbeat.ete.Ete;
import fi.firstbeat.ete.EteInput;
import fi.firstbeat.ete.EteResults;
import fi.firstbeat.tha.ThaExercise;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class EteDataManager {
    private static final String g = "EteDataManager";
    private static final int h = 5000;
    private EteResults a;
    private Ete b = new Ete();
    private CompositeDisposable c;
    private long d;
    private int e;
    private FbtParameters f;

    public class a implements Consumer<Long> {
        public a() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Long l) throws Exception {
            EteDataManager.this.f();
        }
    }

    public class b implements Consumer<Throwable> {
        public b() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            th.printStackTrace();
            FbtLogger.w2f(EteDataManager.g, th.getMessage());
        }
    }

    public class c implements Action {
        public c() {
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            if (EteDataManager.this.a == null) {
                FbtLogger.e(EteDataManager.g, "eteResults is null");
            } else if (ThaDataManager.getInstance().initThaParameters(EteDataManager.this.f.age, EteDataManager.this.f.height, EteDataManager.this.f.weight, EteDataManager.this.f.gender.ordinal(), EteDataManager.this.f.maximalHr, EteDataManager.this.f.minimalHr)) {
                ThaDataManager.getInstance().handleTrainingHistoryAnalysis();
            }
        }
    }

    public EteDataManager() {
        FbtLogger.i(g, Ete.getVersion());
        this.c = new CompositeDisposable();
    }

    private EteResultWrapper d(EteResults eteResults) {
        EteResultWrapper eteResultWrapper = new EteResultWrapper();
        eteResultWrapper.setEteResults(eteResults);
        eteResultWrapper.setEndTime(System.currentTimeMillis() / 1000);
        eteResultWrapper.setTrackId(this.d);
        eteResultWrapper.setExerciseType(e());
        return eteResultWrapper;
    }

    private int e() {
        if (this.e != 9) {
            return 0;
        }
        return ThaExercise.ExerciseType.CYCLING.ordinal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws FbtException {
        EteRealTimeInput eteRealTimeInput = EteRealTimeInput.getInstance();
        EteInput eteInput = new EteInput();
        eteInput.rri = 5000;
        eteInput.hr = eteRealTimeInput.hr;
        eteInput.hrQuality = -1;
        eteInput.altitudeSource = eteRealTimeInput.altitudeSource == 0 ? EteInput.AltitudeSource.DEFAULT : EteInput.AltitudeSource.BAROMETER;
        eteInput.power = 0;
        eteInput.userState = eteRealTimeInput.getUserState(this.e);
        eteInput.speed = FbtFixedMath.dtofx(eteRealTimeInput.speed);
        float f = eteRealTimeInput.altitude;
        if (f >= -10000.0f && f <= 10000.0f) {
            eteInput.altitude = FbtFixedMath.dtofx(f);
        }
        eteInput.stepRate = eteRealTimeInput.stepFreq;
        FbtLogger.i(g, "HR:" + eteInput.hr + ", speed:" + eteInput.speed + ", altitude:" + eteInput.altitude + ", stepRate:" + eteInput.stepRate);
        this.b.analyze(eteInput);
        EteResults results = this.b.getResults();
        this.a = results;
        if (results != null) {
            EteResultProxy.getInstance().saveEteResult(d(this.a), false);
            FbtLogger.w2f(g, "correctHr:" + this.a.correctedHr + ",TE:" + (this.a.trainingEffect / 10) + ",TL:" + this.a.trainingLoadPeak + ",MET:" + this.a.maximalMet + ",recoveryTime:" + this.a.recoveryTime + ",minHr" + this.a.minimalHr + ", maxHr:" + this.a.maximalHr);
        }
    }

    public void finishEte() {
        this.c.dispose();
    }

    public void initEte(long j, int i) {
        this.d = j;
        this.e = i;
    }

    public void sendEteInput() {
        this.c.add(Observable.interval(5000L, 5000L, TimeUnit.MILLISECONDS).doOnDispose(new c()).subscribe(new a(), new b()));
    }

    public boolean setFbtParameters(int i, int i2, int i3, int i4, int i5, int i6) {
        FbtParameters fbtParametersInitFbtParameters = FbtParameterHelper.getInstance().initFbtParameters(i, i2, i3, i4, i5, i6, true);
        this.f = fbtParametersInitFbtParameters;
        if (fbtParametersInitFbtParameters == null) {
            return false;
        }
        try {
            this.b.setParameters(fbtParametersInitFbtParameters, Ete.ResetMode.FULL);
            this.b.setWalkingTest(true);
            return true;
        } catch (FbtException e) {
            e.printStackTrace();
            FbtLogger.w2f(g, e.getMessage());
            return false;
        }
    }
}
