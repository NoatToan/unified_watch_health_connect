package com.xiaomi.hm.health.traininglib.hr.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.traininglib.hr.TrainingHrController;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingHrService extends Service {
    private TrainingHrController a;
    private TrainingHrBinder b;

    public class TrainingHrBinder extends Binder {
        public TrainingHrBinder() {
        }

        public TrainingHrService getService() {
            return TrainingHrService.this;
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        if (this.b == null) {
            this.b = new TrainingHrBinder();
        }
        return this.b;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a = new TrainingHrController();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    public void pause() {
        this.a.pause();
    }

    public void resume() {
        this.a.resume();
    }

    public void start(long j, long j2, long j3) {
        this.a.start(j, j2, j3);
    }

    public void stop() {
        this.a.stop();
    }
}
