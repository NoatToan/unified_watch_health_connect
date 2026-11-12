package com.xiaomi.hm.health.bt.profile.grsp;

import com.xiaomi.hm.health.bt.debug.Debug;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes18.dex */
public class SensorFrequency {
    private static final String i = "SensorFrequency";
    private static final int j = 1000;
    private SensorType a;
    private int b;
    private int c;
    private long d;
    private volatile long e = 0;
    private volatile long f = 0;
    private Timer g;
    private TimerTask h;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            SensorFrequency sensorFrequency = SensorFrequency.this;
            sensorFrequency.b = (int) (sensorFrequency.e - SensorFrequency.this.f);
            SensorFrequency sensorFrequency2 = SensorFrequency.this;
            sensorFrequency2.c = (int) ((sensorFrequency2.e * 1000) / (System.currentTimeMillis() - SensorFrequency.this.d));
            Debug.i(SensorFrequency.i, "type:" + SensorFrequency.this.a + ",rFreq:" + SensorFrequency.this.b + ",aFreq:" + SensorFrequency.this.c + ",samples:" + SensorFrequency.this.e);
            SensorFrequency sensorFrequency3 = SensorFrequency.this;
            sensorFrequency3.f = sensorFrequency3.e;
        }
    }

    public SensorFrequency(SensorType type) {
        this.a = type;
    }

    public void addSample(long s) {
        this.e += s;
    }

    public void start() {
        this.d = System.currentTimeMillis();
        this.c = 0;
        this.b = 0;
        this.e = 0L;
        this.f = 0L;
        this.g = new Timer();
        a aVar = new a();
        this.h = aVar;
        this.g.schedule(aVar, 1000L, 1000L);
    }

    public void stop() {
        Timer timer = this.g;
        if (timer != null) {
            timer.cancel();
            this.g = null;
        }
        TimerTask timerTask = this.h;
        if (timerTask != null) {
            timerTask.cancel();
            this.h = null;
        }
    }
}
