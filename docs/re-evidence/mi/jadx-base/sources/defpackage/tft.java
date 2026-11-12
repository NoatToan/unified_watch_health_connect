package defpackage;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public class tft {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vr f34661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34662b;
    public int c;
    public long d;
    public volatile long e = 0;
    public volatile long f = 0;
    public Timer g;
    public TimerTask h;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            tft tftVar = tft.this;
            tftVar.f34662b = (int) (tftVar.e - tft.this.f);
            tft tftVar2 = tft.this;
            tftVar2.c = (int) ((tftVar2.e * 1000) / (System.currentTimeMillis() - tft.this.d));
            t5t.m("SensorFrequency", "type:" + tft.this.f34661a + ",rFreq:" + tft.this.f34662b + ",aFreq:" + tft.this.c + ",samples:" + tft.this.e);
            tft tftVar3 = tft.this;
            tftVar3.f = tftVar3.e;
        }
    }

    public tft(vr vrVar) {
        this.f34661a = vrVar;
    }

    public void d() {
        this.d = System.currentTimeMillis();
        this.c = 0;
        this.f34662b = 0;
        this.e = 0L;
        this.f = 0L;
        this.g = new Timer();
        a aVar = new a();
        this.h = aVar;
        this.g.schedule(aVar, 1000L, 1000L);
    }

    public void e(long j) {
        this.e += j;
    }

    public void h() {
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
