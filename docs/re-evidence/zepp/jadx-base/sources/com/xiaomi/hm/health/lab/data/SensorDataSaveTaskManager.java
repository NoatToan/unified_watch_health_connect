package com.xiaomi.hm.health.lab.data;

import com.xiaomi.hm.health.lab.model.BehaviorTagEnity;
import com.xiaomi.hm.health.lab.model.CommonSensorRecord;
import com.xiaomi.hm.health.lab.model.GSensorRecord;
import com.xiaomi.hm.health.lab.model.GyroSensorRecord;
import com.xiaomi.hm.health.lab.model.MagnRecord;
import com.xiaomi.hm.health.lab.model.NmeaRecord;
import com.xiaomi.hm.health.lab.model.PPGSensorRecord;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes21.dex */
public class SensorDataSaveTaskManager {
    private ExecutorService a = Executors.newCachedThreadPool();
    private SensorDataDealTask<GSensorRecord> b;
    private SensorDataDealTask<PPGSensorRecord> c;
    private SensorDataDealTask<GyroSensorRecord> d;
    private SensorDataDealTask<MagnRecord> e;
    private SensorDataDealTask<NmeaRecord> f;
    private SensorDataDealTask<CommonSensorRecord> g;

    public synchronized SensorDataDealTask<GSensorRecord> startGSensorLogTask(BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity) {
        if (!this.a.isShutdown()) {
            SensorDataDealTask<GSensorRecord> sensorDataDealTask = new SensorDataDealTask<>(behaviorTagEnity, sensorRecordsEnity);
            this.b = sensorDataDealTask;
            sensorDataDealTask.setName("gSensorDealTask");
            this.a.submit(this.b);
        }
        return this.b;
    }

    public synchronized SensorDataDealTask startGyroLogTask(BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity) {
        if (!this.a.isShutdown()) {
            SensorDataDealTask<GyroSensorRecord> sensorDataDealTask = new SensorDataDealTask<>(behaviorTagEnity, sensorRecordsEnity);
            this.d = sensorDataDealTask;
            sensorDataDealTask.setName("gSensorDealTask");
            this.a.submit(this.d);
        }
        return this.d;
    }

    public synchronized SensorDataDealTask<MagnRecord> startMagnLogTask(BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity) {
        if (!this.a.isShutdown()) {
            SensorDataDealTask<MagnRecord> sensorDataDealTask = new SensorDataDealTask<>(behaviorTagEnity, sensorRecordsEnity);
            this.e = sensorDataDealTask;
            sensorDataDealTask.setName("gSensorDealTask");
            this.a.submit(this.e);
        }
        return this.e;
    }

    public synchronized SensorDataDealTask<NmeaRecord> startNmeaLogTask(BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity) {
        if (!this.a.isShutdown()) {
            SensorDataDealTask<NmeaRecord> sensorDataDealTask = new SensorDataDealTask<>(behaviorTagEnity, sensorRecordsEnity);
            this.f = sensorDataDealTask;
            sensorDataDealTask.setName("gSensorDealTask");
            this.a.submit(this.f);
        }
        return this.f;
    }

    public synchronized SensorDataDealTask<PPGSensorRecord> startPPGSensorLogTask(BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity) {
        if (!this.a.isShutdown()) {
            SensorDataDealTask<PPGSensorRecord> sensorDataDealTask = new SensorDataDealTask<>(behaviorTagEnity, sensorRecordsEnity);
            this.c = sensorDataDealTask;
            sensorDataDealTask.setName("ppgSensorDealTask");
            this.a.submit(this.c);
        }
        return this.c;
    }

    public synchronized SensorDataDealTask<CommonSensorRecord> startTemperatureLogTask(BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity) {
        if (!this.a.isShutdown()) {
            SensorDataDealTask<CommonSensorRecord> sensorDataDealTask = new SensorDataDealTask<>(behaviorTagEnity, sensorRecordsEnity);
            this.g = sensorDataDealTask;
            sensorDataDealTask.setName("CommonSensorDealTask");
            this.a.submit(this.g);
        }
        return this.g;
    }

    public synchronized void stopExecutor() {
        this.a.shutdown();
    }

    public synchronized void stopGSensorLogTask() {
        SensorDataDealTask<GSensorRecord> sensorDataDealTask = this.b;
        if (sensorDataDealTask != null) {
            sensorDataDealTask.i();
            this.b.interrupt();
            this.b = null;
        }
    }

    public synchronized void stopGyroLogTask() {
        SensorDataDealTask<GyroSensorRecord> sensorDataDealTask = this.d;
        if (sensorDataDealTask != null) {
            sensorDataDealTask.i();
            this.d.interrupt();
            this.d = null;
        }
    }

    public synchronized void stopMagnLogTask() {
        SensorDataDealTask<MagnRecord> sensorDataDealTask = this.e;
        if (sensorDataDealTask != null) {
            sensorDataDealTask.i();
            this.e.interrupt();
            this.e = null;
        }
    }

    public synchronized void stopNmeaLogTask() {
        SensorDataDealTask<NmeaRecord> sensorDataDealTask = this.f;
        if (sensorDataDealTask != null) {
            sensorDataDealTask.i();
            this.f.interrupt();
            this.f = null;
        }
    }

    public synchronized void stopPPGSensorLogTask() {
        SensorDataDealTask<PPGSensorRecord> sensorDataDealTask = this.c;
        if (sensorDataDealTask != null) {
            sensorDataDealTask.i();
            this.c.interrupt();
            this.c = null;
        }
    }

    public synchronized void stopTemperatureLogTask() {
        SensorDataDealTask<CommonSensorRecord> sensorDataDealTask = this.g;
        if (sensorDataDealTask != null) {
            sensorDataDealTask.i();
            this.g.interrupt();
            this.g = null;
        }
    }
}
