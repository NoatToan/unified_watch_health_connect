package com.xiaomi.hm.health.traininglib.hr;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.devicelib.DeviceHrEvent;
import com.xiaomi.hm.health.traininglib.util.TrainingConfig;
import de.greenrobot.event.EventBus;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingHrHandler {
    private static final String k = "TrainingHrHandler";
    private Long a;
    private Long b;
    private Long c;
    private TrainingActiveHr d;
    private boolean f;
    private ExecutorService e = Executors.newSingleThreadExecutor();
    private long i = -1;
    private long j = -1;
    private int h = TrainingConfig.getMaxHeartRate();
    private boolean g = TrainingConfig.getHrWarningEnbale();

    public class a implements Runnable {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TrainingHrHandler.this.d.generateHr(this.a, this.b);
            TrainingHrSave.a(TrainingHrHandler.this.d);
            TrainingHrHandler.this.c(this.a, this.b);
            EventBus.getDefault().post(new DeviceHrEvent(this.b));
        }
    }

    public TrainingHrHandler(Long l, Long l2, Long l3) {
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.d = new TrainingActiveHr(l, l2, l3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j, int i) {
        int i2 = this.h;
        if (i2 < 0 || i < i2 || !this.g) {
            this.f = false;
            this.i = -1L;
            return;
        }
        if (!this.f) {
            this.f = true;
            this.i = j;
            HMLog.d(k, "刚刚超过了最大心率的时刻：" + this.i, new Object[0]);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("comingHr:");
        sb.append(i);
        sb.append(", maxRemindHr:");
        sb.append(this.h);
        sb.append(", 超过最大提醒心率的秒数：");
        sb.append(j - this.i);
        sb.append(", 距离上次震动的秒数：");
        long j2 = this.j;
        sb.append(j2 == -1 ? 0L : j - j2);
        HMLog.d(k, sb.toString(), new Object[0]);
        if (j - this.i >= TrainingHrConstants.MAX_HR_CONTINUE_TIME) {
            long j3 = this.j;
            if (j3 == -1 || j - j3 >= TrainingHrConstants.MAX_HR_VIBRATE_INTERVAL_TIME) {
                this.j = j;
                this.f = false;
                HMLog.d(k, "震动设备:" + i, new Object[0]);
                DeviceCenter.getInstance().vibrateHrSingle(i);
            }
        }
    }

    public void handleHr(long j, int i) {
        this.e.execute(new a(j, i));
    }
}
